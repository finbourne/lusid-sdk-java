# InstrumentsApi

All URIs are relative to *http://local-unit-test-server.lusid.com:60782*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInstrument**](InstrumentsApi.md#deleteInstrument) | **DELETE** /api/instruments/{identifierType}/{identifier} | [EARLY ACCESS] Delete instrument
[**getInstrument**](InstrumentsApi.md#getInstrument) | **GET** /api/instruments/{identifierType}/{identifier} | Get instrument
[**getInstrumentIdentifierTypes**](InstrumentsApi.md#getInstrumentIdentifierTypes) | **GET** /api/instruments/identifierTypes | [EARLY ACCESS] Get instrument identifier types
[**getInstrumentPropertyTimeSeries**](InstrumentsApi.md#getInstrumentPropertyTimeSeries) | **GET** /api/instruments/{identifierType}/{identifier}/properties/time-series | [EARLY ACCESS] Get instrument property time series
[**getInstruments**](InstrumentsApi.md#getInstruments) | **POST** /api/instruments/$get | Get instruments
[**listInstruments**](InstrumentsApi.md#listInstruments) | **GET** /api/instruments | [EARLY ACCESS] List instruments
[**updateInstrumentIdentifier**](InstrumentsApi.md#updateInstrumentIdentifier) | **POST** /api/instruments/{identifierType}/{identifier} | [EARLY ACCESS] Update instrument identifier
[**upsertInstruments**](InstrumentsApi.md#upsertInstruments) | **POST** /api/instruments | Upsert instruments
[**upsertInstrumentsProperties**](InstrumentsApi.md#upsertInstrumentsProperties) | **POST** /api/instruments/$upsertproperties | Upsert instruments properties


<a name="deleteInstrument"></a>
# **deleteInstrument**
> DeleteInstrumentResponse deleteInstrument(identifierType, identifier)

[EARLY ACCESS] Delete instrument

Delete a particular instrument, as identified by a particular instrument identifier.                Once deleted, an instrument is marked as inactive and can no longer be referenced when creating or updating  transactions or holdings. You can still query existing transactions and holdings related to the  deleted instrument.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:60782");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | The unique identifier type to search, for example 'Figi'.
    String identifier = "identifier_example"; // String | An <i>identifierType</i> value to use to identify the instrument, for example 'BBG000BLNNV0'.
    try {
      DeleteInstrumentResponse result = apiInstance.deleteInstrument(identifierType, identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#deleteInstrument");
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
 **identifierType** | **String**| The unique identifier type to search, for example &#39;Figi&#39;. |
 **identifier** | **String**| An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. |

### Return type

[**DeleteInstrumentResponse**](DeleteInstrumentResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The datetime that the instrument was deleted |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getInstrument"></a>
# **getInstrument**
> Instrument getInstrument(identifierType, identifier, effectiveAt, asAt, propertyKeys)

Get instrument

Retrieve the definition of a particular instrument, as identified by a particular unique identifier.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:60782");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | The unique identifier type to use, for example 'Figi'.
    String identifier = "identifier_example"; // String | An <i>identifierType</i> value to use to identify the instrument, for example 'BBG000BLNNV0'.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the instrument.              Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the instrument. Defaults to              returning the latest version if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Instrument' domain to decorate onto the instrument.              These must have the format {domain}/{scope}/{code}, for example 'Instrument/system/Name'.
    try {
      Instrument result = apiInstance.getInstrument(identifierType, identifier, effectiveAt, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#getInstrument");
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
 **identifierType** | **String**| The unique identifier type to use, for example &#39;Figi&#39;. |
 **identifier** | **String**| An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the instrument.              Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instrument. Defaults to              returning the latest version if not specified. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instrument&#39; domain to decorate onto the instrument.              These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. | [optional]

### Return type

[**Instrument**](Instrument.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested instrument. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getInstrumentIdentifierTypes"></a>
# **getInstrumentIdentifierTypes**
> ResourceListOfInstrumentIdTypeDescriptor getInstrumentIdentifierTypes()

[EARLY ACCESS] Get instrument identifier types

Retrieve a list of all valid instrument identifier types and whether they are unique or not.                An instrument must have a value for at least one unique identifier type (it can have more than one unique type and value).  In addition, a value is automatically generated for a LUSID Instrument ID (LUID) unique type by the system.                An instrument can have values for multiple non-unique identifier types (or it can have zero non-unique types and values).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:60782");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    try {
      ResourceListOfInstrumentIdTypeDescriptor result = apiInstance.getInstrumentIdentifierTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#getInstrumentIdentifierTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResourceListOfInstrumentIdTypeDescriptor**](ResourceListOfInstrumentIdTypeDescriptor.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of valid instrument identifier types. |  -  |
**0** | Error response |  -  |

<a name="getInstrumentPropertyTimeSeries"></a>
# **getInstrumentPropertyTimeSeries**
> ResourceListOfPropertyInterval getInstrumentPropertyTimeSeries(identifierType, identifier, propertyKey, identifierEffectiveAt, asAt, filter, page, limit)

[EARLY ACCESS] Get instrument property time series

Retrieve the complete time series (history) for a particular property of an instrument.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:60782");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | The unique identifier type to search, for example 'Figi'.
    String identifier = "identifier_example"; // String | An <i>identifierType</i> value to use to identify the instrument, for example 'BBG000BLNNV0'.
    String propertyKey = "propertyKey_example"; // String | The property key of a property from the 'Instrument' domain whose history to retrieve.              This must have the format {domain}/{scope}/{code}, for example 'Instrument/system/Name'.
    String identifierEffectiveAt = "identifierEffectiveAt_example"; // String | The effective datetime used to resolve the instrument from the identifier.              Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the instrument's property history. Defaults to              returning the current datetime if not supplied.
    String filter = "filter_example"; // String | Expression to filter the results. For more information about filtering,              see https://support.lusid.com/knowledgebase/article/KA-01914.
    String page = "page_example"; // String | The pagination token to use to continue listing properties; this value is returned from              the previous call. If a pagination token is provided, the <i>filter</i>, <i>effectiveAt</i> and              <i>asAt</i> fields must not have changed since the original request. For more information, see              https://support.lusid.com/knowledgebase/article/KA-01915.
    Integer limit = 56; // Integer | When paginating, limit the results to this number.
    try {
      ResourceListOfPropertyInterval result = apiInstance.getInstrumentPropertyTimeSeries(identifierType, identifier, propertyKey, identifierEffectiveAt, asAt, filter, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#getInstrumentPropertyTimeSeries");
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
 **identifierType** | **String**| The unique identifier type to search, for example &#39;Figi&#39;. |
 **identifier** | **String**| An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. |
 **propertyKey** | **String**| The property key of a property from the &#39;Instrument&#39; domain whose history to retrieve.              This must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. | [optional]
 **identifierEffectiveAt** | **String**| The effective datetime used to resolve the instrument from the identifier.              Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instrument&#39;s property history. Defaults to              returning the current datetime if not supplied. | [optional]
 **filter** | **String**| Expression to filter the results. For more information about filtering,              see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional]
 **page** | **String**| The pagination token to use to continue listing properties; this value is returned from              the previous call. If a pagination token is provided, the &lt;i&gt;filter&lt;/i&gt;, &lt;i&gt;effectiveAt&lt;/i&gt; and              &lt;i&gt;asAt&lt;/i&gt; fields must not have changed since the original request. For more information, see              https://support.lusid.com/knowledgebase/article/KA-01915. | [optional]
 **limit** | **Integer**| When paginating, limit the results to this number. | [optional]

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
**200** | The time series of the property |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getInstruments"></a>
# **getInstruments**
> GetInstrumentsResponse getInstruments(identifierType, requestBody, effectiveAt, asAt, propertyKeys)

Get instruments

Retrieve the definition of one or more instruments, as identified by a collection of unique identifiers.                Note that to retrieve all the instruments in the instrument master, use the List instruments endpoint instead.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:60782");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | The unique identifier type to use, for example 'Figi'.
    List<String> requestBody = ["instrument-identifier-1","instrument-identifier-2"]; // List<String> | A list of one or more <i>identifierType</i> values to use to identify instruments.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the instrument definitions.               Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the instrument definitions.               Defaults to returning the latest version of each instrument definition if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Instrument' domain to decorate onto the instrument.               These must have the format {domain}/{scope}/{code}, for example 'Instrument/system/Name'.
    try {
      GetInstrumentsResponse result = apiInstance.getInstruments(identifierType, requestBody, effectiveAt, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#getInstruments");
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
 **identifierType** | **String**| The unique identifier type to use, for example &#39;Figi&#39;. |
 **requestBody** | [**List&lt;String&gt;**](String.md)| A list of one or more &lt;i&gt;identifierType&lt;/i&gt; values to use to identify instruments. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the instrument definitions.               Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instrument definitions.               Defaults to returning the latest version of each instrument definition if not specified. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instrument&#39; domain to decorate onto the instrument.               These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. | [optional]

### Return type

[**GetInstrumentsResponse**](GetInstrumentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested instruments which could be identified along with any failures |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listInstruments"></a>
# **listInstruments**
> PagedResourceListOfInstrument listInstruments(asAt, effectiveAt, page, sortBy, start, limit, filter, instrumentPropertyKeys)

[EARLY ACCESS] List instruments

List all the instruments in the instrument master.                To retrieve a particular set of instruments instead, use the Get instruments endpoint.  The maximum number of instruments that this method can list per request is 2,000.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:60782");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to list instruments. Defaults to returning the latest               version of each instrument if not specified.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list instruments.               Defaults to the current LUSID system datetime if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing instruments; this value is returned from               the previous call. If a pagination token is provided, the <i>sortBy</i>, <i>filter</i>, <i>effectiveAt</i> and               <i>asAt</i> fields must not have changed since the original request. Also, a <i>start</i> value cannot be               provided. For more information, see https://support.lusid.com/knowledgebase/article/KA-01915.
    List<String> sortBy = Arrays.asList(); // List<String> | Order results by particular fields. Use the '-' sign to denote descending order, for               example '-MyFieldName'.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the results to this number.
    String filter = "\"State eq 'Active'\""; // String | Expression to filter the result set. Defaults to filtering out inactive instruments               (that is, those that have been deleted). For more information about filtering results,               see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> instrumentPropertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Instrument' domain to decorate onto               instruments. These must have the format {domain}/{scope}/{code}, for example 'Instrument/system/Name'.
    try {
      PagedResourceListOfInstrument result = apiInstance.listInstruments(asAt, effectiveAt, page, sortBy, start, limit, filter, instrumentPropertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#listInstruments");
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
 **asAt** | **OffsetDateTime**| The asAt datetime at which to list instruments. Defaults to returning the latest               version of each instrument if not specified. | [optional]
 **effectiveAt** | **String**| The effective datetime or cut label at which to list instruments.               Defaults to the current LUSID system datetime if not specified. | [optional]
 **page** | **String**| The pagination token to use to continue listing instruments; this value is returned from               the previous call. If a pagination token is provided, the &lt;i&gt;sortBy&lt;/i&gt;, &lt;i&gt;filter&lt;/i&gt;, &lt;i&gt;effectiveAt&lt;/i&gt; and               &lt;i&gt;asAt&lt;/i&gt; fields must not have changed since the original request. Also, a &lt;i&gt;start&lt;/i&gt; value cannot be               provided. For more information, see https://support.lusid.com/knowledgebase/article/KA-01915. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Order results by particular fields. Use the &#39;-&#39; sign to denote descending order, for               example &#39;-MyFieldName&#39;. | [optional]
 **start** | **Integer**| When paginating, skip this number of results. | [optional]
 **limit** | **Integer**| When paginating, limit the results to this number. | [optional]
 **filter** | **String**| Expression to filter the result set. Defaults to filtering out inactive instruments               (that is, those that have been deleted). For more information about filtering results,               see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] [default to &quot;State eq &#39;Active&#39;&quot;]
 **instrumentPropertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instrument&#39; domain to decorate onto               instruments. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. | [optional]

### Return type

[**PagedResourceListOfInstrument**](PagedResourceListOfInstrument.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested instruments |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="updateInstrumentIdentifier"></a>
# **updateInstrumentIdentifier**
> Instrument updateInstrumentIdentifier(identifierType, identifier, updateInstrumentIdentifierRequest)

[EARLY ACCESS] Update instrument identifier

Create, update or delete a particular instrument identifier for an instrument.                To delete the identifier, leave the value unspecified in the request. If not being deleted, the  identifier is updated if it exists and created if it does not.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:60782");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | The unique identifier type to search, for example 'Figi'.
    String identifier = "identifier_example"; // String | An <i>identifierType</i> value to use to identify the instrument, for example 'BBG000BLNNV0'.
    UpdateInstrumentIdentifierRequest updateInstrumentIdentifierRequest = {"type":"Figi","value":"updated-figi","effectiveAt":"2018-02-01T10:00:00.0000000+00:00"}; // UpdateInstrumentIdentifierRequest | The identifier to update or delete. This need not be the same value as the               'identifier' parameter used to retrieve the instrument.
    try {
      Instrument result = apiInstance.updateInstrumentIdentifier(identifierType, identifier, updateInstrumentIdentifierRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#updateInstrumentIdentifier");
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
 **identifierType** | **String**| The unique identifier type to search, for example &#39;Figi&#39;. |
 **identifier** | **String**| An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. |
 **updateInstrumentIdentifierRequest** | [**UpdateInstrumentIdentifierRequest**](UpdateInstrumentIdentifierRequest.md)| The identifier to update or delete. This need not be the same value as the               &#39;identifier&#39; parameter used to retrieve the instrument. |

### Return type

[**Instrument**](Instrument.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The updated instrument definition with the identifier created, updated or deleted |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertInstruments"></a>
# **upsertInstruments**
> UpsertInstrumentsResponse upsertInstruments(requestBody)

Upsert instruments

Create or update one or more instruments in the instrument master. An instrument is updated  if it already exists and created if it does not.                In the request, each instrument definition should be keyed by a unique correlation ID. This ID is ephemeral  and not stored by LUSID. It serves only to easily identify each instrument in the response.                Note that an instrument must have at least one unique identifier, which is a combination of a type  (such as &#39;Figi&#39;) and a value (such as &#39;BBG000BS1N49&#39;). In addition, a random value is automatically  generated for a LUSID Instrument ID (LUID) unique type by the system. For more information, see  https://support.lusid.com/knowledgebase/article/KA-01862.                The response returns both the collection of successfully created or updated instruments, as well as those  that failed. For each failure, a reason is provided. It is important to check the failed set for  unsuccessful results.  The maximum number of instruments that this method can upsert per request is 2,000.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:60782");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    Map<String, InstrumentDefinition> requestBody = {"request_id_1":{"name":"Instrument name","identifiers":{"clientInternal":{"value":"some-identifier","effectiveAt":"0001-01-01T00:00:00.0000000+00:00"},"figi":{"value":"some-figi-code","effectiveAt":"0001-01-01T00:00:00.0000000+00:00"},"isin":{"value":"some-isin-code","effectiveAt":"0001-01-01T00:00:00.0000000+00:00"}},"properties":[{"key":"Instrument/someScope/somePropertyName","value":{"labelValue":"some-property-value"},"effectiveFrom":"2018-06-18T09:00:00.0000000+00:00"}],"lookThroughPortfolioId":{"scope":"MyScope","code":"portfolio-code"},"definition":{"instrumentFormat":{"sourceSystem":"systemA","vendor":"Unknown","version":"1.0.0"},"content":"{\"some-key\": \"some-value\"}","instrumentType":"ExoticInstrument"}},"request_id_2":{"name":"Instrument name","identifiers":{"clientInternal":{"value":"some-identifier-2","effectiveAt":"0001-01-01T00:00:00.0000000+00:00"},"figi":{"value":"some-figi-code-2","effectiveAt":"0001-01-01T00:00:00.0000000+00:00"}},"properties":[],"lookThroughPortfolioId":{"scope":"MyScope","code":"portfolio-code"},"definition":{"instrumentFormat":{"sourceSystem":"systemA","vendor":"Unknown","version":"1.0.0"},"content":"{\"some-key\": \"some-value\"}","instrumentType":"ExoticInstrument"}}}; // Map<String, InstrumentDefinition> | The definitions of the instruments to create or update.
    try {
      UpsertInstrumentsResponse result = apiInstance.upsertInstruments(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#upsertInstruments");
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
 **requestBody** | [**Map&lt;String, InstrumentDefinition&gt;**](InstrumentDefinition.md)| The definitions of the instruments to create or update. |

### Return type

[**UpsertInstrumentsResponse**](UpsertInstrumentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The successfully created or updated instruments along with any failures |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertInstrumentsProperties"></a>
# **upsertInstrumentsProperties**
> UpsertInstrumentPropertiesResponse upsertInstrumentsProperties(upsertInstrumentPropertyRequest)

Upsert instruments properties

Create or update one or more properties for particular instruments.                Each instrument property is updated if it exists and created if it does not. For any failures, a reason  is provided.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime from which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:60782");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    List<UpsertInstrumentPropertyRequest> upsertInstrumentPropertyRequest = [{"identifierType":"LusidInstrumentId","identifier":"LUID_00000000","properties":[{"key":"Instrument/MyScope/SomePropertyName","value":{"labelValue":"SomeValue1"},"effectiveFrom":"2016-09-15T12:00:00.0000000+00:00"},{"key":"Instrument/MyScope/SomePropertyName","value":{"labelValue":"SomeValue2"},"effectiveFrom":"2017-08-10T12:00:00.0000000+00:00"},{"key":"Instrument/MyScope/AnotherPropertyName","value":{"labelValue":"AnotherValue1"},"effectiveFrom":"2018-03-05T12:00:00.0000000+00:00","effectiveUntil":"2019-06-01T12:00:00.0000000+00:00"},{"key":"Instrument/MyScope/AnotherPropertyName","value":{"labelValue":"AnotherValue2"},"effectiveFrom":"2020-03-15T12:00:00.0000000+00:00","effectiveUntil":"2021-01-15T12:00:00.0000000+00:00"}]}]; // List<UpsertInstrumentPropertyRequest> | A list of instruments and associated instrument properties to create or update.
    try {
      UpsertInstrumentPropertiesResponse result = apiInstance.upsertInstrumentsProperties(upsertInstrumentPropertyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#upsertInstrumentsProperties");
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
 **upsertInstrumentPropertyRequest** | [**List&lt;UpsertInstrumentPropertyRequest&gt;**](UpsertInstrumentPropertyRequest.md)| A list of instruments and associated instrument properties to create or update. |

### Return type

[**UpsertInstrumentPropertiesResponse**](UpsertInstrumentPropertiesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The asAt datetime at which the properties were created or updated. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

