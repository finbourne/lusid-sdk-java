# ReferencePortfolioApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReferencePortfolio**](ReferencePortfolioApi.md#createReferencePortfolio) | **POST** /api/referenceportfolios/{scope} | Create reference portfolio
[**getReferencePortfolioConstituents**](ReferencePortfolioApi.md#getReferencePortfolioConstituents) | **GET** /api/referenceportfolios/{scope}/{code}/{effectiveAt}/constituents | Get constituents
[**upsertReferencePortfolioConstituents**](ReferencePortfolioApi.md#upsertReferencePortfolioConstituents) | **POST** /api/referenceportfolios/{scope}/{code}/constituents | Add constituents


<a name="createReferencePortfolio"></a>
# **createReferencePortfolio**
> Portfolio createReferencePortfolio(scope, referencePortfolio)

Create reference portfolio

Create a new reference portfolio.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.ReferencePortfolioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ReferencePortfolioApi apiInstance = new ReferencePortfolioApi();
String scope = "scope_example"; // String | The intended scope of the portfolio
CreateReferencePortfolioRequest referencePortfolio = new CreateReferencePortfolioRequest(); // CreateReferencePortfolioRequest | The portfolio creation request object
try {
    Portfolio result = apiInstance.createReferencePortfolio(scope, referencePortfolio);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferencePortfolioApi#createReferencePortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The intended scope of the portfolio |
 **referencePortfolio** | [**CreateReferencePortfolioRequest**](CreateReferencePortfolioRequest.md)| The portfolio creation request object | [optional]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="getReferencePortfolioConstituents"></a>
# **getReferencePortfolioConstituents**
> GetReferencePortfolioConstituentsResponse getReferencePortfolioConstituents(scope, code, effectiveAt, asAt, sortBy, start, limit)

Get constituents

Get all the constituents in the specified reference portfolio

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.ReferencePortfolioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ReferencePortfolioApi apiInstance = new ReferencePortfolioApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The effective date of the constituents to retrieve
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many
try {
    GetReferencePortfolioConstituentsResponse result = apiInstance.getReferencePortfolioConstituents(scope, code, effectiveAt, asAt, sortBy, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferencePortfolioApi#getReferencePortfolioConstituents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **effectiveAt** | **OffsetDateTime**| The effective date of the constituents to retrieve |
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many | [optional]

### Return type

[**GetReferencePortfolioConstituentsResponse**](GetReferencePortfolioConstituentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="upsertReferencePortfolioConstituents"></a>
# **upsertReferencePortfolioConstituents**
> UpsertReferencePortfolioConstituentsResponse upsertReferencePortfolioConstituents(scope, code, constituents)

Add constituents

Add constituents to the specified reference portfolio.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.ReferencePortfolioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ReferencePortfolioApi apiInstance = new ReferencePortfolioApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
UpsertReferencePortfolioConstituentsRequest constituents = new UpsertReferencePortfolioConstituentsRequest(); // UpsertReferencePortfolioConstituentsRequest | The constituents to upload to the portfolio
try {
    UpsertReferencePortfolioConstituentsResponse result = apiInstance.upsertReferencePortfolioConstituents(scope, code, constituents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferencePortfolioApi#upsertReferencePortfolioConstituents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **constituents** | [**UpsertReferencePortfolioConstituentsRequest**](UpsertReferencePortfolioConstituentsRequest.md)| The constituents to upload to the portfolio | [optional]

### Return type

[**UpsertReferencePortfolioConstituentsResponse**](UpsertReferencePortfolioConstituentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

