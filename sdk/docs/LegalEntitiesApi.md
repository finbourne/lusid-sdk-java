# LegalEntitiesApi

All URIs are relative to *http://local-unit-test-server.lusid.com:54488*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteLegalEntity**](LegalEntitiesApi.md#deleteLegalEntity) | **DELETE** /api/legalentities/{idTypeScope}/{idTypeCode}/{code} | [EARLY ACCESS] DeleteLegalEntity: Delete Legal Entity
[**deleteLegalEntityAccessMetadata**](LegalEntitiesApi.md#deleteLegalEntityAccessMetadata) | **DELETE** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | [EARLY ACCESS] DeleteLegalEntityAccessMetadata: Delete a Legal Entity Access Metadata entry
[**deleteLegalEntityIdentifiers**](LegalEntitiesApi.md#deleteLegalEntityIdentifiers) | **DELETE** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/identifiers | [EARLY ACCESS] DeleteLegalEntityIdentifiers: Delete Legal Entity Identifiers
[**getAllLegalEntityAccessMetadata**](LegalEntitiesApi.md#getAllLegalEntityAccessMetadata) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata | [EARLY ACCESS] GetAllLegalEntityAccessMetadata: Get Access Metadata rules for a Legal Entity
[**getLegalEntity**](LegalEntitiesApi.md#getLegalEntity) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code} | [EARLY ACCESS] GetLegalEntity: Get Legal Entity
[**getLegalEntityAccessMetadataByKey**](LegalEntitiesApi.md#getLegalEntityAccessMetadataByKey) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | [EARLY ACCESS] GetLegalEntityAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Legal Entity
[**listLegalEntities**](LegalEntitiesApi.md#listLegalEntities) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode} | [EARLY ACCESS] ListLegalEntities: List Legal Entities
[**setLegalEntityIdentifiers**](LegalEntitiesApi.md#setLegalEntityIdentifiers) | **POST** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/identifiers | [EARLY ACCESS] SetLegalEntityIdentifiers: Set Legal Entity Identifiers
[**setLegalEntityProperties**](LegalEntitiesApi.md#setLegalEntityProperties) | **POST** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/properties | [EARLY ACCESS] SetLegalEntityProperties: Set Legal Entity Properties
[**upsertLegalEntity**](LegalEntitiesApi.md#upsertLegalEntity) | **POST** /api/legalentities | [EARLY ACCESS] UpsertLegalEntity: Upsert Legal Entity
[**upsertLegalEntityAccessMetadata**](LegalEntitiesApi.md#upsertLegalEntityAccessMetadata) | **PUT** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | [EARLY ACCESS] UpsertLegalEntityAccessMetadata: Upsert a Legal Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.


<a name="deleteLegalEntity"></a>
# **deleteLegalEntity**
> DeletedEntityResponse deleteLegalEntity(idTypeScope, idTypeCode, code)

[EARLY ACCESS] DeleteLegalEntity: Delete Legal Entity

Delete a legal entity. Deletion will be valid from the legal entity&#39;s creation datetime.  This means that the legal entity will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.LegalEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:54488");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | The scope of the legal entity identifier type.
    String idTypeCode = "idTypeCode_example"; // String | The code of the legal entity identifier type.
    String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with defined              identifier type uniquely identifies the legal entity to delete.
    try {
      DeletedEntityResponse result = apiInstance.deleteLegalEntity(idTypeScope, idTypeCode, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#deleteLegalEntity");
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
 **idTypeScope** | **String**| The scope of the legal entity identifier type. |
 **idTypeCode** | **String**| The code of the legal entity identifier type. |
 **code** | **String**| Code of the legal entity under specified identifier type&#39;s scope and code. This together with defined              identifier type uniquely identifies the legal entity to delete. |

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
**200** | The response from deleting legal entity. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deleteLegalEntityAccessMetadata"></a>
# **deleteLegalEntityAccessMetadata**
> DeletedEntityResponse deleteLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil)

[EARLY ACCESS] DeleteLegalEntityAccessMetadata: Delete a Legal Entity Access Metadata entry

Deletes the Legal Entity Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.LegalEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:54488");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the Legal Entity identifier.
    String idTypeCode = "idTypeCode_example"; // String | Code of the Legal Entity identifier.
    String code = "code_example"; // String | Code of the Legal Entity under specified identifier type's scope and code.
    String metadataKey = "metadataKey_example"; // String | Key of the metadata entry to retrieve
    String effectiveAt = "effectiveAt_example"; // String | The effective date to delete at, if this is not supplied, it will delete all data found
    OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' date of the Access Metadata
    try {
      DeletedEntityResponse result = apiInstance.deleteLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#deleteLegalEntityAccessMetadata");
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
 **idTypeScope** | **String**| Scope of the Legal Entity identifier. |
 **idTypeCode** | **String**| Code of the Legal Entity identifier. |
 **code** | **String**| Code of the Legal Entity under specified identifier type&#39;s scope and code. |
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

<a name="deleteLegalEntityIdentifiers"></a>
# **deleteLegalEntityIdentifiers**
> DeletedEntityResponse deleteLegalEntityIdentifiers(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt)

[EARLY ACCESS] DeleteLegalEntityIdentifiers: Delete Legal Entity Identifiers

Delete identifiers that belong to the given property keys of the legal entity.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.LegalEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:54488");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
    String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with stated identifier type uniquely              identifies the legal entity.
    List<String> propertyKeys = Arrays.asList(); // List<String> | The property keys of the identifiers to delete. These take the format              {domain}/{scope}/{code} e.g. \"LegalEntity/CreditAgency/Identifier\". Each property must be from the \"LegalEntity\" domain. Identifiers or identifiers not specified in request will not be changed.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to delete the identifiers. Defaults to the current LUSID system datetime if not specified.              Must not include an effective datetime if identifiers are perpetual.
    try {
      DeletedEntityResponse result = apiInstance.deleteLegalEntityIdentifiers(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#deleteLegalEntityIdentifiers");
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
 **idTypeScope** | **String**| Scope of the legal entity identifier type. |
 **idTypeCode** | **String**| Code of the legal entity identifier type. |
 **code** | **String**| Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. |
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| The property keys of the identifiers to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;LegalEntity/CreditAgency/Identifier\&quot;. Each property must be from the \&quot;LegalEntity\&quot; domain. Identifiers or identifiers not specified in request will not be changed. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to delete the identifiers. Defaults to the current LUSID system datetime if not specified.              Must not include an effective datetime if identifiers are perpetual. | [optional]

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
**200** | The datetime that the identifiers were deleted from the specified legal entity |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getAllLegalEntityAccessMetadata"></a>
# **getAllLegalEntityAccessMetadata**
> Map&lt;String, List&lt;AccessMetadataValue&gt;&gt; getAllLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, effectiveAt, asAt)

[EARLY ACCESS] GetAllLegalEntityAccessMetadata: Get Access Metadata rules for a Legal Entity

Pass the Scope and Code of the Legal Entity identifier along with the Legal Entity code parameter to retrieve the associated Access Metadata

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.LegalEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:54488");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the Legal Entity identifier.
    String idTypeCode = "idTypeCode_example"; // String | Code of the Legal Entity identifier.
    String code = "code_example"; // String | Code of the Legal Entity under specified identifier type's scope and code.
    String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to retrieve the Access Metadata
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Access Metadata
    try {
      Map<String, List<AccessMetadataValue>> result = apiInstance.getAllLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#getAllLegalEntityAccessMetadata");
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
 **idTypeScope** | **String**| Scope of the Legal Entity identifier. |
 **idTypeCode** | **String**| Code of the Legal Entity identifier. |
 **code** | **String**| Code of the Legal Entity under specified identifier type&#39;s scope and code. |
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
**200** | The access metadata for the Legal Entity or any failure. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getLegalEntity"></a>
# **getLegalEntity**
> LegalEntity getLegalEntity(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt)

[EARLY ACCESS] GetLegalEntity: Get Legal Entity

Retrieve the definition of a legal entity.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.LegalEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:54488");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
    String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with stated identifier type uniquely              identifies the legal entity.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys or identifier types (as property keys) from the \"LegalEntity\" domain to include for found legal entity.              These take the format {domain}/{scope}/{code} e.g. \"LegalEntity/ContactDetails/Address\".
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the legal entity. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the legal entity. Defaults to return the latest version of the legal entity if not specified.
    try {
      LegalEntity result = apiInstance.getLegalEntity(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#getLegalEntity");
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
 **idTypeScope** | **String**| Scope of the legal entity identifier type. |
 **idTypeCode** | **String**| Code of the legal entity identifier type. |
 **code** | **String**| Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. |
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys or identifier types (as property keys) from the \&quot;LegalEntity\&quot; domain to include for found legal entity.              These take the format {domain}/{scope}/{code} e.g. \&quot;LegalEntity/ContactDetails/Address\&quot;. | [optional]
 **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the legal entity. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the legal entity. Defaults to return the latest version of the legal entity if not specified. | [optional]

### Return type

[**LegalEntity**](LegalEntity.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested legal entity |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getLegalEntityAccessMetadataByKey"></a>
# **getLegalEntityAccessMetadataByKey**
> List&lt;AccessMetadataValue&gt; getLegalEntityAccessMetadataByKey(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt)

[EARLY ACCESS] GetLegalEntityAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Legal Entity

Get a specific Legal Entity Access Metadata by specifying the corresponding identifier parts and Legal Entity code                No matching will be performed through this endpoint. To retrieve an entry, it is necessary to specify, exactly, the identifier of the entry

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.LegalEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:54488");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the Legal Entity identifier.
    String idTypeCode = "idTypeCode_example"; // String | Code of the Legal Entity identifier.
    String code = "code_example"; // String | Code of the Legal Entity under specified identifier type's scope and code.
    String metadataKey = "metadataKey_example"; // String | Key of the metadata entry to retrieve
    String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to retrieve the Access Metadata
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Access Metadata
    try {
      List<AccessMetadataValue> result = apiInstance.getLegalEntityAccessMetadataByKey(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#getLegalEntityAccessMetadataByKey");
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
 **idTypeScope** | **String**| Scope of the Legal Entity identifier. |
 **idTypeCode** | **String**| Code of the Legal Entity identifier. |
 **code** | **String**| Code of the Legal Entity under specified identifier type&#39;s scope and code. |
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
**200** | The successfully retrieved Legal Entity access metadata filtered by metadataKey or any failure. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listLegalEntities"></a>
# **listLegalEntities**
> PagedResourceListOfLegalEntity listLegalEntities(idTypeScope, idTypeCode, effectiveAt, asAt, page, limit, filter, propertyKeys)

[EARLY ACCESS] ListLegalEntities: List Legal Entities

List legal entities which has identifier of specific identifier type&#39;s scope and code, and satisfies filter criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.LegalEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:54488");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing legal entities from a previous call to list legal entities. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt  and asAt fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys or identifier types (as property keys) from the \"LegalEntity\" domain to include for each legal entity.              These take the format {domain}/{scope}/{code} e.g. \"LegalEntity/ContactDetails/Address\".
    try {
      PagedResourceListOfLegalEntity result = apiInstance.listLegalEntities(idTypeScope, idTypeCode, effectiveAt, asAt, page, limit, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#listLegalEntities");
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
 **idTypeScope** | **String**| Scope of the legal entity identifier type. |
 **idTypeCode** | **String**| Code of the legal entity identifier type. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. | [optional]
 **page** | **String**| The pagination token to use to continue listing legal entities from a previous call to list legal entities. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt  and asAt fields must not have changed since the original request. | [optional]
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set.               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys or identifier types (as property keys) from the \&quot;LegalEntity\&quot; domain to include for each legal entity.              These take the format {domain}/{scope}/{code} e.g. \&quot;LegalEntity/ContactDetails/Address\&quot;. | [optional]

### Return type

[**PagedResourceListOfLegalEntity**](PagedResourceListOfLegalEntity.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Legal Entities with specified identifier type |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="setLegalEntityIdentifiers"></a>
# **setLegalEntityIdentifiers**
> LegalEntity setLegalEntityIdentifiers(idTypeScope, idTypeCode, code, setLegalEntityIdentifiersRequest)

[EARLY ACCESS] SetLegalEntityIdentifiers: Set Legal Entity Identifiers

Set identifiers of the Legal Entity.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.LegalEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:54488");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
    String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with stated identifier type uniquely              identifies the legal entity.
    SetLegalEntityIdentifiersRequest setLegalEntityIdentifiersRequest = new SetLegalEntityIdentifiersRequest(); // SetLegalEntityIdentifiersRequest | Request containing identifiers to set for the legal entity. Identifiers not specified in request will not be changed.
    try {
      LegalEntity result = apiInstance.setLegalEntityIdentifiers(idTypeScope, idTypeCode, code, setLegalEntityIdentifiersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#setLegalEntityIdentifiers");
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
 **idTypeScope** | **String**| Scope of the legal entity identifier type. |
 **idTypeCode** | **String**| Code of the legal entity identifier type. |
 **code** | **String**| Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. |
 **setLegalEntityIdentifiersRequest** | [**SetLegalEntityIdentifiersRequest**](SetLegalEntityIdentifiersRequest.md)| Request containing identifiers to set for the legal entity. Identifiers not specified in request will not be changed. |

### Return type

[**LegalEntity**](LegalEntity.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Legal Entity with updated identifiers |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="setLegalEntityProperties"></a>
# **setLegalEntityProperties**
> LegalEntity setLegalEntityProperties(idTypeScope, idTypeCode, code, setLegalEntityPropertiesRequest)

[EARLY ACCESS] SetLegalEntityProperties: Set Legal Entity Properties

Set properties of the legal entity.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.LegalEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:54488");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
    String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with stated identifier type uniquely              identifies the legal entity.
    SetLegalEntityPropertiesRequest setLegalEntityPropertiesRequest = new SetLegalEntityPropertiesRequest(); // SetLegalEntityPropertiesRequest | Request containing properties to set for the legal entity. Properties not specified in request will not be changed.
    try {
      LegalEntity result = apiInstance.setLegalEntityProperties(idTypeScope, idTypeCode, code, setLegalEntityPropertiesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#setLegalEntityProperties");
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
 **idTypeScope** | **String**| Scope of the legal entity identifier type. |
 **idTypeCode** | **String**| Code of the legal entity identifier type. |
 **code** | **String**| Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the legal entity. |
 **setLegalEntityPropertiesRequest** | [**SetLegalEntityPropertiesRequest**](SetLegalEntityPropertiesRequest.md)| Request containing properties to set for the legal entity. Properties not specified in request will not be changed. |

### Return type

[**LegalEntity**](LegalEntity.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Legal Entity with updated properties |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertLegalEntity"></a>
# **upsertLegalEntity**
> LegalEntity upsertLegalEntity(upsertLegalEntityRequest)

[EARLY ACCESS] UpsertLegalEntity: Upsert Legal Entity

Create or update a legal entity

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.LegalEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:54488");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    UpsertLegalEntityRequest upsertLegalEntityRequest = new UpsertLegalEntityRequest(); // UpsertLegalEntityRequest | Request to create or update a legal entity.
    try {
      LegalEntity result = apiInstance.upsertLegalEntity(upsertLegalEntityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#upsertLegalEntity");
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
 **upsertLegalEntityRequest** | [**UpsertLegalEntityRequest**](UpsertLegalEntityRequest.md)| Request to create or update a legal entity. |

### Return type

[**LegalEntity**](LegalEntity.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The newly created or updated legal entity |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertLegalEntityAccessMetadata"></a>
# **upsertLegalEntityAccessMetadata**
> ResourceListOfAccessMetadataValueOf upsertLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, upsertLegalEntityAccessMetadataRequest, effectiveAt, effectiveUntil)

[EARLY ACCESS] UpsertLegalEntityAccessMetadata: Upsert a Legal Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.

Update or insert one Legal Entity Access Metadata entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Legal Entity Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.LegalEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:54488");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the Legal Entity identifier.
    String idTypeCode = "idTypeCode_example"; // String | Code of the Legal Entity identifier.
    String code = "code_example"; // String | Code of the Legal Entity under specified identifier type's scope and code.
    String metadataKey = "metadataKey_example"; // String | Key of the metadata entry to retrieve
    UpsertLegalEntityAccessMetadataRequest upsertLegalEntityAccessMetadataRequest = new UpsertLegalEntityAccessMetadataRequest(); // UpsertLegalEntityAccessMetadataRequest | The Legal Entity Access Metadata entry to upsert
    String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to upsert the Access Metadata
    OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' datetime of the Access Metadata
    try {
      ResourceListOfAccessMetadataValueOf result = apiInstance.upsertLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, upsertLegalEntityAccessMetadataRequest, effectiveAt, effectiveUntil);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LegalEntitiesApi#upsertLegalEntityAccessMetadata");
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
 **idTypeScope** | **String**| Scope of the Legal Entity identifier. |
 **idTypeCode** | **String**| Code of the Legal Entity identifier. |
 **code** | **String**| Code of the Legal Entity under specified identifier type&#39;s scope and code. |
 **metadataKey** | **String**| Key of the metadata entry to retrieve |
 **upsertLegalEntityAccessMetadataRequest** | [**UpsertLegalEntityAccessMetadataRequest**](UpsertLegalEntityAccessMetadataRequest.md)| The Legal Entity Access Metadata entry to upsert |
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

