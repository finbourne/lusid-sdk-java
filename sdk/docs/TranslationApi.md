# TranslationApi

All URIs are relative to *https://example.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**translateInstrumentDefinitions**](TranslationApi.md#translateInstrumentDefinitions) | **POST** /api/translation/instrumentdefinitions | [EXPERIMENTAL] TranslateInstrumentDefinitions: Translate instruments |
| [**translateTradeTickets**](TranslationApi.md#translateTradeTickets) | **POST** /api/translation/tradetickets | [EXPERIMENTAL] TranslateTradeTickets: Translate trade ticket |


<a id="translateInstrumentDefinitions"></a>
# **translateInstrumentDefinitions**
> TranslateInstrumentDefinitionsResponse translateInstrumentDefinitions(translateInstrumentDefinitionsRequest)

[EXPERIMENTAL] TranslateInstrumentDefinitions: Translate instruments

Translates one or more instruments into the given target dialect.                In the request each instrument definition should be keyed by a unique correlation id. This id is ephemeral  and is not stored by LUSID. It serves only as a way to easily identify each instrument in the response.                Any instrument that is not already in the LUSID dialect should be given as an ExoticInstrument.                The response will return both the collection of successfully translated instruments in the target dialect,  as well as those that failed.  For the failures a reason will be provided explaining why the instrument could not be updated or inserted.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    TranslateInstrumentDefinitionsRequest translateInstrumentDefinitionsRequest = new TranslateInstrumentDefinitionsRequest(); // TranslateInstrumentDefinitionsRequest | The definitions of the instruments to translate along with the target dialect.
    try {
      TranslateInstrumentDefinitionsResponse result = apiInstance.translateInstrumentDefinitions(translateInstrumentDefinitionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#translateInstrumentDefinitions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
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

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully translated instruments along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="translateTradeTickets"></a>
# **translateTradeTickets**
> TranslateTradeTicketsResponse translateTradeTickets(translateTradeTicketRequest)

[EXPERIMENTAL] TranslateTradeTickets: Translate trade ticket

Translates one or more trade tickets into the given target dialect.                In the request each trade ticket definition should be keyed by a unique correlation id. This id is ephemeral  and is not stored by LUSID. It serves only as a way to easily identify each trade ticket in the response.                The response will return both the collection of successfully translated trade tickets in the target dialect,  as well as those that failed.  For the failures a reason will be provided explaining why the trade ticket could not be updated or inserted.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TranslationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TranslationApi apiInstance = new TranslationApi(defaultClient);
    TranslateTradeTicketRequest translateTradeTicketRequest = new TranslateTradeTicketRequest(); // TranslateTradeTicketRequest | The definitions of the trade ticket to translate along with the target dialect.
    try {
      TranslateTradeTicketsResponse result = apiInstance.translateTradeTickets(translateTradeTicketRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#translateTradeTickets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
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

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully translated trade ticket along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

