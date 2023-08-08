# RelationDefinitionsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRelationDefinition**](RelationDefinitionsApi.md#createRelationDefinition) | **POST** /api/relationdefinitions | [EXPERIMENTAL] CreateRelationDefinition: Create a relation definition |
| [**deleteRelationDefinition**](RelationDefinitionsApi.md#deleteRelationDefinition) | **DELETE** /api/relationdefinitions/{scope}/{code} | [EXPERIMENTAL] DeleteRelationDefinition: Delete relation definition |
| [**getRelationDefinition**](RelationDefinitionsApi.md#getRelationDefinition) | **GET** /api/relationdefinitions/{scope}/{code} | [EXPERIMENTAL] GetRelationDefinition: Get relation definition |


<a id="createRelationDefinition"></a>
# **createRelationDefinition**
> RelationDefinition createRelationDefinition(createRelationDefinitionRequest)

[EXPERIMENTAL] CreateRelationDefinition: Create a relation definition

Define a new relation.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RelationDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RelationDefinitionsApi apiInstance = new RelationDefinitionsApi(defaultClient);
    CreateRelationDefinitionRequest createRelationDefinitionRequest = new CreateRelationDefinitionRequest(); // CreateRelationDefinitionRequest | The definition of the new relation.
    try {
      RelationDefinition result = apiInstance.createRelationDefinition(createRelationDefinitionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationDefinitionsApi#createRelationDefinition");
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
| **createRelationDefinitionRequest** | [**CreateRelationDefinitionRequest**](CreateRelationDefinitionRequest.md)| The definition of the new relation. | |

### Return type

[**RelationDefinition**](RelationDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created relation definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteRelationDefinition"></a>
# **deleteRelationDefinition**
> DeletedEntityResponse deleteRelationDefinition(scope, code)

[EXPERIMENTAL] DeleteRelationDefinition: Delete relation definition

Delete the definition of the specified relation.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RelationDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RelationDefinitionsApi apiInstance = new RelationDefinitionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the relation to be deleted.
    String code = "code_example"; // String | The code of the relation to be deleted. Together with the domain and scope this uniquely              identifies the relation.
    try {
      DeletedEntityResponse result = apiInstance.deleteRelationDefinition(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationDefinitionsApi#deleteRelationDefinition");
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
| **scope** | **String**| The scope of the relation to be deleted. | |
| **code** | **String**| The code of the relation to be deleted. Together with the domain and scope this uniquely              identifies the relation. | |

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
| **200** | The time that the relation definition was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getRelationDefinition"></a>
# **getRelationDefinition**
> RelationDefinition getRelationDefinition(scope, code, asAt)

[EXPERIMENTAL] GetRelationDefinition: Get relation definition

Retrieve the definition of a specified relation.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RelationDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RelationDefinitionsApi apiInstance = new RelationDefinitionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the specified relation.
    String code = "code_example"; // String | The code of the specified relation. Together with the domain and scope this uniquely              identifies the relation.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the relation definition. Defaults to return              the latest version of the definition if not specified.
    try {
      RelationDefinition result = apiInstance.getRelationDefinition(scope, code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationDefinitionsApi#getRelationDefinition");
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
| **scope** | **String**| The scope of the specified relation. | |
| **code** | **String**| The code of the specified relation. Together with the domain and scope this uniquely              identifies the relation. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the relation definition. Defaults to return              the latest version of the definition if not specified. | [optional] |

### Return type

[**RelationDefinition**](RelationDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested relation definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

