# ExecutionsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteExecution**](ExecutionsApi.md#deleteExecution) | **DELETE** /api/executions/{scope}/{code} | [EARLY ACCESS] DeleteExecution: Delete execution |
| [**getExecution**](ExecutionsApi.md#getExecution) | **GET** /api/executions/{scope}/{code} | [EARLY ACCESS] GetExecution: Get Execution |
| [**listExecutions**](ExecutionsApi.md#listExecutions) | **GET** /api/executions | [EARLY ACCESS] ListExecutions: List Executions |
| [**upsertExecutions**](ExecutionsApi.md#upsertExecutions) | **POST** /api/executions | [EARLY ACCESS] UpsertExecutions: Upsert Execution |


<a id="deleteExecution"></a>
# **deleteExecution**
> DeletedEntityResponse deleteExecution(scope, code)

[EARLY ACCESS] DeleteExecution: Delete execution

Delete an execution. Deletion will be valid from the execution&#39;s creation datetime.  This means that the execution will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ExecutionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ExecutionsApi apiInstance = new ExecutionsApi(defaultClient);
    String scope = "scope_example"; // String | The execution scope.
    String code = "code_example"; // String | The execution's code. This, together with the scope uniquely identifies the execution to delete.
    try {
      DeletedEntityResponse result = apiInstance.deleteExecution(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecutionsApi#deleteExecution");
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
| **scope** | **String**| The execution scope. | |
| **code** | **String**| The execution&#39;s code. This, together with the scope uniquely identifies the execution to delete. | |

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
| **200** | The response from deleting an execution. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getExecution"></a>
# **getExecution**
> Execution getExecution(scope, code, asAt, propertyKeys)

[EARLY ACCESS] GetExecution: Get Execution

Fetch a Execution that matches the specified identifier

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ExecutionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ExecutionsApi apiInstance = new ExecutionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope to which the execution belongs.
    String code = "code_example"; // String | The execution's unique identifier.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the execution. Defaults to return the latest version of the execution if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Execution\" domain to decorate onto the execution.              These take the format {domain}/{scope}/{code} e.g. \"Execution/system/Name\".
    try {
      Execution result = apiInstance.getExecution(scope, code, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecutionsApi#getExecution");
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
| **scope** | **String**| The scope to which the execution belongs. | |
| **code** | **String**| The execution&#39;s unique identifier. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the execution. Defaults to return the latest version of the execution if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Execution\&quot; domain to decorate onto the execution.              These take the format {domain}/{scope}/{code} e.g. \&quot;Execution/system/Name\&quot;. | [optional] |

### Return type

[**Execution**](Execution.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The execution matching the given identifier. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listExecutions"></a>
# **listExecutions**
> PagedResourceListOfExecution listExecutions(asAt, page, sortBy, limit, filter, propertyKeys)

[EARLY ACCESS] ListExecutions: List Executions

Fetch the last pre-AsAt date version of each execution in scope (does not fetch the entire history).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ExecutionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ExecutionsApi apiInstance = new ExecutionsApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the execution. Defaults to return the latest version of the execution if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing execution from a previous call to list executions.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Execution\" domain to decorate onto each execution.                  These take the format {domain}/{scope}/{code} e.g. \"Execution/system/Name\".
    try {
      PagedResourceListOfExecution result = apiInstance.listExecutions(asAt, page, sortBy, limit, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecutionsApi#listExecutions");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the execution. Defaults to return the latest version of the execution if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing execution from a previous call to list executions.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Execution\&quot; domain to decorate onto each execution.                  These take the format {domain}/{scope}/{code} e.g. \&quot;Execution/system/Name\&quot;. | [optional] |

### Return type

[**PagedResourceListOfExecution**](PagedResourceListOfExecution.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Executions in scope. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertExecutions"></a>
# **upsertExecutions**
> ResourceListOfExecution upsertExecutions(executionSetRequest)

[EARLY ACCESS] UpsertExecutions: Upsert Execution

Upsert; update existing executions with given ids, or create new executions otherwise.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ExecutionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ExecutionsApi apiInstance = new ExecutionsApi(defaultClient);
    ExecutionSetRequest executionSetRequest = new ExecutionSetRequest(); // ExecutionSetRequest | The collection of execution requests.
    try {
      ResourceListOfExecution result = apiInstance.upsertExecutions(executionSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecutionsApi#upsertExecutions");
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
| **executionSetRequest** | [**ExecutionSetRequest**](ExecutionSetRequest.md)| The collection of execution requests. | [optional] |

### Return type

[**ResourceListOfExecution**](ResourceListOfExecution.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A collection of executions. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

