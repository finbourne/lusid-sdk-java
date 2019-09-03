# DerivedTransactionPortfoliosApi

All URIs are relative to *http://http:/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDerivedPortfolio**](DerivedTransactionPortfoliosApi.md#createDerivedPortfolio) | **POST** /api/derivedtransactionportfolios/{scope} | [EARLY ACCESS] Create derived transaction portfolio
[**deleteDerivedPortfolioDetails**](DerivedTransactionPortfoliosApi.md#deleteDerivedPortfolioDetails) | **DELETE** /api/derivedtransactionportfolios/{scope}/{code}/details | [EARLY ACCESS] Delete portfolio details


<a name="createDerivedPortfolio"></a>
# **createDerivedPortfolio**
> Portfolio createDerivedPortfolio(scope, portfolio)

[EARLY ACCESS] Create derived transaction portfolio

Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a \&quot;parent\&quot;. Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio&#39;s transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent&#39;s portfolio&#39;s, if it is also a derived portfolio, and so on).

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
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DerivedTransactionPortfoliosApi apiInstance = new DerivedTransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope into which to create the new derived portfolio
    CreateDerivedTransactionPortfolioRequest portfolio = new CreateDerivedTransactionPortfolioRequest(); // CreateDerivedTransactionPortfolioRequest | The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
    try {
      Portfolio result = apiInstance.createDerivedPortfolio(scope, portfolio);
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
 **scope** | **String**| The scope into which to create the new derived portfolio |
 **portfolio** | [**CreateDerivedTransactionPortfolioRequest**](CreateDerivedTransactionPortfolioRequest.md)| The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope | [optional]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
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

[EARLY ACCESS] Delete portfolio details

Deletes the portfolio details for the specified derived transaction portfolio

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
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DerivedTransactionPortfoliosApi apiInstance = new DerivedTransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio
    String code = "code_example"; // String | The code of the portfolio
    String effectiveAt = "effectiveAt_example"; // String | The effective date of the change
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
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **effectiveAt** | **String**| The effective date of the change | [optional]

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

