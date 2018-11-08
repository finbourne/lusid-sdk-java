# lusid-sdk

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.finbourne</groupId>
    <artifactId>lusid-sdk</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.finbourne:lusid-sdk:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/lusid-sdk-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.finbourne.lusid.*;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AggregationApi;

import java.io.File;
import java.util.*;

public class AggregationApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        AggregationApi apiInstance = new AggregationApi();
        String scope = "scope_example"; // String | The scope of the portfolio group
        String code = "code_example"; // String | The code of the portfolio group
        AggregationRequest request = new AggregationRequest(); // AggregationRequest | The request specifying the parameters of the aggregation
        List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
        Integer start = 56; // Integer | Optional. When paginating, skip this number of results
        Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
        try {
            ListAggregationResponse result = apiInstance.getAggregationByGroup(scope, code, request, sortBy, start, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AggregationApi#getAggregationByGroup");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AggregationApi* | [**getAggregationByGroup**](docs/AggregationApi.md#getAggregationByGroup) | **POST** /api/portfoliogroups/{scope}/{code}/$aggregate | Aggregate data in a portfolio group
*AggregationApi* | [**getAggregationByPortfolio**](docs/AggregationApi.md#getAggregationByPortfolio) | **POST** /api/portfolios/{scope}/{code}/$aggregate | Aggregate data in a portfolio
*AggregationApi* | [**getAggregationByResultSet**](docs/AggregationApi.md#getAggregationByResultSet) | **POST** /api/results/{scope}/{resultsKey}/$aggregate | Aggregate using result data
*AggregationApi* | [**getNestedAggregationByGroup**](docs/AggregationApi.md#getNestedAggregationByGroup) | **POST** /api/portfoliogroups/{scope}/{code}/$aggregatenested | Aggregate data in a portfolio group, as nested
*AnalyticsStoresApi* | [**createAnalyticStore**](docs/AnalyticsStoresApi.md#createAnalyticStore) | **POST** /api/analytics | Create analytic store
*AnalyticsStoresApi* | [**deleteAnalyticStore**](docs/AnalyticsStoresApi.md#deleteAnalyticStore) | **DELETE** /api/analytics/{scope}/{year}/{month}/{day} | Delete analytic store
*AnalyticsStoresApi* | [**getAnalyticStore**](docs/AnalyticsStoresApi.md#getAnalyticStore) | **GET** /api/analytics/{scope}/{year}/{month}/{day} | Get analytic store
*AnalyticsStoresApi* | [**listAnalyticStores**](docs/AnalyticsStoresApi.md#listAnalyticStores) | **GET** /api/analytics | List analytic stores
*AnalyticsStoresApi* | [**setAnalytics**](docs/AnalyticsStoresApi.md#setAnalytics) | **PUT** /api/analytics/{scope}/{year}/{month}/{day}/prices | Set analytic data
*ApplicationMetadataApi* | [**getExcelAddin**](docs/ApplicationMetadataApi.md#getExcelAddin) | **GET** /api/metadata/downloads/exceladdin | Download Excel Addin
*ApplicationMetadataApi* | [**getExcelDownloadUrl**](docs/ApplicationMetadataApi.md#getExcelDownloadUrl) | **GET** /api/metadata/downloads/excel | Get Excel download url
*ApplicationMetadataApi* | [**getLusidVersions**](docs/ApplicationMetadataApi.md#getLusidVersions) | **GET** /api/metadata/versions | Get LUSID versions
*CorporateActionsApi* | [**batchUpsertCorporateActions**](docs/CorporateActionsApi.md#batchUpsertCorporateActions) | **POST** /api/corporateactions/{scope}/{code} | Upsert corporate actions
*CorporateActionsApi* | [**getCorporateActions**](docs/CorporateActionsApi.md#getCorporateActions) | **GET** /api/corporateactions/{scope}/{code} | Get corporate actions
*DataTypesApi* | [**createDataType**](docs/DataTypesApi.md#createDataType) | **POST** /api/datatypes | Create data type definition
*DataTypesApi* | [**getDataType**](docs/DataTypesApi.md#getDataType) | **GET** /api/datatypes/{scope}/{code} | Get data type definition
*DataTypesApi* | [**getUnitsFromDataType**](docs/DataTypesApi.md#getUnitsFromDataType) | **GET** /api/datatypes/{scope}/{code}/units | Get units from data type
*DataTypesApi* | [**listDataTypes**](docs/DataTypesApi.md#listDataTypes) | **GET** /api/datatypes/{scope} | List data types
*DataTypesApi* | [**updateDataType**](docs/DataTypesApi.md#updateDataType) | **PUT** /api/datatypes/{scope}/{code} | Update data type definition
*DerivedTransactionPortfoliosApi* | [**createDerivedPortfolio**](docs/DerivedTransactionPortfoliosApi.md#createDerivedPortfolio) | **POST** /api/derivedtransactionportfolios/{scope} | Create derived transaction portfolio
*DerivedTransactionPortfoliosApi* | [**deleteDerivedPortfolioDetails**](docs/DerivedTransactionPortfoliosApi.md#deleteDerivedPortfolioDetails) | **DELETE** /api/derivedtransactionportfolios/{scope}/{code}/details | Delete portfolio details
*InstrumentsApi* | [**batchAddClientInstruments**](docs/InstrumentsApi.md#batchAddClientInstruments) | **POST** /api/instruments | Create instrument
*InstrumentsApi* | [**batchDeleteClientInstruments**](docs/InstrumentsApi.md#batchDeleteClientInstruments) | **DELETE** /api/instruments | Delete instrument
*InstrumentsApi* | [**batchUpsertInstrumentProperties**](docs/InstrumentsApi.md#batchUpsertInstrumentProperties) | **POST** /api/instruments/$upsertproperties | Upsert instrument properties
*InstrumentsApi* | [**getInstrument**](docs/InstrumentsApi.md#getInstrument) | **GET** /api/instruments/{uid} | Get instrument definition
*InstrumentsApi* | [**lookupInstrumentsFromCodes**](docs/InstrumentsApi.md#lookupInstrumentsFromCodes) | **POST** /api/instruments/$lookup | Lookup instrument definition
*LoginApi* | [**getSamlIdentityProviderId**](docs/LoginApi.md#getSamlIdentityProviderId) | **GET** /api/login/saml/{domain} | Get SAML Identity Provider
*PersonalisationsApi* | [**deletePersonalisation**](docs/PersonalisationsApi.md#deletePersonalisation) | **DELETE** /api/personalisations | Delete a personalisation
*PersonalisationsApi* | [**getPersonalisations**](docs/PersonalisationsApi.md#getPersonalisations) | **GET** /api/personalisations | Get personalisation
*PersonalisationsApi* | [**upsertPersonalisations**](docs/PersonalisationsApi.md#upsertPersonalisations) | **POST** /api/personalisations | Upsert personalisations
*PortfolioGroupsApi* | [**addPortfolioToGroup**](docs/PortfolioGroupsApi.md#addPortfolioToGroup) | **POST** /api/portfoliogroups/{scope}/{code}/portfolios | Add portfolio to group
*PortfolioGroupsApi* | [**addSubGroupToGroup**](docs/PortfolioGroupsApi.md#addSubGroupToGroup) | **POST** /api/portfoliogroups/{scope}/{code}/subgroups | Add group to group
*PortfolioGroupsApi* | [**createPortfolioGroup**](docs/PortfolioGroupsApi.md#createPortfolioGroup) | **POST** /api/portfoliogroups/{scope} | Create group
*PortfolioGroupsApi* | [**deletePortfolioFromGroup**](docs/PortfolioGroupsApi.md#deletePortfolioFromGroup) | **DELETE** /api/portfoliogroups/{scope}/{code}/portfolios/{portfolioScope}/{portfolioCode} | Remove portfolio from group
*PortfolioGroupsApi* | [**deletePortfolioGroup**](docs/PortfolioGroupsApi.md#deletePortfolioGroup) | **DELETE** /api/portfoliogroups/{scope}/{code} | Delete group
*PortfolioGroupsApi* | [**deleteSubGroupFromGroup**](docs/PortfolioGroupsApi.md#deleteSubGroupFromGroup) | **DELETE** /api/portfoliogroups/{scope}/{code}/subgroups/{subgroupScope}/{subgroupCode} | Remove group from group
*PortfolioGroupsApi* | [**getPortfolioGroup**](docs/PortfolioGroupsApi.md#getPortfolioGroup) | **GET** /api/portfoliogroups/{scope}/{code} | Get portfolio group
*PortfolioGroupsApi* | [**getPortfolioGroupCommands**](docs/PortfolioGroupsApi.md#getPortfolioGroupCommands) | **GET** /api/portfoliogroups/{scope}/{code}/commands | Get commands
*PortfolioGroupsApi* | [**getPortfolioGroupExpansion**](docs/PortfolioGroupsApi.md#getPortfolioGroupExpansion) | **GET** /api/portfoliogroups/{scope}/{code}/expansion | Get a full expansion of a portfolio group
*PortfolioGroupsApi* | [**listPortfolioGroups**](docs/PortfolioGroupsApi.md#listPortfolioGroups) | **GET** /api/portfoliogroups/{scope} | List groups in scope
*PortfolioGroupsApi* | [**updatePortfolioGroup**](docs/PortfolioGroupsApi.md#updatePortfolioGroup) | **PUT** /api/portfoliogroups/{scope}/{code} | Update group
*PortfoliosApi* | [**deletePortfolio**](docs/PortfoliosApi.md#deletePortfolio) | **DELETE** /api/portfolios/{scope}/{code} | Delete portfolio
*PortfoliosApi* | [**deletePortfolioProperties**](docs/PortfoliosApi.md#deletePortfolioProperties) | **DELETE** /api/portfolios/{scope}/{code}/properties | Delete portfolio properties
*PortfoliosApi* | [**getPortfolio**](docs/PortfoliosApi.md#getPortfolio) | **GET** /api/portfolios/{scope}/{code} | Get portfolio definition
*PortfoliosApi* | [**getPortfolioCommands**](docs/PortfoliosApi.md#getPortfolioCommands) | **GET** /api/portfolios/{scope}/{code}/commands | Get commands
*PortfoliosApi* | [**getPortfolioProperties**](docs/PortfoliosApi.md#getPortfolioProperties) | **GET** /api/portfolios/{scope}/{code}/properties | Get portfolio properties
*PortfoliosApi* | [**listPortfolioScopes**](docs/PortfoliosApi.md#listPortfolioScopes) | **GET** /api/portfolios | List portfolio scopes
*PortfoliosApi* | [**listPortfolios**](docs/PortfoliosApi.md#listPortfolios) | **GET** /api/portfolios/{scope} | List portfolios
*PortfoliosApi* | [**updatePortfolio**](docs/PortfoliosApi.md#updatePortfolio) | **PUT** /api/portfolios/{scope}/{code} | Update portfolio definition
*PortfoliosApi* | [**upsertPortfolioProperties**](docs/PortfoliosApi.md#upsertPortfolioProperties) | **POST** /api/portfolios/{scope}/{code}/properties | Upsert properties
*PropertyDefinitionsApi* | [**createPropertyDefinition**](docs/PropertyDefinitionsApi.md#createPropertyDefinition) | **POST** /api/propertydefinitions | Define a new property
*PropertyDefinitionsApi* | [**deletePropertyDefinition**](docs/PropertyDefinitionsApi.md#deletePropertyDefinition) | **DELETE** /api/propertydefinitions/{domain}/{scope}/{code} | Delete property definition
*PropertyDefinitionsApi* | [**getMultiplePropertyDefinitions**](docs/PropertyDefinitionsApi.md#getMultiplePropertyDefinitions) | **GET** /api/propertydefinitions | Get multiple property definitions
*PropertyDefinitionsApi* | [**getPropertyDefinition**](docs/PropertyDefinitionsApi.md#getPropertyDefinition) | **GET** /api/propertydefinitions/{domain}/{scope}/{code} | Get property definition
*PropertyDefinitionsApi* | [**updatePropertyDefinition**](docs/PropertyDefinitionsApi.md#updatePropertyDefinition) | **PUT** /api/propertydefinitions/{domain}/{scope}/{code} | Update the definition of the specified existing property
*QuotesApi* | [**deleteQuote**](docs/QuotesApi.md#deleteQuote) | **DELETE** /api/quotes/{scope} | Delete a quote
*QuotesApi* | [**getQuotes**](docs/QuotesApi.md#getQuotes) | **GET** /api/quotes/{scope} | Get quotes
*QuotesApi* | [**upsertQuotes**](docs/QuotesApi.md#upsertQuotes) | **POST** /api/quotes/{scope} | Add quotes
*ReconciliationsApi* | [**reconcileHoldings**](docs/ReconciliationsApi.md#reconcileHoldings) | **POST** /api/portfolios/$reconcileholdings | Reconcile portfolio holdings
*ReferencePortfolioApi* | [**createReferencePortfolio**](docs/ReferencePortfolioApi.md#createReferencePortfolio) | **POST** /api/referenceportfolios/{scope} | Create reference portfolio
*ReferencePortfolioApi* | [**getReferencePortfolioConstituents**](docs/ReferencePortfolioApi.md#getReferencePortfolioConstituents) | **GET** /api/referenceportfolios/{scope}/{code}/{effectiveAt}/constituents | Get constituents
*ReferencePortfolioApi* | [**upsertReferencePortfolioConstituents**](docs/ReferencePortfolioApi.md#upsertReferencePortfolioConstituents) | **POST** /api/referenceportfolios/{scope}/{code}/{effectiveAt}/constituents | Add constituents
*ResultsApi* | [**getResults**](docs/ResultsApi.md#getResults) | **GET** /api/results/{scope}/{key}/{date} | Get results
*ResultsApi* | [**upsertResults**](docs/ResultsApi.md#upsertResults) | **POST** /api/results/{scope}/{key}/{date} | Upsert results
*SchemasApi* | [**getEntitySchema**](docs/SchemasApi.md#getEntitySchema) | **GET** /api/schemas/entities/{entity} | Get schema
*SchemasApi* | [**getPropertySchema**](docs/SchemasApi.md#getPropertySchema) | **GET** /api/schemas/properties | Get property schema
*SchemasApi* | [**getValueTypes**](docs/SchemasApi.md#getValueTypes) | **GET** /api/schemas/types | Get value types
*SchemasApi* | [**listEntities**](docs/SchemasApi.md#listEntities) | **GET** /api/schemas/entities | List entities
*SearchApi* | [**portfolioGroupsSearch**](docs/SearchApi.md#portfolioGroupsSearch) | **POST** /api/search/portfoliogroups | Search portfolio groups
*SearchApi* | [**portfoliosSearch**](docs/SearchApi.md#portfoliosSearch) | **POST** /api/search/portfolios | Search portfolios
*SearchApi* | [**propertiesSearch**](docs/SearchApi.md#propertiesSearch) | **POST** /api/search/propertydefinitions | Search property definitions
*SystemConfigurationApi* | [**createConfigurationTransactionType**](docs/SystemConfigurationApi.md#createConfigurationTransactionType) | **POST** /api/systemconfiguration/transactiontypes | Create transaction type
*SystemConfigurationApi* | [**listConfigurationTransactionTypes**](docs/SystemConfigurationApi.md#listConfigurationTransactionTypes) | **GET** /api/systemconfiguration/transactiontypes | List transaction types
*SystemConfigurationApi* | [**setConfigurationTransactionTypes**](docs/SystemConfigurationApi.md#setConfigurationTransactionTypes) | **PUT** /api/systemconfiguration/transactiontypes | Set transaction types
*TransactionPortfoliosApi* | [**addTransactionProperty**](docs/TransactionPortfoliosApi.md#addTransactionProperty) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties | Add transaction properties
*TransactionPortfoliosApi* | [**adjustHoldings**](docs/TransactionPortfoliosApi.md#adjustHoldings) | **POST** /api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt} | Adjust holdings
*TransactionPortfoliosApi* | [**buildTransactions**](docs/TransactionPortfoliosApi.md#buildTransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/$build | Build output transactions
*TransactionPortfoliosApi* | [**cancelAdjustHoldings**](docs/TransactionPortfoliosApi.md#cancelAdjustHoldings) | **DELETE** /api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt} | Cancel holdings adjustments
*TransactionPortfoliosApi* | [**createPortfolio**](docs/TransactionPortfoliosApi.md#createPortfolio) | **POST** /api/transactionportfolios/{scope} | Create transaction portfolio
*TransactionPortfoliosApi* | [**deletePropertyFromTransaction**](docs/TransactionPortfoliosApi.md#deletePropertyFromTransaction) | **DELETE** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties | Delete transaction property
*TransactionPortfoliosApi* | [**deleteTransactions**](docs/TransactionPortfoliosApi.md#deleteTransactions) | **DELETE** /api/transactionportfolios/{scope}/{code}/transactions | Delete transactions
*TransactionPortfoliosApi* | [**getDetails**](docs/TransactionPortfoliosApi.md#getDetails) | **GET** /api/transactionportfolios/{scope}/{code}/details | Get portfolio details
*TransactionPortfoliosApi* | [**getHoldings**](docs/TransactionPortfoliosApi.md#getHoldings) | **GET** /api/transactionportfolios/{scope}/{code}/holdings | Get holdings
*TransactionPortfoliosApi* | [**getHoldingsAdjustment**](docs/TransactionPortfoliosApi.md#getHoldingsAdjustment) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsadjustments/{effectiveAt} | Get holding adjustment
*TransactionPortfoliosApi* | [**getTransactions**](docs/TransactionPortfoliosApi.md#getTransactions) | **GET** /api/transactionportfolios/{scope}/{code}/transactions | Get transactions
*TransactionPortfoliosApi* | [**listHoldingsAdjustments**](docs/TransactionPortfoliosApi.md#listHoldingsAdjustments) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsadjustments | List holdings adjustments
*TransactionPortfoliosApi* | [**setHoldings**](docs/TransactionPortfoliosApi.md#setHoldings) | **PUT** /api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt} | Set all holdings on a transaction portfolio
*TransactionPortfoliosApi* | [**upsertExecutions**](docs/TransactionPortfoliosApi.md#upsertExecutions) | **POST** /api/transactionportfolios/{scope}/{code}/executions | Upsert executions
*TransactionPortfoliosApi* | [**upsertPortfolioDetails**](docs/TransactionPortfoliosApi.md#upsertPortfolioDetails) | **POST** /api/transactionportfolios/{scope}/{code}/details | Upsert details
*TransactionPortfoliosApi* | [**upsertTransactions**](docs/TransactionPortfoliosApi.md#upsertTransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions | Upsert transactions into the specified transaction portfolio


## Documentation for Models

 - [AddTransactionPropertyResponse](docs/AddTransactionPropertyResponse.md)
 - [AdjustHolding](docs/AdjustHolding.md)
 - [AdjustHoldingRequest](docs/AdjustHoldingRequest.md)
 - [AggregateSpec](docs/AggregateSpec.md)
 - [AggregationRequest](docs/AggregationRequest.md)
 - [AggregationResponseNode](docs/AggregationResponseNode.md)
 - [AnalyticStore](docs/AnalyticStore.md)
 - [AnalyticStoreKey](docs/AnalyticStoreKey.md)
 - [CompletePortfolio](docs/CompletePortfolio.md)
 - [CorporateAction](docs/CorporateAction.md)
 - [CorporateActionTransition](docs/CorporateActionTransition.md)
 - [CorporateActionTransitionComponent](docs/CorporateActionTransitionComponent.md)
 - [CreateAnalyticStoreRequest](docs/CreateAnalyticStoreRequest.md)
 - [CreateClientInstrumentRequest](docs/CreateClientInstrumentRequest.md)
 - [CreateCorporateAction](docs/CreateCorporateAction.md)
 - [CreateDataTypeRequest](docs/CreateDataTypeRequest.md)
 - [CreateDerivedTransactionPortfolioRequest](docs/CreateDerivedTransactionPortfolioRequest.md)
 - [CreateInstrumentPropertyRequest](docs/CreateInstrumentPropertyRequest.md)
 - [CreatePortfolioDetails](docs/CreatePortfolioDetails.md)
 - [CreatePortfolioGroupRequest](docs/CreatePortfolioGroupRequest.md)
 - [CreatePropertyDefinitionRequest](docs/CreatePropertyDefinitionRequest.md)
 - [CreateReferencePortfolioRequest](docs/CreateReferencePortfolioRequest.md)
 - [CreateResults](docs/CreateResults.md)
 - [CreateTransactionPortfolioRequest](docs/CreateTransactionPortfolioRequest.md)
 - [CreateUnitDefinition](docs/CreateUnitDefinition.md)
 - [CurrencyAndAmount](docs/CurrencyAndAmount.md)
 - [DataType](docs/DataType.md)
 - [DeleteClientInstrumentsResponse](docs/DeleteClientInstrumentsResponse.md)
 - [DeleteQuotesResponse](docs/DeleteQuotesResponse.md)
 - [DeletedEntityResponse](docs/DeletedEntityResponse.md)
 - [ErrorDetail](docs/ErrorDetail.md)
 - [ErrorDetailBase](docs/ErrorDetailBase.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ExecutionRequest](docs/ExecutionRequest.md)
 - [ExpandedGroup](docs/ExpandedGroup.md)
 - [FieldSchema](docs/FieldSchema.md)
 - [HoldingAdjustment](docs/HoldingAdjustment.md)
 - [HoldingsAdjustment](docs/HoldingsAdjustment.md)
 - [HoldingsAdjustmentHeader](docs/HoldingsAdjustmentHeader.md)
 - [IUnitDefinition](docs/IUnitDefinition.md)
 - [Instrument](docs/Instrument.md)
 - [InstrumentAnalytic](docs/InstrumentAnalytic.md)
 - [InstrumentDefinition](docs/InstrumentDefinition.md)
 - [InstrumentProperty](docs/InstrumentProperty.md)
 - [KeyValuePairOfPropertyKeyToFieldSchema](docs/KeyValuePairOfPropertyKeyToFieldSchema.md)
 - [KeyValuePairOfStringToFieldSchema](docs/KeyValuePairOfStringToFieldSchema.md)
 - [Link](docs/Link.md)
 - [ListAggregationResponse](docs/ListAggregationResponse.md)
 - [LookupInstrumentsFromCodesResponse](docs/LookupInstrumentsFromCodesResponse.md)
 - [MetricValue](docs/MetricValue.md)
 - [NestedAggregationResponse](docs/NestedAggregationResponse.md)
 - [OutputTransaction](docs/OutputTransaction.md)
 - [PerpetualProperty](docs/PerpetualProperty.md)
 - [PerpetualPropertyValue](docs/PerpetualPropertyValue.md)
 - [Personalisation](docs/Personalisation.md)
 - [Portfolio](docs/Portfolio.md)
 - [PortfolioDetails](docs/PortfolioDetails.md)
 - [PortfolioGroup](docs/PortfolioGroup.md)
 - [PortfolioHolding](docs/PortfolioHolding.md)
 - [PortfolioProperties](docs/PortfolioProperties.md)
 - [PortfolioReconciliationRequest](docs/PortfolioReconciliationRequest.md)
 - [PortfolioSearchResult](docs/PortfolioSearchResult.md)
 - [PortfoliosReconciliationRequest](docs/PortfoliosReconciliationRequest.md)
 - [ProcessedCommand](docs/ProcessedCommand.md)
 - [Property](docs/Property.md)
 - [PropertyDefinition](docs/PropertyDefinition.md)
 - [PropertyFilter](docs/PropertyFilter.md)
 - [PropertySchema](docs/PropertySchema.md)
 - [PropertyValue](docs/PropertyValue.md)
 - [Quote](docs/Quote.md)
 - [RealisedGainLoss](docs/RealisedGainLoss.md)
 - [ReconciliationBreak](docs/ReconciliationBreak.md)
 - [ReferencePortfolioConstituent](docs/ReferencePortfolioConstituent.md)
 - [ReferencePortfolioConstituentRequest](docs/ReferencePortfolioConstituentRequest.md)
 - [ResourceId](docs/ResourceId.md)
 - [ResourceListOfAnalyticStoreKey](docs/ResourceListOfAnalyticStoreKey.md)
 - [ResourceListOfCorporateActionEvent](docs/ResourceListOfCorporateActionEvent.md)
 - [ResourceListOfDataType](docs/ResourceListOfDataType.md)
 - [ResourceListOfHoldingsAdjustmentHeader](docs/ResourceListOfHoldingsAdjustmentHeader.md)
 - [ResourceListOfPersonalisation](docs/ResourceListOfPersonalisation.md)
 - [ResourceListOfPortfolio](docs/ResourceListOfPortfolio.md)
 - [ResourceListOfPortfolioGroup](docs/ResourceListOfPortfolioGroup.md)
 - [ResourceListOfPortfolioSearchResult](docs/ResourceListOfPortfolioSearchResult.md)
 - [ResourceListOfProcessedCommand](docs/ResourceListOfProcessedCommand.md)
 - [ResourceListOfPropertyDefinition](docs/ResourceListOfPropertyDefinition.md)
 - [ResourceListOfQuote](docs/ResourceListOfQuote.md)
 - [ResourceListOfReconciliationBreak](docs/ResourceListOfReconciliationBreak.md)
 - [ResourceListOfReferencePortfolioConstituent](docs/ResourceListOfReferencePortfolioConstituent.md)
 - [ResourceListOfScope](docs/ResourceListOfScope.md)
 - [ResourceListOfString](docs/ResourceListOfString.md)
 - [ResourceListOfTransactionMetaData](docs/ResourceListOfTransactionMetaData.md)
 - [ResourceListOfValueType](docs/ResourceListOfValueType.md)
 - [ResultDataSchema](docs/ResultDataSchema.md)
 - [Results](docs/Results.md)
 - [Schema](docs/Schema.md)
 - [TargetTaxLot](docs/TargetTaxLot.md)
 - [TargetTaxLotRequest](docs/TargetTaxLotRequest.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionConfigurationData](docs/TransactionConfigurationData.md)
 - [TransactionConfigurationDataRequest](docs/TransactionConfigurationDataRequest.md)
 - [TransactionConfigurationMovementData](docs/TransactionConfigurationMovementData.md)
 - [TransactionConfigurationMovementDataRequest](docs/TransactionConfigurationMovementDataRequest.md)
 - [TransactionConfigurationTypeAlias](docs/TransactionConfigurationTypeAlias.md)
 - [TransactionPrice](docs/TransactionPrice.md)
 - [TransactionPropertyMapping](docs/TransactionPropertyMapping.md)
 - [TransactionPropertyMappingRequest](docs/TransactionPropertyMappingRequest.md)
 - [TransactionQueryParameters](docs/TransactionQueryParameters.md)
 - [TransactionRequest](docs/TransactionRequest.md)
 - [TryAddClientInstruments](docs/TryAddClientInstruments.md)
 - [UpdateDataTypeRequest](docs/UpdateDataTypeRequest.md)
 - [UpdatePortfolioGroupRequest](docs/UpdatePortfolioGroupRequest.md)
 - [UpdatePortfolioRequest](docs/UpdatePortfolioRequest.md)
 - [UpdatePropertyDefinitionRequest](docs/UpdatePropertyDefinitionRequest.md)
 - [UpsertCorporateActionsResponse](docs/UpsertCorporateActionsResponse.md)
 - [UpsertInstrumentPropertiesResponse](docs/UpsertInstrumentPropertiesResponse.md)
 - [UpsertPersonalisationResponse](docs/UpsertPersonalisationResponse.md)
 - [UpsertPortfolioExecutionsResponse](docs/UpsertPortfolioExecutionsResponse.md)
 - [UpsertPortfolioTransactionsResponse](docs/UpsertPortfolioTransactionsResponse.md)
 - [UpsertQuoteRequest](docs/UpsertQuoteRequest.md)
 - [UpsertQuotesResponse](docs/UpsertQuotesResponse.md)
 - [UpsertReferencePortfolioConstituentsResponse](docs/UpsertReferencePortfolioConstituentsResponse.md)
 - [User](docs/User.md)
 - [Version](docs/Version.md)
 - [VersionSummary](docs/VersionSummary.md)
 - [VersionedResourceListOfHolding](docs/VersionedResourceListOfHolding.md)
 - [VersionedResourceListOfOutputTransaction](docs/VersionedResourceListOfOutputTransaction.md)
 - [VersionedResourceListOfTransaction](docs/VersionedResourceListOfTransaction.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://lusid.okta.com/oauth2/aus5a0xgh5ZSUqwkN2p6/v1/authorize
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@finbourne.com

