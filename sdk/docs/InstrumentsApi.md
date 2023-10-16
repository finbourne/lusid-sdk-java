# InstrumentsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchUpsertInstrumentProperties**](InstrumentsApi.md#batchUpsertInstrumentProperties) | **POST** /api/instruments/$batchupsertproperties | [EARLY ACCESS] BatchUpsertInstrumentProperties: Batch upsert instruments properties |
| [**deleteInstrument**](InstrumentsApi.md#deleteInstrument) | **DELETE** /api/instruments/{identifierType}/{identifier} | [EARLY ACCESS] DeleteInstrument: Soft delete a single instrument |
| [**deleteInstrumentProperties**](InstrumentsApi.md#deleteInstrumentProperties) | **POST** /api/instruments/{identifierType}/{identifier}/properties/$delete | [EARLY ACCESS] DeleteInstrumentProperties: Delete instrument properties |
| [**deleteInstruments**](InstrumentsApi.md#deleteInstruments) | **POST** /api/instruments/$delete | [EARLY ACCESS] DeleteInstruments: Soft or hard delete multiple instruments |
| [**getAllPossibleFeatures**](InstrumentsApi.md#getAllPossibleFeatures) | **GET** /api/instruments/{instrumentType}/allfeatures | [EXPERIMENTAL] GetAllPossibleFeatures: Provides list of all possible features for instrument type. |
| [**getExistingInstrumentCapabilities**](InstrumentsApi.md#getExistingInstrumentCapabilities) | **GET** /api/instruments/{identifier}/capabilities | [EXPERIMENTAL] GetExistingInstrumentCapabilities: Retrieve capabilities of an existing instrument identified by LUID. These include instrument features, and if model is provided it also includes supported address keys and economic dependencies.  Given an lusid instrument id provides instrument capabilities, outlining features, and, given the model, the capabilities also include supported addresses as well as economic dependencies. |
| [**getExistingInstrumentModels**](InstrumentsApi.md#getExistingInstrumentModels) | **GET** /api/instruments/{identifier}/models | GetExistingInstrumentModels: Retrieve supported pricing models for an existing instrument identified by LUID. |
| [**getInstrument**](InstrumentsApi.md#getInstrument) | **GET** /api/instruments/{identifierType}/{identifier} | GetInstrument: Get instrument |
| [**getInstrumentIdentifierTypes**](InstrumentsApi.md#getInstrumentIdentifierTypes) | **GET** /api/instruments/identifierTypes | GetInstrumentIdentifierTypes: Get instrument identifier types |
| [**getInstrumentPaymentDiary**](InstrumentsApi.md#getInstrumentPaymentDiary) | **GET** /api/instruments/{identifierType}/{identifier}/paymentdiary | [EXPERIMENTAL] GetInstrumentPaymentDiary: Get instrument payment diary |
| [**getInstrumentProperties**](InstrumentsApi.md#getInstrumentProperties) | **GET** /api/instruments/{identifierType}/{identifier}/properties | [EARLY ACCESS] GetInstrumentProperties: Get instrument properties |
| [**getInstrumentPropertyTimeSeries**](InstrumentsApi.md#getInstrumentPropertyTimeSeries) | **GET** /api/instruments/{identifierType}/{identifier}/properties/time-series | [EARLY ACCESS] GetInstrumentPropertyTimeSeries: Get instrument property time series |
| [**getInstrumentRelationships**](InstrumentsApi.md#getInstrumentRelationships) | **GET** /api/instruments/{identifierType}/{identifier}/relationships | [EARLY ACCESS] GetInstrumentRelationships: Get Instrument relationships |
| [**getInstruments**](InstrumentsApi.md#getInstruments) | **POST** /api/instruments/$get | GetInstruments: Get instruments |
| [**listInstrumentProperties**](InstrumentsApi.md#listInstrumentProperties) | **GET** /api/instruments/{identifierType}/{identifier}/properties/list | [EARLY ACCESS] ListInstrumentProperties: Get instrument properties (with Pagination) |
| [**listInstruments**](InstrumentsApi.md#listInstruments) | **GET** /api/instruments | ListInstruments: List instruments |
| [**queryInstrumentCapabilities**](InstrumentsApi.md#queryInstrumentCapabilities) | **POST** /api/instruments/capabilities | [EXPERIMENTAL] QueryInstrumentCapabilities: Query capabilities of a particular instrument in advance of creating it. These include instrument features, and if model is provided it also includes supported address keys and economic dependencies. |
| [**updateInstrumentIdentifier**](InstrumentsApi.md#updateInstrumentIdentifier) | **POST** /api/instruments/{identifierType}/{identifier} | UpdateInstrumentIdentifier: Update instrument identifier |
| [**upsertInstruments**](InstrumentsApi.md#upsertInstruments) | **POST** /api/instruments | UpsertInstruments: Upsert instruments |
| [**upsertInstrumentsProperties**](InstrumentsApi.md#upsertInstrumentsProperties) | **POST** /api/instruments/$upsertproperties | UpsertInstrumentsProperties: Upsert instruments properties |


<a id="batchUpsertInstrumentProperties"></a>
# **batchUpsertInstrumentProperties**
> BatchUpsertInstrumentPropertiesResponse batchUpsertInstrumentProperties(requestBody).scope(scope).identifierEffectiveAt(identifierEffectiveAt).successMode(successMode).execute();

[EARLY ACCESS] BatchUpsertInstrumentProperties: Batch upsert instruments properties

Create or update one or more properties for particular instruments.    Each instrument property is updated if it exists and created if it does not. For any failures, a reason  is provided.    Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime from which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    Map<String, UpsertInstrumentPropertyRequest> requestBody = new HashMap(); // Map<String, UpsertInstrumentPropertyRequest> | A list of instruments and associated instrument properties to create or update.
    String scope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    String identifierEffectiveAt = "identifierEffectiveAt_example"; // String | The effective datetime used to resolve each instrument from the provided identifiers. Defaults to the current LUSID system datetime if not specified.
    String successMode = "Partial"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial.
    try {
      BatchUpsertInstrumentPropertiesResponse result = apiInstance.batchUpsertInstrumentProperties(requestBody)
            .scope(scope)
            .identifierEffectiveAt(identifierEffectiveAt)
            .successMode(successMode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#batchUpsertInstrumentProperties");
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
| **requestBody** | [**Map&lt;String, UpsertInstrumentPropertyRequest&gt;**](UpsertInstrumentPropertyRequest.md)| A list of instruments and associated instrument properties to create or update. | |
| **scope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |
| **identifierEffectiveAt** | **String**| The effective datetime used to resolve each instrument from the provided identifiers. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial. | [optional] [default to Partial] |

### Return type

[**BatchUpsertInstrumentPropertiesResponse**](BatchUpsertInstrumentPropertiesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The successfully upserted properties along with any failures. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteInstrument"></a>
# **deleteInstrument**
> DeleteInstrumentResponse deleteInstrument(identifierType, identifier).scope(scope).execute();

[EARLY ACCESS] DeleteInstrument: Soft delete a single instrument

Soft delete a particular instrument, as identified by a particular instrument identifier.     Once deleted, an instrument is marked as inactive and can no longer be referenced when creating or updating  transactions or holdings. You can still query existing transactions and holdings related to the  deleted instrument.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | The unique identifier type to search, for example 'Figi'.
    String identifier = "identifier_example"; // String | An <i>identifierType</i> value to use to identify the instrument, for example 'BBG000BLNNV0'.
    String scope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    try {
      DeleteInstrumentResponse result = apiInstance.deleteInstrument(identifierType, identifier)
            .scope(scope)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **identifierType** | **String**| The unique identifier type to search, for example &#39;Figi&#39;. | |
| **identifier** | **String**| An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. | |
| **scope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

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
| **200** | The datetime that the instrument was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteInstrumentProperties"></a>
# **deleteInstrumentProperties**
> DeleteInstrumentPropertiesResponse deleteInstrumentProperties(identifierType, identifier, requestBody).effectiveAt(effectiveAt).scope(scope).execute();

[EARLY ACCESS] DeleteInstrumentProperties: Delete instrument properties

Delete one or more properties from a particular instrument. If the properties are time-variant then an effective datetime from which  to delete properties must be specified. If the properties are perpetual then it is invalid to specify an effective datetime for deletion.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | The unique identifier type to search, for example 'Figi'.
    String identifier = "identifier_example"; // String | An <i>identifierType</i> value to use to identify the instrument, for example 'BBG000BLNNV0'.
    List<String> requestBody = ["Instrument/scope/market-sector","Instrument/scope/tenor"]; // List<String> | A list of property keys from the 'Instruments' domain whose properties to delete.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to delete time-variant properties from.   The property must exist at the specified 'effectiveAt' datetime. If the 'effectiveAt' is not provided or is   before the time-variant property exists then a failure is returned. Do not specify this parameter if any of   the properties to delete are perpetual.
    String scope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    try {
      DeleteInstrumentPropertiesResponse result = apiInstance.deleteInstrumentProperties(identifierType, identifier, requestBody)
            .effectiveAt(effectiveAt)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#deleteInstrumentProperties");
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
| **identifierType** | **String**| The unique identifier type to search, for example &#39;Figi&#39;. | |
| **identifier** | **String**| An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instruments&#39; domain whose properties to delete. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to delete time-variant properties from.   The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is   before the time-variant property exists then a failure is returned. Do not specify this parameter if any of   the properties to delete are perpetual. | [optional] |
| **scope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**DeleteInstrumentPropertiesResponse**](DeleteInstrumentPropertiesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The asAt datetime at which properties were deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteInstruments"></a>
# **deleteInstruments**
> DeleteInstrumentsResponse deleteInstruments(requestBody).deleteMode(deleteMode).scope(scope).execute();

[EARLY ACCESS] DeleteInstruments: Soft or hard delete multiple instruments

Deletes a number of instruments identified by LusidInstrumentId.     Soft deletion marks the instrument as inactive so it can no longer be referenced when creating or updating transactions or holdings. You can still query existing transactions and holdings related to the inactive instrument.     In addition to the above behaviour, hard deletion: (i) completely removes all external identifiers from the instrument; (ii) marks the instrument as &#39;Deleted&#39;; (iii) prepends the instrument&#39;s name with &#39;DELETED &#39;; (iv) prevents the instrument from being returned in list instruments queries.     Following hard deletion, an instrument may only be retrieved by making a direct get instrument request for the LusidInstrumentId. Instrument deletion cannot be undone. Please note that currency instruments cannot currently be deleted.  The maximum number of instruments that this method can delete per request is 2,000.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    List<String> requestBody = ["LUID_12345678","LUID_87654321"]; // List<String> | The list of lusidInstrumentId's to delete.
    String deleteMode = "Soft"; // String | The delete mode to use (defaults to 'Soft').
    String scope = "default"; // String | The scope in which the instruments lie. When not supplied the scope is 'default'.
    try {
      DeleteInstrumentsResponse result = apiInstance.deleteInstruments(requestBody)
            .deleteMode(deleteMode)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#deleteInstruments");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| The list of lusidInstrumentId&#39;s to delete. | |
| **deleteMode** | **String**| The delete mode to use (defaults to &#39;Soft&#39;). | [optional] [enum: Soft, Hard] |
| **scope** | **String**| The scope in which the instruments lie. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**DeleteInstrumentsResponse**](DeleteInstrumentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the instruments were deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getAllPossibleFeatures"></a>
# **getAllPossibleFeatures**
> Map&lt;String, List&lt;String&gt;&gt; getAllPossibleFeatures(instrumentType).execute();

[EXPERIMENTAL] GetAllPossibleFeatures: Provides list of all possible features for instrument type.

Provides all possible instrument features an instrument of a given type can provide.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String instrumentType = "instrumentType_example"; // String | A lusid instrument type e.g. Bond, FxOption.
    try {
      Map<String, List<String>> result = apiInstance.getAllPossibleFeatures(instrumentType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#getAllPossibleFeatures");
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
| **instrumentType** | **String**| A lusid instrument type e.g. Bond, FxOption. | |

### Return type

[**Map&lt;String, List&lt;String&gt;&gt;**](List.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Provides all possible instrument features an instrument of a given type can provide. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getExistingInstrumentCapabilities"></a>
# **getExistingInstrumentCapabilities**
> InstrumentCapabilities getExistingInstrumentCapabilities(identifier).model(model).effectiveAt(effectiveAt).asAt(asAt).instrumentScope(instrumentScope).recipeScope(recipeScope).recipeCode(recipeCode).execute();

[EXPERIMENTAL] GetExistingInstrumentCapabilities: Retrieve capabilities of an existing instrument identified by LUID. These include instrument features, and if model is provided it also includes supported address keys and economic dependencies.  Given an lusid instrument id provides instrument capabilities, outlining features, and, given the model, the capabilities also include supported addresses as well as economic dependencies.

Returns instrument capabilities containing useful information about the instrument and the model. This includes  - features corresponding to the instrument e.g. Optionality:American, Other:InflationLinked  - supported addresses (if model provided) e.g. Valuation/Pv, Valuation/DirtyPriceKey, Valuation/Accrued  - economic dependencies (if model provided) e.g. Cash:USD, Fx:GBP.USD, Rates:GBP.GBPOIS

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifier = "identifier_example"; // String | A lusid instrument id identifying the instrument.
    String model = "model_example"; // String | A pricing model for the instrument. Defaults to Unknown if not specified. If not specified the SupportedAddresses and EconomicDependencies are not provided.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the instrument.   Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the instrument. Defaults to   returning the latest version if not specified.
    String instrumentScope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    String recipeScope = "default"; // String | The scope in which the recipe lies. When not supplied the scope is 'default'.
    String recipeCode = "recipeCode_example"; // String | A unique identifier for an entity, used to obtain configuration recipe details. Default configuration recipe is used if not provided.
    try {
      InstrumentCapabilities result = apiInstance.getExistingInstrumentCapabilities(identifier)
            .model(model)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .instrumentScope(instrumentScope)
            .recipeScope(recipeScope)
            .recipeCode(recipeCode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#getExistingInstrumentCapabilities");
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
| **identifier** | **String**| A lusid instrument id identifying the instrument. | |
| **model** | **String**| A pricing model for the instrument. Defaults to Unknown if not specified. If not specified the SupportedAddresses and EconomicDependencies are not provided. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the instrument.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instrument. Defaults to   returning the latest version if not specified. | [optional] |
| **instrumentScope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |
| **recipeScope** | **String**| The scope in which the recipe lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |
| **recipeCode** | **String**| A unique identifier for an entity, used to obtain configuration recipe details. Default configuration recipe is used if not provided. | [optional] |

### Return type

[**InstrumentCapabilities**](InstrumentCapabilities.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Capabilities for a given instrument, with more details should the model be provided. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getExistingInstrumentModels"></a>
# **getExistingInstrumentModels**
> InstrumentModels getExistingInstrumentModels(identifier).effectiveAt(effectiveAt).asAt(asAt).instrumentScope(instrumentScope).recipeScope(recipeScope).recipeCode(recipeCode).execute();

GetExistingInstrumentModels: Retrieve supported pricing models for an existing instrument identified by LUID.

Get the supported pricing models of a single instrument.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifier = "identifier_example"; // String | A lusid instrument id identifying the instrument.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the instrument.   Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the instrument. Defaults to   returning the latest version if not specified.
    String instrumentScope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    String recipeScope = "default"; // String | The scope in which the recipe lies. When not supplied the scope is 'default'.
    String recipeCode = "recipeCode_example"; // String | A unique identifier for an entity, used to obtain configuration recipe details. Default configuration recipe is used if not provided.
    try {
      InstrumentModels result = apiInstance.getExistingInstrumentModels(identifier)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .instrumentScope(instrumentScope)
            .recipeScope(recipeScope)
            .recipeCode(recipeCode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#getExistingInstrumentModels");
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
| **identifier** | **String**| A lusid instrument id identifying the instrument. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the instrument.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instrument. Defaults to   returning the latest version if not specified. | [optional] |
| **instrumentScope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |
| **recipeScope** | **String**| The scope in which the recipe lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |
| **recipeCode** | **String**| A unique identifier for an entity, used to obtain configuration recipe details. Default configuration recipe is used if not provided. | [optional] |

### Return type

[**InstrumentModels**](InstrumentModels.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Models which can be used to value a given instrument. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getInstrument"></a>
# **getInstrument**
> Instrument getInstrument(identifierType, identifier).effectiveAt(effectiveAt).asAt(asAt).propertyKeys(propertyKeys).scope(scope).relationshipDefinitionIds(relationshipDefinitionIds).execute();

GetInstrument: Get instrument

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | The unique identifier type to use, for example 'Figi'.
    String identifier = "identifier_example"; // String | An <i>identifierType</i> value to use to identify the instrument, for example 'BBG000BLNNV0'.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the instrument.   Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the instrument. Defaults to   returning the latest version if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Instrument' domain to decorate onto   the instrument, or from any domain that supports relationships to decorate onto related entities.   These must have the format {domain}/{scope}/{code}, for example 'Instrument/system/Name'.
    String scope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto the instrument in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
    try {
      Instrument result = apiInstance.getInstrument(identifierType, identifier)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .propertyKeys(propertyKeys)
            .scope(scope)
            .relationshipDefinitionIds(relationshipDefinitionIds)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **identifierType** | **String**| The unique identifier type to use, for example &#39;Figi&#39;. | |
| **identifier** | **String**| An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the instrument.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instrument. Defaults to   returning the latest version if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instrument&#39; domain to decorate onto   the instrument, or from any domain that supports relationships to decorate onto related entities.   These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. | [optional] |
| **scope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto the instrument in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

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
| **200** | The requested instrument. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getInstrumentIdentifierTypes"></a>
# **getInstrumentIdentifierTypes**
> ResourceListOfInstrumentIdTypeDescriptor getInstrumentIdentifierTypes().execute();

GetInstrumentIdentifierTypes: Get instrument identifier types

Retrieve a list of all valid instrument identifier types and whether they are unique or not.     An instrument must have a value for at least one unique identifier type (it can have more than one unique type and value).  In addition, a value is automatically generated for a LUSID Instrument ID (LUID) unique type by the system.     An instrument can have values for multiple non-unique identifier types (or it can have zero non-unique types and values).

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    try {
      ResourceListOfInstrumentIdTypeDescriptor result = apiInstance.getInstrumentIdentifierTypes()
            .execute();
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
| **200** | A list of valid instrument identifier types. |  -  |
| **0** | Error response |  -  |

<a id="getInstrumentPaymentDiary"></a>
# **getInstrumentPaymentDiary**
> InstrumentPaymentDiary getInstrumentPaymentDiary(identifierType, identifier, recipeScope, recipeCode).effectiveAt(effectiveAt).asAt(asAt).scope(scope).execute();

[EXPERIMENTAL] GetInstrumentPaymentDiary: Get instrument payment diary

Get the payment diary of a single instrument.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | The identifier being supplied e.g. \"Figi\".
    String identifier = "identifier_example"; // String | The value of the identifier for the requested instrument.
    String recipeScope = "recipeScope_example"; // String | The scope of the valuation recipe being used to generate the payment diary
    String recipeCode = "recipeCode_example"; // String | The code of the valuation recipe being used to generate the payment diary
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the instrument's properties. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the instrument's properties. Defaults to return the latest version of each property if not specified.
    String scope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    try {
      InstrumentPaymentDiary result = apiInstance.getInstrumentPaymentDiary(identifierType, identifier, recipeScope, recipeCode)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#getInstrumentPaymentDiary");
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
| **identifierType** | **String**| The identifier being supplied e.g. \&quot;Figi\&quot;. | |
| **identifier** | **String**| The value of the identifier for the requested instrument. | |
| **recipeScope** | **String**| The scope of the valuation recipe being used to generate the payment diary | |
| **recipeCode** | **String**| The code of the valuation recipe being used to generate the payment diary | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the instrument&#39;s properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the instrument&#39;s properties. Defaults to return the latest version of each property if not specified. | [optional] |
| **scope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**InstrumentPaymentDiary**](InstrumentPaymentDiary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The payment diary of the specified instrument |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getInstrumentProperties"></a>
# **getInstrumentProperties**
> InstrumentProperties getInstrumentProperties(identifierType, identifier).effectiveAt(effectiveAt).asAt(asAt).scope(scope).execute();

[EARLY ACCESS] GetInstrumentProperties: Get instrument properties

List all the properties of a particular instrument, as identified by a particular unique identifier.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | The unique identifier type to search, for example 'Figi'.
    String identifier = "identifier_example"; // String | An <i>identifierType</i> value to use to identify the instrument, for example 'BBG000BLNNV0'.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the instrument's properties.   Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the instrument's properties. Defaults to returning   the latest version of each property if not specified.
    String scope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    try {
      InstrumentProperties result = apiInstance.getInstrumentProperties(identifierType, identifier)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#getInstrumentProperties");
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
| **identifierType** | **String**| The unique identifier type to search, for example &#39;Figi&#39;. | |
| **identifier** | **String**| An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the instrument&#39;s properties.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the instrument&#39;s properties. Defaults to returning   the latest version of each property if not specified. | [optional] |
| **scope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**InstrumentProperties**](InstrumentProperties.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The properties of the specified instrument |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getInstrumentPropertyTimeSeries"></a>
# **getInstrumentPropertyTimeSeries**
> ResourceListOfPropertyInterval getInstrumentPropertyTimeSeries(identifierType, identifier, propertyKey).identifierEffectiveAt(identifierEffectiveAt).asAt(asAt).filter(filter).page(page).limit(limit).scope(scope).execute();

[EARLY ACCESS] GetInstrumentPropertyTimeSeries: Get instrument property time series

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | The unique identifier type to search, for example 'Figi'.
    String identifier = "identifier_example"; // String | An <i>identifierType</i> value to use to identify the instrument, for example 'BBG000BLNNV0'.
    String propertyKey = "propertyKey_example"; // String | The property key of a property from the 'Instrument' domain whose history to retrieve.   This must have the format {domain}/{scope}/{code}, for example 'Instrument/system/Name'.
    String identifierEffectiveAt = "identifierEffectiveAt_example"; // String | The effective datetime used to resolve the instrument from the identifier.   Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the instrument's property history. Defaults to   returning the current datetime if not supplied.
    String filter = "filter_example"; // String | Expression to filter the results. For more information about filtering,   see https://support.lusid.com/knowledgebase/article/KA-01914.
    String page = "page_example"; // String | The pagination token to use to continue listing properties; this value is returned from   the previous call. If a pagination token is provided, the <i>filter</i>, <i>effectiveAt</i> and   <i>asAt</i> fields must not have changed since the original request. For more information, see   https://support.lusid.com/knowledgebase/article/KA-01915.
    Integer limit = 56; // Integer | When paginating, limit the results to this number.
    String scope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    try {
      ResourceListOfPropertyInterval result = apiInstance.getInstrumentPropertyTimeSeries(identifierType, identifier, propertyKey)
            .identifierEffectiveAt(identifierEffectiveAt)
            .asAt(asAt)
            .filter(filter)
            .page(page)
            .limit(limit)
            .scope(scope)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **identifierType** | **String**| The unique identifier type to search, for example &#39;Figi&#39;. | |
| **identifier** | **String**| An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. | |
| **propertyKey** | **String**| The property key of a property from the &#39;Instrument&#39; domain whose history to retrieve.   This must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. | |
| **identifierEffectiveAt** | **String**| The effective datetime used to resolve the instrument from the identifier.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instrument&#39;s property history. Defaults to   returning the current datetime if not supplied. | [optional] |
| **filter** | **String**| Expression to filter the results. For more information about filtering,   see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **page** | **String**| The pagination token to use to continue listing properties; this value is returned from   the previous call. If a pagination token is provided, the &lt;i&gt;filter&lt;/i&gt;, &lt;i&gt;effectiveAt&lt;/i&gt; and   &lt;i&gt;asAt&lt;/i&gt; fields must not have changed since the original request. For more information, see   https://support.lusid.com/knowledgebase/article/KA-01915. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. | [optional] |
| **scope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

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
| **200** | The time series of the property |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getInstrumentRelationships"></a>
# **getInstrumentRelationships**
> ResourceListOfRelationship getInstrumentRelationships(identifierType, identifier).effectiveAt(effectiveAt).asAt(asAt).filter(filter).identifierTypes(identifierTypes).scope(scope).execute();

[EARLY ACCESS] GetInstrumentRelationships: Get Instrument relationships

Get relationships for a particular Instrument.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | An identifier type attached to the Instrument.
    String identifier = "identifier_example"; // String | The identifier value.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified.
    String filter = "filter_example"; // String | Expression to filter relationships. Users should provide null or empty string for this field until further notice.
    List<String> identifierTypes = Arrays.asList(); // List<String> | Identifier types (as property keys) used for referencing Persons or Legal Entities.   These can be specified from the 'Person' or 'LegalEntity' domains and have the format {domain}/{scope}/{code}, for example   'Person/CompanyDetails/Role'. An Empty array may be used to return all related Entities.
    String scope = "default"; // String | The entity scope in which the instrument lies. When not supplied the scope is 'default'.
    try {
      ResourceListOfRelationship result = apiInstance.getInstrumentRelationships(identifierType, identifier)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .filter(filter)
            .identifierTypes(identifierTypes)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#getInstrumentRelationships");
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
| **identifierType** | **String**| An identifier type attached to the Instrument. | |
| **identifier** | **String**| The identifier value. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. | [optional] |
| **filter** | **String**| Expression to filter relationships. Users should provide null or empty string for this field until further notice. | [optional] |
| **identifierTypes** | [**List&lt;String&gt;**](String.md)| Identifier types (as property keys) used for referencing Persons or Legal Entities.   These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example   &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. | [optional] |
| **scope** | **String**| The entity scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

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
| **200** | The relationships for the specified instrument. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getInstruments"></a>
# **getInstruments**
> GetInstrumentsResponse getInstruments(identifierType, requestBody).effectiveAt(effectiveAt).asAt(asAt).propertyKeys(propertyKeys).scope(scope).relationshipDefinitionIds(relationshipDefinitionIds).execute();

GetInstruments: Get instruments

Retrieve the definition of one or more instruments, as identified by a collection of unique identifiers.     Note that to retrieve all the instruments in the instrument master, use the List instruments endpoint instead.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | The unique identifier type to use, for example 'Figi'.
    List<String> requestBody = ["instrument-identifier-1","instrument-identifier-2"]; // List<String> | A list of one or more <i>identifierType</i> values to use to identify instruments.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the instrument definitions.   Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the instrument definitions.   Defaults to returning the latest version of each instrument definition if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Instrument' domain to decorate onto   each instrument, or from any domain that supports relationships to decorate onto related entities.   These must have the format {domain}/{scope}/{code}, for example 'Instrument/system/Name'.
    String scope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto each instrument in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
    try {
      GetInstrumentsResponse result = apiInstance.getInstruments(identifierType, requestBody)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .propertyKeys(propertyKeys)
            .scope(scope)
            .relationshipDefinitionIds(relationshipDefinitionIds)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **identifierType** | **String**| The unique identifier type to use, for example &#39;Figi&#39;. | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| A list of one or more &lt;i&gt;identifierType&lt;/i&gt; values to use to identify instruments. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the instrument definitions.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instrument definitions.   Defaults to returning the latest version of each instrument definition if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instrument&#39; domain to decorate onto   each instrument, or from any domain that supports relationships to decorate onto related entities.   These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. | [optional] |
| **scope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto each instrument in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**GetInstrumentsResponse**](GetInstrumentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested instruments which could be identified along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listInstrumentProperties"></a>
# **listInstrumentProperties**
> ResourceListOfProperty listInstrumentProperties(identifierType, identifier).effectiveAt(effectiveAt).asAt(asAt).page(page).limit(limit).scope(scope).execute();

[EARLY ACCESS] ListInstrumentProperties: Get instrument properties (with Pagination)

List all the properties of a particular instrument, as identified by a particular unique identifier.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | The unique identifier type to search, for example 'Figi'.
    String identifier = "identifier_example"; // String | An <i>identifierType</i> value to use to identify the instrument, for example 'BBG000BLNNV0'.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the instrument's properties.   Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the instrument's properties. Defaults to returning   the latest version of each property if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing commands; this value is returned from the previous call.
    Integer limit = 56; // Integer | When paginating, limit the results per page to this number.
    String scope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    try {
      ResourceListOfProperty result = apiInstance.listInstrumentProperties(identifierType, identifier)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .scope(scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#listInstrumentProperties");
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
| **identifierType** | **String**| The unique identifier type to search, for example &#39;Figi&#39;. | |
| **identifier** | **String**| An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the instrument&#39;s properties.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the instrument&#39;s properties. Defaults to returning   the latest version of each property if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing commands; this value is returned from the previous call. | [optional] |
| **limit** | **Integer**| When paginating, limit the results per page to this number. | [optional] |
| **scope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**ResourceListOfProperty**](ResourceListOfProperty.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The properties of the specified instrument |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listInstruments"></a>
# **listInstruments**
> PagedResourceListOfInstrument listInstruments().asAt(asAt).effectiveAt(effectiveAt).page(page).sortBy(sortBy).start(start).limit(limit).filter(filter).instrumentPropertyKeys(instrumentPropertyKeys).scope(scope).relationshipDefinitionIds(relationshipDefinitionIds).execute();

ListInstruments: List instruments

List all the instruments in the instrument master.     To retrieve a particular set of instruments instead, use the Get instruments endpoint.  The maximum number of instruments that this method can list per request is 2,000.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list instruments. Defaults to returning the latest   version of each instrument if not specified.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list instruments.   Defaults to the current LUSID system datetime if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing instruments; this value is returned from   the previous call. If a pagination token is provided, the <i>sortBy</i>, <i>filter</i>, <i>effectiveAt</i> and   <i>asAt</i> fields must not have changed since the original request. Also, a <i>start</i> value cannot be   provided. For more information, see https://support.lusid.com/knowledgebase/article/KA-01915.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the results to this number.
    String filter = "State eq 'Active'"; // String | Expression to filter the result set. Defaults to filtering out inactive instruments   (that is, those that have been deleted). For more information about filtering results,   see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> instrumentPropertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Instrument' domain to decorate onto   instruments, or from any domain that supports relationships to decorate onto related entities.   These must have the format {domain}/{scope}/{code}, for example 'Instrument/system/Name'.
    String scope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto each instrument in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
    try {
      PagedResourceListOfInstrument result = apiInstance.listInstruments()
            .asAt(asAt)
            .effectiveAt(effectiveAt)
            .page(page)
            .sortBy(sortBy)
            .start(start)
            .limit(limit)
            .filter(filter)
            .instrumentPropertyKeys(instrumentPropertyKeys)
            .scope(scope)
            .relationshipDefinitionIds(relationshipDefinitionIds)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list instruments. Defaults to returning the latest   version of each instrument if not specified. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list instruments.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing instruments; this value is returned from   the previous call. If a pagination token is provided, the &lt;i&gt;sortBy&lt;/i&gt;, &lt;i&gt;filter&lt;/i&gt;, &lt;i&gt;effectiveAt&lt;/i&gt; and   &lt;i&gt;asAt&lt;/i&gt; fields must not have changed since the original request. Also, a &lt;i&gt;start&lt;/i&gt; value cannot be   provided. For more information, see https://support.lusid.com/knowledgebase/article/KA-01915. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. | [optional] |
| **filter** | **String**| Expression to filter the result set. Defaults to filtering out inactive instruments   (that is, those that have been deleted). For more information about filtering results,   see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] [default to State eq &#39;Active&#39;] |
| **instrumentPropertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instrument&#39; domain to decorate onto   instruments, or from any domain that supports relationships to decorate onto related entities.   These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. | [optional] |
| **scope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto each instrument in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

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
| **200** | The requested instruments |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="queryInstrumentCapabilities"></a>
# **queryInstrumentCapabilities**
> InstrumentCapabilities queryInstrumentCapabilities(lusidInstrument).model(model).execute();

[EXPERIMENTAL] QueryInstrumentCapabilities: Query capabilities of a particular instrument in advance of creating it. These include instrument features, and if model is provided it also includes supported address keys and economic dependencies.

Returns instrument capabilities containing useful information about the instrument and the model. This includes  - features corresponding to the instrument e.g. Optionality:American, Other:InflationLinked  - supported addresses (if model provided) e.g. Valuation/Pv, Valuation/DirtyPriceKey, Valuation/Accrued  - economic dependencies (if model provided) e.g. Cash:USD, Fx:GBP.USD, Rates:GBP.GBPOIS

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    LusidInstrument lusidInstrument = new LusidInstrument(); // LusidInstrument | The definition of the instrument.
    String model = "model_example"; // String | A pricing model for the instrument. Defaults to Unknown if not specified. If not specified the SupportedAddresses and EconomicDependencies are not provided.
    try {
      InstrumentCapabilities result = apiInstance.queryInstrumentCapabilities(lusidInstrument)
            .model(model)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentsApi#queryInstrumentCapabilities");
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
| **lusidInstrument** | [**LusidInstrument**](LusidInstrument.md)| The definition of the instrument. | |
| **model** | **String**| A pricing model for the instrument. Defaults to Unknown if not specified. If not specified the SupportedAddresses and EconomicDependencies are not provided. | [optional] |

### Return type

[**InstrumentCapabilities**](InstrumentCapabilities.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Capabilities for a given instrument, with more details should the model be provided. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateInstrumentIdentifier"></a>
# **updateInstrumentIdentifier**
> Instrument updateInstrumentIdentifier(identifierType, identifier, updateInstrumentIdentifierRequest).scope(scope).execute();

UpdateInstrumentIdentifier: Update instrument identifier

Create, update or delete a particular instrument identifier for an instrument.     To delete the identifier, leave the value unspecified in the request. If not being deleted, the  identifier is updated if it exists and created if it does not.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    String identifierType = "identifierType_example"; // String | The unique identifier type to search, for example 'Figi'.
    String identifier = "identifier_example"; // String | An <i>identifierType</i> value to use to identify the instrument, for example 'BBG000BLNNV0'.
    UpdateInstrumentIdentifierRequest updateInstrumentIdentifierRequest = new UpdateInstrumentIdentifierRequest(); // UpdateInstrumentIdentifierRequest | The identifier to update or delete. This need not be the same value as the   'identifier' parameter used to retrieve the instrument.
    String scope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    try {
      Instrument result = apiInstance.updateInstrumentIdentifier(identifierType, identifier, updateInstrumentIdentifierRequest)
            .scope(scope)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **identifierType** | **String**| The unique identifier type to search, for example &#39;Figi&#39;. | |
| **identifier** | **String**| An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. | |
| **updateInstrumentIdentifierRequest** | [**UpdateInstrumentIdentifierRequest**](UpdateInstrumentIdentifierRequest.md)| The identifier to update or delete. This need not be the same value as the   &#39;identifier&#39; parameter used to retrieve the instrument. | |
| **scope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**Instrument**](Instrument.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated instrument definition with the identifier created, updated or deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertInstruments"></a>
# **upsertInstruments**
> UpsertInstrumentsResponse upsertInstruments(requestBody).scope(scope).execute();

UpsertInstruments: Upsert instruments

Create or update one or more instruments in the instrument master. An instrument is updated  if it already exists and created if it does not.     In the request, each instrument definition should be keyed by a unique correlation ID. This ID is ephemeral  and not stored by LUSID. It serves only to easily identify each instrument in the response.     Note that an instrument must have at least one unique identifier, which is a combination of a type  (such as &#39;Figi&#39;) and a value (such as &#39;BBG000BS1N49&#39;). In addition, a random value is automatically  generated for a LUSID Instrument ID (LUID) unique type by the system. For more information, see  https://support.lusid.com/knowledgebase/article/KA-01862.     The response returns both the collection of successfully created or updated instruments, as well as those  that failed. For each failure, a reason is provided. It is important to check the failed set for  unsuccessful results.  The maximum number of instruments that this method can upsert per request is 2,000.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    Map<String, InstrumentDefinition> requestBody = new HashMap(); // Map<String, InstrumentDefinition> | The definitions of the instruments to create or update.
    String scope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    try {
      UpsertInstrumentsResponse result = apiInstance.upsertInstruments(requestBody)
            .scope(scope)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**Map&lt;String, InstrumentDefinition&gt;**](InstrumentDefinition.md)| The definitions of the instruments to create or update. | |
| **scope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**UpsertInstrumentsResponse**](UpsertInstrumentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The successfully created or updated instruments along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertInstrumentsProperties"></a>
# **upsertInstrumentsProperties**
> UpsertInstrumentPropertiesResponse upsertInstrumentsProperties(upsertInstrumentPropertyRequest).scope(scope).execute();

UpsertInstrumentsProperties: Upsert instruments properties

Create or update one or more properties for particular instruments.     Each instrument property is updated if it exists and created if it does not. For any failures, a reason  is provided.     Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime from which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

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
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentsApi apiInstance = new InstrumentsApi(defaultClient);
    List<UpsertInstrumentPropertyRequest> upsertInstrumentPropertyRequest = Arrays.asList(); // List<UpsertInstrumentPropertyRequest> | A list of instruments and associated instrument properties to create or update.
    String scope = "default"; // String | The scope in which the instrument lies. When not supplied the scope is 'default'.
    try {
      UpsertInstrumentPropertiesResponse result = apiInstance.upsertInstrumentsProperties(upsertInstrumentPropertyRequest)
            .scope(scope)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **upsertInstrumentPropertyRequest** | [**List&lt;UpsertInstrumentPropertyRequest&gt;**](UpsertInstrumentPropertyRequest.md)| A list of instruments and associated instrument properties to create or update. | |
| **scope** | **String**| The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**UpsertInstrumentPropertiesResponse**](UpsertInstrumentPropertiesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The asAt datetime at which the properties were created or updated. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

