# InstrumentEventTypesApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransactionTemplate**](InstrumentEventTypesApi.md#createTransactionTemplate) | **POST** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplates/{instrumentType}/{scope} | CreateTransactionTemplate: Create Transaction Template |
| [**deleteTransactionTemplate**](InstrumentEventTypesApi.md#deleteTransactionTemplate) | **DELETE** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplates/{instrumentType}/{scope} | DeleteTransactionTemplate: Delete Transaction Template |
| [**getTransactionTemplate**](InstrumentEventTypesApi.md#getTransactionTemplate) | **GET** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplates/{instrumentType}/{scope} | GetTransactionTemplate: Get Transaction Template |
| [**getTransactionTemplateSpecification**](InstrumentEventTypesApi.md#getTransactionTemplateSpecification) | **GET** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplatespecification | GetTransactionTemplateSpecification: Get Transaction Template Specification. |
| [**listTransactionTemplateSpecifications**](InstrumentEventTypesApi.md#listTransactionTemplateSpecifications) | **GET** /api/instrumenteventtypes/transactiontemplatespecifications | ListTransactionTemplateSpecifications: List Transaction Template Specifications. |
| [**listTransactionTemplates**](InstrumentEventTypesApi.md#listTransactionTemplates) | **GET** /api/instrumenteventtypes/transactiontemplates | ListTransactionTemplates: List Transaction Templates |
| [**updateTransactionTemplate**](InstrumentEventTypesApi.md#updateTransactionTemplate) | **PUT** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplates/{instrumentType}/{scope} | UpdateTransactionTemplate: Update Transaction Template |



## createTransactionTemplate

> TransactionTemplate createTransactionTemplate(instrumentEventType, instrumentType, scope, transactionTemplateRequest)

CreateTransactionTemplate: Create Transaction Template

Create a transaction template for a particular instrument event type in a scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InstrumentEventTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InstrumentEventTypesApiExample {

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
        // InstrumentEventTypesApi apiInstance = apiFactory.build(InstrumentEventTypesApi.class);

        InstrumentEventTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(InstrumentEventTypesApi.class);
        String instrumentEventType = "instrumentEventType_example"; // String | The type of instrument events that the template is applied to.
        String instrumentType = "instrumentType_example"; // String | The instrument type of the transaction template. The combination of the instrument   event type, instrument type and scope uniquely identifies a transaction template
        String scope = "scope_example"; // String | The scope in which the template lies.
        TransactionTemplateRequest transactionTemplateRequest = new TransactionTemplateRequest(); // TransactionTemplateRequest | A request defining a new transaction template to be created.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionTemplate result = apiInstance.createTransactionTemplate(instrumentEventType, instrumentType, scope, transactionTemplateRequest).execute(opts);

            TransactionTemplate result = apiInstance.createTransactionTemplate(instrumentEventType, instrumentType, scope, transactionTemplateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentEventTypesApi#createTransactionTemplate");
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
| **instrumentEventType** | **String**| The type of instrument events that the template is applied to. | |
| **instrumentType** | **String**| The instrument type of the transaction template. The combination of the instrument   event type, instrument type and scope uniquely identifies a transaction template | |
| **scope** | **String**| The scope in which the template lies. | |
| **transactionTemplateRequest** | [**TransactionTemplateRequest**](TransactionTemplateRequest.md)| A request defining a new transaction template to be created. | |

### Return type

[**TransactionTemplate**](TransactionTemplate.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The response of the transaction template that was created. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteTransactionTemplate

> OffsetDateTime deleteTransactionTemplate(instrumentEventType, instrumentType, scope)

DeleteTransactionTemplate: Delete Transaction Template

Delete a transaction template for a particular instrument event type in a scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InstrumentEventTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InstrumentEventTypesApiExample {

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
        // InstrumentEventTypesApi apiInstance = apiFactory.build(InstrumentEventTypesApi.class);

        InstrumentEventTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(InstrumentEventTypesApi.class);
        String instrumentEventType = "instrumentEventType_example"; // String | The type of instrument events that the template is applied to.
        String instrumentType = "instrumentType_example"; // String | The instrument type of the transaction template. The combination of the instrument   event type, instrument type and scope uniquely identifies a transaction template
        String scope = "scope_example"; // String | The scope of the template.
        try {
            // uncomment the below to set overrides at the request level
            // OffsetDateTime result = apiInstance.deleteTransactionTemplate(instrumentEventType, instrumentType, scope).execute(opts);

            OffsetDateTime result = apiInstance.deleteTransactionTemplate(instrumentEventType, instrumentType, scope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentEventTypesApi#deleteTransactionTemplate");
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
| **instrumentEventType** | **String**| The type of instrument events that the template is applied to. | |
| **instrumentType** | **String**| The instrument type of the transaction template. The combination of the instrument   event type, instrument type and scope uniquely identifies a transaction template | |
| **scope** | **String**| The scope of the template. | |

### Return type

[**OffsetDateTime**](OffsetDateTime.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AsAt Time the Template was deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTransactionTemplate

> TransactionTemplate getTransactionTemplate(instrumentEventType, instrumentType, scope, asAt)

GetTransactionTemplate: Get Transaction Template

Gets the Transaction Template that for the instrument event type within the scope specified.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InstrumentEventTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InstrumentEventTypesApiExample {

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
        // InstrumentEventTypesApi apiInstance = apiFactory.build(InstrumentEventTypesApi.class);

        InstrumentEventTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(InstrumentEventTypesApi.class);
        String instrumentEventType = "instrumentEventType_example"; // String | The instrument event type of the transaction template
        String instrumentType = "instrumentType_example"; // String | The instrument type of the transaction template. The combination of the instrument   event type, instrument type and scope uniquely identifies a transaction template
        String scope = "scope_example"; // String | The scope in which the template lies. When not supplied the scope is 'default'.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The AsAt time of the requested Transaction Template
        try {
            // uncomment the below to set overrides at the request level
            // TransactionTemplate result = apiInstance.getTransactionTemplate(instrumentEventType, instrumentType, scope, asAt).execute(opts);

            TransactionTemplate result = apiInstance.getTransactionTemplate(instrumentEventType, instrumentType, scope, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentEventTypesApi#getTransactionTemplate");
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
| **instrumentEventType** | **String**| The instrument event type of the transaction template | |
| **instrumentType** | **String**| The instrument type of the transaction template. The combination of the instrument   event type, instrument type and scope uniquely identifies a transaction template | |
| **scope** | **String**| The scope in which the template lies. When not supplied the scope is &#39;default&#39;. | |
| **asAt** | **OffsetDateTime**| The AsAt time of the requested Transaction Template | [optional] |

### Return type

[**TransactionTemplate**](TransactionTemplate.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The transaction template. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTransactionTemplateSpecification

> TransactionTemplateSpecification getTransactionTemplateSpecification(instrumentEventType)

GetTransactionTemplateSpecification: Get Transaction Template Specification.

Retrieve the transaction template specification for a particular event type.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InstrumentEventTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InstrumentEventTypesApiExample {

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
        // InstrumentEventTypesApi apiInstance = apiFactory.build(InstrumentEventTypesApi.class);

        InstrumentEventTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(InstrumentEventTypesApi.class);
        String instrumentEventType = "instrumentEventType_example"; // String | The requested instrument event type.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionTemplateSpecification result = apiInstance.getTransactionTemplateSpecification(instrumentEventType).execute(opts);

            TransactionTemplateSpecification result = apiInstance.getTransactionTemplateSpecification(instrumentEventType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentEventTypesApi#getTransactionTemplateSpecification");
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
| **instrumentEventType** | **String**| The requested instrument event type. | |

### Return type

[**TransactionTemplateSpecification**](TransactionTemplateSpecification.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Transaction Template Specification. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listTransactionTemplateSpecifications

> PagedResourceListOfTransactionTemplateSpecification listTransactionTemplateSpecifications(asAt, page, limit, filter, sortBy)

ListTransactionTemplateSpecifications: List Transaction Template Specifications.

Retrieves all transaction template specifications.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InstrumentEventTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InstrumentEventTypesApiExample {

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
        // InstrumentEventTypesApi apiInstance = apiFactory.build(InstrumentEventTypesApi.class);

        InstrumentEventTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(InstrumentEventTypesApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | AsAt of the request
        String page = "page_example"; // String | The pagination token to use to continue listing Transaction Template Specifications from   a previous call to list Transaction Template Specifications.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt   fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfTransactionTemplateSpecification result = apiInstance.listTransactionTemplateSpecifications(asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfTransactionTemplateSpecification result = apiInstance.listTransactionTemplateSpecifications(asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentEventTypesApi#listTransactionTemplateSpecifications");
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
| **asAt** | **OffsetDateTime**| AsAt of the request | [optional] |
| **page** | **String**| The pagination token to use to continue listing Transaction Template Specifications from   a previous call to list Transaction Template Specifications.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, and asAt   fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfTransactionTemplateSpecification**](PagedResourceListOfTransactionTemplateSpecification.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Transaction Template Specifications. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listTransactionTemplates

> PagedResourceListOfTransactionTemplate listTransactionTemplates(asAt, page, limit, filter, sortBy)

ListTransactionTemplates: List Transaction Templates

Lists all Transaction Templates.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InstrumentEventTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InstrumentEventTypesApiExample {

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
        // InstrumentEventTypesApi apiInstance = apiFactory.build(InstrumentEventTypesApi.class);

        InstrumentEventTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(InstrumentEventTypesApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The AsAt time at which to retrieve the Transaction Templates
        String page = "page_example"; // String | The pagination token to use to continue listing Transaction Templates from a previous call to list Transaction Templates.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, limit, and asAt fields   must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\"
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfTransactionTemplate result = apiInstance.listTransactionTemplates(asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfTransactionTemplate result = apiInstance.listTransactionTemplates(asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentEventTypesApi#listTransactionTemplates");
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
| **asAt** | **OffsetDateTime**| The AsAt time at which to retrieve the Transaction Templates | [optional] |
| **page** | **String**| The pagination token to use to continue listing Transaction Templates from a previous call to list Transaction Templates.   This value is returned from the previous call. If a pagination token is provided the sortBy, filter, limit, and asAt fields   must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:   https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**PagedResourceListOfTransactionTemplate**](PagedResourceListOfTransactionTemplate.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The transaction templates. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateTransactionTemplate

> TransactionTemplate updateTransactionTemplate(instrumentEventType, instrumentType, scope, transactionTemplateRequest)

UpdateTransactionTemplate: Update Transaction Template

Update a transaction template for a particular instrument event type in a scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InstrumentEventTypesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InstrumentEventTypesApiExample {

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
        // InstrumentEventTypesApi apiInstance = apiFactory.build(InstrumentEventTypesApi.class);

        InstrumentEventTypesApi apiInstance = ApiFactoryBuilder.build(fileName).build(InstrumentEventTypesApi.class);
        String instrumentEventType = "instrumentEventType_example"; // String | The type of instrument events that the template is applied to.
        String instrumentType = "instrumentType_example"; // String | The instrument type of the transaction template. The combination of the instrument   event type, instrument type and scope uniquely identifies a transaction template
        String scope = "scope_example"; // String | The scope in which the template lies.
        TransactionTemplateRequest transactionTemplateRequest = new TransactionTemplateRequest(); // TransactionTemplateRequest | A request defining the updated values for the transaction template.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionTemplate result = apiInstance.updateTransactionTemplate(instrumentEventType, instrumentType, scope, transactionTemplateRequest).execute(opts);

            TransactionTemplate result = apiInstance.updateTransactionTemplate(instrumentEventType, instrumentType, scope, transactionTemplateRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentEventTypesApi#updateTransactionTemplate");
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
| **instrumentEventType** | **String**| The type of instrument events that the template is applied to. | |
| **instrumentType** | **String**| The instrument type of the transaction template. The combination of the instrument   event type, instrument type and scope uniquely identifies a transaction template | |
| **scope** | **String**| The scope in which the template lies. | |
| **transactionTemplateRequest** | [**TransactionTemplateRequest**](TransactionTemplateRequest.md)| A request defining the updated values for the transaction template. | |

### Return type

[**TransactionTemplate**](TransactionTemplate.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response of the transaction template that was updated. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

