# TransactionPortfoliosApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adjustHoldings**](TransactionPortfoliosApi.md#adjustHoldings) | **POST** /api/transactionportfolios/{scope}/{code}/holdings | AdjustHoldings: Adjust holdings |
| [**batchAdjustHoldings**](TransactionPortfoliosApi.md#batchAdjustHoldings) | **POST** /api/transactionportfolios/{scope}/{code}/holdings/$batchAdjust | [EARLY ACCESS] BatchAdjustHoldings: Batch adjust holdings |
| [**batchCreateTradeTickets**](TransactionPortfoliosApi.md#batchCreateTradeTickets) | **POST** /api/transactionportfolios/{scope}/{code}/$batchtradetickets | [EARLY ACCESS] BatchCreateTradeTickets: Batch Create Trade Tickets |
| [**batchSetHoldings**](TransactionPortfoliosApi.md#batchSetHoldings) | **POST** /api/transactionportfolios/{scope}/{code}/holdings/$batchSet | [EARLY ACCESS] BatchSetHoldings: Batch set holdings |
| [**batchUpsertTransactions**](TransactionPortfoliosApi.md#batchUpsertTransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/$batchUpsert | [EARLY ACCESS] BatchUpsertTransactions: Batch upsert transactions |
| [**buildTransactions**](TransactionPortfoliosApi.md#buildTransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/$build | BuildTransactions: Build transactions |
| [**cancelAdjustHoldings**](TransactionPortfoliosApi.md#cancelAdjustHoldings) | **DELETE** /api/transactionportfolios/{scope}/{code}/holdings | CancelAdjustHoldings: Cancel adjust holdings |
| [**cancelSingleAdjustHolding**](TransactionPortfoliosApi.md#cancelSingleAdjustHolding) | **POST** /api/transactionportfolios/{scope}/{code}/holdings/$cancelAdjustment | [EARLY ACCESS] CancelSingleAdjustHolding: Cancel single holding adjustment. |
| [**cancelTransactions**](TransactionPortfoliosApi.md#cancelTransactions) | **DELETE** /api/transactionportfolios/{scope}/{code}/transactions | CancelTransactions: Cancel transactions |
| [**createPortfolio**](TransactionPortfoliosApi.md#createPortfolio) | **POST** /api/transactionportfolios/{scope} | CreatePortfolio: Create portfolio |
| [**createTradeTicket**](TransactionPortfoliosApi.md#createTradeTicket) | **POST** /api/transactionportfolios/{scope}/{code}/$tradeticket | [EARLY ACCESS] CreateTradeTicket: Create Trade Ticket |
| [**deleteCustodianAccounts**](TransactionPortfoliosApi.md#deleteCustodianAccounts) | **POST** /api/transactionportfolios/{scope}/{code}/custodianaccounts/$delete | [EXPERIMENTAL] DeleteCustodianAccounts: Soft or hard delete multiple custodian accounts |
| [**deletePropertiesFromTransaction**](TransactionPortfoliosApi.md#deletePropertiesFromTransaction) | **DELETE** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties | DeletePropertiesFromTransaction: Delete properties from transaction |
| [**getA2BData**](TransactionPortfoliosApi.md#getA2BData) | **GET** /api/transactionportfolios/{scope}/{code}/a2b | GetA2BData: Get A2B data |
| [**getA2BMovements**](TransactionPortfoliosApi.md#getA2BMovements) | **GET** /api/transactionportfolios/{scope}/{code}/a2bmovements | GetA2BMovements: Get an A2B report at the movement level for the given portfolio. |
| [**getBucketedCashFlows**](TransactionPortfoliosApi.md#getBucketedCashFlows) | **POST** /api/transactionportfolios/{scope}/{code}/bucketedCashFlows | [EXPERIMENTAL] GetBucketedCashFlows: Get bucketed cash flows from a list of portfolios |
| [**getCustodianAccount**](TransactionPortfoliosApi.md#getCustodianAccount) | **GET** /api/transactionportfolios/{scope}/{code}/custodianaccounts/{custodianAccountScope}/{custodianAccountCode} | [EXPERIMENTAL] GetCustodianAccount: Get Custodian Account |
| [**getDetails**](TransactionPortfoliosApi.md#getDetails) | **GET** /api/transactionportfolios/{scope}/{code}/details | GetDetails: Get details |
| [**getHoldingContributors**](TransactionPortfoliosApi.md#getHoldingContributors) | **GET** /api/transactionportfolios/{scope}/{code}/holdings/{holdingId}/contributors | [EARLY ACCESS] GetHoldingContributors: Get Holdings Contributors |
| [**getHoldings**](TransactionPortfoliosApi.md#getHoldings) | **GET** /api/transactionportfolios/{scope}/{code}/holdings | GetHoldings: Get holdings |
| [**getHoldingsAdjustment**](TransactionPortfoliosApi.md#getHoldingsAdjustment) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsadjustments/{effectiveAt} | GetHoldingsAdjustment: Get holdings adjustment |
| [**getHoldingsWithOrders**](TransactionPortfoliosApi.md#getHoldingsWithOrders) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsWithOrders | [EXPERIMENTAL] GetHoldingsWithOrders: Get holdings with orders |
| [**getMultipleHoldingContributors**](TransactionPortfoliosApi.md#getMultipleHoldingContributors) | **POST** /api/transactionportfolios/{scope}/{code}/holdings/contributors/$get | [EARLY ACCESS] GetMultipleHoldingContributors: Get Multiple Holding Contributors |
| [**getPortfolioCashFlows**](TransactionPortfoliosApi.md#getPortfolioCashFlows) | **GET** /api/transactionportfolios/{scope}/{code}/cashflows | GetPortfolioCashFlows: Get portfolio cash flows |
| [**getPortfolioCashLadder**](TransactionPortfoliosApi.md#getPortfolioCashLadder) | **GET** /api/transactionportfolios/{scope}/{code}/cashladder | GetPortfolioCashLadder: Get portfolio cash ladder |
| [**getPortfolioCashStatement**](TransactionPortfoliosApi.md#getPortfolioCashStatement) | **GET** /api/transactionportfolios/{scope}/{code}/cashstatement | GetPortfolioCashStatement: Get portfolio cash statement |
| [**getTransactionHistory**](TransactionPortfoliosApi.md#getTransactionHistory) | **GET** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/history | GetTransactionHistory: Get the history of a transaction |
| [**getTransactions**](TransactionPortfoliosApi.md#getTransactions) | **GET** /api/transactionportfolios/{scope}/{code}/transactions | GetTransactions: Get transactions |
| [**getUpsertablePortfolioCashFlows**](TransactionPortfoliosApi.md#getUpsertablePortfolioCashFlows) | **GET** /api/transactionportfolios/{scope}/{code}/upsertablecashflows | GetUpsertablePortfolioCashFlows: Get upsertable portfolio cash flows. |
| [**listCustodianAccounts**](TransactionPortfoliosApi.md#listCustodianAccounts) | **GET** /api/transactionportfolios/{scope}/{code}/custodianaccounts | [EXPERIMENTAL] ListCustodianAccounts: List Custodian Accounts |
| [**listHoldingsAdjustments**](TransactionPortfoliosApi.md#listHoldingsAdjustments) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsadjustments | ListHoldingsAdjustments: List holdings adjustments |
| [**patchPortfolioDetails**](TransactionPortfoliosApi.md#patchPortfolioDetails) | **PATCH** /api/transactionportfolios/{scope}/{code}/details | PatchPortfolioDetails: Patch portfolio details |
| [**previewTransaction**](TransactionPortfoliosApi.md#previewTransaction) | **POST** /api/transactionportfolios/{scope}/{code}/previewTransaction | [EARLY ACCESS] PreviewTransaction: Preview a transaction |
| [**resolveInstrument**](TransactionPortfoliosApi.md#resolveInstrument) | **POST** /api/transactionportfolios/{scope}/{code}/$resolve | ResolveInstrument: Resolve instrument |
| [**setHoldings**](TransactionPortfoliosApi.md#setHoldings) | **PUT** /api/transactionportfolios/{scope}/{code}/holdings | SetHoldings: Set holdings |
| [**upsertCustodianAccounts**](TransactionPortfoliosApi.md#upsertCustodianAccounts) | **POST** /api/transactionportfolios/{scope}/{code}/custodianaccounts | [EXPERIMENTAL] UpsertCustodianAccounts: Upsert Custodian Accounts |
| [**upsertCustodianAccountsProperties**](TransactionPortfoliosApi.md#upsertCustodianAccountsProperties) | **POST** /api/transactionportfolios/{scope}/{code}/custodianaccounts/{custodianAccountScope}/{custodianAccountCode}/properties/$upsert | [EXPERIMENTAL] UpsertCustodianAccountsProperties: Upsert custodian accounts properties |
| [**upsertPortfolioDetails**](TransactionPortfoliosApi.md#upsertPortfolioDetails) | **POST** /api/transactionportfolios/{scope}/{code}/details | UpsertPortfolioDetails: Upsert portfolio details |
| [**upsertTransactionProperties**](TransactionPortfoliosApi.md#upsertTransactionProperties) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties | UpsertTransactionProperties: Upsert transaction properties |
| [**upsertTransactions**](TransactionPortfoliosApi.md#upsertTransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions | UpsertTransactions: Upsert transactions |



## adjustHoldings

> AdjustHolding adjustHoldings(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods)

AdjustHoldings: Adjust holdings

Adjust one or more holdings of the specified transaction portfolio to the provided targets. LUSID will  automatically construct adjustment transactions to ensure that the holdings which have been adjusted are  always set to the provided targets for the specified effective datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/docs/how-do-i-manually-adjust-or-set-holdings.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the holdings should be set to the provided targets.
        List<AdjustHoldingRequest> adjustHoldingRequest = Arrays.asList(); // List<AdjustHoldingRequest> | The selected set of holdings to adjust to the provided targets for the   transaction portfolio.
        List<String> reconciliationMethods = Arrays.asList(); // List<String> | Optional parameter for specifying a reconciliation method: e.g. FxForward.
        try {
            // uncomment the below to set overrides at the request level
            // AdjustHolding result = apiInstance.adjustHoldings(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods).execute(opts);

            AdjustHolding result = apiInstance.adjustHoldings(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#adjustHoldings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which the holdings should be set to the provided targets. | |
| **adjustHoldingRequest** | [**List&lt;AdjustHoldingRequest&gt;**](AdjustHoldingRequest.md)| The selected set of holdings to adjust to the provided targets for the   transaction portfolio. | |
| **reconciliationMethods** | [**List&lt;String&gt;**](String.md)| Optional parameter for specifying a reconciliation method: e.g. FxForward. | [optional] |

### Return type

[**AdjustHolding**](AdjustHolding.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The version of the transaction portfolio that contains the newly adjusted holdings |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## batchAdjustHoldings

> BatchAdjustHoldingsResponse batchAdjustHoldings(scope, code, successMode, requestBody, reconciliationMethods)

[EARLY ACCESS] BatchAdjustHoldings: Batch adjust holdings

Adjust one or more holdings of the specified transaction portfolio to the provided targets. LUSID will  automatically construct adjustment transactions to ensure that the holdings which have been adjusted are  always set to the provided targets for the specified effective datetime in each request.     Each request must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each adjustment in the response.    Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String successMode = "Partial"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial
        Map<String, AdjustHoldingForDateRequest> requestBody = new HashMap(); // Map<String, AdjustHoldingForDateRequest> | The selected set of holdings to adjust to the provided targets for the   transaction portfolio.
        List<String> reconciliationMethods = Arrays.asList(); // List<String> | Optional parameter for specifying a reconciliation method: e.g. FxForward.
        try {
            // uncomment the below to set overrides at the request level
            // BatchAdjustHoldingsResponse result = apiInstance.batchAdjustHoldings(scope, code, successMode, requestBody, reconciliationMethods).execute(opts);

            BatchAdjustHoldingsResponse result = apiInstance.batchAdjustHoldings(scope, code, successMode, requestBody, reconciliationMethods).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#batchAdjustHoldings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial | [default to Partial] |
| **requestBody** | [**Map&lt;String, AdjustHoldingForDateRequest&gt;**](AdjustHoldingForDateRequest.md)| The selected set of holdings to adjust to the provided targets for the   transaction portfolio. | |
| **reconciliationMethods** | [**List&lt;String&gt;**](String.md)| Optional parameter for specifying a reconciliation method: e.g. FxForward. | [optional] |

### Return type

[**BatchAdjustHoldingsResponse**](BatchAdjustHoldingsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successful AdjustHolding requests along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## batchCreateTradeTickets

> CreateTradeTicketsResponse batchCreateTradeTickets(scope, code, lusidTradeTicket)

[EARLY ACCESS] BatchCreateTradeTickets: Batch Create Trade Tickets

Batch create trade tickets. Each ticket is broadly equivalent to a singular call to upsert an instrument, then a counterparty and finally  a transaction that makes use of the two.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        List<LusidTradeTicket> lusidTradeTicket = Arrays.asList(); // List<LusidTradeTicket> | the trade tickets to create
        try {
            // uncomment the below to set overrides at the request level
            // CreateTradeTicketsResponse result = apiInstance.batchCreateTradeTickets(scope, code, lusidTradeTicket).execute(opts);

            CreateTradeTicketsResponse result = apiInstance.batchCreateTradeTickets(scope, code, lusidTradeTicket).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#batchCreateTradeTickets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **lusidTradeTicket** | [**List&lt;LusidTradeTicket&gt;**](LusidTradeTicket.md)| the trade tickets to create | |

### Return type

[**CreateTradeTicketsResponse**](CreateTradeTicketsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully created trade ticket requests along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## batchSetHoldings

> BatchAdjustHoldingsResponse batchSetHoldings(scope, code, successMode, requestBody, reconciliationMethods)

[EARLY ACCESS] BatchSetHoldings: Batch set holdings

Set the holdings of the specified transaction portfolio to the provided targets. LUSID will automatically  construct adjustment transactions to ensure that the entire set of holdings for the transaction portfolio  are always set to the provided targets for the specified effective datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/docs/how-do-i-manually-adjust-or-set-holdings.     Each request must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each adjustment in the response.    Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String successMode = "Partial"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial
        Map<String, AdjustHoldingForDateRequest> requestBody = new HashMap(); // Map<String, AdjustHoldingForDateRequest> | The selected set of holdings to adjust to the provided targets for the   transaction portfolio.
        List<String> reconciliationMethods = Arrays.asList(); // List<String> | Optional parameter for specifying a reconciliation method: e.g. FxForward.
        try {
            // uncomment the below to set overrides at the request level
            // BatchAdjustHoldingsResponse result = apiInstance.batchSetHoldings(scope, code, successMode, requestBody, reconciliationMethods).execute(opts);

            BatchAdjustHoldingsResponse result = apiInstance.batchSetHoldings(scope, code, successMode, requestBody, reconciliationMethods).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#batchSetHoldings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial | [default to Partial] |
| **requestBody** | [**Map&lt;String, AdjustHoldingForDateRequest&gt;**](AdjustHoldingForDateRequest.md)| The selected set of holdings to adjust to the provided targets for the   transaction portfolio. | |
| **reconciliationMethods** | [**List&lt;String&gt;**](String.md)| Optional parameter for specifying a reconciliation method: e.g. FxForward. | [optional] |

### Return type

[**BatchAdjustHoldingsResponse**](BatchAdjustHoldingsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successful SetHolding requests along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## batchUpsertTransactions

> BatchUpsertPortfolioTransactionsResponse batchUpsertTransactions(scope, code, successMode, requestBody, preserveProperties)

[EARLY ACCESS] BatchUpsertTransactions: Batch upsert transactions

Create or update transactions in the transaction portfolio. A transaction will be updated  if it already exists and created if it does not.    Each request must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each transaction in the response.    Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String successMode = "Partial"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial.
        Map<String, TransactionRequest> requestBody = new HashMap(); // Map<String, TransactionRequest> | The payload describing the transactions to be created or updated.
        Boolean preserveProperties = true; // Boolean | If set to false, the entire property set will be overwritten by the provided properties. If not specified or set to true, only the properties provided will be updated.
        try {
            // uncomment the below to set overrides at the request level
            // BatchUpsertPortfolioTransactionsResponse result = apiInstance.batchUpsertTransactions(scope, code, successMode, requestBody, preserveProperties).execute(opts);

            BatchUpsertPortfolioTransactionsResponse result = apiInstance.batchUpsertTransactions(scope, code, successMode, requestBody, preserveProperties).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#batchUpsertTransactions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial. | [default to Partial] |
| **requestBody** | [**Map&lt;String, TransactionRequest&gt;**](TransactionRequest.md)| The payload describing the transactions to be created or updated. | |
| **preserveProperties** | **Boolean**| If set to false, the entire property set will be overwritten by the provided properties. If not specified or set to true, only the properties provided will be updated. | [optional] [default to true] |

### Return type

[**BatchUpsertPortfolioTransactionsResponse**](BatchUpsertPortfolioTransactionsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully upserted transaction requests along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## buildTransactions

> VersionedResourceListOfOutputTransaction buildTransactions(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page)

BuildTransactions: Build transactions

Builds and returns all transactions that affect the holdings of a portfolio over a given interval of  effective time into a set of output transactions. This includes transactions automatically generated by  LUSID such as holding adjustments.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        TransactionQueryParameters transactionQueryParameters = new TransactionQueryParameters(); // TransactionQueryParameters | The query queryParameters which control how the output transactions are built.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to build the transactions. Defaults to return the latest   version of each transaction if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to return only transactions with a transaction type of 'Buy', specify \"type eq 'Buy'\".   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" or \"Transaction\" domain to decorate onto   the transactions. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or   \"Transaction/strategy/quantsignal\".
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing transactions from a previous call to BuildTransactions.
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListOfOutputTransaction result = apiInstance.buildTransactions(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page).execute(opts);

            VersionedResourceListOfOutputTransaction result = apiInstance.buildTransactions(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#buildTransactions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **transactionQueryParameters** | [**TransactionQueryParameters**](TransactionQueryParameters.md)| The query queryParameters which control how the output transactions are built. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to build the transactions. Defaults to return the latest   version of each transaction if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto   the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or   \&quot;Transaction/strategy/quantsignal\&quot;. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing transactions from a previous call to BuildTransactions. | [optional] |

### Return type

[**VersionedResourceListOfOutputTransaction**](VersionedResourceListOfOutputTransaction.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested transactions from the specified transaction portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## cancelAdjustHoldings

> DeletedEntityResponse cancelAdjustHoldings(scope, code, effectiveAt)

CancelAdjustHoldings: Cancel adjust holdings

Cancel all previous holding adjustments made on the specified transaction portfolio for a specified effective  datetime. This should be used to undo holding adjustments made via set holdings or adjust holdings.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the holding adjustments should be undone.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.cancelAdjustHoldings(scope, code, effectiveAt).execute(opts);

            DeletedEntityResponse result = apiInstance.cancelAdjustHoldings(scope, code, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#cancelAdjustHoldings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which the holding adjustments should be undone. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the holding adjustments were cancelled |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## cancelSingleAdjustHolding

> DeletedEntityResponse cancelSingleAdjustHolding(scope, code, effectiveAt, cancelSingleHoldingAdjustmentRequest)

[EARLY ACCESS] CancelSingleAdjustHolding: Cancel single holding adjustment.

Cancel one previously sent holding adjustment without affecting the rest of the adjustment in the previous request on the specified effective datetime.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the previous adjustment was made.
        CancelSingleHoldingAdjustmentRequest cancelSingleHoldingAdjustmentRequest = new CancelSingleHoldingAdjustmentRequest(); // CancelSingleHoldingAdjustmentRequest | The selected holding adjustment to be canceled.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.cancelSingleAdjustHolding(scope, code, effectiveAt, cancelSingleHoldingAdjustmentRequest).execute(opts);

            DeletedEntityResponse result = apiInstance.cancelSingleAdjustHolding(scope, code, effectiveAt, cancelSingleHoldingAdjustmentRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#cancelSingleAdjustHolding");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which the previous adjustment was made. | |
| **cancelSingleHoldingAdjustmentRequest** | [**CancelSingleHoldingAdjustmentRequest**](CancelSingleHoldingAdjustmentRequest.md)| The selected holding adjustment to be canceled. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the holding adjustment was cancelled |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## cancelTransactions

> DeletedEntityResponse cancelTransactions(scope, code, transactionIds)

CancelTransactions: Cancel transactions

Cancel one or more transactions from the transaction portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        List<String> transactionIds = Arrays.asList(); // List<String> | The IDs of the transactions to cancel.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.cancelTransactions(scope, code, transactionIds).execute(opts);

            DeletedEntityResponse result = apiInstance.cancelTransactions(scope, code, transactionIds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#cancelTransactions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **transactionIds** | [**List&lt;String&gt;**](String.md)| The IDs of the transactions to cancel. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the transactions were cancelled |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createPortfolio

> Portfolio createPortfolio(scope, createTransactionPortfolioRequest)

CreatePortfolio: Create portfolio

Create a transaction portfolio in a particular scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope in which to create the transaction portfolio.
        CreateTransactionPortfolioRequest createTransactionPortfolioRequest = new CreateTransactionPortfolioRequest(); // CreateTransactionPortfolioRequest | The definition of the transaction portfolio.
        try {
            // uncomment the below to set overrides at the request level
            // Portfolio result = apiInstance.createPortfolio(scope, createTransactionPortfolioRequest).execute(opts);

            Portfolio result = apiInstance.createPortfolio(scope, createTransactionPortfolioRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#createPortfolio");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope in which to create the transaction portfolio. | |
| **createTransactionPortfolioRequest** | [**CreateTransactionPortfolioRequest**](CreateTransactionPortfolioRequest.md)| The definition of the transaction portfolio. | |

### Return type

[**Portfolio**](Portfolio.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly-created transaction portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createTradeTicket

> LusidTradeTicket createTradeTicket(scope, code, lusidTradeTicket)

[EARLY ACCESS] CreateTradeTicket: Create Trade Ticket

Upsert a trade ticket. Broadly equivalent to a singular call to upsert an instrument, then a counterparty and finally  a transaction that makes use of the two. It can be viewed as a utility function or part of a workflow more familiar to users  with OTC systems than flow and equity trading ones.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        LusidTradeTicket lusidTradeTicket = new LusidTradeTicket(); // LusidTradeTicket | the trade ticket to upsert
        try {
            // uncomment the below to set overrides at the request level
            // LusidTradeTicket result = apiInstance.createTradeTicket(scope, code, lusidTradeTicket).execute(opts);

            LusidTradeTicket result = apiInstance.createTradeTicket(scope, code, lusidTradeTicket).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#createTradeTicket");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **lusidTradeTicket** | [**LusidTradeTicket**](LusidTradeTicket.md)| the trade ticket to upsert | [optional] |

### Return type

[**LusidTradeTicket**](LusidTradeTicket.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created trade ticket, possibly populated with created LUID and identifiers if missing on the request. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteCustodianAccounts

> DeleteCustodianAccountsResponse deleteCustodianAccounts(scope, code, resourceId, deleteMode)

[EXPERIMENTAL] DeleteCustodianAccounts: Soft or hard delete multiple custodian accounts

Delete one or more custodian accounts from the Transaction Portfolios. Soft deletion marks the custodian account as inactive  While the Hard deletion is deleting the custodian account.  The batch limit per request is 2,000.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Transaction Portfolios.
        String code = "code_example"; // String | The code of the Transaction Portfolios. Together with the scope this uniquely identifies   the Transaction Portfolios.
        List<ResourceId> resourceId = Arrays.asList(); // List<ResourceId> | The scope and codes of the custodian accounts to delete.
        String deleteMode = "Soft"; // String | The delete mode to use (defaults to 'Soft').
        try {
            // uncomment the below to set overrides at the request level
            // DeleteCustodianAccountsResponse result = apiInstance.deleteCustodianAccounts(scope, code, resourceId, deleteMode).execute(opts);

            DeleteCustodianAccountsResponse result = apiInstance.deleteCustodianAccounts(scope, code, resourceId, deleteMode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#deleteCustodianAccounts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Transaction Portfolios. | |
| **code** | **String**| The code of the Transaction Portfolios. Together with the scope this uniquely identifies   the Transaction Portfolios. | |
| **resourceId** | [**List&lt;ResourceId&gt;**](ResourceId.md)| The scope and codes of the custodian accounts to delete. | |
| **deleteMode** | **String**| The delete mode to use (defaults to &#39;Soft&#39;). | [optional] [enum: Soft, Hard] |

### Return type

[**DeleteCustodianAccountsResponse**](DeleteCustodianAccountsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the custodian accounts were deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deletePropertiesFromTransaction

> DeletedEntityResponse deletePropertiesFromTransaction(scope, code, transactionId, propertyKeys)

DeletePropertiesFromTransaction: Delete properties from transaction

Delete one or more properties from a single transaction in a transaction portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String transactionId = "transactionId_example"; // String | The unique ID of the transaction from which to delete properties.
        List<String> propertyKeys = Arrays.asList(); // List<String> | The property keys of the properties to delete.   These must be from the \"Transaction\" domain and have the format {domain}/{scope}/{code}, for example   \"Transaction/strategy/quantsignal\".
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deletePropertiesFromTransaction(scope, code, transactionId, propertyKeys).execute(opts);

            DeletedEntityResponse result = apiInstance.deletePropertiesFromTransaction(scope, code, transactionId, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#deletePropertiesFromTransaction");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **transactionId** | **String**| The unique ID of the transaction from which to delete properties. | |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| The property keys of the properties to delete.   These must be from the \&quot;Transaction\&quot; domain and have the format {domain}/{scope}/{code}, for example   \&quot;Transaction/strategy/quantsignal\&quot;. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the property was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getA2BData

> VersionedResourceListOfA2BDataRecord getA2BData(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter)

GetA2BData: Get A2B data

Get an A2B report for the given portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio to retrieve the A2B report for.
        String code = "code_example"; // String | The code of the portfolio to retrieve the A2B report for. Together with the scope this   uniquely identifies the portfolio.
        String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no lower bound if this is not specified.
        String toEffectiveAt = "toEffectiveAt_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no upper bound if this is not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version   of each transaction if not specified.
        String recipeIdScope = "recipeIdScope_example"; // String | The scope of the given recipeId
        String recipeIdCode = "recipeIdCode_example"; // String | The code of the given recipeId
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" domain to decorate onto   the results. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\".
        String filter = "filter_example"; // String | Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListOfA2BDataRecord result = apiInstance.getA2BData(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter).execute(opts);

            VersionedResourceListOfA2BDataRecord result = apiInstance.getA2BData(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getA2BData");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the portfolio to retrieve the A2B report for. | |
| **code** | **String**| The code of the portfolio to retrieve the A2B report for. Together with the scope this   uniquely identifies the portfolio. | |
| **fromEffectiveAt** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no lower bound if this is not specified. | |
| **toEffectiveAt** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no upper bound if this is not specified. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version   of each transaction if not specified. | [optional] |
| **recipeIdScope** | **String**| The scope of the given recipeId | [optional] |
| **recipeIdCode** | **String**| The code of the given recipeId | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; domain to decorate onto   the results. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot;. | [optional] |
| **filter** | **String**| Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**VersionedResourceListOfA2BDataRecord**](VersionedResourceListOfA2BDataRecord.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested portfolio A2B data |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getA2BMovements

> VersionedResourceListOfA2BMovementRecord getA2BMovements(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter)

GetA2BMovements: Get an A2B report at the movement level for the given portfolio.

Get an A2B report at the movement level for the given portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio to retrieve the A2B movement report for.
        String code = "code_example"; // String | The code of the portfolio to retrieve the A2B movement report for. Together with the scope this   uniquely identifies the portfolio.
        String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no lower bound if this is not specified.
        String toEffectiveAt = "toEffectiveAt_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no upper bound if this is not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version   of each transaction if not specified.
        String recipeIdScope = "recipeIdScope_example"; // String | The scope of the given recipeId
        String recipeIdCode = "recipeIdCode_example"; // String | The code of the given recipeId
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" domain to decorate onto   the results. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\".
        String filter = "filter_example"; // String | Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListOfA2BMovementRecord result = apiInstance.getA2BMovements(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter).execute(opts);

            VersionedResourceListOfA2BMovementRecord result = apiInstance.getA2BMovements(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getA2BMovements");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the portfolio to retrieve the A2B movement report for. | |
| **code** | **String**| The code of the portfolio to retrieve the A2B movement report for. Together with the scope this   uniquely identifies the portfolio. | |
| **fromEffectiveAt** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no lower bound if this is not specified. | |
| **toEffectiveAt** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no upper bound if this is not specified. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version   of each transaction if not specified. | [optional] |
| **recipeIdScope** | **String**| The scope of the given recipeId | [optional] |
| **recipeIdCode** | **String**| The code of the given recipeId | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; domain to decorate onto   the results. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot;. | [optional] |
| **filter** | **String**| Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**VersionedResourceListOfA2BMovementRecord**](VersionedResourceListOfA2BMovementRecord.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested portfolio A2B movement data |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getBucketedCashFlows

> BucketedCashFlowResponse getBucketedCashFlows(scope, code, bucketedCashFlowRequest)

[EXPERIMENTAL] GetBucketedCashFlows: Get bucketed cash flows from a list of portfolios

We bucket/aggregate a transaction portfolio&#39;s instruments by date or tenor specified in the request.  The cashflows are grouped by both instrumentId and currency.     If you want transactional level cashflow, please use the &#39;GetUpsertableCashFlows&#39; endpoint.  If you want instrument cashflow, please use the &#39;GetPortfolioCashFlows&#39; endpoint.  Note that these endpoints do not apply bucketing.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies the portfolio.
        BucketedCashFlowRequest bucketedCashFlowRequest = new BucketedCashFlowRequest(); // BucketedCashFlowRequest | Request specifying the bucketing of cashflows
        try {
            // uncomment the below to set overrides at the request level
            // BucketedCashFlowResponse result = apiInstance.getBucketedCashFlows(scope, code, bucketedCashFlowRequest).execute(opts);

            BucketedCashFlowResponse result = apiInstance.getBucketedCashFlows(scope, code, bucketedCashFlowRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getBucketedCashFlows");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **bucketedCashFlowRequest** | [**BucketedCashFlowRequest**](BucketedCashFlowRequest.md)| Request specifying the bucketing of cashflows | [optional] |

### Return type

[**BucketedCashFlowResponse**](BucketedCashFlowResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested portfolio instruments&#39; bucketed cash flow data |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getCustodianAccount

> CustodianAccount getCustodianAccount(scope, code, custodianAccountScope, custodianAccountCode, effectiveAt, asAt, propertyKeys)

[EXPERIMENTAL] GetCustodianAccount: Get Custodian Account

Retrieve the definition of a particular Custodian Account which is part of a Transaction Portfolios.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Transaction Portfolio.
        String code = "code_example"; // String | The code of the Transaction Portfolio. Together with the scope this uniquely identifies the Transaction Portfolio.
        String custodianAccountScope = "custodianAccountScope_example"; // String | The scope of the Custodian Account.
        String custodianAccountCode = "custodianAccountCode_example"; // String | The code of the Custodian Account.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Custodian Account properties. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Custodian Account definition. Defaults to returning the latest version of the Custodian Account definition if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'CustodianAccount' domain to decorate onto the Custodian Account.   These must take the format {domain}/{scope}/{code}, for example 'CustodianAccount/Manager/Id'. If no properties are specified, then no properties will be returned.
        try {
            // uncomment the below to set overrides at the request level
            // CustodianAccount result = apiInstance.getCustodianAccount(scope, code, custodianAccountScope, custodianAccountCode, effectiveAt, asAt, propertyKeys).execute(opts);

            CustodianAccount result = apiInstance.getCustodianAccount(scope, code, custodianAccountScope, custodianAccountCode, effectiveAt, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getCustodianAccount");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Transaction Portfolio. | |
| **code** | **String**| The code of the Transaction Portfolio. Together with the scope this uniquely identifies the Transaction Portfolio. | |
| **custodianAccountScope** | **String**| The scope of the Custodian Account. | |
| **custodianAccountCode** | **String**| The code of the Custodian Account. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Custodian Account properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Custodian Account definition. Defaults to returning the latest version of the Custodian Account definition if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;CustodianAccount&#39; domain to decorate onto the Custodian Account.   These must take the format {domain}/{scope}/{code}, for example &#39;CustodianAccount/Manager/Id&#39;. If no properties are specified, then no properties will be returned. | [optional] |

### Return type

[**CustodianAccount**](CustodianAccount.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Custodian Account definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getDetails

> PortfolioDetails getDetails(scope, code, effectiveAt, asAt)

GetDetails: Get details

Get certain details associated with a transaction portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the   scope this uniquely identifies the transaction portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the details of the transaction   portfolio. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults   to returning the latest version of the details if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioDetails result = apiInstance.getDetails(scope, code, effectiveAt, asAt).execute(opts);

            PortfolioDetails result = apiInstance.getDetails(scope, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getDetails");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the   scope this uniquely identifies the transaction portfolio. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the details of the transaction   portfolio. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults   to returning the latest version of the details if not specified. | [optional] |

### Return type

[**PortfolioDetails**](PortfolioDetails.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The details of the specified transaction portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getHoldingContributors

> VersionedResourceListOfHoldingContributor getHoldingContributors(scope, code, holdingId, effectiveDate, fromTradeDate, toTradeDate, includeHistoric, taxLotId, limit, asAt, page)

[EARLY ACCESS] GetHoldingContributors: Get Holdings Contributors

Lists all transactions that affect the holdings of a portfolio over a given effective interval. This includes  transactions automatically generated by LUSID such as holding adjustments.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        Long holdingId = 56L; // Long | The unique holding identifier
        String effectiveDate = "effectiveDate_example"; // String | Effective date
        String fromTradeDate = "fromTradeDate_example"; // String | The from trade date, defaults to first time this holding is opened, lower bound for transactions
        String toTradeDate = "toTradeDate_example"; // String | The to trade date upper bound date, defaults to effectiveDate. upper bound for transactions
        Boolean includeHistoric = false; // Boolean | If true, transactions from previously closed holdings are returned.   If false, only transactions from last time position is opened.
        String taxLotId = "taxLotId_example"; // String | Constrains the Holding Contributors to those which contributed to the specified tax lot.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to build the transactions. Defaults to return the latest   version of each transaction if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing transactions from a previous call to GetHoldingContributors.
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListOfHoldingContributor result = apiInstance.getHoldingContributors(scope, code, holdingId, effectiveDate, fromTradeDate, toTradeDate, includeHistoric, taxLotId, limit, asAt, page).execute(opts);

            VersionedResourceListOfHoldingContributor result = apiInstance.getHoldingContributors(scope, code, holdingId, effectiveDate, fromTradeDate, toTradeDate, includeHistoric, taxLotId, limit, asAt, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getHoldingContributors");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **holdingId** | **Long**| The unique holding identifier | |
| **effectiveDate** | **String**| Effective date | [optional] |
| **fromTradeDate** | **String**| The from trade date, defaults to first time this holding is opened, lower bound for transactions | [optional] |
| **toTradeDate** | **String**| The to trade date upper bound date, defaults to effectiveDate. upper bound for transactions | [optional] |
| **includeHistoric** | **Boolean**| If true, transactions from previously closed holdings are returned.   If false, only transactions from last time position is opened. | [optional] [default to false] |
| **taxLotId** | **String**| Constrains the Holding Contributors to those which contributed to the specified tax lot. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to build the transactions. Defaults to return the latest   version of each transaction if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing transactions from a previous call to GetHoldingContributors. | [optional] |

### Return type

[**VersionedResourceListOfHoldingContributor**](VersionedResourceListOfHoldingContributor.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested holding contributors from the specified transaction portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getHoldings

> VersionedResourceListOfPortfolioHolding getHoldings(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, includeSettlementEventsAfterDays)

GetHoldings: Get holdings

Calculate holdings for a transaction portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the holdings of the transaction   portfolio. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults   to return the latest version if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the Holding Type, use \"holdingType eq 'p'\".   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\", \"Holding\", \"Custodian Account\" or \"Portfolio\" domain to decorate onto   holdings. These must have the format {domain}/{scope}/{code}, for example \"Instrument/system/Name\" or \"Holding/system/Cost\".
        Boolean byTaxlots = true; // Boolean | Whether or not to expand the holdings to return the underlying tax-lots. Defaults to   False.
        Integer includeSettlementEventsAfterDays = 56; // Integer | Number of days ahead to bring back settlements from, in relation to the specified effectiveAt
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListOfPortfolioHolding result = apiInstance.getHoldings(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, includeSettlementEventsAfterDays).execute(opts);

            VersionedResourceListOfPortfolioHolding result = apiInstance.getHoldings(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, includeSettlementEventsAfterDays).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getHoldings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the holdings of the transaction   portfolio. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults   to return the latest version if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;.   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot;, \&quot;Custodian Account\&quot; or \&quot;Portfolio\&quot; domain to decorate onto   holdings. These must have the format {domain}/{scope}/{code}, for example \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. | [optional] |
| **byTaxlots** | **Boolean**| Whether or not to expand the holdings to return the underlying tax-lots. Defaults to   False. | [optional] |
| **includeSettlementEventsAfterDays** | **Integer**| Number of days ahead to bring back settlements from, in relation to the specified effectiveAt | [optional] |

### Return type

[**VersionedResourceListOfPortfolioHolding**](VersionedResourceListOfPortfolioHolding.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The holdings and version of the specified transaction portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getHoldingsAdjustment

> HoldingsAdjustment getHoldingsAdjustment(scope, code, effectiveAt, asAt, propertyKeys)

GetHoldingsAdjustment: Get holdings adjustment

Get a holdings adjustment made to a transaction portfolio at a specific effective datetime. Note that a  holdings adjustment will only be returned if one exists for the specified effective datetime.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label of the holdings adjustment.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the holdings adjustment. Defaults to the return the latest   version of the holdings adjustment if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the ‘Instrument' domain to decorate onto holdings adjustments.   These must have the format {domain}/{scope}/{code}, for example 'Instrument/system/Name'.   Note that properties from the 'Holding’ domain are automatically returned.
        try {
            // uncomment the below to set overrides at the request level
            // HoldingsAdjustment result = apiInstance.getHoldingsAdjustment(scope, code, effectiveAt, asAt, propertyKeys).execute(opts);

            HoldingsAdjustment result = apiInstance.getHoldingsAdjustment(scope, code, effectiveAt, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getHoldingsAdjustment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **effectiveAt** | **String**| The effective datetime or cut label of the holdings adjustment. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the holdings adjustment. Defaults to the return the latest   version of the holdings adjustment if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the ‘Instrument&#39; domain to decorate onto holdings adjustments.   These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;.   Note that properties from the &#39;Holding’ domain are automatically returned. | [optional] |

### Return type

[**HoldingsAdjustment**](HoldingsAdjustment.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The details of the requested holdings adjustment |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getHoldingsWithOrders

> VersionedResourceListWithWarningsOfPortfolioHolding getHoldingsWithOrders(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, recipeIdScope, recipeIdCode, includeSettlementEventsAfterDays)

[EXPERIMENTAL] GetHoldingsWithOrders: Get holdings with orders

Get the holdings of a transaction portfolio. Create virtual holdings for any outstanding orders,  and account for order state/fulfillment; that is, treat outstanding orders (and related records) as  if they had been realised at moment of query.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the holdings of the transaction   portfolio. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults   to return the latest version of the holdings if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the Holding Type, use \"holdingType eq 'p'\"   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\", \"Holding\" or \"Portfolio\" domain to decorate onto   the holdings. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or \"Holding/system/Cost\".
        Boolean byTaxlots = true; // Boolean | Whether or not to expand the holdings to return the underlying tax-lots. Defaults to   False.
        String recipeIdScope = "recipeIdScope_example"; // String | The scope of the given recipeId
        String recipeIdCode = "recipeIdCode_example"; // String | The code of the given recipeId
        Integer includeSettlementEventsAfterDays = 56; // Integer | Number of days ahead to bring back settlements from, in relation to the specified effectiveAt
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListWithWarningsOfPortfolioHolding result = apiInstance.getHoldingsWithOrders(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, recipeIdScope, recipeIdCode, includeSettlementEventsAfterDays).execute(opts);

            VersionedResourceListWithWarningsOfPortfolioHolding result = apiInstance.getHoldingsWithOrders(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, recipeIdScope, recipeIdCode, includeSettlementEventsAfterDays).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getHoldingsWithOrders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the holdings of the transaction   portfolio. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults   to return the latest version of the holdings if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto   the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. | [optional] |
| **byTaxlots** | **Boolean**| Whether or not to expand the holdings to return the underlying tax-lots. Defaults to   False. | [optional] |
| **recipeIdScope** | **String**| The scope of the given recipeId | [optional] |
| **recipeIdCode** | **String**| The code of the given recipeId | [optional] |
| **includeSettlementEventsAfterDays** | **Integer**| Number of days ahead to bring back settlements from, in relation to the specified effectiveAt | [optional] |

### Return type

[**VersionedResourceListWithWarningsOfPortfolioHolding**](VersionedResourceListWithWarningsOfPortfolioHolding.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The holdings and version of the specified transaction portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getMultipleHoldingContributors

> VersionedResourceListOfHoldingContributor getMultipleHoldingContributors(scope, code, holdingIdsRequest, effectiveDate, fromTransactionDate, toTransactionDate, includeHistoric, taxLotId, limit, asAt, page)

[EARLY ACCESS] GetMultipleHoldingContributors: Get Multiple Holding Contributors

Lists all transactions that affect multiple specified holdings of a portfolio over a given effective interval. This includes  transactions automatically generated by LUSID such as holding adjustments.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        HoldingIdsRequest holdingIdsRequest = new HoldingIdsRequest(); // HoldingIdsRequest | The array of unique holding identifiers
        String effectiveDate = "effectiveDate_example"; // String | Effective date
        String fromTransactionDate = "fromTransactionDate_example"; // String | The from trade date, defaults to first time this holding is opened, lower bound for transactions
        String toTransactionDate = "toTransactionDate_example"; // String | The to trade date upper bound date, defaults to effectiveDate. upper bound for transactions
        Boolean includeHistoric = false; // Boolean | If true, transactions from previously closed holdings are returned.   If false, only transactions from last time position is opened.
        String taxLotId = "taxLotId_example"; // String | Constrains the Holding Contributors to those which contributed to the specified tax lot.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to build the transactions. Defaults to return the latest   version of each transaction if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing transactions from a previous call to GetHoldingContributors.
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListOfHoldingContributor result = apiInstance.getMultipleHoldingContributors(scope, code, holdingIdsRequest, effectiveDate, fromTransactionDate, toTransactionDate, includeHistoric, taxLotId, limit, asAt, page).execute(opts);

            VersionedResourceListOfHoldingContributor result = apiInstance.getMultipleHoldingContributors(scope, code, holdingIdsRequest, effectiveDate, fromTransactionDate, toTransactionDate, includeHistoric, taxLotId, limit, asAt, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getMultipleHoldingContributors");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **holdingIdsRequest** | [**HoldingIdsRequest**](HoldingIdsRequest.md)| The array of unique holding identifiers | |
| **effectiveDate** | **String**| Effective date | [optional] |
| **fromTransactionDate** | **String**| The from trade date, defaults to first time this holding is opened, lower bound for transactions | [optional] |
| **toTransactionDate** | **String**| The to trade date upper bound date, defaults to effectiveDate. upper bound for transactions | [optional] |
| **includeHistoric** | **Boolean**| If true, transactions from previously closed holdings are returned.   If false, only transactions from last time position is opened. | [optional] [default to false] |
| **taxLotId** | **String**| Constrains the Holding Contributors to those which contributed to the specified tax lot. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to build the transactions. Defaults to return the latest   version of each transaction if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing transactions from a previous call to GetHoldingContributors. | [optional] |

### Return type

[**VersionedResourceListOfHoldingContributor**](VersionedResourceListOfHoldingContributor.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested holding contributors for each specified holding from the specified transaction portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioCashFlows

> ResourceListOfInstrumentCashFlow getPortfolioCashFlows(scope, code, effectiveAt, windowStart, windowEnd, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades)

GetPortfolioCashFlows: Get portfolio cash flows

Get the set of cash flows that occur in a window for the transaction portfolio&#39;s instruments.     Note that grouping can affect the quantity of information returned; where a holding is an amalgamation of one or more (e.g. cash) instruments, a unique  transaction identifier will not be available. The same may go for diagnostic information (e.g. multiple sources of an aggregate cash amount on a date that is  not split out. Grouping at the transaction and instrument level is recommended for those seeking to attribute individual flows.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this   uniquely identifies the portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today.
        String windowStart = "windowStart_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.   There is no lower bound if this is not specified. i.e. it is the minimum date.
        String windowEnd = "windowEnd_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.   The upper bound defaults to 'max date' if it is not specified
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the data. Defaults to returning the latest version   of each transaction if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to return only transactions with a transaction type of 'Buy', specify \"type eq 'Buy'\".   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        String recipeIdScope = "recipeIdScope_example"; // String | The scope of the given recipeId
        String recipeIdCode = "recipeIdCode_example"; // String | The code of the given recipeID
        Boolean excludeUnsettledTrades = false; // Boolean | If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfInstrumentCashFlow result = apiInstance.getPortfolioCashFlows(scope, code, effectiveAt, windowStart, windowEnd, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades).execute(opts);

            ResourceListOfInstrumentCashFlow result = apiInstance.getPortfolioCashFlows(scope, code, effectiveAt, windowStart, windowEnd, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getPortfolioCashFlows");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this   uniquely identifies the portfolio. | |
| **effectiveAt** | **String**| The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. | [optional] |
| **windowStart** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.   There is no lower bound if this is not specified. i.e. it is the minimum date. | [optional] |
| **windowEnd** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.   The upper bound defaults to &#39;max date&#39; if it is not specified | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the data. Defaults to returning the latest version   of each transaction if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **recipeIdScope** | **String**| The scope of the given recipeId | [optional] |
| **recipeIdCode** | **String**| The code of the given recipeID | [optional] |
| **excludeUnsettledTrades** | **Boolean**| If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. | [optional] [default to false] |

### Return type

[**ResourceListOfInstrumentCashFlow**](ResourceListOfInstrumentCashFlow.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested portfolio instruments&#39; cash flow data |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioCashLadder

> ResourceListOfPortfolioCashLadder getPortfolioCashLadder(scope, code, fromEffectiveAt, toEffectiveAt, effectiveAt, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades)

GetPortfolioCashLadder: Get portfolio cash ladder

Get a cash ladder for a transaction portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this   uniquely identifies the portfolio.
        String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no lower bound if this is not specified.
        String toEffectiveAt = "toEffectiveAt_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no upper bound if this is not specified.
        String effectiveAt = "effectiveAt_example"; // String | The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version   of each transaction if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to return only transactions with a transaction type of 'Buy', specify \"type eq 'Buy'\".   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        String recipeIdScope = "recipeIdScope_example"; // String | The scope of the given recipeId
        String recipeIdCode = "recipeIdCode_example"; // String | The code of the given recipeID
        Boolean excludeUnsettledTrades = false; // Boolean | If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfPortfolioCashLadder result = apiInstance.getPortfolioCashLadder(scope, code, fromEffectiveAt, toEffectiveAt, effectiveAt, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades).execute(opts);

            ResourceListOfPortfolioCashLadder result = apiInstance.getPortfolioCashLadder(scope, code, fromEffectiveAt, toEffectiveAt, effectiveAt, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getPortfolioCashLadder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this   uniquely identifies the portfolio. | |
| **fromEffectiveAt** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no lower bound if this is not specified. | |
| **toEffectiveAt** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no upper bound if this is not specified. | |
| **effectiveAt** | **String**| The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version   of each transaction if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **recipeIdScope** | **String**| The scope of the given recipeId | [optional] |
| **recipeIdCode** | **String**| The code of the given recipeID | [optional] |
| **excludeUnsettledTrades** | **Boolean**| If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. | [optional] [default to false] |

### Return type

[**ResourceListOfPortfolioCashLadder**](ResourceListOfPortfolioCashLadder.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested portfolio cash-ladder |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioCashStatement

> ResourceListOfPortfolioCashFlow getPortfolioCashStatement(scope, code, fromEffectiveAt, toEffectiveAt, asAt, filter, recipeIdScope, recipeIdCode)

GetPortfolioCashStatement: Get portfolio cash statement

Get a cash statement for a transaction portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this   uniquely identifies the portfolio.
        String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no lower bound if this is not specified.
        String toEffectiveAt = "toEffectiveAt_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no upper bound if this is not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version   of each transaction if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to return only transactions with a transaction type of 'Buy', specify \"type eq 'Buy'\".   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        String recipeIdScope = "recipeIdScope_example"; // String | The scope of the given recipeId
        String recipeIdCode = "recipeIdCode_example"; // String | The code of the given recipeID
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfPortfolioCashFlow result = apiInstance.getPortfolioCashStatement(scope, code, fromEffectiveAt, toEffectiveAt, asAt, filter, recipeIdScope, recipeIdCode).execute(opts);

            ResourceListOfPortfolioCashFlow result = apiInstance.getPortfolioCashStatement(scope, code, fromEffectiveAt, toEffectiveAt, asAt, filter, recipeIdScope, recipeIdCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getPortfolioCashStatement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this   uniquely identifies the portfolio. | |
| **fromEffectiveAt** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no lower bound if this is not specified. | |
| **toEffectiveAt** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no upper bound if this is not specified. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version   of each transaction if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **recipeIdScope** | **String**| The scope of the given recipeId | [optional] |
| **recipeIdCode** | **String**| The code of the given recipeID | [optional] |

### Return type

[**ResourceListOfPortfolioCashFlow**](ResourceListOfPortfolioCashFlow.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested portfolio cash flow data |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTransactionHistory

> ResourceListOfChangeHistory getTransactionHistory(scope, code, transactionId, asAt)

GetTransactionHistory: Get the history of a transaction

Get all of the changes that have happened to a transaction.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String transactionId = "transactionId_example"; // String | The unique ID of the transaction to create or update.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the history of the transaction. Defaults   to return the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfChangeHistory result = apiInstance.getTransactionHistory(scope, code, transactionId, asAt).execute(opts);

            ResourceListOfChangeHistory result = apiInstance.getTransactionHistory(scope, code, transactionId, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getTransactionHistory");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **transactionId** | **String**| The unique ID of the transaction to create or update. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the history of the transaction. Defaults   to return the latest version if not specified. | [optional] |

### Return type

[**ResourceListOfChangeHistory**](ResourceListOfChangeHistory.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The history of the specified transaction (changes that have been made to it). |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTransactions

> VersionedResourceListOfTransaction getTransactions(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, page, limit, showCancelledTransactions, sortBy)

GetTransactions: Get transactions

Retrieve all the transactions that occurred during a particular time interval.     If the portfolio is a derived transaction portfolio, the transactions returned are the  union set of all transactions of the parent (and any grandparents, etc.) as well as  those of the derived transaction portfolio itself.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String fromTransactionDate = "fromTransactionDate_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve transactions.   There is no lower bound if this is not specified.
        String toTransactionDate = "toTransactionDate_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.   There is no upper bound if this is not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve transactions. Defaults to returning the latest version   of each transaction if not specified.
        String filter = "filter_example"; // String | Expression with which to filter the result set.   For example, to return only transactions with a transaction type of 'Buy', specify \"type eq 'Buy'\"   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Instrument', 'Transaction', \"LegalEntity\" or \"CustodianAccount\" domain to decorate onto   transactions. These must have the format {domain}/{scope}/{code}, for example 'Instrument/system/Name' or   'Transaction/strategy/quantsignal'.
        String page = "page_example"; // String | The pagination token to use to continue listing transactions from a previous call to GetTransactions.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. The current behaviour is   to return all transactions if possible, but this will change to defaulting to 1000 if not specified in the future. It is recommended   to populate this field to enable pagination.
        Boolean showCancelledTransactions = true; // Boolean | Option to specify whether or not to include cancelled transactions,   including previous versions of transactions which have since been amended.   Defaults to False if not specified.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListOfTransaction result = apiInstance.getTransactions(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, page, limit, showCancelledTransactions, sortBy).execute(opts);

            VersionedResourceListOfTransaction result = apiInstance.getTransactions(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, page, limit, showCancelledTransactions, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getTransactions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **fromTransactionDate** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve transactions.   There is no lower bound if this is not specified. | [optional] |
| **toTransactionDate** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.   There is no upper bound if this is not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve transactions. Defaults to returning the latest version   of each transaction if not specified. | [optional] |
| **filter** | **String**| Expression with which to filter the result set.   For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto   transactions. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39; or   &#39;Transaction/strategy/quantsignal&#39;. | [optional] |
| **page** | **String**| The pagination token to use to continue listing transactions from a previous call to GetTransactions. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. The current behaviour is   to return all transactions if possible, but this will change to defaulting to 1000 if not specified in the future. It is recommended   to populate this field to enable pagination. | [optional] |
| **showCancelledTransactions** | **Boolean**| Option to specify whether or not to include cancelled transactions,   including previous versions of transactions which have since been amended.   Defaults to False if not specified. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**VersionedResourceListOfTransaction**](VersionedResourceListOfTransaction.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested transactions from the specified transaction portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getUpsertablePortfolioCashFlows

> ResourceListOfTransaction getUpsertablePortfolioCashFlows(scope, code, effectiveAt, windowStart, windowEnd, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades)

GetUpsertablePortfolioCashFlows: Get upsertable portfolio cash flows.

Get the set of cash flows that occur in a window for the given portfolio instruments as a set of upsertable transactions (DTOs).     Note that grouping can affect the quantity of information returned; where a holding is an amalgamation of one or more (e.g. cash) instruments, a unique  transaction identifier will not be available. The same may go for diagnostic information (e.g. multiple sources of an aggregate cash amount on a date that is  not split out. Grouping at the transaction and instrument level is recommended for those seeking to attribute individual flows.     In essence this is identical to the &#39;GetCashFlows&#39; endpoint but returns the cash flows as a set of transactions suitable for directly putting back into LUSID.  There are a couple of important points:  (1) Internally it can not be fully known where the user wishes to insert these transactions, e.g. portfolio and movement type.   These are therefore defaulted to a sensible option; the user will likely need to change these.  (2) Similarly, knowledge of any properties the user might wish to add to a transaction are unknown and consequently left empty.  (3) The transaction id that is added is simply a concatenation of the original transaction id, instrument id and payment date and direction. The user can happily override this.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this   uniquely identifies the portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today.
        String windowStart = "windowStart_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.   There is no lower bound if this is not specified. i.e. uses minimum date-time
        String windowEnd = "windowEnd_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.   The upper bound defaults to 'max date' if it is not specified
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version   of each transaction if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to return only transactions with a transaction type of 'Buy', specify \"type eq 'Buy'\".   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        String recipeIdScope = "recipeIdScope_example"; // String | The scope of the given recipeId
        String recipeIdCode = "recipeIdCode_example"; // String | The code of the given recipeID
        Boolean excludeUnsettledTrades = true; // Boolean | If absent or set to true, unsettled trades will be excluded from the result set. If set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfTransaction result = apiInstance.getUpsertablePortfolioCashFlows(scope, code, effectiveAt, windowStart, windowEnd, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades).execute(opts);

            ResourceListOfTransaction result = apiInstance.getUpsertablePortfolioCashFlows(scope, code, effectiveAt, windowStart, windowEnd, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#getUpsertablePortfolioCashFlows");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this   uniquely identifies the portfolio. | |
| **effectiveAt** | **String**| The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. | [optional] |
| **windowStart** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.   There is no lower bound if this is not specified. i.e. uses minimum date-time | [optional] |
| **windowEnd** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.   The upper bound defaults to &#39;max date&#39; if it is not specified | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version   of each transaction if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **recipeIdScope** | **String**| The scope of the given recipeId | [optional] |
| **recipeIdCode** | **String**| The code of the given recipeID | [optional] |
| **excludeUnsettledTrades** | **Boolean**| If absent or set to true, unsettled trades will be excluded from the result set. If set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. | [optional] [default to true] |

### Return type

[**ResourceListOfTransaction**](ResourceListOfTransaction.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested portfolio instruments&#39; cash flow data as a set of upsertable transactions |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listCustodianAccounts

> PagedResourceListOfCustodianAccount listCustodianAccounts(scope, code, effectiveAt, asAt, page, limit, filter, propertyKeys)

[EXPERIMENTAL] ListCustodianAccounts: List Custodian Accounts

List the custodian accounts in a Transaction Portfolios

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Transaction Portfolio.
        String code = "code_example"; // String | The code of the Transaction Portfolio. Together with the scope this uniquely identifies   the Transaction Portfolios.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the TimeVariant properties decorated on Custodian Accounts. Defaults to the current LUSID   system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the instrument. Defaults to   returning the latest version if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing custodian accounts; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the Custodian Account type, specify \"code eq '001'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'CustodianAccount' domain to decorate onto the Custodian Account.   These must have the format {domain}/{scope}/{code}, for example 'CustodianAccount/system/Name'.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfCustodianAccount result = apiInstance.listCustodianAccounts(scope, code, effectiveAt, asAt, page, limit, filter, propertyKeys).execute(opts);

            PagedResourceListOfCustodianAccount result = apiInstance.listCustodianAccounts(scope, code, effectiveAt, asAt, page, limit, filter, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#listCustodianAccounts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Transaction Portfolio. | |
| **code** | **String**| The code of the Transaction Portfolio. Together with the scope this uniquely identifies   the Transaction Portfolios. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the TimeVariant properties decorated on Custodian Accounts. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instrument. Defaults to   returning the latest version if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing custodian accounts; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the Custodian Account type, specify \&quot;code eq &#39;001&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;CustodianAccount&#39; domain to decorate onto the Custodian Account.   These must have the format {domain}/{scope}/{code}, for example &#39;CustodianAccount/system/Name&#39;. | [optional] |

### Return type

[**PagedResourceListOfCustodianAccount**](PagedResourceListOfCustodianAccount.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The custodian accounts in the given Transaction Portfolios. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listHoldingsAdjustments

> ResourceListOfHoldingsAdjustmentHeader listHoldingsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAt)

ListHoldingsAdjustments: List holdings adjustments

List the holdings adjustments made to the specified transaction portfolio over a specified interval of effective time.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the holdings   adjustments. There is no lower bound if this is not specified.
        String toEffectiveAt = "toEffectiveAt_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve the holdings   adjustments. There is no upper bound if this is not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the holdings adjustments. Defaults to return the   latest version of each holding adjustment if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfHoldingsAdjustmentHeader result = apiInstance.listHoldingsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAt).execute(opts);

            ResourceListOfHoldingsAdjustmentHeader result = apiInstance.listHoldingsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#listHoldingsAdjustments");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **fromEffectiveAt** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the holdings   adjustments. There is no lower bound if this is not specified. | [optional] |
| **toEffectiveAt** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve the holdings   adjustments. There is no upper bound if this is not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the holdings adjustments. Defaults to return the   latest version of each holding adjustment if not specified. | [optional] |

### Return type

[**ResourceListOfHoldingsAdjustmentHeader**](ResourceListOfHoldingsAdjustmentHeader.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The record of holdings adjustments made to the specified transaction portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## patchPortfolioDetails

> PortfolioDetails patchPortfolioDetails(scope, code, operation, effectiveAt)

PatchPortfolioDetails: Patch portfolio details

Create or update certain details for a particular transaction portfolio.  The behaviour is defined by the JSON Patch specification.     Note that not all elements of a transaction portfolio definition are  modifiable once it has been created due to the potential implications for data already stored.  Currently supported properties are: SubHoldingKeys, BaseCurrency, AmortisationMethod

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the   scope this uniquely identifies the transaction portfolio.
        List<Operation> operation = Arrays.asList(); // List<Operation> | The patch document.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the updated or inserted details should become valid.   Defaults to the current LUSID system datetime if not specified.   Note that this will affect all bitemporal entities in the request, but will not be used for any perpetual entities.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioDetails result = apiInstance.patchPortfolioDetails(scope, code, operation, effectiveAt).execute(opts);

            PortfolioDetails result = apiInstance.patchPortfolioDetails(scope, code, operation, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#patchPortfolioDetails");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the   scope this uniquely identifies the transaction portfolio. | |
| **operation** | [**List&lt;Operation&gt;**](Operation.md)| The patch document. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which the updated or inserted details should become valid.   Defaults to the current LUSID system datetime if not specified.   Note that this will affect all bitemporal entities in the request, but will not be used for any perpetual entities. | [optional] |

### Return type

[**PortfolioDetails**](PortfolioDetails.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly patched details |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## previewTransaction

> ResourceListOfOutputTransaction previewTransaction(scope, code, transactionRequest, propertyKeys, showCancelledTransactions, preserveProperties)

[EARLY ACCESS] PreviewTransaction: Preview a transaction

Returns the output-transaction(s) - e.g. as returned by BuildTransactions  that would come out of LUSID if the provided TransactionRequest was booked.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        TransactionRequest transactionRequest = new TransactionRequest(); // TransactionRequest | The transaction to be previewed.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" or \"Transaction\" domain to decorate onto   the transactions. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or   \"Transaction/strategy/quantsignal\".
        Boolean showCancelledTransactions = true; // Boolean | Option to specify whether to include previous versions of an amended transaction in the response.   Defaults to False if not specified.
        Boolean preserveProperties = true; // Boolean | If the preview transaction is an amendment to an existing transaction, then setting this to true will carry forward any unmodified properties from the earlier version.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfOutputTransaction result = apiInstance.previewTransaction(scope, code, transactionRequest, propertyKeys, showCancelledTransactions, preserveProperties).execute(opts);

            ResourceListOfOutputTransaction result = apiInstance.previewTransaction(scope, code, transactionRequest, propertyKeys, showCancelledTransactions, preserveProperties).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#previewTransaction");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **transactionRequest** | [**TransactionRequest**](TransactionRequest.md)| The transaction to be previewed. | |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto   the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or   \&quot;Transaction/strategy/quantsignal\&quot;. | [optional] |
| **showCancelledTransactions** | **Boolean**| Option to specify whether to include previous versions of an amended transaction in the response.   Defaults to False if not specified. | [optional] |
| **preserveProperties** | **Boolean**| If the preview transaction is an amendment to an existing transaction, then setting this to true will carry forward any unmodified properties from the earlier version. | [optional] |

### Return type

[**ResourceListOfOutputTransaction**](ResourceListOfOutputTransaction.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The predicted output relating to the Preview Transaction. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## resolveInstrument

> UpsertPortfolioTransactionsResponse resolveInstrument(scope, code, instrumentIdentifierType, instrumentIdentifierValue, fromEffectiveAt, reResolve, requestBody)

ResolveInstrument: Resolve instrument

Try to resolve the instrument for transaction and holdings for a given instrument identifier and a specified  period of time. Also update the instrument identifiers with the given instrument identifiers collection.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String instrumentIdentifierType = "instrumentIdentifierType_example"; // String | The instrument identifier type.
        String instrumentIdentifierValue = "instrumentIdentifierValue_example"; // String | The value for the given instrument identifier.
        String fromEffectiveAt = "fromEffectiveAt_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no lower bound if this is not specified.
        Boolean reResolve = false; // Boolean | When set to true, instrument resolution will be attempted for all transactions and holdings for the given identifier and date range.   When set to false (default behaviour), instrument resolution will only be attempted for those transactions and holdings that were previously unresolved.
        Map<String, String> requestBody = {"Instrument/default/Figi":"BBG000C6K6G9","Instrument/default/Isin":"GB00BH4HKS39"}; // Map<String, String> | The dictionary with the instrument identifiers to be updated on the   transaction and holdings.
        try {
            // uncomment the below to set overrides at the request level
            // UpsertPortfolioTransactionsResponse result = apiInstance.resolveInstrument(scope, code, instrumentIdentifierType, instrumentIdentifierValue, fromEffectiveAt, reResolve, requestBody).execute(opts);

            UpsertPortfolioTransactionsResponse result = apiInstance.resolveInstrument(scope, code, instrumentIdentifierType, instrumentIdentifierValue, fromEffectiveAt, reResolve, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#resolveInstrument");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **instrumentIdentifierType** | **String**| The instrument identifier type. | |
| **instrumentIdentifierValue** | **String**| The value for the given instrument identifier. | |
| **fromEffectiveAt** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.   There is no lower bound if this is not specified. | [optional] |
| **reResolve** | **Boolean**| When set to true, instrument resolution will be attempted for all transactions and holdings for the given identifier and date range.   When set to false (default behaviour), instrument resolution will only be attempted for those transactions and holdings that were previously unresolved. | [optional] [default to false] |
| **requestBody** | [**Map&lt;String, String&gt;**](String.md)| The dictionary with the instrument identifiers to be updated on the   transaction and holdings. | [optional] |

### Return type

[**UpsertPortfolioTransactionsResponse**](UpsertPortfolioTransactionsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The version of the transaction portfolio that contains the newly updated or inserted transactions |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setHoldings

> AdjustHolding setHoldings(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods)

SetHoldings: Set holdings

Set the holdings of the specified transaction portfolio to the provided targets. LUSID will automatically  construct adjustment transactions to ensure that the entire set of holdings for the transaction portfolio  are always set to the provided targets for the specified effective datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/docs/how-do-i-manually-adjust-or-set-holdings.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the holdings should be set to the provided targets.
        List<AdjustHoldingRequest> adjustHoldingRequest = Arrays.asList(); // List<AdjustHoldingRequest> | The complete set of target holdings for the transaction portfolio.
        List<String> reconciliationMethods = Arrays.asList(); // List<String> | Optional parameter for specifying a reconciliation method: e.g. FxForward.
        try {
            // uncomment the below to set overrides at the request level
            // AdjustHolding result = apiInstance.setHoldings(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods).execute(opts);

            AdjustHolding result = apiInstance.setHoldings(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#setHoldings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which the holdings should be set to the provided targets. | |
| **adjustHoldingRequest** | [**List&lt;AdjustHoldingRequest&gt;**](AdjustHoldingRequest.md)| The complete set of target holdings for the transaction portfolio. | |
| **reconciliationMethods** | [**List&lt;String&gt;**](String.md)| Optional parameter for specifying a reconciliation method: e.g. FxForward. | [optional] |

### Return type

[**AdjustHolding**](AdjustHolding.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The version of the transaction portfolio that contains the newly set holdings |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertCustodianAccounts

> CustodianAccountsUpsertResponse upsertCustodianAccounts(scope, code, custodianAccountRequest)

[EXPERIMENTAL] UpsertCustodianAccounts: Upsert Custodian Accounts

Create or update Custodian Accounts in the Transaction Portfolios. A Custodian Account will be updated  if it already exists and created if it does not.  The batch limit per request is 2,000.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Transaction Portfolio.
        String code = "code_example"; // String | The code of the Transaction Portfolio. Together with the scope this uniquely identifies   the Transaction Portfolios.
        List<CustodianAccountRequest> custodianAccountRequest = Arrays.asList(); // List<CustodianAccountRequest> | A list of Custodian Accounts to be created or updated.
        try {
            // uncomment the below to set overrides at the request level
            // CustodianAccountsUpsertResponse result = apiInstance.upsertCustodianAccounts(scope, code, custodianAccountRequest).execute(opts);

            CustodianAccountsUpsertResponse result = apiInstance.upsertCustodianAccounts(scope, code, custodianAccountRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#upsertCustodianAccounts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Transaction Portfolio. | |
| **code** | **String**| The code of the Transaction Portfolio. Together with the scope this uniquely identifies   the Transaction Portfolios. | |
| **custodianAccountRequest** | [**List&lt;CustodianAccountRequest&gt;**](CustodianAccountRequest.md)| A list of Custodian Accounts to be created or updated. | |

### Return type

[**CustodianAccountsUpsertResponse**](CustodianAccountsUpsertResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly upserted custodian accounts. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertCustodianAccountsProperties

> CustodianAccountProperties upsertCustodianAccountsProperties(scope, code, custodianAccountScope, custodianAccountCode, requestBody)

[EXPERIMENTAL] UpsertCustodianAccountsProperties: Upsert custodian accounts properties

Update or insert one or more properties onto a single custodian account. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;CustodianAccount&#39;.     Upserting a property that exists for a Transaction Portfolios, with a null value, will delete the instance of the property for that group.     Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Transaction Portfolios to update or insert the properties onto.
        String code = "code_example"; // String | The code of the Transaction Portfolios to update or insert the properties onto. Together with the scope this uniquely identifies the Transaction Portfolios.
        String custodianAccountScope = "custodianAccountScope_example"; // String | The scope of the Custodian Account to update or insert the properties onto.
        String custodianAccountCode = "custodianAccountCode_example"; // String | The unique ID of the custodian account to create or update properties for.
        Map<String, Property> requestBody = new HashMap(); // Map<String, Property> | The properties to be updated or inserted onto the Transaction Portfolio. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \"CustodianAccount/Manager/Id\".
        try {
            // uncomment the below to set overrides at the request level
            // CustodianAccountProperties result = apiInstance.upsertCustodianAccountsProperties(scope, code, custodianAccountScope, custodianAccountCode, requestBody).execute(opts);

            CustodianAccountProperties result = apiInstance.upsertCustodianAccountsProperties(scope, code, custodianAccountScope, custodianAccountCode, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#upsertCustodianAccountsProperties");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Transaction Portfolios to update or insert the properties onto. | |
| **code** | **String**| The code of the Transaction Portfolios to update or insert the properties onto. Together with the scope this uniquely identifies the Transaction Portfolios. | |
| **custodianAccountScope** | **String**| The scope of the Custodian Account to update or insert the properties onto. | |
| **custodianAccountCode** | **String**| The unique ID of the custodian account to create or update properties for. | |
| **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be updated or inserted onto the Transaction Portfolio. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;CustodianAccount/Manager/Id\&quot;. | [optional] |

### Return type

[**CustodianAccountProperties**](CustodianAccountProperties.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated or inserted properties |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertPortfolioDetails

> PortfolioDetails upsertPortfolioDetails(scope, code, createPortfolioDetails, effectiveAt)

UpsertPortfolioDetails: Upsert portfolio details

Create or update certain details for a particular transaction portfolio. The details are updated if they already exist, and inserted if they do not.     Note that not all elements of a transaction portfolio definition are  modifiable once it has been created due to the potential implications for data already stored.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the   scope this uniquely identifies the transaction portfolio.
        CreatePortfolioDetails createPortfolioDetails = new CreatePortfolioDetails(); // CreatePortfolioDetails | The details to create or update for the specified transaction portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the updated or inserted details should become valid.   Defaults to the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioDetails result = apiInstance.upsertPortfolioDetails(scope, code, createPortfolioDetails, effectiveAt).execute(opts);

            PortfolioDetails result = apiInstance.upsertPortfolioDetails(scope, code, createPortfolioDetails, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#upsertPortfolioDetails");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the   scope this uniquely identifies the transaction portfolio. | |
| **createPortfolioDetails** | [**CreatePortfolioDetails**](CreatePortfolioDetails.md)| The details to create or update for the specified transaction portfolio. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which the updated or inserted details should become valid.   Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**PortfolioDetails**](PortfolioDetails.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly updated or inserted details |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertTransactionProperties

> UpsertTransactionPropertiesResponse upsertTransactionProperties(scope, code, transactionId, requestBody)

UpsertTransactionProperties: Upsert transaction properties

Create or update one or more transaction properties for a single transaction in the transaction portfolio.  Each property will be updated if it already exists and created if it does not.  Both transaction and portfolio must exist at the time when properties are created or updated.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        String transactionId = "transactionId_example"; // String | The unique ID of the transaction to create or update properties for.
        Map<String, PerpetualProperty> requestBody = new HashMap(); // Map<String, PerpetualProperty> | The properties and their associated values to create or update.
        try {
            // uncomment the below to set overrides at the request level
            // UpsertTransactionPropertiesResponse result = apiInstance.upsertTransactionProperties(scope, code, transactionId, requestBody).execute(opts);

            UpsertTransactionPropertiesResponse result = apiInstance.upsertTransactionProperties(scope, code, transactionId, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#upsertTransactionProperties");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **transactionId** | **String**| The unique ID of the transaction to create or update properties for. | |
| **requestBody** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md)| The properties and their associated values to create or update. | |

### Return type

[**UpsertTransactionPropertiesResponse**](UpsertTransactionPropertiesResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The version of the transaction portfolio that contains the newly updated or inserted transaction property |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertTransactions

> UpsertPortfolioTransactionsResponse upsertTransactions(scope, code, transactionRequest, preserveProperties)

UpsertTransactions: Upsert transactions

Create or update transactions in the transaction portfolio. A transaction will be updated  if it already exists and created if it does not.  The maximum number of transactions that this method can upsert per request is 10,000.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionPortfoliosApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // TransactionPortfoliosApi apiInstance = apiFactory.build(TransactionPortfoliosApi.class);

        TransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the transaction portfolio.
        String code = "code_example"; // String | The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio.
        List<TransactionRequest> transactionRequest = Arrays.asList(); // List<TransactionRequest> | A list of transactions to be created or updated.
        Boolean preserveProperties = true; // Boolean | If set to false, the entire property set will be overwritten by the provided properties. If not specified or set to true, only the properties provided will be updated.
        try {
            // uncomment the below to set overrides at the request level
            // UpsertPortfolioTransactionsResponse result = apiInstance.upsertTransactions(scope, code, transactionRequest, preserveProperties).execute(opts);

            UpsertPortfolioTransactionsResponse result = apiInstance.upsertTransactions(scope, code, transactionRequest, preserveProperties).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionPortfoliosApi#upsertTransactions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the transaction portfolio. | |
| **code** | **String**| The code of the transaction portfolio. Together with the scope this uniquely identifies   the transaction portfolio. | |
| **transactionRequest** | [**List&lt;TransactionRequest&gt;**](TransactionRequest.md)| A list of transactions to be created or updated. | |
| **preserveProperties** | **Boolean**| If set to false, the entire property set will be overwritten by the provided properties. If not specified or set to true, only the properties provided will be updated. | [optional] [default to true] |

### Return type

[**UpsertPortfolioTransactionsResponse**](UpsertPortfolioTransactionsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The version of the transaction portfolio that contains the newly updated or inserted transactions |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

