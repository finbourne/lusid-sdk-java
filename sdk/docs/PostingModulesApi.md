# PostingModulesApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPostingModule**](PostingModulesApi.md#createPostingModule) | **POST** /api/postingmodule/{scope} | [EXPERIMENTAL] CreatePostingModule: Create a Posting Module |
| [**deletePostingModule**](PostingModulesApi.md#deletePostingModule) | **DELETE** /api/postingmodule/{scope}/{code} | [EXPERIMENTAL] DeletePostingModule: Delete a Posting Module. |
| [**listPostingModuleRules**](PostingModulesApi.md#listPostingModuleRules) | **GET** /api/postingmodule/{scope}/{code}/postingrules | [EXPERIMENTAL] ListPostingModuleRules: List Posting Module Rules |
| [**listPostingModules**](PostingModulesApi.md#listPostingModules) | **GET** /api/postingmodule | [EXPERIMENTAL] ListPostingModules: List Posting Modules |
| [**setPostingModuleDetails**](PostingModulesApi.md#setPostingModuleDetails) | **PUT** /api/postingmodule/{scope}/{code} | [EXPERIMENTAL] SetPostingModuleDetails: Set the details of a Posting Module |
| [**setPostingModuleRules**](PostingModulesApi.md#setPostingModuleRules) | **PUT** /api/postingmodule/{scope}/{code}/postingrules | [EXPERIMENTAL] SetPostingModuleRules: Set the rules of a Posting Module |


<a id="createPostingModule"></a>
# **createPostingModule**
> PostingModuleCreateResponse createPostingModule(scope, postingModuleRequest)

[EXPERIMENTAL] CreatePostingModule: Create a Posting Module

Create the given Posting Module.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PostingModulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PostingModulesApi apiInstance = new PostingModulesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Posting Module.
    PostingModuleRequest postingModuleRequest = new PostingModuleRequest(); // PostingModuleRequest | The definition of the Posting Module.
    try {
      PostingModuleCreateResponse result = apiInstance.createPostingModule(scope, postingModuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostingModulesApi#createPostingModule");
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
| **scope** | **String**| The scope of the Posting Module. | |
| **postingModuleRequest** | [**PostingModuleRequest**](PostingModuleRequest.md)| The definition of the Posting Module. | |

### Return type

[**PostingModuleCreateResponse**](PostingModuleCreateResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Posting Module. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deletePostingModule"></a>
# **deletePostingModule**
> DeletedEntityResponse deletePostingModule(scope, code)

[EXPERIMENTAL] DeletePostingModule: Delete a Posting Module.

Delete the given Posting Module.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PostingModulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PostingModulesApi apiInstance = new PostingModulesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Posting Module to be deleted.
    String code = "code_example"; // String | The code of the Posting Module to be deleted. Together with the scope this uniquely identifies the Posting Module.
    try {
      DeletedEntityResponse result = apiInstance.deletePostingModule(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostingModulesApi#deletePostingModule");
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
| **scope** | **String**| The scope of the Posting Module to be deleted. | |
| **code** | **String**| The code of the Posting Module to be deleted. Together with the scope this uniquely identifies the Posting Module. | |

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
| **200** | The datetime that the Posting Module was deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listPostingModuleRules"></a>
# **listPostingModuleRules**
> PagedResourceListOfPostingModuleRule listPostingModuleRules(scope, code, asAt, page, start, limit, filter)

[EXPERIMENTAL] ListPostingModuleRules: List Posting Module Rules

List the Rules in a Posting Module

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PostingModulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PostingModulesApi apiInstance = new PostingModulesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the posting module.
    String code = "code_example"; // String | The code of the posting module. Together with the scope this uniquely identifies              the Posting Module.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the instrument. Defaults to              returning the latest version if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing posting module; this              value is returned from the previous call. If a pagination token is provided, the filter              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.              For example, to filter on the rule type, specify \"id eq 'rule 1'\". For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    try {
      PagedResourceListOfPostingModuleRule result = apiInstance.listPostingModuleRules(scope, code, asAt, page, start, limit, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostingModulesApi#listPostingModuleRules");
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
| **scope** | **String**| The scope of the posting module. | |
| **code** | **String**| The code of the posting module. Together with the scope this uniquely identifies              the Posting Module. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instrument. Defaults to              returning the latest version if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing posting module; this              value is returned from the previous call. If a pagination token is provided, the filter              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.              For example, to filter on the rule type, specify \&quot;id eq &#39;rule 1&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |

### Return type

[**PagedResourceListOfPostingModuleRule**](PagedResourceListOfPostingModuleRule.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The rules in the given Posting Module. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listPostingModules"></a>
# **listPostingModules**
> PagedResourceListOfPostingModuleResponse listPostingModules(asAt, page, start, limit, filter)

[EXPERIMENTAL] ListPostingModules: List Posting Modules

List all the posting rules matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PostingModulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PostingModulesApi apiInstance = new PostingModulesApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Posting Module. Defaults to returning the latest version              of each Posting Module if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing Posting Modules; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided.
    Integer start = 56; // Integer | When paginating, skip this number of results.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.              For example, to filter on the Posting Module type, specify \"id.Code eq '001'\". For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    try {
      PagedResourceListOfPostingModuleResponse result = apiInstance.listPostingModules(asAt, page, start, limit, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostingModulesApi#listPostingModules");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Posting Module. Defaults to returning the latest version              of each Posting Module if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Posting Modules; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.              For example, to filter on the Posting Module type, specify \&quot;id.Code eq &#39;001&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |

### Return type

[**PagedResourceListOfPostingModuleResponse**](PagedResourceListOfPostingModuleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Posting Modules. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="setPostingModuleDetails"></a>
# **setPostingModuleDetails**
> PostingModuleResponse setPostingModuleDetails(scope, code, postingModuleDetails)

[EXPERIMENTAL] SetPostingModuleDetails: Set the details of a Posting Module

Update the given Posting Module details.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PostingModulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PostingModulesApi apiInstance = new PostingModulesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Posting Module to be updated.
    String code = "code_example"; // String | The code of the Posting Module to be updated. Together with the scope this uniquely identifies the Posting Module.
    PostingModuleDetails postingModuleDetails = new PostingModuleDetails(); // PostingModuleDetails | The new details for the Posting Module.
    try {
      PostingModuleResponse result = apiInstance.setPostingModuleDetails(scope, code, postingModuleDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostingModulesApi#setPostingModuleDetails");
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
| **scope** | **String**| The scope of the Posting Module to be updated. | |
| **code** | **String**| The code of the Posting Module to be updated. Together with the scope this uniquely identifies the Posting Module. | |
| **postingModuleDetails** | [**PostingModuleDetails**](PostingModuleDetails.md)| The new details for the Posting Module. | |

### Return type

[**PostingModuleResponse**](PostingModuleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated Posting Module. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="setPostingModuleRules"></a>
# **setPostingModuleRules**
> PostingModuleRulesUpdatedResponse setPostingModuleRules(scope, code, postingModuleRule)

[EXPERIMENTAL] SetPostingModuleRules: Set the rules of a Posting Module

Set the given Posting Modules rules, this will replace the existing set of rules for the posting module.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PostingModulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PostingModulesApi apiInstance = new PostingModulesApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Posting Module to be updated.
    String code = "code_example"; // String | The code of the Posting Module to be updated. Together with the scope this uniquely identifies the Posting Module.
    List<PostingModuleRule> postingModuleRule = Arrays.asList(); // List<PostingModuleRule> | The new rule set for the Posting Module.
    try {
      PostingModuleRulesUpdatedResponse result = apiInstance.setPostingModuleRules(scope, code, postingModuleRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostingModulesApi#setPostingModuleRules");
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
| **scope** | **String**| The scope of the Posting Module to be updated. | |
| **code** | **String**| The code of the Posting Module to be updated. Together with the scope this uniquely identifies the Posting Module. | |
| **postingModuleRule** | [**List&lt;PostingModuleRule&gt;**](PostingModuleRule.md)| The new rule set for the Posting Module. | |

### Return type

[**PostingModuleRulesUpdatedResponse**](PostingModuleRulesUpdatedResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Posting Module with updated rules. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

