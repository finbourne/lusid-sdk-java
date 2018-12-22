# InstrumentsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInstrument**](InstrumentsApi.md#deleteInstrument) | **DELETE** /api/instruments/{type}/{id} | Delete instrument
[**findInstruments**](InstrumentsApi.md#findInstruments) | **POST** /api/instruments/$find | Search instrument definition
[**getInstrument**](InstrumentsApi.md#getInstrument) | **GET** /api/instruments/{type}/{id} | Get instrument definition
[**getInstrumentIdentifiers**](InstrumentsApi.md#getInstrumentIdentifiers) | **GET** /api/instruments/identifiers | Get allowable instrument identifiers
[**getInstruments**](InstrumentsApi.md#getInstruments) | **POST** /api/instruments/$get | Get instrument definition
[**listInstruments**](InstrumentsApi.md#listInstruments) | **GET** /api/instruments | Get all of the currently mastered instruments in LUSID
[**matchInstruments**](InstrumentsApi.md#matchInstruments) | **POST** /api/instruments/$match | Find externally mastered instruments
[**updateInstrumentIdentifier**](InstrumentsApi.md#updateInstrumentIdentifier) | **POST** /api/instruments/{type}/{id} | Update instrument identifier
[**upsertInstruments**](InstrumentsApi.md#upsertInstruments) | **POST** /api/instruments | Upsert instruments
[**upsertInstrumentsProperties**](InstrumentsApi.md#upsertInstrumentsProperties) | **POST** /api/instruments/$upsertproperties | Upsert instrument properties


<a name="deleteInstrument"></a>
# **deleteInstrument**
> DeleteInstrumentResponse deleteInstrument(type, id)

Delete instrument

Attempt to delete one or more \&quot;client\&quot; instruments.    The response will include those instruments that could not be deleted (as well as any available details).                It is important to always check the &#39;Failed&#39; set for any unsuccessful results.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.InstrumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

InstrumentsApi apiInstance = new InstrumentsApi();
String type = "type_example"; // String | The type of identifier being supplied
String id = "id_example"; // String | The instrument identifier
try {
    DeleteInstrumentResponse result = apiInstance.deleteInstrument(type, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#deleteInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type of identifier being supplied | [enum: Undefined, LusidInstrumentId, ReutersAssetId, CINS, Isin, Sedol, Cusip, Ticker, ClientInternal, Figi, CompositeFigi, ShareClassFigi, Wertpapier, RIC, QuotePermId]
 **id** | **String**| The instrument identifier |

### Return type

[**DeleteInstrumentResponse**](DeleteInstrumentResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="findInstruments"></a>
# **findInstruments**
> ResourceListOfInstrument findInstruments(aliases, effectiveAt, asAt, instrumentPropertyKeys)

Search instrument definition

Get a collection of instruments by a set of identifiers. Optionally, it is possible to decorate each instrument with specified property data.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.InstrumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

InstrumentsApi apiInstance = new InstrumentsApi();
List<Property> aliases = Arrays.asList(new Property()); // List<Property> | The list of market aliases (e.g ISIN, Ticker) to find instruments by.
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the query
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the query
List<String> instrumentPropertyKeys = Arrays.asList("instrumentPropertyKeys_example"); // List<String> | Optional. Keys of the properties to be decorated on to the instrument
try {
    ResourceListOfInstrument result = apiInstance.findInstruments(aliases, effectiveAt, asAt, instrumentPropertyKeys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#findInstruments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aliases** | [**List&lt;Property&gt;**](Property.md)| The list of market aliases (e.g ISIN, Ticker) to find instruments by. | [optional]
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date of the query | [optional]
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the query | [optional]
 **instrumentPropertyKeys** | [**List&lt;String&gt;**](String.md)| Optional. Keys of the properties to be decorated on to the instrument | [optional]

### Return type

[**ResourceListOfInstrument**](ResourceListOfInstrument.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="getInstrument"></a>
# **getInstrument**
> Instrument getInstrument(type, id, effectiveAt, asAt, instrumentPropertyKeys)

Get instrument definition

Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.InstrumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

InstrumentsApi apiInstance = new InstrumentsApi();
String type = "type_example"; // String | The type of identifier being supplied
String id = "id_example"; // String | The identifier of the requested instrument
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the query
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the query
List<String> instrumentPropertyKeys = Arrays.asList("instrumentPropertyKeys_example"); // List<String> | Optional. Keys of the properties to be decorated on to the instrument
try {
    Instrument result = apiInstance.getInstrument(type, id, effectiveAt, asAt, instrumentPropertyKeys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#getInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type of identifier being supplied | [enum: Undefined, LusidInstrumentId, ReutersAssetId, CINS, Isin, Sedol, Cusip, Ticker, ClientInternal, Figi, CompositeFigi, ShareClassFigi, Wertpapier, RIC, QuotePermId]
 **id** | **String**| The identifier of the requested instrument |
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date of the query | [optional]
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the query | [optional]
 **instrumentPropertyKeys** | [**List&lt;String&gt;**](String.md)| Optional. Keys of the properties to be decorated on to the instrument | [optional]

### Return type

[**Instrument**](Instrument.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getInstrumentIdentifiers"></a>
# **getInstrumentIdentifiers**
> ResourceListOfCodeType getInstrumentIdentifiers()

Get allowable instrument identifiers

Gets the set of identifiers that have been configured as unique identifiers for instruments.     Only CodeTypes returned from this end point can be used as identifiers for instruments.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.InstrumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

InstrumentsApi apiInstance = new InstrumentsApi();
try {
    ResourceListOfCodeType result = apiInstance.getInstrumentIdentifiers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#getInstrumentIdentifiers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResourceListOfCodeType**](ResourceListOfCodeType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getInstruments"></a>
# **getInstruments**
> GetInstrumentsResponse getInstruments(codeType, codes, effectiveAt, asAt, instrumentPropertyKeys)

Get instrument definition

Get a collection of instruments by a set of identifiers. Optionally, it is possible to decorate each instrument with specified property data.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.InstrumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

InstrumentsApi apiInstance = new InstrumentsApi();
String codeType = "codeType_example"; // String | the type of codes being specified
List<String> codes = Arrays.asList(new List<String>()); // List<String> | The identifiers of the instruments to get
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the request
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The as at date of the request
List<String> instrumentPropertyKeys = Arrays.asList("instrumentPropertyKeys_example"); // List<String> | Optional. Keys of the properties to be decorated on to the instrument
try {
    GetInstrumentsResponse result = apiInstance.getInstruments(codeType, codes, effectiveAt, asAt, instrumentPropertyKeys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#getInstruments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeType** | **String**| the type of codes being specified | [optional] [enum: Undefined, LusidInstrumentId, ReutersAssetId, CINS, Isin, Sedol, Cusip, Ticker, ClientInternal, Figi, CompositeFigi, ShareClassFigi, Wertpapier, RIC, QuotePermId]
 **codes** | **List&lt;String&gt;**| The identifiers of the instruments to get | [optional]
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date of the request | [optional]
 **asAt** | **OffsetDateTime**| Optional. The as at date of the request | [optional]
 **instrumentPropertyKeys** | [**List&lt;String&gt;**](String.md)| Optional. Keys of the properties to be decorated on to the instrument | [optional]

### Return type

[**GetInstrumentsResponse**](GetInstrumentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="listInstruments"></a>
# **listInstruments**
> ResourceListOfInstrument listInstruments(asAt, sortBy, start, limit, filter)

Get all of the currently mastered instruments in LUSID

Lists all instruments that have been mastered within LUSID.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.InstrumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

InstrumentsApi apiInstance = new InstrumentsApi();
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The AsAt time
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
try {
    ResourceListOfInstrument result = apiInstance.listInstruments(asAt, sortBy, start, limit, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#listInstruments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asAt** | **OffsetDateTime**| The AsAt time | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

### Return type

[**ResourceListOfInstrument**](ResourceListOfInstrument.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="matchInstruments"></a>
# **matchInstruments**
> MatchInstrumentsResponse matchInstruments(codeType, codes)

Find externally mastered instruments

Search for a set of instruments from an external instrument mastering service

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.InstrumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

InstrumentsApi apiInstance = new InstrumentsApi();
String codeType = "codeType_example"; // String | The type of codes to search for
List<String> codes = Arrays.asList(new List<String>()); // List<String> | The collection of instruments to search for
try {
    MatchInstrumentsResponse result = apiInstance.matchInstruments(codeType, codes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#matchInstruments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeType** | **String**| The type of codes to search for | [optional] [enum: Undefined, LusidInstrumentId, ReutersAssetId, CINS, Isin, Sedol, Cusip, Ticker, ClientInternal, Figi, CompositeFigi, ShareClassFigi, Wertpapier, RIC, QuotePermId]
 **codes** | **List&lt;String&gt;**| The collection of instruments to search for | [optional]

### Return type

[**MatchInstrumentsResponse**](MatchInstrumentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="updateInstrumentIdentifier"></a>
# **updateInstrumentIdentifier**
> Instrument updateInstrumentIdentifier(type, id, request)

Update instrument identifier

Adds, updates, or removes an identifier on an instrument

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.InstrumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

InstrumentsApi apiInstance = new InstrumentsApi();
String type = "type_example"; // String | The type of identifier being supplied
String id = "id_example"; // String | The instrument identifier
UpdateInstrumentIdentifierRequest request = new UpdateInstrumentIdentifierRequest(); // UpdateInstrumentIdentifierRequest | The identifier to add, update, or remove
try {
    Instrument result = apiInstance.updateInstrumentIdentifier(type, id, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#updateInstrumentIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type of identifier being supplied | [enum: Undefined, LusidInstrumentId, ReutersAssetId, CINS, Isin, Sedol, Cusip, Ticker, ClientInternal, Figi, CompositeFigi, ShareClassFigi, Wertpapier, RIC, QuotePermId]
 **id** | **String**| The instrument identifier |
 **request** | [**UpdateInstrumentIdentifierRequest**](UpdateInstrumentIdentifierRequest.md)| The identifier to add, update, or remove | [optional]

### Return type

[**Instrument**](Instrument.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="upsertInstruments"></a>
# **upsertInstruments**
> UpsertInstrumentsResponse upsertInstruments(requests)

Upsert instruments

Attempt to master one or more instruments in LUSID&#39;s instrument master. Each instrument is keyed by some unique key. This key is unimportant, and serves only as a method to identify created instruments in the response.    The response will return both the collection of successfully created instruments, as well as those that were rejected and why their creation failed. They will be keyed against the key supplied in the  request.                It is important to always check the &#39;Failed&#39; set for any unsuccessful results.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.InstrumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

InstrumentsApi apiInstance = new InstrumentsApi();
Object requests = null; // Object | The instrument definitions
try {
    UpsertInstrumentsResponse result = apiInstance.upsertInstruments(requests);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#upsertInstruments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requests** | **Object**| The instrument definitions | [optional]

### Return type

[**UpsertInstrumentsResponse**](UpsertInstrumentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="upsertInstrumentsProperties"></a>
# **upsertInstrumentsProperties**
> UpsertInstrumentPropertiesResponse upsertInstrumentsProperties(instrumentProperties)

Upsert instrument properties

Attempt to upsert property data for one or more instruments, properties, and effective dates.    The response will include the details of any failures that occurred during data storage.                It is important to always check the &#39;Failed&#39; collection for any unsuccessful results.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.InstrumentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

InstrumentsApi apiInstance = new InstrumentsApi();
List<UpsertInstrumentPropertyRequest> instrumentProperties = Arrays.asList(new UpsertInstrumentPropertyRequest()); // List<UpsertInstrumentPropertyRequest> | The instrument property data
try {
    UpsertInstrumentPropertiesResponse result = apiInstance.upsertInstrumentsProperties(instrumentProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#upsertInstrumentsProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentProperties** | [**List&lt;UpsertInstrumentPropertyRequest&gt;**](UpsertInstrumentPropertyRequest.md)| The instrument property data | [optional]

### Return type

[**UpsertInstrumentPropertiesResponse**](UpsertInstrumentPropertiesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

