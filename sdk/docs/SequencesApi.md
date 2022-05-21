# SequencesApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSequence**](SequencesApi.md#createSequence) | **POST** /api/sequences/{scope} | [EARLY ACCESS] CreateSequence: Create a new sequence
[**getSequence**](SequencesApi.md#getSequence) | **GET** /api/sequences/{scope}/{code} | [EARLY ACCESS] GetSequence: Get a specified sequence
[**listSequences**](SequencesApi.md#listSequences) | **GET** /api/sequences | [EARLY ACCESS] ListSequences: List Sequences
[**next**](SequencesApi.md#next) | **GET** /api/sequences/{scope}/{code}/next | [EARLY ACCESS] Next: Get next values from sequence


<a name="createSequence"></a>
# **createSequence**
> SequenceDefinition createSequence(scope, createSequenceRequest)

[EARLY ACCESS] CreateSequence: Create a new sequence

Create a new sequence

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.SequencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SequencesApi apiInstance = new SequencesApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the sequence.
    CreateSequenceRequest createSequenceRequest = new CreateSequenceRequest(); // CreateSequenceRequest | Request to create sequence
    try {
      SequenceDefinition result = apiInstance.createSequence(scope, createSequenceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SequencesApi#createSequence");
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
 **scope** | **String**| Scope of the sequence. |
 **createSequenceRequest** | [**CreateSequenceRequest**](CreateSequenceRequest.md)| Request to create sequence |

### Return type

[**SequenceDefinition**](SequenceDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The newly created Sequence |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getSequence"></a>
# **getSequence**
> SequenceDefinition getSequence(scope, code)

[EARLY ACCESS] GetSequence: Get a specified sequence

Return the details of a specified sequence

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.SequencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SequencesApi apiInstance = new SequencesApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the sequence.
    String code = "code_example"; // String | Code of the sequence. This together with stated scope uniquely              identifies the sequence.
    try {
      SequenceDefinition result = apiInstance.getSequence(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SequencesApi#getSequence");
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
 **scope** | **String**| Scope of the sequence. |
 **code** | **String**| Code of the sequence. This together with stated scope uniquely              identifies the sequence. |

### Return type

[**SequenceDefinition**](SequenceDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested sequence |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listSequences"></a>
# **listSequences**
> PagedResourceListOfSequenceDefinition listSequences(page, limit, filter)

[EARLY ACCESS] ListSequences: List Sequences

List sequences which satisfies filtering criteria.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.SequencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SequencesApi apiInstance = new SequencesApi(defaultClient);
    String page = "page_example"; // String | The pagination token to use to continue listing sequences from a previous call to list sequences. This  value is returned from the previous call.
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 500 if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set.               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
    try {
      PagedResourceListOfSequenceDefinition result = apiInstance.listSequences(page, limit, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SequencesApi#listSequences");
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
 **page** | **String**| The pagination token to use to continue listing sequences from a previous call to list sequences. This  value is returned from the previous call. | [optional]
 **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 500 if not specified. | [optional]
 **filter** | **String**| Expression to filter the result set.               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional]

### Return type

[**PagedResourceListOfSequenceDefinition**](PagedResourceListOfSequenceDefinition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The sequences matching filtering criteria |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="next"></a>
# **next**
> NextValueInSequenceResponse next(scope, code, batch)

[EARLY ACCESS] Next: Get next values from sequence

Get the next set of values from a specified sequence

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.SequencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SequencesApi apiInstance = new SequencesApi(defaultClient);
    String scope = "scope_example"; // String | Scope of the sequence.
    String code = "code_example"; // String | Code of the sequence. This together with stated scope uniquely              identifies the sequence.
    Integer batch = 56; // Integer | Number of sequences items to return for the specified sequence. Default to 1 if not specified.
    try {
      NextValueInSequenceResponse result = apiInstance.next(scope, code, batch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SequencesApi#next");
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
 **scope** | **String**| Scope of the sequence. |
 **code** | **String**| Code of the sequence. This together with stated scope uniquely              identifies the sequence. |
 **batch** | **Integer**| Number of sequences items to return for the specified sequence. Default to 1 if not specified. | [optional]

### Return type

[**NextValueInSequenceResponse**](NextValueInSequenceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The response containing next available values in specified sequence. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

