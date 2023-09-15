package com.finbourne.lusid.tutorials.ibor;

import com.finbourne.features.LusidFeature;
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.utilities.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.stream.Collectors;

import static com.finbourne.lusid.utilities.TestDataUtilities.*;
import static org.junit.Assert.assertEquals;

public class TransactionsTest {

    private static InstrumentsApi instrumentsApi;
    private static TransactionPortfoliosApi transactionPortfoliosApi;
    private static List<String> instrumentIds;

    @BeforeClass
    public static void setUp() throws Exception
    {
        ApiConfiguration apiConfiguration = new ApiConfigurationBuilder().build(CredentialsSource.credentialsFile);
        ApiClient apiClient = new ApiClientBuilder().build(apiConfiguration, 30, 30);

        transactionPortfoliosApi = new TransactionPortfoliosApi(apiClient);
        instrumentsApi = new InstrumentsApi(apiClient);

        //  ensure instruments are created and exist in LUSID
        InstrumentLoader instrumentLoader = new InstrumentLoader(instrumentsApi);
        instrumentIds = instrumentLoader.loadInstruments();
    }

    @Test
    @LusidFeature("F17")
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
                .totalConsideration(new CurrencyAndAmount().currency("GBP").amount(BigDecimal.valueOf(1230.0)))
                .transactionDate(effectiveDate.toString())
                .settlementDate(effectiveDate.toString())
                .units(BigDecimal.valueOf(100.0))
                .transactionPrice(new TransactionPrice().price(BigDecimal.valueOf(12.3)))
                .source("Custodian");

        //  add the trade
        transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioId, new ArrayList<>(Collections.singletonList(transaction)));

        //  get the trade
        VersionedResourceListOfTransaction transactions = transactionPortfoliosApi.getTransactions(TutorialScope,
                portfolioId, null, null, null, null, null, null, null, null, null);

        assertEquals(1, transactions.getValues().size());
        assertEquals(transaction.getTransactionId(), transactions.getValues().get(0).getTransactionId());
    }

    @Test
    @LusidFeature("F18")
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
                .totalConsideration(new CurrencyAndAmount().currency("GBP").amount(BigDecimal.valueOf(0.0)))
                .transactionDate(effectiveDate.toString())
                .settlementDate(effectiveDate.toString())
                .units(BigDecimal.valueOf(1000.0))
                .source("Custodian");

        //  add the trade
        transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioId, new ArrayList<>(Collections.singletonList(transaction)));

        //  get the trade
        VersionedResourceListOfTransaction transactions = transactionPortfoliosApi.getTransactions(TutorialScope,
                portfolioId, null, null, null, null, null, null, null, null, null);

        assertEquals(1, transactions.getValues().size());
        assertEquals(transaction.getTransactionId(), transactions.getValues().get(0).getTransactionId());
    }


}
