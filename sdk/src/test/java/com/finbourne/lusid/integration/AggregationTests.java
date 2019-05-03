package com.finbourne.lusid.integration;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.AggregationApi;
import com.finbourne.lusid.api.AnalyticsStoresApi;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

public class AggregationTests {

    private static final String AGGREGATION_KEY = "Holding/default/PV";
    private static final String AGGREGATION_RESULT_KEY = "Sum(Holding/default/PV)";
    private static final String GROUPBY_KEY = "Instrument/default/Name";
    private static final String INSTRUMENT_KEY = "instrumentId";
    private static final String PRICE_KEY = "price";
    private static final String DATE_KEY = "date";

    private final OffsetDateTime EFFECTIVE_DATE = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

    private static AnalyticsStoresApi analyticsStoresApi;
    private static TransactionPortfoliosApi transactionPortfoliosApi;
    private static AggregationApi  aggregationApi;
    private static List<String> instrumentIds;

    private static TestDataUtilities testDataUtilities;
    private static InstrumentLoader instrumentLoader;

    @BeforeClass
    public static void setUp() throws Exception
    {
        ApiClient apiClient = new ApiClientBuilder("secrets.json").build();

        testDataUtilities = new TestDataUtilities(transactionPortfoliosApi);

        transactionPortfoliosApi = new TransactionPortfoliosApi(apiClient);
        analyticsStoresApi = new AnalyticsStoresApi(apiClient);
        aggregationApi = new AggregationApi(apiClient);

        //  ensure instruments are created and exist in LUSID
        InstrumentsApi instrumentsApi = new InstrumentsApi(apiClient);
        instrumentLoader = new InstrumentLoader(instrumentsApi);
        instrumentIds = instrumentLoader.loadInstruments();
    }

    @AfterClass
    public static void tearDown() throws ApiException {
        instrumentLoader.deleteInstruments();
    }

    @Test
    public void run_aggregation_with_buy() throws ApiException
    {
        run_aggregation(
                () -> {

                    final String    currency = "GBP";

                    List<TransactionRequest>    requests = new ArrayList<>();

                    //  add the starting cash
                    requests.add(testDataUtilities.buildCashFundsInTransactionRequest(30600.0, currency, EFFECTIVE_DATE));

                    // create the transaction requests
                    requests.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(0), 100.0, 101.0, currency, EFFECTIVE_DATE, "Buy"));
                    requests.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(1), 100.0, 102.0, currency, EFFECTIVE_DATE, "Buy"));
                    requests.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(2), 100.0, 103.0, currency, EFFECTIVE_DATE, "Buy"));

                    return requests;
                },
                results -> {
                    assertEquals(3, results.size());
                    assertEquals(10000.0, results.get(0).get(AGGREGATION_RESULT_KEY));
                    assertEquals(20000.0, results.get(1).get(AGGREGATION_RESULT_KEY));
                    assertEquals(30000.0, results.get(2).get(AGGREGATION_RESULT_KEY));
                });
    }

    public void run_aggregation(
            Supplier<List<TransactionRequest>> createTransactionRequests,
            Consumer<List<Map<String, Object>>> validateResults
    ) throws ApiException
    {
        String uuid = UUID.randomUUID().toString();
        String scope = "finbourne";

        //  build the create portfolio request
        String originalPortfolioId = String.format("Id-%s", uuid);
        CreateTransactionPortfolioRequest request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(originalPortfolioId)
                .baseCurrency("GBP")
                .created(EFFECTIVE_DATE);

        //  create portfolio
        Portfolio portfolio = transactionPortfoliosApi.createPortfolio(scope, request);

        assertEquals(portfolio.getId().getCode(), originalPortfolioId);

        String portfolioId = portfolio.getId().getCode();

        //  build the transaction requests
        List<TransactionRequest> transactionRequests = createTransactionRequests.get();

        //  upload the transactions to LUSID
        transactionPortfoliosApi.upsertTransactions(scope, portfolioId, transactionRequests);

        //  set up the prices used for the aggregation in the analytic stores
        ResourceListOfAnalyticStoreKey analyticsStores = analyticsStoresApi.listAnalyticStores(null, null, null, null, null);
        AnalyticStoreKey analyticStore = analyticsStores.getValues()
                .stream()
                .filter(ask -> ask.getDate().equals(EFFECTIVE_DATE))
                .findAny()
                .orElse(null);

        if (analyticStore == null) {
            //  create the analytic store
            CreateAnalyticStoreRequest  createAnalyticStoreRequest = new CreateAnalyticStoreRequest().scope(scope).date(EFFECTIVE_DATE);
            analyticsStoresApi.createAnalyticStore(createAnalyticStoreRequest);
        }

        List<InstrumentAnalytic>    prices = Arrays.asList(
                new InstrumentAnalytic().instrumentUid(instrumentIds.get(0)).value(100.0),
                new InstrumentAnalytic().instrumentUid(instrumentIds.get(1)).value(200.0),
                new InstrumentAnalytic().instrumentUid(instrumentIds.get(2)).value(300.0)
        );

        //  add prices to the analytics store
        analyticsStoresApi.setAnalytics(scope, EFFECTIVE_DATE.getYear(), EFFECTIVE_DATE.getMonthValue(), EFFECTIVE_DATE.getDayOfMonth(), prices);

        //    create the aggregation request, this example calculates the percentage of total portfolio value and value by instrument
        AggregationRequest  aggregationRequest = new AggregationRequest()
                .recipeId(new ResourceId().scope(scope).code("default"))
                .metrics(Arrays.asList(
                        new AggregateSpec().key(GROUPBY_KEY).op(AggregateSpec.OpEnum.VALUE),
                        new AggregateSpec().key(AGGREGATION_KEY).op(AggregateSpec.OpEnum.PROPORTION),
                        new AggregateSpec().key(AGGREGATION_KEY).op(AggregateSpec.OpEnum.SUM)
                ))
                .groupBy(Arrays.asList(GROUPBY_KEY))
                .effectiveAt(EFFECTIVE_DATE);

        //  do the aggregation
        ListAggregationResponse aggregationResponse = aggregationApi.getAggregationByPortfolio(scope, portfolioId, aggregationRequest, null, null, null);

        aggregationResponse.getData().sort((o1, o2) -> {
            String name1 = (String)o1.get(GROUPBY_KEY);
            String name2 = (String)o2.get(GROUPBY_KEY);

            return name1.compareTo(name2);
        });

        validateResults.accept(aggregationResponse.getData());

        /**
         * The aggregation response contains a schema property which describes the data returned.
         * This includes the aggregated values and description of the types.
         */
        ResultDataSchema    resultSchema = aggregationResponse.getDataSchema();

        for (Map<String, Object> aggregation : aggregationResponse.getData()) {
            for (String column : resultSchema.getPropertySchema().keySet()) {
                System.out.println(column + ":\t" + aggregation.get(column) + "\t");
            }
            System.out.println();
        }
    }

}
