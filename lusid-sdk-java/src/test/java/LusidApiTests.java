import com.fasterxml.jackson.databind.ObjectMapper;
import com.finbourne.LUSIDAPI;
import com.finbourne.implementation.LUSIDAPIImpl;
import com.finbourne.models.*;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import retrofit2.Retrofit;

import java.io.File;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(Lifecycle.PER_CLASS)
public class LusidApiTests {

    private LUSIDAPI        client;
    private List<String>    securityIds;

    public String getEnvironmentOverride(String env, String defaultValue)
    {
        String  envOverride = System.getenv(env);
        return envOverride == null ? defaultValue : envOverride;
    }

    @BeforeAll
    public void setUp() throws Exception {

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            //  load configuration
            ObjectMapper configMapper = new ObjectMapper();
            final URL configFile = ClassLoader.getSystemResource("secrets.json");

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

            final HttpPost    httpPost = new HttpPost(tokenUrl);

            //  request body
            final String          tokenRequestBody = String.format("grant_type=password&username=%s&password=%s&scope=openid client groups&client_id=%s&client_secret=%s", username, password, clientId, clientSecret);
            final StringEntity    entity = new StringEntity(tokenRequestBody);

            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");

            //  execute request
            final CloseableHttpResponse   response = httpClient.execute(httpPost);

            assertEquals(response.getStatusLine().getStatusCode(), HttpStatus.SC_OK);

            final HttpEntity      body = response.getEntity();
            final String          content = EntityUtils.toString(body);
            final ObjectMapper    mapper = new ObjectMapper();

            //  map json response
            final Map bodyValues = mapper.readValue(content, Map.class);

            assertTrue(bodyValues.containsKey("access_token"), "missing access_token");

            //  get access token
            final String apiToken = (String)bodyValues.get("access_token");

            final Retrofit.Builder restBuilder = new Retrofit.Builder();
            final OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder()
                    .protocols(Arrays.asList(Protocol.HTTP_1_1))
                    .addInterceptor(chain -> {
                        Request newRequest = chain.request().newBuilder()
                                .header("Authorization", "Bearer " + apiToken)
                                .build();
                        return chain.proceed(newRequest);
                    });
            this.client = new LUSIDAPIImpl(apiUrl, clientBuilder, restBuilder);
        }

        List<String> ids = Arrays.asList("BBG000C6K6G9", "BBG000C04D57", "BBG000FV67Q4", "BBG000BF0KW3", "BBG000BF4KL1");
        TryLookupInstrumentsFromCodesDto idsResult = this.client.lookupInstrumentsFromCodes("Figi", ids, null, null);

        this.securityIds = idsResult.values().values().stream()
                .flatMap(r -> r.stream()
                        .map(i -> i.uid())
                )
                .collect(Collectors.toList());
    }

//    private <T> T assertResponseIsNotError(Class<T> clazz, Object response) {
//
//        if (response instanceof ErrorResponse) {
//            ErrorResponse error = (ErrorResponse)response;
//            fail(error.detailedMessage());
//            return null;
//        }
//        else if (response.getClass().isAssignableFrom(clazz)) {
//            return (T)response;
//        }
//        else {
//            fail("unknown response: " + response.getClass().getName());
//            return null;
//        }
//    }

    @Test
    public void create_portfolio() {

        final String scope = "finbourne";
        final String uuid = UUID.randomUUID().toString();

        final CreateTransactionPortfolioRequest  request = new CreateTransactionPortfolioRequest()
                .withDisplayName(String.format("Portfolio-%s", uuid))
                .withCode(String.format("Id-%s", uuid))
                .withBaseCurrency("GBP");

        final PortfolioDto  portfolio = this.client.createPortfolio(scope, request);

        assertEquals(request.code(), portfolio.id().code());
    }

    @Test
    public void create_portfolio_with_property() throws Exception {

        final String uuid = UUID.randomUUID().toString();
        final String scope = "finbourne";
        final String propertyName = String.format("und-style-%s", uuid);

        final CreatePropertyDefinitionRequest    propertyDefinition = new CreatePropertyDefinitionRequest()
                .withDomain("Portfolio")
                .withScope(scope)
                .withCode(propertyName)
                .withValueRequired(false)
                .withDisplayName("Fund Style")
                .withLifeTime("Perpetual")
                .withDataTypeId(new ResourceId().withScope("default").withCode("string"));;

        //  create property definition
        final PropertyDefinitionDto    propertyDefinitionDto = this.client.createPropertyDefinition(propertyDefinition);

        final DateTime effectiveDate = new DateTime(2018, 1, 1, 0, 0);

        final CreateTransactionPortfolioRequest  request = new CreateTransactionPortfolioRequest()
                .withDisplayName(String.format("Portfolio-%s", uuid))
                .withCode(String.format("Id-%s", uuid))
                .withBaseCurrency("GBP")
                .withCreated(effectiveDate);

        //  create portfolio
        final PortfolioDto  portfolio = this.client.createPortfolio(scope, request);

        assertEquals(request.code(), portfolio.id().code());

        final String propertyValue = "Active";
        final CreatePropertyRequest property = new CreatePropertyRequest().withValue(propertyValue);
        final Map<String, CreatePropertyRequest> properties = Map.of(propertyDefinitionDto.key(), property);

        //  add the property
        final PortfolioPropertiesDto  propertiesResult = this.client.upsertPortfolioProperties(scope, portfolio.id().code(), properties, effectiveDate);

        assertEquals(request.code(), propertiesResult.originPortfolioId().code());
        assertEquals(propertyValue, propertiesResult.properties().get(0).value());
    }

    @Test
    public void create_trade_with_property() {

        final String uuid = UUID.randomUUID().toString();
        final String scope = "finbourne";
        final String propertyName = String.format("traderId-%s", uuid);
        final String propertyValue = "A Trader";
        final DateTime effectiveDate = new DateTime(2018, 1, 1, 0, 0);

        final CreatePropertyDefinitionRequest    propertyDefinition = new CreatePropertyDefinitionRequest()
                .withDomain("Trade")
                .withScope(scope)
                .withCode(propertyName)
                .withValueRequired(false)
                .withDisplayName("Trader Id")
                .withLifeTime("Perpetual")
                .withDataTypeId(new ResourceId().withScope("default").withCode("string"));

        //  create property definition
        final PropertyDefinitionDto propertyDefinitionDto = this.client.createPropertyDefinition(propertyDefinition);

        final String originalPortfolioId = String.format("Id-%s", uuid);
        final CreateTransactionPortfolioRequest request = new CreateTransactionPortfolioRequest()
                .withDisplayName(String.format("Portfolio-%s", uuid))
                .withCode(originalPortfolioId)
                .withBaseCurrency("GBP")
                .withCreated(effectiveDate);

        //  create portfolio
        final PortfolioDto portfolio = this.client.createPortfolio(scope, request);

        assertEquals(portfolio.id().code(), originalPortfolioId);

        String portfolioId = portfolio.id().code();

        //  create the property
        CreatePerpetualPropertyRequest property = new CreatePerpetualPropertyRequest().withValue(propertyValue);

        //  create the trade
        TransactionRequest transaction = new TransactionRequest()
                .withTransactionId(UUID.randomUUID().toString())
                .withType("Buy")
                .withInstrumentUid(this.securityIds.get(0))
                .withSettlementCurrency("GBP")
                .withTransactionDate(effectiveDate)
                .withSettlementDate(effectiveDate)
                .withUnits(100.0)
                .withTransactionPrice(12.3)
                .withTotalConsideration(1230.0)
                .withSource("Client")
                .withProperties(Map.of(propertyDefinitionDto.key(), property));

        //  add the trade
        this.client.upsertTransactions(scope, portfolioId, new ArrayList<>(Arrays.asList(transaction)));

        //  get the trade
        final VersionedResourceListOfTransactionDto transactions = this.client.getTransactions(scope, portfolioId);

        assertEquals(1, transactions.values().size());
        assertEquals(transaction.transactionId(), transactions.values().get(0).transactionId());
        assertEquals(propertyValue, transactions.values().get(0).properties().get(0).value());
    }

    @Test
    public void apply_bitemporal_portfolio_change() throws Exception
    {
        final String scope = "finbourne";
        final String uuid = UUID.randomUUID().toString();
        final DateTime effectiveDate = new DateTime(2018, 1, 1, 0, 0);

        final CreateTransactionPortfolioRequest  request = new CreateTransactionPortfolioRequest()
                .withDisplayName(String.format("Portfolio-%s", uuid))
                .withCode(String.format("Id-%s", uuid))
                .withBaseCurrency("GBP")
                .withCreated(effectiveDate);

        final PortfolioDto  portfolio = client.createPortfolio(scope, request);

        final String portfolioId = portfolio.id().code();
        assertNotNull(portfolioId);

        class TransactionSpec
        {
            private String id;
            private Double price;
            private DateTime tradeDate;

            TransactionSpec(String id, Double price, DateTime tradeDate) {
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

            public DateTime getTradeDate() {
                return tradeDate;
            }
        }

        Function<TransactionSpec, TransactionRequest> buildTransaction = t -> new TransactionRequest()
                .withTransactionId(UUID.randomUUID().toString())
                .withType("Buy")
                .withInstrumentUid(t.getId())
                .withSettlementCurrency("GBP")
                .withTransactionDate(t.getTradeDate())
                .withSettlementDate(t.getTradeDate())
                .withUnits(100.0)
                .withTransactionPrice(t.getPrice())
                .withTotalConsideration(100.0 * t.getPrice())
                .withSource("Client");

        Consumer<List<TransactionDto>>    printTransactions = transactions -> transactions.forEach(t ->
                System.out.println(
                        String.format("%s\t%s\t%f\t%f\t%f", t.instrumentUid(), t.transactionDate(), t.units(), t.transactionPrice(), t.totalConsideration())));

        final List<TransactionSpec> transactionSpecs = new ArrayList<>(Arrays.asList(
                new TransactionSpec(this.securityIds.get(0), 101.0, new DateTime(2018, 1, 1, 0, 0)),
                new TransactionSpec(this.securityIds.get(1), 102.0, new DateTime(2018, 1, 2, 0, 0)),
                new TransactionSpec(this.securityIds.get(2), 103.0, new DateTime(2018, 1, 3, 0, 0))
        ));

        //  build list of transactions
        final TransactionRequest[] newTransactions = transactionSpecs.stream()
                .sorted(Comparator.comparing(ts -> ts.id))
                .map(buildTransaction)
                .toArray(TransactionRequest[]::new);

        //  add initial batch of transactions
        final UpsertPortfolioTransactionsDto  initialResult = this.client.upsertTransactions(scope, portfolioId, Arrays.asList(newTransactions));

        /*

        The LUSID API operates at microsecond resolution for dates/times but
        Joda-Time only works at millisecond.  This means that DateTime can get rounded
        down and be out of sync with LUSID.  To workaround we add an extra millisecond
        with the trade off that if 2 or more events happen within 1ms we may not get the
        expected behaviour

         */
        DateTime    asAtBatch1 = initialResult.version().asAtDate().plusMillis(1);
        Thread.sleep(500);

        //  add another trade for 2018-1-8
        TransactionSpec newTrade = new TransactionSpec(this.securityIds.get(3), 104.0, new DateTime(2018, 1, 8, 0, 0));
        UpsertPortfolioTransactionsDto addedResult = this.client.upsertTransactions(scope, portfolioId, Arrays.asList(buildTransaction.apply(newTrade)));

        DateTime    asAtBatch2 = addedResult.version().asAtDate().plusMillis(1);
        Thread.sleep(500);

        //  add back-dated trade
        TransactionSpec backDatedTrade = new TransactionSpec(this.securityIds.get(4), 105.0, new DateTime(2018, 1, 5, 0, 0));
        UpsertPortfolioTransactionsDto backDatedResult = this.client.upsertTransactions(scope, portfolioId, Arrays.asList(buildTransaction.apply(backDatedTrade)));

        DateTime    asAtBatch3 = backDatedResult.version().asAtDate().plusMillis(1);
        Thread.sleep(500);

        //  list transactions
        VersionedResourceListOfTransactionDto transactions = this.client.getTransactions(scope, portfolioId, null, null, asAtBatch1, null, 0, Integer.MAX_VALUE, null, null);

        assertEquals(3, transactions.values().size(), String.format("asAt %s", asAtBatch1));
        System.out.println("transactions at " + asAtBatch1);
        printTransactions.accept(transactions.values());

        transactions = this.client.getTransactions(scope, portfolioId, null, null, asAtBatch2, null, 0, Integer.MAX_VALUE, null, null);

        assertEquals(4, transactions.values().size(), String.format("asAt %s", asAtBatch2));
        System.out.println("transactions at " + asAtBatch2);
        printTransactions.accept(transactions.values());

        transactions = this.client.getTransactions(scope, portfolioId, null, null, asAtBatch3, null, 0, Integer.MAX_VALUE, null, null);

        assertEquals(5, transactions.values().size(), String.format("asAt %s", asAtBatch3));
        System.out.println("transactions at " + asAtBatch3);
        printTransactions.accept(transactions.values());

        //  latest transactions
        transactions = this.client.getTransactions(scope, portfolioId, null, null, null, null, 0, Integer.MAX_VALUE, null, null);

        assertEquals(5, transactions.values().size());
        System.out.println("transactions at " + DateTime.now());
        printTransactions.accept(transactions.values());
    }

    @Test
    public void lookup_securities()
    {
        final List<String> isins = new ArrayList<>(Arrays.asList("IT0004966401", "FR0010192997"));

        //  lookup securities
        final TryLookupInstrumentsFromCodesDto fbnIds = this.client.lookupInstrumentsFromCodes("Isin", isins, null, null);

        assertTrue(fbnIds.values().size() > 0);
    }
}
