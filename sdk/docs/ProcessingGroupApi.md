# ProcessingGroupApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProcessingGroup**](ProcessingGroupApi.md#createProcessingGroup) | **POST** /api/processinggroups/{scope} | [EXPERIMENTAL] CreateProcessingGroup: Create a Processing Group. |
| [**deleteProcessingGroup**](ProcessingGroupApi.md#deleteProcessingGroup) | **DELETE** /api/processinggroups/{scope}/{code} | [EXPERIMENTAL] DeleteProcessingGroup: Delete a Processing Group. |
| [**getProcessingGroup**](ProcessingGroupApi.md#getProcessingGroup) | **GET** /api/processinggroups/{scope}/{code} | [EXPERIMENTAL] GetProcessingGroup: Get a Processing Group. |
| [**getProcessingGroupNextScheduledDetails**](ProcessingGroupApi.md#getProcessingGroupNextScheduledDetails) | **GET** /api/processinggroups/{scope}/{code}/schedule/$next | [EXPERIMENTAL] GetProcessingGroupNextScheduledDetails: Get the next scheduled date of a Processing Group. |
| [**getResolvedProcessingGroupSchedule**](ProcessingGroupApi.md#getResolvedProcessingGroupSchedule) | **GET** /api/processinggroups/{scope}/{code}/schedule/$dates | [EXPERIMENTAL] GetResolvedProcessingGroupSchedule: Get the resolved schedule of a Processing Group. |
| [**listProcessingGroups**](ProcessingGroupApi.md#listProcessingGroups) | **GET** /api/processinggroups | [EXPERIMENTAL] ListProcessingGroups: List Processing Groups. |
| [**patchProcessingGroup**](ProcessingGroupApi.md#patchProcessingGroup) | **PATCH** /api/processinggroups/{scope}/{code} | [EXPERIMENTAL] PatchProcessingGroup: Patch a Processing Group. |



## createProcessingGroup

> ProcessingGroup createProcessingGroup(scope, processingGroupRequest)

[EXPERIMENTAL] CreateProcessingGroup: Create a Processing Group.

Create the given Processing Group.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ProcessingGroupApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ProcessingGroupApiExample {

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
        // ProcessingGroupApi apiInstance = apiFactory.build(ProcessingGroupApi.class);

        ProcessingGroupApi apiInstance = ApiFactoryBuilder.build(fileName).build(ProcessingGroupApi.class);
        String scope = "scope_example"; // String | The scope of the Processing Group.
        ProcessingGroupRequest processingGroupRequest = new ProcessingGroupRequest(); // ProcessingGroupRequest | The definition of the Processing Group.
        try {
            // uncomment the below to set overrides at the request level
            // ProcessingGroup result = apiInstance.createProcessingGroup(scope, processingGroupRequest).execute(opts);

            ProcessingGroup result = apiInstance.createProcessingGroup(scope, processingGroupRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessingGroupApi#createProcessingGroup");
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
| **scope** | **String**| The scope of the Processing Group. | |
| **processingGroupRequest** | [**ProcessingGroupRequest**](ProcessingGroupRequest.md)| The definition of the Processing Group. | |

### Return type

[**ProcessingGroup**](ProcessingGroup.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Processing Group. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteProcessingGroup

> DeletedEntityResponse deleteProcessingGroup(scope, code)

[EXPERIMENTAL] DeleteProcessingGroup: Delete a Processing Group.

Delete the given Processing Group.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ProcessingGroupApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ProcessingGroupApiExample {

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
        // ProcessingGroupApi apiInstance = apiFactory.build(ProcessingGroupApi.class);

        ProcessingGroupApi apiInstance = ApiFactoryBuilder.build(fileName).build(ProcessingGroupApi.class);
        String scope = "scope_example"; // String | The scope of the Processing Group to be deleted.
        String code = "code_example"; // String | The code of the Processing Group to be deleted. Together with the scope this uniquely identifies the Processing Group.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteProcessingGroup(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteProcessingGroup(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessingGroupApi#deleteProcessingGroup");
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
| **scope** | **String**| The scope of the Processing Group to be deleted. | |
| **code** | **String**| The code of the Processing Group to be deleted. Together with the scope this uniquely identifies the Processing Group. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the Processing Group was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getProcessingGroup

> ProcessingGroup getProcessingGroup(scope, code, effectiveAt, asAt)

[EXPERIMENTAL] GetProcessingGroup: Get a Processing Group.

Retrieve the definition of a particular Processing Group, including the resolved (executed) contents  of its referenced reference list.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ProcessingGroupApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ProcessingGroupApiExample {

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
        // ProcessingGroupApi apiInstance = apiFactory.build(ProcessingGroupApi.class);

        ProcessingGroupApi apiInstance = ApiFactoryBuilder.build(fileName).build(ProcessingGroupApi.class);
        String scope = "scope_example"; // String | The scope of the Processing Group.
        String code = "code_example"; // String | The code of the Processing Group. Together with the scope this uniquely identifies the Processing Group.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Processing Group. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Processing Group. Defaults to returning the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // ProcessingGroup result = apiInstance.getProcessingGroup(scope, code, effectiveAt, asAt).execute(opts);

            ProcessingGroup result = apiInstance.getProcessingGroup(scope, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessingGroupApi#getProcessingGroup");
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
| **scope** | **String**| The scope of the Processing Group. | |
| **code** | **String**| The code of the Processing Group. Together with the scope this uniquely identifies the Processing Group. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Processing Group. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Processing Group. Defaults to returning the latest version if not specified. | [optional] |

### Return type

[**ProcessingGroup**](ProcessingGroup.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Processing Group definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getProcessingGroupNextScheduledDetails

> ProcessingGroupNextScheduledDetails getProcessingGroupNextScheduledDetails(scope, code, effectiveAt, asAt)

[EXPERIMENTAL] GetProcessingGroupNextScheduledDetails: Get the next scheduled date of a Processing Group.

Return the first execution date strictly after the given date, bounded by the schedule&#39;s end,  together with the reference list resolved at that date.  Returns 404 if the schedule has no further dates or the referenced reference list no longer exists,  and fails rather than returning a date without a list if the list cannot be resolved.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ProcessingGroupApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ProcessingGroupApiExample {

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
        // ProcessingGroupApi apiInstance = apiFactory.build(ProcessingGroupApi.class);

        ProcessingGroupApi apiInstance = ApiFactoryBuilder.build(fileName).build(ProcessingGroupApi.class);
        String scope = "scope_example"; // String | The scope of the Processing Group.
        String code = "code_example"; // String | The code of the Processing Group.
        String effectiveAt = "effectiveAt_example"; // String | The date after which to find the next scheduled date.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to read the Processing Group and its holiday calendars.
        try {
            // uncomment the below to set overrides at the request level
            // ProcessingGroupNextScheduledDetails result = apiInstance.getProcessingGroupNextScheduledDetails(scope, code, effectiveAt, asAt).execute(opts);

            ProcessingGroupNextScheduledDetails result = apiInstance.getProcessingGroupNextScheduledDetails(scope, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessingGroupApi#getProcessingGroupNextScheduledDetails");
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
| **scope** | **String**| The scope of the Processing Group. | |
| **code** | **String**| The code of the Processing Group. | |
| **effectiveAt** | **String**| The date after which to find the next scheduled date. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to read the Processing Group and its holiday calendars. | [optional] |

### Return type

[**ProcessingGroupNextScheduledDetails**](ProcessingGroupNextScheduledDetails.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The next scheduled date and the resolved reference list. |  -  |
| **404** | The schedule has no date after the given date, or the referenced reference list does not exist. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getResolvedProcessingGroupSchedule

> List&lt;OffsetDateTime&gt; getResolvedProcessingGroupSchedule(scope, code, fromEffectiveAt, toEffectiveAt, asAt)

[EXPERIMENTAL] GetResolvedProcessingGroupSchedule: Get the resolved schedule of a Processing Group.

Resolve the Processing Group&#39;s schedule into the concrete set of execution dates that fall within the  given range, applying its tenor, roll convention, business-day convention and holiday calendars.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ProcessingGroupApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ProcessingGroupApiExample {

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
        // ProcessingGroupApi apiInstance = apiFactory.build(ProcessingGroupApi.class);

        ProcessingGroupApi apiInstance = ApiFactoryBuilder.build(fileName).build(ProcessingGroupApi.class);
        String scope = "scope_example"; // String | The scope of the Processing Group.
        String code = "code_example"; // String | The code of the Processing Group.
        String fromEffectiveAt = "fromEffectiveAt_example"; // String | The inclusive start of the date range over which to resolve the schedule.
        String toEffectiveAt = "toEffectiveAt_example"; // String | The inclusive end of the date range over which to resolve the schedule.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to read the Processing Group and its holiday calendars.
        try {
            // uncomment the below to set overrides at the request level
            // List<OffsetDateTime> result = apiInstance.getResolvedProcessingGroupSchedule(scope, code, fromEffectiveAt, toEffectiveAt, asAt).execute(opts);

            List<OffsetDateTime> result = apiInstance.getResolvedProcessingGroupSchedule(scope, code, fromEffectiveAt, toEffectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessingGroupApi#getResolvedProcessingGroupSchedule");
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
| **scope** | **String**| The scope of the Processing Group. | |
| **code** | **String**| The code of the Processing Group. | |
| **fromEffectiveAt** | **String**| The inclusive start of the date range over which to resolve the schedule. | |
| **toEffectiveAt** | **String**| The inclusive end of the date range over which to resolve the schedule. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to read the Processing Group and its holiday calendars. | [optional] |

### Return type

[**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The resolved schedule dates within the range. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listProcessingGroups

> PagedResourceListOfProcessingGroup listProcessingGroups(effectiveAt, asAt, page, limit, filter, sortBy)

[EXPERIMENTAL] ListProcessingGroups: List Processing Groups.

List all the Processing Groups matching particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ProcessingGroupApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ProcessingGroupApiExample {

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
        // ProcessingGroupApi apiInstance = apiFactory.build(ProcessingGroupApi.class);

        ProcessingGroupApi apiInstance = ApiFactoryBuilder.build(fileName).build(ProcessingGroupApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the Processing Groups.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Processing Groups.
        String page = "page_example"; // String | The pagination token to use to continue listing Processing Groups.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfProcessingGroup result = apiInstance.listProcessingGroups(effectiveAt, asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfProcessingGroup result = apiInstance.listProcessingGroups(effectiveAt, asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessingGroupApi#listProcessingGroups");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the Processing Groups. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Processing Groups. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Processing Groups. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfProcessingGroup**](PagedResourceListOfProcessingGroup.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Processing Groups. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## patchProcessingGroup

> ProcessingGroup patchProcessingGroup(scope, code, operation)

[EXPERIMENTAL] PatchProcessingGroup: Patch a Processing Group.

Create or update certain fields (display name, description, schedule) for a particular Processing Group.  The behaviour is defined by the JSON Patch specification.    Currently supported fields are: DisplayName, Description, Schedule, WorkflowId, ListExceptionFilter.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ProcessingGroupApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ProcessingGroupApiExample {

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
        // ProcessingGroupApi apiInstance = apiFactory.build(ProcessingGroupApi.class);

        ProcessingGroupApi apiInstance = ApiFactoryBuilder.build(fileName).build(ProcessingGroupApi.class);
        String scope = "scope_example"; // String | The scope of the Processing Group.
        String code = "code_example"; // String | The code of the Processing Group. Together with the scope this uniquely identifies the Processing Group.
        List<Operation> operation = Arrays.asList(); // List<Operation> | The json patch document. For more information see: https://datatracker.ietf.org/doc/html/rfc6902.
        try {
            // uncomment the below to set overrides at the request level
            // ProcessingGroup result = apiInstance.patchProcessingGroup(scope, code, operation).execute(opts);

            ProcessingGroup result = apiInstance.patchProcessingGroup(scope, code, operation).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessingGroupApi#patchProcessingGroup");
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
| **scope** | **String**| The scope of the Processing Group. | |
| **code** | **String**| The code of the Processing Group. Together with the scope this uniquely identifies the Processing Group. | |
| **operation** | [**List&lt;Operation&gt;**](Operation.md)| The json patch document. For more information see: https://datatracker.ietf.org/doc/html/rfc6902. | |

### Return type

[**ProcessingGroup**](ProcessingGroup.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly patched Processing Group |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

