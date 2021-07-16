# OrdersApi

All URIs are relative to *http://local-unit-test-server.lusid.com:62268*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrder**](OrdersApi.md#deleteOrder) | **DELETE** /api/orders/{scope}/{code} | [EARLY ACCESS] Delete order
[**getOrder**](OrdersApi.md#getOrder) | **GET** /api/orders/{scope}/{code} | [EARLY ACCESS] Get Order
[**listOrders**](OrdersApi.md#listOrders) | **GET** /api/orders | [EARLY ACCESS] List Orders
[**upsertOrders**](OrdersApi.md#upsertOrders) | **POST** /api/orders | [EARLY ACCESS] Upsert Order


<a name="deleteOrder"></a>
# **deleteOrder**
> DeletedEntityResponse deleteOrder(scope, code)

[EARLY ACCESS] Delete order

Delete an order. Deletion will be valid from the order&#39;s creation datetime.  This means that the order will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:62268");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String scope = "scope_example"; // String | The order scope.
    String code = "code_example"; // String | The order's code. This, together with the scope uniquely identifies the order to delete.
    try {
      DeletedEntityResponse result = apiInstance.deleteOrder(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#deleteOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The order scope. |
 **code** | **String**| The order&#39;s code. This, together with the scope uniquely identifies the order to delete. |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The response from deleting an order. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getOrder"></a>
# **getOrder**
> Order getOrder(scope, code, asAt, propertyKeys)

[EARLY ACCESS] Get Order

Fetch an Order that matches the specified identifier

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:62268");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String scope = "scope_example"; // String | The scope to which the order belongs.
    String code = "code_example"; // String | The order's unique identifier.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the order. Defaults to return the latest version of the order if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Orders\" domain to decorate onto the order.              These take the format {domain}/{scope}/{code} e.g. \"Orders/system/Name\".
    try {
      Order result = apiInstance.getOrder(scope, code, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope to which the order belongs. |
 **code** | **String**| The order&#39;s unique identifier. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the order. Defaults to return the latest version of the order if not specified. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Orders\&quot; domain to decorate onto the order.              These take the format {domain}/{scope}/{code} e.g. \&quot;Orders/system/Name\&quot;. | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The order matching the given identifier. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listOrders"></a>
# **listOrders**
> PagedResourceListOfOrder listOrders(asAt, page, sortBy, start, limit, filter, propertyKeys)

[EARLY ACCESS] List Orders

Fetch the last pre-AsAt date version of each order in scope (does not fetch the entire history).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:62268");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the order. Defaults to return the latest version of the order if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing orders from a previous call to list orders.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided.
    List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    String filter = "\"\""; // String | Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Orders\" domain to decorate onto each order.                  These take the format {domain}/{scope}/{code} e.g. \"Orders/system/Name\".
    try {
      PagedResourceListOfOrder result = apiInstance.listOrders(asAt, page, sortBy, start, limit, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#listOrders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the order. Defaults to return the latest version of the order if not specified. | [optional]
 **page** | **String**| The pagination token to use to continue listing orders from a previous call to list orders.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. | [optional]
 **start** | **Integer**| When paginating, skip this number of results. | [optional]
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid. | [optional] [default to &quot;&quot;]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Orders\&quot; domain to decorate onto each order.                  These take the format {domain}/{scope}/{code} e.g. \&quot;Orders/system/Name\&quot;. | [optional]

### Return type

[**PagedResourceListOfOrder**](PagedResourceListOfOrder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Orders in scope. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertOrders"></a>
# **upsertOrders**
> ResourceListOfOrder upsertOrders(orderSetRequest)

[EARLY ACCESS] Upsert Order

Upsert; update existing orders with given ids, or create new orders otherwise.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:62268");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    OrderSetRequest orderSetRequest = {"orderRequests":[{"properties":{"order/MyScope/SomeOrderProperty":{"key":"Order/MyScope/SomeOrderProperty","value":{"labelValue":"XYZ000034567"}}},"instrumentIdentifiers":{"instrument/default/Currency":"GBP"},"quantity":100,"side":"Buy","orderBookId":{"scope":"MyScope","code":"UKEQ Orders"},"portfolioId":{"scope":"MyScope","code":"UK Equity"},"id":{"scope":"MyScope","code":"ORD00000123"},"state":"New","type":"Limit","timeInForce":"GoodTilCancel","date":"2023-05-02T00:00:00.0000000+00:00","price":{"amount":534,"currency":"USD"},"orderInstruction":{"scope":"MyScope","code":"Instruction-06"},"package":{"scope":"MyScope","code":"UKEQ Package"}}]}; // OrderSetRequest | The collection of order requests.
    try {
      ResourceListOfOrder result = apiInstance.upsertOrders(orderSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#upsertOrders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderSetRequest** | [**OrderSetRequest**](OrderSetRequest.md)| The collection of order requests. | [optional]

### Return type

[**ResourceListOfOrder**](ResourceListOfOrder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A collection of orders. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

