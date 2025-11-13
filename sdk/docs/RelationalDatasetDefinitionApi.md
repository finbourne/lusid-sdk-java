# RelationalDatasetDefinitionApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRelationalDatasetDefinition**](RelationalDatasetDefinitionApi.md#createRelationalDatasetDefinition) | **POST** /api/relationaldatasetdefinitions | [EARLY ACCESS] CreateRelationalDatasetDefinition: Create a Relational Dataset Definition |
| [**deleteRelationalDatasetDefinition**](RelationalDatasetDefinitionApi.md#deleteRelationalDatasetDefinition) | **DELETE** /api/relationaldatasetdefinitions/{scope}/{code} | [EARLY ACCESS] DeleteRelationalDatasetDefinition: Delete a Relational Dataset Definition |
| [**getRelationalDatasetDefinition**](RelationalDatasetDefinitionApi.md#getRelationalDatasetDefinition) | **GET** /api/relationaldatasetdefinitions/{scope}/{code} | [EARLY ACCESS] GetRelationalDatasetDefinition: Get a Relational Dataset Definition |
| [**listRelationalDatasetDefinitions**](RelationalDatasetDefinitionApi.md#listRelationalDatasetDefinitions) | **GET** /api/relationaldatasetdefinitions | [EARLY ACCESS] ListRelationalDatasetDefinitions: List Relational Dataset Definitions |
| [**updateRelationalDatasetDefinition**](RelationalDatasetDefinitionApi.md#updateRelationalDatasetDefinition) | **PUT** /api/relationaldatasetdefinitions/{scope}/{code} | [EARLY ACCESS] UpdateRelationalDatasetDefinition: Update a Relational Dataset Definition |
| [**updateRelationalDatasetDetails**](RelationalDatasetDefinitionApi.md#updateRelationalDatasetDetails) | **POST** /api/relationaldatasetdefinitions/{scope}/{code}/details/$update | [EARLY ACCESS] UpdateRelationalDatasetDetails: Update Relational Dataset Details: DisplayName, Description and ApplicableEntityTypes |
| [**updateRelationalDatasetFieldSchema**](RelationalDatasetDefinitionApi.md#updateRelationalDatasetFieldSchema) | **POST** /api/relationaldatasetdefinitions/{scope}/{code}/fieldschema/$update | [EARLY ACCESS] UpdateRelationalDatasetFieldSchema: Update Relational Dataset Field Schema |



## createRelationalDatasetDefinition

> RelationalDatasetDefinition createRelationalDatasetDefinition(createRelationalDatasetDefinitionRequest)

[EARLY ACCESS] CreateRelationalDatasetDefinition: Create a Relational Dataset Definition

Create a new relational dataset definition.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RelationalDatasetDefinitionApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RelationalDatasetDefinitionApiExample {

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
        // RelationalDatasetDefinitionApi apiInstance = apiFactory.build(RelationalDatasetDefinitionApi.class);

        RelationalDatasetDefinitionApi apiInstance = ApiFactoryBuilder.build(fileName).build(RelationalDatasetDefinitionApi.class);
        CreateRelationalDatasetDefinitionRequest createRelationalDatasetDefinitionRequest = new CreateRelationalDatasetDefinitionRequest(); // CreateRelationalDatasetDefinitionRequest | The relational dataset definition to create.
        try {
            // uncomment the below to set overrides at the request level
            // RelationalDatasetDefinition result = apiInstance.createRelationalDatasetDefinition(createRelationalDatasetDefinitionRequest).execute(opts);

            RelationalDatasetDefinition result = apiInstance.createRelationalDatasetDefinition(createRelationalDatasetDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationalDatasetDefinitionApi#createRelationalDatasetDefinition");
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
| **createRelationalDatasetDefinitionRequest** | [**CreateRelationalDatasetDefinitionRequest**](CreateRelationalDatasetDefinitionRequest.md)| The relational dataset definition to create. | |

### Return type

[**RelationalDatasetDefinition**](RelationalDatasetDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created relational dataset definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteRelationalDatasetDefinition

> DeletedEntityResponse deleteRelationalDatasetDefinition(scope, code)

[EARLY ACCESS] DeleteRelationalDatasetDefinition: Delete a Relational Dataset Definition

Delete a relational dataset definition.  WARNING! This operation is irreversible. Deleting a relational dataset definition will also delete all associated data points.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RelationalDatasetDefinitionApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RelationalDatasetDefinitionApiExample {

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
        // RelationalDatasetDefinitionApi apiInstance = apiFactory.build(RelationalDatasetDefinitionApi.class);

        RelationalDatasetDefinitionApi apiInstance = ApiFactoryBuilder.build(fileName).build(RelationalDatasetDefinitionApi.class);
        String scope = "scope_example"; // String | The scope of the relational dataset definition.
        String code = "code_example"; // String | The code of the relational dataset definition.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteRelationalDatasetDefinition(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteRelationalDatasetDefinition(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationalDatasetDefinitionApi#deleteRelationalDatasetDefinition");
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
| **scope** | **String**| The scope of the relational dataset definition. | |
| **code** | **String**| The code of the relational dataset definition. | |

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


## getRelationalDatasetDefinition

> RelationalDatasetDefinition getRelationalDatasetDefinition(scope, code, asAt)

[EARLY ACCESS] GetRelationalDatasetDefinition: Get a Relational Dataset Definition

Retrieve a relational dataset definition by its identifier.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RelationalDatasetDefinitionApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RelationalDatasetDefinitionApiExample {

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
        // RelationalDatasetDefinitionApi apiInstance = apiFactory.build(RelationalDatasetDefinitionApi.class);

        RelationalDatasetDefinitionApi apiInstance = ApiFactoryBuilder.build(fileName).build(RelationalDatasetDefinitionApi.class);
        String scope = "scope_example"; // String | The scope of the relational dataset definition.
        String code = "code_example"; // String | The code of the relational dataset definition.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the relational dataset definition. Defaults to return the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // RelationalDatasetDefinition result = apiInstance.getRelationalDatasetDefinition(scope, code, asAt).execute(opts);

            RelationalDatasetDefinition result = apiInstance.getRelationalDatasetDefinition(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationalDatasetDefinitionApi#getRelationalDatasetDefinition");
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
| **scope** | **String**| The scope of the relational dataset definition. | |
| **code** | **String**| The code of the relational dataset definition. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the relational dataset definition. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**RelationalDatasetDefinition**](RelationalDatasetDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested relational dataset definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listRelationalDatasetDefinitions

> PagedResourceListOfRelationalDatasetDefinition listRelationalDatasetDefinitions(asAt, page, sortBy, limit, filter)

[EARLY ACCESS] ListRelationalDatasetDefinitions: List Relational Dataset Definitions

List all relational dataset definitions matching particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RelationalDatasetDefinitionApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RelationalDatasetDefinitionApiExample {

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
        // RelationalDatasetDefinitionApi apiInstance = apiFactory.build(RelationalDatasetDefinitionApi.class);

        RelationalDatasetDefinitionApi apiInstance = ApiFactoryBuilder.build(fileName).build(RelationalDatasetDefinitionApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the relational dataset definitions. Defaults to return the latest version if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing relational dataset definitions from a previous call to list relational dataset definitions.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfRelationalDatasetDefinition result = apiInstance.listRelationalDatasetDefinitions(asAt, page, sortBy, limit, filter).execute(opts);

            PagedResourceListOfRelationalDatasetDefinition result = apiInstance.listRelationalDatasetDefinitions(asAt, page, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationalDatasetDefinitionApi#listRelationalDatasetDefinitions");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the relational dataset definitions. Defaults to return the latest version if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing relational dataset definitions from a previous call to list relational dataset definitions. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. | [optional] |

### Return type

[**PagedResourceListOfRelationalDatasetDefinition**](PagedResourceListOfRelationalDatasetDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of relational dataset definitions. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateRelationalDatasetDefinition

> RelationalDatasetDefinition updateRelationalDatasetDefinition(scope, code, updateRelationalDatasetDefinitionRequest)

[EARLY ACCESS] UpdateRelationalDatasetDefinition: Update a Relational Dataset Definition

Update an existing relational dataset definition.  Applicable only to the definitions that are not yet in use i.e. there are no DataPoints associated with this definition.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RelationalDatasetDefinitionApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RelationalDatasetDefinitionApiExample {

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
        // RelationalDatasetDefinitionApi apiInstance = apiFactory.build(RelationalDatasetDefinitionApi.class);

        RelationalDatasetDefinitionApi apiInstance = ApiFactoryBuilder.build(fileName).build(RelationalDatasetDefinitionApi.class);
        String scope = "scope_example"; // String | The scope of the relational dataset definition.
        String code = "code_example"; // String | The code of the relational dataset definition.
        UpdateRelationalDatasetDefinitionRequest updateRelationalDatasetDefinitionRequest = new UpdateRelationalDatasetDefinitionRequest(); // UpdateRelationalDatasetDefinitionRequest | The updated relational dataset definition.
        try {
            // uncomment the below to set overrides at the request level
            // RelationalDatasetDefinition result = apiInstance.updateRelationalDatasetDefinition(scope, code, updateRelationalDatasetDefinitionRequest).execute(opts);

            RelationalDatasetDefinition result = apiInstance.updateRelationalDatasetDefinition(scope, code, updateRelationalDatasetDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationalDatasetDefinitionApi#updateRelationalDatasetDefinition");
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
| **scope** | **String**| The scope of the relational dataset definition. | |
| **code** | **String**| The code of the relational dataset definition. | |
| **updateRelationalDatasetDefinitionRequest** | [**UpdateRelationalDatasetDefinitionRequest**](UpdateRelationalDatasetDefinitionRequest.md)| The updated relational dataset definition. | [optional] |

### Return type

[**RelationalDatasetDefinition**](RelationalDatasetDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated relational dataset definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateRelationalDatasetDetails

> RelationalDatasetDefinition updateRelationalDatasetDetails(scope, code, updateRelationalDatasetDetails)

[EARLY ACCESS] UpdateRelationalDatasetDetails: Update Relational Dataset Details: DisplayName, Description and ApplicableEntityTypes

Update an existing relational dataset definition.  Applicable only to the definitions that are already in use i.e. contain DataPoints associated with this definition.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RelationalDatasetDefinitionApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RelationalDatasetDefinitionApiExample {

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
        // RelationalDatasetDefinitionApi apiInstance = apiFactory.build(RelationalDatasetDefinitionApi.class);

        RelationalDatasetDefinitionApi apiInstance = ApiFactoryBuilder.build(fileName).build(RelationalDatasetDefinitionApi.class);
        String scope = "scope_example"; // String | The scope of the relational dataset definition.
        String code = "code_example"; // String | The code of the relational dataset definition.
        UpdateRelationalDatasetDetails updateRelationalDatasetDetails = new UpdateRelationalDatasetDetails(); // UpdateRelationalDatasetDetails | The updated details of the relational dataset.
        try {
            // uncomment the below to set overrides at the request level
            // RelationalDatasetDefinition result = apiInstance.updateRelationalDatasetDetails(scope, code, updateRelationalDatasetDetails).execute(opts);

            RelationalDatasetDefinition result = apiInstance.updateRelationalDatasetDetails(scope, code, updateRelationalDatasetDetails).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationalDatasetDefinitionApi#updateRelationalDatasetDetails");
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
| **scope** | **String**| The scope of the relational dataset definition. | |
| **code** | **String**| The code of the relational dataset definition. | |
| **updateRelationalDatasetDetails** | [**UpdateRelationalDatasetDetails**](UpdateRelationalDatasetDetails.md)| The updated details of the relational dataset. | [optional] |

### Return type

[**RelationalDatasetDefinition**](RelationalDatasetDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated relational dataset definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateRelationalDatasetFieldSchema

> RelationalDatasetDefinition updateRelationalDatasetFieldSchema(scope, code, updateRelationalDatasetFieldSchema)

[EARLY ACCESS] UpdateRelationalDatasetFieldSchema: Update Relational Dataset Field Schema

Update an existing relational dataset definition with the new field schema.  Applicable only to the definitions that are already in use i.e. contain DataPoints associated with this definition.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RelationalDatasetDefinitionApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RelationalDatasetDefinitionApiExample {

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
        // RelationalDatasetDefinitionApi apiInstance = apiFactory.build(RelationalDatasetDefinitionApi.class);

        RelationalDatasetDefinitionApi apiInstance = ApiFactoryBuilder.build(fileName).build(RelationalDatasetDefinitionApi.class);
        String scope = "scope_example"; // String | The scope of the relational dataset definition.
        String code = "code_example"; // String | The code of the relational dataset definition.
        UpdateRelationalDatasetFieldSchema updateRelationalDatasetFieldSchema = new UpdateRelationalDatasetFieldSchema(); // UpdateRelationalDatasetFieldSchema | Relational dataset fields to add, update or remove.
        try {
            // uncomment the below to set overrides at the request level
            // RelationalDatasetDefinition result = apiInstance.updateRelationalDatasetFieldSchema(scope, code, updateRelationalDatasetFieldSchema).execute(opts);

            RelationalDatasetDefinition result = apiInstance.updateRelationalDatasetFieldSchema(scope, code, updateRelationalDatasetFieldSchema).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationalDatasetDefinitionApi#updateRelationalDatasetFieldSchema");
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
| **scope** | **String**| The scope of the relational dataset definition. | |
| **code** | **String**| The code of the relational dataset definition. | |
| **updateRelationalDatasetFieldSchema** | [**UpdateRelationalDatasetFieldSchema**](UpdateRelationalDatasetFieldSchema.md)| Relational dataset fields to add, update or remove. | [optional] |

### Return type

[**RelationalDatasetDefinition**](RelationalDatasetDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated relational dataset definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

