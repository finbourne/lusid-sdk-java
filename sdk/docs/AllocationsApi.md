# AllocationsApi

All URIs are relative to *http://local-unit-test-server.lusid.com:46255*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAllocation**](AllocationsApi.md#deleteAllocation) | **DELETE** /api/allocations/{scope}/{code} | [EARLY ACCESS] Delete allocation
[**getAllocation**](AllocationsApi.md#getAllocation) | **GET** /api/allocations/{scope}/{code} | [EARLY ACCESS] Get Allocation
[**listAllocations**](AllocationsApi.md#listAllocations) | **GET** /api/allocations | [EARLY ACCESS] List Allocations
[**upsertAllocations**](AllocationsApi.md#upsertAllocations) | **POST** /api/allocations | [EARLY ACCESS] Upsert Allocations


<a name="deleteAllocation"></a>
# **deleteAllocation**
> DeletedEntityResponse deleteAllocation(scope, code)

[EARLY ACCESS] Delete allocation

Delete an allocation. Deletion will be valid from the allocation&#39;s creation datetime.  This means that the allocation will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AllocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:46255");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AllocationsApi apiInstance = new AllocationsApi(defaultClient);
    String scope = "scope_example"; // String | The allocation scope.
    String code = "code_example"; // String | The allocation's code. This, together with the scope uniquely identifies the allocation to delete.
    try {
      DeletedEntityResponse result = apiInstance.deleteAllocation(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllocationsApi#deleteAllocation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The allocation scope. |
 **code** | **String**| The allocation&#39;s code. This, together with the scope uniquely identifies the allocation to delete. |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The response from deleting an allocation. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getAllocation"></a>
# **getAllocation**
> Allocation getAllocation(scope, code, asAt, propertyKeys)

[EARLY ACCESS] Get Allocation

Fetch an Allocation matching the provided identifier

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AllocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:46255");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AllocationsApi apiInstance = new AllocationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope to which the allocation belongs.
    String code = "code_example"; // String | The allocation's unique identifier.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the allocation. Defaults to return the latest version of the allocation if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Allocations\" domain to decorate onto the allocation.              These take the format {domain}/{scope}/{code} e.g. \"Allocations/system/Name\".
    try {
      Allocation result = apiInstance.getAllocation(scope, code, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllocationsApi#getAllocation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope to which the allocation belongs. |
 **code** | **String**| The allocation&#39;s unique identifier. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the allocation. Defaults to return the latest version of the allocation if not specified. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Allocations\&quot; domain to decorate onto the allocation.              These take the format {domain}/{scope}/{code} e.g. \&quot;Allocations/system/Name\&quot;. | [optional]

### Return type

[**Allocation**](Allocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The allocation matching the given identifier. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listAllocations"></a>
# **listAllocations**
> PagedResourceListOfAllocation listAllocations(asAt, page, sortBy, start, limit, filter, propertyKeys)

[EARLY ACCESS] List Allocations

Fetch the last pre-AsAt date version of each allocation in scope (does not fetch the entire history).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AllocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:46255");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AllocationsApi apiInstance = new AllocationsApi(defaultClient);
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the allocation. Defaults to return the latest version of the allocation if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing allocations from a previous call to list allocations.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided.
    List<String> sortBy = Arrays.asList(); // List<String> | Allocation the results by these fields. Use use the '-' sign to denote descending allocation e.g. -MyFieldName.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    String filter = "\"\""; // String | Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Allocations\" domain to decorate onto each allocation.                  These take the format {domain}/{scope}/{code} e.g. \"Allocations/system/Name\".
    try {
      PagedResourceListOfAllocation result = apiInstance.listAllocations(asAt, page, sortBy, start, limit, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllocationsApi#listAllocations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the allocation. Defaults to return the latest version of the allocation if not specified. | [optional]
 **page** | **String**| The pagination token to use to continue listing allocations from a previous call to list allocations.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Allocation the results by these fields. Use use the &#39;-&#39; sign to denote descending allocation e.g. -MyFieldName. | [optional]
 **start** | **Integer**| When paginating, skip this number of results. | [optional]
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid. | [optional] [default to &quot;&quot;]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Allocations\&quot; domain to decorate onto each allocation.                  These take the format {domain}/{scope}/{code} e.g. \&quot;Allocations/system/Name\&quot;. | [optional]

### Return type

[**PagedResourceListOfAllocation**](PagedResourceListOfAllocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Allocations. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertAllocations"></a>
# **upsertAllocations**
> ResourceListOfAllocation upsertAllocations(allocationSetRequest)

[EARLY ACCESS] Upsert Allocations

Upsert; update existing allocations with given ids, or create new allocations otherwise.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AllocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:46255");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AllocationsApi apiInstance = new AllocationsApi(defaultClient);
    AllocationSetRequest allocationSetRequest = {"allocationRequests":[{"properties":{"allocation/MyScope/SomeAllocationProperty":{"key":"Allocation/MyScope/SomeAllocationProperty","value":{"labelValue":"XYZ000034567"}}},"instrumentIdentifiers":{"instrument/default/Currency":"GBP"},"quantity":100,"portfolioId":{"scope":"MyScope","code":"UK Equity"},"allocatedOrderId":{"scope":"MyScope","code":"ORD00000123"},"id":{"scope":"MyScope","code":"ALLOC00000123"},"placementIds":[{"scope":"MyScope","code":"A placement"}],"state":"New","side":"Buy","type":"Limit","settlementDate":"2006-04-14T00:00:00.0000000+00:00","date":"2006-04-11T00:00:00.0000000+00:00","price":{"amount":12413.33,"currency":"USD"},"settlementCurrency":"USD","settlementCurrencyFxRate":1,"counterparty":"SomeCounterparty"}]}; // AllocationSetRequest | The collection of allocation requests.
    try {
      ResourceListOfAllocation result = apiInstance.upsertAllocations(allocationSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllocationsApi#upsertAllocations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationSetRequest** | [**AllocationSetRequest**](AllocationSetRequest.md)| The collection of allocation requests. | [optional]

### Return type

[**ResourceListOfAllocation**](ResourceListOfAllocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A collection of allocations. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

