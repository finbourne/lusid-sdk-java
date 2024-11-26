# RiskModelFactorSetsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRiskModelFactorSet**](RiskModelFactorSetsApi.md#createRiskModelFactorSet) | **POST** /api/riskmodels/factorsets | [EXPERIMENTAL] CreateRiskModelFactorSet: Create a Factor Set |
| [**deleteRiskModelFactorSet**](RiskModelFactorSetsApi.md#deleteRiskModelFactorSet) | **DELETE** /api/riskmodels/factorsets/{scope}/{code} | [EXPERIMENTAL] DeleteRiskModelFactorSet: Deletes a particular Factor Set |
| [**getRiskModelFactorSet**](RiskModelFactorSetsApi.md#getRiskModelFactorSet) | **GET** /api/riskmodels/factorsets/{scope}/{code} | [EXPERIMENTAL] GetRiskModelFactorSet: Get a single Factor Set by scope and code. |
| [**listRiskModelFactorSets**](RiskModelFactorSetsApi.md#listRiskModelFactorSets) | **GET** /api/riskmodels/factorsets | [EXPERIMENTAL] ListRiskModelFactorSets: Get a set of Factor Sets |
| [**updateRiskModelFactorSetName**](RiskModelFactorSetsApi.md#updateRiskModelFactorSetName) | **PUT** /api/riskmodels/factorsets/{scope}/{code} | [EXPERIMENTAL] UpdateRiskModelFactorSetName: Update Factor Set Display Name |



## createRiskModelFactorSet

> RiskModelFactorSet createRiskModelFactorSet(createRiskModelFactorSetRequest)

[EXPERIMENTAL] CreateRiskModelFactorSet: Create a Factor Set

Creates a factor set definition with a scoped Id and Name

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RiskModelFactorSetsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RiskModelFactorSetsApiExample {

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
        // RiskModelFactorSetsApi apiInstance = apiFactory.build(RiskModelFactorSetsApi.class);

        RiskModelFactorSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RiskModelFactorSetsApi.class);
        CreateRiskModelFactorSetRequest createRiskModelFactorSetRequest = new CreateRiskModelFactorSetRequest(); // CreateRiskModelFactorSetRequest | The request containing the details of the factor set
        try {
            // uncomment the below to set overrides at the request level
            // RiskModelFactorSet result = apiInstance.createRiskModelFactorSet(createRiskModelFactorSetRequest).execute(opts);

            RiskModelFactorSet result = apiInstance.createRiskModelFactorSet(createRiskModelFactorSetRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RiskModelFactorSetsApi#createRiskModelFactorSet");
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
| **createRiskModelFactorSetRequest** | [**CreateRiskModelFactorSetRequest**](CreateRiskModelFactorSetRequest.md)| The request containing the details of the factor set | [optional] |

### Return type

[**RiskModelFactorSet**](RiskModelFactorSet.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created factor set. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteRiskModelFactorSet

> DeletedEntityResponse deleteRiskModelFactorSet(scope, code)

[EXPERIMENTAL] DeleteRiskModelFactorSet: Deletes a particular Factor Set

The deletion will take effect from the factor set deletion datetime.  i.e. will no longer exist at any asAt datetime after the asAt datetime of deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RiskModelFactorSetsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RiskModelFactorSetsApiExample {

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
        // RiskModelFactorSetsApi apiInstance = apiFactory.build(RiskModelFactorSetsApi.class);

        RiskModelFactorSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RiskModelFactorSetsApi.class);
        String scope = "scope_example"; // String | The scope of the specified factor set.
        String code = "code_example"; // String | The code of the specified factor set. Together with the domain and scope this uniquely   identifies the factor set.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteRiskModelFactorSet(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteRiskModelFactorSet(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RiskModelFactorSetsApi#deleteRiskModelFactorSet");
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
| **scope** | **String**| The scope of the specified factor set. | |
| **code** | **String**| The code of the specified factor set. Together with the domain and scope this uniquely   identifies the factor set. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The deleted entity metadata |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getRiskModelFactorSet

> RiskModelFactorSet getRiskModelFactorSet(scope, code, asAt)

[EXPERIMENTAL] GetRiskModelFactorSet: Get a single Factor Set by scope and code.

Retrieves one Factor Set by scope and code.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RiskModelFactorSetsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RiskModelFactorSetsApiExample {

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
        // RiskModelFactorSetsApi apiInstance = apiFactory.build(RiskModelFactorSetsApi.class);

        RiskModelFactorSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RiskModelFactorSetsApi.class);
        String scope = "scope_example"; // String | The scope of the specified factor set.
        String code = "code_example"; // String | The code of the specified factor set. Together with the domain and scope this uniquely   identifies the factor set.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the factor set definition. Defaults to return   the latest version of the definition if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // RiskModelFactorSet result = apiInstance.getRiskModelFactorSet(scope, code, asAt).execute(opts);

            RiskModelFactorSet result = apiInstance.getRiskModelFactorSet(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RiskModelFactorSetsApi#getRiskModelFactorSet");
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
| **scope** | **String**| The scope of the specified factor set. | |
| **code** | **String**| The code of the specified factor set. Together with the domain and scope this uniquely   identifies the factor set. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the factor set definition. Defaults to return   the latest version of the definition if not specified. | [optional] |

### Return type

[**RiskModelFactorSet**](RiskModelFactorSet.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested factor set. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listRiskModelFactorSets

> PagedResourceListOfRiskModelFactorSet listRiskModelFactorSets(asAt, page, sortBy, limit, filter)

[EXPERIMENTAL] ListRiskModelFactorSets: Get a set of Factor Sets

Retrieves all Factor Sets (without related Factors) that fit the filter, in a specific order if sortBy is provided.  Supports pagination

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RiskModelFactorSetsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RiskModelFactorSetsApiExample {

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
        // RiskModelFactorSetsApi apiInstance = apiFactory.build(RiskModelFactorSetsApi.class);

        RiskModelFactorSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RiskModelFactorSetsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the factor sets. Defaults to return the latest   version of the factor sets if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing factor sets from a previous call to list   factor sets. This value is returned from the previous call. If a pagination token is provided the sortBy,   filter, effectiveAt, and asAt fields must not have changed since the original request.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
        Integer limit = 56; // Integer | Page size.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfRiskModelFactorSet result = apiInstance.listRiskModelFactorSets(asAt, page, sortBy, limit, filter).execute(opts);

            PagedResourceListOfRiskModelFactorSet result = apiInstance.listRiskModelFactorSets(asAt, page, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RiskModelFactorSetsApi#listRiskModelFactorSets");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the factor sets. Defaults to return the latest   version of the factor sets if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing factor sets from a previous call to list   factor sets. This value is returned from the previous call. If a pagination token is provided the sortBy,   filter, effectiveAt, and asAt fields must not have changed since the original request. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |
| **limit** | **Integer**| Page size. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfRiskModelFactorSet**](PagedResourceListOfRiskModelFactorSet.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested list of factor sets. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateRiskModelFactorSetName

> RiskModelFactorSet updateRiskModelFactorSetName(scope, code, updateRiskModelFactorSetRequest)

[EXPERIMENTAL] UpdateRiskModelFactorSetName: Update Factor Set Display Name

Overwrites an existing Factor Set as per scope and code from the route  Update request has a single property - DisplayName

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.RiskModelFactorSetsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RiskModelFactorSetsApiExample {

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
        // RiskModelFactorSetsApi apiInstance = apiFactory.build(RiskModelFactorSetsApi.class);

        RiskModelFactorSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(RiskModelFactorSetsApi.class);
        String scope = "scope_example"; // String | The scope of the specified factor set.
        String code = "code_example"; // String | The code of the specified factor set. Together with the domain and scope this uniquely   identifies the factor set.
        UpdateRiskModelFactorSetRequest updateRiskModelFactorSetRequest = new UpdateRiskModelFactorSetRequest(); // UpdateRiskModelFactorSetRequest | The request containing the updated name of the factor set.
        try {
            // uncomment the below to set overrides at the request level
            // RiskModelFactorSet result = apiInstance.updateRiskModelFactorSetName(scope, code, updateRiskModelFactorSetRequest).execute(opts);

            RiskModelFactorSet result = apiInstance.updateRiskModelFactorSetName(scope, code, updateRiskModelFactorSetRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RiskModelFactorSetsApi#updateRiskModelFactorSetName");
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
| **scope** | **String**| The scope of the specified factor set. | |
| **code** | **String**| The code of the specified factor set. Together with the domain and scope this uniquely   identifies the factor set. | |
| **updateRiskModelFactorSetRequest** | [**UpdateRiskModelFactorSetRequest**](UpdateRiskModelFactorSetRequest.md)| The request containing the updated name of the factor set. | [optional] |

### Return type

[**RiskModelFactorSet**](RiskModelFactorSet.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated version of the requested factor set. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

