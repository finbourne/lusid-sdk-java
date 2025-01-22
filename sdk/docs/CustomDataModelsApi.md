# CustomDataModelsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomDataModel**](CustomDataModelsApi.md#createCustomDataModel) | **POST** /api/datamodel/{entityType}/{scope}/{code} | [EXPERIMENTAL] CreateCustomDataModel: Create a Custom Data Model |
| [**deleteCustomDataModel**](CustomDataModelsApi.md#deleteCustomDataModel) | **DELETE** /api/datamodel/{scope}/{code} | [EXPERIMENTAL] DeleteCustomDataModel: Delete a Custom Data Model |
| [**getCustomDataModel**](CustomDataModelsApi.md#getCustomDataModel) | **GET** /api/datamodel/{scope}/{code} | [EXPERIMENTAL] GetCustomDataModel: Get a Custom Data Model |
| [**listDataModelHierarchies**](CustomDataModelsApi.md#listDataModelHierarchies) | **GET** /api/datamodel/hierarchies | [EXPERIMENTAL] ListDataModelHierarchies: List Custom Data Model hierarchies. |
| [**listSupportedEntityTypes**](CustomDataModelsApi.md#listSupportedEntityTypes) | **GET** /api/datamodel/entitytype | [EXPERIMENTAL] ListSupportedEntityTypes: List the currently supported entity types for use in Custom Data Models. |
| [**updateCustomDataModel**](CustomDataModelsApi.md#updateCustomDataModel) | **PUT** /api/datamodel/{entityType}/{scope}/{code} | [EXPERIMENTAL] UpdateCustomDataModel: Update a Custom Data Model |



## createCustomDataModel

> CustomDataModel createCustomDataModel(scope, code, entityType, upsertCustomDataModelRequest)

[EXPERIMENTAL] CreateCustomDataModel: Create a Custom Data Model

Creates a Custom Data Model.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CustomDataModelsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomDataModelsApiExample {

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
        // CustomDataModelsApi apiInstance = apiFactory.build(CustomDataModelsApi.class);

        CustomDataModelsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CustomDataModelsApi.class);
        String scope = "scope_example"; // String | The scope of the specified Data Model.
        String code = "code_example"; // String | The code of the specified Data Model.
        String entityType = "entityType_example"; // String | The entity type of the Data Model.
        UpsertCustomDataModelRequest upsertCustomDataModelRequest = new UpsertCustomDataModelRequest(); // UpsertCustomDataModelRequest | The request containing the details of the Data Model.
        try {
            // uncomment the below to set overrides at the request level
            // CustomDataModel result = apiInstance.createCustomDataModel(scope, code, entityType, upsertCustomDataModelRequest).execute(opts);

            CustomDataModel result = apiInstance.createCustomDataModel(scope, code, entityType, upsertCustomDataModelRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDataModelsApi#createCustomDataModel");
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
| **scope** | **String**| The scope of the specified Data Model. | |
| **code** | **String**| The code of the specified Data Model. | |
| **entityType** | **String**| The entity type of the Data Model. | |
| **upsertCustomDataModelRequest** | [**UpsertCustomDataModelRequest**](UpsertCustomDataModelRequest.md)| The request containing the details of the Data Model. | [optional] |

### Return type

[**CustomDataModel**](CustomDataModel.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created Data Model |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteCustomDataModel

> DeletedEntityResponse deleteCustomDataModel(scope, code)

[EXPERIMENTAL] DeleteCustomDataModel: Delete a Custom Data Model

Delete a Custom Data Model. The data model will remain viewable at previous as at times, but will no longer  be part of any hierarchies.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CustomDataModelsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomDataModelsApiExample {

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
        // CustomDataModelsApi apiInstance = apiFactory.build(CustomDataModelsApi.class);

        CustomDataModelsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CustomDataModelsApi.class);
        String scope = "scope_example"; // String | The scope of the specified Data Model.
        String code = "code_example"; // String | The code of the specified Data Model.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteCustomDataModel(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteCustomDataModel(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDataModelsApi#deleteCustomDataModel");
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
| **scope** | **String**| The scope of the specified Data Model. | |
| **code** | **String**| The code of the specified Data Model. | |

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


## getCustomDataModel

> CustomDataModel getCustomDataModel(scope, code, asAt)

[EXPERIMENTAL] GetCustomDataModel: Get a Custom Data Model

Retrieves a Custom Data Model at a given as at time.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CustomDataModelsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomDataModelsApiExample {

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
        // CustomDataModelsApi apiInstance = apiFactory.build(CustomDataModelsApi.class);

        CustomDataModelsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CustomDataModelsApi.class);
        String scope = "scope_example"; // String | The scope of the specified Data Model.
        String code = "code_example"; // String | The code of the specified Data Model.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Data Model. Defaults to return   the latest version of the Data Model if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // CustomDataModel result = apiInstance.getCustomDataModel(scope, code, asAt).execute(opts);

            CustomDataModel result = apiInstance.getCustomDataModel(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDataModelsApi#getCustomDataModel");
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
| **scope** | **String**| The scope of the specified Data Model. | |
| **code** | **String**| The code of the specified Data Model. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Data Model. Defaults to return   the latest version of the Data Model if not specified. | [optional] |

### Return type

[**CustomDataModel**](CustomDataModel.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The requested Data Model |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listDataModelHierarchies

> ResourceListOfDataModelSummary listDataModelHierarchies(asAt, filter)

[EXPERIMENTAL] ListDataModelHierarchies: List Custom Data Model hierarchies.

Lists the data model summaries within their hierarchical structure.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CustomDataModelsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomDataModelsApiExample {

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
        // CustomDataModelsApi apiInstance = apiFactory.build(CustomDataModelsApi.class);

        CustomDataModelsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CustomDataModelsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Data Model. Defaults to return   the latest version of the Data Model if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. Only EntityType is supported
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfDataModelSummary result = apiInstance.listDataModelHierarchies(asAt, filter).execute(opts);

            ResourceListOfDataModelSummary result = apiInstance.listDataModelHierarchies(asAt, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDataModelsApi#listDataModelHierarchies");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Data Model. Defaults to return   the latest version of the Data Model if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. Only EntityType is supported | [optional] |

### Return type

[**ResourceListOfDataModelSummary**](ResourceListOfDataModelSummary.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All data model hierarchies. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listSupportedEntityTypes

> ResourceListOfString listSupportedEntityTypes()

[EXPERIMENTAL] ListSupportedEntityTypes: List the currently supported entity types for use in Custom Data Models.

Lists the currently supported entity types available to bind with Custom Data Models.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CustomDataModelsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomDataModelsApiExample {

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
        // CustomDataModelsApi apiInstance = apiFactory.build(CustomDataModelsApi.class);

        CustomDataModelsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CustomDataModelsApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfString result = apiInstance.listSupportedEntityTypes().execute(opts);

            ResourceListOfString result = apiInstance.listSupportedEntityTypes().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDataModelsApi#listSupportedEntityTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ResourceListOfString**](ResourceListOfString.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All supported entity types. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateCustomDataModel

> CustomDataModel updateCustomDataModel(scope, code, entityType, upsertCustomDataModelRequest)

[EXPERIMENTAL] UpdateCustomDataModel: Update a Custom Data Model

Updates a Custom Data Model.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CustomDataModelsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomDataModelsApiExample {

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
        // CustomDataModelsApi apiInstance = apiFactory.build(CustomDataModelsApi.class);

        CustomDataModelsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CustomDataModelsApi.class);
        String scope = "scope_example"; // String | The scope of the specified Data Model.
        String code = "code_example"; // String | The code of the specified Data Model.
        String entityType = "entityType_example"; // String | The entity type of the Data Model.
        UpsertCustomDataModelRequest upsertCustomDataModelRequest = new UpsertCustomDataModelRequest(); // UpsertCustomDataModelRequest | The request containing the details of the Data Model.
        try {
            // uncomment the below to set overrides at the request level
            // CustomDataModel result = apiInstance.updateCustomDataModel(scope, code, entityType, upsertCustomDataModelRequest).execute(opts);

            CustomDataModel result = apiInstance.updateCustomDataModel(scope, code, entityType, upsertCustomDataModelRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomDataModelsApi#updateCustomDataModel");
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
| **scope** | **String**| The scope of the specified Data Model. | |
| **code** | **String**| The code of the specified Data Model. | |
| **entityType** | **String**| The entity type of the Data Model. | |
| **upsertCustomDataModelRequest** | [**UpsertCustomDataModelRequest**](UpsertCustomDataModelRequest.md)| The request containing the details of the Data Model. | [optional] |

### Return type

[**CustomDataModel**](CustomDataModel.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated Data Model |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

