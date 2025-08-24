# CustomEntityDefinitionsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomEntityDefinition**](CustomEntityDefinitionsApi.md#createCustomEntityDefinition) | **POST** /api/customentities/entitytypes | [EARLY ACCESS] CreateCustomEntityDefinition: Define a new Custom Entity type. |
| [**getDefinition**](CustomEntityDefinitionsApi.md#getDefinition) | **GET** /api/customentities/entitytypes/{entityType} | [EARLY ACCESS] GetDefinition: Get a Custom Entity type definition. |
| [**listCustomEntityDefinitions**](CustomEntityDefinitionsApi.md#listCustomEntityDefinitions) | **GET** /api/customentities/entitytypes | [EARLY ACCESS] ListCustomEntityDefinitions: List the Custom Entity type definitions |
| [**updateCustomEntityDefinition**](CustomEntityDefinitionsApi.md#updateCustomEntityDefinition) | **PUT** /api/customentities/entitytypes/{entityType} | [EARLY ACCESS] UpdateCustomEntityDefinition: Modify an existing Custom Entity type. |



## createCustomEntityDefinition

> CustomEntityDefinition createCustomEntityDefinition(customEntityDefinitionRequest)

[EARLY ACCESS] CreateCustomEntityDefinition: Define a new Custom Entity type.

The API will return a Bad Request if the Custom Entity type already exists.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CustomEntityDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomEntityDefinitionsApiExample {

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
        // CustomEntityDefinitionsApi apiInstance = apiFactory.build(CustomEntityDefinitionsApi.class);

        CustomEntityDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CustomEntityDefinitionsApi.class);
        CustomEntityDefinitionRequest customEntityDefinitionRequest = new CustomEntityDefinitionRequest(); // CustomEntityDefinitionRequest | The payload containing the description of the Custom Entity type.
        try {
            // uncomment the below to set overrides at the request level
            // CustomEntityDefinition result = apiInstance.createCustomEntityDefinition(customEntityDefinitionRequest).execute(opts);

            CustomEntityDefinition result = apiInstance.createCustomEntityDefinition(customEntityDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomEntityDefinitionsApi#createCustomEntityDefinition");
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
| **customEntityDefinitionRequest** | [**CustomEntityDefinitionRequest**](CustomEntityDefinitionRequest.md)| The payload containing the description of the Custom Entity type. | |

### Return type

[**CustomEntityDefinition**](CustomEntityDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created Custom Entity type. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getDefinition

> CustomEntityDefinition getDefinition(entityType, asAt)

[EARLY ACCESS] GetDefinition: Get a Custom Entity type definition.

Retrieve a CustomEntityDefinition by a specific entityType at a point in AsAt time

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CustomEntityDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomEntityDefinitionsApiExample {

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
        // CustomEntityDefinitionsApi apiInstance = apiFactory.build(CustomEntityDefinitionsApi.class);

        CustomEntityDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CustomEntityDefinitionsApi.class);
        String entityType = "entityType_example"; // String | The identifier for the Custom Entity type, derived from the \"entityTypeName\" provided on creation.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The AsAt datetime at which to retrieve the definition.
        try {
            // uncomment the below to set overrides at the request level
            // CustomEntityDefinition result = apiInstance.getDefinition(entityType, asAt).execute(opts);

            CustomEntityDefinition result = apiInstance.getDefinition(entityType, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomEntityDefinitionsApi#getDefinition");
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
| **entityType** | **String**| The identifier for the Custom Entity type, derived from the \&quot;entityTypeName\&quot; provided on creation. | |
| **asAt** | **OffsetDateTime**| The AsAt datetime at which to retrieve the definition. | [optional] |

### Return type

[**CustomEntityDefinition**](CustomEntityDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Custom Entity definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listCustomEntityDefinitions

> PagedResourceListOfCustomEntityDefinition listCustomEntityDefinitions(asAt, limit, filter, page)

[EARLY ACCESS] ListCustomEntityDefinitions: List the Custom Entity type definitions

List all Custom Entity type definitions matching particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CustomEntityDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomEntityDefinitionsApiExample {

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
        // CustomEntityDefinitionsApi apiInstance = apiFactory.build(CustomEntityDefinitionsApi.class);

        CustomEntityDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CustomEntityDefinitionsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the entities. Defaults to returning the latest version   of each portfolio if not specified.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        String page = "page_example"; // String | The pagination token to use to continue listing entities; this   value is returned from the previous call. If a pagination token is provided, the filter, limit   and asAt fields must not have changed since the original request.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfCustomEntityDefinition result = apiInstance.listCustomEntityDefinitions(asAt, limit, filter, page).execute(opts);

            PagedResourceListOfCustomEntityDefinition result = apiInstance.listCustomEntityDefinitions(asAt, limit, filter, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomEntityDefinitionsApi#listCustomEntityDefinitions");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the entities. Defaults to returning the latest version   of each portfolio if not specified. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **page** | **String**| The pagination token to use to continue listing entities; this   value is returned from the previous call. If a pagination token is provided, the filter, limit   and asAt fields must not have changed since the original request. | [optional] |

### Return type

[**PagedResourceListOfCustomEntityDefinition**](PagedResourceListOfCustomEntityDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Custom Entity type definitions. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateCustomEntityDefinition

> CustomEntityDefinition updateCustomEntityDefinition(entityType, updateCustomEntityDefinitionRequest)

[EARLY ACCESS] UpdateCustomEntityDefinition: Modify an existing Custom Entity type.

The API will return a Bad Request if the Custom Entity type does not exist.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CustomEntityDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomEntityDefinitionsApiExample {

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
        // CustomEntityDefinitionsApi apiInstance = apiFactory.build(CustomEntityDefinitionsApi.class);

        CustomEntityDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CustomEntityDefinitionsApi.class);
        String entityType = "entityType_example"; // String | The identifier for the Custom Entity type, derived from the \"entityTypeName\" provided on creation.
        UpdateCustomEntityDefinitionRequest updateCustomEntityDefinitionRequest = new UpdateCustomEntityDefinitionRequest(); // UpdateCustomEntityDefinitionRequest | The payload containing the description of the Custom Entity type.
        try {
            // uncomment the below to set overrides at the request level
            // CustomEntityDefinition result = apiInstance.updateCustomEntityDefinition(entityType, updateCustomEntityDefinitionRequest).execute(opts);

            CustomEntityDefinition result = apiInstance.updateCustomEntityDefinition(entityType, updateCustomEntityDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomEntityDefinitionsApi#updateCustomEntityDefinition");
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
| **entityType** | **String**| The identifier for the Custom Entity type, derived from the \&quot;entityTypeName\&quot; provided on creation. | |
| **updateCustomEntityDefinitionRequest** | [**UpdateCustomEntityDefinitionRequest**](UpdateCustomEntityDefinitionRequest.md)| The payload containing the description of the Custom Entity type. | |

### Return type

[**CustomEntityDefinition**](CustomEntityDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated Custom Entity type. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

