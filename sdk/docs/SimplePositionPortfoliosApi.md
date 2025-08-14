# SimplePositionPortfoliosApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSimplePositionPortfolio**](SimplePositionPortfoliosApi.md#createSimplePositionPortfolio) | **POST** /api/simpleposition/{scope} | [EARLY ACCESS] CreateSimplePositionPortfolio: Create simple position portfolio |



## createSimplePositionPortfolio

> Portfolio createSimplePositionPortfolio(scope, createSimplePositionPortfolioRequest)

[EARLY ACCESS] CreateSimplePositionPortfolio: Create simple position portfolio

Create a simple position portfolio in a particular scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SimplePositionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SimplePositionPortfoliosApiExample {

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
        // SimplePositionPortfoliosApi apiInstance = apiFactory.build(SimplePositionPortfoliosApi.class);

        SimplePositionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(SimplePositionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope in which to create the simple position portfolio.
        CreateSimplePositionPortfolioRequest createSimplePositionPortfolioRequest = new CreateSimplePositionPortfolioRequest(); // CreateSimplePositionPortfolioRequest | The definition of the simple position portfolio.
        try {
            // uncomment the below to set overrides at the request level
            // Portfolio result = apiInstance.createSimplePositionPortfolio(scope, createSimplePositionPortfolioRequest).execute(opts);

            Portfolio result = apiInstance.createSimplePositionPortfolio(scope, createSimplePositionPortfolioRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SimplePositionPortfoliosApi#createSimplePositionPortfolio");
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
| **scope** | **String**| The scope in which to create the simple position portfolio. | |
| **createSimplePositionPortfolioRequest** | [**CreateSimplePositionPortfolioRequest**](CreateSimplePositionPortfolioRequest.md)| The definition of the simple position portfolio. | |

### Return type

[**Portfolio**](Portfolio.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created simple position portfolio, with populated id |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

