# ReferencePortfolioApi

All URIs are relative to *http://local-unit-test-server.lusid.com:41106*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReferencePortfolio**](ReferencePortfolioApi.md#createReferencePortfolio) | **POST** /api/referenceportfolios/{scope} | Create reference portfolio
[**getReferencePortfolioConstituents**](ReferencePortfolioApi.md#getReferencePortfolioConstituents) | **GET** /api/referenceportfolios/{scope}/{code}/constituents | Get reference portfolio constituents
[**listConstituentsAdjustments**](ReferencePortfolioApi.md#listConstituentsAdjustments) | **GET** /api/referenceportfolios/{scope}/{code}/constituentsadjustments | List constituents adjustments
[**upsertReferencePortfolioConstituents**](ReferencePortfolioApi.md#upsertReferencePortfolioConstituents) | **POST** /api/referenceportfolios/{scope}/{code}/constituents | Upsert reference portfolio constituents


<a name="createReferencePortfolio"></a>
# **createReferencePortfolio**
> Portfolio createReferencePortfolio(scope, createReferencePortfolioRequest)

Create reference portfolio

Create a reference portfolio in a particular scope.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReferencePortfolioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:41106");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferencePortfolioApi apiInstance = new ReferencePortfolioApi(defaultClient);
    String scope = "scope_example"; // String | The scope in which to create the reference portfolio.
    CreateReferencePortfolioRequest createReferencePortfolioRequest = {"displayName":"MyPortfolioName","description":"Description of my portfolio","code":"MyPortfolioCode","created":"2018-03-05T00:00:00.0000000+00:00","properties":{}}; // CreateReferencePortfolioRequest | The definition of the reference portfolio.
    try {
      Portfolio result = apiInstance.createReferencePortfolio(scope, createReferencePortfolioRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencePortfolioApi#createReferencePortfolio");
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
 **scope** | **String**| The scope in which to create the reference portfolio. |
 **createReferencePortfolioRequest** | [**CreateReferencePortfolioRequest**](CreateReferencePortfolioRequest.md)| The definition of the reference portfolio. |

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
**201** | The created reference portfolio, with populated id |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getReferencePortfolioConstituents"></a>
# **getReferencePortfolioConstituents**
> GetReferencePortfolioConstituentsResponse getReferencePortfolioConstituents(scope, code, effectiveAt, asAt, propertyKeys)

Get reference portfolio constituents

Get constituents from a reference portfolio at a particular effective time.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReferencePortfolioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:41106");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferencePortfolioApi apiInstance = new ReferencePortfolioApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the reference portfolio.
    String code = "code_example"; // String | The code of the reference portfolio. Together with the scope this uniquely identifies              the reference portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective date of the constituents to retrieve. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve constituents. Defaults to return the latest version              of each constituent if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Instrument' or 'ReferenceHolding' domain to decorate onto              constituents. These take the format {domain}/{scope}/{code} e.g. 'Instrument/system/Name' or              'ReferenceHolding/strategy/quantsignal'. Defaults to return all available instrument and reference holding properties if not specified.
    try {
      GetReferencePortfolioConstituentsResponse result = apiInstance.getReferencePortfolioConstituents(scope, code, effectiveAt, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencePortfolioApi#getReferencePortfolioConstituents");
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
 **scope** | **String**| The scope of the reference portfolio. |
 **code** | **String**| The code of the reference portfolio. Together with the scope this uniquely identifies              the reference portfolio. |
 **effectiveAt** | **String**| The effective date of the constituents to retrieve. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve constituents. Defaults to return the latest version              of each constituent if not specified. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instrument&#39; or &#39;ReferenceHolding&#39; domain to decorate onto              constituents. These take the format {domain}/{scope}/{code} e.g. &#39;Instrument/system/Name&#39; or              &#39;ReferenceHolding/strategy/quantsignal&#39;. Defaults to return all available instrument and reference holding properties if not specified. | [optional]

### Return type

[**GetReferencePortfolioConstituentsResponse**](GetReferencePortfolioConstituentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested reference portfolio constituents |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listConstituentsAdjustments"></a>
# **listConstituentsAdjustments**
> ResourceListOfConstituentsAdjustmentHeader listConstituentsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAtTime)

List constituents adjustments

List adjustments made to constituents in a reference portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReferencePortfolioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:41106");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferencePortfolioApi apiInstance = new ReferencePortfolioApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the reference portfolio.
    String code = "code_example"; // String | The code of the reference portfolio. Together with the scope this uniquely identifies              the reference portfolio.
    String fromEffectiveAt = "fromEffectiveAt_example"; // String | Events between this time (inclusive) and the toEffectiveAt are returned.
    String toEffectiveAt = "toEffectiveAt_example"; // String | Events between this time (inclusive) and the fromEffectiveAt are returned.
    OffsetDateTime asAtTime = new OffsetDateTime(); // OffsetDateTime | The asAt time for which the result is valid.
    try {
      ResourceListOfConstituentsAdjustmentHeader result = apiInstance.listConstituentsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAtTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencePortfolioApi#listConstituentsAdjustments");
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
 **scope** | **String**| The scope of the reference portfolio. |
 **code** | **String**| The code of the reference portfolio. Together with the scope this uniquely identifies              the reference portfolio. |
 **fromEffectiveAt** | **String**| Events between this time (inclusive) and the toEffectiveAt are returned. |
 **toEffectiveAt** | **String**| Events between this time (inclusive) and the fromEffectiveAt are returned. |
 **asAtTime** | **OffsetDateTime**| The asAt time for which the result is valid. | [optional]

### Return type

[**ResourceListOfConstituentsAdjustmentHeader**](ResourceListOfConstituentsAdjustmentHeader.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertReferencePortfolioConstituents"></a>
# **upsertReferencePortfolioConstituents**
> UpsertReferencePortfolioConstituentsResponse upsertReferencePortfolioConstituents(scope, code, upsertReferencePortfolioConstituentsRequest)

Upsert reference portfolio constituents

Add constituents to a reference portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ReferencePortfolioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:41106");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferencePortfolioApi apiInstance = new ReferencePortfolioApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the reference portfolio.
    String code = "code_example"; // String | The code of the reference portfolio. Together with the scope this uniquely identifies              the reference portfolio.
    UpsertReferencePortfolioConstituentsRequest upsertReferencePortfolioConstituentsRequest = {"effectiveFrom":"2018-03-05T00:00:00.0000000+00:00","weightType":"Periodical","periodType":"Quarterly","periodCount":2,"constituents":[{"instrumentIdentifiers":{"instrument/default/Figi":"BBG0077GZM13","instrument/default/Isin":"GB00BH4HKS39"},"properties":{"portfolio/MyScope/MyPropertyKey":{"key":"Portfolio/MyScope/MyPropertyKey","value":{"metricValue":{"value":12345.5672,"unit":"Unit"}}}},"weight":100,"currency":"GBP"},{"instrumentIdentifiers":{"instrument/default/Figi":"BBG0077H2WN1","instrument/default/Isin":"US0378331005"},"properties":{},"weight":50,"currency":"USD"}]}; // UpsertReferencePortfolioConstituentsRequest | The constituents to upload to the reference portfolio.
    try {
      UpsertReferencePortfolioConstituentsResponse result = apiInstance.upsertReferencePortfolioConstituents(scope, code, upsertReferencePortfolioConstituentsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferencePortfolioApi#upsertReferencePortfolioConstituents");
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
 **scope** | **String**| The scope of the reference portfolio. |
 **code** | **String**| The code of the reference portfolio. Together with the scope this uniquely identifies              the reference portfolio. |
 **upsertReferencePortfolioConstituentsRequest** | [**UpsertReferencePortfolioConstituentsRequest**](UpsertReferencePortfolioConstituentsRequest.md)| The constituents to upload to the reference portfolio. |

### Return type

[**UpsertReferencePortfolioConstituentsResponse**](UpsertReferencePortfolioConstituentsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

