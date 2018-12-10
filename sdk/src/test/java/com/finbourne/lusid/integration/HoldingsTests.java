package com.finbourne.lusid.integration;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.*;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HoldingsTests {

    private TestDataUtilities testDataUtilities;

    private TransactionPortfoliosApi transactionPortfoliosApi;
    private List<String> instrumentIds;

    private final String SCOPE = "finbourne";

    @Before
    public void setUp() throws Exception {
        File configJson = new TestConfigurationLoader().loadConfiguration("secrets.json");
        ApiClient apiClient = new ApiClientBuilder(configJson).build();

        this.transactionPortfoliosApi = new TransactionPortfoliosApi(apiClient);

        this.testDataUtilities = new TestDataUtilities(this.transactionPortfoliosApi);

        //  ensure instruments are created and exist in LUSID
        this.instrumentIds = new InstrumentLoader().loadInstruments();
        this.instrumentIds.sort(Comparator.naturalOrder());
    }

    @Test
    public void get_holdings() throws ApiException {

        final String    currency = "GBP";

        OffsetDateTime  day1 =  OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        OffsetDateTime  dayTPlus5 =  OffsetDateTime.of(2018, 1, 5, 0, 0, 0, 0, ZoneOffset.UTC);
        OffsetDateTime  datTPlus10 =  OffsetDateTime.of(2018, 1, 10, 0, 0, 0, 0, ZoneOffset.UTC);

        String portfolioCode = this.testDataUtilities.createTransactionPortfolio(SCOPE);

        List<TransactionRequest>    requests = new ArrayList<>();

        //  add starting cash
        requests.add(testDataUtilities.buildCashFundsInTransactionRequest(100000.0, currency, day1));

        //  add initial transactions
        requests.add(testDataUtilities.buildTransactionRequest(this.instrumentIds.get(0), 100.0, 101.0, currency, day1, "Buy"));
        requests.add(testDataUtilities.buildTransactionRequest(this.instrumentIds.get(1), 100.0, 102.0, currency, day1, "Buy"));
        requests.add(testDataUtilities.buildTransactionRequest(this.instrumentIds.get(2), 100.0, 103.0, currency, day1, "Buy"));

        //  on T+5, add a transaction in instrument 3 and increasing the amount of instrument 1
        requests.add(testDataUtilities.buildTransactionRequest(this.instrumentIds.get(1), 100.0, 104.0, currency, dayTPlus5, "Buy"));
        requests.add(testDataUtilities.buildTransactionRequest(this.instrumentIds.get(3), 100.0, 105.0, currency, dayTPlus5, "Buy"));

        //  upload the transactions to LUSID
        this.transactionPortfoliosApi.upsertTransactions(SCOPE, portfolioCode, requests);

        //  get the holds on T+10
        VersionedResourceListOfPortfolioHolding holdings = this.transactionPortfoliosApi.getHoldings(SCOPE, portfolioCode, false, datTPlus10,
                null, null, null, null, null, null);

        holdings.getValues().sort(Comparator.comparing(PortfolioHolding::getInstrumentUid));

        assertThat(holdings.getCount(), is(equalTo(5)));

        //  cash balance
        assertThat(holdings.getValues().get(0).getInstrumentUid(), is(equalTo("CCY_" + currency)));
        assertThat(holdings.getValues().get(0).getHoldingType(), is(equalTo("B")));    //  B = balance
        assertThat(holdings.getValues().get(0).getUnits(), is(equalTo(48500.0)));

        //  instrument holdings, holding type 'P' represents a position
        assertThat(holdings.getValues().get(1).getInstrumentUid(), is(equalTo(this.instrumentIds.get(0))));
        assertThat(holdings.getValues().get(1).getHoldingType(), is(equalTo("P")));
        assertThat(holdings.getValues().get(1).getUnits(), is(equalTo(100.0)));
        assertThat(holdings.getValues().get(1).getCost().getAmount(), is(equalTo(10100.0)));

        assertThat(holdings.getValues().get(2).getInstrumentUid(), is(equalTo(this.instrumentIds.get(1))));
        assertThat(holdings.getValues().get(2).getHoldingType(), is(equalTo("P")));
        assertThat(holdings.getValues().get(2).getUnits(), is(equalTo(200.0)));   //  2 transactions
        assertThat(holdings.getValues().get(2).getCost().getAmount(), is(equalTo(20600.0)));

        assertThat(holdings.getValues().get(3).getInstrumentUid(), is(equalTo(this.instrumentIds.get(2))));
        assertThat(holdings.getValues().get(3).getHoldingType(), is(equalTo("P")));
        assertThat(holdings.getValues().get(3).getUnits(), is(equalTo(100.0)));
        assertThat(holdings.getValues().get(3).getCost().getAmount(), is(equalTo(10300.0)));

        assertThat(holdings.getValues().get(4).getInstrumentUid(), is(equalTo(this.instrumentIds.get(3))));
        assertThat(holdings.getValues().get(4).getHoldingType(), is(equalTo("P")));
        assertThat(holdings.getValues().get(4).getUnits(), is(equalTo(100.0)));
        assertThat(holdings.getValues().get(4).getCost().getAmount(), is(equalTo(10500.0)));

    }

    @Test
    public void set_target_holdings() throws ApiException {

        final String    currency = "GBP";

        OffsetDateTime  day1 =  OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        OffsetDateTime  day2 =  OffsetDateTime.of(2018, 1, 5, 0, 0, 0, 0, ZoneOffset.UTC);

        String portfolioCode = this.testDataUtilities.createTransactionPortfolio(SCOPE);

        String cashInstrument = "CCY_" + currency;
        String instrument1 = this.instrumentIds.get(0);
        String instrument2 = this.instrumentIds.get(1);
        String instrument3 = this.instrumentIds.get(2);

        List<AdjustHoldingRequest> holdingAdjustments = new ArrayList<>();

        //  cash balance
        holdingAdjustments.add(
                new AdjustHoldingRequest()
                    .instrumentUid(cashInstrument)
                    .taxLots(List.of(
                            new TargetTaxLotRequest()
                            .units(100000.0)))

        );

        //  instrument 1
        holdingAdjustments.add(
                new AdjustHoldingRequest()
                    .instrumentUid(instrument1)
                    .taxLots(List.of(
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
                        .instrumentUid(instrument2)
                        .taxLots(List.of(
                                new TargetTaxLotRequest()
                                        .units(100.0)
                                        .price(102.0)
                                        .cost(new CurrencyAndAmount().currency(currency).amount(10200.0))
                                        .portfolioCost(10200.0)
                                        .purchaseDate(day1)
                                        .settlementDate(day1)))
        );

        //  set the initial holdings on day 1
        this.transactionPortfoliosApi.setHoldings(SCOPE, portfolioCode, day1, holdingAdjustments);

        //  add subsequent transactions on day 2
        List<TransactionRequest>    requests = List.of(
                testDataUtilities.buildTransactionRequest(instrument1, 100.0, 104.0, currency, day2, "Buy"),
                testDataUtilities.buildTransactionRequest(instrument3, 100.0, 103.0, currency, day2, "Buy")
        );
        this.transactionPortfoliosApi.upsertTransactions(SCOPE, portfolioCode, requests);

        //  get the holdings for day 2
        VersionedResourceListOfPortfolioHolding holdings = this.transactionPortfoliosApi.getHoldings(SCOPE, portfolioCode, false, day2,
                null, null, null, null, null, null);

        holdings.getValues().sort(Comparator.comparing(PortfolioHolding::getInstrumentUid));

        //  cash balance + 3 holdings
        assertThat(holdings.getValues().size(), is(equalTo(4)));

        //  remaining cash balance which takes into account the purchase transactions on day 2
        assertThat(holdings.getValues().get(0).getInstrumentUid(), is(equalTo(cashInstrument)));
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