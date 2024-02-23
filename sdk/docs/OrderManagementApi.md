# OrderManagementApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bookTransactions**](OrderManagementApi.md#bookTransactions) | **POST** /api/ordermanagement/booktransactions | [EXPERIMENTAL] BookTransactions: Books transactions using specific allocations as a source. |
| [**createOrders**](OrderManagementApi.md#createOrders) | **POST** /api/ordermanagement/createorders | [EARLY ACCESS] CreateOrders: Upsert a Block and associated orders |
| [**placeBlocks**](OrderManagementApi.md#placeBlocks) | **POST** /api/ordermanagement/placeblocks | [EARLY ACCESS] PlaceBlocks: Places blocks for a given list of placement requests. |
| [**runAllocationService**](OrderManagementApi.md#runAllocationService) | **POST** /api/ordermanagement/allocate | [EXPERIMENTAL] RunAllocationService: Runs the Allocation Service |


<a id="bookTransactions"></a>
# **bookTransactions**
> BookTransactionsResponse bookTransactions(bookTransactionsRequest).applyFeesAndCommission(applyFeesAndCommission).execute();

[EXPERIMENTAL] BookTransactions: Books transactions using specific allocations as a source.

Takes a collection of allocation IDs, and maps fields from those allocations and related orders onto new transactions.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.OrderManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderManagementApi apiInstance = new OrderManagementApi(defaultClient);
    BookTransactionsRequest bookTransactionsRequest = new BookTransactionsRequest(); // BookTransactionsRequest | The allocations to create transactions for
    Boolean applyFeesAndCommission = true; // Boolean | Whether to apply fees and commissions to transactions (default: true)
    try {
      BookTransactionsResponse result = apiInstance.bookTransactions(bookTransactionsRequest)
            .applyFeesAndCommission(applyFeesAndCommission)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderManagementApi#bookTransactions");
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
| **bookTransactionsRequest** | [**BookTransactionsRequest**](BookTransactionsRequest.md)| The allocations to create transactions for | |
| **applyFeesAndCommission** | **Boolean**| Whether to apply fees and commissions to transactions (default: true) | [optional] [default to true] |

### Return type

[**BookTransactionsResponse**](BookTransactionsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The results from booking transactions from allocations |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="createOrders"></a>
# **createOrders**
> ResourceListOfBlockAndOrders createOrders(blockAndOrdersCreateRequest).execute();

[EARLY ACCESS] CreateOrders: Upsert a Block and associated orders

Upsert a Block and create associated orders.  This will fail if the block exists and already references orders with differing fields to the upsert request.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.OrderManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderManagementApi apiInstance = new OrderManagementApi(defaultClient);
    BlockAndOrdersCreateRequest blockAndOrdersCreateRequest = new BlockAndOrdersCreateRequest(); // BlockAndOrdersCreateRequest | The collection of block and orders requests.
    try {
      ResourceListOfBlockAndOrders result = apiInstance.createOrders(blockAndOrdersCreateRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderManagementApi#createOrders");
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
| **blockAndOrdersCreateRequest** | [**BlockAndOrdersCreateRequest**](BlockAndOrdersCreateRequest.md)| The collection of block and orders requests. | |

### Return type

[**ResourceListOfBlockAndOrders**](ResourceListOfBlockAndOrders.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A collection of block and associated orders. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="placeBlocks"></a>
# **placeBlocks**
> ResourceListOfPlacement placeBlocks().placeBlocksRequest(placeBlocksRequest).execute();

[EARLY ACCESS] PlaceBlocks: Places blocks for a given list of placement requests.

The referenced block&#39;s existence will be verified.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.OrderManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderManagementApi apiInstance = new OrderManagementApi(defaultClient);
    PlaceBlocksRequest placeBlocksRequest = new PlaceBlocksRequest(); // PlaceBlocksRequest | The request containing the blocks to the placed.
    try {
      ResourceListOfPlacement result = apiInstance.placeBlocks()
            .placeBlocksRequest(placeBlocksRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderManagementApi#placeBlocks");
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
| **placeBlocksRequest** | [**PlaceBlocksRequest**](PlaceBlocksRequest.md)| The request containing the blocks to the placed. | [optional] |

### Return type

[**ResourceListOfPlacement**](ResourceListOfPlacement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The block placements. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="runAllocationService"></a>
# **runAllocationService**
> AllocationServiceRunResponse runAllocationService(resourceId).allocationAlgorithm(allocationAlgorithm).execute();

[EXPERIMENTAL] RunAllocationService: Runs the Allocation Service

This will allocate executions for a given list of placements back to their originating orders.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.OrderManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrderManagementApi apiInstance = new OrderManagementApi(defaultClient);
    List<ResourceId> resourceId = Arrays.asList(); // List<ResourceId> | The List of Placement IDs for which you wish to allocate executions.
    String allocationAlgorithm = "allocationAlgorithm_example"; // String | A string representation of the allocation algorithm you would like to use to allocate shares from executions e.g. \"PR-FIFO\".  This defaults to \"PR-FIFO\".
    try {
      AllocationServiceRunResponse result = apiInstance.runAllocationService(resourceId)
            .allocationAlgorithm(allocationAlgorithm)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderManagementApi#runAllocationService");
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
| **resourceId** | [**List&lt;ResourceId&gt;**](ResourceId.md)| The List of Placement IDs for which you wish to allocate executions. | |
| **allocationAlgorithm** | **String**| A string representation of the allocation algorithm you would like to use to allocate shares from executions e.g. \&quot;PR-FIFO\&quot;.  This defaults to \&quot;PR-FIFO\&quot;. | [optional] |

### Return type

[**AllocationServiceRunResponse**](AllocationServiceRunResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The results from a run of the Allocation Service |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

