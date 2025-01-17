# AborApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDiaryEntry**](AborApi.md#addDiaryEntry) | **POST** /api/abor/{scope}/{code}/accountingdiary | [EXPERIMENTAL] AddDiaryEntry: Add a diary entry to the specified Abor. |
| [**closePeriod**](AborApi.md#closePeriod) | **POST** /api/abor/{scope}/{code}/accountingdiary/$closeperiod | [EXPERIMENTAL] ClosePeriod: Closes or locks the current period for the given Abor. |
| [**createAbor**](AborApi.md#createAbor) | **POST** /api/abor/{scope} | [EXPERIMENTAL] CreateAbor: Create an Abor. |
| [**deleteAbor**](AborApi.md#deleteAbor) | **DELETE** /api/abor/{scope}/{code} | [EXPERIMENTAL] DeleteAbor: Delete an Abor. |
| [**getAbor**](AborApi.md#getAbor) | **GET** /api/abor/{scope}/{code} | [EXPERIMENTAL] GetAbor: Get Abor. |
| [**getAborProperties**](AborApi.md#getAborProperties) | **GET** /api/abor/{scope}/{code}/properties | [EXPERIMENTAL] GetAborProperties: Get Abor properties |
| [**getJournalEntryLines**](AborApi.md#getJournalEntryLines) | **POST** /api/abor/{scope}/{code}/journalentrylines/$query | [EXPERIMENTAL] GetJournalEntryLines: Get the Journal Entry lines for the given Abor. |
| [**getTrialBalance**](AborApi.md#getTrialBalance) | **POST** /api/abor/{scope}/{code}/trialbalance/$query | [EXPERIMENTAL] GetTrialBalance: Get the Trial Balance for the given Abor. |
| [**listAbors**](AborApi.md#listAbors) | **GET** /api/abor | [EXPERIMENTAL] ListAbors: List Abors. |
| [**listDiaryEntries**](AborApi.md#listDiaryEntries) | **GET** /api/abor/{scope}/{code}/accountingdiary | [EXPERIMENTAL] ListDiaryEntries: List diary entries. |
| [**lockPeriod**](AborApi.md#lockPeriod) | **POST** /api/abor/{scope}/{code}/accountingdiary/$lockperiod | [EXPERIMENTAL] LockPeriod: Locks the last Closed or given Closed Period. |
| [**patchAbor**](AborApi.md#patchAbor) | **PATCH** /api/abor/{scope}/{code} | [EXPERIMENTAL] PatchAbor: Patch Abor. |
| [**reOpenPeriods**](AborApi.md#reOpenPeriods) | **POST** /api/abor/{scope}/{code}/accountingdiary/$reopenperiods | [EXPERIMENTAL] ReOpenPeriods: Reopen periods from a seed Diary Entry Code or when not specified, the last Closed Period for the given Abor. |
| [**upsertAborProperties**](AborApi.md#upsertAborProperties) | **POST** /api/abor/{scope}/{code}/properties/$upsert | [EXPERIMENTAL] UpsertAborProperties: Upsert Abor properties |



## addDiaryEntry

> DiaryEntry addDiaryEntry(scope, code, diaryEntryRequest)

[EXPERIMENTAL] AddDiaryEntry: Add a diary entry to the specified Abor.

Adds a new diary entry to the specified Abor

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AborApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AborApiExample {

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
        // AborApi apiInstance = apiFactory.build(AborApi.class);

        AborApi apiInstance = ApiFactoryBuilder.build(fileName).build(AborApi.class);
        String scope = "scope_example"; // String | The scope of the Abor.
        String code = "code_example"; // String | The code of the Abor.
        DiaryEntryRequest diaryEntryRequest = new DiaryEntryRequest(); // DiaryEntryRequest | The diary entry to add.
        try {
            // uncomment the below to set overrides at the request level
            // DiaryEntry result = apiInstance.addDiaryEntry(scope, code, diaryEntryRequest).execute(opts);

            DiaryEntry result = apiInstance.addDiaryEntry(scope, code, diaryEntryRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AborApi#addDiaryEntry");
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
| **scope** | **String**| The scope of the Abor. | |
| **code** | **String**| The code of the Abor. | |
| **diaryEntryRequest** | [**DiaryEntryRequest**](DiaryEntryRequest.md)| The diary entry to add. | |

### Return type

[**DiaryEntry**](DiaryEntry.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly added diary entry. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## closePeriod

> DiaryEntry closePeriod(scope, code, closePeriodDiaryEntryRequest)

[EXPERIMENTAL] ClosePeriod: Closes or locks the current period for the given Abor.

Closes or Locks the current open period for the given Abor.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AborApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AborApiExample {

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
        // AborApi apiInstance = apiFactory.build(AborApi.class);

        AborApi apiInstance = ApiFactoryBuilder.build(fileName).build(AborApi.class);
        String scope = "scope_example"; // String | The scope of the Abor.
        String code = "code_example"; // String | The code of the Abor.
        ClosePeriodDiaryEntryRequest closePeriodDiaryEntryRequest = new ClosePeriodDiaryEntryRequest(); // ClosePeriodDiaryEntryRequest | The request body, containing details to apply to the closing/locking period.
        try {
            // uncomment the below to set overrides at the request level
            // DiaryEntry result = apiInstance.closePeriod(scope, code, closePeriodDiaryEntryRequest).execute(opts);

            DiaryEntry result = apiInstance.closePeriod(scope, code, closePeriodDiaryEntryRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AborApi#closePeriod");
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
| **scope** | **String**| The scope of the Abor. | |
| **code** | **String**| The code of the Abor. | |
| **closePeriodDiaryEntryRequest** | [**ClosePeriodDiaryEntryRequest**](ClosePeriodDiaryEntryRequest.md)| The request body, containing details to apply to the closing/locking period. | |

### Return type

[**DiaryEntry**](DiaryEntry.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The DiaryEntry created as a result of the closing of the Period. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createAbor

> Abor createAbor(scope, aborRequest)

[EXPERIMENTAL] CreateAbor: Create an Abor.

Create the given Abor.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AborApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AborApiExample {

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
        // AborApi apiInstance = apiFactory.build(AborApi.class);

        AborApi apiInstance = ApiFactoryBuilder.build(fileName).build(AborApi.class);
        String scope = "scope_example"; // String | The scope of the Abor.
        AborRequest aborRequest = new AborRequest(); // AborRequest | The definition of the Abor.
        try {
            // uncomment the below to set overrides at the request level
            // Abor result = apiInstance.createAbor(scope, aborRequest).execute(opts);

            Abor result = apiInstance.createAbor(scope, aborRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AborApi#createAbor");
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
| **scope** | **String**| The scope of the Abor. | |
| **aborRequest** | [**AborRequest**](AborRequest.md)| The definition of the Abor. | |

### Return type

[**Abor**](Abor.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created abor. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteAbor

> DeletedEntityResponse deleteAbor(scope, code)

[EXPERIMENTAL] DeleteAbor: Delete an Abor.

Delete the given Abor.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AborApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AborApiExample {

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
        // AborApi apiInstance = apiFactory.build(AborApi.class);

        AborApi apiInstance = ApiFactoryBuilder.build(fileName).build(AborApi.class);
        String scope = "scope_example"; // String | The scope of the Abor to be deleted.
        String code = "code_example"; // String | The code of the Abor to be deleted. Together with the scope this uniquely identifies the Abor.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteAbor(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteAbor(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AborApi#deleteAbor");
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
| **scope** | **String**| The scope of the Abor to be deleted. | |
| **code** | **String**| The code of the Abor to be deleted. Together with the scope this uniquely identifies the Abor. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the Abor was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getAbor

> Abor getAbor(scope, code, effectiveAt, asAt, propertyKeys)

[EXPERIMENTAL] GetAbor: Get Abor.

Retrieve the definition of a particular Abor.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AborApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AborApiExample {

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
        // AborApi apiInstance = apiFactory.build(AborApi.class);

        AborApi apiInstance = ApiFactoryBuilder.build(fileName).build(AborApi.class);
        String scope = "scope_example"; // String | The scope of the Abor.
        String code = "code_example"; // String | The code of the Abor. Together with the scope this uniquely identifies the Abor.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Abor properties. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Abor definition. Defaults to returning the latest version of the Abor definition if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Abor' domain to decorate onto the Abor.   These must take the format {domain}/{scope}/{code}, for example 'Abor/Manager/Id'. If no properties are specified, then no properties will be returned.
        try {
            // uncomment the below to set overrides at the request level
            // Abor result = apiInstance.getAbor(scope, code, effectiveAt, asAt, propertyKeys).execute(opts);

            Abor result = apiInstance.getAbor(scope, code, effectiveAt, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AborApi#getAbor");
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
| **scope** | **String**| The scope of the Abor. | |
| **code** | **String**| The code of the Abor. Together with the scope this uniquely identifies the Abor. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Abor properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Abor definition. Defaults to returning the latest version of the Abor definition if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Abor&#39; domain to decorate onto the Abor.   These must take the format {domain}/{scope}/{code}, for example &#39;Abor/Manager/Id&#39;. If no properties are specified, then no properties will be returned. | [optional] |

### Return type

[**Abor**](Abor.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Abor definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getAborProperties

> AborProperties getAborProperties(scope, code, effectiveAt, asAt)

[EXPERIMENTAL] GetAborProperties: Get Abor properties

Get all the properties of a single abor.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AborApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AborApiExample {

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
        // AborApi apiInstance = apiFactory.build(AborApi.class);

        AborApi apiInstance = ApiFactoryBuilder.build(fileName).build(AborApi.class);
        String scope = "scope_example"; // String | The scope of the Abor to list the properties for.
        String code = "code_example"; // String | The code of the Abor to list the properties for. Together with the scope this uniquely identifies the Abor.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the Abor's properties. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Abor's properties. Defaults to return the latest version of each property if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // AborProperties result = apiInstance.getAborProperties(scope, code, effectiveAt, asAt).execute(opts);

            AborProperties result = apiInstance.getAborProperties(scope, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AborApi#getAborProperties");
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
| **scope** | **String**| The scope of the Abor to list the properties for. | |
| **code** | **String**| The code of the Abor to list the properties for. Together with the scope this uniquely identifies the Abor. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the Abor&#39;s properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Abor&#39;s properties. Defaults to return the latest version of each property if not specified. | [optional] |

### Return type

[**AborProperties**](AborProperties.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The properties of the specified abor |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getJournalEntryLines

> VersionedResourceListOfJournalEntryLine getJournalEntryLines(scope, code, journalEntryLinesQueryParameters, asAt, filter, limit, page)

[EXPERIMENTAL] GetJournalEntryLines: Get the Journal Entry lines for the given Abor.

Gets the Journal Entry lines for the given Abor     The Journal Entry lines have been generated from transactions and translated via posting rules

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AborApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AborApiExample {

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
        // AborApi apiInstance = apiFactory.build(AborApi.class);

        AborApi apiInstance = ApiFactoryBuilder.build(fileName).build(AborApi.class);
        String scope = "scope_example"; // String | The scope of the Abor.
        String code = "code_example"; // String | The code of the Abor. Together with the scope is creating the unique identifier for the given Abor.
        JournalEntryLinesQueryParameters journalEntryLinesQueryParameters = new JournalEntryLinesQueryParameters(); // JournalEntryLinesQueryParameters | The query parameters used in running the generation of the Journal Entry lines.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve Journal Entry lines. Defaults to returning the latest version   of each transaction if not specified.
        String filter = "filter_example"; // String | \"Expression to filter the result set.\"
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Journal Entry lines from a previous call to GetJournalEntryLines.
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListOfJournalEntryLine result = apiInstance.getJournalEntryLines(scope, code, journalEntryLinesQueryParameters, asAt, filter, limit, page).execute(opts);

            VersionedResourceListOfJournalEntryLine result = apiInstance.getJournalEntryLines(scope, code, journalEntryLinesQueryParameters, asAt, filter, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AborApi#getJournalEntryLines");
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
| **scope** | **String**| The scope of the Abor. | |
| **code** | **String**| The code of the Abor. Together with the scope is creating the unique identifier for the given Abor. | |
| **journalEntryLinesQueryParameters** | [**JournalEntryLinesQueryParameters**](JournalEntryLinesQueryParameters.md)| The query parameters used in running the generation of the Journal Entry lines. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve Journal Entry lines. Defaults to returning the latest version   of each transaction if not specified. | [optional] |
| **filter** | **String**| \&quot;Expression to filter the result set.\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Journal Entry lines from a previous call to GetJournalEntryLines. | [optional] |

### Return type

[**VersionedResourceListOfJournalEntryLine**](VersionedResourceListOfJournalEntryLine.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Journal Entry lines for the specified Abor. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTrialBalance

> VersionedResourceListOfTrialBalance getTrialBalance(scope, code, trialBalanceQueryParameters, asAt, filter, limit, page)

[EXPERIMENTAL] GetTrialBalance: Get the Trial Balance for the given Abor.

Gets the Trial Balance for the given Abor.    The Trial Balance has been generated from transactions, translated via Posting Rules  and aggregated based on a General Ledger Profile (where specified).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AborApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AborApiExample {

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
        // AborApi apiInstance = apiFactory.build(AborApi.class);

        AborApi apiInstance = ApiFactoryBuilder.build(fileName).build(AborApi.class);
        String scope = "scope_example"; // String | The scope of the Abor.
        String code = "code_example"; // String | The code of the Abor. Together with the scope this uniquely identifies the Abor.
        TrialBalanceQueryParameters trialBalanceQueryParameters = new TrialBalanceQueryParameters(); // TrialBalanceQueryParameters | The query parameters used in running the generation of the Trial Balance.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Trial Balance.   Defaults to returning the latest version if not specified.
        String filter = "filter_example"; // String | Expression to filter the results by.   For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.   Defaults to 100 if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Trial Balances.   This token is returned from the previous call.   If a pagination token is provided, the filter, effectiveAt and asAt fields   must not have changed since the original request.
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListOfTrialBalance result = apiInstance.getTrialBalance(scope, code, trialBalanceQueryParameters, asAt, filter, limit, page).execute(opts);

            VersionedResourceListOfTrialBalance result = apiInstance.getTrialBalance(scope, code, trialBalanceQueryParameters, asAt, filter, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AborApi#getTrialBalance");
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
| **scope** | **String**| The scope of the Abor. | |
| **code** | **String**| The code of the Abor. Together with the scope this uniquely identifies the Abor. | |
| **trialBalanceQueryParameters** | [**TrialBalanceQueryParameters**](TrialBalanceQueryParameters.md)| The query parameters used in running the generation of the Trial Balance. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Trial Balance.   Defaults to returning the latest version if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results by.   For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many.   Defaults to 100 if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Trial Balances.   This token is returned from the previous call.   If a pagination token is provided, the filter, effectiveAt and asAt fields   must not have changed since the original request. | [optional] |

### Return type

[**VersionedResourceListOfTrialBalance**](VersionedResourceListOfTrialBalance.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Trial Balance for the specified Abor. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listAbors

> PagedResourceListOfAbor listAbors(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListAbors: List Abors.

List all the Abors matching particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AborApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AborApiExample {

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
        // AborApi apiInstance = apiFactory.build(AborApi.class);

        AborApi apiInstance = ApiFactoryBuilder.build(fileName).build(AborApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the TimeVariant properties for the Abor. Defaults to the current LUSID   system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Abor. Defaults to returning the latest version of each Abor if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Abor; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the Abor type, specify \"id.Code eq 'Abor1'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Abor' domain to decorate onto each Abor.   These must take the format {domain}/{scope}/{code}, for example 'Abor/Manager/Id'.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfAbor result = apiInstance.listAbors(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            PagedResourceListOfAbor result = apiInstance.listAbors(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AborApi#listAbors");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the TimeVariant properties for the Abor. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Abor. Defaults to returning the latest version of each Abor if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Abor; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the Abor type, specify \&quot;id.Code eq &#39;Abor1&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Abor&#39; domain to decorate onto each Abor.   These must take the format {domain}/{scope}/{code}, for example &#39;Abor/Manager/Id&#39;. | [optional] |

### Return type

[**PagedResourceListOfAbor**](PagedResourceListOfAbor.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested abors. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listDiaryEntries

> PagedResourceListOfDiaryEntry listDiaryEntries(scope, code, effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListDiaryEntries: List diary entries.

List all the diary entries matching particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AborApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AborApiExample {

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
        // AborApi apiInstance = apiFactory.build(AborApi.class);

        AborApi apiInstance = ApiFactoryBuilder.build(fileName).build(AborApi.class);
        String scope = "scope_example"; // String | The scope of the Abor.
        String code = "code_example"; // String | The code of the Abor.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the TimeVariant properties for the Diary Entries. Defaults to the current LUSID   system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the DiaryEntry. Defaults to returning the latest version of each DiaryEntry if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing diary entries; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the DiaryEntry type, specify \"type eq 'PeriodBoundary'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'DiaryEntry' domain to decorate onto each DiaryEntry.   These must take the format {domain}/{scope}/{code}, for example 'DiaryEntry/Report/Id'.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfDiaryEntry result = apiInstance.listDiaryEntries(scope, code, effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            PagedResourceListOfDiaryEntry result = apiInstance.listDiaryEntries(scope, code, effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AborApi#listDiaryEntries");
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
| **scope** | **String**| The scope of the Abor. | |
| **code** | **String**| The code of the Abor. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the TimeVariant properties for the Diary Entries. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the DiaryEntry. Defaults to returning the latest version of each DiaryEntry if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing diary entries; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the DiaryEntry type, specify \&quot;type eq &#39;PeriodBoundary&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;DiaryEntry&#39; domain to decorate onto each DiaryEntry.   These must take the format {domain}/{scope}/{code}, for example &#39;DiaryEntry/Report/Id&#39;. | [optional] |

### Return type

[**PagedResourceListOfDiaryEntry**](PagedResourceListOfDiaryEntry.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested diary entries. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## lockPeriod

> DiaryEntry lockPeriod(scope, code, lockPeriodDiaryEntryRequest)

[EXPERIMENTAL] LockPeriod: Locks the last Closed or given Closed Period.

Locks the specified or last locked period for the given Abor.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AborApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AborApiExample {

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
        // AborApi apiInstance = apiFactory.build(AborApi.class);

        AborApi apiInstance = ApiFactoryBuilder.build(fileName).build(AborApi.class);
        String scope = "scope_example"; // String | The scope of the Abor.
        String code = "code_example"; // String | The code of the Abor.
        LockPeriodDiaryEntryRequest lockPeriodDiaryEntryRequest = new LockPeriodDiaryEntryRequest(); // LockPeriodDiaryEntryRequest | The request body, detailing lock details
        try {
            // uncomment the below to set overrides at the request level
            // DiaryEntry result = apiInstance.lockPeriod(scope, code, lockPeriodDiaryEntryRequest).execute(opts);

            DiaryEntry result = apiInstance.lockPeriod(scope, code, lockPeriodDiaryEntryRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AborApi#lockPeriod");
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
| **scope** | **String**| The scope of the Abor. | |
| **code** | **String**| The code of the Abor. | |
| **lockPeriodDiaryEntryRequest** | [**LockPeriodDiaryEntryRequest**](LockPeriodDiaryEntryRequest.md)| The request body, detailing lock details | [optional] |

### Return type

[**DiaryEntry**](DiaryEntry.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated DiaryEntry as a result of the locking of the Period. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## patchAbor

> Abor patchAbor(scope, code, operation)

[EXPERIMENTAL] PatchAbor: Patch Abor.

Create or update certain fields for a particular Abor.  The behaviour is defined by the JSON Patch specification.     Currently supported fields are: PortfolioIds.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AborApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AborApiExample {

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
        // AborApi apiInstance = apiFactory.build(AborApi.class);

        AborApi apiInstance = ApiFactoryBuilder.build(fileName).build(AborApi.class);
        String scope = "scope_example"; // String | The scope of the Abor.
        String code = "code_example"; // String | The code of the Abor. Together with the   scope this uniquely identifies the Abor.
        List<Operation> operation = Arrays.asList(); // List<Operation> | The json patch document. For more information see: https://datatracker.ietf.org/doc/html/rfc6902.
        try {
            // uncomment the below to set overrides at the request level
            // Abor result = apiInstance.patchAbor(scope, code, operation).execute(opts);

            Abor result = apiInstance.patchAbor(scope, code, operation).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AborApi#patchAbor");
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
| **scope** | **String**| The scope of the Abor. | |
| **code** | **String**| The code of the Abor. Together with the   scope this uniquely identifies the Abor. | |
| **operation** | [**List&lt;Operation&gt;**](Operation.md)| The json patch document. For more information see: https://datatracker.ietf.org/doc/html/rfc6902. | |

### Return type

[**Abor**](Abor.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly patched Abor |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## reOpenPeriods

> PeriodDiaryEntriesReopenedResponse reOpenPeriods(scope, code, reOpenPeriodDiaryEntryRequest)

[EXPERIMENTAL] ReOpenPeriods: Reopen periods from a seed Diary Entry Code or when not specified, the last Closed Period for the given Abor.

Reopens one or more periods.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AborApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AborApiExample {

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
        // AborApi apiInstance = apiFactory.build(AborApi.class);

        AborApi apiInstance = ApiFactoryBuilder.build(fileName).build(AborApi.class);
        String scope = "scope_example"; // String | The scope of the Abor to be deleted.
        String code = "code_example"; // String | The code of the Abor to be deleted. Together with the scope this uniquely identifies the Abor.
        ReOpenPeriodDiaryEntryRequest reOpenPeriodDiaryEntryRequest = new ReOpenPeriodDiaryEntryRequest(); // ReOpenPeriodDiaryEntryRequest | The request body, detailing re open details
        try {
            // uncomment the below to set overrides at the request level
            // PeriodDiaryEntriesReopenedResponse result = apiInstance.reOpenPeriods(scope, code, reOpenPeriodDiaryEntryRequest).execute(opts);

            PeriodDiaryEntriesReopenedResponse result = apiInstance.reOpenPeriods(scope, code, reOpenPeriodDiaryEntryRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AborApi#reOpenPeriods");
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
| **scope** | **String**| The scope of the Abor to be deleted. | |
| **code** | **String**| The code of the Abor to be deleted. Together with the scope this uniquely identifies the Abor. | |
| **reOpenPeriodDiaryEntryRequest** | [**ReOpenPeriodDiaryEntryRequest**](ReOpenPeriodDiaryEntryRequest.md)| The request body, detailing re open details | [optional] |

### Return type

[**PeriodDiaryEntriesReopenedResponse**](PeriodDiaryEntriesReopenedResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the DiaryEntryCodes were deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertAborProperties

> AborProperties upsertAborProperties(scope, code, requestBody)

[EXPERIMENTAL] UpsertAborProperties: Upsert Abor properties

Update or insert one or more properties onto a single Abor. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;Abor&#39;.     Upserting a property that exists for an Abor, with a null value, will delete the instance of the property for that group.     Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AborApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AborApiExample {

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
        // AborApi apiInstance = apiFactory.build(AborApi.class);

        AborApi apiInstance = ApiFactoryBuilder.build(fileName).build(AborApi.class);
        String scope = "scope_example"; // String | The scope of the Abor to update or insert the properties onto.
        String code = "code_example"; // String | The code of the Abor to update or insert the properties onto. Together with the scope this uniquely identifies the Abor.
        Map<String, Property> requestBody = new HashMap(); // Map<String, Property> | The properties to be updated or inserted onto the Abor. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \"Abor/Manager/Id\".
        try {
            // uncomment the below to set overrides at the request level
            // AborProperties result = apiInstance.upsertAborProperties(scope, code, requestBody).execute(opts);

            AborProperties result = apiInstance.upsertAborProperties(scope, code, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AborApi#upsertAborProperties");
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
| **scope** | **String**| The scope of the Abor to update or insert the properties onto. | |
| **code** | **String**| The code of the Abor to update or insert the properties onto. Together with the scope this uniquely identifies the Abor. | |
| **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be updated or inserted onto the Abor. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;Abor/Manager/Id\&quot;. | [optional] |

### Return type

[**AborProperties**](AborProperties.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated or inserted properties |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

