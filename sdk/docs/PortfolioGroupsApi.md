# PortfolioGroupsApi

All URIs are relative to *http://http:/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPortfolioToGroup**](PortfolioGroupsApi.md#addPortfolioToGroup) | **POST** /api/portfoliogroups/{scope}/{code}/portfolios | [EARLY ACCESS] Add portfolio to group
[**addSubGroupToGroup**](PortfolioGroupsApi.md#addSubGroupToGroup) | **POST** /api/portfoliogroups/{scope}/{code}/subgroups | [EARLY ACCESS] Add sub group to group
[**createPortfolioGroup**](PortfolioGroupsApi.md#createPortfolioGroup) | **POST** /api/portfoliogroups/{scope} | [EARLY ACCESS] Create portfolio group
[**deletePortfolioFromGroup**](PortfolioGroupsApi.md#deletePortfolioFromGroup) | **DELETE** /api/portfoliogroups/{scope}/{code}/portfolios/{portfolioScope}/{portfolioCode} | [EARLY ACCESS] Delete portfolio from group
[**deletePortfolioGroup**](PortfolioGroupsApi.md#deletePortfolioGroup) | **DELETE** /api/portfoliogroups/{scope}/{code} | [EARLY ACCESS] Delete portfolio group
[**deleteSubGroupFromGroup**](PortfolioGroupsApi.md#deleteSubGroupFromGroup) | **DELETE** /api/portfoliogroups/{scope}/{code}/subgroups/{subgroupScope}/{subgroupCode} | [EARLY ACCESS] Delete sub group from group
[**getPortfolioGroup**](PortfolioGroupsApi.md#getPortfolioGroup) | **GET** /api/portfoliogroups/{scope}/{code} | [EARLY ACCESS] Get portfolio group
[**getPortfolioGroupCommands**](PortfolioGroupsApi.md#getPortfolioGroupCommands) | **GET** /api/portfoliogroups/{scope}/{code}/commands | [EARLY ACCESS] Get portfolio group commands
[**getPortfolioGroupExpansion**](PortfolioGroupsApi.md#getPortfolioGroupExpansion) | **GET** /api/portfoliogroups/{scope}/{code}/expansion | [EARLY ACCESS] Get portfolio group expansion
[**listPortfolioGroups**](PortfolioGroupsApi.md#listPortfolioGroups) | **GET** /api/portfoliogroups/{scope} | [EARLY ACCESS] List portfolio groups
[**updatePortfolioGroup**](PortfolioGroupsApi.md#updatePortfolioGroup) | **PUT** /api/portfoliogroups/{scope}/{code} | [EARLY ACCESS] Update portfolio group


<a name="addPortfolioToGroup"></a>
# **addPortfolioToGroup**
> PortfolioGroup addPortfolioToGroup(scope, code, portfolioId)

[EARLY ACCESS] Add portfolio to group

Add a single portfolio to a portfolio group.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to add a portfolio to.
    String code = "code_example"; // String | The code of the portfolio group to add a portfolio to. Together with the scope this uniquely identifies the portfolio group.
    ResourceId portfolioId = new ResourceId(); // ResourceId | The resource identifier of the portfolio to add to the portfolio group.
    try {
      PortfolioGroup result = apiInstance.addPortfolioToGroup(scope, code, portfolioId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#addPortfolioToGroup");
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
 **scope** | **String**| The scope of the portfolio group to add a portfolio to. |
 **code** | **String**| The code of the portfolio group to add a portfolio to. Together with the scope this uniquely identifies the portfolio group. |
 **portfolioId** | [**ResourceId**](ResourceId.md)| The resource identifier of the portfolio to add to the portfolio group. | [optional]

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The portfolio group containing the newly added portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="addSubGroupToGroup"></a>
# **addSubGroupToGroup**
> PortfolioGroup addSubGroupToGroup(scope, code, portfolioGroupId)

[EARLY ACCESS] Add sub group to group

Add a portfolio group to a portfolio group as a sub group.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to add a portfolio group to.
    String code = "code_example"; // String | The code of the portfolio group to add a portfolio group to. Together with the scope this uniquely identifies the portfolio group.
    ResourceId portfolioGroupId = new ResourceId(); // ResourceId | The resource identifier of the portfolio group to add to the portfolio group as a sub group.
    try {
      PortfolioGroup result = apiInstance.addSubGroupToGroup(scope, code, portfolioGroupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#addSubGroupToGroup");
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
 **scope** | **String**| The scope of the portfolio group to add a portfolio group to. |
 **code** | **String**| The code of the portfolio group to add a portfolio group to. Together with the scope this uniquely identifies the portfolio group. |
 **portfolioGroupId** | [**ResourceId**](ResourceId.md)| The resource identifier of the portfolio group to add to the portfolio group as a sub group. | [optional]

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The portfolio group containing the newly added portfolio group as a sub group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="createPortfolioGroup"></a>
# **createPortfolioGroup**
> PortfolioGroup createPortfolioGroup(scope, request)

[EARLY ACCESS] Create portfolio group

Create a portfolio group in a specific scope.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that the portfolio group will be created in.
    CreatePortfolioGroupRequest request = new CreatePortfolioGroupRequest(); // CreatePortfolioGroupRequest | The definition and details of the portfolio group.
    try {
      PortfolioGroup result = apiInstance.createPortfolioGroup(scope, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#createPortfolioGroup");
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
 **scope** | **String**| The scope that the portfolio group will be created in. |
 **request** | [**CreatePortfolioGroupRequest**](CreatePortfolioGroupRequest.md)| The definition and details of the portfolio group. | [optional]

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The newly created portfolio group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deletePortfolioFromGroup"></a>
# **deletePortfolioFromGroup**
> PortfolioGroup deletePortfolioFromGroup(scope, code, portfolioScope, portfolioCode)

[EARLY ACCESS] Delete portfolio from group

Remove a single portfolio from a portfolio group.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to remove the portfolio from.
    String code = "code_example"; // String | The code of the portfolio group to remove the portfolio from. Together with the scope this uniquely identifies the portfolio group.
    String portfolioScope = "portfolioScope_example"; // String | The scope of the portfolio being removed from the portfolio group.
    String portfolioCode = "portfolioCode_example"; // String | The code of the portfolio being removed from the portfolio group. Together with the scope this uniquely identifies the portfolio to remove.
    try {
      PortfolioGroup result = apiInstance.deletePortfolioFromGroup(scope, code, portfolioScope, portfolioCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#deletePortfolioFromGroup");
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
 **scope** | **String**| The scope of the portfolio group to remove the portfolio from. |
 **code** | **String**| The code of the portfolio group to remove the portfolio from. Together with the scope this uniquely identifies the portfolio group. |
 **portfolioScope** | **String**| The scope of the portfolio being removed from the portfolio group. |
 **portfolioCode** | **String**| The code of the portfolio being removed from the portfolio group. Together with the scope this uniquely identifies the portfolio to remove. |

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The portfolio group with the portfolio removed from the group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deletePortfolioGroup"></a>
# **deletePortfolioGroup**
> DeletedEntityResponse deletePortfolioGroup(scope, code)

[EARLY ACCESS] Delete portfolio group

Delete a single portfolio group. A portfolio group can be deleted while it still contains portfolios or sub groups.  In this case any portfolios or sub groups contained in this group will not be deleted however they will no longer be grouped together by this portfolio group.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to delete.
    String code = "code_example"; // String | The code of the portfolio group to delete. Together with the scope this uniquely identifies the portfolio group to delete.
    try {
      DeletedEntityResponse result = apiInstance.deletePortfolioGroup(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#deletePortfolioGroup");
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
 **scope** | **String**| The scope of the portfolio group to delete. |
 **code** | **String**| The code of the portfolio group to delete. Together with the scope this uniquely identifies the portfolio group to delete. |

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
**200** | The datetime that the portfolio group was deleted |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deleteSubGroupFromGroup"></a>
# **deleteSubGroupFromGroup**
> PortfolioGroup deleteSubGroupFromGroup(scope, code, subgroupScope, subgroupCode)

[EARLY ACCESS] Delete sub group from group

Remove a single portfolio group (sub group) from a portfolio group.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to remove the sub group from.
    String code = "code_example"; // String | The code of the portfolio group to remove the sub group from. Together with the scope this uniquely identifies the portfolio group.
    String subgroupScope = "subgroupScope_example"; // String | The scope of the sub group to remove from the portfolio group.
    String subgroupCode = "subgroupCode_example"; // String | The code of the sub group to remove from the portfolio group. Together with the scope this uniquely identifies the sub group.
    try {
      PortfolioGroup result = apiInstance.deleteSubGroupFromGroup(scope, code, subgroupScope, subgroupCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#deleteSubGroupFromGroup");
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
 **scope** | **String**| The scope of the portfolio group to remove the sub group from. |
 **code** | **String**| The code of the portfolio group to remove the sub group from. Together with the scope this uniquely identifies the portfolio group. |
 **subgroupScope** | **String**| The scope of the sub group to remove from the portfolio group. |
 **subgroupCode** | **String**| The code of the sub group to remove from the portfolio group. Together with the scope this uniquely identifies the sub group. |

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The portfolio group with the sub group removed from the group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioGroup"></a>
# **getPortfolioGroup**
> PortfolioGroup getPortfolioGroup(scope, code, asAt)

[EARLY ACCESS] Get portfolio group

Retrieve the definition of a single portfolio group.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to retrieve the definition for.
    String code = "code_example"; // String | The code of the portfolio group to retrieve the definition for. Together with the scope              this uniquely identifies the portfolio group.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio group definition. Defaults to return              the latest version of the portfolio group definition if not specified.
    try {
      PortfolioGroup result = apiInstance.getPortfolioGroup(scope, code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#getPortfolioGroup");
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
 **scope** | **String**| The scope of the portfolio group to retrieve the definition for. |
 **code** | **String**| The code of the portfolio group to retrieve the definition for. Together with the scope              this uniquely identifies the portfolio group. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio group definition. Defaults to return              the latest version of the portfolio group definition if not specified. | [optional]

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested portfolio group definition |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioGroupCommands"></a>
# **getPortfolioGroupCommands**
> ResourceListOfProcessedCommand getPortfolioGroupCommands(scope, code, fromAsAt, toAsAt, filter)

[EARLY ACCESS] Get portfolio group commands

Gets all the commands that modified a single portfolio group.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to retrieve the commands for.
    String code = "code_example"; // String | The code of the portfolio group to retrieve the commands for. Together with the scope this uniquely identifies the portfolio group.
    OffsetDateTime fromAsAt = new OffsetDateTime(); // OffsetDateTime | The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified.
    OffsetDateTime toAsAt = new OffsetDateTime(); // OffsetDateTime | The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      ResourceListOfProcessedCommand result = apiInstance.getPortfolioGroupCommands(scope, code, fromAsAt, toAsAt, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#getPortfolioGroupCommands");
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
 **scope** | **String**| The scope of the portfolio group to retrieve the commands for. |
 **code** | **String**| The code of the portfolio group to retrieve the commands for. Together with the scope this uniquely identifies the portfolio group. |
 **fromAsAt** | **OffsetDateTime**| The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified. | [optional]
 **toAsAt** | **OffsetDateTime**| The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

### Return type

[**ResourceListOfProcessedCommand**](ResourceListOfProcessedCommand.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The commands that modified the specified portfolio group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioGroupExpansion"></a>
# **getPortfolioGroupExpansion**
> ExpandedGroup getPortfolioGroupExpansion(scope, code, effectiveAt, asAt, propertyFilter)

[EARLY ACCESS] Get portfolio group expansion

List all the portfolios in a group, including all portfolios within sub groups in the group. Each portfolio will be decorated with all of its properties unless a property filter is specified.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to expand.
    String code = "code_example"; // String | The code of the portfolio group to expand. Together with the scope this uniquely identifies the portfolio              group to expand.
    OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The effective datetime at which to expand the portfolio group. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to expand the portfolio group. Defaults to return the latest version of each portfolio in the group if not specified.
    List<String> propertyFilter = Arrays.asList(); // List<String> | The restricted list of property keys from the \"Portfolio\" domain which will be decorated onto each portfolio. These take the format {domain}/{scope}/{code} e.g. \"Portfolio/Manager/Id\".
    try {
      ExpandedGroup result = apiInstance.getPortfolioGroupExpansion(scope, code, effectiveAt, asAt, propertyFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#getPortfolioGroupExpansion");
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
 **scope** | **String**| The scope of the portfolio group to expand. |
 **code** | **String**| The code of the portfolio group to expand. Together with the scope this uniquely identifies the portfolio              group to expand. |
 **effectiveAt** | **OffsetDateTime**| The effective datetime at which to expand the portfolio group. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to expand the portfolio group. Defaults to return the latest version of each portfolio in the group if not specified. | [optional]
 **propertyFilter** | [**List&lt;String&gt;**](String.md)| The restricted list of property keys from the \&quot;Portfolio\&quot; domain which will be decorated onto each portfolio. These take the format {domain}/{scope}/{code} e.g. \&quot;Portfolio/Manager/Id\&quot;. | [optional]

### Return type

[**ExpandedGroup**](ExpandedGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The expanded portfolio group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listPortfolioGroups"></a>
# **listPortfolioGroups**
> ResourceListOfPortfolioGroup listPortfolioGroups(scope, asAt, filter)

[EARLY ACCESS] List portfolio groups

List all the portfolio groups in a single scope.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope to list the portfolio groups in.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to list the portfolio groups. Defaults to return the latest version of each portfolio group if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      ResourceListOfPortfolioGroup result = apiInstance.listPortfolioGroups(scope, asAt, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#listPortfolioGroups");
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
 **scope** | **String**| The scope to list the portfolio groups in. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolio groups. Defaults to return the latest version of each portfolio group if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

### Return type

[**ResourceListOfPortfolioGroup**](ResourceListOfPortfolioGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The portfolio groups in the specified scope |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="updatePortfolioGroup"></a>
# **updatePortfolioGroup**
> PortfolioGroup updatePortfolioGroup(scope, code, request)

[EARLY ACCESS] Update portfolio group

Update the definition of a single portfolio group. Not all elements within a portfolio group definition are modifiable  due to the potential implications for data already stored against the portfolio group.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.PortfolioGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to update the definition for.
    String code = "code_example"; // String | The code of the portfolio group to update the definition for. Together with the scope this uniquely identifies the portfolio group.
    UpdatePortfolioGroupRequest request = new UpdatePortfolioGroupRequest(); // UpdatePortfolioGroupRequest | The updated portfolio group definition.
    try {
      PortfolioGroup result = apiInstance.updatePortfolioGroup(scope, code, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#updatePortfolioGroup");
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
 **scope** | **String**| The scope of the portfolio group to update the definition for. |
 **code** | **String**| The code of the portfolio group to update the definition for. Together with the scope this uniquely identifies the portfolio group. |
 **request** | [**UpdatePortfolioGroupRequest**](UpdatePortfolioGroupRequest.md)| The updated portfolio group definition. | [optional]

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The updated definition of the portfolio group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

