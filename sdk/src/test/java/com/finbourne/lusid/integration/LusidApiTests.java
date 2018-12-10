package com.finbourne.lusid.integration;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.api.PropertyDefinitionsApi;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.*;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

import static org.junit.Assert.*;

public class LusidApiTests {

    private List<String> instrumentIds;

    private PortfoliosApi portfoliosApi;
    private TransactionPortfoliosApi transactionPortfoliosApi;
    private InstrumentsApi instrumentsApi;
    private PropertyDefinitionsApi propertyDefinitionsApi;

    @Before
    public void setUp() throws Exception {

        File configJson = new TestConfigurationLoader().loadConfiguration("secrets.json");
        ApiClient   apiClient = new ApiClientBuilder(configJson).build();

        this.portfoliosApi = new PortfoliosApi(apiClient);
        this.transactionPortfoliosApi = new TransactionPortfoliosApi(apiClient);
        this.instrumentsApi = new InstrumentsApi(apiClient);
        this.propertyDefinitionsApi = new PropertyDefinitionsApi(apiClient);

        this.instrumentIds = new InstrumentLoader().loadInstruments();
    }

    @Test
    public void create_portfolio() throws ApiException {

        final String scope = "finbourne";
        final String uuid = UUID.randomUUID().toString();

        final CreateTransactionPortfolioRequest  request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(String.format("Id-%s", uuid))
                .baseCurrency("GBP");

        final Portfolio portfolio = this.transactionPortfoliosApi.createPortfolio(scope, request);

        assertEquals(request.getCode(), portfolio.getId().getCode());
    }

    @Test
    public void create_portfolio_with_property() throws Exception {

        final String uuid = UUID.randomUUID().toString();
        final String scope = "finbourne";
        final String propertyName = String.format("und-style-%s", uuid);

        final CreatePropertyDefinitionRequest propertyDefinition = new CreatePropertyDefinitionRequest()
                .domain(CreatePropertyDefinitionRequest.DomainEnum.PORTFOLIO)
                .scope(scope)
                .code(propertyName)
                .valueRequired(false)
                .displayName("Fund Style")
                .lifeTime(CreatePropertyDefinitionRequest.LifeTimeEnum.PERPETUAL)
                .dataTypeId(new ResourceId().scope("default").code("string"));;

        //  create property definition
        final PropertyDefinition    propertyDefinitionDto = this.propertyDefinitionsApi.createPropertyDefinition(propertyDefinition);

        final OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        final CreateTransactionPortfolioRequest  request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(String.format("Id-%s", uuid))
                .baseCurrency("GBP")
                .created(effectiveDate);

        //  create portfolio
        final Portfolio  portfolio = this.transactionPortfoliosApi.createPortfolio(scope, request);

        assertEquals(request.getCode(), portfolio.getId().getCode());

        final String propertyValue = "Active";
        final PropertyValue property = new PropertyValue().labelValue(propertyValue);
        final Map<String, PropertyValue> properties = new HashMap<>();
        properties.put(propertyDefinitionDto.getKey(), property);

        //  add the property
        final PortfolioProperties  propertiesResult = this.portfoliosApi.upsertPortfolioProperties(scope, portfolio.getId().getCode(), properties, effectiveDate);

        assertEquals(request.getCode(), propertiesResult.getOriginPortfolioId().getCode());
        assertEquals(propertyValue, propertiesResult.getProperties().get(0).getValue());
    }

    @Test
    public void create_trade_with_property() throws ApiException{

        final String uuid = UUID.randomUUID().toString();
        final String scope = "finbourne";
        final String propertyName = String.format("traderId-%s", uuid);
        final String propertyValue = "A Trader";
        final OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        final CreatePropertyDefinitionRequest    propertyDefinition = new CreatePropertyDefinitionRequest()
                .domain(CreatePropertyDefinitionRequest.DomainEnum.TRADE)
                .scope(scope)
                .code(propertyName)
                .valueRequired(false)
                .displayName("Trader Id")
                .lifeTime(CreatePropertyDefinitionRequest.LifeTimeEnum.PERPETUAL)
                .dataTypeId(new ResourceId().scope("default").code("string"));

        //  create property definition
        final PropertyDefinition propertyDefinitionDto = this.propertyDefinitionsApi.createPropertyDefinition(propertyDefinition);

        final String originalPortfolioId = String.format("Id-%s", uuid);
        final CreateTransactionPortfolioRequest request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(originalPortfolioId)
                .baseCurrency("GBP")
                .created(effectiveDate);

        //  create portfolio
        final Portfolio portfolio = this.transactionPortfoliosApi.createPortfolio(scope, request);

        assertEquals(portfolio.getId().getCode(), originalPortfolioId);

        String portfolioId = portfolio.getId().getCode();

        //  create the property
        PerpetualPropertyValue property = new PerpetualPropertyValue().labelValue(propertyValue);

        final Map<String, PerpetualPropertyValue> properties = new HashMap<>();
        properties.put(propertyDefinitionDto.getKey(), property);

        //  create the trade
        TransactionRequest transaction = new TransactionRequest()
                .transactionId(UUID.randomUUID().toString())
                .type("Buy")
                .instrumentUid(this.instrumentIds.get(0))
                .totalConsideration(new CurrencyAndAmount().currency("GBP").amount(1230.0))
                .transactionDate(effectiveDate)
                .settlementDate(effectiveDate)
                .units(100.0)
                .transactionPrice(new TransactionPrice().price(12.3))
                .source(TransactionRequest.SourceEnum.CLIENT)
                .properties(properties);

        //  add the trade
        this.transactionPortfoliosApi.upsertTransactions(scope, portfolioId, new ArrayList<>(Arrays.asList(transaction)));

        //  get the trade
        final VersionedResourceListOfTransaction transactions = this.transactionPortfoliosApi.getTransactions(scope,
                portfolioId, null, null, null, null, null, null, null, null);

        assertEquals(1, transactions.getValues().size());
        assertEquals(transaction.getTransactionId(), transactions.getValues().get(0).getTransactionId());
        assertEquals(propertyValue, transactions.getValues().get(0).getProperties().get(0).getValue());
    }

    @Test
    public void apply_bitemporal_portfolio_change() throws Exception
    {
        final String scope = "finbourne";
        final String uuid = UUID.randomUUID().toString();
        final OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        final CreateTransactionPortfolioRequest  request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(String.format("Id-%s", uuid))
                .baseCurrency("GBP")
                .created(effectiveDate);

        final Portfolio  portfolio = transactionPortfoliosApi.createPortfolio(scope, request);

        final String portfolioId = portfolio.getId().getCode();
        assertNotNull(portfolioId);

        class TransactionSpec
        {
            private String id;
            private Double price;
            private OffsetDateTime tradeDate;

            TransactionSpec(String id, Double price, OffsetDateTime tradeDate) {
                this.id = id;
                this.price = price;
                this.tradeDate = tradeDate;
            }

            public String getId() {
                return id;
            }

            public Double getPrice() {
                return price;
            }

            public OffsetDateTime getTradeDate() {
                return tradeDate;
            }
        }

        Function<TransactionSpec, TransactionRequest> buildTransaction = t -> new TransactionRequest()
                .transactionId(UUID.randomUUID().toString())
                .type("Buy")
                .instrumentUid(t.getId())
                .transactionDate(t.getTradeDate())
                .settlementDate(t.getTradeDate())
                .units(100.0)
                .transactionPrice(new TransactionPrice().price(t.getPrice()))
                .totalConsideration(new CurrencyAndAmount().amount(100.0 * t.getPrice()).currency("GBP"))
                .source(TransactionRequest.SourceEnum.CLIENT);

        Consumer<List<Transaction>> printTransactions = transactions -> transactions.forEach(t ->
                System.out.println(
                        String.format("%s\t%s\t%f\t%f\t%f",
                                t.getInstrumentUid(),
                                t.getTransactionDate(),
                                t.getUnits(),
                                t.getTransactionPrice().getPrice(),
                                t.getTotalConsideration().getAmount())));

        final List<TransactionSpec> transactionSpecs = new ArrayList<>(Arrays.asList(
                new TransactionSpec(this.instrumentIds.get(0), 101.0, OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC)),
                new TransactionSpec(this.instrumentIds.get(1), 102.0, OffsetDateTime.of(2018, 1, 2, 0, 0, 0, 0, ZoneOffset.UTC)),
                new TransactionSpec(this.instrumentIds.get(2), 103.0, OffsetDateTime.of(2018, 1, 3, 0, 0, 0, 0, ZoneOffset.UTC))
        ));

        //  build list of transactions
        final TransactionRequest[] newTransactions = transactionSpecs.stream()
                .sorted(Comparator.comparing(ts -> ts.id))
                .map(buildTransaction)
                .toArray(TransactionRequest[]::new);

        //  add initial batch of transactions
        final UpsertPortfolioTransactionsResponse  initialResult = this.transactionPortfoliosApi.upsertTransactions(scope, portfolioId, Arrays.asList(newTransactions));

        /*

        The LUSID API operates at microsecond resolution for dates/times but
        Joda-Time only works at millisecond.  This means that OffsetDateTime can get rounded
        down and be out of sync with LUSID.  To workaround we add an extra millisecond
        with the trade off that if 2 or more events happen within 1ms we may not get the
        expected behaviour

         */
        OffsetDateTime    asAtBatch1 = initialResult.getVersion().getAsAtDate();
        Thread.sleep(500);

        //  add another trade for 2018-1-8
        TransactionSpec newTrade = new TransactionSpec(this.instrumentIds.get(3), 104.0, OffsetDateTime.of(2018, 1, 8, 0, 0, 0, 0, ZoneOffset.UTC));
        UpsertPortfolioTransactionsResponse addedResult = this.transactionPortfoliosApi.upsertTransactions(scope, portfolioId, Arrays.asList(buildTransaction.apply(newTrade)));

        OffsetDateTime    asAtBatch2 = addedResult.getVersion().getAsAtDate();
        Thread.sleep(500);

        //  add back-dated trade
        TransactionSpec backDatedTrade = new TransactionSpec(this.instrumentIds.get(4), 105.0, OffsetDateTime.of(2018, 1, 5, 0, 0, 0, 0, ZoneOffset.UTC));
        UpsertPortfolioTransactionsResponse backDatedResult = this.transactionPortfoliosApi.upsertTransactions(scope, portfolioId, Arrays.asList(buildTransaction.apply(backDatedTrade)));

        OffsetDateTime    asAtBatch3 = backDatedResult.getVersion().getAsAtDate();
        Thread.sleep(500);

        //  list transactions
        VersionedResourceListOfTransaction transactions = this.transactionPortfoliosApi.getTransactions(scope, portfolioId, null, null, asAtBatch1, null, 0, Integer.MAX_VALUE, null, null);


        assertEquals(String.format("asAt %s", asAtBatch1),3, transactions.getValues().size());
        System.out.println("transactions at " + asAtBatch1);
        printTransactions.accept(transactions.getValues());

        transactions = this.transactionPortfoliosApi.getTransactions(scope, portfolioId, null, null, asAtBatch2, null, 0, Integer.MAX_VALUE, null, null);

        assertEquals(String.format("asAt %s", asAtBatch2),4, transactions.getValues().size());
        System.out.println("transactions at " + asAtBatch2);
        printTransactions.accept(transactions.getValues());

        transactions = this.transactionPortfoliosApi.getTransactions(scope, portfolioId, null, null, asAtBatch3, null, 0, Integer.MAX_VALUE, null, null);

        assertEquals(String.format("asAt %s", asAtBatch3), 5, transactions.getValues().size());
        System.out.println("transactions at " + asAtBatch3);
        printTransactions.accept(transactions.getValues());

        //  latest transactions
        transactions = this.transactionPortfoliosApi.getTransactions(scope, portfolioId, null, null, null, null, 0, Integer.MAX_VALUE, null, null);

        assertEquals(5, transactions.getValues().size());
        System.out.println("transactions at " + OffsetDateTime.now());
        printTransactions.accept(transactions.getValues());
    }

    @Test
    public void find_instruments() throws ApiException {
        final Property isin1 = new Property();
        isin1.setKey("Instrument/default/Isin");
        isin1.setValue("IT0004966401");

        final Property isin2 = new Property();
        isin2.setKey("Instrument/default/Isin");
        isin2.setValue("FR0010192997");

        //  lookup instruments
        final ResourceListOfInstrument fbnIds = this.instrumentsApi.findInstruments(
                List.of(isin1, isin2), null, null, null
        );

        assertTrue(fbnIds.getValues().size() > 0);
    }
}
