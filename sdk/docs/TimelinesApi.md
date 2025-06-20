# TimelinesApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createClosedPeriod**](TimelinesApi.md#createClosedPeriod) | **POST** /api/timelines/{scope}/{code}/closedperiods | [EXPERIMENTAL] CreateClosedPeriod: Create a new closed period against a timeline entity |
| [**createTimeline**](TimelinesApi.md#createTimeline) | **POST** /api/timelines | [EXPERIMENTAL] CreateTimeline: Create a Timeline |
| [**deleteTimeline**](TimelinesApi.md#deleteTimeline) | **DELETE** /api/timelines/{scope}/{code} | [EXPERIMENTAL] DeleteTimeline: Deletes a particular Timeline |
| [**getClosedPeriod**](TimelinesApi.md#getClosedPeriod) | **GET** /api/timelines/{scope}/{code}/closedperiods/{closedPeriodId} | [EXPERIMENTAL] GetClosedPeriod: Gets a Closed Period entity. |
| [**getTimeline**](TimelinesApi.md#getTimeline) | **GET** /api/timelines/{scope}/{code} | [EXPERIMENTAL] GetTimeline: Get a single Timeline by scope and code. |
| [**listClosedPeriods**](TimelinesApi.md#listClosedPeriods) | **GET** /api/timelines/{scope}/{code}/closedperiods | [EXPERIMENTAL] ListClosedPeriods: List ClosedPeriods for a specified Timeline. |
| [**listTimelines**](TimelinesApi.md#listTimelines) | **GET** /api/timelines | [EXPERIMENTAL] ListTimelines: List Timelines |
| [**setPostCloseActivity**](TimelinesApi.md#setPostCloseActivity) | **POST** /api/timelines/{scope}/{code}/closedperiods/{closedPeriodId}/postcloseactivity | [EXPERIMENTAL] SetPostCloseActivity: Sets post close activities to a closed period. |
| [**updateTimeline**](TimelinesApi.md#updateTimeline) | **PUT** /api/timelines/{scope}/{code} | [EXPERIMENTAL] UpdateTimeline: Update Timeline defined by scope and code |



## createClosedPeriod

> ClosedPeriod createClosedPeriod(scope, code, createClosedPeriodRequest)

[EXPERIMENTAL] CreateClosedPeriod: Create a new closed period against a timeline entity

Creates a new closed period against a timeline entity  Returns the newly created closed period entity with properties

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TimelinesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TimelinesApiExample {

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
        // TimelinesApi apiInstance = apiFactory.build(TimelinesApi.class);

        TimelinesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TimelinesApi.class);
        String scope = "scope_example"; // String | The scope of the specified Timeline.
        String code = "code_example"; // String | The code of the specified Timeline. Together with the domain and scope this uniquely identifies the Timeline.
        CreateClosedPeriodRequest createClosedPeriodRequest = new CreateClosedPeriodRequest(); // CreateClosedPeriodRequest | The request containing the details of the Closed Period
        try {
            // uncomment the below to set overrides at the request level
            // ClosedPeriod result = apiInstance.createClosedPeriod(scope, code, createClosedPeriodRequest).execute(opts);

            ClosedPeriod result = apiInstance.createClosedPeriod(scope, code, createClosedPeriodRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TimelinesApi#createClosedPeriod");
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
| **scope** | **String**| The scope of the specified Timeline. | |
| **code** | **String**| The code of the specified Timeline. Together with the domain and scope this uniquely identifies the Timeline. | |
| **createClosedPeriodRequest** | [**CreateClosedPeriodRequest**](CreateClosedPeriodRequest.md)| The request containing the details of the Closed Period | [optional] |

### Return type

[**ClosedPeriod**](ClosedPeriod.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created closed period |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createTimeline

> Timeline createTimeline(createTimelineRequest)

[EXPERIMENTAL] CreateTimeline: Create a Timeline

Creates a Timeline. Returns the created Timeline at the current effectiveAt.  Note that Timelines are mono-temporal, however they can have Time-Variant Properties.  Upserted Properties will be returned at the latest AsAt and EffectiveAt

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TimelinesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TimelinesApiExample {

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
        // TimelinesApi apiInstance = apiFactory.build(TimelinesApi.class);

        TimelinesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TimelinesApi.class);
        CreateTimelineRequest createTimelineRequest = new CreateTimelineRequest(); // CreateTimelineRequest | The request containing the details of the Timeline
        try {
            // uncomment the below to set overrides at the request level
            // Timeline result = apiInstance.createTimeline(createTimelineRequest).execute(opts);

            Timeline result = apiInstance.createTimeline(createTimelineRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TimelinesApi#createTimeline");
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
| **createTimelineRequest** | [**CreateTimelineRequest**](CreateTimelineRequest.md)| The request containing the details of the Timeline | [optional] |

### Return type

[**Timeline**](Timeline.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created Timeline |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteTimeline

> DeletedEntityResponse deleteTimeline(scope, code)

[EXPERIMENTAL] DeleteTimeline: Deletes a particular Timeline

The deletion will take effect from the Timeline deletion datetime.  i.e. will no longer exist at any asAt datetime after the asAt datetime of deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TimelinesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TimelinesApiExample {

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
        // TimelinesApi apiInstance = apiFactory.build(TimelinesApi.class);

        TimelinesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TimelinesApi.class);
        String scope = "scope_example"; // String | The scope of the specified Timeline.
        String code = "code_example"; // String | The code of the specified Timeline. Together with the domain and scope this uniquely   identifies the Timeline.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteTimeline(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteTimeline(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TimelinesApi#deleteTimeline");
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
| **scope** | **String**| The scope of the specified Timeline. | |
| **code** | **String**| The code of the specified Timeline. Together with the domain and scope this uniquely   identifies the Timeline. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The deleted entity metadata |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getClosedPeriod

> ClosedPeriod getClosedPeriod(scope, code, closedPeriodId, asAt, propertyKeys)

[EXPERIMENTAL] GetClosedPeriod: Gets a Closed Period entity.

Retrieves one ClosedPeriod uniquely defined by the Timelines Scope/Code and a ClosedPeriodId.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TimelinesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TimelinesApiExample {

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
        // TimelinesApi apiInstance = apiFactory.build(TimelinesApi.class);

        TimelinesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TimelinesApi.class);
        String scope = "scope_example"; // String | The scope of the Timeline.
        String code = "code_example"; // String | The code of the Timeline. Together with the scope this uniquely   identifies the Timeline.
        String closedPeriodId = "closedPeriodId_example"; // String | The id of the Closed Period. Together with the scope and code of the Timeline,   this uniquely identifies the ClosedPeriod
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the ClosedPeriod definition. Defaults to return   the latest version of the definition if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'ClosedPeriod' domain to decorate onto   the ClosedPeriod.   These must have the format {domain}/{scope}/{code}, for example 'ClosedPeriod/system/Name'.
        try {
            // uncomment the below to set overrides at the request level
            // ClosedPeriod result = apiInstance.getClosedPeriod(scope, code, closedPeriodId, asAt, propertyKeys).execute(opts);

            ClosedPeriod result = apiInstance.getClosedPeriod(scope, code, closedPeriodId, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TimelinesApi#getClosedPeriod");
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
| **scope** | **String**| The scope of the Timeline. | |
| **code** | **String**| The code of the Timeline. Together with the scope this uniquely   identifies the Timeline. | |
| **closedPeriodId** | **String**| The id of the Closed Period. Together with the scope and code of the Timeline,   this uniquely identifies the ClosedPeriod | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the ClosedPeriod definition. Defaults to return   the latest version of the definition if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;ClosedPeriod&#39; domain to decorate onto   the ClosedPeriod.   These must have the format {domain}/{scope}/{code}, for example &#39;ClosedPeriod/system/Name&#39;. | [optional] |

### Return type

[**ClosedPeriod**](ClosedPeriod.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested closed period |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTimeline

> Timeline getTimeline(scope, code, asAt, effectiveAt, propertyKeys)

[EXPERIMENTAL] GetTimeline: Get a single Timeline by scope and code.

Retrieves one Timeline by scope and code.  Timelines are mono-temporal. The EffectiveAt is only applied to Time-Variant Properties.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TimelinesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TimelinesApiExample {

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
        // TimelinesApi apiInstance = apiFactory.build(TimelinesApi.class);

        TimelinesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TimelinesApi.class);
        String scope = "scope_example"; // String | The scope of the specified Timeline.
        String code = "code_example"; // String | The code of the specified Timeline. Together with the scope this uniquely   identifies the Timeline.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Timeline definition. Defaults to return   the latest version of the definition if not specified.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the timeline properties.   Defaults to the current LUSID system datetime if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Timeline' domain to decorate onto   the Timeline.   These must have the format {domain}/{scope}/{code}, for example 'Timeline/system/Name'.
        try {
            // uncomment the below to set overrides at the request level
            // Timeline result = apiInstance.getTimeline(scope, code, asAt, effectiveAt, propertyKeys).execute(opts);

            Timeline result = apiInstance.getTimeline(scope, code, asAt, effectiveAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TimelinesApi#getTimeline");
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
| **scope** | **String**| The scope of the specified Timeline. | |
| **code** | **String**| The code of the specified Timeline. Together with the scope this uniquely   identifies the Timeline. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Timeline definition. Defaults to return   the latest version of the definition if not specified. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the timeline properties.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Timeline&#39; domain to decorate onto   the Timeline.   These must have the format {domain}/{scope}/{code}, for example &#39;Timeline/system/Name&#39;. | [optional] |

### Return type

[**Timeline**](Timeline.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Timeline |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listClosedPeriods

> PagedResourceListOfClosedPeriod listClosedPeriods(scope, code, asAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListClosedPeriods: List ClosedPeriods for a specified Timeline.

List all the ClosedPeriods matching a particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TimelinesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TimelinesApiExample {

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
        // TimelinesApi apiInstance = apiFactory.build(TimelinesApi.class);

        TimelinesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TimelinesApi.class);
        String scope = "scope_example"; // String | The scope of the Timeline.
        String code = "code_example"; // String | The code of the Timeline.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the ClosedPeriods. Defaults to returning the latest version of each ClosedPeriod if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing ClosedPeriods; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the effectiveEnd, specify \"effectiveEnd gt 2019-01-15T10:00:00\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'ClosedPeriod' domain to decorate onto each ClosedPeriod.   These must take the format {domain}/{scope}/{code}, for example 'ClosedPeriod/Account/id'.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfClosedPeriod result = apiInstance.listClosedPeriods(scope, code, asAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            PagedResourceListOfClosedPeriod result = apiInstance.listClosedPeriods(scope, code, asAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TimelinesApi#listClosedPeriods");
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
| **scope** | **String**| The scope of the Timeline. | |
| **code** | **String**| The code of the Timeline. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the ClosedPeriods. Defaults to returning the latest version of each ClosedPeriod if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing ClosedPeriods; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the effectiveEnd, specify \&quot;effectiveEnd gt 2019-01-15T10:00:00\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;ClosedPeriod&#39; domain to decorate onto each ClosedPeriod.   These must take the format {domain}/{scope}/{code}, for example &#39;ClosedPeriod/Account/id&#39;. | [optional] |

### Return type

[**PagedResourceListOfClosedPeriod**](PagedResourceListOfClosedPeriod.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested ClosedPeriods. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listTimelines

> PagedResourceListOfTimeline listTimelines(asAt, effectiveAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListTimelines: List Timelines

List all the Timelines matching a particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TimelinesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TimelinesApiExample {

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
        // TimelinesApi apiInstance = apiFactory.build(TimelinesApi.class);

        TimelinesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TimelinesApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Timelines. Defaults to returning the latest version of each Timeline if not specified.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the Timelines.   Note that Timelines are monotemporal, the effectiveAt is for Timevariant Properties on the Timeline only.   Defaults to the current LUSID system datetime if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Timelines; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the displayName, specify \"displayName eq 'AccountingTimeline'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Timeline' domain to decorate onto each Timeline.   These must take the format {domain}/{scope}/{code}, for example 'Timeline/Account/id'.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfTimeline result = apiInstance.listTimelines(asAt, effectiveAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            PagedResourceListOfTimeline result = apiInstance.listTimelines(asAt, effectiveAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TimelinesApi#listTimelines");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Timelines. Defaults to returning the latest version of each Timeline if not specified. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the Timelines.   Note that Timelines are monotemporal, the effectiveAt is for Timevariant Properties on the Timeline only.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Timelines; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the displayName, specify \&quot;displayName eq &#39;AccountingTimeline&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Timeline&#39; domain to decorate onto each Timeline.   These must take the format {domain}/{scope}/{code}, for example &#39;Timeline/Account/id&#39;. | [optional] |

### Return type

[**PagedResourceListOfTimeline**](PagedResourceListOfTimeline.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Timelines. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setPostCloseActivity

> ClosedPeriod setPostCloseActivity(scope, code, closedPeriodId, postCloseActivitiesRequest)

[EXPERIMENTAL] SetPostCloseActivity: Sets post close activities to a closed period.

Sets empty or more post close activities to the specific closed period.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TimelinesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TimelinesApiExample {

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
        // TimelinesApi apiInstance = apiFactory.build(TimelinesApi.class);

        TimelinesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TimelinesApi.class);
        String scope = "scope_example"; // String | The scope of the Timeline.
        String code = "code_example"; // String | The code of the Timeline.
        String closedPeriodId = "closedPeriodId_example"; // String | The id of the Closed Period. Together with the scope and code of the Timeline,   this uniquely identifies the ClosedPeriod
        PostCloseActivitiesRequest postCloseActivitiesRequest = new PostCloseActivitiesRequest(); // PostCloseActivitiesRequest | Specifies collection of post close activities
        try {
            // uncomment the below to set overrides at the request level
            // ClosedPeriod result = apiInstance.setPostCloseActivity(scope, code, closedPeriodId, postCloseActivitiesRequest).execute(opts);

            ClosedPeriod result = apiInstance.setPostCloseActivity(scope, code, closedPeriodId, postCloseActivitiesRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TimelinesApi#setPostCloseActivity");
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
| **scope** | **String**| The scope of the Timeline. | |
| **code** | **String**| The code of the Timeline. | |
| **closedPeriodId** | **String**| The id of the Closed Period. Together with the scope and code of the Timeline,   this uniquely identifies the ClosedPeriod | |
| **postCloseActivitiesRequest** | [**PostCloseActivitiesRequest**](PostCloseActivitiesRequest.md)| Specifies collection of post close activities | [optional] |

### Return type

[**ClosedPeriod**](ClosedPeriod.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated closed period |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateTimeline

> Timeline updateTimeline(scope, code, updateTimelineRequest)

[EXPERIMENTAL] UpdateTimeline: Update Timeline defined by scope and code

Overwrites an existing Timeline  Update request has the same required fields as Create apart from the id.  Returns the updated Timeline at the current effectiveAt.  Note that Timelines are mono-temporal, however they can have Time-Variant Properties.  Updated Properties will be returned at the latest AsAt and EffectiveAt

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TimelinesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TimelinesApiExample {

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
        // TimelinesApi apiInstance = apiFactory.build(TimelinesApi.class);

        TimelinesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TimelinesApi.class);
        String scope = "scope_example"; // String | The scope of the specified Timeline.
        String code = "code_example"; // String | The code of the specified Timeline. Together with the domain and scope this uniquely identifies the Timeline.
        UpdateTimelineRequest updateTimelineRequest = new UpdateTimelineRequest(); // UpdateTimelineRequest | The request containing the updated details of the Timeline
        try {
            // uncomment the below to set overrides at the request level
            // Timeline result = apiInstance.updateTimeline(scope, code, updateTimelineRequest).execute(opts);

            Timeline result = apiInstance.updateTimeline(scope, code, updateTimelineRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TimelinesApi#updateTimeline");
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
| **scope** | **String**| The scope of the specified Timeline. | |
| **code** | **String**| The code of the specified Timeline. Together with the domain and scope this uniquely identifies the Timeline. | |
| **updateTimelineRequest** | [**UpdateTimelineRequest**](UpdateTimelineRequest.md)| The request containing the updated details of the Timeline | [optional] |

### Return type

[**Timeline**](Timeline.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated version of the requested Timeline |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

