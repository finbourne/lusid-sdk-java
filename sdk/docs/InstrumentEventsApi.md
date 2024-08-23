# InstrumentEventsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**queryApplicableInstrumentEvents**](InstrumentEventsApi.md#queryApplicableInstrumentEvents) | **POST** /api/instrumentevents/$queryApplicableInstrumentEvents | [EXPERIMENTAL] QueryApplicableInstrumentEvents: Returns a list of applicable instrument events based on the holdings of the portfolios and date range specified in the query. |
| [**queryBucketedCashFlows**](InstrumentEventsApi.md#queryBucketedCashFlows) | **POST** /api/instrumentevents/$queryBucketedCashFlows | QueryBucketedCashFlows: Returns bucketed cashflows based on the holdings of the portfolios and date range specified in the query. |
| [**queryCashFlows**](InstrumentEventsApi.md#queryCashFlows) | **POST** /api/instrumentevents/$queryCashFlows | [EXPERIMENTAL] QueryCashFlows: Returns a list of cashflows based on the holdings of the portfolios and date range specified in the query. |
| [**queryInstrumentEvents**](InstrumentEventsApi.md#queryInstrumentEvents) | **POST** /api/instrumentevents/$query | [EXPERIMENTAL] QueryInstrumentEvents: Returns a list of instrument events based on the holdings of the portfolios and date range specified in the query. |
| [**queryTradeTickets**](InstrumentEventsApi.md#queryTradeTickets) | **POST** /api/instrumentevents/$queryTradeTickets | [EXPERIMENTAL] QueryTradeTickets: Returns a list of trade tickets based on the holdings of the portfolios and date range specified in the query. |



## queryApplicableInstrumentEvents

> ResourceListOfApplicableInstrumentEvent queryApplicableInstrumentEvents(asAt, limit, page, queryApplicableInstrumentEventsRequest)

[EXPERIMENTAL] QueryApplicableInstrumentEvents: Returns a list of applicable instrument events based on the holdings of the portfolios and date range specified in the query.

Returns a list of applicable instrument events based on the holdings of the portfolios and date range specified in the query.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InstrumentEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InstrumentEventsApiExample {

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
        // InstrumentEventsApi apiInstance = apiFactory.build(InstrumentEventsApi.class);

        InstrumentEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(InstrumentEventsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The as at time to use.
        Integer limit = 100; // Integer | Optional. When paginating, limit the number of returned results to this many. If not specified, a default  of 100 is used.
        String page = "page_example"; // String | Optional. The pagination token to use to continue listing items from a previous call. Page values are  return from list calls, and must be supplied exactly as returned. Additionally, when specifying this
        QueryApplicableInstrumentEventsRequest queryApplicableInstrumentEventsRequest = new QueryApplicableInstrumentEventsRequest(); // QueryApplicableInstrumentEventsRequest | The filter parameters used to retrieve applicable instrument events.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfApplicableInstrumentEvent result = apiInstance.queryApplicableInstrumentEvents(asAt, limit, page, queryApplicableInstrumentEventsRequest).execute(opts);

            ResourceListOfApplicableInstrumentEvent result = apiInstance.queryApplicableInstrumentEvents(asAt, limit, page, queryApplicableInstrumentEventsRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentEventsApi#queryApplicableInstrumentEvents");
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
| **asAt** | **OffsetDateTime**| The as at time to use. | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. If not specified, a default  of 100 is used. | [optional] [default to 100] |
| **page** | **String**| Optional. The pagination token to use to continue listing items from a previous call. Page values are  return from list calls, and must be supplied exactly as returned. Additionally, when specifying this | [optional] |
| **queryApplicableInstrumentEventsRequest** | [**QueryApplicableInstrumentEventsRequest**](QueryApplicableInstrumentEventsRequest.md)| The filter parameters used to retrieve applicable instrument events. | [optional] |

### Return type

[**ResourceListOfApplicableInstrumentEvent**](ResourceListOfApplicableInstrumentEvent.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Applicable Instrument Events |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## queryBucketedCashFlows

> BucketedCashFlowResponse queryBucketedCashFlows(queryBucketedCashFlowsRequest)

QueryBucketedCashFlows: Returns bucketed cashflows based on the holdings of the portfolios and date range specified in the query.

Returns bucketed cashflows based on the holdings of the portfolios and date range specified in the query.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InstrumentEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InstrumentEventsApiExample {

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
        // InstrumentEventsApi apiInstance = apiFactory.build(InstrumentEventsApi.class);

        InstrumentEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(InstrumentEventsApi.class);
        QueryBucketedCashFlowsRequest queryBucketedCashFlowsRequest = new QueryBucketedCashFlowsRequest(); // QueryBucketedCashFlowsRequest | The Query Information.
        try {
            // uncomment the below to set overrides at the request level
            // BucketedCashFlowResponse result = apiInstance.queryBucketedCashFlows(queryBucketedCashFlowsRequest).execute(opts);

            BucketedCashFlowResponse result = apiInstance.queryBucketedCashFlows(queryBucketedCashFlowsRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentEventsApi#queryBucketedCashFlows");
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
| **queryBucketedCashFlowsRequest** | [**QueryBucketedCashFlowsRequest**](QueryBucketedCashFlowsRequest.md)| The Query Information. | [optional] |

### Return type

[**BucketedCashFlowResponse**](BucketedCashFlowResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query bucketed cashflows across portfolios. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## queryCashFlows

> ResourceListOfInstrumentCashFlow queryCashFlows(limit, page, queryCashFlowsRequest)

[EXPERIMENTAL] QueryCashFlows: Returns a list of cashflows based on the holdings of the portfolios and date range specified in the query.

Returns a list of cashflows based on the holdings of the portfolios and date range specified in the query.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InstrumentEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InstrumentEventsApiExample {

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
        // InstrumentEventsApi apiInstance = apiFactory.build(InstrumentEventsApi.class);

        InstrumentEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(InstrumentEventsApi.class);
        Integer limit = 1000; // Integer | Optional. When paginating, limit the number of returned results to this many. If not specified, a default  of 1000 is used.
        String page = "page_example"; // String | Optional. The pagination token to use to continue listing items from a previous call. Page values are  return from list calls, and must be supplied exactly as returned. Additionally, when specifying this  value, queryBody, and limit must not  be modified.
        QueryCashFlowsRequest queryCashFlowsRequest = new QueryCashFlowsRequest(); // QueryCashFlowsRequest | The filter parameters used to retrieve instrument events.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfInstrumentCashFlow result = apiInstance.queryCashFlows(limit, page, queryCashFlowsRequest).execute(opts);

            ResourceListOfInstrumentCashFlow result = apiInstance.queryCashFlows(limit, page, queryCashFlowsRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentEventsApi#queryCashFlows");
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
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. If not specified, a default  of 1000 is used. | [optional] [default to 1000] |
| **page** | **String**| Optional. The pagination token to use to continue listing items from a previous call. Page values are  return from list calls, and must be supplied exactly as returned. Additionally, when specifying this  value, queryBody, and limit must not  be modified. | [optional] |
| **queryCashFlowsRequest** | [**QueryCashFlowsRequest**](QueryCashFlowsRequest.md)| The filter parameters used to retrieve instrument events. | [optional] |

### Return type

[**ResourceListOfInstrumentCashFlow**](ResourceListOfInstrumentCashFlow.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Instrument Events as Cashflows. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## queryInstrumentEvents

> ResourceListOfInstrumentEventHolder queryInstrumentEvents(limit, page, queryInstrumentEventsRequest)

[EXPERIMENTAL] QueryInstrumentEvents: Returns a list of instrument events based on the holdings of the portfolios and date range specified in the query.

Returns a list of instrument events based on the holdings of the portfolios and date range specified in the query.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InstrumentEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InstrumentEventsApiExample {

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
        // InstrumentEventsApi apiInstance = apiFactory.build(InstrumentEventsApi.class);

        InstrumentEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(InstrumentEventsApi.class);
        Integer limit = 1000; // Integer | Optional. When paginating, limit the number of returned results to this many. If not specified, a default  of 1000 is used.
        String page = "page_example"; // String | Optional. The pagination token to use to continue listing items from a previous call. Page values are  return from list calls, and must be supplied exactly as returned. Additionally, when specifying this  value, queryBody, and limit must not  be modified.
        QueryInstrumentEventsRequest queryInstrumentEventsRequest = new QueryInstrumentEventsRequest(); // QueryInstrumentEventsRequest | The filter parameters used to retrieve instrument events.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfInstrumentEventHolder result = apiInstance.queryInstrumentEvents(limit, page, queryInstrumentEventsRequest).execute(opts);

            ResourceListOfInstrumentEventHolder result = apiInstance.queryInstrumentEvents(limit, page, queryInstrumentEventsRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentEventsApi#queryInstrumentEvents");
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
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. If not specified, a default  of 1000 is used. | [optional] [default to 1000] |
| **page** | **String**| Optional. The pagination token to use to continue listing items from a previous call. Page values are  return from list calls, and must be supplied exactly as returned. Additionally, when specifying this  value, queryBody, and limit must not  be modified. | [optional] |
| **queryInstrumentEventsRequest** | [**QueryInstrumentEventsRequest**](QueryInstrumentEventsRequest.md)| The filter parameters used to retrieve instrument events. | [optional] |

### Return type

[**ResourceListOfInstrumentEventHolder**](ResourceListOfInstrumentEventHolder.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Instrument Events |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## queryTradeTickets

> ResourceListOfPortfolioTradeTicket queryTradeTickets(limit, page, queryTradeTicketsRequest)

[EXPERIMENTAL] QueryTradeTickets: Returns a list of trade tickets based on the holdings of the portfolios and date range specified in the query.

Returns a list of trade tickets based on the holdings of the portfolios and date range specified in the query.    These trade tickets are derived from events that involve transition of instrument states, such as transitions  on exercise or default of an instrument. The trade tickets are to allow the new position to be created given the  existing portfolio configuration.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InstrumentEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InstrumentEventsApiExample {

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
        // InstrumentEventsApi apiInstance = apiFactory.build(InstrumentEventsApi.class);

        InstrumentEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(InstrumentEventsApi.class);
        Integer limit = 1000; // Integer | Optional. When paginating, limit the number of returned results to this many. If not specified, a default  of 1000 is used.
        String page = "page_example"; // String | Optional. The pagination token to use to continue listing items from a previous call. Page values are  return from list calls, and must be supplied exactly as returned. Additionally, when specifying this  value, queryBody, and limit must not  be modified.
        QueryTradeTicketsRequest queryTradeTicketsRequest = new QueryTradeTicketsRequest(); // QueryTradeTicketsRequest | The filter parameters used to retrieve instrument events.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfPortfolioTradeTicket result = apiInstance.queryTradeTickets(limit, page, queryTradeTicketsRequest).execute(opts);

            ResourceListOfPortfolioTradeTicket result = apiInstance.queryTradeTickets(limit, page, queryTradeTicketsRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentEventsApi#queryTradeTickets");
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
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. If not specified, a default  of 1000 is used. | [optional] [default to 1000] |
| **page** | **String**| Optional. The pagination token to use to continue listing items from a previous call. Page values are  return from list calls, and must be supplied exactly as returned. Additionally, when specifying this  value, queryBody, and limit must not  be modified. | [optional] |
| **queryTradeTicketsRequest** | [**QueryTradeTicketsRequest**](QueryTradeTicketsRequest.md)| The filter parameters used to retrieve instrument events. | [optional] |

### Return type

[**ResourceListOfPortfolioTradeTicket**](ResourceListOfPortfolioTradeTicket.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Instrument Events as Upsertable TradeTickets. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

