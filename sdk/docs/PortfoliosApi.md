# PortfoliosApi

All URIs are relative to *https://www.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchUpsertPortfolioAccessMetadata**](PortfoliosApi.md#batchUpsertPortfolioAccessMetadata) | **PUT** /api/portfolios/metadata | [EARLY ACCESS] BatchUpsertPortfolioAccessMetadata: Upsert multiple Portfolio Access Metadata Rules to multiple Portfolios |
| [**deleteInstrumentEventInstruction**](PortfoliosApi.md#deleteInstrumentEventInstruction) | **DELETE** /api/portfolios/{scope}/{code}/instrumenteventinstructions/{instrumentEventInstructionId} | [EARLY ACCESS] DeleteInstrumentEventInstruction: Delete Instrument Event Instruction |
| [**deleteKeyFromPortfolioAccessMetadata**](PortfoliosApi.md#deleteKeyFromPortfolioAccessMetadata) | **DELETE** /api/portfolios/{scope}/{code}/metadata/{metadataKey} | DeleteKeyFromPortfolioAccessMetadata: Delete a Portfolio Access Metadata Rule |
| [**deletePortfolio**](PortfoliosApi.md#deletePortfolio) | **DELETE** /api/portfolios/{scope}/{code} | DeletePortfolio: Delete portfolio |
| [**deletePortfolioProperties**](PortfoliosApi.md#deletePortfolioProperties) | **DELETE** /api/portfolios/{scope}/{code}/properties | DeletePortfolioProperties: Delete portfolio properties |
| [**deletePortfolioReturns**](PortfoliosApi.md#deletePortfolioReturns) | **DELETE** /api/portfolios/{scope}/{code}/returns/{returnScope}/{returnCode}/$delete | [EARLY ACCESS] DeletePortfolioReturns: Delete Returns |
| [**getAggregatedReturnsDispersionMetrics**](PortfoliosApi.md#getAggregatedReturnsDispersionMetrics) | **POST** /api/portfolios/{scope}/{code}/returns/dispersion/$aggregated | [EARLY ACCESS] GetAggregatedReturnsDispersionMetrics: Get the Aggregated Returns Dispersion metric |
| [**getCompositeBreakdown**](PortfoliosApi.md#getCompositeBreakdown) | **POST** /api/portfolios/{scope}/{code}/returns/breakdown | [EARLY ACCESS] GetCompositeBreakdown: Get the Composite Breakdown on how the composite Returns are calculated |
| [**getInstrumentEventInstruction**](PortfoliosApi.md#getInstrumentEventInstruction) | **GET** /api/portfolios/{scope}/{code}/instrumenteventinstructions/{instrumentEventInstructionId} | [EARLY ACCESS] GetInstrumentEventInstruction: Get Instrument Event Instruction |
| [**getPortfolio**](PortfoliosApi.md#getPortfolio) | **GET** /api/portfolios/{scope}/{code} | GetPortfolio: Get portfolio |
| [**getPortfolioAggregateReturns**](PortfoliosApi.md#getPortfolioAggregateReturns) | **GET** /api/portfolios/{scope}/{code}/returns/{returnScope}/{returnCode}/aggregated | [DEPRECATED] GetPortfolioAggregateReturns: Aggregate Returns (This is a deprecated endpoint). |
| [**getPortfolioAggregatedReturns**](PortfoliosApi.md#getPortfolioAggregatedReturns) | **POST** /api/portfolios/{scope}/{code}/returns/$aggregated | GetPortfolioAggregatedReturns: Aggregated Returns |
| [**getPortfolioCommands**](PortfoliosApi.md#getPortfolioCommands) | **GET** /api/portfolios/{scope}/{code}/commands | GetPortfolioCommands: Get portfolio commands |
| [**getPortfolioMetadata**](PortfoliosApi.md#getPortfolioMetadata) | **GET** /api/portfolios/{scope}/{code}/metadata | GetPortfolioMetadata: Get access metadata rules for a portfolio |
| [**getPortfolioProperties**](PortfoliosApi.md#getPortfolioProperties) | **GET** /api/portfolios/{scope}/{code}/properties | GetPortfolioProperties: Get portfolio properties |
| [**getPortfolioPropertyTimeSeries**](PortfoliosApi.md#getPortfolioPropertyTimeSeries) | **GET** /api/portfolios/{scope}/{code}/properties/time-series | GetPortfolioPropertyTimeSeries: Get portfolio property time series |
| [**getPortfolioRelations**](PortfoliosApi.md#getPortfolioRelations) | **GET** /api/portfolios/{scope}/{code}/relations | [EXPERIMENTAL] GetPortfolioRelations: Get portfolio relations |
| [**getPortfolioRelationships**](PortfoliosApi.md#getPortfolioRelationships) | **GET** /api/portfolios/{scope}/{code}/relationships | GetPortfolioRelationships: Get portfolio relationships |
| [**getPortfolioReturns**](PortfoliosApi.md#getPortfolioReturns) | **GET** /api/portfolios/{scope}/{code}/returns/{returnScope}/{returnCode} | GetPortfolioReturns: Get Returns |
| [**getPortfoliosAccessMetadataByKey**](PortfoliosApi.md#getPortfoliosAccessMetadataByKey) | **GET** /api/portfolios/{scope}/{code}/metadata/{metadataKey} | [EARLY ACCESS] GetPortfoliosAccessMetadataByKey: Get an entry identified by a metadataKey in the access metadata object |
| [**listInstrumentEventInstructions**](PortfoliosApi.md#listInstrumentEventInstructions) | **GET** /api/portfolios/{scope}/{code}/instrumenteventinstructions | [EARLY ACCESS] ListInstrumentEventInstructions: List Instrument Event Instructions |
| [**listPortfolioProperties**](PortfoliosApi.md#listPortfolioProperties) | **GET** /api/portfolios/{scope}/{code}/properties/list | [EARLY ACCESS] ListPortfolioProperties: Get portfolio properties |
| [**listPortfolios**](PortfoliosApi.md#listPortfolios) | **GET** /api/portfolios | ListPortfolios: List portfolios |
| [**listPortfoliosForScope**](PortfoliosApi.md#listPortfoliosForScope) | **GET** /api/portfolios/{scope} | ListPortfoliosForScope: List portfolios for scope |
| [**patchPortfolio**](PortfoliosApi.md#patchPortfolio) | **PATCH** /api/portfolios/{scope}/{code} | PatchPortfolio: Patch portfolio. |
| [**patchPortfolioAccessMetadata**](PortfoliosApi.md#patchPortfolioAccessMetadata) | **PATCH** /api/portfolios/{scope}/{code}/metadata | [EARLY ACCESS] PatchPortfolioAccessMetadata: Patch Access Metadata rules for a Portfolio. |
| [**updatePortfolio**](PortfoliosApi.md#updatePortfolio) | **PUT** /api/portfolios/{scope}/{code} | UpdatePortfolio: Update portfolio |
| [**upsertInstrumentEventInstructions**](PortfoliosApi.md#upsertInstrumentEventInstructions) | **POST** /api/portfolios/{scope}/{code}/instrumenteventinstructions | [EARLY ACCESS] UpsertInstrumentEventInstructions: Upsert Instrument Event Instructions |
| [**upsertPortfolioAccessMetadata**](PortfoliosApi.md#upsertPortfolioAccessMetadata) | **PUT** /api/portfolios/{scope}/{code}/metadata/{metadataKey} | [EARLY ACCESS] UpsertPortfolioAccessMetadata: Upsert a Portfolio Access Metadata Rule associated with specific metadataKey. This creates or updates the data in LUSID. |
| [**upsertPortfolioProperties**](PortfoliosApi.md#upsertPortfolioProperties) | **POST** /api/portfolios/{scope}/{code}/properties | UpsertPortfolioProperties: Upsert portfolio properties |
| [**upsertPortfolioReturns**](PortfoliosApi.md#upsertPortfolioReturns) | **POST** /api/portfolios/{scope}/{code}/returns/{returnScope}/{returnCode} | UpsertPortfolioReturns: Upsert Returns |



## batchUpsertPortfolioAccessMetadata

> BatchUpsertPortfolioAccessMetadataResponse batchUpsertPortfolioAccessMetadata(requestBody, effectiveAt, effectiveUntil)

[EARLY ACCESS] BatchUpsertPortfolioAccessMetadata: Upsert multiple Portfolio Access Metadata Rules to multiple Portfolios

Update or insert multiple Access Metadata rules for multiple Portfolios. Items will be updated if they already exist  and inserted if they do not. No other items will be affected    The response will return the successfully updated or inserted Portfolio Access Metadata Rules or a failure message if unsuccessful     Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        Map<String, BatchUpsertPortfolioAccessMetadataRequest> requestBody = new HashMap(); // Map<String, BatchUpsertPortfolioAccessMetadataRequest> | The Access Metadata Rules to upsert and the Portfolio identifiers to upsert for
        String effectiveAt = "effectiveAt_example"; // String | The date these rules will be effective from
        String effectiveUntil = "effectiveUntil_example"; // String | The effective date until which the Access Metadata is valid. If not supplied, this will be valid indefinitely, or until the next 'effectiveAt' date of the Access Metadata
        try {
            // uncomment the below to set overrides at the request level
            // BatchUpsertPortfolioAccessMetadataResponse result = apiInstance.batchUpsertPortfolioAccessMetadata(requestBody, effectiveAt, effectiveUntil).execute(opts);

            BatchUpsertPortfolioAccessMetadataResponse result = apiInstance.batchUpsertPortfolioAccessMetadata(requestBody, effectiveAt, effectiveUntil).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#batchUpsertPortfolioAccessMetadata");
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
| **requestBody** | [**Map&lt;String, BatchUpsertPortfolioAccessMetadataRequest&gt;**](BatchUpsertPortfolioAccessMetadataRequest.md)| The Access Metadata Rules to upsert and the Portfolio identifiers to upsert for | |
| **effectiveAt** | **String**| The date these rules will be effective from | [optional] |
| **effectiveUntil** | **String**| The effective date until which the Access Metadata is valid. If not supplied, this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata | [optional] |

### Return type

[**BatchUpsertPortfolioAccessMetadataResponse**](BatchUpsertPortfolioAccessMetadataResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted items or any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteInstrumentEventInstruction

> DeletedEntityResponse deleteInstrumentEventInstruction(scope, code, instrumentEventInstructionId, portfolioEffectiveAt)

[EARLY ACCESS] DeleteInstrumentEventInstruction: Delete Instrument Event Instruction

Delete a particular instruction for a particular portfolio

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        String instrumentEventInstructionId = "instrumentEventInstructionId_example"; // String | The id of the instruction to be deleted.
        String portfolioEffectiveAt = "portfolioEffectiveAt_example"; // String | The effective date at which the portfolio will be resolved. Defaults to current time if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteInstrumentEventInstruction(scope, code, instrumentEventInstructionId, portfolioEffectiveAt).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteInstrumentEventInstruction(scope, code, instrumentEventInstructionId, portfolioEffectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#deleteInstrumentEventInstruction");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **instrumentEventInstructionId** | **String**| The id of the instruction to be deleted. | |
| **portfolioEffectiveAt** | **String**| The effective date at which the portfolio will be resolved. Defaults to current time if not specified. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the instruction was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteKeyFromPortfolioAccessMetadata

> DeletedEntityResponse deleteKeyFromPortfolioAccessMetadata(scope, code, metadataKey, effectiveAt, effectiveUntil)

DeleteKeyFromPortfolioAccessMetadata: Delete a Portfolio Access Metadata Rule

Delete the Portfolio Access Metadata Rule that exactly matches the provided identifier parts

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Quote Access Metadata Rule to retrieve.
        String code = "code_example"; // String | Portfolio code
        String metadataKey = "metadataKey_example"; // String | The metadataKey identifying the access metadata entry to delete
        String effectiveAt = "effectiveAt_example"; // String | The effective date to delete at, if this is not supplied, it will delete all data found
        OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' date of the Access Metadata
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteKeyFromPortfolioAccessMetadata(scope, code, metadataKey, effectiveAt, effectiveUntil).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteKeyFromPortfolioAccessMetadata(scope, code, metadataKey, effectiveAt, effectiveUntil).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#deleteKeyFromPortfolioAccessMetadata");
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
| **scope** | **String**| The scope of the Quote Access Metadata Rule to retrieve. | |
| **code** | **String**| Portfolio code | |
| **metadataKey** | **String**| The metadataKey identifying the access metadata entry to delete | |
| **effectiveAt** | **String**| The effective date to delete at, if this is not supplied, it will delete all data found | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The rule that has been deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deletePortfolio

> DeletedEntityResponse deletePortfolio(scope, code)

DeletePortfolio: Delete portfolio

Delete a particular portfolio.     The deletion will take effect from the portfolio&#39;s creation datetime. This means that the portfolio will no longer exist at any effective datetime, as per the asAt datetime of deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deletePortfolio(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deletePortfolio(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#deletePortfolio");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the portfolio was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deletePortfolioProperties

> DeletedEntityResponse deletePortfolioProperties(scope, code, propertyKeys, effectiveAt)

DeletePortfolioProperties: Delete portfolio properties

Delete one or more properties from a particular portfolio. If the properties are time-variant then an effective datetime from which  to delete properties must be specified. If the properties are perpetual then it is invalid to specify an effective datetime for deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        List<String> propertyKeys = Arrays.asList(); // List<String> | The property keys of the properties to delete. These must take the format   {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'. Each property must be from the 'Portfolio' domain.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to delete time-variant properties from.   The property must exist at the specified 'effectiveAt' datetime. If the 'effectiveAt' is not provided or is   before the time-variant property exists then a failure is returned. Do not specify this parameter if any of   the properties to delete are perpetual.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deletePortfolioProperties(scope, code, propertyKeys, effectiveAt).execute(opts);

            DeletedEntityResponse result = apiInstance.deletePortfolioProperties(scope, code, propertyKeys, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#deletePortfolioProperties");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| The property keys of the properties to delete. These must take the format   {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. Each property must be from the &#39;Portfolio&#39; domain. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to delete time-variant properties from.   The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is   before the time-variant property exists then a failure is returned. Do not specify this parameter if any of   the properties to delete are perpetual. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the properties were deleted from the specified portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deletePortfolioReturns

> DeletedEntityResponse deletePortfolioReturns(scope, code, returnScope, returnCode, fromEffectiveAt, toEffectiveAt, period)

[EARLY ACCESS] DeletePortfolioReturns: Delete Returns

Cancel one or more Returns which exist into the specified portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio.
        String code = "code_example"; // String | The code of the Portfolio.
        String returnScope = "returnScope_example"; // String | The scope of the Returns.
        String returnCode = "returnCode_example"; // String | The code of the Returns.
        String fromEffectiveAt = "fromEffectiveAt_example"; // String | The start date from which to delete the Returns.
        String toEffectiveAt = "toEffectiveAt_example"; // String | The end date from which to delete the Returns.
        String period = "period_example"; // String | The Period (Daily or Monthly) of the Returns to be deleted. Defaults to Daily.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deletePortfolioReturns(scope, code, returnScope, returnCode, fromEffectiveAt, toEffectiveAt, period).execute(opts);

            DeletedEntityResponse result = apiInstance.deletePortfolioReturns(scope, code, returnScope, returnCode, fromEffectiveAt, toEffectiveAt, period).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#deletePortfolioReturns");
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
| **scope** | **String**| The scope of the Portfolio. | |
| **code** | **String**| The code of the Portfolio. | |
| **returnScope** | **String**| The scope of the Returns. | |
| **returnCode** | **String**| The code of the Returns. | |
| **fromEffectiveAt** | **String**| The start date from which to delete the Returns. | |
| **toEffectiveAt** | **String**| The end date from which to delete the Returns. | |
| **period** | **String**| The Period (Daily or Monthly) of the Returns to be deleted. Defaults to Daily. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully deleted Returns data along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getAggregatedReturnsDispersionMetrics

> CompositeDispersionResponse getAggregatedReturnsDispersionMetrics(scope, code, aggregatedReturnsDispersionRequest, asAt)

[EARLY ACCESS] GetAggregatedReturnsDispersionMetrics: Get the Aggregated Returns Dispersion metric

Calculate the dispersion metric with the Aggregate Returns which are on the specified portfolio.   This works only for composites which have at least 6 constituents for a full year in.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio.
        String code = "code_example"; // String | The code of the Portfolio.
        AggregatedReturnsDispersionRequest aggregatedReturnsDispersionRequest = new AggregatedReturnsDispersionRequest(); // AggregatedReturnsDispersionRequest | The request used in the AggregatedReturnsDispersionMetric.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Returns. Defaults to the latest.
        try {
            // uncomment the below to set overrides at the request level
            // CompositeDispersionResponse result = apiInstance.getAggregatedReturnsDispersionMetrics(scope, code, aggregatedReturnsDispersionRequest, asAt).execute(opts);

            CompositeDispersionResponse result = apiInstance.getAggregatedReturnsDispersionMetrics(scope, code, aggregatedReturnsDispersionRequest, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#getAggregatedReturnsDispersionMetrics");
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
| **scope** | **String**| The scope of the Portfolio. | |
| **code** | **String**| The code of the Portfolio. | |
| **aggregatedReturnsDispersionRequest** | [**AggregatedReturnsDispersionRequest**](AggregatedReturnsDispersionRequest.md)| The request used in the AggregatedReturnsDispersionMetric. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Returns. Defaults to the latest. | [optional] |

### Return type

[**CompositeDispersionResponse**](CompositeDispersionResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The aggregated returns grouped by return stream. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getCompositeBreakdown

> CompositeBreakdownResponse getCompositeBreakdown(scope, code, compositeBreakdownRequest, fromEffectiveAt, toEffectiveAt, asAt)

[EARLY ACCESS] GetCompositeBreakdown: Get the Composite Breakdown on how the composite Returns are calculated

Calculate the Composite Returns and return this with the constituents which are included in this calculation

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio.
        String code = "code_example"; // String | The code of the Portfolio.
        CompositeBreakdownRequest compositeBreakdownRequest = new CompositeBreakdownRequest(); // CompositeBreakdownRequest | The request used in the GetCompositeBreakdown.
        String fromEffectiveAt = "fromEffectiveAt_example"; // String | The start date from which to calculate the Returns.
        String toEffectiveAt = "toEffectiveAt_example"; // String | The end date for which to calculate the Returns.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Returns. Defaults to the latest.
        try {
            // uncomment the below to set overrides at the request level
            // CompositeBreakdownResponse result = apiInstance.getCompositeBreakdown(scope, code, compositeBreakdownRequest, fromEffectiveAt, toEffectiveAt, asAt).execute(opts);

            CompositeBreakdownResponse result = apiInstance.getCompositeBreakdown(scope, code, compositeBreakdownRequest, fromEffectiveAt, toEffectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#getCompositeBreakdown");
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
| **scope** | **String**| The scope of the Portfolio. | |
| **code** | **String**| The code of the Portfolio. | |
| **compositeBreakdownRequest** | [**CompositeBreakdownRequest**](CompositeBreakdownRequest.md)| The request used in the GetCompositeBreakdown. | |
| **fromEffectiveAt** | **String**| The start date from which to calculate the Returns. | [optional] |
| **toEffectiveAt** | **String**| The end date for which to calculate the Returns. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Returns. Defaults to the latest. | [optional] |

### Return type

[**CompositeBreakdownResponse**](CompositeBreakdownResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The aggregated returns grouped by return stream. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getInstrumentEventInstruction

> InstrumentEventInstruction getInstrumentEventInstruction(scope, code, instrumentEventInstructionId, portfolioEffectiveAt, asAt)

[EARLY ACCESS] GetInstrumentEventInstruction: Get Instrument Event Instruction

Get a particular instruction for a particular portfolio

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        String instrumentEventInstructionId = "instrumentEventInstructionId_example"; // String | The id of the instruction to be retrieved.
        String portfolioEffectiveAt = "portfolioEffectiveAt_example"; // String | The effective date at which the portfolio will be resolved. Defaults to current time if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the instruction. Defaults to return the latest version of the instruction if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // InstrumentEventInstruction result = apiInstance.getInstrumentEventInstruction(scope, code, instrumentEventInstructionId, portfolioEffectiveAt, asAt).execute(opts);

            InstrumentEventInstruction result = apiInstance.getInstrumentEventInstruction(scope, code, instrumentEventInstructionId, portfolioEffectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#getInstrumentEventInstruction");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **instrumentEventInstructionId** | **String**| The id of the instruction to be retrieved. | |
| **portfolioEffectiveAt** | **String**| The effective date at which the portfolio will be resolved. Defaults to current time if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instruction. Defaults to return the latest version of the instruction if not specified. | [optional] |

### Return type

[**InstrumentEventInstruction**](InstrumentEventInstruction.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested instrument event instruction |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolio

> Portfolio getPortfolio(scope, code, effectiveAt, asAt, propertyKeys, relationshipDefinitionIds)

GetPortfolio: Get portfolio

Retrieve the definition of a particular portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the portfolio definition. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio definition. Defaults to returning the latest version of the portfolio definition if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Portfolio' domain to decorate onto the portfolio,   or from any domain that supports relationships to decorate onto related entities. These must take the format   {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'.
        List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto the portfolio in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
        try {
            // uncomment the below to set overrides at the request level
            // Portfolio result = apiInstance.getPortfolio(scope, code, effectiveAt, asAt, propertyKeys, relationshipDefinitionIds).execute(opts);

            Portfolio result = apiInstance.getPortfolio(scope, code, effectiveAt, asAt, propertyKeys, relationshipDefinitionIds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#getPortfolio");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the portfolio definition. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio definition. Defaults to returning the latest version of the portfolio definition if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Portfolio&#39; domain to decorate onto the portfolio,   or from any domain that supports relationships to decorate onto related entities. These must take the format   {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto the portfolio in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**Portfolio**](Portfolio.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested portfolio definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioAggregateReturns

> ResourceListOfAggregatedReturn getPortfolioAggregateReturns(scope, code, returnScope, returnCode, recipeIdScope, recipeIdCode, fromEffectiveAt, toEffectiveAt, compositeMethod, period, outputFrequency, metrics, asAt, alternativeIncDate)

[DEPRECATED] GetPortfolioAggregateReturns: Aggregate Returns (This is a deprecated endpoint).

Aggregate Returns which are on the specified portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio.
        String code = "code_example"; // String | The code of the Portfolio.
        String returnScope = "returnScope_example"; // String | The scope of the Returns.
        String returnCode = "returnCode_example"; // String | The code of the Returns.
        String recipeIdScope = "recipeIdScope_example"; // String | The Recipe Scope for getting the fx rates
        String recipeIdCode = "recipeIdCode_example"; // String | The Recipe Code for getting the fx rates
        String fromEffectiveAt = "fromEffectiveAt_example"; // String | The start date from which to calculate the Returns.
        String toEffectiveAt = "toEffectiveAt_example"; // String | The end date for which to calculate the Returns.
        String compositeMethod = "compositeMethod_example"; // String | The method used to calculate the Portfolio performance:   Equal/Asset.
        String period = "period_example"; // String | The type of the returns used to calculate the aggregation result: Daily/Monthly.
        String outputFrequency = "outputFrequency_example"; // String | The type of calculated output: Daily/Weekly/Monthly/Quarterly/Half-Yearly/Yearly.
        List<String> metrics = Arrays.asList(); // List<String> | Determines what type of returns should be calculated, see https://support.lusid.com/knowledgebase/article/KA-01675/en-us for a list of available metrics.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Returns. Defaults to the latest.
        String alternativeIncDate = "alternativeIncDate_example"; // String | The date from which to consider the Returns on the Portfolio, if this is different from the date when Returns begin. Can be a date string or Portfolio property.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfAggregatedReturn result = apiInstance.getPortfolioAggregateReturns(scope, code, returnScope, returnCode, recipeIdScope, recipeIdCode, fromEffectiveAt, toEffectiveAt, compositeMethod, period, outputFrequency, metrics, asAt, alternativeIncDate).execute(opts);

            ResourceListOfAggregatedReturn result = apiInstance.getPortfolioAggregateReturns(scope, code, returnScope, returnCode, recipeIdScope, recipeIdCode, fromEffectiveAt, toEffectiveAt, compositeMethod, period, outputFrequency, metrics, asAt, alternativeIncDate).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#getPortfolioAggregateReturns");
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
| **scope** | **String**| The scope of the Portfolio. | |
| **code** | **String**| The code of the Portfolio. | |
| **returnScope** | **String**| The scope of the Returns. | |
| **returnCode** | **String**| The code of the Returns. | |
| **recipeIdScope** | **String**| The Recipe Scope for getting the fx rates | [optional] |
| **recipeIdCode** | **String**| The Recipe Code for getting the fx rates | [optional] |
| **fromEffectiveAt** | **String**| The start date from which to calculate the Returns. | [optional] |
| **toEffectiveAt** | **String**| The end date for which to calculate the Returns. | [optional] |
| **compositeMethod** | **String**| The method used to calculate the Portfolio performance:   Equal/Asset. | [optional] |
| **period** | **String**| The type of the returns used to calculate the aggregation result: Daily/Monthly. | [optional] |
| **outputFrequency** | **String**| The type of calculated output: Daily/Weekly/Monthly/Quarterly/Half-Yearly/Yearly. | [optional] |
| **metrics** | [**List&lt;String&gt;**](String.md)| Determines what type of returns should be calculated, see https://support.lusid.com/knowledgebase/article/KA-01675/en-us for a list of available metrics. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Returns. Defaults to the latest. | [optional] |
| **alternativeIncDate** | **String**| The date from which to consider the Returns on the Portfolio, if this is different from the date when Returns begin. Can be a date string or Portfolio property. | [optional] |

### Return type

[**ResourceListOfAggregatedReturn**](ResourceListOfAggregatedReturn.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The aggregated returns. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioAggregatedReturns

> AggregatedReturnsResponse getPortfolioAggregatedReturns(scope, code, aggregatedReturnsRequest, fromEffectiveAt, toEffectiveAt, asAt)

GetPortfolioAggregatedReturns: Aggregated Returns

Aggregate Returns which are on the specified portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio.
        String code = "code_example"; // String | The code of the Portfolio.
        AggregatedReturnsRequest aggregatedReturnsRequest = new AggregatedReturnsRequest(); // AggregatedReturnsRequest | The request used in the AggregatedReturns.
        String fromEffectiveAt = "fromEffectiveAt_example"; // String | The start date from which to calculate the Returns.
        String toEffectiveAt = "toEffectiveAt_example"; // String | The end date for which to calculate the Returns.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Returns. Defaults to the latest.
        try {
            // uncomment the below to set overrides at the request level
            // AggregatedReturnsResponse result = apiInstance.getPortfolioAggregatedReturns(scope, code, aggregatedReturnsRequest, fromEffectiveAt, toEffectiveAt, asAt).execute(opts);

            AggregatedReturnsResponse result = apiInstance.getPortfolioAggregatedReturns(scope, code, aggregatedReturnsRequest, fromEffectiveAt, toEffectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#getPortfolioAggregatedReturns");
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
| **scope** | **String**| The scope of the Portfolio. | |
| **code** | **String**| The code of the Portfolio. | |
| **aggregatedReturnsRequest** | [**AggregatedReturnsRequest**](AggregatedReturnsRequest.md)| The request used in the AggregatedReturns. | |
| **fromEffectiveAt** | **String**| The start date from which to calculate the Returns. | [optional] |
| **toEffectiveAt** | **String**| The end date for which to calculate the Returns. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Returns. Defaults to the latest. | [optional] |

### Return type

[**AggregatedReturnsResponse**](AggregatedReturnsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The aggregated returns grouped by return stream. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioCommands

> ResourceListOfProcessedCommand getPortfolioCommands(scope, code, fromAsAt, toAsAt, filter, page, limit)

GetPortfolioCommands: Get portfolio commands

Get all the commands that modified a particular portfolio, including any input transactions.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        OffsetDateTime fromAsAt = OffsetDateTime.now(); // OffsetDateTime | The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified.
        OffsetDateTime toAsAt = OffsetDateTime.now(); // OffsetDateTime | The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the User ID, specify \"userId.id eq 'string'\".   For more information about filtering, see https://support.lusid.com/knowledgebase/article/KA-01914.
        String page = "page_example"; // String | The pagination token to use to continue listing commands; this value is returned from the previous call.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 500 if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfProcessedCommand result = apiInstance.getPortfolioCommands(scope, code, fromAsAt, toAsAt, filter, page, limit).execute(opts);

            ResourceListOfProcessedCommand result = apiInstance.getPortfolioCommands(scope, code, fromAsAt, toAsAt, filter, page, limit).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#getPortfolioCommands");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **fromAsAt** | **OffsetDateTime**| The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified. | [optional] |
| **toAsAt** | **OffsetDateTime**| The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the User ID, specify \&quot;userId.id eq &#39;string&#39;\&quot;.   For more information about filtering, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **page** | **String**| The pagination token to use to continue listing commands; this value is returned from the previous call. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 500 if not specified. | [optional] |

### Return type

[**ResourceListOfProcessedCommand**](ResourceListOfProcessedCommand.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The commands that modified the specified portfolio. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioMetadata

> Map&lt;String, List&lt;AccessMetadataValue&gt;&gt; getPortfolioMetadata(scope, code, effectiveAt, asAt)

GetPortfolioMetadata: Get access metadata rules for a portfolio

Pass the scope and portfolio code parameters to retrieve the AccessMetadata associated with a portfolio

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio Access Metadata Rule to retrieve.
        String code = "code_example"; // String | Portfolio code
        String effectiveAt = "effectiveAt_example"; // String | The effectiveAt datetime at which to retrieve the access metadata rule.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio access metadata.
        try {
            // uncomment the below to set overrides at the request level
            // Map<String, List<AccessMetadataValue>> result = apiInstance.getPortfolioMetadata(scope, code, effectiveAt, asAt).execute(opts);

            Map<String, List<AccessMetadataValue>> result = apiInstance.getPortfolioMetadata(scope, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#getPortfolioMetadata");
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
| **scope** | **String**| The scope of the Portfolio Access Metadata Rule to retrieve. | |
| **code** | **String**| Portfolio code | |
| **effectiveAt** | **String**| The effectiveAt datetime at which to retrieve the access metadata rule. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio access metadata. | [optional] |

### Return type

[**Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;**](List.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The filtered list of results |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioProperties

> PortfolioProperties getPortfolioProperties(scope, code, effectiveAt, asAt)

GetPortfolioProperties: Get portfolio properties

List all the properties of a particular portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the portfolio's properties. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the portfolio's properties. Defaults to returning the latest version of each property if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioProperties result = apiInstance.getPortfolioProperties(scope, code, effectiveAt, asAt).execute(opts);

            PortfolioProperties result = apiInstance.getPortfolioProperties(scope, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#getPortfolioProperties");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the portfolio&#39;s properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolio&#39;s properties. Defaults to returning the latest version of each property if not specified. | [optional] |

### Return type

[**PortfolioProperties**](PortfolioProperties.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The properties of the specified portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioPropertyTimeSeries

> ResourceListOfPropertyInterval getPortfolioPropertyTimeSeries(scope, code, propertyKey, portfolioEffectiveAt, asAt, filter, page, limit)

GetPortfolioPropertyTimeSeries: Get portfolio property time series

Show the complete time series (history) for a particular portfolio property.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        String propertyKey = "propertyKey_example"; // String | The property key of the property whose history to show.   This must be from the 'Portfolio' domain and in the format {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'.
        String portfolioEffectiveAt = "portfolioEffectiveAt_example"; // String | The effective datetime used to resolve the portfolio. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to show the history. Defaults to returning the current datetime if not supplied.
        String filter = "filter_example"; // String | Expression to filter the results. For more information about filtering,   see https://support.lusid.com/knowledgebase/article/KA-01914.
        String page = "page_example"; // String | The pagination token to use to continue listing properties; this value is returned from   the previous call. If a pagination token is provided, the filter, portfolioEffectiveAt, and asAt fields   must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfPropertyInterval result = apiInstance.getPortfolioPropertyTimeSeries(scope, code, propertyKey, portfolioEffectiveAt, asAt, filter, page, limit).execute(opts);

            ResourceListOfPropertyInterval result = apiInstance.getPortfolioPropertyTimeSeries(scope, code, propertyKey, portfolioEffectiveAt, asAt, filter, page, limit).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#getPortfolioPropertyTimeSeries");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **propertyKey** | **String**| The property key of the property whose history to show.   This must be from the &#39;Portfolio&#39; domain and in the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. | |
| **portfolioEffectiveAt** | **String**| The effective datetime used to resolve the portfolio. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to show the history. Defaults to returning the current datetime if not supplied. | [optional] |
| **filter** | **String**| Expression to filter the results. For more information about filtering,   see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **page** | **String**| The pagination token to use to continue listing properties; this value is returned from   the previous call. If a pagination token is provided, the filter, portfolioEffectiveAt, and asAt fields   must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. | [optional] |

### Return type

[**ResourceListOfPropertyInterval**](ResourceListOfPropertyInterval.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The time series of the property |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioRelations

> ResourceListOfRelation getPortfolioRelations(scope, code, effectiveAt, asAt, filter, identifierTypes)

[EXPERIMENTAL] GetPortfolioRelations: Get portfolio relations

Get relations for a particular portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve relations. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve relations. Defaults to returning the latest LUSID AsAt time if not specified.
        String filter = "filter_example"; // String | Expression to filter the relations. Provide a null or empty string for this field until further notice.
        List<String> identifierTypes = Arrays.asList(); // List<String> | Identifier types (as property keys) used for referencing Persons or Legal Entities.   These must be from the 'Person' or 'LegalEntity' domains and have the format {domain}/{scope}/{code}, for example   'Person/CompanyDetails/Role'. Only identifier types provided will be used to look up relevant entities in relations. If not applicable, provide an empty array.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfRelation result = apiInstance.getPortfolioRelations(scope, code, effectiveAt, asAt, filter, identifierTypes).execute(opts);

            ResourceListOfRelation result = apiInstance.getPortfolioRelations(scope, code, effectiveAt, asAt, filter, identifierTypes).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#getPortfolioRelations");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve relations. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve relations. Defaults to returning the latest LUSID AsAt time if not specified. | [optional] |
| **filter** | **String**| Expression to filter the relations. Provide a null or empty string for this field until further notice. | [optional] |
| **identifierTypes** | [**List&lt;String&gt;**](String.md)| Identifier types (as property keys) used for referencing Persons or Legal Entities.   These must be from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example   &#39;Person/CompanyDetails/Role&#39;. Only identifier types provided will be used to look up relevant entities in relations. If not applicable, provide an empty array. | [optional] |

### Return type

[**ResourceListOfRelation**](ResourceListOfRelation.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The relations for the specified portfolio. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioRelationships

> ResourceListOfRelationship getPortfolioRelationships(scope, code, effectiveAt, asAt, filter, identifierTypes)

GetPortfolioRelationships: Get portfolio relationships

Get relationships for a particular portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve relationships. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve relationships. Defaults to returning the latest LUSID AsAt time if not specified.
        String filter = "filter_example"; // String | Expression to filter the relationships. Provide a null or empty string for this field until further notice.
        List<String> identifierTypes = Arrays.asList(); // List<String> | Identifier types (as property keys) used for referencing Persons or Legal Entities.   These can be specified from the 'Person' or 'LegalEntity' domains and have the format {domain}/{scope}/{code}, for example   'Person/CompanyDetails/Role'. An Empty array may be used to return all related Entities.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfRelationship result = apiInstance.getPortfolioRelationships(scope, code, effectiveAt, asAt, filter, identifierTypes).execute(opts);

            ResourceListOfRelationship result = apiInstance.getPortfolioRelationships(scope, code, effectiveAt, asAt, filter, identifierTypes).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#getPortfolioRelationships");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve relationships. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve relationships. Defaults to returning the latest LUSID AsAt time if not specified. | [optional] |
| **filter** | **String**| Expression to filter the relationships. Provide a null or empty string for this field until further notice. | [optional] |
| **identifierTypes** | [**List&lt;String&gt;**](String.md)| Identifier types (as property keys) used for referencing Persons or Legal Entities.   These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example   &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. | [optional] |

### Return type

[**ResourceListOfRelationship**](ResourceListOfRelationship.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The relationships for the specified portfolio. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfolioReturns

> ResourceListOfPerformanceReturn getPortfolioReturns(scope, code, returnScope, returnCode, fromEffectiveAt, toEffectiveAt, period, asAt)

GetPortfolioReturns: Get Returns

Get Returns which are on the specified portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio.
        String code = "code_example"; // String | The code of the Portfolio.
        String returnScope = "returnScope_example"; // String | The scope of the Returns.
        String returnCode = "returnCode_example"; // String | The code of the Returns.
        String fromEffectiveAt = "fromEffectiveAt_example"; // String | The start date from which to get the Returns.
        String toEffectiveAt = "toEffectiveAt_example"; // String | The end date from which to get the Returns.
        String period = "period_example"; // String | Show the Returns on a Daily or Monthly period. Defaults to Daily.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Returns. Defaults to the latest.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfPerformanceReturn result = apiInstance.getPortfolioReturns(scope, code, returnScope, returnCode, fromEffectiveAt, toEffectiveAt, period, asAt).execute(opts);

            ResourceListOfPerformanceReturn result = apiInstance.getPortfolioReturns(scope, code, returnScope, returnCode, fromEffectiveAt, toEffectiveAt, period, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#getPortfolioReturns");
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
| **scope** | **String**| The scope of the Portfolio. | |
| **code** | **String**| The code of the Portfolio. | |
| **returnScope** | **String**| The scope of the Returns. | |
| **returnCode** | **String**| The code of the Returns. | |
| **fromEffectiveAt** | **String**| The start date from which to get the Returns. | [optional] |
| **toEffectiveAt** | **String**| The end date from which to get the Returns. | [optional] |
| **period** | **String**| Show the Returns on a Daily or Monthly period. Defaults to Daily. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Returns. Defaults to the latest. | [optional] |

### Return type

[**ResourceListOfPerformanceReturn**](ResourceListOfPerformanceReturn.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Returns on the given time period. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPortfoliosAccessMetadataByKey

> List&lt;AccessMetadataValue&gt; getPortfoliosAccessMetadataByKey(scope, code, metadataKey, effectiveAt, asAt)

[EARLY ACCESS] GetPortfoliosAccessMetadataByKey: Get an entry identified by a metadataKey in the access metadata object

Get a specific portfolio access metadata rule by specifying the corresponding identifier parts     No matching will be performed through this endpoint. To retrieve a rule, it is necessary to specify, exactly, the identifier of the rule

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio Access Metadata Rule to retrieve.
        String code = "code_example"; // String | The code of the portfolio
        String metadataKey = "metadataKey_example"; // String | Key of the metadata to retrieve
        String effectiveAt = "effectiveAt_example"; // String | The effective date of the rule
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the portfolio access metadata.
        try {
            // uncomment the below to set overrides at the request level
            // List<AccessMetadataValue> result = apiInstance.getPortfoliosAccessMetadataByKey(scope, code, metadataKey, effectiveAt, asAt).execute(opts);

            List<AccessMetadataValue> result = apiInstance.getPortfoliosAccessMetadataByKey(scope, code, metadataKey, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#getPortfoliosAccessMetadataByKey");
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
| **scope** | **String**| The scope of the Portfolio Access Metadata Rule to retrieve. | |
| **code** | **String**| The code of the portfolio | |
| **metadataKey** | **String**| Key of the metadata to retrieve | |
| **effectiveAt** | **String**| The effective date of the rule | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the portfolio access metadata. | [optional] |

### Return type

[**List&lt;AccessMetadataValue&gt;**](AccessMetadataValue.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Portfolio Access Metadata Rule or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listInstrumentEventInstructions

> PagedResourceListOfInstrumentEventInstruction listInstrumentEventInstructions(scope, code, portfolioEffectiveAt, asAt, page, limit, filter, sortBy)

[EARLY ACCESS] ListInstrumentEventInstructions: List Instrument Event Instructions

Lists all instructions for a particular portfolio

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        String portfolioEffectiveAt = "portfolioEffectiveAt_example"; // String | The effective date at which the portfolio will be resolved. Defaults to current time if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the instructions. Defaults to latest if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing instructions; this value is returned from the previous call.   If a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfInstrumentEventInstruction result = apiInstance.listInstrumentEventInstructions(scope, code, portfolioEffectiveAt, asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfInstrumentEventInstruction result = apiInstance.listInstrumentEventInstructions(scope, code, portfolioEffectiveAt, asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#listInstrumentEventInstructions");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **portfolioEffectiveAt** | **String**| The effective date at which the portfolio will be resolved. Defaults to current time if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instructions. Defaults to latest if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing instructions; this value is returned from the previous call.   If a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfInstrumentEventInstruction**](PagedResourceListOfInstrumentEventInstruction.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested instrument event instructions |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listPortfolioProperties

> ResourceListOfProperty listPortfolioProperties(scope, code, effectiveAt, asAt, page, limit)

[EARLY ACCESS] ListPortfolioProperties: Get portfolio properties

List all the properties of a particular portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the portfolio's properties. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the portfolio's properties. Defaults to returning the latest version of each property if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing commands; this value is returned from the previous call.
        Integer limit = 56; // Integer | When paginating, limit the results per page to this number.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfProperty result = apiInstance.listPortfolioProperties(scope, code, effectiveAt, asAt, page, limit).execute(opts);

            ResourceListOfProperty result = apiInstance.listPortfolioProperties(scope, code, effectiveAt, asAt, page, limit).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#listPortfolioProperties");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the portfolio&#39;s properties. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolio&#39;s properties. Defaults to returning the latest version of each property if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing commands; this value is returned from the previous call. | [optional] |
| **limit** | **Integer**| When paginating, limit the results per page to this number. | [optional] |

### Return type

[**ResourceListOfProperty**](ResourceListOfProperty.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The properties of the specified portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listPortfolios

> ResourceListOfPortfolio listPortfolios(effectiveAt, asAt, page, limit, filter, sortBy, query, propertyKeys, relationshipDefinitionIds)

ListPortfolios: List portfolios

List all the portfolios matching particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the portfolios. Defaults to the current LUSID   system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the portfolios. Defaults to returning the latest version   of each portfolio if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing portfolios; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to filter on the transaction type, specify \"type eq 'Transaction'\". For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        String query = "query_example"; // String | Expression specifying the criteria that the returned portfolios must meet. For example, to see which   portfolios have holdings in instruments with a LusidInstrumentId (LUID) of 'LUID_PPA8HI6M' or a Figi of 'BBG000BLNNH6',   specify \"instrument.identifiers in (('LusidInstrumentId', 'LUID_PPA8HI6M'), ('Figi', 'BBG000BLNNH6'))\".
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Portfolio' domain to decorate onto each portfolio,   or from any domain that supports relationships to decorate onto related entities. These must take the   format {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'.
        List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto the portfolios in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfPortfolio result = apiInstance.listPortfolios(effectiveAt, asAt, page, limit, filter, sortBy, query, propertyKeys, relationshipDefinitionIds).execute(opts);

            ResourceListOfPortfolio result = apiInstance.listPortfolios(effectiveAt, asAt, page, limit, filter, sortBy, query, propertyKeys, relationshipDefinitionIds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#listPortfolios");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the portfolios. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolios. Defaults to returning the latest version   of each portfolio if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing portfolios; this   value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt   and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to filter on the transaction type, specify \&quot;type eq &#39;Transaction&#39;\&quot;. For more information about filtering   results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **query** | **String**| Expression specifying the criteria that the returned portfolios must meet. For example, to see which   portfolios have holdings in instruments with a LusidInstrumentId (LUID) of &#39;LUID_PPA8HI6M&#39; or a Figi of &#39;BBG000BLNNH6&#39;,   specify \&quot;instrument.identifiers in ((&#39;LusidInstrumentId&#39;, &#39;LUID_PPA8HI6M&#39;), (&#39;Figi&#39;, &#39;BBG000BLNNH6&#39;))\&quot;. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Portfolio&#39; domain to decorate onto each portfolio,   or from any domain that supports relationships to decorate onto related entities. These must take the   format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto the portfolios in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**ResourceListOfPortfolio**](ResourceListOfPortfolio.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested portfolios |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listPortfoliosForScope

> ResourceListOfPortfolio listPortfoliosForScope(scope, effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds)

ListPortfoliosForScope: List portfolios for scope

List all the portfolios in a particular scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope whose portfolios to list.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the portfolios. Defaults to the current LUSID   system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the portfolios. Defaults to returning the latest version   of each portfolio if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing portfolios. This  value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt  and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results.   For example, to return only transactions with a transaction type of 'Buy', specify \"type eq 'Buy'\".   For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'Portfolio' domain to decorate onto each portfolio,   or from any domain that supports relationships to decorate onto related entities. These must take the   format {domain}/{scope}/{code}, for example 'Portfolio/Manager/Id'.
        List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto the portfolios in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfPortfolio result = apiInstance.listPortfoliosForScope(scope, effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds).execute(opts);

            ResourceListOfPortfolio result = apiInstance.listPortfoliosForScope(scope, effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#listPortfoliosForScope");
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
| **scope** | **String**| The scope whose portfolios to list. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the portfolios. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the portfolios. Defaults to returning the latest version   of each portfolio if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing portfolios. This  value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt  and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results.   For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.   For more information about filtering results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;Portfolio&#39; domain to decorate onto each portfolio,   or from any domain that supports relationships to decorate onto related entities. These must take the   format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto the portfolios in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**ResourceListOfPortfolio**](ResourceListOfPortfolio.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The portfolios in the specified scope |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## patchPortfolio

> Portfolio patchPortfolio(scope, code, operation)

PatchPortfolio: Patch portfolio.

Create or update certain fields for a particular portfolio.  The behaviour is defined by the JSON Patch specification.     Currently supported are: Created, InstrumentScopes.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the   scope this uniquely identifies the portfolio.
        List<Operation> operation = Arrays.asList(); // List<Operation> | The json patch document. For more check: https://datatracker.ietf.org/doc/html/rfc6902.
        try {
            // uncomment the below to set overrides at the request level
            // Portfolio result = apiInstance.patchPortfolio(scope, code, operation).execute(opts);

            Portfolio result = apiInstance.patchPortfolio(scope, code, operation).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#patchPortfolio");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the   scope this uniquely identifies the portfolio. | |
| **operation** | [**List&lt;Operation&gt;**](Operation.md)| The json patch document. For more check: https://datatracker.ietf.org/doc/html/rfc6902. | |

### Return type

[**Portfolio**](Portfolio.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly patched portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## patchPortfolioAccessMetadata

> Map&lt;String, List&lt;AccessMetadataValue&gt;&gt; patchPortfolioAccessMetadata(scope, code, accessMetadataOperation, effectiveAt, effectiveUntil)

[EARLY ACCESS] PatchPortfolioAccessMetadata: Patch Access Metadata rules for a Portfolio.

Patch Portfolio Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.     Currently only &#39;add&#39; is a supported operation on the patch document.    Currently only valid metadata keys are supported paths on the patch document.    The response will return any affected Portfolio Access Metadata rules or a failure message if unsuccessful.    It is important to always check to verify success (or failure).     Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio Access Metadata Rule.
        String code = "code_example"; // String | Portfolio code
        List<AccessMetadataOperation> accessMetadataOperation = Arrays.asList(); // List<AccessMetadataOperation> | The Json Patch document
        String effectiveAt = "effectiveAt_example"; // String | The date this rule will effective from
        OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' date of the Access Metadata
        try {
            // uncomment the below to set overrides at the request level
            // Map<String, List<AccessMetadataValue>> result = apiInstance.patchPortfolioAccessMetadata(scope, code, accessMetadataOperation, effectiveAt, effectiveUntil).execute(opts);

            Map<String, List<AccessMetadataValue>> result = apiInstance.patchPortfolioAccessMetadata(scope, code, accessMetadataOperation, effectiveAt, effectiveUntil).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#patchPortfolioAccessMetadata");
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
| **scope** | **String**| The scope of the Portfolio Access Metadata Rule. | |
| **code** | **String**| Portfolio code | |
| **accessMetadataOperation** | [**List&lt;AccessMetadataOperation&gt;**](AccessMetadataOperation.md)| The Json Patch document | |
| **effectiveAt** | **String**| The date this rule will effective from | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata | [optional] |

### Return type

[**Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;**](List.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully patched items. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updatePortfolio

> Portfolio updatePortfolio(scope, code, updatePortfolioRequest, effectiveAt)

UpdatePortfolio: Update portfolio

Update the definition of a particular portfolio.     Note that not all elements of a portfolio definition are  modifiable due to the potential implications for data already stored.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        UpdatePortfolioRequest updatePortfolioRequest = new UpdatePortfolioRequest(); // UpdatePortfolioRequest | The updated portfolio definition.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to update the definition. Defaults to the current   LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // Portfolio result = apiInstance.updatePortfolio(scope, code, updatePortfolioRequest, effectiveAt).execute(opts);

            Portfolio result = apiInstance.updatePortfolio(scope, code, updatePortfolioRequest, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#updatePortfolio");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **updatePortfolioRequest** | [**UpdatePortfolioRequest**](UpdatePortfolioRequest.md)| The updated portfolio definition. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to update the definition. Defaults to the current   LUSID system datetime if not specified. | [optional] |

### Return type

[**Portfolio**](Portfolio.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated definition of the portfolio |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertInstrumentEventInstructions

> InstrumentEventInstructionsResponse upsertInstrumentEventInstructions(scope, code, successMode, requestBody, portfolioEffectiveAt)

[EARLY ACCESS] UpsertInstrumentEventInstructions: Upsert Instrument Event Instructions

Batch upsert for instrument event instructions, for the portfolio or individual holdings

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        String successMode = "Partial"; // String | Whether the batch request should fail atomically or in a partial fashion - allowed values: Atomic, Partial (default)
        Map<String, InstrumentEventInstructionRequest> requestBody = new HashMap(); // Map<String, InstrumentEventInstructionRequest> | The instructions to be upserted to the portfolio.
        String portfolioEffectiveAt = "portfolioEffectiveAt_example"; // String | The effective date at which the portfolio will be resolved. Defaults to current time if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // InstrumentEventInstructionsResponse result = apiInstance.upsertInstrumentEventInstructions(scope, code, successMode, requestBody, portfolioEffectiveAt).execute(opts);

            InstrumentEventInstructionsResponse result = apiInstance.upsertInstrumentEventInstructions(scope, code, successMode, requestBody, portfolioEffectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#upsertInstrumentEventInstructions");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **successMode** | **String**| Whether the batch request should fail atomically or in a partial fashion - allowed values: Atomic, Partial (default) | [default to Partial] |
| **requestBody** | [**Map&lt;String, InstrumentEventInstructionRequest&gt;**](InstrumentEventInstructionRequest.md)| The instructions to be upserted to the portfolio. | |
| **portfolioEffectiveAt** | **String**| The effective date at which the portfolio will be resolved. Defaults to current time if not specified. | [optional] |

### Return type

[**InstrumentEventInstructionsResponse**](InstrumentEventInstructionsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly inserted or updated instrument event instructions |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertPortfolioAccessMetadata

> ResourceListOfAccessMetadataValueOf upsertPortfolioAccessMetadata(scope, code, metadataKey, upsertPortfolioAccessMetadataRequest, effectiveAt, effectiveUntil)

[EARLY ACCESS] UpsertPortfolioAccessMetadata: Upsert a Portfolio Access Metadata Rule associated with specific metadataKey. This creates or updates the data in LUSID.

Update or insert one Portfolio Access Metadata Rule in a single scope. An item will be updated if it already exists  and inserted if it does not.    The response will return the successfully updated or inserted Portfolio Access Metadata Rule or failure message if unsuccessful    It is important to always check to verify success (or failure).     Multiple rules for a metadataKey can exists with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope to use when updating or inserting the Portfolio Access Metadata Rule.
        String code = "code_example"; // String | Portfolio code
        String metadataKey = "metadataKey_example"; // String | Key of the access metadata to upsert
        UpsertPortfolioAccessMetadataRequest upsertPortfolioAccessMetadataRequest = new UpsertPortfolioAccessMetadataRequest(); // UpsertPortfolioAccessMetadataRequest | The Portfolio Access Metadata Rule to update or insert
        String effectiveAt = "effectiveAt_example"; // String | The date this rule will effective from
        OffsetDateTime effectiveUntil = OffsetDateTime.now(); // OffsetDateTime | The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next 'effectiveAt' date of the Access Metadata
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfAccessMetadataValueOf result = apiInstance.upsertPortfolioAccessMetadata(scope, code, metadataKey, upsertPortfolioAccessMetadataRequest, effectiveAt, effectiveUntil).execute(opts);

            ResourceListOfAccessMetadataValueOf result = apiInstance.upsertPortfolioAccessMetadata(scope, code, metadataKey, upsertPortfolioAccessMetadataRequest, effectiveAt, effectiveUntil).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#upsertPortfolioAccessMetadata");
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
| **scope** | **String**| The scope to use when updating or inserting the Portfolio Access Metadata Rule. | |
| **code** | **String**| Portfolio code | |
| **metadataKey** | **String**| Key of the access metadata to upsert | |
| **upsertPortfolioAccessMetadataRequest** | [**UpsertPortfolioAccessMetadataRequest**](UpsertPortfolioAccessMetadataRequest.md)| The Portfolio Access Metadata Rule to update or insert | |
| **effectiveAt** | **String**| The date this rule will effective from | [optional] |
| **effectiveUntil** | **OffsetDateTime**| The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata | [optional] |

### Return type

[**ResourceListOfAccessMetadataValueOf**](ResourceListOfAccessMetadataValueOf.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted item or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertPortfolioProperties

> PortfolioProperties upsertPortfolioProperties(scope, code, requestBody)

UpsertPortfolioProperties: Upsert portfolio properties

Create or update one or more properties for a particular portfolio. A property is updated if it  already exists and created if it does not. All properties must be from the &#39;Portfolio&#39; domain.     Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime from which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which it is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the portfolio.
        String code = "code_example"; // String | The code of the portfolio. Together with the scope this uniquely identifies the portfolio.
        Map<String, Property> requestBody = new HashMap(); // Map<String, Property> | The properties to be created or updated. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code}, for example   'Portfolio/Manager/Id'.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioProperties result = apiInstance.upsertPortfolioProperties(scope, code, requestBody).execute(opts);

            PortfolioProperties result = apiInstance.upsertPortfolioProperties(scope, code, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#upsertPortfolioProperties");
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
| **scope** | **String**| The scope of the portfolio. | |
| **code** | **String**| The code of the portfolio. Together with the scope this uniquely identifies the portfolio. | |
| **requestBody** | [**Map&lt;String, Property&gt;**](Property.md)| The properties to be created or updated. Each property in   the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code}, for example   &#39;Portfolio/Manager/Id&#39;. | |

### Return type

[**PortfolioProperties**](PortfolioProperties.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated or inserted properties |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertPortfolioReturns

> UpsertReturnsResponse upsertPortfolioReturns(scope, code, returnScope, returnCode, performanceReturn)

UpsertPortfolioReturns: Upsert Returns

Update or insert returns into the specified portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PortfoliosApiExample {

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
        // PortfoliosApi apiInstance = apiFactory.build(PortfoliosApi.class);

        PortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(PortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the Portfolio.
        String code = "code_example"; // String | The code of the Portfolio.
        String returnScope = "returnScope_example"; // String | The scope of the Returns.
        String returnCode = "returnCode_example"; // String | The code of the Returns.
        List<PerformanceReturn> performanceReturn = Arrays.asList(); // List<PerformanceReturn> | This contains the Returns which need to be upsert.
        try {
            // uncomment the below to set overrides at the request level
            // UpsertReturnsResponse result = apiInstance.upsertPortfolioReturns(scope, code, returnScope, returnCode, performanceReturn).execute(opts);

            UpsertReturnsResponse result = apiInstance.upsertPortfolioReturns(scope, code, returnScope, returnCode, performanceReturn).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PortfoliosApi#upsertPortfolioReturns");
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
| **scope** | **String**| The scope of the Portfolio. | |
| **code** | **String**| The code of the Portfolio. | |
| **returnScope** | **String**| The scope of the Returns. | |
| **returnCode** | **String**| The code of the Returns. | |
| **performanceReturn** | [**List&lt;PerformanceReturn&gt;**](PerformanceReturn.md)| This contains the Returns which need to be upsert. | |

### Return type

[**UpsertReturnsResponse**](UpsertReturnsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The version of the portfolio that contains the newly updated or inserted Returns. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

