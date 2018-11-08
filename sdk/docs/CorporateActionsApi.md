# CorporateActionsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchUpsertCorporateActions**](CorporateActionsApi.md#batchUpsertCorporateActions) | **POST** /api/corporateactions/{scope}/{code} | Upsert corporate actions
[**getCorporateActions**](CorporateActionsApi.md#getCorporateActions) | **GET** /api/corporateactions/{scope}/{code} | Get corporate actions


<a name="batchUpsertCorporateActions"></a>
# **batchUpsertCorporateActions**
> UpsertCorporateActionsResponse batchUpsertCorporateActions(scope, code, actions)

Upsert corporate actions

Attempt to create/update one or more corporate action in a specified corporate action source. Failed actions will be identified in the body of the response.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.CorporateActionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CorporateActionsApi apiInstance = new CorporateActionsApi();
String scope = "scope_example"; // String | The scope of corporate action source
String code = "code_example"; // String | The code of the corporate action source
List<CreateCorporateAction> actions = Arrays.asList(new CreateCorporateAction()); // List<CreateCorporateAction> | The corporate action definitions
try {
    UpsertCorporateActionsResponse result = apiInstance.batchUpsertCorporateActions(scope, code, actions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporateActionsApi#batchUpsertCorporateActions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of corporate action source |
 **code** | **String**| The code of the corporate action source |
 **actions** | [**List&lt;CreateCorporateAction&gt;**](CreateCorporateAction.md)| The corporate action definitions | [optional]

### Return type

[**UpsertCorporateActionsResponse**](UpsertCorporateActionsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="getCorporateActions"></a>
# **getCorporateActions**
> ResourceListOfCorporateAction getCorporateActions(scope, code, effectiveAt, asAt, sortBy, start, limit, filter)

Get corporate actions

Gets corporate actions from a specific corporate action source

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.CorporateActionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CorporateActionsApi apiInstance = new CorporateActionsApi();
String scope = "scope_example"; // String | The scope of the corporate action source
String code = "code_example"; // String | The code of the corporate action source
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the data
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many
String filter = "filter_example"; // String | Optional. Expression to filter the result set
try {
    ResourceListOfCorporateAction result = apiInstance.getCorporateActions(scope, code, effectiveAt, asAt, sortBy, start, limit, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporateActionsApi#getCorporateActions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the corporate action source |
 **code** | **String**| The code of the corporate action source |
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date of the data | [optional]
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

### Return type

[**ResourceListOfCorporateAction**](ResourceListOfCorporateAction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

