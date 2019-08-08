# PortfolioGroupsApi

All URIs are relative to *http://http:/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPortfolioToGroup**](PortfolioGroupsApi.md#addPortfolioToGroup) | **POST** /api/portfoliogroups/{scope}/{code}/portfolios | [EARLY ACCESS] Add portfolio to group
[**addSubGroupToGroup**](PortfolioGroupsApi.md#addSubGroupToGroup) | **POST** /api/portfoliogroups/{scope}/{code}/subgroups | [EARLY ACCESS] Add group to group
[**createPortfolioGroup**](PortfolioGroupsApi.md#createPortfolioGroup) | **POST** /api/portfoliogroups/{scope} | [EARLY ACCESS] Create group
[**deletePortfolioFromGroup**](PortfolioGroupsApi.md#deletePortfolioFromGroup) | **DELETE** /api/portfoliogroups/{scope}/{code}/portfolios/{portfolioScope}/{portfolioCode} | [EARLY ACCESS] Remove portfolio from group
[**deletePortfolioGroup**](PortfolioGroupsApi.md#deletePortfolioGroup) | **DELETE** /api/portfoliogroups/{scope}/{code} | [EARLY ACCESS] Delete group
[**deleteSubGroupFromGroup**](PortfolioGroupsApi.md#deleteSubGroupFromGroup) | **DELETE** /api/portfoliogroups/{scope}/{code}/subgroups/{subgroupScope}/{subgroupCode} | [EARLY ACCESS] Remove group from group
[**getPortfolioGroup**](PortfolioGroupsApi.md#getPortfolioGroup) | **GET** /api/portfoliogroups/{scope}/{code} | [EARLY ACCESS] Get portfolio group
[**getPortfolioGroupCommands**](PortfolioGroupsApi.md#getPortfolioGroupCommands) | **GET** /api/portfoliogroups/{scope}/{code}/commands | [EARLY ACCESS] Get commands
[**getPortfolioGroupExpansion**](PortfolioGroupsApi.md#getPortfolioGroupExpansion) | **GET** /api/portfoliogroups/{scope}/{code}/expansion | [EARLY ACCESS] Get a full expansion of a portfolio group
[**listPortfolioGroups**](PortfolioGroupsApi.md#listPortfolioGroups) | **GET** /api/portfoliogroups/{scope} | [EARLY ACCESS] List groups in scope
[**updatePortfolioGroup**](PortfolioGroupsApi.md#updatePortfolioGroup) | **PUT** /api/portfoliogroups/{scope}/{code} | [EARLY ACCESS] Update group


<a name="addPortfolioToGroup"></a>
# **addPortfolioToGroup**
> PortfolioGroup addPortfolioToGroup(scope, code, portfolioId)

[EARLY ACCESS] Add portfolio to group

Adds a portfolio to a previously defined portfolio group

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
    String scope = "scope_example"; // String | The scope of the portfolio group to which a portfolio is being added
    String code = "code_example"; // String | The code of the portfolio group to which a portfolio is being added
    ResourceId portfolioId = new ResourceId(); // ResourceId | The id of the portfolio
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
 **scope** | **String**| The scope of the portfolio group to which a portfolio is being added |
 **code** | **String**| The code of the portfolio group to which a portfolio is being added |
 **portfolioId** | [**ResourceId**](ResourceId.md)| The id of the portfolio | [optional]

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
**201** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="addSubGroupToGroup"></a>
# **addSubGroupToGroup**
> PortfolioGroup addSubGroupToGroup(scope, code, portfolioGroupId)

[EARLY ACCESS] Add group to group

Adds a portfolio group, as a sub-group, to an existing portfolio group

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
    String scope = "scope_example"; // String | The scope of the portfolio group to which a sub-group is being added
    String code = "code_example"; // String | The code of the portfolio group to which a sub-group is being added
    ResourceId portfolioGroupId = new ResourceId(); // ResourceId | The id of the portfolio group being added as a sub-group
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
 **scope** | **String**| The scope of the portfolio group to which a sub-group is being added |
 **code** | **String**| The code of the portfolio group to which a sub-group is being added |
 **portfolioGroupId** | [**ResourceId**](ResourceId.md)| The id of the portfolio group being added as a sub-group | [optional]

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
**201** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="createPortfolioGroup"></a>
# **createPortfolioGroup**
> PortfolioGroup createPortfolioGroup(scope, request)

[EARLY ACCESS] Create group

Create a new portfolio group.

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
    String scope = "scope_example"; // String | The scope into which the portfolio group will be created
    CreatePortfolioGroupRequest request = new CreatePortfolioGroupRequest(); // CreatePortfolioGroupRequest | The definition of the new portfolio group
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
 **scope** | **String**| The scope into which the portfolio group will be created |
 **request** | [**CreatePortfolioGroupRequest**](CreatePortfolioGroupRequest.md)| The definition of the new portfolio group | [optional]

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
**201** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deletePortfolioFromGroup"></a>
# **deletePortfolioFromGroup**
> PortfolioGroup deletePortfolioFromGroup(scope, code, portfolioScope, portfolioCode)

[EARLY ACCESS] Remove portfolio from group

Removes a portfolio from a portfolio group

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
    String scope = "scope_example"; // String | The scope of the portfolio group
    String code = "code_example"; // String | The code of the portfolio group
    String portfolioScope = "portfolioScope_example"; // String | The scope of the portfolio being removed
    String portfolioCode = "portfolioCode_example"; // String | The code of the portfolio being removed
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
 **scope** | **String**| The scope of the portfolio group |
 **code** | **String**| The code of the portfolio group |
 **portfolioScope** | **String**| The scope of the portfolio being removed |
 **portfolioCode** | **String**| The code of the portfolio being removed |

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
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deletePortfolioGroup"></a>
# **deletePortfolioGroup**
> DeletedEntityResponse deletePortfolioGroup(scope, code)

[EARLY ACCESS] Delete group

Deletes the definition of the specified portfolio group

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
    String scope = "scope_example"; // String | The scope of the portfolio group
    String code = "code_example"; // String | The code of the portfolio group
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
 **scope** | **String**| The scope of the portfolio group |
 **code** | **String**| The code of the portfolio group |

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

<a name="deleteSubGroupFromGroup"></a>
# **deleteSubGroupFromGroup**
> PortfolioGroup deleteSubGroupFromGroup(scope, code, subgroupScope, subgroupCode)

[EARLY ACCESS] Remove group from group

Remove a portfolio group (sub-group) from a parent portfolio group

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
    String scope = "scope_example"; // String | The scope of the portfolio group
    String code = "code_example"; // String | The code of the portfolio group
    String subgroupScope = "subgroupScope_example"; // String | The scope of the sub-group being removed
    String subgroupCode = "subgroupCode_example"; // String | The code of the sub-group being removed
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
 **scope** | **String**| The scope of the portfolio group |
 **code** | **String**| The code of the portfolio group |
 **subgroupScope** | **String**| The scope of the sub-group being removed |
 **subgroupCode** | **String**| The code of the sub-group being removed |

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
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioGroup"></a>
# **getPortfolioGroup**
> PortfolioGroup getPortfolioGroup(scope, code, asAt)

[EARLY ACCESS] Get portfolio group

Get the definition of the specified portfolio group

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
    String scope = "scope_example"; // String | The scope of the portfolio group
    String code = "code_example"; // String | The code of the portfolio group
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
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
 **scope** | **String**| The scope of the portfolio group |
 **code** | **String**| The code of the portfolio group |
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]

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
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioGroupCommands"></a>
# **getPortfolioGroupCommands**
> ResourceListOfProcessedCommand getPortfolioGroupCommands(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter)

[EARLY ACCESS] Get commands

Gets all commands that modified a specific portfolio group

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
    String scope = "scope_example"; // String | The scope of the portfolio group
    String code = "code_example"; // String | The code of the portfolio group
    OffsetDateTime fromAsAt = new OffsetDateTime(); // OffsetDateTime | Optional. Filters commands by those that were processed at or after this date and time
    OffsetDateTime toAsAt = new OffsetDateTime(); // OffsetDateTime | Optional. Filters commands by those that were processed at or before this date and time
    List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
    Integer start = 56; // Integer | Optional. When paginating, skip this number of results
    Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Optional. Expression to filter the result set
    try {
      ResourceListOfProcessedCommand result = apiInstance.getPortfolioGroupCommands(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter);
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
 **scope** | **String**| The scope of the portfolio group |
 **code** | **String**| The code of the portfolio group |
 **fromAsAt** | **OffsetDateTime**| Optional. Filters commands by those that were processed at or after this date and time | [optional]
 **toAsAt** | **OffsetDateTime**| Optional. Filters commands by those that were processed at or before this date and time | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

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
**200** | The commands that modified the specified portfolio group. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioGroupExpansion"></a>
# **getPortfolioGroupExpansion**
> ExpandedGroup getPortfolioGroupExpansion(scope, code, effectiveAt, asAt, propertyFilter)

[EARLY ACCESS] Get a full expansion of a portfolio group

Lists all portfolios in a group, and all sub groups. Portfolios are decorated with their properties.

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
    String scope = "scope_example"; // String | The scope of the portfolio
    String code = "code_example"; // String | The code of the portfolio
    OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | Optional. The effective date of the data
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
    List<String> propertyFilter = Arrays.asList(); // List<String> | Optional. The restricted set of properties that should be returned
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
 **scope** | **String**| The scope of the portfolio |
 **code** | **String**| The code of the portfolio |
 **effectiveAt** | **OffsetDateTime**| Optional. The effective date of the data | [optional]
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]
 **propertyFilter** | [**List&lt;String&gt;**](String.md)| Optional. The restricted set of properties that should be returned | [optional]

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
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listPortfolioGroups"></a>
# **listPortfolioGroups**
> ResourceListOfPortfolioGroup listPortfolioGroups(scope, asAt, sortBy, start, limit, filter)

[EARLY ACCESS] List groups in scope

Lists all portfolio groups in a specified scope

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
    String scope = "scope_example"; // String | The scope
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The AsAt date of the data
    List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
    Integer start = 56; // Integer | Optional. When paginating, skip this number of results
    Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Optional. Expression to filter the result set
    try {
      ResourceListOfPortfolioGroup result = apiInstance.listPortfolioGroups(scope, asAt, sortBy, start, limit, filter);
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
 **scope** | **String**| The scope |
 **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]

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
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="updatePortfolioGroup"></a>
# **updatePortfolioGroup**
> PortfolioGroup updatePortfolioGroup(scope, code, request)

[EARLY ACCESS] Update group

Update the definition of the specified existing portfolio group.    Not all elements within a portfolio group definition are modifiable after creation.

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
    String scope = "scope_example"; // String | The scope of the portfolio group
    String code = "code_example"; // String | The code of the portfolio group
    UpdatePortfolioGroupRequest request = new UpdatePortfolioGroupRequest(); // UpdatePortfolioGroupRequest | The updated definition of the portfolio group
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
 **scope** | **String**| The scope of the portfolio group |
 **code** | **String**| The code of the portfolio group |
 **request** | [**UpdatePortfolioGroupRequest**](UpdatePortfolioGroupRequest.md)| The updated definition of the portfolio group | [optional]

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
**201** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

