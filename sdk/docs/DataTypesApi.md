# DataTypesApi

All URIs are relative to *http://local-unit-test-server.lusid.com:51367*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataType**](DataTypesApi.md#getDataType) | **GET** /api/datatypes/{scope}/{code} | [EARLY ACCESS] Get data type definition
[**getUnitsFromDataType**](DataTypesApi.md#getUnitsFromDataType) | **GET** /api/datatypes/{scope}/{code}/units | [EARLY ACCESS] Get units from data type
[**listDataTypes**](DataTypesApi.md#listDataTypes) | **GET** /api/datatypes/{scope} | [EARLY ACCESS] List data types


<a name="getDataType"></a>
# **getDataType**
> DataType getDataType(scope, code, asAt)

[EARLY ACCESS] Get data type definition

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:51367");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the data type
    String code = "code_example"; // String | The code of the data type
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the data type definition. Defaults to              return the latest version of the instrument definition if not specified.
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the data type |
 **code** | **String**| The code of the data type |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the data type definition. Defaults to              return the latest version of the instrument definition if not specified. | [optional]

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
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getUnitsFromDataType"></a>
# **getUnitsFromDataType**
> ResourceListOfIUnitDefinitionDto getUnitsFromDataType(scope, code, units, filter, asAt)

[EARLY ACCESS] Get units from data type

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:51367");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the data type
    String code = "code_example"; // String | The code of the data type
    List<String> units = Arrays.asList(); // List<String> | One or more unit identifiers for which the definition is being requested
    String filter = "filter_example"; // String | Optional. Expression to filter the result set.               For example, to filter on the Schema, use \"schema eq 'string'\"              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The as at of the requested data type
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the data type |
 **code** | **String**| The code of the data type |
 **units** | [**List&lt;String&gt;**](String.md)| One or more unit identifiers for which the definition is being requested | [optional]
 **filter** | **String**| Optional. Expression to filter the result set.               For example, to filter on the Schema, use \&quot;schema eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **asAt** | **OffsetDateTime**| Optional. The as at of the requested data type | [optional]

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
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listDataTypes"></a>
# **listDataTypes**
> ResourceListOfDataType listDataTypes(scope, asAt, includeSystem, sortBy, start, limit, filter)

[EARLY ACCESS] List data types

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:51367");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    String scope = "scope_example"; // String | The requested scope of the data types
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The as at of the requested data types
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The requested scope of the data types |
 **asAt** | **OffsetDateTime**| The as at of the requested data types | [optional]
 **includeSystem** | **Boolean**| Whether to additionally include those data types in the \&quot;system\&quot; scope | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set.              For example, to filter on the Display Name, use \&quot;displayName eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

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
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

