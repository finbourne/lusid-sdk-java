# TransactionConfigurationApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSideDefinition**](TransactionConfigurationApi.md#deleteSideDefinition) | **DELETE** /api/transactionconfiguration/sides/{side}/$delete | [EXPERIMENTAL] DeleteSideDefinition: Delete the given side definition |
| [**deleteTransactionType**](TransactionConfigurationApi.md#deleteTransactionType) | **DELETE** /api/transactionconfiguration/types/{source}/{type} | [EXPERIMENTAL] DeleteTransactionType: Delete a transaction type |
| [**deleteTransactionTypeSource**](TransactionConfigurationApi.md#deleteTransactionTypeSource) | **DELETE** /api/transactionconfiguration/types/{source}/$delete | [EXPERIMENTAL] DeleteTransactionTypeSource: Delete all transaction types for the given source and scope |
| [**getSideDefinition**](TransactionConfigurationApi.md#getSideDefinition) | **GET** /api/transactionconfiguration/sides/{side} | [EXPERIMENTAL] GetSideDefinition: Get the side definition for a given side name( or label) |
| [**getTransactionType**](TransactionConfigurationApi.md#getTransactionType) | **GET** /api/transactionconfiguration/types/{source}/{type} | [EXPERIMENTAL] GetTransactionType: Get a single transaction configuration type |
| [**listSideDefinitions**](TransactionConfigurationApi.md#listSideDefinitions) | **GET** /api/transactionconfiguration/sides | [EXPERIMENTAL] ListSideDefinitions: List the side definitions |
| [**listTransactionTypes**](TransactionConfigurationApi.md#listTransactionTypes) | **GET** /api/transactionconfiguration/types | [EXPERIMENTAL] ListTransactionTypes: List transaction types |
| [**setSideDefinition**](TransactionConfigurationApi.md#setSideDefinition) | **PUT** /api/transactionconfiguration/sides/{side} | [EXPERIMENTAL] SetSideDefinition: Set a side definition |
| [**setSideDefinitions**](TransactionConfigurationApi.md#setSideDefinitions) | **PUT** /api/transactionconfiguration/sides | [EXPERIMENTAL] SetSideDefinitions: Set the given side definitions |
| [**setTransactionType**](TransactionConfigurationApi.md#setTransactionType) | **PUT** /api/transactionconfiguration/types/{source}/{type} | [EXPERIMENTAL] SetTransactionType: Set a specific transaction type |
| [**setTransactionTypeSource**](TransactionConfigurationApi.md#setTransactionTypeSource) | **PUT** /api/transactionconfiguration/types/{source} | [EXPERIMENTAL] SetTransactionTypeSource: Set the transaction types for the given source and scope |


<a id="deleteSideDefinition"></a>
# **deleteSideDefinition**
> DeletedEntityResponse deleteSideDefinition(side, scope)

[EXPERIMENTAL] DeleteSideDefinition: Delete the given side definition

Delete the side which user specify in the request.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionConfigurationApi apiInstance = new TransactionConfigurationApi(defaultClient);
    String side = "side_example"; // String | The label to uniquely identify the side.
    String scope = "default"; // String | The scope in which the side exists. When not supplied the scope is 'default'.
    try {
      DeletedEntityResponse result = apiInstance.deleteSideDefinition(side, scope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionConfigurationApi#deleteSideDefinition");
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
| **side** | **String**| The label to uniquely identify the side. | |
| **scope** | **String**| The scope in which the side exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

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

<a id="deleteTransactionType"></a>
# **deleteTransactionType**
> DeletedEntityResponse deleteTransactionType(source, type, scope)

[EXPERIMENTAL] DeleteTransactionType: Delete a transaction type

/// WARNING! Changing existing transaction types has a material impact on how data, new and old,  is processed and aggregated by LUSID, and will affect your whole organisation. Only call this API if you are fully aware of the implications of the change.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionConfigurationApi apiInstance = new TransactionConfigurationApi(defaultClient);
    String source = "source_example"; // String | The source that the type is in
    String type = "type_example"; // String | One of the type's aliases
    String scope = "default"; // String | The scope in which the transaction types exists. When not supplied the scope is 'default'.
    try {
      DeletedEntityResponse result = apiInstance.deleteTransactionType(source, type, scope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionConfigurationApi#deleteTransactionType");
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
| **source** | **String**| The source that the type is in | |
| **type** | **String**| One of the type&#39;s aliases | |
| **scope** | **String**| The scope in which the transaction types exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

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

<a id="deleteTransactionTypeSource"></a>
# **deleteTransactionTypeSource**
> DeletedEntityResponse deleteTransactionTypeSource(source, scope)

[EXPERIMENTAL] DeleteTransactionTypeSource: Delete all transaction types for the given source and scope

Delete all the types for the given source and scope.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionConfigurationApi apiInstance = new TransactionConfigurationApi(defaultClient);
    String source = "source_example"; // String | The source to set the transaction types for.
    String scope = "default"; // String | The scope in which the transaction types exists. When not supplied the scope is 'default'.
    try {
      DeletedEntityResponse result = apiInstance.deleteTransactionTypeSource(source, scope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionConfigurationApi#deleteTransactionTypeSource");
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
| **source** | **String**| The source to set the transaction types for. | |
| **scope** | **String**| The scope in which the transaction types exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

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

<a id="getSideDefinition"></a>
# **getSideDefinition**
> SideDefinition getSideDefinition(side, scope, asAt)

[EXPERIMENTAL] GetSideDefinition: Get the side definition for a given side name( or label)

Get the side definition user requested.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionConfigurationApi apiInstance = new TransactionConfigurationApi(defaultClient);
    String side = "side_example"; // String | The label to uniquely identify the side.
    String scope = "default"; // String | The scope in which the side exists. When not supplied the scope is 'default'.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transaction types. Defaults to returning the latest versions if not specified.
    try {
      SideDefinition result = apiInstance.getSideDefinition(side, scope, asAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionConfigurationApi#getSideDefinition");
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
| **side** | **String**| The label to uniquely identify the side. | |
| **scope** | **String**| The scope in which the side exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transaction types. Defaults to returning the latest versions if not specified. | [optional] |

### Return type

[**SideDefinition**](SideDefinition.md)

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

<a id="getTransactionType"></a>
# **getTransactionType**
> TransactionType getTransactionType(source, type, asAt, scope)

[EXPERIMENTAL] GetTransactionType: Get a single transaction configuration type

Get a single transaction type. Returns failure if not found

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionConfigurationApi apiInstance = new TransactionConfigurationApi(defaultClient);
    String source = "source_example"; // String | The source that the type is in
    String type = "type_example"; // String | One of the type's aliases
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transaction configuration.              Defaults to returning the latest version of the transaction configuration type if not specified
    String scope = "default"; // String | The scope in which the transaction types exists. When not supplied the scope is 'default'.
    try {
      TransactionType result = apiInstance.getTransactionType(source, type, asAt, scope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionConfigurationApi#getTransactionType");
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
| **source** | **String**| The source that the type is in | |
| **type** | **String**| One of the type&#39;s aliases | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transaction configuration.              Defaults to returning the latest version of the transaction configuration type if not specified | [optional] |
| **scope** | **String**| The scope in which the transaction types exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**TransactionType**](TransactionType.md)

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

<a id="listSideDefinitions"></a>
# **listSideDefinitions**
> ResourceListOfSideDefinition listSideDefinitions(asAt, scope)

[EXPERIMENTAL] ListSideDefinitions: List the side definitions

List all the side definitions in the given scope

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionConfigurationApi apiInstance = new TransactionConfigurationApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transaction types. Defaults to returning the latest versions if not specified.
    String scope = "default"; // String | The scope in which the side exists. When not supplied the scope is 'default'.
    try {
      ResourceListOfSideDefinition result = apiInstance.listSideDefinitions(asAt, scope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionConfigurationApi#listSideDefinitions");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transaction types. Defaults to returning the latest versions if not specified. | [optional] |
| **scope** | **String**| The scope in which the side exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**ResourceListOfSideDefinition**](ResourceListOfSideDefinition.md)

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

<a id="listTransactionTypes"></a>
# **listTransactionTypes**
> Map&lt;String, List&lt;TransactionType&gt;&gt; listTransactionTypes(asAt, scope)

[EXPERIMENTAL] ListTransactionTypes: List transaction types

Get the list of current transaction types. For information on the default transaction types provided with  LUSID, see https://support.lusid.com/knowledgebase/article/KA-01873/.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionConfigurationApi apiInstance = new TransactionConfigurationApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transaction types. Defaults              to returning the latest versions if not specified.
    String scope = "default"; // String | The scope in which the side exists. When not supplied the scope is 'default'.
    try {
      Map<String, List<TransactionType>> result = apiInstance.listTransactionTypes(asAt, scope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionConfigurationApi#listTransactionTypes");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transaction types. Defaults              to returning the latest versions if not specified. | [optional] |
| **scope** | **String**| The scope in which the side exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**Map&lt;String, List&lt;TransactionType&gt;&gt;**](List.md)

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

<a id="setSideDefinition"></a>
# **setSideDefinition**
> SideDefinition setSideDefinition(side, sideDefinitionRequest, scope)

[EXPERIMENTAL] SetSideDefinition: Set a side definition

Set a new side definition for use in a transaction type. For more information, see https://support.lusid.com/knowledgebase/article/KA-01875.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionConfigurationApi apiInstance = new TransactionConfigurationApi(defaultClient);
    String side = "side_example"; // String | The label to uniquely identify the side.
    SideDefinitionRequest sideDefinitionRequest = new SideDefinitionRequest(); // SideDefinitionRequest | The side definition to create or replace.
    String scope = "default"; // String | The scope in which the side exists. When not supplied the scope is 'default'.
    try {
      SideDefinition result = apiInstance.setSideDefinition(side, sideDefinitionRequest, scope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionConfigurationApi#setSideDefinition");
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
| **side** | **String**| The label to uniquely identify the side. | |
| **sideDefinitionRequest** | [**SideDefinitionRequest**](SideDefinitionRequest.md)| The side definition to create or replace. | |
| **scope** | **String**| The scope in which the side exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**SideDefinition**](SideDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="setSideDefinitions"></a>
# **setSideDefinitions**
> ResourceListOfSideDefinition setSideDefinitions(sidesDefinitionRequest, scope)

[EXPERIMENTAL] SetSideDefinitions: Set the given side definitions

Set a new side definition for use in a transaction type. For more information, see https://support.lusid.com/knowledgebase/article/KA-01875.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionConfigurationApi apiInstance = new TransactionConfigurationApi(defaultClient);
    List<SidesDefinitionRequest> sidesDefinitionRequest = Arrays.asList(); // List<SidesDefinitionRequest> | The list of side definitions to create, or replace.
    String scope = "default"; // String | The scope in which the side exists. When not supplied the scope is 'default'.
    try {
      ResourceListOfSideDefinition result = apiInstance.setSideDefinitions(sidesDefinitionRequest, scope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionConfigurationApi#setSideDefinitions");
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
| **sidesDefinitionRequest** | [**List&lt;SidesDefinitionRequest&gt;**](SidesDefinitionRequest.md)| The list of side definitions to create, or replace. | |
| **scope** | **String**| The scope in which the side exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**ResourceListOfSideDefinition**](ResourceListOfSideDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="setTransactionType"></a>
# **setTransactionType**
> TransactionType setTransactionType(source, type, transactionTypeRequest, scope)

[EXPERIMENTAL] SetTransactionType: Set a specific transaction type

Set a transaction type for the given source and type. If the requested transaction type does not exist, it will be created    WARNING! Changing existing transaction types has a material impact on how data, new and old, is processed and aggregated by LUSID, and will affect your whole organisation. Only call this API if you are fully aware of the implications of the change.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionConfigurationApi apiInstance = new TransactionConfigurationApi(defaultClient);
    String source = "source_example"; // String | The source to set the transaction configuration for
    String type = "type_example"; // String | One of the transaction configuration alias types to uniquely identify the configuration
    TransactionTypeRequest transactionTypeRequest = new TransactionTypeRequest(); // TransactionTypeRequest | The transaction configuration to set
    String scope = "default"; // String | The scope in which the transaction types exists. When not supplied the scope is 'default'.
    try {
      TransactionType result = apiInstance.setTransactionType(source, type, transactionTypeRequest, scope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionConfigurationApi#setTransactionType");
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
| **source** | **String**| The source to set the transaction configuration for | |
| **type** | **String**| One of the transaction configuration alias types to uniquely identify the configuration | |
| **transactionTypeRequest** | [**TransactionTypeRequest**](TransactionTypeRequest.md)| The transaction configuration to set | |
| **scope** | **String**| The scope in which the transaction types exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**TransactionType**](TransactionType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="setTransactionTypeSource"></a>
# **setTransactionTypeSource**
> ResourceListOfTransactionType setTransactionTypeSource(source, transactionTypeRequest, scope)

[EXPERIMENTAL] SetTransactionTypeSource: Set the transaction types for the given source and scope

The complete set of transaction types for the source.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.TransactionConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionConfigurationApi apiInstance = new TransactionConfigurationApi(defaultClient);
    String source = "source_example"; // String | The source to set the transaction types for.
    List<TransactionTypeRequest> transactionTypeRequest = Arrays.asList(); // List<TransactionTypeRequest> | The set of transaction types.
    String scope = "default"; // String | The scope in which the transaction types exists. When not supplied the scope is 'default'.
    try {
      ResourceListOfTransactionType result = apiInstance.setTransactionTypeSource(source, transactionTypeRequest, scope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionConfigurationApi#setTransactionTypeSource");
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
| **source** | **String**| The source to set the transaction types for. | |
| **transactionTypeRequest** | [**List&lt;TransactionTypeRequest&gt;**](TransactionTypeRequest.md)| The set of transaction types. | |
| **scope** | **String**| The scope in which the transaction types exists. When not supplied the scope is &#39;default&#39;. | [optional] [default to default] |

### Return type

[**ResourceListOfTransactionType**](ResourceListOfTransactionType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

