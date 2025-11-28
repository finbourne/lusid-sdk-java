# CheckDefinitionsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCheckDefinition**](CheckDefinitionsApi.md#createCheckDefinition) | **POST** /api/dataquality/checkdefinitions | [EXPERIMENTAL] CreateCheckDefinition: Create a Check Definition |
| [**deleteCheckDefinition**](CheckDefinitionsApi.md#deleteCheckDefinition) | **DELETE** /api/dataquality/checkdefinitions/{scope}/{code} | [EXPERIMENTAL] DeleteCheckDefinition: Deletes a particular Check Definition |
| [**deleteRules**](CheckDefinitionsApi.md#deleteRules) | **POST** /api/dataquality/checkdefinitions/{scope}/{code}/$deleteRules | [EXPERIMENTAL] DeleteRules: Delete rules on a particular Check Definition |
| [**getCheckDefinition**](CheckDefinitionsApi.md#getCheckDefinition) | **GET** /api/dataquality/checkdefinitions/{scope}/{code} | [EXPERIMENTAL] GetCheckDefinition: Get a single Check Definition by scope and code. |
| [**listCheckDefinitions**](CheckDefinitionsApi.md#listCheckDefinitions) | **GET** /api/dataquality/checkdefinitions | [EXPERIMENTAL] ListCheckDefinitions: List Check Definitions |
| [**runCheckDefinition**](CheckDefinitionsApi.md#runCheckDefinition) | **POST** /api/dataquality/checkdefinitions/{scope}/{code}/$run | [EXPERIMENTAL] RunCheckDefinition: Runs a Check Definition against given dataset. |
| [**updateCheckDefinition**](CheckDefinitionsApi.md#updateCheckDefinition) | **PUT** /api/dataquality/checkdefinitions/{scope}/{code} | [EXPERIMENTAL] UpdateCheckDefinition: Update Check Definition defined by scope and code |
| [**upsertRules**](CheckDefinitionsApi.md#upsertRules) | **POST** /api/dataquality/checkdefinitions/{scope}/{code}/$upsertRules | [EXPERIMENTAL] UpsertRules: Upsert rules to a particular Check Definition |



## createCheckDefinition

> CheckDefinition createCheckDefinition(createCheckDefinitionRequest)

[EXPERIMENTAL] CreateCheckDefinition: Create a Check Definition

Creates a Check Definition. Returns the created Check Definition at the current effectiveAt.  Note that Check Definitions are mono-temporal, however they can have Time-Variant Properties.  Upserted Properties will be returned at the latest AsAt and EffectiveAt

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CheckDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CheckDefinitionsApiExample {

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
        // CheckDefinitionsApi apiInstance = apiFactory.build(CheckDefinitionsApi.class);

        CheckDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CheckDefinitionsApi.class);
        CreateCheckDefinitionRequest createCheckDefinitionRequest = new CreateCheckDefinitionRequest(); // CreateCheckDefinitionRequest | The request containing the details of the Check Definition
        try {
            // uncomment the below to set overrides at the request level
            // CheckDefinition result = apiInstance.createCheckDefinition(createCheckDefinitionRequest).execute(opts);

            CheckDefinition result = apiInstance.createCheckDefinition(createCheckDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CheckDefinitionsApi#createCheckDefinition");
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
| **createCheckDefinitionRequest** | [**CreateCheckDefinitionRequest**](CreateCheckDefinitionRequest.md)| The request containing the details of the Check Definition | [optional] |

### Return type

[**CheckDefinition**](CheckDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created Check Definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteCheckDefinition

> DeletedEntityResponse deleteCheckDefinition(scope, code)

[EXPERIMENTAL] DeleteCheckDefinition: Deletes a particular Check Definition

The deletion will take effect from the Check Definition deletion datetime.  i.e. will no longer exist at any asAt datetime after the asAt datetime of deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CheckDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CheckDefinitionsApiExample {

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
        // CheckDefinitionsApi apiInstance = apiFactory.build(CheckDefinitionsApi.class);

        CheckDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CheckDefinitionsApi.class);
        String scope = "scope_example"; // String | The scope of the specified Check Definition.
        String code = "code_example"; // String | The code of the specified Check Definition. Together with the domain and scope this uniquely   identifies the Check Definition.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteCheckDefinition(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteCheckDefinition(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CheckDefinitionsApi#deleteCheckDefinition");
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
| **scope** | **String**| The scope of the specified Check Definition. | |
| **code** | **String**| The code of the specified Check Definition. Together with the domain and scope this uniquely   identifies the Check Definition. | |

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


## deleteRules

> CheckDefinition deleteRules(scope, code, deleteDataQualityRule)

[EXPERIMENTAL] DeleteRules: Delete rules on a particular Check Definition

Delete rules for a given check definition. This will not affect any other rules that are not included in the request.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CheckDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CheckDefinitionsApiExample {

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
        // CheckDefinitionsApi apiInstance = apiFactory.build(CheckDefinitionsApi.class);

        CheckDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CheckDefinitionsApi.class);
        String scope = "scope_example"; // String | The scope of the specified Check Definition.
        String code = "code_example"; // String | The code of the specified Check Definition. Together with the domain and scope this uniquely   identifies the Check Definition.
        List<DeleteDataQualityRule> deleteDataQualityRule = Arrays.asList(); // List<DeleteDataQualityRule> | The request containing the rules to be deleted
        try {
            // uncomment the below to set overrides at the request level
            // CheckDefinition result = apiInstance.deleteRules(scope, code, deleteDataQualityRule).execute(opts);

            CheckDefinition result = apiInstance.deleteRules(scope, code, deleteDataQualityRule).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CheckDefinitionsApi#deleteRules");
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
| **scope** | **String**| The scope of the specified Check Definition. | |
| **code** | **String**| The code of the specified Check Definition. Together with the domain and scope this uniquely   identifies the Check Definition. | |
| **deleteDataQualityRule** | [**List&lt;DeleteDataQualityRule&gt;**](DeleteDataQualityRule.md)| The request containing the rules to be deleted | [optional] |

### Return type

[**CheckDefinition**](CheckDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated check definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getCheckDefinition

> CheckDefinition getCheckDefinition(scope, code, asAt, effectiveAt, propertyKeys)

[EXPERIMENTAL] GetCheckDefinition: Get a single Check Definition by scope and code.

Retrieves one Check Definition by scope and code.  Check Definitions are mono-temporal. The EffectiveAt is only applied to Time-Variant Properties.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CheckDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CheckDefinitionsApiExample {

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
        // CheckDefinitionsApi apiInstance = apiFactory.build(CheckDefinitionsApi.class);

        CheckDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CheckDefinitionsApi.class);
        String scope = "scope_example"; // String | The scope of the specified Check Definition.
        String code = "code_example"; // String | The code of the specified Check Definition. Together with the scope this uniquely   identifies the Check Definition.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Check Definition definition. Defaults to return   the latest version of the definition if not specified.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the check definition properties.   Defaults to the current LUSID system datetime if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'CheckDefinition' domain to decorate onto   the Check Definition.   These must have the format {domain}/{scope}/{code}, for example 'CheckDefinition/system/Name'.
        try {
            // uncomment the below to set overrides at the request level
            // CheckDefinition result = apiInstance.getCheckDefinition(scope, code, asAt, effectiveAt, propertyKeys).execute(opts);

            CheckDefinition result = apiInstance.getCheckDefinition(scope, code, asAt, effectiveAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CheckDefinitionsApi#getCheckDefinition");
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
| **scope** | **String**| The scope of the specified Check Definition. | |
| **code** | **String**| The code of the specified Check Definition. Together with the scope this uniquely   identifies the Check Definition. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Check Definition definition. Defaults to return   the latest version of the definition if not specified. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the check definition properties.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;CheckDefinition&#39; domain to decorate onto   the Check Definition.   These must have the format {domain}/{scope}/{code}, for example &#39;CheckDefinition/system/Name&#39;. | [optional] |

### Return type

[**CheckDefinition**](CheckDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Check Definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listCheckDefinitions

> PagedResourceListOfCheckDefinition listCheckDefinitions(asAt, effectiveAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListCheckDefinitions: List Check Definitions

List all the Check Definitions matching a particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CheckDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CheckDefinitionsApiExample {

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
        // CheckDefinitionsApi apiInstance = apiFactory.build(CheckDefinitionsApi.class);

        CheckDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CheckDefinitionsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Check Definitions. Defaults to returning the latest version of each Check Definition if not specified.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the Check Definitions.   Note that Check Definitions are monotemporal, the effectiveAt is for Timevariant Properties on the Check Definition only.   Defaults to the current LUSID system datetime if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Check Definitions; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the displayName, specify \"displayName eq 'MyCheckDefinition'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'CheckDefinition' domain to decorate onto each Check Definition.   These must take the format {domain}/{scope}/{code}, for example 'CheckDefinition/Account/id'.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfCheckDefinition result = apiInstance.listCheckDefinitions(asAt, effectiveAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            PagedResourceListOfCheckDefinition result = apiInstance.listCheckDefinitions(asAt, effectiveAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CheckDefinitionsApi#listCheckDefinitions");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Check Definitions. Defaults to returning the latest version of each Check Definition if not specified. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the Check Definitions.   Note that Check Definitions are monotemporal, the effectiveAt is for Timevariant Properties on the Check Definition only.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Check Definitions; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the displayName, specify \&quot;displayName eq &#39;MyCheckDefinition&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;CheckDefinition&#39; domain to decorate onto each Check Definition.   These must take the format {domain}/{scope}/{code}, for example &#39;CheckDefinition/Account/id&#39;. | [optional] |

### Return type

[**PagedResourceListOfCheckDefinition**](PagedResourceListOfCheckDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Check Definitions. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## runCheckDefinition

> RunCheckResponse runCheckDefinition(scope, code, runCheckRequest)

[EXPERIMENTAL] RunCheckDefinition: Runs a Check Definition against given dataset.

Runs a Check Definition against given dataset.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CheckDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CheckDefinitionsApiExample {

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
        // CheckDefinitionsApi apiInstance = apiFactory.build(CheckDefinitionsApi.class);

        CheckDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CheckDefinitionsApi.class);
        String scope = "scope_example"; // String | Scope of the CheckDefinition to run.
        String code = "code_example"; // String | Code of the CheckDefinition to run.
        RunCheckRequest runCheckRequest = new RunCheckRequest(); // RunCheckRequest | Run request defining what dataset to run against.
        try {
            // uncomment the below to set overrides at the request level
            // RunCheckResponse result = apiInstance.runCheckDefinition(scope, code, runCheckRequest).execute(opts);

            RunCheckResponse result = apiInstance.runCheckDefinition(scope, code, runCheckRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CheckDefinitionsApi#runCheckDefinition");
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
| **scope** | **String**| Scope of the CheckDefinition to run. | |
| **code** | **String**| Code of the CheckDefinition to run. | |
| **runCheckRequest** | [**RunCheckRequest**](RunCheckRequest.md)| Run request defining what dataset to run against. | [optional] |

### Return type

[**RunCheckResponse**](RunCheckResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateCheckDefinition

> CheckDefinition updateCheckDefinition(scope, code, updateCheckDefinitionRequest)

[EXPERIMENTAL] UpdateCheckDefinition: Update Check Definition defined by scope and code

Overwrites an existing Check Definition  Update request has the same required fields as Create apart from the id.  Returns the updated Check Definition at the current effectiveAt.  Note that Check Definitions are mono-temporal, however they can have Time-Variant Properties.  Updated Properties will be returned at the latest AsAt and EffectiveAt

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CheckDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CheckDefinitionsApiExample {

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
        // CheckDefinitionsApi apiInstance = apiFactory.build(CheckDefinitionsApi.class);

        CheckDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CheckDefinitionsApi.class);
        String scope = "scope_example"; // String | The scope of the specified Check Definition.
        String code = "code_example"; // String | The code of the specified Check Definition. Together with the domain and scope this uniquely identifies the Check Definition.
        UpdateCheckDefinitionRequest updateCheckDefinitionRequest = new UpdateCheckDefinitionRequest(); // UpdateCheckDefinitionRequest | The request containing the updated details of the Check Definition
        try {
            // uncomment the below to set overrides at the request level
            // CheckDefinition result = apiInstance.updateCheckDefinition(scope, code, updateCheckDefinitionRequest).execute(opts);

            CheckDefinition result = apiInstance.updateCheckDefinition(scope, code, updateCheckDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CheckDefinitionsApi#updateCheckDefinition");
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
| **scope** | **String**| The scope of the specified Check Definition. | |
| **code** | **String**| The code of the specified Check Definition. Together with the domain and scope this uniquely identifies the Check Definition. | |
| **updateCheckDefinitionRequest** | [**UpdateCheckDefinitionRequest**](UpdateCheckDefinitionRequest.md)| The request containing the updated details of the Check Definition | [optional] |

### Return type

[**CheckDefinition**](CheckDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated version of the requested Check Definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertRules

> CheckDefinition upsertRules(scope, code, upsertDataQualityRule)

[EXPERIMENTAL] UpsertRules: Upsert rules to a particular Check Definition

Upsert rules for a given check definition. This will not affect any other rules that are not included in the request.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CheckDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CheckDefinitionsApiExample {

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
        // CheckDefinitionsApi apiInstance = apiFactory.build(CheckDefinitionsApi.class);

        CheckDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CheckDefinitionsApi.class);
        String scope = "scope_example"; // String | The scope of the specified Check Definition.
        String code = "code_example"; // String | The code of the specified Check Definition. Together with the domain and scope this uniquely   identifies the Check Definition.
        List<UpsertDataQualityRule> upsertDataQualityRule = Arrays.asList(); // List<UpsertDataQualityRule> | The request containing the rules to be upserted
        try {
            // uncomment the below to set overrides at the request level
            // CheckDefinition result = apiInstance.upsertRules(scope, code, upsertDataQualityRule).execute(opts);

            CheckDefinition result = apiInstance.upsertRules(scope, code, upsertDataQualityRule).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CheckDefinitionsApi#upsertRules");
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
| **scope** | **String**| The scope of the specified Check Definition. | |
| **code** | **String**| The code of the specified Check Definition. Together with the domain and scope this uniquely   identifies the Check Definition. | |
| **upsertDataQualityRule** | [**List&lt;UpsertDataQualityRule&gt;**](UpsertDataQualityRule.md)| The request containing the rules to be upserted | [optional] |

### Return type

[**CheckDefinition**](CheckDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated check definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

