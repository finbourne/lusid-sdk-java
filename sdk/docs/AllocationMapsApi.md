# AllocationMapsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAllocationMapException**](AllocationMapsApi.md#addAllocationMapException) | **POST** /api/allocationmaps/{scope}/{code}/exceptions | [EXPERIMENTAL] AddAllocationMapException: Add an exception to an Allocation Map. |
| [**createAllocationMap**](AllocationMapsApi.md#createAllocationMap) | **POST** /api/allocationmaps/{scope} | [EXPERIMENTAL] CreateAllocationMap: Create an Allocation Map. |
| [**deleteAllocationMap**](AllocationMapsApi.md#deleteAllocationMap) | **DELETE** /api/allocationmaps/{scope}/{code} | [EXPERIMENTAL] DeleteAllocationMap: Delete an Allocation Map. |
| [**getAllocationMap**](AllocationMapsApi.md#getAllocationMap) | **GET** /api/allocationmaps/{scope}/{code} | [EXPERIMENTAL] GetAllocationMap: Get an Allocation Map. |
| [**listAllocationMaps**](AllocationMapsApi.md#listAllocationMaps) | **GET** /api/allocationmaps | [EXPERIMENTAL] ListAllocationMaps: List Allocation Maps. |
| [**removeAllocationMapException**](AllocationMapsApi.md#removeAllocationMapException) | **DELETE** /api/allocationmaps/{scope}/{code}/exceptions/{investorRecordId} | [EXPERIMENTAL] RemoveAllocationMapException: Remove an exception from an Allocation Map. |
| [**resolveAllocationMap**](AllocationMapsApi.md#resolveAllocationMap) | **POST** /api/allocationmaps/{scope}/{code}/resolve | [EXPERIMENTAL] ResolveAllocationMap: Resolve an Allocation Map. |
| [**upsertAllocationMap**](AllocationMapsApi.md#upsertAllocationMap) | **PUT** /api/allocationmaps/{scope}/{code} | [EXPERIMENTAL] UpsertAllocationMap: Upsert an Allocation Map. |



## addAllocationMapException

> AllocationMap addAllocationMapException(scope, code, allocationMapException, effectiveAt)

[EXPERIMENTAL] AddAllocationMapException: Add an exception to an Allocation Map.

Add a per-investor exception (an exclusion or a fixed percentage) to the map&#39;s participants, from an  effective datetime. The result is a new bitemporal version of the map. An investor record may carry at most  one exception; to change it, remove the existing one first or upsert the whole map.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationMapsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationMapsApiExample {

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
        // AllocationMapsApi apiInstance = apiFactory.build(AllocationMapsApi.class);

        AllocationMapsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationMapsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Map.
        String code = "code_example"; // String | The code of the Allocation Map. Together with the scope this uniquely identifies the Allocation Map.
        AllocationMapException allocationMapException = new AllocationMapException(); // AllocationMapException | The exception to add.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label of the map version that gains the exception. Defaults to the exception's effectiveFrom when that is earlier than the current LUSID system datetime, and to the current LUSID system datetime otherwise. Refused if the map has any version starting after that datetime, including a re-save of the same definition, or a later deletion, since neither would carry the exception. Also refused, with the reason, if the defaulted effectiveFrom is before the map's first version.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationMap result = apiInstance.addAllocationMapException(scope, code, allocationMapException, effectiveAt).execute(opts);

            AllocationMap result = apiInstance.addAllocationMapException(scope, code, allocationMapException, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationMapsApi#addAllocationMapException");
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
| **scope** | **String**| The scope of the Allocation Map. | |
| **code** | **String**| The code of the Allocation Map. Together with the scope this uniquely identifies the Allocation Map. | |
| **allocationMapException** | [**AllocationMapException**](AllocationMapException.md)| The exception to add. | |
| **effectiveAt** | **String**| The effective datetime or cut label of the map version that gains the exception. Defaults to the exception&#39;s effectiveFrom when that is earlier than the current LUSID system datetime, and to the current LUSID system datetime otherwise. Refused if the map has any version starting after that datetime, including a re-save of the same definition, or a later deletion, since neither would carry the exception. Also refused, with the reason, if the defaulted effectiveFrom is before the map&#39;s first version. | [optional] |

### Return type

[**AllocationMap**](AllocationMap.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Allocation Map with the exception added. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createAllocationMap

> AllocationMap createAllocationMap(scope, allocationMapRequest)

[EXPERIMENTAL] CreateAllocationMap: Create an Allocation Map.

Create a new Allocation Map. The scope is provided in the route and the code in the request body. The map  names the structure member it hangs off, who participates, and the basis used to share each kind of event.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationMapsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationMapsApiExample {

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
        // AllocationMapsApi apiInstance = apiFactory.build(AllocationMapsApi.class);

        AllocationMapsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationMapsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Map.
        AllocationMapRequest allocationMapRequest = new AllocationMapRequest(); // AllocationMapRequest | The definition of the Allocation Map.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationMap result = apiInstance.createAllocationMap(scope, allocationMapRequest).execute(opts);

            AllocationMap result = apiInstance.createAllocationMap(scope, allocationMapRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationMapsApi#createAllocationMap");
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
| **scope** | **String**| The scope of the Allocation Map. | |
| **allocationMapRequest** | [**AllocationMapRequest**](AllocationMapRequest.md)| The definition of the Allocation Map. | |

### Return type

[**AllocationMap**](AllocationMap.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Allocation Map. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteAllocationMap

> DeletedEntityResponse deleteAllocationMap(scope, code, effectiveAt)

[EXPERIMENTAL] DeleteAllocationMap: Delete an Allocation Map.

Delete an Allocation Map from an effective datetime. The Allocation Map is no longer readable from that  effective datetime onwards.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationMapsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationMapsApiExample {

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
        // AllocationMapsApi apiInstance = apiFactory.build(AllocationMapsApi.class);

        AllocationMapsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationMapsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Map.
        String code = "code_example"; // String | The code of the Allocation Map. Together with the scope this uniquely identifies the Allocation Map.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the Allocation Map is deleted. Defaults to the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteAllocationMap(scope, code, effectiveAt).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteAllocationMap(scope, code, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationMapsApi#deleteAllocationMap");
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
| **scope** | **String**| The scope of the Allocation Map. | |
| **code** | **String**| The code of the Allocation Map. Together with the scope this uniquely identifies the Allocation Map. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the Allocation Map is deleted. Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the Allocation Map was deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getAllocationMap

> AllocationMap getAllocationMap(scope, code, effectiveAt, asAt)

[EXPERIMENTAL] GetAllocationMap: Get an Allocation Map.

Retrieve the definition of a particular Allocation Map at an effective and asAt datetime, including its  participants, exceptions and the basis declared for each event type.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationMapsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationMapsApiExample {

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
        // AllocationMapsApi apiInstance = apiFactory.build(AllocationMapsApi.class);

        AllocationMapsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationMapsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Map.
        String code = "code_example"; // String | The code of the Allocation Map. Together with the scope this uniquely identifies the Allocation Map.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Allocation Map. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Allocation Map. Defaults to returning the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationMap result = apiInstance.getAllocationMap(scope, code, effectiveAt, asAt).execute(opts);

            AllocationMap result = apiInstance.getAllocationMap(scope, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationMapsApi#getAllocationMap");
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
| **scope** | **String**| The scope of the Allocation Map. | |
| **code** | **String**| The code of the Allocation Map. Together with the scope this uniquely identifies the Allocation Map. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Allocation Map. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Allocation Map. Defaults to returning the latest version if not specified. | [optional] |

### Return type

[**AllocationMap**](AllocationMap.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Allocation Map. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listAllocationMaps

> PagedResourceListOfAllocationMap listAllocationMaps(effectiveAt, asAt, page, limit, filter, sortBy)

[EXPERIMENTAL] ListAllocationMaps: List Allocation Maps.

List all the Allocation Maps matching a particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationMapsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationMapsApiExample {

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
        // AllocationMapsApi apiInstance = apiFactory.build(AllocationMapsApi.class);

        AllocationMapsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationMapsApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the Allocation Maps. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Allocation Maps. Defaults to returning the latest version of each Allocation Map if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Allocation Maps; this value is returned from the previous call.   If a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. For example, to filter on the Allocation Map code, specify \"id.Code eq 'AllocationMap1'\".   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfAllocationMap result = apiInstance.listAllocationMaps(effectiveAt, asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfAllocationMap result = apiInstance.listAllocationMaps(effectiveAt, asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationMapsApi#listAllocationMaps");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the Allocation Maps. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Allocation Maps. Defaults to returning the latest version of each Allocation Map if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Allocation Maps; this value is returned from the previous call.   If a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. For example, to filter on the Allocation Map code, specify \&quot;id.Code eq &#39;AllocationMap1&#39;\&quot;.   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfAllocationMap**](PagedResourceListOfAllocationMap.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Allocation Maps. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## removeAllocationMapException

> AllocationMap removeAllocationMapException(scope, code, investorRecordId, effectiveAt)

[EXPERIMENTAL] RemoveAllocationMapException: Remove an exception from an Allocation Map.

Remove the exception held against an investor record, from an effective datetime. The result is a new  bitemporal version of the map in which that investor is treated like every other participant.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationMapsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationMapsApiExample {

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
        // AllocationMapsApi apiInstance = apiFactory.build(AllocationMapsApi.class);

        AllocationMapsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationMapsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Map.
        String code = "code_example"; // String | The code of the Allocation Map. Together with the scope this uniquely identifies the Allocation Map.
        String investorRecordId = "investorRecordId_example"; // String | The investor record whose exception is removed.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the exception no longer applies. Defaults to the current LUSID system datetime if not specified. Refused if the map has any version starting after that datetime, including a re-save of the same definition, which would still carry the exception, or a later deletion.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationMap result = apiInstance.removeAllocationMapException(scope, code, investorRecordId, effectiveAt).execute(opts);

            AllocationMap result = apiInstance.removeAllocationMapException(scope, code, investorRecordId, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationMapsApi#removeAllocationMapException");
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
| **scope** | **String**| The scope of the Allocation Map. | |
| **code** | **String**| The code of the Allocation Map. Together with the scope this uniquely identifies the Allocation Map. | |
| **investorRecordId** | **String**| The investor record whose exception is removed. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the exception no longer applies. Defaults to the current LUSID system datetime if not specified. Refused if the map has any version starting after that datetime, including a re-save of the same definition, which would still carry the exception, or a later deletion. | [optional] |

### Return type

[**AllocationMap**](AllocationMap.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Allocation Map with the exception removed. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## resolveAllocationMap

> AllocationMapResolution resolveAllocationMap(scope, code, allocationMapResolveRequest, effectiveAt, asAt)

[EXPERIMENTAL] ResolveAllocationMap: Resolve an Allocation Map.

Dry-run the map against an event: share the supplied amount across the participants in force at the  effective datetime, applying fixed-percentage exceptions off the top and the declared basis to the remainder.  Nothing is booked. Basis values (for example committed capital per investor) are supplied in the request  until the investor register can provide them.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationMapsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationMapsApiExample {

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
        // AllocationMapsApi apiInstance = apiFactory.build(AllocationMapsApi.class);

        AllocationMapsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationMapsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Map.
        String code = "code_example"; // String | The code of the Allocation Map. Together with the scope this uniquely identifies the Allocation Map.
        AllocationMapResolveRequest allocationMapResolveRequest = new AllocationMapResolveRequest(); // AllocationMapResolveRequest | The event to resolve and the basis values to use.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to resolve the map. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to read the map. Defaults to the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationMapResolution result = apiInstance.resolveAllocationMap(scope, code, allocationMapResolveRequest, effectiveAt, asAt).execute(opts);

            AllocationMapResolution result = apiInstance.resolveAllocationMap(scope, code, allocationMapResolveRequest, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationMapsApi#resolveAllocationMap");
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
| **scope** | **String**| The scope of the Allocation Map. | |
| **code** | **String**| The code of the Allocation Map. Together with the scope this uniquely identifies the Allocation Map. | |
| **allocationMapResolveRequest** | [**AllocationMapResolveRequest**](AllocationMapResolveRequest.md)| The event to resolve and the basis values to use. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to resolve the map. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to read the map. Defaults to the latest version if not specified. | [optional] |

### Return type

[**AllocationMapResolution**](AllocationMapResolution.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The resolved allocation. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertAllocationMap

> AllocationMap upsertAllocationMap(scope, code, allocationMapRequest)

[EXPERIMENTAL] UpsertAllocationMap: Upsert an Allocation Map.

Update or insert an Allocation Map. If the Allocation Map does not exist it is created, otherwise it is  updated. The code in the request body must match the code in the route.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationMapsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationMapsApiExample {

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
        // AllocationMapsApi apiInstance = apiFactory.build(AllocationMapsApi.class);

        AllocationMapsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationMapsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Map.
        String code = "code_example"; // String | The code of the Allocation Map. Together with the scope this uniquely identifies the Allocation Map.
        AllocationMapRequest allocationMapRequest = new AllocationMapRequest(); // AllocationMapRequest | The definition of the Allocation Map.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationMap result = apiInstance.upsertAllocationMap(scope, code, allocationMapRequest).execute(opts);

            AllocationMap result = apiInstance.upsertAllocationMap(scope, code, allocationMapRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationMapsApi#upsertAllocationMap");
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
| **scope** | **String**| The scope of the Allocation Map. | |
| **code** | **String**| The code of the Allocation Map. Together with the scope this uniquely identifies the Allocation Map. | |
| **allocationMapRequest** | [**AllocationMapRequest**](AllocationMapRequest.md)| The definition of the Allocation Map. | |

### Return type

[**AllocationMap**](AllocationMap.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The upserted Allocation Map. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

