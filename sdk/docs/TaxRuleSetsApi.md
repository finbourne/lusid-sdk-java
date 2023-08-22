# TaxRuleSetsApi

All URIs are relative to *https://example.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTaxRuleSet**](TaxRuleSetsApi.md#createTaxRuleSet) | **POST** /api/tax/rulesets | [EXPERIMENTAL] CreateTaxRuleSet: Create a tax rule set. |
| [**deleteTaxRuleSet**](TaxRuleSetsApi.md#deleteTaxRuleSet) | **DELETE** /api/tax/rulesets/{scope}/{code} | [EXPERIMENTAL] DeleteTaxRuleSet: Delete a tax rule set. |
| [**getTaxRuleSet**](TaxRuleSetsApi.md#getTaxRuleSet) | **GET** /api/tax/rulesets/{scope}/{code} | [EXPERIMENTAL] GetTaxRuleSet: Retrieve the definition of single tax rule set. |
| [**listTaxRuleSets**](TaxRuleSetsApi.md#listTaxRuleSets) | **GET** /api/tax/rulesets | [EXPERIMENTAL] ListTaxRuleSets: List tax rule sets. |
| [**updateTaxRuleSet**](TaxRuleSetsApi.md#updateTaxRuleSet) | **PUT** /api/tax/rulesets/{scope}/{code} | [EXPERIMENTAL] UpdateTaxRuleSet: Update a tax rule set. |


<a id="createTaxRuleSet"></a>
# **createTaxRuleSet**
> TaxRuleSet createTaxRuleSet(createTaxRuleSetRequest, effectiveAt)

[EXPERIMENTAL] CreateTaxRuleSet: Create a tax rule set.

Creates a tax rule set definition at the given effective time.  The user must be entitled to read any properties specified in each rule.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TaxRuleSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TaxRuleSetsApi apiInstance = new TaxRuleSetsApi(defaultClient);
    CreateTaxRuleSetRequest createTaxRuleSetRequest = new CreateTaxRuleSetRequest(); // CreateTaxRuleSetRequest | The contents of the rule set.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the rule set will take effect.  Defaults to the current LUSID system datetime if not specified.
    try {
      TaxRuleSet result = apiInstance.createTaxRuleSet(createTaxRuleSetRequest, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxRuleSetsApi#createTaxRuleSet");
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
| **createTaxRuleSetRequest** | [**CreateTaxRuleSetRequest**](CreateTaxRuleSetRequest.md)| The contents of the rule set. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which the rule set will take effect.  Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**TaxRuleSet**](TaxRuleSet.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a rule set for tax calculations. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteTaxRuleSet"></a>
# **deleteTaxRuleSet**
> DeletedEntityResponse deleteTaxRuleSet(scope, code)

[EXPERIMENTAL] DeleteTaxRuleSet: Delete a tax rule set.

&lt;br&gt;              Deletes the rule set for all effective time.                &lt;br&gt;              The rule set will remain viewable at previous as at times, but it will no longer be considered applicable.                &lt;br&gt;              This cannot be undone.              

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TaxRuleSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TaxRuleSetsApi apiInstance = new TaxRuleSetsApi(defaultClient);
    String scope = "scope_example"; // String | The rule set scope.
    String code = "code_example"; // String | The rule set code.
    try {
      DeletedEntityResponse result = apiInstance.deleteTaxRuleSet(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxRuleSetsApi#deleteTaxRuleSet");
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
| **scope** | **String**| The rule set scope. | |
| **code** | **String**| The rule set code. | |

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

<a id="getTaxRuleSet"></a>
# **getTaxRuleSet**
> TaxRuleSet getTaxRuleSet(scope, code, effectiveAt, asAt)

[EXPERIMENTAL] GetTaxRuleSet: Retrieve the definition of single tax rule set.

Retrieves the tax rule set definition at the given effective and as at times.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TaxRuleSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TaxRuleSetsApi apiInstance = new TaxRuleSetsApi(defaultClient);
    String scope = "scope_example"; // String | The rule set scope.
    String code = "code_example"; // String | The rule set code.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the rule definition.  Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the rule definition. Defaults to returning the latest version if not  specified.
    try {
      TaxRuleSet result = apiInstance.getTaxRuleSet(scope, code, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxRuleSetsApi#getTaxRuleSet");
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
| **scope** | **String**| The rule set scope. | |
| **code** | **String**| The rule set code. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the rule definition.  Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the rule definition. Defaults to returning the latest version if not  specified. | [optional] |

### Return type

[**TaxRuleSet**](TaxRuleSet.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of one rule set. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listTaxRuleSets"></a>
# **listTaxRuleSets**
> ResourceListOfTaxRuleSet listTaxRuleSets(effectiveAt, asAt)

[EXPERIMENTAL] ListTaxRuleSets: List tax rule sets.

Retrieves all tax rule set definitions at the given effective and as at times

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TaxRuleSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TaxRuleSetsApi apiInstance = new TaxRuleSetsApi(defaultClient);
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the rule definitions.  Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the rule definitions. Defaults to returning the latest version if not  specified.
    try {
      ResourceListOfTaxRuleSet result = apiInstance.listTaxRuleSets(effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxRuleSetsApi#listTaxRuleSets");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the rule definitions.  Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the rule definitions. Defaults to returning the latest version if not  specified. | [optional] |

### Return type

[**ResourceListOfTaxRuleSet**](ResourceListOfTaxRuleSet.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of rule sets available. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateTaxRuleSet"></a>
# **updateTaxRuleSet**
> TaxRuleSet updateTaxRuleSet(scope, code, updateTaxRuleSetRequest, effectiveAt)

[EXPERIMENTAL] UpdateTaxRuleSet: Update a tax rule set.

Updates the tax rule set definition at the given effective time.  The changes will take place from this effective time until the next effective time that the rule has been updated at.  For example, consider a rule that has been created or updated effective at the first day of the coming month.  An upsert effective from the current day will only change the definition until that day.  An additional upsert at the same time (first day of the month) is required if the newly-updated definition is to supersede the future definition.  The user must be entitled to read any properties specified in each rule.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TaxRuleSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TaxRuleSetsApi apiInstance = new TaxRuleSetsApi(defaultClient);
    String scope = "scope_example"; // String | The rule set scope.
    String code = "code_example"; // String | The rule set code.
    UpdateTaxRuleSetRequest updateTaxRuleSetRequest = new UpdateTaxRuleSetRequest(); // UpdateTaxRuleSetRequest | The contents of the rule set.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which the rule set will take effect.  Defaults to the current LUSID system datetime if not specified.
    try {
      TaxRuleSet result = apiInstance.updateTaxRuleSet(scope, code, updateTaxRuleSetRequest, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxRuleSetsApi#updateTaxRuleSet");
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
| **scope** | **String**| The rule set scope. | |
| **code** | **String**| The rule set code. | |
| **updateTaxRuleSetRequest** | [**UpdateTaxRuleSetRequest**](UpdateTaxRuleSetRequest.md)| The contents of the rule set. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which the rule set will take effect.  Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**TaxRuleSet**](TaxRuleSet.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update rules for tax calculations. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

