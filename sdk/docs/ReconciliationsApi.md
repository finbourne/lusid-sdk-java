# ReconciliationsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createScheduledReconciliation**](ReconciliationsApi.md#createScheduledReconciliation) | **POST** /api/portfolios/$scheduledReconciliations/{scope} | [EXPERIMENTAL] CreateScheduledReconciliation: Create a scheduled reconciliation |
| [**deleteReconciliation**](ReconciliationsApi.md#deleteReconciliation) | **DELETE** /api/portfolios/$scheduledReconciliations/{scope}/{code} | [EXPERIMENTAL] DeleteReconciliation: Delete scheduled reconciliation |
| [**deleteReconciliationBreak**](ReconciliationsApi.md#deleteReconciliationBreak) | **DELETE** /api/portfolios/$scheduledReconciliations/{scope}/{code}/runs/{runDate}/{version}/breaks/{breakId} | [EXPERIMENTAL] DeleteReconciliationBreak: Delete reconciliation break |
| [**deleteReconciliationMapping**](ReconciliationsApi.md#deleteReconciliationMapping) | **DELETE** /api/portfolios/mapping/{scope}/{code} | [EARLY ACCESS] DeleteReconciliationMapping: Delete a mapping |
| [**deleteReconciliationRun**](ReconciliationsApi.md#deleteReconciliationRun) | **DELETE** /api/portfolios/$scheduledReconciliations/{scope}/{code}/runs/{runDate}/{version} | [EXPERIMENTAL] DeleteReconciliationRun: Delete reconciliation run |
| [**getReconciliation**](ReconciliationsApi.md#getReconciliation) | **GET** /api/portfolios/$scheduledReconciliations/{scope}/{code} | [EXPERIMENTAL] GetReconciliation: Get scheduled reconciliation |
| [**getReconciliationBreak**](ReconciliationsApi.md#getReconciliationBreak) | **GET** /api/portfolios/$scheduledReconciliations/{scope}/{code}/runs/{runDate}/{version}/breaks/{breakId} | [EXPERIMENTAL] GetReconciliationBreak: Get reconciliation break |
| [**getReconciliationMapping**](ReconciliationsApi.md#getReconciliationMapping) | **GET** /api/portfolios/mapping/{scope}/{code} | [EARLY ACCESS] GetReconciliationMapping: Get a mapping |
| [**getReconciliationRun**](ReconciliationsApi.md#getReconciliationRun) | **GET** /api/portfolios/$scheduledReconciliations/{scope}/{code}/runs/{runDate}/{version} | [EXPERIMENTAL] GetReconciliationRun: Get a reconciliation run |
| [**listReconciliationBreaks**](ReconciliationsApi.md#listReconciliationBreaks) | **GET** /api/portfolios/$scheduledReconciliations/{scope}/{code}/runs/{runDate}/{version}/breaks | [EXPERIMENTAL] ListReconciliationBreaks: List reconciliation breaks |
| [**listReconciliationMappings**](ReconciliationsApi.md#listReconciliationMappings) | **GET** /api/portfolios/mapping | [EARLY ACCESS] ListReconciliationMappings: List the reconciliation mappings |
| [**listReconciliationRuns**](ReconciliationsApi.md#listReconciliationRuns) | **GET** /api/portfolios/$scheduledReconciliations/{scope}/{code}/runs | [EXPERIMENTAL] ListReconciliationRuns: List Reconciliation runs |
| [**listReconciliations**](ReconciliationsApi.md#listReconciliations) | **GET** /api/portfolios/$scheduledReconciliations | [EXPERIMENTAL] ListReconciliations: List scheduled reconciliations |
| [**reconcileGeneric**](ReconciliationsApi.md#reconcileGeneric) | **POST** /api/portfolios/$reconcileGeneric | ReconcileGeneric: Reconcile either holdings or valuations performed on one or two sets of holdings using one or two configuration recipes.     The output is configurable for various types of comparisons, to allow tolerances on numerical and date-time data or case-insensitivity on strings,  and elision of resulting differences where they are &#39;empty&#39; or null or zero. |
| [**reconcileHoldings**](ReconciliationsApi.md#reconcileHoldings) | **POST** /api/portfolios/$reconcileholdings | [EARLY ACCESS] ReconcileHoldings: Reconcile portfolio holdings |
| [**reconcileInline**](ReconciliationsApi.md#reconcileInline) | **POST** /api/portfolios/$reconcileInline | ReconcileInline: Reconcile valuations performed on one or two sets of inline instruments using one or two configuration recipes. |
| [**reconcileTransactions**](ReconciliationsApi.md#reconcileTransactions) | **POST** /api/portfolios/$reconcileTransactions | [EARLY ACCESS] ReconcileTransactions: Perform a Transactions Reconciliation. |
| [**reconcileTransactionsV2**](ReconciliationsApi.md#reconcileTransactionsV2) | **POST** /api/portfolios/$reconcileTransactionsV2 | [EXPERIMENTAL] ReconcileTransactionsV2: Perform a Transactions Reconciliation. |
| [**reconcileValuation**](ReconciliationsApi.md#reconcileValuation) | **POST** /api/portfolios/$reconcileValuation | ReconcileValuation: Reconcile valuations performed on one or two sets of holdings using one or two configuration recipes. |
| [**updateReconciliation**](ReconciliationsApi.md#updateReconciliation) | **POST** /api/portfolios/$scheduledReconciliations/{scope}/{code} | [EXPERIMENTAL] UpdateReconciliation: Update scheduled reconciliation |
| [**upsertReconciliationBreak**](ReconciliationsApi.md#upsertReconciliationBreak) | **POST** /api/portfolios/$scheduledReconciliations/{scope}/{code}/runs/{runDate}/{version} | [EXPERIMENTAL] UpsertReconciliationBreak: Upsert a reconciliation break |
| [**upsertReconciliationMapping**](ReconciliationsApi.md#upsertReconciliationMapping) | **POST** /api/portfolios/mapping | [EARLY ACCESS] UpsertReconciliationMapping: Create or update a mapping |
| [**upsertReconciliationRun**](ReconciliationsApi.md#upsertReconciliationRun) | **POST** /api/portfolios/$scheduledReconciliations/{scope}/{code}/runs | [EXPERIMENTAL] UpsertReconciliationRun: Update or Create a reconciliation run |


<a id="createScheduledReconciliation"></a>
# **createScheduledReconciliation**
> Reconciliation createScheduledReconciliation(scope).createReconciliationRequest(createReconciliationRequest).execute();

[EXPERIMENTAL] CreateScheduledReconciliation: Create a scheduled reconciliation

Create a scheduled reconciliation for the given request

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the reconciliation
    CreateReconciliationRequest createReconciliationRequest = new CreateReconciliationRequest(); // CreateReconciliationRequest | The definition of the reconciliation
    try {
      Reconciliation result = apiInstance.createScheduledReconciliation(scope)
            .createReconciliationRequest(createReconciliationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#createScheduledReconciliation");
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
| **scope** | **String**| The scope of the reconciliation | |
| **createReconciliationRequest** | [**CreateReconciliationRequest**](CreateReconciliationRequest.md)| The definition of the reconciliation | [optional] |

### Return type

[**Reconciliation**](Reconciliation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created scheduled reconciliation |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteReconciliation"></a>
# **deleteReconciliation**
> DeletedEntityResponse deleteReconciliation(scope, code).execute();

[EXPERIMENTAL] DeleteReconciliation: Delete scheduled reconciliation

Delete the given scheduled reconciliation

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the scheduled reconciliation
    String code = "code_example"; // String | The code of the scheduled reconciliation
    try {
      DeletedEntityResponse result = apiInstance.deleteReconciliation(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#deleteReconciliation");
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
| **scope** | **String**| The scope of the scheduled reconciliation | |
| **code** | **String**| The code of the scheduled reconciliation | |

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
| **200** | The reconciliation at the requested as at was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteReconciliationBreak"></a>
# **deleteReconciliationBreak**
> DeletedEntityResponse deleteReconciliationBreak(scope, code, runDate, version, breakId).execute();

[EXPERIMENTAL] DeleteReconciliationBreak: Delete reconciliation break

Delete the given reconciliation break

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the reconciliation associated with the break
    String code = "code_example"; // String | The code of the reconciliation associated with the break
    OffsetDateTime runDate = OffsetDateTime.now(); // OffsetDateTime | The date of the run associated with the break
    Integer version = 56; // Integer | The version number of the run associated with the break
    String breakId = "breakId_example"; // String | The unique identifier for the break
    try {
      DeletedEntityResponse result = apiInstance.deleteReconciliationBreak(scope, code, runDate, version, breakId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#deleteReconciliationBreak");
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
| **scope** | **String**| The scope of the reconciliation associated with the break | |
| **code** | **String**| The code of the reconciliation associated with the break | |
| **runDate** | **OffsetDateTime**| The date of the run associated with the break | |
| **version** | **Integer**| The version number of the run associated with the break | |
| **breakId** | **String**| The unique identifier for the break | |

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
| **200** | The datetime that the reconciliation break was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteReconciliationMapping"></a>
# **deleteReconciliationMapping**
> String deleteReconciliationMapping(scope, code).execute();

[EARLY ACCESS] DeleteReconciliationMapping: Delete a mapping

Deletes the mapping identified by the scope and code

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the mapping.
    String code = "code_example"; // String | The code fof the mapping.
    try {
      String result = apiInstance.deleteReconciliationMapping(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#deleteReconciliationMapping");
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
| **scope** | **String**| The scope of the mapping. | |
| **code** | **String**| The code fof the mapping. | |

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A string specifying the scope and code that were deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteReconciliationRun"></a>
# **deleteReconciliationRun**
> DeletedEntityResponse deleteReconciliationRun(scope, code, runDate, version).execute();

[EXPERIMENTAL] DeleteReconciliationRun: Delete reconciliation run

Delete the given reconciliation run

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the reconciliation associated with the run
    String code = "code_example"; // String | The code of the reconciliation associated with the run
    OffsetDateTime runDate = OffsetDateTime.now(); // OffsetDateTime | The date of the reconciliation run
    Integer version = 56; // Integer | The version number of the reconciliation run
    try {
      DeletedEntityResponse result = apiInstance.deleteReconciliationRun(scope, code, runDate, version)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#deleteReconciliationRun");
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
| **scope** | **String**| The scope of the reconciliation associated with the run | |
| **code** | **String**| The code of the reconciliation associated with the run | |
| **runDate** | **OffsetDateTime**| The date of the reconciliation run | |
| **version** | **Integer**| The version number of the reconciliation run | |

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
| **200** | The datetime that the reconciliation run was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getReconciliation"></a>
# **getReconciliation**
> Reconciliation getReconciliation(scope, code).effectiveAt(effectiveAt).asAt(asAt).propertyKeys(propertyKeys).execute();

[EXPERIMENTAL] GetReconciliation: Get scheduled reconciliation

Get the requested scheduled reconciliation

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the scheduled reconciliation
    String code = "code_example"; // String | The code of the scheduled reconciliation
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the scheduled reconciliation. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the scheduled reconciliation. Defaults to returning the latest version of the reconciliation if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Reconciliation' property domain to decorate onto the reconciliation.   These must take the form {domain}/{scope}/{code}, for example 'Reconciliation/Broker/Id'.
    try {
      Reconciliation result = apiInstance.getReconciliation(scope, code)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .propertyKeys(propertyKeys)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#getReconciliation");
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
| **scope** | **String**| The scope of the scheduled reconciliation | |
| **code** | **String**| The code of the scheduled reconciliation | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the scheduled reconciliation. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the scheduled reconciliation. Defaults to returning the latest version of the reconciliation if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Reconciliation&#39; property domain to decorate onto the reconciliation.   These must take the form {domain}/{scope}/{code}, for example &#39;Reconciliation/Broker/Id&#39;. | [optional] |

### Return type

[**Reconciliation**](Reconciliation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested scheduled reconciliation |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getReconciliationBreak"></a>
# **getReconciliationBreak**
> ReconciliationRunBreak getReconciliationBreak(scope, code, runDate, version, breakId).asAt(asAt).execute();

[EXPERIMENTAL] GetReconciliationBreak: Get reconciliation break

Get the requested reconciliation break

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the reconciliation associated with the break
    String code = "code_example"; // String | The code of the reconciliation associated with the break
    OffsetDateTime runDate = OffsetDateTime.now(); // OffsetDateTime | The date of the run associated with the break
    Integer version = 56; // Integer | The version number of the run associated with the break
    String breakId = "breakId_example"; // String | The unique identifier for the break
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the reconciliation break. Defaults to returning the latest version of the reconciliation break if not specified.
    try {
      ReconciliationRunBreak result = apiInstance.getReconciliationBreak(scope, code, runDate, version, breakId)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#getReconciliationBreak");
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
| **scope** | **String**| The scope of the reconciliation associated with the break | |
| **code** | **String**| The code of the reconciliation associated with the break | |
| **runDate** | **OffsetDateTime**| The date of the run associated with the break | |
| **version** | **Integer**| The version number of the run associated with the break | |
| **breakId** | **String**| The unique identifier for the break | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the reconciliation break. Defaults to returning the latest version of the reconciliation break if not specified. | [optional] |

### Return type

[**ReconciliationRunBreak**](ReconciliationRunBreak.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested reconciliation break |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getReconciliationMapping"></a>
# **getReconciliationMapping**
> Mapping getReconciliationMapping(scope, code).execute();

[EARLY ACCESS] GetReconciliationMapping: Get a mapping

Gets a mapping identified by the given scope and code

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the mapping.
    String code = "code_example"; // String | The code of the mapping.
    try {
      Mapping result = apiInstance.getReconciliationMapping(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#getReconciliationMapping");
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
| **scope** | **String**| The scope of the mapping. | |
| **code** | **String**| The code of the mapping. | |

### Return type

[**Mapping**](Mapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The mapping with the specified scope/code. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getReconciliationRun"></a>
# **getReconciliationRun**
> ReconciliationRun getReconciliationRun(scope, code, runDate, version).effectiveAt(effectiveAt).asAt(asAt).execute();

[EXPERIMENTAL] GetReconciliationRun: Get a reconciliation run

Get the requested reconciliation run

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the reconciliation associated with the run
    String code = "code_example"; // String | The code of the reconciliation associated with the run
    OffsetDateTime runDate = OffsetDateTime.now(); // OffsetDateTime | The date of the run
    Integer version = 56; // Integer | The version number of the run
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the reconciliation run. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the reconciliation run. Defaults to returning the latest version of the reconciliation run if not specified.
    try {
      ReconciliationRun result = apiInstance.getReconciliationRun(scope, code, runDate, version)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#getReconciliationRun");
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
| **scope** | **String**| The scope of the reconciliation associated with the run | |
| **code** | **String**| The code of the reconciliation associated with the run | |
| **runDate** | **OffsetDateTime**| The date of the run | |
| **version** | **Integer**| The version number of the run | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the reconciliation run. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the reconciliation run. Defaults to returning the latest version of the reconciliation run if not specified. | [optional] |

### Return type

[**ReconciliationRun**](ReconciliationRun.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested reconciliation run |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listReconciliationBreaks"></a>
# **listReconciliationBreaks**
> PagedResourceListOfReconciliationRunBreak listReconciliationBreaks(scope, code, runDate, version).effectiveAt(effectiveAt).asAt(asAt).page(page).start(start).limit(limit).filter(filter).execute();

[EXPERIMENTAL] ListReconciliationBreaks: List reconciliation breaks

List all reconciliation breaks associated with a given run

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the reconciliation associated with the break
    String code = "code_example"; // String | The code of the reconciliation associated with the break
    OffsetDateTime runDate = OffsetDateTime.now(); // OffsetDateTime | The date of the run associated with the break
    Integer version = 56; // Integer | The version number of the run associated with the break
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the reconciliation runs. Defaults to the current LUSID   system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the reconciliation runs. Defaults to returning the latest version   of each run if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing reconciliation runs; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.
    try {
      PagedResourceListOfReconciliationRunBreak result = apiInstance.listReconciliationBreaks(scope, code, runDate, version)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .page(page)
            .start(start)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#listReconciliationBreaks");
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
| **scope** | **String**| The scope of the reconciliation associated with the break | |
| **code** | **String**| The code of the reconciliation associated with the break | |
| **runDate** | **OffsetDateTime**| The date of the run associated with the break | |
| **version** | **Integer**| The version number of the run associated with the break | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the reconciliation runs. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the reconciliation runs. Defaults to returning the latest version   of each run if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing reconciliation runs; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. | [optional] |

### Return type

[**PagedResourceListOfReconciliationRunBreak**](PagedResourceListOfReconciliationRunBreak.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested reconciliation breaks |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listReconciliationMappings"></a>
# **listReconciliationMappings**
> ResourceListOfMapping listReconciliationMappings().reconciliationType(reconciliationType).execute();

[EARLY ACCESS] ListReconciliationMappings: List the reconciliation mappings

Lists all mappings this user is entitled to see

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String reconciliationType = "reconciliationType_example"; // String | Optional parameter to specify which type of mappings should be returned.  Defaults to Transaction if not provided.
    try {
      ResourceListOfMapping result = apiInstance.listReconciliationMappings()
            .reconciliationType(reconciliationType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#listReconciliationMappings");
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
| **reconciliationType** | **String**| Optional parameter to specify which type of mappings should be returned.  Defaults to Transaction if not provided. | [optional] |

### Return type

[**ResourceListOfMapping**](ResourceListOfMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The mappings that the caller has access to. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listReconciliationRuns"></a>
# **listReconciliationRuns**
> PagedResourceListOfReconciliationRun listReconciliationRuns(scope, code).effectiveAt(effectiveAt).asAt(asAt).page(page).start(start).limit(limit).filter(filter).execute();

[EXPERIMENTAL] ListReconciliationRuns: List Reconciliation runs

List all runs for a given reconciliation

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the reconciliation
    String code = "code_example"; // String | The code of the reconciliation
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the reconciliation runs. Defaults to the current LUSID   system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the reconciliation runs. Defaults to returning the latest version   of each run if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing reconciliation runs; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the run date, specify \"Date eq 10/03/2018\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    try {
      PagedResourceListOfReconciliationRun result = apiInstance.listReconciliationRuns(scope, code)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .page(page)
            .start(start)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#listReconciliationRuns");
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
| **scope** | **String**| The scope of the reconciliation | |
| **code** | **String**| The code of the reconciliation | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the reconciliation runs. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the reconciliation runs. Defaults to returning the latest version   of each run if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing reconciliation runs; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the run date, specify \&quot;Date eq 10/03/2018\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |

### Return type

[**PagedResourceListOfReconciliationRun**](PagedResourceListOfReconciliationRun.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested reconciliation runs |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listReconciliations"></a>
# **listReconciliations**
> PagedResourceListOfReconciliation listReconciliations().effectiveAt(effectiveAt).asAt(asAt).page(page).start(start).limit(limit).filter(filter).propertyKeys(propertyKeys).execute();

[EXPERIMENTAL] ListReconciliations: List scheduled reconciliations

List all the scheduled reconciliations matching particular criteria

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the TimeVariant properties for the reconciliation. Defaults to the current LUSID   system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the reconciliation. Defaults to returning the latest version   of each reconciliation if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing reconciliations; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the reconciliation type, specify \"id.Code eq '001'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Reconciliation' domain to decorate onto each reconciliation.   These must take the format {domain}/{scope}/{code}, for example 'Reconciliation/Broker/Id'.
    try {
      PagedResourceListOfReconciliation result = apiInstance.listReconciliations()
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .page(page)
            .start(start)
            .limit(limit)
            .filter(filter)
            .propertyKeys(propertyKeys)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#listReconciliations");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the TimeVariant properties for the reconciliation. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the reconciliation. Defaults to returning the latest version   of each reconciliation if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing reconciliations; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the reconciliation type, specify \&quot;id.Code eq &#39;001&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Reconciliation&#39; domain to decorate onto each reconciliation.   These must take the format {domain}/{scope}/{code}, for example &#39;Reconciliation/Broker/Id&#39;. | [optional] |

### Return type

[**PagedResourceListOfReconciliation**](PagedResourceListOfReconciliation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all scheduled reconciliations |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="reconcileGeneric"></a>
# **reconcileGeneric**
> ReconciliationResponse reconcileGeneric().reconciliationRequest(reconciliationRequest).execute();

ReconcileGeneric: Reconcile either holdings or valuations performed on one or two sets of holdings using one or two configuration recipes.     The output is configurable for various types of comparisons, to allow tolerances on numerical and date-time data or case-insensitivity on strings,  and elision of resulting differences where they are &#39;empty&#39; or null or zero.

Perform evaluation of one or two set of holdings (a portfolio of instruments) using one or two (potentially different) configuration recipes.  Produce a breakdown of the resulting differences in evaluation that can be iterated through.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    ReconciliationRequest reconciliationRequest = new ReconciliationRequest(); // ReconciliationRequest | The specifications of the inputs to the reconciliation
    try {
      ReconciliationResponse result = apiInstance.reconcileGeneric()
            .reconciliationRequest(reconciliationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#reconcileGeneric");
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
| **reconciliationRequest** | [**ReconciliationRequest**](ReconciliationRequest.md)| The specifications of the inputs to the reconciliation | [optional] |

### Return type

[**ReconciliationResponse**](ReconciliationResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested reconciliation |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="reconcileHoldings"></a>
# **reconcileHoldings**
> ResourceListOfReconciliationBreak reconcileHoldings().sortBy(sortBy).start(start).limit(limit).filter(filter).portfoliosReconciliationRequest(portfoliosReconciliationRequest).execute();

[EARLY ACCESS] ReconcileHoldings: Reconcile portfolio holdings

Reconcile the holdings of two portfolios.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
    Integer start = 56; // Integer | Optional. When paginating, skip this number of results
    Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Optional. Expression to filter the result set.   For example, to filter on the left portfolio Code, use \"left.portfolioId.code eq 'string'\"   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    PortfoliosReconciliationRequest portfoliosReconciliationRequest = new PortfoliosReconciliationRequest(); // PortfoliosReconciliationRequest | The specifications of the inputs to the reconciliation
    try {
      ResourceListOfReconciliationBreak result = apiInstance.reconcileHoldings()
            .sortBy(sortBy)
            .start(start)
            .limit(limit)
            .filter(filter)
            .portfoliosReconciliationRequest(portfoliosReconciliationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#reconcileHoldings");
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
| **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **start** | **Integer**| Optional. When paginating, skip this number of results | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set.   For example, to filter on the left portfolio Code, use \&quot;left.portfolioId.code eq &#39;string&#39;\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **portfoliosReconciliationRequest** | [**PortfoliosReconciliationRequest**](PortfoliosReconciliationRequest.md)| The specifications of the inputs to the reconciliation | [optional] |

### Return type

[**ResourceListOfReconciliationBreak**](ResourceListOfReconciliationBreak.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested reconciliation |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="reconcileInline"></a>
# **reconcileInline**
> ListAggregationReconciliation reconcileInline().inlineValuationsReconciliationRequest(inlineValuationsReconciliationRequest).execute();

ReconcileInline: Reconcile valuations performed on one or two sets of inline instruments using one or two configuration recipes.

Perform valuation of one or two set of inline instruments using different one or two configuration recipes. Produce a breakdown of the resulting differences in valuation.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    InlineValuationsReconciliationRequest inlineValuationsReconciliationRequest = new InlineValuationsReconciliationRequest(); // InlineValuationsReconciliationRequest | The specifications of the inputs to the reconciliation
    try {
      ListAggregationReconciliation result = apiInstance.reconcileInline()
            .inlineValuationsReconciliationRequest(inlineValuationsReconciliationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#reconcileInline");
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
| **inlineValuationsReconciliationRequest** | [**InlineValuationsReconciliationRequest**](InlineValuationsReconciliationRequest.md)| The specifications of the inputs to the reconciliation | [optional] |

### Return type

[**ListAggregationReconciliation**](ListAggregationReconciliation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested reconciliation |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="reconcileTransactions"></a>
# **reconcileTransactions**
> TransactionsReconciliationsResponse reconcileTransactions().transactionReconciliationRequest(transactionReconciliationRequest).execute();

[EARLY ACCESS] ReconcileTransactions: Perform a Transactions Reconciliation.

Evaluates two sets of transactions to determine which transactions from each set likely match  using the rules of a specified mapping.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    TransactionReconciliationRequest transactionReconciliationRequest = new TransactionReconciliationRequest(); // TransactionReconciliationRequest | 
    try {
      TransactionsReconciliationsResponse result = apiInstance.reconcileTransactions()
            .transactionReconciliationRequest(transactionReconciliationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#reconcileTransactions");
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
| **transactionReconciliationRequest** | [**TransactionReconciliationRequest**](TransactionReconciliationRequest.md)|  | [optional] |

### Return type

[**TransactionsReconciliationsResponse**](TransactionsReconciliationsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The transaction reconciliation data for the supplied portfolios. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="reconcileTransactionsV2"></a>
# **reconcileTransactionsV2**
> ReconciliationResponse reconcileTransactionsV2().transactionReconciliationRequestV2(transactionReconciliationRequestV2).execute();

[EXPERIMENTAL] ReconcileTransactionsV2: Perform a Transactions Reconciliation.

Evaluates two sets of transactions to determine which transactions from each set likely match  using the rules of a specified mapping.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    TransactionReconciliationRequestV2 transactionReconciliationRequestV2 = new TransactionReconciliationRequestV2(); // TransactionReconciliationRequestV2 | 
    try {
      ReconciliationResponse result = apiInstance.reconcileTransactionsV2()
            .transactionReconciliationRequestV2(transactionReconciliationRequestV2)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#reconcileTransactionsV2");
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
| **transactionReconciliationRequestV2** | [**TransactionReconciliationRequestV2**](TransactionReconciliationRequestV2.md)|  | [optional] |

### Return type

[**ReconciliationResponse**](ReconciliationResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested reconciliation |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="reconcileValuation"></a>
# **reconcileValuation**
> ListAggregationReconciliation reconcileValuation().valuationsReconciliationRequest(valuationsReconciliationRequest).execute();

ReconcileValuation: Reconcile valuations performed on one or two sets of holdings using one or two configuration recipes.

Perform valuation of one or two set of holdings using different one or two configuration recipes. Produce a breakdown of the resulting differences in valuation.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    ValuationsReconciliationRequest valuationsReconciliationRequest = new ValuationsReconciliationRequest(); // ValuationsReconciliationRequest | The specifications of the inputs to the reconciliation
    try {
      ListAggregationReconciliation result = apiInstance.reconcileValuation()
            .valuationsReconciliationRequest(valuationsReconciliationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#reconcileValuation");
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
| **valuationsReconciliationRequest** | [**ValuationsReconciliationRequest**](ValuationsReconciliationRequest.md)| The specifications of the inputs to the reconciliation | [optional] |

### Return type

[**ListAggregationReconciliation**](ListAggregationReconciliation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested reconciliation |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateReconciliation"></a>
# **updateReconciliation**
> Reconciliation updateReconciliation(scope, code).updateReconciliationRequest(updateReconciliationRequest).execute();

[EXPERIMENTAL] UpdateReconciliation: Update scheduled reconciliation

Update a given scheduled reconciliation

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the reconciliation to be updated
    String code = "code_example"; // String | The code of the reconciliation to be updated
    UpdateReconciliationRequest updateReconciliationRequest = new UpdateReconciliationRequest(); // UpdateReconciliationRequest | The updated definition of the reconciliation
    try {
      Reconciliation result = apiInstance.updateReconciliation(scope, code)
            .updateReconciliationRequest(updateReconciliationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#updateReconciliation");
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
| **scope** | **String**| The scope of the reconciliation to be updated | |
| **code** | **String**| The code of the reconciliation to be updated | |
| **updateReconciliationRequest** | [**UpdateReconciliationRequest**](UpdateReconciliationRequest.md)| The updated definition of the reconciliation | [optional] |

### Return type

[**Reconciliation**](Reconciliation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated scheduled reconciliation |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertReconciliationBreak"></a>
# **upsertReconciliationBreak**
> ReconciliationRunBreak upsertReconciliationBreak(scope, code, runDate, version).upsertReconciliationBreakRequest(upsertReconciliationBreakRequest).execute();

[EXPERIMENTAL] UpsertReconciliationBreak: Upsert a reconciliation break

Update or create a given reconciliation break

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the reconciliation associated with the break
    String code = "code_example"; // String | The code of the reconciliation associated with the break
    OffsetDateTime runDate = OffsetDateTime.now(); // OffsetDateTime | The date of the run associated with the break
    Integer version = 56; // Integer | The version number of the run associated with the break
    UpsertReconciliationBreakRequest upsertReconciliationBreakRequest = new UpsertReconciliationBreakRequest(); // UpsertReconciliationBreakRequest | The definition of the reconciliation break request
    try {
      ReconciliationRunBreak result = apiInstance.upsertReconciliationBreak(scope, code, runDate, version)
            .upsertReconciliationBreakRequest(upsertReconciliationBreakRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#upsertReconciliationBreak");
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
| **scope** | **String**| The scope of the reconciliation associated with the break | |
| **code** | **String**| The code of the reconciliation associated with the break | |
| **runDate** | **OffsetDateTime**| The date of the run associated with the break | |
| **version** | **Integer**| The version number of the run associated with the break | |
| **upsertReconciliationBreakRequest** | [**UpsertReconciliationBreakRequest**](UpsertReconciliationBreakRequest.md)| The definition of the reconciliation break request | [optional] |

### Return type

[**ReconciliationRunBreak**](ReconciliationRunBreak.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created reconciliation break |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertReconciliationMapping"></a>
# **upsertReconciliationMapping**
> Mapping upsertReconciliationMapping().mapping(mapping).execute();

[EARLY ACCESS] UpsertReconciliationMapping: Create or update a mapping

If no mapping exists with the specified scope and code will create a new one.  Else will update the existing mapping

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    Mapping mapping = new Mapping(); // Mapping | The mapping to be created / updated.
    try {
      Mapping result = apiInstance.upsertReconciliationMapping()
            .mapping(mapping)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#upsertReconciliationMapping");
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
| **mapping** | [**Mapping**](Mapping.md)| The mapping to be created / updated. | [optional] |

### Return type

[**Mapping**](Mapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created / updated mapping. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertReconciliationRun"></a>
# **upsertReconciliationRun**
> ReconciliationRun upsertReconciliationRun(scope, code).upsertReconciliationRunRequest(upsertReconciliationRunRequest).execute();

[EXPERIMENTAL] UpsertReconciliationRun: Update or Create a reconciliation run

Existing reconciliations will be updated, non-existing ones will be created

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReconciliationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReconciliationsApi apiInstance = new ReconciliationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the reconciliation associated with the run
    String code = "code_example"; // String | The code of the reconciliation associated with the run
    UpsertReconciliationRunRequest upsertReconciliationRunRequest = new UpsertReconciliationRunRequest(); // UpsertReconciliationRunRequest | The definition of the reconciliation run
    try {
      ReconciliationRun result = apiInstance.upsertReconciliationRun(scope, code)
            .upsertReconciliationRunRequest(upsertReconciliationRunRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReconciliationsApi#upsertReconciliationRun");
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
| **scope** | **String**| The scope of the reconciliation associated with the run | |
| **code** | **String**| The code of the reconciliation associated with the run | |
| **upsertReconciliationRunRequest** | [**UpsertReconciliationRunRequest**](UpsertReconciliationRunRequest.md)| The definition of the reconciliation run | [optional] |

### Return type

[**ReconciliationRun**](ReconciliationRun.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created reconciliation run |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

