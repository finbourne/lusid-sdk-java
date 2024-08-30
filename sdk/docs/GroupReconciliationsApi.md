# GroupReconciliationsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createComparisonRuleset**](GroupReconciliationsApi.md#createComparisonRuleset) | **POST** /api/reconciliations/comparisonrulesets | [EXPERIMENTAL] CreateComparisonRuleset: Create a Group Reconciliation Comparison Ruleset |
| [**getComparisonRuleset**](GroupReconciliationsApi.md#getComparisonRuleset) | **GET** /api/reconciliations/comparisonrulesets/{scope}/{code} | [EXPERIMENTAL] GetComparisonRuleset: Get a single Group Reconciliation Comparison Ruleset by scope and code |



## createComparisonRuleset

> GroupReconciliationComparisonRuleset createComparisonRuleset(createGroupReconciliationComparisonRulesetRequest)

[EXPERIMENTAL] CreateComparisonRuleset: Create a Group Reconciliation Comparison Ruleset

Creates a set of core and aggregate rules to be run for a group reconciliation

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.GroupReconciliationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class GroupReconciliationsApiExample {

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
        // GroupReconciliationsApi apiInstance = apiFactory.build(GroupReconciliationsApi.class);

        GroupReconciliationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(GroupReconciliationsApi.class);
        CreateGroupReconciliationComparisonRulesetRequest createGroupReconciliationComparisonRulesetRequest = new CreateGroupReconciliationComparisonRulesetRequest(); // CreateGroupReconciliationComparisonRulesetRequest | The request containing the details of the ruleset
        try {
            // uncomment the below to set overrides at the request level
            // GroupReconciliationComparisonRuleset result = apiInstance.createComparisonRuleset(createGroupReconciliationComparisonRulesetRequest).execute(opts);

            GroupReconciliationComparisonRuleset result = apiInstance.createComparisonRuleset(createGroupReconciliationComparisonRulesetRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupReconciliationsApi#createComparisonRuleset");
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
| **createGroupReconciliationComparisonRulesetRequest** | [**CreateGroupReconciliationComparisonRulesetRequest**](CreateGroupReconciliationComparisonRulesetRequest.md)| The request containing the details of the ruleset | [optional] |

### Return type

[**GroupReconciliationComparisonRuleset**](GroupReconciliationComparisonRuleset.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created comparison ruleset |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getComparisonRuleset

> GroupReconciliationComparisonRuleset getComparisonRuleset(scope, code, asAt)

[EXPERIMENTAL] GetComparisonRuleset: Get a single Group Reconciliation Comparison Ruleset by scope and code

Retrieves one Group Reconciliation Comparison Ruleset by scope and code

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.GroupReconciliationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class GroupReconciliationsApiExample {

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
        // GroupReconciliationsApi apiInstance = apiFactory.build(GroupReconciliationsApi.class);

        GroupReconciliationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(GroupReconciliationsApi.class);
        String scope = "scope_example"; // String | The scope of the specified comparison ruleset.
        String code = "code_example"; // String | The code of the specified comparison ruleset. Together with the domain and scope this uniquely   identifies the reconciliation comparison ruleset.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the comparison ruleset definition. Defaults to return   the latest version of the definition if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // GroupReconciliationComparisonRuleset result = apiInstance.getComparisonRuleset(scope, code, asAt).execute(opts);

            GroupReconciliationComparisonRuleset result = apiInstance.getComparisonRuleset(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupReconciliationsApi#getComparisonRuleset");
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
| **scope** | **String**| The scope of the specified comparison ruleset. | |
| **code** | **String**| The code of the specified comparison ruleset. Together with the domain and scope this uniquely   identifies the reconciliation comparison ruleset. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the comparison ruleset definition. Defaults to return   the latest version of the definition if not specified. | [optional] |

### Return type

[**GroupReconciliationComparisonRuleset**](GroupReconciliationComparisonRuleset.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested comparison ruleset |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

