# DerivedTransactionPortfoliosApi

All URIs are relative to *http://local-unit-test-server.lusid.com:48202*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDerivedPortfolio**](DerivedTransactionPortfoliosApi.md#createDerivedPortfolio) | **POST** /api/derivedtransactionportfolios/{scope} | [EARLY ACCESS] Create derived portfolio
[**deleteDerivedPortfolioDetails**](DerivedTransactionPortfoliosApi.md#deleteDerivedPortfolioDetails) | **DELETE** /api/derivedtransactionportfolios/{scope}/{code}/details | [EARLY ACCESS] Delete derived portfolio details


<a name="createDerivedPortfolio"></a>
# **createDerivedPortfolio**
> Portfolio createDerivedPortfolio(scope, createDerivedTransactionPortfolioRequest)

[EARLY ACCESS] Create derived portfolio

Create a derived transaction portfolio from a parent transaction portfolio (which may itself be derived).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.DerivedTransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:48202");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DerivedTransactionPortfoliosApi apiInstance = new DerivedTransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope in which to create the derived transaction portfolio.
    CreateDerivedTransactionPortfolioRequest createDerivedTransactionPortfolioRequest = {"displayName":"MyDerivedPortfolioName","description":"Example long form portfolio description","code":"MyDerivedPortfolioCode","parentPortfolioId":{"scope":"MyParentPortfolioScope","code":"MyParentPortfolioCode"},"created":"2018-03-05T00:00:00.0000000+00:00","corporateActionSourceId":{"scope":"MyScope","code":"MyCorporateActionSourceId"},"accountingMethod":"FirstInFirstOut","subHoldingKeys":["Transaction/MyScope/Strategy","Transaction/MyScope/SubAccount"]}; // CreateDerivedTransactionPortfolioRequest | The definition of the derived transaction portfolio.
    try {
      Portfolio result = apiInstance.createDerivedPortfolio(scope, createDerivedTransactionPortfolioRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DerivedTransactionPortfoliosApi#createDerivedPortfolio");
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
 **scope** | **String**| The scope in which to create the derived transaction portfolio. |
 **createDerivedTransactionPortfolioRequest** | [**CreateDerivedTransactionPortfolioRequest**](CreateDerivedTransactionPortfolioRequest.md)| The definition of the derived transaction portfolio. | [optional]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The created derived portfolio, with populated id |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deleteDerivedPortfolioDetails"></a>
# **deleteDerivedPortfolioDetails**
> DeletedEntityResponse deleteDerivedPortfolioDetails(scope, code, effectiveAt)

[EARLY ACCESS] Delete derived portfolio details

Delete all the portfolio details for a derived transaction portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.DerivedTransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:48202");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DerivedTransactionPortfoliosApi apiInstance = new DerivedTransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the derived transaction portfolio.
    String code = "code_example"; // String | The code of the derived transaction portfolio. Together with the scope this uniquely identifies              the derived transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective date of the change.
    try {
      DeletedEntityResponse result = apiInstance.deleteDerivedPortfolioDetails(scope, code, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DerivedTransactionPortfoliosApi#deleteDerivedPortfolioDetails");
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
 **scope** | **String**| The scope of the derived transaction portfolio. |
 **code** | **String**| The code of the derived transaction portfolio. Together with the scope this uniquely identifies              the derived transaction portfolio. |
 **effectiveAt** | **String**| The effective date of the change. | [optional]

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
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

