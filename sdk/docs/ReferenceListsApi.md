# ReferenceListsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteReferenceList**](ReferenceListsApi.md#deleteReferenceList) | **DELETE** /api/referencelists/{scope}/{code} | [EARLY ACCESS] DeleteReferenceList: Delete Reference List |
| [**getReferenceList**](ReferenceListsApi.md#getReferenceList) | **GET** /api/referencelists/{scope}/{code} | [EARLY ACCESS] GetReferenceList: Get Reference List |
| [**listReferenceLists**](ReferenceListsApi.md#listReferenceLists) | **GET** /api/referencelists | [EARLY ACCESS] ListReferenceLists: List Reference Lists |
| [**upsertReferenceList**](ReferenceListsApi.md#upsertReferenceList) | **POST** /api/referencelists | [EARLY ACCESS] UpsertReferenceList: Upsert Reference List |


<a id="deleteReferenceList"></a>
# **deleteReferenceList**
> DeletedEntityResponse deleteReferenceList(scope, code)

[EARLY ACCESS] DeleteReferenceList: Delete Reference List

Delete a Reference List instance.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReferenceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceListsApi apiInstance = new ReferenceListsApi(defaultClient);
    String scope = "scope_example"; // String | The scope to which the Reference List belongs.
    String code = "code_example"; // String | The Reference List's unique identifier.
    try {
      DeletedEntityResponse result = apiInstance.deleteReferenceList(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceListsApi#deleteReferenceList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope to which the Reference List belongs. | |
| **code** | **String**| The Reference List&#39;s unique identifier. | |

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
| **200** | The deleted reference list response. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getReferenceList"></a>
# **getReferenceList**
> ReferenceListResponse getReferenceList(scope, code, asAt)

[EARLY ACCESS] GetReferenceList: Get Reference List

Retrieve a Reference List instance at a point in AsAt time.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReferenceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceListsApi apiInstance = new ReferenceListsApi(defaultClient);
    String scope = "scope_example"; // String | The scope to which the Reference List belongs.
    String code = "code_example"; // String | The Reference List's unique identifier.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Reference List. Defaults to return the latest version of the Reference List if not specified.
    try {
      ReferenceListResponse result = apiInstance.getReferenceList(scope, code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceListsApi#getReferenceList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope to which the Reference List belongs. | |
| **code** | **String**| The Reference List&#39;s unique identifier. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Reference List. Defaults to return the latest version of the Reference List if not specified. | [optional] |

### Return type

[**ReferenceListResponse**](ReferenceListResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Reference List matching the requested identifier. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listReferenceLists"></a>
# **listReferenceLists**
> PagedResourceListOfReferenceListResponse listReferenceLists(asAt, page, limit, filter)

[EARLY ACCESS] ListReferenceLists: List Reference Lists

List all the Reference Lists matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReferenceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceListsApi apiInstance = new ReferenceListsApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list Reference Lists. Defaults to return the latest version of Reference Lists if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing Reference Lists from a previous call to list Reference Lists.              This value is returned from the previous call. If a pagination token is provided, the filter, limit and asAt fields              must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid.
    try {
      PagedResourceListOfReferenceListResponse result = apiInstance.listReferenceLists(asAt, page, limit, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceListsApi#listReferenceLists");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list Reference Lists. Defaults to return the latest version of Reference Lists if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Reference Lists from a previous call to list Reference Lists.              This value is returned from the previous call. If a pagination token is provided, the filter, limit and asAt fields              must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfReferenceListResponse**](PagedResourceListOfReferenceListResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A collection of Reference Lists. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertReferenceList"></a>
# **upsertReferenceList**
> ReferenceListResponse upsertReferenceList(referenceListRequest)

[EARLY ACCESS] UpsertReferenceList: Upsert Reference List

Insert the Reference List if it does not exist or update the Reference List with the supplied state if it does exist.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReferenceListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceListsApi apiInstance = new ReferenceListsApi(defaultClient);
    ReferenceListRequest referenceListRequest = new ReferenceListRequest(); // ReferenceListRequest | The payload describing the Reference List instance.
    try {
      ReferenceListResponse result = apiInstance.upsertReferenceList(referenceListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceListsApi#upsertReferenceList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **referenceListRequest** | [**ReferenceListRequest**](ReferenceListRequest.md)| The payload describing the Reference List instance. | [optional] |

### Return type

[**ReferenceListResponse**](ReferenceListResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The upserted Reference List instance. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

