package com.finbourne.lusid.tutorials.ibor;

import com.finbourne.features.LusidFeature;
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.ReconciliationsApi;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.utilities.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.Console;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.finbourne.lusid.utilities.TestDataUtilities.TutorialScope;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.junit.Assert.assertEquals;

public class ReconciliationTest {

    private static List<String> instrumentIds;

    private static TransactionPortfoliosApi transactionPortfoliosApi;
    private static ReconciliationsApi reconciliationsApi;
    private static TestDataUtilities testDataUtilities;

    @BeforeClass
    public static void setUp() throws Exception {
        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build(CredentialsSource.credentialsFile);
        ApiClient apiClient = new ApiClientBuilder().build(apiConfiguration);

        transactionPortfoliosApi = new TransactionPortfoliosApi(apiClient);
        reconciliationsApi = new ReconciliationsApi(apiClient);

        InstrumentsApi instrumentsApi = new InstrumentsApi(apiClient);
        InstrumentLoader instrumentLoader = new InstrumentLoader(instrumentsApi);
        instrumentIds = instrumentLoader.loadInstruments();

        testDataUtilities = new TestDataUtilities(transactionPortfoliosApi);
    }

    @Test
    @LusidFeature("F16")
    public void reconcile_portfolio() throws ApiException {

        //  Create the portfolio
        String portfolioCode = testDataUtilities.createTransactionPortfolio(TutorialScope);

        OffsetDateTime  today = OffsetDateTime.now().toInstant().atOffset(ZoneOffset.UTC);
        OffsetDateTime  yesterday = today.minusDays(1).toInstant().atOffset(ZoneOffset.UTC);;

        //  Create transactions for yesterday
        List<TransactionRequest>    yesterdaysTransactions = new ArrayList<>();
        yesterdaysTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(0), BigDecimal.valueOf(1000.0), BigDecimal.valueOf(100.0), "GBP", yesterday, "StockIn"));
        yesterdaysTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(0), BigDecimal.valueOf(2300.0), BigDecimal.valueOf(101.0), "GBP", yesterday, "StockIn"));
        yesterdaysTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(1), BigDecimal.valueOf(-1000.0), BigDecimal.valueOf(102.0), "GBP", yesterday, "StockIn"));
        yesterdaysTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(2), BigDecimal.valueOf(1200.0), BigDecimal.valueOf(103.0), "GBP", yesterday, "StockIn"));
        yesterdaysTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(3), BigDecimal.valueOf(2000.0), BigDecimal.valueOf(103.0), "GBP", yesterday, "StockIn"));

        //  Add the transactions to LUSID
        transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioCode, yesterdaysTransactions);

        //  Add transactions for today
        List<TransactionRequest> todaysTransactions = new ArrayList<>();
        todaysTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(0), BigDecimal.valueOf(-3000.0), BigDecimal.valueOf(101.78), "GBP", today.plusHours(8), "StockIn")); //net long 300
        todaysTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(0), BigDecimal.valueOf(1500.0), BigDecimal.valueOf(101.78), "GBP", today.plusHours(12), "StockIn")); //net long 1800
        todaysTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(1), BigDecimal.valueOf(1000.0), BigDecimal.valueOf(102.0), "GBP", today.plusHours(12), "StockIn"));  // flat
        todaysTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(2), BigDecimal.valueOf(1200.0), BigDecimal.valueOf(103.0), "GBP", today.plusHours(16), "StockIn"));  // long 2400
        todaysTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(3), BigDecimal.valueOf(1000.0), BigDecimal.valueOf(103.0), "GBP", today.plusHours(9), "StockIn"));   // long 3000
        todaysTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(3), BigDecimal.valueOf(2000.0), BigDecimal.valueOf(103.0), "GBP", today.plusHours(20), "StockIn"));  // long 5000

        //  Add the transactions to LUSID
        UpsertPortfolioTransactionsResponse upsertResult = transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioCode, todaysTransactions);

        //  Get the time of the last update
        OffsetDateTime lastAsAt = upsertResult.getVersion().getAsAtDate();

        //  We now have the portfolio with 2 days worth of transactions, going to reconcile from T-1 20:00 to now,
        //  this should reflect breaks for each instrument equal to the transactions from yesterday till 20 today.

        //  Create the reconciliation request to compare the 2 portfolio states
        PortfoliosReconciliationRequest reconciliationRequest = new PortfoliosReconciliationRequest()
                .left(new PortfolioReconciliationRequest()
                        .portfolioId(new ResourceId().scope(TutorialScope).code(portfolioCode))
                        .effectiveAt(yesterday.plusHours(20).toString())
                        .asAt(lastAsAt))
                .right(new PortfolioReconciliationRequest()
                        .portfolioId(new ResourceId().scope(TutorialScope).code(portfolioCode))
                        .effectiveAt(today.plusHours(16).toString())
                        .asAt(lastAsAt)
        );

        ResourceListOfReconciliationBreak breaks = reconciliationsApi.reconcileHoldings(null, null, null, null, reconciliationRequest);

        for (ReconciliationBreak value : breaks.getValues()) {
            System.out.println(String.format("%s\t%f\t%f", value.getInstrumentUid(), value.getDifferenceUnits(), value.getDifferenceCost().getAmount()));
        }

        assertEquals(4, breaks.getValues().size());

        Map<String, ReconciliationBreak> map = breaks.getValues()
                .stream()
                .collect(Collectors.toMap(ReconciliationBreak::getInstrumentUid, b -> b));

        assertThat(BigDecimal.valueOf(-1500.0), comparesEqualTo(map.get(instrumentIds.get(0)).getDifferenceUnits()));
        assertThat(BigDecimal.valueOf(1000.0), comparesEqualTo(map.get(instrumentIds.get(3)).getDifferenceUnits()));
        assertThat(BigDecimal.valueOf(1200.0), comparesEqualTo(map.get(instrumentIds.get(2)).getDifferenceUnits()));
        assertThat(BigDecimal.valueOf(1000.0), comparesEqualTo(map.get(instrumentIds.get(1)).getDifferenceUnits()));
    }
}
