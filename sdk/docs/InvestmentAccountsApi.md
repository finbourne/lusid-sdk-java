# InvestmentAccountsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInvestmentAccount**](InvestmentAccountsApi.md#getInvestmentAccount) | **GET** /api/investmentaccounts/{identifierType}/{identifierValue} | [EXPERIMENTAL] GetInvestmentAccount: Get Investment Account |
| [**listAllInvestmentAccounts**](InvestmentAccountsApi.md#listAllInvestmentAccounts) | **GET** /api/investmentaccounts | [EXPERIMENTAL] ListAllInvestmentAccounts: List Investment Accounts |
| [**upsertInvestmentAccounts**](InvestmentAccountsApi.md#upsertInvestmentAccounts) | **POST** /api/investmentaccounts/$batchUpsert | [EXPERIMENTAL] UpsertInvestmentAccounts: Upsert Investment Accounts |



## getInvestmentAccount

> InvestmentAccount getInvestmentAccount(identifierType, identifierValue, scope, identifierScope, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds)

[EXPERIMENTAL] GetInvestmentAccount: Get Investment Account

Retrieve the definition of an investment account.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InvestmentAccountsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InvestmentAccountsApiExample {

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
        // InvestmentAccountsApi apiInstance = apiFactory.build(InvestmentAccountsApi.class);

        InvestmentAccountsApi apiInstance = ApiFactoryBuilder.build(fileName).build(InvestmentAccountsApi.class);
        String identifierType = "identifierType_example"; // String | Code of the investment account identifier type.
        String identifierValue = "identifierValue_example"; // String | Code of the investment account under specified identifier type's scope and code.
        String scope = "scope_example"; // String | The scope of the investment account entity.
        String identifierScope = "identifierScope_example"; // String | Scope of the investment account identifier type.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys or identifier types (as property keys) from the \"InvestmentAccount\" domain  to include for found investment account, or from any domain that supports relationships to decorate onto related entities.  These take the format {domain}/{scope}/{code} e.g. \"InvestmentAccount/ContactDetails/Address\".
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the investment account. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the investment account. Defaults to return the latest version of the investment account if not specified.
        List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities  onto the investment account in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
        try {
            // uncomment the below to set overrides at the request level
            // InvestmentAccount result = apiInstance.getInvestmentAccount(identifierType, identifierValue, scope, identifierScope, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds).execute(opts);

            InvestmentAccount result = apiInstance.getInvestmentAccount(identifierType, identifierValue, scope, identifierScope, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentAccountsApi#getInvestmentAccount");
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
| **identifierType** | **String**| Code of the investment account identifier type. | |
| **identifierValue** | **String**| Code of the investment account under specified identifier type&#39;s scope and code. | |
| **scope** | **String**| The scope of the investment account entity. | |
| **identifierScope** | **String**| Scope of the investment account identifier type. | |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys or identifier types (as property keys) from the \&quot;InvestmentAccount\&quot; domain  to include for found investment account, or from any domain that supports relationships to decorate onto related entities.  These take the format {domain}/{scope}/{code} e.g. \&quot;InvestmentAccount/ContactDetails/Address\&quot;. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the investment account. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the investment account. Defaults to return the latest version of the investment account if not specified. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities  onto the investment account in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**InvestmentAccount**](InvestmentAccount.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested investment account |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listAllInvestmentAccounts

> ResourceListOfInvestmentAccount listAllInvestmentAccounts(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds)

[EXPERIMENTAL] ListAllInvestmentAccounts: List Investment Accounts

List all investment accounts which the user is entitled to see.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InvestmentAccountsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InvestmentAccountsApiExample {

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
        // InvestmentAccountsApi apiInstance = apiFactory.build(InvestmentAccountsApi.class);

        InvestmentAccountsApi apiInstance = ApiFactoryBuilder.build(fileName).build(InvestmentAccountsApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the investment accounts. Defaults to the current LUSID  system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the investment accounts. Defaults to return the latest version  of each investment accounts if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing investment accounts from a previous call to list investment accounts. This value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 5000 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys or identifier types (as property keys) from the \"InvestmentAccount\" domain  to include for each investment account, or from any domain that supports relationships to decorate onto related entities.  These take the format {domain}/{scope}/{code} e.g. \"InvestmentAccount/ContactDetails/Address\".
        List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities  onto each investment account in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfInvestmentAccount result = apiInstance.listAllInvestmentAccounts(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds).execute(opts);

            ResourceListOfInvestmentAccount result = apiInstance.listAllInvestmentAccounts(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentAccountsApi#listAllInvestmentAccounts");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the investment accounts. Defaults to the current LUSID  system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the investment accounts. Defaults to return the latest version  of each investment accounts if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing investment accounts from a previous call to list investment accounts. This value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 5000 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys or identifier types (as property keys) from the \&quot;InvestmentAccount\&quot; domain  to include for each investment account, or from any domain that supports relationships to decorate onto related entities.  These take the format {domain}/{scope}/{code} e.g. \&quot;InvestmentAccount/ContactDetails/Address\&quot;. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities  onto each investment account in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**ResourceListOfInvestmentAccount**](ResourceListOfInvestmentAccount.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All existing Investment Accounts |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertInvestmentAccounts

> UpsertInvestmentAccountsResponse upsertInvestmentAccounts(successMode, requestBody)

[EXPERIMENTAL] UpsertInvestmentAccounts: Upsert Investment Accounts

Creates or updates a collection of Investment Accounts

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InvestmentAccountsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InvestmentAccountsApiExample {

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
        // InvestmentAccountsApi apiInstance = apiFactory.build(InvestmentAccountsApi.class);

        InvestmentAccountsApi apiInstance = ApiFactoryBuilder.build(fileName).build(InvestmentAccountsApi.class);
        String successMode = "successMode_example"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial
        Map<String, UpsertInvestmentAccountRequest> requestBody = new HashMap(); // Map<String, UpsertInvestmentAccountRequest> | A collection of requests to create or update Investment Accounts.
        try {
            // uncomment the below to set overrides at the request level
            // UpsertInvestmentAccountsResponse result = apiInstance.upsertInvestmentAccounts(successMode, requestBody).execute(opts);

            UpsertInvestmentAccountsResponse result = apiInstance.upsertInvestmentAccounts(successMode, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentAccountsApi#upsertInvestmentAccounts");
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
| **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial | |
| **requestBody** | [**Map&lt;String, UpsertInvestmentAccountRequest&gt;**](UpsertInvestmentAccountRequest.md)| A collection of requests to create or update Investment Accounts. | |

### Return type

[**UpsertInvestmentAccountsResponse**](UpsertInvestmentAccountsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The successfully created or updated Investment Accounts along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

