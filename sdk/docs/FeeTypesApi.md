# FeeTypesApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFeeType**](FeeTypesApi.md#createFeeType) | **POST** /api/feetypes/{scope} | [EXPERIMENTAL] CreateFeeType: Create a FeeType. |
| [**deleteFeeType**](FeeTypesApi.md#deleteFeeType) | **DELETE** /api/feetypes/{scope}/{code} | [EXPERIMENTAL] DeleteFeeType: Delete a FeeType. |
| [**getFeeTemplateSpecifications**](FeeTypesApi.md#getFeeTemplateSpecifications) | **GET** /api/feetypes/feetransactiontemplatespecification | [EXPERIMENTAL] GetFeeTemplateSpecifications: Get FeeTemplateSpecifications used in the FeeType. |
| [**getFeeType**](FeeTypesApi.md#getFeeType) | **GET** /api/feetypes/{scope}/{code} | [EXPERIMENTAL] GetFeeType: Get a FeeType |
| [**listFeeTypes**](FeeTypesApi.md#listFeeTypes) | **GET** /api/feetypes | [EXPERIMENTAL] ListFeeTypes: List FeeTypes |
| [**updateFeeType**](FeeTypesApi.md#updateFeeType) | **PUT** /api/feetypes/{scope}/{code} | [EXPERIMENTAL] UpdateFeeType: Update a FeeType. |



## createFeeType

> FeeType createFeeType(scope, feeTypeRequest)

[EXPERIMENTAL] CreateFeeType: Create a FeeType.

Create a FeeType that contains templates used to create fee transactions.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FeeTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FeeTypesApiExample {

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
        // FeeTypesApi apiInstance = apiFactory.build(FeeTypesApi.class);

        FeeTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FeeTypesApi.class);
        String scope = "scope_example"; // String | The scope of the FeeType.
        FeeTypeRequest feeTypeRequest = new FeeTypeRequest(); // FeeTypeRequest | The contents of the FeeType.
        try {
            // uncomment the below to set overrides at the request level
            // FeeType result = apiInstance.createFeeType(scope, feeTypeRequest).execute(opts);

            FeeType result = apiInstance.createFeeType(scope, feeTypeRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FeeTypesApi#createFeeType");
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
| **scope** | **String**| The scope of the FeeType. | |
| **feeTypeRequest** | [**FeeTypeRequest**](FeeTypeRequest.md)| The contents of the FeeType. | |

### Return type

[**FeeType**](FeeType.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create a FeeType. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteFeeType

> DeletedEntityResponse deleteFeeType(scope, code)

[EXPERIMENTAL] DeleteFeeType: Delete a FeeType.

Delete a FeeType that contains templates used to create fee transactions.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FeeTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FeeTypesApiExample {

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
        // FeeTypesApi apiInstance = apiFactory.build(FeeTypesApi.class);

        FeeTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FeeTypesApi.class);
        String scope = "scope_example"; // String | The scope of the FeeType.
        String code = "code_example"; // String | The code of the fee type
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteFeeType(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteFeeType(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FeeTypesApi#deleteFeeType");
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
| **scope** | **String**| The scope of the FeeType. | |
| **code** | **String**| The code of the fee type | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a FeeType. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getFeeTemplateSpecifications

> FeeTransactionTemplateSpecification getFeeTemplateSpecifications()

[EXPERIMENTAL] GetFeeTemplateSpecifications: Get FeeTemplateSpecifications used in the FeeType.

Get FeeTemplateSpecifications used in the FeeType.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FeeTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FeeTypesApiExample {

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
        // FeeTypesApi apiInstance = apiFactory.build(FeeTypesApi.class);

        FeeTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FeeTypesApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // FeeTransactionTemplateSpecification result = apiInstance.getFeeTemplateSpecifications().execute(opts);

            FeeTransactionTemplateSpecification result = apiInstance.getFeeTemplateSpecifications().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FeeTypesApi#getFeeTemplateSpecifications");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**FeeTransactionTemplateSpecification**](FeeTransactionTemplateSpecification.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fee template specifications used with a FeeType. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getFeeType

> FeeType getFeeType(scope, code, asAt)

[EXPERIMENTAL] GetFeeType: Get a FeeType

Get a FeeType that contains templates used to create fee transactions.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FeeTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FeeTypesApiExample {

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
        // FeeTypesApi apiInstance = apiFactory.build(FeeTypesApi.class);

        FeeTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FeeTypesApi.class);
        String scope = "scope_example"; // String | The scope of the FeeType
        String code = "code_example"; // String | The code of the FeeType
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the FeeType. Defaults to returning the latest version of the FeeType, if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // FeeType result = apiInstance.getFeeType(scope, code, asAt).execute(opts);

            FeeType result = apiInstance.getFeeType(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FeeTypesApi#getFeeType");
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
| **scope** | **String**| The scope of the FeeType | |
| **code** | **String**| The code of the FeeType | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the FeeType. Defaults to returning the latest version of the FeeType, if not specified. | [optional] |

### Return type

[**FeeType**](FeeType.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested FeeType. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listFeeTypes

> PagedResourceListOfFeeType listFeeTypes(asAt, page, limit, filter, sortBy)

[EXPERIMENTAL] ListFeeTypes: List FeeTypes

List FeeTypes that contain templates used to create fee transactions.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FeeTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FeeTypesApiExample {

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
        // FeeTypesApi apiInstance = apiFactory.build(FeeTypesApi.class);

        FeeTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FeeTypesApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the FeeTypes. Defaults to returning the latest version of each FeeType if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing FeeTypes; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the Code of the FeeType type, specify \"id.Code eq 'FeeType1'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\"
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfFeeType result = apiInstance.listFeeTypes(asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfFeeType result = apiInstance.listFeeTypes(asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FeeTypesApi#listFeeTypes");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the FeeTypes. Defaults to returning the latest version of each FeeType if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing FeeTypes; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the Code of the FeeType type, specify \&quot;id.Code eq &#39;FeeType1&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfFeeType**](PagedResourceListOfFeeType.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Fee Types |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateFeeType

> FeeType updateFeeType(scope, code, updateFeeTypeRequest)

[EXPERIMENTAL] UpdateFeeType: Update a FeeType.

Update a FeeType that contains templates used to create fee transactions.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FeeTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FeeTypesApiExample {

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
        // FeeTypesApi apiInstance = apiFactory.build(FeeTypesApi.class);

        FeeTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FeeTypesApi.class);
        String scope = "scope_example"; // String | The scope of the FeeType.
        String code = "code_example"; // String | The code of the fee type
        UpdateFeeTypeRequest updateFeeTypeRequest = new UpdateFeeTypeRequest(); // UpdateFeeTypeRequest | The contents of the FeeType.
        try {
            // uncomment the below to set overrides at the request level
            // FeeType result = apiInstance.updateFeeType(scope, code, updateFeeTypeRequest).execute(opts);

            FeeType result = apiInstance.updateFeeType(scope, code, updateFeeTypeRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FeeTypesApi#updateFeeType");
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
| **scope** | **String**| The scope of the FeeType. | |
| **code** | **String**| The code of the fee type | |
| **updateFeeTypeRequest** | [**UpdateFeeTypeRequest**](UpdateFeeTypeRequest.md)| The contents of the FeeType. | |

### Return type

[**FeeType**](FeeType.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a FeeType. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

