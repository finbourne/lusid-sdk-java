# ConfigurationRecipeApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteConfigurationRecipe**](ConfigurationRecipeApi.md#deleteConfigurationRecipe) | **DELETE** /api/recipes/{scope}/{code} | DeleteConfigurationRecipe: Delete a Configuration Recipe, assuming that it is present. |
| [**deleteRecipeComposer**](ConfigurationRecipeApi.md#deleteRecipeComposer) | **DELETE** /api/recipes/composer/{scope}/{code} | DeleteRecipeComposer: Delete a Recipe Composer, assuming that it is present. |
| [**getConfigurationRecipe**](ConfigurationRecipeApi.md#getConfigurationRecipe) | **GET** /api/recipes/{scope}/{code} | GetConfigurationRecipe: Get Configuration Recipe |
| [**getDerivedRecipe**](ConfigurationRecipeApi.md#getDerivedRecipe) | **GET** /api/recipes/derived/{scope}/{code} | GetDerivedRecipe: Get Configuration Recipe either from the store or expanded from a Recipe Composer. |
| [**getRecipeComposer**](ConfigurationRecipeApi.md#getRecipeComposer) | **GET** /api/recipes/composer/{scope}/{code} | GetRecipeComposer: Get Recipe Composer |
| [**getRecipeComposerResolvedInline**](ConfigurationRecipeApi.md#getRecipeComposerResolvedInline) | **POST** /api/recipes/composer/resolvedinline$ | GetRecipeComposerResolvedInline: Given a Recipe Composer, this endpoint expands into a Configuration Recipe without persistence. Primarily used for testing purposes. |
| [**listConfigurationRecipes**](ConfigurationRecipeApi.md#listConfigurationRecipes) | **GET** /api/recipes | ListConfigurationRecipes: List the set of Configuration Recipes |
| [**listDerivedRecipes**](ConfigurationRecipeApi.md#listDerivedRecipes) | **GET** /api/recipes/derived | ListDerivedRecipes: List the complete set of all Configuration Recipes, both from the configuration recipe store and also from expanded recipe composers. |
| [**listRecipeComposers**](ConfigurationRecipeApi.md#listRecipeComposers) | **GET** /api/recipes/composer | ListRecipeComposers: List the set of Recipe Composers |
| [**upsertConfigurationRecipe**](ConfigurationRecipeApi.md#upsertConfigurationRecipe) | **POST** /api/recipes | UpsertConfigurationRecipe: Upsert a Configuration Recipe. This creates or updates the data in Lusid. |
| [**upsertRecipeComposer**](ConfigurationRecipeApi.md#upsertRecipeComposer) | **POST** /api/recipes/composer | UpsertRecipeComposer: Upsert a Recipe Composer. This creates or updates the data in Lusid. |



## deleteConfigurationRecipe

> AnnulSingleStructuredDataResponse deleteConfigurationRecipe(scope, code)

DeleteConfigurationRecipe: Delete a Configuration Recipe, assuming that it is present.

Delete the specified Configuration Recipe from a single scope.     The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.     It is important to always check for any unsuccessful response.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ConfigurationRecipeApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationRecipeApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ConfigurationRecipeApi apiInstance = apiFactory.build(ConfigurationRecipeApi.class);

        ConfigurationRecipeApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationRecipeApi.class);
        String scope = "scope_example"; // String | The scope of the Configuration Recipe to delete.
        String code = "code_example"; // String | The Configuration Recipe to delete.
        try {
            // uncomment the below to set overrides at the request level
            // AnnulSingleStructuredDataResponse result = apiInstance.deleteConfigurationRecipe(scope, code).execute(opts);

            AnnulSingleStructuredDataResponse result = apiInstance.deleteConfigurationRecipe(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationRecipeApi#deleteConfigurationRecipe");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Configuration Recipe to delete. | |
| **code** | **String**| The Configuration Recipe to delete. | |

### Return type

[**AnnulSingleStructuredDataResponse**](AnnulSingleStructuredDataResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AsAt of deletion or failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteRecipeComposer

> AnnulSingleStructuredDataResponse deleteRecipeComposer(scope, code)

DeleteRecipeComposer: Delete a Recipe Composer, assuming that it is present.

Delete the specified Recipe Composer from a single scope.     The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.     It is important to always check for any unsuccessful response.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ConfigurationRecipeApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationRecipeApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ConfigurationRecipeApi apiInstance = apiFactory.build(ConfigurationRecipeApi.class);

        ConfigurationRecipeApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationRecipeApi.class);
        String scope = "scope_example"; // String | The scope of the Recipe Composer to delete.
        String code = "code_example"; // String | The Recipe Composer to delete.
        try {
            // uncomment the below to set overrides at the request level
            // AnnulSingleStructuredDataResponse result = apiInstance.deleteRecipeComposer(scope, code).execute(opts);

            AnnulSingleStructuredDataResponse result = apiInstance.deleteRecipeComposer(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationRecipeApi#deleteRecipeComposer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AsAt of deletion or failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getConfigurationRecipe

> GetRecipeResponse getConfigurationRecipe(scope, code, asAt)

GetConfigurationRecipe: Get Configuration Recipe

Get a Configuration Recipe from a single scope.     The response will return either the recipe that has been stored, or a failure explaining why the request was unsuccessful.     It is important to always check for any unsuccessful requests (failures).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ConfigurationRecipeApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationRecipeApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ConfigurationRecipeApi apiInstance = apiFactory.build(ConfigurationRecipeApi.class);

        ConfigurationRecipeApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationRecipeApi.class);
        String scope = "scope_example"; // String | The scope of the Configuration Recipe to retrieve.
        String code = "code_example"; // String | The name of the recipe to retrieve the data for.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Configuration Recipe. Defaults to return the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // GetRecipeResponse result = apiInstance.getConfigurationRecipe(scope, code, asAt).execute(opts);

            GetRecipeResponse result = apiInstance.getConfigurationRecipe(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationRecipeApi#getConfigurationRecipe");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Configuration Recipe to retrieve. | |
| **code** | **String**| The name of the recipe to retrieve the data for. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Configuration Recipe. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**GetRecipeResponse**](GetRecipeResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Configuration Recipe or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getDerivedRecipe

> GetRecipeResponse getDerivedRecipe(scope, code, asAt)

GetDerivedRecipe: Get Configuration Recipe either from the store or expanded from a Recipe Composer.

If scope-code is referring to a Configuration Recipe it is returned, if it refers to Recipe Composer, it is expanded into a Configuration Recipe and returned.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ConfigurationRecipeApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationRecipeApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ConfigurationRecipeApi apiInstance = apiFactory.build(ConfigurationRecipeApi.class);

        ConfigurationRecipeApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationRecipeApi.class);
        String scope = "scope_example"; // String | The scope of the Configuration Recipe or Recipe Composer to return.
        String code = "code_example"; // String | The code of the Configuration Recipe or Recipe Composer to return.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Configuration Recipe. Defaults to return the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // GetRecipeResponse result = apiInstance.getDerivedRecipe(scope, code, asAt).execute(opts);

            GetRecipeResponse result = apiInstance.getDerivedRecipe(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationRecipeApi#getDerivedRecipe");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| The scope of the Configuration Recipe or Recipe Composer to return. | |
| **code** | **String**| The code of the Configuration Recipe or Recipe Composer to return. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Configuration Recipe. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**GetRecipeResponse**](GetRecipeResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Configuration Recipe or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getRecipeComposer

> GetRecipeComposerResponse getRecipeComposer(scope, code, asAt)

GetRecipeComposer: Get Recipe Composer

Get a Recipe Composer from a single scope.     The response will return either the recipe composer that has been stored, or a failure explaining why the request was unsuccessful.     It is important to always check for any unsuccessful requests (failures).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ConfigurationRecipeApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationRecipeApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ConfigurationRecipeApi apiInstance = apiFactory.build(ConfigurationRecipeApi.class);

        ConfigurationRecipeApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationRecipeApi.class);
        String scope = "scope_example"; // String | The scope of the Recipe Composer to retrieve.
        String code = "code_example"; // String | The name of the Recipe Composer to retrieve the data for.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Recipe Composer. Defaults to return the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // GetRecipeComposerResponse result = apiInstance.getRecipeComposer(scope, code, asAt).execute(opts);

            GetRecipeComposerResponse result = apiInstance.getRecipeComposer(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationRecipeApi#getRecipeComposer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Recipe Composer or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getRecipeComposerResolvedInline

> GetRecipeResponse getRecipeComposerResolvedInline(upsertRecipeComposerRequest)

GetRecipeComposerResolvedInline: Given a Recipe Composer, this endpoint expands into a Configuration Recipe without persistence. Primarily used for testing purposes.

Resolves an inline recipe composer into a ConfigurationRecipe.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ConfigurationRecipeApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationRecipeApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ConfigurationRecipeApi apiInstance = apiFactory.build(ConfigurationRecipeApi.class);

        ConfigurationRecipeApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationRecipeApi.class);
        UpsertRecipeComposerRequest upsertRecipeComposerRequest = new UpsertRecipeComposerRequest(); // UpsertRecipeComposerRequest | Recipe composer used to expand into the Configuration Recipe.
        try {
            // uncomment the below to set overrides at the request level
            // GetRecipeResponse result = apiInstance.getRecipeComposerResolvedInline(upsertRecipeComposerRequest).execute(opts);

            GetRecipeResponse result = apiInstance.getRecipeComposerResolvedInline(upsertRecipeComposerRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationRecipeApi#getRecipeComposerResolvedInline");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **upsertRecipeComposerRequest** | [**UpsertRecipeComposerRequest**](UpsertRecipeComposerRequest.md)| Recipe composer used to expand into the Configuration Recipe. | |

### Return type

[**GetRecipeResponse**](GetRecipeResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully resolved Configuration Recipe. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listConfigurationRecipes

> ResourceListOfGetRecipeResponse listConfigurationRecipes(asAt, filter)

ListConfigurationRecipes: List the set of Configuration Recipes

List the set of configuration recipes at the specified date/time and scope. Note this only returns recipes stored directly and does not include any recipes expanded from recipe composers.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ConfigurationRecipeApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationRecipeApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ConfigurationRecipeApi apiInstance = apiFactory.build(ConfigurationRecipeApi.class);

        ConfigurationRecipeApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationRecipeApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Configuration Recipes. Defaults to latest if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfGetRecipeResponse result = apiInstance.listConfigurationRecipes(asAt, filter).execute(opts);

            ResourceListOfGetRecipeResponse result = apiInstance.listConfigurationRecipes(asAt, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationRecipeApi#listConfigurationRecipes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Configuration Recipes. Defaults to latest if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**ResourceListOfGetRecipeResponse**](ResourceListOfGetRecipeResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested configuration recipes |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listDerivedRecipes

> ResourceListOfGetRecipeResponse listDerivedRecipes(asAt, filter)

ListDerivedRecipes: List the complete set of all Configuration Recipes, both from the configuration recipe store and also from expanded recipe composers.

This endpoints returns a union of the output of ListConfigurationRecipes and the resolved Recipe Composers from the ListRecipeComposers endpoints.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ConfigurationRecipeApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationRecipeApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ConfigurationRecipeApi apiInstance = apiFactory.build(ConfigurationRecipeApi.class);

        ConfigurationRecipeApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationRecipeApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Configuration Recipes. Defaults to latest if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set, note this functionality is not yet enabled for this endpoint.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfGetRecipeResponse result = apiInstance.listDerivedRecipes(asAt, filter).execute(opts);

            ResourceListOfGetRecipeResponse result = apiInstance.listDerivedRecipes(asAt, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationRecipeApi#listDerivedRecipes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Configuration Recipes. Defaults to latest if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set, note this functionality is not yet enabled for this endpoint. | [optional] |

### Return type

[**ResourceListOfGetRecipeResponse**](ResourceListOfGetRecipeResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested configuration recipes |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listRecipeComposers

> ResourceListOfGetRecipeComposerResponse listRecipeComposers(asAt, filter)

ListRecipeComposers: List the set of Recipe Composers

List the set of Recipe Composers at the specified date/time and scope

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ConfigurationRecipeApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationRecipeApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ConfigurationRecipeApi apiInstance = apiFactory.build(ConfigurationRecipeApi.class);

        ConfigurationRecipeApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationRecipeApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Recipes Composers. Defaults to latest if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set, note this functionality is not yet enabled for this endpoint.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfGetRecipeComposerResponse result = apiInstance.listRecipeComposers(asAt, filter).execute(opts);

            ResourceListOfGetRecipeComposerResponse result = apiInstance.listRecipeComposers(asAt, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationRecipeApi#listRecipeComposers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Recipes Composers. Defaults to latest if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set, note this functionality is not yet enabled for this endpoint. | [optional] |

### Return type

[**ResourceListOfGetRecipeComposerResponse**](ResourceListOfGetRecipeComposerResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested recipe composers |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertConfigurationRecipe

> UpsertSingleStructuredDataResponse upsertConfigurationRecipe(upsertRecipeRequest)

UpsertConfigurationRecipe: Upsert a Configuration Recipe. This creates or updates the data in Lusid.

Update or insert one Configuration Recipe in a single scope. An item will be updated if it already exists  and inserted if it does not.     The response will return the successfully updated or inserted Configuration Recipe or failure message if unsuccessful     It is important to always check to verify success (or failure).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ConfigurationRecipeApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationRecipeApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ConfigurationRecipeApi apiInstance = apiFactory.build(ConfigurationRecipeApi.class);

        ConfigurationRecipeApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationRecipeApi.class);
        UpsertRecipeRequest upsertRecipeRequest = new UpsertRecipeRequest(); // UpsertRecipeRequest | The Configuration Recipe to update or insert
        try {
            // uncomment the below to set overrides at the request level
            // UpsertSingleStructuredDataResponse result = apiInstance.upsertConfigurationRecipe(upsertRecipeRequest).execute(opts);

            UpsertSingleStructuredDataResponse result = apiInstance.upsertConfigurationRecipe(upsertRecipeRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationRecipeApi#upsertConfigurationRecipe");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **upsertRecipeRequest** | [**UpsertRecipeRequest**](UpsertRecipeRequest.md)| The Configuration Recipe to update or insert | |

### Return type

[**UpsertSingleStructuredDataResponse**](UpsertSingleStructuredDataResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted item or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertRecipeComposer

> UpsertSingleStructuredDataResponse upsertRecipeComposer(upsertRecipeComposerRequest)

UpsertRecipeComposer: Upsert a Recipe Composer. This creates or updates the data in Lusid.

Update or insert one Recipe Composer in a single scope. An item will be updated if it already exists  and inserted if it does not.     The response will return the successfully updated or inserted Recipe Composer or failure message if unsuccessful     It is important to always check to verify success (or failure).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ConfigurationRecipeApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationRecipeApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"lusidUrl\": \"https://<your-domain>.lusid.com/api\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // ConfigurationRecipeApi apiInstance = apiFactory.build(ConfigurationRecipeApi.class);

        ConfigurationRecipeApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationRecipeApi.class);
        UpsertRecipeComposerRequest upsertRecipeComposerRequest = new UpsertRecipeComposerRequest(); // UpsertRecipeComposerRequest | The Recipe Composer to update or insert
        try {
            // uncomment the below to set overrides at the request level
            // UpsertSingleStructuredDataResponse result = apiInstance.upsertRecipeComposer(upsertRecipeComposerRequest).execute(opts);

            UpsertSingleStructuredDataResponse result = apiInstance.upsertRecipeComposer(upsertRecipeComposerRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationRecipeApi#upsertRecipeComposer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted item or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

