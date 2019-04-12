# InstrumentsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInstrument**](InstrumentsApi.md#deleteInstrument) | **DELETE** /api/instruments/{identifierType}/{identifier} | Delete instrument
[**getInstrument**](InstrumentsApi.md#getInstrument) | **GET** /api/instruments/{identifierType}/{identifier} | Get instrument definition
[**getInstrumentIdentifiers**](InstrumentsApi.md#getInstrumentIdentifiers) | **GET** /api/instruments/identifiers | Get allowable instrument identifiers
[**getInstruments**](InstrumentsApi.md#getInstruments) | **POST** /api/instruments/$get | Get instrument definition
[**listInstruments**](InstrumentsApi.md#listInstruments) | **GET** /api/instruments | Get all of the currently mastered instruments in LUSID
[**updateInstrumentIdentifier**](InstrumentsApi.md#updateInstrumentIdentifier) | **POST** /api/instruments/{identifierType}/{identifier} | Update instrument identifier
[**upsertInstruments**](InstrumentsApi.md#upsertInstruments) | **POST** /api/instruments | Upsert instruments
[**upsertInstrumentsProperties**](InstrumentsApi.md#upsertInstrumentsProperties) | **POST** /api/instruments/$upsertproperties | Upsert instrument properties


<a name="deleteInstrument"></a>
# **deleteInstrument**
> DeleteInstrumentResponse deleteInstrument(identifierType, identifier)

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
String identifierType = "identifierType_example"; // String | The type of identifier being supplied
String identifier = "identifier_example"; // String | The instrument identifier
try {
    DeleteInstrumentResponse result = apiInstance.deleteInstrument(identifierType, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#deleteInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifierType** | **String**| The type of identifier being supplied |
 **identifier** | **String**| The instrument identifier |

### Return type

[**DeleteInstrumentResponse**](DeleteInstrumentResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getInstrument"></a>
# **getInstrument**
> Instrument getInstrument(identifierType, identifier, effectiveAt, asAt, instrumentPropertyKeys)

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
String identifierType = "identifierType_example"; // String | The type of identifier being supplied
String identifier = "identifier_example"; // String | The identifier of the requested instrument
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the query
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the query
List<String> instrumentPropertyKeys = Arrays.asList("instrumentPropertyKeys_example"); // List<String> | Optional. Keys of the properties to be decorated on to the instrument
try {
    Instrument result = apiInstance.getInstrument(identifierType, identifier, effectiveAt, asAt, instrumentPropertyKeys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#getInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifierType** | **String**| The type of identifier being supplied |
 **identifier** | **String**| The identifier of the requested instrument |
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
> ResourceListOfInstrumentIdTypeDescriptor getInstrumentIdentifiers()

Get allowable instrument identifiers

Returns a collection of instrument identifier type descriptors. Each descriptor specifies the properties  of a particular instrument identifier - its name, its cardinality (whether or not multiple instruments can  share the same identifier value), and its corresponding PropertyKey.

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
    ResourceListOfInstrumentIdTypeDescriptor result = apiInstance.getInstrumentIdentifiers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#getInstrumentIdentifiers");
    e.printStackTrace();
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

<a name="getInstruments"></a>
# **getInstruments**
> GetInstrumentsResponse getInstruments(identifierType, identifiers, effectiveAt, asAt, instrumentPropertyKeys)

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
String identifierType = "identifierType_example"; // String | The type of identifiers being supplied
List<String> identifiers = Arrays.asList(new List<String>()); // List<String> | The identifiers of the instruments to get
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the request
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The as at date of the request
List<String> instrumentPropertyKeys = Arrays.asList("instrumentPropertyKeys_example"); // List<String> | Optional. Keys of the properties to be decorated on to the instrument
try {
    GetInstrumentsResponse result = apiInstance.getInstruments(identifierType, identifiers, effectiveAt, asAt, instrumentPropertyKeys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#getInstruments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifierType** | **String**| The type of identifiers being supplied |
 **identifiers** | **List&lt;String&gt;**| The identifiers of the instruments to get |
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
> ResourceListOfInstrument listInstruments(asAt, effectiveAt, page, sortBy, start, limit, filter, instrumentPropertyKeys)

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
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt time
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the query
String page = "page_example"; // String | Optional. The pagination token to continue listing instruments. This value is returned from a previous call to ListInstruments.  If this is set, then the sortBy, filter, effectiveAt, and asAt fields must not have changed. Also, if set, a start value cannot be set.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many
String filter = "State eq 'Active'"; // String | Optional. Expression to filter the result set - the default filter returns only instruments in the Active state
List<String> instrumentPropertyKeys = Arrays.asList("instrumentPropertyKeys_example"); // List<String> | Optional. Keys of the properties to be decorated on to the instrument
try {
    ResourceListOfInstrument result = apiInstance.listInstruments(asAt, effectiveAt, page, sortBy, start, limit, filter, instrumentPropertyKeys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#listInstruments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asAt** | **OffsetDateTime**| Optional. The AsAt time | [optional]
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date of the query | [optional]
 **page** | **String**| Optional. The pagination token to continue listing instruments. This value is returned from a previous call to ListInstruments.  If this is set, then the sortBy, filter, effectiveAt, and asAt fields must not have changed. Also, if set, a start value cannot be set. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many | [optional]
 **filter** | **String**| Optional. Expression to filter the result set - the default filter returns only instruments in the Active state | [optional] [default to State eq &#39;Active&#39;]
 **instrumentPropertyKeys** | [**List&lt;String&gt;**](String.md)| Optional. Keys of the properties to be decorated on to the instrument | [optional]

### Return type

[**ResourceListOfInstrument**](ResourceListOfInstrument.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="updateInstrumentIdentifier"></a>
# **updateInstrumentIdentifier**
> Instrument updateInstrumentIdentifier(identifierType, identifier, request)

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
String identifierType = "identifierType_example"; // String | The type of identifier being supplied
String identifier = "identifier_example"; // String | The instrument identifier
UpdateInstrumentIdentifierRequest request = new UpdateInstrumentIdentifierRequest(); // UpdateInstrumentIdentifierRequest | The identifier to add, update, or remove
try {
    Instrument result = apiInstance.updateInstrumentIdentifier(identifierType, identifier, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#updateInstrumentIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifierType** | **String**| The type of identifier being supplied |
 **identifier** | **String**| The instrument identifier |
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

