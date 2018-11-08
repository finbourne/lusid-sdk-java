# QuotesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteQuote**](QuotesApi.md#deleteQuote) | **DELETE** /api/quotes/{scope} | Delete a quote
[**getQuotes**](QuotesApi.md#getQuotes) | **GET** /api/quotes/{scope} | Get quotes
[**upsertQuotes**](QuotesApi.md#upsertQuotes) | **POST** /api/quotes/{scope} | Add quotes


<a name="deleteQuote"></a>
# **deleteQuote**
> DeleteQuotesResponse deleteQuote(scope, id, effectiveFrom)

Delete a quote

Delete the specified quote. In order for a quote to be deleted the id and effectiveFrom date must exactly match.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.QuotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QuotesApi apiInstance = new QuotesApi();
String scope = "scope_example"; // String | The scope of the quote
String id = "id_example"; // String | The quote id
OffsetDateTime effectiveFrom = new OffsetDateTime(); // OffsetDateTime | The date/time from which the quote is effective
try {
    DeleteQuotesResponse result = apiInstance.deleteQuote(scope, id, effectiveFrom);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#deleteQuote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the quote |
 **id** | **String**| The quote id | [optional]
 **effectiveFrom** | **OffsetDateTime**| The date/time from which the quote is effective | [optional]

### Return type

[**DeleteQuotesResponse**](DeleteQuotesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getQuotes"></a>
# **getQuotes**
> ResourceListOfQuote getQuotes(scope, quoteIds, effectiveAt, asAt, maxAge, page, limit)

Get quotes

Get quotes effective at the specified date/time (if any). An optional maximum age of quotes can be specified, and is infinite by default.  Quotes which are older than this at the time of the effective date/time will not be returned.  MaxAge is a duration of time represented in an ISO8601 format, eg. P1Y2M3DT4H30M (1 year, 2 months, 3 days, 4 hours and 30 minutes).  The results are paged, and by default the 1st page of results is returned with a limit of 100 results per page

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.QuotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QuotesApi apiInstance = new QuotesApi();
String scope = "scope_example"; // String | The scope of the quotes
List<String> quoteIds = Arrays.asList("quoteIds_example"); // List<String> | The ids of the quotes
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The date/time from which the quotes are effective
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The 'AsAt' date/time
String maxAge = "maxAge_example"; // String | Optional. The quote staleness tolerance
Integer page = 56; // Integer | Optional. The page of results to return
Integer limit = 56; // Integer | Optional. The number of results per page
try {
    ResourceListOfQuote result = apiInstance.getQuotes(scope, quoteIds, effectiveAt, asAt, maxAge, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#getQuotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the quotes |
 **quoteIds** | [**List&lt;String&gt;**](String.md)| The ids of the quotes | [optional]
 **effectiveAt** | **OffsetDateTime**| Optional. The date/time from which the quotes are effective | [optional]
 **asAt** | **OffsetDateTime**| Optional. The &#39;AsAt&#39; date/time | [optional]
 **maxAge** | **String**| Optional. The quote staleness tolerance | [optional]
 **page** | **Integer**| Optional. The page of results to return | [optional]
 **limit** | **Integer**| Optional. The number of results per page | [optional]

### Return type

[**ResourceListOfQuote**](ResourceListOfQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="upsertQuotes"></a>
# **upsertQuotes**
> UpsertQuotesResponse upsertQuotes(scope, quotes, effectiveAt)

Add quotes

Add quotes effective at the specified time. If a quote is added with the same id (and is effective at the same time) as an existing quote, then the more recently added quote will be returned when queried

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.QuotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

QuotesApi apiInstance = new QuotesApi();
String scope = "scope_example"; // String | The scope of the quotes
List<UpsertQuoteRequest> quotes = Arrays.asList(new UpsertQuoteRequest()); // List<UpsertQuoteRequest> | The quotes to add
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The date/time from which the quotes are effective
try {
    UpsertQuotesResponse result = apiInstance.upsertQuotes(scope, quotes, effectiveAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotesApi#upsertQuotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the quotes |
 **quotes** | [**List&lt;UpsertQuoteRequest&gt;**](UpsertQuoteRequest.md)| The quotes to add | [optional]
 **effectiveAt** | **OffsetDateTime**| Optional. The date/time from which the quotes are effective | [optional]

### Return type

[**UpsertQuotesResponse**](UpsertQuotesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

