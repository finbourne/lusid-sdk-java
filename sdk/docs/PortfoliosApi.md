# PortfoliosApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePortfolio**](PortfoliosApi.md#deletePortfolio) | **DELETE** /api/portfolios/{scope}/{code} | [EARLY ACCESS] Delete portfolio
[**deletePortfolioProperties**](PortfoliosApi.md#deletePortfolioProperties) | **DELETE** /api/portfolios/{scope}/{code}/properties | [EARLY ACCESS] Delete portfolio properties
[**getPortfolio**](PortfoliosApi.md#getPortfolio) | **GET** /api/portfolios/{scope}/{code} | [EARLY ACCESS] Get portfolio
[**getPortfolioCommands**](PortfoliosApi.md#getPortfolioCommands) | **GET** /api/portfolios/{scope}/{code}/commands | [EARLY ACCESS] Get portfolio commands
[**getPortfolioProperties**](PortfoliosApi.md#getPortfolioProperties) | **GET** /api/portfolios/{scope}/{code}/properties | [EARLY ACCESS] Get portfolio properties
[**listPortfolios**](PortfoliosApi.md#listPortfolios) | **GET** /api/portfolios | [EARLY ACCESS] List portfolios
[**listPortfoliosForScope**](PortfoliosApi.md#listPortfoliosForScope) | **GET** /api/portfolios/{scope} | [EARLY ACCESS] List portfolios for scope
[**updatePortfolio**](PortfoliosApi.md#updatePortfolio) | **PUT** /api/portfolios/{scope}/{code} | [EARLY ACCESS] Update portfolio
[**upsertPortfolioProperties**](PortfoliosApi.md#upsertPortfolioProperties) | **POST** /api/portfolios/{scope}/{code}/properties | [EARLY ACCESS] Upsert portfolio properties


<a name="deletePortfolio"></a>
# **deletePortfolio**
> DeletedEntityResponse deletePortfolio(scope, code)

[EARLY ACCESS] Delete portfolio

Delete a single portfolio. The deletion of the portfolio will be valid from the portfolio&#39;s creation datetime. This means that the portfolio will no longer exist at any effective datetime from the asAt datetime of deletion.

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
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio.
    String code = "code_example"; // String | The code of the portfolio.
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
 **code** | **String**| The code of the portfolio. |

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
> DeletedEntityResponse deletePortfolioProperties(scope, code, portfolioPropertyKeys, effectiveAt)

[EARLY ACCESS] Delete portfolio properties

Delete one or more properties from a single portfolio.

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
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio to delete properties from.
    String code = "code_example"; // String | The code of the portfolio to delete properties from. Together with the scope this uniquely              identifies the portfolio.
    List<String> portfolioPropertyKeys = Arrays.asList(); // List<String> | The property keys of the properties to delete. These take the format              {domain}/{scope}/{code} e.g. \"Portfolio/Manager/Id\". Each property must be from the \"Portfolio\" domain.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to delete the properties. Defaults to the current LUSID system datetime if not specified.
    try {
      DeletedEntityResponse result = apiInstance.deletePortfolioProperties(scope, code, portfolioPropertyKeys, effectiveAt);
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
 **scope** | **String**| The scope of the portfolio to delete properties from. |
 **code** | **String**| The code of the portfolio to delete properties from. Together with the scope this uniquely              identifies the portfolio. |
 **portfolioPropertyKeys** | [**List&lt;String&gt;**](String.md)| The property keys of the properties to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;Portfolio/Manager/Id\&quot;. Each property must be from the \&quot;Portfolio\&quot; domain. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to delete the properties. Defaults to the current LUSID system datetime if not specified. | [optional]

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

<a name="getPortfolio"></a>
# **getPortfolio**
> Portfolio getPortfolio(scope, code, effectiveAt, asAt)

[EARLY ACCESS] Get portfolio

Retrieve the definition of a single portfolio.

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
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio to retrieve the definition for.
    String code = "code_example"; // String | The code of the portfolio to retrieve the definition for. Together with the scope this              uniquely identifies the portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the portfolio definition. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio definition. Defaults to return the latest version of the portfolio definition if not specified.
    try {
      Portfolio result = apiInstance.getPortfolio(scope, code, effectiveAt, asAt);
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
 **scope** | **String**| The scope of the portfolio to retrieve the definition for. |
 **code** | **String**| The code of the portfolio to retrieve the definition for. Together with the scope this              uniquely identifies the portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the portfolio definition. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio definition. Defaults to return the latest version of the portfolio definition if not specified. | [optional]

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

<a name="getPortfolioCommands"></a>
# **getPortfolioCommands**
> ResourceListOfProcessedCommand getPortfolioCommands(scope, code, fromAsAt, toAsAt, filter)

[EARLY ACCESS] Get portfolio commands

Gets all the commands that modified a single portfolio, including any input transactions.

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
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio to retrieve the commands for.
    String code = "code_example"; // String | The code of the portfolio to retrieve the commands for. Together with the scope this uniquely identifies              the portfolio.
    OffsetDateTime fromAsAt = new OffsetDateTime(); // OffsetDateTime | The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified.
    OffsetDateTime toAsAt = new OffsetDateTime(); // OffsetDateTime | The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      ResourceListOfProcessedCommand result = apiInstance.getPortfolioCommands(scope, code, fromAsAt, toAsAt, filter);
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
 **scope** | **String**| The scope of the portfolio to retrieve the commands for. |
 **code** | **String**| The code of the portfolio to retrieve the commands for. Together with the scope this uniquely identifies              the portfolio. |
 **fromAsAt** | **OffsetDateTime**| The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified. | [optional]
 **toAsAt** | **OffsetDateTime**| The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

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

<a name="getPortfolioProperties"></a>
# **getPortfolioProperties**
> PortfolioProperties getPortfolioProperties(scope, code, effectiveAt, asAt)

[EARLY ACCESS] Get portfolio properties

List all the properties of a single portfolio.

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
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio to list the properties for.
    String code = "code_example"; // String | The code of the portfolio to list the properties for. Together with the scope this uniquely              identifies the portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the portfolio's properties. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to list the portfolio's properties. Defaults to return the latest version of each property if not specified.
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
 **scope** | **String**| The scope of the portfolio to list the properties for. |
 **code** | **String**| The code of the portfolio to list the properties for. Together with the scope this uniquely              identifies the portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to list the portfolio&#39;s properties. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolio&#39;s properties. Defaults to return the latest version of each property if not specified. | [optional]

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

<a name="listPortfolios"></a>
# **listPortfolios**
> ResourceListOfPortfolio listPortfolios(effectiveAt, asAt, page, start, limit, filter, query, portfolioPropertyKeys)

[EARLY ACCESS] List portfolios

List all the portfolios matching the specified criteria.

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
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the portfolios. Defaults to the current LUSID              system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to list the portfolios. Defaults to return the latest version              of each portfolio if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing portfolios from a previous call to list portfolios. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt  and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 65,535 if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    String query = "query_example"; // String | Expression specifying the criteria that the returned portfolios must meet e.g. to see which              portfolios have holdings in the instruments with a Lusid Instrument Id (LUID) of 'LUID_PPA8HI6M' or a Figi of 'BBG000BLNNH6'              you would specify \"instrument.identifiers in (('LusidInstrumentId', 'LUID_PPA8HI6M'), ('Figi', 'BBG000BLNNH6'))\".
    List<String> portfolioPropertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Portfolio\" domain to decorate onto each portfolio.              These take the format {domain}/{scope}/{code} e.g. \"Portfolio/Manager/Id\".
    try {
      ResourceListOfPortfolio result = apiInstance.listPortfolios(effectiveAt, asAt, page, start, limit, filter, query, portfolioPropertyKeys);
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
 **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolios. Defaults to return the latest version              of each portfolio if not specified. | [optional]
 **page** | **String**| The pagination token to use to continue listing portfolios from a previous call to list portfolios. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt  and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional]
 **start** | **Integer**| When paginating, skip this number of results. | [optional]
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 65,535 if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **query** | **String**| Expression specifying the criteria that the returned portfolios must meet e.g. to see which              portfolios have holdings in the instruments with a Lusid Instrument Id (LUID) of &#39;LUID_PPA8HI6M&#39; or a Figi of &#39;BBG000BLNNH6&#39;              you would specify \&quot;instrument.identifiers in ((&#39;LusidInstrumentId&#39;, &#39;LUID_PPA8HI6M&#39;), (&#39;Figi&#39;, &#39;BBG000BLNNH6&#39;))\&quot;. | [optional]
 **portfolioPropertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Portfolio\&quot; domain to decorate onto each portfolio.              These take the format {domain}/{scope}/{code} e.g. \&quot;Portfolio/Manager/Id\&quot;. | [optional]

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
> ResourceListOfPortfolio listPortfoliosForScope(scope, effectiveAt, asAt, filter, portfolioPropertyKeys)

[EARLY ACCESS] List portfolios for scope

List all the portfolios in a single scope.

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
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolios.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the portfolios. Defaults to the current LUSID              system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to list the portfolios. Defaults to return the latest version              of each portfolio if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> portfolioPropertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Portfolio\" domain to decorate onto each portfolio.              These take the format {domain}/{scope}/{code} e.g. \"Portfolio/Manager/Id\".
    try {
      ResourceListOfPortfolio result = apiInstance.listPortfoliosForScope(scope, effectiveAt, asAt, filter, portfolioPropertyKeys);
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
 **scope** | **String**| The scope of the portfolios. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to list the portfolios. Defaults to the current LUSID              system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolios. Defaults to return the latest version              of each portfolio if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **portfolioPropertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Portfolio\&quot; domain to decorate onto each portfolio.              These take the format {domain}/{scope}/{code} e.g. \&quot;Portfolio/Manager/Id\&quot;. | [optional]

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

<a name="updatePortfolio"></a>
# **updatePortfolio**
> Portfolio updatePortfolio(scope, code, effectiveAt, request)

[EARLY ACCESS] Update portfolio

Update the definition of a single portfolio. Not all elements within a portfolio definition are  modifiable due to the potential implications for data already stored against the portfolio.

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
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio to update the definition for.
    String code = "code_example"; // String | The code of the portfolio to update the definition for. Together with the scope this uniquely              identifies the portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to update the definition. Defaults to the current              LUSID system datetime if not specified.
    UpdatePortfolioRequest request = new UpdatePortfolioRequest(); // UpdatePortfolioRequest | The updated portfolio definition.
    try {
      Portfolio result = apiInstance.updatePortfolio(scope, code, effectiveAt, request);
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
 **scope** | **String**| The scope of the portfolio to update the definition for. |
 **code** | **String**| The code of the portfolio to update the definition for. Together with the scope this uniquely              identifies the portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to update the definition. Defaults to the current              LUSID system datetime if not specified. | [optional]
 **request** | [**UpdatePortfolioRequest**](UpdatePortfolioRequest.md)| The updated portfolio definition. | [optional]

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
**200** | The updated definition of the portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertPortfolioProperties"></a>
# **upsertPortfolioProperties**
> PortfolioProperties upsertPortfolioProperties(scope, code, portfolioProperties)

[EARLY ACCESS] Upsert portfolio properties

Update or insert one or more properties onto a single portfolio. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;Portfolio&#39;.

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
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfoliosApi apiInstance = new PortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio to update or insert the properties onto.
    String code = "code_example"; // String | The code of the portfolio to update or insert the properties onto. Together with the scope              this uniquely identifies the portfolio.
    Map<String, Property> portfolioProperties = new HashMap(); // Map<String, Property> | The properties to be updated or inserted onto the portfolio. Each property in              the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \"Portfolio/Manager/Id\".
    try {
      PortfolioProperties result = apiInstance.upsertPortfolioProperties(scope, code, portfolioProperties);
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
 **scope** | **String**| The scope of the portfolio to update or insert the properties onto. |
 **code** | **String**| The code of the portfolio to update or insert the properties onto. Together with the scope              this uniquely identifies the portfolio. |
 **portfolioProperties** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be updated or inserted onto the portfolio. Each property in              the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;Portfolio/Manager/Id\&quot;. | [optional]

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
**200** | The updated or inserted properties |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

