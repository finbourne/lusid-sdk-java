# AborApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDiaryEntry**](AborApi.md#addDiaryEntry) | **POST** /api/abor/{scope}/{code}/accountingdiary/{diaryEntryCode} | [EXPERIMENTAL] AddDiaryEntry: Add a diary entry to the specified Abor. |
| [**createAbor**](AborApi.md#createAbor) | **POST** /api/abor/{scope} | [EXPERIMENTAL] CreateAbor: Create an Abor. |
| [**deleteAbor**](AborApi.md#deleteAbor) | **DELETE** /api/abor/{scope}/{code} | [EXPERIMENTAL] DeleteAbor: Delete an Abor. |
| [**getAbor**](AborApi.md#getAbor) | **GET** /api/abor/{scope}/{code} | [EXPERIMENTAL] GetAbor: Get Abor. |
| [**getJELines**](AborApi.md#getJELines) | **POST** /api/abor/{scope}/{code}/JELines/$query/$deprecated | [DEPRECATED] GetJELines: DEPRECATED: please use GetJournalEntryLines instead. Get the JELines for the given Abor. |
| [**getJournalEntryLines**](AborApi.md#getJournalEntryLines) | **POST** /api/abor/{scope}/{code}/journalentrylines/$query | [EXPERIMENTAL] GetJournalEntryLines: Get the Journal Entry lines for the given Abor. |
| [**getTrialBalance**](AborApi.md#getTrialBalance) | **POST** /api/abor/{scope}/{code}/trialbalance/$query | [EXPERIMENTAL] GetTrialBalance: Get the Trial balance for the given Abor. |
| [**listAbors**](AborApi.md#listAbors) | **GET** /api/abor | [EXPERIMENTAL] ListAbors: List Abors. |
| [**listDiaryEntries**](AborApi.md#listDiaryEntries) | **GET** /api/abor/{scope}/{code}/accountingdiary | [EXPERIMENTAL] ListDiaryEntries: List diary entries. |
| [**upsertAborProperties**](AborApi.md#upsertAborProperties) | **POST** /api/abor/{scope}/{code}/properties/$upsert | [EXPERIMENTAL] UpsertAborProperties: Upsert Abor properties |


<a id="addDiaryEntry"></a>
# **addDiaryEntry**
> DiaryEntry addDiaryEntry(scope, code, diaryEntryCode, diaryEntryRequest)

[EXPERIMENTAL] AddDiaryEntry: Add a diary entry to the specified Abor.

Adds a new diary entry to the specified Abor

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborApi apiInstance = new AborApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Abor.
    String code = "code_example"; // String | The code of the Abor.
    String diaryEntryCode = "diaryEntryCode_example"; // String | Diary entry code
    DiaryEntryRequest diaryEntryRequest = new DiaryEntryRequest(); // DiaryEntryRequest | The diary entry to add.
    try {
      DiaryEntry result = apiInstance.addDiaryEntry(scope, code, diaryEntryCode, diaryEntryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborApi#addDiaryEntry");
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
| **scope** | **String**| The scope of the Abor. | |
| **code** | **String**| The code of the Abor. | |
| **diaryEntryCode** | **String**| Diary entry code | |
| **diaryEntryRequest** | [**DiaryEntryRequest**](DiaryEntryRequest.md)| The diary entry to add. | |

### Return type

[**DiaryEntry**](DiaryEntry.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly added diary entry. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="createAbor"></a>
# **createAbor**
> Abor createAbor(scope, aborRequest)

[EXPERIMENTAL] CreateAbor: Create an Abor.

Create the given Abor.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborApi apiInstance = new AborApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Abor.
    AborRequest aborRequest = new AborRequest(); // AborRequest | The definition of the Abor.
    try {
      Abor result = apiInstance.createAbor(scope, aborRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborApi#createAbor");
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
| **scope** | **String**| The scope of the Abor. | |
| **aborRequest** | [**AborRequest**](AborRequest.md)| The definition of the Abor. | |

### Return type

[**Abor**](Abor.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created abor. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteAbor"></a>
# **deleteAbor**
> DeletedEntityResponse deleteAbor(scope, code)

[EXPERIMENTAL] DeleteAbor: Delete an Abor.

Delete the given Abor.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborApi apiInstance = new AborApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Abor to be deleted.
    String code = "code_example"; // String | The code of the Abor to be deleted. Together with the scope this uniquely identifies the Abor.
    try {
      DeletedEntityResponse result = apiInstance.deleteAbor(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborApi#deleteAbor");
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
| **scope** | **String**| The scope of the Abor to be deleted. | |
| **code** | **String**| The code of the Abor to be deleted. Together with the scope this uniquely identifies the Abor. | |

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
| **200** | The datetime that the Abor was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getAbor"></a>
# **getAbor**
> Abor getAbor(scope, code, effectiveAt, asAt, propertyKeys)

[EXPERIMENTAL] GetAbor: Get Abor.

Retrieve the definition of a particular Abor.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborApi apiInstance = new AborApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Abor.
    String code = "code_example"; // String | The code of the Abor. Together with the scope this uniquely identifies the Abor.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Abor properties. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Abor definition. Defaults to returning the latest version of the Abor definition if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Abor' domain to decorate onto the Abor.              These must take the format {domain}/{scope}/{code}, for example 'Abor/Manager/Id'. If not provided will return all the entitled properties for that Abor.
    try {
      Abor result = apiInstance.getAbor(scope, code, effectiveAt, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborApi#getAbor");
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
| **scope** | **String**| The scope of the Abor. | |
| **code** | **String**| The code of the Abor. Together with the scope this uniquely identifies the Abor. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Abor properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Abor definition. Defaults to returning the latest version of the Abor definition if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Abor&#39; domain to decorate onto the Abor.              These must take the format {domain}/{scope}/{code}, for example &#39;Abor/Manager/Id&#39;. If not provided will return all the entitled properties for that Abor. | [optional] |

### Return type

[**Abor**](Abor.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Abor definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getJELines"></a>
# **getJELines**
> VersionedResourceListOfJournalEntryLine getJELines(scope, code, jeLinesQueryParameters, asAt, limit, page)

[DEPRECATED] GetJELines: DEPRECATED: please use GetJournalEntryLines instead. Get the JELines for the given Abor.

DEPRECATED: please use GetJournalEntryLines instead. Gets the JELines for the given Abor                The JE Lines have been generated from transactions and translated via posting rules

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborApi apiInstance = new AborApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Abor.
    String code = "code_example"; // String | The code of the Abor. Together with the scope is creating the unique identifier for the given Abor.
    JELinesQueryParameters jeLinesQueryParameters = new JELinesQueryParameters(); // JELinesQueryParameters | The query parameters used in running the generation of the JELines.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve JELines. Defaults to returning the latest version               of each transaction if not specified.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing JELines from a previous call to GetJELines.
    try {
      VersionedResourceListOfJournalEntryLine result = apiInstance.getJELines(scope, code, jeLinesQueryParameters, asAt, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborApi#getJELines");
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
| **scope** | **String**| The scope of the Abor. | |
| **code** | **String**| The code of the Abor. Together with the scope is creating the unique identifier for the given Abor. | |
| **jeLinesQueryParameters** | [**JELinesQueryParameters**](JELinesQueryParameters.md)| The query parameters used in running the generation of the JELines. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve JELines. Defaults to returning the latest version               of each transaction if not specified. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing JELines from a previous call to GetJELines. | [optional] |

### Return type

[**VersionedResourceListOfJournalEntryLine**](VersionedResourceListOfJournalEntryLine.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested JELines for the specified Abor. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getJournalEntryLines"></a>
# **getJournalEntryLines**
> VersionedResourceListOfJournalEntryLine getJournalEntryLines(scope, code, journalEntryLinesQueryParameters, asAt, filter, limit, page)

[EXPERIMENTAL] GetJournalEntryLines: Get the Journal Entry lines for the given Abor.

Gets the Journal Entry lines for the given Abor                The Journal Entry lines have been generated from transactions and translated via posting rules

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborApi apiInstance = new AborApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Abor.
    String code = "code_example"; // String | The code of the Abor. Together with the scope is creating the unique identifier for the given Abor.
    JournalEntryLinesQueryParameters journalEntryLinesQueryParameters = new JournalEntryLinesQueryParameters(); // JournalEntryLinesQueryParameters | The query parameters used in running the generation of the Journal Entry lines.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve Journal Entry lines. Defaults to returning the latest version               of each transaction if not specified.
    String filter = "filter_example"; // String | \"Expression to filter the result set.\"
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing Journal Entry lines from a previous call to GetJournalEntryLines.
    try {
      VersionedResourceListOfJournalEntryLine result = apiInstance.getJournalEntryLines(scope, code, journalEntryLinesQueryParameters, asAt, filter, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborApi#getJournalEntryLines");
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
| **scope** | **String**| The scope of the Abor. | |
| **code** | **String**| The code of the Abor. Together with the scope is creating the unique identifier for the given Abor. | |
| **journalEntryLinesQueryParameters** | [**JournalEntryLinesQueryParameters**](JournalEntryLinesQueryParameters.md)| The query parameters used in running the generation of the Journal Entry lines. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve Journal Entry lines. Defaults to returning the latest version               of each transaction if not specified. | [optional] |
| **filter** | **String**| \&quot;Expression to filter the result set.\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Journal Entry lines from a previous call to GetJournalEntryLines. | [optional] |

### Return type

[**VersionedResourceListOfJournalEntryLine**](VersionedResourceListOfJournalEntryLine.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Journal Entry lines for the specified Abor. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getTrialBalance"></a>
# **getTrialBalance**
> VersionedResourceListOfTrialBalance getTrialBalance(scope, code, trialBalanceQueryParameters, asAt, filter, limit, page)

[EXPERIMENTAL] GetTrialBalance: Get the Trial balance for the given Abor.

Gets the Trial balance for the given Abor    The Trial balance has been generated from transactions, translated via posting rules and aggregated based on a General Ledger Profile (where specified)

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborApi apiInstance = new AborApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Abor.
    String code = "code_example"; // String | The code of the Abor. Together with the scope is the unique identifier for the given Abor.
    TrialBalanceQueryParameters trialBalanceQueryParameters = new TrialBalanceQueryParameters(); // TrialBalanceQueryParameters | The query parameters used in running the generation of the Trial Balance.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve trial balance. Defaults to returning the latest version              of each transaction if not specified.
    String filter = "filter_example"; // String | \"Expression to filter the result set.\"
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing Trial balance from a previous call to Trial balance.
    try {
      VersionedResourceListOfTrialBalance result = apiInstance.getTrialBalance(scope, code, trialBalanceQueryParameters, asAt, filter, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborApi#getTrialBalance");
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
| **scope** | **String**| The scope of the Abor. | |
| **code** | **String**| The code of the Abor. Together with the scope is the unique identifier for the given Abor. | |
| **trialBalanceQueryParameters** | [**TrialBalanceQueryParameters**](TrialBalanceQueryParameters.md)| The query parameters used in running the generation of the Trial Balance. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve trial balance. Defaults to returning the latest version              of each transaction if not specified. | [optional] |
| **filter** | **String**| \&quot;Expression to filter the result set.\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Trial balance from a previous call to Trial balance. | [optional] |

### Return type

[**VersionedResourceListOfTrialBalance**](VersionedResourceListOfTrialBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Trial Balance for the specified Abor. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listAbors"></a>
# **listAbors**
> PagedResourceListOfAbor listAbors(effectiveAt, asAt, page, start, limit, filter, propertyKeys)

[EXPERIMENTAL] ListAbors: List Abors.

List all the Abors matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborApi apiInstance = new AborApi(defaultClient);
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the TimeVariant properties for the Abor. Defaults to the current LUSID              system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Abor. Defaults to returning the latest version of each Abor if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing Abor; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.              For example, to filter on the Abor type, specify \"id.Code eq 'Abor1'\". For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Abor' domain to decorate onto each Abor.              These must take the format {domain}/{scope}/{code}, for example 'Abor/Manager/Id'.
    try {
      PagedResourceListOfAbor result = apiInstance.listAbors(effectiveAt, asAt, page, start, limit, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborApi#listAbors");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the TimeVariant properties for the Abor. Defaults to the current LUSID              system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Abor. Defaults to returning the latest version of each Abor if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Abor; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.              For example, to filter on the Abor type, specify \&quot;id.Code eq &#39;Abor1&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Abor&#39; domain to decorate onto each Abor.              These must take the format {domain}/{scope}/{code}, for example &#39;Abor/Manager/Id&#39;. | [optional] |

### Return type

[**PagedResourceListOfAbor**](PagedResourceListOfAbor.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested abors. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listDiaryEntries"></a>
# **listDiaryEntries**
> PagedResourceListOfDiaryEntry listDiaryEntries(scope, code, effectiveAt, asAt, page, limit, filter, propertyKeys)

[EXPERIMENTAL] ListDiaryEntries: List diary entries.

List all the diary entries matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborApi apiInstance = new AborApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Abor.
    String code = "code_example"; // String | The code of the Abor.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the TimeVariant properties for the Diary Entries. Defaults to the current LUSID              system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the DiaryEntry. Defaults to returning the latest version of each DiaryEntry if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing diary entries; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.              For example, to filter on the DiaryEntry type, specify \"type eq 'PeriodBoundary'\". For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'DiaryEntry' domain to decorate onto each DiaryEntry.              These must take the format {domain}/{scope}/{code}, for example 'DiaryEntry/Report/Id'.
    try {
      PagedResourceListOfDiaryEntry result = apiInstance.listDiaryEntries(scope, code, effectiveAt, asAt, page, limit, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborApi#listDiaryEntries");
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
| **scope** | **String**| The scope of the Abor. | |
| **code** | **String**| The code of the Abor. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the TimeVariant properties for the Diary Entries. Defaults to the current LUSID              system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the DiaryEntry. Defaults to returning the latest version of each DiaryEntry if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing diary entries; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.              For example, to filter on the DiaryEntry type, specify \&quot;type eq &#39;PeriodBoundary&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;DiaryEntry&#39; domain to decorate onto each DiaryEntry.              These must take the format {domain}/{scope}/{code}, for example &#39;DiaryEntry/Report/Id&#39;. | [optional] |

### Return type

[**PagedResourceListOfDiaryEntry**](PagedResourceListOfDiaryEntry.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested diary entries. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertAborProperties"></a>
# **upsertAborProperties**
> AborProperties upsertAborProperties(scope, code, requestBody)

[EXPERIMENTAL] UpsertAborProperties: Upsert Abor properties

Update or insert one or more properties onto a single Abor. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;Abor&#39;.                Upserting a property that exists for an Abor, with a null value, will delete the instance of the property for that group.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborApi apiInstance = new AborApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Abor to update or insert the properties onto.
    String code = "code_example"; // String | The code of the Abor to update or insert the properties onto. Together with the scope this uniquely identifies the Abor.
    Map<String, Property> requestBody = new HashMap(); // Map<String, Property> | The properties to be updated or inserted onto the Abor. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \"Abor/Manager/Id\".
    try {
      AborProperties result = apiInstance.upsertAborProperties(scope, code, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborApi#upsertAborProperties");
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
| **scope** | **String**| The scope of the Abor to update or insert the properties onto. | |
| **code** | **String**| The code of the Abor to update or insert the properties onto. Together with the scope this uniquely identifies the Abor. | |
| **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be updated or inserted onto the Abor. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;Abor/Manager/Id\&quot;. | [optional] |

### Return type

[**AborProperties**](AborProperties.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated or inserted properties |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

