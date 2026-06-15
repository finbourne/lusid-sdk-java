# SettlementActivityApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**querySettlementActivity**](SettlementActivityApi.md#querySettlementActivity) | **POST** /api/settlementactivities/$query | [EARLY ACCESS] QuerySettlementActivity: Query Settlement Activity |



## querySettlementActivity

> ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery querySettlementActivity(settlementActivityQuery)

[EARLY ACCESS] QuerySettlementActivity: Query Settlement Activity

Queries settlement activity (Expected and Settled) for the specified portfolios and/or portfolio groups.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SettlementActivityApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SettlementActivityApiExample {

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
        // SettlementActivityApi apiInstance = apiFactory.build(SettlementActivityApi.class);

        SettlementActivityApi apiInstance = ApiFactoryBuilder.build(fileName).build(SettlementActivityApi.class);
        SettlementActivityQuery settlementActivityQuery = new SettlementActivityQuery(); // SettlementActivityQuery | The query parameters controlling which settlement activity is returned.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery result = apiInstance.querySettlementActivity(settlementActivityQuery).execute(opts);

            ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery result = apiInstance.querySettlementActivity(settlementActivityQuery).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SettlementActivityApi#querySettlementActivity");
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
| **settlementActivityQuery** | [**SettlementActivityQuery**](SettlementActivityQuery.md)| The query parameters controlling which settlement activity is returned. | |

### Return type

[**ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery**](ResourceListWithPostBodiesOfSettlementActivityToSettlementActivityQuery.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested settlement activity for the specified portfolios and portfolio groups |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

