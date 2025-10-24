# RelationalDatasetsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchUpsertRelationalData**](RelationalDatasetsApi.md#batchUpsertRelationalData) | **POST** /api/relationaldatasets/{relationalDatasetDefinitionScope}/{relationalDatasetDefinitionCode}/$batchUpsert | [EXPERIMENTAL] BatchUpsertRelationalData: Batch Upsert Relational Data Points for a given Relational Dataset Definition. |
| [**queryRelationalData**](RelationalDatasetsApi.md#queryRelationalData) | **POST** /api/relationaldatasets/{relationalDatasetDefinitionScope}/{relationalDatasetDefinitionCode}/$query | [EXPERIMENTAL] QueryRelationalData: Query Relational Data Points for a given Relational Dataset Definition. |



## batchUpsertRelationalData

> BatchUpsertRelationalDatasetsResponse batchUpsertRelationalData(relationalDatasetDefinitionScope, relationalDatasetDefinitionCode, requestBody, successMode)

[EXPERIMENTAL] BatchUpsertRelationalData: Batch Upsert Relational Data Points for a given Relational Dataset Definition.

Batch Upsert Relational Data Points for a given Relational Dataset Definition.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RelationalDatasetsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RelationalDatasetsApiExample {

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
        // RelationalDatasetsApi apiInstance = apiFactory.build(RelationalDatasetsApi.class);

        RelationalDatasetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RelationalDatasetsApi.class);
        String relationalDatasetDefinitionScope = "relationalDatasetDefinitionScope_example"; // String | The Scope of the relational dataset definition.
        String relationalDatasetDefinitionCode = "relationalDatasetDefinitionCode_example"; // String | The Code of the relational dataset definition.
        Map<String, UpsertRelationalDataPointRequest> requestBody = new HashMap(); // Map<String, UpsertRelationalDataPointRequest> | The DataPoints to upsert.
        String successMode = "Partial"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial.   Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code.
        try {
            // uncomment the below to set overrides at the request level
            // BatchUpsertRelationalDatasetsResponse result = apiInstance.batchUpsertRelationalData(relationalDatasetDefinitionScope, relationalDatasetDefinitionCode, requestBody, successMode).execute(opts);

            BatchUpsertRelationalDatasetsResponse result = apiInstance.batchUpsertRelationalData(relationalDatasetDefinitionScope, relationalDatasetDefinitionCode, requestBody, successMode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationalDatasetsApi#batchUpsertRelationalData");
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
| **relationalDatasetDefinitionScope** | **String**| The Scope of the relational dataset definition. | |
| **relationalDatasetDefinitionCode** | **String**| The Code of the relational dataset definition. | |
| **requestBody** | [**Map&lt;String, UpsertRelationalDataPointRequest&gt;**](UpsertRelationalDataPointRequest.md)| The DataPoints to upsert. | |
| **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial.   Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code. | [optional] [default to Partial] |

### Return type

[**BatchUpsertRelationalDatasetsResponse**](BatchUpsertRelationalDatasetsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The relational data points that were upserted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## queryRelationalData

> PagedResourceListOfRelationalDataPointResponse queryRelationalData(relationalDatasetDefinitionScope, relationalDatasetDefinitionCode, queryRelationalDatasetRequest, asAt, effectiveAt, page, limit)

[EXPERIMENTAL] QueryRelationalData: Query Relational Data Points for a given Relational Dataset Definition.

Query Relational Data Points for a given Relational Dataset Definition.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RelationalDatasetsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RelationalDatasetsApiExample {

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
        // RelationalDatasetsApi apiInstance = apiFactory.build(RelationalDatasetsApi.class);

        RelationalDatasetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RelationalDatasetsApi.class);
        String relationalDatasetDefinitionScope = "relationalDatasetDefinitionScope_example"; // String | The Scope of the relational dataset definition.
        String relationalDatasetDefinitionCode = "relationalDatasetDefinitionCode_example"; // String | The Code of the relational dataset definition.
        QueryRelationalDatasetRequest queryRelationalDatasetRequest = new QueryRelationalDatasetRequest(); // QueryRelationalDatasetRequest | The query request.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the dataset(s). Defaults to returning the latest version of each dataset if not specified.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to query the datasets.   Defaults to the current LUSID system datetime if not specified.
        String page = "page_example"; // String | The pagination token to use to continue query datasets. This value is returned from the previous call.   If a pagination token is provided, the filter, customSortBy, effectiveAt and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfRelationalDataPointResponse result = apiInstance.queryRelationalData(relationalDatasetDefinitionScope, relationalDatasetDefinitionCode, queryRelationalDatasetRequest, asAt, effectiveAt, page, limit).execute(opts);

            PagedResourceListOfRelationalDataPointResponse result = apiInstance.queryRelationalData(relationalDatasetDefinitionScope, relationalDatasetDefinitionCode, queryRelationalDatasetRequest, asAt, effectiveAt, page, limit).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationalDatasetsApi#queryRelationalData");
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
| **relationalDatasetDefinitionScope** | **String**| The Scope of the relational dataset definition. | |
| **relationalDatasetDefinitionCode** | **String**| The Code of the relational dataset definition. | |
| **queryRelationalDatasetRequest** | [**QueryRelationalDatasetRequest**](QueryRelationalDatasetRequest.md)| The query request. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the dataset(s). Defaults to returning the latest version of each dataset if not specified. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to query the datasets.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue query datasets. This value is returned from the previous call.   If a pagination token is provided, the filter, customSortBy, effectiveAt and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |

### Return type

[**PagedResourceListOfRelationalDataPointResponse**](PagedResourceListOfRelationalDataPointResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The relational data points that were queried. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

