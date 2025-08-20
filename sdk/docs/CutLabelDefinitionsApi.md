# CutLabelDefinitionsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCutLabelDefinition**](CutLabelDefinitionsApi.md#createCutLabelDefinition) | **POST** /api/systemconfiguration/cutlabels | CreateCutLabelDefinition: Create a Cut Label |
| [**deleteCutLabelDefinition**](CutLabelDefinitionsApi.md#deleteCutLabelDefinition) | **DELETE** /api/systemconfiguration/cutlabels/{code} | DeleteCutLabelDefinition: Delete a Cut Label |
| [**getCutLabelDefinition**](CutLabelDefinitionsApi.md#getCutLabelDefinition) | **GET** /api/systemconfiguration/cutlabels/{code} | GetCutLabelDefinition: Get a Cut Label |
| [**listCutLabelDefinitions**](CutLabelDefinitionsApi.md#listCutLabelDefinitions) | **GET** /api/systemconfiguration/cutlabels | ListCutLabelDefinitions: List Existing Cut Labels |
| [**updateCutLabelDefinition**](CutLabelDefinitionsApi.md#updateCutLabelDefinition) | **PUT** /api/systemconfiguration/cutlabels/{code} | UpdateCutLabelDefinition: Update a Cut Label |



## createCutLabelDefinition

> CutLabelDefinition createCutLabelDefinition(createCutLabelDefinitionRequest)

CreateCutLabelDefinition: Create a Cut Label

Create a Cut Label valid in all scopes

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CutLabelDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CutLabelDefinitionsApiExample {

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
        // CutLabelDefinitionsApi apiInstance = apiFactory.build(CutLabelDefinitionsApi.class);

        CutLabelDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CutLabelDefinitionsApi.class);
        CreateCutLabelDefinitionRequest createCutLabelDefinitionRequest = new CreateCutLabelDefinitionRequest(); // CreateCutLabelDefinitionRequest | The cut label definition
        try {
            // uncomment the below to set overrides at the request level
            // CutLabelDefinition result = apiInstance.createCutLabelDefinition(createCutLabelDefinitionRequest).execute(opts);

            CutLabelDefinition result = apiInstance.createCutLabelDefinition(createCutLabelDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CutLabelDefinitionsApi#createCutLabelDefinition");
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
| **createCutLabelDefinitionRequest** | [**CreateCutLabelDefinitionRequest**](CreateCutLabelDefinitionRequest.md)| The cut label definition | [optional] |

### Return type

[**CutLabelDefinition**](CutLabelDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created cut label |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteCutLabelDefinition

> OffsetDateTime deleteCutLabelDefinition(code)

DeleteCutLabelDefinition: Delete a Cut Label

Delete a specified cut label

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CutLabelDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CutLabelDefinitionsApiExample {

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
        // CutLabelDefinitionsApi apiInstance = apiFactory.build(CutLabelDefinitionsApi.class);

        CutLabelDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CutLabelDefinitionsApi.class);
        String code = "code_example"; // String | The Code of the Cut Label that is being Deleted
        try {
            // uncomment the below to set overrides at the request level
            // OffsetDateTime result = apiInstance.deleteCutLabelDefinition(code).execute(opts);

            OffsetDateTime result = apiInstance.deleteCutLabelDefinition(code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CutLabelDefinitionsApi#deleteCutLabelDefinition");
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
| **code** | **String**| The Code of the Cut Label that is being Deleted | |

### Return type

[**OffsetDateTime**](OffsetDateTime.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The time of deletion |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getCutLabelDefinition

> CutLabelDefinition getCutLabelDefinition(code, asAt)

GetCutLabelDefinition: Get a Cut Label

Get a specified cut label at a given time

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CutLabelDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CutLabelDefinitionsApiExample {

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
        // CutLabelDefinitionsApi apiInstance = apiFactory.build(CutLabelDefinitionsApi.class);

        CutLabelDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CutLabelDefinitionsApi.class);
        String code = "code_example"; // String | The Code of the Cut Label that is being queried
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The time at which to get the Cut Label
        try {
            // uncomment the below to set overrides at the request level
            // CutLabelDefinition result = apiInstance.getCutLabelDefinition(code, asAt).execute(opts);

            CutLabelDefinition result = apiInstance.getCutLabelDefinition(code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CutLabelDefinitionsApi#getCutLabelDefinition");
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
| **code** | **String**| The Code of the Cut Label that is being queried | |
| **asAt** | **OffsetDateTime**| The time at which to get the Cut Label | [optional] |

### Return type

[**CutLabelDefinition**](CutLabelDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested cut label |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listCutLabelDefinitions

> PagedResourceListOfCutLabelDefinition listCutLabelDefinitions(asAt, sortBy, limit, filter, page)

ListCutLabelDefinitions: List Existing Cut Labels

List all the Cut Label Definitions that are valid at the given AsAt time

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CutLabelDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CutLabelDefinitionsApiExample {

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
        // CutLabelDefinitionsApi apiInstance = apiFactory.build(CutLabelDefinitionsApi.class);

        CutLabelDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CutLabelDefinitionsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The As At time at which listed Cut Labels are valid
        List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
        Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Optional. Expression to filter the result set.  For example, to filter on code, use \"code eq 'string'\"  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        String page = "page_example"; // String | The pagination token to use to continue listing cut labels from a previous call This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields must not have changed since the original request.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfCutLabelDefinition result = apiInstance.listCutLabelDefinitions(asAt, sortBy, limit, filter, page).execute(opts);

            PagedResourceListOfCutLabelDefinition result = apiInstance.listCutLabelDefinitions(asAt, sortBy, limit, filter, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CutLabelDefinitionsApi#listCutLabelDefinitions");
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
| **asAt** | **OffsetDateTime**| Optional. The As At time at which listed Cut Labels are valid | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set.  For example, to filter on code, use \&quot;code eq &#39;string&#39;\&quot;  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **page** | **String**| The pagination token to use to continue listing cut labels from a previous call This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields must not have changed since the original request. | [optional] |

### Return type

[**PagedResourceListOfCutLabelDefinition**](PagedResourceListOfCutLabelDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of cut labels |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateCutLabelDefinition

> CutLabelDefinition updateCutLabelDefinition(code, updateCutLabelDefinitionRequest)

UpdateCutLabelDefinition: Update a Cut Label

Update a specified cut label

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CutLabelDefinitionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CutLabelDefinitionsApiExample {

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
        // CutLabelDefinitionsApi apiInstance = apiFactory.build(CutLabelDefinitionsApi.class);

        CutLabelDefinitionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CutLabelDefinitionsApi.class);
        String code = "code_example"; // String | The Code of the Cut Label that is being updated
        UpdateCutLabelDefinitionRequest updateCutLabelDefinitionRequest = new UpdateCutLabelDefinitionRequest(); // UpdateCutLabelDefinitionRequest | The cut label update definition
        try {
            // uncomment the below to set overrides at the request level
            // CutLabelDefinition result = apiInstance.updateCutLabelDefinition(code, updateCutLabelDefinitionRequest).execute(opts);

            CutLabelDefinition result = apiInstance.updateCutLabelDefinition(code, updateCutLabelDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CutLabelDefinitionsApi#updateCutLabelDefinition");
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
| **code** | **String**| The Code of the Cut Label that is being updated | |
| **updateCutLabelDefinitionRequest** | [**UpdateCutLabelDefinitionRequest**](UpdateCutLabelDefinitionRequest.md)| The cut label update definition | [optional] |

### Return type

[**CutLabelDefinition**](CutLabelDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated cut label |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

