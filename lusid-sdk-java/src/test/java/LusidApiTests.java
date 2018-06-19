import com.fasterxml.jackson.databind.ObjectMapper;
import com.finbourne.LUSIDAPI;
import com.finbourne.implementation.LUSIDAPIImpl;
import com.finbourne.models.*;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.credentials.TokenCredentials;
import com.microsoft.rest.serializer.JacksonAdapter;
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

import java.io.File;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(Lifecycle.PER_CLASS)
public class LusidApiTests {

    private String  apiToken;
    private String  apiUrl;

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

            this.apiUrl = this.getEnvironmentOverride("FBN_LUSID_API_URL", (String)config.get("apiUrl"));

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
            this.apiToken = (String)bodyValues.get("access_token");
        }
    }

    private <T> T assertResponseIsNotError(Class<T> clazz, Object response) {

        if (response instanceof ErrorResponse) {
            ErrorResponse error = (ErrorResponse)response;
            fail(error.detailedMessage());
            return null;
        }
        else if (response.getClass().isAssignableFrom(clazz)) {
            return (T)response;
        }
        else {
            fail("unknown response: " + response.getClass().getName());
            return null;
        }
    }

    @Test
    public void create_portfolio() {

        final RestClient  restClient = new RestClient.Builder()
                .withBaseUrl(this.apiUrl)
                .withCredentials(new TokenCredentials("Bearer", this.apiToken))
                .withResponseBuilderFactory(new ServiceResponseBuilder.Factory())
                .withSerializerAdapter(new JacksonAdapter())
                .build();

        final LUSIDAPI client = new LUSIDAPIImpl(restClient);

        final String scope = "finbourne";
        final String uuid = UUID.randomUUID().toString();

        final CreatePortfolioRequest  request = new CreatePortfolioRequest()
                .withName(String.format("Portfolio-%s", uuid))
                .withCode(String.format("Id-%s", uuid))
                .withBaseCurrency("GBP");

        final Object  result = client.createPortfolio(scope, request);
        final PortfolioDto  portfolio = assertResponseIsNotError(PortfolioDto.class, result);

        assertEquals(request.code(), portfolio.id().code());
    }

    @Test
    public void create_portfolio_with_property() throws Exception {

        final RestClient  restClient = new RestClient.Builder()
                .withBaseUrl(this.apiUrl)
                .withCredentials(new TokenCredentials("Bearer", this.apiToken))
                .withResponseBuilderFactory(new ServiceResponseBuilder.Factory())
                .withSerializerAdapter(new JacksonAdapter())
                .build();

        final LUSIDAPI    client = new LUSIDAPIImpl(restClient);

        final String uuid = UUID.randomUUID().toString();
        final String scope = "finbourne";
        final String propertyName = String.format("und-style-%s", uuid);
        final String propertyKey = String.format("Portfolio/%s/%s", scope, propertyName);

        final CreatePropertyDefinitionRequest    propertyDefinition = new CreatePropertyDefinitionRequest()
                .withDomain("Portfolio")
                .withScope(scope)
                .withName(propertyName)
                .withValueRequired(false)
                .withDisplayName("Fund Style")
                .withLifeTime("Perpetual")
                .withSort("sort")
                .withDataFormatId(new ResourceId().withScope("default").withCode("string"));;

        //  create property definition
        final Object    propertyResult = client.createPropertyDefinition(propertyDefinition);
        final PropertyDefinitionDto propertyResponse = assertResponseIsNotError(PropertyDefinitionDto.class, propertyResult);

        assertEquals(propertyKey, propertyResponse.key());

        final DateTime effectiveDate = new DateTime(2018, 1, 1, 0, 0);

        final CreatePortfolioRequest  request = new CreatePortfolioRequest()
                .withName(String.format("Portfolio-%s", uuid))
                .withCode(String.format("Id-%s", uuid))
                .withBaseCurrency("GBP")
                .withCreated(effectiveDate);

        //  create portfolio
        final Object  result = client.createPortfolio(scope, request);
        final PortfolioDto    portfolio = assertResponseIsNotError(PortfolioDto.class, result);

        assertEquals(request.code(), portfolio.id().code());

        final String propertyValue = "Active";
        final CreatePropertyRequest property = new CreatePropertyRequest()
                .withScope(scope)
                .withName(propertyName)
                .withValue(propertyValue);
        final List<CreatePropertyRequest> properties = new ArrayList<>(Arrays.asList(property));

        //  add the property
        final Object  upsertResult = client.upsertPortfolioProperties(scope, portfolio.id().code(), properties, effectiveDate);
        final PortfolioPropertiesDto  propertiesResult = assertResponseIsNotError(PortfolioPropertiesDto.class, upsertResult);

        assertEquals(request.code(), propertiesResult.originPortfolioId().code());
        assertEquals(propertyValue, propertiesResult.properties().get(0).value());
    }

    @Test
    public void create_trade_with_property() {

        final RestClient  restClient = new RestClient.Builder()
                .withBaseUrl(this.apiUrl)
                .withCredentials(new TokenCredentials("Bearer", this.apiToken))
                .withResponseBuilderFactory(new ServiceResponseBuilder.Factory())
                .withSerializerAdapter(new JacksonAdapter())
                .build();

        final LUSIDAPI    client = new LUSIDAPIImpl(restClient);

        final String uuid = UUID.randomUUID().toString();
        final String scope = "finbourne";
        final String propertyDomain = "Trade";
        final String propertyName = String.format("traderId-%s", uuid);
        final String propertyKey = String.format("%s/%s/%s", propertyDomain, scope, propertyName);
        final String propertyValue = "A Trader";
        final DateTime effectiveDate = new DateTime(2018, 1, 1, 0, 0);

        final CreatePropertyDefinitionRequest    propertyDefinition = new CreatePropertyDefinitionRequest()
                .withDomain("Trade")
                .withScope(scope)
                .withName(propertyName)
                .withValueRequired(false)
                .withDisplayName("Trader Id")
                .withLifeTime("Perpetual")
                .withSort("sort")
                .withDataFormatId(new ResourceId().withScope("default").withCode("string"));

        //  create property definition
        final Object propertyResult = client.createPropertyDefinition(propertyDefinition);
        final PropertyDefinitionDto propertyResponse = assertResponseIsNotError(PropertyDefinitionDto.class, propertyResult);

        assertEquals(propertyResponse.key(), propertyKey);

        final String originalPortfolioId = String.format("Id-%s", uuid);
        final CreatePortfolioRequest request = new CreatePortfolioRequest()
                .withName(String.format("Portfolio-%s", uuid))
                .withCode(originalPortfolioId)
                .withBaseCurrency("GBP")
                .withCreated(effectiveDate);

        //  create portfolio
        final Object result = client.createPortfolio(scope, request);
        final PortfolioDto portfolio = assertResponseIsNotError(PortfolioDto.class, result);

        assertEquals(portfolio.id().code(), originalPortfolioId);

        String portfolioId = portfolio.id().code();

        //  create the property
        CreatePerpetualPropertyRequest property = new CreatePerpetualPropertyRequest()
                .withScope(scope)
                .withName(propertyName)
                .withValue(propertyValue);

        //  create the trade
        UpsertPortfolioTradeRequest trade = new UpsertPortfolioTradeRequest()
                .withTradeId(UUID.randomUUID().toString())
                .withType("Buy")
                .withSecurityUid("FIGI_BBG001SMDKD5")
                .withSettlementCurrency("GBP")
                .withTradeDate(effectiveDate)
                .withSettlementDate(effectiveDate)
                .withUnits(100)
                .withTradePrice(12.3)
                .withTotalConsideration(1230)
                .withSource("Client")
                .withProperties(new ArrayList<>(Arrays.asList(property)));

        //  add the trade
        final Object upsertResult = client.upsertTrades(scope, portfolioId, new ArrayList<>(Arrays.asList(trade)));
        final UpsertPortfolioTradesDto tradesResult = assertResponseIsNotError(UpsertPortfolioTradesDto.class, upsertResult);

        //  get the trade
        final Object getTradesResult = client.getTrades(scope, portfolioId);
        final VersionedResourceListTradeDto trades = assertResponseIsNotError(VersionedResourceListTradeDto.class, getTradesResult);

        assertEquals(1, trades.values().size());
        assertEquals(trade.tradeId(), trades.values().get(0).tradeId());
        assertEquals(propertyValue, trades.values().get(0).properties().get(0).value());
    }

    @Test
    public void apply_bitemporal_portfolio_change() throws Exception
    {
        final RestClient  restClient = new RestClient.Builder()
                .withBaseUrl(this.apiUrl)
                .withCredentials(new TokenCredentials("Bearer", this.apiToken))
                .withResponseBuilderFactory(new ServiceResponseBuilder.Factory())
                .withSerializerAdapter(new JacksonAdapter())
                .build();

        final LUSIDAPI    client = new LUSIDAPIImpl(restClient);

        final String scope = "finbourne";
        final String uuid = UUID.randomUUID().toString();
        final DateTime effectiveDate = new DateTime(2018, 1, 1, 0, 0);

        final CreatePortfolioRequest  request = new CreatePortfolioRequest()
                .withName(String.format("Portfolio-%s", uuid))
                .withCode(String.format("Id-%s", uuid))
                .withBaseCurrency("GBP")
                .withCreated(effectiveDate);

        final Object  result = client.createPortfolio(scope, request);
        final PortfolioDto  portfolio = assertResponseIsNotError(PortfolioDto.class, result);

        final String portfolioId = portfolio.id().code();
        assertNotNull(portfolioId);

        class TradeSpec
        {
            private String id;
            private Double price;
            private DateTime tradeDate;

            TradeSpec(String id, Double price, DateTime tradeDate) {
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

        Function<TradeSpec, UpsertPortfolioTradeRequest> buildTrade = t -> new UpsertPortfolioTradeRequest()
                .withTradeId(UUID.randomUUID().toString())
                .withType("Buy")
                .withSecurityUid(t.getId())
                .withSettlementCurrency("GBP")
                .withTradeDate(t.getTradeDate())
                .withSettlementDate(t.getTradeDate())
                .withUnits(100.0)
                .withTradePrice(t.getPrice())
                .withTotalConsideration(100.0 * t.getPrice())
                .withSource("Client");

        ;
        Consumer<List<TradeDto>>    printTrades = trades -> trades.forEach(t ->
                System.out.println(
                        String.format("%s\t%s\t%f\t%f\t%f", t.securityUid(), t.tradeDate(), t.units(), t.tradePrice(), t.totalConsideration())));

        final List<TradeSpec>   tradeSpecs = new ArrayList<>(Arrays.asList(
                new TradeSpec("FIGI_BBG001S7Z574", 101.0, new DateTime(2018, 1, 1, 0, 0)),
                new TradeSpec("FIGI_BBG001SRKHW2", 102.0, new DateTime(2018, 1, 2, 0, 0)),
                new TradeSpec("FIGI_BBG000005547", 103.0, new DateTime(2018, 1, 3, 0, 0))
                ));

        //  build list of trades
        final UpsertPortfolioTradeRequest[] newTrades = tradeSpecs.stream()
                .sorted(Comparator.comparing(ts -> ts.id))
                .map(buildTrade)
                .toArray(UpsertPortfolioTradeRequest[]::new);

        //  add initial batch of trades
        final Object  addTradesResult = client.upsertTrades(scope, portfolioId, Arrays.asList(newTrades));
        UpsertPortfolioTradesDto initialResult = assertResponseIsNotError(UpsertPortfolioTradesDto.class, addTradesResult);

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
        TradeSpec   newTrade = new TradeSpec("FIGI_BBG001S61MW8", 104.0, new DateTime(2018, 1, 8, 0, 0));
        Object laterTradeResult = client.upsertTrades(scope, portfolioId, Arrays.asList(buildTrade.apply(newTrade)));
        UpsertPortfolioTradesDto addedResult = assertResponseIsNotError(UpsertPortfolioTradesDto.class, laterTradeResult);

        DateTime    asAtBatch2 = addedResult.version().asAtDate().plusMillis(1);
        Thread.sleep(500);

        //  add back-dated trade
        TradeSpec   backDatedTrade = new TradeSpec("FIGI_BBG001S6M3Z4", 105.0, new DateTime(2018, 1, 5, 0, 0));
        Object backDatedTradeResult = client.upsertTrades(scope, portfolioId, Arrays.asList(buildTrade.apply(backDatedTrade)));
        UpsertPortfolioTradesDto backDatedResult = assertResponseIsNotError(UpsertPortfolioTradesDto.class, backDatedTradeResult);

        DateTime    asAtBatch3 = backDatedResult.version().asAtDate().plusMillis(1);
        Thread.sleep(500);

        //  list trades
        Object allTrades = client.getTrades(scope, portfolioId, null, null, asAtBatch1, null, 0, Integer.MAX_VALUE, null, null);
        VersionedResourceListTradeDto trades = assertResponseIsNotError(VersionedResourceListTradeDto.class, allTrades);

        assertEquals(3, trades.values().size(), String.format("asAt %s", asAtBatch1));
        System.out.println("trades at " + asAtBatch1);
        printTrades.accept(trades.values());

        allTrades = client.getTrades(scope, portfolioId, null, null, asAtBatch2, null, 0, Integer.MAX_VALUE, null, null);
        trades = assertResponseIsNotError(VersionedResourceListTradeDto.class, allTrades);

        assertEquals(4, trades.values().size(), String.format("asAt %s", asAtBatch2));
        System.out.println("trades at " + asAtBatch2);
        printTrades.accept(trades.values());

        allTrades = client.getTrades(scope, portfolioId, null, null, asAtBatch3, null, 0, Integer.MAX_VALUE, null, null);
        trades = assertResponseIsNotError(VersionedResourceListTradeDto.class, allTrades);

        assertEquals(5, trades.values().size(), String.format("asAt %s", asAtBatch3));
        System.out.println("trades at " + asAtBatch3);
        printTrades.accept(trades.values());

        //  latest trades
        allTrades = client.getTrades(scope, portfolioId, null, null, null, null, 0, Integer.MAX_VALUE, null, null);
        trades = assertResponseIsNotError(VersionedResourceListTradeDto.class, allTrades);

        assertEquals(5, trades.values().size());
        System.out.println("trades at " + DateTime.now());
        printTrades.accept(trades.values());
    }

    @Test
    public void lookup_securities()
    {
        final RestClient  restClient = new RestClient.Builder()
                .withBaseUrl(this.apiUrl)
                .withCredentials(new TokenCredentials("Bearer", this.apiToken))
                .withResponseBuilderFactory(new ServiceResponseBuilder.Factory())
                .withSerializerAdapter(new JacksonAdapter())
                .build();

        final LUSIDAPI    client = new LUSIDAPIImpl(restClient);

        final List<String> isins = new ArrayList<>(Arrays.asList("IT0004966401", "FR0010192997"));

        //  lookup securties
        final Object lookupResult = client.lookupSecuritiesFromCodes("Isin", isins, null, null);
        final TryLookupSecuritiesFromCodesDto fbnIds = assertResponseIsNotError(TryLookupSecuritiesFromCodesDto.class, lookupResult);

        assertTrue(fbnIds.values().size() > 0);
    }
}
