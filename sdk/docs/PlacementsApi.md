# PlacementsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePlacement**](PlacementsApi.md#deletePlacement) | **DELETE** /api/placements/{scope}/{code} | [EARLY ACCESS] DeletePlacement: Delete placement |
| [**getPlacement**](PlacementsApi.md#getPlacement) | **GET** /api/placements/{scope}/{code} | [EARLY ACCESS] GetPlacement: Get Placement |
| [**listPlacements**](PlacementsApi.md#listPlacements) | **GET** /api/placements | [EARLY ACCESS] ListPlacements: List Placements |
| [**upsertPlacements**](PlacementsApi.md#upsertPlacements) | **POST** /api/placements | [EARLY ACCESS] UpsertPlacements: Upsert Placement |



## deletePlacement

> DeletedEntityResponse deletePlacement(scope, code)

[EARLY ACCESS] DeletePlacement: Delete placement

Delete an placement. Deletion will be valid from the placement&#39;s creation datetime. This means that the placement will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PlacementsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PlacementsApiExample {

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
        // PlacementsApi apiInstance = apiFactory.build(PlacementsApi.class);

        PlacementsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PlacementsApi.class);
        String scope = "scope_example"; // String | The placement scope.
        String code = "code_example"; // String | The placement's code. This, together with the scope uniquely identifies the placement to delete.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deletePlacement(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deletePlacement(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlacementsApi#deletePlacement");
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
| **scope** | **String**| The placement scope. | |
| **code** | **String**| The placement&#39;s code. This, together with the scope uniquely identifies the placement to delete. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response from deleting an placement. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPlacement

> Placement getPlacement(scope, code, asAt, propertyKeys)

[EARLY ACCESS] GetPlacement: Get Placement

Fetch a Placement that matches the specified identifier

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PlacementsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PlacementsApiExample {

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
        // PlacementsApi apiInstance = apiFactory.build(PlacementsApi.class);

        PlacementsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PlacementsApi.class);
        String scope = "scope_example"; // String | The scope to which the placement belongs.
        String code = "code_example"; // String | The placement's unique identifier.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the placement. Defaults to return the latest version of the placement if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Placement\" domain to decorate onto the placement. If none are given, all applied properties are returned.  These take the format {domain}/{scope}/{code} e.g. \"Placement/system/Name\". Property keys from the instrument domain can also be decorated  onto the placement, e.g. \"Instrument/default/Isin\". These are only decorated if requested.
        try {
            // uncomment the below to set overrides at the request level
            // Placement result = apiInstance.getPlacement(scope, code, asAt, propertyKeys).execute(opts);

            Placement result = apiInstance.getPlacement(scope, code, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlacementsApi#getPlacement");
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
| **scope** | **String**| The scope to which the placement belongs. | |
| **code** | **String**| The placement&#39;s unique identifier. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the placement. Defaults to return the latest version of the placement if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Placement\&quot; domain to decorate onto the placement. If none are given, all applied properties are returned.  These take the format {domain}/{scope}/{code} e.g. \&quot;Placement/system/Name\&quot;. Property keys from the instrument domain can also be decorated  onto the placement, e.g. \&quot;Instrument/default/Isin\&quot;. These are only decorated if requested. | [optional] |

### Return type

[**Placement**](Placement.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The placement matching the given identifier. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listPlacements

> PagedResourceListOfPlacement listPlacements(asAt, page, sortBy, limit, filter, propertyKeys)

[EARLY ACCESS] ListPlacements: List Placements

Fetch the last pre-AsAt date version of each placement in scope (does not fetch the entire history).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PlacementsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PlacementsApiExample {

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
        // PlacementsApi apiInstance = apiFactory.build(PlacementsApi.class);

        PlacementsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PlacementsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the placement. Defaults to return the latest version of the placement if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing placements from a previous call to list placements.  This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields  must not have changed since the original request.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:  https://support.lusid.com/filtering-results-from-lusid.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"Placement\" domain to decorate onto each placement.  These take the format {domain}/{scope}/{code} e.g. \"Placement/system/Name\".  All properties, except derived properties, are returned by default, without specifying here.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfPlacement result = apiInstance.listPlacements(asAt, page, sortBy, limit, filter, propertyKeys).execute(opts);

            PagedResourceListOfPlacement result = apiInstance.listPlacements(asAt, page, sortBy, limit, filter, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlacementsApi#listPlacements");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the placement. Defaults to return the latest version of the placement if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing placements from a previous call to list placements.  This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields  must not have changed since the original request. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:  https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;Placement\&quot; domain to decorate onto each placement.  These take the format {domain}/{scope}/{code} e.g. \&quot;Placement/system/Name\&quot;.  All properties, except derived properties, are returned by default, without specifying here. | [optional] |

### Return type

[**PagedResourceListOfPlacement**](PagedResourceListOfPlacement.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Placements in scope. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertPlacements

> ResourceListOfPlacement upsertPlacements(placementSetRequest)

[EARLY ACCESS] UpsertPlacements: Upsert Placement

Upsert; update existing placements with given ids, or create new placements otherwise.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PlacementsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PlacementsApiExample {

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
        // PlacementsApi apiInstance = apiFactory.build(PlacementsApi.class);

        PlacementsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PlacementsApi.class);
        PlacementSetRequest placementSetRequest = new PlacementSetRequest(); // PlacementSetRequest | The collection of placement requests.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfPlacement result = apiInstance.upsertPlacements(placementSetRequest).execute(opts);

            ResourceListOfPlacement result = apiInstance.upsertPlacements(placementSetRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PlacementsApi#upsertPlacements");
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
| **placementSetRequest** | [**PlacementSetRequest**](PlacementSetRequest.md)| The collection of placement requests. | [optional] |

### Return type

[**ResourceListOfPlacement**](ResourceListOfPlacement.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A collection of placements. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

