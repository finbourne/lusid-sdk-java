# WithholdingTaxApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWithholdingTaxDatasetDefinitions**](WithholdingTaxApi.md#createWithholdingTaxDatasetDefinitions) | **POST** /api/withholdingtax/datasetdefinitions | [EARLY ACCESS] CreateWithholdingTaxDatasetDefinitions: Create the Withholding Tax dataset definitions. |
| [**deleteWithholdingTaxConfiguration**](WithholdingTaxApi.md#deleteWithholdingTaxConfiguration) | **DELETE** /api/withholdingtax/configurations/{scope}/{code} | [EARLY ACCESS] DeleteWithholdingTaxConfiguration: Delete a Withholding Tax Configuration. |
| [**deleteWithholdingTaxDatasetDefinition**](WithholdingTaxApi.md#deleteWithholdingTaxDatasetDefinition) | **DELETE** /api/withholdingtax/datasetdefinitions/{scope}/{code} | [EARLY ACCESS] DeleteWithholdingTaxDatasetDefinition: Delete a Withholding Tax dataset definition. |
| [**getWithholdingTaxConfiguration**](WithholdingTaxApi.md#getWithholdingTaxConfiguration) | **GET** /api/withholdingtax/configurations/{scope}/{code} | [EARLY ACCESS] GetWithholdingTaxConfiguration: Get a Withholding Tax Configuration. |
| [**getWithholdingTaxDatasetDefinition**](WithholdingTaxApi.md#getWithholdingTaxDatasetDefinition) | **GET** /api/withholdingtax/datasetdefinitions/{scope}/{code} | [EARLY ACCESS] GetWithholdingTaxDatasetDefinition: Get a Withholding Tax dataset definition. |
| [**listWithholdingTaxConfigurations**](WithholdingTaxApi.md#listWithholdingTaxConfigurations) | **GET** /api/withholdingtax/configurations | [EARLY ACCESS] ListWithholdingTaxConfigurations: List Withholding Tax Configurations. |
| [**listWithholdingTaxDatasetDefinitions**](WithholdingTaxApi.md#listWithholdingTaxDatasetDefinitions) | **GET** /api/withholdingtax/datasetdefinitions | [EARLY ACCESS] ListWithholdingTaxDatasetDefinitions: List Withholding Tax dataset definitions. |
| [**patchWithholdingTaxDatasetDefinition**](WithholdingTaxApi.md#patchWithholdingTaxDatasetDefinition) | **PATCH** /api/withholdingtax/datasetdefinitions/{scope}/{code} | [EARLY ACCESS] PatchWithholdingTaxDatasetDefinition: Patch a Withholding Tax dataset definition. |
| [**upsertWithholdingTaxConfiguration**](WithholdingTaxApi.md#upsertWithholdingTaxConfiguration) | **POST** /api/withholdingtax/configurations/{scope}/{code} | [EARLY ACCESS] UpsertWithholdingTaxConfiguration: Upsert a Withholding Tax Configuration. |



## createWithholdingTaxDatasetDefinitions

> WithholdingTaxDatasetDefinitions createWithholdingTaxDatasetDefinitions(createWithholdingTaxDatasetDefinitionsRequest)

[EARLY ACCESS] CreateWithholdingTaxDatasetDefinitions: Create the Withholding Tax dataset definitions.

Create the anomaly and the main relational dataset definition for a customer domain, in a single call.     The definitions are constructed rather than accepted as given, so the fields the engine reads by name cannot  be absent, misspelled or created in the wrong field category. LUSID adds the mandatory core to both: taxCountry  and profileType as series identifiers, countryRate, treatyRate, betterRate and enhancedRate as value fields,  treatyRAS, betterRAS and enhancedRAS as value fields, and rank as a value field on the anomaly definition only.     The caller supplies only their own matching dimensions, given per dataset. The two schemas need not be  identical: a dimension present on only one dataset is simply not matched on when the other is queried, an ISIN  dimension on the anomaly dataset alone being the usual case. The request is rejected if it names a dimension  that collides with a mandatory core field, or if it omits a scope or a code.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WithholdingTaxApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WithholdingTaxApiExample {

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
        // WithholdingTaxApi apiInstance = apiFactory.build(WithholdingTaxApi.class);

        WithholdingTaxApi apiInstance = ApiFactoryBuilder.build(fileName).build(WithholdingTaxApi.class);
        CreateWithholdingTaxDatasetDefinitionsRequest createWithholdingTaxDatasetDefinitionsRequest = new CreateWithholdingTaxDatasetDefinitionsRequest(); // CreateWithholdingTaxDatasetDefinitionsRequest | The scope, code and matching dimensions of each of the two datasets to create.
        try {
            // uncomment the below to set overrides at the request level
            // WithholdingTaxDatasetDefinitions result = apiInstance.createWithholdingTaxDatasetDefinitions(createWithholdingTaxDatasetDefinitionsRequest).execute(opts);

            WithholdingTaxDatasetDefinitions result = apiInstance.createWithholdingTaxDatasetDefinitions(createWithholdingTaxDatasetDefinitionsRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WithholdingTaxApi#createWithholdingTaxDatasetDefinitions");
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
| **createWithholdingTaxDatasetDefinitionsRequest** | [**CreateWithholdingTaxDatasetDefinitionsRequest**](CreateWithholdingTaxDatasetDefinitionsRequest.md)| The scope, code and matching dimensions of each of the two datasets to create. | |

### Return type

[**WithholdingTaxDatasetDefinitions**](WithholdingTaxDatasetDefinitions.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created anomaly and main relational dataset definitions. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteWithholdingTaxConfiguration

> DeletedEntityResponse deleteWithholdingTaxConfiguration(scope, code)

[EARLY ACCESS] DeleteWithholdingTaxConfiguration: Delete a Withholding Tax Configuration.

Delete the Withholding Tax Configuration at the given scope and code. Rejected if a portfolio, fund or share  class still references the configuration, rather than orphaning those references.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WithholdingTaxApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WithholdingTaxApiExample {

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
        // WithholdingTaxApi apiInstance = apiFactory.build(WithholdingTaxApi.class);

        WithholdingTaxApi apiInstance = ApiFactoryBuilder.build(fileName).build(WithholdingTaxApi.class);
        String scope = "scope_example"; // String | The scope of the Withholding Tax Configuration to be deleted.
        String code = "code_example"; // String | The code of the Withholding Tax Configuration to be deleted. Together with the scope this uniquely identifies the configuration.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteWithholdingTaxConfiguration(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteWithholdingTaxConfiguration(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WithholdingTaxApi#deleteWithholdingTaxConfiguration");
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
| **scope** | **String**| The scope of the Withholding Tax Configuration to be deleted. | |
| **code** | **String**| The code of the Withholding Tax Configuration to be deleted. Together with the scope this uniquely identifies the configuration. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the Withholding Tax Configuration was deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteWithholdingTaxDatasetDefinition

> DeletedEntityResponse deleteWithholdingTaxDatasetDefinition(scope, code)

[EARLY ACCESS] DeleteWithholdingTaxDatasetDefinition: Delete a Withholding Tax dataset definition.

Delete one Withholding Tax relational dataset definition, subject to the platform&#39;s own rules on what may be  changed on a populated dataset.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WithholdingTaxApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WithholdingTaxApiExample {

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
        // WithholdingTaxApi apiInstance = apiFactory.build(WithholdingTaxApi.class);

        WithholdingTaxApi apiInstance = ApiFactoryBuilder.build(fileName).build(WithholdingTaxApi.class);
        String scope = "scope_example"; // String | The scope of the dataset definition to be deleted.
        String code = "code_example"; // String | The code of the dataset definition to be deleted. Together with the scope this uniquely identifies the definition.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteWithholdingTaxDatasetDefinition(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteWithholdingTaxDatasetDefinition(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WithholdingTaxApi#deleteWithholdingTaxDatasetDefinition");
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
| **scope** | **String**| The scope of the dataset definition to be deleted. | |
| **code** | **String**| The code of the dataset definition to be deleted. Together with the scope this uniquely identifies the definition. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the relational dataset definition was deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getWithholdingTaxConfiguration

> WithholdingTaxConfiguration getWithholdingTaxConfiguration(scope, code, asAt)

[EARLY ACCESS] GetWithholdingTaxConfiguration: Get a Withholding Tax Configuration.

Retrieve a single Withholding Tax Configuration by scope and code.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WithholdingTaxApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WithholdingTaxApiExample {

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
        // WithholdingTaxApi apiInstance = apiFactory.build(WithholdingTaxApi.class);

        WithholdingTaxApi apiInstance = ApiFactoryBuilder.build(fileName).build(WithholdingTaxApi.class);
        String scope = "scope_example"; // String | The scope of the Withholding Tax Configuration.
        String code = "code_example"; // String | The code of the Withholding Tax Configuration. Together with the scope this uniquely identifies the configuration.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Withholding Tax Configuration. Defaults to returning the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // WithholdingTaxConfiguration result = apiInstance.getWithholdingTaxConfiguration(scope, code, asAt).execute(opts);

            WithholdingTaxConfiguration result = apiInstance.getWithholdingTaxConfiguration(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WithholdingTaxApi#getWithholdingTaxConfiguration");
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
| **scope** | **String**| The scope of the Withholding Tax Configuration. | |
| **code** | **String**| The code of the Withholding Tax Configuration. Together with the scope this uniquely identifies the configuration. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Withholding Tax Configuration. Defaults to returning the latest version if not specified. | [optional] |

### Return type

[**WithholdingTaxConfiguration**](WithholdingTaxConfiguration.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Withholding Tax Configuration. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getWithholdingTaxDatasetDefinition

> WithholdingTaxDataset getWithholdingTaxDatasetDefinition(scope, code, asAt)

[EARLY ACCESS] GetWithholdingTaxDatasetDefinition: Get a Withholding Tax dataset definition.

Retrieve one Withholding Tax dataset definition by scope and code, in the same shape the create returns: the  matching dimensions the caller supplied. The mandatory core is not returned here; read the full field schema  from the relational dataset definition at the returned href.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WithholdingTaxApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WithholdingTaxApiExample {

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
        // WithholdingTaxApi apiInstance = apiFactory.build(WithholdingTaxApi.class);

        WithholdingTaxApi apiInstance = ApiFactoryBuilder.build(fileName).build(WithholdingTaxApi.class);
        String scope = "scope_example"; // String | The scope of the dataset definition.
        String code = "code_example"; // String | The code of the dataset definition. Together with the scope this uniquely identifies the definition.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the dataset definition. Defaults to returning the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // WithholdingTaxDataset result = apiInstance.getWithholdingTaxDatasetDefinition(scope, code, asAt).execute(opts);

            WithholdingTaxDataset result = apiInstance.getWithholdingTaxDatasetDefinition(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WithholdingTaxApi#getWithholdingTaxDatasetDefinition");
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
| **scope** | **String**| The scope of the dataset definition. | |
| **code** | **String**| The code of the dataset definition. Together with the scope this uniquely identifies the definition. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the dataset definition. Defaults to returning the latest version if not specified. | [optional] |

### Return type

[**WithholdingTaxDataset**](WithholdingTaxDataset.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Withholding Tax dataset definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listWithholdingTaxConfigurations

> PagedResourceListOfWithholdingTaxConfiguration listWithholdingTaxConfigurations(asAt, page, limit, filter, sortBy)

[EARLY ACCESS] ListWithholdingTaxConfigurations: List Withholding Tax Configurations.

List the Withholding Tax Configurations across every scope the caller is entitled to. To list the  configurations of a single scope, filter on the scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WithholdingTaxApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WithholdingTaxApiExample {

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
        // WithholdingTaxApi apiInstance = apiFactory.build(WithholdingTaxApi.class);

        WithholdingTaxApi apiInstance = ApiFactoryBuilder.build(fileName).build(WithholdingTaxApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Withholding Tax Configurations. Defaults to returning the latest version of each configuration if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Withholding Tax Configurations; this value is   returned from the previous call. If a pagination token is provided, the filter and asAt fields must not have   changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. For example, to filter on the scope, specify   \"id.Scope eq 'WithholdingTax'\", and to filter on the code, specify \"id.Code eq 'UK-LIFE-BLAGAB'\". For more   information about filtering results, see   https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfWithholdingTaxConfiguration result = apiInstance.listWithholdingTaxConfigurations(asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfWithholdingTaxConfiguration result = apiInstance.listWithholdingTaxConfigurations(asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WithholdingTaxApi#listWithholdingTaxConfigurations");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Withholding Tax Configurations. Defaults to returning the latest version of each configuration if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Withholding Tax Configurations; this value is   returned from the previous call. If a pagination token is provided, the filter and asAt fields must not have   changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. For example, to filter on the scope, specify   \&quot;id.Scope eq &#39;WithholdingTax&#39;\&quot;, and to filter on the code, specify \&quot;id.Code eq &#39;UK-LIFE-BLAGAB&#39;\&quot;. For more   information about filtering results, see   https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfWithholdingTaxConfiguration**](PagedResourceListOfWithholdingTaxConfiguration.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Withholding Tax Configurations. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listWithholdingTaxDatasetDefinitions

> PagedResourceListOfWithholdingTaxDataset listWithholdingTaxDatasetDefinitions(asAt, page, limit, filter, sortBy)

[EARLY ACCESS] ListWithholdingTaxDatasetDefinitions: List Withholding Tax dataset definitions.

List the Withholding Tax dataset definitions across every scope the caller is entitled to, each in the same  shape the create returns. To list the definitions of a single scope, filter on the scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WithholdingTaxApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WithholdingTaxApiExample {

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
        // WithholdingTaxApi apiInstance = apiFactory.build(WithholdingTaxApi.class);

        WithholdingTaxApi apiInstance = ApiFactoryBuilder.build(fileName).build(WithholdingTaxApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the dataset definitions. Defaults to returning the latest version of each definition if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing dataset definitions; this value is returned   from the previous call. If a pagination token is provided, the filter and asAt fields must not have changed   since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. For example, to filter on the scope, specify   \"scope eq 'WithholdingTax'\", and to filter on the code, specify \"code eq 'wht-main-rates'\". For more   information about filtering results, see   https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfWithholdingTaxDataset result = apiInstance.listWithholdingTaxDatasetDefinitions(asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfWithholdingTaxDataset result = apiInstance.listWithholdingTaxDatasetDefinitions(asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WithholdingTaxApi#listWithholdingTaxDatasetDefinitions");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the dataset definitions. Defaults to returning the latest version of each definition if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing dataset definitions; this value is returned   from the previous call. If a pagination token is provided, the filter and asAt fields must not have changed   since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. For example, to filter on the scope, specify   \&quot;scope eq &#39;WithholdingTax&#39;\&quot;, and to filter on the code, specify \&quot;code eq &#39;wht-main-rates&#39;\&quot;. For more   information about filtering results, see   https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfWithholdingTaxDataset**](PagedResourceListOfWithholdingTaxDataset.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Withholding Tax dataset definitions. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## patchWithholdingTaxDatasetDefinition

> WithholdingTaxDataset patchWithholdingTaxDatasetDefinition(scope, code, operation)

[EARLY ACCESS] PatchWithholdingTaxDatasetDefinition: Patch a Withholding Tax dataset definition.

Amend one Withholding Tax relational dataset definition, adding a matching dimension being the common case.  Subject to the platform&#39;s own rules on what may be changed on a populated dataset.     Only the matching dimensions the document addresses are affected; a dimension it does not address is left as  it is. Append a dimension with an add on \&quot;/dimensions/-\&quot;, and amend one in place with an add on its index.     A dimension whose name collides with a mandatory core field is rejected, as is any attempt to add a rate tier:  the tier set is fixed at four and cannot be extended by schema evolution, because the engine could never read  a tier it does not know by name. The mandatory core is not addressable by this endpoint at all.     The amended dataset is returned in the same shape the get and the list return: the matching dimensions alone.  Read the full field schema from the relational dataset definition at the returned href.  The behaviour is defined by the JSON Patch specification.    Currently supported fields are: Dimensions.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WithholdingTaxApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WithholdingTaxApiExample {

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
        // WithholdingTaxApi apiInstance = apiFactory.build(WithholdingTaxApi.class);

        WithholdingTaxApi apiInstance = ApiFactoryBuilder.build(fileName).build(WithholdingTaxApi.class);
        String scope = "scope_example"; // String | The scope of the dataset definition to amend.
        String code = "code_example"; // String | The code of the dataset definition to amend. Together with the scope this uniquely identifies the definition.
        List<Operation> operation = Arrays.asList(); // List<Operation> | The json patch document. For more information see: https://datatracker.ietf.org/doc/html/rfc6902.
        try {
            // uncomment the below to set overrides at the request level
            // WithholdingTaxDataset result = apiInstance.patchWithholdingTaxDatasetDefinition(scope, code, operation).execute(opts);

            WithholdingTaxDataset result = apiInstance.patchWithholdingTaxDatasetDefinition(scope, code, operation).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WithholdingTaxApi#patchWithholdingTaxDatasetDefinition");
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
| **scope** | **String**| The scope of the dataset definition to amend. | |
| **code** | **String**| The code of the dataset definition to amend. Together with the scope this uniquely identifies the definition. | |
| **operation** | [**List&lt;Operation&gt;**](Operation.md)| The json patch document. For more information see: https://datatracker.ietf.org/doc/html/rfc6902. | |

### Return type

[**WithholdingTaxDataset**](WithholdingTaxDataset.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The amended Withholding Tax dataset. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertWithholdingTaxConfiguration

> WithholdingTaxConfiguration upsertWithholdingTaxConfiguration(scope, code, upsertWithholdingTaxConfigurationRequest)

[EARLY ACCESS] UpsertWithholdingTaxConfiguration: Upsert a Withholding Tax Configuration.

Create or replace the Withholding Tax Configuration at the given scope and code. The write is a full replace  on the object rather than a partial update, so the request must carry the complete configuration.     The write is rejected if either referenced dataset does not exist, if either is missing a mandatory core field  or has one in the wrong field category, if any customer-defined dimension in either dataset has no value source  declaration, or if a declaration names a dimension neither dataset has. Errors name the specific field.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.WithholdingTaxApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WithholdingTaxApiExample {

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
        // WithholdingTaxApi apiInstance = apiFactory.build(WithholdingTaxApi.class);

        WithholdingTaxApi apiInstance = ApiFactoryBuilder.build(fileName).build(WithholdingTaxApi.class);
        String scope = "scope_example"; // String | The scope of the Withholding Tax Configuration.
        String code = "code_example"; // String | The code of the Withholding Tax Configuration. Together with the scope this uniquely identifies the configuration.
        UpsertWithholdingTaxConfigurationRequest upsertWithholdingTaxConfigurationRequest = new UpsertWithholdingTaxConfigurationRequest(); // UpsertWithholdingTaxConfigurationRequest | The complete Withholding Tax Configuration to create or replace.
        try {
            // uncomment the below to set overrides at the request level
            // WithholdingTaxConfiguration result = apiInstance.upsertWithholdingTaxConfiguration(scope, code, upsertWithholdingTaxConfigurationRequest).execute(opts);

            WithholdingTaxConfiguration result = apiInstance.upsertWithholdingTaxConfiguration(scope, code, upsertWithholdingTaxConfigurationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling WithholdingTaxApi#upsertWithholdingTaxConfiguration");
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
| **scope** | **String**| The scope of the Withholding Tax Configuration. | |
| **code** | **String**| The code of the Withholding Tax Configuration. Together with the scope this uniquely identifies the configuration. | |
| **upsertWithholdingTaxConfigurationRequest** | [**UpsertWithholdingTaxConfigurationRequest**](UpsertWithholdingTaxConfigurationRequest.md)| The complete Withholding Tax Configuration to create or replace. | |

### Return type

[**WithholdingTaxConfiguration**](WithholdingTaxConfiguration.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created or replaced Withholding Tax Configuration. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

