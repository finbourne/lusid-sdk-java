# TransferAgencyApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateOrderDates**](TransferAgencyApi.md#calculateOrderDates) | **POST** /api/transferagency/orderdates | [EXPERIMENTAL] CalculateOrderDates: Calculate the key dates associated with transfer agency orders |
| [**cancelTransferAgencyTransactions**](TransferAgencyApi.md#cancelTransferAgencyTransactions) | **POST** /api/transferagency/transactions/cancel | [EXPERIMENTAL] CancelTransferAgencyTransactions: Cancel transfer agency transactions, un-pricing their orders |
| [**deleteTransferAgencyOrders**](TransferAgencyApi.md#deleteTransferAgencyOrders) | **POST** /api/transferagency/orders/$delete | [EXPERIMENTAL] DeleteTransferAgencyOrders: Delete transfer agency orders |
| [**estimateTransferAgencyOrders**](TransferAgencyApi.md#estimateTransferAgencyOrders) | **POST** /api/transferagency/orders/$estimate | [EXPERIMENTAL] EstimateTransferAgencyOrders: Estimate the values of transfer agency orders |
| [**upsertExternalTransferAgencyOrders**](TransferAgencyApi.md#upsertExternalTransferAgencyOrders) | **POST** /api/transferagency/orders/$external | [EARLY ACCESS] UpsertExternalTransferAgencyOrders: Load transfer agency orders sent by an external transfer agent |
| [**upsertTransferAgencyOrders**](TransferAgencyApi.md#upsertTransferAgencyOrders) | **POST** /api/transferagency/orders | [EXPERIMENTAL] UpsertTransferAgencyOrders: Upsert transfer agency orders |
| [**upsertTransferAgencyTransactionsFromOrders**](TransferAgencyApi.md#upsertTransferAgencyTransactionsFromOrders) | **POST** /api/transferagency/transactions/$fromOrders | [EXPERIMENTAL] UpsertTransferAgencyTransactionsFromOrders: Upsert transfer agency transactions from transfer agency orders |



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


## cancelTransferAgencyTransactions

> CancelTransferAgencyTransactionsResponse cancelTransferAgencyTransactions(requestBody, successMode)

[EXPERIMENTAL] CancelTransferAgencyTransactions: Cancel transfer agency transactions, un-pricing their orders

Reverses the pricing of a transfer agency order, identified by the security transaction that pricing booked:  cancels that transaction in the investor&#39;s portfolio, amends the paired cash transaction back to its  pre-pricing amount, and moves the order from &#39;Priced&#39; back to &#39;New&#39;. Both changes are bitemporal, so the  priced state is still visible at an earlier as-at.  A transaction that was never booked, that names no order, that is the cash leg rather than the security leg,  or whose order is not in &#39;Priced&#39; fails on its own. A leg already cancelled outside this flow is left alone and  the order is still returned to &#39;New&#39;. A transaction named under two request keys fails the whole request.  The response contains both successfully un-priced orders and any failures, each in the form of a  dictionary keyed by the request&#39;s keys. For each failure, a reason is provided. It is important to  check the failed set for unsuccessful results.

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
        Map<String, CancelTransferAgencyTransactionRequest> requestBody = new HashMap(); // Map<String, CancelTransferAgencyTransactionRequest> | The security transactions to cancel, keyed by a unique request identifier.
        String successMode = "Partial"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial
        try {
            // uncomment the below to set overrides at the request level
            // CancelTransferAgencyTransactionsResponse result = apiInstance.cancelTransferAgencyTransactions(requestBody, successMode).execute(opts);

            CancelTransferAgencyTransactionsResponse result = apiInstance.cancelTransferAgencyTransactions(requestBody, successMode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransferAgencyApi#cancelTransferAgencyTransactions");
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
| **requestBody** | [**Map&lt;String, CancelTransferAgencyTransactionRequest&gt;**](CancelTransferAgencyTransactionRequest.md)| The security transactions to cancel, keyed by a unique request identifier. | |
| **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial | [optional] [default to Partial] |

### Return type

[**CancelTransferAgencyTransactionsResponse**](CancelTransferAgencyTransactionsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully un-priced orders and any failures. |  -  |
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


## upsertExternalTransferAgencyOrders

> UpsertExternalTransferAgencyOrdersResponse upsertExternalTransferAgencyOrders(requestBody)

[EARLY ACCESS] UpsertExternalTransferAgencyOrders: Load transfer agency orders sent by an external transfer agent

Loads the orders a third-party transfer agent dealt for a fund at a dealing point. Each request key names one  set: a fund, a dealing point, the sending source and the orders it dealt, each keyed by the source&#39;s own  line id. The orders are written in the fund&#39;s scope with the code  &#x60;{fundCode}-{source}-{yyyyMMddHHmmss}-{lineId}&#x60;, the dealing point written in UTC to the second, in the  External order state, priced at the dealing point, so the fund&#39;s External dealing source reads them at that  valuation point. A line whose code would exceed 64 characters is refused.     A set replaces what the same source sent before: every External order of that source for the fund&#39;s share  classes at the dealing point that the set does not restate is deleted, and the response names them. Two  sets in one request naming the same fund, source and dealing point are refused after the first.     The fund must list External among its dealing estimate sources. Each line must name a share class of the  fund and exactly one of a positive number of units or a positive amount in a valid currency. A set sent  after its dealing point is loaded and flagged late; one sent exactly at the dealing point is on time.  Whether the set is complete is recorded on each order and is not yet enforced at pricing.     Each order carries the properties &#x60;Order/TA/PriceDate&#x60; (date), &#x60;Order/TA/DealingSource&#x60; (string),  &#x60;Order/TA/DealingSourceReference&#x60; (string), &#x60;Order/TA/Complete&#x60; (string, &#x60;True&#x60; or &#x60;False&#x60;),  &#x60;Order/TA/Late&#x60; (string, &#x60;True&#x60; or &#x60;False&#x60;) and &#x60;Order/TA/SentAt&#x60; (date). LUSID does not create these  property definitions: define them in the domain, with those data types, before loading, as for the other  transfer agency order properties. A domain missing any of them fails the request with a property-not-defined  error and nothing is written.     Sets are validated independently: a set that fails validation is reported under failures and the others  still load. The sets that pass are then written together in one command, so a reader never sees half a  dealing point, and a refusal at write time fails the whole request and leaves the book as it was. A request  carries at most 200 sets and at most 2000 lines across all of them.

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
        Map<String, UpsertExternalTransferAgencyOrdersRequest> requestBody = new HashMap(); // Map<String, UpsertExternalTransferAgencyOrdersRequest> | The sets to load, keyed by a correlation key of the caller's choosing.
        try {
            // uncomment the below to set overrides at the request level
            // UpsertExternalTransferAgencyOrdersResponse result = apiInstance.upsertExternalTransferAgencyOrders(requestBody).execute(opts);

            UpsertExternalTransferAgencyOrdersResponse result = apiInstance.upsertExternalTransferAgencyOrders(requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransferAgencyApi#upsertExternalTransferAgencyOrders");
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
| **requestBody** | [**Map&lt;String, UpsertExternalTransferAgencyOrdersRequest&gt;**](UpsertExternalTransferAgencyOrdersRequest.md)| The sets to load, keyed by a correlation key of the caller&#39;s choosing. | |

### Return type

[**UpsertExternalTransferAgencyOrdersResponse**](UpsertExternalTransferAgencyOrdersResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The sets loaded and any that failed, keyed by the request key. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertTransferAgencyOrders

> TransferAgencyOrdersResponse upsertTransferAgencyOrders(requestBody)

[EXPERIMENTAL] UpsertTransferAgencyOrders: Upsert transfer agency orders

Creates a cash transaction and updates the relevant order for each order supplied. An order must be in  &#39;Pending&#39; or &#39;New&#39;. An order that already has a cash transaction has that transaction amended  to the order&#39;s current amount rather than a second one created.  The response contains both successfully processed orders and any failures, each in the form of a  dictionary keyed by the request&#39;s keys. For each failure, a reason is provided. It is important to  check the failed set for unsuccessful results.

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


## upsertTransferAgencyTransactionsFromOrders

> UpsertTransferAgencyTransactionsFromOrdersResponse upsertTransferAgencyTransactionsFromOrders(requestBody, successMode)

[EXPERIMENTAL] UpsertTransferAgencyTransactionsFromOrders: Upsert transfer agency transactions from transfer agency orders

This endpoint derives transactions from existing transfer agency orders. It does not upsert  caller-supplied ones.  Prices each order supplied, booking the security transaction into the investor&#39;s portfolio, amending the  paired cash transaction to the final settlement amount, and moving the order to &#39;Priced&#39;. Only an order in  &#39;New&#39; can be priced, and the supplied price date must match the price date calculated when the order was  created.  The response contains both successfully priced orders and any failures, each in the form of a  dictionary keyed by the request&#39;s keys. For each failure, a reason is provided. It is important to  check the failed set for unsuccessful results.

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
        Map<String, UpsertTransferAgencyTransactionFromOrderRequest> requestBody = new HashMap(); // Map<String, UpsertTransferAgencyTransactionFromOrderRequest> | The transfer agency orders to price, keyed by a unique request identifier.
        String successMode = "Partial"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial
        try {
            // uncomment the below to set overrides at the request level
            // UpsertTransferAgencyTransactionsFromOrdersResponse result = apiInstance.upsertTransferAgencyTransactionsFromOrders(requestBody, successMode).execute(opts);

            UpsertTransferAgencyTransactionsFromOrdersResponse result = apiInstance.upsertTransferAgencyTransactionsFromOrders(requestBody, successMode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransferAgencyApi#upsertTransferAgencyTransactionsFromOrders");
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
| **requestBody** | [**Map&lt;String, UpsertTransferAgencyTransactionFromOrderRequest&gt;**](UpsertTransferAgencyTransactionFromOrderRequest.md)| The transfer agency orders to price, keyed by a unique request identifier. | |
| **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial | [optional] [default to Partial] |

### Return type

[**UpsertTransferAgencyTransactionsFromOrdersResponse**](UpsertTransferAgencyTransactionsFromOrdersResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully priced orders and any failures. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

