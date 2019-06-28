package com.finbourne.lusid.tutorials.ibor;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.utilities.ApiClientBuilder;
import com.finbourne.lusid.utilities.InstrumentLoader;
import com.finbourne.lusid.utilities.TestDataUtilities;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;

import static com.finbourne.lusid.utilities.TestDataUtilities.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Holdings {

    private static TestDataUtilities testDataUtilities;

    private static TransactionPortfoliosApi transactionPortfoliosApi;
    private static List<String> instrumentIds;

    @BeforeClass
    public static void setUp() throws Exception {

        ApiClient apiClient = new ApiClientBuilder("secrets.json").build();
        transactionPortfoliosApi = new TransactionPortfoliosApi(apiClient);

        testDataUtilities = new TestDataUtilities(transactionPortfoliosApi);

        //  ensure instruments are created and exist in LUSID
        InstrumentsApi instrumentsApi = new InstrumentsApi(apiClient);
        InstrumentLoader instrumentLoader = new InstrumentLoader(instrumentsApi);
        instrumentIds = instrumentLoader.loadInstruments();
        instrumentIds.sort(Comparator.naturalOrder());
    }

    @Test
    public void get_holdings() throws ApiException {

        final String    currency = "GBP";

        OffsetDateTime  day1 =  OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        OffsetDateTime  dayTPlus5 =  OffsetDateTime.of(2018, 1, 5, 0, 0, 0, 0, ZoneOffset.UTC);
        OffsetDateTime  datTPlus10 =  OffsetDateTime.of(2018, 1, 10, 0, 0, 0, 0, ZoneOffset.UTC);

        String portfolioCode = testDataUtilities.createTransactionPortfolio(TutorialScope);

        List<TransactionRequest>    requests = new ArrayList<>();

        //  add starting cash
        requests.add(testDataUtilities.buildCashFundsInTransactionRequest(100000.0, currency, day1));

        //  add initial transactions
        requests.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(0), 100.0, 101.0, currency, day1, "Buy"));
        requests.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(1), 100.0, 102.0, currency, day1, "Buy"));
        requests.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(2), 100.0, 103.0, currency, day1, "Buy"));

        //  on T+5, add a transaction in instrument 3 and increasing the amount of instrument 1
        requests.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(1), 100.0, 104.0, currency, dayTPlus5, "Buy"));
        requests.add(testDataUtilities.buildTransactionRequest(instrumentIds.get(3), 100.0, 105.0, currency, dayTPlus5, "Buy"));

        //  upload the transactions to LUSID
        transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioCode, requests);

        //  get the holds on T+10
        VersionedResourceListOfPortfolioHolding holdings = transactionPortfoliosApi.getHoldings(TutorialScope, portfolioCode, false, datTPlus10.toString(),
                null, null, null);

        holdings.getValues().sort(Comparator.comparing(PortfolioHolding::getInstrumentUid));

        assertThat(holdings.getValues().size(), is(equalTo(5)));

        //  cash balance
        assertThat(holdings.getValues().get(0).getInstrumentUid(), is(equalTo("CCY_" + currency)));
        assertThat(holdings.getValues().get(0).getHoldingType(), is(equalTo("B")));    //  B = balance
        assertThat(holdings.getValues().get(0).getUnits(), is(equalTo(48500.0)));

        //  instrument holdings, holding type 'P' represents a position
        assertThat(holdings.getValues().get(1).getInstrumentUid(), is(equalTo(instrumentIds.get(0))));
        assertThat(holdings.getValues().get(1).getHoldingType(), is(equalTo("P")));
        assertThat(holdings.getValues().get(1).getUnits(), is(equalTo(100.0)));
        assertThat(holdings.getValues().get(1).getCost().getAmount(), is(equalTo(10100.0)));

        assertThat(holdings.getValues().get(2).getInstrumentUid(), is(equalTo(instrumentIds.get(1))));
        assertThat(holdings.getValues().get(2).getHoldingType(), is(equalTo("P")));
        assertThat(holdings.getValues().get(2).getUnits(), is(equalTo(200.0)));   //  2 transactions
        assertThat(holdings.getValues().get(2).getCost().getAmount(), is(equalTo(20600.0)));

        assertThat(holdings.getValues().get(3).getInstrumentUid(), is(equalTo(instrumentIds.get(2))));
        assertThat(holdings.getValues().get(3).getHoldingType(), is(equalTo("P")));
        assertThat(holdings.getValues().get(3).getUnits(), is(equalTo(100.0)));
        assertThat(holdings.getValues().get(3).getCost().getAmount(), is(equalTo(10300.0)));

        assertThat(holdings.getValues().get(4).getInstrumentUid(), is(equalTo(instrumentIds.get(3))));
        assertThat(holdings.getValues().get(4).getHoldingType(), is(equalTo("P")));
        assertThat(holdings.getValues().get(4).getUnits(), is(equalTo(100.0)));
        assertThat(holdings.getValues().get(4).getCost().getAmount(), is(equalTo(10500.0)));

    }

    @Test
    public void set_target_holdings() throws ApiException {

        final String    currency = "GBP";

        OffsetDateTime  day1 =  OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        OffsetDateTime  day2 =  OffsetDateTime.of(2018, 1, 5, 0, 0, 0, 0, ZoneOffset.UTC);

        String portfolioCode = testDataUtilities.createTransactionPortfolio(TutorialScope);

        String instrument1 = instrumentIds.get(0);
        String instrument2 = instrumentIds.get(1);
        String instrument3 = instrumentIds.get(2);

        List<AdjustHoldingRequest> holdingAdjustments = new ArrayList<>();

        //  cash balance
        holdingAdjustments.add(
                new AdjustHoldingRequest()
                    .instrumentIdentifiers(new HashMap<String, String>() {{ put(LUSID_CASH_IDENTIFIER, currency); }})
                    .taxLots(Arrays.asList(
                            new TargetTaxLotRequest()
                            .units(100000.0)))

        );

        //  instrument 1
        holdingAdjustments.add(
                new AdjustHoldingRequest()
                    .instrumentIdentifiers(new HashMap<String, String>() {{ put(LUSID_INSTRUMENT_IDENTIFIER, instrument1); }})
                    .taxLots(Arrays.asList(
                            new TargetTaxLotRequest()
                                    .units(100.0)
                                    .price(101.0)
                                    .cost(new CurrencyAndAmount().currency(currency).amount(10100.0))
                                    .portfolioCost(10100.0)
                                    .purchaseDate(day1)
                                    .settlementDate(day1)))
        );

        //  instrument 2
        holdingAdjustments.add(
                new AdjustHoldingRequest()
                        .instrumentIdentifiers(new HashMap<String, String>() {{ put(LUSID_INSTRUMENT_IDENTIFIER, instrument2); }})
                        .taxLots(Arrays.asList(
                                new TargetTaxLotRequest()
                                        .units(100.0)
                                        .price(102.0)
                                        .cost(new CurrencyAndAmount().currency(currency).amount(10200.0))
                                        .portfolioCost(10200.0)
                                        .purchaseDate(day1)
                                        .settlementDate(day1)))
        );

        //  set the initial holdings on day 1
        transactionPortfoliosApi.setHoldings(TutorialScope, portfolioCode, day1.toString(), holdingAdjustments);

        //  add subsequent transactions on day 2
        List<TransactionRequest>    requests = Arrays.asList(
                testDataUtilities.buildTransactionRequest(instrument1, 100.0, 104.0, currency, day2, "Buy"),
                testDataUtilities.buildTransactionRequest(instrument3, 100.0, 103.0, currency, day2, "Buy")
        );
        transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioCode, requests);

        //  get the holdings for day 2
        VersionedResourceListOfPortfolioHolding holdings = transactionPortfoliosApi.getHoldings(TutorialScope, portfolioCode, false, day2.toString(),
                null, null, null);

        holdings.getValues().sort(Comparator.comparing(PortfolioHolding::getInstrumentUid));

        //  cash balance + 3 holdings
        assertThat(holdings.getValues().size(), is(equalTo(4)));

        //  remaining cash balance which takes into account the purchase transactions on day 2

        // the call to GetHoldings returns the LUID not the identifier we created
        final String currencyLuid = "CCY_" + currency;

        assertThat(holdings.getValues().get(0).getInstrumentUid(), is(equalTo(currencyLuid)));
        assertThat(holdings.getValues().get(0).getUnits(), is(equalTo(79300.0)));

        //  instrument1 - initial holding + transaction on day 2
        assertThat(holdings.getValues().get(1).getInstrumentUid(), is(equalTo(instrument1)));
        assertThat(holdings.getValues().get(1).getUnits(), is(equalTo(200.0)));
        assertThat(holdings.getValues().get(1).getCost().getAmount(), is(equalTo(20500.0)));

        //  instrument2 - initial holding
        assertThat(holdings.getValues().get(2).getInstrumentUid(), is(equalTo(instrument2)));
        assertThat(holdings.getValues().get(2).getUnits(), is(equalTo(100.0)));
        assertThat(holdings.getValues().get(2).getCost().getAmount(), is(equalTo(10200.0)));

        //  instrument3 - transaction on day 2
        assertThat(holdings.getValues().get(3).getInstrumentUid(), is(equalTo(instrument3)));
        assertThat(holdings.getValues().get(3).getUnits(), is(equalTo(100.0)));
        assertThat(holdings.getValues().get(3).getCost().getAmount(), is(equalTo(10300.0)));
    }

}