# CutLabelDefinitionsApi

All URIs are relative to *http://http:/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCutLabelDefinition**](CutLabelDefinitionsApi.md#createCutLabelDefinition) | **POST** /api/systemconfiguration/cutlabels | [EARLY ACCESS] Create a Cut Label
[**deleteCutLabelDefinition**](CutLabelDefinitionsApi.md#deleteCutLabelDefinition) | **DELETE** /api/systemconfiguration/cutlabels/{code} | [EARLY ACCESS] Delete a Cut Label
[**getCutLabelDefinition**](CutLabelDefinitionsApi.md#getCutLabelDefinition) | **GET** /api/systemconfiguration/cutlabels/{code} | [EARLY ACCESS] Get a Cut Label
[**listCutLabelDefinitions**](CutLabelDefinitionsApi.md#listCutLabelDefinitions) | **GET** /api/systemconfiguration/cutlabels | [EARLY ACCESS] List Existing Cut Labels
[**updateCutLabelDefinition**](CutLabelDefinitionsApi.md#updateCutLabelDefinition) | **PUT** /api/systemconfiguration/cutlabels/{code} | [EARLY ACCESS] Update a Cut Label


<a name="createCutLabelDefinition"></a>
# **createCutLabelDefinition**
> CutLabelDefinition createCutLabelDefinition(createRequest)

[EARLY ACCESS] Create a Cut Label

Create a Cut Label valid in all scopes

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CutLabelDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CutLabelDefinitionsApi apiInstance = new CutLabelDefinitionsApi(defaultClient);
    CreateCutLabelDefinitionRequest createRequest = new CreateCutLabelDefinitionRequest(); // CreateCutLabelDefinitionRequest | The cut label definition
    try {
      CutLabelDefinition result = apiInstance.createCutLabelDefinition(createRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CutLabelDefinitionsApi#createCutLabelDefinition");
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
 **createRequest** | [**CreateCutLabelDefinitionRequest**](CreateCutLabelDefinitionRequest.md)| The cut label definition | [optional]

### Return type

[**CutLabelDefinition**](CutLabelDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The created cut label |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deleteCutLabelDefinition"></a>
# **deleteCutLabelDefinition**
> OffsetDateTime deleteCutLabelDefinition(code)

[EARLY ACCESS] Delete a Cut Label

Delete a specified cut label

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CutLabelDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CutLabelDefinitionsApi apiInstance = new CutLabelDefinitionsApi(defaultClient);
    String code = "code_example"; // String | The Code of the Cut Label that is being Deleted
    try {
      OffsetDateTime result = apiInstance.deleteCutLabelDefinition(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CutLabelDefinitionsApi#deleteCutLabelDefinition");
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
 **code** | **String**| The Code of the Cut Label that is being Deleted |

### Return type

[**OffsetDateTime**](OffsetDateTime.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The time of deletion |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getCutLabelDefinition"></a>
# **getCutLabelDefinition**
> CutLabelDefinition getCutLabelDefinition(code, asAt)

[EARLY ACCESS] Get a Cut Label

Get a specified cut label at a given time

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CutLabelDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CutLabelDefinitionsApi apiInstance = new CutLabelDefinitionsApi(defaultClient);
    String code = "code_example"; // String | The Code of the Cut Label that is being queried
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | The time at which to get the Cut Label
    try {
      CutLabelDefinition result = apiInstance.getCutLabelDefinition(code, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CutLabelDefinitionsApi#getCutLabelDefinition");
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
 **code** | **String**| The Code of the Cut Label that is being queried |
 **asAt** | **OffsetDateTime**| The time at which to get the Cut Label | [optional]

### Return type

[**CutLabelDefinition**](CutLabelDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested cut label |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listCutLabelDefinitions"></a>
# **listCutLabelDefinitions**
> ResourceListOfCutLabelDefinition listCutLabelDefinitions(asAt, sortBy, start, limit, filter, query)

[EARLY ACCESS] List Existing Cut Labels

List all the Cut Label Definitions that are valid at the given AsAt time

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CutLabelDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CutLabelDefinitionsApi apiInstance = new CutLabelDefinitionsApi(defaultClient);
    OffsetDateTime asAt = new OffsetDateTime(); // OffsetDateTime | Optional. The As At time at which listed Cut Labels are valid
    List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
    Integer start = 56; // Integer | Optional. When paginating, skip this number of results
    Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Optional. Expression to filter the result set
    String query = "query_example"; // String | Optional. Expression specifying the criteria that the returned cut labels must meet
    try {
      ResourceListOfCutLabelDefinition result = apiInstance.listCutLabelDefinitions(asAt, sortBy, start, limit, filter, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CutLabelDefinitionsApi#listCutLabelDefinitions");
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
 **asAt** | **OffsetDateTime**| Optional. The As At time at which listed Cut Labels are valid | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional]
 **start** | **Integer**| Optional. When paginating, skip this number of results | [optional]
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **filter** | **String**| Optional. Expression to filter the result set | [optional]
 **query** | **String**| Optional. Expression specifying the criteria that the returned cut labels must meet | [optional]

### Return type

[**ResourceListOfCutLabelDefinition**](ResourceListOfCutLabelDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of cut labels |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="updateCutLabelDefinition"></a>
# **updateCutLabelDefinition**
> CutLabelDefinition updateCutLabelDefinition(code, updateRequest)

[EARLY ACCESS] Update a Cut Label

Update a specified cut label

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.CutLabelDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CutLabelDefinitionsApi apiInstance = new CutLabelDefinitionsApi(defaultClient);
    String code = "code_example"; // String | The Code of the Cut Label that is being updated
    UpdateCutLabelDefinitionRequest updateRequest = new UpdateCutLabelDefinitionRequest(); // UpdateCutLabelDefinitionRequest | The cut label update definition
    try {
      CutLabelDefinition result = apiInstance.updateCutLabelDefinition(code, updateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CutLabelDefinitionsApi#updateCutLabelDefinition");
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
 **code** | **String**| The Code of the Cut Label that is being updated |
 **updateRequest** | [**UpdateCutLabelDefinitionRequest**](UpdateCutLabelDefinitionRequest.md)| The cut label update definition | [optional]

### Return type

[**CutLabelDefinition**](CutLabelDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The updated cut label |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

