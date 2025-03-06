# StagedModificationsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDecision**](StagedModificationsApi.md#addDecision) | **POST** /api/stagedmodifications/{id}/decision | AddDecision: AddDecision |
| [**getStagedModification**](StagedModificationsApi.md#getStagedModification) | **GET** /api/stagedmodifications/{id} | GetStagedModification: GetStagedModification |
| [**listRequestedChanges**](StagedModificationsApi.md#listRequestedChanges) | **GET** /api/stagedmodifications/{id}/requestedChanges | ListRequestedChanges: ListRequestedChanges |
| [**listStagedModifications**](StagedModificationsApi.md#listStagedModifications) | **GET** /api/stagedmodifications | ListStagedModifications: ListStagedModifications |



## addDecision

> StagedModification addDecision(id, stagedModificationDecisionRequest)

AddDecision: AddDecision

Add decision to staged modification, Approve or Reject.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.StagedModificationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class StagedModificationsApiExample {

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
        // StagedModificationsApi apiInstance = apiFactory.build(StagedModificationsApi.class);

        StagedModificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(StagedModificationsApi.class);
        String id = "id_example"; // String | Unique Id for a staged modification..
        StagedModificationDecisionRequest stagedModificationDecisionRequest = new StagedModificationDecisionRequest(); // StagedModificationDecisionRequest | The decision on the requested staged modification, \"Approve\" or \"Reject\".
        try {
            // uncomment the below to set overrides at the request level
            // StagedModification result = apiInstance.addDecision(id, stagedModificationDecisionRequest).execute(opts);

            StagedModification result = apiInstance.addDecision(id, stagedModificationDecisionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling StagedModificationsApi#addDecision");
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
| **id** | **String**| Unique Id for a staged modification.. | |
| **stagedModificationDecisionRequest** | [**StagedModificationDecisionRequest**](StagedModificationDecisionRequest.md)| The decision on the requested staged modification, \&quot;Approve\&quot; or \&quot;Reject\&quot;. | |

### Return type

[**StagedModification**](StagedModification.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The staged modification. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getStagedModification

> StagedModification getStagedModification(id, asAt)

GetStagedModification: GetStagedModification

Retrieve the details of a staged modification.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.StagedModificationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class StagedModificationsApiExample {

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
        // StagedModificationsApi apiInstance = apiFactory.build(StagedModificationsApi.class);

        StagedModificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(StagedModificationsApi.class);
        String id = "id_example"; // String | The unique identifier for a staged modification.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the staged modification. Defaults to latest if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // StagedModification result = apiInstance.getStagedModification(id, asAt).execute(opts);

            StagedModification result = apiInstance.getStagedModification(id, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling StagedModificationsApi#getStagedModification");
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
| **id** | **String**| The unique identifier for a staged modification. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the staged modification. Defaults to latest if not specified. | [optional] |

### Return type

[**StagedModification**](StagedModification.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested staged modification. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listRequestedChanges

> PagedResourceListOfStagedModificationsRequestedChangeInterval listRequestedChanges(id, asAt, page, limit, filter, sortBy)

ListRequestedChanges: ListRequestedChanges

List the requested changes for a staged modification.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.StagedModificationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class StagedModificationsApiExample {

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
        // StagedModificationsApi apiInstance = apiFactory.build(StagedModificationsApi.class);

        StagedModificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(StagedModificationsApi.class);
        String id = "id_example"; // String | Unique Id for a staged modification..
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list changes. Defaults to return the latest version   of each staged change if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing requested staged modification changes from a previous call to list requested   staged modifications. This value is returned from the previous call. If a pagination token is provided the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names suffixed by \" ASC\" or \" DESC\"
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfStagedModificationsRequestedChangeInterval result = apiInstance.listRequestedChanges(id, asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfStagedModificationsRequestedChangeInterval result = apiInstance.listRequestedChanges(id, asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling StagedModificationsApi#listRequestedChanges");
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
| **id** | **String**| Unique Id for a staged modification.. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list changes. Defaults to return the latest version   of each staged change if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing requested staged modification changes from a previous call to list requested   staged modifications. This value is returned from the previous call. If a pagination token is provided the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfStagedModificationsRequestedChangeInterval**](PagedResourceListOfStagedModificationsRequestedChangeInterval.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested changes in staged modification. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listStagedModifications

> PagedResourceListOfStagedModification listStagedModifications(asAt, page, limit, filter, sortBy)

ListStagedModifications: ListStagedModifications

List summaries of the staged modifications.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.StagedModificationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class StagedModificationsApiExample {

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
        // StagedModificationsApi apiInstance = apiFactory.build(StagedModificationsApi.class);

        StagedModificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(StagedModificationsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list staged modifications. Defaults to return the latest version   of each staged modification if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing staged modifications from a previous call to list staged modifications. This   value is returned from the previous call. If a pagination token is provided the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.    Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names suffixed by \" ASC\" or \" DESC\"
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfStagedModification result = apiInstance.listStagedModifications(asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfStagedModification result = apiInstance.listStagedModifications(asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling StagedModificationsApi#listStagedModifications");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list staged modifications. Defaults to return the latest version   of each staged modification if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing staged modifications from a previous call to list staged modifications. This   value is returned from the previous call. If a pagination token is provided the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.    Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfStagedModification**](PagedResourceListOfStagedModification.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List summary of staged modifications. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

