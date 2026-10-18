# CollateralApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptMarginCall**](CollateralApi.md#acceptMarginCall) | **POST** /api/collateral/margincalls/{runId}/{agreementScope}/{agreementCode}/{item}/{marginType}/{direction}/$accept | [EXPERIMENTAL] AcceptMarginCall: Accept a margin call. |
| [**batchAcceptMarginCalls**](CollateralApi.md#batchAcceptMarginCalls) | **POST** /api/collateral/margincalls/$batchAccept | [EXPERIMENTAL] BatchAcceptMarginCalls: Accept several margin calls. |
| [**disputeMarginCall**](CollateralApi.md#disputeMarginCall) | **POST** /api/collateral/margincalls/{runId}/{agreementScope}/{agreementCode}/{item}/{marginType}/{direction}/$dispute | [EXPERIMENTAL] DisputeMarginCall: Dispute a margin call. |
| [**getMarginCall**](CollateralApi.md#getMarginCall) | **GET** /api/collateral/margincalls/{runId}/{agreementScope}/{agreementCode}/{item}/{marginType}/{direction} | [EXPERIMENTAL] GetMarginCall: Get a margin call. |
| [**getMarginRun**](CollateralApi.md#getMarginRun) | **GET** /api/collateral/runs/{runId} | [EXPERIMENTAL] GetMarginRun: Get a margin run. |
| [**listMarginCallLines**](CollateralApi.md#listMarginCallLines) | **GET** /api/collateral/margincalls/{runId}/{agreementScope}/{agreementCode}/{item}/{marginType}/{direction}/lines | [EXPERIMENTAL] ListMarginCallLines: List the margin lines of a call. |
| [**listMarginCalls**](CollateralApi.md#listMarginCalls) | **GET** /api/collateral/margincalls | [EXPERIMENTAL] ListMarginCalls: List margin calls. |
| [**listMarginLines**](CollateralApi.md#listMarginLines) | **GET** /api/collateral/runs/{runId}/lines | [EXPERIMENTAL] ListMarginLines: List the margin lines of a run. |
| [**listMarginRuns**](CollateralApi.md#listMarginRuns) | **GET** /api/collateral/runs | [EXPERIMENTAL] ListMarginRuns: List margin runs. |
| [**recordCounterpartyDemand**](CollateralApi.md#recordCounterpartyDemand) | **POST** /api/collateral/margincalls/{runId}/{agreementScope}/{agreementCode}/{item}/{marginType}/{direction}/$recordCounterpartyDemand | [EXPERIMENTAL] RecordCounterpartyDemand: Record the counterparty&#39;s demand against a margin call. |
| [**retryMarginRun**](CollateralApi.md#retryMarginRun) | **POST** /api/collateral/runs/{runId}/$retry | [EXPERIMENTAL] RetryMarginRun: Retry a margin run. |
| [**runMarginCalculation**](CollateralApi.md#runMarginCalculation) | **POST** /api/collateral/$run | [EXPERIMENTAL] RunMarginCalculation: Run the margin calculation. |



## acceptMarginCall

> MarginCall acceptMarginCall(runId, agreementScope, agreementCode, item, marginType, direction, acceptMarginCallRequest)

[EXPERIMENTAL] AcceptMarginCall: Accept a margin call.

Accept a margin call at the agreed amount: our figure when matched, the counterparty&#39;s when within tolerance, or  the amount given, which is required when the demand breaks tolerance or has not been recorded. Allowed from the  calculated and disputed states.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralApiExample {

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
        // CollateralApi apiInstance = apiFactory.build(CollateralApi.class);

        CollateralApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralApi.class);
        String runId = "runId_example"; // String | The identifier of the margin run.
        String agreementScope = "agreementScope_example"; // String | The scope of the call's collateral agreement.
        String agreementCode = "agreementCode_example"; // String | The code of the call's collateral agreement.
        String item = "item_example"; // String | The margin item of the call.
        String marginType = "marginType_example"; // String | The margin type of the call. Currently VariationMargin.
        String direction = "direction_example"; // String | Who posts under the call. One of WePost, TheyPost or None.
        AcceptMarginCallRequest acceptMarginCallRequest = new AcceptMarginCallRequest(); // AcceptMarginCallRequest | The amount to accept, when the default does not apply.
        try {
            // uncomment the below to set overrides at the request level
            // MarginCall result = apiInstance.acceptMarginCall(runId, agreementScope, agreementCode, item, marginType, direction, acceptMarginCallRequest).execute(opts);

            MarginCall result = apiInstance.acceptMarginCall(runId, agreementScope, agreementCode, item, marginType, direction, acceptMarginCallRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#acceptMarginCall");
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
| **runId** | **String**| The identifier of the margin run. | |
| **agreementScope** | **String**| The scope of the call&#39;s collateral agreement. | |
| **agreementCode** | **String**| The code of the call&#39;s collateral agreement. | |
| **item** | **String**| The margin item of the call. | |
| **marginType** | **String**| The margin type of the call. Currently VariationMargin. | |
| **direction** | **String**| Who posts under the call. One of WePost, TheyPost or None. | |
| **acceptMarginCallRequest** | [**AcceptMarginCallRequest**](AcceptMarginCallRequest.md)| The amount to accept, when the default does not apply. | [optional] |

### Return type

[**MarginCall**](MarginCall.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The accepted margin call. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## batchAcceptMarginCalls

> BatchAcceptMarginCallsResponse batchAcceptMarginCalls(batchAcceptMarginCallsRequest)

[EXPERIMENTAL] BatchAcceptMarginCalls: Accept several margin calls.

Accept each of the given margin calls at its default agreed amount. A call that cannot be accepted is reported  in the response and does not stop the others.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralApiExample {

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
        // CollateralApi apiInstance = apiFactory.build(CollateralApi.class);

        CollateralApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralApi.class);
        BatchAcceptMarginCallsRequest batchAcceptMarginCallsRequest = new BatchAcceptMarginCallsRequest(); // BatchAcceptMarginCallsRequest | The margin calls to accept.
        try {
            // uncomment the below to set overrides at the request level
            // BatchAcceptMarginCallsResponse result = apiInstance.batchAcceptMarginCalls(batchAcceptMarginCallsRequest).execute(opts);

            BatchAcceptMarginCallsResponse result = apiInstance.batchAcceptMarginCalls(batchAcceptMarginCallsRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#batchAcceptMarginCalls");
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
| **batchAcceptMarginCallsRequest** | [**BatchAcceptMarginCallsRequest**](BatchAcceptMarginCallsRequest.md)| The margin calls to accept. | |

### Return type

[**BatchAcceptMarginCallsResponse**](BatchAcceptMarginCallsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The calls accepted, and those that could not be. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## disputeMarginCall

> MarginCall disputeMarginCall(runId, agreementScope, agreementCode, item, marginType, direction, disputeMarginCallRequest)

[EXPERIMENTAL] DisputeMarginCall: Dispute a margin call.

Dispute a margin call: move the agreed amount now and leave the rest of the counterparty&#39;s demand in dispute,  with a reason and an owner. Allowed from the calculated and accepted states.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralApiExample {

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
        // CollateralApi apiInstance = apiFactory.build(CollateralApi.class);

        CollateralApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralApi.class);
        String runId = "runId_example"; // String | The identifier of the margin run.
        String agreementScope = "agreementScope_example"; // String | The scope of the call's collateral agreement.
        String agreementCode = "agreementCode_example"; // String | The code of the call's collateral agreement.
        String item = "item_example"; // String | The margin item of the call.
        String marginType = "marginType_example"; // String | The margin type of the call. Currently VariationMargin.
        String direction = "direction_example"; // String | Who posts under the call. One of WePost, TheyPost or None.
        DisputeMarginCallRequest disputeMarginCallRequest = new DisputeMarginCallRequest(); // DisputeMarginCallRequest | The amount to move now, the reason and the owner.
        try {
            // uncomment the below to set overrides at the request level
            // MarginCall result = apiInstance.disputeMarginCall(runId, agreementScope, agreementCode, item, marginType, direction, disputeMarginCallRequest).execute(opts);

            MarginCall result = apiInstance.disputeMarginCall(runId, agreementScope, agreementCode, item, marginType, direction, disputeMarginCallRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#disputeMarginCall");
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
| **runId** | **String**| The identifier of the margin run. | |
| **agreementScope** | **String**| The scope of the call&#39;s collateral agreement. | |
| **agreementCode** | **String**| The code of the call&#39;s collateral agreement. | |
| **item** | **String**| The margin item of the call. | |
| **marginType** | **String**| The margin type of the call. Currently VariationMargin. | |
| **direction** | **String**| Who posts under the call. One of WePost, TheyPost or None. | |
| **disputeMarginCallRequest** | [**DisputeMarginCallRequest**](DisputeMarginCallRequest.md)| The amount to move now, the reason and the owner. | |

### Return type

[**MarginCall**](MarginCall.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The disputed margin call. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getMarginCall

> MarginCall getMarginCall(runId, agreementScope, agreementCode, item, marginType, direction)

[EXPERIMENTAL] GetMarginCall: Get a margin call.

Retrieve one margin call of a run by its business key.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralApiExample {

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
        // CollateralApi apiInstance = apiFactory.build(CollateralApi.class);

        CollateralApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralApi.class);
        String runId = "runId_example"; // String | The identifier of the margin run.
        String agreementScope = "agreementScope_example"; // String | The scope of the call's collateral agreement.
        String agreementCode = "agreementCode_example"; // String | The code of the call's collateral agreement.
        String item = "item_example"; // String | The margin item of the call.
        String marginType = "marginType_example"; // String | The margin type of the call. Currently VariationMargin.
        String direction = "direction_example"; // String | Who posts under the call. One of WePost, TheyPost or None.
        try {
            // uncomment the below to set overrides at the request level
            // MarginCall result = apiInstance.getMarginCall(runId, agreementScope, agreementCode, item, marginType, direction).execute(opts);

            MarginCall result = apiInstance.getMarginCall(runId, agreementScope, agreementCode, item, marginType, direction).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#getMarginCall");
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
| **runId** | **String**| The identifier of the margin run. | |
| **agreementScope** | **String**| The scope of the call&#39;s collateral agreement. | |
| **agreementCode** | **String**| The code of the call&#39;s collateral agreement. | |
| **item** | **String**| The margin item of the call. | |
| **marginType** | **String**| The margin type of the call. Currently VariationMargin. | |
| **direction** | **String**| Who posts under the call. One of WePost, TheyPost or None. | |

### Return type

[**MarginCall**](MarginCall.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested margin call. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getMarginRun

> MarginRun getMarginRun(runId)

[EXPERIMENTAL] GetMarginRun: Get a margin run.

Retrieve a margin run with its progress: the status of each shard, the calls and lines published so far, and  anything it could not value.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralApiExample {

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
        // CollateralApi apiInstance = apiFactory.build(CollateralApi.class);

        CollateralApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralApi.class);
        String runId = "runId_example"; // String | The identifier of the margin run.
        try {
            // uncomment the below to set overrides at the request level
            // MarginRun result = apiInstance.getMarginRun(runId).execute(opts);

            MarginRun result = apiInstance.getMarginRun(runId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#getMarginRun");
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
| **runId** | **String**| The identifier of the margin run. | |

### Return type

[**MarginRun**](MarginRun.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested margin run. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listMarginCallLines

> PagedResourceListOfMarginLine listMarginCallLines(runId, agreementScope, agreementCode, item, marginType, direction, page, limit, filter)

[EXPERIMENTAL] ListMarginCallLines: List the margin lines of a call.

List the holding lines behind one margin call: our side of the figure the counterparty&#39;s statement is matched against.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralApiExample {

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
        // CollateralApi apiInstance = apiFactory.build(CollateralApi.class);

        CollateralApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralApi.class);
        String runId = "runId_example"; // String | The identifier of the margin run.
        String agreementScope = "agreementScope_example"; // String | The scope of the call's collateral agreement.
        String agreementCode = "agreementCode_example"; // String | The code of the call's collateral agreement.
        String item = "item_example"; // String | The margin item of the call.
        String marginType = "marginType_example"; // String | The margin type of the call. Currently VariationMargin.
        String direction = "direction_example"; // String | Who posts under the call. One of WePost, TheyPost or None.
        String page = "page_example"; // String | The pagination token to use to continue listing margin lines; this value is returned from the previous call.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. The filterable fields are PortfolioId.Scope, PortfolioId.Code, HoldingId, CustodianAccountScope, CustodianAccountCode, CustodianAccountName, Units, Pv, VariationMargin and CollateralValue. For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfMarginLine result = apiInstance.listMarginCallLines(runId, agreementScope, agreementCode, item, marginType, direction, page, limit, filter).execute(opts);

            PagedResourceListOfMarginLine result = apiInstance.listMarginCallLines(runId, agreementScope, agreementCode, item, marginType, direction, page, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#listMarginCallLines");
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
| **runId** | **String**| The identifier of the margin run. | |
| **agreementScope** | **String**| The scope of the call&#39;s collateral agreement. | |
| **agreementCode** | **String**| The code of the call&#39;s collateral agreement. | |
| **item** | **String**| The margin item of the call. | |
| **marginType** | **String**| The margin type of the call. Currently VariationMargin. | |
| **direction** | **String**| Who posts under the call. One of WePost, TheyPost or None. | |
| **page** | **String**| The pagination token to use to continue listing margin lines; this value is returned from the previous call. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. The filterable fields are PortfolioId.Scope, PortfolioId.Code, HoldingId, CustodianAccountScope, CustodianAccountCode, CustodianAccountName, Units, Pv, VariationMargin and CollateralValue. For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfMarginLine**](PagedResourceListOfMarginLine.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested margin lines. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listMarginCalls

> PagedResourceListOfMarginCall listMarginCalls(effectiveAt, runId, page, limit, filter)

[EXPERIMENTAL] ListMarginCalls: List margin calls.

List the margin calls of one run when a run id is given. Otherwise list the current calls for a business date:  those of the latest run for the date, with an agreement that run could not value served from the most recent run  that did. Restricted to the agreements the caller may read.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralApiExample {

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
        // CollateralApi apiInstance = apiFactory.build(CollateralApi.class);

        CollateralApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The business date, datetime or cut label to list the current margin calls for. Defaults to today if not specified. Ignored when a run id is given.
        String runId = "runId_example"; // String | The identifier of the margin run to list the calls of. Lists the current calls for the business date if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing margin calls; this value is returned from the previous call.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. The filterable fields are RunId, AgreementId.Scope, AgreementId.Code, Counterparty.Code, Counterparty.IdTypeScope, Counterparty.IdTypeCode, Item, MarginType, Method, Settlement, Direction, Currency, Required, Held, Call, CounterpartyDemand, Difference, MatchStatus, AgreedAmount, DisputedAmount, DisputeOwner, State and Deadline. For example, to find the breaks, specify \"MatchStatus eq 'Break'\". For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfMarginCall result = apiInstance.listMarginCalls(effectiveAt, runId, page, limit, filter).execute(opts);

            PagedResourceListOfMarginCall result = apiInstance.listMarginCalls(effectiveAt, runId, page, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#listMarginCalls");
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
| **effectiveAt** | **String**| The business date, datetime or cut label to list the current margin calls for. Defaults to today if not specified. Ignored when a run id is given. | [optional] |
| **runId** | **String**| The identifier of the margin run to list the calls of. Lists the current calls for the business date if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing margin calls; this value is returned from the previous call. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. The filterable fields are RunId, AgreementId.Scope, AgreementId.Code, Counterparty.Code, Counterparty.IdTypeScope, Counterparty.IdTypeCode, Item, MarginType, Method, Settlement, Direction, Currency, Required, Held, Call, CounterpartyDemand, Difference, MatchStatus, AgreedAmount, DisputedAmount, DisputeOwner, State and Deadline. For example, to find the breaks, specify \&quot;MatchStatus eq &#39;Break&#39;\&quot;. For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfMarginCall**](PagedResourceListOfMarginCall.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested margin calls. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listMarginLines

> PagedResourceListOfMarginLine listMarginLines(runId, page, limit, filter)

[EXPERIMENTAL] ListMarginLines: List the margin lines of a run.

List the holding lines behind every margin call of a run, restricted to the agreements the caller may read.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralApiExample {

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
        // CollateralApi apiInstance = apiFactory.build(CollateralApi.class);

        CollateralApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralApi.class);
        String runId = "runId_example"; // String | The identifier of the margin run.
        String page = "page_example"; // String | The pagination token to use to continue listing margin lines; this value is returned from the previous call.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. The filterable fields are AgreementId.Scope, AgreementId.Code, Item, PortfolioId.Scope, PortfolioId.Code, HoldingId, CustodianAccountScope, CustodianAccountCode, CustodianAccountName, Units, Pv, VariationMargin and CollateralValue. For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfMarginLine result = apiInstance.listMarginLines(runId, page, limit, filter).execute(opts);

            PagedResourceListOfMarginLine result = apiInstance.listMarginLines(runId, page, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#listMarginLines");
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
| **runId** | **String**| The identifier of the margin run. | |
| **page** | **String**| The pagination token to use to continue listing margin lines; this value is returned from the previous call. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. The filterable fields are AgreementId.Scope, AgreementId.Code, Item, PortfolioId.Scope, PortfolioId.Code, HoldingId, CustodianAccountScope, CustodianAccountCode, CustodianAccountName, Units, Pv, VariationMargin and CollateralValue. For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfMarginLine**](PagedResourceListOfMarginLine.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested margin lines. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listMarginRuns

> PagedResourceListOfMarginRun listMarginRuns(page, limit, filter)

[EXPERIMENTAL] ListMarginRuns: List margin runs.

List the margin runs on record, most recent first.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralApiExample {

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
        // CollateralApi apiInstance = apiFactory.build(CollateralApi.class);

        CollateralApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralApi.class);
        String page = "page_example"; // String | The pagination token to use to continue listing margin runs; this value is returned from the previous call.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. The filterable fields are Id, EffectiveAt, AsAt, Status, CallCount and LineCount. For example, to find the runs for a business date, specify \"EffectiveAt eq 2026-09-04\". For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfMarginRun result = apiInstance.listMarginRuns(page, limit, filter).execute(opts);

            PagedResourceListOfMarginRun result = apiInstance.listMarginRuns(page, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#listMarginRuns");
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
| **page** | **String**| The pagination token to use to continue listing margin runs; this value is returned from the previous call. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. The filterable fields are Id, EffectiveAt, AsAt, Status, CallCount and LineCount. For example, to find the runs for a business date, specify \&quot;EffectiveAt eq 2026-09-04\&quot;. For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfMarginRun**](PagedResourceListOfMarginRun.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested margin runs. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## recordCounterpartyDemand

> MarginCall recordCounterpartyDemand(runId, agreementScope, agreementCode, item, marginType, direction, recordCounterpartyDemandRequest)

[EXPERIMENTAL] RecordCounterpartyDemand: Record the counterparty&#39;s demand against a margin call.

Record the counterparty&#39;s figure for a margin call and match it to ours: equal is matched, a difference within the  agreement&#39;s tolerance is within tolerance, and a larger difference is a break. The call&#39;s state is not changed,  except that a call already accepted or disputed returns to calculated when its demand changes.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralApiExample {

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
        // CollateralApi apiInstance = apiFactory.build(CollateralApi.class);

        CollateralApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralApi.class);
        String runId = "runId_example"; // String | The identifier of the margin run.
        String agreementScope = "agreementScope_example"; // String | The scope of the call's collateral agreement.
        String agreementCode = "agreementCode_example"; // String | The code of the call's collateral agreement.
        String item = "item_example"; // String | The margin item of the call.
        String marginType = "marginType_example"; // String | The margin type of the call. Currently VariationMargin.
        String direction = "direction_example"; // String | Who posts under the call. One of WePost, TheyPost or None.
        RecordCounterpartyDemandRequest recordCounterpartyDemandRequest = new RecordCounterpartyDemandRequest(); // RecordCounterpartyDemandRequest | The counterparty's demand.
        try {
            // uncomment the below to set overrides at the request level
            // MarginCall result = apiInstance.recordCounterpartyDemand(runId, agreementScope, agreementCode, item, marginType, direction, recordCounterpartyDemandRequest).execute(opts);

            MarginCall result = apiInstance.recordCounterpartyDemand(runId, agreementScope, agreementCode, item, marginType, direction, recordCounterpartyDemandRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#recordCounterpartyDemand");
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
| **runId** | **String**| The identifier of the margin run. | |
| **agreementScope** | **String**| The scope of the call&#39;s collateral agreement. | |
| **agreementCode** | **String**| The code of the call&#39;s collateral agreement. | |
| **item** | **String**| The margin item of the call. | |
| **marginType** | **String**| The margin type of the call. Currently VariationMargin. | |
| **direction** | **String**| Who posts under the call. One of WePost, TheyPost or None. | |
| **recordCounterpartyDemandRequest** | [**RecordCounterpartyDemandRequest**](RecordCounterpartyDemandRequest.md)| The counterparty&#39;s demand. | |

### Return type

[**MarginCall**](MarginCall.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The margin call with the demand matched against it. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## retryMarginRun

> MarginRun retryMarginRun(runId)

[EXPERIMENTAL] RetryMarginRun: Retry a margin run.

Value the failed shards of a completed margin run again, at the run&#39;s asAt. Refused while the run is in progress  or when no shard failed.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralApiExample {

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
        // CollateralApi apiInstance = apiFactory.build(CollateralApi.class);

        CollateralApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralApi.class);
        String runId = "runId_example"; // String | The identifier of the margin run.
        try {
            // uncomment the below to set overrides at the request level
            // MarginRun result = apiInstance.retryMarginRun(runId).execute(opts);

            MarginRun result = apiInstance.retryMarginRun(runId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#retryMarginRun");
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
| **runId** | **String**| The identifier of the margin run. | |

### Return type

[**MarginRun**](MarginRun.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The margin run with its failed shards pending again. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## runMarginCalculation

> MarginRun runMarginCalculation(marginRunRequest)

[EXPERIMENTAL] RunMarginCalculation: Run the margin calculation.

Value the collateral agreements for a business date in the background and publish their margin calls as a run.  The run is returned as planned; poll GetMarginRun for its progress, and list its calls as they are published.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralApiExample {

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
        // CollateralApi apiInstance = apiFactory.build(CollateralApi.class);

        CollateralApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralApi.class);
        MarginRunRequest marginRunRequest = new MarginRunRequest(); // MarginRunRequest | The business date to value, and optionally the asAt and the agreements to include.
        try {
            // uncomment the below to set overrides at the request level
            // MarginRun result = apiInstance.runMarginCalculation(marginRunRequest).execute(opts);

            MarginRun result = apiInstance.runMarginCalculation(marginRunRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#runMarginCalculation");
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
| **marginRunRequest** | [**MarginRunRequest**](MarginRunRequest.md)| The business date to value, and optionally the asAt and the agreements to include. | |

### Return type

[**MarginRun**](MarginRun.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The margin run as planned. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

