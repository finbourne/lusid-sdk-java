package com.finbourne.lusid.tutorials.ibor;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.Transaction;
import com.finbourne.lusid.model.TransactionRequest;
import com.finbourne.lusid.model.UpsertPortfolioTransactionsResponse;
import com.finbourne.lusid.model.VersionedResourceListOfTransaction;
import com.finbourne.lusid.utilities.ApiClientBuilder;
import com.finbourne.lusid.utilities.CredentialsSource;
import com.finbourne.lusid.utilities.InstrumentLoader;
import com.finbourne.lusid.utilities.TestDataUtilities;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

import static com.finbourne.lusid.utilities.TestDataUtilities.TutorialScope;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Bitemporal {

    private static List<String> instrumentIds;

    private static TransactionPortfoliosApi transactionPortfoliosApi;
    private static TestDataUtilities testDataUtilities;

    @BeforeClass
    public static void setUp() throws Exception {

        ApiClient apiClient = new ApiClientBuilder().build(CredentialsSource.credentialsFile);

        transactionPortfoliosApi = new TransactionPortfoliosApi(apiClient);

        testDataUtilities = new TestDataUtilities(transactionPortfoliosApi);

        InstrumentsApi instrumentsApi = new InstrumentsApi(apiClient);
        InstrumentLoader instrumentLoader = new InstrumentLoader(instrumentsApi);
        instrumentIds = instrumentLoader.loadInstruments();
    }

    @Test
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
        newTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(0), 100.0, 101.0, "GBP", OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC), "Buy"));
        newTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(1), 100.0, 102.0, "GBP", OffsetDateTime.of(2018, 1, 2, 0, 0, 0, 0, ZoneOffset.UTC), "Buy"));
        newTransactions.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(2), 100.0, 103.0, "GBP", OffsetDateTime.of(2018, 1, 3, 0, 0, 0, 0, ZoneOffset.UTC), "Buy"));

        //  add initial batch of transactions
        final UpsertPortfolioTransactionsResponse  initialResult = transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioId, newTransactions);

        OffsetDateTime    asAtBatch1 = initialResult.getVersion().getAsAtDate();

        //  add another trade for 2018-1-8
        TransactionRequest  newTrade = testDataUtilities.buildTransactionRequest(instrumentIds.get(3), 100.0, 104.0, "GBP", OffsetDateTime.of(2018, 1, 8, 0, 0, 0, 0, ZoneOffset.UTC), "Buy");
        UpsertPortfolioTransactionsResponse addedResult = transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioId, Collections.singletonList(newTrade));

        OffsetDateTime    asAtBatch2 = addedResult.getVersion().getAsAtDate();
        Thread.sleep(500);

        //  add back-dated trade
        TransactionRequest  backDatedTrade = testDataUtilities.buildTransactionRequest(instrumentIds.get(4), 100.0, 105.0, "GBP", OffsetDateTime.of(2018, 1, 5, 0, 0, 0, 0, ZoneOffset.UTC), "Buy");
        UpsertPortfolioTransactionsResponse backDatedResult = transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioId, Collections.singletonList(backDatedTrade));

        OffsetDateTime    asAtBatch3 = backDatedResult.getVersion().getAsAtDate();
        Thread.sleep(500);

        //  list transactions
        VersionedResourceListOfTransaction transactions = transactionPortfoliosApi.getTransactions(TutorialScope, portfolioId, null, null, asAtBatch1, null, null);

        assertEquals(String.format("asAt %s", asAtBatch1),3, transactions.getValues().size());
        System.out.println("transactions at " + asAtBatch1);
        printTransactions.accept(transactions.getValues());

        transactions = transactionPortfoliosApi.getTransactions(TutorialScope, portfolioId, null, null, asAtBatch2, null, null);

        assertEquals(String.format("asAt %s", asAtBatch2),4, transactions.getValues().size());
        System.out.println("transactions at " + asAtBatch2);
        printTransactions.accept(transactions.getValues());

        transactions = transactionPortfoliosApi.getTransactions(TutorialScope, portfolioId, null, null, asAtBatch3, null, null);

        assertEquals(String.format("asAt %s", asAtBatch3), 5, transactions.getValues().size());
        System.out.println("transactions at " + asAtBatch3);
        printTransactions.accept(transactions.getValues());

        //  latest transactions
        transactions = transactionPortfoliosApi.getTransactions(TutorialScope, portfolioId, null, null, null, null, null);

        assertEquals(5, transactions.getValues().size());
        System.out.println("transactions at " + OffsetDateTime.now());
        printTransactions.accept(transactions.getValues());
    }
}
