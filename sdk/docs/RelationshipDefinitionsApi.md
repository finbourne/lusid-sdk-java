# RelationshipDefinitionsApi

All URIs are relative to *https://example.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRelationshipDefinition**](RelationshipDefinitionsApi.md#createRelationshipDefinition) | **POST** /api/relationshipdefinitions | [EARLY ACCESS] CreateRelationshipDefinition: Create Relationship Definition |
| [**deleteRelationshipDefinition**](RelationshipDefinitionsApi.md#deleteRelationshipDefinition) | **DELETE** /api/relationshipdefinitions/{scope}/{code} | [EARLY ACCESS] DeleteRelationshipDefinition: Delete Relationship Definition |
| [**getRelationshipDefinition**](RelationshipDefinitionsApi.md#getRelationshipDefinition) | **GET** /api/relationshipdefinitions/{scope}/{code} | [EARLY ACCESS] GetRelationshipDefinition: Get relationship definition |
| [**listRelationshipDefinitions**](RelationshipDefinitionsApi.md#listRelationshipDefinitions) | **GET** /api/relationshipdefinitions | [EARLY ACCESS] ListRelationshipDefinitions: List relationship definitions |
| [**updateRelationshipDefinition**](RelationshipDefinitionsApi.md#updateRelationshipDefinition) | **PUT** /api/relationshipdefinitions/{scope}/{code} | [EARLY ACCESS] UpdateRelationshipDefinition: Update Relationship Definition |


<a id="createRelationshipDefinition"></a>
# **createRelationshipDefinition**
> RelationshipDefinition createRelationshipDefinition(createRelationshipDefinitionRequest)

[EARLY ACCESS] CreateRelationshipDefinition: Create Relationship Definition

Create a new relationship definition to be used for creating relationships between entities.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RelationshipDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RelationshipDefinitionsApi apiInstance = new RelationshipDefinitionsApi(defaultClient);
    CreateRelationshipDefinitionRequest createRelationshipDefinitionRequest = new CreateRelationshipDefinitionRequest(); // CreateRelationshipDefinitionRequest | The definition of the new relationship.
    try {
      RelationshipDefinition result = apiInstance.createRelationshipDefinition(createRelationshipDefinitionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipDefinitionsApi#createRelationshipDefinition");
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
| **createRelationshipDefinitionRequest** | [**CreateRelationshipDefinitionRequest**](CreateRelationshipDefinitionRequest.md)| The definition of the new relationship. | |

### Return type

[**RelationshipDefinition**](RelationshipDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created relationship definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteRelationshipDefinition"></a>
# **deleteRelationshipDefinition**
> DeletedEntityResponse deleteRelationshipDefinition(scope, code)

[EARLY ACCESS] DeleteRelationshipDefinition: Delete Relationship Definition

Delete the definition of the specified relationship.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RelationshipDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RelationshipDefinitionsApi apiInstance = new RelationshipDefinitionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the relationship definition to be deleted.
    String code = "code_example"; // String | The code of the relationship definition to be deleted. Together with the domain and scope this uniquely              identifies the relationship.
    try {
      DeletedEntityResponse result = apiInstance.deleteRelationshipDefinition(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipDefinitionsApi#deleteRelationshipDefinition");
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
| **scope** | **String**| The scope of the relationship definition to be deleted. | |
| **code** | **String**| The code of the relationship definition to be deleted. Together with the domain and scope this uniquely              identifies the relationship. | |

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
| **200** | The time that the relationship definition was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getRelationshipDefinition"></a>
# **getRelationshipDefinition**
> RelationshipDefinition getRelationshipDefinition(scope, code, asAt)

[EARLY ACCESS] GetRelationshipDefinition: Get relationship definition

Retrieve the specified relationship definition

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RelationshipDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RelationshipDefinitionsApi apiInstance = new RelationshipDefinitionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the specified relationship definition.
    String code = "code_example"; // String | The code of the specified relationship definition. Together with the domain and scope this uniquely              identifies the relationship definition.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the relationship definition. Defaults to return              the latest version of the definition if not specified.
    try {
      RelationshipDefinition result = apiInstance.getRelationshipDefinition(scope, code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipDefinitionsApi#getRelationshipDefinition");
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
| **scope** | **String**| The scope of the specified relationship definition. | |
| **code** | **String**| The code of the specified relationship definition. Together with the domain and scope this uniquely              identifies the relationship definition. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the relationship definition. Defaults to return              the latest version of the definition if not specified. | [optional] |

### Return type

[**RelationshipDefinition**](RelationshipDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested relationship definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listRelationshipDefinitions"></a>
# **listRelationshipDefinitions**
> PagedResourceListOfRelationshipDefinition listRelationshipDefinitions(asAt, page, limit, filter)

[EARLY ACCESS] ListRelationshipDefinitions: List relationship definitions

Retrieve one or more specified relationship definitions.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RelationshipDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RelationshipDefinitionsApi apiInstance = new RelationshipDefinitionsApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the relationship definitions. Defaults to return              the latest version of each definition if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing relationship definitions from a previous call to list relationship definitions. This  value is returned from the previous call. If a pagination token is provided the filter, asAt field  must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.              For example, to filter on the Scope, use \"scope eq 'ExampleScope'\"              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      PagedResourceListOfRelationshipDefinition result = apiInstance.listRelationshipDefinitions(asAt, page, limit, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipDefinitionsApi#listRelationshipDefinitions");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the relationship definitions. Defaults to return              the latest version of each definition if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing relationship definitions from a previous call to list relationship definitions. This  value is returned from the previous call. If a pagination token is provided the filter, asAt field  must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.              For example, to filter on the Scope, use \&quot;scope eq &#39;ExampleScope&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfRelationshipDefinition**](PagedResourceListOfRelationshipDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested relationship definitions |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateRelationshipDefinition"></a>
# **updateRelationshipDefinition**
> RelationshipDefinition updateRelationshipDefinition(scope, code, updateRelationshipDefinitionRequest)

[EARLY ACCESS] UpdateRelationshipDefinition: Update Relationship Definition

Update the definition of a specified existing relationship. Not all elements within a relationship definition  are modifiable due to the potential implications for values already stored against the relationship.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RelationshipDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RelationshipDefinitionsApi apiInstance = new RelationshipDefinitionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the relationship definition being updated.
    String code = "code_example"; // String | The code of the relationship definition being updated. Together with the scope this uniquely              identifies the relationship definition.
    UpdateRelationshipDefinitionRequest updateRelationshipDefinitionRequest = new UpdateRelationshipDefinitionRequest(); // UpdateRelationshipDefinitionRequest | The details of relationship definition to update.
    try {
      RelationshipDefinition result = apiInstance.updateRelationshipDefinition(scope, code, updateRelationshipDefinitionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipDefinitionsApi#updateRelationshipDefinition");
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
| **scope** | **String**| The scope of the relationship definition being updated. | |
| **code** | **String**| The code of the relationship definition being updated. Together with the scope this uniquely              identifies the relationship definition. | |
| **updateRelationshipDefinitionRequest** | [**UpdateRelationshipDefinitionRequest**](UpdateRelationshipDefinitionRequest.md)| The details of relationship definition to update. | |

### Return type

[**RelationshipDefinition**](RelationshipDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated relationship definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

