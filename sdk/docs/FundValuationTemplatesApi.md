# FundValuationTemplatesApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteValuationAddressKeyTemplate**](FundValuationTemplatesApi.md#deleteValuationAddressKeyTemplate) | **DELETE** /api/fundvaluationtemplates/{scope}/{code} | [EXPERIMENTAL] DeleteValuationAddressKeyTemplate: Delete a Valuation Template. |
| [**getValuationAddressKeyTemplate**](FundValuationTemplatesApi.md#getValuationAddressKeyTemplate) | **GET** /api/fundvaluationtemplates/{scope}/{code} | [EXPERIMENTAL] GetValuationAddressKeyTemplate: Get a Valuation Template. |
| [**listValuationAddressKeyTemplates**](FundValuationTemplatesApi.md#listValuationAddressKeyTemplates) | **GET** /api/fundvaluationtemplates | [EXPERIMENTAL] ListValuationAddressKeyTemplates: List Valuation Templates. |
| [**upsertValuationAddressKeyTemplate**](FundValuationTemplatesApi.md#upsertValuationAddressKeyTemplate) | **PUT** /api/fundvaluationtemplates/{scope}/{code} | [EXPERIMENTAL] UpsertValuationAddressKeyTemplate: Upsert a Valuation Template. |



## deleteValuationAddressKeyTemplate

> DeletedEntityResponse deleteValuationAddressKeyTemplate(scope, code)

[EXPERIMENTAL] DeleteValuationAddressKeyTemplate: Delete a Valuation Template.

Delete the given Valuation Template. A template that any Fund or NAV Type references cannot be deleted.  If the deleted template is the domain default, the system default defined by LUSID applies again.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundValuationTemplatesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundValuationTemplatesApiExample {

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
        // FundValuationTemplatesApi apiInstance = apiFactory.build(FundValuationTemplatesApi.class);

        FundValuationTemplatesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundValuationTemplatesApi.class);
        String scope = "scope_example"; // String | The scope of the Valuation Template.
        String code = "code_example"; // String | The code of the Valuation Template to delete.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteValuationAddressKeyTemplate(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteValuationAddressKeyTemplate(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundValuationTemplatesApi#deleteValuationAddressKeyTemplate");
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
| **scope** | **String**| The scope of the Valuation Template. | |
| **code** | **String**| The code of the Valuation Template to delete. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the Valuation Template was deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getValuationAddressKeyTemplate

> ValuationAddressKeyTemplate getValuationAddressKeyTemplate(scope, code, asAt)

[EXPERIMENTAL] GetValuationAddressKeyTemplate: Get a Valuation Template.

Retrieve a Valuation Template.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundValuationTemplatesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundValuationTemplatesApiExample {

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
        // FundValuationTemplatesApi apiInstance = apiFactory.build(FundValuationTemplatesApi.class);

        FundValuationTemplatesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundValuationTemplatesApi.class);
        String scope = "scope_example"; // String | The scope of the Valuation Template.
        String code = "code_example"; // String | The code of the Valuation Template. Together with the scope this uniquely identifies the template.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Valuation Template. Defaults to returning the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // ValuationAddressKeyTemplate result = apiInstance.getValuationAddressKeyTemplate(scope, code, asAt).execute(opts);

            ValuationAddressKeyTemplate result = apiInstance.getValuationAddressKeyTemplate(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundValuationTemplatesApi#getValuationAddressKeyTemplate");
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
| **scope** | **String**| The scope of the Valuation Template. | |
| **code** | **String**| The code of the Valuation Template. Together with the scope this uniquely identifies the template. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Valuation Template. Defaults to returning the latest version if not specified. | [optional] |

### Return type

[**ValuationAddressKeyTemplate**](ValuationAddressKeyTemplate.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Valuation Template. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listValuationAddressKeyTemplates

> PagedResourceListOfValuationAddressKeyTemplate listValuationAddressKeyTemplates(asAt, page, limit, filter, sortBy)

[EXPERIMENTAL] ListValuationAddressKeyTemplates: List Valuation Templates.

List the stored Valuation Templates matching the given criteria. To find the domain default, filter on  \&quot;isDefault eq true\&quot;. The system default is not stored, so it is not listed. If no stored template is the  default, the system default applies. Get it with scope \&quot;default\&quot; and code \&quot;DefaultTemplate\&quot;.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundValuationTemplatesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundValuationTemplatesApiExample {

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
        // FundValuationTemplatesApi apiInstance = apiFactory.build(FundValuationTemplatesApi.class);

        FundValuationTemplatesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundValuationTemplatesApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Valuation Templates. Defaults to returning the latest version of each template if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Valuation Templates; this   value is returned from the previous call. If a pagination token is provided, the filter, sortBy and asAt   fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the display name, specify \"displayName eq 'Default keys'\". For more information about filtering   results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfValuationAddressKeyTemplate result = apiInstance.listValuationAddressKeyTemplates(asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfValuationAddressKeyTemplate result = apiInstance.listValuationAddressKeyTemplates(asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundValuationTemplatesApi#listValuationAddressKeyTemplates");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Valuation Templates. Defaults to returning the latest version of each template if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Valuation Templates; this   value is returned from the previous call. If a pagination token is provided, the filter, sortBy and asAt   fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the display name, specify \&quot;displayName eq &#39;Default keys&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfValuationAddressKeyTemplate**](PagedResourceListOfValuationAddressKeyTemplate.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Valuation Templates. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertValuationAddressKeyTemplate

> ValuationAddressKeyTemplate upsertValuationAddressKeyTemplate(scope, code, upsertValuationAddressKeyTemplateRequest)

[EXPERIMENTAL] UpsertValuationAddressKeyTemplate: Upsert a Valuation Template.

Create a Valuation Template, or replace the whole content of an existing one. Every Fund and NAV Type that  references the template uses the new content. Set isDefault to make the template the domain default.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.FundValuationTemplatesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FundValuationTemplatesApiExample {

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
        // FundValuationTemplatesApi apiInstance = apiFactory.build(FundValuationTemplatesApi.class);

        FundValuationTemplatesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FundValuationTemplatesApi.class);
        String scope = "scope_example"; // String | The scope of the Valuation Template.
        String code = "code_example"; // String | The code of the Valuation Template. Together with the scope this uniquely identifies the template.
        UpsertValuationAddressKeyTemplateRequest upsertValuationAddressKeyTemplateRequest = new UpsertValuationAddressKeyTemplateRequest(); // UpsertValuationAddressKeyTemplateRequest | The full content of the Valuation Template.
        try {
            // uncomment the below to set overrides at the request level
            // ValuationAddressKeyTemplate result = apiInstance.upsertValuationAddressKeyTemplate(scope, code, upsertValuationAddressKeyTemplateRequest).execute(opts);

            ValuationAddressKeyTemplate result = apiInstance.upsertValuationAddressKeyTemplate(scope, code, upsertValuationAddressKeyTemplateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FundValuationTemplatesApi#upsertValuationAddressKeyTemplate");
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
| **scope** | **String**| The scope of the Valuation Template. | |
| **code** | **String**| The code of the Valuation Template. Together with the scope this uniquely identifies the template. | |
| **upsertValuationAddressKeyTemplateRequest** | [**UpsertValuationAddressKeyTemplateRequest**](UpsertValuationAddressKeyTemplateRequest.md)| The full content of the Valuation Template. | |

### Return type

[**ValuationAddressKeyTemplate**](ValuationAddressKeyTemplate.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The upserted Valuation Address Key Template. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

