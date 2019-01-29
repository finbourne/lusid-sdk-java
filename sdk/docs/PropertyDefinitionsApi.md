# PropertyDefinitionsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPropertyDefinition**](PropertyDefinitionsApi.md#createPropertyDefinition) | **POST** /api/propertydefinitions | Define a new property
[**deletePropertyDefinition**](PropertyDefinitionsApi.md#deletePropertyDefinition) | **DELETE** /api/propertydefinitions/{domain}/{scope}/{code} | Delete property definition
[**getMultiplePropertyDefinitions**](PropertyDefinitionsApi.md#getMultiplePropertyDefinitions) | **GET** /api/propertydefinitions | Get multiple property definitions
[**getPropertyDefinition**](PropertyDefinitionsApi.md#getPropertyDefinition) | **GET** /api/propertydefinitions/{domain}/{scope}/{code} | Get property definition
[**updatePropertyDefinition**](PropertyDefinitionsApi.md#updatePropertyDefinition) | **PUT** /api/propertydefinitions/{domain}/{scope}/{code} | Update the definition of the specified existing property


<a name="createPropertyDefinition"></a>
# **createPropertyDefinition**
> PropertyDefinition createPropertyDefinition(definition)

Define a new property

Create a new property definition

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PropertyDefinitionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi();
CreatePropertyDefinitionRequest definition = new CreatePropertyDefinitionRequest(); // CreatePropertyDefinitionRequest | The definition of the new property
try {
    PropertyDefinition result = apiInstance.createPropertyDefinition(definition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertyDefinitionsApi#createPropertyDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **definition** | [**CreatePropertyDefinitionRequest**](CreatePropertyDefinitionRequest.md)| The definition of the new property | [optional]

### Return type

[**PropertyDefinition**](PropertyDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="deletePropertyDefinition"></a>
# **deletePropertyDefinition**
> DeletedEntityResponse deletePropertyDefinition(domain, scope, code)

Delete property definition

Delete the definition of the specified property

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PropertyDefinitionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi();
String domain = "domain_example"; // String | The Property Domain of the property to be deleted
String scope = "scope_example"; // String | The scope of the property to be deleted
String code = "code_example"; // String | The code of the property to be deleted
try {
    DeletedEntityResponse result = apiInstance.deletePropertyDefinition(domain, scope, code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertyDefinitionsApi#deletePropertyDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| The Property Domain of the property to be deleted | [enum: Trade, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutDefinition]
 **scope** | **String**| The scope of the property to be deleted |
 **code** | **String**| The code of the property to be deleted |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getMultiplePropertyDefinitions"></a>
# **getMultiplePropertyDefinitions**
> ResourceListOfPropertyDefinition getMultiplePropertyDefinitions(propertyKeys, asAt, sortBy, start, limit, filter)

Get multiple property definitions

Get one or more property definitions

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PropertyDefinitionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi();
List<String> propertyKeys = Arrays.asList("propertyKeys_example"); // List<String> | One or more keys for properties for which the schema should be returned
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
try {
    ResourceListOfPropertyDefinition result = apiInstance.getMultiplePropertyDefinitions(propertyKeys, asAt, sortBy, start, limit, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertyDefinitionsApi#getMultiplePropertyDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| One or more keys for properties for which the schema should be returned | [optional]
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

### Return type

[**ResourceListOfPropertyDefinition**](ResourceListOfPropertyDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getPropertyDefinition"></a>
# **getPropertyDefinition**
> PropertyDefinition getPropertyDefinition(domain, scope, code, asAt)

Get property definition

Retrieve the definition for the identified property

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PropertyDefinitionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi();
String domain = "domain_example"; // String | The Property Domain of the requested property
String scope = "scope_example"; // String | The scope of the requested property
String code = "code_example"; // String | The code of the requested property
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
try {
    PropertyDefinition result = apiInstance.getPropertyDefinition(domain, scope, code, asAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertyDefinitionsApi#getPropertyDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| The Property Domain of the requested property | [enum: Trade, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutDefinition]
 **scope** | **String**| The scope of the requested property |
 **code** | **String**| The code of the requested property |
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]

### Return type

[**PropertyDefinition**](PropertyDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="updatePropertyDefinition"></a>
# **updatePropertyDefinition**
> PropertyDefinition updatePropertyDefinition(domain, scope, code, definition)

Update the definition of the specified existing property

Not all elements within a property definition are modifiable due to the potential implications for data  already stored against these properties

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PropertyDefinitionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PropertyDefinitionsApi apiInstance = new PropertyDefinitionsApi();
String domain = "domain_example"; // String | The Property Domain of the property being updated
String scope = "scope_example"; // String | The scope of the property to be updated
String code = "code_example"; // String | The code of the property to be updated
UpdatePropertyDefinitionRequest definition = new UpdatePropertyDefinitionRequest(); // UpdatePropertyDefinitionRequest | The updated definition of the property
try {
    PropertyDefinition result = apiInstance.updatePropertyDefinition(domain, scope, code, definition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropertyDefinitionsApi#updatePropertyDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| The Property Domain of the property being updated | [enum: Trade, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutDefinition]
 **scope** | **String**| The scope of the property to be updated |
 **code** | **String**| The code of the property to be updated |
 **definition** | [**UpdatePropertyDefinitionRequest**](UpdatePropertyDefinitionRequest.md)| The updated definition of the property | [optional]

### Return type

[**PropertyDefinition**](PropertyDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

