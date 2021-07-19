# EntitiesApi

All URIs are relative to *http://local-unit-test-server.lusid.com:49093*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPortfolioChanges**](EntitiesApi.md#getPortfolioChanges) | **GET** /api/entities/changes/portfolios | [EARLY ACCESS] Get the next change to each portfolio in a scope.


<a name="getPortfolioChanges"></a>
# **getPortfolioChanges**
> ResourceListOfChange getPortfolioChanges(scope, effectiveAt, asAt)

[EARLY ACCESS] Get the next change to each portfolio in a scope.

Gets the time of the next (earliest effective at) modification (correction and/or amendment) to each portfolio in a scope relative to a point in bitemporal time.  Includes changes from parent portfolios in different scopes.  Excludes changes from subcriptions (e.g corporate actions).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.EntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:49093");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    EntitiesApi apiInstance = new EntitiesApi(defaultClient);
    String scope = "scope_example"; // String | The scope
    String effectiveAt = "effectiveAt_example"; // String | The effective date of the origin.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The as-at date of the origin.
    try {
      ResourceListOfChange result = apiInstance.getPortfolioChanges(scope, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitiesApi#getPortfolioChanges");
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
 **scope** | **String**| The scope |
 **effectiveAt** | **String**| The effective date of the origin. |
 **asAt** | **OffsetDateTime**| The as-at date of the origin. | [optional]

### Return type

[**ResourceListOfChange**](ResourceListOfChange.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | The details of the input related failure |  -  |
**200** | A list of portfolio changes in the requested scope relative to the specified time. |  -  |
**0** | Error response |  -  |

