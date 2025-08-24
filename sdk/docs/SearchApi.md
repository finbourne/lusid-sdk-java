# SearchApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**instrumentsSearch**](SearchApi.md#instrumentsSearch) | **POST** /api/search/instruments | [EARLY ACCESS] InstrumentsSearch: Instruments search |
| [**searchPortfolioGroups**](SearchApi.md#searchPortfolioGroups) | **GET** /api/search/portfoliogroups | SearchPortfolioGroups: Search Portfolio Groups |
| [**searchPortfolios**](SearchApi.md#searchPortfolios) | **GET** /api/search/portfolios | SearchPortfolios: Search Portfolios |
| [**searchProperties**](SearchApi.md#searchProperties) | **GET** /api/search/propertydefinitions | SearchProperties: Search Property Definitions |



## instrumentsSearch

> List&lt;InstrumentMatch&gt; instrumentsSearch(instrumentSearchProperty, masteredEffectiveAt, masteredOnly, scope)

[EARLY ACCESS] InstrumentsSearch: Instruments search

Search across all instruments that have been mastered in LUSID. Optionally augment the results with instruments from an external symbology service,  currently OpenFIGI.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SearchApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SearchApiExample {

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
        // SearchApi apiInstance = apiFactory.build(SearchApi.class);

        SearchApi apiInstance = ApiFactoryBuilder.build(fileName).build(SearchApi.class);
        List<InstrumentSearchProperty> instrumentSearchProperty = Arrays.asList(); // List<InstrumentSearchProperty> | A collection of instrument properties to search for. LUSID will return instruments for any matched   properties.
        String masteredEffectiveAt = "masteredEffectiveAt_example"; // String | The effective datetime or cut label to use when searching mastered instruments. This parameter has no effect on instruments that  have not been mastered within LUSID. Defaults to the current LUSID system datetime if not specified.
        Boolean masteredOnly = false; // Boolean | If set to true, only search over instruments that have been mastered within LUSID. Defaults to false.
        String scope = "scope_example"; // String | The scope in which the instrument lies.
        try {
            // uncomment the below to set overrides at the request level
            // List<InstrumentMatch> result = apiInstance.instrumentsSearch(instrumentSearchProperty, masteredEffectiveAt, masteredOnly, scope).execute(opts);

            List<InstrumentMatch> result = apiInstance.instrumentsSearch(instrumentSearchProperty, masteredEffectiveAt, masteredOnly, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#instrumentsSearch");
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
| **instrumentSearchProperty** | [**List&lt;InstrumentSearchProperty&gt;**](InstrumentSearchProperty.md)| A collection of instrument properties to search for. LUSID will return instruments for any matched   properties. | |
| **masteredEffectiveAt** | **String**| The effective datetime or cut label to use when searching mastered instruments. This parameter has no effect on instruments that  have not been mastered within LUSID. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **masteredOnly** | **Boolean**| If set to true, only search over instruments that have been mastered within LUSID. Defaults to false. | [optional] [default to false] |
| **scope** | **String**| The scope in which the instrument lies. | [optional] |

### Return type

[**List&lt;InstrumentMatch&gt;**](InstrumentMatch.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The instruments found by the search |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## searchPortfolioGroups

> PagedResourceListOfPortfolioGroupSearchResult searchPortfolioGroups(search, filter, sortBy, limit, page)

SearchPortfolioGroups: Search Portfolio Groups

Search through all portfolio groups

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SearchApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SearchApiExample {

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
        // SearchApi apiInstance = apiFactory.build(SearchApi.class);

        SearchApi apiInstance = ApiFactoryBuilder.build(fileName).build(SearchApi.class);
        String search = "search_example"; // String | A parameter used for searching any portfolio group field. Wildcards(*) are supported at the end of words (e.g. 'Port*'). Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the Scope, use \"id.scope eq 'string'\"  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        String sortBy = "sortBy_example"; // String | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName
        Integer limit = 56; // Integer | When paginating, only return this number of records
        String page = "page_example"; // String | Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter, sortBy and search fields should not be supplied.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfPortfolioGroupSearchResult result = apiInstance.searchPortfolioGroups(search, filter, sortBy, limit, page).execute(opts);

            PagedResourceListOfPortfolioGroupSearchResult result = apiInstance.searchPortfolioGroups(search, filter, sortBy, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#searchPortfolioGroups");
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
| **search** | **String**| A parameter used for searching any portfolio group field. Wildcards(*) are supported at the end of words (e.g. &#39;Port*&#39;). Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to filter on the Scope, use \&quot;id.scope eq &#39;string&#39;\&quot;  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | **String**| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName | [optional] |
| **limit** | **Integer**| When paginating, only return this number of records | [optional] |
| **page** | **String**| Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter, sortBy and search fields should not be supplied. | [optional] |

### Return type

[**PagedResourceListOfPortfolioGroupSearchResult**](PagedResourceListOfPortfolioGroupSearchResult.md)

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


## searchPortfolios

> PagedResourceListOfPortfolioSearchResult searchPortfolios(search, filter, sortBy, limit, page)

SearchPortfolios: Search Portfolios

Search through all portfolios

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SearchApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SearchApiExample {

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
        // SearchApi apiInstance = apiFactory.build(SearchApi.class);

        SearchApi apiInstance = ApiFactoryBuilder.build(fileName).build(SearchApi.class);
        String search = "search_example"; // String | A parameter used for searching any portfolio field. Wildcards(*) are supported at the end of words (e.g. 'Port*'). Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the portfolio Type, use \"type eq 'Transaction'\"  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        String sortBy = "sortBy_example"; // String | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName
        Integer limit = 56; // Integer | When paginating, only return this number of records
        String page = "page_example"; // String | Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter, sortBy and search fields should not be supplied.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfPortfolioSearchResult result = apiInstance.searchPortfolios(search, filter, sortBy, limit, page).execute(opts);

            PagedResourceListOfPortfolioSearchResult result = apiInstance.searchPortfolios(search, filter, sortBy, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#searchPortfolios");
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
| **search** | **String**| A parameter used for searching any portfolio field. Wildcards(*) are supported at the end of words (e.g. &#39;Port*&#39;). Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to filter on the portfolio Type, use \&quot;type eq &#39;Transaction&#39;\&quot;  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | **String**| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName | [optional] |
| **limit** | **Integer**| When paginating, only return this number of records | [optional] |
| **page** | **String**| Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter, sortBy and search fields should not be supplied. | [optional] |

### Return type

[**PagedResourceListOfPortfolioSearchResult**](PagedResourceListOfPortfolioSearchResult.md)

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


## searchProperties

> PagedResourceListOfPropertyDefinitionSearchResult searchProperties(search, filter, sortBy, limit, page)

SearchProperties: Search Property Definitions

Search through all Property Definitions

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SearchApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SearchApiExample {

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
        // SearchApi apiInstance = apiFactory.build(SearchApi.class);

        SearchApi apiInstance = ApiFactoryBuilder.build(fileName).build(SearchApi.class);
        String search = "search_example"; // String | A parameter used for searching any field. Wildcards(*) are supported at the end of words (e.g. 'Port*'). Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        String filter = "filter_example"; // String | Expression to filter the result set.   For example, to filter on the Value Type, use \"valueType eq 'string'\"  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        String sortBy = "sortBy_example"; // String | Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName
        Integer limit = 56; // Integer | When paginating, only return this number of records
        String page = "page_example"; // String | Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter, sortBy and search fields should not be supplied.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfPropertyDefinitionSearchResult result = apiInstance.searchProperties(search, filter, sortBy, limit, page).execute(opts);

            PagedResourceListOfPropertyDefinitionSearchResult result = apiInstance.searchProperties(search, filter, sortBy, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#searchProperties");
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
| **search** | **String**| A parameter used for searching any field. Wildcards(*) are supported at the end of words (e.g. &#39;Port*&#39;). Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **filter** | **String**| Expression to filter the result set.   For example, to filter on the Value Type, use \&quot;valueType eq &#39;string&#39;\&quot;  Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | **String**| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName. Multiple fields can be denoted by a comma e.g. -MyFieldName,AnotherFieldName,-AFurtherFieldName | [optional] |
| **limit** | **Integer**| When paginating, only return this number of records | [optional] |
| **page** | **String**| Encoded page string returned from a previous search result that will retrieve the next page of data. When this field is supplied, filter, sortBy and search fields should not be supplied. | [optional] |

### Return type

[**PagedResourceListOfPropertyDefinitionSearchResult**](PagedResourceListOfPropertyDefinitionSearchResult.md)

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

