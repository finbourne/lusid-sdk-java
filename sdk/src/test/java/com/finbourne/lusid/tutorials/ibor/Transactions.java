package com.finbourne.lusid.tutorials.ibor;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.utilities.ApiClientBuilder;
import com.finbourne.lusid.utilities.CredentialsSource;
import com.finbourne.lusid.utilities.InstrumentLoader;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.stream.Collectors;

import static com.finbourne.lusid.utilities.TestDataUtilities.*;
import static org.junit.Assert.assertEquals;

public class Transactions {

    private static InstrumentsApi instrumentsApi;
    private static TransactionPortfoliosApi transactionPortfoliosApi;
    private static List<String> instrumentIds;

    @BeforeClass
    public static void setUp() throws Exception
    {
        ApiClient apiClient = new ApiClientBuilder().build(CredentialsSource.credentialsFile);

        transactionPortfoliosApi = new TransactionPortfoliosApi(apiClient);
        instrumentsApi = new InstrumentsApi(apiClient);

        //  ensure instruments are created and exist in LUSID
        InstrumentLoader instrumentLoader = new InstrumentLoader(instrumentsApi);
        instrumentIds = instrumentLoader.loadInstruments();
    }

    @Test
    public void load_listed_instrument_transaction() throws ApiException
    {
        String uuid = UUID.randomUUID().toString();
        OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        //  portfolio request
        String originalPortfolioId = String.format("Id-%s", uuid);
        CreateTransactionPortfolioRequest request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(originalPortfolioId)
                .baseCurrency("GBP")
                .created(effectiveDate);

        //  create portfolio
        Portfolio portfolio = transactionPortfoliosApi.createPortfolio(TutorialScope, request);

        assertEquals(portfolio.getId().getCode(), originalPortfolioId);

        String portfolioId = portfolio.getId().getCode();

        //  create the transaction
        TransactionRequest transaction = new TransactionRequest()
                .transactionId(UUID.randomUUID().toString())
                .type("Buy")

                //  instruments must already exist in LUSID and have a valid LUSID instrument id
                .instrumentIdentifiers(new HashMap<String, String>() {{ put(LUSID_INSTRUMENT_IDENTIFIER, instrumentIds.get(0)); }})
                .totalConsideration(new CurrencyAndAmount().currency("GBP").amount(1230.0))
                .transactionDate(effectiveDate.toString())
                .settlementDate(effectiveDate.toString())
                .units(100.0)
                .transactionPrice(new TransactionPrice().price(12.3))
                .source("Custodian");

        //  add the trade
        transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioId, new ArrayList<>(Collections.singletonList(transaction)));

        //  get the trade
        VersionedResourceListOfTransaction transactions = transactionPortfoliosApi.getTransactions(TutorialScope,
                portfolioId, null, null, null, null, null);

        assertEquals(1, transactions.getValues().size());
        assertEquals(transaction.getTransactionId(), transactions.getValues().get(0).getTransactionId());
    }

    @Test
    public void load_cash_transaction() throws ApiException {
        String uuid = UUID.randomUUID().toString();
        OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        //  portfolio request
        String originalPortfolioId = String.format("Id-%s", uuid);
        CreateTransactionPortfolioRequest request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(originalPortfolioId)
                .baseCurrency("GBP")
                .created(effectiveDate);

        //  create portfolio
        Portfolio portfolio = transactionPortfoliosApi.createPortfolio(TutorialScope, request);

        assertEquals(portfolio.getId().getCode(), originalPortfolioId);

        String portfolioId = portfolio.getId().getCode();

        //  create the transaction
        TransactionRequest transaction = new TransactionRequest()
                .transactionId(UUID.randomUUID().toString())
                .type("FundsIn")

                //  Cash instruments are identified using CCY_ followed by the ISO currency codes.
                //  Cash instruments do not need to be created before use
                .instrumentIdentifiers(new HashMap<String, String>() {{ put(LUSID_CASH_IDENTIFIER, "GBP"); }})
                .totalConsideration(new CurrencyAndAmount().currency("GBP").amount(0.0))
                .transactionDate(effectiveDate.toString())
                .settlementDate(effectiveDate.toString())
                .units(1000.0)
                .source("Custodian");

        //  add the trade
        transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioId, new ArrayList<>(Collections.singletonList(transaction)));

        //  get the trade
        VersionedResourceListOfTransaction transactions = transactionPortfoliosApi.getTransactions(TutorialScope,
                portfolioId, null, null, null, null, null);

        assertEquals(1, transactions.getValues().size());
        assertEquals(transaction.getTransactionId(), transactions.getValues().get(0).getTransactionId());
    }

    @Test
    public void load_otc_instrument_transaction() throws ApiException
    {
        String uuid = UUID.randomUUID().toString();
        OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        //  portfolio request
        String originalPortfolioId = String.format("Id-%s", uuid);
        CreateTransactionPortfolioRequest request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(originalPortfolioId)
                .baseCurrency("GBP")
                .created(effectiveDate);

        //  create portfolio
        Portfolio portfolio = transactionPortfoliosApi.createPortfolio(TutorialScope, request);

        assertEquals(portfolio.getId().getCode(), originalPortfolioId);

        String portfolioId = portfolio.getId().getCode();

        //  swap definition, this is uploaded in a client custom format
        InstrumentDefinition   swapDefinition = new InstrumentDefinition()
                .name("10mm 5Y Fixed")
                .identifiers(Collections.singletonMap("ClientInternal", new InstrumentIdValue().value("SW-1")))
                .definition(
                        new InstrumentEconomicDefinition()
                                .instrumentFormat("CustomFormat")
                                .content("<customFormat>upload in custom xml or JSON format</customFormat>")
                );

        //  create the swap
        UpsertInstrumentsResponse instrumentsResponse = instrumentsApi.upsertInstruments(
                Collections.singletonMap("request", swapDefinition)
        );

        String swapId = instrumentsResponse
                .getValues()
                .values()
                .stream()
                .map(Instrument::getLusidInstrumentId)
                .collect(Collectors.toList())
                .get(0);

        //  create the transaction
        TransactionRequest transactionRequest = new TransactionRequest()
                .transactionId(UUID.randomUUID().toString())
                .type("Buy")
                .instrumentIdentifiers(new HashMap<String, String>() {{ put(LUSID_INSTRUMENT_IDENTIFIER, swapId); }})
                .totalConsideration(new CurrencyAndAmount().currency("GBP").amount(0.0))
                .transactionDate(effectiveDate.toString())
                .settlementDate(effectiveDate.toString())
                .units(1.0)
                .source("Custodian");

        //  add the trade
        transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioId, new ArrayList<>(Collections.singletonList(transactionRequest)));

        //  get the trade
        VersionedResourceListOfTransaction transactions = transactionPortfoliosApi.getTransactions(TutorialScope,
                portfolioId, null, null, null, null, null);

        assertEquals(1, transactions.getValues().size());

        Transaction swapTransaction = transactions.getValues().get(0);

        assertEquals(transactionRequest.getTransactionId(), swapTransaction.getTransactionId());
        assertEquals(swapId, swapTransaction.getInstrumentUid());
    }
}
