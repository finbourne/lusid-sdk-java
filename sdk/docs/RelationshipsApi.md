# RelationshipsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRelationship**](RelationshipsApi.md#createRelationship) | **POST** /api/relationshipdefinitions/{scope}/{code}/relationships | [EARLY ACCESS] CreateRelationship: Create Relationship
[**deleteRelationship**](RelationshipsApi.md#deleteRelationship) | **POST** /api/relationshipdefinitions/{scope}/{code}/relationships/$delete | [EARLY ACCESS] DeleteRelationship: Delete Relationship


<a name="createRelationship"></a>
# **createRelationship**
> CompleteRelationship createRelationship(scope, code, createRelationshipRequest)

[EARLY ACCESS] CreateRelationship: Create Relationship

Create a relationship between two entity objects by their identifiers

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RelationshipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the relationship
    String code = "code_example"; // String | The code of the relationship
    CreateRelationshipRequest createRelationshipRequest = new CreateRelationshipRequest(); // CreateRelationshipRequest | The details of the relationship to create.
    try {
      CompleteRelationship result = apiInstance.createRelationship(scope, code, createRelationshipRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipsApi#createRelationship");
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
 **scope** | **String**| The scope of the relationship |
 **code** | **String**| The code of the relationship |
 **createRelationshipRequest** | [**CreateRelationshipRequest**](CreateRelationshipRequest.md)| The details of the relationship to create. |

### Return type

[**CompleteRelationship**](CompleteRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The newly created relationship. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deleteRelationship"></a>
# **deleteRelationship**
> DeletedEntityResponse deleteRelationship(scope, code, deleteRelationshipRequest)

[EARLY ACCESS] DeleteRelationship: Delete Relationship

Delete a relationship between two entity objects represented by their identifiers

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RelationshipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the relationship
    String code = "code_example"; // String | The code of the relationship
    DeleteRelationshipRequest deleteRelationshipRequest = new DeleteRelationshipRequest(); // DeleteRelationshipRequest | The details of the relationship to delete.
    try {
      DeletedEntityResponse result = apiInstance.deleteRelationship(scope, code, deleteRelationshipRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationshipsApi#deleteRelationship");
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
 **scope** | **String**| The scope of the relationship |
 **code** | **String**| The code of the relationship |
 **deleteRelationshipRequest** | [**DeleteRelationshipRequest**](DeleteRelationshipRequest.md)| The details of the relationship to delete. |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The datetime that the relationship is deleted |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

