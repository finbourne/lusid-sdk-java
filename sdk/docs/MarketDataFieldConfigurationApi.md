# MarketDataFieldConfigurationApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMarketDataFieldConfiguration**](MarketDataFieldConfigurationApi.md#getMarketDataFieldConfiguration) | **GET** /api/marketdata/fieldconfiguration/{marketDataCategory} | [EARLY ACCESS] GetMarketDataFieldConfiguration: Get a Market Data Field Configuration |
| [**updateMarketDataFieldConfiguration**](MarketDataFieldConfigurationApi.md#updateMarketDataFieldConfiguration) | **POST** /api/marketdata/fieldconfiguration/{marketDataCategory}/$update | [EARLY ACCESS] UpdateMarketDataFieldConfiguration: Update a Market Data Field Configuration |



## getMarketDataFieldConfiguration

> MarketDataFieldConfiguration getMarketDataFieldConfiguration(marketDataCategory, asAt)

[EARLY ACCESS] GetMarketDataFieldConfiguration: Get a Market Data Field Configuration

Retrieve the market data field configuration for a given market data category.  If the configuration does not yet exist, an empty configuration will be returned.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.MarketDataFieldConfigurationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MarketDataFieldConfigurationApiExample {

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
        // MarketDataFieldConfigurationApi apiInstance = apiFactory.build(MarketDataFieldConfigurationApi.class);

        MarketDataFieldConfigurationApi apiInstance = ApiFactoryBuilder.build(fileName).build(MarketDataFieldConfigurationApi.class);
        String marketDataCategory = "marketDataCategory_example"; // String | The market data category.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the configuration. Defaults to return the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // MarketDataFieldConfiguration result = apiInstance.getMarketDataFieldConfiguration(marketDataCategory, asAt).execute(opts);

            MarketDataFieldConfiguration result = apiInstance.getMarketDataFieldConfiguration(marketDataCategory, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataFieldConfigurationApi#getMarketDataFieldConfiguration");
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
| **marketDataCategory** | **String**| The market data category. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the configuration. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**MarketDataFieldConfiguration**](MarketDataFieldConfiguration.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested market data field configuration. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateMarketDataFieldConfiguration

> MarketDataFieldConfiguration updateMarketDataFieldConfiguration(marketDataCategory, updateMarketDataFieldConfigurationRequest)

[EARLY ACCESS] UpdateMarketDataFieldConfiguration: Update a Market Data Field Configuration

Update the metadata field schema for a market data field configuration.  Allows adding, updating, and removing metadata field definitions.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.MarketDataFieldConfigurationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MarketDataFieldConfigurationApiExample {

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
        // MarketDataFieldConfigurationApi apiInstance = apiFactory.build(MarketDataFieldConfigurationApi.class);

        MarketDataFieldConfigurationApi apiInstance = ApiFactoryBuilder.build(fileName).build(MarketDataFieldConfigurationApi.class);
        String marketDataCategory = "marketDataCategory_example"; // String | The market data category.
        UpdateMarketDataFieldConfigurationRequest updateMarketDataFieldConfigurationRequest = new UpdateMarketDataFieldConfigurationRequest(); // UpdateMarketDataFieldConfigurationRequest | The metadata fields to add, update, or remove.
        try {
            // uncomment the below to set overrides at the request level
            // MarketDataFieldConfiguration result = apiInstance.updateMarketDataFieldConfiguration(marketDataCategory, updateMarketDataFieldConfigurationRequest).execute(opts);

            MarketDataFieldConfiguration result = apiInstance.updateMarketDataFieldConfiguration(marketDataCategory, updateMarketDataFieldConfigurationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketDataFieldConfigurationApi#updateMarketDataFieldConfiguration");
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
| **marketDataCategory** | **String**| The market data category. | |
| **updateMarketDataFieldConfigurationRequest** | [**UpdateMarketDataFieldConfigurationRequest**](UpdateMarketDataFieldConfigurationRequest.md)| The metadata fields to add, update, or remove. | |

### Return type

[**MarketDataFieldConfiguration**](MarketDataFieldConfiguration.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated market data field configuration. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

