# FeeTypesApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFeeType**](FeeTypesApi.md#createFeeType) | **POST** /api/feetypes/{scope} | [EXPERIMENTAL] CreateFeeType: Create a FeeType. |
| [**deleteFeeType**](FeeTypesApi.md#deleteFeeType) | **DELETE** /api/feetypes/{scope}/{code} | [EXPERIMENTAL] DeleteFeeType: Delete a FeeType. |
| [**getFeeType**](FeeTypesApi.md#getFeeType) | **GET** /api/feetypes/{scope}/{code} | [EXPERIMENTAL] GetFeeType: Get a FeeType |
| [**listFeeTypes**](FeeTypesApi.md#listFeeTypes) | **GET** /api/feetypes | [EXPERIMENTAL] ListFeeTypes: List FeeTypes |
| [**updateFeeType**](FeeTypesApi.md#updateFeeType) | **PUT** /api/feetypes/{scope}/{code} | [EXPERIMENTAL] UpdateFeeType: Update a FeeType. |


<a id="createFeeType"></a>
# **createFeeType**
> FeeType createFeeType(scope, feeTypeRequest).execute();

[EXPERIMENTAL] CreateFeeType: Create a FeeType.

Create a FeeType that contains templates used to create fee transactions.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.FeeTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    FeeTypesApi apiInstance = new FeeTypesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the FeeType.
    FeeTypeRequest feeTypeRequest = new FeeTypeRequest(); // FeeTypeRequest | The contents of the FeeType.
    try {
      FeeType result = apiInstance.createFeeType(scope, feeTypeRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeeTypesApi#createFeeType");
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
| **scope** | **String**| The scope of the FeeType. | |
| **feeTypeRequest** | [**FeeTypeRequest**](FeeTypeRequest.md)| The contents of the FeeType. | |

### Return type

[**FeeType**](FeeType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a FeeType. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteFeeType"></a>
# **deleteFeeType**
> DeletedEntityResponse deleteFeeType(scope, code).execute();

[EXPERIMENTAL] DeleteFeeType: Delete a FeeType.

Delete a FeeType that contains templates used to create fee transactions.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.FeeTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    FeeTypesApi apiInstance = new FeeTypesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the FeeType.
    String code = "code_example"; // String | The code of the fee type
    try {
      DeletedEntityResponse result = apiInstance.deleteFeeType(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeeTypesApi#deleteFeeType");
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
| **scope** | **String**| The scope of the FeeType. | |
| **code** | **String**| The code of the fee type | |

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
| **200** | Delete a FeeType. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getFeeType"></a>
# **getFeeType**
> FeeType getFeeType(scope, code).asAt(asAt).execute();

[EXPERIMENTAL] GetFeeType: Get a FeeType

Get a FeeType that contains templates used to create fee transactions.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.FeeTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    FeeTypesApi apiInstance = new FeeTypesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the FeeType
    String code = "code_example"; // String | The code of the FeeType
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the FeeType. Defaults to returning the latest version of the FeeType, if not specified.
    try {
      FeeType result = apiInstance.getFeeType(scope, code)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeeTypesApi#getFeeType");
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
| **scope** | **String**| The scope of the FeeType | |
| **code** | **String**| The code of the FeeType | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the FeeType. Defaults to returning the latest version of the FeeType, if not specified. | [optional] |

### Return type

[**FeeType**](FeeType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested FeeType. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listFeeTypes"></a>
# **listFeeTypes**
> PagedResourceListOfFeeType listFeeTypes().asAt(asAt).page(page).limit(limit).filter(filter).sortBy(sortBy).execute();

[EXPERIMENTAL] ListFeeTypes: List FeeTypes

List FeeTypes that contain templates used to create fee transactions.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.FeeTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    FeeTypesApi apiInstance = new FeeTypesApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the FeeTypes. Defaults to returning the latest version of each FeeType if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing FeeTypes; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the Code of the FeeType type, specify \"id.Code eq 'FeeType1'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
    try {
      PagedResourceListOfFeeType result = apiInstance.listFeeTypes()
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .filter(filter)
            .sortBy(sortBy)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeeTypesApi#listFeeTypes");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the FeeTypes. Defaults to returning the latest version of each FeeType if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing FeeTypes; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the Code of the FeeType type, specify \&quot;id.Code eq &#39;FeeType1&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfFeeType**](PagedResourceListOfFeeType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Fee Types |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateFeeType"></a>
# **updateFeeType**
> FeeType updateFeeType(scope, code, updateFeeTypeRequest).execute();

[EXPERIMENTAL] UpdateFeeType: Update a FeeType.

Update a FeeType that contains templates used to create fee transactions.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.FeeTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    FeeTypesApi apiInstance = new FeeTypesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the FeeType.
    String code = "code_example"; // String | The code of the fee type
    UpdateFeeTypeRequest updateFeeTypeRequest = new UpdateFeeTypeRequest(); // UpdateFeeTypeRequest | The contents of the FeeType.
    try {
      FeeType result = apiInstance.updateFeeType(scope, code, updateFeeTypeRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeeTypesApi#updateFeeType");
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
| **scope** | **String**| The scope of the FeeType. | |
| **code** | **String**| The code of the fee type | |
| **updateFeeTypeRequest** | [**UpdateFeeTypeRequest**](UpdateFeeTypeRequest.md)| The contents of the FeeType. | |

### Return type

[**FeeType**](FeeType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a FeeType. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

