# EntityResolversApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEntityResolver**](EntityResolversApi.md#createEntityResolver) | **POST** /api/entityresolvers | [EXPERIMENTAL] CreateEntityResolver: Create an Entity Resolver |
| [**deleteEntityResolver**](EntityResolversApi.md#deleteEntityResolver) | **DELETE** /api/entityresolvers/{scope}/{code} | [EXPERIMENTAL] DeleteEntityResolver: Delete an Entity Resolver |
| [**getEntityResolver**](EntityResolversApi.md#getEntityResolver) | **GET** /api/entityresolvers/{scope}/{code} | [EXPERIMENTAL] GetEntityResolver: Get a single Entity Resolver |
| [**updateEntityResolver**](EntityResolversApi.md#updateEntityResolver) | **PUT** /api/entityresolvers/{scope}/{code} | [EXPERIMENTAL] UpdateEntityResolver: Update an Entity Resolver |



## createEntityResolver

> EntityResolver createEntityResolver(createEntityResolverRequest)

[EXPERIMENTAL] CreateEntityResolver: Create an Entity Resolver

Define a new Entity Resolver. The resolver&#39;s identifier matching order is the sequence of identifier  property keys that will be tried, in turn, when resolving an entity of the given type in the resolver&#39;s scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EntityResolversApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EntityResolversApiExample {

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
        // EntityResolversApi apiInstance = apiFactory.build(EntityResolversApi.class);

        EntityResolversApi apiInstance = ApiFactoryBuilder.build(fileName).build(EntityResolversApi.class);
        CreateEntityResolverRequest createEntityResolverRequest = new CreateEntityResolverRequest(); // CreateEntityResolverRequest | The request defining the new Entity Resolver
        try {
            // uncomment the below to set overrides at the request level
            // EntityResolver result = apiInstance.createEntityResolver(createEntityResolverRequest).execute(opts);

            EntityResolver result = apiInstance.createEntityResolver(createEntityResolverRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EntityResolversApi#createEntityResolver");
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
| **createEntityResolverRequest** | [**CreateEntityResolverRequest**](CreateEntityResolverRequest.md)| The request defining the new Entity Resolver | [optional] |

### Return type

[**EntityResolver**](EntityResolver.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created Entity Resolver |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteEntityResolver

> DeletedEntityResponse deleteEntityResolver(scope, code)

[EXPERIMENTAL] DeleteEntityResolver: Delete an Entity Resolver

The deletion will take effect from the deletion datetime, i.e. the Entity Resolver will no longer exist  at any asAt datetime after the asAt datetime of deletion. Resolution in the affected scope reverts to  the default matching order.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EntityResolversApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EntityResolversApiExample {

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
        // EntityResolversApi apiInstance = apiFactory.build(EntityResolversApi.class);

        EntityResolversApi apiInstance = ApiFactoryBuilder.build(fileName).build(EntityResolversApi.class);
        String scope = "scope_example"; // String | The scope of the Entity Resolver
        String code = "code_example"; // String | The code of the Entity Resolver. Together with the scope this uniquely identifies the Entity Resolver
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteEntityResolver(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteEntityResolver(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EntityResolversApi#deleteEntityResolver");
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
| **scope** | **String**| The scope of the Entity Resolver | |
| **code** | **String**| The code of the Entity Resolver. Together with the scope this uniquely identifies the Entity Resolver | |

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


## getEntityResolver

> EntityResolver getEntityResolver(scope, code, asAt)

[EXPERIMENTAL] GetEntityResolver: Get a single Entity Resolver

Get a single Entity Resolver by scope and code at an optional asAt, defaulting to latest if not specified.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EntityResolversApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EntityResolversApiExample {

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
        // EntityResolversApi apiInstance = apiFactory.build(EntityResolversApi.class);

        EntityResolversApi apiInstance = ApiFactoryBuilder.build(fileName).build(EntityResolversApi.class);
        String scope = "scope_example"; // String | The scope of the Entity Resolver
        String code = "code_example"; // String | The code of the Entity Resolver. Together with the scope this uniquely identifies the Entity Resolver
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Entity Resolver. Defaults to return   the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // EntityResolver result = apiInstance.getEntityResolver(scope, code, asAt).execute(opts);

            EntityResolver result = apiInstance.getEntityResolver(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EntityResolversApi#getEntityResolver");
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
| **scope** | **String**| The scope of the Entity Resolver | |
| **code** | **String**| The code of the Entity Resolver. Together with the scope this uniquely identifies the Entity Resolver | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Entity Resolver. Defaults to return   the latest version if not specified. | [optional] |

### Return type

[**EntityResolver**](EntityResolver.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Entity Resolver |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateEntityResolver

> EntityResolver updateEntityResolver(scope, code, upsertEntityResolverRequest)

[EXPERIMENTAL] UpdateEntityResolver: Update an Entity Resolver

Overwrites the description and identifier matching order of an existing Entity Resolver.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EntityResolversApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EntityResolversApiExample {

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
        // EntityResolversApi apiInstance = apiFactory.build(EntityResolversApi.class);

        EntityResolversApi apiInstance = ApiFactoryBuilder.build(fileName).build(EntityResolversApi.class);
        String scope = "scope_example"; // String | The scope of the Entity Resolver
        String code = "code_example"; // String | The code of the Entity Resolver. Together with the scope this uniquely identifies the Entity Resolver
        UpsertEntityResolverRequest upsertEntityResolverRequest = new UpsertEntityResolverRequest(); // UpsertEntityResolverRequest | The request containing the updated details of the Entity Resolver
        try {
            // uncomment the below to set overrides at the request level
            // EntityResolver result = apiInstance.updateEntityResolver(scope, code, upsertEntityResolverRequest).execute(opts);

            EntityResolver result = apiInstance.updateEntityResolver(scope, code, upsertEntityResolverRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EntityResolversApi#updateEntityResolver");
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
| **scope** | **String**| The scope of the Entity Resolver | |
| **code** | **String**| The code of the Entity Resolver. Together with the scope this uniquely identifies the Entity Resolver | |
| **upsertEntityResolverRequest** | [**UpsertEntityResolverRequest**](UpsertEntityResolverRequest.md)| The request containing the updated details of the Entity Resolver | [optional] |

### Return type

[**EntityResolver**](EntityResolver.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated Entity Resolver |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

