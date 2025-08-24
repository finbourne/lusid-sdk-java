# ScopesApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listEntityScopes**](ScopesApi.md#listEntityScopes) | **GET** /api/scopes/{entityType} | ListEntityScopes: List Entity Scopes |
| [**listScopes**](ScopesApi.md#listScopes) | **GET** /api/scopes | ListScopes: List Scopes |



## listEntityScopes

> ResourceListOfScopeDefinition listEntityScopes(entityType, asAt, page, limit)

ListEntityScopes: List Entity Scopes

List all the scopes for a given entity type that contain data.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ScopesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ScopesApiExample {

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
        // ScopesApi apiInstance = apiFactory.build(ScopesApi.class);

        ScopesApi apiInstance = ApiFactoryBuilder.build(fileName).build(ScopesApi.class);
        String entityType = "entityType_example"; // String | The entity type to list scopes for.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve scopes. Defaults to latest datetime if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing scopes from a previous call to list scopes.   This value is returned from the previous call. If a pagination token is provided, the limit and asAt fields   must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this number. Defaults to 100 if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfScopeDefinition result = apiInstance.listEntityScopes(entityType, asAt, page, limit).execute(opts);

            ResourceListOfScopeDefinition result = apiInstance.listEntityScopes(entityType, asAt, page, limit).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScopesApi#listEntityScopes");
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
| **entityType** | **String**| The entity type to list scopes for. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve scopes. Defaults to latest datetime if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing scopes from a previous call to list scopes.   This value is returned from the previous call. If a pagination token is provided, the limit and asAt fields   must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this number. Defaults to 100 if not specified. | [optional] |

### Return type

[**ResourceListOfScopeDefinition**](ResourceListOfScopeDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of scopes |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listScopes

> ResourceListOfScopeDefinition listScopes(filter)

ListScopes: List Scopes

List all the scopes that contain data.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ScopesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ScopesApiExample {

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
        // ScopesApi apiInstance = apiFactory.build(ScopesApi.class);

        ScopesApi apiInstance = ApiFactoryBuilder.build(fileName).build(ScopesApi.class);
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the Scope, use \"scope eq 'string'\"   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfScopeDefinition result = apiInstance.listScopes(filter).execute(opts);

            ResourceListOfScopeDefinition result = apiInstance.listScopes(filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScopesApi#listScopes");
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
| **filter** | **String**| Expression to filter the result set.   For example, to filter on the Scope, use \&quot;scope eq &#39;string&#39;\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**ResourceListOfScopeDefinition**](ResourceListOfScopeDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of scopes |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

