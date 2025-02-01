# AllocationsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAllocation**](AllocationsApi.md#deleteAllocation) | **DELETE** /api/allocations/{scope}/{code} | [EARLY ACCESS] DeleteAllocation: Delete allocation |
| [**getAllocation**](AllocationsApi.md#getAllocation) | **GET** /api/allocations/{scope}/{code} | [EARLY ACCESS] GetAllocation: Get Allocation |
| [**listAllocations**](AllocationsApi.md#listAllocations) | **GET** /api/allocations | ListAllocations: List Allocations |
| [**upsertAllocations**](AllocationsApi.md#upsertAllocations) | **POST** /api/allocations | UpsertAllocations: Upsert Allocations |



## deleteAllocation

> DeletedEntityResponse deleteAllocation(scope, code)

[EARLY ACCESS] DeleteAllocation: Delete allocation

Delete an allocation. Deletion will be valid from the allocation&#39;s creation datetime.  This means that the allocation will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationsApiExample {

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
        // AllocationsApi apiInstance = apiFactory.build(AllocationsApi.class);

        AllocationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationsApi.class);
        String scope = "scope_example"; // String | The allocation scope.
        String code = "code_example"; // String | The allocation's code. This, together with the scope uniquely identifies the allocation to delete.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteAllocation(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteAllocation(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationsApi#deleteAllocation");
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
| **scope** | **String**| The allocation scope. | |
| **code** | **String**| The allocation&#39;s code. This, together with the scope uniquely identifies the allocation to delete. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response from deleting an allocation. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getAllocation

> Allocation getAllocation(scope, code, asAt, propertyKeys)

[EARLY ACCESS] GetAllocation: Get Allocation

Fetch an Allocation matching the provided identifier

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationsApiExample {

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
        // AllocationsApi apiInstance = apiFactory.build(AllocationsApi.class);

        AllocationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationsApi.class);
        String scope = "scope_example"; // String | The scope to which the allocation belongs.
        String code = "code_example"; // String | The allocation's unique identifier.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the allocation. Defaults to return the latest version of the allocation if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Allocations\" domain to decorate onto the allocation.   These take the format {domain}/{scope}/{code} e.g. \"Allocations/system/Name\".
        try {
            // uncomment the below to set overrides at the request level
            // Allocation result = apiInstance.getAllocation(scope, code, asAt, propertyKeys).execute(opts);

            Allocation result = apiInstance.getAllocation(scope, code, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationsApi#getAllocation");
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
| **scope** | **String**| The scope to which the allocation belongs. | |
| **code** | **String**| The allocation&#39;s unique identifier. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the allocation. Defaults to return the latest version of the allocation if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Allocations\&quot; domain to decorate onto the allocation.   These take the format {domain}/{scope}/{code} e.g. \&quot;Allocations/system/Name\&quot;. | [optional] |

### Return type

[**Allocation**](Allocation.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The allocation matching the given identifier. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listAllocations

> PagedResourceListOfAllocation listAllocations(asAt, page, sortBy, limit, filter, propertyKeys)

ListAllocations: List Allocations

Fetch the last pre-AsAt date version of each allocation in scope (does not fetch the entire history).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationsApiExample {

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
        // AllocationsApi apiInstance = apiFactory.build(AllocationsApi.class);

        AllocationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the allocation. Defaults to return the latest version of the allocation if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing allocations from a previous call to list allocations.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Allocations\" domain to decorate onto each allocation.   These take the format {domain}/{scope}/{code} e.g. \"Allocations/system/Name\".   All properties, except derived properties, are returned by default, without specifying here.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfAllocation result = apiInstance.listAllocations(asAt, page, sortBy, limit, filter, propertyKeys).execute(opts);

            PagedResourceListOfAllocation result = apiInstance.listAllocations(asAt, page, sortBy, limit, filter, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationsApi#listAllocations");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the allocation. Defaults to return the latest version of the allocation if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing allocations from a previous call to list allocations.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Allocations\&quot; domain to decorate onto each allocation.   These take the format {domain}/{scope}/{code} e.g. \&quot;Allocations/system/Name\&quot;.   All properties, except derived properties, are returned by default, without specifying here. | [optional] |

### Return type

[**PagedResourceListOfAllocation**](PagedResourceListOfAllocation.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Allocations. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertAllocations

> ResourceListOfAllocation upsertAllocations(allocationSetRequest, verificationAsAt, retryWithoutChangedEntities)

UpsertAllocations: Upsert Allocations

Upsert; update existing allocations with given ids, or create new allocations otherwise.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationsApiExample {

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
        // AllocationsApi apiInstance = apiFactory.build(AllocationsApi.class);

        AllocationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationsApi.class);
        AllocationSetRequest allocationSetRequest = new AllocationSetRequest(); // AllocationSetRequest | The collection of allocation requests.
        OffsetDateTime verificationAsAt = OffsetDateTime.now(); // OffsetDateTime | An optional verification asAt; individual upserts will fail if an existing entity has been updated between the verification asAt and time of upsert.
        Boolean retryWithoutChangedEntities = false; // Boolean | Optionally choose to keep retrying upsert for remaining entities if some are being updated concurrently. If set to true, any entities that have   changed since the verificationAsAt will be dropped from the set of allocations to upsert and the upsert will be retried. The response will only contain the allocations in the original request   that have been successfully upserted.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfAllocation result = apiInstance.upsertAllocations(allocationSetRequest, verificationAsAt, retryWithoutChangedEntities).execute(opts);

            ResourceListOfAllocation result = apiInstance.upsertAllocations(allocationSetRequest, verificationAsAt, retryWithoutChangedEntities).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationsApi#upsertAllocations");
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
| **allocationSetRequest** | [**AllocationSetRequest**](AllocationSetRequest.md)| The collection of allocation requests. | |
| **verificationAsAt** | **OffsetDateTime**| An optional verification asAt; individual upserts will fail if an existing entity has been updated between the verification asAt and time of upsert. | [optional] |
| **retryWithoutChangedEntities** | **Boolean**| Optionally choose to keep retrying upsert for remaining entities if some are being updated concurrently. If set to true, any entities that have   changed since the verificationAsAt will be dropped from the set of allocations to upsert and the upsert will be retried. The response will only contain the allocations in the original request   that have been successfully upserted. | [optional] [default to false] |

### Return type

[**ResourceListOfAllocation**](ResourceListOfAllocation.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A collection of allocations. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

