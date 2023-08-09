# PlacementsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePlacement**](PlacementsApi.md#deletePlacement) | **DELETE** /api/placements/{scope}/{code} | [EARLY ACCESS] DeletePlacement: Delete placement
[**getPlacement**](PlacementsApi.md#getPlacement) | **GET** /api/placements/{scope}/{code} | [EARLY ACCESS] GetPlacement: Get Placement
[**listPlacements**](PlacementsApi.md#listPlacements) | **GET** /api/placements | [EARLY ACCESS] ListPlacements: List Placements
[**upsertPlacements**](PlacementsApi.md#upsertPlacements) | **POST** /api/placements | [EARLY ACCESS] UpsertPlacements: Upsert Placement


<a name="deletePlacement"></a>
# **deletePlacement**
> DeletedEntityResponse deletePlacement(scope, code)

[EARLY ACCESS] DeletePlacement: Delete placement

Delete an placement. Deletion will be valid from the placement&#39;s creation datetime.  This means that the placement will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PlacementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PlacementsApi apiInstance = new PlacementsApi(defaultClient);
    String scope = "scope_example"; // String | The placement scope.
    String code = "code_example"; // String | The placement's code. This, together with the scope uniquely identifies the placement to delete.
    try {
      DeletedEntityResponse result = apiInstance.deletePlacement(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacementsApi#deletePlacement");
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
 **scope** | **String**| The placement scope. |
 **code** | **String**| The placement&#39;s code. This, together with the scope uniquely identifies the placement to delete. |

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
**200** | The response from deleting an placement. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPlacement"></a>
# **getPlacement**
> Placement getPlacement(scope, code, asAt, propertyKeys)

[EARLY ACCESS] GetPlacement: Get Placement

Fetch a Placement that matches the specified identifier

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PlacementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PlacementsApi apiInstance = new PlacementsApi(defaultClient);
    String scope = "scope_example"; // String | The scope to which the placement belongs.
    String code = "code_example"; // String | The placement's unique identifier.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the placement. Defaults to return the latest version of the placement if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Placement\" domain to decorate onto the placement.              These take the format {domain}/{scope}/{code} e.g. \"Placement/system/Name\".
    try {
      Placement result = apiInstance.getPlacement(scope, code, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacementsApi#getPlacement");
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
 **scope** | **String**| The scope to which the placement belongs. |
 **code** | **String**| The placement&#39;s unique identifier. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the placement. Defaults to return the latest version of the placement if not specified. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Placement\&quot; domain to decorate onto the placement.              These take the format {domain}/{scope}/{code} e.g. \&quot;Placement/system/Name\&quot;. | [optional]

### Return type

[**Placement**](Placement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The placement matching the given identifier. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listPlacements"></a>
# **listPlacements**
> PagedResourceListOfPlacement listPlacements(asAt, page, sortBy, limit, filter, propertyKeys)

[EARLY ACCESS] ListPlacements: List Placements

Fetch the last pre-AsAt date version of each placement in scope (does not fetch the entire history).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PlacementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PlacementsApi apiInstance = new PlacementsApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the placement. Defaults to return the latest version of the placement if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing placements from a previous call to list placements.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Placement\" domain to decorate onto each placement.                  These take the format {domain}/{scope}/{code} e.g. \"Placement/system/Name\".
    try {
      PagedResourceListOfPlacement result = apiInstance.listPlacements(asAt, page, sortBy, limit, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacementsApi#listPlacements");
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
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the placement. Defaults to return the latest version of the placement if not specified. | [optional]
 **page** | **String**| The pagination token to use to continue listing placements from a previous call to list placements.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional]
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Placement\&quot; domain to decorate onto each placement.                  These take the format {domain}/{scope}/{code} e.g. \&quot;Placement/system/Name\&quot;. | [optional]

### Return type

[**PagedResourceListOfPlacement**](PagedResourceListOfPlacement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Placements in scope. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertPlacements"></a>
# **upsertPlacements**
> ResourceListOfPlacement upsertPlacements(placementSetRequest)

[EARLY ACCESS] UpsertPlacements: Upsert Placement

Upsert; update existing placements with given ids, or create new placements otherwise.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PlacementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PlacementsApi apiInstance = new PlacementsApi(defaultClient);
    PlacementSetRequest placementSetRequest = new PlacementSetRequest(); // PlacementSetRequest | The collection of placement requests.
    try {
      ResourceListOfPlacement result = apiInstance.upsertPlacements(placementSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlacementsApi#upsertPlacements");
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
 **placementSetRequest** | [**PlacementSetRequest**](PlacementSetRequest.md)| The collection of placement requests. | [optional]

### Return type

[**ResourceListOfPlacement**](ResourceListOfPlacement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A collection of placements. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

