# TransactionPortfoliosApi

All URIs are relative to *http://http:/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjustHoldings**](TransactionPortfoliosApi.md#adjustHoldings) | **POST** /api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt} | [EARLY ACCESS] Adjust holdings
[**buildTransactions**](TransactionPortfoliosApi.md#buildTransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/$build | [EARLY ACCESS] Build transactions
[**cancelAdjustHoldings**](TransactionPortfoliosApi.md#cancelAdjustHoldings) | **DELETE** /api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt} | [EARLY ACCESS] Cancel adjust holdings
[**cancelExecutions**](TransactionPortfoliosApi.md#cancelExecutions) | **DELETE** /api/transactionportfolios/{scope}/{code}/executions | [EARLY ACCESS] Cancel executions
[**cancelTransactions**](TransactionPortfoliosApi.md#cancelTransactions) | **DELETE** /api/transactionportfolios/{scope}/{code}/transactions | [EARLY ACCESS] Cancel transactions
[**createPortfolio**](TransactionPortfoliosApi.md#createPortfolio) | **POST** /api/transactionportfolios/{scope} | [EARLY ACCESS] Create portfolio
[**deletePropertyFromTransaction**](TransactionPortfoliosApi.md#deletePropertyFromTransaction) | **DELETE** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties | [EARLY ACCESS] Delete property from transaction
[**getDetails**](TransactionPortfoliosApi.md#getDetails) | **GET** /api/transactionportfolios/{scope}/{code}/details | [EARLY ACCESS] Get details
[**getHoldings**](TransactionPortfoliosApi.md#getHoldings) | **GET** /api/transactionportfolios/{scope}/{code}/holdings | [EARLY ACCESS] Get holdings
[**getHoldingsAdjustment**](TransactionPortfoliosApi.md#getHoldingsAdjustment) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsadjustments/{effectiveAt} | [EARLY ACCESS] Get holdings adjustment
[**getTransactions**](TransactionPortfoliosApi.md#getTransactions) | **GET** /api/transactionportfolios/{scope}/{code}/transactions | [EARLY ACCESS] Get transactions
[**listHoldingsAdjustments**](TransactionPortfoliosApi.md#listHoldingsAdjustments) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsadjustments | [EARLY ACCESS] List holdings adjustments
[**setHoldings**](TransactionPortfoliosApi.md#setHoldings) | **PUT** /api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt} | [EARLY ACCESS] Set holdings
[**upsertExecutions**](TransactionPortfoliosApi.md#upsertExecutions) | **POST** /api/transactionportfolios/{scope}/{code}/executions | [EARLY ACCESS] Upsert executions
[**upsertPortfolioDetails**](TransactionPortfoliosApi.md#upsertPortfolioDetails) | **POST** /api/transactionportfolios/{scope}/{code}/details | [EARLY ACCESS] Upsert portfolio details
[**upsertTransactionProperties**](TransactionPortfoliosApi.md#upsertTransactionProperties) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties | [EARLY ACCESS] Upsert transaction properties
[**upsertTransactions**](TransactionPortfoliosApi.md#upsertTransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions | [EARLY ACCESS] Upsert transactions


<a name="adjustHoldings"></a>
# **adjustHoldings**
> AdjustHolding adjustHoldings(scope, code, effectiveAt, holdingAdjustments)

[EARLY ACCESS] Adjust holdings

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
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the holdings should be set to the provided targets.
    List<AdjustHoldingRequest> holdingAdjustments = Arrays.asList(null); // List<AdjustHoldingRequest> | The selected set of holdings to adjust to the provided targets for the              transaction portfolio.
    try {
      AdjustHolding result = apiInstance.adjustHoldings(scope, code, effectiveAt, holdingAdjustments);
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
 **holdingAdjustments** | [**List&lt;AdjustHoldingRequest&gt;**](AdjustHoldingRequest.md)| The selected set of holdings to adjust to the provided targets for the              transaction portfolio. | [optional]

### Return type

[**AdjustHolding**](AdjustHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The version of the transaction portfolio that contains the newly adjusted holdings |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="buildTransactions"></a>
# **buildTransactions**
> VersionedResourceListOfOutputTransaction buildTransactions(scope, code, parameters, asAt, propertyKeys, filter)

[EARLY ACCESS] Build transactions

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
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    TransactionQueryParameters parameters = new TransactionQueryParameters(); // TransactionQueryParameters | The query parameters which control how the output transactions are built.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" or \"Transaction\" domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or              \"Transaction/strategy/quantsignal\".
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      VersionedResourceListOfOutputTransaction result = apiInstance.buildTransactions(scope, code, parameters, asAt, propertyKeys, filter);
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
 **parameters** | [**TransactionQueryParameters**](TransactionQueryParameters.md)| The query parameters which control how the output transactions are built. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

### Return type

[**VersionedResourceListOfOutputTransaction**](VersionedResourceListOfOutputTransaction.md)

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

<a name="cancelAdjustHoldings"></a>
# **cancelAdjustHoldings**
> DeletedEntityResponse cancelAdjustHoldings(scope, code, effectiveAt)

[EARLY ACCESS] Cancel adjust holdings

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
    defaultClient.setBasePath("http://http:/api");
    
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
    defaultClient.setBasePath("http://http:/api");
    
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

[EARLY ACCESS] Cancel transactions

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
    defaultClient.setBasePath("http://http:/api");
    
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
> Portfolio createPortfolio(scope, createRequest)

[EARLY ACCESS] Create portfolio

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
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope that the transaction portfolio will be created in.
    CreateTransactionPortfolioRequest createRequest = new CreateTransactionPortfolioRequest(); // CreateTransactionPortfolioRequest | The definition and details of the transaction portfolio.
    try {
      Portfolio result = apiInstance.createPortfolio(scope, createRequest);
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
 **createRequest** | [**CreateTransactionPortfolioRequest**](CreateTransactionPortfolioRequest.md)| The definition and details of the transaction portfolio. | [optional]

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
**201** | The newly created transaction portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deletePropertyFromTransaction"></a>
# **deletePropertyFromTransaction**
> DeletedEntityResponse deletePropertyFromTransaction(scope, code, transactionId, transactionPropertyKey)

[EARLY ACCESS] Delete property from transaction

Delete a single property value from a single transaction in a transaction portfolio.

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
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String transactionId = "transactionId_example"; // String | The unique id of the transaction to delete the property value from.
    String transactionPropertyKey = "transactionPropertyKey_example"; // String | The property key of the property value to delete from the transaction.              This must be from the \"Transaction\" domain and will have the format {domain}/{scope}/{code} e.g.              \"Transaction/strategy/quantsignal\".
    try {
      DeletedEntityResponse result = apiInstance.deletePropertyFromTransaction(scope, code, transactionId, transactionPropertyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionPortfoliosApi#deletePropertyFromTransaction");
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
 **transactionPropertyKey** | **String**| The property key of the property value to delete from the transaction.              This must be from the \&quot;Transaction\&quot; domain and will have the format {domain}/{scope}/{code} e.g.              \&quot;Transaction/strategy/quantsignal\&quot;. |

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

[EARLY ACCESS] Get details

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
    defaultClient.setBasePath("http://http:/api");
    
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
> VersionedResourceListOfPortfolioHolding getHoldings(scope, code, byTaxlots, effectiveAt, asAt, filter, propertyKeys)

[EARLY ACCESS] Get holdings

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
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    Boolean byTaxlots = true; // Boolean | Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version of the holdings if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" or \"Holding\" domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or \"Holding/system/Cost\".
    try {
      VersionedResourceListOfPortfolioHolding result = apiInstance.getHoldings(scope, code, byTaxlots, effectiveAt, asAt, filter, propertyKeys);
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
 **byTaxlots** | **Boolean**| Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. | [optional]
 **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version of the holdings if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; or \&quot;Holding\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. | [optional]

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

[EARLY ACCESS] Get holdings adjustment

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
    defaultClient.setBasePath("http://http:/api");
    
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
> VersionedResourceListOfTransaction getTransactions(scope, code, fromTransactionDate, toTransactionDate, asAt, propertyKeys, filter)

[EARLY ACCESS] Get transactions

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
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String fromTransactionDate = "fromTransactionDate_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.              There is no lower bound if this is not specified.
    String toTransactionDate = "toTransactionDate_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the transactions. Defaults to return the latest version              of each transaction if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" or \"Transaction\" domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or              \"Transaction/strategy/quantsignal\".
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      VersionedResourceListOfTransaction result = apiInstance.getTransactions(scope, code, fromTransactionDate, toTransactionDate, asAt, propertyKeys, filter);
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
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

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

[EARLY ACCESS] List holdings adjustments

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
    defaultClient.setBasePath("http://http:/api");
    
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

<a name="setHoldings"></a>
# **setHoldings**
> AdjustHolding setHoldings(scope, code, effectiveAt, holdingAdjustments)

[EARLY ACCESS] Set holdings

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
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the holdings should be set to the provided targets.
    List<AdjustHoldingRequest> holdingAdjustments = Arrays.asList(null); // List<AdjustHoldingRequest> | The complete set of target holdings for the transaction portfolio.
    try {
      AdjustHolding result = apiInstance.setHoldings(scope, code, effectiveAt, holdingAdjustments);
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
 **holdingAdjustments** | [**List&lt;AdjustHoldingRequest&gt;**](AdjustHoldingRequest.md)| The complete set of target holdings for the transaction portfolio. | [optional]

### Return type

[**AdjustHolding**](AdjustHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The version of the transaction portfolio that contains the newly set holdings |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertExecutions"></a>
# **upsertExecutions**
> UpsertPortfolioExecutionsResponse upsertExecutions(scope, code, executions)

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
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    List<ExecutionRequest> executions = Arrays.asList(null); // List<ExecutionRequest> | The executions to update or insert.
    try {
      UpsertPortfolioExecutionsResponse result = apiInstance.upsertExecutions(scope, code, executions);
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
 **executions** | [**List&lt;ExecutionRequest&gt;**](ExecutionRequest.md)| The executions to update or insert. | [optional]

### Return type

[**UpsertPortfolioExecutionsResponse**](UpsertPortfolioExecutionsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The version of the transaction portfolio that contains the newly updated or inserted executions |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertPortfolioDetails"></a>
# **upsertPortfolioDetails**
> PortfolioDetails upsertPortfolioDetails(scope, code, effectiveAt, details)

[EARLY ACCESS] Upsert portfolio details

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
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio to update or insert details for.
    String code = "code_example"; // String | The code of the transaction portfolio to update or insert details for. Together with the              scope this uniquely identifies the transaction portfolio.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the updated or inserted details should become valid.              Defaults to the current LUSID system datetime if not specified.
    CreatePortfolioDetails details = new CreatePortfolioDetails(); // CreatePortfolioDetails | The details to update or insert for the specified transaction portfolio.
    try {
      PortfolioDetails result = apiInstance.upsertPortfolioDetails(scope, code, effectiveAt, details);
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
 **effectiveAt** | **String**| The effective datetime or cut label at which the updated or inserted details should become valid.              Defaults to the current LUSID system datetime if not specified. | [optional]
 **details** | [**CreatePortfolioDetails**](CreatePortfolioDetails.md)| The details to update or insert for the specified transaction portfolio. | [optional]

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
**200** | The newly updated or inserted details |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertTransactionProperties"></a>
# **upsertTransactionProperties**
> UpsertTransactionPropertiesResponse upsertTransactionProperties(scope, code, transactionId, transactionProperties)

[EARLY ACCESS] Upsert transaction properties

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
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    String transactionId = "transactionId_example"; // String | The unique id of the transaction to update or insert properties against.
    Map<String, PerpetualProperty> transactionProperties = new HashMap(); // Map<String, PerpetualProperty> | The properties with their associated values to update or insert onto the              transaction.
    try {
      UpsertTransactionPropertiesResponse result = apiInstance.upsertTransactionProperties(scope, code, transactionId, transactionProperties);
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
 **transactionProperties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md)| The properties with their associated values to update or insert onto the              transaction. |

### Return type

[**UpsertTransactionPropertiesResponse**](UpsertTransactionPropertiesResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The version of the transaction portfolio that contains the newly updated or inserted transaction property |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertTransactions"></a>
# **upsertTransactions**
> UpsertPortfolioTransactionsResponse upsertTransactions(scope, code, transactions)

[EARLY ACCESS] Upsert transactions

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
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionPortfoliosApi apiInstance = new TransactionPortfoliosApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the transaction portfolio.
    String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio.
    List<TransactionRequest> transactions = Arrays.asList(null); // List<TransactionRequest> | The transactions to be updated or inserted.
    try {
      UpsertPortfolioTransactionsResponse result = apiInstance.upsertTransactions(scope, code, transactions);
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
 **transactions** | [**List&lt;TransactionRequest&gt;**](TransactionRequest.md)| The transactions to be updated or inserted. | [optional]

### Return type

[**UpsertPortfolioTransactionsResponse**](UpsertPortfolioTransactionsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The version of the transaction portfolio that contains the newly updated or inserted transactions |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

