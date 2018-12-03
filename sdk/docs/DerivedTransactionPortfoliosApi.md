# DerivedTransactionPortfoliosApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDerivedPortfolio**](DerivedTransactionPortfoliosApi.md#createDerivedPortfolio) | **POST** /api/derivedtransactionportfolios/{scope} | Create derived transaction portfolio
[**deleteDerivedPortfolioDetails**](DerivedTransactionPortfoliosApi.md#deleteDerivedPortfolioDetails) | **DELETE** /api/derivedtransactionportfolios/{scope}/{code}/details | Delete portfolio details


<a name="createDerivedPortfolio"></a>
# **createDerivedPortfolio**
> Portfolio createDerivedPortfolio(scope, portfolio)

Create derived transaction portfolio

Creates a transaction portfolio that derives from an existing transaction portfolio. In a derived portfolio, parts of the portfolio can either be specific to this portfolio, or can be inherited from a \&quot;parent\&quot;. Different parts of the portfolio (e.g. transactions or properties) are combined in different ways. The portfolio details are either overridden in entirety, or not at all. The same is true for properties. Transactions on a derived portfolio are merged with its parent portfolio&#39;s transactions. If the parent portfolio is itself a derived portfolio, transactions from that parent are also merged (and that parent&#39;s portfolio&#39;s, if it is also a derived portfolio, and so on).

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.DerivedTransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DerivedTransactionPortfoliosApi apiInstance = new DerivedTransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope into which to create the new derived portfolio
CreateDerivedTransactionPortfolioRequest portfolio = new CreateDerivedTransactionPortfolioRequest(); // CreateDerivedTransactionPortfolioRequest | The root object of the new derived portfolio, containing a populated reference portfolio id and reference scope
try {
    Portfolio result = apiInstance.createDerivedPortfolio(scope, portfolio);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DerivedTransactionPortfoliosApi#createDerivedPortfolio");
    e.printStackTrace();
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

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="deleteDerivedPortfolioDetails"></a>
# **deleteDerivedPortfolioDetails**
> DeletedEntityResponse deleteDerivedPortfolioDetails(scope, code, effectiveAt)

Delete portfolio details

Deletes the portfolio details for the specified derived transaction portfolio

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.DerivedTransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DerivedTransactionPortfoliosApi apiInstance = new DerivedTransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The effective date of the change
try {
    DeletedEntityResponse result = apiInstance.deleteDerivedPortfolioDetails(scope, code, effectiveAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DerivedTransactionPortfoliosApi#deleteDerivedPortfolioDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **effectiveAt** | **OffsetDateTime**| The effective date of the change | [optional]

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

