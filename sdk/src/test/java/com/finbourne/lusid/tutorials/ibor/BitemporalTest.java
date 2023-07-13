package com.finbourne.lusid.tutorials.ibor;

import com.finbourne.features.LusidFeature;
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.Transaction;
import com.finbourne.lusid.model.TransactionRequest;
import com.finbourne.lusid.model.UpsertPortfolioTransactionsResponse;
import com.finbourne.lusid.model.VersionedResourceListOfTransaction;
import com.finbourne.lusid.utilities.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

import static com.finbourne.lusid.utilities.TestDataUtilities.TutorialScope;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BitemporalTest {

    private static List<String> instrumentIds;

    private static TransactionPortfoliosApi transactionPortfoliosApi;
    private static TestDataUtilities testDataUtilities;

    @BeforeClass
    public static void setUp() throws Exception {
        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build(CredentialsSource.credentialsFile);
        ApiClient apiClient = new ApiClientBuilder().build(apiConfiguration);

        transactionPortfoliosApi = new TransactionPortfoliosApi(apiClient);

        testDataUtilities = new TestDataUtilities(transactionPortfoliosApi);

        InstrumentsApi instrumentsApi = new InstrumentsApi(apiClient);
        InstrumentLoader instrumentLoader = new InstrumentLoader(instrumentsApi);
        instrumentIds = instrumentLoader.loadInstruments();
    }

    @Test
    @LusidFeature("F1")
    public void apply_bitemporal_portfolio_change() throws Exception
    {
        String portfolioId = testDataUtilities.createTransactionPortfolio(TutorialScope);

        assertNotNull(portfolioId);

        Consumer<List<Transaction>> printTransactions = transactions -> transactions.forEach(t ->
                System.out.println(
                        String.format("%s\t%s\t%f\t%f\t%f",
                                t.getInstrumentUid(),
                                t.getTransactionDate(),
                                t.getUnits(),
                                t.getTransactionPrice().getPrice(),
                                t.getTotalConsideration().getAmount())));

        List<TransactionRequest>    newTransactions = new ArrayList<>();
        newTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(0), BigDecimal.valueOf(100.0), BigDecimal.valueOf(101.0), "GBP", OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC), "Buy"));
        newTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(1), BigDecimal.valueOf(100.0), BigDecimal.valueOf(102.0), "GBP", OffsetDateTime.of(2018, 1, 2, 0, 0, 0, 0, ZoneOffset.UTC), "Buy"));
        newTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(2), BigDecimal.valueOf(100.0), BigDecimal.valueOf(103.0), "GBP", OffsetDateTime.of(2018, 1, 3, 0, 0, 0, 0, ZoneOffset.UTC), "Buy"));

        //  add initial batch of transactions
        final UpsertPortfolioTransactionsResponse  initialResult = transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioId, newTransactions);

        OffsetDateTime    asAtBatch1 = initialResult.getVersion().getAsAtDate();

        //  add another trade for 2018-1-8
        TransactionRequest  newTrade = testDataUtilities.buildTransactionRequest(instrumentIds.get(3), BigDecimal.valueOf(100.0), BigDecimal.valueOf(104.0), "GBP", OffsetDateTime.of(2018, 1, 8, 0, 0, 0, 0, ZoneOffset.UTC), "Buy");
        UpsertPortfolioTransactionsResponse addedResult = transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioId, Collections.singletonList(newTrade));

        OffsetDateTime    asAtBatch2 = addedResult.getVersion().getAsAtDate();
        Thread.sleep(500);

        //  add back-dated trade
        TransactionRequest  backDatedTrade = testDataUtilities.buildTransactionRequest(instrumentIds.get(4), BigDecimal.valueOf(100.0), BigDecimal.valueOf(105.0), "GBP", OffsetDateTime.of(2018, 1, 5, 0, 0, 0, 0, ZoneOffset.UTC), "Buy");
        UpsertPortfolioTransactionsResponse backDatedResult = transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioId, Collections.singletonList(backDatedTrade));

        OffsetDateTime    asAtBatch3 = backDatedResult.getVersion().getAsAtDate();
        Thread.sleep(500);

        //  list transactions
        VersionedResourceListOfTransaction transactions = transactionPortfoliosApi.getTransactions(TutorialScope, portfolioId, null, null, asAtBatch1, null, null, null, null, null);

        assertEquals(String.format("asAt %s", asAtBatch1),3, transactions.getValues().size());
        System.out.println("transactions at " + asAtBatch1);
        printTransactions.accept(transactions.getValues());

        transactions = transactionPortfoliosApi.getTransactions(TutorialScope, portfolioId, null, null, asAtBatch2, null, null, null, null, null);

        assertEquals(String.format("asAt %s", asAtBatch2),4, transactions.getValues().size());
        System.out.println("transactions at " + asAtBatch2);
        printTransactions.accept(transactions.getValues());

        transactions = transactionPortfoliosApi.getTransactions(TutorialScope, portfolioId, null, null, asAtBatch3, null, null, null, null, null);

        assertEquals(String.format("asAt %s", asAtBatch3), 5, transactions.getValues().size());
        System.out.println("transactions at " + asAtBatch3);
        printTransactions.accept(transactions.getValues());

        //  latest transactions
        transactions = transactionPortfoliosApi.getTransactions(TutorialScope, portfolioId, null, null, null, null, null, null, null, null);

        assertEquals(5, transactions.getValues().size());
        System.out.println("transactions at " + OffsetDateTime.now());
        printTransactions.accept(transactions.getValues());
    }
}
