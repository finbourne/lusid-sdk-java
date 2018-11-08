# ReconciliationsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reconcileHoldings**](ReconciliationsApi.md#reconcileHoldings) | **POST** /api/portfolios/$reconcileholdings | Reconcile portfolio holdings


<a name="reconcileHoldings"></a>
# **reconcileHoldings**
> ResourceListOfReconciliationBreak reconcileHoldings(request, sortBy, start, limit, filter)

Reconcile portfolio holdings

Reconcile the holdings of two portfolios.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.ReconciliationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ReconciliationsApi apiInstance = new ReconciliationsApi();
PortfoliosReconciliationRequest request = new PortfoliosReconciliationRequest(); // PortfoliosReconciliationRequest | The specifications of the inputs to the reconciliation
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
try {
    ResourceListOfReconciliationBreak result = apiInstance.reconcileHoldings(request, sortBy, start, limit, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReconciliationsApi#reconcileHoldings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**PortfoliosReconciliationRequest**](PortfoliosReconciliationRequest.md)| The specifications of the inputs to the reconciliation | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

### Return type

[**ResourceListOfReconciliationBreak**](ResourceListOfReconciliationBreak.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

