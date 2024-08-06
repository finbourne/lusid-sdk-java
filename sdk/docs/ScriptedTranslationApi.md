# ScriptedTranslationApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTranslationDialect**](ScriptedTranslationApi.md#getTranslationDialect) | **GET** /api/scriptedtranslation/dialects/{scope}/{vendor}/{sourceSystem}/{entityType}/{serialisationFormat}/{version} | [EARLY ACCESS] GetTranslationDialect: Get a dialect. |
| [**getTranslationScript**](ScriptedTranslationApi.md#getTranslationScript) | **GET** /api/scriptedtranslation/scripts/{scope}/{code}/{version} | [EARLY ACCESS] GetTranslationScript: Retrieve a translation script by its identifier. |
| [**listDialectIds**](ScriptedTranslationApi.md#listDialectIds) | **GET** /api/scriptedtranslation/dialects/ids | [EARLY ACCESS] ListDialectIds: List dialect identifiers matching an optional filter. |
| [**listTranslationScriptIds**](ScriptedTranslationApi.md#listTranslationScriptIds) | **GET** /api/scriptedtranslation/scripts/ids | [EARLY ACCESS] ListTranslationScriptIds: List translation script identifiers. |
| [**translateEntities**](ScriptedTranslationApi.md#translateEntities) | **POST** /api/scriptedtranslation/translateentities | [EARLY ACCESS] TranslateEntities: Translate a collection of entities with a specified translation script. |
| [**translateEntitiesInlined**](ScriptedTranslationApi.md#translateEntitiesInlined) | **POST** /api/scriptedtranslation/translateentitiesinlined | [EARLY ACCESS] TranslateEntitiesInlined: Translate a collection of entities, inlining the body of the translation script. |
| [**upsertTranslationDialect**](ScriptedTranslationApi.md#upsertTranslationDialect) | **POST** /api/scriptedtranslation/dialects | [EARLY ACCESS] UpsertTranslationDialect: Upsert a Dialect. |
| [**upsertTranslationScript**](ScriptedTranslationApi.md#upsertTranslationScript) | **POST** /api/scriptedtranslation/scripts | [EARLY ACCESS] UpsertTranslationScript: Upsert a translation script. |



## getTranslationDialect

> Dialect getTranslationDialect(scope, vendor, sourceSystem, entityType, serialisationFormat, version, asAt)

[EARLY ACCESS] GetTranslationDialect: Get a dialect.

Get the dialect with the given identifier at the specific asAt time.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ScriptedTranslationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ScriptedTranslationApiExample {

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

        ScriptedTranslationApi apiInstance = ApiFactoryBuilder.build(fileName).build(ScriptedTranslationApi.class);
        String scope = "scope_example"; // String | The scope of the dialect.
        String vendor = "vendor_example"; // String | The vendor of the dialect, the entity that created it. e.g. ISDA, FINBOURNE.
        String sourceSystem = "sourceSystem_example"; // String | The source system of the dialect, the system that understands it. e.g. LUSID, QuantLib.
        String entityType = "entityType_example"; // String | The type of entity this dialect describes e.g. Instrument.
        String serialisationFormat = "serialisationFormat_example"; // String | The serialisation format of a document in this dialect. e.g. JSON, XML.
        String version = "version_example"; // String | The semantic version of the dialect: MAJOR.MINOR.PATCH.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the dialect. Defaults to return the latest version of the dialect if not specified.
        try {
            Dialect result = apiInstance.getTranslationDialect(scope, vendor, sourceSystem, entityType, serialisationFormat, version, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScriptedTranslationApi#getTranslationDialect");
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
| **scope** | **String**| The scope of the dialect. | |
| **vendor** | **String**| The vendor of the dialect, the entity that created it. e.g. ISDA, FINBOURNE. | |
| **sourceSystem** | **String**| The source system of the dialect, the system that understands it. e.g. LUSID, QuantLib. | |
| **entityType** | **String**| The type of entity this dialect describes e.g. Instrument. | |
| **serialisationFormat** | **String**| The serialisation format of a document in this dialect. e.g. JSON, XML. | |
| **version** | **String**| The semantic version of the dialect: MAJOR.MINOR.PATCH. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the dialect. Defaults to return the latest version of the dialect if not specified. | [optional] |

### Return type

[**Dialect**](Dialect.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The dialect with the given ID. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTranslationScript

> TranslationScript getTranslationScript(scope, code, version, asAt)

[EARLY ACCESS] GetTranslationScript: Retrieve a translation script by its identifier.

Retrieves a translation script to be used for translating financial entities.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ScriptedTranslationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ScriptedTranslationApiExample {

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

        ScriptedTranslationApi apiInstance = ApiFactoryBuilder.build(fileName).build(ScriptedTranslationApi.class);
        String scope = "scope_example"; // String | Scope of the translation script.
        String code = "code_example"; // String | Code of the translation script.
        String version = "version_example"; // String | Semantic version of the translation script.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the translation script. Defaults to latest.
        try {
            TranslationScript result = apiInstance.getTranslationScript(scope, code, version, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScriptedTranslationApi#getTranslationScript");
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
| **scope** | **String**| Scope of the translation script. | |
| **code** | **String**| Code of the translation script. | |
| **version** | **String**| Semantic version of the translation script. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the translation script. Defaults to latest. | [optional] |

### Return type

[**TranslationScript**](TranslationScript.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested translation script. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listDialectIds

> PagedResourceListOfDialectId listDialectIds(asAt, page, limit, filter)

[EARLY ACCESS] ListDialectIds: List dialect identifiers matching an optional filter.

List the stored dialects&#39; identifiers with pagination and filtering at the specified asAt time.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ScriptedTranslationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ScriptedTranslationApiExample {

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

        ScriptedTranslationApi apiInstance = ApiFactoryBuilder.build(fileName).build(ScriptedTranslationApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the dialects.   Defaults to return the latest version of the dialect if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing dialect IDs from a previous call to list dialect IDs.   This value is returned from the previous call. If a pagination token is provided the filter and asAt fields   must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        try {
            PagedResourceListOfDialectId result = apiInstance.listDialectIds(asAt, page, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScriptedTranslationApi#listDialectIds");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the dialects.   Defaults to return the latest version of the dialect if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing dialect IDs from a previous call to list dialect IDs.   This value is returned from the previous call. If a pagination token is provided the filter and asAt fields   must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfDialectId**](PagedResourceListOfDialectId.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A collection of dialect IDs. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listTranslationScriptIds

> PagedResourceListOfTranslationScriptId listTranslationScriptIds(asAt, limit, filter, page)

[EARLY ACCESS] ListTranslationScriptIds: List translation script identifiers.

List translation script ids.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ScriptedTranslationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ScriptedTranslationApiExample {

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

        ScriptedTranslationApi apiInstance = ApiFactoryBuilder.build(fileName).build(ScriptedTranslationApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the script identifiers. Defaults to latest.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. For example, Id.Version.Major eq 1 to list IDs with major version 1   or Id.Scope eq 'my-scripts' to list result only for a particular scope.
        String page = "page_example"; // String | The pagination token to use to continue listing translation script IDs; this   value is returned from the previous call. If a pagination token is provided, the filter field   must not have changed since the original request.
        try {
            PagedResourceListOfTranslationScriptId result = apiInstance.listTranslationScriptIds(asAt, limit, filter, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScriptedTranslationApi#listTranslationScriptIds");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the script identifiers. Defaults to latest. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. For example, Id.Version.Major eq 1 to list IDs with major version 1   or Id.Scope eq &#39;my-scripts&#39; to list result only for a particular scope. | [optional] |
| **page** | **String**| The pagination token to use to continue listing translation script IDs; this   value is returned from the previous call. If a pagination token is provided, the filter field   must not have changed since the original request. | [optional] |

### Return type

[**PagedResourceListOfTranslationScriptId**](PagedResourceListOfTranslationScriptId.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested translation script IDs. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## translateEntities

> TranslateEntitiesResponse translateEntities(translateEntitiesRequest)

[EARLY ACCESS] TranslateEntities: Translate a collection of entities with a specified translation script.

Run the provided translation request. The entities to translate are specified in the request body as a  dictionary with (ephemeral) unique correlation IDs. The script to use and optional dialect to validate  results against are sourced from the database.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ScriptedTranslationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ScriptedTranslationApiExample {

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

        ScriptedTranslationApi apiInstance = ApiFactoryBuilder.build(fileName).build(ScriptedTranslationApi.class);
        TranslateEntitiesRequest translateEntitiesRequest = new TranslateEntitiesRequest(); // TranslateEntitiesRequest | The entities to translate, along with identifiers for the script and (optional) dialect to use.
        try {
            TranslateEntitiesResponse result = apiInstance.translateEntities(translateEntitiesRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScriptedTranslationApi#translateEntities");
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
| **translateEntitiesRequest** | [**TranslateEntitiesRequest**](TranslateEntitiesRequest.md)| The entities to translate, along with identifiers for the script and (optional) dialect to use. | |

### Return type

[**TranslateEntitiesResponse**](TranslateEntitiesResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The translated entities along with any errors for entities that failed to be translated indexed by their correlation IDs. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## translateEntitiesInlined

> TranslateEntitiesResponse translateEntitiesInlined(translateEntitiesInlinedRequest)

[EARLY ACCESS] TranslateEntitiesInlined: Translate a collection of entities, inlining the body of the translation script.

Run the provided translation request. The entities to translate, script to use and dialect to validate results against  are all specified in the request body. The entities are given as a dictionary with (ephemeral) unique correlation IDs.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ScriptedTranslationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ScriptedTranslationApiExample {

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

        ScriptedTranslationApi apiInstance = ApiFactoryBuilder.build(fileName).build(ScriptedTranslationApi.class);
        TranslateEntitiesInlinedRequest translateEntitiesInlinedRequest = new TranslateEntitiesInlinedRequest(); // TranslateEntitiesInlinedRequest | The entities to translate, along with the script to use and an optional schema for validation.
        try {
            TranslateEntitiesResponse result = apiInstance.translateEntitiesInlined(translateEntitiesInlinedRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScriptedTranslationApi#translateEntitiesInlined");
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
| **translateEntitiesInlinedRequest** | [**TranslateEntitiesInlinedRequest**](TranslateEntitiesInlinedRequest.md)| The entities to translate, along with the script to use and an optional schema for validation. | |

### Return type

[**TranslateEntitiesResponse**](TranslateEntitiesResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The translated entities along with any errors for entities that failed to be translated indexed by their correlation IDs. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertTranslationDialect

> Dialect upsertTranslationDialect(upsertDialectRequest)

[EARLY ACCESS] UpsertTranslationDialect: Upsert a Dialect.

Upsert the given dialect.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ScriptedTranslationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ScriptedTranslationApiExample {

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

        ScriptedTranslationApi apiInstance = ApiFactoryBuilder.build(fileName).build(ScriptedTranslationApi.class);
        UpsertDialectRequest upsertDialectRequest = new UpsertDialectRequest(); // UpsertDialectRequest | The dialect to upsert.
        try {
            Dialect result = apiInstance.upsertTranslationDialect(upsertDialectRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScriptedTranslationApi#upsertTranslationDialect");
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
| **upsertDialectRequest** | [**UpsertDialectRequest**](UpsertDialectRequest.md)| The dialect to upsert. | |

### Return type

[**Dialect**](Dialect.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The upserted dialect. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertTranslationScript

> TranslationScript upsertTranslationScript(upsertTranslationScriptRequest)

[EARLY ACCESS] UpsertTranslationScript: Upsert a translation script.

Upserts a translation script to be used for translating financial entities.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ScriptedTranslationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ScriptedTranslationApiExample {

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

        ScriptedTranslationApi apiInstance = ApiFactoryBuilder.build(fileName).build(ScriptedTranslationApi.class);
        UpsertTranslationScriptRequest upsertTranslationScriptRequest = new UpsertTranslationScriptRequest(); // UpsertTranslationScriptRequest | The translation script to be upserted.
        try {
            TranslationScript result = apiInstance.upsertTranslationScript(upsertTranslationScriptRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScriptedTranslationApi#upsertTranslationScript");
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
| **upsertTranslationScriptRequest** | [**UpsertTranslationScriptRequest**](UpsertTranslationScriptRequest.md)| The translation script to be upserted. | |

### Return type

[**TranslationScript**](TranslationScript.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully created translation script. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

