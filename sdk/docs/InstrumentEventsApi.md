# InstrumentEventsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**queryBucketedCashFlows**](InstrumentEventsApi.md#queryBucketedCashFlows) | **POST** /api/instrumentevents/$queryBucketedCashFlows | [EXPERIMENTAL] QueryBucketedCashFlows: Returns bucketed cashflows based on the holdings of the portfolios and date range specified in the query. |
| [**queryCashFlows**](InstrumentEventsApi.md#queryCashFlows) | **POST** /api/instrumentevents/$queryCashFlows | [EXPERIMENTAL] QueryCashFlows: Returns a list of cashflows based on the holdings of the portfolios and date range specified in the query. |
| [**queryInstrumentEvents**](InstrumentEventsApi.md#queryInstrumentEvents) | **POST** /api/instrumentevents/$query | [EXPERIMENTAL] QueryInstrumentEvents: Returns a list of instrument events based on the holdings of the portfolios and date range specified in the query. |
| [**queryTradeTickets**](InstrumentEventsApi.md#queryTradeTickets) | **POST** /api/instrumentevents/$queryTradeTickets | [EXPERIMENTAL] QueryTradeTickets: Returns a list of trade tickets based on the holdings of the portfolios and date range specified in the query. |


<a id="queryBucketedCashFlows"></a>
# **queryBucketedCashFlows**
> BucketedCashFlowResponse queryBucketedCashFlows().queryBucketedCashFlowsRequest(queryBucketedCashFlowsRequest).execute();

[EXPERIMENTAL] QueryBucketedCashFlows: Returns bucketed cashflows based on the holdings of the portfolios and date range specified in the query.

Returns bucketed cashflows based on the holdings of the portfolios and date range specified in the query.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentEventsApi apiInstance = new InstrumentEventsApi(defaultClient);
    QueryBucketedCashFlowsRequest queryBucketedCashFlowsRequest = new QueryBucketedCashFlowsRequest(); // QueryBucketedCashFlowsRequest | The Query Information.
    try {
      BucketedCashFlowResponse result = apiInstance.queryBucketedCashFlows()
            .queryBucketedCashFlowsRequest(queryBucketedCashFlowsRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentEventsApi#queryBucketedCashFlows");
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
| **queryBucketedCashFlowsRequest** | [**QueryBucketedCashFlowsRequest**](QueryBucketedCashFlowsRequest.md)| The Query Information. | [optional] |

### Return type

[**BucketedCashFlowResponse**](BucketedCashFlowResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query bucketed cashflows across portfolios. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="queryCashFlows"></a>
# **queryCashFlows**
> ResourceListOfInstrumentCashFlow queryCashFlows().limit(limit).page(page).queryCashFlowsRequest(queryCashFlowsRequest).execute();

[EXPERIMENTAL] QueryCashFlows: Returns a list of cashflows based on the holdings of the portfolios and date range specified in the query.

Returns a list of cashflows based on the holdings of the portfolios and date range specified in the query.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentEventsApi apiInstance = new InstrumentEventsApi(defaultClient);
    Integer limit = 1000; // Integer | Optional. When paginating, limit the number of returned results to this many. If not specified, a default  of 1000 is used.
    String page = "page_example"; // String | Optional. The pagination token to use to continue listing items from a previous call. Page values are  return from list calls, and must be supplied exactly as returned. Additionally, when specifying this  value, queryBody, and limit must not  be modified.
    QueryCashFlowsRequest queryCashFlowsRequest = new QueryCashFlowsRequest(); // QueryCashFlowsRequest | The filter parameters used to retrieve instrument events.
    try {
      ResourceListOfInstrumentCashFlow result = apiInstance.queryCashFlows()
            .limit(limit)
            .page(page)
            .queryCashFlowsRequest(queryCashFlowsRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentEventsApi#queryCashFlows");
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
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. If not specified, a default  of 1000 is used. | [optional] [default to 1000] |
| **page** | **String**| Optional. The pagination token to use to continue listing items from a previous call. Page values are  return from list calls, and must be supplied exactly as returned. Additionally, when specifying this  value, queryBody, and limit must not  be modified. | [optional] |
| **queryCashFlowsRequest** | [**QueryCashFlowsRequest**](QueryCashFlowsRequest.md)| The filter parameters used to retrieve instrument events. | [optional] |

### Return type

[**ResourceListOfInstrumentCashFlow**](ResourceListOfInstrumentCashFlow.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Instrument Events as Cashflows. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="queryInstrumentEvents"></a>
# **queryInstrumentEvents**
> ResourceListOfInstrumentEventHolder queryInstrumentEvents().limit(limit).page(page).queryInstrumentEventsRequest(queryInstrumentEventsRequest).execute();

[EXPERIMENTAL] QueryInstrumentEvents: Returns a list of instrument events based on the holdings of the portfolios and date range specified in the query.

Returns a list of instrument events based on the holdings of the portfolios and date range specified in the query.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentEventsApi apiInstance = new InstrumentEventsApi(defaultClient);
    Integer limit = 1000; // Integer | Optional. When paginating, limit the number of returned results to this many. If not specified, a default  of 1000 is used.
    String page = "page_example"; // String | Optional. The pagination token to use to continue listing items from a previous call. Page values are  return from list calls, and must be supplied exactly as returned. Additionally, when specifying this  value, queryBody, and limit must not  be modified.
    QueryInstrumentEventsRequest queryInstrumentEventsRequest = new QueryInstrumentEventsRequest(); // QueryInstrumentEventsRequest | The filter parameters used to retrieve instrument events.
    try {
      ResourceListOfInstrumentEventHolder result = apiInstance.queryInstrumentEvents()
            .limit(limit)
            .page(page)
            .queryInstrumentEventsRequest(queryInstrumentEventsRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentEventsApi#queryInstrumentEvents");
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
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. If not specified, a default  of 1000 is used. | [optional] [default to 1000] |
| **page** | **String**| Optional. The pagination token to use to continue listing items from a previous call. Page values are  return from list calls, and must be supplied exactly as returned. Additionally, when specifying this  value, queryBody, and limit must not  be modified. | [optional] |
| **queryInstrumentEventsRequest** | [**QueryInstrumentEventsRequest**](QueryInstrumentEventsRequest.md)| The filter parameters used to retrieve instrument events. | [optional] |

### Return type

[**ResourceListOfInstrumentEventHolder**](ResourceListOfInstrumentEventHolder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Instrument Events |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="queryTradeTickets"></a>
# **queryTradeTickets**
> ResourceListOfPortfolioTradeTicket queryTradeTickets().limit(limit).page(page).queryTradeTicketsRequest(queryTradeTicketsRequest).execute();

[EXPERIMENTAL] QueryTradeTickets: Returns a list of trade tickets based on the holdings of the portfolios and date range specified in the query.

Returns a list of trade tickets based on the holdings of the portfolios and date range specified in the query.    These trade tickets are derived from events that involve transition of instrument states, such as transitions  on exercise or default of an instrument. The trade tickets are to allow the new position to be created given the  existing portfolio configuration.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentEventsApi apiInstance = new InstrumentEventsApi(defaultClient);
    Integer limit = 1000; // Integer | Optional. When paginating, limit the number of returned results to this many. If not specified, a default  of 1000 is used.
    String page = "page_example"; // String | Optional. The pagination token to use to continue listing items from a previous call. Page values are  return from list calls, and must be supplied exactly as returned. Additionally, when specifying this  value, queryBody, and limit must not  be modified.
    QueryTradeTicketsRequest queryTradeTicketsRequest = new QueryTradeTicketsRequest(); // QueryTradeTicketsRequest | The filter parameters used to retrieve instrument events.
    try {
      ResourceListOfPortfolioTradeTicket result = apiInstance.queryTradeTickets()
            .limit(limit)
            .page(page)
            .queryTradeTicketsRequest(queryTradeTicketsRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentEventsApi#queryTradeTickets");
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
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. If not specified, a default  of 1000 is used. | [optional] [default to 1000] |
| **page** | **String**| Optional. The pagination token to use to continue listing items from a previous call. Page values are  return from list calls, and must be supplied exactly as returned. Additionally, when specifying this  value, queryBody, and limit must not  be modified. | [optional] |
| **queryTradeTicketsRequest** | [**QueryTradeTicketsRequest**](QueryTradeTicketsRequest.md)| The filter parameters used to retrieve instrument events. | [optional] |

### Return type

[**ResourceListOfPortfolioTradeTicket**](ResourceListOfPortfolioTradeTicket.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Instrument Events as Upsertable TradeTickets. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

