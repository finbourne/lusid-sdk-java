# TransferAgencyApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateOrderDates**](TransferAgencyApi.md#calculateOrderDates) | **POST** /api/transferagency/orderdates | [EXPERIMENTAL] CalculateOrderDates: Calculate the key dates associated with transfer agency orders |
| [**deleteTransferAgencyOrders**](TransferAgencyApi.md#deleteTransferAgencyOrders) | **POST** /api/transferagency/orders/$delete | [EXPERIMENTAL] DeleteTransferAgencyOrders: Delete transfer agency orders |
| [**estimateTransferAgencyOrders**](TransferAgencyApi.md#estimateTransferAgencyOrders) | **POST** /api/transferagency/orders/$estimate | [EXPERIMENTAL] EstimateTransferAgencyOrders: Estimate the values of transfer agency orders |
| [**upsertTransferAgencyOrders**](TransferAgencyApi.md#upsertTransferAgencyOrders) | **POST** /api/transferagency/orders | [EXPERIMENTAL] UpsertTransferAgencyOrders: Upsert transfer agency orders |



## calculateOrderDates

> CalculateOrderDatesResponse calculateOrderDates(requestBody)

[EXPERIMENTAL] CalculateOrderDates: Calculate the key dates associated with transfer agency orders

The response contains both the collection of successfully calculated dates and any failed calculations,  each in the form of a dictionary keyed by the request&#39;s keys.  For each failure, a reason is provided. It is important to check the failed set for unsuccessful results.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransferAgencyApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransferAgencyApiExample {

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
        // TransferAgencyApi apiInstance = apiFactory.build(TransferAgencyApi.class);

        TransferAgencyApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransferAgencyApi.class);
        Map<String, CalculateOrderDatesRequest> requestBody = new HashMap(); // Map<String, CalculateOrderDatesRequest> | The request containing the dates used for calculation
        try {
            // uncomment the below to set overrides at the request level
            // CalculateOrderDatesResponse result = apiInstance.calculateOrderDates(requestBody).execute(opts);

            CalculateOrderDatesResponse result = apiInstance.calculateOrderDates(requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransferAgencyApi#calculateOrderDates");
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
| **requestBody** | [**Map&lt;String, CalculateOrderDatesRequest&gt;**](CalculateOrderDatesRequest.md)| The request containing the dates used for calculation | |

### Return type

[**CalculateOrderDatesResponse**](CalculateOrderDatesResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully calculated dates and any failed calculations. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteTransferAgencyOrders

> DeleteTransferAgencyOrdersResponse deleteTransferAgencyOrders(requestBody)

[EXPERIMENTAL] DeleteTransferAgencyOrders: Delete transfer agency orders

Deletes each order supplied, cancelling any cash transaction(s) already booked for it. Only an order in  &#39;New&#39; or &#39;Pending&#39; can be deleted. A priced order must be un-priced first. An order with no cash transaction  booked against it is deleted successfully and reports no cancelled transactions. Transaction staging rules are not applied to these  cancellations.  The response contains both successfully deleted orders and any failures, each in the form of a  dictionary keyed by the request&#39;s keys. For each failure, a reason is provided. It is important to  check the failed set for unsuccessful results.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransferAgencyApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransferAgencyApiExample {

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
        // TransferAgencyApi apiInstance = apiFactory.build(TransferAgencyApi.class);

        TransferAgencyApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransferAgencyApi.class);
        Map<String, DeleteTransferAgencyOrderRequest> requestBody = new HashMap(); // Map<String, DeleteTransferAgencyOrderRequest> | The transfer agency orders to delete, keyed by a unique request identifier.
        try {
            // uncomment the below to set overrides at the request level
            // DeleteTransferAgencyOrdersResponse result = apiInstance.deleteTransferAgencyOrders(requestBody).execute(opts);

            DeleteTransferAgencyOrdersResponse result = apiInstance.deleteTransferAgencyOrders(requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransferAgencyApi#deleteTransferAgencyOrders");
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
| **requestBody** | [**Map&lt;String, DeleteTransferAgencyOrderRequest&gt;**](DeleteTransferAgencyOrderRequest.md)| The transfer agency orders to delete, keyed by a unique request identifier. | |

### Return type

[**DeleteTransferAgencyOrdersResponse**](DeleteTransferAgencyOrdersResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted orders and any failures. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## estimateTransferAgencyOrders

> EstimateTransferAgencyOrdersResponse estimateTransferAgencyOrders(requestBody)

[EXPERIMENTAL] EstimateTransferAgencyOrders: Estimate the values of transfer agency orders

Estimates the units and the cash each order supplied would move, from the share class&#39;s most recent price.  Nothing is written.     An order may be named by its identifier, to estimate it as it stands, or supplied whole, to estimate values  that have not been saved yet. Both forms may appear in the same request. Where an order is supplied whole,  those values are estimated in place of the saved order&#39;s.     A switch or a transfer is two orders, and each leg is estimated independently.     The price is reported in the currency the share class is quoted in, which is not necessarily the order&#39;s  currency, so it is returned alongside that currency and the rate used.     The response contains both the successful estimates and any failures, each in the form of a dictionary  keyed by the request&#39;s keys. A share class with no price available fails only its own orders. It is  important to check the failed set for unsuccessful results.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransferAgencyApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransferAgencyApiExample {

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
        // TransferAgencyApi apiInstance = apiFactory.build(TransferAgencyApi.class);

        TransferAgencyApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransferAgencyApi.class);
        Map<String, EstimateTransferAgencyOrderRequest> requestBody = new HashMap(); // Map<String, EstimateTransferAgencyOrderRequest> | The transfer agency orders to estimate, keyed by a unique request identifier.
        try {
            // uncomment the below to set overrides at the request level
            // EstimateTransferAgencyOrdersResponse result = apiInstance.estimateTransferAgencyOrders(requestBody).execute(opts);

            EstimateTransferAgencyOrdersResponse result = apiInstance.estimateTransferAgencyOrders(requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransferAgencyApi#estimateTransferAgencyOrders");
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
| **requestBody** | [**Map&lt;String, EstimateTransferAgencyOrderRequest&gt;**](EstimateTransferAgencyOrderRequest.md)| The transfer agency orders to estimate, keyed by a unique request identifier. | |

### Return type

[**EstimateTransferAgencyOrdersResponse**](EstimateTransferAgencyOrdersResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully estimated orders and any failures. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertTransferAgencyOrders

> TransferAgencyOrdersResponse upsertTransferAgencyOrders(requestBody)

[EXPERIMENTAL] UpsertTransferAgencyOrders: Upsert transfer agency orders

Creates a transaction and updates the relevant order for each order supplied.  The response contains both successfully processed orders and any failures, each in the form of a  dictionary keyed by the request&#39;s keys. For each failure, a reason is provided. It is important to  check the failed set for unsuccessful results.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransferAgencyApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransferAgencyApiExample {

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
        // TransferAgencyApi apiInstance = apiFactory.build(TransferAgencyApi.class);

        TransferAgencyApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransferAgencyApi.class);
        Map<String, UpsertTransferAgencyOrderRequest> requestBody = new HashMap(); // Map<String, UpsertTransferAgencyOrderRequest> | The transfer agency orders to upsert, keyed by a unique request identifier.
        try {
            // uncomment the below to set overrides at the request level
            // TransferAgencyOrdersResponse result = apiInstance.upsertTransferAgencyOrders(requestBody).execute(opts);

            TransferAgencyOrdersResponse result = apiInstance.upsertTransferAgencyOrders(requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransferAgencyApi#upsertTransferAgencyOrders");
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
| **requestBody** | [**Map&lt;String, UpsertTransferAgencyOrderRequest&gt;**](UpsertTransferAgencyOrderRequest.md)| The transfer agency orders to upsert, keyed by a unique request identifier. | |

### Return type

[**TransferAgencyOrdersResponse**](TransferAgencyOrdersResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully processed orders and any failures. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

