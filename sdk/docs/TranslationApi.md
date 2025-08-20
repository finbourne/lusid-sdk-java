# TranslationApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**translateInstrumentDefinitions**](TranslationApi.md#translateInstrumentDefinitions) | **POST** /api/translation/instrumentdefinitions | [EXPERIMENTAL] TranslateInstrumentDefinitions: Translate instruments |
| [**translateTradeTickets**](TranslationApi.md#translateTradeTickets) | **POST** /api/translation/tradetickets | [EXPERIMENTAL] TranslateTradeTickets: Translate trade ticket |



## translateInstrumentDefinitions

> TranslateInstrumentDefinitionsResponse translateInstrumentDefinitions(translateInstrumentDefinitionsRequest)

[EXPERIMENTAL] TranslateInstrumentDefinitions: Translate instruments

Translates one or more instruments into the given target dialect.   In the request each instrument definition should be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID. It serves only as a way to easily identify each instrument in the response.   Any instrument that is not already in the LUSID dialect should be given as an ExoticInstrument.   The response will return both the collection of successfully translated instruments in the target dialect, as well as those that failed. For the failures a reason will be provided explaining why the instrument could not be updated or inserted.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TranslationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TranslationApiExample {

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
        // TranslationApi apiInstance = apiFactory.build(TranslationApi.class);

        TranslationApi apiInstance = ApiFactoryBuilder.build(fileName).build(TranslationApi.class);
        TranslateInstrumentDefinitionsRequest translateInstrumentDefinitionsRequest = new TranslateInstrumentDefinitionsRequest(); // TranslateInstrumentDefinitionsRequest | The definitions of the instruments to translate along with the target dialect.
        try {
            // uncomment the below to set overrides at the request level
            // TranslateInstrumentDefinitionsResponse result = apiInstance.translateInstrumentDefinitions(translateInstrumentDefinitionsRequest).execute(opts);

            TranslateInstrumentDefinitionsResponse result = apiInstance.translateInstrumentDefinitions(translateInstrumentDefinitionsRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TranslationApi#translateInstrumentDefinitions");
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
| **translateInstrumentDefinitionsRequest** | [**TranslateInstrumentDefinitionsRequest**](TranslateInstrumentDefinitionsRequest.md)| The definitions of the instruments to translate along with the target dialect. | |

### Return type

[**TranslateInstrumentDefinitionsResponse**](TranslateInstrumentDefinitionsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully translated instruments along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## translateTradeTickets

> TranslateTradeTicketsResponse translateTradeTickets(translateTradeTicketRequest)

[EXPERIMENTAL] TranslateTradeTickets: Translate trade ticket

Translates one or more trade tickets into the given target dialect.   In the request each trade ticket definition should be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID. It serves only as a way to easily identify each trade ticket in the response.   The response will return both the collection of successfully translated trade tickets in the target dialect, as well as those that failed. For the failures a reason will be provided explaining why the trade ticket could not be updated or inserted.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TranslationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TranslationApiExample {

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
        // TranslationApi apiInstance = apiFactory.build(TranslationApi.class);

        TranslationApi apiInstance = ApiFactoryBuilder.build(fileName).build(TranslationApi.class);
        TranslateTradeTicketRequest translateTradeTicketRequest = new TranslateTradeTicketRequest(); // TranslateTradeTicketRequest | The definitions of the trade ticket to translate along with the target dialect.
        try {
            // uncomment the below to set overrides at the request level
            // TranslateTradeTicketsResponse result = apiInstance.translateTradeTickets(translateTradeTicketRequest).execute(opts);

            TranslateTradeTicketsResponse result = apiInstance.translateTradeTickets(translateTradeTicketRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TranslationApi#translateTradeTickets");
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
| **translateTradeTicketRequest** | [**TranslateTradeTicketRequest**](TranslateTradeTicketRequest.md)| The definitions of the trade ticket to translate along with the target dialect. | |

### Return type

[**TranslateTradeTicketsResponse**](TranslateTradeTicketsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully translated trade ticket along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

