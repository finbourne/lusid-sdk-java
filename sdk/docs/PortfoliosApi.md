# PortfoliosApi

All URIs are relative to *https://www.lusid.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteKeyFromPortfolioAccessMetadata**](PortfoliosApi.md#deleteKeyFromPortfolioAccessMetadata) | **DELETE** /api/portfolios/{scope}/{code}/metadata/{metadataKey} | [EARLY ACCESS] DeleteKeyFromPortfolioAccessMetadata: Delete a Portfolio Access Metadata Rule
[**deletePortfolio**](PortfoliosApi.md#deletePortfolio) | **DELETE** /api/portfolios/{scope}/{code} | DeletePortfolio: Delete portfolio
[**deletePortfolioProperties**](PortfoliosApi.md#deletePortfolioProperties) | **DELETE** /api/portfolios/{scope}/{code}/properties | DeletePortfolioProperties: Delete portfolio properties
[**deletePortfolioReturns**](PortfoliosApi.md#deletePortfolioReturns) | **DELETE** /api/portfolios/{scope}/{code}/returns/{returnScope}/{returnCode}/$delete | [EARLY ACCESS] DeletePortfolioReturns: Delete Returns
[**getAggregatedReturnsDispersionMetrics**](PortfoliosApi.md#getAggregatedReturnsDispersionMetrics) | **POST** /api/portfolios/{scope}/{code}/returns/dispersion/$aggregated | [EARLY ACCESS] GetAggregatedReturnsDispersionMetrics: Get the Aggregated Returns Dispersion metric
[**getCompositeBreakdown**](PortfoliosApi.md#getCompositeBreakdown) | **POST** /api/portfolios/{scope}/{code}/returns/breakdown | [EARLY ACCESS] GetCompositeBreakdown: Get the Composite Breakdown on how the composite Returns are calculated
[**getPortfolio**](PortfoliosApi.md#getPortfolio) | **GET** /api/portfolios/{scope}/{code} | GetPortfolio: Get portfolio
[**getPortfolioAggregatedReturns**](PortfoliosApi.md#getPortfolioAggregatedReturns) | **POST** /api/portfolios/{scope}/{code}/returns/$aggregated | [EARLY ACCESS] GetPortfolioAggregatedReturns: Aggregated Returns
[**getPortfolioCommands**](PortfoliosApi.md#getPortfolioCommands) | **GET** /api/portfolios/{scope}/{code}/commands | GetPortfolioCommands: Get portfolio commands
[**getPortfolioMetadata**](PortfoliosApi.md#getPortfolioMetadata) | **GET** /api/portfolios/{scope}/{code}/metadata | [EARLY ACCESS] GetPortfolioMetadata: Get access metadata rules for a portfolio
[**getPortfolioProperties**](PortfoliosApi.md#getPortfolioProperties) | **GET** /api/portfolios/{scope}/{code}/properties | GetPortfolioProperties: Get portfolio properties
[**getPortfolioPropertyTimeSeries**](PortfoliosApi.md#getPortfolioPropertyTimeSeries) | **GET** /api/portfolios/{scope}/{code}/properties/time-series | [EARLY ACCESS] GetPortfolioPropertyTimeSeries: Get portfolio property time series
[**getPortfolioRelationships**](PortfoliosApi.md#getPortfolioRelationships) | **GET** /api/portfolios/{scope}/{code}/relationships | [EARLY ACCESS] GetPortfolioRelationships: Get portfolio relationships
[**getPortfolioReturns**](PortfoliosApi.md#getPortfolioReturns) | **GET** /api/portfolios/{scope}/{code}/returns/{returnScope}/{returnCode} | [EARLY ACCESS] GetPortfolioReturns: Get Returns
[**getPortfoliosAccessMetadataByKey**](PortfoliosApi.md#getPortfoliosAccessMetadataByKey) | **GET** /api/portfolios/{scope}/{code}/metadata/{metadataKey} | [EARLY ACCESS] GetPortfoliosAccessMetadataByKey: Get an entry identified by a metadataKey in the access metadata object
[**listPortfolioProperties**](PortfoliosApi.md#listPortfolioProperties) | **GET** /api/portfolios/{scope}/{code}/properties/list | [EARLY ACCESS] ListPortfolioProperties: Get portfolio properties
[**listPortfolios**](PortfoliosApi.md#listPortfolios) | **GET** /api/portfolios | ListPortfolios: List portfolios
[**listPortfoliosForScope**](PortfoliosApi.md#listPortfoliosForScope) | **GET** /api/portfolios/{scope} | ListPortfoliosForScope: List portfolios for scope
[**patchPortfolio**](PortfoliosApi.md#patchPortfolio) | **PATCH** /api/portfolios/{scope}/{code} | [EARLY ACCESS] PatchPortfolio: Patch portfolio.
[**patchPortfolioAccessMetadata**](PortfoliosApi.md#patchPortfolioAccessMetadata) | **PATCH** /api/portfolios/{scope}/{code}/metadata | [EARLY ACCESS] PatchPortfolioAccessMetadata: Patch Access Metadata rules for a Portfolio.
[**updatePortfolio**](PortfoliosApi.md#updatePortfolio) | **PUT** /api/portfolios/{scope}/{code} | UpdatePortfolio: Update portfolio
[**upsertPortfolioAccessMetadata**](PortfoliosApi.md#upsertPortfolioAccessMetadata) | **PUT** /api/portfolios/{scope}/{code}/metadata/{metadataKey} | [EARLY ACCESS] UpsertPortfolioAccessMetadata: Upsert a Portfolio Access Metadata Rule associated with specific metadataKey. This creates or updates the data in LUSID.
[**upsertPortfolioProperties**](PortfoliosApi.md#upsertPortfolioProperties) | **POST** /api/portfolios/{scope}/{code}/properties | UpsertPortfolioProperties: Upsert portfolio properties
[**upsertPortfolioReturns**](PortfoliosApi.md#upsertPortfolioReturns) | **POST** /api/portfolios/{scope}/{code}/returns/{returnScope}/{returnCode} | [EARLY ACCESS] UpsertPortfolioReturns: Upsert Returns


<a name="deleteKeyFromPortfolioAccessMetadata"></a>
# **deleteKeyFromPortfolioAccessMetadata**
> DeletedEntityResponse deleteKeyFromPortfolioAccessMetadata(scope, code, metadataKey, effectiveAt, effectiveUntil)

[EARLY ACCESS] DeleteKeyFromPortfolioAccessMetadata: Delete a Portfolio Access Metadata Rule

Delete the Portfolio Access Metadata Rule that exactly matches the provided identifier parts

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Quote Access Metadata Rule to retrieve.
    String code = "code_example"; // String | Portfolio code
    String metadataKey = "metadataKey_example"; // String | The metadataKey identifying the access metadata entry to delete
    String effectiveAt = "effectiveAt_example"; // String | The effective date to delete at, if this is not supplied, it will delete all data found
    OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' date of the Access Metadata
    try {
      DeletedEntityResponse result = apiInstance.deleteKeyFromPortfolioAccessMetadata(scope, code, metadataKey, effectiveAt, effectiveUntil);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#deleteKeyFromPortfolioAccessMetadata");
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
 **scope** | **String**| The scope of the Quote Access Metadata Rule to retrieve. |
 **code** | **String**| Portfolio code |
 **metadataKey** | **String**| The metadataKey identifying the access metadata entry to delete |
 **effectiveAt** | **String**| The effective date to delete at, if this is not supplied, it will delete all data found | [optional]
 **effectiveUntil** | **OffsetDateTime**| The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata | [optional]

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
**200** | The rule that has been deleted |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deletePortfolio"></a>
# **deletePortfolio**
> DeletedEntityResponse deletePortfolio(scope, code)

DeletePortfolio: Delete portfolio

Delete a particular portfolio.                The deletion will take effect from the portfolio&#39;s creation datetime. This means that the portfolio will no longer exist at any effective datetime, as per the asAt datetime of deletion.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio.
    String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
    try {
      DeletedEntityResponse result = apiInstance.deletePortfolio(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#deletePortfolio");
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
 **scope** | **String**| The scope of the portfolio. |
 **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. |

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
**200** | The datetime that the portfolio was deleted |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deletePortfolioProperties"></a>
# **deletePortfolioProperties**
> DeletedEntityResponse deletePortfolioProperties(scope, code, propertyKeys, effectiveAt)

DeletePortfolioProperties: Delete portfolio properties

Delete one or more properties from a particular portfolio. If the properties are time-variant then an effective datetime from which  to delete properties must be specified. If the properties are perpetual then it is invalid to specify an effective datetime for deletion.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio.
    String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
    List<String> propertyKeys = Arrays.asList(); // List<String> | The property keys of the properties to delete. These must take the format              {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'. Each property must be from the 'Portfolio' domain.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to delete time-variant properties from.              The property must exist at the specified 'effectiveAt' datetime. If the 'effectiveAt' is not provided or is              before the time-variant property exists then a failure is returned. Do not specify this parameter if any of              the properties to delete are perpetual.
    try {
      DeletedEntityResponse result = apiInstance.deletePortfolioProperties(scope, code, propertyKeys, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#deletePortfolioProperties");
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
 **scope** | **String**| The scope of the portfolio. |
 **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. |
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| The property keys of the properties to delete. These must take the format              {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. Each property must be from the &#39;Portfolio&#39; domain. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to delete time-variant properties from.              The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is              before the time-variant property exists then a failure is returned. Do not specify this parameter if any of              the properties to delete are perpetual. | [optional]

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
**200** | The datetime that the properties were deleted from the specified portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deletePortfolioReturns"></a>
# **deletePortfolioReturns**
> DeletedEntityResponse deletePortfolioReturns(scope, code, returnScope, returnCode, fromEffectiveAt, toEffectiveAt, period)

[EARLY ACCESS] DeletePortfolioReturns: Delete Returns

Cancel one or more Returns which exist into the specified portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Portfolio.
    String code = "code_example"; // String | The code of the  Portfolio.
    String returnScope = "returnScope_example"; // String | The scope of the Returns.
    String returnCode = "returnCode_example"; // String | The code of the Returns.
    String fromEffectiveAt = "fromEffectiveAt_example"; // String | The start date from which to delete the Returns.
    String toEffectiveAt = "toEffectiveAt_example"; // String | The end date from which to delete the Returns.
    String period = "period_example"; // String | The Period (Daily or Monthly) of the Returns to be deleted. Defaults to Daily.
    try {
      DeletedEntityResponse result = apiInstance.deletePortfolioReturns(scope, code, returnScope, returnCode, fromEffectiveAt, toEffectiveAt, period);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#deletePortfolioReturns");
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
 **scope** | **String**| The scope of the Portfolio. |
 **code** | **String**| The code of the  Portfolio. |
 **returnScope** | **String**| The scope of the Returns. |
 **returnCode** | **String**| The code of the Returns. |
 **fromEffectiveAt** | **String**| The start date from which to delete the Returns. |
 **toEffectiveAt** | **String**| The end date from which to delete the Returns. |
 **period** | **String**| The Period (Daily or Monthly) of the Returns to be deleted. Defaults to Daily. | [optional]

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
**200** | The successfully deleted Returns data along with any failures |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getAggregatedReturnsDispersionMetrics"></a>
# **getAggregatedReturnsDispersionMetrics**
> CompositeDispersionResponse getAggregatedReturnsDispersionMetrics(scope, code, aggregatedReturnsDispersionRequest, asAt)

[EARLY ACCESS] GetAggregatedReturnsDispersionMetrics: Get the Aggregated Returns Dispersion metric

Calculate the dispersion metric with the Aggregate Returns which are on the specified portfolio.             This works only for composites which have at least 6 constituents for a full year in.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Portfolio.
    String code = "code_example"; // String | The code of the  Portfolio.
    AggregatedReturnsDispersionRequest aggregatedReturnsDispersionRequest = new AggregatedReturnsDispersionRequest(); // AggregatedReturnsDispersionRequest | The request used in the AggregatedReturnsDispersionMetric.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Returns. Defaults to the latest.
    try {
      CompositeDispersionResponse result = apiInstance.getAggregatedReturnsDispersionMetrics(scope, code, aggregatedReturnsDispersionRequest, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getAggregatedReturnsDispersionMetrics");
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
 **scope** | **String**| The scope of the Portfolio. |
 **code** | **String**| The code of the  Portfolio. |
 **aggregatedReturnsDispersionRequest** | [**AggregatedReturnsDispersionRequest**](AggregatedReturnsDispersionRequest.md)| The request used in the AggregatedReturnsDispersionMetric. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Returns. Defaults to the latest. | [optional]

### Return type

[**CompositeDispersionResponse**](CompositeDispersionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The aggregated returns grouped by return stream. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getCompositeBreakdown"></a>
# **getCompositeBreakdown**
> CompositeBreakdownResponse getCompositeBreakdown(scope, code, compositeBreakdownRequest, fromEffectiveAt, toEffectiveAt, asAt)

[EARLY ACCESS] GetCompositeBreakdown: Get the Composite Breakdown on how the composite Returns are calculated

Calculate the Composite Returns and return this with the constituents which are included in this calculation

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Portfolio.
    String code = "code_example"; // String | The code of the  Portfolio.
    CompositeBreakdownRequest compositeBreakdownRequest = new CompositeBreakdownRequest(); // CompositeBreakdownRequest | The request used in the GetCompositeBreakdown.
    String fromEffectiveAt = "fromEffectiveAt_example"; // String | The start date from which to calculate the Returns.
    String toEffectiveAt = "toEffectiveAt_example"; // String | The end date for which to calculate the Returns.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Returns. Defaults to the latest.
    try {
      CompositeBreakdownResponse result = apiInstance.getCompositeBreakdown(scope, code, compositeBreakdownRequest, fromEffectiveAt, toEffectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getCompositeBreakdown");
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
 **scope** | **String**| The scope of the Portfolio. |
 **code** | **String**| The code of the  Portfolio. |
 **compositeBreakdownRequest** | [**CompositeBreakdownRequest**](CompositeBreakdownRequest.md)| The request used in the GetCompositeBreakdown. |
 **fromEffectiveAt** | **String**| The start date from which to calculate the Returns. | [optional]
 **toEffectiveAt** | **String**| The end date for which to calculate the Returns. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Returns. Defaults to the latest. | [optional]

### Return type

[**CompositeBreakdownResponse**](CompositeBreakdownResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The aggregated returns grouped by return stream. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolio"></a>
# **getPortfolio**
> Portfolio getPortfolio(scope, code, effectiveAt, asAt, propertyKeys, relationshipDefinitionIds)

GetPortfolio: Get portfolio

Retrieve the definition of a particular portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio.
    String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the portfolio definition. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio definition. Defaults to returning the latest version of the portfolio definition if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Portfolio' domain to decorate onto the portfolio,              or from any domain that supports relationships to decorate onto related entities. These must take the format              {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'.
    List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities              onto the portfolio in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
    try {
      Portfolio result = apiInstance.getPortfolio(scope, code, effectiveAt, asAt, propertyKeys, relationshipDefinitionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getPortfolio");
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
 **scope** | **String**| The scope of the portfolio. |
 **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the portfolio definition. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio definition. Defaults to returning the latest version of the portfolio definition if not specified. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Portfolio&#39; domain to decorate onto the portfolio,              or from any domain that supports relationships to decorate onto related entities. These must take the format              {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. | [optional]
 **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities              onto the portfolio in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested portfolio definition |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioAggregatedReturns"></a>
# **getPortfolioAggregatedReturns**
> AggregatedReturnsResponse getPortfolioAggregatedReturns(scope, code, aggregatedReturnsRequest, fromEffectiveAt, toEffectiveAt, asAt)

[EARLY ACCESS] GetPortfolioAggregatedReturns: Aggregated Returns

Aggregate Returns which are on the specified portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Portfolio.
    String code = "code_example"; // String | The code of the  Portfolio.
    AggregatedReturnsRequest aggregatedReturnsRequest = new AggregatedReturnsRequest(); // AggregatedReturnsRequest | The request used in the AggregatedReturns.
    String fromEffectiveAt = "fromEffectiveAt_example"; // String | The start date from which to calculate the Returns.
    String toEffectiveAt = "toEffectiveAt_example"; // String | The end date for which to calculate the Returns.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Returns. Defaults to the latest.
    try {
      AggregatedReturnsResponse result = apiInstance.getPortfolioAggregatedReturns(scope, code, aggregatedReturnsRequest, fromEffectiveAt, toEffectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getPortfolioAggregatedReturns");
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
 **scope** | **String**| The scope of the Portfolio. |
 **code** | **String**| The code of the  Portfolio. |
 **aggregatedReturnsRequest** | [**AggregatedReturnsRequest**](AggregatedReturnsRequest.md)| The request used in the AggregatedReturns. |
 **fromEffectiveAt** | **String**| The start date from which to calculate the Returns. | [optional]
 **toEffectiveAt** | **String**| The end date for which to calculate the Returns. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Returns. Defaults to the latest. | [optional]

### Return type

[**AggregatedReturnsResponse**](AggregatedReturnsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The aggregated returns grouped by return stream. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioCommands"></a>
# **getPortfolioCommands**
> ResourceListOfProcessedCommand getPortfolioCommands(scope, code, fromAsAt, toAsAt, filter, page, limit)

GetPortfolioCommands: Get portfolio commands

Get all the commands that modified a particular portfolio, including any input transactions.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio.
    String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
    OffsetDateTime fromAsAt = OffsetDateTime.now(); // OffsetDateTime | The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified.
    OffsetDateTime toAsAt = OffsetDateTime.now(); // OffsetDateTime | The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified.
    String filter = "filter_example"; // String | Expression to filter the results.              For example, to filter on the User ID, specify \"userId.id eq 'string'\".              For more information about filtering, see https://support.lusid.com/knowledgebase/article/KA-01914.
    String page = "page_example"; // String | The pagination token to use to continue listing commands; this value is returned from the previous call.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 500 if not specified.
    try {
      ResourceListOfProcessedCommand result = apiInstance.getPortfolioCommands(scope, code, fromAsAt, toAsAt, filter, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getPortfolioCommands");
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
 **scope** | **String**| The scope of the portfolio. |
 **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. |
 **fromAsAt** | **OffsetDateTime**| The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified. | [optional]
 **toAsAt** | **OffsetDateTime**| The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified. | [optional]
 **filter** | **String**| Expression to filter the results.              For example, to filter on the User ID, specify \&quot;userId.id eq &#39;string&#39;\&quot;.              For more information about filtering, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional]
 **page** | **String**| The pagination token to use to continue listing commands; this value is returned from the previous call. | [optional]
 **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 500 if not specified. | [optional]

### Return type

[**ResourceListOfProcessedCommand**](ResourceListOfProcessedCommand.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The commands that modified the specified portfolio. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioMetadata"></a>
# **getPortfolioMetadata**
> Map&lt;String, List&lt;AccessMetadataValue&gt;&gt; getPortfolioMetadata(scope, code, effectiveAt, asAt)

[EARLY ACCESS] GetPortfolioMetadata: Get access metadata rules for a portfolio

Pass the scope and portfolio code parameters to retrieve the AccessMetadata associated with a portfolio

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Portfolio Access Metadata Rule to retrieve.
    String code = "code_example"; // String | Portfolio code
    String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to retrieve the access metadata rule.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio access metadata.
    try {
      Map<String, List<AccessMetadataValue>> result = apiInstance.getPortfolioMetadata(scope, code, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getPortfolioMetadata");
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
 **scope** | **String**| The scope of the Portfolio Access Metadata Rule to retrieve. |
 **code** | **String**| Portfolio code |
 **effectiveAt** | **String**| The effectiveAt datetime at which to retrieve the access metadata rule. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio access metadata. | [optional]

### Return type

[**Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;**](List.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The filtered list of results |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioProperties"></a>
# **getPortfolioProperties**
> PortfolioProperties getPortfolioProperties(scope, code, effectiveAt, asAt)

GetPortfolioProperties: Get portfolio properties

List all the properties of a particular portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio.
    String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the portfolio's properties. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the portfolio's properties. Defaults to returning the latest version of each property if not specified.
    try {
      PortfolioProperties result = apiInstance.getPortfolioProperties(scope, code, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getPortfolioProperties");
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
 **scope** | **String**| The scope of the portfolio. |
 **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to list the portfolio&#39;s properties. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolio&#39;s properties. Defaults to returning the latest version of each property if not specified. | [optional]

### Return type

[**PortfolioProperties**](PortfolioProperties.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The properties of the specified portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioPropertyTimeSeries"></a>
# **getPortfolioPropertyTimeSeries**
> ResourceListOfPropertyInterval getPortfolioPropertyTimeSeries(scope, code, propertyKey, portfolioEffectiveAt, asAt, filter, page, limit)

[EARLY ACCESS] GetPortfolioPropertyTimeSeries: Get portfolio property time series

Show the complete time series (history) for a particular portfolio property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio.
    String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
    String propertyKey = "propertyKey_example"; // String | The property key of the property whose history to show.              This must be from the 'Portfolio' domain and in the format {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'.
    String portfolioEffectiveAt = "portfolioEffectiveAt_example"; // String | The effective datetime used to resolve the portfolio. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to show the history. Defaults to returning the current datetime if not supplied.
    String filter = "filter_example"; // String | Expression to filter the results. For more information about filtering,              see https://support.lusid.com/knowledgebase/article/KA-01914.
    String page = "page_example"; // String | The pagination token to use to continue listing properties; this value is returned from              the previous call. If a pagination token is provided, the filter, portfolioEffectiveAt, and asAt fields              must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the results to this number.
    try {
      ResourceListOfPropertyInterval result = apiInstance.getPortfolioPropertyTimeSeries(scope, code, propertyKey, portfolioEffectiveAt, asAt, filter, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getPortfolioPropertyTimeSeries");
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
 **scope** | **String**| The scope of the portfolio. |
 **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. |
 **propertyKey** | **String**| The property key of the property whose history to show.              This must be from the &#39;Portfolio&#39; domain and in the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. |
 **portfolioEffectiveAt** | **String**| The effective datetime used to resolve the portfolio. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to show the history. Defaults to returning the current datetime if not supplied. | [optional]
 **filter** | **String**| Expression to filter the results. For more information about filtering,              see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional]
 **page** | **String**| The pagination token to use to continue listing properties; this value is returned from              the previous call. If a pagination token is provided, the filter, portfolioEffectiveAt, and asAt fields              must not have changed since the original request. | [optional]
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

<a name="getPortfolioRelationships"></a>
# **getPortfolioRelationships**
> ResourceListOfRelationship getPortfolioRelationships(scope, code, effectiveAt, asAt, filter, identifierTypes)

[EARLY ACCESS] GetPortfolioRelationships: Get portfolio relationships

Get relationships for a particular portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio.
    String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve relationships. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve relationships. Defaults to returning the latest LUSID AsAt time if not specified.
    String filter = "filter_example"; // String | Expression to filter the relationships. Provide a null or empty string for this field until further notice.
    List<String> identifierTypes = Arrays.asList(); // List<String> | Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the 'Person' or 'LegalEntity' domains and have the format {domain}/{scope}/{code}, for example              'Person/CompanyDetails/Role'. An Empty array may be used to return all related Entities.
    try {
      ResourceListOfRelationship result = apiInstance.getPortfolioRelationships(scope, code, effectiveAt, asAt, filter, identifierTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getPortfolioRelationships");
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
 **scope** | **String**| The scope of the portfolio. |
 **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve relationships. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve relationships. Defaults to returning the latest LUSID AsAt time if not specified. | [optional]
 **filter** | **String**| Expression to filter the relationships. Provide a null or empty string for this field until further notice. | [optional]
 **identifierTypes** | [**List&lt;String&gt;**](String.md)| Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example              &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. | [optional]

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
**200** | The relationships for the specified portfolio. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioReturns"></a>
# **getPortfolioReturns**
> ResourceListOfPerformanceReturn getPortfolioReturns(scope, code, returnScope, returnCode, fromEffectiveAt, toEffectiveAt, period, asAt)

[EARLY ACCESS] GetPortfolioReturns: Get Returns

Get Returns which are on the specified portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Portfolio.
    String code = "code_example"; // String | The code of the  Portfolio.
    String returnScope = "returnScope_example"; // String | The scope of the Returns.
    String returnCode = "returnCode_example"; // String | The code of the Returns.
    String fromEffectiveAt = "fromEffectiveAt_example"; // String | The start date from which to get the Returns.
    String toEffectiveAt = "toEffectiveAt_example"; // String | The end date from which to get the Returns.
    String period = "period_example"; // String | Show the Returns on a Daily or Monthly period. Defaults to Daily.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Returns. Defaults to the latest.
    try {
      ResourceListOfPerformanceReturn result = apiInstance.getPortfolioReturns(scope, code, returnScope, returnCode, fromEffectiveAt, toEffectiveAt, period, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getPortfolioReturns");
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
 **scope** | **String**| The scope of the Portfolio. |
 **code** | **String**| The code of the  Portfolio. |
 **returnScope** | **String**| The scope of the Returns. |
 **returnCode** | **String**| The code of the Returns. |
 **fromEffectiveAt** | **String**| The start date from which to get the Returns. | [optional]
 **toEffectiveAt** | **String**| The end date from which to get the Returns. | [optional]
 **period** | **String**| Show the Returns on a Daily or Monthly period. Defaults to Daily. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Returns. Defaults to the latest. | [optional]

### Return type

[**ResourceListOfPerformanceReturn**](ResourceListOfPerformanceReturn.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Returns on the given time period. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfoliosAccessMetadataByKey"></a>
# **getPortfoliosAccessMetadataByKey**
> List&lt;AccessMetadataValue&gt; getPortfoliosAccessMetadataByKey(scope, code, metadataKey, effectiveAt, asAt)

[EARLY ACCESS] GetPortfoliosAccessMetadataByKey: Get an entry identified by a metadataKey in the access metadata object

Get a specific portfolio access metadata rule by specifying the corresponding identifier parts                No matching will be performed through this endpoint. To retrieve a rule, it is necessary to specify, exactly, the identifier of the rule

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Portfolio Access Metadata Rule to retrieve.
    String code = "code_example"; // String | The code of the portfolio
    String metadataKey = "metadataKey_example"; // String | Key of the metadata to retrieve
    String effectiveAt = "effectiveAt_example"; // String | The effective date of the rule
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio access metadata.
    try {
      List<AccessMetadataValue> result = apiInstance.getPortfoliosAccessMetadataByKey(scope, code, metadataKey, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#getPortfoliosAccessMetadataByKey");
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
 **scope** | **String**| The scope of the Portfolio Access Metadata Rule to retrieve. |
 **code** | **String**| The code of the portfolio |
 **metadataKey** | **String**| Key of the metadata to retrieve |
 **effectiveAt** | **String**| The effective date of the rule | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio access metadata. | [optional]

### Return type

[**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The successfully retrieved Portfolio Access Metadata Rule or any failure |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listPortfolioProperties"></a>
# **listPortfolioProperties**
> ResourceListOfProperty listPortfolioProperties(scope, code, effectiveAt, asAt, page, limit)

[EARLY ACCESS] ListPortfolioProperties: Get portfolio properties

List all the properties of a particular portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio.
    String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the portfolio's properties. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the portfolio's properties. Defaults to returning the latest version of each property if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing commands; this value is returned from the previous call.
    Integer limit = 56; // Integer | When paginating, limit the results per page to this number.
    try {
      ResourceListOfProperty result = apiInstance.listPortfolioProperties(scope, code, effectiveAt, asAt, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#listPortfolioProperties");
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
 **scope** | **String**| The scope of the portfolio. |
 **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to list the portfolio&#39;s properties. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolio&#39;s properties. Defaults to returning the latest version of each property if not specified. | [optional]
 **page** | **String**| The pagination token to use to continue listing commands; this value is returned from the previous call. | [optional]
 **limit** | **Integer**| When paginating, limit the results per page to this number. | [optional]

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
**200** | The properties of the specified portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listPortfolios"></a>
# **listPortfolios**
> ResourceListOfPortfolio listPortfolios(effectiveAt, asAt, page, start, limit, filter, sortBy, query, propertyKeys, relationshipDefinitionIds)

ListPortfolios: List portfolios

List all the portfolios matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the portfolios. Defaults to the current LUSID              system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the portfolios. Defaults to returning the latest version              of each portfolio if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing portfolios; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.              For example, to filter on the transaction type, specify \"type eq 'Transaction'\". For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
    String query = "query_example"; // String | Expression specifying the criteria that the returned portfolios must meet. For example, to see which              portfolios have holdings in instruments with a LusidInstrumentId (LUID) of 'LUID_PPA8HI6M' or a Figi of 'BBG000BLNNH6',              specify \"instrument.identifiers in (('LusidInstrumentId', 'LUID_PPA8HI6M'), ('Figi', 'BBG000BLNNH6'))\".
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Portfolio' domain to decorate onto each portfolio,              or from any domain that supports relationships to decorate onto related entities. These must take the              format {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'.
    List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities              onto the portfolios in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
    try {
      ResourceListOfPortfolio result = apiInstance.listPortfolios(effectiveAt, asAt, page, start, limit, filter, sortBy, query, propertyKeys, relationshipDefinitionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#listPortfolios");
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
 **effectiveAt** | **String**| The effective datetime or cut label at which to list the portfolios. Defaults to the current LUSID              system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolios. Defaults to returning the latest version              of each portfolio if not specified. | [optional]
 **page** | **String**| The pagination token to use to continue listing portfolios; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional]
 **start** | **Integer**| When paginating, skip this number of results. | [optional]
 **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional]
 **filter** | **String**| Expression to filter the results.              For example, to filter on the transaction type, specify \&quot;type eq &#39;Transaction&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional]
 **query** | **String**| Expression specifying the criteria that the returned portfolios must meet. For example, to see which              portfolios have holdings in instruments with a LusidInstrumentId (LUID) of &#39;LUID_PPA8HI6M&#39; or a Figi of &#39;BBG000BLNNH6&#39;,              specify \&quot;instrument.identifiers in ((&#39;LusidInstrumentId&#39;, &#39;LUID_PPA8HI6M&#39;), (&#39;Figi&#39;, &#39;BBG000BLNNH6&#39;))\&quot;. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Portfolio&#39; domain to decorate onto each portfolio,              or from any domain that supports relationships to decorate onto related entities. These must take the              format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. | [optional]
 **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities              onto the portfolios in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional]

### Return type

[**ResourceListOfPortfolio**](ResourceListOfPortfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested portfolios |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listPortfoliosForScope"></a>
# **listPortfoliosForScope**
> ResourceListOfPortfolio listPortfoliosForScope(scope, effectiveAt, asAt, page, start, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds)

ListPortfoliosForScope: List portfolios for scope

List all the portfolios in a particular scope.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope whose portfolios to list.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the portfolios. Defaults to the current LUSID              system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the portfolios. Defaults to returning the latest version              of each portfolio if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing portfolios. This  value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt  and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.              For example, to return only transactions with a transaction type of 'Buy', specify \"type eq 'Buy'\".              For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Portfolio' domain to decorate onto each portfolio,              or from any domain that supports relationships to decorate onto related entities. These must take the              format {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'.
    List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities              onto the portfolios in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
    try {
      ResourceListOfPortfolio result = apiInstance.listPortfoliosForScope(scope, effectiveAt, asAt, page, start, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#listPortfoliosForScope");
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
 **scope** | **String**| The scope whose portfolios to list. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to list the portfolios. Defaults to the current LUSID              system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolios. Defaults to returning the latest version              of each portfolio if not specified. | [optional]
 **page** | **String**| The pagination token to use to continue listing portfolios. This  value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt  and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional]
 **start** | **Integer**| When paginating, skip this number of results. | [optional]
 **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional]
 **filter** | **String**| Expression to filter the results.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Portfolio&#39; domain to decorate onto each portfolio,              or from any domain that supports relationships to decorate onto related entities. These must take the              format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. | [optional]
 **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities              onto the portfolios in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional]

### Return type

[**ResourceListOfPortfolio**](ResourceListOfPortfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The portfolios in the specified scope |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="patchPortfolio"></a>
# **patchPortfolio**
> ActionResultOfPortfolio patchPortfolio(scope, code, operation)

[EARLY ACCESS] PatchPortfolio: Patch portfolio.

Create or update certain fields for a particular  portfolio.  The behaviour is defined by the JSON Patch specification.                Currently supported are: CreationDate, InstrumentScopes.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio.
    String code = "code_example"; // String | The code of the portfolio. Together with the               scope this uniquely identifies the portfolio.
    List<Operation> operation = Arrays.asList(); // List<Operation> | The json patch document. For more check: https://datatracker.ietf.org/doc/html/rfc6902.
    try {
      ActionResultOfPortfolio result = apiInstance.patchPortfolio(scope, code, operation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#patchPortfolio");
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
 **scope** | **String**| The scope of the portfolio. |
 **code** | **String**| The code of the portfolio. Together with the               scope this uniquely identifies the portfolio. |
 **operation** | [**List&lt;Operation&gt;**](Operation.md)| The json patch document. For more check: https://datatracker.ietf.org/doc/html/rfc6902. |

### Return type

[**ActionResultOfPortfolio**](ActionResultOfPortfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The newly patched portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="patchPortfolioAccessMetadata"></a>
# **patchPortfolioAccessMetadata**
> Map&lt;String, List&lt;AccessMetadataValue&gt;&gt; patchPortfolioAccessMetadata(scope, code, accessMetadataOperation, effectiveAt, effectiveUntil)

[EARLY ACCESS] PatchPortfolioAccessMetadata: Patch Access Metadata rules for a Portfolio.

Patch Portfolio Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.                Currently only &#39;add&#39; is a supported operation on the patch document.    Currently only valid metadata keys are supported paths on the patch document.    The response will return any affected Portfolio Access Metadata rules or a failure message if unsuccessful.    It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Portfolio Access Metadata Rule.
    String code = "code_example"; // String | Portfolio code
    List<AccessMetadataOperation> accessMetadataOperation = Arrays.asList(); // List<AccessMetadataOperation> | The Json Patch document
    String effectiveAt = "effectiveAt_example"; // String | The date this rule will effective from
    OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' date of the Access Metadata
    try {
      Map<String, List<AccessMetadataValue>> result = apiInstance.patchPortfolioAccessMetadata(scope, code, accessMetadataOperation, effectiveAt, effectiveUntil);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#patchPortfolioAccessMetadata");
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
 **scope** | **String**| The scope of the Portfolio Access Metadata Rule. |
 **code** | **String**| Portfolio code |
 **accessMetadataOperation** | [**List&lt;AccessMetadataOperation&gt;**](AccessMetadataOperation.md)| The Json Patch document |
 **effectiveAt** | **String**| The date this rule will effective from | [optional]
 **effectiveUntil** | **OffsetDateTime**| The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata | [optional]

### Return type

[**Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;**](List.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The successfully patched items. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="updatePortfolio"></a>
# **updatePortfolio**
> Portfolio updatePortfolio(scope, code, updatePortfolioRequest, effectiveAt)

UpdatePortfolio: Update portfolio

Update the definition of a particular portfolio.                Note that not all elements of a portfolio definition are  modifiable due to the potential implications for data already stored.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio.
    String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
    UpdatePortfolioRequest updatePortfolioRequest = new UpdatePortfolioRequest(); // UpdatePortfolioRequest | The updated portfolio definition.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to update the definition. Defaults to the current               LUSID system datetime if not specified.
    try {
      Portfolio result = apiInstance.updatePortfolio(scope, code, updatePortfolioRequest, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#updatePortfolio");
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
 **scope** | **String**| The scope of the portfolio. |
 **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. |
 **updatePortfolioRequest** | [**UpdatePortfolioRequest**](UpdatePortfolioRequest.md)| The updated portfolio definition. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to update the definition. Defaults to the current               LUSID system datetime if not specified. | [optional]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The updated definition of the portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertPortfolioAccessMetadata"></a>
# **upsertPortfolioAccessMetadata**
> ResourceListOfAccessMetadataValueOf upsertPortfolioAccessMetadata(scope, code, metadataKey, upsertPortfolioAccessMetadataRequest, effectiveAt, effectiveUntil)

[EARLY ACCESS] UpsertPortfolioAccessMetadata: Upsert a Portfolio Access Metadata Rule associated with specific metadataKey. This creates or updates the data in LUSID.

Update or insert one Portfolio Access Metadata Rule in a single scope. An item will be updated if it already exists  and inserted if it does not.    The response will return the successfully updated or inserted Portfolio Access Metadata Rule or failure message if unsuccessful    It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exists with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope to use when updating or inserting the Portfolio Access Metadata Rule.
    String code = "code_example"; // String | Portfolio code
    String metadataKey = "metadataKey_example"; // String | Key of the access metadata to upsert
    UpsertPortfolioAccessMetadataRequest upsertPortfolioAccessMetadataRequest = new UpsertPortfolioAccessMetadataRequest(); // UpsertPortfolioAccessMetadataRequest | The Portfolio Access Metadata Rule to update or insert
    String effectiveAt = "effectiveAt_example"; // String | The date this rule will effective from
    OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' date of the Access Metadata
    try {
      ResourceListOfAccessMetadataValueOf result = apiInstance.upsertPortfolioAccessMetadata(scope, code, metadataKey, upsertPortfolioAccessMetadataRequest, effectiveAt, effectiveUntil);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#upsertPortfolioAccessMetadata");
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
 **scope** | **String**| The scope to use when updating or inserting the Portfolio Access Metadata Rule. |
 **code** | **String**| Portfolio code |
 **metadataKey** | **String**| Key of the access metadata to upsert |
 **upsertPortfolioAccessMetadataRequest** | [**UpsertPortfolioAccessMetadataRequest**](UpsertPortfolioAccessMetadataRequest.md)| The Portfolio Access Metadata Rule to update or insert |
 **effectiveAt** | **String**| The date this rule will effective from | [optional]
 **effectiveUntil** | **OffsetDateTime**| The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata | [optional]

### Return type

[**ResourceListOfAccessMetadataValueOf**](ResourceListOfAccessMetadataValueOf.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The successfully updated or inserted item or any failure |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertPortfolioProperties"></a>
# **upsertPortfolioProperties**
> PortfolioProperties upsertPortfolioProperties(scope, code, requestBody)

UpsertPortfolioProperties: Upsert portfolio properties

Create or update one or more properties for a particular portfolio. A property is updated if it  already exists and created if it does not. All properties must be from the &#39;Portfolio&#39; domain.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime from which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which it is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio.
    String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
    Map<String, Property> requestBody = new HashMap(); // Map<String, Property> | The properties to be created or updated. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code}, for example               'Portfolio/Manager/Id'.
    try {
      PortfolioProperties result = apiInstance.upsertPortfolioProperties(scope, code, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#upsertPortfolioProperties");
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
 **scope** | **String**| The scope of the portfolio. |
 **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. |
 **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be created or updated. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code}, for example               &#39;Portfolio/Manager/Id&#39;. |

### Return type

[**PortfolioProperties**](PortfolioProperties.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The updated or inserted properties |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertPortfolioReturns"></a>
# **upsertPortfolioReturns**
> UpsertReturnsResponse upsertPortfolioReturns(scope, code, returnScope, returnCode, performanceReturn)

[EARLY ACCESS] UpsertPortfolioReturns: Upsert Returns

Update or insert returns into the specified portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Portfolio.
    String code = "code_example"; // String | The code of the  Portfolio.
    String returnScope = "returnScope_example"; // String | The scope of the Returns.
    String returnCode = "returnCode_example"; // String | The code of the Returns.
    List<PerformanceReturn> performanceReturn = Arrays.asList(); // List<PerformanceReturn> | This contains the Returns which need to be upsert.
    try {
      UpsertReturnsResponse result = apiInstance.upsertPortfolioReturns(scope, code, returnScope, returnCode, performanceReturn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfoliosApi#upsertPortfolioReturns");
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
 **scope** | **String**| The scope of the Portfolio. |
 **code** | **String**| The code of the  Portfolio. |
 **returnScope** | **String**| The scope of the Returns. |
 **returnCode** | **String**| The code of the Returns. |
 **performanceReturn** | [**List&lt;PerformanceReturn&gt;**](PerformanceReturn.md)| This contains the Returns which need to be upsert. |

### Return type

[**UpsertReturnsResponse**](UpsertReturnsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The version of the portfolio that contains the newly updated or inserted Returns. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

