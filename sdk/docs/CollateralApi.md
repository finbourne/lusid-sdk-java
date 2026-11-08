# CollateralApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptMarginCall**](CollateralApi.md#acceptMarginCall) | **POST** /api/collateral/margincalls/{runId}/{agreementScope}/{agreementCode}/{item}/{marginType}/{direction}/$accept | [EXPERIMENTAL] AcceptMarginCall: Accept a margin call. |
| [**batchAcceptMarginCalls**](CollateralApi.md#batchAcceptMarginCalls) | **POST** /api/collateral/margincalls/$batchAccept | [EXPERIMENTAL] BatchAcceptMarginCalls: Accept several margin calls. |
| [**disputeMarginCall**](CollateralApi.md#disputeMarginCall) | **POST** /api/collateral/margincalls/{runId}/{agreementScope}/{agreementCode}/{item}/{marginType}/{direction}/$dispute | [EXPERIMENTAL] DisputeMarginCall: Dispute a margin call. |
| [**getMarginCall**](CollateralApi.md#getMarginCall) | **GET** /api/collateral/margincalls/{runId}/{agreementScope}/{agreementCode}/{item}/{marginType}/{direction} | [EXPERIMENTAL] GetMarginCall: Get a margin call. |
| [**getMarginCallAllocation**](CollateralApi.md#getMarginCallAllocation) | **GET** /api/collateral/margincalls/{runId}/{agreementScope}/{agreementCode}/{item}/{marginType}/{direction}/$allocation | [EXPERIMENTAL] GetMarginCallAllocation: [EXPERIMENTAL] GetMarginCallAllocation: Get the collateral proposed for a margin call. |
| [**getMarginCallExplanation**](CollateralApi.md#getMarginCallExplanation) | **GET** /api/collateral/margincalls/{runId}/{agreementScope}/{agreementCode}/{item}/{marginType}/{direction}/$explain | [EXPERIMENTAL] GetMarginCallExplanation: Explain a margin call. |
| [**getMarginLineExplanation**](CollateralApi.md#getMarginLineExplanation) | **GET** /api/collateral/runs/{runId}/lines/{lineKey}/$explain | [EXPERIMENTAL] GetMarginLineExplanation: Explain a margin line. |
| [**getMarginRun**](CollateralApi.md#getMarginRun) | **GET** /api/collateral/runs/{runId} | [EXPERIMENTAL] GetMarginRun: Get a margin run. |
| [**listMarginCallLines**](CollateralApi.md#listMarginCallLines) | **GET** /api/collateral/margincalls/{runId}/{agreementScope}/{agreementCode}/{item}/{marginType}/{direction}/lines | [EXPERIMENTAL] ListMarginCallLines: List the margin lines of a call. |
| [**listMarginCalls**](CollateralApi.md#listMarginCalls) | **GET** /api/collateral/margincalls | [EXPERIMENTAL] ListMarginCalls: List margin calls. |
| [**listMarginLines**](CollateralApi.md#listMarginLines) | **GET** /api/collateral/runs/{runId}/lines | [EXPERIMENTAL] ListMarginLines: List the margin lines of a run. |
| [**listMarginRunRecommendations**](CollateralApi.md#listMarginRunRecommendations) | **GET** /api/collateral/runs/{runId}/recommendations | [EXPERIMENTAL] ListMarginRunRecommendations: List a margin run&#39;s netting recommendations. |
| [**listMarginRuns**](CollateralApi.md#listMarginRuns) | **GET** /api/collateral/runs | [EXPERIMENTAL] ListMarginRuns: List margin runs. |
| [**listNettingRecommendations**](CollateralApi.md#listNettingRecommendations) | **GET** /api/collateral/recommendations | [EXPERIMENTAL] ListNettingRecommendations: List the current netting recommendations. |
| [**rankMarginCall**](CollateralApi.md#rankMarginCall) | **POST** /api/collateral/margincalls/{runId}/{agreementScope}/{agreementCode}/{item}/{marginType}/{direction}/$rank | [EXPERIMENTAL] RankMarginCall: [EXPERIMENTAL] RankMarginCall: Rank the collateral for a margin call again, with the caller&#39;s choices. |
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


## getMarginCallAllocation

> CollateralAllocation getMarginCallAllocation(runId, agreementScope, agreementCode, item, marginType, direction)

[EXPERIMENTAL] GetMarginCallAllocation: [EXPERIMENTAL] GetMarginCallAllocation: Get the collateral proposed for a margin call.

Retrieve the assets the run&#39;s allocation pass proposes to deliver for the call, or to take back for a return, with  every holding it considered and either its rank or the constraint that excluded it. Each line carries what a  transaction moving it needs: the instrument, the portfolio and custodian account, the units, the price and the  consideration. Not found until the run&#39;s allocation pass has completed, or when the call moves no collateral of ours.

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
        String marginType = "marginType_example"; // String | The margin type of the call. One of VariationMargin or InitialMargin.
        String direction = "direction_example"; // String | Who posts under the call. One of WePost, TheyPost or None.
        try {
            // uncomment the below to set overrides at the request level
            // CollateralAllocation result = apiInstance.getMarginCallAllocation(runId, agreementScope, agreementCode, item, marginType, direction).execute(opts);

            CollateralAllocation result = apiInstance.getMarginCallAllocation(runId, agreementScope, agreementCode, item, marginType, direction).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#getMarginCallAllocation");
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
| **marginType** | **String**| The margin type of the call. One of VariationMargin or InitialMargin. | |
| **direction** | **String**| Who posts under the call. One of WePost, TheyPost or None. | |

### Return type

[**CollateralAllocation**](CollateralAllocation.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The collateral proposed for the margin call. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getMarginCallExplanation

> MarginExplanation getMarginCallExplanation(runId, agreementScope, agreementCode, item, marginType, direction)

[EXPERIMENTAL] GetMarginCallExplanation: Explain a margin call.

Show how the required amount of one initial-margin call of a run was arrived at, as a tree of components. Only an  initial-margin call whose run stored its working can be explained, as the call&#39;s ExplainAvailable says. The working  of portfolios the caller may not read is replaced by a single redacted component that keeps its parent adding up.

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
        String marginType = "marginType_example"; // String | The margin type of the call. Only InitialMargin calls can be explained.
        String direction = "direction_example"; // String | Who posts under the call. One of WePost, TheyPost or None.
        try {
            // uncomment the below to set overrides at the request level
            // MarginExplanation result = apiInstance.getMarginCallExplanation(runId, agreementScope, agreementCode, item, marginType, direction).execute(opts);

            MarginExplanation result = apiInstance.getMarginCallExplanation(runId, agreementScope, agreementCode, item, marginType, direction).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#getMarginCallExplanation");
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
| **marginType** | **String**| The margin type of the call. Only InitialMargin calls can be explained. | |
| **direction** | **String**| Who posts under the call. One of WePost, TheyPost or None. | |

### Return type

[**MarginExplanation**](MarginExplanation.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | How the call&#39;s required amount was arrived at. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getMarginLineExplanation

> MarginExplanation getMarginLineExplanation(runId, lineKey, figure)

[EXPERIMENTAL] GetMarginLineExplanation: Explain a margin line.

Show how the figures of one margin line of a run were arrived at, as a tree of components for each figure. The run  must have stored its working, as its lines&#39; ExplainAvailable says. The working of portfolios the caller may not  read is replaced by a single redacted component that keeps its parent adding up. A line the caller may not read is  reported as not found.

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
        String lineKey = "lineKey_example"; // String | The key of the margin line, as listed in the line's LineKey.
        String figure = "figure_example"; // String | The figure of the line to explain: VariationMargin or InitialMargin. Explains every figure of the line that the run explained if not specified. Available values: VariationMargin, InitialMargin.
        try {
            // uncomment the below to set overrides at the request level
            // MarginExplanation result = apiInstance.getMarginLineExplanation(runId, lineKey, figure).execute(opts);

            MarginExplanation result = apiInstance.getMarginLineExplanation(runId, lineKey, figure).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#getMarginLineExplanation");
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
| **lineKey** | **String**| The key of the margin line, as listed in the line&#39;s LineKey. | |
| **figure** | **String**| The figure of the line to explain: VariationMargin or InitialMargin. Explains every figure of the line that the run explained if not specified. Available values: VariationMargin, InitialMargin. | [optional] |

### Return type

[**MarginExplanation**](MarginExplanation.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | How the line&#39;s figures were arrived at. |  -  |
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

> PagedResourceListOfMarginCall listMarginCalls(effectiveAt, runId, page, limit, filter, scenarios, effectiveFrom)

[EXPERIMENTAL] ListMarginCalls: List margin calls.

List the margin calls of one run when a run id is given. Otherwise list the current calls for a business date:  those of the latest run for the date, with an agreement that run could not value served from the most recent run  that did. With an effectiveFrom the current calls of each date from it to effectiveAt are listed, in date order.  Restricted to the agreements the caller may read.

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
        String effectiveAt = "effectiveAt_example"; // String | The business date, datetime or cut label to list the current margin calls for, or the last date of the range when effectiveFrom is given. Defaults to today if not specified. Ignored when a run id is given.
        String runId = "runId_example"; // String | The identifier of the margin run to list the calls of. Lists the current calls for the business date if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing margin calls; this value is returned from the previous call.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. The filterable fields are RunId, AgreementId.Scope, AgreementId.Code, Counterparty.Code, Counterparty.IdTypeScope, Counterparty.IdTypeCode, Item, MarginType, Method, Settlement, Direction, Currency, Required, Held, Call, CounterpartyDemand, Difference, MatchStatus, AgreedAmount, DisputedAmount, DisputeOwner, State and Deadline. For example, to find the breaks, specify \"MatchStatus eq 'Break'\". For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        List<String> scenarios = Arrays.asList(); // List<String> | The scenarios, each as scope/code, whose calls are listed beside the base case calls, which are always listed. Lists the base case calls only if not specified.
        String effectiveFrom = "effectiveFrom_example"; // String | The first business date, datetime or cut label of a range ending at effectiveAt, for a time series of calls. Lists the one business date if not specified. Ignored when a run id is given.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfMarginCall result = apiInstance.listMarginCalls(effectiveAt, runId, page, limit, filter, scenarios, effectiveFrom).execute(opts);

            PagedResourceListOfMarginCall result = apiInstance.listMarginCalls(effectiveAt, runId, page, limit, filter, scenarios, effectiveFrom).execute();
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
| **effectiveAt** | **String**| The business date, datetime or cut label to list the current margin calls for, or the last date of the range when effectiveFrom is given. Defaults to today if not specified. Ignored when a run id is given. | [optional] |
| **runId** | **String**| The identifier of the margin run to list the calls of. Lists the current calls for the business date if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing margin calls; this value is returned from the previous call. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. The filterable fields are RunId, AgreementId.Scope, AgreementId.Code, Counterparty.Code, Counterparty.IdTypeScope, Counterparty.IdTypeCode, Item, MarginType, Method, Settlement, Direction, Currency, Required, Held, Call, CounterpartyDemand, Difference, MatchStatus, AgreedAmount, DisputedAmount, DisputeOwner, State and Deadline. For example, to find the breaks, specify \&quot;MatchStatus eq &#39;Break&#39;\&quot;. For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |
| **scenarios** | [**List&lt;String&gt;**](String.md)| The scenarios, each as scope/code, whose calls are listed beside the base case calls, which are always listed. Lists the base case calls only if not specified. | [optional] |
| **effectiveFrom** | **String**| The first business date, datetime or cut label of a range ending at effectiveAt, for a time series of calls. Lists the one business date if not specified. Ignored when a run id is given. | [optional] |

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

> PagedResourceListOfMarginLine listMarginLines(runId, page, limit, filter, scenarios)

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
        List<String> scenarios = Arrays.asList(); // List<String> | The scenarios, each as scope/code, whose lines are listed beside the base case lines, which are always listed. Lists the base case lines only if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfMarginLine result = apiInstance.listMarginLines(runId, page, limit, filter, scenarios).execute(opts);

            PagedResourceListOfMarginLine result = apiInstance.listMarginLines(runId, page, limit, filter, scenarios).execute();
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
| **scenarios** | [**List&lt;String&gt;**](String.md)| The scenarios, each as scope/code, whose lines are listed beside the base case lines, which are always listed. Lists the base case lines only if not specified. | [optional] |

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


## listMarginRunRecommendations

> PagedResourceListOfNettingRecommendation listMarginRunRecommendations(runId, page, limit, filter)

[EXPERIMENTAL] ListMarginRunRecommendations: List a margin run&#39;s netting recommendations.

List the trades a run&#39;s optimisation pass found would attract less initial margin in another netting set of the  run, with both sets&#39; initial margin before and after the move. Empty until the run&#39;s optimisation pass has  completed. Restricted to recommendations whose source and target agreements the caller may read.

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
        String page = "page_example"; // String | The pagination token to use to continue listing recommendations; this value is returned from the previous call.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. The filterable fields are RunId, SourceAgreementId.Scope, SourceAgreementId.Code, SourceItem, TargetAgreementId.Scope, TargetAgreementId.Code, TargetItem, Transfer, InstrumentType, Currency, MaturityBucket, SavingPerDay, OneOffCost, PaybackDays and InitialMarginChange. For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfNettingRecommendation result = apiInstance.listMarginRunRecommendations(runId, page, limit, filter).execute(opts);

            PagedResourceListOfNettingRecommendation result = apiInstance.listMarginRunRecommendations(runId, page, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#listMarginRunRecommendations");
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
| **page** | **String**| The pagination token to use to continue listing recommendations; this value is returned from the previous call. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. The filterable fields are RunId, SourceAgreementId.Scope, SourceAgreementId.Code, SourceItem, TargetAgreementId.Scope, TargetAgreementId.Code, TargetItem, Transfer, InstrumentType, Currency, MaturityBucket, SavingPerDay, OneOffCost, PaybackDays and InitialMarginChange. For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfNettingRecommendation**](PagedResourceListOfNettingRecommendation.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested recommendations. |  -  |
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


## listNettingRecommendations

> PagedResourceListOfNettingRecommendation listNettingRecommendations(effectiveAt, page, limit, filter)

[EXPERIMENTAL] ListNettingRecommendations: List the current netting recommendations.

List the netting recommendations in force for a business date: those of the latest run for the date whose  optimisation pass completed, with an agreement that run could not value served from the most recent run that  did. Restricted to recommendations whose source and target agreements the caller may read.

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
        String effectiveAt = "effectiveAt_example"; // String | The business date, datetime or cut label to list the current recommendations for. Defaults to today if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing recommendations; this value is returned from the previous call.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. The filterable fields are RunId, SourceAgreementId.Scope, SourceAgreementId.Code, SourceItem, TargetAgreementId.Scope, TargetAgreementId.Code, TargetItem, Transfer, InstrumentType, Currency, MaturityBucket, SavingPerDay, OneOffCost, PaybackDays and InitialMarginChange. For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfNettingRecommendation result = apiInstance.listNettingRecommendations(effectiveAt, page, limit, filter).execute(opts);

            PagedResourceListOfNettingRecommendation result = apiInstance.listNettingRecommendations(effectiveAt, page, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#listNettingRecommendations");
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
| **effectiveAt** | **String**| The business date, datetime or cut label to list the current recommendations for. Defaults to today if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing recommendations; this value is returned from the previous call. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. The filterable fields are RunId, SourceAgreementId.Scope, SourceAgreementId.Code, SourceItem, TargetAgreementId.Scope, TargetAgreementId.Code, TargetItem, Transfer, InstrumentType, Currency, MaturityBucket, SavingPerDay, OneOffCost, PaybackDays and InitialMarginChange. For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfNettingRecommendation**](PagedResourceListOfNettingRecommendation.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested recommendations. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## rankMarginCall

> CollateralAllocation rankMarginCall(runId, agreementScope, agreementCode, item, marginType, direction, rankMarginCallRequest)

[EXPERIMENTAL] RankMarginCall: [EXPERIMENTAL] RankMarginCall: Rank the collateral for a margin call again, with the caller&#39;s choices.

Value the call&#39;s agreement as of now for the run&#39;s business date and rank its free, eligible holdings for the  call again, keeping the assets and units the caller chose. Each choice is validated against the agreement&#39;s  constraints and kept with its reason when it fails one; the rest of the call is filled from the ranking, cheapest  first, unless fillRemainder is false. Nothing is stored: the result is what to book, for the caller to decide on.

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
        String marginType = "marginType_example"; // String | The margin type of the call. One of VariationMargin or InitialMargin.
        String direction = "direction_example"; // String | Who posts under the call. One of WePost, TheyPost or None.
        RankMarginCallRequest rankMarginCallRequest = new RankMarginCallRequest(); // RankMarginCallRequest | The assets the caller chose, and whether to fill the rest.
        try {
            // uncomment the below to set overrides at the request level
            // CollateralAllocation result = apiInstance.rankMarginCall(runId, agreementScope, agreementCode, item, marginType, direction, rankMarginCallRequest).execute(opts);

            CollateralAllocation result = apiInstance.rankMarginCall(runId, agreementScope, agreementCode, item, marginType, direction, rankMarginCallRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralApi#rankMarginCall");
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
| **marginType** | **String**| The margin type of the call. One of VariationMargin or InitialMargin. | |
| **direction** | **String**| Who posts under the call. One of WePost, TheyPost or None. | |
| **rankMarginCallRequest** | [**RankMarginCallRequest**](RankMarginCallRequest.md)| The assets the caller chose, and whether to fill the rest. | [optional] |

### Return type

[**CollateralAllocation**](CollateralAllocation.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The collateral ranked for the margin call. |  -  |
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

> PagedResourceListOfMarginRun runMarginCalculation(marginRunRequest)

[EXPERIMENTAL] RunMarginCalculation: Run the margin calculation.

Value the collateral agreements for a business date, or for each weekday of a span, in the background and publish  their margin calls as a run for each date. The base case is always valued, with each scenario named in the request  valued beside it as a case of the same run. A date after the asAt is a projection on the market as at the asAt.  The runs are returned as planned, in date order; poll GetMarginRun for the progress of each, and list the calls as they are published.

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
        MarginRunRequest marginRunRequest = new MarginRunRequest(); // MarginRunRequest | The business date to value, or the span of dates ending at it, and optionally the asAt, the agreements to include and the scenarios to value beside the base case.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfMarginRun result = apiInstance.runMarginCalculation(marginRunRequest).execute(opts);

            PagedResourceListOfMarginRun result = apiInstance.runMarginCalculation(marginRunRequest).execute();
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
| **marginRunRequest** | [**MarginRunRequest**](MarginRunRequest.md)| The business date to value, or the span of dates ending at it, and optionally the asAt, the agreements to include and the scenarios to value beside the base case. | |

### Return type

[**PagedResourceListOfMarginRun**](PagedResourceListOfMarginRun.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The margin runs as planned, one for each date valued. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

