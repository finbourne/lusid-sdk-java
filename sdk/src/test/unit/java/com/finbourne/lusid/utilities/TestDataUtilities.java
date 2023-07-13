package com.finbourne.lusid.utilities;

import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.UUID;

import static junit.framework.TestCase.assertEquals;

public class TestDataUtilities {

    public static String DefaultScope = "default";
    public static String TutorialScope = "Testdemo";
    public static String MarketDataScope = "FinbourneMarketData";

    public static final String LUSID_INSTRUMENT_IDENTIFIER = "Instrument/default/LusidInstrumentId";
    public static final String LUSID_CASH_IDENTIFIER = "Instrument/default/Currency";

    private TransactionPortfoliosApi transactionPortfoliosApi;

    public TestDataUtilities(TransactionPortfoliosApi transactionPortfoliosApi) {
        this.transactionPortfoliosApi = transactionPortfoliosApi;
    }

    /**
     * Calls the LUSID API to create a transaction portfolio
     *
     * @param scope
     * @return Portfolio code of the created portfolio
     * @throws ApiException
     */
    public String createTransactionPortfolio(String scope) throws ApiException {
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
        Portfolio portfolio = this.transactionPortfoliosApi.createPortfolio(scope, request);

        assertEquals(portfolio.getId().getCode(), originalPortfolioId);

        return portfolio.getId().getCode();
    }

    /**
     *
     * Builds a transaction request
     *
     * @param instrumentId
     * @param units
     * @param price
     * @param currency
     * @param tradeDate
     * @param transactionType
     * @return
     */
    public TransactionRequest buildTransactionRequest(
            String instrumentId,
            BigDecimal units,
            BigDecimal price,
            String currency,
            OffsetDateTime tradeDate,
            String transactionType
    )
    {
        return new TransactionRequest()
                .transactionId(UUID.randomUUID().toString())
                .type(transactionType)
                .instrumentIdentifiers(new HashMap<String, String>() {{ put(LUSID_INSTRUMENT_IDENTIFIER, instrumentId); }})
                .totalConsideration(new CurrencyAndAmount().currency(currency).amount(units.multiply(price)))
                .transactionDate(tradeDate.toString())
                .settlementDate(tradeDate.toString())
                .units(units)
                .transactionPrice(new TransactionPrice().price(price))
                .source("Custodian");
    }


    /**
     * Builds a transaction request for cash
     *
     * @param units
     * @param currency
     * @param tradeDate
     * @return
     */
    public TransactionRequest buildCashFundsInTransactionRequest(
            BigDecimal units,
            String currency,
            OffsetDateTime tradeDate
    )
    {
        return new TransactionRequest()
                .transactionId(UUID.randomUUID().toString())
                .type("FundsIn")
                .instrumentIdentifiers(new HashMap<String, String>() {{ put(LUSID_CASH_IDENTIFIER, currency); }})
                .totalConsideration(new CurrencyAndAmount().currency(currency).amount(new BigDecimal(0.0)))
                .transactionDate(tradeDate.toString())
                .settlementDate(tradeDate.toString())
                .units(units)
                .source("Custodian");
    }

}
