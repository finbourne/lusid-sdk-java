# ComplianceGenericApi

All URIs are relative to *https://www.lusid.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteComplianceRule2**](ComplianceGenericApi.md#deleteComplianceRule2) | **DELETE** /api/compliance/generic/rules/{scope}/{code} | [EARLY ACCESS] DeleteComplianceRule2: Delete compliance rule.
[**getComplianceRule2**](ComplianceGenericApi.md#getComplianceRule2) | **GET** /api/compliance/generic/rules/{scope}/{code} | [EARLY ACCESS] GetComplianceRule2: Get compliance rule.
[**getComplianceRunSummary**](ComplianceGenericApi.md#getComplianceRunSummary) | **GET** /api/compliance/generic/runs/summary/{scope}/{code} | [EARLY ACCESS] GetComplianceRunSummary: Get compliance summary results.
[**getComplianceTemplate**](ComplianceGenericApi.md#getComplianceTemplate) | **GET** /api/compliance/templates/{scope}/{code} | [EARLY ACCESS] GetComplianceTemplate: Get the requested compliance template.
[**listComplianceRules2**](ComplianceGenericApi.md#listComplianceRules2) | **GET** /api/compliance/generic/rules | [EARLY ACCESS] ListComplianceRules2: List compliance rules.
[**listComplianceRuns**](ComplianceGenericApi.md#listComplianceRuns) | **GET** /api/compliance/generic/runs | [EARLY ACCESS] ListComplianceRuns: List historical Compliance RunIds
[**listComplianceTemplates**](ComplianceGenericApi.md#listComplianceTemplates) | **GET** /api/compliance/templates | [EARLY ACCESS] ListComplianceTemplates: Get a specific compliance template
[**runGenericCompliance**](ComplianceGenericApi.md#runGenericCompliance) | **POST** /api/compliance/generic/runs | [EARLY ACCESS] RunGenericCompliance: Kick off the compliance check process
[**upsertComplianceRule**](ComplianceGenericApi.md#upsertComplianceRule) | **POST** /api/compliance/generic/rules | [EARLY ACCESS] UpsertComplianceRule: Upsert a compliance rule.


<a name="deleteComplianceRule2"></a>
# **deleteComplianceRule2**
> DeletedEntityResponse deleteComplianceRule2(scope, code)

[EARLY ACCESS] DeleteComplianceRule2: Delete compliance rule.

Use this endpoint to delete a compliance rule. The rule will be recoverable for asat times earlier than the  delete time, but will otherwise appear to have never existed.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceGenericApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceGenericApi apiInstance = new ComplianceGenericApi(defaultClient);
    String scope = "scope_example"; // String | The compliance rule's scope.
    String code = "code_example"; // String | The compliance rule's code.
    try {
      DeletedEntityResponse result = apiInstance.deleteComplianceRule2(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceGenericApi#deleteComplianceRule2");
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
 **scope** | **String**| The compliance rule&#39;s scope. |
 **code** | **String**| The compliance rule&#39;s code. |

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
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getComplianceRule2"></a>
# **getComplianceRule2**
> ComplianceRuleResponse getComplianceRule2(scope, code, asAt, propertyKeys)

[EARLY ACCESS] GetComplianceRule2: Get compliance rule.

Use this endpoint to retrieve a single compliance rule.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceGenericApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceGenericApi apiInstance = new ComplianceGenericApi(defaultClient);
    String scope = "scope_example"; // String | The compliance rule's scope.
    String code = "code_example"; // String | The compliance rule's code.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. Asat time for query.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Compliance' domain to decorate onto the rule.              These must take the format {domain}/{scope}/{code}, for example 'Compliance/live/UCITS'. If not provided will return all the entitled properties for that rule.
    try {
      ComplianceRuleResponse result = apiInstance.getComplianceRule2(scope, code, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceGenericApi#getComplianceRule2");
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
 **scope** | **String**| The compliance rule&#39;s scope. |
 **code** | **String**| The compliance rule&#39;s code. |
 **asAt** | **OffsetDateTime**| Optional. Asat time for query. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Compliance&#39; domain to decorate onto the rule.              These must take the format {domain}/{scope}/{code}, for example &#39;Compliance/live/UCITS&#39;. If not provided will return all the entitled properties for that rule. | [optional]

### Return type

[**ComplianceRuleResponse**](ComplianceRuleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested compliance rule. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getComplianceRunSummary"></a>
# **getComplianceRunSummary**
> ComplianceRunSummary getComplianceRunSummary(scope, code)

[EARLY ACCESS] GetComplianceRunSummary: Get compliance summary results.

Specify a run scope and code from a previously run compliance check to get summarised results.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceGenericApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceGenericApi apiInstance = new ComplianceGenericApi(defaultClient);
    String scope = "scope_example"; // String | Required: Run Scope.
    String code = "code_example"; // String | Required: Run Code.
    try {
      ComplianceRunSummary result = apiInstance.getComplianceRunSummary(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceGenericApi#getComplianceRunSummary");
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
 **scope** | **String**| Required: Run Scope. |
 **code** | **String**| Required: Run Code. |

### Return type

[**ComplianceRunSummary**](ComplianceRunSummary.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The requested compliance run summary. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getComplianceTemplate"></a>
# **getComplianceTemplate**
> ComplianceTemplate getComplianceTemplate(scope, code, asAt)

[EARLY ACCESS] GetComplianceTemplate: Get the requested compliance template.

Use this endpoint to fetch a specific compliance template.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceGenericApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceGenericApi apiInstance = new ComplianceGenericApi(defaultClient);
    String scope = "scope_example"; // String | Scope of TemplateID
    String code = "code_example"; // String | Code of TemplateID
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The time at which to get results from. Default : latest
    try {
      ComplianceTemplate result = apiInstance.getComplianceTemplate(scope, code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceGenericApi#getComplianceTemplate");
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
 **scope** | **String**| Scope of TemplateID |
 **code** | **String**| Code of TemplateID |
 **asAt** | **OffsetDateTime**| Optional. The time at which to get results from. Default : latest | [optional]

### Return type

[**ComplianceTemplate**](ComplianceTemplate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested compliance template. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listComplianceRules2"></a>
# **listComplianceRules2**
> PagedResourceListOfComplianceRuleResponse listComplianceRules2(asAt, page, limit, filter, propertyKeys)

[EARLY ACCESS] ListComplianceRules2: List compliance rules.

Use this endpoint to retrieve all compliance rules, or a collection defined by an optional filter.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceGenericApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceGenericApi apiInstance = new ComplianceGenericApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. Asat time.
    String page = "page_example"; // String | Optional. Pagination token.
    Integer limit = 56; // Integer | Optional. Entries per page.
    String filter = "filter_example"; // String | Optional. Filter.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Compliance' domain to decorate onto each rule.              These must take the format {domain}/{scope}/{code}, for example 'Compliance/live/UCITS'. If not provided will return all the entitled properties for each rule.
    try {
      PagedResourceListOfComplianceRuleResponse result = apiInstance.listComplianceRules2(asAt, page, limit, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceGenericApi#listComplianceRules2");
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
 **asAt** | **OffsetDateTime**| Optional. Asat time. | [optional]
 **page** | **String**| Optional. Pagination token. | [optional]
 **limit** | **Integer**| Optional. Entries per page. | [optional]
 **filter** | **String**| Optional. Filter. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Compliance&#39; domain to decorate onto each rule.              These must take the format {domain}/{scope}/{code}, for example &#39;Compliance/live/UCITS&#39;. If not provided will return all the entitled properties for each rule. | [optional]

### Return type

[**PagedResourceListOfComplianceRuleResponse**](PagedResourceListOfComplianceRuleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The list of compliance rules. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listComplianceRuns"></a>
# **listComplianceRuns**
> PagedResourceListOfComplianceRunInfoV2 listComplianceRuns(asAt, page, start, limit, filter, sortBy)

[EARLY ACCESS] ListComplianceRuns: List historical Compliance RunIds

Lists out all RunIds of prior compliance runs.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceGenericApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceGenericApi apiInstance = new ComplianceGenericApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The time at which to get results from. Default : latest
    String page = "page_example"; // String | Optional. The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | Optional. When paginating, skip this number of results.
    Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Optional. Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> sortBy = Arrays.asList(); // List<String> | Optional. A list of field names to sort by, each suffixed by \"ASC\" or \"DESC\"
    try {
      PagedResourceListOfComplianceRunInfoV2 result = apiInstance.listComplianceRuns(asAt, page, start, limit, filter, sortBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceGenericApi#listComplianceRuns");
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
 **asAt** | **OffsetDateTime**| Optional. The time at which to get results from. Default : latest | [optional]
 **page** | **String**| Optional. The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results. | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. A list of field names to sort by, each suffixed by \&quot;ASC\&quot; or \&quot;DESC\&quot; | [optional]

### Return type

[**PagedResourceListOfComplianceRunInfoV2**](PagedResourceListOfComplianceRunInfoV2.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of previous compliance RunIds |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listComplianceTemplates"></a>
# **listComplianceTemplates**
> PagedResourceListOfComplianceTemplate listComplianceTemplates(asAt, page, start, limit, filter)

[EARLY ACCESS] ListComplianceTemplates: Get a specific compliance template

Use this endpoint to fetch a list of all available compliance template ids.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceGenericApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceGenericApi apiInstance = new ComplianceGenericApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The time at which to get results from. Default : latest
    String page = "page_example"; // String | Optional. The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | Optional. When paginating, skip this number of results.
    Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Optional. Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      PagedResourceListOfComplianceTemplate result = apiInstance.listComplianceTemplates(asAt, page, start, limit, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceGenericApi#listComplianceTemplates");
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
 **asAt** | **OffsetDateTime**| Optional. The time at which to get results from. Default : latest | [optional]
 **page** | **String**| Optional. The pagination token to use to continue listing compliance runs from a previous call to list compliance runs.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt fields              must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results. | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

### Return type

[**PagedResourceListOfComplianceTemplate**](PagedResourceListOfComplianceTemplate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The list of compliance templates available. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="runGenericCompliance"></a>
# **runGenericCompliance**
> ComplianceRunInfoV2 runGenericCompliance(runScope, ruleScope, isPreTrade, recipeIdScope, recipeIdCode)

[EARLY ACCESS] RunGenericCompliance: Kick off the compliance check process

Use this endpoint to fetch the start a compliance run, based on a pre-set mapping file.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceGenericApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceGenericApi apiInstance = new ComplianceGenericApi(defaultClient);
    String runScope = "runScope_example"; // String | Required: Scope to save the run results in.
    String ruleScope = "ruleScope_example"; // String | Required: Scope from which to select rules to be run.
    Boolean isPreTrade = true; // Boolean | Required: Boolean flag indicating if a run should be PreTrade (Including orders). For post-trade only, set to false
    String recipeIdScope = "recipeIdScope_example"; // String | Required: the scope of the recipe to be used
    String recipeIdCode = "recipeIdCode_example"; // String | Required: The code of the recipe to be used. If left blank, the default recipe will be used.
    try {
      ComplianceRunInfoV2 result = apiInstance.runGenericCompliance(runScope, ruleScope, isPreTrade, recipeIdScope, recipeIdCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceGenericApi#runGenericCompliance");
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
 **runScope** | **String**| Required: Scope to save the run results in. |
 **ruleScope** | **String**| Required: Scope from which to select rules to be run. |
 **isPreTrade** | **Boolean**| Required: Boolean flag indicating if a run should be PreTrade (Including orders). For post-trade only, set to false |
 **recipeIdScope** | **String**| Required: the scope of the recipe to be used |
 **recipeIdCode** | **String**| Required: The code of the recipe to be used. If left blank, the default recipe will be used. |

### Return type

[**ComplianceRunInfoV2**](ComplianceRunInfoV2.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The identifying information of a compliance run |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertComplianceRule"></a>
# **upsertComplianceRule**
> ComplianceRuleResponse upsertComplianceRule(upsertComplianceRuleRequest)

[EARLY ACCESS] UpsertComplianceRule: Upsert a compliance rule.

Use this endpoint to upsert a single compliance rule. The template and variation specified must already  exist. The parameters passed must match those required by the template.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ComplianceGenericApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ComplianceGenericApi apiInstance = new ComplianceGenericApi(defaultClient);
    UpsertComplianceRuleRequest upsertComplianceRuleRequest = new UpsertComplianceRuleRequest(); // UpsertComplianceRuleRequest | 
    try {
      ComplianceRuleResponse result = apiInstance.upsertComplianceRule(upsertComplianceRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceGenericApi#upsertComplianceRule");
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
 **upsertComplianceRuleRequest** | [**UpsertComplianceRuleRequest**](UpsertComplianceRuleRequest.md)|  | [optional]

### Return type

[**ComplianceRuleResponse**](ComplianceRuleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The upserted compliance rule. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

