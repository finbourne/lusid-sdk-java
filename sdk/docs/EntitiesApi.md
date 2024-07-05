# EntitiesApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPortfolioByEntityUniqueId**](EntitiesApi.md#getPortfolioByEntityUniqueId) | **GET** /api/entities/portfolios/{entityUniqueId} | [EXPERIMENTAL] GetPortfolioByEntityUniqueId: Get portfolio by EntityUniqueId |
| [**getPortfolioChanges**](EntitiesApi.md#getPortfolioChanges) | **GET** /api/entities/changes/portfolios | GetPortfolioChanges: Get the next change to each portfolio in a scope. |
| [**getPropertyDefinitionByEntityUniqueId**](EntitiesApi.md#getPropertyDefinitionByEntityUniqueId) | **GET** /api/entities/propertydefinitions/{entityUniqueId} | [EXPERIMENTAL] GetPropertyDefinitionByEntityUniqueId: Get property definition by EntityUniqueId |


<a id="getPortfolioByEntityUniqueId"></a>
# **getPortfolioByEntityUniqueId**
> PortfolioEntity getPortfolioByEntityUniqueId(entityUniqueId).effectiveAt(effectiveAt).asAt(asAt).previews(previews).execute();

[EXPERIMENTAL] GetPortfolioByEntityUniqueId: Get portfolio by EntityUniqueId

Retrieve the definition of a particular portfolio.  If the portfolio is deleted, this will return the state of the portfolio immediately prior to deletion.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.EntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    EntitiesApi apiInstance = new EntitiesApi(defaultClient);
    String entityUniqueId = "entityUniqueId_example"; // String | The universally unique identifier of the portfolio definition.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the portfolio definition. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio definition. Defaults to returning the latest version of the portfolio definition if not specified.
    List<String> previews = Arrays.asList(); // List<String> | The ids of the staged modifications to be previewed in the response.
    try {
      PortfolioEntity result = apiInstance.getPortfolioByEntityUniqueId(entityUniqueId)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .previews(previews)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitiesApi#getPortfolioByEntityUniqueId");
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
| **entityUniqueId** | **String**| The universally unique identifier of the portfolio definition. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the portfolio definition. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio definition. Defaults to returning the latest version of the portfolio definition if not specified. | [optional] |
| **previews** | [**List&lt;String&gt;**](String.md)| The ids of the staged modifications to be previewed in the response. | [optional] |

### Return type

[**PortfolioEntity**](PortfolioEntity.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested portfolio entity |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getPortfolioChanges"></a>
# **getPortfolioChanges**
> ResourceListOfChange getPortfolioChanges(scope, effectiveAt).asAt(asAt).execute();

GetPortfolioChanges: Get the next change to each portfolio in a scope.

Gets the time of the next (earliest effective at) modification (correction and/or amendment) to each portfolio in a scope relative to a point in bitemporal time.  Includes changes from parent portfolios in different scopes.  Excludes changes from subscriptions (e.g corporate actions).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.EntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    EntitiesApi apiInstance = new EntitiesApi(defaultClient);
    String scope = "scope_example"; // String | The scope
    String effectiveAt = "effectiveAt_example"; // String | The effective date of the origin.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The as-at date of the origin.
    try {
      ResourceListOfChange result = apiInstance.getPortfolioChanges(scope, effectiveAt)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitiesApi#getPortfolioChanges");
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
| **scope** | **String**| The scope | |
| **effectiveAt** | **String**| The effective date of the origin. | |
| **asAt** | **OffsetDateTime**| The as-at date of the origin. | [optional] |

### Return type

[**ResourceListOfChange**](ResourceListOfChange.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | The details of the input related failure |  -  |
| **200** | A list of portfolio changes in the requested scope relative to the specified time. |  -  |
| **0** | Error response |  -  |

<a id="getPropertyDefinitionByEntityUniqueId"></a>
# **getPropertyDefinitionByEntityUniqueId**
> PropertyDefinitionEntity getPropertyDefinitionByEntityUniqueId(entityUniqueId).effectiveAt(effectiveAt).asAt(asAt).previews(previews).execute();

[EXPERIMENTAL] GetPropertyDefinitionByEntityUniqueId: Get property definition by EntityUniqueId

Retrieve a particular property definition.  If the property definition is deleted, this will return the state of the property definition immediately prior to deletion.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.EntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    EntitiesApi apiInstance = new EntitiesApi(defaultClient);
    String entityUniqueId = "entityUniqueId_example"; // String | The universally unique identifier of the property definition.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime at which to retrieve the property definition. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the property definition. Defaults to returning the latest version of the property definition if not specified.
    List<String> previews = Arrays.asList(); // List<String> | The ids of the staged modifications to be previewed in the response.
    try {
      PropertyDefinitionEntity result = apiInstance.getPropertyDefinitionByEntityUniqueId(entityUniqueId)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .previews(previews)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitiesApi#getPropertyDefinitionByEntityUniqueId");
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
| **entityUniqueId** | **String**| The universally unique identifier of the property definition. | |
| **effectiveAt** | **String**| The effective datetime at which to retrieve the property definition. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the property definition. Defaults to returning the latest version of the property definition if not specified. | [optional] |
| **previews** | [**List&lt;String&gt;**](String.md)| The ids of the staged modifications to be previewed in the response. | [optional] |

### Return type

[**PropertyDefinitionEntity**](PropertyDefinitionEntity.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested property definition entity |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

