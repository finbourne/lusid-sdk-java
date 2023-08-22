# PersonsApi

All URIs are relative to *https://example.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePerson**](PersonsApi.md#deletePerson) | **DELETE** /api/persons/{idTypeScope}/{idTypeCode}/{code} | [EARLY ACCESS] DeletePerson: Delete person |
| [**deletePersonAccessMetadata**](PersonsApi.md#deletePersonAccessMetadata) | **DELETE** /api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | [EARLY ACCESS] DeletePersonAccessMetadata: Delete a Person Access Metadata entry |
| [**deletePersonIdentifiers**](PersonsApi.md#deletePersonIdentifiers) | **DELETE** /api/persons/{idTypeScope}/{idTypeCode}/{code}/identifiers | [EARLY ACCESS] DeletePersonIdentifiers: Delete Person Identifiers |
| [**deletePersonProperties**](PersonsApi.md#deletePersonProperties) | **DELETE** /api/persons/{idTypeScope}/{idTypeCode}/{code}/properties | [EARLY ACCESS] DeletePersonProperties: Delete Person Properties |
| [**getAllPersonAccessMetadata**](PersonsApi.md#getAllPersonAccessMetadata) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata | [EARLY ACCESS] GetAllPersonAccessMetadata: Get Access Metadata rules for a Person |
| [**getPerson**](PersonsApi.md#getPerson) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code} | [EARLY ACCESS] GetPerson: Get Person |
| [**getPersonAccessMetadataByKey**](PersonsApi.md#getPersonAccessMetadataByKey) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | [EARLY ACCESS] GetPersonAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Person |
| [**getPersonPropertyTimeSeries**](PersonsApi.md#getPersonPropertyTimeSeries) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code}/properties/time-series | [EARLY ACCESS] GetPersonPropertyTimeSeries: Get Person Property Time Series |
| [**getPersonRelations**](PersonsApi.md#getPersonRelations) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code}/relations | [EARLY ACCESS] GetPersonRelations: Get Relations for Person |
| [**getPersonRelationships**](PersonsApi.md#getPersonRelationships) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code}/relationships | [EARLY ACCESS] GetPersonRelationships: Get Relationships for Person |
| [**listAllPersons**](PersonsApi.md#listAllPersons) | **GET** /api/persons | [EARLY ACCESS] ListAllPersons: List All Persons |
| [**listPersons**](PersonsApi.md#listPersons) | **GET** /api/persons/{idTypeScope}/{idTypeCode} | [EARLY ACCESS] ListPersons: List Persons |
| [**patchPersonAccessMetadata**](PersonsApi.md#patchPersonAccessMetadata) | **PATCH** /api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata | [EARLY ACCESS] PatchPersonAccessMetadata: Patch Access Metadata rules for a Person. |
| [**setPersonIdentifiers**](PersonsApi.md#setPersonIdentifiers) | **POST** /api/persons/{idTypeScope}/{idTypeCode}/{code}/identifiers | [EARLY ACCESS] SetPersonIdentifiers: Set Person Identifiers |
| [**setPersonProperties**](PersonsApi.md#setPersonProperties) | **POST** /api/persons/{idTypeScope}/{idTypeCode}/{code}/properties | [EARLY ACCESS] SetPersonProperties: Set Person Properties |
| [**upsertPerson**](PersonsApi.md#upsertPerson) | **POST** /api/persons | [EARLY ACCESS] UpsertPerson: Upsert Person |
| [**upsertPersonAccessMetadata**](PersonsApi.md#upsertPersonAccessMetadata) | **PUT** /api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | [EARLY ACCESS] UpsertPersonAccessMetadata: Upsert a Person Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID. |


<a id="deletePerson"></a>
# **deletePerson**
> DeletedEntityResponse deletePerson(idTypeScope, idTypeCode, code)

[EARLY ACCESS] DeletePerson: Delete person

Delete a person. Deletion will be valid from the person&#39;s creation datetime.  This means that the person will no longer exist at any effective datetime from the asAt datetime of deletion.

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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | The scope of the person identifier type.
    String idTypeCode = "idTypeCode_example"; // String | The code of the person identifier type.
    String code = "code_example"; // String | Code of the person under specified identifier type scope and code. This together with defined              identifier type uniquely identifies the person to delete.
    try {
      DeletedEntityResponse result = apiInstance.deletePerson(idTypeScope, idTypeCode, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#deletePerson");
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
| **idTypeScope** | **String**| The scope of the person identifier type. | |
| **idTypeCode** | **String**| The code of the person identifier type. | |
| **code** | **String**| Code of the person under specified identifier type scope and code. This together with defined              identifier type uniquely identifies the person to delete. | |

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
| **200** | The response from deleting person. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deletePersonAccessMetadata"></a>
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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the person identifier. | |
| **idTypeCode** | **String**| Code of the person identifier. | |
| **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. | |
| **metadataKey** | **String**| Key of the metadata entry to retrieve | |
| **effectiveAt** | **String**| The effective date to delete at, if this is not supplied, it will delete all data found | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata | [optional] |

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
| **200** | The Access Metadata with the given metadataKey has been deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deletePersonIdentifiers"></a>
# **deletePersonIdentifiers**
> DeletedEntityResponse deletePersonIdentifiers(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt)

[EARLY ACCESS] DeletePersonIdentifiers: Delete Person Identifiers

Delete identifiers that belong to the given property keys of the person.

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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person identifier type.
    String code = "code_example"; // String | Code of the person under specified identifier type's scope and code. This together with stated identifier type uniquely              identifies the person.
    List<String> propertyKeys = Arrays.asList(); // List<String> | The property keys of the identifiers to delete. These take the format              {domain}/{scope}/{code} e.g. \"Person/CompanyDetails/Role\". Each property must be from the \"Person\" domain. Identifiers or identifiers not specified in request will not be changed.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to delete the identifiers. Defaults to the current LUSID system datetime if not specified.              Must not include an effective datetime if identifiers are perpetual.
    try {
      DeletedEntityResponse result = apiInstance.deletePersonIdentifiers(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#deletePersonIdentifiers");
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
| **idTypeScope** | **String**| Scope of the person identifier type. | |
| **idTypeCode** | **String**| Code of the person identifier type. | |
| **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. | |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| The property keys of the identifiers to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. Each property must be from the \&quot;Person\&quot; domain. Identifiers or identifiers not specified in request will not be changed. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to delete the identifiers. Defaults to the current LUSID system datetime if not specified.              Must not include an effective datetime if identifiers are perpetual. | [optional] |

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
| **200** | The datetime that the identifiers were deleted from the specified person |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deletePersonProperties"></a>
# **deletePersonProperties**
> DeletedEntityResponse deletePersonProperties(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt)

[EARLY ACCESS] DeletePersonProperties: Delete Person Properties

Delete all properties that belong to the given property keys of the person.

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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person identifier type.
    String code = "code_example"; // String | Code of the person under specified identifier type's scope and code. This together with stated identifier type uniquely              identifies the person.
    List<String> propertyKeys = Arrays.asList(); // List<String> | The property keys of the person's properties to delete. These take the format              {domain}/{scope}/{code} e.g. \"Person/CompanyDetails/Role\". Each property must be from the \"Person\" domain. Properties or identifiers not specified in request will not be changed.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to delete time-variant properties from.              The property must exist at the specified 'effectiveAt' datetime. If the 'effectiveAt' is not provided or is              before the time-variant property exists then a failure is returned. Do not specify this parameter if any of              the properties to delete are perpetual.
    try {
      DeletedEntityResponse result = apiInstance.deletePersonProperties(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#deletePersonProperties");
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
| **idTypeScope** | **String**| Scope of the person identifier type. | |
| **idTypeCode** | **String**| Code of the person identifier type. | |
| **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. | |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| The property keys of the person&#39;s properties to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. Each property must be from the \&quot;Person\&quot; domain. Properties or identifiers not specified in request will not be changed. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to delete time-variant properties from.              The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is              before the time-variant property exists then a failure is returned. Do not specify this parameter if any of              the properties to delete are perpetual. | [optional] |

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
| **200** | The datetime that the properties were deleted from the specified person |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getAllPersonAccessMetadata"></a>
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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the person identifier. | |
| **idTypeCode** | **String**| Code of the person identifier. | |
| **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. | |
| **effectiveAt** | **String**| The effectiveAt datetime at which to retrieve the Access Metadata | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Access Metadata | [optional] |

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
| **200** | The access metadata for the Person or any failure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getPerson"></a>
# **getPerson**
> Person getPerson(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds)

[EARLY ACCESS] GetPerson: Get Person

Retrieve the definition of a person.

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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person identifier type.
    String code = "code_example"; // String | Code of the person under specified scope and code. This together with stated identifier type uniquely              identifies the person.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Person\" domain to decorate onto the person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \"Person/ContactDetails/Address\".
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the person. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the person. Defaults to return the latest version of the person if not specified.
    List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities              onto the person in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
    try {
      Person result = apiInstance.getPerson(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#getPerson");
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
| **idTypeScope** | **String**| Scope of the person identifier type. | |
| **idTypeCode** | **String**| Code of the person identifier type. | |
| **code** | **String**| Code of the person under specified scope and code. This together with stated identifier type uniquely              identifies the person. | |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Person\&quot; domain to decorate onto the person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the person. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the person. Defaults to return the latest version of the person if not specified. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities              onto the person in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**Person**](Person.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested person definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getPersonAccessMetadataByKey"></a>
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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the person identifier. | |
| **idTypeCode** | **String**| Code of the person identifier. | |
| **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. | |
| **metadataKey** | **String**| Key of the metadata entry to retrieve | |
| **effectiveAt** | **String**| The effectiveAt datetime at which to retrieve the Access Metadata | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Access Metadata | [optional] |

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
| **200** | The successfully retrieved Person access metadata filtered by metadataKey or any failure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getPersonPropertyTimeSeries"></a>
# **getPersonPropertyTimeSeries**
> ResourceListOfPropertyInterval getPersonPropertyTimeSeries(idTypeScope, idTypeCode, code, propertyKey, asAt, filter, page, limit)

[EARLY ACCESS] GetPersonPropertyTimeSeries: Get Person Property Time Series

List the complete time series of a person property.

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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person identifier type.
    String code = "code_example"; // String | Code of the person under specified identifier type's scope and code. This together with stated identifier type uniquely identifies the person.
    String propertyKey = "propertyKey_example"; // String | The property key of the property that will have its history shown. These must be in the format {domain}/{scope}/{code} e.g. \"Person/CompanyDetails/Role\".              Each property must be from the \"Person\" domain.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the person's property history. Defaults to return the current datetime if not supplied.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    String page = "page_example"; // String | The pagination token to use to continue listing properties from a previous call to get property time series.              This value is returned from the previous call. If a pagination token is provided the filter and asAt fields              must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    try {
      ResourceListOfPropertyInterval result = apiInstance.getPersonPropertyTimeSeries(idTypeScope, idTypeCode, code, propertyKey, asAt, filter, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#getPersonPropertyTimeSeries");
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
| **idTypeScope** | **String**| Scope of the person identifier type. | |
| **idTypeCode** | **String**| Code of the person identifier type. | |
| **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely identifies the person. | |
| **propertyKey** | **String**| The property key of the property that will have its history shown. These must be in the format {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;.              Each property must be from the \&quot;Person\&quot; domain. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the person&#39;s property history. Defaults to return the current datetime if not supplied. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **page** | **String**| The pagination token to use to continue listing properties from a previous call to get property time series.              This value is returned from the previous call. If a pagination token is provided the filter and asAt fields              must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |

### Return type

[**ResourceListOfPropertyInterval**](ResourceListOfPropertyInterval.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The time series of the property |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getPersonRelations"></a>
# **getPersonRelations**
> ResourceListOfRelation getPersonRelations(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes)

[EARLY ACCESS] GetPersonRelations: Get Relations for Person

Get relations for the specified person.

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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person identifier type.
    String code = "code_example"; // String | Code of the person under specified identifier type's scope and code. This together with stated identifier type uniquely              identifies the person.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to get relations. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the person's relations. Defaults to return the latest LUSID AsAt time if not specified.
    String filter = "filter_example"; // String | Expression to filter the relations. Users should provide null or empty string for this field until further notice.
    List<String> identifierTypes = Arrays.asList(); // List<String> | Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format              {domain}/{scope}/{code} e.g. \"Person/CompanyDetails/Role\". They must be from the \"Person\" or \"LegalEntity\" domain.              Only identifier types stated will be used to look up relevant entities in relations. If not applicable, provide an empty array.
    try {
      ResourceListOfRelation result = apiInstance.getPersonRelations(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#getPersonRelations");
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
| **idTypeScope** | **String**| Scope of the person identifier type. | |
| **idTypeCode** | **String**| Code of the person identifier type. | |
| **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to get relations. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the person&#39;s relations. Defaults to return the latest LUSID AsAt time if not specified. | [optional] |
| **filter** | **String**| Expression to filter the relations. Users should provide null or empty string for this field until further notice. | [optional] |
| **identifierTypes** | [**List&lt;String&gt;**](String.md)| Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. They must be from the \&quot;Person\&quot; or \&quot;LegalEntity\&quot; domain.              Only identifier types stated will be used to look up relevant entities in relations. If not applicable, provide an empty array. | [optional] |

### Return type

[**ResourceListOfRelation**](ResourceListOfRelation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The relations for the specified person. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getPersonRelationships"></a>
# **getPersonRelationships**
> ResourceListOfRelationship getPersonRelationships(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes)

[EARLY ACCESS] GetPersonRelationships: Get Relationships for Person

Get relationships for the specified person.

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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person's identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person's identifier type.
    String code = "code_example"; // String | Code of the person under specified identifier type's scope and code. This together with stated identifier type uniquely              identifies the person.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified.
    String filter = "filter_example"; // String | Expression to filter relationships. Users should provide null or empty string for this field until further notice.
    List<String> identifierTypes = Arrays.asList(); // List<String> | Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the 'Person' or 'LegalEntity' domains and have the format {domain}/{scope}/{code}, for example              'Person/CompanyDetails/Role'. An Empty array may be used to return all related Entities.
    try {
      ResourceListOfRelationship result = apiInstance.getPersonRelationships(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#getPersonRelationships");
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
| **idTypeScope** | **String**| Scope of the person&#39;s identifier type. | |
| **idTypeCode** | **String**| Code of the person&#39;s identifier type. | |
| **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. | [optional] |
| **filter** | **String**| Expression to filter relationships. Users should provide null or empty string for this field until further notice. | [optional] |
| **identifierTypes** | [**List&lt;String&gt;**](String.md)| Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example              &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. | [optional] |

### Return type

[**ResourceListOfRelationship**](ResourceListOfRelationship.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The relationships for the specified person. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listAllPersons"></a>
# **listAllPersons**
> ResourceListOfPerson listAllPersons(effectiveAt, asAt, page, limit, filter, propertyKeys, relationshipDefinitionIds)

[EARLY ACCESS] ListAllPersons: List All Persons

List all persons which the user is entitled to see.

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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing persons from a previous call to list persons. This              value is returned from the previous call. If a pagination token is provided the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 5000 if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.               For example, to filter on the display name, use \"displayName eq 'John'\"              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Person\" domain to decorate onto each person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \"Person/ContactDetails/Address\".
    List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities              onto the persons in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
    try {
      ResourceListOfPerson result = apiInstance.listAllPersons(effectiveAt, asAt, page, limit, filter, propertyKeys, relationshipDefinitionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#listAllPersons");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing persons from a previous call to list persons. This              value is returned from the previous call. If a pagination token is provided the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 5000 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.               For example, to filter on the display name, use \&quot;displayName eq &#39;John&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Person\&quot; domain to decorate onto each person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities              onto the persons in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**ResourceListOfPerson**](ResourceListOfPerson.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Existing people |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listPersons"></a>
# **listPersons**
> PagedResourceListOfPerson listPersons(idTypeScope, idTypeCode, effectiveAt, asAt, page, start, limit, filter, propertyKeys, relationshipDefinitionIds)

[EARLY ACCESS] ListPersons: List Persons

List persons which have identifiers of a specific identifier type&#39;s scope and code, and satisfies filter criteria.

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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person identifier type.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing persons from a previous call to list persons. This              value is returned from the previous call. If a pagination token is provided the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.               For example, to filter on the LUPID, use \"lusidPersonId eq 'string'\"              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Person\" domain to decorate onto each person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \"Person/ContactDetails/Address\".
    List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities              onto the persons in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
    try {
      PagedResourceListOfPerson result = apiInstance.listPersons(idTypeScope, idTypeCode, effectiveAt, asAt, page, start, limit, filter, propertyKeys, relationshipDefinitionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#listPersons");
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
| **idTypeScope** | **String**| Scope of the person identifier type. | |
| **idTypeCode** | **String**| Code of the person identifier type. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing persons from a previous call to list persons. This              value is returned from the previous call. If a pagination token is provided the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.               For example, to filter on the LUPID, use \&quot;lusidPersonId eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Person\&quot; domain to decorate onto each person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities              onto the persons in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**PagedResourceListOfPerson**](PagedResourceListOfPerson.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | People in specified scope |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="patchPersonAccessMetadata"></a>
# **patchPersonAccessMetadata**
> Map&lt;String, List&lt;AccessMetadataValue&gt;&gt; patchPersonAccessMetadata(idTypeScope, idTypeCode, code, accessMetadataOperation, effectiveAt, effectiveUntil)

[EARLY ACCESS] PatchPersonAccessMetadata: Patch Access Metadata rules for a Person.

Patch Person Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.                Currently only &#39;add&#39; is a supported operation on the patch document.    Currently only valid metadata keys are supported paths on the patch document.                The response will return any affected Person Access Metadata rules or a failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.

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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person identifier.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person identifier.
    String code = "code_example"; // String | Code of the person under specified identifier type's scope and code.
    List<AccessMetadataOperation> accessMetadataOperation = Arrays.asList(); // List<AccessMetadataOperation> | The Json Patch document
    String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to upsert the Access Metadata
    OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' datetime of the Access Metadata
    try {
      Map<String, List<AccessMetadataValue>> result = apiInstance.patchPersonAccessMetadata(idTypeScope, idTypeCode, code, accessMetadataOperation, effectiveAt, effectiveUntil);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#patchPersonAccessMetadata");
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
| **idTypeScope** | **String**| Scope of the person identifier. | |
| **idTypeCode** | **String**| Code of the person identifier. | |
| **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. | |
| **accessMetadataOperation** | [**List&lt;AccessMetadataOperation&gt;**](AccessMetadataOperation.md)| The Json Patch document | |
| **effectiveAt** | **String**| The effectiveAt datetime at which to upsert the Access Metadata | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata | [optional] |

### Return type

[**Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;**](List.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully patched items. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="setPersonIdentifiers"></a>
# **setPersonIdentifiers**
> Person setPersonIdentifiers(idTypeScope, idTypeCode, code, setPersonIdentifiersRequest)

[EARLY ACCESS] SetPersonIdentifiers: Set Person Identifiers

Set identifiers of the person.

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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person identifier type.
    String code = "code_example"; // String | Code of the person under specified identifier type's scope and code. This together with stated identifier type uniquely              identifies the person.
    SetPersonIdentifiersRequest setPersonIdentifiersRequest = new SetPersonIdentifiersRequest(); // SetPersonIdentifiersRequest | Request containing identifiers to set for the person. Identifiers not specified in request will not be changed.
    try {
      Person result = apiInstance.setPersonIdentifiers(idTypeScope, idTypeCode, code, setPersonIdentifiersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#setPersonIdentifiers");
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
| **idTypeScope** | **String**| Scope of the person identifier type. | |
| **idTypeCode** | **String**| Code of the person identifier type. | |
| **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. | |
| **setPersonIdentifiersRequest** | [**SetPersonIdentifiersRequest**](SetPersonIdentifiersRequest.md)| Request containing identifiers to set for the person. Identifiers not specified in request will not be changed. | |

### Return type

[**Person**](Person.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Person with updated identifiers. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="setPersonProperties"></a>
# **setPersonProperties**
> Person setPersonProperties(idTypeScope, idTypeCode, code, setPersonPropertiesRequest)

[EARLY ACCESS] SetPersonProperties: Set Person Properties

Set properties of the person.

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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    String idTypeScope = "idTypeScope_example"; // String | Scope of the person identifier type.
    String idTypeCode = "idTypeCode_example"; // String | Code of the person identifier type.
    String code = "code_example"; // String | Code of the person under specified identifier type's scope and code. This together with stated identifier type uniquely              identifies the person.
    SetPersonPropertiesRequest setPersonPropertiesRequest = new SetPersonPropertiesRequest(); // SetPersonPropertiesRequest | Request containing properties to set for the person. Properties not specified in request will not be changed.
    try {
      Person result = apiInstance.setPersonProperties(idTypeScope, idTypeCode, code, setPersonPropertiesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#setPersonProperties");
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
| **idTypeScope** | **String**| Scope of the person identifier type. | |
| **idTypeCode** | **String**| Code of the person identifier type. | |
| **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. | |
| **setPersonPropertiesRequest** | [**SetPersonPropertiesRequest**](SetPersonPropertiesRequest.md)| Request containing properties to set for the person. Properties not specified in request will not be changed. | |

### Return type

[**Person**](Person.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Person with updated properties or identifiers. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertPerson"></a>
# **upsertPerson**
> Person upsertPerson(upsertPersonRequest)

[EARLY ACCESS] UpsertPerson: Upsert Person

Create or update a new person under the specified scope.

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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PersonsApi apiInstance = new PersonsApi(defaultClient);
    UpsertPersonRequest upsertPersonRequest = new UpsertPersonRequest(); // UpsertPersonRequest | Request to create or update a person.
    try {
      Person result = apiInstance.upsertPerson(upsertPersonRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonsApi#upsertPerson");
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
| **upsertPersonRequest** | [**UpsertPersonRequest**](UpsertPersonRequest.md)| Request to create or update a person. | |

### Return type

[**Person**](Person.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created or updated person |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertPersonAccessMetadata"></a>
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
    defaultClient.setBasePath("https://example.lusid.com/api");
    
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the person identifier. | |
| **idTypeCode** | **String**| Code of the person identifier. | |
| **code** | **String**| Code of the person under specified identifier type&#39;s scope and code. | |
| **metadataKey** | **String**| Key of the metadata entry to retrieve | |
| **upsertPersonAccessMetadataRequest** | [**UpsertPersonAccessMetadataRequest**](UpsertPersonAccessMetadataRequest.md)| The Person Access Metadata entry to upsert | |
| **effectiveAt** | **String**| The effectiveAt datetime at which to upsert the Access Metadata | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata | [optional] |

### Return type

[**ResourceListOfAccessMetadataValueOf**](ResourceListOfAccessMetadataValueOf.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted item or any failure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

