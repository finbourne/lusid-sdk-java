# DataTypesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataType**](DataTypesApi.md#getDataType) | **GET** /api/datatypes/{scope}/{code} | Get data type definition
[**getUnitsFromDataType**](DataTypesApi.md#getUnitsFromDataType) | **GET** /api/datatypes/{scope}/{code}/units | Get units from data type
[**listDataTypes**](DataTypesApi.md#listDataTypes) | **GET** /api/datatypes/{scope} | List data types


<a name="getDataType"></a>
# **getDataType**
> DataType getDataType(scope, code)

Get data type definition

Get the definition of a specified data type

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.DataTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DataTypesApi apiInstance = new DataTypesApi();
String scope = "scope_example"; // String | The scope of the data type
String code = "code_example"; // String | The code of the data type
try {
    DataType result = apiInstance.getDataType(scope, code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTypesApi#getDataType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the data type |
 **code** | **String**| The code of the data type |

### Return type

[**DataType**](DataType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getUnitsFromDataType"></a>
# **getUnitsFromDataType**
> ResourceListOfIUnitDefinitionDto getUnitsFromDataType(scope, code, units, filter)

Get units from data type

Get the definitions of the specified units associated bound to a specific data type

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.DataTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DataTypesApi apiInstance = new DataTypesApi();
String scope = "scope_example"; // String | The scope of the data type
String code = "code_example"; // String | The code of the data type
List<String> units = Arrays.asList("units_example"); // List<String> | One or more unit identifiers for which the definition is being requested
String filter = "filter_example"; // String | Optional. Expression to filter the result set
try {
    ResourceListOfIUnitDefinitionDto result = apiInstance.getUnitsFromDataType(scope, code, units, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTypesApi#getUnitsFromDataType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the data type |
 **code** | **String**| The code of the data type |
 **units** | [**List&lt;String&gt;**](String.md)| One or more unit identifiers for which the definition is being requested | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

### Return type

[**ResourceListOfIUnitDefinitionDto**](ResourceListOfIUnitDefinitionDto.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="listDataTypes"></a>
# **listDataTypes**
> ResourceListOfDataType listDataTypes(scope, includeDefault, includeSystem, sortBy, start, limit, filter)

List data types

List all data types in a specified scope

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.DataTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

DataTypesApi apiInstance = new DataTypesApi();
String scope = "scope_example"; // String | The requested scope of the data types
Boolean includeDefault = true; // Boolean | Whether to additionally include those data types in the \"default\" scope
Boolean includeSystem = true; // Boolean | Whether to additionally include those data types in the \"system\" scope
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
try {
    ResourceListOfDataType result = apiInstance.listDataTypes(scope, includeDefault, includeSystem, sortBy, start, limit, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTypesApi#listDataTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The requested scope of the data types |
 **includeDefault** | **Boolean**| Whether to additionally include those data types in the \&quot;default\&quot; scope | [optional]
 **includeSystem** | **Boolean**| Whether to additionally include those data types in the \&quot;system\&quot; scope | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

### Return type

[**ResourceListOfDataType**](ResourceListOfDataType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

