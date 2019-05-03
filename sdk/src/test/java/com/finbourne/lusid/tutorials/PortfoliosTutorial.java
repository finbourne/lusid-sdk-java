package com.finbourne.lusid.tutorials;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.api.ScopesApi;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.integration.ApiClientBuilder;
import com.finbourne.lusid.integration.InstrumentLoader;
import com.finbourne.lusid.integration.TestDataUtilities;
import com.finbourne.lusid.model.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;

import static com.finbourne.lusid.integration.TestDataUtilities.LUSID_INSTRUMENT_IDENTIFIER;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PortfoliosTutorial {

    private static List<String> instrumentIds;

    private static TransactionPortfoliosApi    transactionPortfoliosApi;
    private static ScopesApi    scopesApi;
    private static PortfoliosApi    portfoliosApi;
    private static InstrumentLoader instrumentLoader;
    private static TestDataUtilities testDataUtilities;

    private static final String TutorialScope = "Testdemo";


    @BeforeClass
    public static void setUp() throws Exception {
        ApiClient apiClient = new ApiClientBuilder("secrets.json").build();

        transactionPortfoliosApi = new TransactionPortfoliosApi(apiClient);
        scopesApi = new ScopesApi(apiClient);
        portfoliosApi = new PortfoliosApi(apiClient);

        InstrumentsApi instrumentsApi = new InstrumentsApi(apiClient);
        instrumentLoader = new InstrumentLoader(instrumentsApi);
        instrumentIds = instrumentLoader.loadInstruments();

        testDataUtilities = new TestDataUtilities(transactionPortfoliosApi);
    }

    @AfterClass
    public static void tearDown() throws ApiException {
        instrumentLoader.deleteInstruments();
    }

    @Test
    public void Create_Transaction_Portfolio() throws ApiException {

        String uuid = UUID.randomUUID().toString();

        //    This defines the scope that the portfolio will be created in
        String scope = "sample-scope";

        //    Details of the new portfolio to be created, created here with the minimum set of mandatory fields
        CreateTransactionPortfolioRequest request = new CreateTransactionPortfolioRequest()

                //    Unique portfolio code, portfolio codes must be unique across scopes
                .code(String.format("Id-%s", uuid))

                //    Descriptive name for the portfolio
                .displayName(String.format("Portfolio-%s", uuid))
                .baseCurrency("GBP");

        //    Create the portfolio in LUSID
        Portfolio portfolio = transactionPortfoliosApi.createPortfolio(scope, request);

        //    Confirm that the portfolio was successfully created.  Any failures will result in
        //    a ApiException being thrown which contain the relevant response code and error message
        assertEquals(request.getCode(), portfolio.getId().getCode());
    }

    @Test
    public void Add_Transactions_To_Portfolio() throws ApiException{

        final String uuid = UUID.randomUUID().toString();

        //    Effective date of the portfolio, this is the date the portfolio was created and became live.  All dates/times
        //    must be supplied in UTC
        final OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        String portfolioId = testDataUtilities.createTransactionPortfolio(TutorialScope);

        //    Details of the transaction to be added
        TransactionRequest transaction = new TransactionRequest()

                //    Unique transaction id
                .transactionId(UUID.randomUUID().toString())

                //    Transaction type, configured during system setup
                .type("Buy")

                //    Instrument identifier for the transaction
                .instrumentIdentifiers(
                        new HashMap<String, String>() {
                            { put(LUSID_INSTRUMENT_IDENTIFIER, instrumentIds.get(0)); }
                        }
                )
                .totalConsideration(new CurrencyAndAmount().currency("GBP").amount(1230.0))
                .transactionDate(effectiveDate)
                .settlementDate(effectiveDate)
                .units(100.0)
                .transactionPrice(new TransactionPrice().price(12.3))
                .source("Broker");

        //    Add the transaction to the portfolio
        transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioId, new ArrayList<>(Arrays.asList(transaction)));

        //    Retrieve the transaction
        final VersionedResourceListOfTransaction transactions = transactionPortfoliosApi.getTransactions(TutorialScope,
                portfolioId, null, null, null, null, null, null, null, null);

        assertEquals(1, transactions.getValues().size());
        assertEquals(transaction.getTransactionId(), transactions.getValues().get(0).getTransactionId());
    }

    @Test
    public void List_Scopes() throws ApiException {

        //    Get the list of scopes across all entities
        ResourceListOfScopeDefinition    scopes = scopesApi.listScopes(null, null, null, null, null);

        assertThat(scopes.getCount(), is(greaterThan(0)));
    }

    @Test
    public void List_Portfolios() throws ApiException {

        //    This defines the scope that the portfolios will be retrieved from
        final String scope = TutorialScope + "-" + UUID.randomUUID().toString();

        for (int i = 0; i < 10; i++) {
            testDataUtilities.createTransactionPortfolio(scope);
        }

        //    Retrieve the list of portfolios from a given scope
        ResourceListOfPortfolio portfolios = portfoliosApi.listPortfoliosForScope(scope, null, null, null, null, null, null);

        assertThat(portfolios.getCount(), is(equalTo(10)));
    }
}
