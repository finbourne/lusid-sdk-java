# RecipeComposerApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRecipeComposerResolvedInline**](RecipeComposerApi.md#getRecipeComposerResolvedInline) | **POST** /api/recipecomposers/inline | [EXPERIMENTAL] GetRecipeComposerResolvedInline: Given a Recipe Composer, this endpoint shows what configuration recipe it would resolve to, able to access the already upserted configuration recipes as well as plain inline string inputs. |


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

