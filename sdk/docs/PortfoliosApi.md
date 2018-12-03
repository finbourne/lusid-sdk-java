# PortfoliosApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePortfolio**](PortfoliosApi.md#deletePortfolio) | **DELETE** /api/portfolios/{scope}/{code} | Delete portfolio
[**deletePortfolioProperties**](PortfoliosApi.md#deletePortfolioProperties) | **DELETE** /api/portfolios/{scope}/{code}/properties | Delete portfolio properties
[**getPortfolio**](PortfoliosApi.md#getPortfolio) | **GET** /api/portfolios/{scope}/{code} | Get portfolio definition
[**getPortfolioCommands**](PortfoliosApi.md#getPortfolioCommands) | **GET** /api/portfolios/{scope}/{code}/commands | Get commands
[**getPortfolioProperties**](PortfoliosApi.md#getPortfolioProperties) | **GET** /api/portfolios/{scope}/{code}/properties | Get portfolio properties
[**listPortfolioScopes**](PortfoliosApi.md#listPortfolioScopes) | **GET** /api/portfolios | List portfolio scopes
[**listPortfolios**](PortfoliosApi.md#listPortfolios) | **GET** /api/portfolios/{scope} | List portfolios
[**updatePortfolio**](PortfoliosApi.md#updatePortfolio) | **PUT** /api/portfolios/{scope}/{code} | Update portfolio definition
[**upsertPortfolioProperties**](PortfoliosApi.md#upsertPortfolioProperties) | **POST** /api/portfolios/{scope}/{code}/properties | Upsert properties


<a name="deletePortfolio"></a>
# **deletePortfolio**
> DeletedEntityResponse deletePortfolio(scope, code, effectiveAt)

Delete portfolio

Delete a portfolio at the specified effectiveAt

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the deletion
try {
    DeletedEntityResponse result = apiInstance.deletePortfolio(scope, code, effectiveAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#deletePortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date of the deletion | [optional]

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="deletePortfolioProperties"></a>
# **deletePortfolioProperties**
> DeletedEntityResponse deletePortfolioProperties(scope, code, effectiveAt, portfolioPropertyKeys)

Delete portfolio properties

Delete one, many or all property values from a portfolio for the specified effectiveAt                Specifying no effectiveAt will delete all properties

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | Code for the portfolio
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the deletion
List<String> portfolioPropertyKeys = Arrays.asList("portfolioPropertyKeys_example"); // List<String> | Optional. The keys of the properties to be deleted. None specified indicates the intention to delete all properties from the portfolio
try {
    DeletedEntityResponse result = apiInstance.deletePortfolioProperties(scope, code, effectiveAt, portfolioPropertyKeys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#deletePortfolioProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| Code for the portfolio |
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date of the deletion | [optional]
 **portfolioPropertyKeys** | [**List&lt;String&gt;**](String.md)| Optional. The keys of the properties to be deleted. None specified indicates the intention to delete all properties from the portfolio | [optional]

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getPortfolio"></a>
# **getPortfolio**
> Portfolio getPortfolio(scope, code, effectiveAt, asAt)

Get portfolio definition

Retrieves the basic set of information about a portfolio using the specified scope and code.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the data
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
try {
    Portfolio result = apiInstance.getPortfolio(scope, code, effectiveAt, asAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#getPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date of the data | [optional]
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getPortfolioCommands"></a>
# **getPortfolioCommands**
> ResourceListOfProcessedCommand getPortfolioCommands(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter)

Get commands

Gets all commands that modified a specific portfolio, including any input transactions.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
OffsetDateTime fromAsAt = new OffsetDateTime(); // OffsetDateTime | Optional. Filters commands by those that were processed at or after this date and time
OffsetDateTime toAsAt = new OffsetDateTime(); // OffsetDateTime | Optional. Filters commands by those that were processed at or before this date and time
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
try {
    ResourceListOfProcessedCommand result = apiInstance.getPortfolioCommands(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#getPortfolioCommands");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **fromAsAt** | **OffsetDateTime**| Optional. Filters commands by those that were processed at or after this date and time | [optional]
 **toAsAt** | **OffsetDateTime**| Optional. Filters commands by those that were processed at or before this date and time | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

### Return type

[**ResourceListOfProcessedCommand**](ResourceListOfProcessedCommand.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getPortfolioProperties"></a>
# **getPortfolioProperties**
> PortfolioProperties getPortfolioProperties(scope, code, effectiveAt, asAt, sortBy, start, limit)

Get portfolio properties

Get the properties of a portfolio

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the data
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
try {
    PortfolioProperties result = apiInstance.getPortfolioProperties(scope, code, effectiveAt, asAt, sortBy, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#getPortfolioProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date of the data | [optional]
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]

### Return type

[**PortfolioProperties**](PortfolioProperties.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="listPortfolioScopes"></a>
# **listPortfolioScopes**
> ResourceListOfScope listPortfolioScopes(sortBy, start, limit, filter)

List portfolio scopes

Lists all scopes that are either currently or have previously had portfolios in them

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
String filter = "filter_example"; // String | Filter to be applied to the list of scopes
try {
    ResourceListOfScope result = apiInstance.listPortfolioScopes(sortBy, start, limit, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#listPortfolioScopes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Filter to be applied to the list of scopes | [optional]

### Return type

[**ResourceListOfScope**](ResourceListOfScope.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="listPortfolios"></a>
# **listPortfolios**
> ResourceListOfPortfolio listPortfolios(scope, effectiveAt, asAt, sortBy, start, limit, filter)

List portfolios

List all the portfolios in the specified scope

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String scope = "scope_example"; // String | The scope
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the data
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
try {
    ResourceListOfPortfolio result = apiInstance.listPortfolios(scope, effectiveAt, asAt, sortBy, start, limit, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#listPortfolios");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope |
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date of the data | [optional]
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

### Return type

[**ResourceListOfPortfolio**](ResourceListOfPortfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="updatePortfolio"></a>
# **updatePortfolio**
> Portfolio updatePortfolio(scope, code, request, effectiveAt)

Update portfolio definition

Update the definition of a specific portfolio. Note, some parts of a portfolio definition are not available for modification after the initial creation.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
UpdatePortfolioRequest request = new UpdatePortfolioRequest(); // UpdatePortfolioRequest | The updated portfolio definition
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date for the change
try {
    Portfolio result = apiInstance.updatePortfolio(scope, code, request, effectiveAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#updatePortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **request** | [**UpdatePortfolioRequest**](UpdatePortfolioRequest.md)| The updated portfolio definition | [optional]
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date for the change | [optional]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="upsertPortfolioProperties"></a>
# **upsertPortfolioProperties**
> PortfolioProperties upsertPortfolioProperties(scope, code, portfolioProperties, effectiveAt)

Upsert properties

Upsert one or more property values to a portfolio for the specified effectiveAt. All properties must be of the domain Portfolio.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.PortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PortfoliosApi apiInstance = new PortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
Object portfolioProperties = null; // Object | The property values to be upserted to the portfolio
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the change
try {
    PortfolioProperties result = apiInstance.upsertPortfolioProperties(scope, code, portfolioProperties, effectiveAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfoliosApi#upsertPortfolioProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **portfolioProperties** | **Object**| The property values to be upserted to the portfolio | [optional]
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date of the change | [optional]

### Return type

[**PortfolioProperties**](PortfolioProperties.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

