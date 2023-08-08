# ConventionsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCdsFlowConventions**](ConventionsApi.md#deleteCdsFlowConventions) | **DELETE** /api/conventions/credit/conventions/{scope}/{code} | [BETA] DeleteCdsFlowConventions: Delete the CDS Flow Conventions of given scope and code, assuming that it is present. |
| [**deleteFlowConventions**](ConventionsApi.md#deleteFlowConventions) | **DELETE** /api/conventions/rates/flowconventions/{scope}/{code} | [BETA] DeleteFlowConventions: Delete the Flow Conventions of given scope and code, assuming that it is present. |
| [**deleteIndexConvention**](ConventionsApi.md#deleteIndexConvention) | **DELETE** /api/conventions/rates/indexconventions/{scope}/{code} | [BETA] DeleteIndexConvention: Delete the Index Convention of given scope and code, assuming that it is present. |
| [**getCdsFlowConventions**](ConventionsApi.md#getCdsFlowConventions) | **GET** /api/conventions/credit/conventions/{scope}/{code} | [BETA] GetCdsFlowConventions: Get CDS Flow Conventions |
| [**getFlowConventions**](ConventionsApi.md#getFlowConventions) | **GET** /api/conventions/rates/flowconventions/{scope}/{code} | [BETA] GetFlowConventions: Get Flow Conventions |
| [**getIndexConvention**](ConventionsApi.md#getIndexConvention) | **GET** /api/conventions/rates/indexconventions/{scope}/{code} | [BETA] GetIndexConvention: Get Index Convention |
| [**listCdsFlowConventions**](ConventionsApi.md#listCdsFlowConventions) | **GET** /api/conventions/credit/conventions | [BETA] ListCdsFlowConventions: List the set of CDS Flow Conventions |
| [**listFlowConventions**](ConventionsApi.md#listFlowConventions) | **GET** /api/conventions/rates/flowconventions | [BETA] ListFlowConventions: List the set of Flow Conventions |
| [**listIndexConvention**](ConventionsApi.md#listIndexConvention) | **GET** /api/conventions/rates/indexconventions | [BETA] ListIndexConvention: List the set of Index Conventions |
| [**upsertCdsFlowConventions**](ConventionsApi.md#upsertCdsFlowConventions) | **POST** /api/conventions/credit/conventions | [BETA] UpsertCdsFlowConventions: Upsert a set of CDS Flow Conventions. This creates or updates the data in Lusid. |
| [**upsertFlowConventions**](ConventionsApi.md#upsertFlowConventions) | **POST** /api/conventions/rates/flowconventions | [BETA] UpsertFlowConventions: Upsert Flow Conventions. This creates or updates the data in Lusid. |
| [**upsertIndexConvention**](ConventionsApi.md#upsertIndexConvention) | **POST** /api/conventions/rates/indexconventions | [BETA] UpsertIndexConvention: Upsert a set of Index Convention. This creates or updates the data in Lusid. |


<a id="deleteCdsFlowConventions"></a>
# **deleteCdsFlowConventions**
> AnnulSingleStructuredDataResponse deleteCdsFlowConventions(scope, code)

[BETA] DeleteCdsFlowConventions: Delete the CDS Flow Conventions of given scope and code, assuming that it is present.

Delete the specified CDS Flow Conventions from a single scope.  The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.  It is important to always check for any unsuccessful response.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ConventionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ConventionsApi apiInstance = new ConventionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the CDS Flow Conventions to delete.
    String code = "code_example"; // String | The CDS Flow Conventions to delete.
    try {
      AnnulSingleStructuredDataResponse result = apiInstance.deleteCdsFlowConventions(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConventionsApi#deleteCdsFlowConventions");
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
| **scope** | **String**| The scope of the CDS Flow Conventions to delete. | |
| **code** | **String**| The CDS Flow Conventions to delete. | |

### Return type

[**AnnulSingleStructuredDataResponse**](AnnulSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AsAt of deletion or failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteFlowConventions"></a>
# **deleteFlowConventions**
> AnnulSingleStructuredDataResponse deleteFlowConventions(scope, code)

[BETA] DeleteFlowConventions: Delete the Flow Conventions of given scope and code, assuming that it is present.

Delete the specified conventions from a single scope.  The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.  It is important to always check for any unsuccessful response.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ConventionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ConventionsApi apiInstance = new ConventionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Flow Conventions to delete.
    String code = "code_example"; // String | The Flow Conventions to delete.
    try {
      AnnulSingleStructuredDataResponse result = apiInstance.deleteFlowConventions(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConventionsApi#deleteFlowConventions");
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
| **scope** | **String**| The scope of the Flow Conventions to delete. | |
| **code** | **String**| The Flow Conventions to delete. | |

### Return type

[**AnnulSingleStructuredDataResponse**](AnnulSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AsAt of deletion or failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteIndexConvention"></a>
# **deleteIndexConvention**
> AnnulSingleStructuredDataResponse deleteIndexConvention(scope, code)

[BETA] DeleteIndexConvention: Delete the Index Convention of given scope and code, assuming that it is present.

Delete the specified Index Convention from a single scope.  The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.  It is important to always check for any unsuccessful response.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ConventionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ConventionsApi apiInstance = new ConventionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Index Convention to delete.
    String code = "code_example"; // String | The Index Convention to delete.
    try {
      AnnulSingleStructuredDataResponse result = apiInstance.deleteIndexConvention(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConventionsApi#deleteIndexConvention");
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
| **scope** | **String**| The scope of the Index Convention to delete. | |
| **code** | **String**| The Index Convention to delete. | |

### Return type

[**AnnulSingleStructuredDataResponse**](AnnulSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AsAt of deletion or failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getCdsFlowConventions"></a>
# **getCdsFlowConventions**
> GetCdsFlowConventionsResponse getCdsFlowConventions(scope, code, asAt)

[BETA] GetCdsFlowConventions: Get CDS Flow Conventions

Get a CDS Flow Conventions from a single scope.  The response will return either the conventions that has been stored, or a failure explaining why the request was unsuccessful.  It is important to always check for any unsuccessful requests (failures).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ConventionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ConventionsApi apiInstance = new ConventionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the CDS Flow Conventions to retrieve.
    String code = "code_example"; // String | The name of the CDS Flow Conventions to retrieve the data for.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the CDS Flow Conventions. Defaults to return the latest version if not specified.
    try {
      GetCdsFlowConventionsResponse result = apiInstance.getCdsFlowConventions(scope, code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConventionsApi#getCdsFlowConventions");
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
| **scope** | **String**| The scope of the CDS Flow Conventions to retrieve. | |
| **code** | **String**| The name of the CDS Flow Conventions to retrieve the data for. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the CDS Flow Conventions. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**GetCdsFlowConventionsResponse**](GetCdsFlowConventionsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved CDS Flow Conventions or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getFlowConventions"></a>
# **getFlowConventions**
> GetFlowConventionsResponse getFlowConventions(scope, code, asAt)

[BETA] GetFlowConventions: Get Flow Conventions

Get a Flow Conventions from a single scope.  The response will return either the conventions that has been stored, or a failure explaining why the request was unsuccessful.  It is important to always check for any unsuccessful requests (failures).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ConventionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ConventionsApi apiInstance = new ConventionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Flow Conventions to retrieve.
    String code = "code_example"; // String | The name of the Flow Conventions to retrieve the data for.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Flow Conventions. Defaults to return the latest version if not specified.
    try {
      GetFlowConventionsResponse result = apiInstance.getFlowConventions(scope, code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConventionsApi#getFlowConventions");
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
| **scope** | **String**| The scope of the Flow Conventions to retrieve. | |
| **code** | **String**| The name of the Flow Conventions to retrieve the data for. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Flow Conventions. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**GetFlowConventionsResponse**](GetFlowConventionsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Flow Conventions or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getIndexConvention"></a>
# **getIndexConvention**
> GetIndexConventionResponse getIndexConvention(scope, code, asAt)

[BETA] GetIndexConvention: Get Index Convention

Get a Index Convention from a single scope.  The response will return either the conventions that has been stored, or a failure explaining why the request was unsuccessful.  It is important to always check for any unsuccessful requests (failures).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ConventionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ConventionsApi apiInstance = new ConventionsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Index Convention to retrieve.
    String code = "code_example"; // String | The name of the Index Convention to retrieve the data for.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Index Convention. Defaults to return the latest version if not specified.
    try {
      GetIndexConventionResponse result = apiInstance.getIndexConvention(scope, code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConventionsApi#getIndexConvention");
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
| **scope** | **String**| The scope of the Index Convention to retrieve. | |
| **code** | **String**| The name of the Index Convention to retrieve the data for. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Index Convention. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**GetIndexConventionResponse**](GetIndexConventionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Index Convention or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listCdsFlowConventions"></a>
# **listCdsFlowConventions**
> ResourceListOfGetCdsFlowConventionsResponse listCdsFlowConventions(asAt)

[BETA] ListCdsFlowConventions: List the set of CDS Flow Conventions

List the set of CDS Flow Conventions at the specified date/time

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ConventionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ConventionsApi apiInstance = new ConventionsApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the conventions. Defaults to latest if not specified.
    try {
      ResourceListOfGetCdsFlowConventionsResponse result = apiInstance.listCdsFlowConventions(asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConventionsApi#listCdsFlowConventions");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the conventions. Defaults to latest if not specified. | [optional] |

### Return type

[**ResourceListOfGetCdsFlowConventionsResponse**](ResourceListOfGetCdsFlowConventionsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested CDS Flow conventions |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listFlowConventions"></a>
# **listFlowConventions**
> ResourceListOfGetFlowConventionsResponse listFlowConventions(asAt)

[BETA] ListFlowConventions: List the set of Flow Conventions

List the set of Flow Conventions at the specified date/time

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ConventionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ConventionsApi apiInstance = new ConventionsApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the conventions. Defaults to latest if not specified.
    try {
      ResourceListOfGetFlowConventionsResponse result = apiInstance.listFlowConventions(asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConventionsApi#listFlowConventions");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the conventions. Defaults to latest if not specified. | [optional] |

### Return type

[**ResourceListOfGetFlowConventionsResponse**](ResourceListOfGetFlowConventionsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Flow conventions |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listIndexConvention"></a>
# **listIndexConvention**
> ResourceListOfGetIndexConventionResponse listIndexConvention(asAt)

[BETA] ListIndexConvention: List the set of Index Conventions

List the set of Index Conventions at the specified date/time

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ConventionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ConventionsApi apiInstance = new ConventionsApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the conventions. Defaults to latest if not specified.
    try {
      ResourceListOfGetIndexConventionResponse result = apiInstance.listIndexConvention(asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConventionsApi#listIndexConvention");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the conventions. Defaults to latest if not specified. | [optional] |

### Return type

[**ResourceListOfGetIndexConventionResponse**](ResourceListOfGetIndexConventionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Index conventions |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertCdsFlowConventions"></a>
# **upsertCdsFlowConventions**
> UpsertSingleStructuredDataResponse upsertCdsFlowConventions(upsertCdsFlowConventionsRequest)

[BETA] UpsertCdsFlowConventions: Upsert a set of CDS Flow Conventions. This creates or updates the data in Lusid.

Update or insert CDS Flow Conventions in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted CDS Flow Conventions or failure message if unsuccessful                It is important to always check to verify success (or failure).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ConventionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ConventionsApi apiInstance = new ConventionsApi(defaultClient);
    UpsertCdsFlowConventionsRequest upsertCdsFlowConventionsRequest = new UpsertCdsFlowConventionsRequest(); // UpsertCdsFlowConventionsRequest | The CDS Flow Conventions to update or insert
    try {
      UpsertSingleStructuredDataResponse result = apiInstance.upsertCdsFlowConventions(upsertCdsFlowConventionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConventionsApi#upsertCdsFlowConventions");
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
| **upsertCdsFlowConventionsRequest** | [**UpsertCdsFlowConventionsRequest**](UpsertCdsFlowConventionsRequest.md)| The CDS Flow Conventions to update or insert | |

### Return type

[**UpsertSingleStructuredDataResponse**](UpsertSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted item or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertFlowConventions"></a>
# **upsertFlowConventions**
> UpsertSingleStructuredDataResponse upsertFlowConventions(upsertFlowConventionsRequest)

[BETA] UpsertFlowConventions: Upsert Flow Conventions. This creates or updates the data in Lusid.

Update or insert Flow Conventions in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Flow Conventions or failure message if unsuccessful                It is important to always check to verify success (or failure).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ConventionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ConventionsApi apiInstance = new ConventionsApi(defaultClient);
    UpsertFlowConventionsRequest upsertFlowConventionsRequest = new UpsertFlowConventionsRequest(); // UpsertFlowConventionsRequest | The Flow Conventions to update or insert
    try {
      UpsertSingleStructuredDataResponse result = apiInstance.upsertFlowConventions(upsertFlowConventionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConventionsApi#upsertFlowConventions");
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
| **upsertFlowConventionsRequest** | [**UpsertFlowConventionsRequest**](UpsertFlowConventionsRequest.md)| The Flow Conventions to update or insert | |

### Return type

[**UpsertSingleStructuredDataResponse**](UpsertSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted item or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertIndexConvention"></a>
# **upsertIndexConvention**
> UpsertSingleStructuredDataResponse upsertIndexConvention(upsertIndexConventionRequest)

[BETA] UpsertIndexConvention: Upsert a set of Index Convention. This creates or updates the data in Lusid.

Update or insert Index Convention in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Index Convention or failure message if unsuccessful                It is important to always check to verify success (or failure).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ConventionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ConventionsApi apiInstance = new ConventionsApi(defaultClient);
    UpsertIndexConventionRequest upsertIndexConventionRequest = new UpsertIndexConventionRequest(); // UpsertIndexConventionRequest | The Index Conventions to update or insert
    try {
      UpsertSingleStructuredDataResponse result = apiInstance.upsertIndexConvention(upsertIndexConventionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConventionsApi#upsertIndexConvention");
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
| **upsertIndexConventionRequest** | [**UpsertIndexConventionRequest**](UpsertIndexConventionRequest.md)| The Index Conventions to update or insert | |

### Return type

[**UpsertSingleStructuredDataResponse**](UpsertSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted item or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

