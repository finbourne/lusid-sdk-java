# ResultsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResults**](ResultsApi.md#getResults) | **GET** /api/results/{scope}/{key}/{date} | Get results
[**upsertResults**](ResultsApi.md#upsertResults) | **POST** /api/results/{scope}/{key}/{date} | Upsert results


<a name="getResults"></a>
# **getResults**
> Results getResults(scope, key, date, asAt, sortBy, start, limit)

Get results

Retrieve some previously stored results

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ResultsApi apiInstance = new ResultsApi();
String scope = "scope_example"; // String | The scope of the data
String key = "key_example"; // String | The key that identifies the data
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | The date for which the data was loaded
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
try {
    Results result = apiInstance.getResults(scope, key, date, asAt, sortBy, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the data |
 **key** | **String**| The key that identifies the data |
 **date** | **OffsetDateTime**| The date for which the data was loaded |
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]

### Return type

[**Results**](Results.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="upsertResults"></a>
# **upsertResults**
> Results upsertResults(scope, key, date, request)

Upsert results

Upsert pre-calculated results against a specified scope/key/date combination

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.ResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ResultsApi apiInstance = new ResultsApi();
String scope = "scope_example"; // String | The scope of the data
String key = "key_example"; // String | The key that identifies the data
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | The date for which the data is relevant
CreateResults request = new CreateResults(); // CreateResults | The results to upload
try {
    Results result = apiInstance.upsertResults(scope, key, date, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#upsertResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the data |
 **key** | **String**| The key that identifies the data |
 **date** | **OffsetDateTime**| The date for which the data is relevant |
 **request** | [**CreateResults**](CreateResults.md)| The results to upload | [optional]

### Return type

[**Results**](Results.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

