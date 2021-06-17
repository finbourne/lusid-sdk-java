# LegalEntitiesApi

All URIs are relative to *http://local-unit-test-server.lusid.com:35220*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteLegalEntity**](LegalEntitiesApi.md#deleteLegalEntity) | **DELETE** /api/legalentities/{idTypeScope}/{idTypeCode}/{code} | [EARLY ACCESS] Delete Legal Entity
[**getLegalEntity**](LegalEntitiesApi.md#getLegalEntity) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code} | [EARLY ACCESS] Get Legal Entity
[**listLegalEntities**](LegalEntitiesApi.md#listLegalEntities) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode} | [EARLY ACCESS] List Legal Entities
[**upsertLegalEntity**](LegalEntitiesApi.md#upsertLegalEntity) | **POST** /api/legalentities | [EARLY ACCESS] Upsert Legal Entity


<a name="deleteLegalEntity"></a>
# **deleteLegalEntity**
> DeletedEntityResponse deleteLegalEntity(idTypeScope, idTypeCode, code)

[EARLY ACCESS] Delete Legal Entity

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:35220");
    
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

<a name="getLegalEntity"></a>
# **getLegalEntity**
> LegalEntity getLegalEntity(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt)

[EARLY ACCESS] Get Legal Entity

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:35220");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
    String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with stated identifier type uniquely              identifies the legal entity.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys or identifier types (as property keys) from the \"LegalEntity\" domain to include for found legal entity.              These take the format {domain}/{scope}/{code} e.g. \"LegalEntity/ContactDetails/Address\".
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the legal entity. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the legal entity. Defaults to return the latest version of the legal entity if not specified.
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

<a name="listLegalEntities"></a>
# **listLegalEntities**
> PagedResourceListOfLegalEntity listLegalEntities(idTypeScope, idTypeCode, effectiveAt, asAt, page, limit, filter, propertyKeys)

[EARLY ACCESS] List Legal Entities

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:35220");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing legal entities from a previous call to list legal entities. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt  and asAt fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 65,535 if not specified.
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
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 65,535 if not specified. | [optional]
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

<a name="upsertLegalEntity"></a>
# **upsertLegalEntity**
> LegalEntity upsertLegalEntity(upsertLegalEntityRequest)

[EARLY ACCESS] Upsert Legal Entity

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:35220");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    LegalEntitiesApi apiInstance = new LegalEntitiesApi(defaultClient);
    UpsertLegalEntityRequest upsertLegalEntityRequest = {"identifiers":{"legalEntity/ExternalIdentifier/LEI":{"key":"LegalEntity/ExternalIdentifier/LEI","value":{"labelValue":"LEI_12345678"}},"legalEntity/InternalIdentifier/InternalLeiId":{"key":"LegalEntity/InternalIdentifier/InternalLeiId","value":{"labelValue":"Internal_XHSP2038"}}},"properties":{"legalEntity/Details/Name":{"key":"LegalEntity/Details/Name","value":{"labelValue":"Legal Entity Inc."}},"legalEntity/Details/Country":{"key":"LegalEntity/Details/Country","value":{"labelValue":"United Kingdom"},"effectiveFrom":"2016-01-01T00:00:00.0000000+00:00"},"legalEntity/Status/Active":{"key":"LegalEntity/Status/Active","value":{"labelValue":"Active"},"effectiveFrom":"2016-07-01T00:00:00.0000000+00:00"}},"displayName":"LegalEntity1DisplayName","description":"LegalEntity1Description"}; // UpsertLegalEntityRequest | Request to create or update a legal entity.
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

