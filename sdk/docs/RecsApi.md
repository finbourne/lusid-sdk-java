# RecsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addRecResultSetApprovalDecision**](RecsApi.md#addRecResultSetApprovalDecision) | **POST** /api/recs/resultsets/{entityUniqueId}/$decide | [EXPERIMENTAL] AddRecResultSetApprovalDecision: AddRecResultSetApprovalDecision |
| [**getRecInstance**](RecsApi.md#getRecInstance) | **GET** /api/recs/instances/{instanceIdType}/{instanceIdValue} | [EXPERIMENTAL] GetRecInstance: GetRecInstance |
| [**getRecResultSet**](RecsApi.md#getRecResultSet) | **GET** /api/recs/resultsets/{entityUniqueId} | [EXPERIMENTAL] GetRecResultSet: GetRecResultSet |
| [**instantiateRec**](RecsApi.md#instantiateRec) | **POST** /api/recs/instances | [EXPERIMENTAL] InstantiateRec: InstantiateRec |
| [**listRecInstances**](RecsApi.md#listRecInstances) | **GET** /api/recs/instances | [EXPERIMENTAL] ListRecInstances: ListRecInstances |
| [**listRecResultSets**](RecsApi.md#listRecResultSets) | **GET** /api/recs/resultsets | [EXPERIMENTAL] ListRecResultSets: ListRecResultSets |
| [**submitRecResultSetReview**](RecsApi.md#submitRecResultSetReview) | **POST** /api/recs/resultsets/{entityUniqueId}/$submit | [EXPERIMENTAL] SubmitRecResultSetReview: Submit a rec result set review for approval, or resubmit after addressing requested revisions. |
| [**transitionRecInstance**](RecsApi.md#transitionRecInstance) | **POST** /api/recs/instances/{instanceIdType}/{instanceIdValue}/$transition | [EXPERIMENTAL] TransitionRecInstance: TransitionRecInstance |



## addRecResultSetApprovalDecision

> RecResultSet addRecResultSetApprovalDecision(entityUniqueId, recResultSetApprovalDecisionRequest)

[EXPERIMENTAL] AddRecResultSetApprovalDecision: AddRecResultSetApprovalDecision

Add an approver decision (approve or request revisions) to a rec result set.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RecsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

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
        // RecsApi apiInstance = apiFactory.build(RecsApi.class);

        RecsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RecsApi.class);
        String entityUniqueId = "entityUniqueId_example"; // String | The entity unique id of the rec result set (its version.entityUniqueId).
        RecResultSetApprovalDecisionRequest recResultSetApprovalDecisionRequest = new RecResultSetApprovalDecisionRequest(); // RecResultSetApprovalDecisionRequest | The approval decision request.
        try {
            // uncomment the below to set overrides at the request level
            // RecResultSet result = apiInstance.addRecResultSetApprovalDecision(entityUniqueId, recResultSetApprovalDecisionRequest).execute(opts);

            RecResultSet result = apiInstance.addRecResultSetApprovalDecision(entityUniqueId, recResultSetApprovalDecisionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#addRecResultSetApprovalDecision");
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
| **entityUniqueId** | **String**| The entity unique id of the rec result set (its version.entityUniqueId). | |
| **recResultSetApprovalDecisionRequest** | [**RecResultSetApprovalDecisionRequest**](RecResultSetApprovalDecisionRequest.md)| The approval decision request. | |

### Return type

[**RecResultSet**](RecResultSet.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated rec result set. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getRecInstance

> RecInstance getRecInstance(instanceIdType, instanceIdValue, asAt)

[EXPERIMENTAL] GetRecInstance: GetRecInstance

Retrieve a single rec instance by its identifier.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RecsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

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
        // RecsApi apiInstance = apiFactory.build(RecsApi.class);

        RecsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RecsApi.class);
        String instanceIdType = "instanceIdType_example"; // String | How the instance was created: \"WorkflowServiceTaskId\" or \"Manual\". Available values: WorkflowServiceTaskId, Manual.
        String instanceIdValue = "instanceIdValue_example"; // String | The instance identifier value (a GUID).
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the instance. Defaults to latest if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // RecInstance result = apiInstance.getRecInstance(instanceIdType, instanceIdValue, asAt).execute(opts);

            RecInstance result = apiInstance.getRecInstance(instanceIdType, instanceIdValue, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#getRecInstance");
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
| **instanceIdType** | **String**| How the instance was created: \&quot;WorkflowServiceTaskId\&quot; or \&quot;Manual\&quot;. Available values: WorkflowServiceTaskId, Manual. | |
| **instanceIdValue** | **String**| The instance identifier value (a GUID). | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instance. Defaults to latest if not specified. | [optional] |

### Return type

[**RecInstance**](RecInstance.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested rec instance. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getRecResultSet

> RecResultSet getRecResultSet(entityUniqueId, asAt, includePreviousRuns)

[EXPERIMENTAL] GetRecResultSet: GetRecResultSet

Retrieve a single rec result set by its entity unique id.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RecsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

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
        // RecsApi apiInstance = apiFactory.build(RecsApi.class);

        RecsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RecsApi.class);
        String entityUniqueId = "entityUniqueId_example"; // String | The entity unique id of the rec result set (its version.entityUniqueId).
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the result set. Defaults to latest if not specified.
        Boolean includePreviousRuns = false; // Boolean | When true, the previousRuns array is populated with prior run snapshots. Defaults to false.
        try {
            // uncomment the below to set overrides at the request level
            // RecResultSet result = apiInstance.getRecResultSet(entityUniqueId, asAt, includePreviousRuns).execute(opts);

            RecResultSet result = apiInstance.getRecResultSet(entityUniqueId, asAt, includePreviousRuns).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#getRecResultSet");
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
| **entityUniqueId** | **String**| The entity unique id of the rec result set (its version.entityUniqueId). | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the result set. Defaults to latest if not specified. | [optional] |
| **includePreviousRuns** | **Boolean**| When true, the previousRuns array is populated with prior run snapshots. Defaults to false. | [optional] [default to false] |

### Return type

[**RecResultSet**](RecResultSet.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested rec result set. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## instantiateRec

> RecInstance instantiateRec(instantiateRecRequest)

[EXPERIMENTAL] InstantiateRec: InstantiateRec

Instantiate a new rec instance from a rec definition and start its first run. The run   executes asynchronously; the response returns once the run has started, with the instance Running.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RecsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

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
        // RecsApi apiInstance = apiFactory.build(RecsApi.class);

        RecsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RecsApi.class);
        InstantiateRecRequest instantiateRecRequest = new InstantiateRecRequest(); // InstantiateRecRequest | The instantiation request.
        try {
            // uncomment the below to set overrides at the request level
            // RecInstance result = apiInstance.instantiateRec(instantiateRecRequest).execute(opts);

            RecInstance result = apiInstance.instantiateRec(instantiateRecRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#instantiateRec");
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
| **instantiateRecRequest** | [**InstantiateRecRequest**](InstantiateRecRequest.md)| The instantiation request. | |

### Return type

[**RecInstance**](RecInstance.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The instantiated rec instance, in a Running state. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listRecInstances

> PagedResourceListOfRecInstance listRecInstances(asAt, page, limit, filter, sortBy)

[EXPERIMENTAL] ListRecInstances: ListRecInstances

List rec instances.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RecsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

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
        // RecsApi apiInstance = apiFactory.build(RecsApi.class);

        RecsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RecsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list instances. Defaults to latest if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing instances from a previous call. If a pagination token is provided the filter and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names suffixed by \" ASC\" or \" DESC\".
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfRecInstance result = apiInstance.listRecInstances(asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfRecInstance result = apiInstance.listRecInstances(asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#listRecInstances");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list instances. Defaults to latest if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing instances from a previous call. If a pagination token is provided the filter and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfRecInstance**](PagedResourceListOfRecInstance.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The rec instances. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listRecResultSets

> PagedResourceListOfRecResultSet listRecResultSets(asAt, includePreviousRuns, page, limit, filter, sortBy)

[EXPERIMENTAL] ListRecResultSets: ListRecResultSets

List rec result sets.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RecsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

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
        // RecsApi apiInstance = apiFactory.build(RecsApi.class);

        RecsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RecsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list result sets. Defaults to latest if not specified.
        Boolean includePreviousRuns = false; // Boolean | When true, each item's previousRuns array is populated with prior run snapshots. Defaults to false.
        String page = "page_example"; // String | The pagination token to use to continue listing result sets from a previous call. If a pagination token is provided the filter and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names suffixed by \" ASC\" or \" DESC\".
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfRecResultSet result = apiInstance.listRecResultSets(asAt, includePreviousRuns, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfRecResultSet result = apiInstance.listRecResultSets(asAt, includePreviousRuns, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#listRecResultSets");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list result sets. Defaults to latest if not specified. | [optional] |
| **includePreviousRuns** | **Boolean**| When true, each item&#39;s previousRuns array is populated with prior run snapshots. Defaults to false. | [optional] [default to false] |
| **page** | **String**| The pagination token to use to continue listing result sets from a previous call. If a pagination token is provided the filter and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfRecResultSet**](PagedResourceListOfRecResultSet.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The rec result sets. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## submitRecResultSetReview

> RecResultSet submitRecResultSetReview(entityUniqueId, submitRecResultSetReviewRequest)

[EXPERIMENTAL] SubmitRecResultSetReview: Submit a rec result set review for approval, or resubmit after addressing requested revisions.

Submit a rec result set review for approval, or resubmit after addressing requested revisions.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RecsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

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
        // RecsApi apiInstance = apiFactory.build(RecsApi.class);

        RecsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RecsApi.class);
        String entityUniqueId = "entityUniqueId_example"; // String | The entity unique id of the rec result set (its version.entityUniqueId).
        SubmitRecResultSetReviewRequest submitRecResultSetReviewRequest = new SubmitRecResultSetReviewRequest(); // SubmitRecResultSetReviewRequest | The submission request.
        try {
            // uncomment the below to set overrides at the request level
            // RecResultSet result = apiInstance.submitRecResultSetReview(entityUniqueId, submitRecResultSetReviewRequest).execute(opts);

            RecResultSet result = apiInstance.submitRecResultSetReview(entityUniqueId, submitRecResultSetReviewRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#submitRecResultSetReview");
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
| **entityUniqueId** | **String**| The entity unique id of the rec result set (its version.entityUniqueId). | |
| **submitRecResultSetReviewRequest** | [**SubmitRecResultSetReviewRequest**](SubmitRecResultSetReviewRequest.md)| The submission request. | |

### Return type

[**RecResultSet**](RecResultSet.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated rec result set. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## transitionRecInstance

> RecInstance transitionRecInstance(instanceIdType, instanceIdValue, transitionRecInstanceRequest)

[EXPERIMENTAL] TransitionRecInstance: TransitionRecInstance

Apply a lifecycle transition (re-run, lock or unlock) to a rec instance.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RecsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

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
        // RecsApi apiInstance = apiFactory.build(RecsApi.class);

        RecsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RecsApi.class);
        String instanceIdType = "instanceIdType_example"; // String | How the instance was created: \"WorkflowServiceTaskId\" or \"Manual\". Available values: WorkflowServiceTaskId, Manual.
        String instanceIdValue = "instanceIdValue_example"; // String | The instance identifier value (a GUID).
        TransitionRecInstanceRequest transitionRecInstanceRequest = new TransitionRecInstanceRequest(); // TransitionRecInstanceRequest | The transition request.
        try {
            // uncomment the below to set overrides at the request level
            // RecInstance result = apiInstance.transitionRecInstance(instanceIdType, instanceIdValue, transitionRecInstanceRequest).execute(opts);

            RecInstance result = apiInstance.transitionRecInstance(instanceIdType, instanceIdValue, transitionRecInstanceRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#transitionRecInstance");
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
| **instanceIdType** | **String**| How the instance was created: \&quot;WorkflowServiceTaskId\&quot; or \&quot;Manual\&quot;. Available values: WorkflowServiceTaskId, Manual. | |
| **instanceIdValue** | **String**| The instance identifier value (a GUID). | |
| **transitionRecInstanceRequest** | [**TransitionRecInstanceRequest**](TransitionRecInstanceRequest.md)| The transition request. | |

### Return type

[**RecInstance**](RecInstance.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The rec instance in its post-transition state. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

