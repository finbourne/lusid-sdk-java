# ScopesApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listEntityScopes**](ScopesApi.md#listEntityScopes) | **GET** /api/scopes/{entityType} | ListEntityScopes: List Entity Scopes |
| [**listScopes**](ScopesApi.md#listScopes) | **GET** /api/scopes | ListScopes: List Scopes |


<a id="listEntityScopes"></a>
# **listEntityScopes**
> ResourceListOfScopeDefinition listEntityScopes(entityType).asAt(asAt).page(page).limit(limit).execute();

ListEntityScopes: List Entity Scopes

List all the scopes for a given entity type that contain data.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ScopesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ScopesApi apiInstance = new ScopesApi(defaultClient);
    String entityType = "entityType_example"; // String | The entity type to list scopes for.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve scopes. Defaults to latest datetime if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing scopes from a previous call to list scopes.   This value is returned from the previous call. If a pagination token is provided, the limit and asAt fields   must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this number. Defaults to 100 if not specified.
    try {
      ResourceListOfScopeDefinition result = apiInstance.listEntityScopes(entityType)
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScopesApi#listEntityScopes");
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
| **entityType** | **String**| The entity type to list scopes for. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve scopes. Defaults to latest datetime if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing scopes from a previous call to list scopes.   This value is returned from the previous call. If a pagination token is provided, the limit and asAt fields   must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this number. Defaults to 100 if not specified. | [optional] |

### Return type

[**ResourceListOfScopeDefinition**](ResourceListOfScopeDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of scopes |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listScopes"></a>
# **listScopes**
> ResourceListOfScopeDefinition listScopes().filter(filter).execute();

ListScopes: List Scopes

List all the scopes that contain data.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ScopesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ScopesApi apiInstance = new ScopesApi(defaultClient);
    String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the Scope, use \"scope eq 'string'\"   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      ResourceListOfScopeDefinition result = apiInstance.listScopes()
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScopesApi#listScopes");
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
| **filter** | **String**| Expression to filter the result set.   For example, to filter on the Scope, use \&quot;scope eq &#39;string&#39;\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**ResourceListOfScopeDefinition**](ResourceListOfScopeDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of scopes |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

