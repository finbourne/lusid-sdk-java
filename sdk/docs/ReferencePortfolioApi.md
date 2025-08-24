# ReferencePortfolioApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReferencePortfolio**](ReferencePortfolioApi.md#createReferencePortfolio) | **POST** /api/referenceportfolios/{scope} | CreateReferencePortfolio: Create reference portfolio |
| [**getReferencePortfolioConstituents**](ReferencePortfolioApi.md#getReferencePortfolioConstituents) | **GET** /api/referenceportfolios/{scope}/{code}/constituents | GetReferencePortfolioConstituents: Get reference portfolio constituents |
| [**listConstituentsAdjustments**](ReferencePortfolioApi.md#listConstituentsAdjustments) | **GET** /api/referenceportfolios/{scope}/{code}/constituentsadjustments | ListConstituentsAdjustments: List constituents adjustments |
| [**upsertReferencePortfolioConstituentProperties**](ReferencePortfolioApi.md#upsertReferencePortfolioConstituentProperties) | **POST** /api/referenceportfolios/{scope}/{code}/constituents/properties | [EARLY ACCESS] UpsertReferencePortfolioConstituentProperties: Upsert constituent properties |
| [**upsertReferencePortfolioConstituents**](ReferencePortfolioApi.md#upsertReferencePortfolioConstituents) | **POST** /api/referenceportfolios/{scope}/{code}/constituents | UpsertReferencePortfolioConstituents: Upsert reference portfolio constituents |



## createReferencePortfolio

> Portfolio createReferencePortfolio(scope, createReferencePortfolioRequest)

CreateReferencePortfolio: Create reference portfolio

Create a reference portfolio in a particular scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ReferencePortfolioApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ReferencePortfolioApiExample {

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
        // ReferencePortfolioApi apiInstance = apiFactory.build(ReferencePortfolioApi.class);

        ReferencePortfolioApi apiInstance = ApiFactoryBuilder.build(fileName).build(ReferencePortfolioApi.class);
        String scope = "scope_example"; // String | The scope in which to create the reference portfolio.
        CreateReferencePortfolioRequest createReferencePortfolioRequest = new CreateReferencePortfolioRequest(); // CreateReferencePortfolioRequest | The definition of the reference portfolio.
        try {
            // uncomment the below to set overrides at the request level
            // Portfolio result = apiInstance.createReferencePortfolio(scope, createReferencePortfolioRequest).execute(opts);

            Portfolio result = apiInstance.createReferencePortfolio(scope, createReferencePortfolioRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferencePortfolioApi#createReferencePortfolio");
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
| **scope** | **String**| The scope in which to create the reference portfolio. | |
| **createReferencePortfolioRequest** | [**CreateReferencePortfolioRequest**](CreateReferencePortfolioRequest.md)| The definition of the reference portfolio. | |

### Return type

[**Portfolio**](Portfolio.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created reference portfolio, with populated id |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getReferencePortfolioConstituents

> GetReferencePortfolioConstituentsResponse getReferencePortfolioConstituents(scope, code, effectiveAt, asAt, propertyKeys)

GetReferencePortfolioConstituents: Get reference portfolio constituents

Get constituents from a reference portfolio at a particular effective time.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ReferencePortfolioApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ReferencePortfolioApiExample {

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
        // ReferencePortfolioApi apiInstance = apiFactory.build(ReferencePortfolioApi.class);

        ReferencePortfolioApi apiInstance = ApiFactoryBuilder.build(fileName).build(ReferencePortfolioApi.class);
        String scope = "scope_example"; // String | The scope of the reference portfolio.
        String code = "code_example"; // String | The code of the reference portfolio. Together with the scope this uniquely identifies   the reference portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective date of the constituents to retrieve. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve constituents. Defaults to return the latest version   of each constituent if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Instrument' or 'ReferenceHolding' domain to decorate onto   constituents. These take the format {domain}/{scope}/{code} e.g. 'Instrument/system/Name' or   'ReferenceHolding/strategy/quantsignal'. Defaults to return all available instrument and reference holding properties if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // GetReferencePortfolioConstituentsResponse result = apiInstance.getReferencePortfolioConstituents(scope, code, effectiveAt, asAt, propertyKeys).execute(opts);

            GetReferencePortfolioConstituentsResponse result = apiInstance.getReferencePortfolioConstituents(scope, code, effectiveAt, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferencePortfolioApi#getReferencePortfolioConstituents");
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
| **scope** | **String**| The scope of the reference portfolio. | |
| **code** | **String**| The code of the reference portfolio. Together with the scope this uniquely identifies   the reference portfolio. | |
| **effectiveAt** | **String**| The effective date of the constituents to retrieve. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve constituents. Defaults to return the latest version   of each constituent if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Instrument&#39; or &#39;ReferenceHolding&#39; domain to decorate onto   constituents. These take the format {domain}/{scope}/{code} e.g. &#39;Instrument/system/Name&#39; or   &#39;ReferenceHolding/strategy/quantsignal&#39;. Defaults to return all available instrument and reference holding properties if not specified. | [optional] |

### Return type

[**GetReferencePortfolioConstituentsResponse**](GetReferencePortfolioConstituentsResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested reference portfolio constituents |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listConstituentsAdjustments

> ResourceListOfConstituentsAdjustmentHeader listConstituentsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAtTime)

ListConstituentsAdjustments: List constituents adjustments

List adjustments made to constituents in a reference portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ReferencePortfolioApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ReferencePortfolioApiExample {

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
        // ReferencePortfolioApi apiInstance = apiFactory.build(ReferencePortfolioApi.class);

        ReferencePortfolioApi apiInstance = ApiFactoryBuilder.build(fileName).build(ReferencePortfolioApi.class);
        String scope = "scope_example"; // String | The scope of the reference portfolio.
        String code = "code_example"; // String | The code of the reference portfolio. Together with the scope this uniquely identifies   the reference portfolio.
        String fromEffectiveAt = "fromEffectiveAt_example"; // String | Events between this time (inclusive) and the toEffectiveAt are returned.
        String toEffectiveAt = "toEffectiveAt_example"; // String | Events between this time (inclusive) and the fromEffectiveAt are returned.
        OffsetDateTime asAtTime = OffsetDateTime.now(); // OffsetDateTime | The asAt time for which the result is valid.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfConstituentsAdjustmentHeader result = apiInstance.listConstituentsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAtTime).execute(opts);

            ResourceListOfConstituentsAdjustmentHeader result = apiInstance.listConstituentsAdjustments(scope, code, fromEffectiveAt, toEffectiveAt, asAtTime).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferencePortfolioApi#listConstituentsAdjustments");
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
| **scope** | **String**| The scope of the reference portfolio. | |
| **code** | **String**| The code of the reference portfolio. Together with the scope this uniquely identifies   the reference portfolio. | |
| **fromEffectiveAt** | **String**| Events between this time (inclusive) and the toEffectiveAt are returned. | |
| **toEffectiveAt** | **String**| Events between this time (inclusive) and the fromEffectiveAt are returned. | |
| **asAtTime** | **OffsetDateTime**| The asAt time for which the result is valid. | [optional] |

### Return type

[**ResourceListOfConstituentsAdjustmentHeader**](ResourceListOfConstituentsAdjustmentHeader.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertReferencePortfolioConstituentProperties

> UpsertReferencePortfolioConstituentPropertiesResponse upsertReferencePortfolioConstituentProperties(scope, code, upsertReferencePortfolioConstituentPropertiesRequest)

[EARLY ACCESS] UpsertReferencePortfolioConstituentProperties: Upsert constituent properties

Create or update one or more constituent properties for a single constituent in the reference portfolio.  Each property will be updated if it already exists, created if it does not and deleted if value is null.  Both constituent and portfolio must exist at the time when properties are created or updated.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ReferencePortfolioApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ReferencePortfolioApiExample {

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
        // ReferencePortfolioApi apiInstance = apiFactory.build(ReferencePortfolioApi.class);

        ReferencePortfolioApi apiInstance = ApiFactoryBuilder.build(fileName).build(ReferencePortfolioApi.class);
        String scope = "scope_example"; // String | The scope of the reference portfolio.
        String code = "code_example"; // String | The code of the reference portfolio. Together with the scope this uniquely identifies   the reference portfolio.
        UpsertReferencePortfolioConstituentPropertiesRequest upsertReferencePortfolioConstituentPropertiesRequest = new UpsertReferencePortfolioConstituentPropertiesRequest(); // UpsertReferencePortfolioConstituentPropertiesRequest | The request to modify properties for the constituent.
        try {
            // uncomment the below to set overrides at the request level
            // UpsertReferencePortfolioConstituentPropertiesResponse result = apiInstance.upsertReferencePortfolioConstituentProperties(scope, code, upsertReferencePortfolioConstituentPropertiesRequest).execute(opts);

            UpsertReferencePortfolioConstituentPropertiesResponse result = apiInstance.upsertReferencePortfolioConstituentProperties(scope, code, upsertReferencePortfolioConstituentPropertiesRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferencePortfolioApi#upsertReferencePortfolioConstituentProperties");
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
| **scope** | **String**| The scope of the reference portfolio. | |
| **code** | **String**| The code of the reference portfolio. Together with the scope this uniquely identifies   the reference portfolio. | |
| **upsertReferencePortfolioConstituentPropertiesRequest** | [**UpsertReferencePortfolioConstituentPropertiesRequest**](UpsertReferencePortfolioConstituentPropertiesRequest.md)| The request to modify properties for the constituent. | |

### Return type

[**UpsertReferencePortfolioConstituentPropertiesResponse**](UpsertReferencePortfolioConstituentPropertiesResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertReferencePortfolioConstituents

> UpsertReferencePortfolioConstituentsResponse upsertReferencePortfolioConstituents(scope, code, upsertReferencePortfolioConstituentsRequest)

UpsertReferencePortfolioConstituents: Upsert reference portfolio constituents

Add constituents to a reference portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.ReferencePortfolioApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ReferencePortfolioApiExample {

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
        // ReferencePortfolioApi apiInstance = apiFactory.build(ReferencePortfolioApi.class);

        ReferencePortfolioApi apiInstance = ApiFactoryBuilder.build(fileName).build(ReferencePortfolioApi.class);
        String scope = "scope_example"; // String | The scope of the reference portfolio.
        String code = "code_example"; // String | The code of the reference portfolio. Together with the scope this uniquely identifies   the reference portfolio.
        UpsertReferencePortfolioConstituentsRequest upsertReferencePortfolioConstituentsRequest = new UpsertReferencePortfolioConstituentsRequest(); // UpsertReferencePortfolioConstituentsRequest | The constituents to upload to the reference portfolio.
        try {
            // uncomment the below to set overrides at the request level
            // UpsertReferencePortfolioConstituentsResponse result = apiInstance.upsertReferencePortfolioConstituents(scope, code, upsertReferencePortfolioConstituentsRequest).execute(opts);

            UpsertReferencePortfolioConstituentsResponse result = apiInstance.upsertReferencePortfolioConstituents(scope, code, upsertReferencePortfolioConstituentsRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferencePortfolioApi#upsertReferencePortfolioConstituents");
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
| **scope** | **String**| The scope of the reference portfolio. | |
| **code** | **String**| The code of the reference portfolio. Together with the scope this uniquely identifies   the reference portfolio. | |
| **upsertReferencePortfolioConstituentsRequest** | [**UpsertReferencePortfolioConstituentsRequest**](UpsertReferencePortfolioConstituentsRequest.md)| The constituents to upload to the reference portfolio. | |

### Return type

[**UpsertReferencePortfolioConstituentsResponse**](UpsertReferencePortfolioConstituentsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

