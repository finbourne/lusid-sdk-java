# ComplianceApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createComplianceTemplate**](ComplianceApi.md#createComplianceTemplate) | **POST** /api/compliance/templates/{scope} | [EARLY ACCESS] CreateComplianceTemplate: Create a Compliance Rule Template |
| [**deleteComplianceRule**](ComplianceApi.md#deleteComplianceRule) | **DELETE** /api/compliance/rules/{scope}/{code} | [EARLY ACCESS] DeleteComplianceRule: Delete compliance rule. |
| [**deleteComplianceTemplate**](ComplianceApi.md#deleteComplianceTemplate) | **DELETE** /api/compliance/templates/{scope}/{code} | [EARLY ACCESS] DeleteComplianceTemplate: Delete a ComplianceRuleTemplate |
| [**getComplianceRule**](ComplianceApi.md#getComplianceRule) | **GET** /api/compliance/rules/{scope}/{code} | [EARLY ACCESS] GetComplianceRule: Get compliance rule. |
| [**getComplianceRuleResult**](ComplianceApi.md#getComplianceRuleResult) | **GET** /api/compliance/runs/summary/{runScope}/{runCode}/{ruleScope}/{ruleCode} | [EARLY ACCESS] GetComplianceRuleResult: Get detailed results for a specific rule within a compliance run. |
| [**getComplianceTemplate**](ComplianceApi.md#getComplianceTemplate) | **GET** /api/compliance/templates/{scope}/{code} | [EARLY ACCESS] GetComplianceTemplate: Get the requested compliance template. |
| [**getDecoratedComplianceRunSummary**](ComplianceApi.md#getDecoratedComplianceRunSummary) | **GET** /api/compliance/runs/summary/{scope}/{code}/$decorate | [EARLY ACCESS] GetDecoratedComplianceRunSummary: Get decorated summary results for a specific compliance run. |
| [**listComplianceRules**](ComplianceApi.md#listComplianceRules) | **GET** /api/compliance/rules | [EARLY ACCESS] ListComplianceRules: List compliance rules. |
| [**listComplianceRuns**](ComplianceApi.md#listComplianceRuns) | **GET** /api/compliance/runs | [EARLY ACCESS] ListComplianceRuns: List historical compliance run identifiers. |
| [**listComplianceTemplates**](ComplianceApi.md#listComplianceTemplates) | **GET** /api/compliance/templates | [EARLY ACCESS] ListComplianceTemplates: List compliance templates. |
| [**runCompliance**](ComplianceApi.md#runCompliance) | **POST** /api/compliance/runs | [EARLY ACCESS] RunCompliance: Run a compliance check. |
| [**runCompliancePreview**](ComplianceApi.md#runCompliancePreview) | **POST** /api/compliance/preview/runs | [EARLY ACCESS] RunCompliancePreview: Run a compliance check. |
| [**updateComplianceTemplate**](ComplianceApi.md#updateComplianceTemplate) | **PUT** /api/compliance/templates/{scope}/{code} | [EARLY ACCESS] UpdateComplianceTemplate: Update a ComplianceRuleTemplate |
| [**upsertComplianceRule**](ComplianceApi.md#upsertComplianceRule) | **POST** /api/compliance/rules | [EARLY ACCESS] UpsertComplianceRule: Upsert a compliance rule. |
| [**upsertComplianceRunSummary**](ComplianceApi.md#upsertComplianceRunSummary) | **POST** /api/compliance/runs/summary | [EARLY ACCESS] UpsertComplianceRunSummary: Upsert a compliance run summary. |



## createComplianceTemplate

> ComplianceRuleTemplate createComplianceTemplate(scope, createComplianceTemplateRequest)

[EARLY ACCESS] CreateComplianceTemplate: Create a Compliance Rule Template

Use this endpoint to create a compliance template.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        String scope = "scope_example"; // String | The scope of the Compliance Rule Template.
        CreateComplianceTemplateRequest createComplianceTemplateRequest = new CreateComplianceTemplateRequest(); // CreateComplianceTemplateRequest | Request to create a compliance rule template.
        try {
            ComplianceRuleTemplate result = apiInstance.createComplianceTemplate(scope, createComplianceTemplateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#createComplianceTemplate");
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
| **scope** | **String**| The scope of the Compliance Rule Template. | |
| **createComplianceTemplateRequest** | [**CreateComplianceTemplateRequest**](CreateComplianceTemplateRequest.md)| Request to create a compliance rule template. | |

### Return type

[**ComplianceRuleTemplate**](ComplianceRuleTemplate.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created compliance rule template |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteComplianceRule

> DeletedEntityResponse deleteComplianceRule(scope, code)

[EARLY ACCESS] DeleteComplianceRule: Delete compliance rule.

Use this endpoint to delete a compliance rule. The rule will be recoverable for asat times earlier than the  delete time, but will otherwise appear to have never existed.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        String scope = "scope_example"; // String | The compliance rule's scope.
        String code = "code_example"; // String | The compliance rule's code.
        try {
            DeletedEntityResponse result = apiInstance.deleteComplianceRule(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#deleteComplianceRule");
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
| **scope** | **String**| The compliance rule&#39;s scope. | |
| **code** | **String**| The compliance rule&#39;s code. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteComplianceTemplate

> DeletedEntityResponse deleteComplianceTemplate(scope, code)

[EARLY ACCESS] DeleteComplianceTemplate: Delete a ComplianceRuleTemplate

Delete the compliance rule template uniquely defined by the scope and code.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        String scope = "scope_example"; // String | The scope of the template to be deleted.
        String code = "code_example"; // String | The code of the template to be deleted.
        try {
            DeletedEntityResponse result = apiInstance.deleteComplianceTemplate(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#deleteComplianceTemplate");
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
| **scope** | **String**| The scope of the template to be deleted. | |
| **code** | **String**| The code of the template to be deleted. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response from deleting a compliance rule template. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getComplianceRule

> ComplianceRuleResponse getComplianceRule(scope, code, asAt, propertyKeys)

[EARLY ACCESS] GetComplianceRule: Get compliance rule.

Use this endpoint to retrieve a single compliance rule.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        String scope = "scope_example"; // String | The compliance rule's scope.
        String code = "code_example"; // String | The compliance rule's code.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. Asat time for query.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Compliance' domain to decorate onto the rule.   These must take the format {domain}/{scope}/{code}, for example 'Compliance/live/UCITS'.
        try {
            ComplianceRuleResponse result = apiInstance.getComplianceRule(scope, code, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getComplianceRule");
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
| **scope** | **String**| The compliance rule&#39;s scope. | |
| **code** | **String**| The compliance rule&#39;s code. | |
| **asAt** | **OffsetDateTime**| Optional. Asat time for query. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Compliance&#39; domain to decorate onto the rule.   These must take the format {domain}/{scope}/{code}, for example &#39;Compliance/live/UCITS&#39;. | [optional] |

### Return type

[**ComplianceRuleResponse**](ComplianceRuleResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested compliance rule. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getComplianceRuleResult

> ComplianceRuleResultV2 getComplianceRuleResult(runScope, runCode, ruleScope, ruleCode)

[EARLY ACCESS] GetComplianceRuleResult: Get detailed results for a specific rule within a compliance run.

Specify a run scope and code from a previously run compliance check, and the scope and code of a rule within that run, to get detailed results for that rule.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        String runScope = "runScope_example"; // String | Required: Run Scope.
        String runCode = "runCode_example"; // String | Required: Run Code.
        String ruleScope = "ruleScope_example"; // String | Required: Rule Scope.
        String ruleCode = "ruleCode_example"; // String | Required: Rule Code.
        try {
            ComplianceRuleResultV2 result = apiInstance.getComplianceRuleResult(runScope, runCode, ruleScope, ruleCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getComplianceRuleResult");
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
| **runScope** | **String**| Required: Run Scope. | |
| **runCode** | **String**| Required: Run Code. | |
| **ruleScope** | **String**| Required: Rule Scope. | |
| **ruleCode** | **String**| Required: Rule Code. | |

### Return type

[**ComplianceRuleResultV2**](ComplianceRuleResultV2.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested compliance run summary details for a specific rule. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getComplianceTemplate

> ComplianceTemplate getComplianceTemplate(scope, code, asAt)

[EARLY ACCESS] GetComplianceTemplate: Get the requested compliance template.

Use this endpoint to fetch a specific compliance template.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        String scope = "scope_example"; // String | Scope of TemplateID
        String code = "code_example"; // String | Code of TemplateID
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The time at which to get results from. Default : latest
        try {
            ComplianceTemplate result = apiInstance.getComplianceTemplate(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getComplianceTemplate");
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
| **scope** | **String**| Scope of TemplateID | |
| **code** | **String**| Code of TemplateID | |
| **asAt** | **OffsetDateTime**| Optional. The time at which to get results from. Default : latest | [optional] |

### Return type

[**ComplianceTemplate**](ComplianceTemplate.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested compliance template. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getDecoratedComplianceRunSummary

> DecoratedComplianceRunSummary getDecoratedComplianceRunSummary(scope, code)

[EARLY ACCESS] GetDecoratedComplianceRunSummary: Get decorated summary results for a specific compliance run.

Specify a run scope and code from a previously run compliance check to get an overview of result details.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        String scope = "scope_example"; // String | Required: Run Scope.
        String code = "code_example"; // String | Required: Run Code.
        try {
            DecoratedComplianceRunSummary result = apiInstance.getDecoratedComplianceRunSummary(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#getDecoratedComplianceRunSummary");
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
| **scope** | **String**| Required: Run Scope. | |
| **code** | **String**| Required: Run Code. | |

### Return type

[**DecoratedComplianceRunSummary**](DecoratedComplianceRunSummary.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested compliance run details. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listComplianceRules

> PagedResourceListOfComplianceRuleResponse listComplianceRules(asAt, page, limit, filter, propertyKeys)

[EARLY ACCESS] ListComplianceRules: List compliance rules.

Use this endpoint to retrieve all compliance rules, or a subset defined by an optional filter.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. Asat time.
        String page = "page_example"; // String | Optional. Pagination token.
        Integer limit = 56; // Integer | Optional. Entries per page.
        String filter = "filter_example"; // String | Optional. Filter.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Compliance' domain to decorate onto each rule.   These must take the format {domain}/{scope}/{code}, for example 'Compliance/live/UCITS'. If not provided will return all the entitled properties for each rule.
        try {
            PagedResourceListOfComplianceRuleResponse result = apiInstance.listComplianceRules(asAt, page, limit, filter, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#listComplianceRules");
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
| **asAt** | **OffsetDateTime**| Optional. Asat time. | [optional] |
| **page** | **String**| Optional. Pagination token. | [optional] |
| **limit** | **Integer**| Optional. Entries per page. | [optional] |
| **filter** | **String**| Optional. Filter. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Compliance&#39; domain to decorate onto each rule.   These must take the format {domain}/{scope}/{code}, for example &#39;Compliance/live/UCITS&#39;. If not provided will return all the entitled properties for each rule. | [optional] |

### Return type

[**PagedResourceListOfComplianceRuleResponse**](PagedResourceListOfComplianceRuleResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of compliance rules. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listComplianceRuns

> PagedResourceListOfComplianceRunInfoV2 listComplianceRuns(asAt, page, limit, filter, sortBy)

[EARLY ACCESS] ListComplianceRuns: List historical compliance run identifiers.

Lists RunIds of prior compliance runs, or a subset with a filter.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The time at which to get results from. Default : latest
        String page = "page_example"; // String | Optional. The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields   must not have changed since the original request.
        Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Optional. Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | Optional. A list of field names to sort by, each suffixed by \"ASC\" or \"DESC\"
        try {
            PagedResourceListOfComplianceRunInfoV2 result = apiInstance.listComplianceRuns(asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#listComplianceRuns");
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
| **asAt** | **OffsetDateTime**| Optional. The time at which to get results from. Default : latest | [optional] |
| **page** | **String**| Optional. The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields   must not have changed since the original request. | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. A list of field names to sort by, each suffixed by \&quot;ASC\&quot; or \&quot;DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfComplianceRunInfoV2**](PagedResourceListOfComplianceRunInfoV2.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of previous compliance RunIds |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listComplianceTemplates

> PagedResourceListOfComplianceTemplate listComplianceTemplates(asAt, page, limit, filter)

[EARLY ACCESS] ListComplianceTemplates: List compliance templates.

Use this endpoint to fetch a list of all available compliance template ids, or a subset using a filter.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The time at which to get results from. Default : latest
        String page = "page_example"; // String | Optional. The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields   must not have changed since the original request.
        Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Optional. Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        try {
            PagedResourceListOfComplianceTemplate result = apiInstance.listComplianceTemplates(asAt, page, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#listComplianceTemplates");
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
| **asAt** | **OffsetDateTime**| Optional. The time at which to get results from. Default : latest | [optional] |
| **page** | **String**| Optional. The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields   must not have changed since the original request. | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Optional. Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfComplianceTemplate**](PagedResourceListOfComplianceTemplate.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of compliance templates available. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## runCompliance

> ComplianceRunInfoV2 runCompliance(runScope, ruleScope, isPreTrade, recipeIdScope, recipeIdCode)

[EARLY ACCESS] RunCompliance: Run a compliance check.

Use this endpoint to run a compliance check using rules from a specific scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        String runScope = "runScope_example"; // String | Required: Scope to save the run results in.
        String ruleScope = "ruleScope_example"; // String | Required: Scope from which to select rules to be run.
        Boolean isPreTrade = true; // Boolean | Required: Boolean flag indicating if a run should be PreTrade (Including orders). For post-trade only, set to false
        String recipeIdScope = "recipeIdScope_example"; // String | Required: the scope of the recipe to be used
        String recipeIdCode = "recipeIdCode_example"; // String | Required: The code of the recipe to be used. If left blank, the default recipe will be used.
        try {
            ComplianceRunInfoV2 result = apiInstance.runCompliance(runScope, ruleScope, isPreTrade, recipeIdScope, recipeIdCode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#runCompliance");
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
| **runScope** | **String**| Required: Scope to save the run results in. | |
| **ruleScope** | **String**| Required: Scope from which to select rules to be run. | |
| **isPreTrade** | **Boolean**| Required: Boolean flag indicating if a run should be PreTrade (Including orders). For post-trade only, set to false | |
| **recipeIdScope** | **String**| Required: the scope of the recipe to be used | |
| **recipeIdCode** | **String**| Required: The code of the recipe to be used. If left blank, the default recipe will be used. | |

### Return type

[**ComplianceRunInfoV2**](ComplianceRunInfoV2.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The identifying information of a compliance run |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## runCompliancePreview

> ComplianceRunInfoV2 runCompliancePreview(runScope, ruleScope, recipeIdScope, recipeIdCode, complianceRunConfiguration)

[EARLY ACCESS] RunCompliancePreview: Run a compliance check.

Use this endpoint to run a compliance check using rules from a specific scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        String runScope = "runScope_example"; // String | Required: Scope to save the run results in.
        String ruleScope = "ruleScope_example"; // String | Required: Scope from which to select rules to be run.
        String recipeIdScope = "recipeIdScope_example"; // String | Required: the scope of the recipe to be used
        String recipeIdCode = "recipeIdCode_example"; // String | Required: The code of the recipe to be used. If left blank, the default recipe will be used.
        ComplianceRunConfiguration complianceRunConfiguration = new ComplianceRunConfiguration(); // ComplianceRunConfiguration | Configuration options for the compliance run.
        try {
            ComplianceRunInfoV2 result = apiInstance.runCompliancePreview(runScope, ruleScope, recipeIdScope, recipeIdCode, complianceRunConfiguration).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#runCompliancePreview");
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
| **runScope** | **String**| Required: Scope to save the run results in. | |
| **ruleScope** | **String**| Required: Scope from which to select rules to be run. | |
| **recipeIdScope** | **String**| Required: the scope of the recipe to be used | |
| **recipeIdCode** | **String**| Required: The code of the recipe to be used. If left blank, the default recipe will be used. | |
| **complianceRunConfiguration** | [**ComplianceRunConfiguration**](ComplianceRunConfiguration.md)| Configuration options for the compliance run. | [optional] |

### Return type

[**ComplianceRunInfoV2**](ComplianceRunInfoV2.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The identifying information of a compliance run |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateComplianceTemplate

> ComplianceRuleTemplate updateComplianceTemplate(scope, code, updateComplianceTemplateRequest)

[EARLY ACCESS] UpdateComplianceTemplate: Update a ComplianceRuleTemplate

Use this endpoint to update a specified compliance template.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        String scope = "scope_example"; // String | The scope of the Compliance Rule Template.
        String code = "code_example"; // String | The code of the Compliance Rule Template.
        UpdateComplianceTemplateRequest updateComplianceTemplateRequest = new UpdateComplianceTemplateRequest(); // UpdateComplianceTemplateRequest | Request to update a compliance rule template.
        try {
            ComplianceRuleTemplate result = apiInstance.updateComplianceTemplate(scope, code, updateComplianceTemplateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#updateComplianceTemplate");
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
| **scope** | **String**| The scope of the Compliance Rule Template. | |
| **code** | **String**| The code of the Compliance Rule Template. | |
| **updateComplianceTemplateRequest** | [**UpdateComplianceTemplateRequest**](UpdateComplianceTemplateRequest.md)| Request to update a compliance rule template. | |

### Return type

[**ComplianceRuleTemplate**](ComplianceRuleTemplate.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated compliance rule template |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertComplianceRule

> ComplianceRuleResponse upsertComplianceRule(upsertComplianceRuleRequest)

[EARLY ACCESS] UpsertComplianceRule: Upsert a compliance rule.

Use this endpoint to upsert a single compliance rule. The template and variation specified must already  exist, as must the portfolio group. The parameters passed must match those required by the template variation.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        UpsertComplianceRuleRequest upsertComplianceRuleRequest = new UpsertComplianceRuleRequest(); // UpsertComplianceRuleRequest | 
        try {
            ComplianceRuleResponse result = apiInstance.upsertComplianceRule(upsertComplianceRuleRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#upsertComplianceRule");
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
| **upsertComplianceRuleRequest** | [**UpsertComplianceRuleRequest**](UpsertComplianceRuleRequest.md)|  | [optional] |

### Return type

[**ComplianceRuleResponse**](ComplianceRuleResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The upserted compliance rule. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertComplianceRunSummary

> UpsertComplianceRunSummaryResult upsertComplianceRunSummary(upsertComplianceRunSummaryRequest)

[EARLY ACCESS] UpsertComplianceRunSummary: Upsert a compliance run summary.

Use this endpoint to upsert a compliance run result summary.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplianceApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplianceApiExample {

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

        ComplianceApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplianceApi.class);
        UpsertComplianceRunSummaryRequest upsertComplianceRunSummaryRequest = new UpsertComplianceRunSummaryRequest(); // UpsertComplianceRunSummaryRequest | 
        try {
            UpsertComplianceRunSummaryResult result = apiInstance.upsertComplianceRunSummary(upsertComplianceRunSummaryRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplianceApi#upsertComplianceRunSummary");
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
| **upsertComplianceRunSummaryRequest** | [**UpsertComplianceRunSummaryRequest**](UpsertComplianceRunSummaryRequest.md)|  | [optional] |

### Return type

[**UpsertComplianceRunSummaryResult**](UpsertComplianceRunSummaryResult.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The upserted compliance run summary. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

