# EntitiesApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCustomEntityByEntityUniqueId**](EntitiesApi.md#getCustomEntityByEntityUniqueId) | **GET** /api/entities/customentities/{entityUniqueId} | GetCustomEntityByEntityUniqueId: Get a Custom Entity instance by its EntityUniqueId |
| [**getDataTypeByEntityUniqueId**](EntitiesApi.md#getDataTypeByEntityUniqueId) | **GET** /api/entities/datatypes/{entityUniqueId} | GetDataTypeByEntityUniqueId: Get DataType by EntityUniqueId |
| [**getEntityHistory**](EntitiesApi.md#getEntityHistory) | **GET** /api/entities/{entityType}/{entityUniqueId}/history | GetEntityHistory: List an entity&#39;s history information |
| [**getInstrumentByEntityUniqueId**](EntitiesApi.md#getInstrumentByEntityUniqueId) | **GET** /api/entities/instruments/{entityUniqueId} | GetInstrumentByEntityUniqueId: Get instrument by EntityUniqueId |
| [**getPortfolioByEntityUniqueId**](EntitiesApi.md#getPortfolioByEntityUniqueId) | **GET** /api/entities/portfolios/{entityUniqueId} | GetPortfolioByEntityUniqueId: Get portfolio by EntityUniqueId |
| [**getPortfolioChanges**](EntitiesApi.md#getPortfolioChanges) | **GET** /api/entities/changes/portfolios | GetPortfolioChanges: Get the next change to each portfolio in a scope. |
| [**getPropertyDefinitionByEntityUniqueId**](EntitiesApi.md#getPropertyDefinitionByEntityUniqueId) | **GET** /api/entities/propertydefinitions/{entityUniqueId} | GetPropertyDefinitionByEntityUniqueId: Get property definition by EntityUniqueId |



## getCustomEntityByEntityUniqueId

> CustomEntityEntity getCustomEntityByEntityUniqueId(entityUniqueId, effectiveAt, asAt, previews)

GetCustomEntityByEntityUniqueId: Get a Custom Entity instance by its EntityUniqueId

Retrieve a particular Custom Entity instance.  If the Custom Entity is deleted, this will return the state of the Custom Entity immediately prior to deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EntitiesApiExample {

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
        // EntitiesApi apiInstance = apiFactory.build(EntitiesApi.class);

        EntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(EntitiesApi.class);
        String entityUniqueId = "entityUniqueId_example"; // String | The universally unique identifier of the Custom Entity.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Custom Entity. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Custom Entity. Defaults to returning the latest version of the Custom Entity if not specified.
        List<String> previews = Arrays.asList(); // List<String> | The ids of the staged modifications to be previewed in the response.
        try {
            // uncomment the below to set overrides at the request level
            // CustomEntityEntity result = apiInstance.getCustomEntityByEntityUniqueId(entityUniqueId, effectiveAt, asAt, previews).execute(opts);

            CustomEntityEntity result = apiInstance.getCustomEntityByEntityUniqueId(entityUniqueId, effectiveAt, asAt, previews).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EntitiesApi#getCustomEntityByEntityUniqueId");
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
| **entityUniqueId** | **String**| The universally unique identifier of the Custom Entity. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Custom Entity. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Custom Entity. Defaults to returning the latest version of the Custom Entity if not specified. | [optional] |
| **previews** | [**List&lt;String&gt;**](String.md)| The ids of the staged modifications to be previewed in the response. | [optional] |

### Return type

[**CustomEntityEntity**](CustomEntityEntity.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested CustomEntity |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getDataTypeByEntityUniqueId

> DataTypeEntity getDataTypeByEntityUniqueId(entityUniqueId, asAt, previews)

GetDataTypeByEntityUniqueId: Get DataType by EntityUniqueId

Retrieve the definition of a particular DataType.  If the DataType is deleted, this will return the state of the DataType immediately prior to deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EntitiesApiExample {

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
        // EntitiesApi apiInstance = apiFactory.build(EntitiesApi.class);

        EntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(EntitiesApi.class);
        String entityUniqueId = "entityUniqueId_example"; // String | The universally unique identifier of the DataType definition.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the DataType definition. Defaults to returning the latest version of the DataType definition if not specified.
        List<String> previews = Arrays.asList(); // List<String> | The ids of the staged modifications to be previewed in the response.
        try {
            // uncomment the below to set overrides at the request level
            // DataTypeEntity result = apiInstance.getDataTypeByEntityUniqueId(entityUniqueId, asAt, previews).execute(opts);

            DataTypeEntity result = apiInstance.getDataTypeByEntityUniqueId(entityUniqueId, asAt, previews).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EntitiesApi#getDataTypeByEntityUniqueId");
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
| **entityUniqueId** | **String**| The universally unique identifier of the DataType definition. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the DataType definition. Defaults to returning the latest version of the DataType definition if not specified. | [optional] |
| **previews** | [**List&lt;String&gt;**](String.md)| The ids of the staged modifications to be previewed in the response. | [optional] |

### Return type

[**DataTypeEntity**](DataTypeEntity.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested DataType entity |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getEntityHistory

> ResourceListOfChangeInterval getEntityHistory(entityType, entityUniqueId, asAt, page, limit, filter, sortBy)

GetEntityHistory: List an entity&#39;s history information

Retrieve a page of an entity&#39;s change history up to a particular point in AsAt time.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EntitiesApiExample {

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
        // EntitiesApi apiInstance = apiFactory.build(EntitiesApi.class);

        EntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(EntitiesApi.class);
        String entityType = "entityType_example"; // String | The type of the entity to list the change history for.
        String entityUniqueId = "entityUniqueId_example"; // String | The universally unique identifier of the entity.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list change history information. Defaults to return the change history at the latest datetime if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing change history information from a previous call to list change   history information. This value is returned from the previous call. If a pagination token is provided the filter, sortBy   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names suffixed by \" ASC\" or \" DESC\"
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfChangeInterval result = apiInstance.getEntityHistory(entityType, entityUniqueId, asAt, page, limit, filter, sortBy).execute(opts);

            ResourceListOfChangeInterval result = apiInstance.getEntityHistory(entityType, entityUniqueId, asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EntitiesApi#getEntityHistory");
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
| **entityType** | **String**| The type of the entity to list the change history for. | |
| **entityUniqueId** | **String**| The universally unique identifier of the entity. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list change history information. Defaults to return the change history at the latest datetime if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing change history information from a previous call to list change   history information. This value is returned from the previous call. If a pagination token is provided the filter, sortBy   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.   Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; | [optional] |

### Return type

[**ResourceListOfChangeInterval**](ResourceListOfChangeInterval.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The change history of the provided entity. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getInstrumentByEntityUniqueId

> InstrumentEntity getInstrumentByEntityUniqueId(entityUniqueId, effectiveAt, asAt, previews)

GetInstrumentByEntityUniqueId: Get instrument by EntityUniqueId

Retrieve the definition of a particular instrument.  If the instrument is deleted, this will return the state of the instrument immediately prior to deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EntitiesApiExample {

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
        // EntitiesApi apiInstance = apiFactory.build(EntitiesApi.class);

        EntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(EntitiesApi.class);
        String entityUniqueId = "entityUniqueId_example"; // String | The universally unique identifier of the instrument definition.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Instrument definition. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the instrument definition. Defaults to returning the latest version of the instrument definition if not specified.
        List<String> previews = Arrays.asList(); // List<String> | The ids of the staged modifications to be previewed in the response.
        try {
            // uncomment the below to set overrides at the request level
            // InstrumentEntity result = apiInstance.getInstrumentByEntityUniqueId(entityUniqueId, effectiveAt, asAt, previews).execute(opts);

            InstrumentEntity result = apiInstance.getInstrumentByEntityUniqueId(entityUniqueId, effectiveAt, asAt, previews).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EntitiesApi#getInstrumentByEntityUniqueId");
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
| **entityUniqueId** | **String**| The universally unique identifier of the instrument definition. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Instrument definition. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instrument definition. Defaults to returning the latest version of the instrument definition if not specified. | [optional] |
| **previews** | [**List&lt;String&gt;**](String.md)| The ids of the staged modifications to be previewed in the response. | [optional] |

### Return type

[**InstrumentEntity**](InstrumentEntity.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested instrument entity |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioByEntityUniqueId

> PortfolioEntity getPortfolioByEntityUniqueId(entityUniqueId, effectiveAt, asAt, previews)

GetPortfolioByEntityUniqueId: Get portfolio by EntityUniqueId

Retrieve the definition of a particular portfolio.  If the portfolio is deleted, this will return the state of the portfolio immediately prior to deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EntitiesApiExample {

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
        // EntitiesApi apiInstance = apiFactory.build(EntitiesApi.class);

        EntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(EntitiesApi.class);
        String entityUniqueId = "entityUniqueId_example"; // String | The universally unique identifier of the portfolio definition.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the portfolio definition. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio definition. Defaults to returning the latest version of the portfolio definition if not specified.
        List<String> previews = Arrays.asList(); // List<String> | The ids of the staged modifications to be previewed in the response.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioEntity result = apiInstance.getPortfolioByEntityUniqueId(entityUniqueId, effectiveAt, asAt, previews).execute(opts);

            PortfolioEntity result = apiInstance.getPortfolioByEntityUniqueId(entityUniqueId, effectiveAt, asAt, previews).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EntitiesApi#getPortfolioByEntityUniqueId");
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
| **entityUniqueId** | **String**| The universally unique identifier of the portfolio definition. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the portfolio definition. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio definition. Defaults to returning the latest version of the portfolio definition if not specified. | [optional] |
| **previews** | [**List&lt;String&gt;**](String.md)| The ids of the staged modifications to be previewed in the response. | [optional] |

### Return type

[**PortfolioEntity**](PortfolioEntity.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested portfolio entity |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioChanges

> ResourceListOfChange getPortfolioChanges(scope, effectiveAt, asAt)

GetPortfolioChanges: Get the next change to each portfolio in a scope.

Gets the time of the next (earliest effective at) modification (correction and/or amendment) to each portfolio in a scope relative to a point in bitemporal time.  Includes changes from parent portfolios in different scopes.  Excludes changes from subscriptions (e.g corporate actions).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EntitiesApiExample {

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
        // EntitiesApi apiInstance = apiFactory.build(EntitiesApi.class);

        EntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(EntitiesApi.class);
        String scope = "scope_example"; // String | The scope
        String effectiveAt = "effectiveAt_example"; // String | The effective date of the origin.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The as-at date of the origin.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfChange result = apiInstance.getPortfolioChanges(scope, effectiveAt, asAt).execute(opts);

            ResourceListOfChange result = apiInstance.getPortfolioChanges(scope, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EntitiesApi#getPortfolioChanges");
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
| **scope** | **String**| The scope | |
| **effectiveAt** | **String**| The effective date of the origin. | |
| **asAt** | **OffsetDateTime**| The as-at date of the origin. | [optional] |

### Return type

[**ResourceListOfChange**](ResourceListOfChange.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | The details of the input related failure |  -  |
| **200** | A list of portfolio changes in the requested scope relative to the specified time. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPropertyDefinitionByEntityUniqueId

> PropertyDefinitionEntity getPropertyDefinitionByEntityUniqueId(entityUniqueId, effectiveAt, asAt, previews)

GetPropertyDefinitionByEntityUniqueId: Get property definition by EntityUniqueId

Retrieve a particular property definition.  If the property definition is deleted, this will return the state of the property definition immediately prior to deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.EntitiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EntitiesApiExample {

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
        // EntitiesApi apiInstance = apiFactory.build(EntitiesApi.class);

        EntitiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(EntitiesApi.class);
        String entityUniqueId = "entityUniqueId_example"; // String | The universally unique identifier of the property definition.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime at which to retrieve the property definition. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the property definition. Defaults to returning the latest version of the property definition if not specified.
        List<String> previews = Arrays.asList(); // List<String> | The ids of the staged modifications to be previewed in the response.
        try {
            // uncomment the below to set overrides at the request level
            // PropertyDefinitionEntity result = apiInstance.getPropertyDefinitionByEntityUniqueId(entityUniqueId, effectiveAt, asAt, previews).execute(opts);

            PropertyDefinitionEntity result = apiInstance.getPropertyDefinitionByEntityUniqueId(entityUniqueId, effectiveAt, asAt, previews).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling EntitiesApi#getPropertyDefinitionByEntityUniqueId");
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
| **entityUniqueId** | **String**| The universally unique identifier of the property definition. | |
| **effectiveAt** | **String**| The effective datetime at which to retrieve the property definition. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the property definition. Defaults to returning the latest version of the property definition if not specified. | [optional] |
| **previews** | [**List&lt;String&gt;**](String.md)| The ids of the staged modifications to be previewed in the response. | [optional] |

### Return type

[**PropertyDefinitionEntity**](PropertyDefinitionEntity.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested property definition entity |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

