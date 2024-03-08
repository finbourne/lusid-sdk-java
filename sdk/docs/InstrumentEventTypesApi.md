# InstrumentEventTypesApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransactionTemplate**](InstrumentEventTypesApi.md#createTransactionTemplate) | **POST** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplates/{instrumentType}/{scope} | [EXPERIMENTAL] CreateTransactionTemplate: Create Transaction Template |
| [**deleteTransactionTemplate**](InstrumentEventTypesApi.md#deleteTransactionTemplate) | **DELETE** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplates/{instrumentType}/{scope} | [EXPERIMENTAL] DeleteTransactionTemplate: Delete Transaction Template |
| [**getTransactionTemplate**](InstrumentEventTypesApi.md#getTransactionTemplate) | **GET** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplates/{instrumentType}/{scope} | [EXPERIMENTAL] GetTransactionTemplate: Get Transaction Template |
| [**getTransactionTemplateSpecification**](InstrumentEventTypesApi.md#getTransactionTemplateSpecification) | **GET** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplatespecification | [EXPERIMENTAL] GetTransactionTemplateSpecification: Get Transaction Template Specification. |
| [**listTransactionTemplateSpecifications**](InstrumentEventTypesApi.md#listTransactionTemplateSpecifications) | **GET** /api/instrumenteventtypes/transactiontemplatespecifications | [EXPERIMENTAL] ListTransactionTemplateSpecifications: List Transaction Template Specifications. |
| [**listTransactionTemplates**](InstrumentEventTypesApi.md#listTransactionTemplates) | **GET** /api/instrumenteventtypes/transactiontemplates | [EXPERIMENTAL] ListTransactionTemplates: List Transaction Templates |
| [**updateTransactionTemplate**](InstrumentEventTypesApi.md#updateTransactionTemplate) | **PUT** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplates/{instrumentType}/{scope} | [EXPERIMENTAL] UpdateTransactionTemplate: Update Transaction Template |


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

<a id="deleteTransactionTemplate"></a>
# **deleteTransactionTemplate**
> OffsetDateTime deleteTransactionTemplate(instrumentEventType, instrumentType, scope).execute();

[EXPERIMENTAL] DeleteTransactionTemplate: Delete Transaction Template

Delete a transaction template for a particular instrument event type in a scope.

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
    String scope = "scope_example"; // String | The scope of the template.
    try {
      OffsetDateTime result = apiInstance.deleteTransactionTemplate(instrumentEventType, instrumentType, scope)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentEventTypesApi#deleteTransactionTemplate");
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
| **scope** | **String**| The scope of the template. | |

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
| **200** | The AsAt Time the Template was deleted. |  -  |
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
| **200** | The transaction template. |  -  |
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

<a id="listTransactionTemplateSpecifications"></a>
# **listTransactionTemplateSpecifications**
> PagedResourceListOfTransactionTemplateSpecification listTransactionTemplateSpecifications().asAt(asAt).page(page).limit(limit).filter(filter).sortBy(sortBy).execute();

[EXPERIMENTAL] ListTransactionTemplateSpecifications: List Transaction Template Specifications.

Retrieves all transaction template specifications.

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
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | AsAt of the request
    String page = "page_example"; // String | The pagination token to use to continue listing Transaction Template Specifications from   a previous call to list Transaction Template Specifications.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt   fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
    try {
      PagedResourceListOfTransactionTemplateSpecification result = apiInstance.listTransactionTemplateSpecifications()
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .filter(filter)
            .sortBy(sortBy)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentEventTypesApi#listTransactionTemplateSpecifications");
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
| **asAt** | **OffsetDateTime**| AsAt of the request | [optional] |
| **page** | **String**| The pagination token to use to continue listing Transaction Template Specifications from   a previous call to list Transaction Template Specifications.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt   fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfTransactionTemplateSpecification**](PagedResourceListOfTransactionTemplateSpecification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Transaction Template Specifications. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listTransactionTemplates"></a>
# **listTransactionTemplates**
> PagedResourceListOfTransactionTemplate listTransactionTemplates().asAt(asAt).page(page).limit(limit).filter(filter).sortBy(sortBy).execute();

[EXPERIMENTAL] ListTransactionTemplates: List Transaction Templates

Lists all Transaction Templates.

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
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The AsAt time at which to retrieve the Transaction Templates
    String page = "page_example"; // String | The pagination token to use to continue listing Transaction Templates from a previous call to list Transaction Templates.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, limit, and asAt fields   must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
    try {
      PagedResourceListOfTransactionTemplate result = apiInstance.listTransactionTemplates()
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .filter(filter)
            .sortBy(sortBy)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentEventTypesApi#listTransactionTemplates");
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
| **asAt** | **OffsetDateTime**| The AsAt time at which to retrieve the Transaction Templates | [optional] |
| **page** | **String**| The pagination token to use to continue listing Transaction Templates from a previous call to list Transaction Templates.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, limit, and asAt fields   must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfTransactionTemplate**](PagedResourceListOfTransactionTemplate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The transaction templates. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateTransactionTemplate"></a>
# **updateTransactionTemplate**
> TransactionTemplate updateTransactionTemplate(instrumentEventType, instrumentType, scope, transactionTemplateRequest).execute();

[EXPERIMENTAL] UpdateTransactionTemplate: Update Transaction Template

Update a transaction template for a particular instrument event type in a scope.

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
    TransactionTemplateRequest transactionTemplateRequest = new TransactionTemplateRequest(); // TransactionTemplateRequest | A request defining the updated values for the transaction template.
    try {
      TransactionTemplate result = apiInstance.updateTransactionTemplate(instrumentEventType, instrumentType, scope, transactionTemplateRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstrumentEventTypesApi#updateTransactionTemplate");
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
| **transactionTemplateRequest** | [**TransactionTemplateRequest**](TransactionTemplateRequest.md)| A request defining the updated values for the transaction template. | |

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
| **200** | The response of the transaction template that was updated. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

