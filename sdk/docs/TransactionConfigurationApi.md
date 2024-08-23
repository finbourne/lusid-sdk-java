# TransactionConfigurationApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSideDefinition**](TransactionConfigurationApi.md#deleteSideDefinition) | **DELETE** /api/transactionconfiguration/sides/{side}/$delete | DeleteSideDefinition: Delete the given side definition |
| [**deleteTransactionType**](TransactionConfigurationApi.md#deleteTransactionType) | **DELETE** /api/transactionconfiguration/types/{source}/{type} | DeleteTransactionType: Delete a transaction type |
| [**deleteTransactionTypeSource**](TransactionConfigurationApi.md#deleteTransactionTypeSource) | **DELETE** /api/transactionconfiguration/types/{source}/$delete | DeleteTransactionTypeSource: Delete all transaction types for the given source and scope |
| [**getSideDefinition**](TransactionConfigurationApi.md#getSideDefinition) | **GET** /api/transactionconfiguration/sides/{side} | GetSideDefinition: Get the side definition for a given side name( or label) |
| [**getTransactionType**](TransactionConfigurationApi.md#getTransactionType) | **GET** /api/transactionconfiguration/types/{source}/{type} | GetTransactionType: Get a single transaction configuration type |
| [**listSideDefinitions**](TransactionConfigurationApi.md#listSideDefinitions) | **GET** /api/transactionconfiguration/sides | ListSideDefinitions: List the side definitions |
| [**listTransactionTypes**](TransactionConfigurationApi.md#listTransactionTypes) | **GET** /api/transactionconfiguration/types | ListTransactionTypes: List transaction types |
| [**setSideDefinition**](TransactionConfigurationApi.md#setSideDefinition) | **PUT** /api/transactionconfiguration/sides/{side} | SetSideDefinition: Set a side definition |
| [**setSideDefinitions**](TransactionConfigurationApi.md#setSideDefinitions) | **PUT** /api/transactionconfiguration/sides | SetSideDefinitions: Set the given side definitions |
| [**setTransactionType**](TransactionConfigurationApi.md#setTransactionType) | **PUT** /api/transactionconfiguration/types/{source}/{type} | SetTransactionType: Set a specific transaction type |
| [**setTransactionTypeSource**](TransactionConfigurationApi.md#setTransactionTypeSource) | **PUT** /api/transactionconfiguration/types/{source} | SetTransactionTypeSource: Set the transaction types for the given source and scope |



## deleteSideDefinition

> DeletedEntityResponse deleteSideDefinition(side, scope)

DeleteSideDefinition: Delete the given side definition

Delete the side which user specify in the request.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionConfigurationApiExample {

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
        // TransactionConfigurationApi apiInstance = apiFactory.build(TransactionConfigurationApi.class);

        TransactionConfigurationApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionConfigurationApi.class);
        String side = "side_example"; // String | The label to uniquely identify the side.
        String scope = "default"; // String | The scope in which the side exists. When not supplied the scope is 'default'.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteSideDefinition(side, scope).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteSideDefinition(side, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionConfigurationApi#deleteSideDefinition");
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
| **side** | **String**| The label to uniquely identify the side. | |
| **scope** | **String**| The scope in which the side exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteTransactionType

> DeletedEntityResponse deleteTransactionType(source, type, scope)

DeleteTransactionType: Delete a transaction type

/// WARNING! Changing existing transaction types has a material impact on how data, new and old,  is processed and aggregated by LUSID, and will affect your whole organisation. Only call this API if you are fully aware of the implications of the change.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionConfigurationApiExample {

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
        // TransactionConfigurationApi apiInstance = apiFactory.build(TransactionConfigurationApi.class);

        TransactionConfigurationApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionConfigurationApi.class);
        String source = "source_example"; // String | The source that the type is in
        String type = "type_example"; // String | One of the type's aliases
        String scope = "default"; // String | The scope in which the transaction types exists. When not supplied the scope is 'default'.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteTransactionType(source, type, scope).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteTransactionType(source, type, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionConfigurationApi#deleteTransactionType");
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
| **source** | **String**| The source that the type is in | |
| **type** | **String**| One of the type&#39;s aliases | |
| **scope** | **String**| The scope in which the transaction types exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteTransactionTypeSource

> DeletedEntityResponse deleteTransactionTypeSource(source, scope)

DeleteTransactionTypeSource: Delete all transaction types for the given source and scope

Delete all the types for the given source and scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionConfigurationApiExample {

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
        // TransactionConfigurationApi apiInstance = apiFactory.build(TransactionConfigurationApi.class);

        TransactionConfigurationApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionConfigurationApi.class);
        String source = "source_example"; // String | The source to set the transaction types for.
        String scope = "default"; // String | The scope in which the transaction types exists. When not supplied the scope is 'default'.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteTransactionTypeSource(source, scope).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteTransactionTypeSource(source, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionConfigurationApi#deleteTransactionTypeSource");
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
| **source** | **String**| The source to set the transaction types for. | |
| **scope** | **String**| The scope in which the transaction types exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getSideDefinition

> SideDefinition getSideDefinition(side, scope, asAt)

GetSideDefinition: Get the side definition for a given side name( or label)

Get the side definition user requested.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionConfigurationApiExample {

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
        // TransactionConfigurationApi apiInstance = apiFactory.build(TransactionConfigurationApi.class);

        TransactionConfigurationApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionConfigurationApi.class);
        String side = "side_example"; // String | The label to uniquely identify the side.
        String scope = "default"; // String | The scope in which the side exists. When not supplied the scope is 'default'.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transaction types. Defaults to returning the latest versions if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // SideDefinition result = apiInstance.getSideDefinition(side, scope, asAt).execute(opts);

            SideDefinition result = apiInstance.getSideDefinition(side, scope, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionConfigurationApi#getSideDefinition");
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
| **side** | **String**| The label to uniquely identify the side. | |
| **scope** | **String**| The scope in which the side exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transaction types. Defaults to returning the latest versions if not specified. | [optional] |

### Return type

[**SideDefinition**](SideDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTransactionType

> TransactionType getTransactionType(source, type, asAt, scope)

GetTransactionType: Get a single transaction configuration type

Get a single transaction type. Returns failure if not found

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionConfigurationApiExample {

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
        // TransactionConfigurationApi apiInstance = apiFactory.build(TransactionConfigurationApi.class);

        TransactionConfigurationApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionConfigurationApi.class);
        String source = "source_example"; // String | The source that the type is in
        String type = "type_example"; // String | One of the type's aliases
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transaction configuration.   Defaults to returning the latest version of the transaction configuration type if not specified
        String scope = "default"; // String | The scope in which the transaction types exists. When not supplied the scope is 'default'.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionType result = apiInstance.getTransactionType(source, type, asAt, scope).execute(opts);

            TransactionType result = apiInstance.getTransactionType(source, type, asAt, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionConfigurationApi#getTransactionType");
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
| **source** | **String**| The source that the type is in | |
| **type** | **String**| One of the type&#39;s aliases | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transaction configuration.   Defaults to returning the latest version of the transaction configuration type if not specified | [optional] |
| **scope** | **String**| The scope in which the transaction types exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**TransactionType**](TransactionType.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listSideDefinitions

> ResourceListOfSideDefinition listSideDefinitions(asAt, scope)

ListSideDefinitions: List the side definitions

List all the side definitions in the given scope

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionConfigurationApiExample {

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
        // TransactionConfigurationApi apiInstance = apiFactory.build(TransactionConfigurationApi.class);

        TransactionConfigurationApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionConfigurationApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transaction types. Defaults to returning the latest versions if not specified.
        String scope = "default"; // String | The scope in which the side exists. When not supplied the scope is 'default'.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfSideDefinition result = apiInstance.listSideDefinitions(asAt, scope).execute(opts);

            ResourceListOfSideDefinition result = apiInstance.listSideDefinitions(asAt, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionConfigurationApi#listSideDefinitions");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transaction types. Defaults to returning the latest versions if not specified. | [optional] |
| **scope** | **String**| The scope in which the side exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**ResourceListOfSideDefinition**](ResourceListOfSideDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listTransactionTypes

> Map&lt;String, List&lt;TransactionType&gt;&gt; listTransactionTypes(asAt, scope)

ListTransactionTypes: List transaction types

Get the list of current transaction types. For information on the default transaction types provided with  LUSID, see https://support.lusid.com/knowledgebase/article/KA-01873/.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionConfigurationApiExample {

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
        // TransactionConfigurationApi apiInstance = apiFactory.build(TransactionConfigurationApi.class);

        TransactionConfigurationApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionConfigurationApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transaction types. Defaults   to returning the latest versions if not specified.
        String scope = "default"; // String | The scope in which the side exists. When not supplied the scope is 'default'.
        try {
            // uncomment the below to set overrides at the request level
            // Map<String, List<TransactionType>> result = apiInstance.listTransactionTypes(asAt, scope).execute(opts);

            Map<String, List<TransactionType>> result = apiInstance.listTransactionTypes(asAt, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionConfigurationApi#listTransactionTypes");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transaction types. Defaults   to returning the latest versions if not specified. | [optional] |
| **scope** | **String**| The scope in which the side exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**Map&lt;String, List&lt;TransactionType&gt;&gt;**](List.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setSideDefinition

> SideDefinition setSideDefinition(side, sideDefinitionRequest, scope)

SetSideDefinition: Set a side definition

Set a new side definition for use in a transaction type. For more information, see https://support.lusid.com/knowledgebase/article/KA-01875.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionConfigurationApiExample {

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
        // TransactionConfigurationApi apiInstance = apiFactory.build(TransactionConfigurationApi.class);

        TransactionConfigurationApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionConfigurationApi.class);
        String side = "side_example"; // String | The label to uniquely identify the side.
        SideDefinitionRequest sideDefinitionRequest = new SideDefinitionRequest(); // SideDefinitionRequest | The side definition to create or replace.
        String scope = "default"; // String | The scope in which the side exists. When not supplied the scope is 'default'.
        try {
            // uncomment the below to set overrides at the request level
            // SideDefinition result = apiInstance.setSideDefinition(side, sideDefinitionRequest, scope).execute(opts);

            SideDefinition result = apiInstance.setSideDefinition(side, sideDefinitionRequest, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionConfigurationApi#setSideDefinition");
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
| **side** | **String**| The label to uniquely identify the side. | |
| **sideDefinitionRequest** | [**SideDefinitionRequest**](SideDefinitionRequest.md)| The side definition to create or replace. | |
| **scope** | **String**| The scope in which the side exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**SideDefinition**](SideDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setSideDefinitions

> ResourceListOfSideDefinition setSideDefinitions(sidesDefinitionRequest, scope)

SetSideDefinitions: Set the given side definitions

Set a new side definition for use in a transaction type. For more information, see https://support.lusid.com/knowledgebase/article/KA-01875.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionConfigurationApiExample {

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
        // TransactionConfigurationApi apiInstance = apiFactory.build(TransactionConfigurationApi.class);

        TransactionConfigurationApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionConfigurationApi.class);
        List<SidesDefinitionRequest> sidesDefinitionRequest = Arrays.asList(); // List<SidesDefinitionRequest> | The list of side definitions to create, or replace.
        String scope = "default"; // String | The scope in which the side exists. When not supplied the scope is 'default'.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfSideDefinition result = apiInstance.setSideDefinitions(sidesDefinitionRequest, scope).execute(opts);

            ResourceListOfSideDefinition result = apiInstance.setSideDefinitions(sidesDefinitionRequest, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionConfigurationApi#setSideDefinitions");
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
| **sidesDefinitionRequest** | [**List&lt;SidesDefinitionRequest&gt;**](SidesDefinitionRequest.md)| The list of side definitions to create, or replace. | |
| **scope** | **String**| The scope in which the side exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**ResourceListOfSideDefinition**](ResourceListOfSideDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setTransactionType

> TransactionType setTransactionType(source, type, transactionTypeRequest, scope)

SetTransactionType: Set a specific transaction type

Set a transaction type for the given source and type. If the requested transaction type does not exist, it will be created    WARNING! Changing existing transaction types has a material impact on how data, new and old, is processed and aggregated by LUSID, and will affect your whole organisation. Only call this API if you are fully aware of the implications of the change.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionConfigurationApiExample {

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
        // TransactionConfigurationApi apiInstance = apiFactory.build(TransactionConfigurationApi.class);

        TransactionConfigurationApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionConfigurationApi.class);
        String source = "source_example"; // String | The source to set the transaction configuration for
        String type = "type_example"; // String | One of the transaction configuration alias types to uniquely identify the configuration. If this type does not exist, then a new transaction type is created using the body of the request in the given source, without including this type
        TransactionTypeRequest transactionTypeRequest = new TransactionTypeRequest(); // TransactionTypeRequest | The transaction configuration to set
        String scope = "default"; // String | The scope in which the transaction types exists. When not supplied the scope is 'default'.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionType result = apiInstance.setTransactionType(source, type, transactionTypeRequest, scope).execute(opts);

            TransactionType result = apiInstance.setTransactionType(source, type, transactionTypeRequest, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionConfigurationApi#setTransactionType");
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
| **source** | **String**| The source to set the transaction configuration for | |
| **type** | **String**| One of the transaction configuration alias types to uniquely identify the configuration. If this type does not exist, then a new transaction type is created using the body of the request in the given source, without including this type | |
| **transactionTypeRequest** | [**TransactionTypeRequest**](TransactionTypeRequest.md)| The transaction configuration to set | |
| **scope** | **String**| The scope in which the transaction types exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**TransactionType**](TransactionType.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setTransactionTypeSource

> ResourceListOfTransactionType setTransactionTypeSource(source, transactionTypeRequest, scope)

SetTransactionTypeSource: Set the transaction types for the given source and scope

The complete set of transaction types for the source.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionConfigurationApiExample {

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
        // TransactionConfigurationApi apiInstance = apiFactory.build(TransactionConfigurationApi.class);

        TransactionConfigurationApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionConfigurationApi.class);
        String source = "source_example"; // String | The source to set the transaction types for.
        List<TransactionTypeRequest> transactionTypeRequest = Arrays.asList(); // List<TransactionTypeRequest> | The set of transaction types.
        String scope = "default"; // String | The scope in which the transaction types exists. When not supplied the scope is 'default'.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfTransactionType result = apiInstance.setTransactionTypeSource(source, transactionTypeRequest, scope).execute(opts);

            ResourceListOfTransactionType result = apiInstance.setTransactionTypeSource(source, transactionTypeRequest, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionConfigurationApi#setTransactionTypeSource");
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
| **source** | **String**| The source to set the transaction types for. | |
| **transactionTypeRequest** | [**List&lt;TransactionTypeRequest&gt;**](TransactionTypeRequest.md)| The set of transaction types. | |
| **scope** | **String**| The scope in which the transaction types exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**ResourceListOfTransactionType**](ResourceListOfTransactionType.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

