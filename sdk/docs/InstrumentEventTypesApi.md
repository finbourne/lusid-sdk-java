# InstrumentEventTypesApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransactionTemplate**](InstrumentEventTypesApi.md#createTransactionTemplate) | **POST** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplates/{instrumentType}/{scope} | [EXPERIMENTAL] CreateTransactionTemplate: Create Transaction Template |
| [**getTransactionTemplate**](InstrumentEventTypesApi.md#getTransactionTemplate) | **GET** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplates/{instrumentType}/{scope} | [EXPERIMENTAL] GetTransactionTemplate: Get Transaction Template |
| [**getTransactionTemplateSpecification**](InstrumentEventTypesApi.md#getTransactionTemplateSpecification) | **GET** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplatespecification | [EXPERIMENTAL] GetTransactionTemplateSpecification: Get Transaction Template Specification. |


<a id="createTransactionTemplate"></a>
# **createTransactionTemplate**
> TransactionTemplate createTransactionTemplate(instrumentEventType, instrumentType, scope, transactionTemplateRequest).execute();

[EXPERIMENTAL] CreateTransactionTemplate: Create Transaction Template

Create a transaction template for a particular instrument event type in a scope.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentEventTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentEventTypesApi apiInstance = new InstrumentEventTypesApi(defaultClient);
    String instrumentEventType = "instrumentEventType_example"; // String | The type of instrument events that the template is applied to.
    String instrumentType = "instrumentType_example"; // String | The instrument type of the transaction template. The combination of the instrument   event type, instrument type and scope uniquely identifies a transaction template
    String scope = "scope_example"; // String | The scope in which the template lies.
    TransactionTemplateRequest transactionTemplateRequest = new TransactionTemplateRequest(); // TransactionTemplateRequest | A request defining a new transaction template to be created.
    try {
      TransactionTemplate result = apiInstance.createTransactionTemplate(instrumentEventType, instrumentType, scope, transactionTemplateRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentEventTypesApi#createTransactionTemplate");
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
| **instrumentEventType** | **String**| The type of instrument events that the template is applied to. | |
| **instrumentType** | **String**| The instrument type of the transaction template. The combination of the instrument   event type, instrument type and scope uniquely identifies a transaction template | |
| **scope** | **String**| The scope in which the template lies. | |
| **transactionTemplateRequest** | [**TransactionTemplateRequest**](TransactionTemplateRequest.md)| A request defining a new transaction template to be created. | |

### Return type

[**TransactionTemplate**](TransactionTemplate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The response of the transaction template that was created. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getTransactionTemplate"></a>
# **getTransactionTemplate**
> TransactionTemplate getTransactionTemplate(instrumentEventType, instrumentType, scope).asAt(asAt).execute();

[EXPERIMENTAL] GetTransactionTemplate: Get Transaction Template

Gets the Transaction Template that for the instrument event type within the scope specified.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentEventTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentEventTypesApi apiInstance = new InstrumentEventTypesApi(defaultClient);
    String instrumentEventType = "instrumentEventType_example"; // String | The instrument event type of the transaction template
    String instrumentType = "instrumentType_example"; // String | The instrument type of the transaction template. The combination of the instrument   event type, instrument type and scope uniquely identifies a transaction template
    String scope = "scope_example"; // String | The scope in which the template lies. When not supplied the scope is 'default'.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The AsAt time of the requested Transaction Template
    try {
      TransactionTemplate result = apiInstance.getTransactionTemplate(instrumentEventType, instrumentType, scope)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentEventTypesApi#getTransactionTemplate");
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
| **instrumentEventType** | **String**| The instrument event type of the transaction template | |
| **instrumentType** | **String**| The instrument type of the transaction template. The combination of the instrument   event type, instrument type and scope uniquely identifies a transaction template | |
| **scope** | **String**| The scope in which the template lies. When not supplied the scope is &#39;default&#39;. | |
| **asAt** | **OffsetDateTime**| The AsAt time of the requested Transaction Template | [optional] |

### Return type

[**TransactionTemplate**](TransactionTemplate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The asAt datetime at which the transaction template was created. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getTransactionTemplateSpecification"></a>
# **getTransactionTemplateSpecification**
> TransactionTemplateSpecification getTransactionTemplateSpecification(instrumentEventType).execute();

[EXPERIMENTAL] GetTransactionTemplateSpecification: Get Transaction Template Specification.

Retrieve the transaction template specification for a particular event type.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.InstrumentEventTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    InstrumentEventTypesApi apiInstance = new InstrumentEventTypesApi(defaultClient);
    String instrumentEventType = "instrumentEventType_example"; // String | The requested instrument event type.
    try {
      TransactionTemplateSpecification result = apiInstance.getTransactionTemplateSpecification(instrumentEventType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentEventTypesApi#getTransactionTemplateSpecification");
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
| **instrumentEventType** | **String**| The requested instrument event type. | |

### Return type

[**TransactionTemplateSpecification**](TransactionTemplateSpecification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Transaction Template Specification. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

