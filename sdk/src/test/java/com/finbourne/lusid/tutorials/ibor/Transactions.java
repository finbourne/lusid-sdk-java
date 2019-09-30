package com.finbourne.lusid.tutorials.ibor;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.InstrumentsApi;
import com.finbourne.lusid.api.SystemConfigurationApi;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.utilities.ApiClientBuilder;
import com.finbourne.lusid.utilities.CredentialsSource;
import com.finbourne.lusid.utilities.InstrumentLoader;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.stream.Collectors;

import static com.finbourne.lusid.utilities.TestDataUtilities.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

public class Transactions {

    private static InstrumentsApi instrumentsApi;
    private static TransactionPortfoliosApi transactionPortfoliosApi;
    private static List<String> instrumentIds;
    private static SystemConfigurationApi systemConfigurationApi;

    @BeforeClass
    public static void setUp() throws Exception
    {
        ApiClient apiClient = new ApiClientBuilder().build(CredentialsSource.credentialsFile);

        transactionPortfoliosApi = new TransactionPortfoliosApi(apiClient);
        instrumentsApi = new InstrumentsApi(apiClient);

        //  ensure instruments are created and exist in LUSID
        InstrumentLoader instrumentLoader = new InstrumentLoader(instrumentsApi);
        instrumentIds = instrumentLoader.loadInstruments();

        systemConfigurationApi = new SystemConfigurationApi(apiClient);
    }

    @Test
    public void list_set_and_create_transaction_types() throws ApiException
    {
        TransactionSetConfigurationData def = systemConfigurationApi.listConfigurationTransactionTypes();

        //  now create an alternative Buy, and add it to the default configuration
        TransactionConfigurationTypeAlias alias = new TransactionConfigurationTypeAlias();
        alias.type("NewBuy");
        alias.description("Description");
        alias.transactionClass("Class");
        alias.transactionGroup("Group");
        List<TransactionConfigurationTypeAlias> aliases = new LinkedList<TransactionConfigurationTypeAlias>();
        aliases.add(alias);
        TransactionConfigurationMovementDataRequest movement = new TransactionConfigurationMovementDataRequest();
        movement.movementTypes(TransactionConfigurationMovementDataRequest.MovementTypesEnum.COMMITMENT);
        movement.side(TransactionConfigurationMovementDataRequest.SideEnum.SIDE1);
        movement.direction(1);
        List<TransactionConfigurationMovementDataRequest> movements = new LinkedList<TransactionConfigurationMovementDataRequest>();
        movements.add(movement);
        TransactionConfigurationDataRequest newBuy = new TransactionConfigurationDataRequest();
        newBuy.aliases(aliases);
        newBuy.movements(movements);

        systemConfigurationApi.createConfigurationTransactionType(newBuy);

        //    there should be one more entry in the updated configuration
        TransactionSetConfigurationData updated = systemConfigurationApi.listConfigurationTransactionTypes();
        Assert.assertThat(updated.getTransactionConfigs().size() - def.getTransactionConfigs().size(), is(1));

        //    now let's use our Buy, and replace the default configuration
        //    REALISE THAT THIS IS A DESTRUCTIVE OPERATION -- you can't trivially recover the original defaults
        //    unless you have them stored down -- we'll restore them afterwards
        TransactionSetConfigurationDataRequest request = new TransactionSetConfigurationDataRequest();
        request.addTransactionConfigRequestsItem(newBuy);
        systemConfigurationApi.setConfigurationTransactionTypes(request);

        //  there should be one entry in the updated configuration
        updated = systemConfigurationApi.listConfigurationTransactionTypes();
        Assert.assertThat(updated.getTransactionConfigs().size(), is(1));

        //  finally, let's restore the original default configurations
        TransactionSetConfigurationDataRequest defRequest = convertToRequest(def);
        systemConfigurationApi.setConfigurationTransactionTypes(defRequest);

        //  and confirm that the number of transaction configurations is as expected
        updated = systemConfigurationApi.listConfigurationTransactionTypes();
        Assert.assertThat(updated.getTransactionConfigs().size(), is(def.getTransactionConfigs().size()));
    }

    private static TransactionSetConfigurationDataRequest convertToRequest(TransactionSetConfigurationData d)
    {
        return new TransactionSetConfigurationDataRequest()
                .transactionConfigRequests(
                        d.getTransactionConfigs().stream().map(c -> convertToRequest(c)).collect(Collectors.toList()));
    }

    private static TransactionConfigurationDataRequest convertToRequest(TransactionConfigurationData d)
    {
        TransactionConfigurationDataRequest request = new TransactionConfigurationDataRequest();
        request.aliases(d.getAliases());
        request.movements(d.getMovements().stream().map(m -> convertToRequest(m)).collect(Collectors.toList()));
        request.properties(d.getProperties());

        return request;
    }

    private static TransactionConfigurationMovementDataRequest convertToRequest(TransactionConfigurationMovementData d)
    {
        TransactionConfigurationMovementDataRequest request = new TransactionConfigurationMovementDataRequest();
        request.movementTypes(convertToRequest(d.getMovementTypes()));
        request.side(convertToRequest(d.getSide()));
        request.direction(d.getDirection());
        request.properties(d.getProperties());
        request.mappings(d.getMappings().stream().map(m -> convertToRequest(m)).collect(Collectors.toList()));

        return request;
    }

    private static TransactionPropertyMappingRequest convertToRequest(TransactionPropertyMapping d)
    {
         TransactionPropertyMappingRequest request = new TransactionPropertyMappingRequest();
         request.propertyKey(d.getPropertyKey());
         request.mapFrom(d.getMapFrom());
         request.setTo(d.getSetTo());

         return request;
    }

    private static TransactionConfigurationMovementDataRequest.MovementTypesEnum convertToRequest(
            TransactionConfigurationMovementData.MovementTypesEnum original)
    {
        return TransactionConfigurationMovementDataRequest.MovementTypesEnum.fromValue(original.getValue());
    }

    private static TransactionConfigurationMovementDataRequest.SideEnum convertToRequest(
            TransactionConfigurationMovementData.SideEnum original)
    {
        return TransactionConfigurationMovementDataRequest.SideEnum.fromValue(original.toString());
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
