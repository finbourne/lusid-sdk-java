# TransactionFeesApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTransactionFeeRule**](TransactionFeesApi.md#deleteTransactionFeeRule) | **DELETE** /api/transactions/fees/rules/{code} | DeleteTransactionFeeRule: Deletes a fee rule. |
| [**getApplicableTransactionFees**](TransactionFeesApi.md#getApplicableTransactionFees) | **POST** /api/transactions/fees/$GetApplicableFees | GetApplicableTransactionFees: Get the Fees and Commissions that may be applicable to a transaction. |
| [**getTransactionFeeRule**](TransactionFeesApi.md#getTransactionFeeRule) | **GET** /api/transactions/fees/rules/{code} | GetTransactionFeeRule: Retrieve the definition of single fee rule. |
| [**listTransactionFeeRules**](TransactionFeesApi.md#listTransactionFeeRules) | **GET** /api/transactions/fees/rules | ListTransactionFeeRules: List fee rules, with optional filtering. |
| [**upsertTransactionFeeRules**](TransactionFeesApi.md#upsertTransactionFeeRules) | **POST** /api/transactions/fees/rules | UpsertTransactionFeeRules: Upsert fee rules. |



## deleteTransactionFeeRule

> DeletedEntityResponse deleteTransactionFeeRule(code)

DeleteTransactionFeeRule: Deletes a fee rule.

Deletes the rule for all effective time.    The rule will remain viewable at previous as at times, but it will no longer be considered by  GetApplicableFees.    This cannot be undone.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionFeesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionFeesApiExample {

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
        // TransactionFeesApi apiInstance = apiFactory.build(TransactionFeesApi.class);

        TransactionFeesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionFeesApi.class);
        String code = "code_example"; // String | The fee rule code.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteTransactionFeeRule(code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteTransactionFeeRule(code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionFeesApi#deleteTransactionFeeRule");
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
| **code** | **String**| The fee rule code. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getApplicableTransactionFees

> ResourceListOfFeeRule getApplicableTransactionFees(effectiveAt, asAt, instrumentIdentifierType, instrumentIdentifier, portfolioScope, portfolioCode, requestBody)

GetApplicableTransactionFees: Get the Fees and Commissions that may be applicable to a transaction.

Additionally, matching can be based on the instrument&#39;s properties, its portfolio properties, and any additional property keys present in the data file.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionFeesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionFeesApiExample {

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
        // TransactionFeesApi apiInstance = apiFactory.build(TransactionFeesApi.class);

        TransactionFeesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionFeesApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to match rule definitions. Defaults to the current LUSID  system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to match rule definitions. Defaults to returning the latest version if not  specified.
        String instrumentIdentifierType = "instrumentIdentifierType_example"; // String | Optional. The unique identifier type to use, eg 'Figi' or 'LusidInstrumentId'.
        String instrumentIdentifier = "instrumentIdentifier_example"; // String | Optional. The Instrument Identifier to get properties for.
        String portfolioScope = "portfolioScope_example"; // String | Optional. The scope of the portfolio to fetch properties from.
        String portfolioCode = "portfolioCode_example"; // String | Optional. The code of the portfolio to fetch properties from.
        Map<String, String> requestBody = {"SettlementCurrency":"GBP","Country":"UK","Instrument/default/HeadOffice":"London"}; // Map<String, String> | Any other property keys or fields, including the top-level fields of the   fee rule (e.g. \"ExecutionBroker\" and \"SettlementCurrency\" ) and those defined in AdditionalKeys, along with   their corresponding values that should be matched for fees. Eg. \"Instrument/default/Name=exampleValue\" or   \"AdditionalKey2=Value2\".
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfFeeRule result = apiInstance.getApplicableTransactionFees(effectiveAt, asAt, instrumentIdentifierType, instrumentIdentifier, portfolioScope, portfolioCode, requestBody).execute(opts);

            ResourceListOfFeeRule result = apiInstance.getApplicableTransactionFees(effectiveAt, asAt, instrumentIdentifierType, instrumentIdentifier, portfolioScope, portfolioCode, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionFeesApi#getApplicableTransactionFees");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to match rule definitions. Defaults to the current LUSID  system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to match rule definitions. Defaults to returning the latest version if not  specified. | [optional] |
| **instrumentIdentifierType** | **String**| Optional. The unique identifier type to use, eg &#39;Figi&#39; or &#39;LusidInstrumentId&#39;. | [optional] |
| **instrumentIdentifier** | **String**| Optional. The Instrument Identifier to get properties for. | [optional] |
| **portfolioScope** | **String**| Optional. The scope of the portfolio to fetch properties from. | [optional] |
| **portfolioCode** | **String**| Optional. The code of the portfolio to fetch properties from. | [optional] |
| **requestBody** | [**Map&lt;String, String&gt;**](String.md)| Any other property keys or fields, including the top-level fields of the   fee rule (e.g. \&quot;ExecutionBroker\&quot; and \&quot;SettlementCurrency\&quot; ) and those defined in AdditionalKeys, along with   their corresponding values that should be matched for fees. Eg. \&quot;Instrument/default/Name&#x3D;exampleValue\&quot; or   \&quot;AdditionalKey2&#x3D;Value2\&quot;. | [optional] |

### Return type

[**ResourceListOfFeeRule**](ResourceListOfFeeRule.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of applicable fee rules. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTransactionFeeRule

> FeeRule getTransactionFeeRule(code, effectiveAt, asAt)

GetTransactionFeeRule: Retrieve the definition of single fee rule.

Retrieves the fee rule definition at the given effective and as at times.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionFeesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionFeesApiExample {

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
        // TransactionFeesApi apiInstance = apiFactory.build(TransactionFeesApi.class);

        TransactionFeesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionFeesApi.class);
        String code = "code_example"; // String | The fee rule code.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the rule definition. Defaults to the current LUSID  system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the rule definition. Defaults to returning the latest version if not  specified.
        try {
            // uncomment the below to set overrides at the request level
            // FeeRule result = apiInstance.getTransactionFeeRule(code, effectiveAt, asAt).execute(opts);

            FeeRule result = apiInstance.getTransactionFeeRule(code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionFeesApi#getTransactionFeeRule");
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
| **code** | **String**| The fee rule code. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the rule definition. Defaults to the current LUSID  system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the rule definition. Defaults to returning the latest version if not  specified. | [optional] |

### Return type

[**FeeRule**](FeeRule.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of one fee rule. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listTransactionFeeRules

> ResourceListOfFeeRule listTransactionFeeRules(effectiveAt, asAt, limit, filter, page)

ListTransactionFeeRules: List fee rules, with optional filtering.

For more information about filtering results,  see https://support.lusid.com/knowledgebase/article/KA-01914.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionFeesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionFeesApiExample {

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
        // TransactionFeesApi apiInstance = apiFactory.build(TransactionFeesApi.class);

        TransactionFeesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionFeesApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the rule definitions. Defaults to the current LUSID  system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the rule definitions. Defaults to returning the latest version if not  specified.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.
        String page = "page_example"; // String | The pagination token to use to continue listing entities; this value is returned from the previous call. If  a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the  original request.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfFeeRule result = apiInstance.listTransactionFeeRules(effectiveAt, asAt, limit, filter, page).execute(opts);

            ResourceListOfFeeRule result = apiInstance.listTransactionFeeRules(effectiveAt, asAt, limit, filter, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionFeesApi#listTransactionFeeRules");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the rule definitions. Defaults to the current LUSID  system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the rule definitions. Defaults to returning the latest version if not  specified. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. | [optional] |
| **page** | **String**| The pagination token to use to continue listing entities; this value is returned from the previous call. If  a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the  original request. | [optional] |

### Return type

[**ResourceListOfFeeRule**](ResourceListOfFeeRule.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A filtered list of fee rules available. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertTransactionFeeRules

> FeeRuleUpsertResponse upsertTransactionFeeRules(requestBody, effectiveAt)

UpsertTransactionFeeRules: Upsert fee rules.

To upsert a new rule, the code field must be left empty, a code will then be assigned and returned as part  of the response. To update an existing rule, include the fee code. It is possible to both create and update  fee rules in the same request.    The upsert is transactional - either all create/update operations will succeed or none of them will.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransactionFeesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransactionFeesApiExample {

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
        // TransactionFeesApi apiInstance = apiFactory.build(TransactionFeesApi.class);

        TransactionFeesApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransactionFeesApi.class);
        Map<String, FeeRuleUpsertRequest> requestBody = new HashMap(); // Map<String, FeeRuleUpsertRequest> | A dictionary of upsert request identifiers to rule upsert requests. The request   identifiers are valid for the request only and can be used to link the upserted fee rule to the code of a   created fee rule.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the rule will take effect. Defaults to the current LUSID  system datetime if not specified. In the case of an update, the changes will take place from this effective  time until the next effective time that the rule as been upserted at. For example, consider a rule that  already exists, and has previously had an update applied so that the definition will change on the first day  of the coming month. An upsert effective from the current day will only change the definition until the  first day of the coming month. An additional upsert at the same time (first day of the month) is required  if the newly-updated definition is to supersede the future definition.
        try {
            // uncomment the below to set overrides at the request level
            // FeeRuleUpsertResponse result = apiInstance.upsertTransactionFeeRules(requestBody, effectiveAt).execute(opts);

            FeeRuleUpsertResponse result = apiInstance.upsertTransactionFeeRules(requestBody, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionFeesApi#upsertTransactionFeeRules");
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
| **requestBody** | [**Map&lt;String, FeeRuleUpsertRequest&gt;**](FeeRuleUpsertRequest.md)| A dictionary of upsert request identifiers to rule upsert requests. The request   identifiers are valid for the request only and can be used to link the upserted fee rule to the code of a   created fee rule. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which the rule will take effect. Defaults to the current LUSID  system datetime if not specified. In the case of an update, the changes will take place from this effective  time until the next effective time that the rule as been upserted at. For example, consider a rule that  already exists, and has previously had an update applied so that the definition will change on the first day  of the coming month. An upsert effective from the current day will only change the definition until the  first day of the coming month. An additional upsert at the same time (first day of the month) is required  if the newly-updated definition is to supersede the future definition. | [optional] |

### Return type

[**FeeRuleUpsertResponse**](FeeRuleUpsertResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upsert fee rules. New fee rules must have an empty code field. Where a code is given, this rule must already exist and will be updated. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

