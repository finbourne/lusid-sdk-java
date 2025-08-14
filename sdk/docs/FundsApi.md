# FundsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptEstimateValuationPoint**](FundsApi.md#acceptEstimateValuationPoint) | **POST** /api/funds/{scope}/{code}/valuationpoints/$acceptestimate | [EXPERIMENTAL] AcceptEstimateValuationPoint: Accepts an Estimate Valuation Point. |
| [**createFee**](FundsApi.md#createFee) | **POST** /api/funds/{scope}/{code}/fees | [EXPERIMENTAL] CreateFee: Create a Fee. |
| [**createFund**](FundsApi.md#createFund) | **POST** /api/funds/{scope} | [EXPERIMENTAL] CreateFund: Create a Fund. |
| [**createFundV2**](FundsApi.md#createFundV2) | **POST** /api/funds/v2/{scope} | [EXPERIMENTAL] CreateFundV2: Create a Fund V2 (Preview). |
| [**deleteFee**](FundsApi.md#deleteFee) | **DELETE** /api/funds/{scope}/{code}/fees/{feeCode} | [EXPERIMENTAL] DeleteFee: Delete a Fee. |
| [**deleteFund**](FundsApi.md#deleteFund) | **DELETE** /api/funds/{scope}/{code} | [EXPERIMENTAL] DeleteFund: Delete a Fund. |
| [**deleteValuationPoint**](FundsApi.md#deleteValuationPoint) | **DELETE** /api/funds/{scope}/{code}/valuationpoints/{diaryEntryCode} | [EXPERIMENTAL] DeleteValuationPoint: Delete a Valuation Point. |
| [**finaliseCandidateValuationPoint**](FundsApi.md#finaliseCandidateValuationPoint) | **POST** /api/funds/{scope}/{code}/valuationpoints/$finalisecandidate | [EXPERIMENTAL] FinaliseCandidateValuationPoint: Finalise Candidate. |
| [**getFee**](FundsApi.md#getFee) | **GET** /api/funds/{scope}/{code}/fees/{feeCode} | [EXPERIMENTAL] GetFee: Get a Fee for a specified Fund. |
| [**getFeeProperties**](FundsApi.md#getFeeProperties) | **GET** /api/funds/{scope}/{code}/fees/{feeCode}/properties | [EXPERIMENTAL] GetFeeProperties: Get Fee properties |
| [**getFund**](FundsApi.md#getFund) | **GET** /api/funds/{scope}/{code} | [EXPERIMENTAL] GetFund: Get a Fund. |
| [**getFundProperties**](FundsApi.md#getFundProperties) | **GET** /api/funds/{scope}/{code}/properties | [EXPERIMENTAL] GetFundProperties: Get Fund properties |
| [**getHoldingsForFund**](FundsApi.md#getHoldingsForFund) | **POST** /api/funds/{scope}/{code}/$holdings | [EXPERIMENTAL] GetHoldingsForFund: Get holdings for transaction portfolios in a Fund. |
| [**getValuationForFund**](FundsApi.md#getValuationForFund) | **POST** /api/funds/{scope}/{code}/$valuation | [EXPERIMENTAL] GetValuationForFund: Perform valuation for a Fund |
| [**getValuationPointData**](FundsApi.md#getValuationPointData) | **POST** /api/funds/{scope}/{code}/valuationpoints/$query | [EXPERIMENTAL] GetValuationPointData: Get Valuation Point Data for a Fund. |
| [**getValuationPointJournalEntryLines**](FundsApi.md#getValuationPointJournalEntryLines) | **POST** /api/funds/{scope}/{code}/valuationpoints/journalentrylines/$query | [EXPERIMENTAL] GetValuationPointJournalEntryLines: Get the Journal Entry lines for the given Fund. |
| [**getValuationPointPnlSummary**](FundsApi.md#getValuationPointPnlSummary) | **POST** /api/funds/{scope}/{code}/valuationpoints/pnlsummary/$query | [EXPERIMENTAL] GetValuationPointPnlSummary: Get a PnL summary for the given Valuation Point in the Fund. |
| [**getValuationPointTransactions**](FundsApi.md#getValuationPointTransactions) | **POST** /api/funds/{scope}/{code}/valuationpoints/transactions/$query | [EXPERIMENTAL] GetValuationPointTransactions: Get the Transactions for the given Fund. |
| [**getValuationPointTrialBalance**](FundsApi.md#getValuationPointTrialBalance) | **POST** /api/funds/{scope}/{code}/valuationpoints/trialbalance/$query | [EXPERIMENTAL] GetValuationPointTrialBalance: Get Trial Balance for the given Fund. |
| [**listFees**](FundsApi.md#listFees) | **GET** /api/funds/{scope}/{code}/fees | [EXPERIMENTAL] ListFees: List Fees for a specified Fund. |
| [**listFundCalendar**](FundsApi.md#listFundCalendar) | **GET** /api/funds/{scope}/{code}/calendar | [EXPERIMENTAL] ListFundCalendar: List Fund Calendar. |
| [**listFunds**](FundsApi.md#listFunds) | **GET** /api/funds | [EXPERIMENTAL] ListFunds: List Funds. |
| [**listValuationPointOverview**](FundsApi.md#listValuationPointOverview) | **GET** /api/funds/{scope}/{code}/valuationPointOverview | [EXPERIMENTAL] ListValuationPointOverview: List Valuation Points Overview for a given Fund. |
| [**patchFee**](FundsApi.md#patchFee) | **PATCH** /api/funds/{scope}/{code}/fees/{feeCode} | [EXPERIMENTAL] PatchFee: Patch Fee. |
| [**patchFund**](FundsApi.md#patchFund) | **PATCH** /api/funds/{scope}/{code} | [EXPERIMENTAL] PatchFund: Patch a Fund. |
| [**setShareClassInstruments**](FundsApi.md#setShareClassInstruments) | **PUT** /api/funds/{scope}/{code}/shareclasses | [EXPERIMENTAL] SetShareClassInstruments: Set the ShareClass Instruments on a fund. |
| [**upsertDiaryEntryTypeValuationPoint**](FundsApi.md#upsertDiaryEntryTypeValuationPoint) | **POST** /api/funds/{scope}/{code}/valuationpoints | [EXPERIMENTAL] UpsertDiaryEntryTypeValuationPoint: Upsert Valuation Point. |
| [**upsertFeeProperties**](FundsApi.md#upsertFeeProperties) | **POST** /api/funds/{scope}/{code}/fees/{feeCode}/properties/$upsert | [EXPERIMENTAL] UpsertFeeProperties: Upsert Fee properties. |
| [**upsertFundProperties**](FundsApi.md#upsertFundProperties) | **POST** /api/funds/{scope}/{code}/properties/$upsert | [EXPERIMENTAL] UpsertFundProperties: Upsert Fund properties. |



## acceptEstimateValuationPoint

> AcceptEstimateValuationPointResponse acceptEstimateValuationPoint(scope, code, valuationPointDataRequest, navTypeCode)

[EXPERIMENTAL] AcceptEstimateValuationPoint: Accepts an Estimate Valuation Point.

Accepts the specified estimate Valuation Point.  Should the Valuation Point differ since the Valuation Point was last run, both Valuation Points will be returned and status will be marked as &#39;Candidate&#39;,  otherwise it will be marked as &#39;Final&#39;.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope this uniquely identifies the Fund.
        ValuationPointDataRequest valuationPointDataRequest = new ValuationPointDataRequest(); // ValuationPointDataRequest | The valuationPointDataRequest which contains the Diary Entry code for the Estimate Valuation Point to move to Candidate or Final state.
        String navTypeCode = "navTypeCode_example"; // String | When provided Accepts the Valuation Point of the specified NAV Type. When not provided the Primary NAV Type will be Accepted.
        try {
            // uncomment the below to set overrides at the request level
            // AcceptEstimateValuationPointResponse result = apiInstance.acceptEstimateValuationPoint(scope, code, valuationPointDataRequest, navTypeCode).execute(opts);

            AcceptEstimateValuationPointResponse result = apiInstance.acceptEstimateValuationPoint(scope, code, valuationPointDataRequest, navTypeCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#acceptEstimateValuationPoint");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope this uniquely identifies the Fund. | |
| **valuationPointDataRequest** | [**ValuationPointDataRequest**](ValuationPointDataRequest.md)| The valuationPointDataRequest which contains the Diary Entry code for the Estimate Valuation Point to move to Candidate or Final state. | |
| **navTypeCode** | **String**| When provided Accepts the Valuation Point of the specified NAV Type. When not provided the Primary NAV Type will be Accepted. | [optional] |

### Return type

[**AcceptEstimateValuationPointResponse**](AcceptEstimateValuationPointResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Accepted Estimate point and status after being Accepted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createFee

> Fee createFee(scope, code, feeRequest, navTypeCode)

[EXPERIMENTAL] CreateFee: Create a Fee.

Create the given Fee.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope this uniquely identifies the Fund.
        FeeRequest feeRequest = new FeeRequest(); // FeeRequest | The Fee to create.
        String navTypeCode = "navTypeCode_example"; // String | When provided runs against the specified NAV Type, otherwise the Primary NAV Type will be used.
        try {
            // uncomment the below to set overrides at the request level
            // Fee result = apiInstance.createFee(scope, code, feeRequest, navTypeCode).execute(opts);

            Fee result = apiInstance.createFee(scope, code, feeRequest, navTypeCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#createFee");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope this uniquely identifies the Fund. | |
| **feeRequest** | [**FeeRequest**](FeeRequest.md)| The Fee to create. | |
| **navTypeCode** | **String**| When provided runs against the specified NAV Type, otherwise the Primary NAV Type will be used. | [optional] |

### Return type

[**Fee**](Fee.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Fee. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createFund

> Fund createFund(scope, fundRequest)

[EXPERIMENTAL] CreateFund: Create a Fund.

Create the given Fund.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        FundRequest fundRequest = new FundRequest(); // FundRequest | The definition of the Fund.
        try {
            // uncomment the below to set overrides at the request level
            // Fund result = apiInstance.createFund(scope, fundRequest).execute(opts);

            Fund result = apiInstance.createFund(scope, fundRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#createFund");
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
| **scope** | **String**| The scope of the Fund. | |
| **fundRequest** | [**FundRequest**](FundRequest.md)| The definition of the Fund. | |

### Return type

[**Fund**](Fund.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Fund. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createFundV2

> Fund createFundV2(scope, fundDefinitionRequest)

[EXPERIMENTAL] CreateFundV2: Create a Fund V2 (Preview).

Create the given V2 Fund.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        FundDefinitionRequest fundDefinitionRequest = new FundDefinitionRequest(); // FundDefinitionRequest | The definition of the Fund.
        try {
            // uncomment the below to set overrides at the request level
            // Fund result = apiInstance.createFundV2(scope, fundDefinitionRequest).execute(opts);

            Fund result = apiInstance.createFundV2(scope, fundDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#createFundV2");
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
| **scope** | **String**| The scope of the Fund. | |
| **fundDefinitionRequest** | [**FundDefinitionRequest**](FundDefinitionRequest.md)| The definition of the Fund. | |

### Return type

[**Fund**](Fund.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Fund. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteFee

> DeletedEntityResponse deleteFee(scope, code, feeCode)

[EXPERIMENTAL] DeleteFee: Delete a Fee.

Delete the given Fee.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund
        String code = "code_example"; // String | The code of the Fund. Together with the scope this uniquely identifies the Fund.
        String feeCode = "feeCode_example"; // String | The code of the Fee to be deleted.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteFee(scope, code, feeCode).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteFee(scope, code, feeCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#deleteFee");
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
| **scope** | **String**| The scope of the Fund | |
| **code** | **String**| The code of the Fund. Together with the scope this uniquely identifies the Fund. | |
| **feeCode** | **String**| The code of the Fee to be deleted. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the Fee was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteFund

> DeletedEntityResponse deleteFund(scope, code)

[EXPERIMENTAL] DeleteFund: Delete a Fund.

Delete the given Fund.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund to be deleted.
        String code = "code_example"; // String | The code of the Fund to be deleted. Together with the scope this uniquely identifies the Fund.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteFund(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteFund(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#deleteFund");
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
| **scope** | **String**| The scope of the Fund to be deleted. | |
| **code** | **String**| The code of the Fund to be deleted. Together with the scope this uniquely identifies the Fund. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the Fund was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteValuationPoint

> DeletedEntityResponse deleteValuationPoint(scope, code, diaryEntryCode, navTypeCode)

[EXPERIMENTAL] DeleteValuationPoint: Delete a Valuation Point.

Deletes the given Valuation Point.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund for the valuation point to be deleted.
        String code = "code_example"; // String | The code of the Fund containing the Valuation Point to be deleted. Together with the scope this uniquely identifies the Fund.
        String diaryEntryCode = "diaryEntryCode_example"; // String | The diary entry code for the valuation Point to be deleted.
        String navTypeCode = "navTypeCode_example"; // String | When provided, Deletes the Valuation Point against the specified NAV Type. When not provided the Primary NAV Type will be Deleted.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteValuationPoint(scope, code, diaryEntryCode, navTypeCode).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteValuationPoint(scope, code, diaryEntryCode, navTypeCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#deleteValuationPoint");
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
| **scope** | **String**| The scope of the Fund for the valuation point to be deleted. | |
| **code** | **String**| The code of the Fund containing the Valuation Point to be deleted. Together with the scope this uniquely identifies the Fund. | |
| **diaryEntryCode** | **String**| The diary entry code for the valuation Point to be deleted. | |
| **navTypeCode** | **String**| When provided, Deletes the Valuation Point against the specified NAV Type. When not provided the Primary NAV Type will be Deleted. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the Valuation Point was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## finaliseCandidateValuationPoint

> ValuationPointDataResponse finaliseCandidateValuationPoint(scope, code, valuationPointDataRequest, navTypeCode)

[EXPERIMENTAL] FinaliseCandidateValuationPoint: Finalise Candidate.

Moves a &#39;Candidate&#39; status Valuation Point to status &#39;Final&#39;.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope this uniquely identifies the Fund.
        ValuationPointDataRequest valuationPointDataRequest = new ValuationPointDataRequest(); // ValuationPointDataRequest | The valuationPointDataRequest which contains the diary entry code to mark as final.
        String navTypeCode = "navTypeCode_example"; // String | When provided Finalises the Valuation Point of the specified NAV Type. When not provided the Primary NAV Type will be Finalised.
        try {
            // uncomment the below to set overrides at the request level
            // ValuationPointDataResponse result = apiInstance.finaliseCandidateValuationPoint(scope, code, valuationPointDataRequest, navTypeCode).execute(opts);

            ValuationPointDataResponse result = apiInstance.finaliseCandidateValuationPoint(scope, code, valuationPointDataRequest, navTypeCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#finaliseCandidateValuationPoint");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope this uniquely identifies the Fund. | |
| **valuationPointDataRequest** | [**ValuationPointDataRequest**](ValuationPointDataRequest.md)| The valuationPointDataRequest which contains the diary entry code to mark as final. | |
| **navTypeCode** | **String**| When provided Finalises the Valuation Point of the specified NAV Type. When not provided the Primary NAV Type will be Finalised. | [optional] |

### Return type

[**ValuationPointDataResponse**](ValuationPointDataResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated Valuation Point response as a result of it be marked as Final. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getFee

> Fee getFee(scope, code, feeCode, effectiveAt, asAt, propertyKeys)

[EXPERIMENTAL] GetFee: Get a Fee for a specified Fund.

Retrieve a fee for a specified Fund

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope this uniquely identifies the Fund.
        String feeCode = "feeCode_example"; // String | The code of the Fee.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Fee properties. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Fee. Defaults to returning the latest version of the Fee if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Fee' domain to decorate onto the Fee.   These must take the format {domain}/{scope}/{code}, for example 'Fee/Account/Id'. If no properties are specified, then no properties will be returned.
        try {
            // uncomment the below to set overrides at the request level
            // Fee result = apiInstance.getFee(scope, code, feeCode, effectiveAt, asAt, propertyKeys).execute(opts);

            Fee result = apiInstance.getFee(scope, code, feeCode, effectiveAt, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#getFee");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope this uniquely identifies the Fund. | |
| **feeCode** | **String**| The code of the Fee. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Fee properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Fee. Defaults to returning the latest version of the Fee if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Fee&#39; domain to decorate onto the Fee.   These must take the format {domain}/{scope}/{code}, for example &#39;Fee/Account/Id&#39;. If no properties are specified, then no properties will be returned. | [optional] |

### Return type

[**Fee**](Fee.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Fee definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getFeeProperties

> FeeProperties getFeeProperties(scope, code, feeCode, effectiveAt, asAt)

[EXPERIMENTAL] GetFeeProperties: Get Fee properties

Get all the properties of a single fee.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope this uniquely identifies the Fund.
        String feeCode = "feeCode_example"; // String | The code of the Fee to get the properties for.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the Fee's properties. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Fee's properties. Defaults to return the latest version of each property if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // FeeProperties result = apiInstance.getFeeProperties(scope, code, feeCode, effectiveAt, asAt).execute(opts);

            FeeProperties result = apiInstance.getFeeProperties(scope, code, feeCode, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#getFeeProperties");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope this uniquely identifies the Fund. | |
| **feeCode** | **String**| The code of the Fee to get the properties for. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the Fee&#39;s properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Fee&#39;s properties. Defaults to return the latest version of each property if not specified. | [optional] |

### Return type

[**FeeProperties**](FeeProperties.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The properties of the specified fee |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getFund

> Fund getFund(scope, code, effectiveAt, asAt, propertyKeys)

[EXPERIMENTAL] GetFund: Get a Fund.

Retrieve the definition of a particular Fund.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope this uniquely identifies the Fund.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Fund properties. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Fund definition. Defaults to returning the latest version of the Fund definition if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Fund' domain to decorate onto the Fund.   These must take the format {domain}/{scope}/{code}, for example 'Fund/Manager/Id'. If no properties are specified, then no properties will be returned.
        try {
            // uncomment the below to set overrides at the request level
            // Fund result = apiInstance.getFund(scope, code, effectiveAt, asAt, propertyKeys).execute(opts);

            Fund result = apiInstance.getFund(scope, code, effectiveAt, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#getFund");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope this uniquely identifies the Fund. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Fund properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Fund definition. Defaults to returning the latest version of the Fund definition if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Fund&#39; domain to decorate onto the Fund.   These must take the format {domain}/{scope}/{code}, for example &#39;Fund/Manager/Id&#39;. If no properties are specified, then no properties will be returned. | [optional] |

### Return type

[**Fund**](Fund.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Fund definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getFundProperties

> FundProperties getFundProperties(scope, code, effectiveAt, asAt)

[EXPERIMENTAL] GetFundProperties: Get Fund properties

Get all the properties of a single fund.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund to list the properties for.
        String code = "code_example"; // String | The code of the Fund to list the properties for. Together with the scope this uniquely identifies the Fund.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the Fund's properties. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Fund's properties. Defaults to return the latest version of each property if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // FundProperties result = apiInstance.getFundProperties(scope, code, effectiveAt, asAt).execute(opts);

            FundProperties result = apiInstance.getFundProperties(scope, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#getFundProperties");
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
| **scope** | **String**| The scope of the Fund to list the properties for. | |
| **code** | **String**| The code of the Fund to list the properties for. Together with the scope this uniquely identifies the Fund. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the Fund&#39;s properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Fund&#39;s properties. Defaults to return the latest version of each property if not specified. | [optional] |

### Return type

[**FundProperties**](FundProperties.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The properties of the specified fund |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getHoldingsForFund

> VersionedResourceListOfPortfolioHolding getHoldingsForFund(scope, code, singleValuationPointQueryParameters, navTypeCode, asAt, filter, propertyKeys, byTaxlots, includeSettlementEventsAfterDays)

[EXPERIMENTAL] GetHoldingsForFund: Get holdings for transaction portfolios in a Fund.

Get the holdings of transaction portfolios in a specified Fund.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope this uniquely identifies the Fund.
        SingleValuationPointQueryParameters singleValuationPointQueryParameters = new SingleValuationPointQueryParameters(); // SingleValuationPointQueryParameters | The query parameters used for diary entry or effective date of Holdings
        String navTypeCode = "navTypeCode_example"; // String | When provided runs against the specified NAV Type, otherwise the Primary NAV Type will be used.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the holdings of transaction portfolios in the Fund. Defaults   to return the latest version of the holdings if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\", \"Holding\" or \"Portfolio\" domain to decorate onto   the holdings. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or \"Holding/system/Cost\".
        Boolean byTaxlots = true; // Boolean | Whether to expand the holdings to return the underlying tax-lots. Defaults to False.
        Integer includeSettlementEventsAfterDays = 56; // Integer | Number of days ahead to bring back settlements from, in relation to the specified effectiveAt
        try {
            // uncomment the below to set overrides at the request level
            // VersionedResourceListOfPortfolioHolding result = apiInstance.getHoldingsForFund(scope, code, singleValuationPointQueryParameters, navTypeCode, asAt, filter, propertyKeys, byTaxlots, includeSettlementEventsAfterDays).execute(opts);

            VersionedResourceListOfPortfolioHolding result = apiInstance.getHoldingsForFund(scope, code, singleValuationPointQueryParameters, navTypeCode, asAt, filter, propertyKeys, byTaxlots, includeSettlementEventsAfterDays).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#getHoldingsForFund");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope this uniquely identifies the Fund. | |
| **singleValuationPointQueryParameters** | [**SingleValuationPointQueryParameters**](SingleValuationPointQueryParameters.md)| The query parameters used for diary entry or effective date of Holdings | |
| **navTypeCode** | **String**| When provided runs against the specified NAV Type, otherwise the Primary NAV Type will be used. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the holdings of transaction portfolios in the Fund. Defaults   to return the latest version of the holdings if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto   the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. | [optional] |
| **byTaxlots** | **Boolean**| Whether to expand the holdings to return the underlying tax-lots. Defaults to False. | [optional] |
| **includeSettlementEventsAfterDays** | **Integer**| Number of days ahead to bring back settlements from, in relation to the specified effectiveAt | [optional] |

### Return type

[**VersionedResourceListOfPortfolioHolding**](VersionedResourceListOfPortfolioHolding.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The holdings of transaction portfolios in a specific version of a Fund |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getValuationForFund

> ListAggregationResponse getValuationForFund(scope, code, navTypeCode, fundValuationRequest)

[EXPERIMENTAL] GetValuationForFund: Perform valuation for a Fund

Perform valuation on a specified Fund.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund
        String code = "code_example"; // String | The code of the Fund
        String navTypeCode = "navTypeCode_example"; // String | When provided runs against the specified NAV Type, otherwise the Primary NAV Type will be used.
        FundValuationRequest fundValuationRequest = new FundValuationRequest(); // FundValuationRequest | The request specifying the dates (or DiaryEntry) on which to calculate a set of valuation metrics
        try {
            // uncomment the below to set overrides at the request level
            // ListAggregationResponse result = apiInstance.getValuationForFund(scope, code, navTypeCode, fundValuationRequest).execute(opts);

            ListAggregationResponse result = apiInstance.getValuationForFund(scope, code, navTypeCode, fundValuationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#getValuationForFund");
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
| **scope** | **String**| The scope of the Fund | |
| **code** | **String**| The code of the Fund | |
| **navTypeCode** | **String**| When provided runs against the specified NAV Type, otherwise the Primary NAV Type will be used. | [optional] |
| **fundValuationRequest** | [**FundValuationRequest**](FundValuationRequest.md)| The request specifying the dates (or DiaryEntry) on which to calculate a set of valuation metrics | [optional] |

### Return type

[**ListAggregationResponse**](ListAggregationResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getValuationPointData

> ValuationPointDataResponse getValuationPointData(scope, code, valuationPointDataQueryParameters, asAt, navTypeCode)

[EXPERIMENTAL] GetValuationPointData: Get Valuation Point Data for a Fund.

Retrieves the Valuation Point data for a date or specified Diary Entry Id.  The endpoint will internally extract all &#39;Assets&#39; and &#39;Liabilities&#39; from the related ABOR&#39;s Trial balance to produce a GAV.  Start date will be assumed from the last &#39;official&#39; DiaryEntry and EndDate will be as provided.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope this uniquely identifies the Fund.
        ValuationPointDataQueryParameters valuationPointDataQueryParameters = new ValuationPointDataQueryParameters(); // ValuationPointDataQueryParameters | The arguments to use for querying the Valuation Point data
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Fund definition. Defaults to returning the latest version of the Fund definition if not specified.
        String navTypeCode = "navTypeCode_example"; // String | When provided runs against the specified NAV Type, otherwise the Primary NAV Type will be used.
        try {
            // uncomment the below to set overrides at the request level
            // ValuationPointDataResponse result = apiInstance.getValuationPointData(scope, code, valuationPointDataQueryParameters, asAt, navTypeCode).execute(opts);

            ValuationPointDataResponse result = apiInstance.getValuationPointData(scope, code, valuationPointDataQueryParameters, asAt, navTypeCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#getValuationPointData");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope this uniquely identifies the Fund. | |
| **valuationPointDataQueryParameters** | [**ValuationPointDataQueryParameters**](ValuationPointDataQueryParameters.md)| The arguments to use for querying the Valuation Point data | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Fund definition. Defaults to returning the latest version of the Fund definition if not specified. | [optional] |
| **navTypeCode** | **String**| When provided runs against the specified NAV Type, otherwise the Primary NAV Type will be used. | [optional] |

### Return type

[**ValuationPointDataResponse**](ValuationPointDataResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The specified Valuation Point for the Fund. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getValuationPointJournalEntryLines

> ValuationPointResourceListOfFundJournalEntryLine getValuationPointJournalEntryLines(scope, code, valuationPointDataQueryParameters, generalLedgerProfileCode, asAt, filter, limit, page, propertyKeys, navTypeCode)

[EXPERIMENTAL] GetValuationPointJournalEntryLines: Get the Journal Entry lines for the given Fund.

Gets the Journal Entry lines for the given Valuation Point for a Fund     The Journal Entry lines have been generated from transactions, translated via posting rules and used in the valuation point

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope is creating the unique identifier for the given Fund.
        ValuationPointDataQueryParameters valuationPointDataQueryParameters = new ValuationPointDataQueryParameters(); // ValuationPointDataQueryParameters | The arguments to use for querying the Journal Entry lines.
        String generalLedgerProfileCode = "generalLedgerProfileCode_example"; // String | The optional code of a general ledger profile used to decorate journal entry lines with levels.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve Journal Entry lines. Defaults to returning the latest version   of each transaction if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Journal Entry lines from a previous call to GetValuationPointJournalEntryLines.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Instrument', 'Transaction', 'Portfolio', 'Account', 'LegalEntity' or 'CustodianAccount'   domain to decorate onto the journal entry lines.
        String navTypeCode = "navTypeCode_example"; // String | May be provided to view a specific NAV type. When not provided, Primary NAV will be used.
        try {
            // uncomment the below to set overrides at the request level
            // ValuationPointResourceListOfFundJournalEntryLine result = apiInstance.getValuationPointJournalEntryLines(scope, code, valuationPointDataQueryParameters, generalLedgerProfileCode, asAt, filter, limit, page, propertyKeys, navTypeCode).execute(opts);

            ValuationPointResourceListOfFundJournalEntryLine result = apiInstance.getValuationPointJournalEntryLines(scope, code, valuationPointDataQueryParameters, generalLedgerProfileCode, asAt, filter, limit, page, propertyKeys, navTypeCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#getValuationPointJournalEntryLines");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope is creating the unique identifier for the given Fund. | |
| **valuationPointDataQueryParameters** | [**ValuationPointDataQueryParameters**](ValuationPointDataQueryParameters.md)| The arguments to use for querying the Journal Entry lines. | |
| **generalLedgerProfileCode** | **String**| The optional code of a general ledger profile used to decorate journal entry lines with levels. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve Journal Entry lines. Defaults to returning the latest version   of each transaction if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Journal Entry lines from a previous call to GetValuationPointJournalEntryLines. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, &#39;Portfolio&#39;, &#39;Account&#39;, &#39;LegalEntity&#39; or &#39;CustodianAccount&#39;   domain to decorate onto the journal entry lines. | [optional] |
| **navTypeCode** | **String**| May be provided to view a specific NAV type. When not provided, Primary NAV will be used. | [optional] |

### Return type

[**ValuationPointResourceListOfFundJournalEntryLine**](ValuationPointResourceListOfFundJournalEntryLine.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Journal Entry lines for the specified Valuation Point for a Fund. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getValuationPointPnlSummary

> ValuationPointResourceListOfPnlJournalEntryLine getValuationPointPnlSummary(scope, code, valuationPointDataQueryParameters, generalLedgerProfileCode, asAt, filter, limit, page, navTypeCode)

[EXPERIMENTAL] GetValuationPointPnlSummary: Get a PnL summary for the given Valuation Point in the Fund.

Gets the PnL Summary lines from the journal entry lines produced when calculating the valuation point.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope is the unique identifier for the given Fund.
        ValuationPointDataQueryParameters valuationPointDataQueryParameters = new ValuationPointDataQueryParameters(); // ValuationPointDataQueryParameters | The query parameters used in running the generation of the PnL summary
        String generalLedgerProfileCode = "generalLedgerProfileCode_example"; // String | The optional code of a general ledger profile used to decorate journal entry lines with levels.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve PnL summary. Defaults to returning the latest version   of each transaction if not specified.
        String filter = "filter_example"; // String | \"Expression to filter the result set.\"
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Trial balance from a previous call to Trial balance.
        String navTypeCode = "navTypeCode_example"; // String | May be provided to view a specific NAV type. When not provided, Primary NAV will be used.
        try {
            // uncomment the below to set overrides at the request level
            // ValuationPointResourceListOfPnlJournalEntryLine result = apiInstance.getValuationPointPnlSummary(scope, code, valuationPointDataQueryParameters, generalLedgerProfileCode, asAt, filter, limit, page, navTypeCode).execute(opts);

            ValuationPointResourceListOfPnlJournalEntryLine result = apiInstance.getValuationPointPnlSummary(scope, code, valuationPointDataQueryParameters, generalLedgerProfileCode, asAt, filter, limit, page, navTypeCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#getValuationPointPnlSummary");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope is the unique identifier for the given Fund. | |
| **valuationPointDataQueryParameters** | [**ValuationPointDataQueryParameters**](ValuationPointDataQueryParameters.md)| The query parameters used in running the generation of the PnL summary | |
| **generalLedgerProfileCode** | **String**| The optional code of a general ledger profile used to decorate journal entry lines with levels. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve PnL summary. Defaults to returning the latest version   of each transaction if not specified. | [optional] |
| **filter** | **String**| \&quot;Expression to filter the result set.\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Trial balance from a previous call to Trial balance. | [optional] |
| **navTypeCode** | **String**| May be provided to view a specific NAV type. When not provided, Primary NAV will be used. | [optional] |

### Return type

[**ValuationPointResourceListOfPnlJournalEntryLine**](ValuationPointResourceListOfPnlJournalEntryLine.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested PnL summary for the specified Fund. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getValuationPointTransactions

> ValuationPointResourceListOfAccountedTransaction getValuationPointTransactions(scope, code, valuationPointDataQueryParameters, asAt, filter, limit, page, propertyKeys, navTypeCode)

[EXPERIMENTAL] GetValuationPointTransactions: Get the Transactions for the given Fund.

Gets the Transactions for the given Valuation Point for a Fund

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope is creating the unique identifier for the given Fund.
        ValuationPointDataQueryParameters valuationPointDataQueryParameters = new ValuationPointDataQueryParameters(); // ValuationPointDataQueryParameters | The arguments to use for querying the transactions.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve transactions. Defaults to returning the latest version   of each transaction if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing transactions from a previous call to GetValuationPointTransactions.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Instrument', 'Transaction', 'Portfolio', 'Account', 'LegalEntity' or 'CustodianAccount'   domain to decorate onto the journal entry lines.
        String navTypeCode = "navTypeCode_example"; // String | May be provided to view a specific NAV type. When not provided, Primary NAV will be used.
        try {
            // uncomment the below to set overrides at the request level
            // ValuationPointResourceListOfAccountedTransaction result = apiInstance.getValuationPointTransactions(scope, code, valuationPointDataQueryParameters, asAt, filter, limit, page, propertyKeys, navTypeCode).execute(opts);

            ValuationPointResourceListOfAccountedTransaction result = apiInstance.getValuationPointTransactions(scope, code, valuationPointDataQueryParameters, asAt, filter, limit, page, propertyKeys, navTypeCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#getValuationPointTransactions");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope is creating the unique identifier for the given Fund. | |
| **valuationPointDataQueryParameters** | [**ValuationPointDataQueryParameters**](ValuationPointDataQueryParameters.md)| The arguments to use for querying the transactions. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve transactions. Defaults to returning the latest version   of each transaction if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing transactions from a previous call to GetValuationPointTransactions. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, &#39;Portfolio&#39;, &#39;Account&#39;, &#39;LegalEntity&#39; or &#39;CustodianAccount&#39;   domain to decorate onto the journal entry lines. | [optional] |
| **navTypeCode** | **String**| May be provided to view a specific NAV type. When not provided, Primary NAV will be used. | [optional] |

### Return type

[**ValuationPointResourceListOfAccountedTransaction**](ValuationPointResourceListOfAccountedTransaction.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested transactions for the specified Valuation Point for a Fund. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getValuationPointTrialBalance

> ValuationPointResourceListOfTrialBalance getValuationPointTrialBalance(scope, code, valuationPointDataQueryParameters, generalLedgerProfileCode, asAt, filter, limit, page, propertyKeys, navTypeCode)

[EXPERIMENTAL] GetValuationPointTrialBalance: Get Trial Balance for the given Fund.

Gets the Trial Balance for the given Valuation Point for a Fund.     The Trial Balance has been generated from transactions, translated via Posting Rules  and aggregated based on a General Ledger Profile (where specified).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope this uniquely identifies the Fund.
        ValuationPointDataQueryParameters valuationPointDataQueryParameters = new ValuationPointDataQueryParameters(); // ValuationPointDataQueryParameters | The query parameters used in running the generation of the Trial Balance.
        String generalLedgerProfileCode = "generalLedgerProfileCode_example"; // String | The optional code of a general ledger profile used to decorate journal entry lines with levels.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Trial Balance.   Defaults to returning the latest version if not specified.
        String filter = "filter_example"; // String | Expression to filter the results by.   For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this number.   Defaults to 100 if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Trial Balances.   This token is returned from the previous call.   If a pagination token is provided, the filter, effectiveAt and asAt fields   must not have changed since the original request.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Instrument', 'Transaction', 'Portfolio', 'Account', 'LegalEntity' or 'CustodianAccount'   domain to decorate onto the journal entry lines.
        String navTypeCode = "navTypeCode_example"; // String | May be provided to view a specific NAV type. When not provided, Primary NAV will be used.
        try {
            // uncomment the below to set overrides at the request level
            // ValuationPointResourceListOfTrialBalance result = apiInstance.getValuationPointTrialBalance(scope, code, valuationPointDataQueryParameters, generalLedgerProfileCode, asAt, filter, limit, page, propertyKeys, navTypeCode).execute(opts);

            ValuationPointResourceListOfTrialBalance result = apiInstance.getValuationPointTrialBalance(scope, code, valuationPointDataQueryParameters, generalLedgerProfileCode, asAt, filter, limit, page, propertyKeys, navTypeCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#getValuationPointTrialBalance");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope this uniquely identifies the Fund. | |
| **valuationPointDataQueryParameters** | [**ValuationPointDataQueryParameters**](ValuationPointDataQueryParameters.md)| The query parameters used in running the generation of the Trial Balance. | |
| **generalLedgerProfileCode** | **String**| The optional code of a general ledger profile used to decorate journal entry lines with levels. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Trial Balance.   Defaults to returning the latest version if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results by.   For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this number.   Defaults to 100 if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Trial Balances.   This token is returned from the previous call.   If a pagination token is provided, the filter, effectiveAt and asAt fields   must not have changed since the original request. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, &#39;Portfolio&#39;, &#39;Account&#39;, &#39;LegalEntity&#39; or &#39;CustodianAccount&#39;   domain to decorate onto the journal entry lines. | [optional] |
| **navTypeCode** | **String**| May be provided to view a specific NAV type. When not provided, Primary NAV will be used. | [optional] |

### Return type

[**ValuationPointResourceListOfTrialBalance**](ValuationPointResourceListOfTrialBalance.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Trial Balance for the specified Fund. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listFees

> PagedResourceListOfFee listFees(scope, code, effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListFees: List Fees for a specified Fund.

List all the Fees matching a particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the TimeVariant properties for the Fees. Defaults to the current LUSID   system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Fees. Defaults to returning the latest version of each Fee if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing fees; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the treatment, specify \"treatment eq 'Monthly'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Fee' domain to decorate onto each Fee.   These must take the format {domain}/{scope}/{code}, for example 'Fee/Account/Id'.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfFee result = apiInstance.listFees(scope, code, effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            PagedResourceListOfFee result = apiInstance.listFees(scope, code, effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#listFees");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the TimeVariant properties for the Fees. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Fees. Defaults to returning the latest version of each Fee if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing fees; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the treatment, specify \&quot;treatment eq &#39;Monthly&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Fee&#39; domain to decorate onto each Fee.   These must take the format {domain}/{scope}/{code}, for example &#39;Fee/Account/Id&#39;. | [optional] |

### Return type

[**PagedResourceListOfFee**](PagedResourceListOfFee.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Fees. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listFundCalendar

> PagedResourceListOfFundCalendarEntry listFundCalendar(scope, code, asAt, page, limit, filter, sortBy)

[EXPERIMENTAL] ListFundCalendar: List Fund Calendar.

List all the Calendar Entries associated with the Fund.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The Scope for the Fund.
        String code = "code_example"; // String | The Code for the Fund.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Calendar. Defaults to returning the latest version of each Calendar Entry if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Valuation Points; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the DisplayName, specify \"displayName eq 'VP 1'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfFundCalendarEntry result = apiInstance.listFundCalendar(scope, code, asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfFundCalendarEntry result = apiInstance.listFundCalendar(scope, code, asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#listFundCalendar");
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
| **scope** | **String**| The Scope for the Fund. | |
| **code** | **String**| The Code for the Fund. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Calendar. Defaults to returning the latest version of each Calendar Entry if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Valuation Points; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the DisplayName, specify \&quot;displayName eq &#39;VP 1&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfFundCalendarEntry**](PagedResourceListOfFundCalendarEntry.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Fund Calendars. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listFunds

> PagedResourceListOfFund listFunds(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListFunds: List Funds.

List all the Funds matching particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the TimeVariant properties for the Funds. Defaults to the current LUSID   system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Funds. Defaults to returning the latest version of each Fund if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Funds; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the Fund type, specify \"id.Code eq 'Fund1'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Fund' domain to decorate onto each Fund.   These must take the format {domain}/{scope}/{code}, for example 'Fund/Manager/Id'.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfFund result = apiInstance.listFunds(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            PagedResourceListOfFund result = apiInstance.listFunds(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#listFunds");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the TimeVariant properties for the Funds. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Funds. Defaults to returning the latest version of each Fund if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Funds; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the Fund type, specify \&quot;id.Code eq &#39;Fund1&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Fund&#39; domain to decorate onto each Fund.   These must take the format {domain}/{scope}/{code}, for example &#39;Fund/Manager/Id&#39;. | [optional] |

### Return type

[**PagedResourceListOfFund**](PagedResourceListOfFund.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Funds. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listValuationPointOverview

> PagedResourceListOfValuationPointOverview listValuationPointOverview(scope, code, effectiveAt, asAt, page, limit, filter, propertyKeys, navTypeCode)

[EXPERIMENTAL] ListValuationPointOverview: List Valuation Points Overview for a given Fund.

List all the Valuation Points that match the given criteria for a given Fund.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the TimeVariant properties for the ValuationPoints. Defaults to the current LUSID   system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the ValuationPoints. Defaults to returning the latest version of each ValuationPoint if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing ValuationPoints; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results by.   For example, to filter on the NAV, specify \"NAV gt 300\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'DiaryEntry' domain to decorate onto each ValuationPoint.   These must take the format {domain}/{scope}/{code}, for example 'DiaryEntry/ValuationPoint/Id'.
        String navTypeCode = "navTypeCode_example"; // String | May be provided to view a specific NAV type. When not provided, Primary NAV will be used.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfValuationPointOverview result = apiInstance.listValuationPointOverview(scope, code, effectiveAt, asAt, page, limit, filter, propertyKeys, navTypeCode).execute(opts);

            PagedResourceListOfValuationPointOverview result = apiInstance.listValuationPointOverview(scope, code, effectiveAt, asAt, page, limit, filter, propertyKeys, navTypeCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#listValuationPointOverview");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the TimeVariant properties for the ValuationPoints. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the ValuationPoints. Defaults to returning the latest version of each ValuationPoint if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing ValuationPoints; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results by.   For example, to filter on the NAV, specify \&quot;NAV gt 300\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;DiaryEntry&#39; domain to decorate onto each ValuationPoint.   These must take the format {domain}/{scope}/{code}, for example &#39;DiaryEntry/ValuationPoint/Id&#39;. | [optional] |
| **navTypeCode** | **String**| May be provided to view a specific NAV type. When not provided, Primary NAV will be used. | [optional] |

### Return type

[**PagedResourceListOfValuationPointOverview**](PagedResourceListOfValuationPointOverview.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested ValuationPointOverview. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## patchFee

> Fee patchFee(scope, code, feeCode, operation)

[EXPERIMENTAL] PatchFee: Patch Fee.

Create or update certain fields for a particular Fee.  The behaviour is defined by the JSON Patch specification.    Currently supported fields are: EndDate, ShareClasses.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope this uniquely identifies the Fund.
        String feeCode = "feeCode_example"; // String | The code of the Fee.
        List<Operation> operation = Arrays.asList(); // List<Operation> | The json patch document. For more information see: https://datatracker.ietf.org/doc/html/rfc6902.
        try {
            // uncomment the below to set overrides at the request level
            // Fee result = apiInstance.patchFee(scope, code, feeCode, operation).execute(opts);

            Fee result = apiInstance.patchFee(scope, code, feeCode, operation).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#patchFee");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope this uniquely identifies the Fund. | |
| **feeCode** | **String**| The code of the Fee. | |
| **operation** | [**List&lt;Operation&gt;**](Operation.md)| The json patch document. For more information see: https://datatracker.ietf.org/doc/html/rfc6902. | |

### Return type

[**Fee**](Fee.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly patched Fee. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## patchFund

> Fund patchFund(scope, code, operation)

[EXPERIMENTAL] PatchFund: Patch a Fund.

Update fields on a Fund.  The behaviour is defined by the JSON Patch specification.    Currently supported fields are: DisplayName, Description, PortfolioIds, FundConfigurationId, ShareClassInstruments, Type, InceptionDate, DecimalPlaces, PrimaryNavType, AdditionalNavTypes, AborId, YearEndDate.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope this uniquely identifies the Fund.
        List<Operation> operation = Arrays.asList(); // List<Operation> | The json patch document. For more information see: https://datatracker.ietf.org/doc/html/rfc6902.
        try {
            // uncomment the below to set overrides at the request level
            // Fund result = apiInstance.patchFund(scope, code, operation).execute(opts);

            Fund result = apiInstance.patchFund(scope, code, operation).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#patchFund");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope this uniquely identifies the Fund. | |
| **operation** | [**List&lt;Operation&gt;**](Operation.md)| The json patch document. For more information see: https://datatracker.ietf.org/doc/html/rfc6902. | |

### Return type

[**Fund**](Fund.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated Fund. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setShareClassInstruments

> Fund setShareClassInstruments(scope, code, setShareClassInstrumentsRequest)

[EXPERIMENTAL] SetShareClassInstruments: Set the ShareClass Instruments on a fund.

Update the ShareClass Instruments on an existing fund with the set of instruments provided.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund.
        SetShareClassInstrumentsRequest setShareClassInstrumentsRequest = new SetShareClassInstrumentsRequest(); // SetShareClassInstrumentsRequest | The scopes and instrument identifiers for the instruments to be set.
        try {
            // uncomment the below to set overrides at the request level
            // Fund result = apiInstance.setShareClassInstruments(scope, code, setShareClassInstrumentsRequest).execute(opts);

            Fund result = apiInstance.setShareClassInstruments(scope, code, setShareClassInstrumentsRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#setShareClassInstruments");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. | |
| **setShareClassInstrumentsRequest** | [**SetShareClassInstrumentsRequest**](SetShareClassInstrumentsRequest.md)| The scopes and instrument identifiers for the instruments to be set. | |

### Return type

[**Fund**](Fund.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated fund. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertDiaryEntryTypeValuationPoint

> DiaryEntry upsertDiaryEntryTypeValuationPoint(scope, code, upsertValuationPointRequest, navTypeCode)

[EXPERIMENTAL] UpsertDiaryEntryTypeValuationPoint: Upsert Valuation Point.

Update or insert the estimate Valuation Point.     If the Valuation Point does not exist, this method will create it in estimate state.     If the Valuation Point already exists and is in estimate state, the Valuation Point will be updated with the newly specified information in this request.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope this uniquely identifies the Fund.
        UpsertValuationPointRequest upsertValuationPointRequest = new UpsertValuationPointRequest(); // UpsertValuationPointRequest | The Valuation Point Estimate definition to Upsert
        String navTypeCode = "navTypeCode_example"; // String | When provided, Upserts the Valuation Point against the specified NAV Type. When not provided the Primary NAV Type will be used.
        try {
            // uncomment the below to set overrides at the request level
            // DiaryEntry result = apiInstance.upsertDiaryEntryTypeValuationPoint(scope, code, upsertValuationPointRequest, navTypeCode).execute(opts);

            DiaryEntry result = apiInstance.upsertDiaryEntryTypeValuationPoint(scope, code, upsertValuationPointRequest, navTypeCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#upsertDiaryEntryTypeValuationPoint");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope this uniquely identifies the Fund. | |
| **upsertValuationPointRequest** | [**UpsertValuationPointRequest**](UpsertValuationPointRequest.md)| The Valuation Point Estimate definition to Upsert | |
| **navTypeCode** | **String**| When provided, Upserts the Valuation Point against the specified NAV Type. When not provided the Primary NAV Type will be used. | [optional] |

### Return type

[**DiaryEntry**](DiaryEntry.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated or inserted estimated Valuation Point |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertFeeProperties

> FeeProperties upsertFeeProperties(scope, code, feeCode, requestBody)

[EXPERIMENTAL] UpsertFeeProperties: Upsert Fee properties.

Update or insert one or more properties onto a single Fee. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;Fee&#39;.     Upserting a property that exists for an Fee, with a null value, will delete the instance of the property for that group.     Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund.
        String code = "code_example"; // String | The code of the Fund. Together with the scope this uniquely identifies the Fund.
        String feeCode = "feeCode_example"; // String | The code of the Fee to update or insert the properties onto.
        Map<String, Property> requestBody = new HashMap(); // Map<String, Property> | The properties to be updated or inserted onto the Fee. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \"Fee/Manager/Id\".
        try {
            // uncomment the below to set overrides at the request level
            // FeeProperties result = apiInstance.upsertFeeProperties(scope, code, feeCode, requestBody).execute(opts);

            FeeProperties result = apiInstance.upsertFeeProperties(scope, code, feeCode, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#upsertFeeProperties");
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
| **scope** | **String**| The scope of the Fund. | |
| **code** | **String**| The code of the Fund. Together with the scope this uniquely identifies the Fund. | |
| **feeCode** | **String**| The code of the Fee to update or insert the properties onto. | |
| **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be updated or inserted onto the Fee. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;Fee/Manager/Id\&quot;. | [optional] |

### Return type

[**FeeProperties**](FeeProperties.md)

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


## upsertFundProperties

> FundProperties upsertFundProperties(scope, code, requestBody)

[EXPERIMENTAL] UpsertFundProperties: Upsert Fund properties.

Update or insert one or more properties onto a single Fund. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;Fund&#39;.     Upserting a property that exists for an Fund, with a null value, will delete the instance of the property for that group.     Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundsApiExample {

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
        // FundsApi apiInstance = apiFactory.build(FundsApi.class);

        FundsApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundsApi.class);
        String scope = "scope_example"; // String | The scope of the Fund to update or insert the properties onto.
        String code = "code_example"; // String | The code of the Fund to update or insert the properties onto. Together with the scope this uniquely identifies the Fund.
        Map<String, Property> requestBody = new HashMap(); // Map<String, Property> | The properties to be updated or inserted onto the Fund. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \"Fund/Manager/Id\".
        try {
            // uncomment the below to set overrides at the request level
            // FundProperties result = apiInstance.upsertFundProperties(scope, code, requestBody).execute(opts);

            FundProperties result = apiInstance.upsertFundProperties(scope, code, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundsApi#upsertFundProperties");
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
| **scope** | **String**| The scope of the Fund to update or insert the properties onto. | |
| **code** | **String**| The code of the Fund to update or insert the properties onto. Together with the scope this uniquely identifies the Fund. | |
| **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be updated or inserted onto the Fund. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;Fund/Manager/Id\&quot;. | [optional] |

### Return type

[**FundProperties**](FundProperties.md)

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

