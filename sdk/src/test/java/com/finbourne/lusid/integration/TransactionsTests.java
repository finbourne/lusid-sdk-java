package com.finbourne.lusid.integration;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.*;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class TransactionsTests {

    private InstrumentsApi instrumentsApi;
    private TransactionPortfoliosApi transactionPortfoliosApi;
    private List<String> instrumentIds;

    @Before
    public void setUp() throws Exception
    {
        File configJson = new TestConfigurationLoader().loadConfiguration("secrets.json");
        ApiClient apiClient = new ApiClientBuilder(configJson).build();

        this.transactionPortfoliosApi = new TransactionPortfoliosApi(apiClient);
        this.instrumentsApi = new InstrumentsApi(apiClient);

        //  ensure instruments are created and exist in LUSID
        this.instrumentIds = new InstrumentLoader().loadInstruments();
    }

    @Test
    public void load_listed_instrument_transaction() throws ApiException
    {
        String uuid = UUID.randomUUID().toString();
        String scope = "finbourne";
        OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        //  portfolio request
        String originalPortfolioId = String.format("Id-%s", uuid);
        CreateTransactionPortfolioRequest request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(originalPortfolioId)
                .baseCurrency("GBP")
                .created(effectiveDate);

        //  create portfolio
        Portfolio portfolio = this.transactionPortfoliosApi.createPortfolio(scope, request);

        assertEquals(portfolio.getId().getCode(), originalPortfolioId);

        String portfolioId = portfolio.getId().getCode();

        //  create the transaction
        TransactionRequest transaction = new TransactionRequest()
                .transactionId(UUID.randomUUID().toString())
                .type("Buy")

                //  instruments must already exist in LUSID and have a valid LUSID instrument id
                .instrumentUid(this.instrumentIds.get(0))
                .totalConsideration(new CurrencyAndAmount().currency("GBP").amount(1230.0))
                .transactionDate(effectiveDate)
                .settlementDate(effectiveDate)
                .units(100.0)
                .transactionPrice(new TransactionPrice().price(12.3))
                .source(TransactionRequest.SourceEnum.CLIENT);

        //  add the trade
        this.transactionPortfoliosApi.upsertTransactions(scope, portfolioId, new ArrayList<>(Arrays.asList(transaction)));

        //  get the trade
        VersionedResourceListOfTransaction transactions = this.transactionPortfoliosApi.getTransactions(scope,
                portfolioId, null, null, null, null, null, null, null, null);

        assertEquals(1, transactions.getValues().size());
        assertEquals(transaction.getTransactionId(), transactions.getValues().get(0).getTransactionId());
    }
    
    @Test
    public void load_cash_transaction() throws ApiException {
        String uuid = UUID.randomUUID().toString();
        String scope = "finbourne";
        OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        //  portfolio request
        String originalPortfolioId = String.format("Id-%s", uuid);
        CreateTransactionPortfolioRequest request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(originalPortfolioId)
                .baseCurrency("GBP")
                .created(effectiveDate);

        //  create portfolio
        Portfolio portfolio = this.transactionPortfoliosApi.createPortfolio(scope, request);

        assertEquals(portfolio.getId().getCode(), originalPortfolioId);

        String portfolioId = portfolio.getId().getCode();

        //  create the transaction
        TransactionRequest transaction = new TransactionRequest()
                .transactionId(UUID.randomUUID().toString())
                .type("FundsIn")

                //  Cash instruments are identified using CCY_ followed by the ISO currency codes.
                //  Cash instruments do not need to be created before use
                .instrumentUid("CCY_GBP")
                .totalConsideration(new CurrencyAndAmount().currency("GBP").amount(0.0))
                .transactionDate(effectiveDate)
                .settlementDate(effectiveDate)
                .units(1000.0)
                .source(TransactionRequest.SourceEnum.CLIENT);

        //  add the trade
        this.transactionPortfoliosApi.upsertTransactions(scope, portfolioId, new ArrayList<>(Arrays.asList(transaction)));

        //  get the trade
        VersionedResourceListOfTransaction transactions = this.transactionPortfoliosApi.getTransactions(scope,
                portfolioId, null, null, null, null, null, null, null, null);

        assertEquals(1, transactions.getValues().size());
        assertEquals(transaction.getTransactionId(), transactions.getValues().get(0).getTransactionId());
    }

    @Test
    public void load_otc_instrument_transaction() throws ApiException
    {
        String uuid = UUID.randomUUID().toString();
        String scope = "finbourne";
        OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        //  portfolio request
        String originalPortfolioId = String.format("Id-%s", uuid);
        CreateTransactionPortfolioRequest request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(originalPortfolioId)
                .baseCurrency("GBP")
                .created(effectiveDate);

        //  create portfolio
        Portfolio portfolio = this.transactionPortfoliosApi.createPortfolio(scope, request);

        assertEquals(portfolio.getId().getCode(), originalPortfolioId);

        String portfolioId = portfolio.getId().getCode();

        //  swap definition, this is uploaded in a client custom format
        UpsertInstrumentRequest   swapDefinition = new UpsertInstrumentRequest()
                .name("10mm 5Y Fixed")
                .identifiers(Map.of("ClientInternal", "SW-1"))
                .definition(
                        new InstrumentEconomicDefinition()
                                .instrumentFormat("CustomFormat")
                                .content("<customFormat>upload in custom xml or JSON format</customFormat>")
                );

        //  create the swap
        UpsertInstrumentsResponse instrumentsResponse = this.instrumentsApi.upsertInstruments(
                Map.of("request", swapDefinition)
        );

        String swapId = instrumentsResponse
                .getValues()
                .values()
                .stream()
                .map(inst -> inst.getLusidInstrumentId())
                .collect(Collectors.toList())
                .get(0);

        //  create the transaction
        TransactionRequest transactionRequest = new TransactionRequest()
                .transactionId(UUID.randomUUID().toString())
                .type("Buy")
                .instrumentUid(swapId)
                .totalConsideration(new CurrencyAndAmount().currency("GBP").amount(0.0))
                .transactionDate(effectiveDate)
                .settlementDate(effectiveDate)
                .units(1.0)
                .source(TransactionRequest.SourceEnum.CLIENT);

        //  add the trade
        this.transactionPortfoliosApi.upsertTransactions(scope, portfolioId, new ArrayList<>(Arrays.asList(transactionRequest)));

        //  get the trade
        VersionedResourceListOfTransaction transactions = this.transactionPortfoliosApi.getTransactions(scope,
                portfolioId, null, null, null, null, null, null, null, null);

        assertEquals(1, transactions.getValues().size());

        Transaction swapTransaction = transactions.getValues().get(0);

        assertEquals(transactionRequest.getTransactionId(), swapTransaction.getTransactionId());
        assertEquals(swapId, swapTransaction.getInstrumentUid());
    }
}
