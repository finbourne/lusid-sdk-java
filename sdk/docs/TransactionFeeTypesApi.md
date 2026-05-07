# TransactionFeeTypesApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransactionFeeType**](TransactionFeeTypesApi.md#createTransactionFeeType) | **POST** /api/transactions/transactionfeetypes/{scope}/{code} | [EXPERIMENTAL] CreateTransactionFeeType: Create a transaction fee type |
| [**deleteTransactionFeeType**](TransactionFeeTypesApi.md#deleteTransactionFeeType) | **DELETE** /api/transactions/transactionfeetypes/{scope}/{code} | [EXPERIMENTAL] DeleteTransactionFeeType: Delete a transaction fee type |
| [**getTransactionFeeType**](TransactionFeeTypesApi.md#getTransactionFeeType) | **GET** /api/transactions/transactionfeetypes/{scope}/{code} | [EXPERIMENTAL] GetTransactionFeeType: Get a transaction fee type |
| [**listTransactionFeeTypes**](TransactionFeeTypesApi.md#listTransactionFeeTypes) | **GET** /api/transactions/transactionfeetypes | [EXPERIMENTAL] ListTransactionFeeTypes: List transaction fee types |
| [**updateTransactionFeeType**](TransactionFeeTypesApi.md#updateTransactionFeeType) | **PUT** /api/transactions/transactionfeetypes/{scope}/{code} | [EXPERIMENTAL] UpdateTransactionFeeType: Update a transaction fee type |



## createTransactionFeeType

> TransactionFeeType createTransactionFeeType(scope, code, createTransactionFeeTypeRequest)

[EXPERIMENTAL] CreateTransactionFeeType: Create a transaction fee type

Create a transaction fee type for the specified scope and code.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionFeeTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionFeeTypesApiExample {

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
        // TransactionFeeTypesApi apiInstance = apiFactory.build(TransactionFeeTypesApi.class);

        TransactionFeeTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionFeeTypesApi.class);
        String scope = "scope_example"; // String | The scope of the transaction fee type.
        String code = "code_example"; // String | The code of the transaction fee type.   Together with the scope this uniquely identifies the transaction fee type.
        CreateTransactionFeeTypeRequest createTransactionFeeTypeRequest = new CreateTransactionFeeTypeRequest(); // CreateTransactionFeeTypeRequest | The contents of the transaction fee type.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionFeeType result = apiInstance.createTransactionFeeType(scope, code, createTransactionFeeTypeRequest).execute(opts);

            TransactionFeeType result = apiInstance.createTransactionFeeType(scope, code, createTransactionFeeTypeRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionFeeTypesApi#createTransactionFeeType");
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
| **scope** | **String**| The scope of the transaction fee type. | |
| **code** | **String**| The code of the transaction fee type.   Together with the scope this uniquely identifies the transaction fee type. | |
| **createTransactionFeeTypeRequest** | [**CreateTransactionFeeTypeRequest**](CreateTransactionFeeTypeRequest.md)| The contents of the transaction fee type. | |

### Return type

[**TransactionFeeType**](TransactionFeeType.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created transaction fee type. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteTransactionFeeType

> DeletedEntityResponse deleteTransactionFeeType(scope, code)

[EXPERIMENTAL] DeleteTransactionFeeType: Delete a transaction fee type

Delete a transaction fee type for the specified scope and code. To note, this will be a monotemporal delete, meaning that  the transaction fee type will be deleted for all effective time (including past and future versions of the transaction fee type).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionFeeTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionFeeTypesApiExample {

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
        // TransactionFeeTypesApi apiInstance = apiFactory.build(TransactionFeeTypesApi.class);

        TransactionFeeTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionFeeTypesApi.class);
        String scope = "scope_example"; // String | The scope of the transaction fee type.
        String code = "code_example"; // String | The code of the specified transaction fee type.   Together with the scope this uniquely identifies the transaction fee type.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteTransactionFeeType(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteTransactionFeeType(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionFeeTypesApi#deleteTransactionFeeType");
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
| **scope** | **String**| The scope of the transaction fee type. | |
| **code** | **String**| The code of the specified transaction fee type.   Together with the scope this uniquely identifies the transaction fee type. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a transaction fee type. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTransactionFeeType

> TransactionFeeType getTransactionFeeType(scope, code, effectiveAt, asAt, propertyKeys)

[EXPERIMENTAL] GetTransactionFeeType: Get a transaction fee type

Get the transaction fee type for the specified scope and code.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionFeeTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionFeeTypesApiExample {

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
        // TransactionFeeTypesApi apiInstance = apiFactory.build(TransactionFeeTypesApi.class);

        TransactionFeeTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionFeeTypesApi.class);
        String scope = "scope_example"; // String | The scope of the transaction fee type.
        String code = "code_example"; // String | The code of the transaction fee type.   Together with the scope this uniquely identifies the transaction fee type.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime at which to retrieve the transaction fee type properties.   Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transaction fee types.   Defaults to latest if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | The collection of `PropertyKey`s that we want to decorate on the transaction fee type.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionFeeType result = apiInstance.getTransactionFeeType(scope, code, effectiveAt, asAt, propertyKeys).execute(opts);

            TransactionFeeType result = apiInstance.getTransactionFeeType(scope, code, effectiveAt, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionFeeTypesApi#getTransactionFeeType");
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
| **scope** | **String**| The scope of the transaction fee type. | |
| **code** | **String**| The code of the transaction fee type.   Together with the scope this uniquely identifies the transaction fee type. | |
| **effectiveAt** | **String**| The effective datetime at which to retrieve the transaction fee type properties.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transaction fee types.   Defaults to latest if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| The collection of &#x60;PropertyKey&#x60;s that we want to decorate on the transaction fee type. | [optional] |

### Return type

[**TransactionFeeType**](TransactionFeeType.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The transaction fee type matching the specified scope and code. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listTransactionFeeTypes

> ResourceListOfTransactionFeeType listTransactionFeeTypes(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListTransactionFeeTypes: List transaction fee types

List transaction fee types that match the specified criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionFeeTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionFeeTypesApiExample {

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
        // TransactionFeeTypesApi apiInstance = apiFactory.build(TransactionFeeTypesApi.class);

        TransactionFeeTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionFeeTypesApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime at which to retrieve transaction fee type properties.   Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transaction fee types.   Defaults to latest if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing transaction fee types from a previous call to list transaction fee types.  This value is returned from the previous call. If a pagination token is provided the filter,  sortBy, effectiveAt and asAt field must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the Scope, use \"scope eq 'ExampleScope'\"   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
        List<String> propertyKeys = Arrays.asList(); // List<String> | The collection of `PropertyKey`s to filter on
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfTransactionFeeType result = apiInstance.listTransactionFeeTypes(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            ResourceListOfTransactionFeeType result = apiInstance.listTransactionFeeTypes(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionFeeTypesApi#listTransactionFeeTypes");
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
| **effectiveAt** | **String**| The effective datetime at which to retrieve transaction fee type properties.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transaction fee types.   Defaults to latest if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing transaction fee types from a previous call to list transaction fee types.  This value is returned from the previous call. If a pagination token is provided the filter,  sortBy, effectiveAt and asAt field must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to filter on the Scope, use \&quot;scope eq &#39;ExampleScope&#39;\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| The collection of &#x60;PropertyKey&#x60;s to filter on | [optional] |

### Return type

[**ResourceListOfTransactionFeeType**](ResourceListOfTransactionFeeType.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A collection of transaction fee types matching the specified criteria. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateTransactionFeeType

> TransactionFeeType updateTransactionFeeType(scope, code, updateTransactionFeeTypeRequest)

[EXPERIMENTAL] UpdateTransactionFeeType: Update a transaction fee type

Update a transaction fee type by providing the new contents of the transaction fee type.  The displayName field cannot be updated.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionFeeTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionFeeTypesApiExample {

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
        // TransactionFeeTypesApi apiInstance = apiFactory.build(TransactionFeeTypesApi.class);

        TransactionFeeTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionFeeTypesApi.class);
        String scope = "scope_example"; // String | The scope of the transaction fee type.
        String code = "code_example"; // String | The code of the specified transaction fee type.   Together with the scope this uniquely identifies the transaction fee type.
        UpdateTransactionFeeTypeRequest updateTransactionFeeTypeRequest = new UpdateTransactionFeeTypeRequest(); // UpdateTransactionFeeTypeRequest | The updated contents of the transaction fee type.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionFeeType result = apiInstance.updateTransactionFeeType(scope, code, updateTransactionFeeTypeRequest).execute(opts);

            TransactionFeeType result = apiInstance.updateTransactionFeeType(scope, code, updateTransactionFeeTypeRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionFeeTypesApi#updateTransactionFeeType");
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
| **scope** | **String**| The scope of the transaction fee type. | |
| **code** | **String**| The code of the specified transaction fee type.   Together with the scope this uniquely identifies the transaction fee type. | |
| **updateTransactionFeeTypeRequest** | [**UpdateTransactionFeeTypeRequest**](UpdateTransactionFeeTypeRequest.md)| The updated contents of the transaction fee type. | |

### Return type

[**TransactionFeeType**](TransactionFeeType.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated transaction fee type. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

