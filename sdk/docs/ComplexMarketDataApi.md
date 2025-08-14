# ComplexMarketDataApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteComplexMarketData**](ComplexMarketDataApi.md#deleteComplexMarketData) | **POST** /api/complexmarketdata/{scope}/$delete | DeleteComplexMarketData: Delete one or more items of complex market data, assuming they are present. |
| [**getComplexMarketData**](ComplexMarketDataApi.md#getComplexMarketData) | **POST** /api/complexmarketdata/{scope}/$get | GetComplexMarketData: Get complex market data |
| [**listComplexMarketData**](ComplexMarketDataApi.md#listComplexMarketData) | **GET** /api/complexmarketdata | ListComplexMarketData: List the set of ComplexMarketData |
| [**upsertAppendComplexMarketData**](ComplexMarketDataApi.md#upsertAppendComplexMarketData) | **POST** /api/complexmarketdata/{scope}/$append | [EARLY ACCESS] UpsertAppendComplexMarketData: Appends a new point to the end of a ComplexMarketData definition. |
| [**upsertComplexMarketData**](ComplexMarketDataApi.md#upsertComplexMarketData) | **POST** /api/complexmarketdata/{scope} | UpsertComplexMarketData: Upsert a set of complex market data items. This creates or updates the data in Lusid. |



## deleteComplexMarketData

> AnnulStructuredDataResponse deleteComplexMarketData(scope, requestBody)

DeleteComplexMarketData: Delete one or more items of complex market data, assuming they are present.

Delete one or more specified complex market data items from a single scope. Each item is identified by a unique id which includes  information about its type as well as the exact effective datetime (to the microsecond) at which it entered the system (became valid).     In the request each complex market data item must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each quote in the response.     The response will return both the collection of successfully deleted complex market data items, as well as those that failed.  For the failures a reason will be provided explaining why the it could not be deleted.     It is important to always check the failed set for any unsuccessful results.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplexMarketDataApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplexMarketDataApiExample {

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
        // ComplexMarketDataApi apiInstance = apiFactory.build(ComplexMarketDataApi.class);

        ComplexMarketDataApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplexMarketDataApi.class);
        String scope = "scope_example"; // String | The scope of the complex market data to delete.
        Map<String, ComplexMarketDataId> requestBody = new HashMap(); // Map<String, ComplexMarketDataId> | The complex market data Ids to delete, each keyed by a unique correlation id.
        try {
            // uncomment the below to set overrides at the request level
            // AnnulStructuredDataResponse result = apiInstance.deleteComplexMarketData(scope, requestBody).execute(opts);

            AnnulStructuredDataResponse result = apiInstance.deleteComplexMarketData(scope, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplexMarketDataApi#deleteComplexMarketData");
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
| **scope** | **String**| The scope of the complex market data to delete. | |
| **requestBody** | [**Map&lt;String, ComplexMarketDataId&gt;**](ComplexMarketDataId.md)| The complex market data Ids to delete, each keyed by a unique correlation id. | |

### Return type

[**AnnulStructuredDataResponse**](AnnulStructuredDataResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully deleted ComplexMarketData along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getComplexMarketData

> GetComplexMarketDataResponse getComplexMarketData(scope, requestBody, effectiveAt, asAt, maxAge)

GetComplexMarketData: Get complex market data

Get one or more items of complex market data from a single scope.     Each item can be identified by its time invariant complex market data identifier.     For each id LUSID will return the most recent matched item with respect to the provided (or default) effective datetime.     An optional maximum age range window can be specified which defines how far back to look back for data from the specified effective datetime.  LUSID will return the most recent item within this window.     In the request each complex market data id must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each item in the response.     The response will return three collections. One, the successfully retrieved complex market data. Two, those that had a  valid identifier but could not be found. Three, those that failed because LUSID could not construct a valid identifier from the request.     For the ids that failed to resolve or could not be found a reason will be provided explaining why that is the case.     It is important to always check the failed and not found sets for any unsuccessful results.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplexMarketDataApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplexMarketDataApiExample {

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
        // ComplexMarketDataApi apiInstance = apiFactory.build(ComplexMarketDataApi.class);

        ComplexMarketDataApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplexMarketDataApi.class);
        String scope = "scope_example"; // String | The scope of the complex market data to retrieve.
        Map<String, ComplexMarketDataId> requestBody = new HashMap(); // Map<String, ComplexMarketDataId> | The time invariant set of complex data identifiers to retrieve the data for. These need to be   keyed by a unique correlation id allowing the retrieved item to be identified in the response.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime at which to retrieve the complex market data.   Defaults to the current LUSID system datetime if not specified.   Must match the Effective at of each ComplexMarketDataId given in the request body.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the complex market data. Defaults to return the latest version if not specified.
        String maxAge = "maxAge_example"; // String | The duration of the look back window in an ISO8601 time interval format e.g. P1Y2M3DT4H30M (1 year, 2 months, 3 days, 4 hours and 30 minutes).   This is subtracted from the provided effectiveAt datetime to generate a effective datetime window inside which a complex market data item must exist to be retrieved.
        try {
            // uncomment the below to set overrides at the request level
            // GetComplexMarketDataResponse result = apiInstance.getComplexMarketData(scope, requestBody, effectiveAt, asAt, maxAge).execute(opts);

            GetComplexMarketDataResponse result = apiInstance.getComplexMarketData(scope, requestBody, effectiveAt, asAt, maxAge).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplexMarketDataApi#getComplexMarketData");
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
| **scope** | **String**| The scope of the complex market data to retrieve. | |
| **requestBody** | [**Map&lt;String, ComplexMarketDataId&gt;**](ComplexMarketDataId.md)| The time invariant set of complex data identifiers to retrieve the data for. These need to be   keyed by a unique correlation id allowing the retrieved item to be identified in the response. | |
| **effectiveAt** | **String**| The effective datetime at which to retrieve the complex market data.   Defaults to the current LUSID system datetime if not specified.   Must match the Effective at of each ComplexMarketDataId given in the request body. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the complex market data. Defaults to return the latest version if not specified. | [optional] |
| **maxAge** | **String**| The duration of the look back window in an ISO8601 time interval format e.g. P1Y2M3DT4H30M (1 year, 2 months, 3 days, 4 hours and 30 minutes).   This is subtracted from the provided effectiveAt datetime to generate a effective datetime window inside which a complex market data item must exist to be retrieved. | [optional] |

### Return type

[**GetComplexMarketDataResponse**](GetComplexMarketDataResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved complex market data along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listComplexMarketData

> ResourceListOfListComplexMarketDataWithMetaDataResponse listComplexMarketData(asAt, effectiveAt, page, limit)

ListComplexMarketData: List the set of ComplexMarketData

List the set of ComplexMarketData at the specified date/time,  along with the scope the data was stored in and its identifier in that scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplexMarketDataApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplexMarketDataApiExample {

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
        // ComplexMarketDataApi apiInstance = apiFactory.build(ComplexMarketDataApi.class);

        ComplexMarketDataApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplexMarketDataApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the ComplexMarketData. Defaults to latest if not specified.
        String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to list the ComplexMarketData. Defaults to latest if not specified. Note  that this parameter is not implemented at this time and the latest version of the ComplexMarketData will  always be returned.
        String page = "page_example"; // String | The pagination token to use to continue listing ComplexMarketData; this   value is returned from the previous call. If a pagination token is provided, the effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. If not specified, no pagination will be applied. It is  highly recommended to supply a value for this parameter as the default behaviour will change in the future.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfListComplexMarketDataWithMetaDataResponse result = apiInstance.listComplexMarketData(asAt, effectiveAt, page, limit).execute(opts);

            ResourceListOfListComplexMarketDataWithMetaDataResponse result = apiInstance.listComplexMarketData(asAt, effectiveAt, page, limit).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplexMarketDataApi#listComplexMarketData");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the ComplexMarketData. Defaults to latest if not specified. | [optional] |
| **effectiveAt** | **String**| The effectiveAt datetime at which to list the ComplexMarketData. Defaults to latest if not specified. Note  that this parameter is not implemented at this time and the latest version of the ComplexMarketData will  always be returned. | [optional] |
| **page** | **String**| The pagination token to use to continue listing ComplexMarketData; this   value is returned from the previous call. If a pagination token is provided, the effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. If not specified, no pagination will be applied. It is  highly recommended to supply a value for this parameter as the default behaviour will change in the future. | [optional] |

### Return type

[**ResourceListOfListComplexMarketDataWithMetaDataResponse**](ResourceListOfListComplexMarketDataWithMetaDataResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested ComplexMarketData |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertAppendComplexMarketData

> UpsertSingleStructuredDataResponse upsertAppendComplexMarketData(scope, appendComplexMarketDataRequest, effectiveAt, asAt)

[EARLY ACCESS] UpsertAppendComplexMarketData: Appends a new point to the end of a ComplexMarketData definition.

Update a complex market data item in a single scope by appending a new point onto the end.     NOTE: This operation is only supported for FX curves with one of the following data types:  FxForwardCurveByQuoteReference, FxForwardCurveData, FxForwardPipsCurveData, FxForwardTenorCurveData, FxForwardTenorPipsCurveData

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplexMarketDataApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplexMarketDataApiExample {

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
        // ComplexMarketDataApi apiInstance = apiFactory.build(ComplexMarketDataApi.class);

        ComplexMarketDataApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplexMarketDataApi.class);
        String scope = "scope_example"; // String | The scope of the complex market data to append.
        AppendComplexMarketDataRequest appendComplexMarketDataRequest = new AppendComplexMarketDataRequest(); // AppendComplexMarketDataRequest | Request definition of the point to append.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime at which to retrieve the complex market data.   Defaults to the current LUSID system datetime if not specified.   Must match the effectiveAt of the ComplexMarketDataId given in the request body.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the complex market data. Defaults to return the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // UpsertSingleStructuredDataResponse result = apiInstance.upsertAppendComplexMarketData(scope, appendComplexMarketDataRequest, effectiveAt, asAt).execute(opts);

            UpsertSingleStructuredDataResponse result = apiInstance.upsertAppendComplexMarketData(scope, appendComplexMarketDataRequest, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplexMarketDataApi#upsertAppendComplexMarketData");
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
| **scope** | **String**| The scope of the complex market data to append. | |
| **appendComplexMarketDataRequest** | [**AppendComplexMarketDataRequest**](AppendComplexMarketDataRequest.md)| Request definition of the point to append. | |
| **effectiveAt** | **String**| The effective datetime at which to retrieve the complex market data.   Defaults to the current LUSID system datetime if not specified.   Must match the effectiveAt of the ComplexMarketDataId given in the request body. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the complex market data. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**UpsertSingleStructuredDataResponse**](UpsertSingleStructuredDataResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully appended ComplexMarketData along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertComplexMarketData

> UpsertStructuredDataResponse upsertComplexMarketData(scope, requestBody)

UpsertComplexMarketData: Upsert a set of complex market data items. This creates or updates the data in Lusid.

Update or insert one or more complex market data items in a single scope. An item will be updated if it already exists  and inserted if it does not.     In the request each complex market data item must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each complex market data in the response.     The response will return both the collection of successfully updated or inserted complex market data, as well as those that failed.  For the failures a reason will be provided explaining why the item could not be updated or inserted.     It is important to always check the failed set for any unsuccessful results.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ComplexMarketDataApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ComplexMarketDataApiExample {

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
        // ComplexMarketDataApi apiInstance = apiFactory.build(ComplexMarketDataApi.class);

        ComplexMarketDataApi apiInstance = ApiFactoryBuilder.build(fileName).build(ComplexMarketDataApi.class);
        String scope = "scope_example"; // String | The scope to use when updating or inserting the complex market data.
        Map<String, UpsertComplexMarketDataRequest> requestBody = new HashMap(); // Map<String, UpsertComplexMarketDataRequest> | The set of complex market data items to update or insert keyed by a unique correlation id.
        try {
            // uncomment the below to set overrides at the request level
            // UpsertStructuredDataResponse result = apiInstance.upsertComplexMarketData(scope, requestBody).execute(opts);

            UpsertStructuredDataResponse result = apiInstance.upsertComplexMarketData(scope, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComplexMarketDataApi#upsertComplexMarketData");
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
| **scope** | **String**| The scope to use when updating or inserting the complex market data. | |
| **requestBody** | [**Map&lt;String, UpsertComplexMarketDataRequest&gt;**](UpsertComplexMarketDataRequest.md)| The set of complex market data items to update or insert keyed by a unique correlation id. | |

### Return type

[**UpsertStructuredDataResponse**](UpsertStructuredDataResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted ComplexMarketData along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

