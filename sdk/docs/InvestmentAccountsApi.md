# InvestmentAccountsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInvestmentAccount**](InvestmentAccountsApi.md#getInvestmentAccount) | **GET** /api/investmentaccounts/{idTypeScope}/{idTypeCode}/{code} | [EARLY ACCESS] GetInvestmentAccount: Get Investment Account |
| [**upsertInvestmentAccounts**](InvestmentAccountsApi.md#upsertInvestmentAccounts) | **POST** /api/investmentaccounts/$batchUpsert | [EARLY ACCESS] UpsertInvestmentAccounts: Upsert Investment Accounts |



## getInvestmentAccount

> InvestmentAccount getInvestmentAccount(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds)

[EARLY ACCESS] GetInvestmentAccount: Get Investment Account

Retrieve the definition of an investment account.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InvestmentAccountsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InvestmentAccountsApiExample {

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
        // InvestmentAccountsApi apiInstance = apiFactory.build(InvestmentAccountsApi.class);

        InvestmentAccountsApi apiInstance = ApiFactoryBuilder.build(fileName).build(InvestmentAccountsApi.class);
        String idTypeScope = "idTypeScope_example"; // String | Scope of the investment account identifier type.
        String idTypeCode = "idTypeCode_example"; // String | Code of the investment account identifier type.
        String code = "code_example"; // String | Code of the investment account under specified identifier type's scope and code. This together with stated identifier type uniquely   identifies the investment account.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys or identifier types (as property keys) from the \"InvestmentAccount\" domain   to include for found investment account, or from any domain that supports relationships to decorate onto related entities.   These take the format {domain}/{scope}/{code} e.g. \"InvestmentAccount/ContactDetails/Address\".
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the investment account. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the investment account. Defaults to return the latest version of the investment account if not specified.
        List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto the investment account in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
        try {
            // uncomment the below to set overrides at the request level
            // InvestmentAccount result = apiInstance.getInvestmentAccount(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds).execute(opts);

            InvestmentAccount result = apiInstance.getInvestmentAccount(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentAccountsApi#getInvestmentAccount");
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
| **idTypeScope** | **String**| Scope of the investment account identifier type. | |
| **idTypeCode** | **String**| Code of the investment account identifier type. | |
| **code** | **String**| Code of the investment account under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely   identifies the investment account. | |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys or identifier types (as property keys) from the \&quot;InvestmentAccount\&quot; domain   to include for found investment account, or from any domain that supports relationships to decorate onto related entities.   These take the format {domain}/{scope}/{code} e.g. \&quot;InvestmentAccount/ContactDetails/Address\&quot;. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the investment account. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the investment account. Defaults to return the latest version of the investment account if not specified. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto the investment account in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**InvestmentAccount**](InvestmentAccount.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested investment account |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertInvestmentAccounts

> UpsertInvestmentAccountsResponse upsertInvestmentAccounts(successMode, requestBody)

[EARLY ACCESS] UpsertInvestmentAccounts: Upsert Investment Accounts

Creates or updates a collection of Investment Accounts

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InvestmentAccountsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InvestmentAccountsApiExample {

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
        // InvestmentAccountsApi apiInstance = apiFactory.build(InvestmentAccountsApi.class);

        InvestmentAccountsApi apiInstance = ApiFactoryBuilder.build(fileName).build(InvestmentAccountsApi.class);
        String successMode = "successMode_example"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial
        Map<String, UpsertInvestmentAccountRequest> requestBody = new HashMap(); // Map<String, UpsertInvestmentAccountRequest> | A collection of requests to create or update Investment Accounts.
        try {
            // uncomment the below to set overrides at the request level
            // UpsertInvestmentAccountsResponse result = apiInstance.upsertInvestmentAccounts(successMode, requestBody).execute(opts);

            UpsertInvestmentAccountsResponse result = apiInstance.upsertInvestmentAccounts(successMode, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestmentAccountsApi#upsertInvestmentAccounts");
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
| **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial | |
| **requestBody** | [**Map&lt;String, UpsertInvestmentAccountRequest&gt;**](UpsertInvestmentAccountRequest.md)| A collection of requests to create or update Investment Accounts. | |

### Return type

[**UpsertInvestmentAccountsResponse**](UpsertInvestmentAccountsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The successfully created or updated Investment Accounts along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

