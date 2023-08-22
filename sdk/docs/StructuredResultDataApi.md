# StructuredResultDataApi

All URIs are relative to *https://example.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDataMap**](StructuredResultDataApi.md#createDataMap) | **POST** /api/unitresults/datamap/{scope} | [EXPERIMENTAL] CreateDataMap: Create data map |
| [**deleteStructuredResultData**](StructuredResultDataApi.md#deleteStructuredResultData) | **POST** /api/unitresults/{scope}/$delete | [EXPERIMENTAL] DeleteStructuredResultData: Delete structured result data |
| [**getAddressKeyDefinitionsForDocument**](StructuredResultDataApi.md#getAddressKeyDefinitionsForDocument) | **GET** /api/unitresults/virtualdocument/{scope}/{code}/{source}/{resultType}/addresskeydefinitions | [EARLY ACCESS] GetAddressKeyDefinitionsForDocument: Get AddressKeyDefinitions for a virtual document. |
| [**getDataMap**](StructuredResultDataApi.md#getDataMap) | **POST** /api/unitresults/datamap/{scope}/$get | [EXPERIMENTAL] GetDataMap: Get data map |
| [**getStructuredResultData**](StructuredResultDataApi.md#getStructuredResultData) | **POST** /api/unitresults/{scope}/$get | [EXPERIMENTAL] GetStructuredResultData: Get structured result data |
| [**getVirtualDocument**](StructuredResultDataApi.md#getVirtualDocument) | **POST** /api/unitresults/virtualdocument/{scope}/$get | [EXPERIMENTAL] GetVirtualDocument: Get Virtual Documents |
| [**upsertResultValue**](StructuredResultDataApi.md#upsertResultValue) | **POST** /api/unitresults/resultvalue/{scope} | [EXPERIMENTAL] UpsertResultValue: Upsert result value |
| [**upsertStructuredResultData**](StructuredResultDataApi.md#upsertStructuredResultData) | **POST** /api/unitresults/{scope} | [BETA] UpsertStructuredResultData: Upsert structured result data |


<a id="createDataMap"></a>
# **createDataMap**
> UpsertStructuredDataResponse createDataMap(scope, requestBody)

[EXPERIMENTAL] CreateDataMap: Create data map

Create or update one or more structured result store address definition data maps in a particular scope. Note these are immutable and cannot be changed once created.                In the request, each data map must be keyed by a unique correlation ID. This ID is ephemeral and not stored by LUSID.  It serves only to easily identify each data map object in the response.                The response returns both the collection of successfully created or updated data maps, as well as those that failed.  For each failure, a reason is provided.                It is important to check the failed set for any unsuccessful results.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StructuredResultDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StructuredResultDataApi apiInstance = new StructuredResultDataApi(defaultClient);
    String scope = "scope_example"; // String | The scope in which to create or update data maps.
    Map<String, CreateDataMapRequest> requestBody = new HashMap(); // Map<String, CreateDataMapRequest> | Individual data map creation requests.
    try {
      UpsertStructuredDataResponse result = apiInstance.createDataMap(scope, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StructuredResultDataApi#createDataMap");
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
| **scope** | **String**| The scope in which to create or update data maps. | |
| **requestBody** | [**Map&lt;String, CreateDataMapRequest&gt;**](CreateDataMapRequest.md)| Individual data map creation requests. | |

### Return type

[**UpsertStructuredDataResponse**](UpsertStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully created or updated data maps along with any failures. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteStructuredResultData"></a>
# **deleteStructuredResultData**
> AnnulStructuredDataResponse deleteStructuredResultData(scope, requestBody)

[EXPERIMENTAL] DeleteStructuredResultData: Delete structured result data

Delete one or more structured result data items from a particular scope. Each item is identified by a unique ID which includes  information about its type as well as the exact effective datetime (to the microsecond) at which it entered the system (became valid).                In the request, each data item must be keyed by a unique correlation ID. This ID is ephemeral and not stored by LUSID.  It serves only to easily identify each data item in the response.                The response returns both the collection of successfully deleted data items, as well as those that failed.  For each failure, a reason is provided.                It is important to check the failed set for any unsuccessful results.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StructuredResultDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StructuredResultDataApi apiInstance = new StructuredResultDataApi(defaultClient);
    String scope = "scope_example"; // String | The scope from which to delete data items.
    Map<String, StructuredResultDataId> requestBody = new HashMap(); // Map<String, StructuredResultDataId> | The data IDs to delete, each keyed by a unique, ephemeral correlation ID.
    try {
      AnnulStructuredDataResponse result = apiInstance.deleteStructuredResultData(scope, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StructuredResultDataApi#deleteStructuredResultData");
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
| **scope** | **String**| The scope from which to delete data items. | |
| **requestBody** | [**Map&lt;String, StructuredResultDataId&gt;**](StructuredResultDataId.md)| The data IDs to delete, each keyed by a unique, ephemeral correlation ID. | |

### Return type

[**AnnulStructuredDataResponse**](AnnulStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully deleted data items along with any failures. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getAddressKeyDefinitionsForDocument"></a>
# **getAddressKeyDefinitionsForDocument**
> ResourceListOfAddressKeyDefinition getAddressKeyDefinitionsForDocument(scope, code, source, resultType, effectiveAt, asAt)

[EARLY ACCESS] GetAddressKeyDefinitionsForDocument: Get AddressKeyDefinitions for a virtual document.

For a given virtual document retrieve all the address key definitions that are in use.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StructuredResultDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StructuredResultDataApi apiInstance = new StructuredResultDataApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the document for which address key definitions are retrieved.
    String code = "code_example"; // String | The code of the document for which address key definitions are retrieved.
    String source = "source_example"; // String | The source of the document for which address key definitions are retrieved.
    String resultType = "resultType_example"; // String | The result type of the document for which address key definitions are retrieved.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime to query the document for which the address key definitions are retrieved.              Defaults to querying the latest version if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime to query the document for which the address key definitions are retrieved.              Defaults to querying the latest version if not specified.
    try {
      ResourceListOfAddressKeyDefinition result = apiInstance.getAddressKeyDefinitionsForDocument(scope, code, source, resultType, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StructuredResultDataApi#getAddressKeyDefinitionsForDocument");
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
| **scope** | **String**| The scope of the document for which address key definitions are retrieved. | |
| **code** | **String**| The code of the document for which address key definitions are retrieved. | |
| **source** | **String**| The source of the document for which address key definitions are retrieved. | |
| **resultType** | **String**| The result type of the document for which address key definitions are retrieved. | |
| **effectiveAt** | **String**| The effective datetime to query the document for which the address key definitions are retrieved.              Defaults to querying the latest version if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime to query the document for which the address key definitions are retrieved.              Defaults to querying the latest version if not specified. | [optional] |

### Return type

[**ResourceListOfAddressKeyDefinition**](ResourceListOfAddressKeyDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A collection of address key definitions. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getDataMap"></a>
# **getDataMap**
> GetDataMapResponse getDataMap(scope, requestBody)

[EXPERIMENTAL] GetDataMap: Get data map

Retrieve one or more structured result store address definition data maps from a particular scope.                Each data map can be identified by its invariant key, which can be thought of as a permanent URL.  For each ID, LUSID returns the most recently matched item.                In the request, each data map must be keyed by a unique correlation ID. This ID is ephemeral and not stored by LUSID.  It serves only to easily identify each data map in the response.                The response returns three collections. The first contains successfully retrieved data maps. The second contains those with a  valid identifier but that could not be found. The third contains those that failed because LUSID could not construct a valid identifier from the request.                For the IDs that failed to resolve or could not be found, a reason is provided.                It is important to check the failed sets for any unsuccessful results.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StructuredResultDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StructuredResultDataApi apiInstance = new StructuredResultDataApi(defaultClient);
    String scope = "scope_example"; // String | The scope from which to retrieve data maps.
    Map<String, DataMapKey> requestBody = new HashMap(); // Map<String, DataMapKey> | The data map keys to look up, each keyed by a unique, ephemeral correlation ID.
    try {
      GetDataMapResponse result = apiInstance.getDataMap(scope, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StructuredResultDataApi#getDataMap");
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
| **scope** | **String**| The scope from which to retrieve data maps. | |
| **requestBody** | [**Map&lt;String, DataMapKey&gt;**](DataMapKey.md)| The data map keys to look up, each keyed by a unique, ephemeral correlation ID. | |

### Return type

[**GetDataMapResponse**](GetDataMapResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved data maps along with any failures. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getStructuredResultData"></a>
# **getStructuredResultData**
> GetStructuredResultDataResponse getStructuredResultData(scope, requestBody, asAt, maxAge)

[EXPERIMENTAL] GetStructuredResultData: Get structured result data

Retrieve one or more structured result data items from a particular scope.                Each item can be identified by its time invariant structured result data identifier. For each ID, LUSID  returns the most recently matched item with respect to the provided (or default) effective datetime.                 An optional maximum age range window can be specified to control how far back to look from the specified  effective datetime. LUSID returns the most recent item within this window.                In the request, each data item must be keyed by a unique correlation ID. This ID is ephemeral and not stored by LUSID.  It serves only to easily identify each data item in the response.    The response returns three collections. The first contains successfully retrieved data items. The second contains those with a  valid identifier but that could not be found. The third contains those that failed because LUSID could not construct a valid identifier from the request.    For the IDs that failed to resolve or could not be found, a reason is provided.                It is important to check the failed sets for any unsuccessful results.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StructuredResultDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StructuredResultDataApi apiInstance = new StructuredResultDataApi(defaultClient);
    String scope = "scope_example"; // String | The scope from which to retrieve data items.
    Map<String, StructuredResultDataId> requestBody = new HashMap(); // Map<String, StructuredResultDataId> | The time invariant set of structured data identifiers to retrieve, keyed by a unique, ephemeral correlation ID.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the structured result data. Defaults to returning the latest version if not specified.
    String maxAge = "maxAge_example"; // String | The duration of the look-back window in ISO8601 time interval format, for example 'P1Y2M3DT4H30M' (1 year, 2 months, 3 days, 4 hours and 30 minutes).               This is subtracted from the provided effectiveAt datetime to generate a effective datetime window inside which a data item must exist to be retrieved.
    try {
      GetStructuredResultDataResponse result = apiInstance.getStructuredResultData(scope, requestBody, asAt, maxAge);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StructuredResultDataApi#getStructuredResultData");
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
| **scope** | **String**| The scope from which to retrieve data items. | |
| **requestBody** | [**Map&lt;String, StructuredResultDataId&gt;**](StructuredResultDataId.md)| The time invariant set of structured data identifiers to retrieve, keyed by a unique, ephemeral correlation ID. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the structured result data. Defaults to returning the latest version if not specified. | [optional] |
| **maxAge** | **String**| The duration of the look-back window in ISO8601 time interval format, for example &#39;P1Y2M3DT4H30M&#39; (1 year, 2 months, 3 days, 4 hours and 30 minutes).               This is subtracted from the provided effectiveAt datetime to generate a effective datetime window inside which a data item must exist to be retrieved. | [optional] |

### Return type

[**GetStructuredResultDataResponse**](GetStructuredResultDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved data items along with any failures. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getVirtualDocument"></a>
# **getVirtualDocument**
> GetVirtualDocumentResponse getVirtualDocument(scope, requestBody, asAt)

[EXPERIMENTAL] GetVirtualDocument: Get Virtual Documents

Retrieve one or more virtual documents from a particular scope.                Each item can be identified by its time invariant structured result data identifier. For each ID, LUSID  returns the most recently matched item with respect to the provided effective datetime.                In the request, each data item must be keyed by a unique correlation ID. This ID is ephemeral and not stored by LUSID.  It serves only to easily identify each data item in the response.                The response returns two collections. The first contains successfully retrieved data items. The second contains those with a  valid identifier but that could not be found, or those that failed because LUSID could not construct a valid identifier from the request.                For the IDs that failed to resolve or could not be found, a reason is provided.                It is important to check the failed sets for any unsuccessful results.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StructuredResultDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StructuredResultDataApi apiInstance = new StructuredResultDataApi(defaultClient);
    String scope = "scope_example"; // String | The scope in which to construct the virtual documents.
    Map<String, StructuredResultDataId> requestBody = new HashMap(); // Map<String, StructuredResultDataId> | The time invariant set of structured data identifiers to retrieve, keyed by a unique, ephemeral correlation ID.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the structured result data. Defaults to returning the latest version if not specified.
    try {
      GetVirtualDocumentResponse result = apiInstance.getVirtualDocument(scope, requestBody, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StructuredResultDataApi#getVirtualDocument");
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
| **scope** | **String**| The scope in which to construct the virtual documents. | |
| **requestBody** | [**Map&lt;String, StructuredResultDataId&gt;**](StructuredResultDataId.md)| The time invariant set of structured data identifiers to retrieve, keyed by a unique, ephemeral correlation ID. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the structured result data. Defaults to returning the latest version if not specified. | [optional] |

### Return type

[**GetVirtualDocumentResponse**](GetVirtualDocumentResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved virtual documents along with any failures. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertResultValue"></a>
# **upsertResultValue**
> UpsertStructuredDataResponse upsertResultValue(scope, requestBody)

[EXPERIMENTAL] UpsertResultValue: Upsert result value

Create or update one or more Upsert one or more result values in a particular scope. An item is updated if it already exists  and created if it does not.                In the request, each data item must be keyed by a unique correlation ID. This ID is ephemeral and not stored by LUSID.  It serves only to easily identify each data item in the response.                The response returns both the collection of successfully created or updated data items, as well as those that failed.  For each failure, a reason is provided.                It is important to check the failed set for any unsuccessful results.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StructuredResultDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StructuredResultDataApi apiInstance = new StructuredResultDataApi(defaultClient);
    String scope = "scope_example"; // String | The scope in which to construct the virtual documents.
    Map<String, UpsertResultValuesDataRequest> requestBody = new HashMap(); // Map<String, UpsertResultValuesDataRequest> | The time invariant set of structured data identifiers to retrieve, keyed by a unique, ephemeral correlation ID.
    try {
      UpsertStructuredDataResponse result = apiInstance.upsertResultValue(scope, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StructuredResultDataApi#upsertResultValue");
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
| **scope** | **String**| The scope in which to construct the virtual documents. | |
| **requestBody** | [**Map&lt;String, UpsertResultValuesDataRequest&gt;**](UpsertResultValuesDataRequest.md)| The time invariant set of structured data identifiers to retrieve, keyed by a unique, ephemeral correlation ID. | |

### Return type

[**UpsertStructuredDataResponse**](UpsertStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved virtual documents along with any failures. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertStructuredResultData"></a>
# **upsertStructuredResultData**
> UpsertStructuredDataResponse upsertStructuredResultData(scope, requestBody)

[BETA] UpsertStructuredResultData: Upsert structured result data

Create or update one or more structured result data items in a particular scope. An item is updated if it already exists  and created if it does not.                In the request, each data item must be keyed by a unique correlation ID. This ID is ephemeral and not stored by LUSID.  It serves only to easily identify each data item in the response.                The response returns both the collection of successfully created or updated data items, as well as those that failed.  For each failure, a reason is provided.                It is important to check the failed set for any unsuccessful results.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.StructuredResultDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    StructuredResultDataApi apiInstance = new StructuredResultDataApi(defaultClient);
    String scope = "scope_example"; // String | The scope in which to create or update data items.
    Map<String, UpsertStructuredResultDataRequest> requestBody = new HashMap(); // Map<String, UpsertStructuredResultDataRequest> | The set of data items to create or update, keyed by a unique, ephemeral correlation ID.
    try {
      UpsertStructuredDataResponse result = apiInstance.upsertStructuredResultData(scope, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StructuredResultDataApi#upsertStructuredResultData");
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
| **scope** | **String**| The scope in which to create or update data items. | |
| **requestBody** | [**Map&lt;String, UpsertStructuredResultDataRequest&gt;**](UpsertStructuredResultDataRequest.md)| The set of data items to create or update, keyed by a unique, ephemeral correlation ID. | |

### Return type

[**UpsertStructuredDataResponse**](UpsertStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully created or updated data items along with any failures. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

