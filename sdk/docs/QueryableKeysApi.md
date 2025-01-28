# QueryableKeysApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllQueryableKeys**](QueryableKeysApi.md#getAllQueryableKeys) | **GET** /api/queryablekeys | [EARLY ACCESS] GetAllQueryableKeys: Query the set of supported \&quot;addresses\&quot; that can be queried from all endpoints. |



## getAllQueryableKeys

> ResourceListOfQueryableKey getAllQueryableKeys(asAt, filter)

[EARLY ACCESS] GetAllQueryableKeys: Query the set of supported \&quot;addresses\&quot; that can be queried from all endpoints.

When a request is made, the user needs to know what keys can be passed to it for queryable data. This endpoint provides all supported keys,

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.QueryableKeysApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class QueryableKeysApiExample {

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
        // QueryableKeysApi apiInstance = apiFactory.build(QueryableKeysApi.class);

        QueryableKeysApi apiInstance = ApiFactoryBuilder.build(fileName).build(QueryableKeysApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | For user defined DerivedValuation keys.
        String filter = "filter_example"; // String | Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfQueryableKey result = apiInstance.getAllQueryableKeys(asAt, filter).execute(opts);

            ResourceListOfQueryableKey result = apiInstance.getAllQueryableKeys(asAt, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling QueryableKeysApi#getAllQueryableKeys");
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
| **asAt** | **OffsetDateTime**| For user defined DerivedValuation keys. | [optional] |
| **filter** | **String**| Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**ResourceListOfQueryableKey**](ResourceListOfQueryableKey.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

