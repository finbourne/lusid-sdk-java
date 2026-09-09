# CurrencyGroupsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCurrencyGroup**](CurrencyGroupsApi.md#deleteCurrencyGroup) | **DELETE** /api/currencies/groups/{code} | [EXPERIMENTAL] DeleteCurrencyGroup: Delete a currency group. |
| [**getCurrencyGroup**](CurrencyGroupsApi.md#getCurrencyGroup) | **GET** /api/currencies/groups/{code} | [EXPERIMENTAL] GetCurrencyGroup: Get a currency group. |
| [**listCurrencyGroups**](CurrencyGroupsApi.md#listCurrencyGroups) | **GET** /api/currencies/groups | [EXPERIMENTAL] ListCurrencyGroups: List currency groups. |
| [**upsertCurrencyGroup**](CurrencyGroupsApi.md#upsertCurrencyGroup) | **POST** /api/currencies/groups | [EXPERIMENTAL] UpsertCurrencyGroup: Upsert a currency group. |



## deleteCurrencyGroup

> DeletedEntityResponse deleteCurrencyGroup(code)

[EXPERIMENTAL] DeleteCurrencyGroup: Delete a currency group.

Delete the currency group with the given code. The group&#39;s currencies are freed to be claimed  by other currency groups.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CurrencyGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CurrencyGroupsApiExample {

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
        // CurrencyGroupsApi apiInstance = apiFactory.build(CurrencyGroupsApi.class);

        CurrencyGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CurrencyGroupsApi.class);
        String code = "code_example"; // String | The code of the currency group to delete.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteCurrencyGroup(code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteCurrencyGroup(code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyGroupsApi#deleteCurrencyGroup");
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
| **code** | **String**| The code of the currency group to delete. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The deleted entity metadata. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getCurrencyGroup

> CurrencyGroupResponse getCurrencyGroup(code, asAt)

[EXPERIMENTAL] GetCurrencyGroup: Get a currency group.

Get the currency group with the given code.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CurrencyGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CurrencyGroupsApiExample {

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
        // CurrencyGroupsApi apiInstance = apiFactory.build(CurrencyGroupsApi.class);

        CurrencyGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CurrencyGroupsApi.class);
        String code = "code_example"; // String | The code of the currency group.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the currency group. Defaults to returning   the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // CurrencyGroupResponse result = apiInstance.getCurrencyGroup(code, asAt).execute(opts);

            CurrencyGroupResponse result = apiInstance.getCurrencyGroup(code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyGroupsApi#getCurrencyGroup");
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
| **code** | **String**| The code of the currency group. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the currency group. Defaults to returning   the latest version if not specified. | [optional] |

### Return type

[**CurrencyGroupResponse**](CurrencyGroupResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested currency group. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listCurrencyGroups

> PagedResourceListOfCurrencyGroupResponse listCurrencyGroups(asAt, page, limit, filter, sortBy)

[EXPERIMENTAL] ListCurrencyGroups: List currency groups.

List the currency groups defined in the tenant that the caller is entitled to read.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CurrencyGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CurrencyGroupsApiExample {

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
        // CurrencyGroupsApi apiInstance = apiFactory.build(CurrencyGroupsApi.class);

        CurrencyGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CurrencyGroupsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the currency groups. Defaults to returning   the latest version of each currency group if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing currency groups from a previous   call to list currency groups. This value is returned from the previous call. If a pagination token   is provided the filter, sortBy and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number.
        String filter = "filter_example"; // String | Expression to filter the results. Filterable fields are the group's code,   displayName and majorUnitCurrency. For example, \"majorUnitCurrency eq 'GBP'\".
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each prefixed with \"+\" for ascending or   \"-\" for descending. Sortable fields are the group's code, displayName and majorUnitCurrency.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfCurrencyGroupResponse result = apiInstance.listCurrencyGroups(asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfCurrencyGroupResponse result = apiInstance.listCurrencyGroups(asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyGroupsApi#listCurrencyGroups");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the currency groups. Defaults to returning   the latest version of each currency group if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing currency groups from a previous   call to list currency groups. This value is returned from the previous call. If a pagination token   is provided the filter, sortBy and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. | [optional] |
| **filter** | **String**| Expression to filter the results. Filterable fields are the group&#39;s code,   displayName and majorUnitCurrency. For example, \&quot;majorUnitCurrency eq &#39;GBP&#39;\&quot;. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each prefixed with \&quot;+\&quot; for ascending or   \&quot;-\&quot; for descending. Sortable fields are the group&#39;s code, displayName and majorUnitCurrency. | [optional] |

### Return type

[**PagedResourceListOfCurrencyGroupResponse**](PagedResourceListOfCurrencyGroupResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested currency groups. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertCurrencyGroup

> CurrencyGroupResponse upsertCurrencyGroup(upsertCurrencyGroupRequest)

[EXPERIMENTAL] UpsertCurrencyGroup: Upsert a currency group.

Create or update a currency group. If a currency group with the same code already exists it is replaced.  A currency may belong to at most one currency group.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CurrencyGroupsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CurrencyGroupsApiExample {

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
        // CurrencyGroupsApi apiInstance = apiFactory.build(CurrencyGroupsApi.class);

        CurrencyGroupsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CurrencyGroupsApi.class);
        UpsertCurrencyGroupRequest upsertCurrencyGroupRequest = new UpsertCurrencyGroupRequest(); // UpsertCurrencyGroupRequest | The currency group to upsert.
        try {
            // uncomment the below to set overrides at the request level
            // CurrencyGroupResponse result = apiInstance.upsertCurrencyGroup(upsertCurrencyGroupRequest).execute(opts);

            CurrencyGroupResponse result = apiInstance.upsertCurrencyGroup(upsertCurrencyGroupRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrencyGroupsApi#upsertCurrencyGroup");
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
| **upsertCurrencyGroupRequest** | [**UpsertCurrencyGroupRequest**](UpsertCurrencyGroupRequest.md)| The currency group to upsert. | |

### Return type

[**CurrencyGroupResponse**](CurrencyGroupResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The upserted currency group. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

