# OrderManagementApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bookTransactions**](OrderManagementApi.md#bookTransactions) | **POST** /api/ordermanagement/booktransactions | BookTransactions: Books transactions using specific allocations as a source. |
| [**cancelOrders**](OrderManagementApi.md#cancelOrders) | **POST** /api/ordermanagement/cancelorders | [EARLY ACCESS] CancelOrders: Cancel existing orders |
| [**cancelOrdersAndMoveRemaining**](OrderManagementApi.md#cancelOrdersAndMoveRemaining) | **POST** /api/ordermanagement/cancelordersandmoveremaining | [EARLY ACCESS] CancelOrdersAndMoveRemaining: Cancel existing orders and move any unplaced quantities to new orders in new blocks |
| [**cancelPlacements**](OrderManagementApi.md#cancelPlacements) | **POST** /api/ordermanagement/$cancelplacements | [EARLY ACCESS] CancelPlacements: Cancel existing placements |
| [**createOrders**](OrderManagementApi.md#createOrders) | **POST** /api/ordermanagement/createorders | CreateOrders: Upsert a Block and associated orders |
| [**getOrderHistory**](OrderManagementApi.md#getOrderHistory) | **GET** /api/ordermanagement/order/{scope}/{code}/$history | GetOrderHistory: Get the history of an order and related entity changes |
| [**moveOrders**](OrderManagementApi.md#moveOrders) | **POST** /api/ordermanagement/moveorders | [EARLY ACCESS] MoveOrders: Move orders to new or existing block |
| [**placeBlocks**](OrderManagementApi.md#placeBlocks) | **POST** /api/ordermanagement/placeblocks | [EARLY ACCESS] PlaceBlocks: Places blocks for a given list of placement requests. |
| [**runAllocationService**](OrderManagementApi.md#runAllocationService) | **POST** /api/ordermanagement/allocate | RunAllocationService: Runs the Allocation Service |
| [**sweepBlocks**](OrderManagementApi.md#sweepBlocks) | **POST** /api/ordermanagement/SweepBlocks | [EXPERIMENTAL] SweepBlocks: Sweeps specified blocks, for each block that meets the requirements. The request may be partially successful. |
| [**updateOrders**](OrderManagementApi.md#updateOrders) | **POST** /api/ordermanagement/updateorders | [EARLY ACCESS] UpdateOrders: Update existing orders |
| [**updatePlacements**](OrderManagementApi.md#updatePlacements) | **POST** /api/ordermanagement/$updateplacements | [EARLY ACCESS] UpdatePlacements: Update existing placements |



## bookTransactions

> BookTransactionsResponse bookTransactions(bookTransactionsRequest, applyFeesAndCommission, markOrdersAndAllocationsAsBooked)

BookTransactions: Books transactions using specific allocations as a source.

Takes a collection of allocation IDs, and maps fields from those allocations and related orders onto new transactions.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderManagementApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderManagementApiExample {

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
        // OrderManagementApi apiInstance = apiFactory.build(OrderManagementApi.class);

        OrderManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderManagementApi.class);
        BookTransactionsRequest bookTransactionsRequest = new BookTransactionsRequest(); // BookTransactionsRequest | The allocations to create transactions for
        Boolean applyFeesAndCommission = true; // Boolean | Whether to apply fees and commissions to transactions (default: true)
        Boolean markOrdersAndAllocationsAsBooked = false; // Boolean | Whether to mark allocations and fully-booked orders with state Booked
        try {
            // uncomment the below to set overrides at the request level
            // BookTransactionsResponse result = apiInstance.bookTransactions(bookTransactionsRequest, applyFeesAndCommission, markOrdersAndAllocationsAsBooked).execute(opts);

            BookTransactionsResponse result = apiInstance.bookTransactions(bookTransactionsRequest, applyFeesAndCommission, markOrdersAndAllocationsAsBooked).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderManagementApi#bookTransactions");
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
| **bookTransactionsRequest** | [**BookTransactionsRequest**](BookTransactionsRequest.md)| The allocations to create transactions for | |
| **applyFeesAndCommission** | **Boolean**| Whether to apply fees and commissions to transactions (default: true) | [optional] [default to true] |
| **markOrdersAndAllocationsAsBooked** | **Boolean**| Whether to mark allocations and fully-booked orders with state Booked | [optional] [default to false] |

### Return type

[**BookTransactionsResponse**](BookTransactionsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The results from booking transactions from allocations |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## cancelOrders

> CancelOrdersResponse cancelOrders(requestBody)

[EARLY ACCESS] CancelOrders: Cancel existing orders

The response returns both the collection of successfully canceled orders, as well as those  that failed. For each failure, a reason is provided. It is important to check the failed set for  unsuccessful results.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderManagementApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderManagementApiExample {

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
        // OrderManagementApi apiInstance = apiFactory.build(OrderManagementApi.class);

        OrderManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderManagementApi.class);
        Map<String, ResourceId> requestBody = new HashMap(); // Map<String, ResourceId> | The request containing the ids of the orders to be cancelled.
        try {
            // uncomment the below to set overrides at the request level
            // CancelOrdersResponse result = apiInstance.cancelOrders(requestBody).execute(opts);

            CancelOrdersResponse result = apiInstance.cancelOrders(requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderManagementApi#cancelOrders");
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
| **requestBody** | [**Map&lt;String, ResourceId&gt;**](ResourceId.md)| The request containing the ids of the orders to be cancelled. | |

### Return type

[**CancelOrdersResponse**](CancelOrdersResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully cancelled orders along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## cancelOrdersAndMoveRemaining

> CancelOrdersAndMoveRemainingResponse cancelOrdersAndMoveRemaining(requestBody)

[EARLY ACCESS] CancelOrdersAndMoveRemaining: Cancel existing orders and move any unplaced quantities to new orders in new blocks

Cancels existing orders, reducing their quantities to those aleady placed. Any remaining quantities are moved  to new orders in new blocks. The placed quantities are distributed to the cancelled orders on a pro-rata basis.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderManagementApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderManagementApiExample {

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
        // OrderManagementApi apiInstance = apiFactory.build(OrderManagementApi.class);

        OrderManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderManagementApi.class);
        Map<String, CancelOrdersAndMoveRemainingRequest> requestBody = new HashMap(); // Map<String, CancelOrdersAndMoveRemainingRequest> | The request containing the orders to be cancelled, and the destinations of remaining quantities.
        try {
            // uncomment the below to set overrides at the request level
            // CancelOrdersAndMoveRemainingResponse result = apiInstance.cancelOrdersAndMoveRemaining(requestBody).execute(opts);

            CancelOrdersAndMoveRemainingResponse result = apiInstance.cancelOrdersAndMoveRemaining(requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderManagementApi#cancelOrdersAndMoveRemaining");
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
| **requestBody** | [**Map&lt;String, CancelOrdersAndMoveRemainingRequest&gt;**](CancelOrdersAndMoveRemainingRequest.md)| The request containing the orders to be cancelled, and the destinations of remaining quantities. | |

### Return type

[**CancelOrdersAndMoveRemainingResponse**](CancelOrdersAndMoveRemainingResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully cancelled and moved orders, along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## cancelPlacements

> CancelPlacementsResponse cancelPlacements(requestBody)

[EARLY ACCESS] CancelPlacements: Cancel existing placements

The response returns both the collection of successfully canceled placements, as well as those  that failed. For each failure, a reason is provided. It is important to check the failed set for  unsuccessful results.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderManagementApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderManagementApiExample {

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
        // OrderManagementApi apiInstance = apiFactory.build(OrderManagementApi.class);

        OrderManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderManagementApi.class);
        Map<String, ResourceId> requestBody = new HashMap(); // Map<String, ResourceId> | The request containing the ids of the placements to be cancelled.
        try {
            // uncomment the below to set overrides at the request level
            // CancelPlacementsResponse result = apiInstance.cancelPlacements(requestBody).execute(opts);

            CancelPlacementsResponse result = apiInstance.cancelPlacements(requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderManagementApi#cancelPlacements");
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
| **requestBody** | [**Map&lt;String, ResourceId&gt;**](ResourceId.md)| The request containing the ids of the placements to be cancelled. | |

### Return type

[**CancelPlacementsResponse**](CancelPlacementsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully cancelled placements along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createOrders

> ResourceListOfBlockAndOrders createOrders(blockAndOrdersCreateRequest)

CreateOrders: Upsert a Block and associated orders

Create orders, and blocks if they don&#39;t already exist.  This will fail if the block exists and already references orders with differing blocking fields.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderManagementApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderManagementApiExample {

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
        // OrderManagementApi apiInstance = apiFactory.build(OrderManagementApi.class);

        OrderManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderManagementApi.class);
        BlockAndOrdersCreateRequest blockAndOrdersCreateRequest = new BlockAndOrdersCreateRequest(); // BlockAndOrdersCreateRequest | The collection of block and orders requests.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfBlockAndOrders result = apiInstance.createOrders(blockAndOrdersCreateRequest).execute(opts);

            ResourceListOfBlockAndOrders result = apiInstance.createOrders(blockAndOrdersCreateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderManagementApi#createOrders");
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
| **blockAndOrdersCreateRequest** | [**BlockAndOrdersCreateRequest**](BlockAndOrdersCreateRequest.md)| The collection of block and orders requests. | |

### Return type

[**ResourceListOfBlockAndOrders**](ResourceListOfBlockAndOrders.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A collection of block and associated orders. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getOrderHistory

> ResourceListOfChangeIntervalWithOrderManagementDetail getOrderHistory(scope, code, asAt)

GetOrderHistory: Get the history of an order and related entity changes

Get the changes that have happened to an order and related entities.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderManagementApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderManagementApiExample {

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
        // OrderManagementApi apiInstance = apiFactory.build(OrderManagementApi.class);

        OrderManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderManagementApi.class);
        String scope = "scope_example"; // String | The scope of the order.
        String code = "code_example"; // String | The code of the order.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the history of the order and related entities. Defaults   to return the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfChangeIntervalWithOrderManagementDetail result = apiInstance.getOrderHistory(scope, code, asAt).execute(opts);

            ResourceListOfChangeIntervalWithOrderManagementDetail result = apiInstance.getOrderHistory(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderManagementApi#getOrderHistory");
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
| **scope** | **String**| The scope of the order. | |
| **code** | **String**| The code of the order. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the history of the order and related entities. Defaults   to return the latest version if not specified. | [optional] |

### Return type

[**ResourceListOfChangeIntervalWithOrderManagementDetail**](ResourceListOfChangeIntervalWithOrderManagementDetail.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The history of the specified order and related entities (changes that have been made to it). |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Order not found. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## moveOrders

> ResourceListOfMovedOrderToDifferentBlockResponse moveOrders(moveOrdersToDifferentBlocksRequest)

[EARLY ACCESS] MoveOrders: Move orders to new or existing block

Move an order to a block, creating the block if it does not already exist.   This will fail if the block exists and already references orders with differing fields to the upsert request.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderManagementApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderManagementApiExample {

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
        // OrderManagementApi apiInstance = apiFactory.build(OrderManagementApi.class);

        OrderManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderManagementApi.class);
        MoveOrdersToDifferentBlocksRequest moveOrdersToDifferentBlocksRequest = new MoveOrdersToDifferentBlocksRequest(); // MoveOrdersToDifferentBlocksRequest | The collection of order and destination block ids.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfMovedOrderToDifferentBlockResponse result = apiInstance.moveOrders(moveOrdersToDifferentBlocksRequest).execute(opts);

            ResourceListOfMovedOrderToDifferentBlockResponse result = apiInstance.moveOrders(moveOrdersToDifferentBlocksRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderManagementApi#moveOrders");
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
| **moveOrdersToDifferentBlocksRequest** | [**MoveOrdersToDifferentBlocksRequest**](MoveOrdersToDifferentBlocksRequest.md)| The collection of order and destination block ids. | |

### Return type

[**ResourceListOfMovedOrderToDifferentBlockResponse**](ResourceListOfMovedOrderToDifferentBlockResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A collection of block and order pairs for each order moved into a block, and the Id of the order&#39;s previous block (if any). |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## placeBlocks

> ResourceListOfPlacement placeBlocks(placeBlocksRequest)

[EARLY ACCESS] PlaceBlocks: Places blocks for a given list of placement requests.

The referenced block&#39;s existence will be verified.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderManagementApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderManagementApiExample {

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
        // OrderManagementApi apiInstance = apiFactory.build(OrderManagementApi.class);

        OrderManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderManagementApi.class);
        PlaceBlocksRequest placeBlocksRequest = new PlaceBlocksRequest(); // PlaceBlocksRequest | The request containing the blocks to the placed.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfPlacement result = apiInstance.placeBlocks(placeBlocksRequest).execute(opts);

            ResourceListOfPlacement result = apiInstance.placeBlocks(placeBlocksRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderManagementApi#placeBlocks");
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
| **placeBlocksRequest** | [**PlaceBlocksRequest**](PlaceBlocksRequest.md)| The request containing the blocks to the placed. | [optional] |

### Return type

[**ResourceListOfPlacement**](ResourceListOfPlacement.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The block placements. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## runAllocationService

> AllocationServiceRunResponse runAllocationService(resourceId, allocationAlgorithm)

RunAllocationService: Runs the Allocation Service

Allocates Executions for a given list of placements back to their originating orders using one of the LUSID algorithms, creating Allocations to record the results.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderManagementApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderManagementApiExample {

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
        // OrderManagementApi apiInstance = apiFactory.build(OrderManagementApi.class);

        OrderManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderManagementApi.class);
        List<ResourceId> resourceId = Arrays.asList(); // List<ResourceId> | The List of Placement IDs for which you wish to allocate Executions.
        String allocationAlgorithm = "allocationAlgorithm_example"; // String | A string representation of the allocation algorithm you would like to use to allocate shares from executions e.g. \"PR-FIFO\".  This defaults to \"PR-FIFO\".
        try {
            // uncomment the below to set overrides at the request level
            // AllocationServiceRunResponse result = apiInstance.runAllocationService(resourceId, allocationAlgorithm).execute(opts);

            AllocationServiceRunResponse result = apiInstance.runAllocationService(resourceId, allocationAlgorithm).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderManagementApi#runAllocationService");
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
| **resourceId** | [**List&lt;ResourceId&gt;**](ResourceId.md)| The List of Placement IDs for which you wish to allocate Executions. | |
| **allocationAlgorithm** | **String**| A string representation of the allocation algorithm you would like to use to allocate shares from executions e.g. \&quot;PR-FIFO\&quot;.  This defaults to \&quot;PR-FIFO\&quot;. | [optional] |

### Return type

[**AllocationServiceRunResponse**](AllocationServiceRunResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Allocations |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## sweepBlocks

> SweepBlocksResponse sweepBlocks(sweepBlocksRequest)

[EXPERIMENTAL] SweepBlocks: Sweeps specified blocks, for each block that meets the requirements. The request may be partially successful.

The requirements are:  &lt;list type&#x3D;\&quot;bullet\&quot;&gt;&lt;term&gt;The block exists.&lt;/term&gt;&lt;term&gt;All orders have state \&quot;Closed\&quot;, \&quot;Cancelled\&quot;, \&quot;Canceled\&quot; or \&quot;Booked\&quot;.&lt;/term&gt;&lt;term&gt;All placements have state \&quot;Allocated\&quot; or \&quot;Over-allocated\&quot;.&lt;/term&gt;&lt;term&gt;All allocations have state \&quot;Closed\&quot;, \&quot;Cancelled\&quot;, \&quot;Canceled\&quot; or \&quot;Booked\&quot;.&lt;/term&gt;&lt;term&gt;No execution or allocation has been modified since the passed LatestAllowableModificationTime.&lt;/term&gt;&lt;/list&gt;

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderManagementApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderManagementApiExample {

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
        // OrderManagementApi apiInstance = apiFactory.build(OrderManagementApi.class);

        OrderManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderManagementApi.class);
        SweepBlocksRequest sweepBlocksRequest = new SweepBlocksRequest(); // SweepBlocksRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // SweepBlocksResponse result = apiInstance.sweepBlocks(sweepBlocksRequest).execute(opts);

            SweepBlocksResponse result = apiInstance.sweepBlocks(sweepBlocksRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderManagementApi#sweepBlocks");
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
| **sweepBlocksRequest** | [**SweepBlocksRequest**](SweepBlocksRequest.md)|  | |

### Return type

[**SweepBlocksResponse**](SweepBlocksResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The results from sweeping blocks. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateOrders

> UpdateOrdersResponse updateOrders(requestBody)

[EARLY ACCESS] UpdateOrders: Update existing orders

The response returns both the collection of successfully updated orders, as well as those  that failed. For each failure, a reason is provided. It is important to check the failed set for  unsuccessful results.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderManagementApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderManagementApiExample {

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
        // OrderManagementApi apiInstance = apiFactory.build(OrderManagementApi.class);

        OrderManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderManagementApi.class);
        Map<String, OrderUpdateRequest> requestBody = new HashMap(); // Map<String, OrderUpdateRequest> | The request containing the orders to be updated.
        try {
            // uncomment the below to set overrides at the request level
            // UpdateOrdersResponse result = apiInstance.updateOrders(requestBody).execute(opts);

            UpdateOrdersResponse result = apiInstance.updateOrders(requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderManagementApi#updateOrders");
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
| **requestBody** | [**Map&lt;String, OrderUpdateRequest&gt;**](OrderUpdateRequest.md)| The request containing the orders to be updated. | |

### Return type

[**UpdateOrdersResponse**](UpdateOrdersResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated orders along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updatePlacements

> UpdatePlacementsResponse updatePlacements(requestBody)

[EARLY ACCESS] UpdatePlacements: Update existing placements

The response returns both the collection of successfully updated placements, as well as those  that failed. For each failure, a reason is provided. It is important to check the failed set for  unsuccessful results.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrderManagementApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrderManagementApiExample {

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
        // OrderManagementApi apiInstance = apiFactory.build(OrderManagementApi.class);

        OrderManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrderManagementApi.class);
        Map<String, PlacementUpdateRequest> requestBody = new HashMap(); // Map<String, PlacementUpdateRequest> | The request containing the placements to be updated.
        try {
            // uncomment the below to set overrides at the request level
            // UpdatePlacementsResponse result = apiInstance.updatePlacements(requestBody).execute(opts);

            UpdatePlacementsResponse result = apiInstance.updatePlacements(requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderManagementApi#updatePlacements");
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
| **requestBody** | [**Map&lt;String, PlacementUpdateRequest&gt;**](PlacementUpdateRequest.md)| The request containing the placements to be updated. | |

### Return type

[**UpdatePlacementsResponse**](UpdatePlacementsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated placements along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

