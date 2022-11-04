# AggregationApi

All URIs are relative to *https://www.lusid.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getValuation**](AggregationApi.md#getValuation) | **POST** /api/aggregation/$valuation | GetValuation: Perform valuation for a list of portfolios and/or portfolio groups
[**getValuationOfWeightedInstruments**](AggregationApi.md#getValuationOfWeightedInstruments) | **POST** /api/aggregation/$valuationinlined | GetValuationOfWeightedInstruments: Perform valuation for an inlined portfolio
[**supportedAnalyticsInternal**](AggregationApi.md#supportedAnalyticsInternal) | **POST** /api/aggregation/supportedanalyticsinternal | [INTERNAL] SupportedAnalyticsInternal: Generates a matrix of analytics features supported by LUSID.


<a name="getValuation"></a>
# **getValuation**
> ListAggregationResponse getValuation(valuationRequest)

GetValuation: Perform valuation for a list of portfolios and/or portfolio groups

Perform valuation on specified list of portfolio and/or portfolio groups for a set of dates.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AggregationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AggregationApi apiInstance = new AggregationApi(defaultClient);
    ValuationRequest valuationRequest = new ValuationRequest(); // ValuationRequest | The request specifying the set of portfolios and dates on which to calculate a set of valuation metrics
    try {
      ListAggregationResponse result = apiInstance.getValuation(valuationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AggregationApi#getValuation");
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
 **valuationRequest** | [**ValuationRequest**](ValuationRequest.md)| The request specifying the set of portfolios and dates on which to calculate a set of valuation metrics | [optional]

### Return type

[**ListAggregationResponse**](ListAggregationResponse.md)

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

<a name="getValuationOfWeightedInstruments"></a>
# **getValuationOfWeightedInstruments**
> ListAggregationResponse getValuationOfWeightedInstruments(inlineValuationRequest)

GetValuationOfWeightedInstruments: Perform valuation for an inlined portfolio

Perform valuation on the portfolio that is defined by the weighted set of instruments passed to the request.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AggregationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AggregationApi apiInstance = new AggregationApi(defaultClient);
    InlineValuationRequest inlineValuationRequest = new InlineValuationRequest(); // InlineValuationRequest | The request specifying the set of portfolios and dates on which to calculate a set of valuation metrics
    try {
      ListAggregationResponse result = apiInstance.getValuationOfWeightedInstruments(inlineValuationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AggregationApi#getValuationOfWeightedInstruments");
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
 **inlineValuationRequest** | [**InlineValuationRequest**](InlineValuationRequest.md)| The request specifying the set of portfolios and dates on which to calculate a set of valuation metrics | [optional]

### Return type

[**ListAggregationResponse**](ListAggregationResponse.md)

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

<a name="supportedAnalyticsInternal"></a>
# **supportedAnalyticsInternal**
> Aggregation supportedAnalyticsInternal(supportedAnalyticsInternalRequest)

[INTERNAL] SupportedAnalyticsInternal: Generates a matrix of analytics features supported by LUSID.

Breaks down, e.g. by model and instrument type, either feature groups (such as pv, accrued, risk, cashflows) that are supported or the specific address keys that are supported for them.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AggregationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AggregationApi apiInstance = new AggregationApi(defaultClient);
    SupportedAnalyticsInternalRequest supportedAnalyticsInternalRequest = new SupportedAnalyticsInternalRequest(); // SupportedAnalyticsInternalRequest | 
    try {
      Aggregation result = apiInstance.supportedAnalyticsInternal(supportedAnalyticsInternalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AggregationApi#supportedAnalyticsInternal");
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
 **supportedAnalyticsInternalRequest** | [**SupportedAnalyticsInternalRequest**](SupportedAnalyticsInternalRequest.md)|  | [optional]

### Return type

[**Aggregation**](Aggregation.md)

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

