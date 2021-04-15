# RelationsApi

All URIs are relative to *http://local-unit-test-server.lusid.com:61765*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRelation**](RelationsApi.md#createRelation) | **POST** /api/relations/{scope}/{code} | [DEPRECATED] Create Relation
[**deleteRelation**](RelationsApi.md#deleteRelation) | **POST** /api/relations/{scope}/{code}/$delete | [DEPRECATED] Delete a relation


<a name="createRelation"></a>
# **createRelation**
> CompleteRelation createRelation(scope, code, createRelationRequest, effectiveAt)

[DEPRECATED] Create Relation

Create a relation between two entity objects by their identifiers

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RelationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:61765");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RelationsApi apiInstance = new RelationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the relation definition
    String code = "code_example"; // String | The code of the relation definition
    CreateRelationRequest createRelationRequest = {"sourceEntityId":{"idTypeScope":"HrSystem1","idTypeCode":"InternalId","code":"XY10001111"},"targetEntityId":{"idTypeScope":"HrSystem1","idTypeCode":"InternalId","code":"XY10001111"}}; // CreateRelationRequest | The details of the relation to create.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the relation should be effective from. Defaults to the current LUSID system datetime if not specified.
    try {
      CompleteRelation result = apiInstance.createRelation(scope, code, createRelationRequest, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationsApi#createRelation");
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
 **scope** | **String**| The scope of the relation definition |
 **code** | **String**| The code of the relation definition |
 **createRelationRequest** | [**CreateRelationRequest**](CreateRelationRequest.md)| The details of the relation to create. |
 **effectiveAt** | **String**| The effective datetime or cut label at which the relation should be effective from. Defaults to the current LUSID system datetime if not specified. | [optional]

### Return type

[**CompleteRelation**](CompleteRelation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The newly created relation. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deleteRelation"></a>
# **deleteRelation**
> DeletedEntityResponse deleteRelation(scope, code, deleteRelationRequest, effectiveAt)

[DEPRECATED] Delete a relation

Delete a relation between two entity objects represented by their identifiers

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RelationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:61765");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RelationsApi apiInstance = new RelationsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the relation definition
    String code = "code_example"; // String | The code of the relation definition
    DeleteRelationRequest deleteRelationRequest = {"sourceEntityId":{"entityType":"PortfolioGroup","scope":"UkPortfolio","code":"PortfolioId-148176"},"targetEntityId":{"entityType":"Person","idTypeScope":"HrSystem1","idTypeCode":"InternalId","code":"XY10001111"}}; // DeleteRelationRequest | The details of the relation to delete.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the relation should the deletion be effective from. Defaults to the current LUSID system datetime if not specified.
    try {
      DeletedEntityResponse result = apiInstance.deleteRelation(scope, code, deleteRelationRequest, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationsApi#deleteRelation");
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
 **scope** | **String**| The scope of the relation definition |
 **code** | **String**| The code of the relation definition |
 **deleteRelationRequest** | [**DeleteRelationRequest**](DeleteRelationRequest.md)| The details of the relation to delete. |
 **effectiveAt** | **String**| The effective datetime or cut label at which the relation should the deletion be effective from. Defaults to the current LUSID system datetime if not specified. | [optional]

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
**200** | The datetime that the relation is deleted |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

