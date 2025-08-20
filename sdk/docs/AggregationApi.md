# AggregationApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateConfigurationRecipe**](AggregationApi.md#generateConfigurationRecipe) | **POST** /api/aggregation/{scope}/{code}/$generateconfigurationrecipe | [EXPERIMENTAL] GenerateConfigurationRecipe: Generates a recipe sufficient to perform valuations for the given portfolio. |
| [**getQueryableKeys**](AggregationApi.md#getQueryableKeys) | **GET** /api/results/queryable/keys | GetQueryableKeys: Query the set of supported \&quot;addresses\&quot; that can be queried from the aggregation endpoint. |
| [**getValuation**](AggregationApi.md#getValuation) | **POST** /api/aggregation/$valuation | GetValuation: Perform valuation for a list of portfolios and/or portfolio groups |
| [**getValuationOfWeightedInstruments**](AggregationApi.md#getValuationOfWeightedInstruments) | **POST** /api/aggregation/$valuationinlined | GetValuationOfWeightedInstruments: Perform valuation for an inlined portfolio |



## generateConfigurationRecipe

> ConfigurationRecipe generateConfigurationRecipe(scope, code, createRecipeRequest)

[EXPERIMENTAL] GenerateConfigurationRecipe: Generates a recipe sufficient to perform valuations for the given portfolio.

Given a set of scopes, a portfolio Id and a basic recipe, this endpoint generates a configuration recipe with relevant rules that can value the instruments in the portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AggregationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AggregationApiExample {

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
        // AggregationApi apiInstance = apiFactory.build(AggregationApi.class);

        AggregationApi apiInstance = ApiFactoryBuilder.build(fileName).build(AggregationApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio
        String code = "code_example"; // String | The code of the portfolio
        CreateRecipeRequest createRecipeRequest = new CreateRecipeRequest(); // CreateRecipeRequest | The request specifying the parameters to generating the recipe
        try {
            // uncomment the below to set overrides at the request level
            // ConfigurationRecipe result = apiInstance.generateConfigurationRecipe(scope, code, createRecipeRequest).execute(opts);

            ConfigurationRecipe result = apiInstance.generateConfigurationRecipe(scope, code, createRecipeRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AggregationApi#generateConfigurationRecipe");
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
| **scope** | **String**| The scope of the portfolio | |
| **code** | **String**| The code of the portfolio | |
| **createRecipeRequest** | [**CreateRecipeRequest**](CreateRecipeRequest.md)| The request specifying the parameters to generating the recipe | [optional] |

### Return type

[**ConfigurationRecipe**](ConfigurationRecipe.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getQueryableKeys

> ResourceListOfAggregationQuery getQueryableKeys(page, limit, filter)

GetQueryableKeys: Query the set of supported \&quot;addresses\&quot; that can be queried from the aggregation endpoint.

When a request is made for aggregation, the user needs to know what keys can be passed to it for queryable data. This endpoint allows to queries to provide the set of keys, what they are and what they return.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AggregationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AggregationApiExample {

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
        // AggregationApi apiInstance = apiFactory.build(AggregationApi.class);

        AggregationApi apiInstance = ApiFactoryBuilder.build(fileName).build(AggregationApi.class);
        String page = "page_example"; // String | The pagination token to use to continue listing queryable keys from a previous call to list queryable keys.  This value is returned from the previous call.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set.  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfAggregationQuery result = apiInstance.getQueryableKeys(page, limit, filter).execute(opts);

            ResourceListOfAggregationQuery result = apiInstance.getQueryableKeys(page, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AggregationApi#getQueryableKeys");
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
| **page** | **String**| The pagination token to use to continue listing queryable keys from a previous call to list queryable keys.  This value is returned from the previous call. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set.  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**ResourceListOfAggregationQuery**](ResourceListOfAggregationQuery.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getValuation

> ListAggregationResponse getValuation(valuationRequest)

GetValuation: Perform valuation for a list of portfolios and/or portfolio groups

Perform valuation on specified list of portfolio and/or portfolio groups for a set of dates.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AggregationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AggregationApiExample {

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
        // AggregationApi apiInstance = apiFactory.build(AggregationApi.class);

        AggregationApi apiInstance = ApiFactoryBuilder.build(fileName).build(AggregationApi.class);
        ValuationRequest valuationRequest = new ValuationRequest(); // ValuationRequest | The request specifying the set of portfolios and dates on which to calculate a set of valuation metrics
        try {
            // uncomment the below to set overrides at the request level
            // ListAggregationResponse result = apiInstance.getValuation(valuationRequest).execute(opts);

            ListAggregationResponse result = apiInstance.getValuation(valuationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AggregationApi#getValuation");
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
| **valuationRequest** | [**ValuationRequest**](ValuationRequest.md)| The request specifying the set of portfolios and dates on which to calculate a set of valuation metrics | [optional] |

### Return type

[**ListAggregationResponse**](ListAggregationResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getValuationOfWeightedInstruments

> ListAggregationResponse getValuationOfWeightedInstruments(inlineValuationRequest)

GetValuationOfWeightedInstruments: Perform valuation for an inlined portfolio

Perform valuation on the portfolio that is defined by the weighted set of instruments passed to the request.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AggregationApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AggregationApiExample {

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
        // AggregationApi apiInstance = apiFactory.build(AggregationApi.class);

        AggregationApi apiInstance = ApiFactoryBuilder.build(fileName).build(AggregationApi.class);
        InlineValuationRequest inlineValuationRequest = new InlineValuationRequest(); // InlineValuationRequest | The request specifying the set of portfolios and dates on which to calculate a set of valuation metrics
        try {
            // uncomment the below to set overrides at the request level
            // ListAggregationResponse result = apiInstance.getValuationOfWeightedInstruments(inlineValuationRequest).execute(opts);

            ListAggregationResponse result = apiInstance.getValuationOfWeightedInstruments(inlineValuationRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AggregationApi#getValuationOfWeightedInstruments");
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
| **inlineValuationRequest** | [**InlineValuationRequest**](InlineValuationRequest.md)| The request specifying the set of portfolios and dates on which to calculate a set of valuation metrics | [optional] |

### Return type

[**ListAggregationResponse**](ListAggregationResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

