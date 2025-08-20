# IdentifierDefinitionsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createIdentifierDefinition**](IdentifierDefinitionsApi.md#createIdentifierDefinition) | **POST** /api/identifierdefinitions | [EXPERIMENTAL] CreateIdentifierDefinition: Create an Identifier Definition |
| [**deleteIdentifierDefinition**](IdentifierDefinitionsApi.md#deleteIdentifierDefinition) | **DELETE** /api/identifierdefinitions/{domain}/{identifierScope}/{identifierType} | [EXPERIMENTAL] DeleteIdentifierDefinition: Delete a particular Identifier Definition |
| [**getIdentifierDefinition**](IdentifierDefinitionsApi.md#getIdentifierDefinition) | **GET** /api/identifierdefinitions/{domain}/{identifierScope}/{identifierType} | [EXPERIMENTAL] GetIdentifierDefinition: Get a single Identifier Definition |
| [**listIdentifierDefinitions**](IdentifierDefinitionsApi.md#listIdentifierDefinitions) | **GET** /api/identifierdefinitions | [EXPERIMENTAL] ListIdentifierDefinitions: List Identifier Definitions |
| [**updateIdentifierDefinition**](IdentifierDefinitionsApi.md#updateIdentifierDefinition) | **PUT** /api/identifierdefinitions/{domain}/{identifierScope}/{identifierType} | [EXPERIMENTAL] UpdateIdentifierDefinition: Update Identifier Definition defined by domain, identifierScope, and identifierType |



## createIdentifierDefinition

> IdentifierDefinition createIdentifierDefinition(createIdentifierDefinitionRequest)

[EXPERIMENTAL] CreateIdentifierDefinition: Create an Identifier Definition

Define a new Identifier Definition

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.IdentifierDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IdentifierDefinitionsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // IdentifierDefinitionsApi apiInstance = apiFactory.build(IdentifierDefinitionsApi.class);

        IdentifierDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IdentifierDefinitionsApi.class);
        CreateIdentifierDefinitionRequest createIdentifierDefinitionRequest = new CreateIdentifierDefinitionRequest(); // CreateIdentifierDefinitionRequest | The request defining the new definition
        try {
            // uncomment the below to set overrides at the request level
            // IdentifierDefinition result = apiInstance.createIdentifierDefinition(createIdentifierDefinitionRequest).execute(opts);

            IdentifierDefinition result = apiInstance.createIdentifierDefinition(createIdentifierDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentifierDefinitionsApi#createIdentifierDefinition");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createIdentifierDefinitionRequest** | [**CreateIdentifierDefinitionRequest**](CreateIdentifierDefinitionRequest.md)| The request defining the new definition | [optional] |

### Return type

[**IdentifierDefinition**](IdentifierDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created Identifier Definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteIdentifierDefinition

> DeletedEntityResponse deleteIdentifierDefinition(domain, identifierScope, identifierType)

[EXPERIMENTAL] DeleteIdentifierDefinition: Delete a particular Identifier Definition

The deletion will take effect from the Identifier Definition deletion datetime. i.e. will no longer exist at any asAt datetime after the asAt datetime of deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.IdentifierDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IdentifierDefinitionsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // IdentifierDefinitionsApi apiInstance = apiFactory.build(IdentifierDefinitionsApi.class);

        IdentifierDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IdentifierDefinitionsApi.class);
        String domain = "NotDefined"; // String | The type of entity to which the identifier relates
        String identifierScope = "identifierScope_example"; // String | The scope that the identifier exists in
        String identifierType = "identifierType_example"; // String | What the identifier represents. Together with \"domain\" and \"identifierScope\" this uniquely identifies the identifier definition
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteIdentifierDefinition(domain, identifierScope, identifierType).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteIdentifierDefinition(domain, identifierScope, identifierType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentifierDefinitionsApi#deleteIdentifierDefinition");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| The type of entity to which the identifier relates | [enum: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, InvestorRecord, InvestmentAccount, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, CheckDefinition, Abor, AborConfiguration, Fund, FundConfiguration, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, AddressKeyDefinition, AmortisationRuleSet, AnalyticsSetInventory, AtomUnitResult, CleardownModule, ComplexMarketData, ComplianceRunSummary, ComplianceRule, ComplianceRunInfo, CorporateActionSource, CounterpartyAgreement, CustomEntityDefinition, DataType, Dialect, EventHandler, GeneralLedgerProfile, PostingModule, Quote, RecipeComposer, ReconciliationRunBreak, ReferenceList, RelationDefinition, ReturnBlockIndex, SRSDocument, SRSIndex, TransactionTemplate, TransactionTemplateScope, TransactionType, TransactionTypeConfig, TranslationScript, TaskDefinition, TaskInstance, Worker, StagingRuleSet, IdentifierDefinition] |
| **identifierScope** | **String**| The scope that the identifier exists in | |
| **identifierType** | **String**| What the identifier represents. Together with \&quot;domain\&quot; and \&quot;identifierScope\&quot; this uniquely identifies the identifier definition | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The deleted entity metadata |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getIdentifierDefinition

> IdentifierDefinition getIdentifierDefinition(domain, identifierScope, identifierType, asAt, effectiveAt, propertyKeys)

[EXPERIMENTAL] GetIdentifierDefinition: Get a single Identifier Definition

Get a single Identifier Definition using domain, identifierScope, identifierType, and an optional asAt  - defaulting to latest if not specified

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.IdentifierDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IdentifierDefinitionsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // IdentifierDefinitionsApi apiInstance = apiFactory.build(IdentifierDefinitionsApi.class);

        IdentifierDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IdentifierDefinitionsApi.class);
        String domain = "NotDefined"; // String | The type of entity to which the identifier relates.
        String identifierScope = "identifierScope_example"; // String | The scope that the identifier exists in
        String identifierType = "identifierType_example"; // String | What the identifier represents. Together with \"domain\" and \"identifierScope\" this uniquely identifies the identifier definition
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Identifier Definition. Defaults to return  the latest version of the definition if not specified.
        String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to retrieve the Identifier Definitions.  Since Identifier Definitions exist for all effective time, this will only apply to properties (if requested)  on the Identifier Definition.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'IdentifierDefinition' domain to decorate onto the Identifier Definition.  These must take the format {domain}/{scope}/{code}. If no properties are specified, then no properties will be returned.
        try {
            // uncomment the below to set overrides at the request level
            // IdentifierDefinition result = apiInstance.getIdentifierDefinition(domain, identifierScope, identifierType, asAt, effectiveAt, propertyKeys).execute(opts);

            IdentifierDefinition result = apiInstance.getIdentifierDefinition(domain, identifierScope, identifierType, asAt, effectiveAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentifierDefinitionsApi#getIdentifierDefinition");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| The type of entity to which the identifier relates. | [enum: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, InvestorRecord, InvestmentAccount, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, CheckDefinition, Abor, AborConfiguration, Fund, FundConfiguration, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, AddressKeyDefinition, AmortisationRuleSet, AnalyticsSetInventory, AtomUnitResult, CleardownModule, ComplexMarketData, ComplianceRunSummary, ComplianceRule, ComplianceRunInfo, CorporateActionSource, CounterpartyAgreement, CustomEntityDefinition, DataType, Dialect, EventHandler, GeneralLedgerProfile, PostingModule, Quote, RecipeComposer, ReconciliationRunBreak, ReferenceList, RelationDefinition, ReturnBlockIndex, SRSDocument, SRSIndex, TransactionTemplate, TransactionTemplateScope, TransactionType, TransactionTypeConfig, TranslationScript, TaskDefinition, TaskInstance, Worker, StagingRuleSet, IdentifierDefinition] |
| **identifierScope** | **String**| The scope that the identifier exists in | |
| **identifierType** | **String**| What the identifier represents. Together with \&quot;domain\&quot; and \&quot;identifierScope\&quot; this uniquely identifies the identifier definition | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Identifier Definition. Defaults to return  the latest version of the definition if not specified. | [optional] |
| **effectiveAt** | **String**| The effectiveAt datetime at which to retrieve the Identifier Definitions.  Since Identifier Definitions exist for all effective time, this will only apply to properties (if requested)  on the Identifier Definition. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;IdentifierDefinition&#39; domain to decorate onto the Identifier Definition.  These must take the format {domain}/{scope}/{code}. If no properties are specified, then no properties will be returned. | [optional] |

### Return type

[**IdentifierDefinition**](IdentifierDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Identifier Definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listIdentifierDefinitions

> PagedResourceListOfIdentifierDefinition listIdentifierDefinitions(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListIdentifierDefinitions: List Identifier Definitions

Retrieves all Identifier Definitions that fit the filter, in a specific order if sortBy is provided Supports pagination

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.IdentifierDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IdentifierDefinitionsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // IdentifierDefinitionsApi apiInstance = apiFactory.build(IdentifierDefinitionsApi.class);

        IdentifierDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IdentifierDefinitionsApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to retrieve the Identifier Definitions.  Since Identifier Definitions exist for all effective time, this will only apply to properties (if requested)  on the Identifier Definition.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Identifier Definitions. Defaults to return the latest  version of the Identifier Definitions if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Identifier Definitions from a previous call to list  Identifier Definitions. This value is returned from the previous call. If a pagination token is provided the sortBy,  filter, effectiveAt, and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many per page.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:  https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'IdentifierDefinition' domain to decorate onto the Identifier Definition.  These must take the format {domain}/{scope}/{code}.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfIdentifierDefinition result = apiInstance.listIdentifierDefinitions(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            PagedResourceListOfIdentifierDefinition result = apiInstance.listIdentifierDefinitions(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentifierDefinitionsApi#listIdentifierDefinitions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **effectiveAt** | **String**| The effectiveAt datetime at which to retrieve the Identifier Definitions.  Since Identifier Definitions exist for all effective time, this will only apply to properties (if requested)  on the Identifier Definition. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Identifier Definitions. Defaults to return the latest  version of the Identifier Definitions if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Identifier Definitions from a previous call to list  Identifier Definitions. This value is returned from the previous call. If a pagination token is provided the sortBy,  filter, effectiveAt, and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many per page. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:  https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;IdentifierDefinition&#39; domain to decorate onto the Identifier Definition.  These must take the format {domain}/{scope}/{code}. | [optional] |

### Return type

[**PagedResourceListOfIdentifierDefinition**](PagedResourceListOfIdentifierDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested list of Identifier Definitions |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateIdentifierDefinition

> IdentifierDefinition updateIdentifierDefinition(domain, identifierScope, identifierType, updateIdentifierDefinitionRequest)

[EXPERIMENTAL] UpdateIdentifierDefinition: Update Identifier Definition defined by domain, identifierScope, and identifierType

Overwrites an existing Identifier Definition.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.IdentifierDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IdentifierDefinitionsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // IdentifierDefinitionsApi apiInstance = apiFactory.build(IdentifierDefinitionsApi.class);

        IdentifierDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IdentifierDefinitionsApi.class);
        String domain = "NotDefined"; // String | The type of entity to which the identifier relates
        String identifierScope = "identifierScope_example"; // String | The scope that the identifier exists in
        String identifierType = "identifierType_example"; // String | What the identifier represents. Together with \"domain\" and \"identifierScope\" this uniquely identifies the Identifier Definition
        UpdateIdentifierDefinitionRequest updateIdentifierDefinitionRequest = new UpdateIdentifierDefinitionRequest(); // UpdateIdentifierDefinitionRequest | The request containing the updated details of the Identifier Definition.
        try {
            // uncomment the below to set overrides at the request level
            // IdentifierDefinition result = apiInstance.updateIdentifierDefinition(domain, identifierScope, identifierType, updateIdentifierDefinitionRequest).execute(opts);

            IdentifierDefinition result = apiInstance.updateIdentifierDefinition(domain, identifierScope, identifierType, updateIdentifierDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentifierDefinitionsApi#updateIdentifierDefinition");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| The type of entity to which the identifier relates | [enum: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, InvestorRecord, InvestmentAccount, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, CheckDefinition, Abor, AborConfiguration, Fund, FundConfiguration, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, AddressKeyDefinition, AmortisationRuleSet, AnalyticsSetInventory, AtomUnitResult, CleardownModule, ComplexMarketData, ComplianceRunSummary, ComplianceRule, ComplianceRunInfo, CorporateActionSource, CounterpartyAgreement, CustomEntityDefinition, DataType, Dialect, EventHandler, GeneralLedgerProfile, PostingModule, Quote, RecipeComposer, ReconciliationRunBreak, ReferenceList, RelationDefinition, ReturnBlockIndex, SRSDocument, SRSIndex, TransactionTemplate, TransactionTemplateScope, TransactionType, TransactionTypeConfig, TranslationScript, TaskDefinition, TaskInstance, Worker, StagingRuleSet, IdentifierDefinition] |
| **identifierScope** | **String**| The scope that the identifier exists in | |
| **identifierType** | **String**| What the identifier represents. Together with \&quot;domain\&quot; and \&quot;identifierScope\&quot; this uniquely identifies the Identifier Definition | |
| **updateIdentifierDefinitionRequest** | [**UpdateIdentifierDefinitionRequest**](UpdateIdentifierDefinitionRequest.md)| The request containing the updated details of the Identifier Definition. | [optional] |

### Return type

[**IdentifierDefinition**](IdentifierDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated version of the requested Identifier Definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

