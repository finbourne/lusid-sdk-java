# AborConfigurationApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAborConfiguration**](AborConfigurationApi.md#createAborConfiguration) | **POST** /api/aborconfiguration/{scope} | [EXPERIMENTAL] CreateAborConfiguration: Create an AborConfiguration. |
| [**deleteAborConfiguration**](AborConfigurationApi.md#deleteAborConfiguration) | **DELETE** /api/aborconfiguration/{scope}/{code} | [EXPERIMENTAL] DeleteAborConfiguration: Delete an AborConfiguration. |
| [**getAborConfiguration**](AborConfigurationApi.md#getAborConfiguration) | **GET** /api/aborconfiguration/{scope}/{code} | [EXPERIMENTAL] GetAborConfiguration: Get AborConfiguration. |
| [**listAborConfigurations**](AborConfigurationApi.md#listAborConfigurations) | **GET** /api/aborconfiguration | [EXPERIMENTAL] ListAborConfigurations: List AborConfiguration. |
| [**upsertAborConfigurationProperties**](AborConfigurationApi.md#upsertAborConfigurationProperties) | **POST** /api/aborconfiguration/{scope}/{code}/properties/$upsert | [EXPERIMENTAL] UpsertAborConfigurationProperties: Upsert AborConfiguration properties |


<a id="createAborConfiguration"></a>
# **createAborConfiguration**
> AborConfiguration createAborConfiguration(scope, aborConfigurationRequest).execute();

[EXPERIMENTAL] CreateAborConfiguration: Create an AborConfiguration.

Create the given AborConfiguration.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborConfigurationApi apiInstance = new AborConfigurationApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the AborConfiguration.
    AborConfigurationRequest aborConfigurationRequest = new AborConfigurationRequest(); // AborConfigurationRequest | The definition of the AborConfiguration.
    try {
      AborConfiguration result = apiInstance.createAborConfiguration(scope, aborConfigurationRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborConfigurationApi#createAborConfiguration");
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
| **scope** | **String**| The scope of the AborConfiguration. | |
| **aborConfigurationRequest** | [**AborConfigurationRequest**](AborConfigurationRequest.md)| The definition of the AborConfiguration. | |

### Return type

[**AborConfiguration**](AborConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created abor configuration. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteAborConfiguration"></a>
# **deleteAborConfiguration**
> DeletedEntityResponse deleteAborConfiguration(scope, code).execute();

[EXPERIMENTAL] DeleteAborConfiguration: Delete an AborConfiguration.

Delete the given AborConfiguration.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborConfigurationApi apiInstance = new AborConfigurationApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the AborConfiguration to be deleted.
    String code = "code_example"; // String | The code of the AborConfiguration to be deleted. Together with the scope this uniquely identifies the AborConfiguration.
    try {
      DeletedEntityResponse result = apiInstance.deleteAborConfiguration(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborConfigurationApi#deleteAborConfiguration");
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
| **scope** | **String**| The scope of the AborConfiguration to be deleted. | |
| **code** | **String**| The code of the AborConfiguration to be deleted. Together with the scope this uniquely identifies the AborConfiguration. | |

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
| **200** | The datetime that the Abor was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getAborConfiguration"></a>
# **getAborConfiguration**
> AborConfiguration getAborConfiguration(scope, code).effectiveAt(effectiveAt).asAt(asAt).propertyKeys(propertyKeys).execute();

[EXPERIMENTAL] GetAborConfiguration: Get AborConfiguration.

Retrieve the definition of a particular AborConfiguration.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborConfigurationApi apiInstance = new AborConfigurationApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the AborConfiguration.
    String code = "code_example"; // String | The code of the AborConfiguration. Together with the scope this uniquely identifies the AborConfiguration.
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the AborConfiguration properties. Defaults to the current LUSID system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the AborConfiguration definition. Defaults to returning the latest version of the AborConfiguration definition if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'AborConfiguration' domain to decorate onto the AborConfiguration.   These must take the format {domain}/{scope}/{code}, for example 'AborConfiguration/Manager/Id'. If not provided will return all the entitled properties for that AborConfiguration.
    try {
      AborConfiguration result = apiInstance.getAborConfiguration(scope, code)
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .propertyKeys(propertyKeys)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborConfigurationApi#getAborConfiguration");
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
| **scope** | **String**| The scope of the AborConfiguration. | |
| **code** | **String**| The code of the AborConfiguration. Together with the scope this uniquely identifies the AborConfiguration. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the AborConfiguration properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the AborConfiguration definition. Defaults to returning the latest version of the AborConfiguration definition if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;AborConfiguration&#39; domain to decorate onto the AborConfiguration.   These must take the format {domain}/{scope}/{code}, for example &#39;AborConfiguration/Manager/Id&#39;. If not provided will return all the entitled properties for that AborConfiguration. | [optional] |

### Return type

[**AborConfiguration**](AborConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested AborConfiguration definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listAborConfigurations"></a>
# **listAborConfigurations**
> PagedResourceListOfAborConfiguration listAborConfigurations().effectiveAt(effectiveAt).asAt(asAt).page(page).limit(limit).filter(filter).sortBy(sortBy).propertyKeys(propertyKeys).execute();

[EXPERIMENTAL] ListAborConfigurations: List AborConfiguration.

List all the AborConfiguration matching particular criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborConfigurationApi apiInstance = new AborConfigurationApi(defaultClient);
    String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the TimeVariant properties for the AborConfiguration. Defaults to the current LUSID   system datetime if not specified.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the AborConfiguration. Defaults to returning the latest version of each AAborConfigurationbor if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing AborConfiguration; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
    Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
    String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the AborConfiguration type, specify \"id.Code eq 'AborConfiguration1'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'AborConfiguration' domain to decorate onto each AborConfiguration.   These must take the format {domain}/{scope}/{code}, for example 'AborConfiguration/Manager/Id'.
    try {
      PagedResourceListOfAborConfiguration result = apiInstance.listAborConfigurations()
            .effectiveAt(effectiveAt)
            .asAt(asAt)
            .page(page)
            .limit(limit)
            .filter(filter)
            .sortBy(sortBy)
            .propertyKeys(propertyKeys)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborConfigurationApi#listAborConfigurations");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the TimeVariant properties for the AborConfiguration. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the AborConfiguration. Defaults to returning the latest version of each AAborConfigurationbor if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing AborConfiguration; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the AborConfiguration type, specify \&quot;id.Code eq &#39;AborConfiguration1&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;AborConfiguration&#39; domain to decorate onto each AborConfiguration.   These must take the format {domain}/{scope}/{code}, for example &#39;AborConfiguration/Manager/Id&#39;. | [optional] |

### Return type

[**PagedResourceListOfAborConfiguration**](PagedResourceListOfAborConfiguration.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested abor configurations. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertAborConfigurationProperties"></a>
# **upsertAborConfigurationProperties**
> AborConfigurationProperties upsertAborConfigurationProperties(scope, code).requestBody(requestBody).execute();

[EXPERIMENTAL] UpsertAborConfigurationProperties: Upsert AborConfiguration properties

Update or insert one or more properties onto a single AborConfiguration. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;AborConfiguration&#39;.     Upserting a property that exists for an AborConfiguration, with a null value, will delete the instance of the property for that group.     Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.AborConfigurationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AborConfigurationApi apiInstance = new AborConfigurationApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the AborConfiguration to update or insert the properties onto.
    String code = "code_example"; // String | The code of the AborConfiguration to update or insert the properties onto. Together with the scope this uniquely identifies the AborConfiguration.
    Map<String, Property> requestBody = new HashMap(); // Map<String, Property> | The properties to be updated or inserted onto the chart of account. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \"AborConfiguration/Manager/Id\".
    try {
      AborConfigurationProperties result = apiInstance.upsertAborConfigurationProperties(scope, code)
            .requestBody(requestBody)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AborConfigurationApi#upsertAborConfigurationProperties");
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
| **scope** | **String**| The scope of the AborConfiguration to update or insert the properties onto. | |
| **code** | **String**| The code of the AborConfiguration to update or insert the properties onto. Together with the scope this uniquely identifies the AborConfiguration. | |
| **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be updated or inserted onto the chart of account. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;AborConfiguration/Manager/Id\&quot;. | [optional] |

### Return type

[**AborConfigurationProperties**](AborConfigurationProperties.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated or inserted properties |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

