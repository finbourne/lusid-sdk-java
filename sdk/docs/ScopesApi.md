# ScopesApi

All URIs are relative to *http://localhost:60587*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listScopes**](ScopesApi.md#listScopes) | **GET** /api/scopes | [EARLY ACCESS] List Scopes


<a name="listScopes"></a>
# **listScopes**
> ResourceListOfScopeDefinition listScopes(filter)

[EARLY ACCESS] List Scopes

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
    defaultClient.setBasePath("http://localhost:60587");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ScopesApi apiInstance = new ScopesApi(defaultClient);
    String filter = "filter_example"; // String | Expression to filter the result set.              For example, to filter on the Scope, use \"scope eq 'string'\"              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      ResourceListOfScopeDefinition result = apiInstance.listScopes(filter);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Expression to filter the result set.              For example, to filter on the Scope, use \&quot;scope eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

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
**200** | A list of scopes |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

