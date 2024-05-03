# StagedModificationsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDecision**](StagedModificationsApi.md#addDecision) | **POST** /api/stagedmodifications/{id}/decision | [EXPERIMENTAL] AddDecision: AddDecision |
| [**getStagedModification**](StagedModificationsApi.md#getStagedModification) | **GET** /api/stagedmodifications/{id} | [EXPERIMENTAL] GetStagedModification: GetStagedModification |
| [**listRequestedChanges**](StagedModificationsApi.md#listRequestedChanges) | **GET** /api/stagedmodifications/{id}/requestedChanges | [EXPERIMENTAL] ListRequestedChanges: ListRequestedChanges |
| [**listStagedModifications**](StagedModificationsApi.md#listStagedModifications) | **GET** /api/stagedmodifications | [EXPERIMENTAL] ListStagedModifications: ListStagedModifications |


<a id="addDecision"></a>
# **addDecision**
> StagedModification addDecision(id, stagedModificationDecisionRequest).execute();

[EXPERIMENTAL] AddDecision: AddDecision

Add decision to staged modification, Approve or Reject.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StagedModificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StagedModificationsApi apiInstance = new StagedModificationsApi(defaultClient);
    String id = "id_example"; // String | Unique Id for a staged modification..
    StagedModificationDecisionRequest stagedModificationDecisionRequest = new StagedModificationDecisionRequest(); // StagedModificationDecisionRequest | The decision on the requested staged modification, \"Approve\" or \"Reject\".
    try {
      StagedModification result = apiInstance.addDecision(id, stagedModificationDecisionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagedModificationsApi#addDecision");
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
| **id** | **String**| Unique Id for a staged modification.. | |
| **stagedModificationDecisionRequest** | [**StagedModificationDecisionRequest**](StagedModificationDecisionRequest.md)| The decision on the requested staged modification, \&quot;Approve\&quot; or \&quot;Reject\&quot;. | |

### Return type

[**StagedModification**](StagedModification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The staged modification. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getStagedModification"></a>
# **getStagedModification**
> StagedModification getStagedModification(id).asAt(asAt).execute();

[EXPERIMENTAL] GetStagedModification: GetStagedModification

Retrieve the details of a staged modification.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StagedModificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StagedModificationsApi apiInstance = new StagedModificationsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for a staged modification.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the staged modification. Defaults to latest if not specified.
    try {
      StagedModification result = apiInstance.getStagedModification(id)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagedModificationsApi#getStagedModification");
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
| **id** | **String**| The unique identifier for a staged modification. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the staged modification. Defaults to latest if not specified. | [optional] |

### Return type

[**StagedModification**](StagedModification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested staged modification. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listRequestedChanges"></a>
# **listRequestedChanges**
> PagedResourceListOfStagedModificationsRequestedChangeInterval listRequestedChanges(id).asAt(asAt).page(page).limit(limit).filter(filter).sortBy(sortBy).execute();

[EXPERIMENTAL] ListRequestedChanges: ListRequestedChanges

List the requested changes for a staged modification.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StagedModificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StagedModificationsApi apiInstance = new StagedModificationsApi(defaultClient);
    String id = "id_example"; // String | Unique Id for a staged modification..
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list changes. Defaults to return the latest version   of each staged change if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing requested staged modification changes from a previous call to list requested   staged modifications. This value is returned from the previous call. If a pagination token is provided the filter, effectiveAt   and asAt fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names suffixed by \" ASC\" or \" DESC\"
    try {
      PagedResourceListOfStagedModificationsRequestedChangeInterval result = apiInstance.listRequestedChanges(id)
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .filter(filter)
            .sortBy(sortBy)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagedModificationsApi#listRequestedChanges");
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
| **id** | **String**| Unique Id for a staged modification.. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list changes. Defaults to return the latest version   of each staged change if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing requested staged modification changes from a previous call to list requested   staged modifications. This value is returned from the previous call. If a pagination token is provided the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfStagedModificationsRequestedChangeInterval**](PagedResourceListOfStagedModificationsRequestedChangeInterval.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested changes in staged modification. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listStagedModifications"></a>
# **listStagedModifications**
> PagedResourceListOfStagedModification listStagedModifications().asAt(asAt).page(page).limit(limit).filter(filter).sortBy(sortBy).execute();

[EXPERIMENTAL] ListStagedModifications: ListStagedModifications

List summaries of the staged modifications.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StagedModificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StagedModificationsApi apiInstance = new StagedModificationsApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list staged modifications. Defaults to return the latest version   of each staged modification if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing staged modifications from a previous call to list staged modifications. This   value is returned from the previous call. If a pagination token is provided the filter, effectiveAt   and asAt fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.    Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names suffixed by \" ASC\" or \" DESC\"
    try {
      PagedResourceListOfStagedModification result = apiInstance.listStagedModifications()
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .filter(filter)
            .sortBy(sortBy)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagedModificationsApi#listStagedModifications");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list staged modifications. Defaults to return the latest version   of each staged modification if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing staged modifications from a previous call to list staged modifications. This   value is returned from the previous call. If a pagination token is provided the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.    Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfStagedModification**](PagedResourceListOfStagedModification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List summary of staged modifications. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

