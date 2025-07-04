# LegalEntitiesApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteLegalEntity**](LegalEntitiesApi.md#deleteLegalEntity) | **DELETE** /api/legalentities/{idTypeScope}/{idTypeCode}/{code} | DeleteLegalEntity: Delete Legal Entity |
| [**deleteLegalEntityAccessMetadata**](LegalEntitiesApi.md#deleteLegalEntityAccessMetadata) | **DELETE** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | DeleteLegalEntityAccessMetadata: Delete a Legal Entity Access Metadata entry |
| [**deleteLegalEntityIdentifiers**](LegalEntitiesApi.md#deleteLegalEntityIdentifiers) | **DELETE** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/identifiers | [EARLY ACCESS] DeleteLegalEntityIdentifiers: Delete Legal Entity Identifiers |
| [**deleteLegalEntityProperties**](LegalEntitiesApi.md#deleteLegalEntityProperties) | **DELETE** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/properties | [EARLY ACCESS] DeleteLegalEntityProperties: Delete Legal Entity Properties |
| [**getAllLegalEntityAccessMetadata**](LegalEntitiesApi.md#getAllLegalEntityAccessMetadata) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata | GetAllLegalEntityAccessMetadata: Get Access Metadata rules for a Legal Entity |
| [**getLegalEntity**](LegalEntitiesApi.md#getLegalEntity) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code} | GetLegalEntity: Get Legal Entity |
| [**getLegalEntityAccessMetadataByKey**](LegalEntitiesApi.md#getLegalEntityAccessMetadataByKey) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | [EARLY ACCESS] GetLegalEntityAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Legal Entity |
| [**getLegalEntityPropertyTimeSeries**](LegalEntitiesApi.md#getLegalEntityPropertyTimeSeries) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/properties/time-series | GetLegalEntityPropertyTimeSeries: Get Legal Entity Property Time Series |
| [**getLegalEntityRelations**](LegalEntitiesApi.md#getLegalEntityRelations) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/relations | GetLegalEntityRelations: Get Relations for Legal Entity |
| [**getLegalEntityRelationships**](LegalEntitiesApi.md#getLegalEntityRelationships) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/relationships | GetLegalEntityRelationships: Get Relationships for Legal Entity |
| [**listAllLegalEntities**](LegalEntitiesApi.md#listAllLegalEntities) | **GET** /api/legalentities | ListAllLegalEntities: List Legal Entities |
| [**listLegalEntities**](LegalEntitiesApi.md#listLegalEntities) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode} | ListLegalEntities: List Legal Entities |
| [**patchLegalEntityAccessMetadata**](LegalEntitiesApi.md#patchLegalEntityAccessMetadata) | **PATCH** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata | [EARLY ACCESS] PatchLegalEntityAccessMetadata: Patch Access Metadata rules for a Legal Entity. |
| [**setLegalEntityIdentifiers**](LegalEntitiesApi.md#setLegalEntityIdentifiers) | **POST** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/identifiers | [EARLY ACCESS] SetLegalEntityIdentifiers: Set Legal Entity Identifiers |
| [**setLegalEntityProperties**](LegalEntitiesApi.md#setLegalEntityProperties) | **POST** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/properties | SetLegalEntityProperties: Set Legal Entity Properties |
| [**upsertLegalEntities**](LegalEntitiesApi.md#upsertLegalEntities) | **POST** /api/legalentities/$batchUpsert | [EARLY ACCESS] UpsertLegalEntities: Batch upsert Legal Entities |
| [**upsertLegalEntity**](LegalEntitiesApi.md#upsertLegalEntity) | **POST** /api/legalentities | UpsertLegalEntity: Upsert Legal Entity |
| [**upsertLegalEntityAccessMetadata**](LegalEntitiesApi.md#upsertLegalEntityAccessMetadata) | **PUT** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | UpsertLegalEntityAccessMetadata: Upsert a Legal Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID. |



## deleteLegalEntity

> DeletedEntityResponse deleteLegalEntity(idTypeScope, idTypeCode, code)

DeleteLegalEntity: Delete Legal Entity

Delete a legal entity. Deletion will be valid from the legal entity&#39;s creation datetime.  This means that the legal entity will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | The scope of the legal entity identifier type.
        String idTypeCode = "idTypeCode_example"; // String | The code of the legal entity identifier type.
        String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with defined   identifier type uniquely identifies the legal entity to delete.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteLegalEntity(idTypeScope, idTypeCode, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteLegalEntity(idTypeScope, idTypeCode, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#deleteLegalEntity");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| The scope of the legal entity identifier type. | |
| **idTypeCode** | **String**| The code of the legal entity identifier type. | |
| **code** | **String**| Code of the legal entity under specified identifier type&#39;s scope and code. This together with defined   identifier type uniquely identifies the legal entity to delete. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response from deleting legal entity. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteLegalEntityAccessMetadata

> DeletedEntityResponse deleteLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil)

DeleteLegalEntityAccessMetadata: Delete a Legal Entity Access Metadata entry

Deletes the Legal Entity Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the Legal Entity identifier.
        String idTypeCode = "idTypeCode_example"; // String | Code of the Legal Entity identifier.
        String code = "code_example"; // String | Code of the Legal Entity under specified identifier type's scope and code.
        String metadataKey = "metadataKey_example"; // String | Key of the metadata entry to retrieve
        String effectiveAt = "effectiveAt_example"; // String | The effective date to delete at, if this is not supplied, it will delete all data found
        OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' date of the Access Metadata
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#deleteLegalEntityAccessMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the Legal Entity identifier. | |
| **idTypeCode** | **String**| Code of the Legal Entity identifier. | |
| **code** | **String**| Code of the Legal Entity under specified identifier type&#39;s scope and code. | |
| **metadataKey** | **String**| Key of the metadata entry to retrieve | |
| **effectiveAt** | **String**| The effective date to delete at, if this is not supplied, it will delete all data found | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Access Metadata with the given metadataKey has been deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteLegalEntityIdentifiers

> DeletedEntityResponse deleteLegalEntityIdentifiers(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt)

[EARLY ACCESS] DeleteLegalEntityIdentifiers: Delete Legal Entity Identifiers

Delete identifiers that belong to the given property keys of the legal entity.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
        String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
        String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with stated identifier type uniquely   identifies the legal entity.
        List<String> propertyKeys = Arrays.asList(); // List<String> | The property keys of the identifiers to delete. These take the format   {domain}/{scope}/{code} e.g. \"LegalEntity/CreditAgency/Identifier\". Each property must be from the \"LegalEntity\" domain. Identifiers or identifiers not specified in request will not be changed.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to delete the identifiers. Defaults to the current LUSID system datetime if not specified.   Must not include an effective datetime if identifiers are perpetual.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteLegalEntityIdentifiers(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteLegalEntityIdentifiers(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#deleteLegalEntityIdentifiers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the legal entity identifier type. | |
| **idTypeCode** | **String**| Code of the legal entity identifier type. | |
| **code** | **String**| Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely   identifies the legal entity. | |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| The property keys of the identifiers to delete. These take the format   {domain}/{scope}/{code} e.g. \&quot;LegalEntity/CreditAgency/Identifier\&quot;. Each property must be from the \&quot;LegalEntity\&quot; domain. Identifiers or identifiers not specified in request will not be changed. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to delete the identifiers. Defaults to the current LUSID system datetime if not specified.   Must not include an effective datetime if identifiers are perpetual. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the identifiers were deleted from the specified legal entity |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteLegalEntityProperties

> DeletedEntityResponse deleteLegalEntityProperties(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt)

[EARLY ACCESS] DeleteLegalEntityProperties: Delete Legal Entity Properties

Delete all properties that belong to the given property keys of the legal entity.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
        String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
        String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with stated identifier type uniquely   identifies the legal entity.
        List<String> propertyKeys = Arrays.asList(); // List<String> | The property keys of the legal entities properties to delete. These take the format   {domain}/{scope}/{code} e.g. \"LegalEntity/CompanyDetails/Role\". Each property must be from the \"LegalEntity\" domain. Properties or identifiers not specified in request will not be changed.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to delete time-variant properties from.   The property must exist at the specified 'effectiveAt' datetime. If the 'effectiveAt' is not provided or is   before the time-variant property exists then a failure is returned. Do not specify this parameter if any of   the properties to delete are perpetual.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteLegalEntityProperties(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteLegalEntityProperties(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#deleteLegalEntityProperties");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the legal entity identifier type. | |
| **idTypeCode** | **String**| Code of the legal entity identifier type. | |
| **code** | **String**| Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely   identifies the legal entity. | |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| The property keys of the legal entities properties to delete. These take the format   {domain}/{scope}/{code} e.g. \&quot;LegalEntity/CompanyDetails/Role\&quot;. Each property must be from the \&quot;LegalEntity\&quot; domain. Properties or identifiers not specified in request will not be changed. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to delete time-variant properties from.   The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is   before the time-variant property exists then a failure is returned. Do not specify this parameter if any of   the properties to delete are perpetual. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the properties were deleted from the specified legal entity |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getAllLegalEntityAccessMetadata

> Map&lt;String, List&lt;AccessMetadataValue&gt;&gt; getAllLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, effectiveAt, asAt)

GetAllLegalEntityAccessMetadata: Get Access Metadata rules for a Legal Entity

Pass the Scope and Code of the Legal Entity identifier along with the Legal Entity code parameter to retrieve the associated Access Metadata

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the Legal Entity identifier.
        String idTypeCode = "idTypeCode_example"; // String | Code of the Legal Entity identifier.
        String code = "code_example"; // String | Code of the Legal Entity under specified identifier type's scope and code.
        String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to retrieve the Access Metadata
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Access Metadata
        try {
            // uncomment the below to set overrides at the request level
            // Map<String, List<AccessMetadataValue>> result = apiInstance.getAllLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, effectiveAt, asAt).execute(opts);

            Map<String, List<AccessMetadataValue>> result = apiInstance.getAllLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#getAllLegalEntityAccessMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the Legal Entity identifier. | |
| **idTypeCode** | **String**| Code of the Legal Entity identifier. | |
| **code** | **String**| Code of the Legal Entity under specified identifier type&#39;s scope and code. | |
| **effectiveAt** | **String**| The effectiveAt datetime at which to retrieve the Access Metadata | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Access Metadata | [optional] |

### Return type

[**Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;**](List.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The access metadata for the Legal Entity or any failure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getLegalEntity

> LegalEntity getLegalEntity(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds)

GetLegalEntity: Get Legal Entity

Retrieve the definition of a legal entity.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
        String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
        String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with stated identifier type uniquely   identifies the legal entity.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys or identifier types (as property keys) from the \"LegalEntity\" domain   to include for found legal entity, or from any domain that supports relationships to decorate onto related entities.   These take the format {domain}/{scope}/{code} e.g. \"LegalEntity/ContactDetails/Address\".
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the legal entity. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the legal entity. Defaults to return the latest version of the legal entity if not specified.
        List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto the legal entity in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
        try {
            // uncomment the below to set overrides at the request level
            // LegalEntity result = apiInstance.getLegalEntity(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds).execute(opts);

            LegalEntity result = apiInstance.getLegalEntity(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#getLegalEntity");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the legal entity identifier type. | |
| **idTypeCode** | **String**| Code of the legal entity identifier type. | |
| **code** | **String**| Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely   identifies the legal entity. | |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys or identifier types (as property keys) from the \&quot;LegalEntity\&quot; domain   to include for found legal entity, or from any domain that supports relationships to decorate onto related entities.   These take the format {domain}/{scope}/{code} e.g. \&quot;LegalEntity/ContactDetails/Address\&quot;. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the legal entity. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the legal entity. Defaults to return the latest version of the legal entity if not specified. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto the legal entity in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**LegalEntity**](LegalEntity.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested legal entity |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getLegalEntityAccessMetadataByKey

> List&lt;AccessMetadataValue&gt; getLegalEntityAccessMetadataByKey(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt)

[EARLY ACCESS] GetLegalEntityAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Legal Entity

Get a specific Legal Entity Access Metadata by specifying the corresponding identifier parts and Legal Entity code     No matching will be performed through this endpoint. To retrieve an entry, it is necessary to specify, exactly, the identifier of the entry

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the Legal Entity identifier.
        String idTypeCode = "idTypeCode_example"; // String | Code of the Legal Entity identifier.
        String code = "code_example"; // String | Code of the Legal Entity under specified identifier type's scope and code.
        String metadataKey = "metadataKey_example"; // String | Key of the metadata entry to retrieve
        String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to retrieve the Access Metadata
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Access Metadata
        try {
            // uncomment the below to set overrides at the request level
            // List<AccessMetadataValue> result = apiInstance.getLegalEntityAccessMetadataByKey(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt).execute(opts);

            List<AccessMetadataValue> result = apiInstance.getLegalEntityAccessMetadataByKey(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#getLegalEntityAccessMetadataByKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the Legal Entity identifier. | |
| **idTypeCode** | **String**| Code of the Legal Entity identifier. | |
| **code** | **String**| Code of the Legal Entity under specified identifier type&#39;s scope and code. | |
| **metadataKey** | **String**| Key of the metadata entry to retrieve | |
| **effectiveAt** | **String**| The effectiveAt datetime at which to retrieve the Access Metadata | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Access Metadata | [optional] |

### Return type

[**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Legal Entity access metadata filtered by metadataKey or any failure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getLegalEntityPropertyTimeSeries

> ResourceListOfPropertyInterval getLegalEntityPropertyTimeSeries(idTypeScope, idTypeCode, code, propertyKey, asAt, filter, page, limit)

GetLegalEntityPropertyTimeSeries: Get Legal Entity Property Time Series

List the complete time series of a legal entity property.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
        String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
        String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with stated identifier type uniquely identifies the legal entity.
        String propertyKey = "propertyKey_example"; // String | The property key of the property that will have its history shown. These must be in the format {domain}/{scope}/{code} e.g. \"LegalEntity/ContactDetails/Address\".   Each property must be from the \"LegalEntity\" domain.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the person's property history. Defaults to return the current datetime if not supplied.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        String page = "page_example"; // String | The pagination token to use to continue listing properties from a previous call to get property time series.   This value is returned from the previous call. If a pagination token is provided the filter and asAt fields   must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfPropertyInterval result = apiInstance.getLegalEntityPropertyTimeSeries(idTypeScope, idTypeCode, code, propertyKey, asAt, filter, page, limit).execute(opts);

            ResourceListOfPropertyInterval result = apiInstance.getLegalEntityPropertyTimeSeries(idTypeScope, idTypeCode, code, propertyKey, asAt, filter, page, limit).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#getLegalEntityPropertyTimeSeries");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the legal entity identifier type. | |
| **idTypeCode** | **String**| Code of the legal entity identifier type. | |
| **code** | **String**| Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely identifies the legal entity. | |
| **propertyKey** | **String**| The property key of the property that will have its history shown. These must be in the format {domain}/{scope}/{code} e.g. \&quot;LegalEntity/ContactDetails/Address\&quot;.   Each property must be from the \&quot;LegalEntity\&quot; domain. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the person&#39;s property history. Defaults to return the current datetime if not supplied. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **page** | **String**| The pagination token to use to continue listing properties from a previous call to get property time series.   This value is returned from the previous call. If a pagination token is provided the filter and asAt fields   must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |

### Return type

[**ResourceListOfPropertyInterval**](ResourceListOfPropertyInterval.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The time series of the property |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getLegalEntityRelations

> ResourceListOfRelation getLegalEntityRelations(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes)

GetLegalEntityRelations: Get Relations for Legal Entity

Get relations for the specified Legal Entity

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
        String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
        String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with stated identifier type uniquely   identifies the legal entity.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to get relations. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the legal entity's relations. Defaults to return the latest LUSID AsAt time if not specified.
        String filter = "filter_example"; // String | Expression to filter the relations. Users should provide null or empty string for this field until further notice.
        List<String> identifierTypes = Arrays.asList(); // List<String> | Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format   {domain}/{scope}/{code} e.g. \"Person/CompanyDetails/Role\". They must be from the \"Person\" or \"LegalEntity\" domain.   Only identifier types stated will be used to look up relevant entities in relations. If not applicable, provide an empty array.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfRelation result = apiInstance.getLegalEntityRelations(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes).execute(opts);

            ResourceListOfRelation result = apiInstance.getLegalEntityRelations(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#getLegalEntityRelations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the legal entity identifier type. | |
| **idTypeCode** | **String**| Code of the legal entity identifier type. | |
| **code** | **String**| Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely   identifies the legal entity. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to get relations. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the legal entity&#39;s relations. Defaults to return the latest LUSID AsAt time if not specified. | [optional] |
| **filter** | **String**| Expression to filter the relations. Users should provide null or empty string for this field until further notice. | [optional] |
| **identifierTypes** | [**List&lt;String&gt;**](String.md)| Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format   {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. They must be from the \&quot;Person\&quot; or \&quot;LegalEntity\&quot; domain.   Only identifier types stated will be used to look up relevant entities in relations. If not applicable, provide an empty array. | [optional] |

### Return type

[**ResourceListOfRelation**](ResourceListOfRelation.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The relations for the specific legal entity. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getLegalEntityRelationships

> ResourceListOfRelationship getLegalEntityRelationships(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes)

GetLegalEntityRelationships: Get Relationships for Legal Entity

Get Relationships for the specified Legal Entity

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity's identifier type.
        String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity's identifier type.
        String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with stated identifier type uniquely   identifies the legal entity.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified.
        String filter = "filter_example"; // String | Expression to filter relationships. Users should provide null or empty string for this field until further notice.
        List<String> identifierTypes = Arrays.asList(); // List<String> | Identifier types (as property keys) used for referencing Persons or Legal Entities.   These can be specified from the 'Person' or 'LegalEntity' domains and have the format {domain}/{scope}/{code}, for example   'Person/CompanyDetails/Role'. An Empty array may be used to return all related Entities.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfRelationship result = apiInstance.getLegalEntityRelationships(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes).execute(opts);

            ResourceListOfRelationship result = apiInstance.getLegalEntityRelationships(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#getLegalEntityRelationships");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the legal entity&#39;s identifier type. | |
| **idTypeCode** | **String**| Code of the legal entity&#39;s identifier type. | |
| **code** | **String**| Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely   identifies the legal entity. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. | [optional] |
| **filter** | **String**| Expression to filter relationships. Users should provide null or empty string for this field until further notice. | [optional] |
| **identifierTypes** | [**List&lt;String&gt;**](String.md)| Identifier types (as property keys) used for referencing Persons or Legal Entities.   These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example   &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. | [optional] |

### Return type

[**ResourceListOfRelationship**](ResourceListOfRelationship.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The relationships for the specified legal entity. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listAllLegalEntities

> ResourceListOfLegalEntity listAllLegalEntities(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds)

ListAllLegalEntities: List Legal Entities

List all legal entities which the user is entitled to see.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the legal entities. Defaults to the current LUSID   system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the legal entities. Defaults to return the latest version   of each legal entities if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing legal entities from a previous call to list legal entities. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy  and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 5000 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.    Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys or identifier types (as property keys) from the \"LegalEntity\" domain   to include for each legal entity, or from any domain that supports relationships to decorate onto related entities.   These take the format {domain}/{scope}/{code} e.g. \"LegalEntity/ContactDetails/Address\".
        List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto each portfolio in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfLegalEntity result = apiInstance.listAllLegalEntities(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds).execute(opts);

            ResourceListOfLegalEntity result = apiInstance.listAllLegalEntities(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#listAllLegalEntities");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the legal entities. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the legal entities. Defaults to return the latest version   of each legal entities if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing legal entities from a previous call to list legal entities. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy  and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 5000 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.    Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys or identifier types (as property keys) from the \&quot;LegalEntity\&quot; domain   to include for each legal entity, or from any domain that supports relationships to decorate onto related entities.   These take the format {domain}/{scope}/{code} e.g. \&quot;LegalEntity/ContactDetails/Address\&quot;. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto each portfolio in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**ResourceListOfLegalEntity**](ResourceListOfLegalEntity.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All existing Legal Entities |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listLegalEntities

> PagedResourceListOfLegalEntity listLegalEntities(idTypeScope, idTypeCode, effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds)

ListLegalEntities: List Legal Entities

List legal entities which has identifier of specific identifier type&#39;s scope and code, and satisfies filter criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
        String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the people. Defaults to the current LUSID   system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the people. Defaults to return the latest version   of each people if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing legal entities from a previous call to list legal entities. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy  and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.    Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys or identifier types (as property keys) from the \"LegalEntity\" domain   to include for each legal entity, or from any domain that supports relationships to decorate onto related entities.   These take the format {domain}/{scope}/{code} e.g. \"LegalEntity/ContactDetails/Address\".
        List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto each portfolio in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfLegalEntity result = apiInstance.listLegalEntities(idTypeScope, idTypeCode, effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds).execute(opts);

            PagedResourceListOfLegalEntity result = apiInstance.listLegalEntities(idTypeScope, idTypeCode, effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#listLegalEntities");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the legal entity identifier type. | |
| **idTypeCode** | **String**| Code of the legal entity identifier type. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the people. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the people. Defaults to return the latest version   of each people if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing legal entities from a previous call to list legal entities. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy  and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.    Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys or identifier types (as property keys) from the \&quot;LegalEntity\&quot; domain   to include for each legal entity, or from any domain that supports relationships to decorate onto related entities.   These take the format {domain}/{scope}/{code} e.g. \&quot;LegalEntity/ContactDetails/Address\&quot;. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto each portfolio in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**PagedResourceListOfLegalEntity**](PagedResourceListOfLegalEntity.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Legal Entities with specified identifier type |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## patchLegalEntityAccessMetadata

> Map&lt;String, List&lt;AccessMetadataValue&gt;&gt; patchLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, accessMetadataOperation, effectiveAt, effectiveUntil)

[EARLY ACCESS] PatchLegalEntityAccessMetadata: Patch Access Metadata rules for a Legal Entity.

Patch Legal Entity Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.     Currently only &#39;add&#39; is a supported operation on the patch document    Currently only valid metadata keys are supported paths on the patch document     The response will return any affected Legal Entity Access Metadata rules or a failure message if unsuccessful.     It is important to always check to verify success (or failure).     Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the Legal Entity identifier.
        String idTypeCode = "idTypeCode_example"; // String | Code of the Legal Entity identifier.
        String code = "code_example"; // String | Code of the Legal Entity under specified identifier type's scope and code.
        List<AccessMetadataOperation> accessMetadataOperation = Arrays.asList(); // List<AccessMetadataOperation> | The Json Patch document
        String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to upsert the Access Metadata
        OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' datetime of the Access Metadata
        try {
            // uncomment the below to set overrides at the request level
            // Map<String, List<AccessMetadataValue>> result = apiInstance.patchLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, accessMetadataOperation, effectiveAt, effectiveUntil).execute(opts);

            Map<String, List<AccessMetadataValue>> result = apiInstance.patchLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, accessMetadataOperation, effectiveAt, effectiveUntil).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#patchLegalEntityAccessMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the Legal Entity identifier. | |
| **idTypeCode** | **String**| Code of the Legal Entity identifier. | |
| **code** | **String**| Code of the Legal Entity under specified identifier type&#39;s scope and code. | |
| **accessMetadataOperation** | [**List&lt;AccessMetadataOperation&gt;**](AccessMetadataOperation.md)| The Json Patch document | |
| **effectiveAt** | **String**| The effectiveAt datetime at which to upsert the Access Metadata | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata | [optional] |

### Return type

[**Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;**](List.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully patched items. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setLegalEntityIdentifiers

> LegalEntity setLegalEntityIdentifiers(idTypeScope, idTypeCode, code, setLegalEntityIdentifiersRequest)

[EARLY ACCESS] SetLegalEntityIdentifiers: Set Legal Entity Identifiers

Set identifiers of the Legal Entity.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
        String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
        String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with stated identifier type uniquely   identifies the legal entity.
        SetLegalEntityIdentifiersRequest setLegalEntityIdentifiersRequest = new SetLegalEntityIdentifiersRequest(); // SetLegalEntityIdentifiersRequest | Request containing identifiers to set for the legal entity. Identifiers not specified in request will not be changed.
        try {
            // uncomment the below to set overrides at the request level
            // LegalEntity result = apiInstance.setLegalEntityIdentifiers(idTypeScope, idTypeCode, code, setLegalEntityIdentifiersRequest).execute(opts);

            LegalEntity result = apiInstance.setLegalEntityIdentifiers(idTypeScope, idTypeCode, code, setLegalEntityIdentifiersRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#setLegalEntityIdentifiers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the legal entity identifier type. | |
| **idTypeCode** | **String**| Code of the legal entity identifier type. | |
| **code** | **String**| Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely   identifies the legal entity. | |
| **setLegalEntityIdentifiersRequest** | [**SetLegalEntityIdentifiersRequest**](SetLegalEntityIdentifiersRequest.md)| Request containing identifiers to set for the legal entity. Identifiers not specified in request will not be changed. | |

### Return type

[**LegalEntity**](LegalEntity.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Legal Entity with updated identifiers |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setLegalEntityProperties

> LegalEntity setLegalEntityProperties(idTypeScope, idTypeCode, code, setLegalEntityPropertiesRequest)

SetLegalEntityProperties: Set Legal Entity Properties

Set properties of the legal entity.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the legal entity identifier type.
        String idTypeCode = "idTypeCode_example"; // String | Code of the legal entity identifier type.
        String code = "code_example"; // String | Code of the legal entity under specified identifier type's scope and code. This together with stated identifier type uniquely   identifies the legal entity.
        SetLegalEntityPropertiesRequest setLegalEntityPropertiesRequest = new SetLegalEntityPropertiesRequest(); // SetLegalEntityPropertiesRequest | Request containing properties to set for the legal entity. Properties not specified in request will not be changed.
        try {
            // uncomment the below to set overrides at the request level
            // LegalEntity result = apiInstance.setLegalEntityProperties(idTypeScope, idTypeCode, code, setLegalEntityPropertiesRequest).execute(opts);

            LegalEntity result = apiInstance.setLegalEntityProperties(idTypeScope, idTypeCode, code, setLegalEntityPropertiesRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#setLegalEntityProperties");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the legal entity identifier type. | |
| **idTypeCode** | **String**| Code of the legal entity identifier type. | |
| **code** | **String**| Code of the legal entity under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely   identifies the legal entity. | |
| **setLegalEntityPropertiesRequest** | [**SetLegalEntityPropertiesRequest**](SetLegalEntityPropertiesRequest.md)| Request containing properties to set for the legal entity. Properties not specified in request will not be changed. | |

### Return type

[**LegalEntity**](LegalEntity.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Legal Entity with updated properties |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertLegalEntities

> UpsertLegalEntitiesResponse upsertLegalEntities(successMode, requestBody)

[EARLY ACCESS] UpsertLegalEntities: Batch upsert Legal Entities

Creates or updates a collection of Legal Entities

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String successMode = "successMode_example"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial
        Map<String, UpsertLegalEntityRequest> requestBody = new HashMap(); // Map<String, UpsertLegalEntityRequest> | A collection of requests to create or update Legal Entities.
        try {
            // uncomment the below to set overrides at the request level
            // UpsertLegalEntitiesResponse result = apiInstance.upsertLegalEntities(successMode, requestBody).execute(opts);

            UpsertLegalEntitiesResponse result = apiInstance.upsertLegalEntities(successMode, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#upsertLegalEntities");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial | |
| **requestBody** | [**Map&lt;String, UpsertLegalEntityRequest&gt;**](UpsertLegalEntityRequest.md)| A collection of requests to create or update Legal Entities. | |

### Return type

[**UpsertLegalEntitiesResponse**](UpsertLegalEntitiesResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The successfully created or updated legal entities along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertLegalEntity

> LegalEntity upsertLegalEntity(upsertLegalEntityRequest)

UpsertLegalEntity: Upsert Legal Entity

Create or update a legal entity

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        UpsertLegalEntityRequest upsertLegalEntityRequest = new UpsertLegalEntityRequest(); // UpsertLegalEntityRequest | Request to create or update a legal entity.
        try {
            // uncomment the below to set overrides at the request level
            // LegalEntity result = apiInstance.upsertLegalEntity(upsertLegalEntityRequest).execute(opts);

            LegalEntity result = apiInstance.upsertLegalEntity(upsertLegalEntityRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#upsertLegalEntity");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **upsertLegalEntityRequest** | [**UpsertLegalEntityRequest**](UpsertLegalEntityRequest.md)| Request to create or update a legal entity. | |

### Return type

[**LegalEntity**](LegalEntity.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created or updated legal entity |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertLegalEntityAccessMetadata

> ResourceListOfAccessMetadataValueOf upsertLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, upsertLegalEntityAccessMetadataRequest, effectiveAt, effectiveUntil)

UpsertLegalEntityAccessMetadata: Upsert a Legal Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.

Update or insert one Legal Entity Access Metadata entry in a single scope. An item will be updated if it already exists  and inserted if it does not.     The response will return the successfully updated or inserted Legal Entity Access Metadata rule or failure message if unsuccessful.     It is important to always check to verify success (or failure).     Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.LegalEntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LegalEntitiesApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // LegalEntitiesApi apiInstance = apiFactory.build(LegalEntitiesApi.class);

        LegalEntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(LegalEntitiesApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the Legal Entity identifier.
        String idTypeCode = "idTypeCode_example"; // String | Code of the Legal Entity identifier.
        String code = "code_example"; // String | Code of the Legal Entity under specified identifier type's scope and code.
        String metadataKey = "metadataKey_example"; // String | Key of the metadata entry to retrieve
        UpsertLegalEntityAccessMetadataRequest upsertLegalEntityAccessMetadataRequest = new UpsertLegalEntityAccessMetadataRequest(); // UpsertLegalEntityAccessMetadataRequest | The Legal Entity Access Metadata entry to upsert
        String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to upsert the Access Metadata
        OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' datetime of the Access Metadata
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfAccessMetadataValueOf result = apiInstance.upsertLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, upsertLegalEntityAccessMetadataRequest, effectiveAt, effectiveUntil).execute(opts);

            ResourceListOfAccessMetadataValueOf result = apiInstance.upsertLegalEntityAccessMetadata(idTypeScope, idTypeCode, code, metadataKey, upsertLegalEntityAccessMetadataRequest, effectiveAt, effectiveUntil).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LegalEntitiesApi#upsertLegalEntityAccessMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idTypeScope** | **String**| Scope of the Legal Entity identifier. | |
| **idTypeCode** | **String**| Code of the Legal Entity identifier. | |
| **code** | **String**| Code of the Legal Entity under specified identifier type&#39;s scope and code. | |
| **metadataKey** | **String**| Key of the metadata entry to retrieve | |
| **upsertLegalEntityAccessMetadataRequest** | [**UpsertLegalEntityAccessMetadataRequest**](UpsertLegalEntityAccessMetadataRequest.md)| The Legal Entity Access Metadata entry to upsert | |
| **effectiveAt** | **String**| The effectiveAt datetime at which to upsert the Access Metadata | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata | [optional] |

### Return type

[**ResourceListOfAccessMetadataValueOf**](ResourceListOfAccessMetadataValueOf.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted item or any failure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

