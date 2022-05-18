# PersonsApi

All URIs are relative to *http://local-unit-test-server.lusid.com:64501*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePersonAccessMetadata**](PersonsApi.md#deletePersonAccessMetadata) | **DELETE** /api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | [EARLY ACCESS] DeletePersonAccessMetadata: Delete a Person Access Metadata entry
[**getAllPersonAccessMetadata**](PersonsApi.md#getAllPersonAccessMetadata) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata | [EARLY ACCESS] GetAllPersonAccessMetadata: Get Access Metadata rules for a Person
[**getPersonAccessMetadataByKey**](PersonsApi.md#getPersonAccessMetadataByKey) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | [EARLY ACCESS] GetPersonAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Person
[**upsertPersonAccessMetadata**](PersonsApi.md#upsertPersonAccessMetadata) | **PUT** /api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | [EARLY ACCESS] UpsertPersonAccessMetadata: Upsert a Person Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.


<a name="deletePersonAccessMetadata"></a>
# **deletePersonAccessMetadata**
> DeletedEntityResponse deletePersonAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil)

[EARLY ACCESS] DeletePersonAccessMetadata: Delete a Person Access Metadata entry

Deletes the Person Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PersonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:64501");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person identifier.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person identifier.
    String code = "code_example"; // String | Code of the person under specified identifier type's scope and code.
    String metadataKey = "metadataKey_example"; // String | Key of the metadata entry to retrieve
    String effectiveAt = "effectiveAt_example"; // String | The effective date to delete at, if this is not supplied, it will delete all data found
    OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' date of the Access Metadata
    try {
      DeletedEntityResponse result = apiInstance.deletePersonAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#deletePersonAccessMetadata");
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
 **idTypeScope** | **String**| Scope of the person identifier. |
 **idTypeCode** | **String**| Code of the person identifier. |
 **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. |
 **metadataKey** | **String**| Key of the metadata entry to retrieve |
 **effectiveAt** | **String**| The effective date to delete at, if this is not supplied, it will delete all data found | [optional]
 **effectiveUntil** | **OffsetDateTime**| The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata | [optional]

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
**200** | The Access Metadata with the given metadataKey has been deleted |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getAllPersonAccessMetadata"></a>
# **getAllPersonAccessMetadata**
> Map&lt;String, List&lt;AccessMetadataValue&gt;&gt; getAllPersonAccessMetadata(idTypeScope, idTypeCode, code, effectiveAt, asAt)

[EARLY ACCESS] GetAllPersonAccessMetadata: Get Access Metadata rules for a Person

Pass the Scope and Code of the Person identifier along with the person code parameter to retrieve the associated Access Metadata

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PersonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:64501");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person identifier.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person identifier.
    String code = "code_example"; // String | Code of the person under specified identifier type's scope and code.
    String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to retrieve the Access Metadata
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Access Metadata
    try {
      Map<String, List<AccessMetadataValue>> result = apiInstance.getAllPersonAccessMetadata(idTypeScope, idTypeCode, code, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#getAllPersonAccessMetadata");
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
 **idTypeScope** | **String**| Scope of the person identifier. |
 **idTypeCode** | **String**| Code of the person identifier. |
 **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. |
 **effectiveAt** | **String**| The effectiveAt datetime at which to retrieve the Access Metadata | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Access Metadata | [optional]

### Return type

[**Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;**](List.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The access metadata for the Person or any failure. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPersonAccessMetadataByKey"></a>
# **getPersonAccessMetadataByKey**
> List&lt;AccessMetadataValue&gt; getPersonAccessMetadataByKey(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt)

[EARLY ACCESS] GetPersonAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Person

Get a specific Person Access Metadata by specifying the corresponding identifier parts and Person code                No matching will be performed through this endpoint. To retrieve an entry, it is necessary to specify, exactly, the identifier of the entry

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PersonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:64501");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person identifier.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person identifier.
    String code = "code_example"; // String | Code of the person under specified identifier type's scope and code.
    String metadataKey = "metadataKey_example"; // String | Key of the metadata entry to retrieve
    String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to retrieve the Access Metadata
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Access Metadata
    try {
      List<AccessMetadataValue> result = apiInstance.getPersonAccessMetadataByKey(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#getPersonAccessMetadataByKey");
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
 **idTypeScope** | **String**| Scope of the person identifier. |
 **idTypeCode** | **String**| Code of the person identifier. |
 **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. |
 **metadataKey** | **String**| Key of the metadata entry to retrieve |
 **effectiveAt** | **String**| The effectiveAt datetime at which to retrieve the Access Metadata | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Access Metadata | [optional]

### Return type

[**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The successfully retrieved Person access metadata filtered by metadataKey or any failure. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertPersonAccessMetadata"></a>
# **upsertPersonAccessMetadata**
> ResourceListOfAccessMetadataValueOf upsertPersonAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, upsertPersonAccessMetadataRequest, effectiveAt, effectiveUntil)

[EARLY ACCESS] UpsertPersonAccessMetadata: Upsert a Person Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.

Update or insert one Person Access Metadata entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Person Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PersonsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:64501");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person identifier.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person identifier.
    String code = "code_example"; // String | Code of the person under specified identifier type's scope and code.
    String metadataKey = "metadataKey_example"; // String | Key of the metadata entry to retrieve
    UpsertPersonAccessMetadataRequest upsertPersonAccessMetadataRequest = new UpsertPersonAccessMetadataRequest(); // UpsertPersonAccessMetadataRequest | The Person Access Metadata entry to upsert
    String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to upsert the Access Metadata
    OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' datetime of the Access Metadata
    try {
      ResourceListOfAccessMetadataValueOf result = apiInstance.upsertPersonAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, upsertPersonAccessMetadataRequest, effectiveAt, effectiveUntil);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#upsertPersonAccessMetadata");
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
 **idTypeScope** | **String**| Scope of the person identifier. |
 **idTypeCode** | **String**| Code of the person identifier. |
 **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. |
 **metadataKey** | **String**| Key of the metadata entry to retrieve |
 **upsertPersonAccessMetadataRequest** | [**UpsertPersonAccessMetadataRequest**](UpsertPersonAccessMetadataRequest.md)| The Person Access Metadata entry to upsert |
 **effectiveAt** | **String**| The effectiveAt datetime at which to upsert the Access Metadata | [optional]
 **effectiveUntil** | **OffsetDateTime**| The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata | [optional]

### Return type

[**ResourceListOfAccessMetadataValueOf**](ResourceListOfAccessMetadataValueOf.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The successfully updated or inserted item or any failure. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

