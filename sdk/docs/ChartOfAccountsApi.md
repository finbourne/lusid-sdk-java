# ChartOfAccountsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChartOfAccounts**](ChartOfAccountsApi.md#createChartOfAccounts) | **POST** /api/chartofaccounts/{scope} | [EXPERIMENTAL] CreateChartOfAccounts: Create a Chart of Accounts |
| [**createCleardownModule**](ChartOfAccountsApi.md#createCleardownModule) | **POST** /api/chartofaccounts/{scope}/{code}/cleardownmodules | [EXPERIMENTAL] CreateCleardownModule: Create a Cleardown Module |
| [**createGeneralLedgerProfile**](ChartOfAccountsApi.md#createGeneralLedgerProfile) | **POST** /api/chartofaccounts/{scope}/{code}/generalledgerprofile | [EXPERIMENTAL] CreateGeneralLedgerProfile: Create a General Ledger Profile. |
| [**createPostingModule**](ChartOfAccountsApi.md#createPostingModule) | **POST** /api/chartofaccounts/{scope}/{code}/postingmodules | [EXPERIMENTAL] CreatePostingModule: Create a Posting Module |
| [**deleteAccounts**](ChartOfAccountsApi.md#deleteAccounts) | **POST** /api/chartofaccounts/{scope}/{code}/accounts/$delete | [EXPERIMENTAL] DeleteAccounts: Soft or hard delete multiple accounts |
| [**deleteChartOfAccounts**](ChartOfAccountsApi.md#deleteChartOfAccounts) | **DELETE** /api/chartofaccounts/{scope}/{code} | [EXPERIMENTAL] DeleteChartOfAccounts: Delete a Chart of Accounts |
| [**deleteCleardownModule**](ChartOfAccountsApi.md#deleteCleardownModule) | **DELETE** /api/chartofaccounts/{scope}/{code}/cleardownmodules/{cleardownModuleCode} | [EXPERIMENTAL] DeleteCleardownModule: Delete a Cleardown Module. |
| [**deleteGeneralLedgerProfile**](ChartOfAccountsApi.md#deleteGeneralLedgerProfile) | **DELETE** /api/chartofaccounts/{scope}/{code}/generalledgerprofile/{generalLedgerProfileCode} | [EXPERIMENTAL] DeleteGeneralLedgerProfile: Delete a General Ledger Profile. |
| [**deletePostingModule**](ChartOfAccountsApi.md#deletePostingModule) | **DELETE** /api/chartofaccounts/{scope}/{code}/postingmodules/{postingModuleCode} | [EXPERIMENTAL] DeletePostingModule: Delete a Posting Module. |
| [**getAccount**](ChartOfAccountsApi.md#getAccount) | **GET** /api/chartofaccounts/{scope}/{code}/accounts/{accountCode} | [EXPERIMENTAL] GetAccount: Get Account |
| [**getChartOfAccounts**](ChartOfAccountsApi.md#getChartOfAccounts) | **GET** /api/chartofaccounts/{scope}/{code} | [EXPERIMENTAL] GetChartOfAccounts: Get ChartOfAccounts |
| [**getCleardownModule**](ChartOfAccountsApi.md#getCleardownModule) | **GET** /api/chartofaccounts/{scope}/{code}/cleardownmodules/{cleardownModuleCode} | [EXPERIMENTAL] GetCleardownModule: Get a Cleardown Module |
| [**getGeneralLedgerProfile**](ChartOfAccountsApi.md#getGeneralLedgerProfile) | **GET** /api/chartofaccounts/{scope}/{code}/generalledgerprofile/{generalLedgerProfileCode} | [EXPERIMENTAL] GetGeneralLedgerProfile: Get a General Ledger Profile. |
| [**getPostingModule**](ChartOfAccountsApi.md#getPostingModule) | **GET** /api/chartofaccounts/{scope}/{code}/postingmodules/{postingModuleCode} | [EXPERIMENTAL] GetPostingModule: Get a Posting Module |
| [**listAccounts**](ChartOfAccountsApi.md#listAccounts) | **GET** /api/chartofaccounts/{scope}/{code}/accounts | [EXPERIMENTAL] ListAccounts: List Accounts |
| [**listChartsOfAccounts**](ChartOfAccountsApi.md#listChartsOfAccounts) | **GET** /api/chartofaccounts | [EXPERIMENTAL] ListChartsOfAccounts: List Charts of Accounts |
| [**listCleardownModuleRules**](ChartOfAccountsApi.md#listCleardownModuleRules) | **GET** /api/chartofaccounts/{scope}/{code}/cleardownmodules/{cleardownModuleCode}/cleardownrules | [EXPERIMENTAL] ListCleardownModuleRules: List Cleardown Module Rules |
| [**listCleardownModules**](ChartOfAccountsApi.md#listCleardownModules) | **GET** /api/chartofaccounts/{scope}/{code}/cleardownmodules | [EXPERIMENTAL] ListCleardownModules: List Cleardown Modules |
| [**listGeneralLedgerProfiles**](ChartOfAccountsApi.md#listGeneralLedgerProfiles) | **GET** /api/chartofaccounts/{scope}/{code}/generalledgerprofile | [EXPERIMENTAL] ListGeneralLedgerProfiles: List General Ledger Profiles. |
| [**listPostingModuleRules**](ChartOfAccountsApi.md#listPostingModuleRules) | **GET** /api/chartofaccounts/{scope}/{code}/postingmodules/{postingModuleCode}/postingrules | [EXPERIMENTAL] ListPostingModuleRules: List Posting Module Rules |
| [**listPostingModules**](ChartOfAccountsApi.md#listPostingModules) | **GET** /api/chartofaccounts/{scope}/{code}/postingmodules | [EXPERIMENTAL] ListPostingModules: List Posting Modules |
| [**setCleardownModuleDetails**](ChartOfAccountsApi.md#setCleardownModuleDetails) | **PUT** /api/chartofaccounts/{scope}/{code}/cleardownmodules/{cleardownModuleCode} | [EXPERIMENTAL] SetCleardownModuleDetails: Set the details of a Cleardown Module |
| [**setCleardownModuleRules**](ChartOfAccountsApi.md#setCleardownModuleRules) | **PUT** /api/chartofaccounts/{scope}/{code}/cleardownmodules/{cleardownModuleCode}/cleardownrules | [EXPERIMENTAL] SetCleardownModuleRules: Set the rules of a Cleardown Module |
| [**setGeneralLedgerProfileMappings**](ChartOfAccountsApi.md#setGeneralLedgerProfileMappings) | **PUT** /api/chartofaccounts/{scope}/{code}/generalledgerprofile/{generalLedgerProfileCode}/mappings | [EXPERIMENTAL] SetGeneralLedgerProfileMappings: Sets the General Ledger Profile Mappings. |
| [**setPostingModuleDetails**](ChartOfAccountsApi.md#setPostingModuleDetails) | **PUT** /api/chartofaccounts/{scope}/{code}/postingmodules/{postingModuleCode} | [EXPERIMENTAL] SetPostingModuleDetails: Set the details of a Posting Module |
| [**setPostingModuleRules**](ChartOfAccountsApi.md#setPostingModuleRules) | **PUT** /api/chartofaccounts/{scope}/{code}/postingmodules/{postingModuleCode}/postingrules | [EXPERIMENTAL] SetPostingModuleRules: Set the rules of a Posting Module |
| [**upsertAccountProperties**](ChartOfAccountsApi.md#upsertAccountProperties) | **POST** /api/chartofaccounts/{scope}/{code}/accounts/{accountCode}/properties/$upsert | [EXPERIMENTAL] UpsertAccountProperties: Upsert account properties |
| [**upsertAccounts**](ChartOfAccountsApi.md#upsertAccounts) | **POST** /api/chartofaccounts/{scope}/{code}/accounts | [EXPERIMENTAL] UpsertAccounts: Upsert Accounts |
| [**upsertChartOfAccountsProperties**](ChartOfAccountsApi.md#upsertChartOfAccountsProperties) | **POST** /api/chartofaccounts/{scope}/{code}/properties/$upsert | [EXPERIMENTAL] UpsertChartOfAccountsProperties: Upsert Chart of Accounts properties |


<a id="createChartOfAccounts"></a>
# **createChartOfAccounts**
> ChartOfAccounts createChartOfAccounts(scope, chartOfAccountsRequest).execute();

[EXPERIMENTAL] CreateChartOfAccounts: Create a Chart of Accounts

Create the given Chart of Accounts.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    ChartOfAccountsRequest chartOfAccountsRequest = new ChartOfAccountsRequest(); // ChartOfAccountsRequest | The definition of the Chart of Accounts.
    try {
      ChartOfAccounts result = apiInstance.createChartOfAccounts(scope, chartOfAccountsRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#createChartOfAccounts");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **chartOfAccountsRequest** | [**ChartOfAccountsRequest**](ChartOfAccountsRequest.md)| The definition of the Chart of Accounts. | |

### Return type

[**ChartOfAccounts**](ChartOfAccounts.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Chart of Accounts. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="createCleardownModule"></a>
# **createCleardownModule**
> CleardownModuleResponse createCleardownModule(scope, code, cleardownModuleRequest).execute();

[EXPERIMENTAL] CreateCleardownModule: Create a Cleardown Module

Create the given Cleardown Module.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    CleardownModuleRequest cleardownModuleRequest = new CleardownModuleRequest(); // CleardownModuleRequest | The definition of the Cleardown Module.
    try {
      CleardownModuleResponse result = apiInstance.createCleardownModule(scope, code, cleardownModuleRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#createCleardownModule");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **cleardownModuleRequest** | [**CleardownModuleRequest**](CleardownModuleRequest.md)| The definition of the Cleardown Module. | |

### Return type

[**CleardownModuleResponse**](CleardownModuleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Cleardown Module. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="createGeneralLedgerProfile"></a>
# **createGeneralLedgerProfile**
> GeneralLedgerProfileResponse createGeneralLedgerProfile(scope, code, generalLedgerProfileRequest).execute();

[EXPERIMENTAL] CreateGeneralLedgerProfile: Create a General Ledger Profile.

Create the given General Ledger profile.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts.
    GeneralLedgerProfileRequest generalLedgerProfileRequest = new GeneralLedgerProfileRequest(); // GeneralLedgerProfileRequest | The definition of the General Ledger Profile.
    try {
      GeneralLedgerProfileResponse result = apiInstance.createGeneralLedgerProfile(scope, code, generalLedgerProfileRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#createGeneralLedgerProfile");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. | |
| **generalLedgerProfileRequest** | [**GeneralLedgerProfileRequest**](GeneralLedgerProfileRequest.md)| The definition of the General Ledger Profile. | |

### Return type

[**GeneralLedgerProfileResponse**](GeneralLedgerProfileResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created General Ledger Profile. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="createPostingModule"></a>
# **createPostingModule**
> PostingModuleResponse createPostingModule(scope, code, postingModuleRequest).execute();

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
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    PostingModuleRequest postingModuleRequest = new PostingModuleRequest(); // PostingModuleRequest | The definition of the Posting Module.
    try {
      PostingModuleResponse result = apiInstance.createPostingModule(scope, code, postingModuleRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#createPostingModule");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **postingModuleRequest** | [**PostingModuleRequest**](PostingModuleRequest.md)| The definition of the Posting Module. | |

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
| **201** | The newly created Posting Module. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteAccounts"></a>
# **deleteAccounts**
> DeleteAccountsResponse deleteAccounts(scope, code, requestBody).deleteMode(deleteMode).execute();

[EXPERIMENTAL] DeleteAccounts: Soft or hard delete multiple accounts

Delete one or more account from the Chart of Accounts. Soft deletion marks the account as inactive  While the Hard deletion is deleting the account.  The maximum number of accounts that this method can delete per request is 2,000.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies   the Chart of Accounts.
    List<String> requestBody = ["AccountCode1","AccountCode2"]; // List<String> | The codes of the accounts to delete.
    String deleteMode = "Soft"; // String | The delete mode to use (defaults to 'Soft').
    try {
      DeleteAccountsResponse result = apiInstance.deleteAccounts(scope, code, requestBody)
            .deleteMode(deleteMode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#deleteAccounts");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies   the Chart of Accounts. | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| The codes of the accounts to delete. | |
| **deleteMode** | **String**| The delete mode to use (defaults to &#39;Soft&#39;). | [optional] [enum: Soft, Hard] |

### Return type

[**DeleteAccountsResponse**](DeleteAccountsResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the Accounts were deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteChartOfAccounts"></a>
# **deleteChartOfAccounts**
> DeletedEntityResponse deleteChartOfAccounts(scope, code).execute();

[EXPERIMENTAL] DeleteChartOfAccounts: Delete a Chart of Accounts

Delete the given Chart of Accounts.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts to be deleted.
    String code = "code_example"; // String | The code of the Chart of Accounts to be deleted. Together with the scope this uniquely identifies the Chart of Accounts.
    try {
      DeletedEntityResponse result = apiInstance.deleteChartOfAccounts(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#deleteChartOfAccounts");
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
| **scope** | **String**| The scope of the Chart of Accounts to be deleted. | |
| **code** | **String**| The code of the Chart of Accounts to be deleted. Together with the scope this uniquely identifies the Chart of Accounts. | |

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
| **200** | The datetime that the Chart of Accounts was deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteCleardownModule"></a>
# **deleteCleardownModule**
> DeletedEntityResponse deleteCleardownModule(scope, code, cleardownModuleCode).execute();

[EXPERIMENTAL] DeleteCleardownModule: Delete a Cleardown Module.

Delete the given Cleardown Module.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    String cleardownModuleCode = "cleardownModuleCode_example"; // String | The code of the Cleardown Module to be deleted.
    try {
      DeletedEntityResponse result = apiInstance.deleteCleardownModule(scope, code, cleardownModuleCode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#deleteCleardownModule");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **cleardownModuleCode** | **String**| The code of the Cleardown Module to be deleted. | |

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
| **200** | The datetime that the Cleardown Module was deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteGeneralLedgerProfile"></a>
# **deleteGeneralLedgerProfile**
> DeletedEntityResponse deleteGeneralLedgerProfile(scope, code, generalLedgerProfileCode).execute();

[EXPERIMENTAL] DeleteGeneralLedgerProfile: Delete a General Ledger Profile.

Delete the given General Ledger Profile.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts for the General Ledger Profile.
    String code = "code_example"; // String | The code of the Chart of Accounts for the General Ledger Profile.
    String generalLedgerProfileCode = "generalLedgerProfileCode_example"; // String | The Code of the General Ledger Profile.
    try {
      DeletedEntityResponse result = apiInstance.deleteGeneralLedgerProfile(scope, code, generalLedgerProfileCode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#deleteGeneralLedgerProfile");
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
| **scope** | **String**| The scope of the Chart of Accounts for the General Ledger Profile. | |
| **code** | **String**| The code of the Chart of Accounts for the General Ledger Profile. | |
| **generalLedgerProfileCode** | **String**| The Code of the General Ledger Profile. | |

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
| **200** | The datetime that the General Ledger Profile was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deletePostingModule"></a>
# **deletePostingModule**
> DeletedEntityResponse deletePostingModule(scope, code, postingModuleCode).execute();

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
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    String postingModuleCode = "postingModuleCode_example"; // String | The code of the Posting Module to be deleted.
    try {
      DeletedEntityResponse result = apiInstance.deletePostingModule(scope, code, postingModuleCode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#deletePostingModule");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **postingModuleCode** | **String**| The code of the Posting Module to be deleted. | |

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

<a id="getAccount"></a>
# **getAccount**
> Account getAccount(scope, code, accountCode).effectiveAt(effectiveAt).asAt(asAt).propertyKeys(propertyKeys).execute();

[EXPERIMENTAL] GetAccount: Get Account

Retrieve the definition of a particular Account which is part of a Chart of Accounts.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    String accountCode = "accountCode_example"; // String | The code of the Account.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Account properties. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Account definition. Defaults to returning the latest version of the Account definition if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Account' domain to decorate onto the Account.   These must take the format {domain}/{scope}/{code}, for example 'Account/Manager/Id'. If not provided will return all the entitled properties for that Account.
    try {
      Account result = apiInstance.getAccount(scope, code, accountCode)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .propertyKeys(propertyKeys)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#getAccount");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **accountCode** | **String**| The code of the Account. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Account properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Account definition. Defaults to returning the latest version of the Account definition if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Account&#39; domain to decorate onto the Account.   These must take the format {domain}/{scope}/{code}, for example &#39;Account/Manager/Id&#39;. If not provided will return all the entitled properties for that Account. | [optional] |

### Return type

[**Account**](Account.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Account definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getChartOfAccounts"></a>
# **getChartOfAccounts**
> ChartOfAccounts getChartOfAccounts(scope, code).effectiveAt(effectiveAt).asAt(asAt).propertyKeys(propertyKeys).execute();

[EXPERIMENTAL] GetChartOfAccounts: Get ChartOfAccounts

Retrieve the definition of a particular Chart of Accounts.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Chart of Accounts properties. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Chart of Accounts definition. Defaults to returning the latest version of the Chart of Accounts definition if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'ChartOfAccounts' domain to decorate onto the Chart of Accounts.   These must take the format {domain}/{scope}/{code}, for example 'ChartOfAccounts/Manager/Id'. If not provided will return all the entitled properties for that Chart of Accounts.
    try {
      ChartOfAccounts result = apiInstance.getChartOfAccounts(scope, code)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .propertyKeys(propertyKeys)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#getChartOfAccounts");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Chart of Accounts properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Chart of Accounts definition. Defaults to returning the latest version of the Chart of Accounts definition if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;ChartOfAccounts&#39; domain to decorate onto the Chart of Accounts.   These must take the format {domain}/{scope}/{code}, for example &#39;ChartOfAccounts/Manager/Id&#39;. If not provided will return all the entitled properties for that Chart of Accounts. | [optional] |

### Return type

[**ChartOfAccounts**](ChartOfAccounts.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Chart Of Accounts definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getCleardownModule"></a>
# **getCleardownModule**
> CleardownModuleResponse getCleardownModule(scope, code, cleardownModuleCode).execute();

[EXPERIMENTAL] GetCleardownModule: Get a Cleardown Module

Retrieve the definition of a Cleardown Module complete with its rules.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    String cleardownModuleCode = "cleardownModuleCode_example"; // String | The code of the Cleardown Module.
    try {
      CleardownModuleResponse result = apiInstance.getCleardownModule(scope, code, cleardownModuleCode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#getCleardownModule");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **cleardownModuleCode** | **String**| The code of the Cleardown Module. | |

### Return type

[**CleardownModuleResponse**](CleardownModuleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The full definition of the Cleardown Module. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getGeneralLedgerProfile"></a>
# **getGeneralLedgerProfile**
> GeneralLedgerProfileResponse getGeneralLedgerProfile(scope, code, generalLedgerProfileCode).execute();

[EXPERIMENTAL] GetGeneralLedgerProfile: Get a General Ledger Profile.

Get the given General Ledger Profile.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts for the General Ledger Profile.
    String code = "code_example"; // String | The code of the Chart of Accounts for the General Ledger Profile.
    String generalLedgerProfileCode = "generalLedgerProfileCode_example"; // String | The General Ledger Profile Code of the General Ledger Profile.
    try {
      GeneralLedgerProfileResponse result = apiInstance.getGeneralLedgerProfile(scope, code, generalLedgerProfileCode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#getGeneralLedgerProfile");
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
| **scope** | **String**| The scope of the Chart of Accounts for the General Ledger Profile. | |
| **code** | **String**| The code of the Chart of Accounts for the General Ledger Profile. | |
| **generalLedgerProfileCode** | **String**| The General Ledger Profile Code of the General Ledger Profile. | |

### Return type

[**GeneralLedgerProfileResponse**](GeneralLedgerProfileResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested General Ledger Profile entry. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getPostingModule"></a>
# **getPostingModule**
> PostingModuleResponse getPostingModule(scope, code, postingModuleCode).execute();

[EXPERIMENTAL] GetPostingModule: Get a Posting Module

Retrieve the definition of a Posting Module complete with its rules.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    String postingModuleCode = "postingModuleCode_example"; // String | The code of the Posting Module.
    try {
      PostingModuleResponse result = apiInstance.getPostingModule(scope, code, postingModuleCode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#getPostingModule");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **postingModuleCode** | **String**| The code of the Posting Module. | |

### Return type

[**PostingModuleResponse**](PostingModuleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The full definition of the Posting Module. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listAccounts"></a>
# **listAccounts**
> PagedResourceListOfAccount listAccounts(scope, code).effectiveAt(effectiveAt).asAt(asAt).page(page).limit(limit).filter(filter).propertyKeys(propertyKeys).execute();

[EXPERIMENTAL] ListAccounts: List Accounts

List the accounts in a Chart of Accounts

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies   the Chart of Accounts.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the TimeVariant properties decorated on Accounts. Defaults to the current LUSID   system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Accounts. Defaults to   returning the latest version if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing charts of accounts; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the Account type, specify \"code eq '001'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Account' domain to decorate onto the Account.   These must have the format {domain}/{scope}/{code}, for example 'Account/system/Name'.
    try {
      PagedResourceListOfAccount result = apiInstance.listAccounts(scope, code)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .filter(filter)
            .propertyKeys(propertyKeys)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#listAccounts");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies   the Chart of Accounts. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the TimeVariant properties decorated on Accounts. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Accounts. Defaults to   returning the latest version if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing charts of accounts; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the Account type, specify \&quot;code eq &#39;001&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Account&#39; domain to decorate onto the Account.   These must have the format {domain}/{scope}/{code}, for example &#39;Account/system/Name&#39;. | [optional] |

### Return type

[**PagedResourceListOfAccount**](PagedResourceListOfAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Accounts in the given Chart of Accounts. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listChartsOfAccounts"></a>
# **listChartsOfAccounts**
> PagedResourceListOfChartOfAccounts listChartsOfAccounts().effectiveAt(effectiveAt).asAt(asAt).page(page).limit(limit).filter(filter).propertyKeys(propertyKeys).execute();

[EXPERIMENTAL] ListChartsOfAccounts: List Charts of Accounts

List all the Charts of Accounts matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the TimeVariant properties for the Chart Of Accounts. Defaults to the current LUSID   system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the charts of accounts. Defaults to returning the latest version   of each Chart of Accounts if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing charts of accounts; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the Chart of Accounts type, specify \"id.Code eq '001'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'ChartOfAccounts' domain to decorate onto each Chart of Accounts.   These must take the format {domain}/{scope}/{code}, for example 'ChartOfAccounts/Manager/Id'.
    try {
      PagedResourceListOfChartOfAccounts result = apiInstance.listChartsOfAccounts()
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .filter(filter)
            .propertyKeys(propertyKeys)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#listChartsOfAccounts");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the TimeVariant properties for the Chart Of Accounts. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the charts of accounts. Defaults to returning the latest version   of each Chart of Accounts if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing charts of accounts; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the Chart of Accounts type, specify \&quot;id.Code eq &#39;001&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;ChartOfAccounts&#39; domain to decorate onto each Chart of Accounts.   These must take the format {domain}/{scope}/{code}, for example &#39;ChartOfAccounts/Manager/Id&#39;. | [optional] |

### Return type

[**PagedResourceListOfChartOfAccounts**](PagedResourceListOfChartOfAccounts.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Charts of Accounts. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listCleardownModuleRules"></a>
# **listCleardownModuleRules**
> PagedResourceListOfCleardownModuleRule listCleardownModuleRules(scope, code, cleardownModuleCode).asAt(asAt).page(page).limit(limit).filter(filter).execute();

[EXPERIMENTAL] ListCleardownModuleRules: List Cleardown Module Rules

List the Rules in a Cleardown Module

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    String cleardownModuleCode = "cleardownModuleCode_example"; // String | The code of the cleardown module.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the instrument. Defaults to   returning the latest version if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing cleardown module rules; this   value is returned from the previous call. If a pagination token is provided, the filter   and asAt fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the rule id, specify \"ruleId eq 'rule 1'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    try {
      PagedResourceListOfCleardownModuleRule result = apiInstance.listCleardownModuleRules(scope, code, cleardownModuleCode)
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#listCleardownModuleRules");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **cleardownModuleCode** | **String**| The code of the cleardown module. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instrument. Defaults to   returning the latest version if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing cleardown module rules; this   value is returned from the previous call. If a pagination token is provided, the filter   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the rule id, specify \&quot;ruleId eq &#39;rule 1&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |

### Return type

[**PagedResourceListOfCleardownModuleRule**](PagedResourceListOfCleardownModuleRule.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The rules in the given Cleardown Module. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listCleardownModules"></a>
# **listCleardownModules**
> PagedResourceListOfCleardownModuleResponse listCleardownModules(scope, code).asAt(asAt).page(page).limit(limit).filter(filter).execute();

[EXPERIMENTAL] ListCleardownModules: List Cleardown Modules

List all the Cleardown Modules matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Cleardown Module. Defaults to returning the latest version   of each Cleardown Module if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing Cleardown Modules; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the Cleardown Module status, specify \"status eq 'Active'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    try {
      PagedResourceListOfCleardownModuleResponse result = apiInstance.listCleardownModules(scope, code)
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#listCleardownModules");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Cleardown Module. Defaults to returning the latest version   of each Cleardown Module if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Cleardown Modules; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the Cleardown Module status, specify \&quot;status eq &#39;Active&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |

### Return type

[**PagedResourceListOfCleardownModuleResponse**](PagedResourceListOfCleardownModuleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Cleardown Modules. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listGeneralLedgerProfiles"></a>
# **listGeneralLedgerProfiles**
> PagedResourceListOfGeneralLedgerProfileResponse listGeneralLedgerProfiles(scope, code).asAt(asAt).page(page).limit(limit).filter(filter).execute();

[EXPERIMENTAL] ListGeneralLedgerProfiles: List General Ledger Profiles.

List all the General Ledger profiles matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts
    String code = "code_example"; // String | The code of the Chart of Accounts
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the General Ledger Profiles. Defaults to returning the latest version of each General Ledger Profile if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing General Ledger Profiles; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the General Ledger profiles type, specify \"type eq 'PeriodBoundary'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    try {
      PagedResourceListOfGeneralLedgerProfileResponse result = apiInstance.listGeneralLedgerProfiles(scope, code)
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#listGeneralLedgerProfiles");
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
| **scope** | **String**| The scope of the Chart of Accounts | |
| **code** | **String**| The code of the Chart of Accounts | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the General Ledger Profiles. Defaults to returning the latest version of each General Ledger Profile if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing General Ledger Profiles; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the General Ledger profiles type, specify \&quot;type eq &#39;PeriodBoundary&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |

### Return type

[**PagedResourceListOfGeneralLedgerProfileResponse**](PagedResourceListOfGeneralLedgerProfileResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested General Ledger Profile entries. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listPostingModuleRules"></a>
# **listPostingModuleRules**
> PagedResourceListOfPostingModuleRule listPostingModuleRules(scope, code, postingModuleCode).asAt(asAt).page(page).limit(limit).filter(filter).execute();

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
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    String postingModuleCode = "postingModuleCode_example"; // String | The code of the posting module.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the instrument. Defaults to   returning the latest version if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing posting module rules; this   value is returned from the previous call. If a pagination token is provided, the filter   and asAt fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the rule id, specify \"ruleId eq 'rule 1'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    try {
      PagedResourceListOfPostingModuleRule result = apiInstance.listPostingModuleRules(scope, code, postingModuleCode)
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#listPostingModuleRules");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **postingModuleCode** | **String**| The code of the posting module. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instrument. Defaults to   returning the latest version if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing posting module rules; this   value is returned from the previous call. If a pagination token is provided, the filter   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the rule id, specify \&quot;ruleId eq &#39;rule 1&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |

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
> PagedResourceListOfPostingModuleResponse listPostingModules(scope, code).asAt(asAt).page(page).limit(limit).filter(filter).execute();

[EXPERIMENTAL] ListPostingModules: List Posting Modules

List all the Posting Modules matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Posting Module. Defaults to returning the latest version   of each Posting Module if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing Posting Modules; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the Posting Module status, specify \"status eq 'Active'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    try {
      PagedResourceListOfPostingModuleResponse result = apiInstance.listPostingModules(scope, code)
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#listPostingModules");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Posting Module. Defaults to returning the latest version   of each Posting Module if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Posting Modules; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the Posting Module status, specify \&quot;status eq &#39;Active&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |

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

<a id="setCleardownModuleDetails"></a>
# **setCleardownModuleDetails**
> CleardownModuleResponse setCleardownModuleDetails(scope, code, cleardownModuleCode, cleardownModuleDetails).execute();

[EXPERIMENTAL] SetCleardownModuleDetails: Set the details of a Cleardown Module

Update the given Cleardown Module details.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    String cleardownModuleCode = "cleardownModuleCode_example"; // String | The code of the Cleardown Module to be updated.
    CleardownModuleDetails cleardownModuleDetails = new CleardownModuleDetails(); // CleardownModuleDetails | The new details for the Cleardown Module.
    try {
      CleardownModuleResponse result = apiInstance.setCleardownModuleDetails(scope, code, cleardownModuleCode, cleardownModuleDetails)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#setCleardownModuleDetails");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **cleardownModuleCode** | **String**| The code of the Cleardown Module to be updated. | |
| **cleardownModuleDetails** | [**CleardownModuleDetails**](CleardownModuleDetails.md)| The new details for the Cleardown Module. | |

### Return type

[**CleardownModuleResponse**](CleardownModuleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated Cleardown Module. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="setCleardownModuleRules"></a>
# **setCleardownModuleRules**
> CleardownModuleRulesUpdatedResponse setCleardownModuleRules(scope, code, cleardownModuleCode, cleardownModuleRule).execute();

[EXPERIMENTAL] SetCleardownModuleRules: Set the rules of a Cleardown Module

Set the given Cleardown Modules rules, this will replace the existing set of rules for the cleardown module.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    String cleardownModuleCode = "cleardownModuleCode_example"; // String | The code of the Cleardown Module to be updated.
    List<CleardownModuleRule> cleardownModuleRule = Arrays.asList(); // List<CleardownModuleRule> | The new rule set for the Cleardown Module.
    try {
      CleardownModuleRulesUpdatedResponse result = apiInstance.setCleardownModuleRules(scope, code, cleardownModuleCode, cleardownModuleRule)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#setCleardownModuleRules");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **cleardownModuleCode** | **String**| The code of the Cleardown Module to be updated. | |
| **cleardownModuleRule** | [**List&lt;CleardownModuleRule&gt;**](CleardownModuleRule.md)| The new rule set for the Cleardown Module. | |

### Return type

[**CleardownModuleRulesUpdatedResponse**](CleardownModuleRulesUpdatedResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Cleardown Module with updated rules. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="setGeneralLedgerProfileMappings"></a>
# **setGeneralLedgerProfileMappings**
> GeneralLedgerProfileResponse setGeneralLedgerProfileMappings(scope, code, generalLedgerProfileCode, generalLedgerProfileMapping).execute();

[EXPERIMENTAL] SetGeneralLedgerProfileMappings: Sets the General Ledger Profile Mappings.

Update the given General Ledger profile Mappings.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts.
    String generalLedgerProfileCode = "generalLedgerProfileCode_example"; // String | The code of the General Ledger Profile
    List<GeneralLedgerProfileMapping> generalLedgerProfileMapping = Arrays.asList(); // List<GeneralLedgerProfileMapping> | The updated General Ledger Profile Mappings, the previous mappings will be wholly replaced with this data. Mappings will be evaluated in the order they are provided.
    try {
      GeneralLedgerProfileResponse result = apiInstance.setGeneralLedgerProfileMappings(scope, code, generalLedgerProfileCode, generalLedgerProfileMapping)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#setGeneralLedgerProfileMappings");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. | |
| **generalLedgerProfileCode** | **String**| The code of the General Ledger Profile | |
| **generalLedgerProfileMapping** | [**List&lt;GeneralLedgerProfileMapping&gt;**](GeneralLedgerProfileMapping.md)| The updated General Ledger Profile Mappings, the previous mappings will be wholly replaced with this data. Mappings will be evaluated in the order they are provided. | |

### Return type

[**GeneralLedgerProfileResponse**](GeneralLedgerProfileResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The General Ledger Profile that holds the updated mappings. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="setPostingModuleDetails"></a>
# **setPostingModuleDetails**
> PostingModuleResponse setPostingModuleDetails(scope, code, postingModuleCode, postingModuleDetails).execute();

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
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    String postingModuleCode = "postingModuleCode_example"; // String | The code of the Posting Module to be updated.
    PostingModuleDetails postingModuleDetails = new PostingModuleDetails(); // PostingModuleDetails | The new details for the Posting Module.
    try {
      PostingModuleResponse result = apiInstance.setPostingModuleDetails(scope, code, postingModuleCode, postingModuleDetails)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#setPostingModuleDetails");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **postingModuleCode** | **String**| The code of the Posting Module to be updated. | |
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
> PostingModuleRulesUpdatedResponse setPostingModuleRules(scope, code, postingModuleCode, postingModuleRule).execute();

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
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts.
    String postingModuleCode = "postingModuleCode_example"; // String | The code of the Posting Module to be updated.
    List<PostingModuleRule> postingModuleRule = Arrays.asList(); // List<PostingModuleRule> | The new rule set for the Posting Module.
    try {
      PostingModuleRulesUpdatedResponse result = apiInstance.setPostingModuleRules(scope, code, postingModuleCode, postingModuleRule)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#setPostingModuleRules");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **postingModuleCode** | **String**| The code of the Posting Module to be updated. | |
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

<a id="upsertAccountProperties"></a>
# **upsertAccountProperties**
> AccountProperties upsertAccountProperties(scope, code, accountCode).requestBody(requestBody).execute();

[EXPERIMENTAL] UpsertAccountProperties: Upsert account properties

Update or insert one or more properties onto a single account. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;Account&#39;.     Upserting a property that exists for an account, with a null value, will delete the instance of the property for that group.     Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts to update or insert the properties onto.
    String code = "code_example"; // String | The code of the Chart of Accounts to update or insert the properties onto. Together with the scope this uniquely identifies the Chart of Accounts.
    String accountCode = "accountCode_example"; // String | The unique ID of the account to create or update properties for.
    Map<String, Property> requestBody = new HashMap(); // Map<String, Property> | The properties to be updated or inserted onto the chart of account. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \"Account/Manager/Id\".
    try {
      AccountProperties result = apiInstance.upsertAccountProperties(scope, code, accountCode)
            .requestBody(requestBody)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#upsertAccountProperties");
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
| **scope** | **String**| The scope of the Chart of Accounts to update or insert the properties onto. | |
| **code** | **String**| The code of the Chart of Accounts to update or insert the properties onto. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **accountCode** | **String**| The unique ID of the account to create or update properties for. | |
| **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be updated or inserted onto the chart of account. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;Account/Manager/Id\&quot;. | [optional] |

### Return type

[**AccountProperties**](AccountProperties.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated or inserted properties. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertAccounts"></a>
# **upsertAccounts**
> AccountsUpsertResponse upsertAccounts(scope, code, account).execute();

[EXPERIMENTAL] UpsertAccounts: Upsert Accounts

Create or update accounts in the Chart of Accounts. An account will be updated  if it already exists and created if it does not.  The maximum number of accounts that this method can upsert per request is 2,000.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts.
    String code = "code_example"; // String | The code of the Chart of Accounts. Together with the scope this uniquely identifies   the Chart of Accounts.
    List<Account> account = Arrays.asList(); // List<Account> | A list of accounts to be created or updated.
    try {
      AccountsUpsertResponse result = apiInstance.upsertAccounts(scope, code, account)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#upsertAccounts");
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
| **scope** | **String**| The scope of the Chart of Accounts. | |
| **code** | **String**| The code of the Chart of Accounts. Together with the scope this uniquely identifies   the Chart of Accounts. | |
| **account** | [**List&lt;Account&gt;**](Account.md)| A list of accounts to be created or updated. | |

### Return type

[**AccountsUpsertResponse**](AccountsUpsertResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly upserted Accounts. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertChartOfAccountsProperties"></a>
# **upsertChartOfAccountsProperties**
> ChartOfAccountsProperties upsertChartOfAccountsProperties(scope, code).requestBody(requestBody).execute();

[EXPERIMENTAL] UpsertChartOfAccountsProperties: Upsert Chart of Accounts properties

Update or insert one or more properties onto a single Chart of Accounts. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;ChartOfAccounts&#39;.     Upserting a property that exists for a Chart of Accounts, with a null value, will delete the instance of the property for that group.     Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.ChartOfAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ChartOfAccountsApi apiInstance = new ChartOfAccountsApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Chart of Accounts to update or insert the properties onto.
    String code = "code_example"; // String | The code of the Chart of Accounts to update or insert the properties onto. Together with the scope this uniquely identifies the Chart of Accounts.
    Map<String, Property> requestBody = new HashMap(); // Map<String, Property> | The properties to be updated or inserted onto the chart of account. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \"ChartOfAccounts/Manager/Id\".
    try {
      ChartOfAccountsProperties result = apiInstance.upsertChartOfAccountsProperties(scope, code)
            .requestBody(requestBody)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChartOfAccountsApi#upsertChartOfAccountsProperties");
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
| **scope** | **String**| The scope of the Chart of Accounts to update or insert the properties onto. | |
| **code** | **String**| The code of the Chart of Accounts to update or insert the properties onto. Together with the scope this uniquely identifies the Chart of Accounts. | |
| **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be updated or inserted onto the chart of account. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;ChartOfAccounts/Manager/Id\&quot;. | [optional] |

### Return type

[**ChartOfAccountsProperties**](ChartOfAccountsProperties.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated or inserted properties. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

