# RecipeComposerApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRecipeComposer**](RecipeComposerApi.md#deleteRecipeComposer) | **DELETE** /api/recipecomposers/{scope}/{code} | [EXPERIMENTAL] DeleteRecipeComposer: Delete a Recipe Composer, assuming that it is present. |
| [**getRecipeComposer**](RecipeComposerApi.md#getRecipeComposer) | **GET** /api/recipecomposers/{scope}/{code} | [EXPERIMENTAL] GetRecipeComposer: Get Recipe Composer |
| [**getRecipeComposerResolvedInline**](RecipeComposerApi.md#getRecipeComposerResolvedInline) | **POST** /api/recipecomposers/inline | [EXPERIMENTAL] GetRecipeComposerResolvedInline: Given a Recipe Composer, this endpoint shows what configuration recipe it would resolve to, able to access the already upserted configuration recipes as well as plain inline string inputs. |
| [**listRecipeComposers**](RecipeComposerApi.md#listRecipeComposers) | **GET** /api/recipecomposers | [EXPERIMENTAL] ListRecipeComposers: List the set of Recipe Composers |
| [**upsertRecipeComposer**](RecipeComposerApi.md#upsertRecipeComposer) | **POST** /api/recipecomposers | [EXPERIMENTAL] UpsertRecipeComposer: Upsert a Recipe Composer. This creates or updates the data in Lusid. |


<a id="deleteRecipeComposer"></a>
# **deleteRecipeComposer**
> AnnulSingleStructuredDataResponse deleteRecipeComposer(scope, code).execute();

[EXPERIMENTAL] DeleteRecipeComposer: Delete a Recipe Composer, assuming that it is present.

Delete the specified Recipe Composer from a single scope.     The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.     It is important to always check for any unsuccessful response.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RecipeComposerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RecipeComposerApi apiInstance = new RecipeComposerApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Recipe Composer to delete.
    String code = "code_example"; // String | The Recipe Composer to delete.
    try {
      AnnulSingleStructuredDataResponse result = apiInstance.deleteRecipeComposer(scope, code)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipeComposerApi#deleteRecipeComposer");
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
| **scope** | **String**| The scope of the Recipe Composer to delete. | |
| **code** | **String**| The Recipe Composer to delete. | |

### Return type

[**AnnulSingleStructuredDataResponse**](AnnulSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AsAt of deletion or failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getRecipeComposer"></a>
# **getRecipeComposer**
> GetRecipeComposerResponse getRecipeComposer(scope, code).asAt(asAt).execute();

[EXPERIMENTAL] GetRecipeComposer: Get Recipe Composer

Get a Recipe Composer from a single scope.     The response will return either the recipe composer that has been stored, or a failure explaining why the request was unsuccessful.     It is important to always check for any unsuccessful requests (failures).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RecipeComposerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RecipeComposerApi apiInstance = new RecipeComposerApi(defaultClient);
    String scope = "scope_example"; // String | The scope of the Recipe Composer to retrieve.
    String code = "code_example"; // String | The name of the Recipe Composer to retrieve the data for.
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Recipe Composer. Defaults to return the latest version if not specified.
    try {
      GetRecipeComposerResponse result = apiInstance.getRecipeComposer(scope, code)
            .asAt(asAt)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipeComposerApi#getRecipeComposer");
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
| **scope** | **String**| The scope of the Recipe Composer to retrieve. | |
| **code** | **String**| The name of the Recipe Composer to retrieve the data for. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Recipe Composer. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**GetRecipeComposerResponse**](GetRecipeComposerResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Recipe Composer or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getRecipeComposerResolvedInline"></a>
# **getRecipeComposerResolvedInline**
> GetRecipeResponse getRecipeComposerResolvedInline(upsertRecipeComposerRequest).execute();

[EXPERIMENTAL] GetRecipeComposerResolvedInline: Given a Recipe Composer, this endpoint shows what configuration recipe it would resolve to, able to access the already upserted configuration recipes as well as plain inline string inputs.

Resolves an inline recipe composer into a ConfigurationRecipe.

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RecipeComposerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RecipeComposerApi apiInstance = new RecipeComposerApi(defaultClient);
    UpsertRecipeComposerRequest upsertRecipeComposerRequest = new UpsertRecipeComposerRequest(); // UpsertRecipeComposerRequest | Recipe composer used to resolve into the Configuration Recipe.
    try {
      GetRecipeResponse result = apiInstance.getRecipeComposerResolvedInline(upsertRecipeComposerRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipeComposerApi#getRecipeComposerResolvedInline");
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
| **upsertRecipeComposerRequest** | [**UpsertRecipeComposerRequest**](UpsertRecipeComposerRequest.md)| Recipe composer used to resolve into the Configuration Recipe. | |

### Return type

[**GetRecipeResponse**](GetRecipeResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully resolved Configuration Recipe. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listRecipeComposers"></a>
# **listRecipeComposers**
> ResourceListOfGetRecipeComposerResponse listRecipeComposers().asAt(asAt).filter(filter).execute();

[EXPERIMENTAL] ListRecipeComposers: List the set of Recipe Composers

List the set of Recipe Composers at the specified date/time and scope

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RecipeComposerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RecipeComposerApi apiInstance = new RecipeComposerApi(defaultClient);
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Recipes Composers. Defaults to latest if not specified.
    String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
    try {
      ResourceListOfGetRecipeComposerResponse result = apiInstance.listRecipeComposers()
            .asAt(asAt)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipeComposerApi#listRecipeComposers");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Recipes Composers. Defaults to latest if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**ResourceListOfGetRecipeComposerResponse**](ResourceListOfGetRecipeComposerResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested recipe composers |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="upsertRecipeComposer"></a>
# **upsertRecipeComposer**
> UpsertSingleStructuredDataResponse upsertRecipeComposer(upsertRecipeComposerRequest).execute();

[EXPERIMENTAL] UpsertRecipeComposer: Upsert a Recipe Composer. This creates or updates the data in Lusid.

Update or insert one Recipe Composer in a single scope. An item will be updated if it already exists  and inserted if it does not.     The response will return the successfully updated or inserted Recipe Composer or failure message if unsuccessful     It is important to always check to verify success (or failure).

### Example
```java
// Import classes:
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.auth.*;
import com.finbourne.lusid.models.*;
import com.finbourne.lusid.api.RecipeComposerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/api");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RecipeComposerApi apiInstance = new RecipeComposerApi(defaultClient);
    UpsertRecipeComposerRequest upsertRecipeComposerRequest = new UpsertRecipeComposerRequest(); // UpsertRecipeComposerRequest | The Recipe Composer to update or insert
    try {
      UpsertSingleStructuredDataResponse result = apiInstance.upsertRecipeComposer(upsertRecipeComposerRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipeComposerApi#upsertRecipeComposer");
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
| **upsertRecipeComposerRequest** | [**UpsertRecipeComposerRequest**](UpsertRecipeComposerRequest.md)| The Recipe Composer to update or insert | |

### Return type

[**UpsertSingleStructuredDataResponse**](UpsertSingleStructuredDataResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted item or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

