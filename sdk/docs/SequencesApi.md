# SequencesApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSequence**](SequencesApi.md#createSequence) | **POST** /api/sequences/{scope} | [EARLY ACCESS] CreateSequence: Create a new sequence |
| [**deleteSequence**](SequencesApi.md#deleteSequence) | **DELETE** /api/sequences/{scope}/{code} | [EARLY ACCESS] DeleteSequence: Delete a sequence |
| [**getSequence**](SequencesApi.md#getSequence) | **GET** /api/sequences/{scope}/{code} | [EARLY ACCESS] GetSequence: Get a specified sequence |
| [**listSequences**](SequencesApi.md#listSequences) | **GET** /api/sequences | [EARLY ACCESS] ListSequences: List Sequences |
| [**next**](SequencesApi.md#next) | **GET** /api/sequences/{scope}/{code}/next | [EARLY ACCESS] Next: Get next values from sequence |



## createSequence

> SequenceDefinition createSequence(scope, createSequenceRequest)

[EARLY ACCESS] CreateSequence: Create a new sequence

Create a new sequence

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SequencesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SequencesApiExample {

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
        // SequencesApi apiInstance = apiFactory.build(SequencesApi.class);

        SequencesApi apiInstance = ApiFactoryBuilder.build(fileName).build(SequencesApi.class);
        String scope = "scope_example"; // String | Scope of the sequence.
        CreateSequenceRequest createSequenceRequest = new CreateSequenceRequest(); // CreateSequenceRequest | Request to create sequence
        try {
            // uncomment the below to set overrides at the request level
            // SequenceDefinition result = apiInstance.createSequence(scope, createSequenceRequest).execute(opts);

            SequenceDefinition result = apiInstance.createSequence(scope, createSequenceRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SequencesApi#createSequence");
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
| **scope** | **String**| Scope of the sequence. | |
| **createSequenceRequest** | [**CreateSequenceRequest**](CreateSequenceRequest.md)| Request to create sequence | |

### Return type

[**SequenceDefinition**](SequenceDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Sequence |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteSequence

> DeletedEntityResponse deleteSequence(scope, code)

[EARLY ACCESS] DeleteSequence: Delete a sequence

Delete a specific sequence     WARNING! Deleting a sequence is an inherently unsafe operation. It would allow a new sequence using the same pattern to be created, which may result in existing values being returned.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SequencesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SequencesApiExample {

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
        // SequencesApi apiInstance = apiFactory.build(SequencesApi.class);

        SequencesApi apiInstance = ApiFactoryBuilder.build(fileName).build(SequencesApi.class);
        String scope = "scope_example"; // String | Scope of the sequence.
        String code = "code_example"; // String | Code of the sequence. This together with stated scope uniquely identifies the sequence.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteSequence(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteSequence(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SequencesApi#deleteSequence");
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
| **scope** | **String**| Scope of the sequence. | |
| **code** | **String**| Code of the sequence. This together with stated scope uniquely identifies the sequence. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response of the deleted sequence. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getSequence

> SequenceDefinition getSequence(scope, code)

[EARLY ACCESS] GetSequence: Get a specified sequence

Return the details of a specified sequence

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SequencesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SequencesApiExample {

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
        // SequencesApi apiInstance = apiFactory.build(SequencesApi.class);

        SequencesApi apiInstance = ApiFactoryBuilder.build(fileName).build(SequencesApi.class);
        String scope = "scope_example"; // String | Scope of the sequence.
        String code = "code_example"; // String | Code of the sequence. This together with stated scope uniquely   identifies the sequence.
        try {
            // uncomment the below to set overrides at the request level
            // SequenceDefinition result = apiInstance.getSequence(scope, code).execute(opts);

            SequenceDefinition result = apiInstance.getSequence(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SequencesApi#getSequence");
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
| **scope** | **String**| Scope of the sequence. | |
| **code** | **String**| Code of the sequence. This together with stated scope uniquely   identifies the sequence. | |

### Return type

[**SequenceDefinition**](SequenceDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested sequence |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listSequences

> PagedResourceListOfSequenceDefinition listSequences(page, limit, filter)

[EARLY ACCESS] ListSequences: List Sequences

List sequences which satisfies filtering criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SequencesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SequencesApiExample {

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
        // SequencesApi apiInstance = apiFactory.build(SequencesApi.class);

        SequencesApi apiInstance = ApiFactoryBuilder.build(fileName).build(SequencesApi.class);
        String page = "page_example"; // String | The pagination token to use to continue listing sequences from a previous call to list sequences. This  value is returned from the previous call.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 500 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.    Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfSequenceDefinition result = apiInstance.listSequences(page, limit, filter).execute(opts);

            PagedResourceListOfSequenceDefinition result = apiInstance.listSequences(page, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SequencesApi#listSequences");
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
| **page** | **String**| The pagination token to use to continue listing sequences from a previous call to list sequences. This  value is returned from the previous call. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 500 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.    Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfSequenceDefinition**](PagedResourceListOfSequenceDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The sequences matching filtering criteria |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## next

> NextValueInSequenceResponse next(scope, code, batch)

[EARLY ACCESS] Next: Get next values from sequence

Get the next set of values from a specified sequence

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SequencesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SequencesApiExample {

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
        // SequencesApi apiInstance = apiFactory.build(SequencesApi.class);

        SequencesApi apiInstance = ApiFactoryBuilder.build(fileName).build(SequencesApi.class);
        String scope = "scope_example"; // String | Scope of the sequence.
        String code = "code_example"; // String | Code of the sequence. This together with stated scope uniquely   identifies the sequence.
        Integer batch = 56; // Integer | Number of sequences items to return for the specified sequence. Default to 1 if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // NextValueInSequenceResponse result = apiInstance.next(scope, code, batch).execute(opts);

            NextValueInSequenceResponse result = apiInstance.next(scope, code, batch).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SequencesApi#next");
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
| **scope** | **String**| Scope of the sequence. | |
| **code** | **String**| Code of the sequence. This together with stated scope uniquely   identifies the sequence. | |
| **batch** | **Integer**| Number of sequences items to return for the specified sequence. Default to 1 if not specified. | [optional] |

### Return type

[**NextValueInSequenceResponse**](NextValueInSequenceResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response containing next available values in specified sequence. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

