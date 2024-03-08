# CustomEntitiesApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCustomEntity**](CustomEntitiesApi.md#deleteCustomEntity) | **DELETE** /api/customentities/{entityType}/{identifierType}/{identifierValue} | [EARLY ACCESS] DeleteCustomEntity: Delete a Custom Entity instance. |
| [**deleteCustomEntityAccessMetadata**](CustomEntitiesApi.md#deleteCustomEntityAccessMetadata) | **DELETE** /api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata/{metadataKey} | [EARLY ACCESS] DeleteCustomEntityAccessMetadata: Delete a Custom Entity Access Metadata entry |
| [**getAllCustomEntityAccessMetadata**](CustomEntitiesApi.md#getAllCustomEntityAccessMetadata) | **GET** /api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata | [EARLY ACCESS] GetAllCustomEntityAccessMetadata: Get all the Access Metadata rules for a Custom Entity |
| [**getCustomEntity**](CustomEntitiesApi.md#getCustomEntity) | **GET** /api/customentities/{entityType}/{identifierType}/{identifierValue} | [EARLY ACCESS] GetCustomEntity: Get a Custom Entity instance. |
| [**getCustomEntityAccessMetadataByKey**](CustomEntitiesApi.md#getCustomEntityAccessMetadataByKey) | **GET** /api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata/{metadataKey} | [EARLY ACCESS] GetCustomEntityAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Custom Entity |
| [**getCustomEntityRelationships**](CustomEntitiesApi.md#getCustomEntityRelationships) | **GET** /api/customentities/{entityType}/{identifierType}/{identifierValue}/relationships | [EARLY ACCESS] GetCustomEntityRelationships: Get Relationships for Custom Entity |
| [**listCustomEntities**](CustomEntitiesApi.md#listCustomEntities) | **GET** /api/customentities/{entityType} | [EARLY ACCESS] ListCustomEntities: List Custom Entities of the specified entityType. |
| [**patchCustomEntityAccessMetadata**](CustomEntitiesApi.md#patchCustomEntityAccessMetadata) | **PATCH** /api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata | [EARLY ACCESS] PatchCustomEntityAccessMetadata: Patch Access Metadata rules for a Custom Entity. |
| [**upsertCustomEntities**](CustomEntitiesApi.md#upsertCustomEntities) | **POST** /api/customentities/{entityType}/$batchUpsert | [EARLY ACCESS] UpsertCustomEntities: Batch upsert instances of Custom Entities |
| [**upsertCustomEntity**](CustomEntitiesApi.md#upsertCustomEntity) | **POST** /api/customentities/{entityType} | [EARLY ACCESS] UpsertCustomEntity: Upsert a Custom Entity instance |
| [**upsertCustomEntityAccessMetadata**](CustomEntitiesApi.md#upsertCustomEntityAccessMetadata) | **PUT** /api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata/{metadataKey} | [EARLY ACCESS] UpsertCustomEntityAccessMetadata: Upsert a Custom Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID. |


<a id="deleteCustomEntity"></a>
# **deleteCustomEntity**
> DeletedEntityResponse deleteCustomEntity(entityType, identifierType, identifierValue, identifierScope).execute();

[EARLY ACCESS] DeleteCustomEntity: Delete a Custom Entity instance.

Delete a Custom Entity instance by a specific entity type.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntitiesApi apiInstance = new CustomEntitiesApi(defaultClient);
    String entityType = "entityType_example"; // String | The type of Custom Entity to remove.
    String identifierType = "identifierType_example"; // String | An identifier type attached to the Custom Entity instance.
    String identifierValue = "identifierValue_example"; // String | The identifier value.
    String identifierScope = "identifierScope_example"; // String | The identifier scope.
    try {
      DeletedEntityResponse result = apiInstance.deleteCustomEntity(entityType, identifierType, identifierValue, identifierScope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntitiesApi#deleteCustomEntity");
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
| **entityType** | **String**| The type of Custom Entity to remove. | |
| **identifierType** | **String**| An identifier type attached to the Custom Entity instance. | |
| **identifierValue** | **String**| The identifier value. | |
| **identifierScope** | **String**| The identifier scope. | |

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
| **200** | Delete a Custom Entity instance. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteCustomEntityAccessMetadata"></a>
# **deleteCustomEntityAccessMetadata**
> DeletedEntityResponse deleteCustomEntityAccessMetadata(entityType, identifierType, identifierValue, metadataKey, identifierScope).effectiveAt(effectiveAt).effectiveUntil(effectiveUntil).execute();

[EARLY ACCESS] DeleteCustomEntityAccessMetadata: Delete a Custom Entity Access Metadata entry

Deletes the Custom Entity Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntitiesApi apiInstance = new CustomEntitiesApi(defaultClient);
    String entityType = "entityType_example"; // String | The type of the Custom Entity.
    String identifierType = "identifierType_example"; // String | An identifier type attached to the Custom Entity instance.
    String identifierValue = "identifierValue_example"; // String | The identifier value.
    String metadataKey = "metadataKey_example"; // String | Key of the metadata entry to delete.
    String identifierScope = "identifierScope_example"; // String | The identifier scope.
    String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to retrieve the Access Metadata.
    OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' datetime of the Access Metadata.
    try {
      DeletedEntityResponse result = apiInstance.deleteCustomEntityAccessMetadata(entityType, identifierType, identifierValue, metadataKey, identifierScope)
            .effectiveAt(effectiveAt)
            .effectiveUntil(effectiveUntil)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntitiesApi#deleteCustomEntityAccessMetadata");
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
| **entityType** | **String**| The type of the Custom Entity. | |
| **identifierType** | **String**| An identifier type attached to the Custom Entity instance. | |
| **identifierValue** | **String**| The identifier value. | |
| **metadataKey** | **String**| Key of the metadata entry to delete. | |
| **identifierScope** | **String**| The identifier scope. | |
| **effectiveAt** | **String**| The effectiveAt datetime at which to retrieve the Access Metadata. | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata. | [optional] |

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
| **200** | The access metadata for the CustomEntity or any failure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getAllCustomEntityAccessMetadata"></a>
# **getAllCustomEntityAccessMetadata**
> Map&lt;String, List&lt;AccessMetadataValue&gt;&gt; getAllCustomEntityAccessMetadata(entityType, identifierType, identifierValue, identifierScope).effectiveAt(effectiveAt).asAt(asAt).execute();

[EARLY ACCESS] GetAllCustomEntityAccessMetadata: Get all the Access Metadata rules for a Custom Entity

Get all the Custom Entity access metadata for the specified identifier scope, code and value

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntitiesApi apiInstance = new CustomEntitiesApi(defaultClient);
    String entityType = "entityType_example"; // String | The type of the Custom Entity.
    String identifierType = "identifierType_example"; // String | An identifier type attached to the Custom Entity instance.
    String identifierValue = "identifierValue_example"; // String | The identifier value.
    String identifierScope = "identifierScope_example"; // String | The identifier scope.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to get the entities. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Access Metadata. Defaults to returning the latest version of the metadata if not specified.
    try {
      Map<String, List<AccessMetadataValue>> result = apiInstance.getAllCustomEntityAccessMetadata(entityType, identifierType, identifierValue, identifierScope)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntitiesApi#getAllCustomEntityAccessMetadata");
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
| **entityType** | **String**| The type of the Custom Entity. | |
| **identifierType** | **String**| An identifier type attached to the Custom Entity instance. | |
| **identifierValue** | **String**| The identifier value. | |
| **identifierScope** | **String**| The identifier scope. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to get the entities. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Access Metadata. Defaults to returning the latest version of the metadata if not specified. | [optional] |

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
| **200** | The access metadata for the CustomEntity or any failure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getCustomEntity"></a>
# **getCustomEntity**
> CustomEntityResponse getCustomEntity(entityType, identifierType, identifierValue, identifierScope).asAt(asAt).effectiveAt(effectiveAt).relatedEntityPropertyKeys(relatedEntityPropertyKeys).relationshipDefinitionIds(relationshipDefinitionIds).execute();

[EARLY ACCESS] GetCustomEntity: Get a Custom Entity instance.

Retrieve a Custom Entity instance by a specific entity type at a point in AsAt time.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntitiesApi apiInstance = new CustomEntitiesApi(defaultClient);
    String entityType = "entityType_example"; // String | The type of Custom Entity to retrieve. An entityType can be created using the \"CreateCustomEntityDefinition\" endpoint for CustomEntityDefinitions.
    String identifierType = "identifierType_example"; // String | An identifier type attached to the Custom Entity instance.
    String identifierValue = "identifierValue_example"; // String | The identifier value.
    String identifierScope = "identifierScope_example"; // String | The identifier scope.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The AsAt datetime at which to retrieve the Custom Entity instance.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to get the Custom Entity instance. Defaults to the current LUSID system datetime if not specified.
    List<String> relatedEntityPropertyKeys = Arrays.asList(); // List<String> | A list of property keys from any domain that supports relationships   to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'.
    List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto the entity in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
    try {
      CustomEntityResponse result = apiInstance.getCustomEntity(entityType, identifierType, identifierValue, identifierScope)
            .asAt(asAt)
            .effectiveAt(effectiveAt)
            .relatedEntityPropertyKeys(relatedEntityPropertyKeys)
            .relationshipDefinitionIds(relationshipDefinitionIds)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntitiesApi#getCustomEntity");
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
| **entityType** | **String**| The type of Custom Entity to retrieve. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. | |
| **identifierType** | **String**| An identifier type attached to the Custom Entity instance. | |
| **identifierValue** | **String**| The identifier value. | |
| **identifierScope** | **String**| The identifier scope. | |
| **asAt** | **OffsetDateTime**| The AsAt datetime at which to retrieve the Custom Entity instance. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to get the Custom Entity instance. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **relatedEntityPropertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from any domain that supports relationships   to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto the entity in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**CustomEntityResponse**](CustomEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a custom entity instance. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getCustomEntityAccessMetadataByKey"></a>
# **getCustomEntityAccessMetadataByKey**
> List&lt;AccessMetadataValue&gt; getCustomEntityAccessMetadataByKey(entityType, identifierType, identifierValue, metadataKey, identifierScope).effectiveAt(effectiveAt).asAt(asAt).execute();

[EARLY ACCESS] GetCustomEntityAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Custom Entity

Get Custom Entity access metadata for the specified metadata key

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntitiesApi apiInstance = new CustomEntitiesApi(defaultClient);
    String entityType = "entityType_example"; // String | The type of the Custom Entity.
    String identifierType = "identifierType_example"; // String | An identifier type attached to the Custom Entity instance.
    String identifierValue = "identifierValue_example"; // String | The identifier value.
    String metadataKey = "metadataKey_example"; // String | Key of the metadata entry to retrieve
    String identifierScope = "identifierScope_example"; // String | The identifier scope.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to get the entities. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Access Metadata. Defaults to returning the latest version of the metadata if not specified.
    try {
      List<AccessMetadataValue> result = apiInstance.getCustomEntityAccessMetadataByKey(entityType, identifierType, identifierValue, metadataKey, identifierScope)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntitiesApi#getCustomEntityAccessMetadataByKey");
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
| **entityType** | **String**| The type of the Custom Entity. | |
| **identifierType** | **String**| An identifier type attached to the Custom Entity instance. | |
| **identifierValue** | **String**| The identifier value. | |
| **metadataKey** | **String**| Key of the metadata entry to retrieve | |
| **identifierScope** | **String**| The identifier scope. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to get the entities. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Access Metadata. Defaults to returning the latest version of the metadata if not specified. | [optional] |

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
| **200** | The access metadata for the CustomEntity or any failure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getCustomEntityRelationships"></a>
# **getCustomEntityRelationships**
> ResourceListOfRelationship getCustomEntityRelationships(entityType, identifierScope, identifierType, identifierValue).effectiveAt(effectiveAt).asAt(asAt).filter(filter).identifierTypes(identifierTypes).execute();

[EARLY ACCESS] GetCustomEntityRelationships: Get Relationships for Custom Entity

Get relationships for the specified Custom Entity.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntitiesApi apiInstance = new CustomEntitiesApi(defaultClient);
    String entityType = "entityType_example"; // String | The type of entity get relationships for.
    String identifierScope = "identifierScope_example"; // String | The identifier scope.
    String identifierType = "identifierType_example"; // String | An identifier type attached to the Custom Entity.
    String identifierValue = "identifierValue_example"; // String | The identifier value.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified.
    String filter = "filter_example"; // String | Expression to filter relationships. Users should provide null or empty string for this field until further notice.
    List<String> identifierTypes = Arrays.asList(); // List<String> | Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format   {domain}/{scope}/{code} e.g. \"Person/CompanyDetails/Role\". They must be from the \"Person\" or \"LegalEntity\" domain.   Only identifier types stated will be used to look up relevant entities in relationships. If not applicable, provide an empty array.
    try {
      ResourceListOfRelationship result = apiInstance.getCustomEntityRelationships(entityType, identifierScope, identifierType, identifierValue)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .filter(filter)
            .identifierTypes(identifierTypes)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntitiesApi#getCustomEntityRelationships");
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
| **entityType** | **String**| The type of entity get relationships for. | |
| **identifierScope** | **String**| The identifier scope. | |
| **identifierType** | **String**| An identifier type attached to the Custom Entity. | |
| **identifierValue** | **String**| The identifier value. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. | [optional] |
| **filter** | **String**| Expression to filter relationships. Users should provide null or empty string for this field until further notice. | [optional] |
| **identifierTypes** | [**List&lt;String&gt;**](String.md)| Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format   {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. They must be from the \&quot;Person\&quot; or \&quot;LegalEntity\&quot; domain.   Only identifier types stated will be used to look up relevant entities in relationships. If not applicable, provide an empty array. | [optional] |

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
| **200** | The relationships for the specified custom entity. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listCustomEntities"></a>
# **listCustomEntities**
> PagedResourceListOfCustomEntityResponse listCustomEntities(entityType).effectiveAt(effectiveAt).asAt(asAt).limit(limit).filter(filter).sortBy(sortBy).page(page).relatedEntityPropertyKeys(relatedEntityPropertyKeys).relationshipDefinitionIds(relationshipDefinitionIds).execute();

[EARLY ACCESS] ListCustomEntities: List Custom Entities of the specified entityType.

List all the Custom Entities matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntitiesApi apiInstance = new CustomEntitiesApi(defaultClient);
    String entityType = "entityType_example"; // String | The type of Custom Entity to list.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the entities. Defaults to the current LUSID   system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the entities. Defaults to returning the latest version   of each portfolio if not specified.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
    String page = "page_example"; // String | The pagination token to use to continue listing entities; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
    List<String> relatedEntityPropertyKeys = Arrays.asList(); // List<String> | A list of property keys from any domain that supports relationships   to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'.
    List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto the entities in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
    try {
      PagedResourceListOfCustomEntityResponse result = apiInstance.listCustomEntities(entityType)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .limit(limit)
            .filter(filter)
            .sortBy(sortBy)
            .page(page)
            .relatedEntityPropertyKeys(relatedEntityPropertyKeys)
            .relationshipDefinitionIds(relationshipDefinitionIds)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntitiesApi#listCustomEntities");
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
| **entityType** | **String**| The type of Custom Entity to list. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the entities. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the entities. Defaults to returning the latest version   of each portfolio if not specified. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **page** | **String**| The pagination token to use to continue listing entities; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **relatedEntityPropertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from any domain that supports relationships   to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto the entities in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**PagedResourceListOfCustomEntityResponse**](PagedResourceListOfCustomEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List custom entities of the specified entityType. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="patchCustomEntityAccessMetadata"></a>
# **patchCustomEntityAccessMetadata**
> Map&lt;String, List&lt;AccessMetadataValue&gt;&gt; patchCustomEntityAccessMetadata(entityType, identifierType, identifierValue, identifierScope, accessMetadataOperation).effectiveAt(effectiveAt).effectiveUntil(effectiveUntil).execute();

[EARLY ACCESS] PatchCustomEntityAccessMetadata: Patch Access Metadata rules for a Custom Entity.

Patch Custom Entity Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.     Currently only &#39;add&#39; is a supported operation on the patch document    Currently only valid metadata keys are supported paths on the patch document     The response will return any affected Custom Entity Access Metadata rules or a failure message if unsuccessful.     It is important to always check to verify success (or failure).     Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntitiesApi apiInstance = new CustomEntitiesApi(defaultClient);
    String entityType = "entityType_example"; // String | The type of the Custom Entity.
    String identifierType = "identifierType_example"; // String | An identifier type attached to the Custom Entity instance.
    String identifierValue = "identifierValue_example"; // String | The identifier value.
    String identifierScope = "identifierScope_example"; // String | The identifier scope.
    List<AccessMetadataOperation> accessMetadataOperation = Arrays.asList(); // List<AccessMetadataOperation> | The Json Patch document
    String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which the Access Metadata will be effective from
    OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' datetime of the Access Metadata
    try {
      Map<String, List<AccessMetadataValue>> result = apiInstance.patchCustomEntityAccessMetadata(entityType, identifierType, identifierValue, identifierScope, accessMetadataOperation)
            .effectiveAt(effectiveAt)
            .effectiveUntil(effectiveUntil)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntitiesApi#patchCustomEntityAccessMetadata");
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
| **entityType** | **String**| The type of the Custom Entity. | |
| **identifierType** | **String**| An identifier type attached to the Custom Entity instance. | |
| **identifierValue** | **String**| The identifier value. | |
| **identifierScope** | **String**| The identifier scope. | |
| **accessMetadataOperation** | [**List&lt;AccessMetadataOperation&gt;**](AccessMetadataOperation.md)| The Json Patch document | |
| **effectiveAt** | **String**| The effectiveAt datetime at which the Access Metadata will be effective from | [optional] |
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
| **200** | The access metadata for the CustomEntity or any failure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertCustomEntities"></a>
# **upsertCustomEntities**
> UpsertCustomEntitiesResponse upsertCustomEntities(entityType, successMode, requestBody).execute();

[EARLY ACCESS] UpsertCustomEntities: Batch upsert instances of Custom Entities

Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntitiesApi apiInstance = new CustomEntitiesApi(defaultClient);
    String entityType = "entityType_example"; // String | The type of the Custom Entity to be created. An entityType can be created using the \"CreateCustomEntityDefinition\" endpoint for CustomEntityDefinitions.
    String successMode = "successMode_example"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial
    Map<String, CustomEntityRequest> requestBody = new HashMap(); // Map<String, CustomEntityRequest> | The payload describing the Custom Entity instances
    try {
      UpsertCustomEntitiesResponse result = apiInstance.upsertCustomEntities(entityType, successMode, requestBody)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntitiesApi#upsertCustomEntities");
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
| **entityType** | **String**| The type of the Custom Entity to be created. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. | |
| **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial | |
| **requestBody** | [**Map&lt;String, CustomEntityRequest&gt;**](CustomEntityRequest.md)| The payload describing the Custom Entity instances | |

### Return type

[**UpsertCustomEntitiesResponse**](UpsertCustomEntitiesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The upserted custom entity instance |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertCustomEntity"></a>
# **upsertCustomEntity**
> CustomEntityResponse upsertCustomEntity(entityType, customEntityRequest).execute();

[EARLY ACCESS] UpsertCustomEntity: Upsert a Custom Entity instance

Insert the Custom Entity if it does not exist or update the Custom Entity with the supplied state if it does exist.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntitiesApi apiInstance = new CustomEntitiesApi(defaultClient);
    String entityType = "entityType_example"; // String | The type of the Custom Entity to be created. An entityType can be created using the \"CreateCustomEntityDefinition\" endpoint for CustomEntityDefinitions.
    CustomEntityRequest customEntityRequest = new CustomEntityRequest(); // CustomEntityRequest | The payload describing the Custom Entity instance.
    try {
      CustomEntityResponse result = apiInstance.upsertCustomEntity(entityType, customEntityRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntitiesApi#upsertCustomEntity");
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
| **entityType** | **String**| The type of the Custom Entity to be created. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. | |
| **customEntityRequest** | [**CustomEntityRequest**](CustomEntityRequest.md)| The payload describing the Custom Entity instance. | |

### Return type

[**CustomEntityResponse**](CustomEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The upserted custom entity instance |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertCustomEntityAccessMetadata"></a>
# **upsertCustomEntityAccessMetadata**
> List&lt;AccessMetadataValue&gt; upsertCustomEntityAccessMetadata(entityType, identifierType, identifierValue, metadataKey, identifierScope, upsertCustomEntityAccessMetadataRequest).effectiveAt(effectiveAt).effectiveUntil(effectiveUntil).execute();

[EARLY ACCESS] UpsertCustomEntityAccessMetadata: Upsert a Custom Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.

Update or insert one Custom Entity Access Metadata entry in a single scope. An item will be updated if it already exists  and inserted if it does not.     The response will return the successfully updated or inserted Custom Entity Access Metadata rule or failure message if unsuccessful.     It is important to always check to verify success (or failure).     Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CustomEntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CustomEntitiesApi apiInstance = new CustomEntitiesApi(defaultClient);
    String entityType = "entityType_example"; // String | The type of the Custom Entity.
    String identifierType = "identifierType_example"; // String | An identifier type attached to the Custom Entity instance.
    String identifierValue = "identifierValue_example"; // String | The identifier value.
    String metadataKey = "metadataKey_example"; // String | Key of the metadata entry to retrieve
    String identifierScope = "identifierScope_example"; // String | The identifier scope.
    UpsertCustomEntityAccessMetadataRequest upsertCustomEntityAccessMetadataRequest = new UpsertCustomEntityAccessMetadataRequest(); // UpsertCustomEntityAccessMetadataRequest | The Custom Entity Access Metadata entry to upsert
    String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which the Access Metadata will be effective from
    OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' datetime of the Access Metadata
    try {
      List<AccessMetadataValue> result = apiInstance.upsertCustomEntityAccessMetadata(entityType, identifierType, identifierValue, metadataKey, identifierScope, upsertCustomEntityAccessMetadataRequest)
            .effectiveAt(effectiveAt)
            .effectiveUntil(effectiveUntil)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomEntitiesApi#upsertCustomEntityAccessMetadata");
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
| **entityType** | **String**| The type of the Custom Entity. | |
| **identifierType** | **String**| An identifier type attached to the Custom Entity instance. | |
| **identifierValue** | **String**| The identifier value. | |
| **metadataKey** | **String**| Key of the metadata entry to retrieve | |
| **identifierScope** | **String**| The identifier scope. | |
| **upsertCustomEntityAccessMetadataRequest** | [**UpsertCustomEntityAccessMetadataRequest**](UpsertCustomEntityAccessMetadataRequest.md)| The Custom Entity Access Metadata entry to upsert | |
| **effectiveAt** | **String**| The effectiveAt datetime at which the Access Metadata will be effective from | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata | [optional] |

### Return type

[**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The access metadata for the CustomEntity or any failure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

