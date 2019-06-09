# DataTypesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDataType**](DataTypesApi.md#createDataType) | **POST** /api/datatypes | Create data type definition
[**getDataType**](DataTypesApi.md#getDataType) | **GET** /api/datatypes/{scope}/{code} | Get data type definition
[**getUnitsFromDataType**](DataTypesApi.md#getUnitsFromDataType) | **GET** /api/datatypes/{scope}/{code}/units | Get units from data type
[**listDataTypes**](DataTypesApi.md#listDataTypes) | **GET** /api/datatypes/{scope} | List data types
[**updateDataType**](DataTypesApi.md#updateDataType) | **PUT** /api/datatypes/{scope}/{code} | Update data type definition


<a name="createDataType"></a>
# **createDataType**
> DataType createDataType(request)

Create data type definition

Create a new data type definition    Data types cannot be created in either the \&quot;default\&quot; or \&quot;system\&quot; scopes.

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
CreateDataTypeRequest request = new CreateDataTypeRequest(); // CreateDataTypeRequest | The definition of the new data type
try {
    DataType result = apiInstance.createDataType(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTypesApi#createDataType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateDataTypeRequest**](CreateDataTypeRequest.md)| The definition of the new data type | [optional]

### Return type

[**DataType**](DataType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

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
> ResourceListOfDataType listDataTypes(scope, includeSystem, sortBy, start, limit, filter)

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
Boolean includeSystem = true; // Boolean | Whether to additionally include those data types in the \"system\" scope
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
try {
    ResourceListOfDataType result = apiInstance.listDataTypes(scope, includeSystem, sortBy, start, limit, filter);
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

<a name="updateDataType"></a>
# **updateDataType**
> DataType updateDataType(scope, code, request)

Update data type definition

Update the definition of the specified existing data type    Not all elements within a data type definition are modifiable due to the potential implications for data  already stored against the types

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
UpdateDataTypeRequest request = new UpdateDataTypeRequest(); // UpdateDataTypeRequest | The updated definition of the data type
try {
    DataType result = apiInstance.updateDataType(scope, code, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTypesApi#updateDataType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the data type |
 **code** | **String**| The code of the data type |
 **request** | [**UpdateDataTypeRequest**](UpdateDataTypeRequest.md)| The updated definition of the data type | [optional]

### Return type

[**DataType**](DataType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

