# AmortisationRuleSetsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAmortisationRuleSet**](AmortisationRuleSetsApi.md#createAmortisationRuleSet) | **POST** /api/amortisation/rulesets/{scope} | [EXPERIMENTAL] CreateAmortisationRuleSet: Create an amortisation rule set. |
| [**deleteAmortisationRuleset**](AmortisationRuleSetsApi.md#deleteAmortisationRuleset) | **DELETE** /api/amortisation/rulesets/{scope}/{code} | [EXPERIMENTAL] DeleteAmortisationRuleset: Delete an amortisation rule set. |
| [**getAmortisationRuleSet**](AmortisationRuleSetsApi.md#getAmortisationRuleSet) | **GET** /api/amortisation/rulesets/{scope}/{code} | [EXPERIMENTAL] GetAmortisationRuleSet: Retrieve the definition of a single amortisation rule set |
| [**listAmortisationRuleSets**](AmortisationRuleSetsApi.md#listAmortisationRuleSets) | **GET** /api/amortisation/rulesets | [EXPERIMENTAL] ListAmortisationRuleSets: List amortisation rule sets. |
| [**setAmortisationRules**](AmortisationRuleSetsApi.md#setAmortisationRules) | **PUT** /api/amortisation/rulesets/{scope}/{code}/rules | [EXPERIMENTAL] SetAmortisationRules: Set Amortisation Rules on an existing Amortisation Rule Set. |
| [**updateAmortisationRuleSetDetails**](AmortisationRuleSetsApi.md#updateAmortisationRuleSetDetails) | **PUT** /api/amortisation/rulesets/{scope}/{code}/details | [EXPERIMENTAL] UpdateAmortisationRuleSetDetails: Update an amortisation rule set. |



## createAmortisationRuleSet

> AmortisationRuleSet createAmortisationRuleSet(scope, createAmortisationRuleSetRequest)

[EXPERIMENTAL] CreateAmortisationRuleSet: Create an amortisation rule set.

Creates an amortisation rule set definition at the given effective time.  The user must be entitled to read any properties specified in each rule.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AmortisationRuleSetsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AmortisationRuleSetsApiExample {

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
        // AmortisationRuleSetsApi apiInstance = apiFactory.build(AmortisationRuleSetsApi.class);

        AmortisationRuleSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AmortisationRuleSetsApi.class);
        String scope = "scope_example"; // String | The scope of the rule set.
        CreateAmortisationRuleSetRequest createAmortisationRuleSetRequest = new CreateAmortisationRuleSetRequest(); // CreateAmortisationRuleSetRequest | The contents of the rule set.
        try {
            // uncomment the below to set overrides at the request level
            // AmortisationRuleSet result = apiInstance.createAmortisationRuleSet(scope, createAmortisationRuleSetRequest).execute(opts);

            AmortisationRuleSet result = apiInstance.createAmortisationRuleSet(scope, createAmortisationRuleSetRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AmortisationRuleSetsApi#createAmortisationRuleSet");
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
| **scope** | **String**| The scope of the rule set. | |
| **createAmortisationRuleSetRequest** | [**CreateAmortisationRuleSetRequest**](CreateAmortisationRuleSetRequest.md)| The contents of the rule set. | |

### Return type

[**AmortisationRuleSet**](AmortisationRuleSet.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create a rule set for amortisation. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteAmortisationRuleset

> DeletedEntityResponse deleteAmortisationRuleset(scope, code)

[EXPERIMENTAL] DeleteAmortisationRuleset: Delete an amortisation rule set.

    Deletes the rule set perpetually, including its rules.         The rule set will remain viewable at previous as at times, but it will no longer be considered applicable.         This cannot be undone.   

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AmortisationRuleSetsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AmortisationRuleSetsApiExample {

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
        // AmortisationRuleSetsApi apiInstance = apiFactory.build(AmortisationRuleSetsApi.class);

        AmortisationRuleSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AmortisationRuleSetsApi.class);
        String scope = "scope_example"; // String | The rule set scope.
        String code = "code_example"; // String | The rule set code.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteAmortisationRuleset(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteAmortisationRuleset(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AmortisationRuleSetsApi#deleteAmortisationRuleset");
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
| **scope** | **String**| The rule set scope. | |
| **code** | **String**| The rule set code. | |

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


## getAmortisationRuleSet

> AmortisationRuleSet getAmortisationRuleSet(scope, code, effectiveAt, asAt)

[EXPERIMENTAL] GetAmortisationRuleSet: Retrieve the definition of a single amortisation rule set

Retrieves the amortisation rule set definition at the given effective and as at times.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AmortisationRuleSetsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AmortisationRuleSetsApiExample {

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
        // AmortisationRuleSetsApi apiInstance = apiFactory.build(AmortisationRuleSetsApi.class);

        AmortisationRuleSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AmortisationRuleSetsApi.class);
        String scope = "scope_example"; // String | The rule set scope.
        String code = "code_example"; // String | The rule set code.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the rule definition.  Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the rule definition. Defaults to returning the latest version if not  specified.
        try {
            // uncomment the below to set overrides at the request level
            // AmortisationRuleSet result = apiInstance.getAmortisationRuleSet(scope, code, effectiveAt, asAt).execute(opts);

            AmortisationRuleSet result = apiInstance.getAmortisationRuleSet(scope, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AmortisationRuleSetsApi#getAmortisationRuleSet");
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
| **scope** | **String**| The rule set scope. | |
| **code** | **String**| The rule set code. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the rule definition.  Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the rule definition. Defaults to returning the latest version if not  specified. | [optional] |

### Return type

[**AmortisationRuleSet**](AmortisationRuleSet.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of one rule set. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listAmortisationRuleSets

> PagedResourceListOfAmortisationRuleSet listAmortisationRuleSets(effectiveAt, asAt, page, limit, filter, sortBy)

[EXPERIMENTAL] ListAmortisationRuleSets: List amortisation rule sets.

Retrieves all amortisation rule sets at the given effective and as at times

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AmortisationRuleSetsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AmortisationRuleSetsApiExample {

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
        // AmortisationRuleSetsApi apiInstance = apiFactory.build(AmortisationRuleSetsApi.class);

        AmortisationRuleSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AmortisationRuleSetsApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the rule definitions.  Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the rule definitions. Defaults to returning the latest version if not  specified.
        String page = "page_example"; // String | The pagination token to use to continue listing AmortisationRuleSets; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfAmortisationRuleSet result = apiInstance.listAmortisationRuleSets(effectiveAt, asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfAmortisationRuleSet result = apiInstance.listAmortisationRuleSets(effectiveAt, asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AmortisationRuleSetsApi#listAmortisationRuleSets");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the rule definitions.  Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the rule definitions. Defaults to returning the latest version if not  specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing AmortisationRuleSets; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfAmortisationRuleSet**](PagedResourceListOfAmortisationRuleSet.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of rule sets available. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setAmortisationRules

> AmortisationRuleSet setAmortisationRules(scope, code, setAmortisationRulesRequest)

[EXPERIMENTAL] SetAmortisationRules: Set Amortisation Rules on an existing Amortisation Rule Set.

Sets the rules on the Amortisation Rule Set, replacing the existing rules with the set provided.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AmortisationRuleSetsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AmortisationRuleSetsApiExample {

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
        // AmortisationRuleSetsApi apiInstance = apiFactory.build(AmortisationRuleSetsApi.class);

        AmortisationRuleSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AmortisationRuleSetsApi.class);
        String scope = "scope_example"; // String | The rule set scope.
        String code = "code_example"; // String | The rule set code.
        SetAmortisationRulesRequest setAmortisationRulesRequest = new SetAmortisationRulesRequest(); // SetAmortisationRulesRequest | The contents of the rules.
        try {
            // uncomment the below to set overrides at the request level
            // AmortisationRuleSet result = apiInstance.setAmortisationRules(scope, code, setAmortisationRulesRequest).execute(opts);

            AmortisationRuleSet result = apiInstance.setAmortisationRules(scope, code, setAmortisationRulesRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AmortisationRuleSetsApi#setAmortisationRules");
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
| **scope** | **String**| The rule set scope. | |
| **code** | **String**| The rule set code. | |
| **setAmortisationRulesRequest** | [**SetAmortisationRulesRequest**](SetAmortisationRulesRequest.md)| The contents of the rules. | |

### Return type

[**AmortisationRuleSet**](AmortisationRuleSet.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update the rules for an amortisation rule set. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateAmortisationRuleSetDetails

> AmortisationRuleSet updateAmortisationRuleSetDetails(scope, code, updateAmortisationRuleSetDetailsRequest)

[EXPERIMENTAL] UpdateAmortisationRuleSetDetails: Update an amortisation rule set.

Updates the amortisation rule set definition for all effective time.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AmortisationRuleSetsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AmortisationRuleSetsApiExample {

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
        // AmortisationRuleSetsApi apiInstance = apiFactory.build(AmortisationRuleSetsApi.class);

        AmortisationRuleSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AmortisationRuleSetsApi.class);
        String scope = "scope_example"; // String | The rule set scope.
        String code = "code_example"; // String | The rule set code.
        UpdateAmortisationRuleSetDetailsRequest updateAmortisationRuleSetDetailsRequest = new UpdateAmortisationRuleSetDetailsRequest(); // UpdateAmortisationRuleSetDetailsRequest | The contents of the rule set.
        try {
            // uncomment the below to set overrides at the request level
            // AmortisationRuleSet result = apiInstance.updateAmortisationRuleSetDetails(scope, code, updateAmortisationRuleSetDetailsRequest).execute(opts);

            AmortisationRuleSet result = apiInstance.updateAmortisationRuleSetDetails(scope, code, updateAmortisationRuleSetDetailsRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AmortisationRuleSetsApi#updateAmortisationRuleSetDetails");
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
| **scope** | **String**| The rule set scope. | |
| **code** | **String**| The rule set code. | |
| **updateAmortisationRuleSetDetailsRequest** | [**UpdateAmortisationRuleSetDetailsRequest**](UpdateAmortisationRuleSetDetailsRequest.md)| The contents of the rule set. | |

### Return type

[**AmortisationRuleSet**](AmortisationRuleSet.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update the details of an Amortisation Rule Set. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

