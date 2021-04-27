# PortfolioGroupsApi

All URIs are relative to *http://local-unit-test-server.lusid.com:40781*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPortfolioToGroup**](PortfolioGroupsApi.md#addPortfolioToGroup) | **POST** /api/portfoliogroups/{scope}/{code}/portfolios | [EARLY ACCESS] Add portfolio to group
[**addSubGroupToGroup**](PortfolioGroupsApi.md#addSubGroupToGroup) | **POST** /api/portfoliogroups/{scope}/{code}/subgroups | [EARLY ACCESS] Add sub group to group
[**buildTransactionsForPortfolioGroup**](PortfolioGroupsApi.md#buildTransactionsForPortfolioGroup) | **POST** /api/portfoliogroups/{scope}/{code}/transactions/$build | [EARLY ACCESS] Build transactions for transaction portfolios in a portfolio group
[**createPortfolioGroup**](PortfolioGroupsApi.md#createPortfolioGroup) | **POST** /api/portfoliogroups/{scope} | [EARLY ACCESS] Create portfolio group
[**deleteGroupProperties**](PortfolioGroupsApi.md#deleteGroupProperties) | **POST** /api/portfoliogroups/{scope}/{code}/properties/$delete | [EARLY ACCESS] Delete group properties
[**deletePortfolioFromGroup**](PortfolioGroupsApi.md#deletePortfolioFromGroup) | **DELETE** /api/portfoliogroups/{scope}/{code}/portfolios/{portfolioScope}/{portfolioCode} | [EARLY ACCESS] Delete portfolio from group
[**deletePortfolioGroup**](PortfolioGroupsApi.md#deletePortfolioGroup) | **DELETE** /api/portfoliogroups/{scope}/{code} | [EARLY ACCESS] Delete portfolio group
[**deleteSubGroupFromGroup**](PortfolioGroupsApi.md#deleteSubGroupFromGroup) | **DELETE** /api/portfoliogroups/{scope}/{code}/subgroups/{subgroupScope}/{subgroupCode} | [EARLY ACCESS] Delete sub group from group
[**getGroupProperties**](PortfolioGroupsApi.md#getGroupProperties) | **GET** /api/portfoliogroups/{scope}/{code}/properties | [EARLY ACCESS] Get group properties
[**getHoldingsForPortfolioGroup**](PortfolioGroupsApi.md#getHoldingsForPortfolioGroup) | **GET** /api/portfoliogroups/{scope}/{code}/holdings | [EARLY ACCESS] Get holdings for transaction portfolios in portfolio group
[**getPortfolioGroup**](PortfolioGroupsApi.md#getPortfolioGroup) | **GET** /api/portfoliogroups/{scope}/{code} | [EARLY ACCESS] Get portfolio group
[**getPortfolioGroupCommands**](PortfolioGroupsApi.md#getPortfolioGroupCommands) | **GET** /api/portfoliogroups/{scope}/{code}/commands | [EARLY ACCESS] Get portfolio group commands
[**getPortfolioGroupExpansion**](PortfolioGroupsApi.md#getPortfolioGroupExpansion) | **GET** /api/portfoliogroups/{scope}/{code}/expansion | [EARLY ACCESS] Get portfolio group expansion
[**getTransactionsForPortfolioGroup**](PortfolioGroupsApi.md#getTransactionsForPortfolioGroup) | **GET** /api/portfoliogroups/{scope}/{code}/transactions | [EARLY ACCESS] Get transactions for transaction portfolios in a portfolio group
[**listPortfolioGroups**](PortfolioGroupsApi.md#listPortfolioGroups) | **GET** /api/portfoliogroups/{scope} | [EARLY ACCESS] List portfolio groups
[**updatePortfolioGroup**](PortfolioGroupsApi.md#updatePortfolioGroup) | **PUT** /api/portfoliogroups/{scope}/{code} | [EARLY ACCESS] Update portfolio group
[**upsertGroupProperties**](PortfolioGroupsApi.md#upsertGroupProperties) | **POST** /api/portfoliogroups/{scope}/{code}/properties/$upsert | [EARLY ACCESS] Upsert group properties


<a name="addPortfolioToGroup"></a>
# **addPortfolioToGroup**
> PortfolioGroup addPortfolioToGroup(scope, code, effectiveAt, resourceId)

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to add a portfolio to.
    String code = "code_example"; // String | The code of the portfolio group to add a portfolio to. Together with the scope this uniquely identifies the portfolio group.
    OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The effective datetime from which the portfolio will be added to the group.
    ResourceId resourceId = {"scope":"MyScope","code":"MyCode"}; // ResourceId | The resource identifier of the portfolio to add to the portfolio group.
    try {
      PortfolioGroup result = apiInstance.addPortfolioToGroup(scope, code, effectiveAt, resourceId);
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
 **effectiveAt** | **OffsetDateTime**| The effective datetime from which the portfolio will be added to the group. | [optional]
 **resourceId** | [**ResourceId**](ResourceId.md)| The resource identifier of the portfolio to add to the portfolio group. | [optional]

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The portfolio group containing the newly added portfolio |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="addSubGroupToGroup"></a>
# **addSubGroupToGroup**
> PortfolioGroup addSubGroupToGroup(scope, code, effectiveAt, resourceId)

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to add a portfolio group to.
    String code = "code_example"; // String | The code of the portfolio group to add a portfolio group to. Together with the scope this uniquely identifies the portfolio group.
    OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The effective datetime from which the sub group will be added to the group.
    ResourceId resourceId = {"scope":"MyScope","code":"MyCode"}; // ResourceId | The resource identifier of the portfolio group to add to the portfolio group as a sub group.
    try {
      PortfolioGroup result = apiInstance.addSubGroupToGroup(scope, code, effectiveAt, resourceId);
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
 **effectiveAt** | **OffsetDateTime**| The effective datetime from which the sub group will be added to the group. | [optional]
 **resourceId** | [**ResourceId**](ResourceId.md)| The resource identifier of the portfolio group to add to the portfolio group as a sub group. | [optional]

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The portfolio group containing the newly added portfolio group as a sub group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="buildTransactionsForPortfolioGroup"></a>
# **buildTransactionsForPortfolioGroup**
> VersionedResourceListOfOutputTransaction buildTransactionsForPortfolioGroup(scope, code, transactionQueryParameters, asAt, filter, propertyKeys)

[EARLY ACCESS] Build transactions for transaction portfolios in a portfolio group

Build transactions for transaction portfolios in a portfolio group over a given interval of effective time.     When the specified portfolio in a portfolio group is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group.
    String code = "code_example"; // String | The code of the portfolio group. Together with the scope this uniquely identifies              the portfolio group.
    TransactionQueryParameters transactionQueryParameters = {"startDate":"2018-03-05T00:00:00.0000000+00:00","endDate":"2018-03-19T00:00:00.0000000+00:00","queryMode":"TradeDate","showCancelledTransactions":false}; // TransactionQueryParameters | The query queryParameters which control how the output transactions are built.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.              For example, to filter on the Transaction Type, use \"type eq 'Buy'\"              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" or \"Transaction\" domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or              \"Transaction/strategy/quantsignal\".
    try {
      VersionedResourceListOfOutputTransaction result = apiInstance.buildTransactionsForPortfolioGroup(scope, code, transactionQueryParameters, asAt, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#buildTransactionsForPortfolioGroup");
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
 **scope** | **String**| The scope of the portfolio group. |
 **code** | **String**| The code of the portfolio group. Together with the scope this uniquely identifies              the portfolio group. |
 **transactionQueryParameters** | [**TransactionQueryParameters**](TransactionQueryParameters.md)| The query queryParameters which control how the output transactions are built. |
 **asAt** | **OffsetDateTime**| The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set.              For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. | [optional]

### Return type

[**VersionedResourceListOfOutputTransaction**](VersionedResourceListOfOutputTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested transactions from transaction portfolios in the specified portfolio group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="createPortfolioGroup"></a>
# **createPortfolioGroup**
> PortfolioGroup createPortfolioGroup(scope, createPortfolioGroupRequest)

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope that the portfolio group will be created in.
    CreatePortfolioGroupRequest createPortfolioGroupRequest = {"code":"MyGroupCode","created":"2019-10-04T00:00:00.0000000+00:00","values":[{"scope":"MyScope","code":"MyPortfolioCode1"},{"scope":"MyScope","code":"MyPortfolioCode2"}],"subGroups":[{"scope":"MyScope","code":"MySubGroupCode"}],"properties":{},"displayName":"MyGroupName","description":"My group description"}; // CreatePortfolioGroupRequest | The definition and details of the portfolio group.
    try {
      PortfolioGroup result = apiInstance.createPortfolioGroup(scope, createPortfolioGroupRequest);
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
 **createPortfolioGroupRequest** | [**CreatePortfolioGroupRequest**](CreatePortfolioGroupRequest.md)| The definition and details of the portfolio group. | [optional]

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The newly created portfolio group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deleteGroupProperties"></a>
# **deleteGroupProperties**
> DeletedEntityResponse deleteGroupProperties(scope, code, requestBody, effectiveAt)

[EARLY ACCESS] Delete group properties

Delete one or more properties from a single portfolio group. If the properties are time variant then an effective date time from which the properties  will be deleted must be specified. If the properties are perpetual then it is invalid to specify an effective date time for deletion.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the group to delete properties from.
    String code = "code_example"; // String | The code of the group to delete properties from. Together with the scope this uniquely identifies the group.
    List<String> requestBody = ["PortfolioGroup/MyScope/MyPropertyName","PortfolioGroup/MyScope/MyPropertyName2"]; // List<String> | The property keys of the properties to delete. These take the format              {domain}/{scope}/{code} e.g. \"PortfolioGroup/Manager/Id\". Each property must be from the \"PortfolioGroup\" domain.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to delete the properties.
    try {
      DeletedEntityResponse result = apiInstance.deleteGroupProperties(scope, code, requestBody, effectiveAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#deleteGroupProperties");
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
 **scope** | **String**| The scope of the group to delete properties from. |
 **code** | **String**| The code of the group to delete properties from. Together with the scope this uniquely identifies the group. |
 **requestBody** | [**List&lt;String&gt;**](String.md)| The property keys of the properties to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;. Each property must be from the \&quot;PortfolioGroup\&quot; domain. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to delete the properties. | [optional]

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The datetime that the properties were deleted from the specified group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deletePortfolioFromGroup"></a>
# **deletePortfolioFromGroup**
> PortfolioGroup deletePortfolioFromGroup(scope, code, portfolioScope, portfolioCode, effectiveAt)

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to remove the portfolio from.
    String code = "code_example"; // String | The code of the portfolio group to remove the portfolio from. Together with the scope this uniquely identifies the portfolio group.
    String portfolioScope = "portfolioScope_example"; // String | The scope of the portfolio being removed from the portfolio group.
    String portfolioCode = "portfolioCode_example"; // String | The code of the portfolio being removed from the portfolio group. Together with the scope this uniquely identifies the portfolio to remove.
    OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The effective datetime from which the portfolio will be removed from the portfolio group.
    try {
      PortfolioGroup result = apiInstance.deletePortfolioFromGroup(scope, code, portfolioScope, portfolioCode, effectiveAt);
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
 **effectiveAt** | **OffsetDateTime**| The effective datetime from which the portfolio will be removed from the portfolio group. | [optional]

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

Delete a single portfolio group. A portfolio group can be deleted while it still contains portfolios or sub groups.  In this case any portfolios or sub groups contained in this group will not be deleted, however they will no longer be grouped together by this portfolio group.  The deletion will be valid from the portfolio group&#39;s creation datetime, ie. the portfolio group will no longer exist at any effective datetime from the asAt datetime of deletion.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
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
> PortfolioGroup deleteSubGroupFromGroup(scope, code, subgroupScope, subgroupCode, effectiveAt)

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to remove the sub group from.
    String code = "code_example"; // String | The code of the portfolio group to remove the sub group from. Together with the scope this uniquely identifies the portfolio group.
    String subgroupScope = "subgroupScope_example"; // String | The scope of the sub group to remove from the portfolio group.
    String subgroupCode = "subgroupCode_example"; // String | The code of the sub group to remove from the portfolio group. Together with the scope this uniquely identifies the sub group.
    OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The effective datetime from which the sub group will be removed from the portfolio group.
    try {
      PortfolioGroup result = apiInstance.deleteSubGroupFromGroup(scope, code, subgroupScope, subgroupCode, effectiveAt);
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
 **effectiveAt** | **OffsetDateTime**| The effective datetime from which the sub group will be removed from the portfolio group. | [optional]

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

<a name="getGroupProperties"></a>
# **getGroupProperties**
> PortfolioGroupProperties getGroupProperties(scope, code, effectiveAt, asAt)

[EARLY ACCESS] Get group properties

List all the properties of a single portfolio group.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the group to list the properties for.
    String code = "code_example"; // String | The code of the group to list the properties for. Together with the scope this uniquely identifies the group.
    String effectiveAt = "effectiveAt_example"; // String | The effective date time or cut label at which to list the group's properties. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt date time at which to list the group's properties. Defaults to return the latest version of each property if not specified.
    try {
      PortfolioGroupProperties result = apiInstance.getGroupProperties(scope, code, effectiveAt, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#getGroupProperties");
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
 **scope** | **String**| The scope of the group to list the properties for. |
 **code** | **String**| The code of the group to list the properties for. Together with the scope this uniquely identifies the group. |
 **effectiveAt** | **String**| The effective date time or cut label at which to list the group&#39;s properties. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt date time at which to list the group&#39;s properties. Defaults to return the latest version of each property if not specified. | [optional]

### Return type

[**PortfolioGroupProperties**](PortfolioGroupProperties.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The properties of the specified group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getHoldingsForPortfolioGroup"></a>
# **getHoldingsForPortfolioGroup**
> VersionedResourceListOfPortfolioHolding getHoldingsForPortfolioGroup(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots)

[EARLY ACCESS] Get holdings for transaction portfolios in portfolio group

Get the holdings of transaction portfolios in specified portfolio group.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group.
    String code = "code_example"; // String | The code of the portfolio group. Together with the scope this uniquely identifies              the portfolio group.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the holdings of transaction              portfolios in the portfolio group. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the holdings of transaction portfolios in the portfolio group. Defaults              to return the latest version of the holdings if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" or \"Holding\" domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or \"Holding/system/Cost\".
    Boolean byTaxlots = true; // Boolean | Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False.
    try {
      VersionedResourceListOfPortfolioHolding result = apiInstance.getHoldingsForPortfolioGroup(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#getHoldingsForPortfolioGroup");
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
 **scope** | **String**| The scope of the portfolio group. |
 **code** | **String**| The code of the portfolio group. Together with the scope this uniquely identifies              the portfolio group. |
 **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the holdings of transaction              portfolios in the portfolio group. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the holdings of transaction portfolios in the portfolio group. Defaults              to return the latest version of the holdings if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; or \&quot;Holding\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. | [optional]
 **byTaxlots** | **Boolean**| Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. | [optional]

### Return type

[**VersionedResourceListOfPortfolioHolding**](VersionedResourceListOfPortfolioHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The holdings of transaction portfolios in a specific version of portfolio group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getPortfolioGroup"></a>
# **getPortfolioGroup**
> PortfolioGroup getPortfolioGroup(scope, code, effectiveAt, asAt)

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to retrieve the definition for.
    String code = "code_example"; // String | The code of the portfolio group to retrieve the definition for. Together with the scope              this uniquely identifies the portfolio group.
    OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The effective datetime at which to retrieve the portfolio group definition. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio group definition. Defaults to return              the latest version of the portfolio group definition if not specified.
    try {
      PortfolioGroup result = apiInstance.getPortfolioGroup(scope, code, effectiveAt, asAt);
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
 **effectiveAt** | **OffsetDateTime**| The effective datetime at which to retrieve the portfolio group definition. Defaults to the current LUSID system datetime if not specified. | [optional]
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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to retrieve the commands for.
    String code = "code_example"; // String | The code of the portfolio group to retrieve the commands for. Together with the scope this uniquely identifies the portfolio group.
    OffsetDateTime fromAsAt = new OffsetDateTime(); // OffsetDateTime | The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified.
    OffsetDateTime toAsAt = new OffsetDateTime(); // OffsetDateTime | The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.                For example, to filter on the User ID, use \"userId.id eq 'string'\"              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
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
 **filter** | **String**| Expression to filter the result set.                For example, to filter on the User ID, use \&quot;userId.id eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
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

<a name="getTransactionsForPortfolioGroup"></a>
# **getTransactionsForPortfolioGroup**
> VersionedResourceListOfTransaction getTransactionsForPortfolioGroup(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys)

[EARLY ACCESS] Get transactions for transaction portfolios in a portfolio group

Get transactions for transaction portfolios in a portfolio group over a given interval of effective time.     When the specified portfolio in a portfolio group is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group.
    String code = "code_example"; // String | The code of the portfolio group. Together with the scope this uniquely identifies              the portfolio group.
    String fromTransactionDate = "fromTransactionDate_example"; // String | The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.              There is no lower bound if this is not specified.
    String toTransactionDate = "toTransactionDate_example"; // String | The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to retrieve the transactions. Defaults to return the latest version              of each transaction if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.               For example, to filter on the Transaction Type, use \"type eq 'Buy'\"              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Instrument\" or \"Transaction\" domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \"Instrument/system/Name\" or              \"Transaction/strategy/quantsignal\".
    try {
      VersionedResourceListOfTransaction result = apiInstance.getTransactionsForPortfolioGroup(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#getTransactionsForPortfolioGroup");
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
 **scope** | **String**| The scope of the portfolio group. |
 **code** | **String**| The code of the portfolio group. Together with the scope this uniquely identifies              the portfolio group. |
 **fromTransactionDate** | **String**| The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.              There is no lower bound if this is not specified. | [optional]
 **toTransactionDate** | **String**| The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transactions. Defaults to return the latest version              of each transaction if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set.               For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]
 **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. | [optional]

### Return type

[**VersionedResourceListOfTransaction**](VersionedResourceListOfTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested transactions from transaction portfolios in the specified portfolio group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listPortfolioGroups"></a>
# **listPortfolioGroups**
> ResourceListOfPortfolioGroup listPortfolioGroups(scope, effectiveAt, asAt, filter)

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope to list the portfolio groups in.
    OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The effective datetime at which to list the portfolio groups. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The asAt datetime at which to list the portfolio groups. Defaults to return the latest version of each portfolio group if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.              For example, to filter on the Display Name, use \"displayName eq 'string'\"              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      ResourceListOfPortfolioGroup result = apiInstance.listPortfolioGroups(scope, effectiveAt, asAt, filter);
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
 **effectiveAt** | **OffsetDateTime**| The effective datetime at which to list the portfolio groups. Defaults to the current LUSID system datetime if not specified. | [optional]
 **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolio groups. Defaults to return the latest version of each portfolio group if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set.              For example, to filter on the Display Name, use \&quot;displayName eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

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
> PortfolioGroup updatePortfolioGroup(scope, code, effectiveAt, updatePortfolioGroupRequest)

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the portfolio group to update the definition for.
    String code = "code_example"; // String | The code of the portfolio group to update the definition for. Together with the scope this uniquely identifies the portfolio group.
    OffsetDateTime effectiveAt = new OffsetDateTime(); // OffsetDateTime | The effective datetime at which to update the definition.
    UpdatePortfolioGroupRequest updatePortfolioGroupRequest = {"displayName":"MyGroupName","description":"My Group Description"}; // UpdatePortfolioGroupRequest | The updated portfolio group definition.
    try {
      PortfolioGroup result = apiInstance.updatePortfolioGroup(scope, code, effectiveAt, updatePortfolioGroupRequest);
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
 **effectiveAt** | **OffsetDateTime**| The effective datetime at which to update the definition. | [optional]
 **updatePortfolioGroupRequest** | [**UpdatePortfolioGroupRequest**](UpdatePortfolioGroupRequest.md)| The updated portfolio group definition. | [optional]

### Return type

[**PortfolioGroup**](PortfolioGroup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The updated definition of the portfolio group |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="upsertGroupProperties"></a>
# **upsertGroupProperties**
> PortfolioGroupProperties upsertGroupProperties(scope, code, requestBody)

[EARLY ACCESS] Upsert group properties

Update or insert one or more properties onto a single group. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;PortfolioGroup&#39;.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

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
    defaultClient.setBasePath("http://local-unit-test-server.lusid.com:40781");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    PortfolioGroupsApi apiInstance = new PortfolioGroupsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the group to update or insert the properties onto.
    String code = "code_example"; // String | The code of the group to update or insert the properties onto. Together with the scope this uniquely identifies the group.
    Map<String, Property> requestBody = {"portfolioGroup/MyScope/FundManagerName":{"key":"PortfolioGroup/MyScope/FundManagerName","value":{"labelValue":"Smith"},"effectiveFrom":"2018-03-05T00:00:00.0000000+00:00"},"portfolioGroup/MyScope/SomeProperty":{"key":"PortfolioGroup/MyScope/SomeProperty","value":{"labelValue":"SomeValue"},"effectiveFrom":"2016-01-01T00:00:00.0000000+00:00"},"portfolioGroup/MyScope/AnotherProperty":{"key":"PortfolioGroup/MyScope/AnotherProperty","value":{"labelValue":"AnotherValue"},"effectiveFrom":"2018-03-05T00:00:00.0000000+00:00","effectiveUntil":"2020-01-01T00:00:00.0000000+00:00"},"portfolioGroup/MyScope/ReBalanceInterval":{"key":"PortfolioGroup/MyScope/ReBalanceInterval","value":{"metricValue":{"value":30,"unit":"Days"}}}}; // Map<String, Property> | The properties to be updated or inserted onto the group. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \"PortfolioGroup/Manager/Id\".
    try {
      PortfolioGroupProperties result = apiInstance.upsertGroupProperties(scope, code, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortfolioGroupsApi#upsertGroupProperties");
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
 **scope** | **String**| The scope of the group to update or insert the properties onto. |
 **code** | **String**| The code of the group to update or insert the properties onto. Together with the scope this uniquely identifies the group. |
 **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be updated or inserted onto the group. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;. | [optional]

### Return type

[**PortfolioGroupProperties**](PortfolioGroupProperties.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The updated or inserted properties |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

