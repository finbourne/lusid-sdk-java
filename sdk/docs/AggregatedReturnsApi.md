# AggregatedReturnsApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteReturnsEntity**](AggregatedReturnsApi.md#deleteReturnsEntity) | **DELETE** /api/returns/{scope}/{code} | [EXPERIMENTAL] DeleteReturnsEntity: Delete returns entity. |
| [**getReturnsEntity**](AggregatedReturnsApi.md#getReturnsEntity) | **GET** /api/returns/{scope}/{code} | [EXPERIMENTAL] GetReturnsEntity: Get returns entity. |
| [**listReturnsEntities**](AggregatedReturnsApi.md#listReturnsEntities) | **GET** /api/returns | [EXPERIMENTAL] ListReturnsEntities: List returns entities. |
| [**upsertReturnsEntity**](AggregatedReturnsApi.md#upsertReturnsEntity) | **POST** /api/returns | [EXPERIMENTAL] UpsertReturnsEntity: Upsert returns entity. |



## deleteReturnsEntity

> DeletedEntityResponse deleteReturnsEntity(scope, code)

[EXPERIMENTAL] DeleteReturnsEntity: Delete returns entity.

Delete returns entity.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AggregatedReturnsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AggregatedReturnsApiExample {

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
        // AggregatedReturnsApi apiInstance = apiFactory.build(AggregatedReturnsApi.class);

        AggregatedReturnsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AggregatedReturnsApi.class);
        String scope = "scope_example"; // String | Returns entity scope.
        String code = "code_example"; // String | Returns entity code.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteReturnsEntity(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteReturnsEntity(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AggregatedReturnsApi#deleteReturnsEntity");
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
| **scope** | **String**| Returns entity scope. | |
| **code** | **String**| Returns entity code. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The time that the returns entity was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getReturnsEntity

> ReturnsEntity getReturnsEntity(scope, code, asAt)

[EXPERIMENTAL] GetReturnsEntity: Get returns entity.

Get returns entity.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AggregatedReturnsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AggregatedReturnsApiExample {

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
        // AggregatedReturnsApi apiInstance = apiFactory.build(AggregatedReturnsApi.class);

        AggregatedReturnsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AggregatedReturnsApi.class);
        String scope = "scope_example"; // String | Returns entity scope.
        String code = "code_example"; // String | Returns entity code.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the returns entity. Defaults to return   the latest version of the definition if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // ReturnsEntity result = apiInstance.getReturnsEntity(scope, code, asAt).execute(opts);

            ReturnsEntity result = apiInstance.getReturnsEntity(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AggregatedReturnsApi#getReturnsEntity");
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
| **scope** | **String**| Returns entity scope. | |
| **code** | **String**| Returns entity code. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the returns entity. Defaults to return   the latest version of the definition if not specified. | [optional] |

### Return type

[**ReturnsEntity**](ReturnsEntity.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested returns entity |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listReturnsEntities

> ResourceListOfReturnsEntity listReturnsEntities(asAt)

[EXPERIMENTAL] ListReturnsEntities: List returns entities.

List returns entities.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AggregatedReturnsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AggregatedReturnsApiExample {

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
        // AggregatedReturnsApi apiInstance = apiFactory.build(AggregatedReturnsApi.class);

        AggregatedReturnsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AggregatedReturnsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the relation definitions. Defaults to return   the latest version of each definition if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfReturnsEntity result = apiInstance.listReturnsEntities(asAt).execute(opts);

            ResourceListOfReturnsEntity result = apiInstance.listReturnsEntities(asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AggregatedReturnsApi#listReturnsEntities");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the relation definitions. Defaults to return   the latest version of each definition if not specified. | [optional] |

### Return type

[**ResourceListOfReturnsEntity**](ResourceListOfReturnsEntity.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested returns entities |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertReturnsEntity

> ReturnsEntity upsertReturnsEntity(returnsEntity)

[EXPERIMENTAL] UpsertReturnsEntity: Upsert returns entity.

Upsert returns entity.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AggregatedReturnsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AggregatedReturnsApiExample {

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
        // AggregatedReturnsApi apiInstance = apiFactory.build(AggregatedReturnsApi.class);

        AggregatedReturnsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AggregatedReturnsApi.class);
        ReturnsEntity returnsEntity = new ReturnsEntity(); // ReturnsEntity | Definition of the returns entity.
        try {
            // uncomment the below to set overrides at the request level
            // ReturnsEntity result = apiInstance.upsertReturnsEntity(returnsEntity).execute(opts);

            ReturnsEntity result = apiInstance.upsertReturnsEntity(returnsEntity).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AggregatedReturnsApi#upsertReturnsEntity");
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
| **returnsEntity** | [**ReturnsEntity**](ReturnsEntity.md)| Definition of the returns entity. | |

### Return type

[**ReturnsEntity**](ReturnsEntity.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The upserted returns entity |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

