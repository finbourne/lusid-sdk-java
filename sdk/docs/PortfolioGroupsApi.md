# PortfolioGroupsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPortfolioToGroup**](PortfolioGroupsApi.md#addPortfolioToGroup) | **POST** /api/portfoliogroups/{scope}/{code}/portfolios | [EARLY ACCESS] AddPortfolioToGroup: Add portfolio to group |
| [**addSubGroupToGroup**](PortfolioGroupsApi.md#addSubGroupToGroup) | **POST** /api/portfoliogroups/{scope}/{code}/subgroups | [EARLY ACCESS] AddSubGroupToGroup: Add sub group to group |
| [**buildTransactionsForPortfolioGroup**](PortfolioGroupsApi.md#buildTransactionsForPortfolioGroup) | **POST** /api/portfoliogroups/{scope}/{code}/transactions/$build | BuildTransactionsForPortfolioGroup: Build transactions for transaction portfolios in a portfolio group |
| [**createPortfolioGroup**](PortfolioGroupsApi.md#createPortfolioGroup) | **POST** /api/portfoliogroups/{scope} | CreatePortfolioGroup: Create portfolio group |
| [**deleteGroupProperties**](PortfolioGroupsApi.md#deleteGroupProperties) | **POST** /api/portfoliogroups/{scope}/{code}/properties/$delete | [EARLY ACCESS] DeleteGroupProperties: Delete group properties |
| [**deleteKeyFromPortfolioGroupAccessMetadata**](PortfolioGroupsApi.md#deleteKeyFromPortfolioGroupAccessMetadata) | **DELETE** /api/portfoliogroups/{scope}/{code}/metadata/{metadataKey} | [EARLY ACCESS] DeleteKeyFromPortfolioGroupAccessMetadata: Delete a Portfolio Group Access Metadata entry |
| [**deletePortfolioFromGroup**](PortfolioGroupsApi.md#deletePortfolioFromGroup) | **DELETE** /api/portfoliogroups/{scope}/{code}/portfolios/{portfolioScope}/{portfolioCode} | [EARLY ACCESS] DeletePortfolioFromGroup: Delete portfolio from group |
| [**deletePortfolioGroup**](PortfolioGroupsApi.md#deletePortfolioGroup) | **DELETE** /api/portfoliogroups/{scope}/{code} | [EARLY ACCESS] DeletePortfolioGroup: Delete portfolio group |
| [**deleteSubGroupFromGroup**](PortfolioGroupsApi.md#deleteSubGroupFromGroup) | **DELETE** /api/portfoliogroups/{scope}/{code}/subgroups/{subgroupScope}/{subgroupCode} | [EARLY ACCESS] DeleteSubGroupFromGroup: Delete sub group from group |
| [**getA2BDataForPortfolioGroup**](PortfolioGroupsApi.md#getA2BDataForPortfolioGroup) | **GET** /api/portfoliogroups/{scope}/{code}/a2b | [EARLY ACCESS] GetA2BDataForPortfolioGroup: Get A2B data for a Portfolio Group |
| [**getGroupProperties**](PortfolioGroupsApi.md#getGroupProperties) | **GET** /api/portfoliogroups/{scope}/{code}/properties | [EARLY ACCESS] GetGroupProperties: Get group properties |
| [**getHoldingsForPortfolioGroup**](PortfolioGroupsApi.md#getHoldingsForPortfolioGroup) | **GET** /api/portfoliogroups/{scope}/{code}/holdings | GetHoldingsForPortfolioGroup: Get holdings for transaction portfolios in portfolio group |
| [**getPortfolioGroup**](PortfolioGroupsApi.md#getPortfolioGroup) | **GET** /api/portfoliogroups/{scope}/{code} | GetPortfolioGroup: Get portfolio group |
| [**getPortfolioGroupAccessMetadataByKey**](PortfolioGroupsApi.md#getPortfolioGroupAccessMetadataByKey) | **GET** /api/portfoliogroups/{scope}/{code}/metadata/{metadataKey} | [EARLY ACCESS] GetPortfolioGroupAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Portfolio Group |
| [**getPortfolioGroupCommands**](PortfolioGroupsApi.md#getPortfolioGroupCommands) | **GET** /api/portfoliogroups/{scope}/{code}/commands | GetPortfolioGroupCommands: Get portfolio group commands |
| [**getPortfolioGroupExpansion**](PortfolioGroupsApi.md#getPortfolioGroupExpansion) | **GET** /api/portfoliogroups/{scope}/{code}/expansion | [EARLY ACCESS] GetPortfolioGroupExpansion: Get portfolio group expansion |
| [**getPortfolioGroupMetadata**](PortfolioGroupsApi.md#getPortfolioGroupMetadata) | **GET** /api/portfoliogroups/{scope}/{code}/metadata | [EARLY ACCESS] GetPortfolioGroupMetadata: Get Access Metadata rules for Portfolio Group |
| [**getPortfolioGroupPropertyTimeSeries**](PortfolioGroupsApi.md#getPortfolioGroupPropertyTimeSeries) | **GET** /api/portfoliogroups/{scope}/{code}/properties/time-series | [EARLY ACCESS] GetPortfolioGroupPropertyTimeSeries: Get the time series of a portfolio group property |
| [**getPortfolioGroupRelations**](PortfolioGroupsApi.md#getPortfolioGroupRelations) | **GET** /api/portfoliogroups/{scope}/{code}/relations | [EXPERIMENTAL] GetPortfolioGroupRelations: Get Relations for Portfolio Group |
| [**getPortfolioGroupRelationships**](PortfolioGroupsApi.md#getPortfolioGroupRelationships) | **GET** /api/portfoliogroups/{scope}/{code}/relationships | [EARLY ACCESS] GetPortfolioGroupRelationships: Get Relationships for Portfolio Group |
| [**getTransactionsForPortfolioGroup**](PortfolioGroupsApi.md#getTransactionsForPortfolioGroup) | **GET** /api/portfoliogroups/{scope}/{code}/transactions | GetTransactionsForPortfolioGroup: Get transactions for transaction portfolios in a portfolio group |
| [**listPortfolioGroups**](PortfolioGroupsApi.md#listPortfolioGroups) | **GET** /api/portfoliogroups/{scope} | ListPortfolioGroups: List portfolio groups |
| [**patchPortfolioGroupAccessMetadata**](PortfolioGroupsApi.md#patchPortfolioGroupAccessMetadata) | **PATCH** /api/portfoliogroups/{scope}/{code}/metadata | [EARLY ACCESS] PatchPortfolioGroupAccessMetadata: Patch Access Metadata rules for a Portfolio Group. |
| [**updatePortfolioGroup**](PortfolioGroupsApi.md#updatePortfolioGroup) | **PUT** /api/portfoliogroups/{scope}/{code} | [EARLY ACCESS] UpdatePortfolioGroup: Update portfolio group |
| [**upsertGroupProperties**](PortfolioGroupsApi.md#upsertGroupProperties) | **POST** /api/portfoliogroups/{scope}/{code}/properties/$upsert | [EARLY ACCESS] UpsertGroupProperties: Upsert group properties |
| [**upsertPortfolioGroupAccessMetadata**](PortfolioGroupsApi.md#upsertPortfolioGroupAccessMetadata) | **PUT** /api/portfoliogroups/{scope}/{code}/metadata/{metadataKey} | UpsertPortfolioGroupAccessMetadata: Upsert a Portfolio Group Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID. |



## addPortfolioToGroup

> PortfolioGroup addPortfolioToGroup(scope, code, effectiveAt, resourceId)

[EARLY ACCESS] AddPortfolioToGroup: Add portfolio to group

Add a single portfolio to a portfolio group.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio group to add a portfolio to.
        String code = "code_example"; // String | The code of the portfolio group to add a portfolio to. Together with the scope this uniquely identifies the portfolio group.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the portfolio will be added to the group.
        ResourceId resourceId = new ResourceId(); // ResourceId | The resource identifier of the portfolio to add to the portfolio group.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioGroup result = apiInstance.addPortfolioToGroup(scope, code, effectiveAt, resourceId).execute(opts);

            PortfolioGroup result = apiInstance.addPortfolioToGroup(scope, code, effectiveAt, resourceId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#addPortfolioToGroup");
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
| **scope** | **String**| The scope of the portfolio group to add a portfolio to. | |
| **code** | **String**| The code of the portfolio group to add a portfolio to. Together with the scope this uniquely identifies the portfolio group. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the portfolio will be added to the group. | [optional] |
| **resourceId** | [**ResourceId**](ResourceId.md)| The resource identifier of the portfolio to add to the portfolio group. | [optional] |

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The portfolio group containing the newly added portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## addSubGroupToGroup

> PortfolioGroup addSubGroupToGroup(scope, code, effectiveAt, resourceId)

[EARLY ACCESS] AddSubGroupToGroup: Add sub group to group

Add a portfolio group to a portfolio group as a sub group.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio group to add a portfolio group to.
        String code = "code_example"; // String | The code of the portfolio group to add a portfolio group to. Together with the scope this uniquely identifies the portfolio group.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the sub group will be added to the group.
        ResourceId resourceId = new ResourceId(); // ResourceId | The resource identifier of the portfolio group to add to the portfolio group as a sub group.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioGroup result = apiInstance.addSubGroupToGroup(scope, code, effectiveAt, resourceId).execute(opts);

            PortfolioGroup result = apiInstance.addSubGroupToGroup(scope, code, effectiveAt, resourceId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#addSubGroupToGroup");
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
| **scope** | **String**| The scope of the portfolio group to add a portfolio group to. | |
| **code** | **String**| The code of the portfolio group to add a portfolio group to. Together with the scope this uniquely identifies the portfolio group. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the sub group will be added to the group. | [optional] |
| **resourceId** | [**ResourceId**](ResourceId.md)| The resource identifier of the portfolio group to add to the portfolio group as a sub group. | [optional] |

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The portfolio group containing the newly added portfolio group as a sub group |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## buildTransactionsForPortfolioGroup

> VersionedResourceListOfOutputTransaction buildTransactionsForPortfolioGroup(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page, dataModelScope, dataModelCode, membershipType)

BuildTransactionsForPortfolioGroup: Build transactions for transaction portfolios in a portfolio group

Build transactions for transaction portfolios in a portfolio group over a given interval of effective time.     When the specified portfolio in a portfolio group is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio group.
        String code = "code_example"; // String | The code of the portfolio group. Together with the scope this uniquely identifies   the portfolio group.
        TransactionQueryParameters transactionQueryParameters = new TransactionQueryParameters(); // TransactionQueryParameters | The query queryParameters which control how the output transactions are built.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to build the transactions. Defaults to return the latest   version of each transaction if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the Transaction Type, use \"type eq 'Buy'\"   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" or \"Transaction\" domain to decorate onto   the transactions. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or   \"Transaction/strategy/quantsignal\".
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing transactions from a previous call to BuildTransactions.
        String dataModelScope = "dataModelScope_example"; // String | The optional scope of a Custom Data Model to use
        String dataModelCode = "dataModelCode_example"; // String | The optional code of a Custom Data Model to use
        String membershipType = "membershipType_example"; // String | The membership types of the specified Custom Data Model to return. Allowable values are Member, Candidate and All. Defaults to Member.
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListOfOutputTransaction result = apiInstance.buildTransactionsForPortfolioGroup(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page, dataModelScope, dataModelCode, membershipType).execute(opts);

            VersionedResourceListOfOutputTransaction result = apiInstance.buildTransactionsForPortfolioGroup(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page, dataModelScope, dataModelCode, membershipType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#buildTransactionsForPortfolioGroup");
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
| **scope** | **String**| The scope of the portfolio group. | |
| **code** | **String**| The code of the portfolio group. Together with the scope this uniquely identifies   the portfolio group. | |
| **transactionQueryParameters** | [**TransactionQueryParameters**](TransactionQueryParameters.md)| The query queryParameters which control how the output transactions are built. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to build the transactions. Defaults to return the latest   version of each transaction if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto   the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or   \&quot;Transaction/strategy/quantsignal\&quot;. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing transactions from a previous call to BuildTransactions. | [optional] |
| **dataModelScope** | **String**| The optional scope of a Custom Data Model to use | [optional] |
| **dataModelCode** | **String**| The optional code of a Custom Data Model to use | [optional] |
| **membershipType** | **String**| The membership types of the specified Custom Data Model to return. Allowable values are Member, Candidate and All. Defaults to Member. | [optional] |

### Return type

[**VersionedResourceListOfOutputTransaction**](VersionedResourceListOfOutputTransaction.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested transactions from transaction portfolios in the specified portfolio group |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createPortfolioGroup

> PortfolioGroup createPortfolioGroup(scope, createPortfolioGroupRequest)

CreatePortfolioGroup: Create portfolio group

Create a portfolio group in a specific scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope that the portfolio group will be created in.
        CreatePortfolioGroupRequest createPortfolioGroupRequest = new CreatePortfolioGroupRequest(); // CreatePortfolioGroupRequest | The definition and details of the portfolio group.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioGroup result = apiInstance.createPortfolioGroup(scope, createPortfolioGroupRequest).execute(opts);

            PortfolioGroup result = apiInstance.createPortfolioGroup(scope, createPortfolioGroupRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#createPortfolioGroup");
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
| **scope** | **String**| The scope that the portfolio group will be created in. | |
| **createPortfolioGroupRequest** | [**CreatePortfolioGroupRequest**](CreatePortfolioGroupRequest.md)| The definition and details of the portfolio group. | [optional] |

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created portfolio group |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteGroupProperties

> DeletedEntityResponse deleteGroupProperties(scope, code, requestBody, effectiveAt)

[EARLY ACCESS] DeleteGroupProperties: Delete group properties

Delete one or more properties from a single portfolio group. If the properties are time variant then an effective date time from which the properties  will be deleted must be specified. If the properties are perpetual then it is invalid to specify an effective date time for deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the group to delete properties from.
        String code = "code_example"; // String | The code of the group to delete properties from. Together with the scope this uniquely identifies the group.
        List<String> requestBody = ["PortfolioGroup/MyScope/MyPropertyName","PortfolioGroup/MyScope/MyPropertyName2"]; // List<String> | The property keys of the properties to delete. These take the format   {domain}/{scope}/{code} e.g. \"PortfolioGroup/Manager/Id\". Each property must be from the \"PortfolioGroup\" domain.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to delete time-variant properties from.   The property must exist at the specified 'effectiveAt' datetime. If the 'effectiveAt' is not provided or is   before the time-variant property exists then a failure is returned. Do not specify this parameter if any of   the properties to delete are perpetual.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteGroupProperties(scope, code, requestBody, effectiveAt).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteGroupProperties(scope, code, requestBody, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#deleteGroupProperties");
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
| **scope** | **String**| The scope of the group to delete properties from. | |
| **code** | **String**| The code of the group to delete properties from. Together with the scope this uniquely identifies the group. | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| The property keys of the properties to delete. These take the format   {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;. Each property must be from the \&quot;PortfolioGroup\&quot; domain. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to delete time-variant properties from.   The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is   before the time-variant property exists then a failure is returned. Do not specify this parameter if any of   the properties to delete are perpetual. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the properties were deleted from the specified group |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteKeyFromPortfolioGroupAccessMetadata

> DeletedEntityResponse deleteKeyFromPortfolioGroupAccessMetadata(scope, code, metadataKey, effectiveAt, effectiveUntil)

[EARLY ACCESS] DeleteKeyFromPortfolioGroupAccessMetadata: Delete a Portfolio Group Access Metadata entry

Deletes the Portfolio Group Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio Group
        String code = "code_example"; // String | The Portfolio Group code
        String metadataKey = "metadataKey_example"; // String | Key of the Access Metadata entry to delete
        String effectiveAt = "effectiveAt_example"; // String | The effective date to delete at, if this is not supplied, it will delete all data found
        OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' date of the Access Metadata
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteKeyFromPortfolioGroupAccessMetadata(scope, code, metadataKey, effectiveAt, effectiveUntil).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteKeyFromPortfolioGroupAccessMetadata(scope, code, metadataKey, effectiveAt, effectiveUntil).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#deleteKeyFromPortfolioGroupAccessMetadata");
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
| **scope** | **String**| The scope of the Portfolio Group | |
| **code** | **String**| The Portfolio Group code | |
| **metadataKey** | **String**| Key of the Access Metadata entry to delete | |
| **effectiveAt** | **String**| The effective date to delete at, if this is not supplied, it will delete all data found | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The has been deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deletePortfolioFromGroup

> PortfolioGroup deletePortfolioFromGroup(scope, code, portfolioScope, portfolioCode, effectiveAt)

[EARLY ACCESS] DeletePortfolioFromGroup: Delete portfolio from group

Remove a single portfolio from a portfolio group.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio group to remove the portfolio from.
        String code = "code_example"; // String | The code of the portfolio group to remove the portfolio from. Together with the scope this uniquely identifies the portfolio group.
        String portfolioScope = "portfolioScope_example"; // String | The scope of the portfolio being removed from the portfolio group.
        String portfolioCode = "portfolioCode_example"; // String | The code of the portfolio being removed from the portfolio group. Together with the scope this uniquely identifies the portfolio to remove.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the portfolio will be removed from the portfolio group.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioGroup result = apiInstance.deletePortfolioFromGroup(scope, code, portfolioScope, portfolioCode, effectiveAt).execute(opts);

            PortfolioGroup result = apiInstance.deletePortfolioFromGroup(scope, code, portfolioScope, portfolioCode, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#deletePortfolioFromGroup");
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
| **scope** | **String**| The scope of the portfolio group to remove the portfolio from. | |
| **code** | **String**| The code of the portfolio group to remove the portfolio from. Together with the scope this uniquely identifies the portfolio group. | |
| **portfolioScope** | **String**| The scope of the portfolio being removed from the portfolio group. | |
| **portfolioCode** | **String**| The code of the portfolio being removed from the portfolio group. Together with the scope this uniquely identifies the portfolio to remove. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the portfolio will be removed from the portfolio group. | [optional] |

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The portfolio group with the portfolio removed from the group |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deletePortfolioGroup

> DeletedEntityResponse deletePortfolioGroup(scope, code)

[EARLY ACCESS] DeletePortfolioGroup: Delete portfolio group

Delete a single portfolio group. A portfolio group can be deleted while it still contains portfolios or sub groups.  In this case any portfolios or sub groups contained in this group will not be deleted, however they will no longer be grouped together by this portfolio group.  The deletion will be valid from the portfolio group&#39;s creation datetime, ie. the portfolio group will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio group to delete.
        String code = "code_example"; // String | The code of the portfolio group to delete. Together with the scope this uniquely identifies the portfolio group to delete.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deletePortfolioGroup(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deletePortfolioGroup(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#deletePortfolioGroup");
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
| **scope** | **String**| The scope of the portfolio group to delete. | |
| **code** | **String**| The code of the portfolio group to delete. Together with the scope this uniquely identifies the portfolio group to delete. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the portfolio group was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteSubGroupFromGroup

> PortfolioGroup deleteSubGroupFromGroup(scope, code, subgroupScope, subgroupCode, effectiveAt)

[EARLY ACCESS] DeleteSubGroupFromGroup: Delete sub group from group

Remove a single portfolio group (sub group) from a portfolio group.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio group to remove the sub group from.
        String code = "code_example"; // String | The code of the portfolio group to remove the sub group from. Together with the scope this uniquely identifies the portfolio group.
        String subgroupScope = "subgroupScope_example"; // String | The scope of the sub group to remove from the portfolio group.
        String subgroupCode = "subgroupCode_example"; // String | The code of the sub group to remove from the portfolio group. Together with the scope this uniquely identifies the sub group.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the sub group will be removed from the portfolio group.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioGroup result = apiInstance.deleteSubGroupFromGroup(scope, code, subgroupScope, subgroupCode, effectiveAt).execute(opts);

            PortfolioGroup result = apiInstance.deleteSubGroupFromGroup(scope, code, subgroupScope, subgroupCode, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#deleteSubGroupFromGroup");
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
| **scope** | **String**| The scope of the portfolio group to remove the sub group from. | |
| **code** | **String**| The code of the portfolio group to remove the sub group from. Together with the scope this uniquely identifies the portfolio group. | |
| **subgroupScope** | **String**| The scope of the sub group to remove from the portfolio group. | |
| **subgroupCode** | **String**| The code of the sub group to remove from the portfolio group. Together with the scope this uniquely identifies the sub group. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the sub group will be removed from the portfolio group. | [optional] |

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The portfolio group with the sub group removed from the group |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getA2BDataForPortfolioGroup

> VersionedResourceListOfA2BDataRecord getA2BDataForPortfolioGroup(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter)

[EARLY ACCESS] GetA2BDataForPortfolioGroup: Get A2B data for a Portfolio Group

Get an A2B report for all Transaction Portfolios within the given portfolio group.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the group to retrieve the A2B report for.
        String code = "code_example"; // String | The code of the group to retrieve the A2B report for. Together with the scope this   uniquely identifies the portfolio group.
        String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no lower bound if this is not specified.
        String toEffectiveAt = "toEffectiveAt_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no upper bound if this is not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version   of each transaction if not specified.
        String recipeIdScope = "recipeIdScope_example"; // String | The scope of the given recipeId
        String recipeIdCode = "recipeIdCode_example"; // String | The code of the given recipeId
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" domain to decorate onto   the results. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\".
        String filter = "filter_example"; // String | Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListOfA2BDataRecord result = apiInstance.getA2BDataForPortfolioGroup(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter).execute(opts);

            VersionedResourceListOfA2BDataRecord result = apiInstance.getA2BDataForPortfolioGroup(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#getA2BDataForPortfolioGroup");
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
| **scope** | **String**| The scope of the group to retrieve the A2B report for. | |
| **code** | **String**| The code of the group to retrieve the A2B report for. Together with the scope this   uniquely identifies the portfolio group. | |
| **fromEffectiveAt** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no lower bound if this is not specified. | |
| **toEffectiveAt** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no upper bound if this is not specified. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version   of each transaction if not specified. | [optional] |
| **recipeIdScope** | **String**| The scope of the given recipeId | [optional] |
| **recipeIdCode** | **String**| The code of the given recipeId | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; domain to decorate onto   the results. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot;. | [optional] |
| **filter** | **String**| Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**VersionedResourceListOfA2BDataRecord**](VersionedResourceListOfA2BDataRecord.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested group A2B data |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getGroupProperties

> PortfolioGroupProperties getGroupProperties(scope, code, effectiveAt, asAt)

[EARLY ACCESS] GetGroupProperties: Get group properties

List all the properties of a single portfolio group.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the group to list the properties for.
        String code = "code_example"; // String | The code of the group to list the properties for. Together with the scope this uniquely identifies the group.
        String effectiveAt = "effectiveAt_example"; // String | The effective date time or cut label at which to list the group's properties. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt date time at which to list the group's properties. Defaults to return the latest version of each property if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioGroupProperties result = apiInstance.getGroupProperties(scope, code, effectiveAt, asAt).execute(opts);

            PortfolioGroupProperties result = apiInstance.getGroupProperties(scope, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#getGroupProperties");
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
| **scope** | **String**| The scope of the group to list the properties for. | |
| **code** | **String**| The code of the group to list the properties for. Together with the scope this uniquely identifies the group. | |
| **effectiveAt** | **String**| The effective date time or cut label at which to list the group&#39;s properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt date time at which to list the group&#39;s properties. Defaults to return the latest version of each property if not specified. | [optional] |

### Return type

[**PortfolioGroupProperties**](PortfolioGroupProperties.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The properties of the specified group |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getHoldingsForPortfolioGroup

> VersionedResourceListOfPortfolioHolding getHoldingsForPortfolioGroup(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, includeSettlementEventsAfterDays)

GetHoldingsForPortfolioGroup: Get holdings for transaction portfolios in portfolio group

Get the holdings of transaction portfolios in specified portfolio group.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio group.
        String code = "code_example"; // String | The code of the portfolio group. Together with the scope this uniquely identifies   the portfolio group.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the holdings of transaction   portfolios in the portfolio group. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the holdings of transaction portfolios in the portfolio group. Defaults   to return the latest version of the holdings if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\", \"Holding\" or \"Portfolio\" domain to decorate onto   the holdings. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or \"Holding/system/Cost\".
        Boolean byTaxlots = true; // Boolean | Whether or not to expand the holdings to return the underlying tax-lots. Defaults to   False.
        Integer includeSettlementEventsAfterDays = 56; // Integer | Number of days ahead to bring back settlements from, in relation to the specified effectiveAt
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListOfPortfolioHolding result = apiInstance.getHoldingsForPortfolioGroup(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, includeSettlementEventsAfterDays).execute(opts);

            VersionedResourceListOfPortfolioHolding result = apiInstance.getHoldingsForPortfolioGroup(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, includeSettlementEventsAfterDays).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#getHoldingsForPortfolioGroup");
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
| **scope** | **String**| The scope of the portfolio group. | |
| **code** | **String**| The code of the portfolio group. Together with the scope this uniquely identifies   the portfolio group. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the holdings of transaction   portfolios in the portfolio group. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the holdings of transaction portfolios in the portfolio group. Defaults   to return the latest version of the holdings if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto   the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. | [optional] |
| **byTaxlots** | **Boolean**| Whether or not to expand the holdings to return the underlying tax-lots. Defaults to   False. | [optional] |
| **includeSettlementEventsAfterDays** | **Integer**| Number of days ahead to bring back settlements from, in relation to the specified effectiveAt | [optional] |

### Return type

[**VersionedResourceListOfPortfolioHolding**](VersionedResourceListOfPortfolioHolding.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The holdings of transaction portfolios in a specific version of portfolio group |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioGroup

> PortfolioGroup getPortfolioGroup(scope, code, effectiveAt, asAt, relatedEntityPropertyKeys, relationshipDefinitionIds)

GetPortfolioGroup: Get portfolio group

Retrieve the definition of a single portfolio group.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio group to retrieve the definition for.
        String code = "code_example"; // String | The code of the portfolio group to retrieve the definition for. Together with the scope   this uniquely identifies the portfolio group.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the portfolio group definition. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio group definition. Defaults to return   the latest version of the portfolio group definition if not specified.
        List<String> relatedEntityPropertyKeys = Arrays.asList(); // List<String> | A list of property keys from any domain that supports relationships   to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'.
        List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto the portfolio group in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioGroup result = apiInstance.getPortfolioGroup(scope, code, effectiveAt, asAt, relatedEntityPropertyKeys, relationshipDefinitionIds).execute(opts);

            PortfolioGroup result = apiInstance.getPortfolioGroup(scope, code, effectiveAt, asAt, relatedEntityPropertyKeys, relationshipDefinitionIds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#getPortfolioGroup");
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
| **scope** | **String**| The scope of the portfolio group to retrieve the definition for. | |
| **code** | **String**| The code of the portfolio group to retrieve the definition for. Together with the scope   this uniquely identifies the portfolio group. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the portfolio group definition. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio group definition. Defaults to return   the latest version of the portfolio group definition if not specified. | [optional] |
| **relatedEntityPropertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from any domain that supports relationships   to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto the portfolio group in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested portfolio group definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioGroupAccessMetadataByKey

> List&lt;AccessMetadataValue&gt; getPortfolioGroupAccessMetadataByKey(scope, code, metadataKey, effectiveAt, asAt)

[EARLY ACCESS] GetPortfolioGroupAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Portfolio Group

Get a specific Portfolio Group access metadata by specifying the corresponding identifier parts     No matching will be performed through this endpoint. To retrieve a rule, it is necessary to specify, exactly, the identifier of the rule

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio Group
        String code = "code_example"; // String | The Portfolio Group code
        String metadataKey = "metadataKey_example"; // String | Key of the metadata entry to retrieve
        String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to retrieve the access metadata
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the access metadata
        try {
            // uncomment the below to set overrides at the request level
            // List<AccessMetadataValue> result = apiInstance.getPortfolioGroupAccessMetadataByKey(scope, code, metadataKey, effectiveAt, asAt).execute(opts);

            List<AccessMetadataValue> result = apiInstance.getPortfolioGroupAccessMetadataByKey(scope, code, metadataKey, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#getPortfolioGroupAccessMetadataByKey");
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
| **scope** | **String**| The scope of the Portfolio Group | |
| **code** | **String**| The Portfolio Group code | |
| **metadataKey** | **String**| Key of the metadata entry to retrieve | |
| **effectiveAt** | **String**| The effectiveAt datetime at which to retrieve the access metadata | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the access metadata | [optional] |

### Return type

[**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Portfolio group access metadata filtered by metadataKey or any failure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioGroupCommands

> ResourceListOfProcessedCommand getPortfolioGroupCommands(scope, code, fromAsAt, toAsAt, filter)

GetPortfolioGroupCommands: Get portfolio group commands

Gets all the commands that modified a single portfolio group.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio group to retrieve the commands for.
        String code = "code_example"; // String | The code of the portfolio group to retrieve the commands for. Together with the scope this uniquely identifies the portfolio group.
        OffsetDateTime fromAsAt = OffsetDateTime.now(); // OffsetDateTime | The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified.
        OffsetDateTime toAsAt = OffsetDateTime.now(); // OffsetDateTime | The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the User ID, use \"userId.id eq 'string'\"   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfProcessedCommand result = apiInstance.getPortfolioGroupCommands(scope, code, fromAsAt, toAsAt, filter).execute(opts);

            ResourceListOfProcessedCommand result = apiInstance.getPortfolioGroupCommands(scope, code, fromAsAt, toAsAt, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#getPortfolioGroupCommands");
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
| **scope** | **String**| The scope of the portfolio group to retrieve the commands for. | |
| **code** | **String**| The code of the portfolio group to retrieve the commands for. Together with the scope this uniquely identifies the portfolio group. | |
| **fromAsAt** | **OffsetDateTime**| The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified. | [optional] |
| **toAsAt** | **OffsetDateTime**| The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to filter on the User ID, use \&quot;userId.id eq &#39;string&#39;\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**ResourceListOfProcessedCommand**](ResourceListOfProcessedCommand.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The commands that modified the specified portfolio group |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioGroupExpansion

> ExpandedGroup getPortfolioGroupExpansion(scope, code, effectiveAt, asAt, propertyFilter)

[EARLY ACCESS] GetPortfolioGroupExpansion: Get portfolio group expansion

List all the portfolios in a group, including all portfolios within sub groups in the group. Each portfolio will be decorated with all of its properties unless a property filter is specified.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio group to expand.
        String code = "code_example"; // String | The code of the portfolio group to expand. Together with the scope this uniquely identifies the portfolio   group to expand.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to expand the portfolio group. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to expand the portfolio group. Defaults to return the latest version of each portfolio in the group if not specified.
        List<String> propertyFilter = Arrays.asList(); // List<String> | The restricted list of property keys from the \"Portfolio\" domain which will be decorated onto each portfolio. These take the format {domain}/{scope}/{code} e.g. \"Portfolio/Manager/Id\".
        try {
            // uncomment the below to set overrides at the request level
            // ExpandedGroup result = apiInstance.getPortfolioGroupExpansion(scope, code, effectiveAt, asAt, propertyFilter).execute(opts);

            ExpandedGroup result = apiInstance.getPortfolioGroupExpansion(scope, code, effectiveAt, asAt, propertyFilter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#getPortfolioGroupExpansion");
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
| **scope** | **String**| The scope of the portfolio group to expand. | |
| **code** | **String**| The code of the portfolio group to expand. Together with the scope this uniquely identifies the portfolio   group to expand. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to expand the portfolio group. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to expand the portfolio group. Defaults to return the latest version of each portfolio in the group if not specified. | [optional] |
| **propertyFilter** | [**List&lt;String&gt;**](String.md)| The restricted list of property keys from the \&quot;Portfolio\&quot; domain which will be decorated onto each portfolio. These take the format {domain}/{scope}/{code} e.g. \&quot;Portfolio/Manager/Id\&quot;. | [optional] |

### Return type

[**ExpandedGroup**](ExpandedGroup.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The expanded portfolio group |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioGroupMetadata

> Map&lt;String, List&lt;AccessMetadataValue&gt;&gt; getPortfolioGroupMetadata(scope, code, effectiveAt, asAt)

[EARLY ACCESS] GetPortfolioGroupMetadata: Get Access Metadata rules for Portfolio Group

Pass the scope and Portfolio Group code parameters to retrieve the associated Access Metadata

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio Group
        String code = "code_example"; // String | The Portfolio Group code
        String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to retrieve the Access Metadata
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Access Metadata
        try {
            // uncomment the below to set overrides at the request level
            // Map<String, List<AccessMetadataValue>> result = apiInstance.getPortfolioGroupMetadata(scope, code, effectiveAt, asAt).execute(opts);

            Map<String, List<AccessMetadataValue>> result = apiInstance.getPortfolioGroupMetadata(scope, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#getPortfolioGroupMetadata");
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
| **scope** | **String**| The scope of the Portfolio Group | |
| **code** | **String**| The Portfolio Group code | |
| **effectiveAt** | **String**| The effectiveAt datetime at which to retrieve the Access Metadata | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Access Metadata | [optional] |

### Return type

[**Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;**](List.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The access metadata for the portfolio group or any failure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioGroupPropertyTimeSeries

> ResourceListOfPropertyInterval getPortfolioGroupPropertyTimeSeries(scope, code, propertyKey, portfolioGroupEffectiveAt, asAt, filter, page, limit)

[EARLY ACCESS] GetPortfolioGroupPropertyTimeSeries: Get the time series of a portfolio group property

List the complete time series of a portfolio group property.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the group.
        String code = "code_example"; // String | The code of the group. Together with the scope this uniquely identifies   the portfolio group.
        String propertyKey = "propertyKey_example"; // String | The property key of the property that will have its history shown. These must be in the format {domain}/{scope}/{code} e.g. \"PortfolioGroup/Manager/Id\".   Each property must be from the \"PortfolioGroup\" domain.
        String portfolioGroupEffectiveAt = "portfolioGroupEffectiveAt_example"; // String | The effective datetime used to resolve the portfolio group. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the portfolio group's property history. Defaults to return the current datetime if not supplied.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        String page = "page_example"; // String | The pagination token to use to continue listing properties from a previous call to get property time series.   This value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, and asAt fields   must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfPropertyInterval result = apiInstance.getPortfolioGroupPropertyTimeSeries(scope, code, propertyKey, portfolioGroupEffectiveAt, asAt, filter, page, limit).execute(opts);

            ResourceListOfPropertyInterval result = apiInstance.getPortfolioGroupPropertyTimeSeries(scope, code, propertyKey, portfolioGroupEffectiveAt, asAt, filter, page, limit).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#getPortfolioGroupPropertyTimeSeries");
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
| **scope** | **String**| The scope of the group. | |
| **code** | **String**| The code of the group. Together with the scope this uniquely identifies   the portfolio group. | |
| **propertyKey** | **String**| The property key of the property that will have its history shown. These must be in the format {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;.   Each property must be from the \&quot;PortfolioGroup\&quot; domain. | |
| **portfolioGroupEffectiveAt** | **String**| The effective datetime used to resolve the portfolio group. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolio group&#39;s property history. Defaults to return the current datetime if not supplied. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **page** | **String**| The pagination token to use to continue listing properties from a previous call to get property time series.   This value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, and asAt fields   must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |

### Return type

[**ResourceListOfPropertyInterval**](ResourceListOfPropertyInterval.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The time series of the property |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioGroupRelations

> ResourceListOfRelation getPortfolioGroupRelations(scope, code, effectiveAt, asAt, filter, identifierTypes)

[EXPERIMENTAL] GetPortfolioGroupRelations: Get Relations for Portfolio Group

Get relations for the specified Portfolio Group

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio group.
        String code = "code_example"; // String | The code of the portfolio group. Together with the scope this uniquely identifies   the portfolio group.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve relations. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve relations. Defaults to return the latest LUSID AsAt time if not specified.
        String filter = "filter_example"; // String | Expression to filter the relations. Users should provide null or empty string for this field until further notice.
        List<String> identifierTypes = Arrays.asList(); // List<String> | Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format   {domain}/{scope}/{code} e.g. \"Person/CompanyDetails/Role\". They must be from the \"Person\" or \"LegalEntity\" domain.   Only identifier types stated will be used to look up relevant entities in relations. If not applicable, provide an empty array.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfRelation result = apiInstance.getPortfolioGroupRelations(scope, code, effectiveAt, asAt, filter, identifierTypes).execute(opts);

            ResourceListOfRelation result = apiInstance.getPortfolioGroupRelations(scope, code, effectiveAt, asAt, filter, identifierTypes).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#getPortfolioGroupRelations");
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
| **scope** | **String**| The scope of the portfolio group. | |
| **code** | **String**| The code of the portfolio group. Together with the scope this uniquely identifies   the portfolio group. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve relations. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve relations. Defaults to return the latest LUSID AsAt time if not specified. | [optional] |
| **filter** | **String**| Expression to filter the relations. Users should provide null or empty string for this field until further notice. | [optional] |
| **identifierTypes** | [**List&lt;String&gt;**](String.md)| Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format   {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. They must be from the \&quot;Person\&quot; or \&quot;LegalEntity\&quot; domain.   Only identifier types stated will be used to look up relevant entities in relations. If not applicable, provide an empty array. | [optional] |

### Return type

[**ResourceListOfRelation**](ResourceListOfRelation.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The relations for the specific portfolio group. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioGroupRelationships

> ResourceListOfRelationship getPortfolioGroupRelationships(scope, code, effectiveAt, asAt, filter, identifierTypes)

[EARLY ACCESS] GetPortfolioGroupRelationships: Get Relationships for Portfolio Group

Get relationships for the specified Portfolio Group

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio group.
        String code = "code_example"; // String | The code of the portfolio group. Together with the scope this uniquely identifies   the portfolio group.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve relationship. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified.
        String filter = "filter_example"; // String | Expression to filter relationships. Users should provide null or empty string for this field until further notice.
        List<String> identifierTypes = Arrays.asList(); // List<String> | Identifier types (as property keys) used for referencing Persons or Legal Entities.   These can be specified from the 'Person' or 'LegalEntity' domains and have the format {domain}/{scope}/{code}, for example   'Person/CompanyDetails/Role'. An Empty array may be used to return all related Entities.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfRelationship result = apiInstance.getPortfolioGroupRelationships(scope, code, effectiveAt, asAt, filter, identifierTypes).execute(opts);

            ResourceListOfRelationship result = apiInstance.getPortfolioGroupRelationships(scope, code, effectiveAt, asAt, filter, identifierTypes).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#getPortfolioGroupRelationships");
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
| **scope** | **String**| The scope of the portfolio group. | |
| **code** | **String**| The code of the portfolio group. Together with the scope this uniquely identifies   the portfolio group. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve relationship. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. | [optional] |
| **filter** | **String**| Expression to filter relationships. Users should provide null or empty string for this field until further notice. | [optional] |
| **identifierTypes** | [**List&lt;String&gt;**](String.md)| Identifier types (as property keys) used for referencing Persons or Legal Entities.   These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example   &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. | [optional] |

### Return type

[**ResourceListOfRelationship**](ResourceListOfRelationship.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The relationships for the specific portfolio group. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTransactionsForPortfolioGroup

> VersionedResourceListOfTransaction getTransactionsForPortfolioGroup(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, limit, page, showCancelledTransactions, sortBy, dataModelScope, dataModelCode, membershipType)

GetTransactionsForPortfolioGroup: Get transactions for transaction portfolios in a portfolio group

Get transactions for transaction portfolios in a portfolio group over a given interval of effective time.     When the specified portfolio in a portfolio group is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio group.
        String code = "code_example"; // String | The code of the portfolio group. Together with the scope this uniquely identifies   the portfolio group.
        String fromTransactionDate = "fromTransactionDate_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.   There is no lower bound if this is not specified.
        String toTransactionDate = "toTransactionDate_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.   There is no upper bound if this is not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transactions. Defaults to return the latest version   of each transaction if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the Transaction Type, use \"type eq 'Buy'\"   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\", \"Transaction\", \"LegalEntity\" or \"CustodianAccount\" domain to decorate onto   the transactions. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or   \"Transaction/strategy/quantsignal\".
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing transactions from a previous call to GetTransactions.
        Boolean showCancelledTransactions = true; // Boolean | Option to specify whether or not to include cancelled transactions,   including previous versions of transactions which have since been amended.   Defaults to False if not specified.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        String dataModelScope = "dataModelScope_example"; // String | The optional scope of a Custom Data Model to use
        String dataModelCode = "dataModelCode_example"; // String | The optional code of a Custom Data Model to use
        String membershipType = "membershipType_example"; // String | The membership types of the specified Custom Data Model to return. Allowable values are Member, Candidate and All. Defaults to Member.
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListOfTransaction result = apiInstance.getTransactionsForPortfolioGroup(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, limit, page, showCancelledTransactions, sortBy, dataModelScope, dataModelCode, membershipType).execute(opts);

            VersionedResourceListOfTransaction result = apiInstance.getTransactionsForPortfolioGroup(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, limit, page, showCancelledTransactions, sortBy, dataModelScope, dataModelCode, membershipType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#getTransactionsForPortfolioGroup");
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
| **scope** | **String**| The scope of the portfolio group. | |
| **code** | **String**| The code of the portfolio group. Together with the scope this uniquely identifies   the portfolio group. | |
| **fromTransactionDate** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.   There is no lower bound if this is not specified. | [optional] |
| **toTransactionDate** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.   There is no upper bound if this is not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transactions. Defaults to return the latest version   of each transaction if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot;, \&quot;Transaction\&quot;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto   the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or   \&quot;Transaction/strategy/quantsignal\&quot;. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing transactions from a previous call to GetTransactions. | [optional] |
| **showCancelledTransactions** | **Boolean**| Option to specify whether or not to include cancelled transactions,   including previous versions of transactions which have since been amended.   Defaults to False if not specified. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **dataModelScope** | **String**| The optional scope of a Custom Data Model to use | [optional] |
| **dataModelCode** | **String**| The optional code of a Custom Data Model to use | [optional] |
| **membershipType** | **String**| The membership types of the specified Custom Data Model to return. Allowable values are Member, Candidate and All. Defaults to Member. | [optional] |

### Return type

[**VersionedResourceListOfTransaction**](VersionedResourceListOfTransaction.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested transactions from transaction portfolios in the specified portfolio group |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listPortfolioGroups

> PagedResourceListOfPortfolioGroup listPortfolioGroups(scope, effectiveAt, asAt, page, limit, filter, sortBy, relatedEntityPropertyKeys, relationshipDefinitionIds)

ListPortfolioGroups: List portfolio groups

List all the portfolio groups in a single scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope to list the portfolio groups in.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the portfolio groups. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the portfolio groups. Defaults to return the latest version of each portfolio group if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing portfolio groups from a previous call to list portfolio groups. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy  and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to no limit if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the Display Name, use \"displayName eq 'string'\"   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
        List<String> relatedEntityPropertyKeys = Arrays.asList(); // List<String> | A list of property keys from any domain that supports relationships   to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'.
        List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto the portfolio groups in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfPortfolioGroup result = apiInstance.listPortfolioGroups(scope, effectiveAt, asAt, page, limit, filter, sortBy, relatedEntityPropertyKeys, relationshipDefinitionIds).execute(opts);

            PagedResourceListOfPortfolioGroup result = apiInstance.listPortfolioGroups(scope, effectiveAt, asAt, page, limit, filter, sortBy, relatedEntityPropertyKeys, relationshipDefinitionIds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#listPortfolioGroups");
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
| **scope** | **String**| The scope to list the portfolio groups in. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the portfolio groups. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolio groups. Defaults to return the latest version of each portfolio group if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing portfolio groups from a previous call to list portfolio groups. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy  and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to no limit if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to filter on the Display Name, use \&quot;displayName eq &#39;string&#39;\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **relatedEntityPropertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from any domain that supports relationships   to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto the portfolio groups in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**PagedResourceListOfPortfolioGroup**](PagedResourceListOfPortfolioGroup.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The portfolio groups in the specified scope |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## patchPortfolioGroupAccessMetadata

> Map&lt;String, List&lt;AccessMetadataValue&gt;&gt; patchPortfolioGroupAccessMetadata(scope, code, accessMetadataOperation, effectiveAt, effectiveUntil)

[EARLY ACCESS] PatchPortfolioGroupAccessMetadata: Patch Access Metadata rules for a Portfolio Group.

Patch Portfolio Group Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.     Currently only &#39;add&#39; is a supported operation on the patch document.    Currently only valid metadata keys are supported paths on the patch document.     The response will return any affected Portfolio Group Access Metadata rules or a failure message if unsuccessful.     It is important to always check to verify success (or failure).     Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio Group
        String code = "code_example"; // String | The Portfolio Group code
        List<AccessMetadataOperation> accessMetadataOperation = Arrays.asList(); // List<AccessMetadataOperation> | The Json patch document
        String effectiveAt = "effectiveAt_example"; // String | The date this rule will be effective from
        OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' date of the Access Metadata
        try {
            // uncomment the below to set overrides at the request level
            // Map<String, List<AccessMetadataValue>> result = apiInstance.patchPortfolioGroupAccessMetadata(scope, code, accessMetadataOperation, effectiveAt, effectiveUntil).execute(opts);

            Map<String, List<AccessMetadataValue>> result = apiInstance.patchPortfolioGroupAccessMetadata(scope, code, accessMetadataOperation, effectiveAt, effectiveUntil).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#patchPortfolioGroupAccessMetadata");
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
| **scope** | **String**| The scope of the Portfolio Group | |
| **code** | **String**| The Portfolio Group code | |
| **accessMetadataOperation** | [**List&lt;AccessMetadataOperation&gt;**](AccessMetadataOperation.md)| The Json patch document | |
| **effectiveAt** | **String**| The date this rule will be effective from | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata | [optional] |

### Return type

[**Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;**](List.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully patched items. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updatePortfolioGroup

> PortfolioGroup updatePortfolioGroup(scope, code, effectiveAt, updatePortfolioGroupRequest)

[EARLY ACCESS] UpdatePortfolioGroup: Update portfolio group

Update the definition of a single portfolio group. Not all elements within a portfolio group definition are modifiable  due to the potential implications for data already stored against the portfolio group.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio group to update the definition for.
        String code = "code_example"; // String | The code of the portfolio group to update the definition for. Together with the scope this uniquely identifies the portfolio group.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to update the definition.
        UpdatePortfolioGroupRequest updatePortfolioGroupRequest = new UpdatePortfolioGroupRequest(); // UpdatePortfolioGroupRequest | The updated portfolio group definition.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioGroup result = apiInstance.updatePortfolioGroup(scope, code, effectiveAt, updatePortfolioGroupRequest).execute(opts);

            PortfolioGroup result = apiInstance.updatePortfolioGroup(scope, code, effectiveAt, updatePortfolioGroupRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#updatePortfolioGroup");
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
| **scope** | **String**| The scope of the portfolio group to update the definition for. | |
| **code** | **String**| The code of the portfolio group to update the definition for. Together with the scope this uniquely identifies the portfolio group. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to update the definition. | [optional] |
| **updatePortfolioGroupRequest** | [**UpdatePortfolioGroupRequest**](UpdatePortfolioGroupRequest.md)| The updated portfolio group definition. | [optional] |

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated definition of the portfolio group |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertGroupProperties

> PortfolioGroupProperties upsertGroupProperties(scope, code, requestBody)

[EARLY ACCESS] UpsertGroupProperties: Upsert group properties

Update or insert one or more properties onto a single group. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;PortfolioGroup&#39;.     Upserting a property that exists for a group, with a null value, will delete the instance of the property for that group.     Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the group to update or insert the properties onto.
        String code = "code_example"; // String | The code of the group to update or insert the properties onto. Together with the scope this uniquely identifies the group.
        Map<String, Property> requestBody = new HashMap(); // Map<String, Property> | The properties to be updated or inserted onto the group. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \"PortfolioGroup/Manager/Id\".
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioGroupProperties result = apiInstance.upsertGroupProperties(scope, code, requestBody).execute(opts);

            PortfolioGroupProperties result = apiInstance.upsertGroupProperties(scope, code, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#upsertGroupProperties");
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
| **scope** | **String**| The scope of the group to update or insert the properties onto. | |
| **code** | **String**| The code of the group to update or insert the properties onto. Together with the scope this uniquely identifies the group. | |
| **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be updated or inserted onto the group. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;. | [optional] |

### Return type

[**PortfolioGroupProperties**](PortfolioGroupProperties.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated or inserted properties |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertPortfolioGroupAccessMetadata

> ResourceListOfAccessMetadataValueOf upsertPortfolioGroupAccessMetadata(scope, code, metadataKey, upsertPortfolioGroupAccessMetadataRequest, effectiveAt, effectiveUntil)

UpsertPortfolioGroupAccessMetadata: Upsert a Portfolio Group Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.

Update or insert one Portfolio Group Access Metadata Entry in a single scope. An item will be updated if it already exists  and inserted if it does not.     The response will return the successfully updated or inserted Portfolio Group Access Metadata rule or failure message if unsuccessful.     It is important to always check to verify success (or failure).     Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfolioGroupsApiExample {

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
        // PortfolioGroupsApi apiInstance = apiFactory.build(PortfolioGroupsApi.class);

        PortfolioGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfolioGroupsApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio Group
        String code = "code_example"; // String | The Portfolio Group code
        String metadataKey = "metadataKey_example"; // String | Key of the access metadata entry to upsert
        UpsertPortfolioGroupAccessMetadataRequest upsertPortfolioGroupAccessMetadataRequest = new UpsertPortfolioGroupAccessMetadataRequest(); // UpsertPortfolioGroupAccessMetadataRequest | The Portfolio Group Access Metadata rule to upsert
        String effectiveAt = "effectiveAt_example"; // String | The date this rule will be effective from
        OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' date of the Access Metadata
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfAccessMetadataValueOf result = apiInstance.upsertPortfolioGroupAccessMetadata(scope, code, metadataKey, upsertPortfolioGroupAccessMetadataRequest, effectiveAt, effectiveUntil).execute(opts);

            ResourceListOfAccessMetadataValueOf result = apiInstance.upsertPortfolioGroupAccessMetadata(scope, code, metadataKey, upsertPortfolioGroupAccessMetadataRequest, effectiveAt, effectiveUntil).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioGroupsApi#upsertPortfolioGroupAccessMetadata");
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
| **scope** | **String**| The scope of the Portfolio Group | |
| **code** | **String**| The Portfolio Group code | |
| **metadataKey** | **String**| Key of the access metadata entry to upsert | |
| **upsertPortfolioGroupAccessMetadataRequest** | [**UpsertPortfolioGroupAccessMetadataRequest**](UpsertPortfolioGroupAccessMetadataRequest.md)| The Portfolio Group Access Metadata rule to upsert | |
| **effectiveAt** | **String**| The date this rule will be effective from | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata | [optional] |

### Return type

[**ResourceListOfAccessMetadataValueOf**](ResourceListOfAccessMetadataValueOf.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted item or any failure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

