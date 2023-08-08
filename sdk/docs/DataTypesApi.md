# DataTypesApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDataType**](DataTypesApi.md#createDataType) | **POST** /api/datatypes | [EARLY ACCESS] CreateDataType: Create data type definition |
| [**getDataType**](DataTypesApi.md#getDataType) | **GET** /api/datatypes/{scope}/{code} | GetDataType: Get data type definition |
| [**getUnitsFromDataType**](DataTypesApi.md#getUnitsFromDataType) | **GET** /api/datatypes/{scope}/{code}/units | [EARLY ACCESS] GetUnitsFromDataType: Get units from data type |
| [**listDataTypeSummaries**](DataTypesApi.md#listDataTypeSummaries) | **GET** /api/datatypes | [EARLY ACCESS] ListDataTypeSummaries: List all data type summaries, without the reference data |
| [**listDataTypes**](DataTypesApi.md#listDataTypes) | **GET** /api/datatypes/{scope} | ListDataTypes: List data types |
| [**updateDataType**](DataTypesApi.md#updateDataType) | **PUT** /api/datatypes/{scope}/{code} | [EARLY ACCESS] UpdateDataType: Update data type definition |
| [**updateReferenceValues**](DataTypesApi.md#updateReferenceValues) | **PUT** /api/datatypes/{scope}/{code}/referencedatavalues | [EARLY ACCESS] UpdateReferenceValues: Update reference data on a data type |


<a id="createDataType"></a>
# **createDataType**
> DataType createDataType(createDataTypeRequest)

[EARLY ACCESS] CreateDataType: Create data type definition

Create a new data type definition    Data types cannot be created in either the \&quot;default\&quot; or \&quot;system\&quot; scopes.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.DataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    CreateDataTypeRequest createDataTypeRequest = new CreateDataTypeRequest(); // CreateDataTypeRequest | The definition of the new data type
    try {
      DataType result = apiInstance.createDataType(createDataTypeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#createDataType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDataTypeRequest** | [**CreateDataTypeRequest**](CreateDataTypeRequest.md)| The definition of the new data type | [optional] |

### Return type

[**DataType**](DataType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getDataType"></a>
# **getDataType**
> DataType getDataType(scope, code, asAt)

GetDataType: Get data type definition

Get the definition of a specified data type

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.DataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the data type
    String code = "code_example"; // String | The code of the data type
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the data type definition. Defaults to              return the latest version of the instrument definition if not specified.
    try {
      DataType result = apiInstance.getDataType(scope, code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#getDataType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the data type | |
| **code** | **String**| The code of the data type | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the data type definition. Defaults to              return the latest version of the instrument definition if not specified. | [optional] |

### Return type

[**DataType**](DataType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getUnitsFromDataType"></a>
# **getUnitsFromDataType**
> ResourceListOfIUnitDefinitionDto getUnitsFromDataType(scope, code, units, filter, asAt)

[EARLY ACCESS] GetUnitsFromDataType: Get units from data type

Get the definitions of the specified units associated bound to a specific data type

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.DataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the data type
    String code = "code_example"; // String | The code of the data type
    List<String> units = Arrays.asList(); // List<String> | One or more unit identifiers for which the definition is being requested
    String filter = "filter_example"; // String | Optional. Expression to filter the result set.               For example, to filter on the Schema, use \"schema eq 'string'\"              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The as at of the requested data type
    try {
      ResourceListOfIUnitDefinitionDto result = apiInstance.getUnitsFromDataType(scope, code, units, filter, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#getUnitsFromDataType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the data type | |
| **code** | **String**| The code of the data type | |
| **units** | [**List&lt;String&gt;**](String.md)| One or more unit identifiers for which the definition is being requested | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set.               For example, to filter on the Schema, use \&quot;schema eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The as at of the requested data type | [optional] |

### Return type

[**ResourceListOfIUnitDefinitionDto**](ResourceListOfIUnitDefinitionDto.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listDataTypeSummaries"></a>
# **listDataTypeSummaries**
> PagedResourceListOfDataTypeSummary listDataTypeSummaries(asAt, page, start, limit, filter, sortBy)

[EARLY ACCESS] ListDataTypeSummaries: List all data type summaries, without the reference data

List all data type summaries

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.DataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the data type summaries. Defaults to returning the latest version               of each summary if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing data type summaries. This  value is returned from the previous call. If a pagination token is provided, the filter, sortBy  and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Optional. Expression to filter the result set.                For example, to filter on the Scope, use \"id.scope eq 'myscope'\", to filter on Schema, use \"schema eq 'string'\",               to filter on AcceptableValues use \"acceptableValues any (~ eq 'value')\"               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
    try {
      PagedResourceListOfDataTypeSummary result = apiInstance.listDataTypeSummaries(asAt, page, start, limit, filter, sortBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#listDataTypeSummaries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the data type summaries. Defaults to returning the latest version               of each summary if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing data type summaries. This  value is returned from the previous call. If a pagination token is provided, the filter, sortBy  and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set.                For example, to filter on the Scope, use \&quot;id.scope eq &#39;myscope&#39;\&quot;, to filter on Schema, use \&quot;schema eq &#39;string&#39;\&quot;,               to filter on AcceptableValues use \&quot;acceptableValues any (~ eq &#39;value&#39;)\&quot;               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfDataTypeSummary**](PagedResourceListOfDataTypeSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listDataTypes"></a>
# **listDataTypes**
> ResourceListOfDataType listDataTypes(scope, asAt, includeSystem, sortBy, start, limit, filter)

ListDataTypes: List data types

List all data types in a specified scope

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.DataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    String scope = "scope_example"; // String | The requested scope of the data types
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The as at of the requested data types
    Boolean includeSystem = true; // Boolean | Whether to additionally include those data types in the \"system\" scope
    List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
    Integer start = 56; // Integer | Optional. When paginating, skip this number of results
    Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Optional. Expression to filter the result set.              For example, to filter on the Display Name, use \"displayName eq 'string'\"              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      ResourceListOfDataType result = apiInstance.listDataTypes(scope, asAt, includeSystem, sortBy, start, limit, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#listDataTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The requested scope of the data types | |
| **asAt** | **OffsetDateTime**| The as at of the requested data types | [optional] |
| **includeSystem** | **Boolean**| Whether to additionally include those data types in the \&quot;system\&quot; scope | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **start** | **Integer**| Optional. When paginating, skip this number of results | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set.              For example, to filter on the Display Name, use \&quot;displayName eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**ResourceListOfDataType**](ResourceListOfDataType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateDataType"></a>
# **updateDataType**
> DataType updateDataType(scope, code, updateDataTypeRequest)

[EARLY ACCESS] UpdateDataType: Update data type definition

Update the definition of the specified existing data type    Not all elements within a data type definition are modifiable due to the potential implications for data  already stored against the types

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.DataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the data type
    String code = "code_example"; // String | The code of the data type
    UpdateDataTypeRequest updateDataTypeRequest = new UpdateDataTypeRequest(); // UpdateDataTypeRequest | The updated definition of the data type
    try {
      DataType result = apiInstance.updateDataType(scope, code, updateDataTypeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#updateDataType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the data type | |
| **code** | **String**| The code of the data type | |
| **updateDataTypeRequest** | [**UpdateDataTypeRequest**](UpdateDataTypeRequest.md)| The updated definition of the data type | |

### Return type

[**DataType**](DataType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateReferenceValues"></a>
# **updateReferenceValues**
> DataType updateReferenceValues(scope, code, fieldValue)

[EARLY ACCESS] UpdateReferenceValues: Update reference data on a data type

Replaces the whole set of reference values

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.DataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the data type
    String code = "code_example"; // String | The code of the data type
    List<FieldValue> fieldValue = Arrays.asList(); // List<FieldValue> | The updated reference values
    try {
      DataType result = apiInstance.updateReferenceValues(scope, code, fieldValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#updateReferenceValues");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the data type | |
| **code** | **String**| The code of the data type | |
| **fieldValue** | [**List&lt;FieldValue&gt;**](FieldValue.md)| The updated reference values | |

### Return type

[**DataType**](DataType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

