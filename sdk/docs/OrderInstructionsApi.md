# OrderInstructionsApi

All URIs are relative to *https://example.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteOrderInstruction**](OrderInstructionsApi.md#deleteOrderInstruction) | **DELETE** /api/orderinstructions/{scope}/{code} | [EXPERIMENTAL] DeleteOrderInstruction: Delete orderInstruction |
| [**getOrderInstruction**](OrderInstructionsApi.md#getOrderInstruction) | **GET** /api/orderinstructions/{scope}/{code} | [EXPERIMENTAL] GetOrderInstruction: Get OrderInstruction |
| [**listOrderInstructions**](OrderInstructionsApi.md#listOrderInstructions) | **GET** /api/orderinstructions | [EXPERIMENTAL] ListOrderInstructions: List OrderInstructions |
| [**upsertOrderInstructions**](OrderInstructionsApi.md#upsertOrderInstructions) | **POST** /api/orderinstructions | [EXPERIMENTAL] UpsertOrderInstructions: Upsert OrderInstruction |


<a id="deleteOrderInstruction"></a>
# **deleteOrderInstruction**
> DeletedEntityResponse deleteOrderInstruction(scope, code)

[EXPERIMENTAL] DeleteOrderInstruction: Delete orderInstruction

Delete an orderInstruction. Deletion will be valid from the orderInstruction&#39;s creation datetime.  This means that the orderInstruction will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.OrderInstructionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderInstructionsApi apiInstance = new OrderInstructionsApi(defaultClient);
    String scope = "scope_example"; // String | The orderInstruction scope.
    String code = "code_example"; // String | The orderInstruction's code. This, together with the scope uniquely identifies the orderInstruction to delete.
    try {
      DeletedEntityResponse result = apiInstance.deleteOrderInstruction(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderInstructionsApi#deleteOrderInstruction");
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
| **scope** | **String**| The orderInstruction scope. | |
| **code** | **String**| The orderInstruction&#39;s code. This, together with the scope uniquely identifies the orderInstruction to delete. | |

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
| **200** | The response from deleting an orderInstruction. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getOrderInstruction"></a>
# **getOrderInstruction**
> OrderInstruction getOrderInstruction(scope, code, asAt, propertyKeys)

[EXPERIMENTAL] GetOrderInstruction: Get OrderInstruction

Fetch a OrderInstruction that matches the specified identifier

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.OrderInstructionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderInstructionsApi apiInstance = new OrderInstructionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope to which the orderInstruction belongs.
    String code = "code_example"; // String | The orderInstruction's unique identifier.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the orderInstruction. Defaults to return the latest version of the orderInstruction if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"OrderInstruction\" domain to decorate onto the orderInstruction.              These take the format {domain}/{scope}/{code} e.g. \"OrderInstruction/system/Name\".
    try {
      OrderInstruction result = apiInstance.getOrderInstruction(scope, code, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderInstructionsApi#getOrderInstruction");
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
| **scope** | **String**| The scope to which the orderInstruction belongs. | |
| **code** | **String**| The orderInstruction&#39;s unique identifier. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the orderInstruction. Defaults to return the latest version of the orderInstruction if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;OrderInstruction\&quot; domain to decorate onto the orderInstruction.              These take the format {domain}/{scope}/{code} e.g. \&quot;OrderInstruction/system/Name\&quot;. | [optional] |

### Return type

[**OrderInstruction**](OrderInstruction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The orderInstruction matching the given identifier. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listOrderInstructions"></a>
# **listOrderInstructions**
> PagedResourceListOfOrderInstruction listOrderInstructions(asAt, page, sortBy, limit, filter, propertyKeys)

[EXPERIMENTAL] ListOrderInstructions: List OrderInstructions

Fetch the last pre-AsAt date version of each orderInstruction in scope (does not fetch the entire history).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.OrderInstructionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderInstructionsApi apiInstance = new OrderInstructionsApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the orderInstruction. Defaults to return the latest version of the orderInstruction if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing orderInstructions from a previous call to list orderInstructions.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"OrderInstruction\" domain to decorate onto each orderInstruction.                  These take the format {domain}/{scope}/{code} e.g. \"OrderInstruction/system/Name\".
    try {
      PagedResourceListOfOrderInstruction result = apiInstance.listOrderInstructions(asAt, page, sortBy, limit, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderInstructionsApi#listOrderInstructions");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the orderInstruction. Defaults to return the latest version of the orderInstruction if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing orderInstructions from a previous call to list orderInstructions.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;OrderInstruction\&quot; domain to decorate onto each orderInstruction.                  These take the format {domain}/{scope}/{code} e.g. \&quot;OrderInstruction/system/Name\&quot;. | [optional] |

### Return type

[**PagedResourceListOfOrderInstruction**](PagedResourceListOfOrderInstruction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OrderInstructions in scope. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertOrderInstructions"></a>
# **upsertOrderInstructions**
> ResourceListOfOrderInstruction upsertOrderInstructions(orderInstructionSetRequest)

[EXPERIMENTAL] UpsertOrderInstructions: Upsert OrderInstruction

Upsert; update existing orderInstructions with given ids, or create new orderInstructions otherwise.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.OrderInstructionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderInstructionsApi apiInstance = new OrderInstructionsApi(defaultClient);
    OrderInstructionSetRequest orderInstructionSetRequest = new OrderInstructionSetRequest(); // OrderInstructionSetRequest | The collection of orderInstruction requests.
    try {
      ResourceListOfOrderInstruction result = apiInstance.upsertOrderInstructions(orderInstructionSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderInstructionsApi#upsertOrderInstructions");
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
| **orderInstructionSetRequest** | [**OrderInstructionSetRequest**](OrderInstructionSetRequest.md)| The collection of orderInstruction requests. | [optional] |

### Return type

[**ResourceListOfOrderInstruction**](ResourceListOfOrderInstruction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A collection of orderInstructions. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

