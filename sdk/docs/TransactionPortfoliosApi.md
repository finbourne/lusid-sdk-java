# TransactionPortfoliosApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTransactionProperty**](TransactionPortfoliosApi.md#addTransactionProperty) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties | Add transaction properties
[**adjustHoldings**](TransactionPortfoliosApi.md#adjustHoldings) | **POST** /api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt} | Adjust holdings
[**buildTransactions**](TransactionPortfoliosApi.md#buildTransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/$build | Build output transactions
[**cancelAdjustHoldings**](TransactionPortfoliosApi.md#cancelAdjustHoldings) | **DELETE** /api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt} | Cancel holdings adjustments
[**createPortfolio**](TransactionPortfoliosApi.md#createPortfolio) | **POST** /api/transactionportfolios/{scope} | Create transaction portfolio
[**deleteExecutions**](TransactionPortfoliosApi.md#deleteExecutions) | **DELETE** /api/transactionportfolios/{scope}/{code}/executions | Delete executions
[**deletePropertyFromTransaction**](TransactionPortfoliosApi.md#deletePropertyFromTransaction) | **DELETE** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties | Delete transaction property
[**deleteTransactions**](TransactionPortfoliosApi.md#deleteTransactions) | **DELETE** /api/transactionportfolios/{scope}/{code}/transactions | Delete transactions
[**getDetails**](TransactionPortfoliosApi.md#getDetails) | **GET** /api/transactionportfolios/{scope}/{code}/details | Get portfolio details
[**getHoldings**](TransactionPortfoliosApi.md#getHoldings) | **GET** /api/transactionportfolios/{scope}/{code}/holdings | Get holdings
[**getHoldingsAdjustment**](TransactionPortfoliosApi.md#getHoldingsAdjustment) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsadjustments/{effectiveAt} | Get holding adjustment
[**getTransactions**](TransactionPortfoliosApi.md#getTransactions) | **GET** /api/transactionportfolios/{scope}/{code}/transactions | Get transactions
[**listHoldingsAdjustments**](TransactionPortfoliosApi.md#listHoldingsAdjustments) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsadjustments | List holdings adjustments
[**setHoldings**](TransactionPortfoliosApi.md#setHoldings) | **PUT** /api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt} | Set all holdings on a transaction portfolio
[**upsertExecutions**](TransactionPortfoliosApi.md#upsertExecutions) | **POST** /api/transactionportfolios/{scope}/{code}/executions | Upsert executions
[**upsertPortfolioDetails**](TransactionPortfoliosApi.md#upsertPortfolioDetails) | **POST** /api/transactionportfolios/{scope}/{code}/details | Upsert details
[**upsertTransactions**](TransactionPortfoliosApi.md#upsertTransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions | Upsert transactions into the specified transaction portfolio


<a name="addTransactionProperty"></a>
# **addTransactionProperty**
> AddTransactionPropertyResponse addTransactionProperty(scope, code, transactionId, transactionProperties)

Add transaction properties

Upsert one or more transaction properties to a single transaction in a portfolio

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
String transactionId = "transactionId_example"; // String | Id of transaction
Object transactionProperties = null; // Object | Transaction properties values
try {
    AddTransactionPropertyResponse result = apiInstance.addTransactionProperty(scope, code, transactionId, transactionProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#addTransactionProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **transactionId** | **String**| Id of transaction |
 **transactionProperties** | **Object**| Transaction properties values | [optional]

### Return type

[**AddTransactionPropertyResponse**](AddTransactionPropertyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="adjustHoldings"></a>
# **adjustHoldings**
> AdjustHolding adjustHoldings(scope, code, effectiveAt, holdingAdjustments)

Adjust holdings

Adjust one or more holdings in a transaction portfolio    Prompt the creation of transactions in a specific transaction portfolio to bring selected holdings to the specified targets

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The effective date of the change
List<AdjustHoldingRequest> holdingAdjustments = Arrays.asList(new AdjustHoldingRequest()); // List<AdjustHoldingRequest> | The selected set of holdings adjustments
try {
    AdjustHolding result = apiInstance.adjustHoldings(scope, code, effectiveAt, holdingAdjustments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#adjustHoldings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **effectiveAt** | **OffsetDateTime**| The effective date of the change |
 **holdingAdjustments** | [**List&lt;AdjustHoldingRequest&gt;**](AdjustHoldingRequest.md)| The selected set of holdings adjustments | [optional]

### Return type

[**AdjustHolding**](AdjustHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="buildTransactions"></a>
# **buildTransactions**
> VersionedResourceListOfOutputTransaction buildTransactions(scope, code, asAt, sortBy, start, limit, propertyKeys, filter, parameters)

Build output transactions

Builds and returns the collection of all types of transactions that affect the holdings of a portfolio in to a set of output transactions

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
List<String> propertyKeys = Arrays.asList("propertyKeys_example"); // List<String> | Optional. Keys for the transaction or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
TransactionQueryParameters parameters = new TransactionQueryParameters(); // TransactionQueryParameters | Optional. Transaction query parameters
try {
    VersionedResourceListOfOutputTransaction result = apiInstance.buildTransactions(scope, code, asAt, sortBy, start, limit, propertyKeys, filter, parameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#buildTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| Optional. Keys for the transaction or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]
 **parameters** | [**TransactionQueryParameters**](TransactionQueryParameters.md)| Optional. Transaction query parameters | [optional]

### Return type

[**VersionedResourceListOfOutputTransaction**](VersionedResourceListOfOutputTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="cancelAdjustHoldings"></a>
# **cancelAdjustHoldings**
> DeletedEntityResponse cancelAdjustHoldings(scope, code, effectiveAt)

Cancel holdings adjustments

Cancel previous adjust-holdings for the portfolio for a specific date

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The effective date of the change
try {
    DeletedEntityResponse result = apiInstance.cancelAdjustHoldings(scope, code, effectiveAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#cancelAdjustHoldings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **effectiveAt** | **OffsetDateTime**| The effective date of the change |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="createPortfolio"></a>
# **createPortfolio**
> Portfolio createPortfolio(scope, createRequest)

Create transaction portfolio

Create a transaction portfolio in a specific scope

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope into which the transaction portfolio will be created
CreateTransactionPortfolioRequest createRequest = new CreateTransactionPortfolioRequest(); // CreateTransactionPortfolioRequest | The transaction portfolio definition
try {
    Portfolio result = apiInstance.createPortfolio(scope, createRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#createPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope into which the transaction portfolio will be created |
 **createRequest** | [**CreateTransactionPortfolioRequest**](CreateTransactionPortfolioRequest.md)| The transaction portfolio definition | [optional]

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="deleteExecutions"></a>
# **deleteExecutions**
> DeletedEntityResponse deleteExecutions(scope, code, executionIds)

Delete executions

Delete one or more executions from a transaction portfolio

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
List<String> executionIds = Arrays.asList("executionIds_example"); // List<String> | Ids of executions to delete
try {
    DeletedEntityResponse result = apiInstance.deleteExecutions(scope, code, executionIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#deleteExecutions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **executionIds** | [**List&lt;String&gt;**](String.md)| Ids of executions to delete | [optional]

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="deletePropertyFromTransaction"></a>
# **deletePropertyFromTransaction**
> DeletedEntityResponse deletePropertyFromTransaction(scope, code, transactionId, transactionPropertyKey)

Delete transaction property

Delete a property value from a single transaction in a portfolio

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | Code for the portfolio
String transactionId = "transactionId_example"; // String | Id of the transaction to delete the property from
String transactionPropertyKey = "transactionPropertyKey_example"; // String | The key of the property to be deleted
try {
    DeletedEntityResponse result = apiInstance.deletePropertyFromTransaction(scope, code, transactionId, transactionPropertyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#deletePropertyFromTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| Code for the portfolio |
 **transactionId** | **String**| Id of the transaction to delete the property from |
 **transactionPropertyKey** | **String**| The key of the property to be deleted | [optional]

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="deleteTransactions"></a>
# **deleteTransactions**
> DeletedEntityResponse deleteTransactions(scope, code, transactionIds)

Delete transactions

Delete one or more transactions from a transaction portfolio

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
List<String> transactionIds = Arrays.asList("transactionIds_example"); // List<String> | Ids of transactions to delete
try {
    DeletedEntityResponse result = apiInstance.deleteTransactions(scope, code, transactionIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#deleteTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **transactionIds** | [**List&lt;String&gt;**](String.md)| Ids of transactions to delete | [optional]

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getDetails"></a>
# **getDetails**
> PortfolioDetails getDetails(scope, code, effectiveAt, asAt)

Get portfolio details

Get the details document associated with a transaction portfolio                When requesting details from a derived transaction portfolio, the returned set of details could come from a different transaction portfolio

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the data
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
try {
    PortfolioDetails result = apiInstance.getDetails(scope, code, effectiveAt, asAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#getDetails");
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

[**PortfolioDetails**](PortfolioDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getHoldings"></a>
# **getHoldings**
> VersionedResourceListOfPortfolioHolding getHoldings(scope, code, byTaxlots, effectiveAt, asAt, sortBy, start, limit, filter, propertyKeys)

Get holdings

Get the aggregate holdings of a transaction portfolio.  If no effectiveAt or asAt  are supplied then values will be defaulted to the latest system time.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
Boolean byTaxlots = true; // Boolean | Option to expand holdings to return the underlying tax-lots
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the portfolio
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
List<String> propertyKeys = Arrays.asList("propertyKeys_example"); // List<String> | Optional. Keys for the Holding or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified.
try {
    VersionedResourceListOfPortfolioHolding result = apiInstance.getHoldings(scope, code, byTaxlots, effectiveAt, asAt, sortBy, start, limit, filter, propertyKeys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#getHoldings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **byTaxlots** | **Boolean**| Option to expand holdings to return the underlying tax-lots | [optional]
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date of the portfolio | [optional]
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| Optional. Keys for the Holding or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. | [optional]

### Return type

[**VersionedResourceListOfPortfolioHolding**](VersionedResourceListOfPortfolioHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getHoldingsAdjustment"></a>
# **getHoldingsAdjustment**
> HoldingsAdjustment getHoldingsAdjustment(scope, code, effectiveAt, asAt)

Get holding adjustment

Get a holdings adjustment for a transaction portfolio at a specific effective time.    A holdings adjustment definition will only be returned if one exists for the specified effective time

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The effective time of the holdings adjustment
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
try {
    HoldingsAdjustment result = apiInstance.getHoldingsAdjustment(scope, code, effectiveAt, asAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#getHoldingsAdjustment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **effectiveAt** | **OffsetDateTime**| The effective time of the holdings adjustment |
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]

### Return type

[**HoldingsAdjustment**](HoldingsAdjustment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="getTransactions"></a>
# **getTransactions**
> VersionedResourceListOfTransaction getTransactions(scope, code, fromTransactionDate, toTransactionDate, asAt, sortBy, start, limit, propertyKeys, filter)

Get transactions

Get the transactions from a transaction portfolio    When the requested portfolio is a derived transaction portfolio, the returned set of transactions is the union set of all transactions of the parent (and ancestors) and the specified portfolio.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
OffsetDateTime fromTransactionDate = new OffsetDateTime(); // OffsetDateTime | Optional. Limit the returned transactions to those with a transaction date equal or later than this date
OffsetDateTime toTransactionDate = new OffsetDateTime(); // OffsetDateTime | Optional. Limit the returned transactions to those with a transaction date equal or before this date
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
Integer start = 56; // Integer | Optional. When paginating, skip this number of results
Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
List<String> propertyKeys = Arrays.asList("propertyKeys_example"); // List<String> | Optional. Keys for the transaction or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified.
String filter = "filter_example"; // String | Optional. Expression to filter the result set
try {
    VersionedResourceListOfTransaction result = apiInstance.getTransactions(scope, code, fromTransactionDate, toTransactionDate, asAt, sortBy, start, limit, propertyKeys, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#getTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **fromTransactionDate** | **OffsetDateTime**| Optional. Limit the returned transactions to those with a transaction date equal or later than this date | [optional]
 **toTransactionDate** | **OffsetDateTime**| Optional. Limit the returned transactions to those with a transaction date equal or before this date | [optional]
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| Optional. Keys for the transaction or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

### Return type

[**VersionedResourceListOfTransaction**](VersionedResourceListOfTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="listHoldingsAdjustments"></a>
# **listHoldingsAdjustments**
> ResourceListOfHoldingsAdjustmentHeader listHoldingsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAt)

List holdings adjustments

Get holdings adjustments from a transaction portfolio in an interval of effective time.

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | Code for the portfolio
OffsetDateTime fromEffectiveAt = new OffsetDateTime(); // OffsetDateTime | Holdings adjustments between this time (inclusive) and the toEffectiveAt are returned.
OffsetDateTime toEffectiveAt = new OffsetDateTime(); // OffsetDateTime | Holdings adjustments between this time (inclusive) and the fromEffectiveAt are returned.
OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
try {
    ResourceListOfHoldingsAdjustmentHeader result = apiInstance.listHoldingsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#listHoldingsAdjustments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| Code for the portfolio |
 **fromEffectiveAt** | **OffsetDateTime**| Holdings adjustments between this time (inclusive) and the toEffectiveAt are returned. | [optional]
 **toEffectiveAt** | **OffsetDateTime**| Holdings adjustments between this time (inclusive) and the fromEffectiveAt are returned. | [optional]
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]

### Return type

[**ResourceListOfHoldingsAdjustmentHeader**](ResourceListOfHoldingsAdjustmentHeader.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="setHoldings"></a>
# **setHoldings**
> AdjustHolding setHoldings(scope, code, effectiveAt, holdingAdjustments)

Set all holdings on a transaction portfolio

Prompt the creation of transactions in a specific transaction portfolio to bring all holdings to the specified targets

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the transaction portfolio
String code = "code_example"; // String | The code of the transaction portfolio
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The effective date of the change
List<AdjustHoldingRequest> holdingAdjustments = Arrays.asList(new AdjustHoldingRequest()); // List<AdjustHoldingRequest> | The complete set of holdings adjustments for the portfolio
try {
    AdjustHolding result = apiInstance.setHoldings(scope, code, effectiveAt, holdingAdjustments);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#setHoldings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the transaction portfolio |
 **code** | **String**| The code of the transaction portfolio |
 **effectiveAt** | **OffsetDateTime**| The effective date of the change |
 **holdingAdjustments** | [**List&lt;AdjustHoldingRequest&gt;**](AdjustHoldingRequest.md)| The complete set of holdings adjustments for the portfolio | [optional]

### Return type

[**AdjustHolding**](AdjustHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="upsertExecutions"></a>
# **upsertExecutions**
> UpsertPortfolioExecutionsResponse upsertExecutions(scope, code, executions)

Upsert executions

Inserts new executions, or updates those already present

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
List<ExecutionRequest> executions = Arrays.asList(new ExecutionRequest()); // List<ExecutionRequest> | The executions to be updated
try {
    UpsertPortfolioExecutionsResponse result = apiInstance.upsertExecutions(scope, code, executions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#upsertExecutions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **executions** | [**List&lt;ExecutionRequest&gt;**](ExecutionRequest.md)| The executions to be updated | [optional]

### Return type

[**UpsertPortfolioExecutionsResponse**](UpsertPortfolioExecutionsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="upsertPortfolioDetails"></a>
# **upsertPortfolioDetails**
> PortfolioDetails upsertPortfolioDetails(scope, code, details, effectiveAt)

Upsert details

Update the portfolio details for the specified transaction portfolios or add if it doesn&#39;t already exist (in the case of a derived transaction portfolio).

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code of the portfolio
CreatePortfolioDetails details = new CreatePortfolioDetails(); // CreatePortfolioDetails | The set of details for the portfolio
OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the change
try {
    PortfolioDetails result = apiInstance.upsertPortfolioDetails(scope, code, details, effectiveAt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#upsertPortfolioDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **details** | [**CreatePortfolioDetails**](CreatePortfolioDetails.md)| The set of details for the portfolio | [optional]
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date of the change | [optional]

### Return type

[**PortfolioDetails**](PortfolioDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="upsertTransactions"></a>
# **upsertTransactions**
> UpsertPortfolioTransactionsResponse upsertTransactions(scope, code, transactions)

Upsert transactions into the specified transaction portfolio

Upsert transactions

### Example
```java
// Import classes:
//import com.finbourne.lusid.ApiClient;
//import com.finbourne.lusid.ApiException;
//import com.finbourne.lusid.Configuration;
//import com.finbourne.lusid.auth.*;
//import com.finbourne.lusid.api.TransactionPortfoliosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi();
String scope = "scope_example"; // String | The scope of the portfolio
String code = "code_example"; // String | The code for the portfolio
List<TransactionRequest> transactions = Arrays.asList(new TransactionRequest()); // List<TransactionRequest> | The transactions to be upserted
try {
    UpsertPortfolioTransactionsResponse result = apiInstance.upsertTransactions(scope, code, transactions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionPortfoliosApi#upsertTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code for the portfolio |
 **transactions** | [**List&lt;TransactionRequest&gt;**](TransactionRequest.md)| The transactions to be upserted | [optional]

### Return type

[**UpsertPortfolioTransactionsResponse**](UpsertPortfolioTransactionsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

