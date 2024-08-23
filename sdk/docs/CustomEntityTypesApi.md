# CustomEntityTypesApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomEntityType**](CustomEntityTypesApi.md#createCustomEntityType) | **POST** /api/customentitytypes | [EARLY ACCESS] CreateCustomEntityType: Define a new Custom Entity Type. |
| [**getCustomEntityType**](CustomEntityTypesApi.md#getCustomEntityType) | **GET** /api/customentitytypes/{entityType} | [EARLY ACCESS] GetCustomEntityType: Get a Custom Entity Type. |
| [**listCustomEntityTypes**](CustomEntityTypesApi.md#listCustomEntityTypes) | **GET** /api/customentitytypes | [EARLY ACCESS] ListCustomEntityTypes: List Custom Entity Types. |
| [**updateCustomEntityType**](CustomEntityTypesApi.md#updateCustomEntityType) | **PUT** /api/customentitytypes/{entityType} | [EARLY ACCESS] UpdateCustomEntityType: Modify an existing Custom Entity Type. |



## createCustomEntityType

> CustomEntityType createCustomEntityType(createCustomEntityTypeRequest)

[EARLY ACCESS] CreateCustomEntityType: Define a new Custom Entity Type.

The API will return a Bad Request if the Custom Entity Type already exists.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CustomEntityTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomEntityTypesApiExample {

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
        // CustomEntityTypesApi apiInstance = apiFactory.build(CustomEntityTypesApi.class);

        CustomEntityTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CustomEntityTypesApi.class);
        CreateCustomEntityTypeRequest createCustomEntityTypeRequest = new CreateCustomEntityTypeRequest(); // CreateCustomEntityTypeRequest | The payload containing the description of the Custom Entity Type.
        try {
            // uncomment the below to set overrides at the request level
            // CustomEntityType result = apiInstance.createCustomEntityType(createCustomEntityTypeRequest).execute(opts);

            CustomEntityType result = apiInstance.createCustomEntityType(createCustomEntityTypeRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomEntityTypesApi#createCustomEntityType");
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
| **createCustomEntityTypeRequest** | [**CreateCustomEntityTypeRequest**](CreateCustomEntityTypeRequest.md)| The payload containing the description of the Custom Entity Type. | |

### Return type

[**CustomEntityType**](CustomEntityType.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created Custom Entity Type. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getCustomEntityType

> CustomEntityType getCustomEntityType(entityType, asAt)

[EARLY ACCESS] GetCustomEntityType: Get a Custom Entity Type.

Retrieve a specific Custom Entity Type at a point in AsAt time.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CustomEntityTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomEntityTypesApiExample {

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
        // CustomEntityTypesApi apiInstance = apiFactory.build(CustomEntityTypesApi.class);

        CustomEntityTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CustomEntityTypesApi.class);
        String entityType = "entityType_example"; // String | The identifier for the Custom Entity Type, derived from the \"entityTypeName\" provided on creation.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The AsAt datetime at which to retrieve the definition.
        try {
            // uncomment the below to set overrides at the request level
            // CustomEntityType result = apiInstance.getCustomEntityType(entityType, asAt).execute(opts);

            CustomEntityType result = apiInstance.getCustomEntityType(entityType, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomEntityTypesApi#getCustomEntityType");
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
| **entityType** | **String**| The identifier for the Custom Entity Type, derived from the \&quot;entityTypeName\&quot; provided on creation. | |
| **asAt** | **OffsetDateTime**| The AsAt datetime at which to retrieve the definition. | [optional] |

### Return type

[**CustomEntityType**](CustomEntityType.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Custom Entity Type. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listCustomEntityTypes

> PagedResourceListOfCustomEntityType listCustomEntityTypes(asAt, limit, filter, sortBy, page)

[EARLY ACCESS] ListCustomEntityTypes: List Custom Entity Types.

List all Custom Entity Types matching particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CustomEntityTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomEntityTypesApiExample {

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
        // CustomEntityTypesApi apiInstance = apiFactory.build(CustomEntityTypesApi.class);

        CustomEntityTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CustomEntityTypesApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the entities. Defaults to returning the latest version   of each Custom Entity Type if not specified.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
        String page = "page_example"; // String | The pagination token to use to continue listing entities; this   value is returned from the previous call. If a pagination token is provided, the filter, limit, sortBy,   and asAt fields must not have changed since the original request.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfCustomEntityType result = apiInstance.listCustomEntityTypes(asAt, limit, filter, sortBy, page).execute(opts);

            PagedResourceListOfCustomEntityType result = apiInstance.listCustomEntityTypes(asAt, limit, filter, sortBy, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomEntityTypesApi#listCustomEntityTypes");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the entities. Defaults to returning the latest version   of each Custom Entity Type if not specified. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **page** | **String**| The pagination token to use to continue listing entities; this   value is returned from the previous call. If a pagination token is provided, the filter, limit, sortBy,   and asAt fields must not have changed since the original request. | [optional] |

### Return type

[**PagedResourceListOfCustomEntityType**](PagedResourceListOfCustomEntityType.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Custom Entity Types. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateCustomEntityType

> CustomEntityType updateCustomEntityType(entityType, updateCustomEntityTypeRequest)

[EARLY ACCESS] UpdateCustomEntityType: Modify an existing Custom Entity Type.

The API will return a Bad Request if the Custom Entity Type does not exist.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CustomEntityTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomEntityTypesApiExample {

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
        // CustomEntityTypesApi apiInstance = apiFactory.build(CustomEntityTypesApi.class);

        CustomEntityTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CustomEntityTypesApi.class);
        String entityType = "entityType_example"; // String | The identifier for the Custom Entity Type, derived from the \"entityTypeName\" provided on creation.
        UpdateCustomEntityTypeRequest updateCustomEntityTypeRequest = new UpdateCustomEntityTypeRequest(); // UpdateCustomEntityTypeRequest | The payload containing the description of the Custom Entity Type.
        try {
            // uncomment the below to set overrides at the request level
            // CustomEntityType result = apiInstance.updateCustomEntityType(entityType, updateCustomEntityTypeRequest).execute(opts);

            CustomEntityType result = apiInstance.updateCustomEntityType(entityType, updateCustomEntityTypeRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomEntityTypesApi#updateCustomEntityType");
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
| **entityType** | **String**| The identifier for the Custom Entity Type, derived from the \&quot;entityTypeName\&quot; provided on creation. | |
| **updateCustomEntityTypeRequest** | [**UpdateCustomEntityTypeRequest**](UpdateCustomEntityTypeRequest.md)| The payload containing the description of the Custom Entity Type. | |

### Return type

[**CustomEntityType**](CustomEntityType.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated Custom Entity Type. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

