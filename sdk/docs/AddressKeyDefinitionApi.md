# AddressKeyDefinitionApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAddressKeyDefinition**](AddressKeyDefinitionApi.md#createAddressKeyDefinition) | **POST** /api/addresskeydefinitions | [EARLY ACCESS] CreateAddressKeyDefinition: Create an AddressKeyDefinition. |
| [**getAddressKeyDefinition**](AddressKeyDefinitionApi.md#getAddressKeyDefinition) | **GET** /api/addresskeydefinitions/{key} | [EARLY ACCESS] GetAddressKeyDefinition: Get an AddressKeyDefinition. |
| [**listAddressKeyDefinitions**](AddressKeyDefinitionApi.md#listAddressKeyDefinitions) | **GET** /api/addresskeydefinitions | [EARLY ACCESS] ListAddressKeyDefinitions: List AddressKeyDefinitions. |



## createAddressKeyDefinition

> AddressKeyDefinition createAddressKeyDefinition(createAddressKeyDefinitionRequest)

[EARLY ACCESS] CreateAddressKeyDefinition: Create an AddressKeyDefinition.

Create the given address key definition.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AddressKeyDefinitionApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AddressKeyDefinitionApiExample {

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
        // AddressKeyDefinitionApi apiInstance = apiFactory.build(AddressKeyDefinitionApi.class);

        AddressKeyDefinitionApi apiInstance = ApiFactoryBuilder.build(fileName).build(AddressKeyDefinitionApi.class);
        CreateAddressKeyDefinitionRequest createAddressKeyDefinitionRequest = new CreateAddressKeyDefinitionRequest(); // CreateAddressKeyDefinitionRequest | The request used to create the address key definition.
        try {
            // uncomment the below to set overrides at the request level
            // AddressKeyDefinition result = apiInstance.createAddressKeyDefinition(createAddressKeyDefinitionRequest).execute(opts);

            AddressKeyDefinition result = apiInstance.createAddressKeyDefinition(createAddressKeyDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressKeyDefinitionApi#createAddressKeyDefinition");
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
| **createAddressKeyDefinitionRequest** | [**CreateAddressKeyDefinitionRequest**](CreateAddressKeyDefinitionRequest.md)| The request used to create the address key definition. | |

### Return type

[**AddressKeyDefinition**](AddressKeyDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created address key definition. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getAddressKeyDefinition

> AddressKeyDefinition getAddressKeyDefinition(key, asAt)

[EARLY ACCESS] GetAddressKeyDefinition: Get an AddressKeyDefinition.

Get the address key definition with the given address key at the specific asAt time.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AddressKeyDefinitionApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AddressKeyDefinitionApiExample {

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
        // AddressKeyDefinitionApi apiInstance = apiFactory.build(AddressKeyDefinitionApi.class);

        AddressKeyDefinitionApi apiInstance = ApiFactoryBuilder.build(fileName).build(AddressKeyDefinitionApi.class);
        String key = "key_example"; // String | The address key of the address key definition.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the address key definition. Defaults to return the latest version of the address key definition if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // AddressKeyDefinition result = apiInstance.getAddressKeyDefinition(key, asAt).execute(opts);

            AddressKeyDefinition result = apiInstance.getAddressKeyDefinition(key, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressKeyDefinitionApi#getAddressKeyDefinition");
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
| **key** | **String**| The address key of the address key definition. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the address key definition. Defaults to return the latest version of the address key definition if not specified. | [optional] |

### Return type

[**AddressKeyDefinition**](AddressKeyDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The address key definition with the given address key. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listAddressKeyDefinitions

> PagedResourceListOfAddressKeyDefinition listAddressKeyDefinitions(asAt, page, limit, filter)

[EARLY ACCESS] ListAddressKeyDefinitions: List AddressKeyDefinitions.

Fetch the last pre-AsAt date version of each address key definition.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AddressKeyDefinitionApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AddressKeyDefinitionApiExample {

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
        // AddressKeyDefinitionApi apiInstance = apiFactory.build(AddressKeyDefinitionApi.class);

        AddressKeyDefinitionApi apiInstance = ApiFactoryBuilder.build(fileName).build(AddressKeyDefinitionApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the address key definition.   Defaults to return the latest version of the address key definition if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing address key definitions from a previous call to list address key definitions.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfAddressKeyDefinition result = apiInstance.listAddressKeyDefinitions(asAt, page, limit, filter).execute(opts);

            PagedResourceListOfAddressKeyDefinition result = apiInstance.listAddressKeyDefinitions(asAt, page, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressKeyDefinitionApi#listAddressKeyDefinitions");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the address key definition.   Defaults to return the latest version of the address key definition if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing address key definitions from a previous call to list address key definitions.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, effectiveAt, and asAt fields   must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |

### Return type

[**PagedResourceListOfAddressKeyDefinition**](PagedResourceListOfAddressKeyDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A collection of address key definitions. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

