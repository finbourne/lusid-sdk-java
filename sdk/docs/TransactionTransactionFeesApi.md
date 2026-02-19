# TransactionTransactionFeesApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransactionFee**](TransactionTransactionFeesApi.md#createTransactionFee) | **POST** /api/transactions/transactionfees/{scope}/{code} | [EXPERIMENTAL] CreateTransactionFee: Create a TransactionFee |
| [**deleteTransactionFee**](TransactionTransactionFeesApi.md#deleteTransactionFee) | **DELETE** /api/transactions/transactionfees/{scope}/{code} | [EXPERIMENTAL] DeleteTransactionFee: Delete a TransactionFee |
| [**getTransactionFee**](TransactionTransactionFeesApi.md#getTransactionFee) | **GET** /api/transactions/transactionfees/{scope}/{code} | [EXPERIMENTAL] GetTransactionFee: Get a TransactionFee |
| [**listTransactionFees**](TransactionTransactionFeesApi.md#listTransactionFees) | **GET** /api/transactions/transactionfees | [EXPERIMENTAL] ListTransactionFees: List TransactionFees |
| [**updateTransactionFee**](TransactionTransactionFeesApi.md#updateTransactionFee) | **PUT** /api/transactions/transactionfees/{scope}/{code} | [EXPERIMENTAL] UpdateTransactionFee: Update a TransactionFee |



## createTransactionFee

> TransactionFee createTransactionFee(scope, code, createTransactionFeeRequest, effectiveAt)

[EXPERIMENTAL] CreateTransactionFee: Create a TransactionFee

Create a TransactionFee for the specified scope and code.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionTransactionFeesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionTransactionFeesApiExample {

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
        // TransactionTransactionFeesApi apiInstance = apiFactory.build(TransactionTransactionFeesApi.class);

        TransactionTransactionFeesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionTransactionFeesApi.class);
        String scope = "scope_example"; // String | The scope of the TransactionFee.
        String code = "code_example"; // String | The code of the TransactionFee.   Together with the scope this uniquely identifies the TransactionFee.
        CreateTransactionFeeRequest createTransactionFeeRequest = new CreateTransactionFeeRequest(); // CreateTransactionFeeRequest | The contents of the TransactionFee.
        String effectiveAt = "effectiveAt_example"; // String | The date and time at which the TransactionFee should be effective.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionFee result = apiInstance.createTransactionFee(scope, code, createTransactionFeeRequest, effectiveAt).execute(opts);

            TransactionFee result = apiInstance.createTransactionFee(scope, code, createTransactionFeeRequest, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionTransactionFeesApi#createTransactionFee");
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
| **scope** | **String**| The scope of the TransactionFee. | |
| **code** | **String**| The code of the TransactionFee.   Together with the scope this uniquely identifies the TransactionFee. | |
| **createTransactionFeeRequest** | [**CreateTransactionFeeRequest**](CreateTransactionFeeRequest.md)| The contents of the TransactionFee. | |
| **effectiveAt** | **String**| The date and time at which the TransactionFee should be effective. | [optional] |

### Return type

[**TransactionFee**](TransactionFee.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created TransactionFee. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteTransactionFee

> DeletedEntityResponse deleteTransactionFee(scope, code)

[EXPERIMENTAL] DeleteTransactionFee: Delete a TransactionFee

Delete a TransactionFee for the specified scope and code. To note, this will be a monotemporal delete, meaning that  the TransactionFee will be deleted for all effective time (including past and future versions of the TransactionFee).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionTransactionFeesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionTransactionFeesApiExample {

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
        // TransactionTransactionFeesApi apiInstance = apiFactory.build(TransactionTransactionFeesApi.class);

        TransactionTransactionFeesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionTransactionFeesApi.class);
        String scope = "scope_example"; // String | The scope of the TransactionFee.
        String code = "code_example"; // String | The code of the specified TransactionFee.   Together with the scope this uniquely identifies the TransactionFee.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteTransactionFee(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteTransactionFee(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionTransactionFeesApi#deleteTransactionFee");
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
| **scope** | **String**| The scope of the TransactionFee. | |
| **code** | **String**| The code of the specified TransactionFee.   Together with the scope this uniquely identifies the TransactionFee. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a TransactionFee. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTransactionFee

> TransactionFee getTransactionFee(scope, code, effectiveAt, asAt, propertyKeys)

[EXPERIMENTAL] GetTransactionFee: Get a TransactionFee

Get the TransactionFee for the specified scope and code.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionTransactionFeesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionTransactionFeesApiExample {

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
        // TransactionTransactionFeesApi apiInstance = apiFactory.build(TransactionTransactionFeesApi.class);

        TransactionTransactionFeesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionTransactionFeesApi.class);
        String scope = "scope_example"; // String | The scope of the TransactionFee.
        String code = "code_example"; // String | The code of the TransactionFee.   Together with the scope this uniquely identifies the TransactionFee.
        String effectiveAt = "effectiveAt_example"; // String | The date and time at which the query is effective.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the TransactionFees.   Defaults to latest if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | The collection of `PropertyKey`s that we want to decorate on identifies the TransactionFee.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionFee result = apiInstance.getTransactionFee(scope, code, effectiveAt, asAt, propertyKeys).execute(opts);

            TransactionFee result = apiInstance.getTransactionFee(scope, code, effectiveAt, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionTransactionFeesApi#getTransactionFee");
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
| **scope** | **String**| The scope of the TransactionFee. | |
| **code** | **String**| The code of the TransactionFee.   Together with the scope this uniquely identifies the TransactionFee. | |
| **effectiveAt** | **String**| The date and time at which the query is effective. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the TransactionFees.   Defaults to latest if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| The collection of &#x60;PropertyKey&#x60;s that we want to decorate on identifies the TransactionFee. | [optional] |

### Return type

[**TransactionFee**](TransactionFee.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The TransactionFee matching the specified scope and code. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listTransactionFees

> ResourceListOfTransactionFee listTransactionFees(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListTransactionFees: List TransactionFees

List TransactionFees that match the specified criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionTransactionFeesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionTransactionFeesApiExample {

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
        // TransactionTransactionFeesApi apiInstance = apiFactory.build(TransactionTransactionFeesApi.class);

        TransactionTransactionFeesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionTransactionFeesApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The date and time at which the query is effective.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the TransactionFees.   Defaults to latest if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing TransactionFees from a previous call to list TransactionFees.  This value is returned from the previous call. If a pagination token is provided the filter,  sortBy and asAt field must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the Scope, use \"scope eq 'ExampleScope'\"   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
        List<String> propertyKeys = Arrays.asList(); // List<String> | The collection of `PropertyKey`s to filter on
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfTransactionFee result = apiInstance.listTransactionFees(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            ResourceListOfTransactionFee result = apiInstance.listTransactionFees(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionTransactionFeesApi#listTransactionFees");
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
| **effectiveAt** | **String**| The date and time at which the query is effective. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the TransactionFees.   Defaults to latest if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing TransactionFees from a previous call to list TransactionFees.  This value is returned from the previous call. If a pagination token is provided the filter,  sortBy and asAt field must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to filter on the Scope, use \&quot;scope eq &#39;ExampleScope&#39;\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| The collection of &#x60;PropertyKey&#x60;s to filter on | [optional] |

### Return type

[**ResourceListOfTransactionFee**](ResourceListOfTransactionFee.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A collection of TransactionFees matching the specified criteria. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateTransactionFee

> TransactionFee updateTransactionFee(scope, code, updateTransactionFeeRequest, effectiveAt)

[EXPERIMENTAL] UpdateTransactionFee: Update a TransactionFee

Update a TransactionFee by providing the new contents of the TransactionFee.  The name field and the capitalisation field can not be updated.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionTransactionFeesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionTransactionFeesApiExample {

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
        // TransactionTransactionFeesApi apiInstance = apiFactory.build(TransactionTransactionFeesApi.class);

        TransactionTransactionFeesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionTransactionFeesApi.class);
        String scope = "scope_example"; // String | The scope of the TransactionFee.
        String code = "code_example"; // String | The code of the specified TransactionFee.   Together with the scope this uniquely identifies the TransactionFee.
        UpdateTransactionFeeRequest updateTransactionFeeRequest = new UpdateTransactionFeeRequest(); // UpdateTransactionFeeRequest | The contents of the TransactionFee.
        String effectiveAt = "effectiveAt_example"; // String | The date and time at which the update should take effect.   The updated contents of the TransactionFee.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionFee result = apiInstance.updateTransactionFee(scope, code, updateTransactionFeeRequest, effectiveAt).execute(opts);

            TransactionFee result = apiInstance.updateTransactionFee(scope, code, updateTransactionFeeRequest, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionTransactionFeesApi#updateTransactionFee");
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
| **scope** | **String**| The scope of the TransactionFee. | |
| **code** | **String**| The code of the specified TransactionFee.   Together with the scope this uniquely identifies the TransactionFee. | |
| **updateTransactionFeeRequest** | [**UpdateTransactionFeeRequest**](UpdateTransactionFeeRequest.md)| The contents of the TransactionFee. | |
| **effectiveAt** | **String**| The date and time at which the update should take effect.   The updated contents of the TransactionFee. | [optional] |

### Return type

[**TransactionFee**](TransactionFee.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated TransactionFee. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

