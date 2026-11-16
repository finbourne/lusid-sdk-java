# DeemedDisposalDefinitionsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDeemedDisposalDefinition**](DeemedDisposalDefinitionsApi.md#createDeemedDisposalDefinition) | **POST** /api/deemeddisposaldefinitions/{scope} | [EXPERIMENTAL] CreateDeemedDisposalDefinition: Create a Deemed Disposal Definition. |
| [**deleteDeemedDisposalDefinition**](DeemedDisposalDefinitionsApi.md#deleteDeemedDisposalDefinition) | **DELETE** /api/deemeddisposaldefinitions/{scope}/{code} | [EXPERIMENTAL] DeleteDeemedDisposalDefinition: Delete a Deemed Disposal Definition. |
| [**getDeemedDisposalDefinition**](DeemedDisposalDefinitionsApi.md#getDeemedDisposalDefinition) | **GET** /api/deemeddisposaldefinitions/{scope}/{code} | [EXPERIMENTAL] GetDeemedDisposalDefinition: Get a Deemed Disposal Definition. |
| [**listDeemedDisposalDefinitions**](DeemedDisposalDefinitionsApi.md#listDeemedDisposalDefinitions) | **GET** /api/deemeddisposaldefinitions | [EXPERIMENTAL] ListDeemedDisposalDefinitions: List Deemed Disposal Definitions. |
| [**updateDeemedDisposalDefinition**](DeemedDisposalDefinitionsApi.md#updateDeemedDisposalDefinition) | **PUT** /api/deemeddisposaldefinitions/{scope}/{code} | [EXPERIMENTAL] UpdateDeemedDisposalDefinition: Update a Deemed Disposal Definition. |



## createDeemedDisposalDefinition

> DeemedDisposalDefinition createDeemedDisposalDefinition(scope, deemedDisposalDefinitionRequest)

[EXPERIMENTAL] CreateDeemedDisposalDefinition: Create a Deemed Disposal Definition.

Create a Deemed Disposal Definition whose filter selects the holdings a valuation point deems disposed of  and re-acquired at market value. The filter must be a valid holdings filter.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DeemedDisposalDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DeemedDisposalDefinitionsApiExample {

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
        // DeemedDisposalDefinitionsApi apiInstance = apiFactory.build(DeemedDisposalDefinitionsApi.class);

        DeemedDisposalDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(DeemedDisposalDefinitionsApi.class);
        String scope = "scope_example"; // String | The scope of the Deemed Disposal Definition.
        DeemedDisposalDefinitionRequest deemedDisposalDefinitionRequest = new DeemedDisposalDefinitionRequest(); // DeemedDisposalDefinitionRequest | The contents of the Deemed Disposal Definition.
        try {
            // uncomment the below to set overrides at the request level
            // DeemedDisposalDefinition result = apiInstance.createDeemedDisposalDefinition(scope, deemedDisposalDefinitionRequest).execute(opts);

            DeemedDisposalDefinition result = apiInstance.createDeemedDisposalDefinition(scope, deemedDisposalDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeemedDisposalDefinitionsApi#createDeemedDisposalDefinition");
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
| **scope** | **String**| The scope of the Deemed Disposal Definition. | |
| **deemedDisposalDefinitionRequest** | [**DeemedDisposalDefinitionRequest**](DeemedDisposalDefinitionRequest.md)| The contents of the Deemed Disposal Definition. | |

### Return type

[**DeemedDisposalDefinition**](DeemedDisposalDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Deemed Disposal Definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteDeemedDisposalDefinition

> DeletedEntityResponse deleteDeemedDisposalDefinition(scope, code)

[EXPERIMENTAL] DeleteDeemedDisposalDefinition: Delete a Deemed Disposal Definition.

Delete the given Deemed Disposal Definition. A definition that is applied by a valuation point cannot be deleted.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DeemedDisposalDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DeemedDisposalDefinitionsApiExample {

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
        // DeemedDisposalDefinitionsApi apiInstance = apiFactory.build(DeemedDisposalDefinitionsApi.class);

        DeemedDisposalDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(DeemedDisposalDefinitionsApi.class);
        String scope = "scope_example"; // String | The scope of the Deemed Disposal Definition to be deleted.
        String code = "code_example"; // String | The code of the Deemed Disposal Definition to be deleted. Together with the scope this uniquely identifies the Deemed Disposal Definition.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteDeemedDisposalDefinition(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteDeemedDisposalDefinition(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeemedDisposalDefinitionsApi#deleteDeemedDisposalDefinition");
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
| **scope** | **String**| The scope of the Deemed Disposal Definition to be deleted. | |
| **code** | **String**| The code of the Deemed Disposal Definition to be deleted. Together with the scope this uniquely identifies the Deemed Disposal Definition. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the Deemed Disposal Definition was deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getDeemedDisposalDefinition

> DeemedDisposalDefinition getDeemedDisposalDefinition(scope, code, asAt)

[EXPERIMENTAL] GetDeemedDisposalDefinition: Get a Deemed Disposal Definition.

Retrieve the definition of a particular Deemed Disposal Definition.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DeemedDisposalDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DeemedDisposalDefinitionsApiExample {

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
        // DeemedDisposalDefinitionsApi apiInstance = apiFactory.build(DeemedDisposalDefinitionsApi.class);

        DeemedDisposalDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(DeemedDisposalDefinitionsApi.class);
        String scope = "scope_example"; // String | The scope of the Deemed Disposal Definition.
        String code = "code_example"; // String | The code of the Deemed Disposal Definition. Together with the scope this uniquely identifies the Deemed Disposal Definition.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Deemed Disposal Definition. Defaults to returning the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // DeemedDisposalDefinition result = apiInstance.getDeemedDisposalDefinition(scope, code, asAt).execute(opts);

            DeemedDisposalDefinition result = apiInstance.getDeemedDisposalDefinition(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeemedDisposalDefinitionsApi#getDeemedDisposalDefinition");
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
| **scope** | **String**| The scope of the Deemed Disposal Definition. | |
| **code** | **String**| The code of the Deemed Disposal Definition. Together with the scope this uniquely identifies the Deemed Disposal Definition. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Deemed Disposal Definition. Defaults to returning the latest version if not specified. | [optional] |

### Return type

[**DeemedDisposalDefinition**](DeemedDisposalDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Deemed Disposal Definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listDeemedDisposalDefinitions

> PagedResourceListOfDeemedDisposalDefinition listDeemedDisposalDefinitions(asAt, page, limit, filter, sortBy)

[EXPERIMENTAL] ListDeemedDisposalDefinitions: List Deemed Disposal Definitions.

List all the Deemed Disposal Definitions matching particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DeemedDisposalDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DeemedDisposalDefinitionsApiExample {

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
        // DeemedDisposalDefinitionsApi apiInstance = apiFactory.build(DeemedDisposalDefinitionsApi.class);

        DeemedDisposalDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(DeemedDisposalDefinitionsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Deemed Disposal Definitions. Defaults to returning the latest version of each if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Deemed Disposal Definitions; this   value is returned from the previous call. If a pagination token is provided, the filter and asAt fields   must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the code, specify \"id.Code eq 'Definition1'\". For more information about filtering   results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfDeemedDisposalDefinition result = apiInstance.listDeemedDisposalDefinitions(asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfDeemedDisposalDefinition result = apiInstance.listDeemedDisposalDefinitions(asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeemedDisposalDefinitionsApi#listDeemedDisposalDefinitions");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Deemed Disposal Definitions. Defaults to returning the latest version of each if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Deemed Disposal Definitions; this   value is returned from the previous call. If a pagination token is provided, the filter and asAt fields   must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the code, specify \&quot;id.Code eq &#39;Definition1&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfDeemedDisposalDefinition**](PagedResourceListOfDeemedDisposalDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Deemed Disposal Definitions. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateDeemedDisposalDefinition

> DeemedDisposalDefinition updateDeemedDisposalDefinition(scope, code, updateDeemedDisposalDefinitionRequest)

[EXPERIMENTAL] UpdateDeemedDisposalDefinition: Update a Deemed Disposal Definition.

Replace the display name, description and filter of an existing Deemed Disposal Definition, creating a new  version. The filter must be a valid holdings filter.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DeemedDisposalDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DeemedDisposalDefinitionsApiExample {

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
        // DeemedDisposalDefinitionsApi apiInstance = apiFactory.build(DeemedDisposalDefinitionsApi.class);

        DeemedDisposalDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(DeemedDisposalDefinitionsApi.class);
        String scope = "scope_example"; // String | The scope of the Deemed Disposal Definition.
        String code = "code_example"; // String | The code of the Deemed Disposal Definition. Together with the scope this uniquely identifies the Deemed Disposal Definition.
        UpdateDeemedDisposalDefinitionRequest updateDeemedDisposalDefinitionRequest = new UpdateDeemedDisposalDefinitionRequest(); // UpdateDeemedDisposalDefinitionRequest | The new contents of the Deemed Disposal Definition.
        try {
            // uncomment the below to set overrides at the request level
            // DeemedDisposalDefinition result = apiInstance.updateDeemedDisposalDefinition(scope, code, updateDeemedDisposalDefinitionRequest).execute(opts);

            DeemedDisposalDefinition result = apiInstance.updateDeemedDisposalDefinition(scope, code, updateDeemedDisposalDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeemedDisposalDefinitionsApi#updateDeemedDisposalDefinition");
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
| **scope** | **String**| The scope of the Deemed Disposal Definition. | |
| **code** | **String**| The code of the Deemed Disposal Definition. Together with the scope this uniquely identifies the Deemed Disposal Definition. | |
| **updateDeemedDisposalDefinitionRequest** | [**UpdateDeemedDisposalDefinitionRequest**](UpdateDeemedDisposalDefinitionRequest.md)| The new contents of the Deemed Disposal Definition. | |

### Return type

[**DeemedDisposalDefinition**](DeemedDisposalDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated Deemed Disposal Definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

