# TransactionPortfoliosApi

All URIs are relative to *http://local-unit-test-server.lusid.com:57381*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjustHoldings**](TransactionPortfoliosApi.md#adjustHoldings) | **POST** /api/transactionportfolios/{scope}/{code}/holdings | Adjust holdings
[**buildTransactions**](TransactionPortfoliosApi.md#buildTransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/$build | Build transactions
[**cancelAdjustHoldings**](TransactionPortfoliosApi.md#cancelAdjustHoldings) | **DELETE** /api/transactionportfolios/{scope}/{code}/holdings | Cancel adjust holdings
[**cancelExecutions**](TransactionPortfoliosApi.md#cancelExecutions) | **DELETE** /api/transactionportfolios/{scope}/{code}/executions | [EARLY ACCESS] Cancel executions
[**cancelTransactions**](TransactionPortfoliosApi.md#cancelTransactions) | **DELETE** /api/transactionportfolios/{scope}/{code}/transactions | Cancel transactions
[**createPortfolio**](TransactionPortfoliosApi.md#createPortfolio) | **POST** /api/transactionportfolios/{scope} | Create portfolio
[**deletePropertiesFromTransaction**](TransactionPortfoliosApi.md#deletePropertiesFromTransaction) | **DELETE** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties | Delete properties from transaction
[**getDetails**](TransactionPortfoliosApi.md#getDetails) | **GET** /api/transactionportfolios/{scope}/{code}/details | Get details
[**getHoldings**](TransactionPortfoliosApi.md#getHoldings) | **GET** /api/transactionportfolios/{scope}/{code}/holdings | Get holdings
[**getHoldingsAdjustment**](TransactionPortfoliosApi.md#getHoldingsAdjustment) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsadjustments/{effectiveAt} | Get holdings adjustment
[**getTransactions**](TransactionPortfoliosApi.md#getTransactions) | **GET** /api/transactionportfolios/{scope}/{code}/transactions | Get transactions
[**listHoldingsAdjustments**](TransactionPortfoliosApi.md#listHoldingsAdjustments) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsadjustments | List holdings adjustments
[**resolveInstrument**](TransactionPortfoliosApi.md#resolveInstrument) | **POST** /api/transactionportfolios/{scope}/{code}/$resolve | [EARLY ACCESS] Resolve Instrument
[**setHoldings**](TransactionPortfoliosApi.md#setHoldings) | **PUT** /api/transactionportfolios/{scope}/{code}/holdings | Set holdings
[**upsertExecutions**](TransactionPortfoliosApi.md#upsertExecutions) | **POST** /api/transactionportfolios/{scope}/{code}/executions | [EARLY ACCESS] Upsert executions
[**upsertPortfolioDetails**](TransactionPortfoliosApi.md#upsertPortfolioDetails) | **POST** /api/transactionportfolios/{scope}/{code}/details | Upsert portfolio details
[**upsertTransactionProperties**](TransactionPortfoliosApi.md#upsertTransactionProperties) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties | Upsert transaction properties
[**upsertTransactions**](TransactionPortfoliosApi.md#upsertTransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions | Upsert transactions


<a name="adjustHoldings"></a>
# **adjustHoldings**
> AdjustHolding adjustHoldings(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods)

Adjust holdings

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the holdings should be set to the provided targets.
    List<AdjustHoldingRequest> adjustHoldingRequest = [{"instrumentIdentifiers":{"instrument/default/Figi":"BBG000C6K6G9","instrument/default/Isin":"GB00BH4HKS39"},"subHoldingKeys":{"transaction/Algo/Name":{"key":"Transaction/Algo/Name","value":{"labelValue":"Algo1"}}},"properties":{"holding/Entity/Name":{"key":"Holding/Entity/Name","value":{"labelValue":"Financial Entity"}}},"taxLots":[{"units":100,"cost":{"amount":10000,"currency":"GBP"},"portfolioCost":10000,"price":100,"purchaseDate":"2018-03-05T00:00:00.0000000+00:00","settlementDate":"2018-03-08T00:00:00.0000000+00:00"}]}]; // List<AdjustHoldingRequest> | The selected set of holdings to adjust to the provided targets for the              transaction portfolio.
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

<a name="buildTransactions"></a>
# **buildTransactions**
> VersionedResourceListOfOutputTransaction buildTransactions(scope, code, transactionQueryParameters, asAt, filter, propertyKeys)

Build transactions

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    TransactionQueryParameters transactionQueryParameters = {"startDate":"2018-03-05T00:00:00.0000000+00:00","endDate":"2018-03-19T00:00:00.0000000+00:00","queryMode":"TradeDate","showCancelledTransactions":false}; // TransactionQueryParameters | The query queryParameters which control how the output transactions are built.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.              For example, to filter on the Transaction Type, use \"type eq 'Buy'\"              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" or \"Transaction\" domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or              \"Transaction/strategy/quantsignal\".
    try {
      VersionedResourceListOfOutputTransaction result = apiInstance.buildTransactions(scope, code, transactionQueryParameters, asAt, filter, propertyKeys);
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
 **filter** | **String**| Expression to filter the result set.              For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. | [optional]

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

Cancel adjust holdings

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
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

<a name="cancelExecutions"></a>
# **cancelExecutions**
> DeletedEntityResponse cancelExecutions(scope, code, executionIds)

[EARLY ACCESS] Cancel executions

Cancel one or more executions which exist in a specified transaction portfolio.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    List<String> executionIds = Arrays.asList(); // List<String> | The ids of the executions to cancel.
    try {
      DeletedEntityResponse result = apiInstance.cancelExecutions(scope, code, executionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#cancelExecutions");
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
 **executionIds** | [**List&lt;String&gt;**](String.md)| The ids of the executions to cancel. |

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
**200** | The datetime that the executions were cancelled |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="cancelTransactions"></a>
# **cancelTransactions**
> DeletedEntityResponse cancelTransactions(scope, code, transactionIds)

Cancel transactions

Cancel one or more transactions from the specified transaction portfolio.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    List<String> transactionIds = Arrays.asList(); // List<String> | The ids of the transactions to cancel.
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
 **transactionIds** | [**List&lt;String&gt;**](String.md)| The ids of the transactions to cancel. |

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

Create portfolio

Create a transaction portfolio in a specific scope.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope that the transaction portfolio will be created in.
    CreateTransactionPortfolioRequest createTransactionPortfolioRequest = {"displayName":"Portfolio UK","description":"Portfolio for UK market","code":"PortfolioUk","created":"2018-03-05T12:00:00.0000000+00:00","baseCurrency":"GBP","corporateActionSourceId":{"scope":"Sources","code":"Vendor1"},"accountingMethod":"Default","subHoldingKeys":[],"properties":{"portfolio/Manager/Name":{"key":"Portfolio/Manager/Name","value":{"labelValue":"Matt Smith"},"effectiveFrom":"2018-03-05T12:00:00.0000000+00:00"},"portfolio/Manager/Id":{"key":"Portfolio/Manager/Id","value":{"metricValue":{"value":1628483,"unit":"NoUnits"}},"effectiveFrom":"2018-03-05T12:00:00.0000000+00:00"}}}; // CreateTransactionPortfolioRequest | The definition and details of the transaction portfolio.
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
 **scope** | **String**| The scope that the transaction portfolio will be created in. |
 **createTransactionPortfolioRequest** | [**CreateTransactionPortfolioRequest**](CreateTransactionPortfolioRequest.md)| The definition and details of the transaction portfolio. |

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
**201** | The newly created transaction portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deletePropertiesFromTransaction"></a>
# **deletePropertiesFromTransaction**
> DeletedEntityResponse deletePropertiesFromTransaction(scope, code, transactionId, propertyKeys)

Delete properties from transaction

Delete one or more property values from a single transaction in a transaction portfolio.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String transactionId = "transactionId_example"; // String | The unique id of the transaction to delete the property value from.
    List<String> propertyKeys = Arrays.asList(); // List<String> | The property keys of the properties to delete from the transaction.              This must be from the \"Transaction\" domain and will have the format {domain}/{scope}/{code} e.g.              \"Transaction/strategy/quantsignal\".
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
 **transactionId** | **String**| The unique id of the transaction to delete the property value from. |
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| The property keys of the properties to delete from the transaction.              This must be from the \&quot;Transaction\&quot; domain and will have the format {domain}/{scope}/{code} e.g.              \&quot;Transaction/strategy/quantsignal\&quot;. |

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

<a name="getDetails"></a>
# **getDetails**
> PortfolioDetails getDetails(scope, code, effectiveAt, asAt)

Get details

Get the details associated with a transaction portfolio.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio to retrieve the details for.
    String code = "code_example"; // String | The code of the transaction portfolio to retrieve the details for. Together with the              scope this uniquely identifies the transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the details of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to return the latest version of the details if not specified.
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
 **scope** | **String**| The scope of the transaction portfolio to retrieve the details for. |
 **code** | **String**| The code of the transaction portfolio to retrieve the details for. Together with the              scope this uniquely identifies the transaction portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the details of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to return the latest version of the details if not specified. | [optional]

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

Get holdings

Get the holdings of the specified transaction portfolio.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version of the holdings if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.               For example, to filter on the Holding Type, use \"holdingType eq 'p'\"              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" or \"Holding\" domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or \"Holding/system/Cost\".
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
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version of the holdings if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set.               For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; or \&quot;Holding\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. | [optional]
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
> HoldingsAdjustment getHoldingsAdjustment(scope, code, effectiveAt, asAt)

Get holdings adjustment

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label of the holdings adjustment.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the holdings adjustment. Defaults to the return the latest              version of the holdings adjustment if not specified.
    try {
      HoldingsAdjustment result = apiInstance.getHoldingsAdjustment(scope, code, effectiveAt, asAt);
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

<a name="getTransactions"></a>
# **getTransactions**
> VersionedResourceListOfTransaction getTransactions(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys)

Get transactions

Get transactions from the specified transaction portfolio over a given interval of effective time.     When the specified portfolio is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.  The maximum number of transactions that this method can get per request is 2,000.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String fromTransactionDate = "fromTransactionDate_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.              There is no lower bound if this is not specified.
    String toTransactionDate = "toTransactionDate_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the transactions. Defaults to return the latest version              of each transaction if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.               For example, to filter on the Transaction Type, use \"type eq 'Buy'\"              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" or \"Transaction\" domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or              \"Transaction/strategy/quantsignal\".
    try {
      VersionedResourceListOfTransaction result = apiInstance.getTransactions(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys);
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
 **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. |
 **fromTransactionDate** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.              There is no lower bound if this is not specified. | [optional]
 **toTransactionDate** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transactions. Defaults to return the latest version              of each transaction if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set.               For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. | [optional]

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

List holdings adjustments

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the holdings              adjustments. There is no lower bound if this is not specified.
    String toEffectiveAt = "toEffectiveAt_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve the holdings              adjustments. There is no upper bound if this is not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the holdings adjustments. Defaults to return the              latest version of each holding adjustment if not specified.
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

<a name="resolveInstrument"></a>
# **resolveInstrument**
> UpsertPortfolioTransactionsResponse resolveInstrument(scope, code, instrumentIdentifierType, instrumentIdentifierValue, fromEffectiveAt, requestBody)

[EARLY ACCESS] Resolve Instrument

Try to resolve the instrument for transaction and holdings for a given instrument identifier and a specified    period of time. Also update the instrument identifiers with the given instrument identifiers collection.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String instrumentIdentifierType = "instrumentIdentifierType_example"; // String | The instrument identifier type.
    String instrumentIdentifierValue = "instrumentIdentifierValue_example"; // String | The value for the given instrument identifier.
    String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified.
    Map<String, String> requestBody = {"instrument/default/Figi":"BBG000C6K6G9","instrument/default/Isin":"GB00BH4HKS39"}; // Map<String, String> | The dictionary with the instrument identifiers to be updated on the              transaction and holdings.
    try {
      UpsertPortfolioTransactionsResponse result = apiInstance.resolveInstrument(scope, code, instrumentIdentifierType, instrumentIdentifierValue, fromEffectiveAt, requestBody);
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
 **requestBody** | [**Map&lt;String, String&gt;**](String.md)| The dictionary with the instrument identifiers to be updated on the              transaction and holdings. | [optional]

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

Set holdings

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the holdings should be set to the provided targets.
    List<AdjustHoldingRequest> adjustHoldingRequest = [{"instrumentIdentifiers":{"instrument/default/Figi":"BBG000C6K6G9","instrument/default/Isin":"GB00BH4HKS39"},"subHoldingKeys":{"transaction/Algo/Name":{"key":"Transaction/Algo/Name","value":{"labelValue":"Algo1"}}},"properties":{"holding/Entity/Name":{"key":"Holding/Entity/Name","value":{"labelValue":"Financial Entity"}}},"taxLots":[{"units":100,"cost":{"amount":10000,"currency":"GBP"},"portfolioCost":10000,"price":100,"purchaseDate":"2018-03-05T00:00:00.0000000+00:00","settlementDate":"2018-03-08T00:00:00.0000000+00:00"}]}]; // List<AdjustHoldingRequest> | The complete set of target holdings for the transaction portfolio.
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

<a name="upsertExecutions"></a>
# **upsertExecutions**
> UpsertPortfolioExecutionsResponse upsertExecutions(scope, code, executionRequest)

[EARLY ACCESS] Upsert executions

Update or insert executions into the specified transaction portfolio. An execution will be updated  if it already exists and inserted if it does not.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    List<ExecutionRequest> executionRequest = [{"executionId":"ExecutionId-11111","side":"SellShort","instrumentIdentifiers":{"clientInternal":"CLI-183461"},"transactionTime":"2018-03-05T12:00:00.0000000+00:00","lastShares":1000,"lastPx":1.23,"currency":"USD"}]; // List<ExecutionRequest> | The executions to update or insert.
    try {
      UpsertPortfolioExecutionsResponse result = apiInstance.upsertExecutions(scope, code, executionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#upsertExecutions");
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
 **executionRequest** | [**List&lt;ExecutionRequest&gt;**](ExecutionRequest.md)| The executions to update or insert. | [optional]

### Return type

[**UpsertPortfolioExecutionsResponse**](UpsertPortfolioExecutionsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The version of the transaction portfolio that contains the newly updated or inserted executions |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertPortfolioDetails"></a>
# **upsertPortfolioDetails**
> PortfolioDetails upsertPortfolioDetails(scope, code, createPortfolioDetails, effectiveAt)

Upsert portfolio details

Update or insert details for the specified transaction portfolio. The details will be updated  if they already exist and inserted if they do not.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio to update or insert details for.
    String code = "code_example"; // String | The code of the transaction portfolio to update or insert details for. Together with the              scope this uniquely identifies the transaction portfolio.
    CreatePortfolioDetails createPortfolioDetails = {"corporateActionSourceId":{"scope":"Sources","code":"Vendor1"}}; // CreatePortfolioDetails | The details to update or insert for the specified transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the updated or inserted details should become valid.              Defaults to the current LUSID system datetime if not specified.
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
 **scope** | **String**| The scope of the transaction portfolio to update or insert details for. |
 **code** | **String**| The code of the transaction portfolio to update or insert details for. Together with the              scope this uniquely identifies the transaction portfolio. |
 **createPortfolioDetails** | [**CreatePortfolioDetails**](CreatePortfolioDetails.md)| The details to update or insert for the specified transaction portfolio. |
 **effectiveAt** | **String**| The effective datetime or cut label at which the updated or inserted details should become valid.              Defaults to the current LUSID system datetime if not specified. | [optional]

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

Upsert transaction properties

Update or insert one or more transaction properties to a single transaction in a transaction portfolio.  Each property will be updated if it already exists and inserted if it does not.  Both transaction and portfolio must exist at the time when properties are updated or inserted.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String transactionId = "transactionId_example"; // String | The unique id of the transaction to update or insert properties against.
    Map<String, PerpetualProperty> requestBody = {"transaction/MyScope/MyPropertyName":{"key":"Transaction/MyScope/MyPropertyName","value":{"metricValue":{"value":12345.5672,"unit":"Unit"}}},"transaction/MyScope/MyPropertyName2":{"key":"Transaction/MyScope/MyPropertyName2","value":{"metricValue":{"value":925.3,"unit":"Unit"}}}}; // Map<String, PerpetualProperty> | The properties with their associated values to update or insert onto the              transaction.
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
 **transactionId** | **String**| The unique id of the transaction to update or insert properties against. |
 **requestBody** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md)| The properties with their associated values to update or insert onto the              transaction. |

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

Upsert transactions

Update or insert transactions into the specified transaction portfolio. A transaction will be updated  if it already exists and inserted if it does not.  The maximum number of transactions that this method can upsert per request is 10,000.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:57381");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    List<TransactionRequest> transactionRequest = [{"transactionId":"TransactionId-111111","type":"StockIn","instrumentIdentifiers":{"instrument/default/Figi":"BBG000C6K6G9","instrument/default/Isin":"GB00BH4HKS39"},"transactionDate":"2018-03-05T00:00:00.0000000+00:00","settlementDate":"2018-03-08T00:00:00.0000000+00:00","units":1000,"transactionPrice":{"price":123,"type":"Price"},"totalConsideration":{"amount":123000,"currency":"GBP"},"transactionCurrency":"GBP","properties":{"transaction/Algo/Name":{"key":"Transaction/Algo/Name","value":{"labelValue":"Algo1"}}},"counterpartyId":"CounterpartyId-118263","source":""}]; // List<TransactionRequest> | The transactions to be updated or inserted.
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
 **transactionRequest** | [**List&lt;TransactionRequest&gt;**](TransactionRequest.md)| The transactions to be updated or inserted. |

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

