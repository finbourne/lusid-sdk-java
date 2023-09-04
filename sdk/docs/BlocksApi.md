# BlocksApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteBlock**](BlocksApi.md#deleteBlock) | **DELETE** /api/blocks/{scope}/{code} | [EARLY ACCESS] DeleteBlock: Delete block |
| [**getBlock**](BlocksApi.md#getBlock) | **GET** /api/blocks/{scope}/{code} | [EARLY ACCESS] GetBlock: Get Block |
| [**listBlocks**](BlocksApi.md#listBlocks) | **GET** /api/blocks | [EARLY ACCESS] ListBlocks: List Blocks |
| [**upsertBlocks**](BlocksApi.md#upsertBlocks) | **POST** /api/blocks | [EARLY ACCESS] UpsertBlocks: Upsert Block |


<a id="deleteBlock"></a>
# **deleteBlock**
> DeletedEntityResponse deleteBlock(scope, code)

[EARLY ACCESS] DeleteBlock: Delete block

Delete an block. Deletion will be valid from the block&#39;s creation datetime.  This means that the block will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.BlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BlocksApi apiInstance = new BlocksApi(defaultClient);
    String scope = "scope_example"; // String | The block scope.
    String code = "code_example"; // String | The block's code. This, together with the scope uniquely identifies the block to delete.
    try {
      DeletedEntityResponse result = apiInstance.deleteBlock(scope, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlocksApi#deleteBlock");
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
| **scope** | **String**| The block scope. | |
| **code** | **String**| The block&#39;s code. This, together with the scope uniquely identifies the block to delete. | |

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
| **200** | The response from deleting an block. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getBlock"></a>
# **getBlock**
> Block getBlock(scope, code, asAt, propertyKeys)

[EARLY ACCESS] GetBlock: Get Block

Fetch a Block that matches the specified identifier

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.BlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BlocksApi apiInstance = new BlocksApi(defaultClient);
    String scope = "scope_example"; // String | The scope to which the block belongs.
    String code = "code_example"; // String | The block's unique identifier.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the block. Defaults to return the latest version of the block if not specified.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Block\" domain to decorate onto the block.              These take the format {domain}/{scope}/{code} e.g. \"Block/system/Name\".
    try {
      Block result = apiInstance.getBlock(scope, code, asAt, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlocksApi#getBlock");
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
| **scope** | **String**| The scope to which the block belongs. | |
| **code** | **String**| The block&#39;s unique identifier. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the block. Defaults to return the latest version of the block if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Block\&quot; domain to decorate onto the block.              These take the format {domain}/{scope}/{code} e.g. \&quot;Block/system/Name\&quot;. | [optional] |

### Return type

[**Block**](Block.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The block matching the given identifier. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listBlocks"></a>
# **listBlocks**
> PagedResourceListOfBlock listBlocks(asAt, page, sortBy, limit, filter, propertyKeys)

[EARLY ACCESS] ListBlocks: List Blocks

Fetch the last pre-AsAt date version of each block in scope (does not fetch the entire history).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.BlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BlocksApi apiInstance = new BlocksApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the block. Defaults to return the latest version of the block if not specified.
    String page = "page_example"; // String | The pagination token to use to continue listing blocks from a previous call to list blocks.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request.
    List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
    Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid.
    List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Block\" domain to decorate onto each block.                  These take the format {domain}/{scope}/{code} e.g. \"Block/system/Name\".
    try {
      PagedResourceListOfBlock result = apiInstance.listBlocks(asAt, page, sortBy, limit, filter, propertyKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlocksApi#listBlocks");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the block. Defaults to return the latest version of the block if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing blocks from a previous call to list blocks.              This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields              must not have changed since the original request. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:              https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Block\&quot; domain to decorate onto each block.                  These take the format {domain}/{scope}/{code} e.g. \&quot;Block/system/Name\&quot;. | [optional] |

### Return type

[**PagedResourceListOfBlock**](PagedResourceListOfBlock.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Blocks in scope. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertBlocks"></a>
# **upsertBlocks**
> ResourceListOfBlock upsertBlocks(blockSetRequest)

[EARLY ACCESS] UpsertBlocks: Upsert Block

Upsert; update existing blocks with given ids, or create new blocks otherwise.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.BlocksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    BlocksApi apiInstance = new BlocksApi(defaultClient);
    BlockSetRequest blockSetRequest = new BlockSetRequest(); // BlockSetRequest | The collection of block requests.
    try {
      ResourceListOfBlock result = apiInstance.upsertBlocks(blockSetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlocksApi#upsertBlocks");
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
| **blockSetRequest** | [**BlockSetRequest**](BlockSetRequest.md)| The collection of block requests. | [optional] |

### Return type

[**ResourceListOfBlock**](ResourceListOfBlock.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A collection of blocks. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

