package com.finbourne.lusid.tutorials.ibor;

import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.api.*;
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.utilities.ApiClientBuilder;
import com.finbourne.lusid.utilities.CredentialsSource;
import com.finbourne.lusid.utilities.InstrumentLoader;
import com.finbourne.lusid.utilities.TestDataUtilities;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;

import static com.finbourne.lusid.utilities.TestDataUtilities.LUSID_INSTRUMENT_IDENTIFIER;
import static com.finbourne.lusid.utilities.TestDataUtilities.TutorialScope;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Portfolios {

    private static List<String> instrumentIds;

    private static TransactionPortfoliosApi    transactionPortfoliosApi;
    private static PropertyDefinitionsApi   propertyDefinitionsApi;
    private static ScopesApi    scopesApi;
    private static PortfoliosApi    portfoliosApi;
    private static TestDataUtilities testDataUtilities;

    @BeforeClass
    public static void setUp() throws Exception {
        ApiClient apiClient = new ApiClientBuilder(CredentialsSource.credentialsFile).build();

        transactionPortfoliosApi = new TransactionPortfoliosApi(apiClient);
        scopesApi = new ScopesApi(apiClient);
        portfoliosApi = new PortfoliosApi(apiClient);
        propertyDefinitionsApi = new PropertyDefinitionsApi(apiClient);

        InstrumentsApi instrumentsApi = new InstrumentsApi(apiClient);
        InstrumentLoader instrumentLoader = new InstrumentLoader(instrumentsApi);
        instrumentIds = instrumentLoader.loadInstruments();

        testDataUtilities = new TestDataUtilities(transactionPortfoliosApi);
    }

    @Test
    public void create_transaction_portfolio() throws ApiException {

        String uuid = UUID.randomUUID().toString();

        //    Details of the new portfolio to be created, created here with the minimum set of mandatory fields
        CreateTransactionPortfolioRequest request = new CreateTransactionPortfolioRequest()

                //    Unique portfolio code, portfolio codes must be unique across scopes
                .code(String.format("Id-%s", uuid))

                //    Descriptive name for the portfolio
                .displayName(String.format("Portfolio-%s", uuid))
                .baseCurrency("GBP");

        //    Create the portfolio in LUSID in the specified scope
        Portfolio portfolio = transactionPortfoliosApi.createPortfolio(TutorialScope, request);

        //    Confirm that the portfolio was successfully created.  Any failures will result in
        //    a ApiException being thrown which contain the relevant response code and error message
        assertEquals(request.getCode(), portfolio.getId().getCode());
    }

    @Test
    public void create_transaction_portfolio_with_property() throws Exception {

        String uuid = UUID.randomUUID().toString();
        String propertyName = String.format("fund-style-%s", uuid);
        OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        //  Details of the property to be created
        CreatePropertyDefinitionRequest propertyDefinition = new CreatePropertyDefinitionRequest()

                //  The domain the property is to be applied to
                .domain(CreatePropertyDefinitionRequest.DomainEnum.PORTFOLIO)

                //  The scope the property will be created in
                .scope(TutorialScope)

                //  When the property value is set it will be valid forever and cannot be changed.
                //  Properties whose values can change over time should be created with LifeTimeEnum.TIMEVARIANT
                .lifeTime(CreatePropertyDefinitionRequest.LifeTimeEnum.PERPETUAL)

                .code(propertyName)
                .valueRequired(false)
                .displayName("Fund Style")
                .dataTypeId(new ResourceId().scope("system").code("string"));

        //  Create property definition
        PropertyDefinition    propertyDefinitionDto = propertyDefinitionsApi.createPropertyDefinition(propertyDefinition);

        //  Create the property value
        PropertyValue property = new PropertyValue().labelValue("Active");

        //  Details of the portfolio to be created
        CreateTransactionPortfolioRequest  request = new CreateTransactionPortfolioRequest()
                .displayName(String.format("Portfolio-%s", uuid))
                .code(String.format("Id-%s", uuid))
                .baseCurrency("GBP")
                .created(effectiveDate)

                //  Set the property value when creating the portfolio
                .properties(new HashMap<String, PropertyValue>() {
                    { put(propertyDefinitionDto.getKey(), property); }
                });

        //  create portfolio
        Portfolio  portfolio = transactionPortfoliosApi.createPortfolio(TutorialScope, request);

        assertEquals(request.getCode(), portfolio.getId().getCode());

        PortfolioProperties portfolioProperties = portfoliosApi.getPortfolioProperties(TutorialScope, portfolio.getId().getCode(), null, null, null, null, null);

        assertEquals(1, portfolioProperties.getProperties().size());
        assertEquals(property.getLabelValue(), portfolioProperties.getProperties().get(propertyDefinitionDto.getKey()).getValue());
    }

    @Test
    public void add_transactions_to_portfolio() throws ApiException{

        //    Effective date of the portfolio, this is the date the portfolio was created and became live.  All dates/times
        //    must be supplied in UTC
        OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

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
                .transactionDate(effectiveDate.toString())
                .settlementDate(effectiveDate.toString())
                .units(100.0)
                .transactionPrice(new TransactionPrice().price(12.3))
                .source("Broker");

        //    Add the transaction to the portfolio
        transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioId, new ArrayList<>(Arrays.asList(transaction)));

        //    Retrieve the transaction
        VersionedResourceListOfTransaction transactions = transactionPortfoliosApi.getTransactions(TutorialScope,
                portfolioId, null, null, null, null, null);

        assertEquals(1, transactions.getValues().size());
        assertEquals(transaction.getTransactionId(), transactions.getValues().get(0).getTransactionId());
    }

    @Test
    public void add_transactions_to_portfolio_with_property() throws ApiException{

        String uuid = UUID.randomUUID().toString();
        String propertyName = String.format("traderId-%s", uuid);
        String propertyValue = "A Trader";
        OffsetDateTime effectiveDate = OffsetDateTime.of(2018, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        //  Details of the property to be created
        CreatePropertyDefinitionRequest    propertyDefinition = new CreatePropertyDefinitionRequest()

                //  The domain the property is to be applied to
                .domain(CreatePropertyDefinitionRequest.DomainEnum.TRADE)

                //  The scope the property will be created in
                .scope(TutorialScope)

                //  When the property value is set it will be valid forever and cannot be changed.
                //  Properties whose values can change over time should be created with LifeTimeEnum.TIMEVARIANT
                .lifeTime(CreatePropertyDefinitionRequest.LifeTimeEnum.PERPETUAL)

                .code(propertyName)
                .valueRequired(false)
                .displayName("Trader Id")
                .dataTypeId(new ResourceId().scope("system").code("string"));

        //  Create the property definition
        PropertyDefinition propertyDefinitionDto = propertyDefinitionsApi.createPropertyDefinition(propertyDefinition);

        String portfolioId = testDataUtilities.createTransactionPortfolio(TutorialScope);

        //  Create the property value
        PerpetualPropertyValue property = new PerpetualPropertyValue().labelValue(propertyValue);

        Map<String, PerpetualPropertyValue> properties = new HashMap<>();
        properties.put(propertyDefinitionDto.getKey(), property);

        //  Details of the transaction to be added
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
                .transactionDate(effectiveDate.toString())
                .settlementDate(effectiveDate.toString())
                .units(100.0)
                .transactionPrice(new TransactionPrice().price(12.3))
                .source("Custodian")
                .properties(properties);

        //  Add the transaction
        transactionPortfoliosApi.upsertTransactions(TutorialScope, portfolioId, new ArrayList<>(Arrays.asList(transaction)));

        //  get the trade
        VersionedResourceListOfTransaction transactions = transactionPortfoliosApi.getTransactions(TutorialScope,
                portfolioId, null, null, null, null, null);

        assertEquals(1, transactions.getValues().size());
        assertEquals(transaction.getTransactionId(), transactions.getValues().get(0).getTransactionId());
        assertEquals(propertyValue, transactions.getValues().get(0).getProperties().get(0).getValue());
    }

    @Test
    public void list_scopes() throws ApiException {

        //    Get the list of scopes across all entities
        ResourceListOfScopeDefinition    scopes = scopesApi.listScopes(null, null, null, null, null);

        assertThat(scopes.getValues().size(), is(greaterThan(0)));
    }

    @Test
    public void list_portfolios() throws ApiException {

        //    This defines the scope that the portfolios will be retrieved from
        String scope = TutorialScope + "-" + UUID.randomUUID().toString();

        for (int i = 0; i < 10; i++) {
            testDataUtilities.createTransactionPortfolio(scope);
        }

        //    Retrieve the list of portfolios from a given scope
        ResourceListOfPortfolio portfolios = portfoliosApi.listPortfoliosForScope(scope, null, null, null, null, null, null, null);

        assertThat(portfolios.getValues().size(), is(equalTo(10)));
    }
}
