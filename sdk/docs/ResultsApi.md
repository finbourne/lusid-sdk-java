# ResultsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResults**](ResultsApi.md#getResults) | **GET** /api/results/{entityScope}/{entityCode}/{calculationScope}/{calculationCode}/{effectiveAt} | Retrieve a page of results all keyed by the provided parameters. The result store is not bi-temporal; a single date  addressed the market effectiveAt.
[**upsertResults**](ResultsApi.md#upsertResults) | **POST** /api/results | Upsert results


<a name="getResults"></a>
# **getResults**
> Results getResults(entityScope, entityCode, calculationScope, calculationCode, effectiveAt)

Retrieve a page of results all keyed by the provided parameters. The result store is not bi-temporal; a single date  addressed the market effectiveAt.

Retrieve pre-calculated results that have been stored in LUSID.

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
String entityScope = "entityScope_example"; // String | The scope of the data or entity being stored
String entityCode = "entityCode_example"; // String | The identifier for the data or results entity being stored
String calculationScope = "calculationScope_example"; // String | The identifying scope for the calculation that produced the result
String calculationCode = "calculationCode_example"; // String | The identifying calculation name for the results
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The market date for which the data is stored
try {
    Results result = apiInstance.getResults(entityScope, entityCode, calculationScope, calculationCode, effectiveAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#getResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityScope** | **String**| The scope of the data or entity being stored |
 **entityCode** | **String**| The identifier for the data or results entity being stored |
 **calculationScope** | **String**| The identifying scope for the calculation that produced the result |
 **calculationCode** | **String**| The identifying calculation name for the results |
 **effectiveAt** | **OffsetDateTime**| The market date for which the data is stored |

### Return type

[**Results**](Results.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="upsertResults"></a>
# **upsertResults**
> Results upsertResults(request)

Upsert results

Upsert pre-calculated results against a specified combination of key parameters defined in the CreateResults request.

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
CreateResults request = new CreateResults(); // CreateResults | The details of what to upsert
try {
    Results result = apiInstance.upsertResults(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResultsApi#upsertResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateResults**](CreateResults.md)| The details of what to upsert | [optional]

### Return type

[**Results**](Results.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

