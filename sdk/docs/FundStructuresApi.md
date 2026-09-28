# FundStructuresApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFundStructureMember**](FundStructuresApi.md#addFundStructureMember) | **POST** /api/fundstructures/{scope}/{code}/members | [EXPERIMENTAL] AddFundStructureMember: Add a member to a Fund Structure. |
| [**createFundStructure**](FundStructuresApi.md#createFundStructure) | **POST** /api/fundstructures/{scope} | [EXPERIMENTAL] CreateFundStructure: Create a Fund Structure. |
| [**deleteFundStructure**](FundStructuresApi.md#deleteFundStructure) | **DELETE** /api/fundstructures/{scope}/{code} | [EXPERIMENTAL] DeleteFundStructure: Delete a Fund Structure. |
| [**getFundStructure**](FundStructuresApi.md#getFundStructure) | **GET** /api/fundstructures/{scope}/{code} | [EXPERIMENTAL] GetFundStructure: Get a Fund Structure. |
| [**listFundStructures**](FundStructuresApi.md#listFundStructures) | **GET** /api/fundstructures | [EXPERIMENTAL] ListFundStructures: List Fund Structures. |
| [**removeFundStructureMember**](FundStructuresApi.md#removeFundStructureMember) | **DELETE** /api/fundstructures/{scope}/{code}/members/{nodeCode} | [EXPERIMENTAL] RemoveFundStructureMember: Remove a member from a Fund Structure. |
| [**upsertFundStructure**](FundStructuresApi.md#upsertFundStructure) | **PUT** /api/fundstructures/{scope}/{code} | [EXPERIMENTAL] UpsertFundStructure: Upsert a Fund Structure. |



## addFundStructureMember

> FundStructure addFundStructureMember(scope, code, fundStructureMemberRequest, effectiveAt)

[EXPERIMENTAL] AddFundStructureMember: Add a member to a Fund Structure.

Add a node and the links that join it to existing members, from an effective datetime. The result is a new  bitemporal version of the structure. The change applies to the version in force at that datetime; if a  later version of the structure already exists the request is rejected, since the member would otherwise  drop out when that version begins. Upsert the full definition for each affected version in that case.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundStructuresApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundStructuresApiExample {

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
        // FundStructuresApi apiInstance = apiFactory.build(FundStructuresApi.class);

        FundStructuresApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundStructuresApi.class);
        String scope = "scope_example"; // String | The scope of the Fund Structure.
        String code = "code_example"; // String | The code of the Fund Structure. Together with the scope this uniquely identifies the Fund Structure.
        FundStructureMemberRequest fundStructureMemberRequest = new FundStructureMemberRequest(); // FundStructureMemberRequest | The node to add and the links joining it to existing members.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the member is part of the structure. Defaults to the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // FundStructure result = apiInstance.addFundStructureMember(scope, code, fundStructureMemberRequest, effectiveAt).execute(opts);

            FundStructure result = apiInstance.addFundStructureMember(scope, code, fundStructureMemberRequest, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundStructuresApi#addFundStructureMember");
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
| **scope** | **String**| The scope of the Fund Structure. | |
| **code** | **String**| The code of the Fund Structure. Together with the scope this uniquely identifies the Fund Structure. | |
| **fundStructureMemberRequest** | [**FundStructureMemberRequest**](FundStructureMemberRequest.md)| The node to add and the links joining it to existing members. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the member is part of the structure. Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**FundStructure**](FundStructure.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Fund Structure with the member added. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createFundStructure

> FundStructure createFundStructure(scope, fundStructureRequest)

[EXPERIMENTAL] CreateFundStructure: Create a Fund Structure.

Create a new Fund Structure Model. The scope and code of the Fund Structure are provided in the request body.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundStructuresApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundStructuresApiExample {

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
        // FundStructuresApi apiInstance = apiFactory.build(FundStructuresApi.class);

        FundStructuresApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundStructuresApi.class);
        String scope = "scope_example"; // String | The scope of the Fund Structure.
        FundStructureRequest fundStructureRequest = new FundStructureRequest(); // FundStructureRequest | The definition of the Fund Structure.
        try {
            // uncomment the below to set overrides at the request level
            // FundStructure result = apiInstance.createFundStructure(scope, fundStructureRequest).execute(opts);

            FundStructure result = apiInstance.createFundStructure(scope, fundStructureRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundStructuresApi#createFundStructure");
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
| **scope** | **String**| The scope of the Fund Structure. | |
| **fundStructureRequest** | [**FundStructureRequest**](FundStructureRequest.md)| The definition of the Fund Structure. | |

### Return type

[**FundStructure**](FundStructure.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Fund Structure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteFundStructure

> DeletedEntityResponse deleteFundStructure(scope, code, effectiveAt)

[EXPERIMENTAL] DeleteFundStructure: Delete a Fund Structure.

Delete a Fund Structure from the given effective datetime. It remains retrievable at earlier effective datetimes.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundStructuresApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundStructuresApiExample {

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
        // FundStructuresApi apiInstance = apiFactory.build(FundStructuresApi.class);

        FundStructuresApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundStructuresApi.class);
        String scope = "scope_example"; // String | The scope of the Fund Structure to be deleted.
        String code = "code_example"; // String | The code of the Fund Structure to be deleted. Together with the scope this uniquely identifies the Fund Structure.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the Fund Structure is deleted. Defaults to the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteFundStructure(scope, code, effectiveAt).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteFundStructure(scope, code, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundStructuresApi#deleteFundStructure");
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
| **scope** | **String**| The scope of the Fund Structure to be deleted. | |
| **code** | **String**| The code of the Fund Structure to be deleted. Together with the scope this uniquely identifies the Fund Structure. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the Fund Structure is deleted. Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the Fund Structure was deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getFundStructure

> FundStructure getFundStructure(scope, code, effectiveAt, asAt, propertyKeys)

[EXPERIMENTAL] GetFundStructure: Get a Fund Structure.

Retrieve the definition of a particular Fund Structure at an effective and asAt datetime, including its nodes,  edges, allocation groups and the funds its nodes refer to.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundStructuresApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundStructuresApiExample {

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
        // FundStructuresApi apiInstance = apiFactory.build(FundStructuresApi.class);

        FundStructuresApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundStructuresApi.class);
        String scope = "scope_example"; // String | The scope of the Fund Structure.
        String code = "code_example"; // String | The code of the Fund Structure. Together with the scope this uniquely identifies the Fund Structure.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Fund Structure. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Fund Structure. Defaults to returning the latest version if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'FundStructure' domain to decorate onto the Fund Structure.   These must take the format {domain}/{scope}/{code}, for example 'FundStructure/Manager/Id'. If no properties are specified, then no properties will be returned.
        try {
            // uncomment the below to set overrides at the request level
            // FundStructure result = apiInstance.getFundStructure(scope, code, effectiveAt, asAt, propertyKeys).execute(opts);

            FundStructure result = apiInstance.getFundStructure(scope, code, effectiveAt, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundStructuresApi#getFundStructure");
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
| **scope** | **String**| The scope of the Fund Structure. | |
| **code** | **String**| The code of the Fund Structure. Together with the scope this uniquely identifies the Fund Structure. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Fund Structure. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Fund Structure. Defaults to returning the latest version if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;FundStructure&#39; domain to decorate onto the Fund Structure.   These must take the format {domain}/{scope}/{code}, for example &#39;FundStructure/Manager/Id&#39;. If no properties are specified, then no properties will be returned. | [optional] |

### Return type

[**FundStructure**](FundStructure.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Fund Structure. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listFundStructures

> PagedResourceListOfFundStructure listFundStructures(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListFundStructures: List Fund Structures.

List all the Fund Structures matching the given criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundStructuresApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundStructuresApiExample {

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
        // FundStructuresApi apiInstance = apiFactory.build(FundStructuresApi.class);

        FundStructuresApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundStructuresApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the Fund Structures. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list Fund Structures. Defaults to returning the latest version of each Fund Structure if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Fund Structures; this value is returned from the previous call. If a pagination token is provided, the filter and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. For example, to filter on the Fund Structure code, specify \"id.Code eq 'Structure1'\". For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'FundStructure' domain to decorate onto each Fund Structure.   These must take the format {domain}/{scope}/{code}, for example 'FundStructure/Manager/Id'.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfFundStructure result = apiInstance.listFundStructures(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            PagedResourceListOfFundStructure result = apiInstance.listFundStructures(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundStructuresApi#listFundStructures");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the Fund Structures. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list Fund Structures. Defaults to returning the latest version of each Fund Structure if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Fund Structures; this value is returned from the previous call. If a pagination token is provided, the filter and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. For example, to filter on the Fund Structure code, specify \&quot;id.Code eq &#39;Structure1&#39;\&quot;. For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;FundStructure&#39; domain to decorate onto each Fund Structure.   These must take the format {domain}/{scope}/{code}, for example &#39;FundStructure/Manager/Id&#39;. | [optional] |

### Return type

[**PagedResourceListOfFundStructure**](PagedResourceListOfFundStructure.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Fund Structures. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## removeFundStructureMember

> FundStructure removeFundStructureMember(scope, code, nodeCode, effectiveAt)

[EXPERIMENTAL] RemoveFundStructureMember: Remove a member from a Fund Structure.

Remove a node and every link that touches it, from an effective datetime. The result is a new bitemporal  version of the structure. The change applies to the version in force at that datetime; if a later version  of the structure already exists the request is rejected, since the member would otherwise reappear when  that version begins. Upsert the full definition for each affected version in that case.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundStructuresApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundStructuresApiExample {

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
        // FundStructuresApi apiInstance = apiFactory.build(FundStructuresApi.class);

        FundStructuresApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundStructuresApi.class);
        String scope = "scope_example"; // String | The scope of the Fund Structure.
        String code = "code_example"; // String | The code of the Fund Structure. Together with the scope this uniquely identifies the Fund Structure.
        String nodeCode = "nodeCode_example"; // String | The node code of the member to remove.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the member is no longer part of the structure. Defaults to the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // FundStructure result = apiInstance.removeFundStructureMember(scope, code, nodeCode, effectiveAt).execute(opts);

            FundStructure result = apiInstance.removeFundStructureMember(scope, code, nodeCode, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundStructuresApi#removeFundStructureMember");
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
| **scope** | **String**| The scope of the Fund Structure. | |
| **code** | **String**| The code of the Fund Structure. Together with the scope this uniquely identifies the Fund Structure. | |
| **nodeCode** | **String**| The node code of the member to remove. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the member is no longer part of the structure. Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**FundStructure**](FundStructure.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Fund Structure with the member removed. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertFundStructure

> FundStructure upsertFundStructure(scope, code, fundStructureRequest)

[EXPERIMENTAL] UpsertFundStructure: Upsert a Fund Structure.

Create or replace the full definition of a Fund Structure from an effective datetime. A change to the  definition becomes a new bitemporal version: the structure as it was declared at earlier effective datetimes,  and as of earlier asAt datetimes, remains retrievable.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundStructuresApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundStructuresApiExample {

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
        // FundStructuresApi apiInstance = apiFactory.build(FundStructuresApi.class);

        FundStructuresApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundStructuresApi.class);
        String scope = "scope_example"; // String | The scope of the Fund Structure.
        String code = "code_example"; // String | The code of the Fund Structure. Together with the scope this uniquely identifies the Fund Structure, and must match the code in the request body.
        FundStructureRequest fundStructureRequest = new FundStructureRequest(); // FundStructureRequest | The full definition of the Fund Structure from the effective datetime in the request, or the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // FundStructure result = apiInstance.upsertFundStructure(scope, code, fundStructureRequest).execute(opts);

            FundStructure result = apiInstance.upsertFundStructure(scope, code, fundStructureRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundStructuresApi#upsertFundStructure");
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
| **scope** | **String**| The scope of the Fund Structure. | |
| **code** | **String**| The code of the Fund Structure. Together with the scope this uniquely identifies the Fund Structure, and must match the code in the request body. | |
| **fundStructureRequest** | [**FundStructureRequest**](FundStructureRequest.md)| The full definition of the Fund Structure from the effective datetime in the request, or the current LUSID system datetime if not specified. | |

### Return type

[**FundStructure**](FundStructure.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Fund Structure as it stands from the effective datetime. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

