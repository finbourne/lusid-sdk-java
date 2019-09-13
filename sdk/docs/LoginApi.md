# LoginApi

All URIs are relative to *http://http:/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSamlIdentityProviderId**](LoginApi.md#getSamlIdentityProviderId) | **GET** /api/login/saml/{domain} | Get SAML Identity Provider


<a name="getSamlIdentityProviderId"></a>
# **getSamlIdentityProviderId**
> String getSamlIdentityProviderId(domain)

Get SAML Identity Provider

Get the unique identifier for the SAML 2.0 Identity Provider to be used for domain.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.LoginApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LoginApi apiInstance = new LoginApi(defaultClient);
    String domain = "domain_example"; // String | The domain that the user will be logging in to
    try {
      String result = apiInstance.getSamlIdentityProviderId(domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginApi#getSamlIdentityProviderId");
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
 **domain** | **String**| The domain that the user will be logging in to |

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
**200** | The ID of the SAML Identity Provider to be used (may be null) |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

