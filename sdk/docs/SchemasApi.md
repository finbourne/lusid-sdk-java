# SchemasApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntitySchema**](SchemasApi.md#getEntitySchema) | **GET** /api/schemas/entities/{entity} | Get schema
[**getPropertySchema**](SchemasApi.md#getPropertySchema) | **GET** /api/schemas/properties | Get property schema
[**getValueTypes**](SchemasApi.md#getValueTypes) | **GET** /api/schemas/types | Get value types
[**listEntities**](SchemasApi.md#listEntities) | **GET** /api/schemas/entities | List entities


<a name="getEntitySchema"></a>
# **getEntitySchema**
> Schema getEntitySchema(entity)

Get schema

Gets the schema and meta-data for a given entity

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.SchemasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SchemasApi apiInstance = new SchemasApi();
String entity = "entity_example"; // String | The name of a valid entity
try {
    Schema result = apiInstance.getEntitySchema(entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemasApi#getEntitySchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**| The name of a valid entity |

### Return type

[**Schema**](Schema.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getPropertySchema"></a>
# **getPropertySchema**
> PropertySchema getPropertySchema(propertyKeys, asAt)

Get property schema

Get the schemas for the provided list of property keys.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.SchemasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SchemasApi apiInstance = new SchemasApi();
List<String> propertyKeys = Arrays.asList("propertyKeys_example"); // List<String> | One or more property keys for which the schema is requested
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
try {
    PropertySchema result = apiInstance.getPropertySchema(propertyKeys, asAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemasApi#getPropertySchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| One or more property keys for which the schema is requested | [optional]
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]

### Return type

[**PropertySchema**](PropertySchema.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getValueTypes"></a>
# **getValueTypes**
> ResourceListOfValueType getValueTypes(sortBy, start, limit)

Get value types

Gets the available value types for which a schema is available.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.SchemasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SchemasApi apiInstance = new SchemasApi();
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
try {
    ResourceListOfValueType result = apiInstance.getValueTypes(sortBy, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemasApi#getValueTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]

### Return type

[**ResourceListOfValueType**](ResourceListOfValueType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="listEntities"></a>
# **listEntities**
> ResourceListOfString listEntities()

List entities

List all available entities for which schema information is available.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.SchemasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SchemasApi apiInstance = new SchemasApi();
try {
    ResourceListOfString result = apiInstance.listEntities();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchemasApi#listEntities");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResourceListOfString**](ResourceListOfString.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

