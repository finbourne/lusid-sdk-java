# ReferenceListsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteReferenceList**](ReferenceListsApi.md#deleteReferenceList) | **DELETE** /api/referencelists/{scope}/{code} | [EARLY ACCESS] DeleteReferenceList: Delete Reference List |
| [**getReferenceList**](ReferenceListsApi.md#getReferenceList) | **GET** /api/referencelists/{scope}/{code} | GetReferenceList: Get Reference List |
| [**listReferenceLists**](ReferenceListsApi.md#listReferenceLists) | **GET** /api/referencelists | [EARLY ACCESS] ListReferenceLists: List Reference Lists |
| [**upsertReferenceList**](ReferenceListsApi.md#upsertReferenceList) | **POST** /api/referencelists | [EARLY ACCESS] UpsertReferenceList: Upsert Reference List |



## deleteReferenceList

> DeletedEntityResponse deleteReferenceList(scope, code)

[EARLY ACCESS] DeleteReferenceList: Delete Reference List

Delete a Reference List instance.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ReferenceListsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ReferenceListsApiExample {

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
        // ReferenceListsApi apiInstance = apiFactory.build(ReferenceListsApi.class);

        ReferenceListsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ReferenceListsApi.class);
        String scope = "scope_example"; // String | The scope to which the Reference List belongs.
        String code = "code_example"; // String | The Reference List's unique identifier.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteReferenceList(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteReferenceList(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceListsApi#deleteReferenceList");
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
| **scope** | **String**| The scope to which the Reference List belongs. | |
| **code** | **String**| The Reference List&#39;s unique identifier. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The deleted reference list response. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getReferenceList

> ReferenceListResponse getReferenceList(scope, code, asAt)

GetReferenceList: Get Reference List

Retrieve a Reference List instance at a point in AsAt time.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ReferenceListsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ReferenceListsApiExample {

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
        // ReferenceListsApi apiInstance = apiFactory.build(ReferenceListsApi.class);

        ReferenceListsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ReferenceListsApi.class);
        String scope = "scope_example"; // String | The scope to which the Reference List belongs.
        String code = "code_example"; // String | The Reference List's unique identifier.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Reference List. Defaults to return the latest version of the Reference List if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // ReferenceListResponse result = apiInstance.getReferenceList(scope, code, asAt).execute(opts);

            ReferenceListResponse result = apiInstance.getReferenceList(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceListsApi#getReferenceList");
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
| **scope** | **String**| The scope to which the Reference List belongs. | |
| **code** | **String**| The Reference List&#39;s unique identifier. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Reference List. Defaults to return the latest version of the Reference List if not specified. | [optional] |

### Return type

[**ReferenceListResponse**](ReferenceListResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Reference List matching the requested identifier. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listReferenceLists

> PagedResourceListOfReferenceListResponse listReferenceLists(asAt, page, limit, filter)

[EARLY ACCESS] ListReferenceLists: List Reference Lists

List all the Reference Lists matching particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ReferenceListsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ReferenceListsApiExample {

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
        // ReferenceListsApi apiInstance = apiFactory.build(ReferenceListsApi.class);

        ReferenceListsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ReferenceListsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list Reference Lists. Defaults to return the latest version of Reference Lists if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Reference Lists from a previous call to list Reference Lists.  This value is returned from the previous call. If a pagination token is provided, the filter, limit and asAt fields  must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:  https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfReferenceListResponse result = apiInstance.listReferenceLists(asAt, page, limit, filter).execute(opts);

            PagedResourceListOfReferenceListResponse result = apiInstance.listReferenceLists(asAt, page, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceListsApi#listReferenceLists");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list Reference Lists. Defaults to return the latest version of Reference Lists if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Reference Lists from a previous call to list Reference Lists.  This value is returned from the previous call. If a pagination token is provided, the filter, limit and asAt fields  must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:  https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfReferenceListResponse**](PagedResourceListOfReferenceListResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A collection of Reference Lists. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertReferenceList

> ReferenceListResponse upsertReferenceList(referenceListRequest)

[EARLY ACCESS] UpsertReferenceList: Upsert Reference List

Insert the Reference List if it does not exist or update the Reference List with the supplied state if it does exist.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ReferenceListsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ReferenceListsApiExample {

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
        // ReferenceListsApi apiInstance = apiFactory.build(ReferenceListsApi.class);

        ReferenceListsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ReferenceListsApi.class);
        ReferenceListRequest referenceListRequest = new ReferenceListRequest(); // ReferenceListRequest | The payload describing the Reference List instance.
        try {
            // uncomment the below to set overrides at the request level
            // ReferenceListResponse result = apiInstance.upsertReferenceList(referenceListRequest).execute(opts);

            ReferenceListResponse result = apiInstance.upsertReferenceList(referenceListRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceListsApi#upsertReferenceList");
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
| **referenceListRequest** | [**ReferenceListRequest**](ReferenceListRequest.md)| The payload describing the Reference List instance. | [optional] |

### Return type

[**ReferenceListResponse**](ReferenceListResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The upserted Reference List instance. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

