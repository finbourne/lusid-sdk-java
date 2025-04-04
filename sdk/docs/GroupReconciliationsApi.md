# GroupReconciliationsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchUpdateComparisonResults**](GroupReconciliationsApi.md#batchUpdateComparisonResults) | **POST** /api/reconciliations/groupreconciliationdefinitions/{scope}/{code}/comparisonresults/$batchReview | [EXPERIMENTAL] BatchUpdateComparisonResults: Add User Review entries for a range of comparison results related to a specific GroupReconciliationDefinition. |
| [**createComparisonRuleset**](GroupReconciliationsApi.md#createComparisonRuleset) | **POST** /api/reconciliations/comparisonrulesets | [EXPERIMENTAL] CreateComparisonRuleset: Create a Group Reconciliation Comparison Ruleset |
| [**createGroupReconciliationDefinition**](GroupReconciliationsApi.md#createGroupReconciliationDefinition) | **POST** /api/reconciliations/groupreconciliationdefinitions | [EXPERIMENTAL] CreateGroupReconciliationDefinition: Create Group Reconciliation Definition |
| [**deleteComparisonRuleset**](GroupReconciliationsApi.md#deleteComparisonRuleset) | **DELETE** /api/reconciliations/comparisonrulesets/{scope}/{code} | [EXPERIMENTAL] DeleteComparisonRuleset: Deletes a particular Group Reconciliation Comparison Ruleset |
| [**deleteGroupReconciliationDefinition**](GroupReconciliationsApi.md#deleteGroupReconciliationDefinition) | **DELETE** /api/reconciliations/groupreconciliationdefinitions/{scope}/{code} | [EXPERIMENTAL] DeleteGroupReconciliationDefinition: Delete Group Reconciliation Definition |
| [**getComparisonResult**](GroupReconciliationsApi.md#getComparisonResult) | **GET** /api/reconciliations/groupreconciliationdefinitions/{scope}/{code}/{resultId} | [EXPERIMENTAL] GetComparisonResult: Get a single Group Reconciliation Comparison Result by scope and code. |
| [**getComparisonRuleset**](GroupReconciliationsApi.md#getComparisonRuleset) | **GET** /api/reconciliations/comparisonrulesets/{scope}/{code} | [EXPERIMENTAL] GetComparisonRuleset: Get a single Group Reconciliation Comparison Ruleset by scope and code. |
| [**getGroupReconciliationDefinition**](GroupReconciliationsApi.md#getGroupReconciliationDefinition) | **GET** /api/reconciliations/groupreconciliationdefinitions/{scope}/{code} | [EXPERIMENTAL] GetGroupReconciliationDefinition: Get group reconciliation definition |
| [**listComparisonResults**](GroupReconciliationsApi.md#listComparisonResults) | **GET** /api/reconciliations/comparisonresults | [EXPERIMENTAL] ListComparisonResults: Get a set of Group Reconciliation Comparison Results. |
| [**listComparisonRulesets**](GroupReconciliationsApi.md#listComparisonRulesets) | **GET** /api/reconciliations/comparisonrulesets | [EXPERIMENTAL] ListComparisonRulesets: Get a set of Group Reconciliation Comparison Rulesets |
| [**listGroupReconciliationDefinitions**](GroupReconciliationsApi.md#listGroupReconciliationDefinitions) | **GET** /api/reconciliations/groupreconciliationdefinitions | [EXPERIMENTAL] ListGroupReconciliationDefinitions: List group reconciliation definitions |
| [**runReconciliation**](GroupReconciliationsApi.md#runReconciliation) | **POST** /api/reconciliations/groupreconciliationdefinitions/{scope}/{code}/$run | [EXPERIMENTAL] RunReconciliation: Runs a Group Reconciliation |
| [**updateComparisonRuleset**](GroupReconciliationsApi.md#updateComparisonRuleset) | **PUT** /api/reconciliations/comparisonrulesets/{scope}/{code} | [EXPERIMENTAL] UpdateComparisonRuleset: Update Group Reconciliation Comparison Ruleset defined by scope and code |
| [**updateGroupReconciliationDefinition**](GroupReconciliationsApi.md#updateGroupReconciliationDefinition) | **PUT** /api/reconciliations/groupreconciliationdefinitions/{scope}/{code} | [EXPERIMENTAL] UpdateGroupReconciliationDefinition: Update group reconciliation definition |



## batchUpdateComparisonResults

> BatchUpdateUserReviewForComparisonResultResponse batchUpdateComparisonResults(scope, code, batchUpdateUserReviewForComparisonResultRequest, successMode)

[EXPERIMENTAL] BatchUpdateComparisonResults: Add User Review entries for a range of comparison results related to a specific GroupReconciliationDefinition.

Allows to update multiple Group Reconciliation Comparison Results related to the same definition specified by the Finbourne.Identifiers.Abstractions.Scope and Finbourne.Identifiers.Abstractions.Code.  Updates User Review with new entries and sets the relevant Review Status.  Supports partial success when all the entries that haven&#39;t passed validation or are not related to the definition will be returned with respectful error details.

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
        String scope = "scope_example"; // String | Shared Scope of the GroupReconciliationDefinition and GroupReconciliationComparisonResults.
        String code = "code_example"; // String | GroupReconciliationDefinitionId code.
        List<BatchUpdateUserReviewForComparisonResultRequest> batchUpdateUserReviewForComparisonResultRequest = Arrays.asList(); // List<BatchUpdateUserReviewForComparisonResultRequest> | A collection of the comparison result Ids and their user review entries to be added or removed.   Single request contains resultId, break code/match key/comment to add and break code/match key/comment to remove by added timestamp.
        String successMode = "Partial"; // String | Defines whether the request should fail if at least one of the entries is failed to update   or process all the entries regardless and return collections of successful and failed updates. \"Partial\" (default) | \"Atomic\".
        try {
            // uncomment the below to set overrides at the request level
            // BatchUpdateUserReviewForComparisonResultResponse result = apiInstance.batchUpdateComparisonResults(scope, code, batchUpdateUserReviewForComparisonResultRequest, successMode).execute(opts);

            BatchUpdateUserReviewForComparisonResultResponse result = apiInstance.batchUpdateComparisonResults(scope, code, batchUpdateUserReviewForComparisonResultRequest, successMode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupReconciliationsApi#batchUpdateComparisonResults");
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
| **scope** | **String**| Shared Scope of the GroupReconciliationDefinition and GroupReconciliationComparisonResults. | |
| **code** | **String**| GroupReconciliationDefinitionId code. | |
| **batchUpdateUserReviewForComparisonResultRequest** | [**List&lt;BatchUpdateUserReviewForComparisonResultRequest&gt;**](BatchUpdateUserReviewForComparisonResultRequest.md)| A collection of the comparison result Ids and their user review entries to be added or removed.   Single request contains resultId, break code/match key/comment to add and break code/match key/comment to remove by added timestamp. | |
| **successMode** | **String**| Defines whether the request should fail if at least one of the entries is failed to update   or process all the entries regardless and return collections of successful and failed updates. \&quot;Partial\&quot; (default) | \&quot;Atomic\&quot;. | [optional] [default to Partial] |

### Return type

[**BatchUpdateUserReviewForComparisonResultResponse**](BatchUpdateUserReviewForComparisonResultResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The collections of comparison result Ids that succeeded or failed to update along with the updated entities or error details. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


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


## createGroupReconciliationDefinition

> GroupReconciliationDefinition createGroupReconciliationDefinition(createGroupReconciliationDefinitionRequest)

[EXPERIMENTAL] CreateGroupReconciliationDefinition: Create Group Reconciliation Definition

Creates a Group Reconciliation Definition

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
        CreateGroupReconciliationDefinitionRequest createGroupReconciliationDefinitionRequest = new CreateGroupReconciliationDefinitionRequest(); // CreateGroupReconciliationDefinitionRequest | The definition Group Reconciliation Definition details
        try {
            // uncomment the below to set overrides at the request level
            // GroupReconciliationDefinition result = apiInstance.createGroupReconciliationDefinition(createGroupReconciliationDefinitionRequest).execute(opts);

            GroupReconciliationDefinition result = apiInstance.createGroupReconciliationDefinition(createGroupReconciliationDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupReconciliationsApi#createGroupReconciliationDefinition");
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
| **createGroupReconciliationDefinitionRequest** | [**CreateGroupReconciliationDefinitionRequest**](CreateGroupReconciliationDefinitionRequest.md)| The definition Group Reconciliation Definition details | [optional] |

### Return type

[**GroupReconciliationDefinition**](GroupReconciliationDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Group Reconciliation Definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteComparisonRuleset

> DeletedEntityResponse deleteComparisonRuleset(scope, code)

[EXPERIMENTAL] DeleteComparisonRuleset: Deletes a particular Group Reconciliation Comparison Ruleset

The deletion will take effect from the reconciliation comparison ruleset deletion datetime.  i.e. will no longer exist at any asAt datetime after the asAt datetime of deletion.

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
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteComparisonRuleset(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteComparisonRuleset(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupReconciliationsApi#deleteComparisonRuleset");
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

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The deleted entity metadata |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteGroupReconciliationDefinition

> DeletedEntityResponse deleteGroupReconciliationDefinition(scope, code)

[EXPERIMENTAL] DeleteGroupReconciliationDefinition: Delete Group Reconciliation Definition

Delete the group reconciliation definition.

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
        String scope = "scope_example"; // String | The scope of the group reconciliation definition to delete.
        String code = "code_example"; // String | The code of the group reconciliation definition to delete. Together with the scope this uniquely identifies the group reconciliation definition to delete.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteGroupReconciliationDefinition(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteGroupReconciliationDefinition(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupReconciliationsApi#deleteGroupReconciliationDefinition");
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
| **scope** | **String**| The scope of the group reconciliation definition to delete. | |
| **code** | **String**| The code of the group reconciliation definition to delete. Together with the scope this uniquely identifies the group reconciliation definition to delete. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the group reconciliation definition was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getComparisonResult

> GroupReconciliationComparisonResult getComparisonResult(scope, code, resultId, asAt)

[EXPERIMENTAL] GetComparisonResult: Get a single Group Reconciliation Comparison Result by scope and code.

Retrieves one Group Reconciliation Comparison Result by scope and code  with the prior validation that its related reconciliation definition exists.

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
        String scope = "scope_example"; // String | The scope of the specified comparison result and its related reconciliation definition.
        String code = "code_example"; // String | The code of the reconciliation definition that was used to produce the reconciliation result.
        String resultId = "resultId_example"; // String | The code of the specified reconciliation result. Together with the domain and scope this uniquely   identifies the reconciliation comparison result. This value is also the same as the computed result hash based on property values.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the comparison result definition. Defaults to return   the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // GroupReconciliationComparisonResult result = apiInstance.getComparisonResult(scope, code, resultId, asAt).execute(opts);

            GroupReconciliationComparisonResult result = apiInstance.getComparisonResult(scope, code, resultId, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupReconciliationsApi#getComparisonResult");
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
| **scope** | **String**| The scope of the specified comparison result and its related reconciliation definition. | |
| **code** | **String**| The code of the reconciliation definition that was used to produce the reconciliation result. | |
| **resultId** | **String**| The code of the specified reconciliation result. Together with the domain and scope this uniquely   identifies the reconciliation comparison result. This value is also the same as the computed result hash based on property values. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the comparison result definition. Defaults to return   the latest version if not specified. | [optional] |

### Return type

[**GroupReconciliationComparisonResult**](GroupReconciliationComparisonResult.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested comparison result |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getComparisonRuleset

> GroupReconciliationComparisonRuleset getComparisonRuleset(scope, code, asAt)

[EXPERIMENTAL] GetComparisonRuleset: Get a single Group Reconciliation Comparison Ruleset by scope and code.

Retrieves one Group Reconciliation Comparison Ruleset by scope and code.

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


## getGroupReconciliationDefinition

> GroupReconciliationDefinition getGroupReconciliationDefinition(scope, code, effectiveAt, asAt)

[EXPERIMENTAL] GetGroupReconciliationDefinition: Get group reconciliation definition

Retrieves a Group Reconciliation Definition by scope and code

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
        String scope = "scope_example"; // String | The scope of the group reconciliation definition to retrieve.
        String code = "code_example"; // String | The code of the group reconciliation definition to retrieve. Together with the scope   this uniquely identifies the group reconciliation definition.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the group reconciliation definition. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the group reconciliation definition. Defaults to return the latest version of the portfolio group definition if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // GroupReconciliationDefinition result = apiInstance.getGroupReconciliationDefinition(scope, code, effectiveAt, asAt).execute(opts);

            GroupReconciliationDefinition result = apiInstance.getGroupReconciliationDefinition(scope, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupReconciliationsApi#getGroupReconciliationDefinition");
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
| **scope** | **String**| The scope of the group reconciliation definition to retrieve. | |
| **code** | **String**| The code of the group reconciliation definition to retrieve. Together with the scope   this uniquely identifies the group reconciliation definition. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the group reconciliation definition. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the group reconciliation definition. Defaults to return the latest version of the portfolio group definition if not specified. | [optional] |

### Return type

[**GroupReconciliationDefinition**](GroupReconciliationDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested group reconciliation definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listComparisonResults

> PagedResourceListOfGroupReconciliationComparisonResult listComparisonResults(asAt, page, sortBy, limit, filter)

[EXPERIMENTAL] ListComparisonResults: Get a set of Group Reconciliation Comparison Results.

Retrieves all Group Reconciliation Comparison Results that fit the filter, in a specific order if sortBy is provided.  Supports pagination.

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
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the comparison results. Defaults to return the latest   version of the comparison results if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing comparison results from a previous call to list   comparison results. This value is returned from the previous call. If a pagination token is provided the sortBy,   filter, effectiveAt, and asAt fields must not have changed since the original request.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many per page.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfGroupReconciliationComparisonResult result = apiInstance.listComparisonResults(asAt, page, sortBy, limit, filter).execute(opts);

            PagedResourceListOfGroupReconciliationComparisonResult result = apiInstance.listComparisonResults(asAt, page, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupReconciliationsApi#listComparisonResults");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the comparison results. Defaults to return the latest   version of the comparison results if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing comparison results from a previous call to list   comparison results. This value is returned from the previous call. If a pagination token is provided the sortBy,   filter, effectiveAt, and asAt fields must not have changed since the original request. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many per page. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfGroupReconciliationComparisonResult**](PagedResourceListOfGroupReconciliationComparisonResult.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested list of comparison results |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listComparisonRulesets

> PagedResourceListOfGroupReconciliationComparisonRuleset listComparisonRulesets(asAt, page, sortBy, limit, filter)

[EXPERIMENTAL] ListComparisonRulesets: Get a set of Group Reconciliation Comparison Rulesets

Retrieves all Group Reconciliation Comparison Ruleset that fit the filter, in a specific order if sortBy is provided  Supports pagination

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
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the comparison rulesets. Defaults to return the latest   version of the comparison rulesets if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing comparison rulesets from a previous call to list   comparison rulesets. This value is returned from the previous call. If a pagination token is provided the sortBy,   filter, effectiveAt, and asAt fields must not have changed since the original request.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many per page.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfGroupReconciliationComparisonRuleset result = apiInstance.listComparisonRulesets(asAt, page, sortBy, limit, filter).execute(opts);

            PagedResourceListOfGroupReconciliationComparisonRuleset result = apiInstance.listComparisonRulesets(asAt, page, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupReconciliationsApi#listComparisonRulesets");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the comparison rulesets. Defaults to return the latest   version of the comparison rulesets if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing comparison rulesets from a previous call to list   comparison rulesets. This value is returned from the previous call. If a pagination token is provided the sortBy,   filter, effectiveAt, and asAt fields must not have changed since the original request. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many per page. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfGroupReconciliationComparisonRuleset**](PagedResourceListOfGroupReconciliationComparisonRuleset.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested list of comparison rulesets |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listGroupReconciliationDefinitions

> PagedResourceListOfGroupReconciliationDefinition listGroupReconciliationDefinitions(effectiveAt, asAt, page, limit, filter, sortBy)

[EXPERIMENTAL] ListGroupReconciliationDefinitions: List group reconciliation definitions

Lists Group Reconciliation Definitions matching any provided filter, limit and sorting rules

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
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the group reconciliation definitions. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the group reconciliation definitions. Defaults to return the latest version of each group reconciliation definition if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing group reconciliation definitions from a previous call to list group reconciliation definitions. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy  and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to no limit if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the Display Name, use \"displayName eq 'string'\"   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfGroupReconciliationDefinition result = apiInstance.listGroupReconciliationDefinitions(effectiveAt, asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfGroupReconciliationDefinition result = apiInstance.listGroupReconciliationDefinitions(effectiveAt, asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupReconciliationsApi#listGroupReconciliationDefinitions");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the group reconciliation definitions. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the group reconciliation definitions. Defaults to return the latest version of each group reconciliation definition if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing group reconciliation definitions from a previous call to list group reconciliation definitions. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy  and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to no limit if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to filter on the Display Name, use \&quot;displayName eq &#39;string&#39;\&quot;   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfGroupReconciliationDefinition**](PagedResourceListOfGroupReconciliationDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The group reconciliation definition in the specified scope |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## runReconciliation

> GroupReconciliationRunResponse runReconciliation(scope, code, groupReconciliationRunRequest)

[EXPERIMENTAL] RunReconciliation: Runs a Group Reconciliation

Runs a Group Reconciliation using the definition specified by the Finbourne.Identifiers.Abstractions.Scope and Finbourne.Identifiers.Abstractions.Code  Supports pagination.

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
        String scope = "scope_example"; // String | The scope of the group reconciliation definition to use for the reconciliation.
        String code = "code_example"; // String | The code of the group reconciliation definition to use for the reconciliation.
        GroupReconciliationRunRequest groupReconciliationRunRequest = new GroupReconciliationRunRequest(); // GroupReconciliationRunRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // GroupReconciliationRunResponse result = apiInstance.runReconciliation(scope, code, groupReconciliationRunRequest).execute(opts);

            GroupReconciliationRunResponse result = apiInstance.runReconciliation(scope, code, groupReconciliationRunRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupReconciliationsApi#runReconciliation");
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
| **scope** | **String**| The scope of the group reconciliation definition to use for the reconciliation. | |
| **code** | **String**| The code of the group reconciliation definition to use for the reconciliation. | |
| **groupReconciliationRunRequest** | [**GroupReconciliationRunRequest**](GroupReconciliationRunRequest.md)|  | [optional] |

### Return type

[**GroupReconciliationRunResponse**](GroupReconciliationRunResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The results of the reconciliation run |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateComparisonRuleset

> GroupReconciliationComparisonRuleset updateComparisonRuleset(scope, code, updateGroupReconciliationComparisonRulesetRequest)

[EXPERIMENTAL] UpdateComparisonRuleset: Update Group Reconciliation Comparison Ruleset defined by scope and code

Overwrites an existing Group Reconciliation Comparison Ruleset  Update request has the same required fields as Create apart from the Id

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
        UpdateGroupReconciliationComparisonRulesetRequest updateGroupReconciliationComparisonRulesetRequest = new UpdateGroupReconciliationComparisonRulesetRequest(); // UpdateGroupReconciliationComparisonRulesetRequest | The request containing the updated details of the ruleset
        try {
            // uncomment the below to set overrides at the request level
            // GroupReconciliationComparisonRuleset result = apiInstance.updateComparisonRuleset(scope, code, updateGroupReconciliationComparisonRulesetRequest).execute(opts);

            GroupReconciliationComparisonRuleset result = apiInstance.updateComparisonRuleset(scope, code, updateGroupReconciliationComparisonRulesetRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupReconciliationsApi#updateComparisonRuleset");
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
| **updateGroupReconciliationComparisonRulesetRequest** | [**UpdateGroupReconciliationComparisonRulesetRequest**](UpdateGroupReconciliationComparisonRulesetRequest.md)| The request containing the updated details of the ruleset | [optional] |

### Return type

[**GroupReconciliationComparisonRuleset**](GroupReconciliationComparisonRuleset.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated version of the requested comparison ruleset |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateGroupReconciliationDefinition

> GroupReconciliationDefinition updateGroupReconciliationDefinition(scope, code, updateGroupReconciliationDefinitionRequest)

[EXPERIMENTAL] UpdateGroupReconciliationDefinition: Update group reconciliation definition

Update the group reconciliation definition.

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
        String scope = "scope_example"; // String | The scope of the group reconciliation definition to update the details for.
        String code = "code_example"; // String | The code of the group reconciliation definition to update the details for. Together with the scope this uniquely identifies the group reconciliation definition.
        UpdateGroupReconciliationDefinitionRequest updateGroupReconciliationDefinitionRequest = new UpdateGroupReconciliationDefinitionRequest(); // UpdateGroupReconciliationDefinitionRequest | The updated group reconciliation definition.
        try {
            // uncomment the below to set overrides at the request level
            // GroupReconciliationDefinition result = apiInstance.updateGroupReconciliationDefinition(scope, code, updateGroupReconciliationDefinitionRequest).execute(opts);

            GroupReconciliationDefinition result = apiInstance.updateGroupReconciliationDefinition(scope, code, updateGroupReconciliationDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupReconciliationsApi#updateGroupReconciliationDefinition");
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
| **scope** | **String**| The scope of the group reconciliation definition to update the details for. | |
| **code** | **String**| The code of the group reconciliation definition to update the details for. Together with the scope this uniquely identifies the group reconciliation definition. | |
| **updateGroupReconciliationDefinitionRequest** | [**UpdateGroupReconciliationDefinitionRequest**](UpdateGroupReconciliationDefinitionRequest.md)| The updated group reconciliation definition. | [optional] |

### Return type

[**GroupReconciliationDefinition**](GroupReconciliationDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated details of the group reconciliation definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

