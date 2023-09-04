# QuotesApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteQuoteAccessMetadataRule**](QuotesApi.md#deleteQuoteAccessMetadataRule) | **DELETE** /api/metadata/quotes/rules/{scope} | [EXPERIMENTAL] DeleteQuoteAccessMetadataRule: Delete a Quote Access Metadata Rule |
| [**deleteQuotes**](QuotesApi.md#deleteQuotes) | **POST** /api/quotes/{scope}/$delete | DeleteQuotes: Delete quotes |
| [**getQuotes**](QuotesApi.md#getQuotes) | **POST** /api/quotes/{scope}/$get | [EARLY ACCESS] GetQuotes: Get quotes |
| [**getQuotesAccessMetadataRule**](QuotesApi.md#getQuotesAccessMetadataRule) | **GET** /api/metadata/quotes/rules | [EXPERIMENTAL] GetQuotesAccessMetadataRule: Get a quote access metadata rule |
| [**listQuotes**](QuotesApi.md#listQuotes) | **GET** /api/quotes/{scope}/$deprecated | [DEPRECATED] ListQuotes: List quotes |
| [**listQuotesAccessMetadataRules**](QuotesApi.md#listQuotesAccessMetadataRules) | **GET** /api/metadata/quotes/rules/{scope} | [EXPERIMENTAL] ListQuotesAccessMetadataRules: List all quote access metadata rules in a scope |
| [**listQuotesForScope**](QuotesApi.md#listQuotesForScope) | **GET** /api/quotes/{scope} | ListQuotesForScope: List quotes for scope |
| [**upsertQuoteAccessMetadataRule**](QuotesApi.md#upsertQuoteAccessMetadataRule) | **POST** /api/metadata/quotes/rules/{scope} | [EXPERIMENTAL] UpsertQuoteAccessMetadataRule: Upsert a Quote Access Metadata Rule. This creates or updates the data in LUSID. |
| [**upsertQuotes**](QuotesApi.md#upsertQuotes) | **POST** /api/quotes/{scope} | UpsertQuotes: Upsert quotes |


<a id="deleteQuoteAccessMetadataRule"></a>
# **deleteQuoteAccessMetadataRule**
> QuoteAccessMetadataRule deleteQuoteAccessMetadataRule(scope, provider, priceSource, instrumentIdType, instrumentId, quoteType, field, effectiveAt)

[EXPERIMENTAL] DeleteQuoteAccessMetadataRule: Delete a Quote Access Metadata Rule

Delete the Quote Access Metadata Rule that exactly matches the provided identifier parts

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Quote Access Metadata Rule to retrieve.
    String provider = "provider_example"; // String | The Provider of the rule
    String priceSource = "priceSource_example"; // String | The PriceSource of the rule
    String instrumentIdType = "instrumentIdType_example"; // String | The InstrumentIdType of the rule
    String instrumentId = "instrumentId_example"; // String | The InstrumentId of the rule
    String quoteType = "quoteType_example"; // String | The QuoteType of the rule
    String field = "field_example"; // String | The Field of the rule
    String effectiveAt = "effectiveAt_example"; // String | The effective date to delete at, if this is not supplied, it will delete all data found
    try {
      QuoteAccessMetadataRule result = apiInstance.deleteQuoteAccessMetadataRule(scope, provider, priceSource, instrumentIdType, instrumentId, quoteType, field, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#deleteQuoteAccessMetadataRule");
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
| **scope** | **String**| The scope of the Quote Access Metadata Rule to retrieve. | |
| **provider** | **String**| The Provider of the rule | [optional] |
| **priceSource** | **String**| The PriceSource of the rule | [optional] |
| **instrumentIdType** | **String**| The InstrumentIdType of the rule | [optional] |
| **instrumentId** | **String**| The InstrumentId of the rule | [optional] |
| **quoteType** | **String**| The QuoteType of the rule | [optional] |
| **field** | **String**| The Field of the rule | [optional] |
| **effectiveAt** | **String**| The effective date to delete at, if this is not supplied, it will delete all data found | [optional] |

### Return type

[**QuoteAccessMetadataRule**](QuoteAccessMetadataRule.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The rule that has been deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteQuotes"></a>
# **deleteQuotes**
> AnnulQuotesResponse deleteQuotes(scope, requestBody)

DeleteQuotes: Delete quotes

Delete one or more specified quotes from a single scope. A quote is identified by its unique id which includes information about  the type of quote as well as the exact effective datetime (to the microsecond) from which it became valid.                In the request each quote must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each quote in the response.                The response will return both the collection of successfully deleted quotes, as well as those that failed.  For the failures a reason will be provided explaining why the quote could not be deleted.                It is important to always check the failed set for any unsuccessful results.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the quotes to delete.
    Map<String, QuoteId> requestBody = new HashMap(); // Map<String, QuoteId> | The quotes to delete keyed by a unique correlation id.
    try {
      AnnulQuotesResponse result = apiInstance.deleteQuotes(scope, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#deleteQuotes");
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
| **scope** | **String**| The scope of the quotes to delete. | |
| **requestBody** | [**Map&lt;String, QuoteId&gt;**](QuoteId.md)| The quotes to delete keyed by a unique correlation id. | [optional] |

### Return type

[**AnnulQuotesResponse**](AnnulQuotesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully deleted quotes along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getQuotes"></a>
# **getQuotes**
> GetQuotesResponse getQuotes(scope, effectiveAt, asAt, maxAge, requestBody)

[EARLY ACCESS] GetQuotes: Get quotes

Get one or more quotes from a single scope.                Each quote can be identified by its time invariant quote series id.                For each quote series id LUSID will return the most recent quote with respect to the provided (or default) effective datetime.                 An optional maximum age range window can be specified which defines how far back to look back for a quote from the specified effective datetime.  LUSID will return the most recent quote within this window.                In the request each quote series id must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each quote in the response.                The response will return three collections. One, the successfully retrieved quotes. Two, those that had a  valid quote series id but could not be found. Three, those that failed because LUSID could not construct a valid quote series id from the request.    For the quotes that failed or could not be found a reason will be provided explaining why the quote could not be retrieved.                It is important to always check the failed and not found sets for any unsuccessful results.  The maximum number of quotes that this method can get per request is 2,000.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the quotes to retrieve.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the quotes. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the quotes. Defaults to return the latest version of each quote if not specified.
    String maxAge = "maxAge_example"; // String | The duration of the look back window in an ISO8601 time interval format e.g. P1Y2M3DT4H30M (1 year, 2 months, 3 days, 4 hours and 30 minutes).               This is subtracted from the provided effectiveAt datetime or cut label to generate a effective datetime window inside which a quote must exist to be retrieved.
    Map<String, QuoteSeriesId> requestBody = new HashMap(); // Map<String, QuoteSeriesId> | The time invariant quote series ids of the quotes to retrieve. These need to be               keyed by a unique correlation id allowing the retrieved quote to be identified in the response.
    try {
      GetQuotesResponse result = apiInstance.getQuotes(scope, effectiveAt, asAt, maxAge, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#getQuotes");
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
| **scope** | **String**| The scope of the quotes to retrieve. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the quotes. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the quotes. Defaults to return the latest version of each quote if not specified. | [optional] |
| **maxAge** | **String**| The duration of the look back window in an ISO8601 time interval format e.g. P1Y2M3DT4H30M (1 year, 2 months, 3 days, 4 hours and 30 minutes).               This is subtracted from the provided effectiveAt datetime or cut label to generate a effective datetime window inside which a quote must exist to be retrieved. | [optional] |
| **requestBody** | [**Map&lt;String, QuoteSeriesId&gt;**](QuoteSeriesId.md)| The time invariant quote series ids of the quotes to retrieve. These need to be               keyed by a unique correlation id allowing the retrieved quote to be identified in the response. | [optional] |

### Return type

[**GetQuotesResponse**](GetQuotesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved quotes along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getQuotesAccessMetadataRule"></a>
# **getQuotesAccessMetadataRule**
> QuoteAccessMetadataRule getQuotesAccessMetadataRule(scope, provider, priceSource, instrumentIdType, instrumentId, quoteType, field, effectiveAt, asAt)

[EXPERIMENTAL] GetQuotesAccessMetadataRule: Get a quote access metadata rule

Get a specific quote access metadata rule by specifying the corresponding identifier parts                No matching will be performed through this endpoint. To retrieve a rule, it is necessary to specify, exactly, the identifier of the rule

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Quote Access Metadata Rule to retrieve.
    String provider = "provider_example"; // String | The Provider of the rule
    String priceSource = "priceSource_example"; // String | The PriceSource of the rule
    String instrumentIdType = "instrumentIdType_example"; // String | The InstrumentIdType of the rule
    String instrumentId = "instrumentId_example"; // String | The InstrumentId of the rule
    String quoteType = "quoteType_example"; // String | The QuoteType of the rule
    String field = "field_example"; // String | The Field of the rule
    String effectiveAt = "effectiveAt_example"; // String | The effective date of the rule
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the access metadata rule. Defaults to return the latest version if not specified.
    try {
      QuoteAccessMetadataRule result = apiInstance.getQuotesAccessMetadataRule(scope, provider, priceSource, instrumentIdType, instrumentId, quoteType, field, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#getQuotesAccessMetadataRule");
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
| **scope** | **String**| The scope of the Quote Access Metadata Rule to retrieve. | |
| **provider** | **String**| The Provider of the rule | [optional] |
| **priceSource** | **String**| The PriceSource of the rule | [optional] |
| **instrumentIdType** | **String**| The InstrumentIdType of the rule | [optional] |
| **instrumentId** | **String**| The InstrumentId of the rule | [optional] |
| **quoteType** | **String**| The QuoteType of the rule | [optional] |
| **field** | **String**| The Field of the rule | [optional] |
| **effectiveAt** | **String**| The effective date of the rule | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the access metadata rule. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**QuoteAccessMetadataRule**](QuoteAccessMetadataRule.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Quote Access Metadata Rule or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listQuotes"></a>
# **listQuotes**
> ResourceListOfQuote listQuotes(scope, asAt, page, start, limit, filter)

[DEPRECATED] ListQuotes: List quotes

List all the quotes from a single scope at the specified date/time  Please use M:Finbourne.WebApi.Controllers.QuotesController.ListQuotesForScope(System.String,System.Nullable{System.DateTimeOffset},System.String,System.Nullable{System.Int32},System.Nullable{System.Int32},System.String) - the signature and behaviour of this endpoint will be changing to omit scope

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the quotes to list.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the quotes. Defaults to latest if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing quotes from a previous call to list quotes.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      ResourceListOfQuote result = apiInstance.listQuotes(scope, asAt, page, start, limit, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#listQuotes");
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
| **scope** | **String**| The scope of the quotes to list. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the quotes. Defaults to latest if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing quotes from a previous call to list quotes.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**ResourceListOfQuote**](ResourceListOfQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested quotes |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listQuotesAccessMetadataRules"></a>
# **listQuotesAccessMetadataRules**
> ResourceListOfQuoteAccessMetadataRule listQuotesAccessMetadataRules(scope, asAt)

[EXPERIMENTAL] ListQuotesAccessMetadataRules: List all quote access metadata rules in a scope

Get all the quote access metadata rules in the specified scope

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Quote Access Metadata Rule to retrieve.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the access metadata rule. Defaults to return the latest version if not specified.
    try {
      ResourceListOfQuoteAccessMetadataRule result = apiInstance.listQuotesAccessMetadataRules(scope, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#listQuotesAccessMetadataRules");
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
| **scope** | **String**| The scope of the Quote Access Metadata Rule to retrieve. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the access metadata rule. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**ResourceListOfQuoteAccessMetadataRule**](ResourceListOfQuoteAccessMetadataRule.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The filtered list of results |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listQuotesForScope"></a>
# **listQuotesForScope**
> ResourceListOfQuote listQuotesForScope(scope, asAt, page, start, limit, filter)

ListQuotesForScope: List quotes for scope

List all the quotes from a single scope at the specified date/time

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the quotes to list.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the quotes. Defaults to latest if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing quotes from a previous call to list quotes.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      ResourceListOfQuote result = apiInstance.listQuotesForScope(scope, asAt, page, start, limit, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#listQuotesForScope");
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
| **scope** | **String**| The scope of the quotes to list. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the quotes. Defaults to latest if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing quotes from a previous call to list quotes.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**ResourceListOfQuote**](ResourceListOfQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested quotes |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertQuoteAccessMetadataRule"></a>
# **upsertQuoteAccessMetadataRule**
> QuoteAccessMetadataRule upsertQuoteAccessMetadataRule(scope, upsertQuoteAccessMetadataRuleRequest, effectiveAt, effectiveUntil)

[EXPERIMENTAL] UpsertQuoteAccessMetadataRule: Upsert a Quote Access Metadata Rule. This creates or updates the data in LUSID.

Update or insert one Quote Access Metadata Rule in a single scope. An item will be updated if it already exists  and inserted if it does not.    The response will return the successfully updated or inserted Quote Access Metadata Rule or failure message if unsuccessful    It is important to always check to verify success (or failure).                Multiple rules for a key can exists with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    String scope = "scope_example"; // String | The scope to use when updating or inserting the Quote Access Metadata Rule.
    UpsertQuoteAccessMetadataRuleRequest upsertQuoteAccessMetadataRuleRequest = new UpsertQuoteAccessMetadataRuleRequest(); // UpsertQuoteAccessMetadataRuleRequest | The Quote Access Metadata Rule to update or insert
    String effectiveAt = "effectiveAt_example"; // String | The date this rule will effective from
    OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' date of the Access Metadata
    try {
      QuoteAccessMetadataRule result = apiInstance.upsertQuoteAccessMetadataRule(scope, upsertQuoteAccessMetadataRuleRequest, effectiveAt, effectiveUntil);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#upsertQuoteAccessMetadataRule");
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
| **scope** | **String**| The scope to use when updating or inserting the Quote Access Metadata Rule. | |
| **upsertQuoteAccessMetadataRuleRequest** | [**UpsertQuoteAccessMetadataRuleRequest**](UpsertQuoteAccessMetadataRuleRequest.md)| The Quote Access Metadata Rule to update or insert | |
| **effectiveAt** | **String**| The date this rule will effective from | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata | [optional] |

### Return type

[**QuoteAccessMetadataRule**](QuoteAccessMetadataRule.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted item or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertQuotes"></a>
# **upsertQuotes**
> UpsertQuotesResponse upsertQuotes(scope, requestBody)

UpsertQuotes: Upsert quotes

Update or insert one or more quotes in a single scope. A quote will be updated if it already exists  and inserted if it does not.                In the request each quote must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each quote in the response.                The response will return both the collection of successfully updated or inserted quotes, as well as those that failed.  For the failures a reason will be provided explaining why the quote could not be updated or inserted.                It is important to always check the failed set for any unsuccessful results.  The maximum number of quotes that this method can upsert per request is 2,000.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.QuotesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    QuotesApi apiInstance = new QuotesApi(defaultClient);
    String scope = "scope_example"; // String | The scope to use when updating or inserting the quotes.
    Map<String, UpsertQuoteRequest> requestBody = new HashMap(); // Map<String, UpsertQuoteRequest> | The quotes to update or insert keyed by a unique correlation id.
    try {
      UpsertQuotesResponse result = apiInstance.upsertQuotes(scope, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesApi#upsertQuotes");
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
| **scope** | **String**| The scope to use when updating or inserting the quotes. | |
| **requestBody** | [**Map&lt;String, UpsertQuoteRequest&gt;**](UpsertQuoteRequest.md)| The quotes to update or insert keyed by a unique correlation id. | [optional] |

### Return type

[**UpsertQuotesResponse**](UpsertQuotesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted quotes along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

