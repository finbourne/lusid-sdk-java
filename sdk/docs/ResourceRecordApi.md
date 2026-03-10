# ResourceRecordApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteResourceRecord**](ResourceRecordApi.md#deleteResourceRecord) | **DELETE** /api/resourcerecords/{scope}/{code}/{resourceId} | [EARLY ACCESS] DeleteResourceRecord: Delete a Resource Record |
| [**getResourceRecord**](ResourceRecordApi.md#getResourceRecord) | **GET** /api/resourcerecords/{scope}/{code}/{resourceId} | [EARLY ACCESS] GetResourceRecord: Get a Resource Record |
| [**listResourceRecordCodes**](ResourceRecordApi.md#listResourceRecordCodes) | **GET** /api/resourcerecords/{scope} | [EARLY ACCESS] ListResourceRecordCodes: List Resource Records Codes for Scope |
| [**listResourceRecordScopes**](ResourceRecordApi.md#listResourceRecordScopes) | **GET** /api/resourcerecords | [EARLY ACCESS] ListResourceRecordScopes: List Resource Record Scopes |
| [**listResourceRecords**](ResourceRecordApi.md#listResourceRecords) | **GET** /api/resourcerecords/{scope}/{code} | [EARLY ACCESS] ListResourceRecords: List Resource Records |
| [**upsertResourceRecord**](ResourceRecordApi.md#upsertResourceRecord) | **POST** /api/resourcerecords | [EARLY ACCESS] UpsertResourceRecord: Upsert a Resource Record |



## deleteResourceRecord

> DeletedEntityResponse deleteResourceRecord(scope, code, resourceId)

[EARLY ACCESS] DeleteResourceRecord: Delete a Resource Record

Delete a resource record.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ResourceRecordApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ResourceRecordApiExample {

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
        // ResourceRecordApi apiInstance = apiFactory.build(ResourceRecordApi.class);

        ResourceRecordApi apiInstance = ApiFactoryBuilder.build(fileName).build(ResourceRecordApi.class);
        String scope = "scope_example"; // String | The scope of the resource record.
        String code = "code_example"; // String | The code of the resource record.
        String resourceId = "resourceId_example"; // String | The resource identifier of the resource record.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteResourceRecord(scope, code, resourceId).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteResourceRecord(scope, code, resourceId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResourceRecordApi#deleteResourceRecord");
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
| **scope** | **String**| The scope of the resource record. | |
| **code** | **String**| The code of the resource record. | |
| **resourceId** | **String**| The resource identifier of the resource record. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The deleted entity metadata |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getResourceRecord

> ResourceRecord getResourceRecord(scope, code, resourceId, asAt)

[EARLY ACCESS] GetResourceRecord: Get a Resource Record

Retrieve a resource record by its identifier.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ResourceRecordApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ResourceRecordApiExample {

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
        // ResourceRecordApi apiInstance = apiFactory.build(ResourceRecordApi.class);

        ResourceRecordApi apiInstance = ApiFactoryBuilder.build(fileName).build(ResourceRecordApi.class);
        String scope = "scope_example"; // String | The scope of the resource record.
        String code = "code_example"; // String | The code of the resource record.
        String resourceId = "resourceId_example"; // String | The resource identifier of the resource record.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the resource record. Defaults to return the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceRecord result = apiInstance.getResourceRecord(scope, code, resourceId, asAt).execute(opts);

            ResourceRecord result = apiInstance.getResourceRecord(scope, code, resourceId, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResourceRecordApi#getResourceRecord");
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
| **scope** | **String**| The scope of the resource record. | |
| **code** | **String**| The code of the resource record. | |
| **resourceId** | **String**| The resource identifier of the resource record. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the resource record. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**ResourceRecord**](ResourceRecord.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested resource record. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listResourceRecordCodes

> ResourceListOfString listResourceRecordCodes(scope, asAt, sortOrder)

[EARLY ACCESS] ListResourceRecordCodes: List Resource Records Codes for Scope

List all resource records matching particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ResourceRecordApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ResourceRecordApiExample {

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
        // ResourceRecordApi apiInstance = apiFactory.build(ResourceRecordApi.class);

        ResourceRecordApi apiInstance = ApiFactoryBuilder.build(fileName).build(ResourceRecordApi.class);
        String scope = "scope_example"; // String | The scope of the resource record.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the resource record. Defaults to return the latest version if not specified.
        String sortOrder = "sortOrder_example"; // String | Order of the sort - either \"ASC\" or \"DESC\"
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfString result = apiInstance.listResourceRecordCodes(scope, asAt, sortOrder).execute(opts);

            ResourceListOfString result = apiInstance.listResourceRecordCodes(scope, asAt, sortOrder).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResourceRecordApi#listResourceRecordCodes");
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
| **scope** | **String**| The scope of the resource record. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the resource record. Defaults to return the latest version if not specified. | [optional] |
| **sortOrder** | **String**| Order of the sort - either \&quot;ASC\&quot; or \&quot;DESC\&quot; | [optional] |

### Return type

[**ResourceListOfString**](ResourceListOfString.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of resource record codes. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listResourceRecordScopes

> ResourceListOfScopeDefinition listResourceRecordScopes(asAt, page, limit)

[EARLY ACCESS] ListResourceRecordScopes: List Resource Record Scopes

List all resource records matching particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ResourceRecordApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ResourceRecordApiExample {

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
        // ResourceRecordApi apiInstance = apiFactory.build(ResourceRecordApi.class);

        ResourceRecordApi apiInstance = ApiFactoryBuilder.build(fileName).build(ResourceRecordApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the resource record. Defaults to return the latest version if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing resource records from a previous call.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfScopeDefinition result = apiInstance.listResourceRecordScopes(asAt, page, limit).execute(opts);

            ResourceListOfScopeDefinition result = apiInstance.listResourceRecordScopes(asAt, page, limit).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResourceRecordApi#listResourceRecordScopes");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the resource record. Defaults to return the latest version if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing resource records from a previous call. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |

### Return type

[**ResourceListOfScopeDefinition**](ResourceListOfScopeDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of resource records. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listResourceRecords

> PagedResourceListOfResourceRecord listResourceRecords(scope, code, asAt, page, sortBy, limit, filter)

[EARLY ACCESS] ListResourceRecords: List Resource Records

List all resource records matching particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ResourceRecordApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ResourceRecordApiExample {

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
        // ResourceRecordApi apiInstance = apiFactory.build(ResourceRecordApi.class);

        ResourceRecordApi apiInstance = ApiFactoryBuilder.build(fileName).build(ResourceRecordApi.class);
        String scope = "scope_example"; // String | The scope of the resource record.
        String code = "code_example"; // String | The code of the resource record.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the resource record. Defaults to return the latest version if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing resource records from a previous call.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfResourceRecord result = apiInstance.listResourceRecords(scope, code, asAt, page, sortBy, limit, filter).execute(opts);

            PagedResourceListOfResourceRecord result = apiInstance.listResourceRecords(scope, code, asAt, page, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResourceRecordApi#listResourceRecords");
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
| **scope** | **String**| The scope of the resource record. | |
| **code** | **String**| The code of the resource record. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the resource record. Defaults to return the latest version if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing resource records from a previous call. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. | [optional] |

### Return type

[**PagedResourceListOfResourceRecord**](PagedResourceListOfResourceRecord.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of resource records. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertResourceRecord

> ResourceRecord upsertResourceRecord(upsertResourceRecordRequest)

[EARLY ACCESS] UpsertResourceRecord: Upsert a Resource Record

Create or update a resource record.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ResourceRecordApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ResourceRecordApiExample {

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
        // ResourceRecordApi apiInstance = apiFactory.build(ResourceRecordApi.class);

        ResourceRecordApi apiInstance = ApiFactoryBuilder.build(fileName).build(ResourceRecordApi.class);
        UpsertResourceRecordRequest upsertResourceRecordRequest = new UpsertResourceRecordRequest(); // UpsertResourceRecordRequest | The resource record to upsert.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceRecord result = apiInstance.upsertResourceRecord(upsertResourceRecordRequest).execute(opts);

            ResourceRecord result = apiInstance.upsertResourceRecord(upsertResourceRecordRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ResourceRecordApi#upsertResourceRecord");
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
| **upsertResourceRecordRequest** | [**UpsertResourceRecordRequest**](UpsertResourceRecordRequest.md)| The resource record to upsert. | |

### Return type

[**ResourceRecord**](ResourceRecord.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The upserted resource record. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

