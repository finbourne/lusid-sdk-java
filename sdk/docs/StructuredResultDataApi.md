# StructuredResultDataApi

All URIs are relative to *https://www.lusid.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAddressKeyDefinitionsForDocument**](StructuredResultDataApi.md#getAddressKeyDefinitionsForDocument) | **GET** /api/unitresults/virtualdocument/{scope}/{code}/{source}/{resultType}/addresskeydefinitions | [EARLY ACCESS] GetAddressKeyDefinitionsForDocument: Get AddressKeyDefinitions for a virtual document.


<a name="getAddressKeyDefinitionsForDocument"></a>
# **getAddressKeyDefinitionsForDocument**
> ResourceListOfAddressKeyDefinition getAddressKeyDefinitionsForDocument(scope, code, source, resultType, effectiveAt, asAt)

[EARLY ACCESS] GetAddressKeyDefinitionsForDocument: Get AddressKeyDefinitions for a virtual document.

For a given virtual document retrieve all the address key definitions that are in use.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StructuredResultDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StructuredResultDataApi apiInstance = new StructuredResultDataApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the document for which address key definitions are retrieved.
    String code = "code_example"; // String | The code of the document for which address key definitions are retrieved.
    String source = "source_example"; // String | The source of the document for which address key definitions are retrieved.
    String resultType = "resultType_example"; // String | The result type of the document for which address key definitions are retrieved.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime to query the document for which the address key definitions are retrieved.              Defaults to querying the latest version if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime to query the document for which the address key definitions are retrieved.              Defaults to querying the latest version if not specified.
    try {
      ResourceListOfAddressKeyDefinition result = apiInstance.getAddressKeyDefinitionsForDocument(scope, code, source, resultType, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StructuredResultDataApi#getAddressKeyDefinitionsForDocument");
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
 **scope** | **String**| The scope of the document for which address key definitions are retrieved. |
 **code** | **String**| The code of the document for which address key definitions are retrieved. |
 **source** | **String**| The source of the document for which address key definitions are retrieved. |
 **resultType** | **String**| The result type of the document for which address key definitions are retrieved. |
 **effectiveAt** | **String**| The effective datetime to query the document for which the address key definitions are retrieved.              Defaults to querying the latest version if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime to query the document for which the address key definitions are retrieved.              Defaults to querying the latest version if not specified. | [optional]

### Return type

[**ResourceListOfAddressKeyDefinition**](ResourceListOfAddressKeyDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A collection of address key definitions. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

