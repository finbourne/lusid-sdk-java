# CutLabelDefinitionsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCutLabelDefinition**](CutLabelDefinitionsApi.md#createCutLabelDefinition) | **POST** /api/systemconfiguration/cutlabels | Create a Cut Label
[**deleteCutLabelDefinition**](CutLabelDefinitionsApi.md#deleteCutLabelDefinition) | **DELETE** /api/systemconfiguration/cutlabels/{code} | Delete a Cut Label
[**getCutLabelDefinition**](CutLabelDefinitionsApi.md#getCutLabelDefinition) | **GET** /api/systemconfiguration/cutlabels/{code} | Get a Cut Label
[**listCutLabelDefinitions**](CutLabelDefinitionsApi.md#listCutLabelDefinitions) | **GET** /api/systemconfiguration/cutlabels | List Existing Cut Labels
[**updateCutLabelDefinition**](CutLabelDefinitionsApi.md#updateCutLabelDefinition) | **PUT** /api/systemconfiguration/cutlabels/{code} | Update a Cut Label


<a name="createCutLabelDefinition"></a>
# **createCutLabelDefinition**
> CutLabelDefinition createCutLabelDefinition(createRequest)

Create a Cut Label

Create a Cut Label valid in all scopes

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.CutLabelDefinitionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CutLabelDefinitionsApi apiInstance = new CutLabelDefinitionsApi();
CreateCutLabelDefinitionRequest createRequest = new CreateCutLabelDefinitionRequest(); // CreateCutLabelDefinitionRequest | The cut label definition
try {
    CutLabelDefinition result = apiInstance.createCutLabelDefinition(createRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CutLabelDefinitionsApi#createCutLabelDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createRequest** | [**CreateCutLabelDefinitionRequest**](CreateCutLabelDefinitionRequest.md)| The cut label definition | [optional]

### Return type

[**CutLabelDefinition**](CutLabelDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="deleteCutLabelDefinition"></a>
# **deleteCutLabelDefinition**
> OffsetDateTime deleteCutLabelDefinition(code)

Delete a Cut Label

Delete a specified cut label

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.CutLabelDefinitionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CutLabelDefinitionsApi apiInstance = new CutLabelDefinitionsApi();
String code = "code_example"; // String | The Code of the Cut Label that is being Deleted
try {
    OffsetDateTime result = apiInstance.deleteCutLabelDefinition(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CutLabelDefinitionsApi#deleteCutLabelDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| The Code of the Cut Label that is being Deleted |

### Return type

[**OffsetDateTime**](OffsetDateTime.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getCutLabelDefinition"></a>
# **getCutLabelDefinition**
> CutLabelDefinition getCutLabelDefinition(code, asAt)

Get a Cut Label

Get a specified cut label at a given time

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.CutLabelDefinitionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CutLabelDefinitionsApi apiInstance = new CutLabelDefinitionsApi();
String code = "code_example"; // String | The Code of the Cut Label that is being queried
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The time at which to get the Cut Label
try {
    CutLabelDefinition result = apiInstance.getCutLabelDefinition(code, asAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CutLabelDefinitionsApi#getCutLabelDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| The Code of the Cut Label that is being queried |
 **asAt** | **OffsetDateTime**| The time at which to get the Cut Label | [optional]

### Return type

[**CutLabelDefinition**](CutLabelDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="listCutLabelDefinitions"></a>
# **listCutLabelDefinitions**
> ResourceListOfCutLabelDefinition listCutLabelDefinitions(asAt, sortBy, start, limit, filter, query)

List Existing Cut Labels

List all the Cut Label Definitions that are valid at the given AsAt time

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.CutLabelDefinitionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CutLabelDefinitionsApi apiInstance = new CutLabelDefinitionsApi();
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The As At time at which listed Cut Labels are valid
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
String query = "query_example"; // String | Optional. Expression specifying the criteria that the returned cut labels must meet
try {
    ResourceListOfCutLabelDefinition result = apiInstance.listCutLabelDefinitions(asAt, sortBy, start, limit, filter, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CutLabelDefinitionsApi#listCutLabelDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asAt** | **OffsetDateTime**| Optional. The As At time at which listed Cut Labels are valid | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]
 **query** | **String**| Optional. Expression specifying the criteria that the returned cut labels must meet | [optional]

### Return type

[**ResourceListOfCutLabelDefinition**](ResourceListOfCutLabelDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="updateCutLabelDefinition"></a>
# **updateCutLabelDefinition**
> CutLabelDefinition updateCutLabelDefinition(code, updateRequest)

Update a Cut Label

Update a specified cut label

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.CutLabelDefinitionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CutLabelDefinitionsApi apiInstance = new CutLabelDefinitionsApi();
String code = "code_example"; // String | The Code of the Cut Label that is being updated
UpdateCutLabelDefinitionRequest updateRequest = new UpdateCutLabelDefinitionRequest(); // UpdateCutLabelDefinitionRequest | The cut label update definition
try {
    CutLabelDefinition result = apiInstance.updateCutLabelDefinition(code, updateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CutLabelDefinitionsApi#updateCutLabelDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| The Code of the Cut Label that is being updated |
 **updateRequest** | [**UpdateCutLabelDefinitionRequest**](UpdateCutLabelDefinitionRequest.md)| The cut label update definition | [optional]

### Return type

[**CutLabelDefinition**](CutLabelDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

