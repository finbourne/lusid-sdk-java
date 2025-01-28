# DataTypesApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDataType**](DataTypesApi.md#createDataType) | **POST** /api/datatypes | [EARLY ACCESS] CreateDataType: Create data type definition |
| [**deleteDataType**](DataTypesApi.md#deleteDataType) | **DELETE** /api/datatypes/{scope}/{code} | DeleteDataType: Delete a data type definition. |
| [**getDataType**](DataTypesApi.md#getDataType) | **GET** /api/datatypes/{scope}/{code} | GetDataType: Get data type definition |
| [**getUnitsFromDataType**](DataTypesApi.md#getUnitsFromDataType) | **GET** /api/datatypes/{scope}/{code}/units | [EARLY ACCESS] GetUnitsFromDataType: Get units from data type |
| [**listDataTypeSummaries**](DataTypesApi.md#listDataTypeSummaries) | **GET** /api/datatypes | [EARLY ACCESS] ListDataTypeSummaries: List all data type summaries, without the reference data |
| [**listDataTypes**](DataTypesApi.md#listDataTypes) | **GET** /api/datatypes/{scope} | ListDataTypes: List data types |
| [**updateDataType**](DataTypesApi.md#updateDataType) | **PUT** /api/datatypes/{scope}/{code} | [EARLY ACCESS] UpdateDataType: Update data type definition |
| [**updateReferenceData**](DataTypesApi.md#updateReferenceData) | **PUT** /api/datatypes/{scope}/{code}/referencedata | [EARLY ACCESS] UpdateReferenceData: Update all reference data on a data type, includes the reference values, the field definitions, field values |
| [**updateReferenceValues**](DataTypesApi.md#updateReferenceValues) | **PUT** /api/datatypes/{scope}/{code}/referencedatavalues | [EARLY ACCESS] UpdateReferenceValues: Update reference data on a data type |



## createDataType

> DataType createDataType(createDataTypeRequest)

[EARLY ACCESS] CreateDataType: Create data type definition

Create a new data type definition    Data types cannot be created in either the \&quot;default\&quot; or \&quot;system\&quot; scopes.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DataTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DataTypesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // DataTypesApi apiInstance = apiFactory.build(DataTypesApi.class);

        DataTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(DataTypesApi.class);
        CreateDataTypeRequest createDataTypeRequest = new CreateDataTypeRequest(); // CreateDataTypeRequest | The definition of the new data type
        try {
            // uncomment the below to set overrides at the request level
            // DataType result = apiInstance.createDataType(createDataTypeRequest).execute(opts);

            DataType result = apiInstance.createDataType(createDataTypeRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTypesApi#createDataType");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteDataType

> DeletedEntityResponse deleteDataType(scope, code)

DeleteDataType: Delete a data type definition.

Delete an existing data type definition.    Data types cannot be deleted in either the \&quot;default\&quot; or \&quot;system\&quot; scopes, scopes beginning with \&quot;LUSID-\&quot;,  or data types that are in use on a property definition.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DataTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DataTypesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // DataTypesApi apiInstance = apiFactory.build(DataTypesApi.class);

        DataTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(DataTypesApi.class);
        String scope = "scope_example"; // String | The scope of the data type
        String code = "code_example"; // String | The code of the data type
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteDataType(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteDataType(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTypesApi#deleteDataType");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getDataType

> DataType getDataType(scope, code, asAt)

GetDataType: Get data type definition

Get the definition of a specified data type

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DataTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DataTypesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // DataTypesApi apiInstance = apiFactory.build(DataTypesApi.class);

        DataTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(DataTypesApi.class);
        String scope = "scope_example"; // String | The scope of the data type
        String code = "code_example"; // String | The code of the data type
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the data type definition. Defaults to   return the latest version of the instrument definition if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // DataType result = apiInstance.getDataType(scope, code, asAt).execute(opts);

            DataType result = apiInstance.getDataType(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTypesApi#getDataType");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the data type definition. Defaults to   return the latest version of the instrument definition if not specified. | [optional] |

### Return type

[**DataType**](DataType.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getUnitsFromDataType

> ResourceListOfIUnitDefinitionDto getUnitsFromDataType(scope, code, units, filter, asAt)

[EARLY ACCESS] GetUnitsFromDataType: Get units from data type

Get the definitions of the specified units associated bound to a specific data type

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DataTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DataTypesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // DataTypesApi apiInstance = apiFactory.build(DataTypesApi.class);

        DataTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(DataTypesApi.class);
        String scope = "scope_example"; // String | The scope of the data type
        String code = "code_example"; // String | The code of the data type
        List<String> units = Arrays.asList(); // List<String> | One or more unit identifiers for which the definition is being requested
        String filter = "filter_example"; // String | Optional. Expression to filter the result set.    For example, to filter on the Schema, use \"schema eq 'string'\"   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The as at of the requested data type
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfIUnitDefinitionDto result = apiInstance.getUnitsFromDataType(scope, code, units, filter, asAt).execute(opts);

            ResourceListOfIUnitDefinitionDto result = apiInstance.getUnitsFromDataType(scope, code, units, filter, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTypesApi#getUnitsFromDataType");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
| **filter** | **String**| Optional. Expression to filter the result set.    For example, to filter on the Schema, use \&quot;schema eq &#39;string&#39;\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The as at of the requested data type | [optional] |

### Return type

[**ResourceListOfIUnitDefinitionDto**](ResourceListOfIUnitDefinitionDto.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listDataTypeSummaries

> PagedResourceListOfDataTypeSummary listDataTypeSummaries(asAt, page, limit, filter, sortBy)

[EARLY ACCESS] ListDataTypeSummaries: List all data type summaries, without the reference data

List all data type summaries

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DataTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DataTypesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // DataTypesApi apiInstance = apiFactory.build(DataTypesApi.class);

        DataTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(DataTypesApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the data type summaries. Defaults to returning the latest version   of each summary if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing data type summaries. This  value is returned from the previous call. If a pagination token is provided, the filter, sortBy  and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Optional. Expression to filter the result set.    For example, to filter on the Scope, use \"id.scope eq 'myscope'\", to filter on Schema, use \"schema eq 'string'\",   to filter on AcceptableValues use \"acceptableValues any (~ eq 'value')\"   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfDataTypeSummary result = apiInstance.listDataTypeSummaries(asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfDataTypeSummary result = apiInstance.listDataTypeSummaries(asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTypesApi#listDataTypeSummaries");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the data type summaries. Defaults to returning the latest version   of each summary if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing data type summaries. This  value is returned from the previous call. If a pagination token is provided, the filter, sortBy  and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set.    For example, to filter on the Scope, use \&quot;id.scope eq &#39;myscope&#39;\&quot;, to filter on Schema, use \&quot;schema eq &#39;string&#39;\&quot;,   to filter on AcceptableValues use \&quot;acceptableValues any (~ eq &#39;value&#39;)\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfDataTypeSummary**](PagedResourceListOfDataTypeSummary.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listDataTypes

> ResourceListOfDataType listDataTypes(scope, asAt, includeSystem, sortBy, limit, filter)

ListDataTypes: List data types

List all data types in a specified scope

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DataTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DataTypesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // DataTypesApi apiInstance = apiFactory.build(DataTypesApi.class);

        DataTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(DataTypesApi.class);
        String scope = "scope_example"; // String | The requested scope of the data types
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The as at of the requested data types
        Boolean includeSystem = true; // Boolean | Whether to additionally include those data types in the \"system\" scope
        List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
        Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Optional. Expression to filter the result set.   For example, to filter on the Display Name, use \"displayName eq 'string'\"   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfDataType result = apiInstance.listDataTypes(scope, asAt, includeSystem, sortBy, limit, filter).execute(opts);

            ResourceListOfDataType result = apiInstance.listDataTypes(scope, asAt, includeSystem, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTypesApi#listDataTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set.   For example, to filter on the Display Name, use \&quot;displayName eq &#39;string&#39;\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**ResourceListOfDataType**](ResourceListOfDataType.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateDataType

> DataType updateDataType(scope, code, updateDataTypeRequest)

[EARLY ACCESS] UpdateDataType: Update data type definition

Update the definition of the specified existing data type    Not all elements within a data type definition are modifiable due to the potential implications for data  already stored against the types

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DataTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DataTypesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // DataTypesApi apiInstance = apiFactory.build(DataTypesApi.class);

        DataTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(DataTypesApi.class);
        String scope = "scope_example"; // String | The scope of the data type
        String code = "code_example"; // String | The code of the data type
        UpdateDataTypeRequest updateDataTypeRequest = new UpdateDataTypeRequest(); // UpdateDataTypeRequest | The updated definition of the data type
        try {
            // uncomment the below to set overrides at the request level
            // DataType result = apiInstance.updateDataType(scope, code, updateDataTypeRequest).execute(opts);

            DataType result = apiInstance.updateDataType(scope, code, updateDataTypeRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTypesApi#updateDataType");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateReferenceData

> DataType updateReferenceData(scope, code, updateReferenceDataRequest)

[EARLY ACCESS] UpdateReferenceData: Update all reference data on a data type, includes the reference values, the field definitions, field values

Replaces the whole set of reference data

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DataTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DataTypesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // DataTypesApi apiInstance = apiFactory.build(DataTypesApi.class);

        DataTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(DataTypesApi.class);
        String scope = "scope_example"; // String | The scope of the data type
        String code = "code_example"; // String | The code of the data type
        UpdateReferenceDataRequest updateReferenceDataRequest = new UpdateReferenceDataRequest(); // UpdateReferenceDataRequest | The updated reference data
        try {
            // uncomment the below to set overrides at the request level
            // DataType result = apiInstance.updateReferenceData(scope, code, updateReferenceDataRequest).execute(opts);

            DataType result = apiInstance.updateReferenceData(scope, code, updateReferenceDataRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTypesApi#updateReferenceData");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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
| **updateReferenceDataRequest** | [**UpdateReferenceDataRequest**](UpdateReferenceDataRequest.md)| The updated reference data | |

### Return type

[**DataType**](DataType.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateReferenceValues

> DataType updateReferenceValues(scope, code, fieldValue)

[EARLY ACCESS] UpdateReferenceValues: Update reference data on a data type

Replaces the whole set of reference values

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DataTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DataTypesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // DataTypesApi apiInstance = apiFactory.build(DataTypesApi.class);

        DataTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(DataTypesApi.class);
        String scope = "scope_example"; // String | The scope of the data type
        String code = "code_example"; // String | The code of the data type
        List<FieldValue> fieldValue = Arrays.asList(); // List<FieldValue> | The updated reference values
        try {
            // uncomment the below to set overrides at the request level
            // DataType result = apiInstance.updateReferenceValues(scope, code, fieldValue).execute(opts);

            DataType result = apiInstance.updateReferenceValues(scope, code, fieldValue).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataTypesApi#updateReferenceValues");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

