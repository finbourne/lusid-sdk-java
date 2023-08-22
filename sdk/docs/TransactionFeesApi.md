# TransactionFeesApi

All URIs are relative to *https://example.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTransactionFeeRule**](TransactionFeesApi.md#deleteTransactionFeeRule) | **DELETE** /api/transactions/fees/rules/{code} | [EXPERIMENTAL] DeleteTransactionFeeRule: Deletes a fee rule. |
| [**getApplicableTransactionFees**](TransactionFeesApi.md#getApplicableTransactionFees) | **POST** /api/transactions/fees/$GetApplicableFees | [EXPERIMENTAL] GetApplicableTransactionFees: Get the Fees and Commissions that may be applicable to a transaction. |
| [**getTransactionFeeRule**](TransactionFeesApi.md#getTransactionFeeRule) | **GET** /api/transactions/fees/rules/{code} | [EXPERIMENTAL] GetTransactionFeeRule: Retrieve the definition of single fee rule. |
| [**listTransactionFeeRules**](TransactionFeesApi.md#listTransactionFeeRules) | **GET** /api/transactions/fees/rules | [EXPERIMENTAL] ListTransactionFeeRules: List fee rules, with optional filtering. |
| [**upsertTransactionFeeRules**](TransactionFeesApi.md#upsertTransactionFeeRules) | **POST** /api/transactions/fees/rules | [EXPERIMENTAL] UpsertTransactionFeeRules: Upsert fee rules. |


<a id="deleteTransactionFeeRule"></a>
# **deleteTransactionFeeRule**
> DeletedEntityResponse deleteTransactionFeeRule(code)

[EXPERIMENTAL] DeleteTransactionFeeRule: Deletes a fee rule.

&lt;br&gt;              Deletes the rule for all effective time.                &lt;br&gt;              The rule will remain viewable at previous as at times, but it will no longer be considered by              GetApplicableFees.                &lt;br&gt;              This cannot be undone.              

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionFeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionFeesApi apiInstance = new TransactionFeesApi(defaultClient);
    String code = "code_example"; // String | The fee rule code.
    try {
      DeletedEntityResponse result = apiInstance.deleteTransactionFeeRule(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionFeesApi#deleteTransactionFeeRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
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

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getApplicableTransactionFees"></a>
# **getApplicableTransactionFees**
> ResourceListOfFeeRule getApplicableTransactionFees(effectiveAt, asAt, instrumentIdentifierType, instrumentIdentifier, portfolioScope, portfolioCode, requestBody)

[EXPERIMENTAL] GetApplicableTransactionFees: Get the Fees and Commissions that may be applicable to a transaction.

Additionally, matching can be based on the instrument&#39;s properties, its portfolio properties, and any additional property keys present in the data file.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionFeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionFeesApi apiInstance = new TransactionFeesApi(defaultClient);
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to match rule definitions. Defaults to the current LUSID  system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to match rule definitions. Defaults to returning the latest version if not  specified.
    String instrumentIdentifierType = "instrumentIdentifierType_example"; // String | Optional. The unique identifier type to use, eg 'Figi' or 'LusidInstrumentId'.
    String instrumentIdentifier = "instrumentIdentifier_example"; // String | Optional. The Instrument Identifier to get properties for.
    String portfolioScope = "portfolioScope_example"; // String | Optional. The scope of the portfolio to fetch properties from.
    String portfolioCode = "portfolioCode_example"; // String | Optional. The code of the portfolio to fetch properties from.
    Map<String, String> requestBody = {"SettlementCurrency":"GBP","Country":"UK","Instrument/default/HeadOffice":"London"}; // Map<String, String> | Any other property keys or fields, including the top-level fields of the              fee rule (e.g. \"ExecutionBroker\" and \"SettlementCurrency\" ) and those defined in AdditionalKeys, along with              their corresponding values that should be matched for fees. Eg. \"Instrument/default/Name=exampleValue\" or              \"AdditionalKey2=Value2\".
    try {
      ResourceListOfFeeRule result = apiInstance.getApplicableTransactionFees(effectiveAt, asAt, instrumentIdentifierType, instrumentIdentifier, portfolioScope, portfolioCode, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionFeesApi#getApplicableTransactionFees");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
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
| **requestBody** | [**Map&lt;String, String&gt;**](String.md)| Any other property keys or fields, including the top-level fields of the              fee rule (e.g. \&quot;ExecutionBroker\&quot; and \&quot;SettlementCurrency\&quot; ) and those defined in AdditionalKeys, along with              their corresponding values that should be matched for fees. Eg. \&quot;Instrument/default/Name&#x3D;exampleValue\&quot; or              \&quot;AdditionalKey2&#x3D;Value2\&quot;. | [optional] |

### Return type

[**ResourceListOfFeeRule**](ResourceListOfFeeRule.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of applicable fee rules. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getTransactionFeeRule"></a>
# **getTransactionFeeRule**
> FeeRule getTransactionFeeRule(code, effectiveAt, asAt)

[EXPERIMENTAL] GetTransactionFeeRule: Retrieve the definition of single fee rule.

Retrieves the fee rule definition at the given effective and as at times.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionFeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionFeesApi apiInstance = new TransactionFeesApi(defaultClient);
    String code = "code_example"; // String | The fee rule code.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the rule definition. Defaults to the current LUSID  system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the rule definition. Defaults to returning the latest version if not  specified.
    try {
      FeeRule result = apiInstance.getTransactionFeeRule(code, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionFeesApi#getTransactionFeeRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
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

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of one fee rule. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listTransactionFeeRules"></a>
# **listTransactionFeeRules**
> ResourceListOfFeeRule listTransactionFeeRules(effectiveAt, asAt, limit, filter, page)

[EXPERIMENTAL] ListTransactionFeeRules: List fee rules, with optional filtering.

For more information about filtering results,  see https://support.lusid.com/knowledgebase/article/KA-01914.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionFeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionFeesApi apiInstance = new TransactionFeesApi(defaultClient);
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the rule definitions. Defaults to the current LUSID  system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the rule definitions. Defaults to returning the latest version if not  specified.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.
    String page = "page_example"; // String | The pagination token to use to continue listing entities; this value is returned from the previous call. If  a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the  original request.
    try {
      ResourceListOfFeeRule result = apiInstance.listTransactionFeeRules(effectiveAt, asAt, limit, filter, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionFeesApi#listTransactionFeeRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
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

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A filtered list of fee rules available. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertTransactionFeeRules"></a>
# **upsertTransactionFeeRules**
> FeeRuleUpsertResponse upsertTransactionFeeRules(requestBody, effectiveAt)

[EXPERIMENTAL] UpsertTransactionFeeRules: Upsert fee rules.

&lt;br&gt;              To upsert a new rule, the code field must be left empty, a code will then be assigned and returned as part              of the response. To update an existing rule, include the fee code. It is possible to both create and update              fee rules in the same request.                &lt;br&gt;              The upsert is transactional - either all create/update operations will succeed or none of them will.              

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionFeesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionFeesApi apiInstance = new TransactionFeesApi(defaultClient);
    Map<String, FeeRuleUpsertRequest> requestBody = new HashMap(); // Map<String, FeeRuleUpsertRequest> | A dictionary of upsert request identifiers to rule upsert requests. The request              identifiers are valid for the request only and can be used to link the upserted fee rule to the code of a              created fee rule.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the rule will take effect. Defaults to the current LUSID  system datetime if not specified. In the case of an update, the changes will take place from this effective  time until the next effective time that the rule as been upserted at. For example, consider a rule that  already exists, and has previously had an update applied so that the definition will change on the first day  of the coming month. An upsert effective from the current day will only change the definition until the  first day of the coming month. An additional upsert at the same time (first day of the month) is required  if the newly-updated definition is to supersede the future definition.
    try {
      FeeRuleUpsertResponse result = apiInstance.upsertTransactionFeeRules(requestBody, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionFeesApi#upsertTransactionFeeRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**Map&lt;String, FeeRuleUpsertRequest&gt;**](FeeRuleUpsertRequest.md)| A dictionary of upsert request identifiers to rule upsert requests. The request              identifiers are valid for the request only and can be used to link the upserted fee rule to the code of a              created fee rule. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which the rule will take effect. Defaults to the current LUSID  system datetime if not specified. In the case of an update, the changes will take place from this effective  time until the next effective time that the rule as been upserted at. For example, consider a rule that  already exists, and has previously had an update applied so that the definition will change on the first day  of the coming month. An upsert effective from the current day will only change the definition until the  first day of the coming month. An additional upsert at the same time (first day of the month) is required  if the newly-updated definition is to supersede the future definition. | [optional] |

### Return type

[**FeeRuleUpsertResponse**](FeeRuleUpsertResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upsert fee rules. New fee rules must have an empty code field. Where a code is given, this rule must already exist and will be updated. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

