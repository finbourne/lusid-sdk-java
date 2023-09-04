# CustomEntityTypesApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomEntityType**](CustomEntityTypesApi.md#createCustomEntityType) | **POST** /api/customentitytypes | [EARLY ACCESS] CreateCustomEntityType: Define a new Custom Entity Type. |
| [**getCustomEntityType**](CustomEntityTypesApi.md#getCustomEntityType) | **GET** /api/customentitytypes/{entityType} | [EARLY ACCESS] GetCustomEntityType: Get a Custom Entity Type. |
| [**listCustomEntityTypes**](CustomEntityTypesApi.md#listCustomEntityTypes) | **GET** /api/customentitytypes | [EARLY ACCESS] ListCustomEntityTypes: List Custom Entity Types. |
| [**updateCustomEntityType**](CustomEntityTypesApi.md#updateCustomEntityType) | **PUT** /api/customentitytypes/{entityType} | [EARLY ACCESS] UpdateCustomEntityType: Modify an existing Custom Entity Type. |


<a id="createCustomEntityType"></a>
# **createCustomEntityType**
> CustomEntityType createCustomEntityType(createCustomEntityTypeRequest)

[EARLY ACCESS] CreateCustomEntityType: Define a new Custom Entity Type.

The API will return a Bad Request if the Custom Entity Type already exists.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntityTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntityTypesApi apiInstance = new CustomEntityTypesApi(defaultClient);
    CreateCustomEntityTypeRequest createCustomEntityTypeRequest = new CreateCustomEntityTypeRequest(); // CreateCustomEntityTypeRequest | The payload containing the description of the Custom Entity Type.
    try {
      CustomEntityType result = apiInstance.createCustomEntityType(createCustomEntityTypeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntityTypesApi#createCustomEntityType");
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
| **createCustomEntityTypeRequest** | [**CreateCustomEntityTypeRequest**](CreateCustomEntityTypeRequest.md)| The payload containing the description of the Custom Entity Type. | |

### Return type

[**CustomEntityType**](CustomEntityType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created Custom Entity Type. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getCustomEntityType"></a>
# **getCustomEntityType**
> CustomEntityType getCustomEntityType(entityType, asAt)

[EARLY ACCESS] GetCustomEntityType: Get a Custom Entity Type.

Retrieve a specific Custom Entity Type at a point in AsAt time.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntityTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntityTypesApi apiInstance = new CustomEntityTypesApi(defaultClient);
    String entityType = "entityType_example"; // String | The identifier for the Custom Entity Type, derived from the \"entityTypeName\" provided on creation.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The AsAt datetime at which to retrieve the definition.
    try {
      CustomEntityType result = apiInstance.getCustomEntityType(entityType, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntityTypesApi#getCustomEntityType");
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
| **entityType** | **String**| The identifier for the Custom Entity Type, derived from the \&quot;entityTypeName\&quot; provided on creation. | |
| **asAt** | **OffsetDateTime**| The AsAt datetime at which to retrieve the definition. | [optional] |

### Return type

[**CustomEntityType**](CustomEntityType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Custom Entity Type. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listCustomEntityTypes"></a>
# **listCustomEntityTypes**
> PagedResourceListOfCustomEntityType listCustomEntityTypes(asAt, limit, filter, sortBy, page)

[EARLY ACCESS] ListCustomEntityTypes: List Custom Entity Types.

List all Custom Entity Types matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntityTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntityTypesApi apiInstance = new CustomEntityTypesApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the entities. Defaults to returning the latest version              of each Custom Entity Type if not specified.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
    String page = "page_example"; // String | The pagination token to use to continue listing entities; this              value is returned from the previous call. If a pagination token is provided, the filter, limit, sortBy,              and asAt fields must not have changed since the original request.
    try {
      PagedResourceListOfCustomEntityType result = apiInstance.listCustomEntityTypes(asAt, limit, filter, sortBy, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntityTypesApi#listCustomEntityTypes");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the entities. Defaults to returning the latest version              of each Custom Entity Type if not specified. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **page** | **String**| The pagination token to use to continue listing entities; this              value is returned from the previous call. If a pagination token is provided, the filter, limit, sortBy,              and asAt fields must not have changed since the original request. | [optional] |

### Return type

[**PagedResourceListOfCustomEntityType**](PagedResourceListOfCustomEntityType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Custom Entity Types. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateCustomEntityType"></a>
# **updateCustomEntityType**
> CustomEntityType updateCustomEntityType(entityType, updateCustomEntityTypeRequest)

[EARLY ACCESS] UpdateCustomEntityType: Modify an existing Custom Entity Type.

The API will return a Bad Request if the Custom Entity Type does not exist.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntityTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntityTypesApi apiInstance = new CustomEntityTypesApi(defaultClient);
    String entityType = "entityType_example"; // String | The identifier for the Custom Entity Type, derived from the \"entityTypeName\" provided on creation.
    UpdateCustomEntityTypeRequest updateCustomEntityTypeRequest = new UpdateCustomEntityTypeRequest(); // UpdateCustomEntityTypeRequest | The payload containing the description of the Custom Entity Type.
    try {
      CustomEntityType result = apiInstance.updateCustomEntityType(entityType, updateCustomEntityTypeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntityTypesApi#updateCustomEntityType");
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
| **entityType** | **String**| The identifier for the Custom Entity Type, derived from the \&quot;entityTypeName\&quot; provided on creation. | |
| **updateCustomEntityTypeRequest** | [**UpdateCustomEntityTypeRequest**](UpdateCustomEntityTypeRequest.md)| The payload containing the description of the Custom Entity Type. | |

### Return type

[**CustomEntityType**](CustomEntityType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated Custom Entity Type. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

