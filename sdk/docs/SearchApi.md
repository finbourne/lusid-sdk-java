# SearchApi

All URIs are relative to *http://local-unit-test-server.lusid.com:60805*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchPortfolioGroups**](SearchApi.md#searchPortfolioGroups) | **GET** /api/search/portfoliogroups | [EARLY ACCESS] Search Portfolio Groups
[**searchPortfolios**](SearchApi.md#searchPortfolios) | **GET** /api/search/portfolios | [EARLY ACCESS] Search Portfolios
[**searchProperties**](SearchApi.md#searchProperties) | **GET** /api/search/propertydefinitions | [EARLY ACCESS] Search Property Definitions


<a name="searchPortfolioGroups"></a>
# **searchPortfolioGroups**
> PagedResourceListOfPortfolioGroupSearchResult searchPortfolioGroups(search, filter, sortBy, limit, page)

[EARLY ACCESS] Search Portfolio Groups

Search through all portfolio groups

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:60805");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchApi apiInstance = new SearchApi(defaultClient);
    String search = "search_example"; // String | A parameter used for searching any portfolio group field. Wildcards(*) are supported at the end of words (e.g. 'Port*'). Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the Scope, use \"id.scope eq 'string'\"  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    String sortBy = "sortBy_example"; // String | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName
    Integer limit = 56; // Integer | When paginating, only return this number of records
    String page = "page_example"; // String | Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter, sortby and search fields should not be supplied.
    try {
      PagedResourceListOfPortfolioGroupSearchResult result = apiInstance.searchPortfolioGroups(search, filter, sortBy, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchPortfolioGroups");
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
 **search** | **String**| A parameter used for searching any portfolio group field. Wildcards(*) are supported at the end of words (e.g. &#39;Port*&#39;). Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **filter** | **String**| Expression to filter the result set.   For example, to filter on the Scope, use \&quot;id.scope eq &#39;string&#39;\&quot;  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **sortBy** | **String**| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName | [optional]
 **limit** | **Integer**| When paginating, only return this number of records | [optional]
 **page** | **String**| Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter, sortby and search fields should not be supplied. | [optional]

### Return type

[**PagedResourceListOfPortfolioGroupSearchResult**](PagedResourceListOfPortfolioGroupSearchResult.md)

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

<a name="searchPortfolios"></a>
# **searchPortfolios**
> PagedResourceListOfPortfolioSearchResult searchPortfolios(search, filter, sortBy, limit, page)

[EARLY ACCESS] Search Portfolios

Search through all portfolios

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:60805");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchApi apiInstance = new SearchApi(defaultClient);
    String search = "search_example"; // String | A parameter used for searching any portfolio field. Wildcards(*) are supported at the end of words (e.g. 'Port*'). Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the portfolio Type, use \"type eq 'Transaction'\"  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    String sortBy = "sortBy_example"; // String | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName
    Integer limit = 56; // Integer | When paginating, only return this number of records
    String page = "page_example"; // String | Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter, sortby and search fields should not be supplied.
    try {
      PagedResourceListOfPortfolioSearchResult result = apiInstance.searchPortfolios(search, filter, sortBy, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchPortfolios");
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
 **search** | **String**| A parameter used for searching any portfolio field. Wildcards(*) are supported at the end of words (e.g. &#39;Port*&#39;). Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **filter** | **String**| Expression to filter the result set.   For example, to filter on the portfolio Type, use \&quot;type eq &#39;Transaction&#39;\&quot;  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **sortBy** | **String**| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName | [optional]
 **limit** | **Integer**| When paginating, only return this number of records | [optional]
 **page** | **String**| Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter, sortby and search fields should not be supplied. | [optional]

### Return type

[**PagedResourceListOfPortfolioSearchResult**](PagedResourceListOfPortfolioSearchResult.md)

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

<a name="searchProperties"></a>
# **searchProperties**
> PagedResourceListOfPropertyDefinitionSearchResult searchProperties(search, filter, sortBy, limit, page)

[EARLY ACCESS] Search Property Definitions

Search through all Property Definitions

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:60805");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchApi apiInstance = new SearchApi(defaultClient);
    String search = "search_example"; // String | A parameter used for searching any field. Wildcards(*) are supported at the end of words (e.g. 'Port*'). Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the Value Type, use \"valueType eq 'string'\"  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    String sortBy = "sortBy_example"; // String | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName
    Integer limit = 56; // Integer | When paginating, only return this number of records
    String page = "page_example"; // String | Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter, sortby and search fields should not be supplied.
    try {
      PagedResourceListOfPropertyDefinitionSearchResult result = apiInstance.searchProperties(search, filter, sortBy, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchProperties");
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
 **search** | **String**| A parameter used for searching any field. Wildcards(*) are supported at the end of words (e.g. &#39;Port*&#39;). Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **filter** | **String**| Expression to filter the result set.   For example, to filter on the Value Type, use \&quot;valueType eq &#39;string&#39;\&quot;  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **sortBy** | **String**| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName | [optional]
 **limit** | **Integer**| When paginating, only return this number of records | [optional]
 **page** | **String**| Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter, sortby and search fields should not be supplied. | [optional]

### Return type

[**PagedResourceListOfPropertyDefinitionSearchResult**](PagedResourceListOfPropertyDefinitionSearchResult.md)

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

