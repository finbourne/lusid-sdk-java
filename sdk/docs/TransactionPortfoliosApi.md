# TransactionPortfoliosApi

All URIs are relative to *https://www.lusid.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjustHoldings**](TransactionPortfoliosApi.md#adjustHoldings) | **POST** /api/transactionportfolios/{scope}/{code}/holdings | AdjustHoldings: Adjust holdings
[**batchAdjustHoldings**](TransactionPortfoliosApi.md#batchAdjustHoldings) | **POST** /api/transactionportfolios/{scope}/{code}/holdings/$batchAdjust | [EARLY ACCESS] BatchAdjustHoldings: Batch adjust holdings
[**batchUpsertTransactions**](TransactionPortfoliosApi.md#batchUpsertTransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/$batchUpsert | [EARLY ACCESS] BatchUpsertTransactions: Batch upsert transactions
[**buildTransactions**](TransactionPortfoliosApi.md#buildTransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/$build | BuildTransactions: Build transactions
[**cancelAdjustHoldings**](TransactionPortfoliosApi.md#cancelAdjustHoldings) | **DELETE** /api/transactionportfolios/{scope}/{code}/holdings | CancelAdjustHoldings: Cancel adjust holdings
[**cancelTransactions**](TransactionPortfoliosApi.md#cancelTransactions) | **DELETE** /api/transactionportfolios/{scope}/{code}/transactions | CancelTransactions: Cancel transactions
[**createPortfolio**](TransactionPortfoliosApi.md#createPortfolio) | **POST** /api/transactionportfolios/{scope} | CreatePortfolio: Create portfolio
[**deletePropertiesFromTransaction**](TransactionPortfoliosApi.md#deletePropertiesFromTransaction) | **DELETE** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties | DeletePropertiesFromTransaction: Delete properties from transaction
[**getA2BData**](TransactionPortfoliosApi.md#getA2BData) | **GET** /api/transactionportfolios/{scope}/{code}/a2b | GetA2BData: Get A2B data
[**getA2BMovements**](TransactionPortfoliosApi.md#getA2BMovements) | **GET** /api/transactionportfolios/{scope}/{code}/a2bmovements | GetA2BMovements: Get an A2B report at the movement level for the given portfolio.
[**getDetails**](TransactionPortfoliosApi.md#getDetails) | **GET** /api/transactionportfolios/{scope}/{code}/details | GetDetails: Get details
[**getHoldings**](TransactionPortfoliosApi.md#getHoldings) | **GET** /api/transactionportfolios/{scope}/{code}/holdings | GetHoldings: Get holdings
[**getHoldingsAdjustment**](TransactionPortfoliosApi.md#getHoldingsAdjustment) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsadjustments/{effectiveAt} | GetHoldingsAdjustment: Get holdings adjustment
[**getPortfolioCashLadder**](TransactionPortfoliosApi.md#getPortfolioCashLadder) | **GET** /api/transactionportfolios/{scope}/{code}/cashladder | GetPortfolioCashLadder: Get portfolio cash ladder
[**getPortfolioCashStatement**](TransactionPortfoliosApi.md#getPortfolioCashStatement) | **GET** /api/transactionportfolios/{scope}/{code}/cashstatement | GetPortfolioCashStatement: Get portfolio cash statement
[**getTransactionHistory**](TransactionPortfoliosApi.md#getTransactionHistory) | **GET** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/history | [EARLY ACCESS] GetTransactionHistory: Get the history of a transaction
[**getTransactions**](TransactionPortfoliosApi.md#getTransactions) | **GET** /api/transactionportfolios/{scope}/{code}/transactions | GetTransactions: Get transactions
[**listHoldingsAdjustments**](TransactionPortfoliosApi.md#listHoldingsAdjustments) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsadjustments | ListHoldingsAdjustments: List holdings adjustments
[**patchPortfolioDetails**](TransactionPortfoliosApi.md#patchPortfolioDetails) | **PATCH** /api/transactionportfolios/{scope}/{code}/details | [EARLY ACCESS] PatchPortfolioDetails: Patch portfolio details
[**resolveInstrument**](TransactionPortfoliosApi.md#resolveInstrument) | **POST** /api/transactionportfolios/{scope}/{code}/$resolve | [EARLY ACCESS] ResolveInstrument: Resolve instrument
[**setHoldings**](TransactionPortfoliosApi.md#setHoldings) | **PUT** /api/transactionportfolios/{scope}/{code}/holdings | SetHoldings: Set holdings
[**upsertPortfolioDetails**](TransactionPortfoliosApi.md#upsertPortfolioDetails) | **POST** /api/transactionportfolios/{scope}/{code}/details | UpsertPortfolioDetails: Upsert portfolio details
[**upsertTransactionProperties**](TransactionPortfoliosApi.md#upsertTransactionProperties) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties | UpsertTransactionProperties: Upsert transaction properties
[**upsertTransactions**](TransactionPortfoliosApi.md#upsertTransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions | UpsertTransactions: Upsert transactions


<a name="adjustHoldings"></a>
# **adjustHoldings**
> AdjustHolding adjustHoldings(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods)

AdjustHoldings: Adjust holdings

Adjust one or more holdings of the specified transaction portfolio to the provided targets. LUSID will  automatically construct adjustment transactions to ensure that the holdings which have been adjusted are  always set to the provided targets for the specified effective datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/how-do-i-adjust-my-holdings.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the holdings should be set to the provided targets.
    List<AdjustHoldingRequest> adjustHoldingRequest = Arrays.asList(); // List<AdjustHoldingRequest> | The selected set of holdings to adjust to the provided targets for the              transaction portfolio.
    List<String> reconciliationMethods = Arrays.asList(); // List<String> | Optional parameter for specifying a reconciliation method: e.g. FxForward.
    try {
      AdjustHolding result = apiInstance.adjustHoldings(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#adjustHoldings");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which the holdings should be set to the provided targets. |
 **adjustHoldingRequest** | [**List&lt;AdjustHoldingRequest&gt;**](AdjustHoldingRequest.md)| The selected set of holdings to adjust to the provided targets for the              transaction portfolio. |
 **reconciliationMethods** | [**List&lt;String&gt;**](String.md)| Optional parameter for specifying a reconciliation method: e.g. FxForward. | [optional]

### Return type

[**AdjustHolding**](AdjustHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The version of the transaction portfolio that contains the newly adjusted holdings |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="batchAdjustHoldings"></a>
# **batchAdjustHoldings**
> BatchAdjustHoldingsResponse batchAdjustHoldings(scope, code, successMode, requestBody, reconciliationMethods)

[EARLY ACCESS] BatchAdjustHoldings: Batch adjust holdings

Adjust one or more holdings of the specified transaction portfolio to the provided targets. LUSID will  automatically construct adjustment transactions to ensure that the holdings which have been adjusted are  always set to the provided targets for the specified effective datetime in each request.                Each request must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each adjustment in the response.    Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies               the transaction portfolio.
    String successMode = "Partial"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial
    Map<String, AdjustHoldingForDateRequest> requestBody = new HashMap(); // Map<String, AdjustHoldingForDateRequest> | The selected set of holdings to adjust to the provided targets for the               transaction portfolio.
    List<String> reconciliationMethods = Arrays.asList(); // List<String> | Optional parameter for specifying a reconciliation method: e.g. FxForward.
    try {
      BatchAdjustHoldingsResponse result = apiInstance.batchAdjustHoldings(scope, code, successMode, requestBody, reconciliationMethods);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#batchAdjustHoldings");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies               the transaction portfolio. |
 **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial | [default to Partial]
 **requestBody** | [**Map&lt;String, AdjustHoldingForDateRequest&gt;**](AdjustHoldingForDateRequest.md)| The selected set of holdings to adjust to the provided targets for the               transaction portfolio. |
 **reconciliationMethods** | [**List&lt;String&gt;**](String.md)| Optional parameter for specifying a reconciliation method: e.g. FxForward. | [optional]

### Return type

[**BatchAdjustHoldingsResponse**](BatchAdjustHoldingsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The successful AdjustHolding requests along with any failures |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="batchUpsertTransactions"></a>
# **batchUpsertTransactions**
> BatchUpsertPortfolioTransactionsResponse batchUpsertTransactions(scope, code, successMode, requestBody)

[EARLY ACCESS] BatchUpsertTransactions: Batch upsert transactions

Create or update transactions in the transaction portfolio. A transaction will be updated  if it already exists and created if it does not.    Each request must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each transaction in the response.    Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String successMode = "Partial"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial.
    Map<String, TransactionRequest> requestBody = new HashMap(); // Map<String, TransactionRequest> | The payload describing the transactions to be created or updated.
    try {
      BatchUpsertPortfolioTransactionsResponse result = apiInstance.batchUpsertTransactions(scope, code, successMode, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#batchUpsertTransactions");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial. | [default to Partial]
 **requestBody** | [**Map&lt;String, TransactionRequest&gt;**](TransactionRequest.md)| The payload describing the transactions to be created or updated. |

### Return type

[**BatchUpsertPortfolioTransactionsResponse**](BatchUpsertPortfolioTransactionsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The successfully upserted transaction requests along with any failures |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="buildTransactions"></a>
# **buildTransactions**
> VersionedResourceListOfOutputTransaction buildTransactions(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page)

BuildTransactions: Build transactions

Builds and returns all transactions that affect the holdings of a portfolio over a given interval of  effective time into a set of output transactions. This includes transactions automatically generated by  LUSID such as holding adjustments.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    TransactionQueryParameters transactionQueryParameters = new TransactionQueryParameters(); // TransactionQueryParameters | The query queryParameters which control how the output transactions are built.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.              For example, to return only transactions with a transaction type of 'Buy', specify \"type eq 'Buy'\".              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" or \"Transaction\" domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or              \"Transaction/strategy/quantsignal\".
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing transactions from a previous call to BuildTransactions.
    try {
      VersionedResourceListOfOutputTransaction result = apiInstance.buildTransactions(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#buildTransactions");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **transactionQueryParameters** | [**TransactionQueryParameters**](TransactionQueryParameters.md)| The query queryParameters which control how the output transactions are built. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. | [optional]
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional]
 **page** | **String**| The pagination token to use to continue listing transactions from a previous call to BuildTransactions. | [optional]

### Return type

[**VersionedResourceListOfOutputTransaction**](VersionedResourceListOfOutputTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested transactions from the specified transaction portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="cancelAdjustHoldings"></a>
# **cancelAdjustHoldings**
> DeletedEntityResponse cancelAdjustHoldings(scope, code, effectiveAt)

CancelAdjustHoldings: Cancel adjust holdings

Cancel all previous holding adjustments made on the specified transaction portfolio for a specified effective  datetime. This should be used to undo holding adjustments made via set holdings or adjust holdings.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the holding adjustments should be undone.
    try {
      DeletedEntityResponse result = apiInstance.cancelAdjustHoldings(scope, code, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#cancelAdjustHoldings");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which the holding adjustments should be undone. |

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
**200** | The datetime that the holding adjustments were cancelled |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="cancelTransactions"></a>
# **cancelTransactions**
> DeletedEntityResponse cancelTransactions(scope, code, transactionIds)

CancelTransactions: Cancel transactions

Cancel one or more transactions from the transaction portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    List<String> transactionIds = Arrays.asList(); // List<String> | The IDs of the transactions to cancel.
    try {
      DeletedEntityResponse result = apiInstance.cancelTransactions(scope, code, transactionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#cancelTransactions");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **transactionIds** | [**List&lt;String&gt;**](String.md)| The IDs of the transactions to cancel. |

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
**200** | The datetime that the transactions were cancelled |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="createPortfolio"></a>
# **createPortfolio**
> Portfolio createPortfolio(scope, createTransactionPortfolioRequest)

CreatePortfolio: Create portfolio

Create a transaction portfolio in a particular scope.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope in which to create the transaction portfolio.
    CreateTransactionPortfolioRequest createTransactionPortfolioRequest = new CreateTransactionPortfolioRequest(); // CreateTransactionPortfolioRequest | The definition of the transaction portfolio.
    try {
      Portfolio result = apiInstance.createPortfolio(scope, createTransactionPortfolioRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#createPortfolio");
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
 **scope** | **String**| The scope in which to create the transaction portfolio. |
 **createTransactionPortfolioRequest** | [**CreateTransactionPortfolioRequest**](CreateTransactionPortfolioRequest.md)| The definition of the transaction portfolio. |

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
**201** | The newly-created transaction portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deletePropertiesFromTransaction"></a>
# **deletePropertiesFromTransaction**
> DeletedEntityResponse deletePropertiesFromTransaction(scope, code, transactionId, propertyKeys)

DeletePropertiesFromTransaction: Delete properties from transaction

Delete one or more properties from a single transaction in a transaction portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String transactionId = "transactionId_example"; // String | The unique ID of the transaction from which to delete properties.
    List<String> propertyKeys = Arrays.asList(); // List<String> | The property keys of the properties to delete.              These must be from the \"Transaction\" domain and have the format {domain}/{scope}/{code}, for example              \"Transaction/strategy/quantsignal\".
    try {
      DeletedEntityResponse result = apiInstance.deletePropertiesFromTransaction(scope, code, transactionId, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#deletePropertiesFromTransaction");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **transactionId** | **String**| The unique ID of the transaction from which to delete properties. |
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| The property keys of the properties to delete.              These must be from the \&quot;Transaction\&quot; domain and have the format {domain}/{scope}/{code}, for example              \&quot;Transaction/strategy/quantsignal\&quot;. |

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
**200** | The datetime that the property was deleted |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getA2BData"></a>
# **getA2BData**
> VersionedResourceListOfA2BDataRecord getA2BData(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter)

GetA2BData: Get A2B data

Get an A2B report for the given portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio to retrieve the A2B report for.
    String code = "code_example"; // String | The code of the portfolio to retrieve the A2B report for. Together with the scope this              uniquely identifies the portfolio.
    String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified.
    String toEffectiveAt = "toEffectiveAt_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version              of each transaction if not specified.
    String recipeIdScope = "recipeIdScope_example"; // String | The scope of the given recipeId
    String recipeIdCode = "recipeIdCode_example"; // String | The code of the given recipeId
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" domain to decorate onto              the results. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\".
    String filter = "filter_example"; // String | Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      VersionedResourceListOfA2BDataRecord result = apiInstance.getA2BData(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#getA2BData");
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
 **scope** | **String**| The scope of the portfolio to retrieve the A2B report for. |
 **code** | **String**| The code of the portfolio to retrieve the A2B report for. Together with the scope this              uniquely identifies the portfolio. |
 **fromEffectiveAt** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. |
 **toEffectiveAt** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version              of each transaction if not specified. | [optional]
 **recipeIdScope** | **String**| The scope of the given recipeId | [optional]
 **recipeIdCode** | **String**| The code of the given recipeId | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; domain to decorate onto              the results. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot;. | [optional]
 **filter** | **String**| Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

### Return type

[**VersionedResourceListOfA2BDataRecord**](VersionedResourceListOfA2BDataRecord.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested portfolio A2B data |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getA2BMovements"></a>
# **getA2BMovements**
> VersionedResourceListOfA2BMovementRecord getA2BMovements(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter)

GetA2BMovements: Get an A2B report at the movement level for the given portfolio.

Get an A2B report at the movement level for the given portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio to retrieve the A2B movement report for.
    String code = "code_example"; // String | The code of the portfolio to retrieve the A2B movement report for. Together with the scope this              uniquely identifies the portfolio.
    String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified.
    String toEffectiveAt = "toEffectiveAt_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version              of each transaction if not specified.
    String recipeIdScope = "recipeIdScope_example"; // String | The scope of the given recipeId
    String recipeIdCode = "recipeIdCode_example"; // String | The code of the given recipeId
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" domain to decorate onto              the results. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\".
    String filter = "filter_example"; // String | Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      VersionedResourceListOfA2BMovementRecord result = apiInstance.getA2BMovements(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#getA2BMovements");
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
 **scope** | **String**| The scope of the portfolio to retrieve the A2B movement report for. |
 **code** | **String**| The code of the portfolio to retrieve the A2B movement report for. Together with the scope this              uniquely identifies the portfolio. |
 **fromEffectiveAt** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. |
 **toEffectiveAt** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version              of each transaction if not specified. | [optional]
 **recipeIdScope** | **String**| The scope of the given recipeId | [optional]
 **recipeIdCode** | **String**| The code of the given recipeId | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; domain to decorate onto              the results. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot;. | [optional]
 **filter** | **String**| Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

### Return type

[**VersionedResourceListOfA2BMovementRecord**](VersionedResourceListOfA2BMovementRecord.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested portfolio A2B movement data |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getDetails"></a>
# **getDetails**
> PortfolioDetails getDetails(scope, code, effectiveAt, asAt)

GetDetails: Get details

Get certain details associated with a transaction portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the              scope this uniquely identifies the transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the details of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to returning the latest version of the details if not specified.
    try {
      PortfolioDetails result = apiInstance.getDetails(scope, code, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#getDetails");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the              scope this uniquely identifies the transaction portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the details of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to returning the latest version of the details if not specified. | [optional]

### Return type

[**PortfolioDetails**](PortfolioDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The details of the specified transaction portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getHoldings"></a>
# **getHoldings**
> VersionedResourceListOfPortfolioHolding getHoldings(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots)

GetHoldings: Get holdings

Calculate holdings for a transaction portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.              For example, to filter on the Holding Type, use \"holdingType eq 'p'\".              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\", \"Holding\", \"Custodian Account\" or \"Portfolio\" domain to decorate onto              holdings. These must have the format {domain}/{scope}/{code}, for example \"Instrument/system/Name\" or \"Holding/system/Cost\".
    Boolean byTaxlots = true; // Boolean | Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False.
    try {
      VersionedResourceListOfPortfolioHolding result = apiInstance.getHoldings(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#getHoldings");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set.              For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot;, \&quot;Custodian Account\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              holdings. These must have the format {domain}/{scope}/{code}, for example \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. | [optional]
 **byTaxlots** | **Boolean**| Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. | [optional]

### Return type

[**VersionedResourceListOfPortfolioHolding**](VersionedResourceListOfPortfolioHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The holdings and version of the specified transaction portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getHoldingsAdjustment"></a>
# **getHoldingsAdjustment**
> HoldingsAdjustment getHoldingsAdjustment(scope, code, effectiveAt, asAt, propertyKeys)

GetHoldingsAdjustment: Get holdings adjustment

Get a holdings adjustment made to a transaction portfolio at a specific effective datetime. Note that a  holdings adjustment will only be returned if one exists for the specified effective datetime.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label of the holdings adjustment.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the holdings adjustment. Defaults to the return the latest              version of the holdings adjustment if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the ‘Instrument' domain to decorate onto holdings adjustments.              These must have the format {domain}/{scope}/{code}, for example 'Instrument/system/Name'.              Note that properties from the 'Holding’ domain are automatically returned.
    try {
      HoldingsAdjustment result = apiInstance.getHoldingsAdjustment(scope, code, effectiveAt, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#getHoldingsAdjustment");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label of the holdings adjustment. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the holdings adjustment. Defaults to the return the latest              version of the holdings adjustment if not specified. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the ‘Instrument&#39; domain to decorate onto holdings adjustments.              These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;.              Note that properties from the &#39;Holding’ domain are automatically returned. | [optional]

### Return type

[**HoldingsAdjustment**](HoldingsAdjustment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The details of the requested holdings adjustment |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioCashLadder"></a>
# **getPortfolioCashLadder**
> ResourceListOfPortfolioCashLadder getPortfolioCashLadder(scope, code, fromEffectiveAt, toEffectiveAt, effectiveAt, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades)

GetPortfolioCashLadder: Get portfolio cash ladder

Get a cash ladder for a transaction portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this              uniquely identifies the portfolio.
    String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified.
    String toEffectiveAt = "toEffectiveAt_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified.
    String effectiveAt = "effectiveAt_example"; // String | The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version              of each transaction if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.              For example, to return only transactions with a transaction type of 'Buy', specify \"type eq 'Buy'\".              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    String recipeIdScope = "recipeIdScope_example"; // String | The scope of the given recipeId
    String recipeIdCode = "recipeIdCode_example"; // String | The code of the given recipeID
    Boolean excludeUnsettledTrades = false; // Boolean | If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set.
    try {
      ResourceListOfPortfolioCashLadder result = apiInstance.getPortfolioCashLadder(scope, code, fromEffectiveAt, toEffectiveAt, effectiveAt, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#getPortfolioCashLadder");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this              uniquely identifies the portfolio. |
 **fromEffectiveAt** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. |
 **toEffectiveAt** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. |
 **effectiveAt** | **String**| The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version              of each transaction if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional]
 **recipeIdScope** | **String**| The scope of the given recipeId | [optional]
 **recipeIdCode** | **String**| The code of the given recipeID | [optional]
 **excludeUnsettledTrades** | **Boolean**| If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. | [optional] [default to false]

### Return type

[**ResourceListOfPortfolioCashLadder**](ResourceListOfPortfolioCashLadder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested portfolio cash-ladder |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioCashStatement"></a>
# **getPortfolioCashStatement**
> ResourceListOfPortfolioCashFlow getPortfolioCashStatement(scope, code, fromEffectiveAt, toEffectiveAt, asAt, filter, recipeIdScope, recipeIdCode)

GetPortfolioCashStatement: Get portfolio cash statement

Get a cash statement for a transaction portfolio.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this              uniquely identifies the portfolio.
    String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified.
    String toEffectiveAt = "toEffectiveAt_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version              of each transaction if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.              For example, to return only transactions with a transaction type of 'Buy', specify \"type eq 'Buy'\".              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    String recipeIdScope = "recipeIdScope_example"; // String | The scope of the given recipeId
    String recipeIdCode = "recipeIdCode_example"; // String | The code of the given recipeID
    try {
      ResourceListOfPortfolioCashFlow result = apiInstance.getPortfolioCashStatement(scope, code, fromEffectiveAt, toEffectiveAt, asAt, filter, recipeIdScope, recipeIdCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#getPortfolioCashStatement");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this              uniquely identifies the portfolio. |
 **fromEffectiveAt** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. |
 **toEffectiveAt** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version              of each transaction if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional]
 **recipeIdScope** | **String**| The scope of the given recipeId | [optional]
 **recipeIdCode** | **String**| The code of the given recipeID | [optional]

### Return type

[**ResourceListOfPortfolioCashFlow**](ResourceListOfPortfolioCashFlow.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested portfolio cash flow data |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getTransactionHistory"></a>
# **getTransactionHistory**
> ResourceListOfChangeHistory getTransactionHistory(scope, code, transactionId, asAt)

[EARLY ACCESS] GetTransactionHistory: Get the history of a transaction

Get all of the changes that have happened to a transaction.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String transactionId = "transactionId_example"; // String | The unique ID of the transaction to create or update.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the history of the transaction. Defaults              to return the latest version if not specified.
    try {
      ResourceListOfChangeHistory result = apiInstance.getTransactionHistory(scope, code, transactionId, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#getTransactionHistory");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **transactionId** | **String**| The unique ID of the transaction to create or update. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the history of the transaction. Defaults              to return the latest version if not specified. | [optional]

### Return type

[**ResourceListOfChangeHistory**](ResourceListOfChangeHistory.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The history of the specified transaction (changes that have been made to it). |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getTransactions"></a>
# **getTransactions**
> VersionedResourceListOfTransaction getTransactions(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, page, limit, showCancelledTransactions)

GetTransactions: Get transactions

Retrieve all the transactions that occurred during a particular time interval.                If the portfolio is a derived transaction portfolio, the transactions returned are the  union set of all transactions of the parent (and any grandparents, etc.) as well as  those of the derived transaction portfolio itself.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies               the transaction portfolio.
    String fromTransactionDate = "fromTransactionDate_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no lower bound if this is not specified.
    String toTransactionDate = "toTransactionDate_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no upper bound if this is not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve transactions. Defaults to returning the latest version               of each transaction if not specified.
    String filter = "filter_example"; // String | Expression with which to filter the result set.               For example, to return only transactions with a transaction type of 'Buy', specify \"type eq 'Buy'\"               For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Instrument', 'Transaction', \"LegalEntity\" or \"CustodianAccount\" domain to decorate onto               transactions. These must have the format {domain}/{scope}/{code}, for example 'Instrument/system/Name' or               'Transaction/strategy/quantsignal'.
    String page = "page_example"; // String | The pagination token to use to continue listing transactions from a previous call to GetTransactions.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. The current behaviour is               to return all transactions if possible, but this will change to defaulting to 1000 if not specified in the future. It is recommended               to populate this field to enable pagination.
    Boolean showCancelledTransactions = true; // Boolean | Option to specify whether or not to include cancelled transactions,               including previous versions of transactions which have since been amended.               Defaults to False if not specified.
    try {
      VersionedResourceListOfTransaction result = apiInstance.getTransactions(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, page, limit, showCancelledTransactions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#getTransactions");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies               the transaction portfolio. |
 **fromTransactionDate** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no lower bound if this is not specified. | [optional]
 **toTransactionDate** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no upper bound if this is not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve transactions. Defaults to returning the latest version               of each transaction if not specified. | [optional]
 **filter** | **String**| Expression with which to filter the result set.               For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;               For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto               transactions. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39; or               &#39;Transaction/strategy/quantsignal&#39;. | [optional]
 **page** | **String**| The pagination token to use to continue listing transactions from a previous call to GetTransactions. | [optional]
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. The current behaviour is               to return all transactions if possible, but this will change to defaulting to 1000 if not specified in the future. It is recommended               to populate this field to enable pagination. | [optional]
 **showCancelledTransactions** | **Boolean**| Option to specify whether or not to include cancelled transactions,               including previous versions of transactions which have since been amended.               Defaults to False if not specified. | [optional]

### Return type

[**VersionedResourceListOfTransaction**](VersionedResourceListOfTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested transactions from the specified transaction portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listHoldingsAdjustments"></a>
# **listHoldingsAdjustments**
> ResourceListOfHoldingsAdjustmentHeader listHoldingsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAt)

ListHoldingsAdjustments: List holdings adjustments

List the holdings adjustments made to the specified transaction portfolio over a specified interval of effective time.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the holdings              adjustments. There is no lower bound if this is not specified.
    String toEffectiveAt = "toEffectiveAt_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve the holdings              adjustments. There is no upper bound if this is not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the holdings adjustments. Defaults to return the              latest version of each holding adjustment if not specified.
    try {
      ResourceListOfHoldingsAdjustmentHeader result = apiInstance.listHoldingsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#listHoldingsAdjustments");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **fromEffectiveAt** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the holdings              adjustments. There is no lower bound if this is not specified. | [optional]
 **toEffectiveAt** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve the holdings              adjustments. There is no upper bound if this is not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the holdings adjustments. Defaults to return the              latest version of each holding adjustment if not specified. | [optional]

### Return type

[**ResourceListOfHoldingsAdjustmentHeader**](ResourceListOfHoldingsAdjustmentHeader.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The record of holdings adjustments made to the specified transaction portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="patchPortfolioDetails"></a>
# **patchPortfolioDetails**
> PortfolioDetails patchPortfolioDetails(scope, code, operation, effectiveAt)

[EARLY ACCESS] PatchPortfolioDetails: Patch portfolio details

Create or update certain details for a particular transaction portfolio.  The behaviour is defined by the JSON Patch specification.                Note that not all elements of a transaction portfolio definition are  modifiable once it has been created due to the potential implications for data already stored.  Currently supported properties are: SubHoldingKeys, BaseCurrency, AmortisationMethod

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the               scope this uniquely identifies the transaction portfolio.
    List<Operation> operation = Arrays.asList(); // List<Operation> | The patch document.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the updated or inserted details should become valid.               Defaults to the current LUSID system datetime if not specified.               Note that this will affect all bitemporal entities in the request, but will not be used for any perpetual entities.
    try {
      PortfolioDetails result = apiInstance.patchPortfolioDetails(scope, code, operation, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#patchPortfolioDetails");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the               scope this uniquely identifies the transaction portfolio. |
 **operation** | [**List&lt;Operation&gt;**](Operation.md)| The patch document. |
 **effectiveAt** | **String**| The effective datetime or cut label at which the updated or inserted details should become valid.               Defaults to the current LUSID system datetime if not specified.               Note that this will affect all bitemporal entities in the request, but will not be used for any perpetual entities. | [optional]

### Return type

[**PortfolioDetails**](PortfolioDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The newly patched details |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="resolveInstrument"></a>
# **resolveInstrument**
> UpsertPortfolioTransactionsResponse resolveInstrument(scope, code, instrumentIdentifierType, instrumentIdentifierValue, fromEffectiveAt, reResolve, requestBody)

[EARLY ACCESS] ResolveInstrument: Resolve instrument

Try to resolve the instrument for transaction and holdings for a given instrument identifier and a specified  period of time. Also update the instrument identifiers with the given instrument identifiers collection.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String instrumentIdentifierType = "instrumentIdentifierType_example"; // String | The instrument identifier type.
    String instrumentIdentifierValue = "instrumentIdentifierValue_example"; // String | The value for the given instrument identifier.
    String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified.
    Boolean reResolve = false; // Boolean | When set to true, instrument resolution will be attempted for all transactions and holdings for the given identifier and date range.              When set to false (default behaviour), instrument resolution will only be attempted for those transactions and holdings that were previously unresolved.
    Map<String, String> requestBody = {"Instrument/default/Figi":"BBG000C6K6G9","Instrument/default/Isin":"GB00BH4HKS39"}; // Map<String, String> | The dictionary with the instrument identifiers to be updated on the             transaction and holdings.
    try {
      UpsertPortfolioTransactionsResponse result = apiInstance.resolveInstrument(scope, code, instrumentIdentifierType, instrumentIdentifierValue, fromEffectiveAt, reResolve, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#resolveInstrument");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **instrumentIdentifierType** | **String**| The instrument identifier type. |
 **instrumentIdentifierValue** | **String**| The value for the given instrument identifier. |
 **fromEffectiveAt** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. | [optional]
 **reResolve** | **Boolean**| When set to true, instrument resolution will be attempted for all transactions and holdings for the given identifier and date range.              When set to false (default behaviour), instrument resolution will only be attempted for those transactions and holdings that were previously unresolved. | [optional] [default to false]
 **requestBody** | [**Map&lt;String, String&gt;**](String.md)| The dictionary with the instrument identifiers to be updated on the             transaction and holdings. | [optional]

### Return type

[**UpsertPortfolioTransactionsResponse**](UpsertPortfolioTransactionsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The version of the transaction portfolio that contains the newly updated or inserted transactions |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="setHoldings"></a>
# **setHoldings**
> AdjustHolding setHoldings(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods)

SetHoldings: Set holdings

Set the holdings of the specified transaction portfolio to the provided targets. LUSID will automatically  construct adjustment transactions to ensure that the entire set of holdings for the transaction portfolio  are always set to the provided targets for the specified effective datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/how-do-i-adjust-my-holdings.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the holdings should be set to the provided targets.
    List<AdjustHoldingRequest> adjustHoldingRequest = Arrays.asList(); // List<AdjustHoldingRequest> | The complete set of target holdings for the transaction portfolio.
    List<String> reconciliationMethods = Arrays.asList(); // List<String> | Optional parameter for specifying a reconciliation method: e.g. FxForward.
    try {
      AdjustHolding result = apiInstance.setHoldings(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#setHoldings");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which the holdings should be set to the provided targets. |
 **adjustHoldingRequest** | [**List&lt;AdjustHoldingRequest&gt;**](AdjustHoldingRequest.md)| The complete set of target holdings for the transaction portfolio. |
 **reconciliationMethods** | [**List&lt;String&gt;**](String.md)| Optional parameter for specifying a reconciliation method: e.g. FxForward. | [optional]

### Return type

[**AdjustHolding**](AdjustHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The version of the transaction portfolio that contains the newly set holdings |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertPortfolioDetails"></a>
# **upsertPortfolioDetails**
> PortfolioDetails upsertPortfolioDetails(scope, code, createPortfolioDetails, effectiveAt)

UpsertPortfolioDetails: Upsert portfolio details

Create or update certain details for a particular transaction portfolio. The details are updated if they already exist, and inserted if they do not.                Note that not all elements of a transaction portfolio definition are  modifiable once it has been created due to the potential implications for data already stored.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the               scope this uniquely identifies the transaction portfolio.
    CreatePortfolioDetails createPortfolioDetails = new CreatePortfolioDetails(); // CreatePortfolioDetails | The details to create or update for the specified transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the updated or inserted details should become valid.               Defaults to the current LUSID system datetime if not specified.
    try {
      PortfolioDetails result = apiInstance.upsertPortfolioDetails(scope, code, createPortfolioDetails, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#upsertPortfolioDetails");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the               scope this uniquely identifies the transaction portfolio. |
 **createPortfolioDetails** | [**CreatePortfolioDetails**](CreatePortfolioDetails.md)| The details to create or update for the specified transaction portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which the updated or inserted details should become valid.               Defaults to the current LUSID system datetime if not specified. | [optional]

### Return type

[**PortfolioDetails**](PortfolioDetails.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The newly updated or inserted details |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertTransactionProperties"></a>
# **upsertTransactionProperties**
> UpsertTransactionPropertiesResponse upsertTransactionProperties(scope, code, transactionId, requestBody)

UpsertTransactionProperties: Upsert transaction properties

Create or update one or more transaction properties for a single transaction in the transaction portfolio.  Each property will be updated if it already exists and created if it does not.  Both transaction and portfolio must exist at the time when properties are created or updated.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String transactionId = "transactionId_example"; // String | The unique ID of the transaction to create or update properties for.
    Map<String, PerpetualProperty> requestBody = new HashMap(); // Map<String, PerpetualProperty> | The properties and their associated values to create or update.
    try {
      UpsertTransactionPropertiesResponse result = apiInstance.upsertTransactionProperties(scope, code, transactionId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#upsertTransactionProperties");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **transactionId** | **String**| The unique ID of the transaction to create or update properties for. |
 **requestBody** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md)| The properties and their associated values to create or update. |

### Return type

[**UpsertTransactionPropertiesResponse**](UpsertTransactionPropertiesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The version of the transaction portfolio that contains the newly updated or inserted transaction property |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertTransactions"></a>
# **upsertTransactions**
> UpsertPortfolioTransactionsResponse upsertTransactions(scope, code, transactionRequest)

UpsertTransactions: Upsert transactions

Create or update transactions in the transaction portfolio. A transaction will be updated  if it already exists and created if it does not.  The maximum number of transactions that this method can upsert per request is 10,000.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    List<TransactionRequest> transactionRequest = Arrays.asList(); // List<TransactionRequest> | A list of transactions to be created or updated.
    try {
      UpsertPortfolioTransactionsResponse result = apiInstance.upsertTransactions(scope, code, transactionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#upsertTransactions");
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
 **scope** | **String**| The scope of the transaction portfolio. |
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **transactionRequest** | [**List&lt;TransactionRequest&gt;**](TransactionRequest.md)| A list of transactions to be created or updated. |

### Return type

[**UpsertPortfolioTransactionsResponse**](UpsertPortfolioTransactionsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The version of the transaction portfolio that contains the newly updated or inserted transactions |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

