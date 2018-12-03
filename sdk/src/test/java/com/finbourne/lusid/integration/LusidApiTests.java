package com.finbourne.lusid.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.api.PropertyDefinitionsApi;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.*;
import com.squareup.okhttp.*;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class LusidApiTests {

    private static final MediaType FORM = MediaType.parse("application/x-www-form-urlencoded");

    private List<String> securityIds;

    private PortfoliosApi portfoliosApi;
    private TransactionPortfoliosApi transactionPortfoliosApi;
    private InstrumentsApi instrumentsApi;
    private PropertyDefinitionsApi propertyDefinitionsApi;

    public String getEnvironmentOverride(String env, String defaultValue)
    {
        String  envOverride = System.getenv(env);
        return envOverride == null ? defaultValue : envOverride;
    }

    @Before
    public void setUp() throws Exception {

        //  load configuration
        ObjectMapper configMapper = new ObjectMapper();
        ClassLoader classLoader = getClass().getClassLoader();
        File configFile = new File(classLoader.getResource("secrets.json").getFile());

        if (configFile == null) {
            fail("cannot find secrets.json in classpath");
        }

        final File configJson = new File(configFile.toURI());
        final Map apiConfig = configMapper.readValue(configJson, Map.class);
        final Map config = (Map)apiConfig.get("api");

        final String tokenUrl = this.getEnvironmentOverride("FBN_TOKEN_URL", (String)config.get("tokenUrl"));
        final String username = this.getEnvironmentOverride("FBN_USERNAME", (String)config.get("username"));
        final String password = URLEncoder.encode(this.getEnvironmentOverride("FBN_PASSWORD", (String)config.get("password")), StandardCharsets.UTF_8.toString());
        final String clientId = URLEncoder.encode(this.getEnvironmentOverride("FBN_CLIENT_ID", (String)config.get("clientId")), StandardCharsets.UTF_8.toString());
        final String clientSecret = URLEncoder.encode(this.getEnvironmentOverride("FBN_CLIENT_SECRET", (String)config.get("clientSecret")), StandardCharsets.UTF_8.toString());

        final String apiUrl = this.getEnvironmentOverride("FBN_LUSID_API_URL", (String)config.get("apiUrl"));

        //  request body
        final String    tokenRequestBody = String.format("grant_type=password&username=%s&password=%s&scope=openid client groups&client_id=%s&client_secret=%s", username, password, clientId, clientSecret);

        final OkHttpClient oktaClient = new OkHttpClient();
        final RequestBody body = RequestBody.create(FORM, tokenRequestBody);
        final Request request = new Request.Builder()
                .url(tokenUrl)
                .header("Accept", "application/json")
                .post(body)
                .build();

        Response response = oktaClient.newCall(request).execute();

        final String          content = response.body().string();
        final ObjectMapper    mapper = new ObjectMapper();

        //  map json response
        final Map bodyValues = mapper.readValue(content, Map.class);

        assertTrue("missing access_token", bodyValues.containsKey("access_token"));

        //  get access token
        final String apiToken = (String)bodyValues.get("access_token");

        ApiClient   apiClient;
        apiClient = new ApiClient();
        apiClient.addDefaultHeader("Authorization", "Bearer " + apiToken);
        apiClient.setBasePath(apiUrl);

        this.portfoliosApi = new PortfoliosApi(apiClient);
        this.transactionPortfoliosApi = new TransactionPortfoliosApi(apiClient);
        this.instrumentsApi = new InstrumentsApi(apiClient);
        this.propertyDefinitionsApi = new PropertyDefinitionsApi(apiClient);

        UpsertInstrumentsResponse instrumentsResponse = this.instrumentsApi.upsertInstruments(Map.of(
                "r1", new UpsertInstrumentRequest().name("inst-1").identifiers(Map.of("Figi", "BBG000C6K6G9")),
                "r2", new UpsertInstrumentRequest().name("inst-2").identifiers(Map.of("Figi", "BBG000C04D57")),
                "r3", new UpsertInstrumentRequest().name("inst-3").identifiers(Map.of("Figi", "BBG000FV67Q4")),
                "r4", new UpsertInstrumentRequest().name("inst-4").identifiers(Map.of("Figi", "BBG000BF0KW3")),
                "r5", new UpsertInstrumentRequest().name("inst-5").identifiers(Map.of("Figi", "BBG000BF4KL1"))
        ));

        this.securityIds = instrumentsResponse
                .getValues()
                .values()
                .stream()
                .map(inst -> inst.getLusidInstrumentId())
                .collect(Collectors.toList());
    }

    @Test
    public void create_portfolio() throws ApiException {

        final String scope = "finbourne";
        final String uuid = UUID.randomUUID().toString();

        final CreateTransactionPortfolioRequest  request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(String.format("Id-%s", uuid))
                .baseCurrency("GBP");

        final Portfolio portfolio = this.transactionPortfoliosApi.createPortfolio(scope, request);

        assertEquals(request.getCode(), portfolio.getId().getCode());
    }

    @Test
    public void create_portfolio_with_property() throws Exception {

        final String uuid = UUID.randomUUID().toString();
        final String scope = "finbourne";
        final String propertyName = String.format("und-style-%s", uuid);

        final CreatePropertyDefinitionRequest propertyDefinition = new CreatePropertyDefinitionRequest()
                .domain(CreatePropertyDefinitionRequest.DomainEnum.PORTFOLIO)
                .scope(scope)
                .code(propertyName)
                .valueRequired(false)
                .displayName("Fund Style")
                .lifeTime(CreatePropertyDefinitionRequest.LifeTimeEnum.PERPETUAL)
                .dataTypeId(new ResourceId().scope("default").code("string"));;

        //  create property definition
        final PropertyDefinition    propertyDefinitionDto = this.propertyDefinitionsApi.createPropertyDefinition(propertyDefinition);

        final OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        final CreateTransactionPortfolioRequest  request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(String.format("Id-%s", uuid))
                .baseCurrency("GBP")
                .created(effectiveDate);

        //  create portfolio
        final Portfolio  portfolio = this.transactionPortfoliosApi.createPortfolio(scope, request);

        assertEquals(request.getCode(), portfolio.getId().getCode());

        final String propertyValue = "Active";
        final PropertyValue property = new PropertyValue().labelValue(propertyValue);
        final Map<String, PropertyValue> properties = new HashMap<>();
        properties.put(propertyDefinitionDto.getKey(), property);

        //  add the property
        final PortfolioProperties  propertiesResult = this.portfoliosApi.upsertPortfolioProperties(scope, portfolio.getId().getCode(), properties, effectiveDate);

        assertEquals(request.getCode(), propertiesResult.getOriginPortfolioId().getCode());
        assertEquals(propertyValue, propertiesResult.getProperties().get(0).getValue());
    }

    @Test
    public void create_trade_with_property() throws ApiException{

        final String uuid = UUID.randomUUID().toString();
        final String scope = "finbourne";
        final String propertyName = String.format("traderId-%s", uuid);
        final String propertyValue = "A Trader";
        final OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        final CreatePropertyDefinitionRequest    propertyDefinition = new CreatePropertyDefinitionRequest()
                .domain(CreatePropertyDefinitionRequest.DomainEnum.TRADE)
                .scope(scope)
                .code(propertyName)
                .valueRequired(false)
                .displayName("Trader Id")
                .lifeTime(CreatePropertyDefinitionRequest.LifeTimeEnum.PERPETUAL)
                .dataTypeId(new ResourceId().scope("default").code("string"));

        //  create property definition
        final PropertyDefinition propertyDefinitionDto = this.propertyDefinitionsApi.createPropertyDefinition(propertyDefinition);

        final String originalPortfolioId = String.format("Id-%s", uuid);
        final CreateTransactionPortfolioRequest request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(originalPortfolioId)
                .baseCurrency("GBP")
                .created(effectiveDate);

        //  create portfolio
        final Portfolio portfolio = this.transactionPortfoliosApi.createPortfolio(scope, request);

        assertEquals(portfolio.getId().getCode(), originalPortfolioId);

        String portfolioId = portfolio.getId().getCode();

        //  create the property
        PerpetualPropertyValue property = new PerpetualPropertyValue().labelValue(propertyValue);

        final Map<String, PerpetualPropertyValue> properties = new HashMap<>();
        properties.put(propertyDefinitionDto.getKey(), property);

        //  create the trade
        TransactionRequest transaction = new TransactionRequest()
                .transactionId(UUID.randomUUID().toString())
                .type("Buy")
                .instrumentUid(this.securityIds.get(0))
                .totalConsideration(new CurrencyAndAmount().currency("GBP").amount(1230.0))
                .transactionDate(effectiveDate)
                .settlementDate(effectiveDate)
                .units(100.0)
                .transactionPrice(new TransactionPrice().price(12.3))
                .source(TransactionRequest.SourceEnum.CLIENT)
                .properties(properties);

        //  add the trade
        this.transactionPortfoliosApi.upsertTransactions(scope, portfolioId, new ArrayList<>(Arrays.asList(transaction)));

        //  get the trade
        final VersionedResourceListOfTransaction transactions = this.transactionPortfoliosApi.getTransactions(scope,
                portfolioId, null, null, null, null, null, null, null, null);

        assertEquals(1, transactions.getValues().size());
        assertEquals(transaction.getTransactionId(), transactions.getValues().get(0).getTransactionId());
        assertEquals(propertyValue, transactions.getValues().get(0).getProperties().get(0).getValue());
    }

    @Test
    public void apply_bitemporal_portfolio_change() throws Exception
    {
        final String scope = "finbourne";
        final String uuid = UUID.randomUUID().toString();
        final OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        final CreateTransactionPortfolioRequest  request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(String.format("Id-%s", uuid))
                .baseCurrency("GBP")
                .created(effectiveDate);

        final Portfolio  portfolio = transactionPortfoliosApi.createPortfolio(scope, request);

        final String portfolioId = portfolio.getId().getCode();
        assertNotNull(portfolioId);

        class TransactionSpec
        {
            private String id;
            private Double price;
            private OffsetDateTime tradeDate;

            TransactionSpec(String id, Double price, OffsetDateTime tradeDate) {
                this.id = id;
                this.price = price;
                this.tradeDate = tradeDate;
            }

            public String getId() {
                return id;
            }

            public Double getPrice() {
                return price;
            }

            public OffsetDateTime getTradeDate() {
                return tradeDate;
            }
        }

        Function<TransactionSpec, TransactionRequest> buildTransaction = t -> new TransactionRequest()
                .transactionId(UUID.randomUUID().toString())
                .type("Buy")
                .instrumentUid(t.getId())
                .transactionDate(t.getTradeDate())
                .settlementDate(t.getTradeDate())
                .units(100.0)
                .transactionPrice(new TransactionPrice().price(t.getPrice()))
                .totalConsideration(new CurrencyAndAmount().amount(100.0 * t.getPrice()).currency("GBP"))
                .source(TransactionRequest.SourceEnum.CLIENT);

        Consumer<List<Transaction>> printTransactions = transactions -> transactions.forEach(t ->
                System.out.println(
                        String.format("%s\t%s\t%f\t%f\t%f",
                                t.getInstrumentUid(),
                                t.getTransactionDate(),
                                t.getUnits(),
                                t.getTransactionPrice().getPrice(),
                                t.getTotalConsideration().getAmount())));

        final List<TransactionSpec> transactionSpecs = new ArrayList<>(Arrays.asList(
                new TransactionSpec(this.securityIds.get(0), 101.0, OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC)),
                new TransactionSpec(this.securityIds.get(1), 102.0, OffsetDateTime.of(2018, 1, 2, 0, 0, 0, 0, ZoneOffset.UTC)),
                new TransactionSpec(this.securityIds.get(2), 103.0, OffsetDateTime.of(2018, 1, 3, 0, 0, 0, 0, ZoneOffset.UTC))
        ));

        //  build list of transactions
        final TransactionRequest[] newTransactions = transactionSpecs.stream()
                .sorted(Comparator.comparing(ts -> ts.id))
                .map(buildTransaction)
                .toArray(TransactionRequest[]::new);

        //  add initial batch of transactions
        final UpsertPortfolioTransactionsResponse  initialResult = this.transactionPortfoliosApi.upsertTransactions(scope, portfolioId, Arrays.asList(newTransactions));

        /*

        The LUSID API operates at microsecond resolution for dates/times but
        Joda-Time only works at millisecond.  This means that OffsetDateTime can get rounded
        down and be out of sync with LUSID.  To workaround we add an extra millisecond
        with the trade off that if 2 or more events happen within 1ms we may not get the
        expected behaviour

         */
        OffsetDateTime    asAtBatch1 = initialResult.getVersion().getAsAtDate();
        Thread.sleep(500);

        //  add another trade for 2018-1-8
        TransactionSpec newTrade = new TransactionSpec(this.securityIds.get(3), 104.0, OffsetDateTime.of(2018, 1, 8, 0, 0, 0, 0, ZoneOffset.UTC));
        UpsertPortfolioTransactionsResponse addedResult = this.transactionPortfoliosApi.upsertTransactions(scope, portfolioId, Arrays.asList(buildTransaction.apply(newTrade)));

        OffsetDateTime    asAtBatch2 = addedResult.getVersion().getAsAtDate();
        Thread.sleep(500);

        //  add back-dated trade
        TransactionSpec backDatedTrade = new TransactionSpec(this.securityIds.get(4), 105.0, OffsetDateTime.of(2018, 1, 5, 0, 0, 0, 0, ZoneOffset.UTC));
        UpsertPortfolioTransactionsResponse backDatedResult = this.transactionPortfoliosApi.upsertTransactions(scope, portfolioId, Arrays.asList(buildTransaction.apply(backDatedTrade)));

        OffsetDateTime    asAtBatch3 = backDatedResult.getVersion().getAsAtDate();
        Thread.sleep(500);

        //  list transactions
        VersionedResourceListOfTransaction transactions = this.transactionPortfoliosApi.getTransactions(scope, portfolioId, null, null, asAtBatch1, null, 0, Integer.MAX_VALUE, null, null);


        assertEquals(String.format("asAt %s", asAtBatch1),3, transactions.getValues().size());
        System.out.println("transactions at " + asAtBatch1);
        printTransactions.accept(transactions.getValues());

        transactions = this.transactionPortfoliosApi.getTransactions(scope, portfolioId, null, null, asAtBatch2, null, 0, Integer.MAX_VALUE, null, null);

        assertEquals(String.format("asAt %s", asAtBatch2),4, transactions.getValues().size());
        System.out.println("transactions at " + asAtBatch2);
        printTransactions.accept(transactions.getValues());

        transactions = this.transactionPortfoliosApi.getTransactions(scope, portfolioId, null, null, asAtBatch3, null, 0, Integer.MAX_VALUE, null, null);

        assertEquals(String.format("asAt %s", asAtBatch3), 5, transactions.getValues().size());
        System.out.println("transactions at " + asAtBatch3);
        printTransactions.accept(transactions.getValues());

        //  latest transactions
        transactions = this.transactionPortfoliosApi.getTransactions(scope, portfolioId, null, null, null, null, 0, Integer.MAX_VALUE, null, null);

        assertEquals(5, transactions.getValues().size());
        System.out.println("transactions at " + OffsetDateTime.now());
        printTransactions.accept(transactions.getValues());
    }

    @Test
    public void find_instruments() throws ApiException {
        final List<String> isins = new ArrayList<>(Arrays.asList("IT0004966401", "FR0010192997"));

        final Property isin1 = new Property();
        isin1.setKey("Instrument/default/Isin");
        isin1.setValue("IT0004966401");

        final Property isin2 = new Property();
        isin2.setKey("Instrument/default/Isin");
        isin2.setValue("FR0010192997");

        //  lookup instruments
        final ResourceListOfInstrument fbnIds = this.instrumentsApi.findInstruments(
                List.of(isin1, isin2), null, null, null
        );

        assertTrue(fbnIds.getValues().size() > 0);
    }
}
