# InstrumentsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchAddClientInstruments**](InstrumentsApi.md#batchAddClientInstruments) | **POST** /api/instruments | Create instrument
[**batchDeleteClientInstruments**](InstrumentsApi.md#batchDeleteClientInstruments) | **DELETE** /api/instruments | Delete instrument
[**batchUpsertInstrumentProperties**](InstrumentsApi.md#batchUpsertInstrumentProperties) | **POST** /api/instruments/$upsertproperties | Upsert instrument properties
[**getInstrument**](InstrumentsApi.md#getInstrument) | **GET** /api/instruments/{uid} | Get instrument definition
[**lookupInstrumentsFromCodes**](InstrumentsApi.md#lookupInstrumentsFromCodes) | **POST** /api/instruments/$lookup | Lookup instrument definition


<a name="batchAddClientInstruments"></a>
# **batchAddClientInstruments**
> TryAddClientInstruments batchAddClientInstruments(definitions)

Create instrument

Attempt to create one or more \&quot;client\&quot; instruments. Each instrument is keyed by some unique key. This key is unimportant, and serves only as a method to identify created instruments in the response.    The response will return both the collection of successfully created instruments, as well as those that were rejected and why their creation failed. They will be keyed against the key supplied in the  request.                It is important to always check the &#39;Failed&#39; set for any unsuccessful results.

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
Object definitions = null; // Object | The client instrument definitions
try {
    TryAddClientInstruments result = apiInstance.batchAddClientInstruments(definitions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#batchAddClientInstruments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **definitions** | **Object**| The client instrument definitions | [optional]

### Return type

[**TryAddClientInstruments**](TryAddClientInstruments.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="batchDeleteClientInstruments"></a>
# **batchDeleteClientInstruments**
> DeleteClientInstrumentsResponse batchDeleteClientInstruments(uids)

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
List<String> uids = Arrays.asList("uids_example"); // List<String> | The unique identifiers of the instruments to delete
try {
    DeleteClientInstrumentsResponse result = apiInstance.batchDeleteClientInstruments(uids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#batchDeleteClientInstruments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uids** | [**List&lt;String&gt;**](String.md)| The unique identifiers of the instruments to delete | [optional]

### Return type

[**DeleteClientInstrumentsResponse**](DeleteClientInstrumentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="batchUpsertInstrumentProperties"></a>
# **batchUpsertInstrumentProperties**
> UpsertInstrumentPropertiesResponse batchUpsertInstrumentProperties(instrumentProperties)

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
List<InstrumentProperty> instrumentProperties = Arrays.asList(new InstrumentProperty()); // List<InstrumentProperty> | The instrument property data
try {
    UpsertInstrumentPropertiesResponse result = apiInstance.batchUpsertInstrumentProperties(instrumentProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#batchUpsertInstrumentProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instrumentProperties** | [**List&lt;InstrumentProperty&gt;**](InstrumentProperty.md)| The instrument property data | [optional]

### Return type

[**UpsertInstrumentPropertiesResponse**](UpsertInstrumentPropertiesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="getInstrument"></a>
# **getInstrument**
> Instrument getInstrument(uid, asAt, instrumentPropertyKeys)

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
String uid = "uid_example"; // String | The uid of the requested instrument
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
List<String> instrumentPropertyKeys = Arrays.asList("instrumentPropertyKeys_example"); // List<String> | Optional. Keys of the properties to be decorated on to the instrument
try {
    Instrument result = apiInstance.getInstrument(uid, asAt, instrumentPropertyKeys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#getInstrument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | **String**| The uid of the requested instrument |
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]
 **instrumentPropertyKeys** | [**List&lt;String&gt;**](String.md)| Optional. Keys of the properties to be decorated on to the instrument | [optional]

### Return type

[**Instrument**](Instrument.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="lookupInstrumentsFromCodes"></a>
# **lookupInstrumentsFromCodes**
> LookupInstrumentsFromCodesResponse lookupInstrumentsFromCodes(codeType, codes, asAt, instrumentPropertyKeys)

Lookup instrument definition

Lookup one or more instrument definitions by specifying non-LUSID identifiers. Optionally, it is possible to decorate each instrument with specified property data.    The response will return both the collection of found instruments for each identifier, as well as a collection of all identifiers for which no instruments could be found (as well as any available details).                It is important to always check the &#39;Failed&#39; set for any unsuccessful results.

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
String codeType = "codeType_example"; // String | The type of identifiers
List<String> codes = Arrays.asList(new List<String>()); // List<String> | One or more identifiers of the type specified in the codeType
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
List<String> instrumentPropertyKeys = Arrays.asList("instrumentPropertyKeys_example"); // List<String> | Optional. Keys of the properties to be decorated on to the instrument
try {
    LookupInstrumentsFromCodesResponse result = apiInstance.lookupInstrumentsFromCodes(codeType, codes, asAt, instrumentPropertyKeys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentsApi#lookupInstrumentsFromCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeType** | **String**| The type of identifiers | [optional] [enum: Undefined, LusidInstrumentId, ReutersAssetId, CINS, Isin, Sedol, Cusip, Ticker, ClientInternal, Figi, CompositeFigi, ShareClassFigi, Wertpapier]
 **codes** | **List&lt;String&gt;**| One or more identifiers of the type specified in the codeType | [optional]
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]
 **instrumentPropertyKeys** | [**List&lt;String&gt;**](String.md)| Optional. Keys of the properties to be decorated on to the instrument | [optional]

### Return type

[**LookupInstrumentsFromCodesResponse**](LookupInstrumentsFromCodesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

