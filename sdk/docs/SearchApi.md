# SearchApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**portfolioGroupsSearch**](SearchApi.md#portfolioGroupsSearch) | **POST** /api/search/portfoliogroups | Search portfolio groups
[**portfoliosSearch**](SearchApi.md#portfoliosSearch) | **POST** /api/search/portfolios | Search portfolios
[**propertiesSearch**](SearchApi.md#propertiesSearch) | **POST** /api/search/propertydefinitions | Search property definitions


<a name="portfolioGroupsSearch"></a>
# **portfolioGroupsSearch**
> ResourceListOfPortfolioGroup portfolioGroupsSearch(request, sortBy, start, limit, filter)

Search portfolio groups

Search through all portfolio groups

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
Object request = null; // Object | A valid Elasticsearch 5.x request
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
try {
    ResourceListOfPortfolioGroup result = apiInstance.portfolioGroupsSearch(request, sortBy, start, limit, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#portfolioGroupsSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | **Object**| A valid Elasticsearch 5.x request | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

### Return type

[**ResourceListOfPortfolioGroup**](ResourceListOfPortfolioGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="portfoliosSearch"></a>
# **portfoliosSearch**
> ResourceListOfPortfolioSearchResult portfoliosSearch(request, sortBy, start, limit, filter)

Search portfolios

Search through all portfolios

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
Object request = null; // Object | A valid Elasticsearch 5.x request
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
try {
    ResourceListOfPortfolioSearchResult result = apiInstance.portfoliosSearch(request, sortBy, start, limit, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#portfoliosSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | **Object**| A valid Elasticsearch 5.x request | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

### Return type

[**ResourceListOfPortfolioSearchResult**](ResourceListOfPortfolioSearchResult.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="propertiesSearch"></a>
# **propertiesSearch**
> ResourceListOfPropertyDefinition propertiesSearch(request, sortBy, start, limit, filter)

Search property definitions

Search through all property definitions

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
Object request = null; // Object | A valid Elasticsearch 5.x request
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
try {
    ResourceListOfPropertyDefinition result = apiInstance.propertiesSearch(request, sortBy, start, limit, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#propertiesSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | **Object**| A valid Elasticsearch 5.x request | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

### Return type

[**ResourceListOfPropertyDefinition**](ResourceListOfPropertyDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

