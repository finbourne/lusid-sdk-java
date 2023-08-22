# ChartOfAccountsApi

All URIs are relative to *https://example.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChartOfAccounts**](ChartOfAccountsApi.md#createChartOfAccounts) | **POST** /api/chartofaccounts/{scope} | [EXPERIMENTAL] CreateChartOfAccounts: Create a Chart of Accounts |
| [**deleteAccounts**](ChartOfAccountsApi.md#deleteAccounts) | **POST** /api/chartofaccounts/{scope}/{code}/accounts/$delete | [EXPERIMENTAL] DeleteAccounts: Soft or hard delete multiple accounts |
| [**deleteChartOfAccounts**](ChartOfAccountsApi.md#deleteChartOfAccounts) | **DELETE** /api/chartofaccounts/{scope}/{code} | [EXPERIMENTAL] DeleteChartOfAccounts: Delete a Chart of Accounts |
| [**getAccount**](ChartOfAccountsApi.md#getAccount) | **GET** /api/chartofaccounts/{scope}/{code}/accounts/{accountCode} | [EXPERIMENTAL] GetAccount: Get Account |
| [**getChartOfAccounts**](ChartOfAccountsApi.md#getChartOfAccounts) | **GET** /api/chartofaccounts/{scope}/{code} | [EXPERIMENTAL] GetChartOfAccounts: Get ChartOfAccounts |
| [**listAccounts**](ChartOfAccountsApi.md#listAccounts) | **GET** /api/chartofaccounts/{scope}/{code}/accounts | [EXPERIMENTAL] ListAccounts: List Accounts |
| [**listChartsOfAccounts**](ChartOfAccountsApi.md#listChartsOfAccounts) | **GET** /api/chartofaccounts | [EXPERIMENTAL] ListChartsOfAccounts: List chart of accounts |
| [**upsertAccounts**](ChartOfAccountsApi.md#upsertAccounts) | **POST** /api/chartofaccounts/{scope}/{code}/accounts | [EXPERIMENTAL] UpsertAccounts: Upsert Accounts |
| [**upsertAccountsProperties**](ChartOfAccountsApi.md#upsertAccountsProperties) | **POST** /api/chartofaccounts/{scope}/{code}/accounts/{accountCode}/properties/$upsert | [EXPERIMENTAL] UpsertAccountsProperties: Upsert accounts properties |
| [**upsertChartOfAccountsProperties**](ChartOfAccountsApi.md#upsertChartOfAccountsProperties) | **POST** /api/chartofaccounts/{scope}/{code}/properties/$upsert | [EXPERIMENTAL] UpsertChartOfAccountsProperties: Upsert chart of accounts properties |


<a id="createChartOfAccounts"></a>
# **createChartOfAccounts**
> ChartOfAccounts createChartOfAccounts(scope, chartOfAccountsRequest)

[EXPERIMENTAL] CreateChartOfAccounts: Create a Chart of Accounts

Create the given chart of accounts.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    ChartOfAccountsRequest chartOfAccountsRequest = new ChartOfAccountsRequest(); // ChartOfAccountsRequest | The definition of the Chart of Accounts.
    try {
      ChartOfAccounts result = apiInstance.createChartOfAccounts(scope, chartOfAccountsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#createChartOfAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **chartOfAccountsRequest** | [**ChartOfAccountsRequest**](ChartOfAccountsRequest.md)| The definition of the Chart of Accounts. | |

### Return type

[**ChartOfAccounts**](ChartOfAccounts.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created chart of accounts. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteAccounts"></a>
# **deleteAccounts**
> DeleteAccountsResponse deleteAccounts(scope, code, requestBody, deleteMode)

[EXPERIMENTAL] DeleteAccounts: Soft or hard delete multiple accounts

Delete one or more account from the chart of accounts. Soft deletion marks the account as inactive  While the Hard deletion is deleting the account.  The maximum number of accounts that this method can delete per request is 2,000.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the chart of accounts.
    String code = "code_example"; // String | The code of the chart of accounts. Together with the scope this uniquely identifies              the Chart of Accounts.
    List<String> requestBody = ["AccountCode1","AccountCode2"]; // List<String> | The codes of the accounts to delete.
    String deleteMode = "Soft"; // String | The delete mode to use (defaults to 'Soft').
    try {
      DeleteAccountsResponse result = apiInstance.deleteAccounts(scope, code, requestBody, deleteMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#deleteAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the chart of accounts. | |
| **code** | **String**| The code of the chart of accounts. Together with the scope this uniquely identifies              the Chart of Accounts. | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| The codes of the accounts to delete. | |
| **deleteMode** | **String**| The delete mode to use (defaults to &#39;Soft&#39;). | [optional] [enum: Soft, Hard] |

### Return type

[**DeleteAccountsResponse**](DeleteAccountsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the accounts were deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteChartOfAccounts"></a>
# **deleteChartOfAccounts**
> DeletedEntityResponse deleteChartOfAccounts(scope, code)

[EXPERIMENTAL] DeleteChartOfAccounts: Delete a Chart of Accounts

Delete the given chart of accounts.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts to be deleted.
    String code = "code_example"; // String | The code of the Chart of Accounts to be deleted.Together with the scope this uniquely identifies the chart of accounts.
    try {
      DeletedEntityResponse result = apiInstance.deleteChartOfAccounts(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#deleteChartOfAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Chart of Accounts to be deleted. | |
| **code** | **String**| The code of the Chart of Accounts to be deleted.Together with the scope this uniquely identifies the chart of accounts. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the chart of accounts was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getAccount"></a>
# **getAccount**
> Account getAccount(scope, code, accountCode, effectiveAt, asAt, propertyKeys)

[EXPERIMENTAL] GetAccount: Get Account

Retrieve the definition of a particular Account which is part of a Chart of Accounts.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the ChartOfAccounts.
    String code = "code_example"; // String | The code of the ChartOfAccounts. Together with the scope this uniquely identifies the ChartOfAccounts.
    String accountCode = "accountCode_example"; // String | The code of the Account.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Account properties. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Account definition. Defaults to returning the latest version of the Account definition if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Account' domain to decorate onto the Account.              These must take the format {domain}/{scope}/{code}, for example 'Account/Manager/Id'. If not provided will return all the entitled properties for that Account.
    try {
      Account result = apiInstance.getAccount(scope, code, accountCode, effectiveAt, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#getAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the ChartOfAccounts. | |
| **code** | **String**| The code of the ChartOfAccounts. Together with the scope this uniquely identifies the ChartOfAccounts. | |
| **accountCode** | **String**| The code of the Account. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Account properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Account definition. Defaults to returning the latest version of the Account definition if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Account&#39; domain to decorate onto the Account.              These must take the format {domain}/{scope}/{code}, for example &#39;Account/Manager/Id&#39;. If not provided will return all the entitled properties for that Account. | [optional] |

### Return type

[**Account**](Account.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Account definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getChartOfAccounts"></a>
# **getChartOfAccounts**
> ChartOfAccounts getChartOfAccounts(scope, code, effectiveAt, asAt, propertyKeys)

[EXPERIMENTAL] GetChartOfAccounts: Get ChartOfAccounts

Retrieve the definition of a particular ChartOfAccounts.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the ChartOfAccounts.
    String code = "code_example"; // String | The code of the ChartOfAccounts. Together with the scope this uniquely identifies the ChartOfAccounts.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the ChartOfAccounts properties. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the ChartOfAccounts definition. Defaults to returning the latest version of the ChartOfAccounts definition if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'ChartOfAccounts' domain to decorate onto the ChartOfAccounts.              These must take the format {domain}/{scope}/{code}, for example 'ChartOfAccounts/Manager/Id'. If not provided will return all the entitled properties for that ChartOfAccounts.
    try {
      ChartOfAccounts result = apiInstance.getChartOfAccounts(scope, code, effectiveAt, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#getChartOfAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the ChartOfAccounts. | |
| **code** | **String**| The code of the ChartOfAccounts. Together with the scope this uniquely identifies the ChartOfAccounts. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the ChartOfAccounts properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the ChartOfAccounts definition. Defaults to returning the latest version of the ChartOfAccounts definition if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;ChartOfAccounts&#39; domain to decorate onto the ChartOfAccounts.              These must take the format {domain}/{scope}/{code}, for example &#39;ChartOfAccounts/Manager/Id&#39;. If not provided will return all the entitled properties for that ChartOfAccounts. | [optional] |

### Return type

[**ChartOfAccounts**](ChartOfAccounts.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested ChartOfAccounts definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listAccounts"></a>
# **listAccounts**
> PagedResourceListOfAccount listAccounts(scope, code, effectiveAt, asAt, page, start, limit, filter, propertyKeys)

[EXPERIMENTAL] ListAccounts: List Accounts

List the accounts in a chart of accounts

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the chart of accounts.
    String code = "code_example"; // String | The code of the chart of accounts. Together with the scope this uniquely identifies              the chart of accounts.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the TimeVariant properties decorated on Accounts. Defaults to the current LUSID              system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Accounts. Defaults to              returning the latest version if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing charts of accounts; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.              For example, to filter on the Account type, specify \"code eq '001'\". For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Account' domain to decorate onto the Account.              These must have the format {domain}/{scope}/{code}, for example 'Account/system/Name'.
    try {
      PagedResourceListOfAccount result = apiInstance.listAccounts(scope, code, effectiveAt, asAt, page, start, limit, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#listAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the chart of accounts. | |
| **code** | **String**| The code of the chart of accounts. Together with the scope this uniquely identifies              the chart of accounts. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the TimeVariant properties decorated on Accounts. Defaults to the current LUSID              system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Accounts. Defaults to              returning the latest version if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing charts of accounts; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.              For example, to filter on the Account type, specify \&quot;code eq &#39;001&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Account&#39; domain to decorate onto the Account.              These must have the format {domain}/{scope}/{code}, for example &#39;Account/system/Name&#39;. | [optional] |

### Return type

[**PagedResourceListOfAccount**](PagedResourceListOfAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The accounts in the given chart of accounts. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listChartsOfAccounts"></a>
# **listChartsOfAccounts**
> PagedResourceListOfChartOfAccounts listChartsOfAccounts(effectiveAt, asAt, page, start, limit, filter, propertyKeys)

[EXPERIMENTAL] ListChartsOfAccounts: List chart of accounts

List all the charts of accounts matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the TimeVariant properties for the Chart Of Accounts. Defaults to the current LUSID              system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the charts of accounts. Defaults to returning the latest version              of each chart of accounts if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing charts of accounts; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.              For example, to filter on the ChartOfAccounts type, specify \"id.Code eq '001'\". For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'ChartOfAccounts' domain to decorate onto each chart of accounts.              These must take the format {domain}/{scope}/{code}, for example 'ChartOfAccounts/Manager/Id'.
    try {
      PagedResourceListOfChartOfAccounts result = apiInstance.listChartsOfAccounts(effectiveAt, asAt, page, start, limit, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#listChartsOfAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the TimeVariant properties for the Chart Of Accounts. Defaults to the current LUSID              system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the charts of accounts. Defaults to returning the latest version              of each chart of accounts if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing charts of accounts; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.              For example, to filter on the ChartOfAccounts type, specify \&quot;id.Code eq &#39;001&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;ChartOfAccounts&#39; domain to decorate onto each chart of accounts.              These must take the format {domain}/{scope}/{code}, for example &#39;ChartOfAccounts/Manager/Id&#39;. | [optional] |

### Return type

[**PagedResourceListOfChartOfAccounts**](PagedResourceListOfChartOfAccounts.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested charts of accounts |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertAccounts"></a>
# **upsertAccounts**
> AccountsUpsertResponse upsertAccounts(scope, code, account)

[EXPERIMENTAL] UpsertAccounts: Upsert Accounts

Create or update accounts in the chart of accounts. An account will be updated  if it already exists and created if it does not.  The maximum number of accounts that this method can upsert per request is 2,000.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the chart of accounts.
    String code = "code_example"; // String | The code of the chart of accounts. Together with the scope this uniquely identifies              the chart of accounts.
    List<Account> account = Arrays.asList(); // List<Account> | A list of accounts to be created or updated.
    try {
      AccountsUpsertResponse result = apiInstance.upsertAccounts(scope, code, account);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#upsertAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the chart of accounts. | |
| **code** | **String**| The code of the chart of accounts. Together with the scope this uniquely identifies              the chart of accounts. | |
| **account** | [**List&lt;Account&gt;**](Account.md)| A list of accounts to be created or updated. | |

### Return type

[**AccountsUpsertResponse**](AccountsUpsertResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly upserted accounts. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertAccountsProperties"></a>
# **upsertAccountsProperties**
> AccountProperties upsertAccountsProperties(scope, code, accountCode, requestBody)

[EXPERIMENTAL] UpsertAccountsProperties: Upsert accounts properties

Update or insert one or more properties onto a single account. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;Account&#39;.                Upserting a property that exists for an account, with a null value, will delete the instance of the property for that group.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts to update or insert the properties onto.
    String code = "code_example"; // String | The code of the Chart of Accounts to update or insert the properties onto. Together with the scope this uniquely identifies the chart of accounts.
    String accountCode = "accountCode_example"; // String | The unique ID of the account to create or update properties for.
    Map<String, Property> requestBody = new HashMap(); // Map<String, Property> | The properties to be updated or inserted onto the chart of account. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \"Account/Manager/Id\".
    try {
      AccountProperties result = apiInstance.upsertAccountsProperties(scope, code, accountCode, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#upsertAccountsProperties");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Chart of Accounts to update or insert the properties onto. | |
| **code** | **String**| The code of the Chart of Accounts to update or insert the properties onto. Together with the scope this uniquely identifies the chart of accounts. | |
| **accountCode** | **String**| The unique ID of the account to create or update properties for. | |
| **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be updated or inserted onto the chart of account. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;Account/Manager/Id\&quot;. | [optional] |

### Return type

[**AccountProperties**](AccountProperties.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated or inserted properties |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertChartOfAccountsProperties"></a>
# **upsertChartOfAccountsProperties**
> ChartOfAccountsProperties upsertChartOfAccountsProperties(scope, code, requestBody)

[EXPERIMENTAL] UpsertChartOfAccountsProperties: Upsert chart of accounts properties

Update or insert one or more properties onto a single chart of accounts. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;ChartOfAccounts&#39;.                Upserting a property that exists for a chart of accounts, with a null value, will delete the instance of the property for that group.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts to update or insert the properties onto.
    String code = "code_example"; // String | The code of the Chart of Accounts to update or insert the properties onto. Together with the scope this uniquely identifies the chart of accounts.
    Map<String, Property> requestBody = new HashMap(); // Map<String, Property> | The properties to be updated or inserted onto the chart of account. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \"ChartOfAccounts/Manager/Id\".
    try {
      ChartOfAccountsProperties result = apiInstance.upsertChartOfAccountsProperties(scope, code, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#upsertChartOfAccountsProperties");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Chart of Accounts to update or insert the properties onto. | |
| **code** | **String**| The code of the Chart of Accounts to update or insert the properties onto. Together with the scope this uniquely identifies the chart of accounts. | |
| **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be updated or inserted onto the chart of account. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;ChartOfAccounts/Manager/Id\&quot;. | [optional] |

### Return type

[**ChartOfAccountsProperties**](ChartOfAccountsProperties.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated or inserted properties |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

