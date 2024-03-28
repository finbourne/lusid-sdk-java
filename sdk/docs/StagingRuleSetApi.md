# StagingRuleSetApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createStagingRuleSet**](StagingRuleSetApi.md#createStagingRuleSet) | **POST** /api/stagingrulesets/{entityType} | [EXPERIMENTAL] CreateStagingRuleSet: Create a StagingRuleSet |
| [**deleteStagingRuleSet**](StagingRuleSetApi.md#deleteStagingRuleSet) | **DELETE** /api/stagingrulesets/{entityType} | [EXPERIMENTAL] DeleteStagingRuleSet: Delete a StagingRuleSet |
| [**getStagingRuleSet**](StagingRuleSetApi.md#getStagingRuleSet) | **GET** /api/stagingrulesets/{entityType} | [EXPERIMENTAL] GetStagingRuleSet: Get a StagingRuleSet |
| [**listStagingRuleSets**](StagingRuleSetApi.md#listStagingRuleSets) | **GET** /api/stagingrulesets | [EXPERIMENTAL] ListStagingRuleSets: List StagingRuleSets |
| [**updateStagingRuleSet**](StagingRuleSetApi.md#updateStagingRuleSet) | **PUT** /api/stagingrulesets/{entityType} | [EXPERIMENTAL] UpdateStagingRuleSet: Update a StagingRuleSet |


<a id="createStagingRuleSet"></a>
# **createStagingRuleSet**
> StagingRuleSet createStagingRuleSet(entityType, createStagingRuleSetRequest).execute();

[EXPERIMENTAL] CreateStagingRuleSet: Create a StagingRuleSet

Create a new staging rule set.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StagingRuleSetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StagingRuleSetApi apiInstance = new StagingRuleSetApi(defaultClient);
    String entityType = "entityType_example"; // String | The entity type for which to create the staging rule set.
    CreateStagingRuleSetRequest createStagingRuleSetRequest = new CreateStagingRuleSetRequest(); // CreateStagingRuleSetRequest | Request to create a staging rule set.
    try {
      StagingRuleSet result = apiInstance.createStagingRuleSet(entityType, createStagingRuleSetRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagingRuleSetApi#createStagingRuleSet");
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
| **entityType** | **String**| The entity type for which to create the staging rule set. | |
| **createStagingRuleSetRequest** | [**CreateStagingRuleSetRequest**](CreateStagingRuleSetRequest.md)| Request to create a staging rule set. | |

### Return type

[**StagingRuleSet**](StagingRuleSet.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created staging rule set |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteStagingRuleSet"></a>
# **deleteStagingRuleSet**
> DeletedEntityResponse deleteStagingRuleSet(entityType).execute();

[EXPERIMENTAL] DeleteStagingRuleSet: Delete a StagingRuleSet

Delete a staging rule set of a specific entity type. Deletion will be valid from the staging rule set&#39;s creation datetime.  This means that the staging rule set will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StagingRuleSetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StagingRuleSetApi apiInstance = new StagingRuleSetApi(defaultClient);
    String entityType = "entityType_example"; // String | The entity type for which to delete the staging rule set.
    try {
      DeletedEntityResponse result = apiInstance.deleteStagingRuleSet(entityType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagingRuleSetApi#deleteStagingRuleSet");
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
| **entityType** | **String**| The entity type for which to delete the staging rule set. | |

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
| **200** | The response from deleting staging rule set |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getStagingRuleSet"></a>
# **getStagingRuleSet**
> StagingRuleSet getStagingRuleSet(entityType).asAt(asAt).execute();

[EXPERIMENTAL] GetStagingRuleSet: Get a StagingRuleSet

Get the staging rule set for the given entity type at the specific asAt time.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StagingRuleSetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StagingRuleSetApi apiInstance = new StagingRuleSetApi(defaultClient);
    String entityType = "entityType_example"; // String | The entity type for which to retrieve the staging rule set.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the staging rule set. Defaults to return the latest   version of the staging rule set if not specified.
    try {
      StagingRuleSet result = apiInstance.getStagingRuleSet(entityType)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagingRuleSetApi#getStagingRuleSet");
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
| **entityType** | **String**| The entity type for which to retrieve the staging rule set. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the staging rule set. Defaults to return the latest   version of the staging rule set if not specified. | [optional] |

### Return type

[**StagingRuleSet**](StagingRuleSet.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested staging rule set |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listStagingRuleSets"></a>
# **listStagingRuleSets**
> PagedResourceListOfStagingRuleSet listStagingRuleSets().asAt(asAt).page(page).sortBy(sortBy).limit(limit).filter(filter).execute();

[EXPERIMENTAL] ListStagingRuleSets: List StagingRuleSets

List all the staging rule sets matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StagingRuleSetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StagingRuleSetApi apiInstance = new StagingRuleSetApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the staging rule sets. Defaults to return the latest   version of the staging rule sets if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing staging rule sets from a previous call to list   staging rule sets. This value is returned from the previous call. If a pagination token is provided the sortBy,   filter, effectiveAt, and asAt fields must not have changed since the original request.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
    try {
      PagedResourceListOfStagingRuleSet result = apiInstance.listStagingRuleSets()
            .asAt(asAt)
            .page(page)
            .sortBy(sortBy)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagingRuleSetApi#listStagingRuleSets");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the staging rule sets. Defaults to return the latest   version of the staging rule sets if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing staging rule sets from a previous call to list   staging rule sets. This value is returned from the previous call. If a pagination token is provided the sortBy,   filter, effectiveAt, and asAt fields must not have changed since the original request. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfStagingRuleSet**](PagedResourceListOfStagingRuleSet.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of staging rule sets |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateStagingRuleSet"></a>
# **updateStagingRuleSet**
> StagingRuleSet updateStagingRuleSet(entityType, updateStagingRuleSetRequest).execute();

[EXPERIMENTAL] UpdateStagingRuleSet: Update a StagingRuleSet

Update an existing staging rule set.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StagingRuleSetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StagingRuleSetApi apiInstance = new StagingRuleSetApi(defaultClient);
    String entityType = "entityType_example"; // String | The entity type for which to update the staging rule set.
    UpdateStagingRuleSetRequest updateStagingRuleSetRequest = new UpdateStagingRuleSetRequest(); // UpdateStagingRuleSetRequest | Request to update a staging rule set.
    try {
      StagingRuleSet result = apiInstance.updateStagingRuleSet(entityType, updateStagingRuleSetRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagingRuleSetApi#updateStagingRuleSet");
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
| **entityType** | **String**| The entity type for which to update the staging rule set. | |
| **updateStagingRuleSetRequest** | [**UpdateStagingRuleSetRequest**](UpdateStagingRuleSetRequest.md)| Request to update a staging rule set. | |

### Return type

[**StagingRuleSet**](StagingRuleSet.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated staging rule set |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

