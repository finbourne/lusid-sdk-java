# ScenariosApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteScenario**](ScenariosApi.md#deleteScenario) | **DELETE** /api/scenarios/{scope}/{code} | [EARLY ACCESS] DeleteScenario: Delete a Scenario, assuming that it is present. |
| [**getScenario**](ScenariosApi.md#getScenario) | **GET** /api/scenarios/{scope}/{code} | [EARLY ACCESS] GetScenario: Get Scenario |
| [**listScenarios**](ScenariosApi.md#listScenarios) | **GET** /api/scenarios/{scope} | [EARLY ACCESS] ListScenarios: List the set of Scenario definitions |
| [**upsertScenario**](ScenariosApi.md#upsertScenario) | **POST** /api/scenarios | [EARLY ACCESS] UpsertScenario: Upsert a Scenario. This creates or updates the scenario definition in LUSID. |



## deleteScenario

> AnnulSingleStructuredDataResponse deleteScenario(scope, code)

[EARLY ACCESS] DeleteScenario: Delete a Scenario, assuming that it is present.

Delete the specified Scenario definition from a single scope.     The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ScenariosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ScenariosApiExample {

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
        // ScenariosApi apiInstance = apiFactory.build(ScenariosApi.class);

        ScenariosApi apiInstance = ApiFactoryBuilder.build(fileName).build(ScenariosApi.class);
        String scope = "scope_example"; // String | The scope of the Scenario to delete.
        String code = "code_example"; // String | The Scenario to delete.
        try {
            // uncomment the below to set overrides at the request level
            // AnnulSingleStructuredDataResponse result = apiInstance.deleteScenario(scope, code).execute(opts);

            AnnulSingleStructuredDataResponse result = apiInstance.deleteScenario(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScenariosApi#deleteScenario");
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
| **scope** | **String**| The scope of the Scenario to delete. | |
| **code** | **String**| The Scenario to delete. | |

### Return type

[**AnnulSingleStructuredDataResponse**](AnnulSingleStructuredDataResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AsAt of deletion or failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getScenario

> GetScenarioResponse getScenario(scope, code, asAt)

[EARLY ACCESS] GetScenario: Get Scenario

Get a Scenario definition from a single scope.     The response will return either the scenario that has been stored, or a failure explaining why the request was unsuccessful.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ScenariosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ScenariosApiExample {

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
        // ScenariosApi apiInstance = apiFactory.build(ScenariosApi.class);

        ScenariosApi apiInstance = ApiFactoryBuilder.build(fileName).build(ScenariosApi.class);
        String scope = "scope_example"; // String | The scope of the Scenario to retrieve.
        String code = "code_example"; // String | The code of the Scenario to retrieve.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Scenario. Defaults to return the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // GetScenarioResponse result = apiInstance.getScenario(scope, code, asAt).execute(opts);

            GetScenarioResponse result = apiInstance.getScenario(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScenariosApi#getScenario");
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
| **scope** | **String**| The scope of the Scenario to retrieve. | |
| **code** | **String**| The code of the Scenario to retrieve. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Scenario. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**GetScenarioResponse**](GetScenarioResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Scenario or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listScenarios

> PagedResourceListOfGetScenarioResponse listScenarios(scope, asAt, filter, limit, page)

[EARLY ACCESS] ListScenarios: List the set of Scenario definitions

List the set of scenario definitions at the specified date/time and scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ScenariosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ScenariosApiExample {

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
        // ScenariosApi apiInstance = apiFactory.build(ScenariosApi.class);

        ScenariosApi apiInstance = ApiFactoryBuilder.build(fileName).build(ScenariosApi.class);
        String scope = "scope_example"; // String | The scope to list scenarios for.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the scenarios. Defaults to latest if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.
        Integer limit = 56; // Integer | Maximum number of results to return. Defaults to 100.
        String page = "page_example"; // String | Pagination token from a previous result to fetch the next page.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfGetScenarioResponse result = apiInstance.listScenarios(scope, asAt, filter, limit, page).execute(opts);

            PagedResourceListOfGetScenarioResponse result = apiInstance.listScenarios(scope, asAt, filter, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScenariosApi#listScenarios");
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
| **scope** | **String**| The scope to list scenarios for. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the scenarios. Defaults to latest if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. | [optional] |
| **limit** | **Integer**| Maximum number of results to return. Defaults to 100. | [optional] |
| **page** | **String**| Pagination token from a previous result to fetch the next page. | [optional] |

### Return type

[**PagedResourceListOfGetScenarioResponse**](PagedResourceListOfGetScenarioResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested scenarios |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertScenario

> UpsertSingleStructuredDataResponse upsertScenario(upsertScenarioRequest)

[EARLY ACCESS] UpsertScenario: Upsert a Scenario. This creates or updates the scenario definition in LUSID.

Update or insert one Scenario definition. An item will be updated if it already exists  and inserted if it does not.     The response will return the successfully updated or inserted scenario or failure message if unsuccessful.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ScenariosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ScenariosApiExample {

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
        // ScenariosApi apiInstance = apiFactory.build(ScenariosApi.class);

        ScenariosApi apiInstance = ApiFactoryBuilder.build(fileName).build(ScenariosApi.class);
        UpsertScenarioRequest upsertScenarioRequest = new UpsertScenarioRequest(); // UpsertScenarioRequest | The Scenario to update or insert
        try {
            // uncomment the below to set overrides at the request level
            // UpsertSingleStructuredDataResponse result = apiInstance.upsertScenario(upsertScenarioRequest).execute(opts);

            UpsertSingleStructuredDataResponse result = apiInstance.upsertScenario(upsertScenarioRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScenariosApi#upsertScenario");
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
| **upsertScenarioRequest** | [**UpsertScenarioRequest**](UpsertScenarioRequest.md)| The Scenario to update or insert | |

### Return type

[**UpsertSingleStructuredDataResponse**](UpsertSingleStructuredDataResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted item or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

