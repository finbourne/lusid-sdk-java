# EligibleCollateralSchedulesApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEligibleCollateralSchedule**](EligibleCollateralSchedulesApi.md#createEligibleCollateralSchedule) | **POST** /api/eligiblecollateralschedules/{scope} | [EXPERIMENTAL] CreateEligibleCollateralSchedule: Create an Eligible Collateral Schedule. |
| [**deleteEligibleCollateralSchedule**](EligibleCollateralSchedulesApi.md#deleteEligibleCollateralSchedule) | **DELETE** /api/eligiblecollateralschedules/{scope}/{code} | [EXPERIMENTAL] DeleteEligibleCollateralSchedule: Delete an Eligible Collateral Schedule. |
| [**getEligibleCollateralSchedule**](EligibleCollateralSchedulesApi.md#getEligibleCollateralSchedule) | **GET** /api/eligiblecollateralschedules/{scope}/{code} | [EXPERIMENTAL] GetEligibleCollateralSchedule: Get an Eligible Collateral Schedule. |
| [**listEligibleCollateralSchedules**](EligibleCollateralSchedulesApi.md#listEligibleCollateralSchedules) | **GET** /api/eligiblecollateralschedules | [EXPERIMENTAL] ListEligibleCollateralSchedules: List Eligible Collateral Schedules. |
| [**upsertEligibleCollateralSchedule**](EligibleCollateralSchedulesApi.md#upsertEligibleCollateralSchedule) | **PUT** /api/eligiblecollateralschedules/{scope}/{code} | [EXPERIMENTAL] UpsertEligibleCollateralSchedule: Upsert an Eligible Collateral Schedule. |



## createEligibleCollateralSchedule

> EligibleCollateralSchedule createEligibleCollateralSchedule(scope, eligibleCollateralScheduleRequest)

[EXPERIMENTAL] CreateEligibleCollateralSchedule: Create an Eligible Collateral Schedule.

Create a new Eligible Collateral Schedule. The scope of the schedule is in the route and its code is in the request body.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EligibleCollateralSchedulesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EligibleCollateralSchedulesApiExample {

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
        // EligibleCollateralSchedulesApi apiInstance = apiFactory.build(EligibleCollateralSchedulesApi.class);

        EligibleCollateralSchedulesApi apiInstance = ApiFactoryBuilder.build(fileName).build(EligibleCollateralSchedulesApi.class);
        String scope = "scope_example"; // String | The scope of the Eligible Collateral Schedule.
        EligibleCollateralScheduleRequest eligibleCollateralScheduleRequest = new EligibleCollateralScheduleRequest(); // EligibleCollateralScheduleRequest | The definition of the Eligible Collateral Schedule.
        try {
            // uncomment the below to set overrides at the request level
            // EligibleCollateralSchedule result = apiInstance.createEligibleCollateralSchedule(scope, eligibleCollateralScheduleRequest).execute(opts);

            EligibleCollateralSchedule result = apiInstance.createEligibleCollateralSchedule(scope, eligibleCollateralScheduleRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EligibleCollateralSchedulesApi#createEligibleCollateralSchedule");
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
| **scope** | **String**| The scope of the Eligible Collateral Schedule. | |
| **eligibleCollateralScheduleRequest** | [**EligibleCollateralScheduleRequest**](EligibleCollateralScheduleRequest.md)| The definition of the Eligible Collateral Schedule. | |

### Return type

[**EligibleCollateralSchedule**](EligibleCollateralSchedule.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Eligible Collateral Schedule. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteEligibleCollateralSchedule

> DeletedEntityResponse deleteEligibleCollateralSchedule(scope, code, effectiveAt)

[EXPERIMENTAL] DeleteEligibleCollateralSchedule: Delete an Eligible Collateral Schedule.

Delete an Eligible Collateral Schedule from the given effective datetime. It remains retrievable at earlier effective datetimes.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EligibleCollateralSchedulesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EligibleCollateralSchedulesApiExample {

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
        // EligibleCollateralSchedulesApi apiInstance = apiFactory.build(EligibleCollateralSchedulesApi.class);

        EligibleCollateralSchedulesApi apiInstance = ApiFactoryBuilder.build(fileName).build(EligibleCollateralSchedulesApi.class);
        String scope = "scope_example"; // String | The scope of the Eligible Collateral Schedule to be deleted.
        String code = "code_example"; // String | The code of the Eligible Collateral Schedule to be deleted. Together with the scope this uniquely identifies the Eligible Collateral Schedule.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the Eligible Collateral Schedule is deleted. Defaults to the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteEligibleCollateralSchedule(scope, code, effectiveAt).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteEligibleCollateralSchedule(scope, code, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EligibleCollateralSchedulesApi#deleteEligibleCollateralSchedule");
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
| **scope** | **String**| The scope of the Eligible Collateral Schedule to be deleted. | |
| **code** | **String**| The code of the Eligible Collateral Schedule to be deleted. Together with the scope this uniquely identifies the Eligible Collateral Schedule. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the Eligible Collateral Schedule is deleted. Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the Eligible Collateral Schedule was deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getEligibleCollateralSchedule

> EligibleCollateralSchedule getEligibleCollateralSchedule(scope, code, effectiveAt, asAt, propertyKeys)

[EXPERIMENTAL] GetEligibleCollateralSchedule: Get an Eligible Collateral Schedule.

Retrieve the definition of a particular Eligible Collateral Schedule at an effective and asAt datetime.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EligibleCollateralSchedulesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EligibleCollateralSchedulesApiExample {

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
        // EligibleCollateralSchedulesApi apiInstance = apiFactory.build(EligibleCollateralSchedulesApi.class);

        EligibleCollateralSchedulesApi apiInstance = ApiFactoryBuilder.build(fileName).build(EligibleCollateralSchedulesApi.class);
        String scope = "scope_example"; // String | The scope of the Eligible Collateral Schedule.
        String code = "code_example"; // String | The code of the Eligible Collateral Schedule. Together with the scope this uniquely identifies the Eligible Collateral Schedule.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Eligible Collateral Schedule. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Eligible Collateral Schedule. Defaults to returning the latest version if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'EligibleCollateralSchedule' domain to decorate onto the Eligible Collateral Schedule.   These must take the format {domain}/{scope}/{code}, for example 'EligibleCollateralSchedule/Manager/Id'. If no properties are specified, then no properties will be returned.
        try {
            // uncomment the below to set overrides at the request level
            // EligibleCollateralSchedule result = apiInstance.getEligibleCollateralSchedule(scope, code, effectiveAt, asAt, propertyKeys).execute(opts);

            EligibleCollateralSchedule result = apiInstance.getEligibleCollateralSchedule(scope, code, effectiveAt, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EligibleCollateralSchedulesApi#getEligibleCollateralSchedule");
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
| **scope** | **String**| The scope of the Eligible Collateral Schedule. | |
| **code** | **String**| The code of the Eligible Collateral Schedule. Together with the scope this uniquely identifies the Eligible Collateral Schedule. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Eligible Collateral Schedule. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Eligible Collateral Schedule. Defaults to returning the latest version if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;EligibleCollateralSchedule&#39; domain to decorate onto the Eligible Collateral Schedule.   These must take the format {domain}/{scope}/{code}, for example &#39;EligibleCollateralSchedule/Manager/Id&#39;. If no properties are specified, then no properties will be returned. | [optional] |

### Return type

[**EligibleCollateralSchedule**](EligibleCollateralSchedule.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Eligible Collateral Schedule. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listEligibleCollateralSchedules

> PagedResourceListOfEligibleCollateralSchedule listEligibleCollateralSchedules(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListEligibleCollateralSchedules: List Eligible Collateral Schedules.

List all the Eligible Collateral Schedules matching the given criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EligibleCollateralSchedulesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EligibleCollateralSchedulesApiExample {

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
        // EligibleCollateralSchedulesApi apiInstance = apiFactory.build(EligibleCollateralSchedulesApi.class);

        EligibleCollateralSchedulesApi apiInstance = ApiFactoryBuilder.build(fileName).build(EligibleCollateralSchedulesApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the Eligible Collateral Schedules. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list Eligible Collateral Schedules. Defaults to returning the latest version of each Eligible Collateral Schedule if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Eligible Collateral Schedules; this value is returned from the previous call. If a pagination token is provided, the filter and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. The filterable fields are Id.Scope, Id.Code, Description, Properties and Version. The rows can be filtered with a single-condition any expression on Rows over Code, Description, Selector.Kind, Selector.Currency, Selector.InstrumentFilter, ValuationPercentage, FxHaircut, MinResidualMaturityYears or MaxResidualMaturityYears. For example, to filter on the schedule code, specify \"Id.Code eq 'UsdCashAndGovies'\", and to find schedules with a row for a given asset kind, specify \"Rows any (Selector.Kind eq 'Cash')\". For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'EligibleCollateralSchedule' domain to decorate onto each Eligible Collateral Schedule.   These must take the format {domain}/{scope}/{code}, for example 'EligibleCollateralSchedule/Manager/Id'.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfEligibleCollateralSchedule result = apiInstance.listEligibleCollateralSchedules(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            PagedResourceListOfEligibleCollateralSchedule result = apiInstance.listEligibleCollateralSchedules(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EligibleCollateralSchedulesApi#listEligibleCollateralSchedules");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the Eligible Collateral Schedules. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list Eligible Collateral Schedules. Defaults to returning the latest version of each Eligible Collateral Schedule if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Eligible Collateral Schedules; this value is returned from the previous call. If a pagination token is provided, the filter and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. The filterable fields are Id.Scope, Id.Code, Description, Properties and Version. The rows can be filtered with a single-condition any expression on Rows over Code, Description, Selector.Kind, Selector.Currency, Selector.InstrumentFilter, ValuationPercentage, FxHaircut, MinResidualMaturityYears or MaxResidualMaturityYears. For example, to filter on the schedule code, specify \&quot;Id.Code eq &#39;UsdCashAndGovies&#39;\&quot;, and to find schedules with a row for a given asset kind, specify \&quot;Rows any (Selector.Kind eq &#39;Cash&#39;)\&quot;. For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;EligibleCollateralSchedule&#39; domain to decorate onto each Eligible Collateral Schedule.   These must take the format {domain}/{scope}/{code}, for example &#39;EligibleCollateralSchedule/Manager/Id&#39;. | [optional] |

### Return type

[**PagedResourceListOfEligibleCollateralSchedule**](PagedResourceListOfEligibleCollateralSchedule.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Eligible Collateral Schedules. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertEligibleCollateralSchedule

> EligibleCollateralSchedule upsertEligibleCollateralSchedule(scope, code, upsertEligibleCollateralScheduleRequest)

[EXPERIMENTAL] UpsertEligibleCollateralSchedule: Upsert an Eligible Collateral Schedule.

Create or replace the full definition of an Eligible Collateral Schedule from an effective datetime. A change to the  definition becomes a new bitemporal version: the schedule as it was declared at earlier effective datetimes,  and as of earlier asAt datetimes, remains retrievable.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EligibleCollateralSchedulesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EligibleCollateralSchedulesApiExample {

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
        // EligibleCollateralSchedulesApi apiInstance = apiFactory.build(EligibleCollateralSchedulesApi.class);

        EligibleCollateralSchedulesApi apiInstance = ApiFactoryBuilder.build(fileName).build(EligibleCollateralSchedulesApi.class);
        String scope = "scope_example"; // String | The scope of the Eligible Collateral Schedule.
        String code = "code_example"; // String | The code of the Eligible Collateral Schedule. Together with the scope this uniquely identifies the Eligible Collateral Schedule.
        UpsertEligibleCollateralScheduleRequest upsertEligibleCollateralScheduleRequest = new UpsertEligibleCollateralScheduleRequest(); // UpsertEligibleCollateralScheduleRequest | The full definition of the Eligible Collateral Schedule from the effective datetime in the request, or the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // EligibleCollateralSchedule result = apiInstance.upsertEligibleCollateralSchedule(scope, code, upsertEligibleCollateralScheduleRequest).execute(opts);

            EligibleCollateralSchedule result = apiInstance.upsertEligibleCollateralSchedule(scope, code, upsertEligibleCollateralScheduleRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EligibleCollateralSchedulesApi#upsertEligibleCollateralSchedule");
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
| **scope** | **String**| The scope of the Eligible Collateral Schedule. | |
| **code** | **String**| The code of the Eligible Collateral Schedule. Together with the scope this uniquely identifies the Eligible Collateral Schedule. | |
| **upsertEligibleCollateralScheduleRequest** | [**UpsertEligibleCollateralScheduleRequest**](UpsertEligibleCollateralScheduleRequest.md)| The full definition of the Eligible Collateral Schedule from the effective datetime in the request, or the current LUSID system datetime if not specified. | |

### Return type

[**EligibleCollateralSchedule**](EligibleCollateralSchedule.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Eligible Collateral Schedule as it stands from the effective datetime. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

