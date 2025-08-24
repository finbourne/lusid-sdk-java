# OrdersApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteOrder**](OrdersApi.md#deleteOrder) | **DELETE** /api/orders/{scope}/{code} | [EARLY ACCESS] DeleteOrder: Delete order |
| [**getOrder**](OrdersApi.md#getOrder) | **GET** /api/orders/{scope}/{code} | [EARLY ACCESS] GetOrder: Get Order |
| [**listOrders**](OrdersApi.md#listOrders) | **GET** /api/orders | ListOrders: List Orders |
| [**upsertOrders**](OrdersApi.md#upsertOrders) | **POST** /api/orders | UpsertOrders: Upsert Order |



## deleteOrder

> DeletedEntityResponse deleteOrder(scope, code)

[EARLY ACCESS] DeleteOrder: Delete order

Delete an order. Deletion will be valid from the order&#39;s creation datetime.  This means that the order will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrdersApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrdersApiExample {

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
        // OrdersApi apiInstance = apiFactory.build(OrdersApi.class);

        OrdersApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrdersApi.class);
        String scope = "scope_example"; // String | The order scope.
        String code = "code_example"; // String | The order's code. This, together with the scope uniquely identifies the order to delete.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteOrder(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteOrder(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#deleteOrder");
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
| **scope** | **String**| The order scope. | |
| **code** | **String**| The order&#39;s code. This, together with the scope uniquely identifies the order to delete. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response from deleting an order. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getOrder

> Order getOrder(scope, code, asAt, propertyKeys)

[EARLY ACCESS] GetOrder: Get Order

Fetch an Order that matches the specified identifier.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrdersApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrdersApiExample {

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
        // OrdersApi apiInstance = apiFactory.build(OrdersApi.class);

        OrdersApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrdersApi.class);
        String scope = "scope_example"; // String | The scope to which the order belongs.
        String code = "code_example"; // String | The order's unique identifier.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the order. Defaults to return the latest version of the order if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Orders\" domain to decorate onto the order.   These take the format {domain}/{scope}/{code} e.g. \"Orders/system/Name\".
        try {
            // uncomment the below to set overrides at the request level
            // Order result = apiInstance.getOrder(scope, code, asAt, propertyKeys).execute(opts);

            Order result = apiInstance.getOrder(scope, code, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#getOrder");
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
| **scope** | **String**| The scope to which the order belongs. | |
| **code** | **String**| The order&#39;s unique identifier. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the order. Defaults to return the latest version of the order if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Orders\&quot; domain to decorate onto the order.   These take the format {domain}/{scope}/{code} e.g. \&quot;Orders/system/Name\&quot;. | [optional] |

### Return type

[**Order**](Order.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The order matching the given identifier. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listOrders

> PagedResourceListOfOrder listOrders(asAt, page, sortBy, limit, filter, propertyKeys, dataModelScope, dataModelCode, membershipType)

ListOrders: List Orders

Fetch the last pre-AsAt date version of each order with optional filtering (does not fetch the entire history).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrdersApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrdersApiExample {

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
        // OrdersApi apiInstance = apiFactory.build(OrdersApi.class);

        OrdersApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrdersApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the order. Defaults to return the latest version of the order if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing orders from a previous call to list orders.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Orders\" domain to decorate onto each order.   These take the format {domain}/{scope}/{code} e.g. \"Orders/system/Name\".   All properties, except derived properties, are returned by default, without specifying here.
        String dataModelScope = "dataModelScope_example"; // String | The optional scope of a Custom Data Model to use
        String dataModelCode = "dataModelCode_example"; // String | The optional code of a Custom Data Model to use
        String membershipType = "membershipType_example"; // String | The membership types of the specified Custom Data Model to return. Allowable values are Member, Candidate and All. Defaults to Member.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfOrder result = apiInstance.listOrders(asAt, page, sortBy, limit, filter, propertyKeys, dataModelScope, dataModelCode, membershipType).execute(opts);

            PagedResourceListOfOrder result = apiInstance.listOrders(asAt, page, sortBy, limit, filter, propertyKeys, dataModelScope, dataModelCode, membershipType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#listOrders");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the order. Defaults to return the latest version of the order if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing orders from a previous call to list orders.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Orders\&quot; domain to decorate onto each order.   These take the format {domain}/{scope}/{code} e.g. \&quot;Orders/system/Name\&quot;.   All properties, except derived properties, are returned by default, without specifying here. | [optional] |
| **dataModelScope** | **String**| The optional scope of a Custom Data Model to use | [optional] |
| **dataModelCode** | **String**| The optional code of a Custom Data Model to use | [optional] |
| **membershipType** | **String**| The membership types of the specified Custom Data Model to return. Allowable values are Member, Candidate and All. Defaults to Member. | [optional] |

### Return type

[**PagedResourceListOfOrder**](PagedResourceListOfOrder.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Orders. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertOrders

> ResourceListOfOrder upsertOrders(orderSetRequest, dataModelScope, dataModelCode)

UpsertOrders: Upsert Order

Upsert; update existing orders with given ids, or create new orders otherwise.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.OrdersApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OrdersApiExample {

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
        // OrdersApi apiInstance = apiFactory.build(OrdersApi.class);

        OrdersApi apiInstance = ApiFactoryBuilder.build(fileName).build(OrdersApi.class);
        OrderSetRequest orderSetRequest = new OrderSetRequest(); // OrderSetRequest | The collection of order requests.
        String dataModelScope = "dataModelScope_example"; // String | The optional scope of a Custom Data Model to use
        String dataModelCode = "dataModelCode_example"; // String | The optional code of a Custom Data Model to use
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfOrder result = apiInstance.upsertOrders(orderSetRequest, dataModelScope, dataModelCode).execute(opts);

            ResourceListOfOrder result = apiInstance.upsertOrders(orderSetRequest, dataModelScope, dataModelCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#upsertOrders");
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
| **orderSetRequest** | [**OrderSetRequest**](OrderSetRequest.md)| The collection of order requests. | |
| **dataModelScope** | **String**| The optional scope of a Custom Data Model to use | [optional] |
| **dataModelCode** | **String**| The optional code of a Custom Data Model to use | [optional] |

### Return type

[**ResourceListOfOrder**](ResourceListOfOrder.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A collection of orders. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

