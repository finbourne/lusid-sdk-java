# InvestorRecordsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteInvestorRecord**](InvestorRecordsApi.md#deleteInvestorRecord) | **DELETE** /api/investorrecords/{identifierType}/{identifierValue} | [EARLY ACCESS] DeleteInvestorRecord: Delete Investor Record |
| [**getInvestorRecord**](InvestorRecordsApi.md#getInvestorRecord) | **GET** /api/investorrecords/{identifierType}/{identifierValue} | [EARLY ACCESS] GetInvestorRecord: Get Investor Record |
| [**listAllInvestorRecords**](InvestorRecordsApi.md#listAllInvestorRecords) | **GET** /api/investorrecords | [EARLY ACCESS] ListAllInvestorRecords: List Investor Records |
| [**upsertInvestorRecords**](InvestorRecordsApi.md#upsertInvestorRecords) | **POST** /api/investorrecords/$batchUpsert | [EARLY ACCESS] UpsertInvestorRecords: Upsert investor records |



## deleteInvestorRecord

> DeletedEntityResponse deleteInvestorRecord(identifierType, identifierValue, scope, identifierScope)

[EARLY ACCESS] DeleteInvestorRecord: Delete Investor Record

Delete an investor record. Deletion will be valid from the investor record&#39;s creation datetime.  This means that the investor record will no longer exist at any effective datetime from the asAt datetime of deletion.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InvestorRecordsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InvestorRecordsApiExample {

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
        // InvestorRecordsApi apiInstance = apiFactory.build(InvestorRecordsApi.class);

        InvestorRecordsApi apiInstance = ApiFactoryBuilder.build(fileName).build(InvestorRecordsApi.class);
        String identifierType = "identifierType_example"; // String | Code of the investor record identifier type.
        String identifierValue = "identifierValue_example"; // String | Code of the investor record under specified identifier type's scope and code.
        String scope = "scope_example"; // String | The scope of the investor record entity.
        String identifierScope = "identifierScope_example"; // String | Scope of the investor record identifier type.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteInvestorRecord(identifierType, identifierValue, scope, identifierScope).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteInvestorRecord(identifierType, identifierValue, scope, identifierScope).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestorRecordsApi#deleteInvestorRecord");
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
| **identifierType** | **String**| Code of the investor record identifier type. | |
| **identifierValue** | **String**| Code of the investor record under specified identifier type&#39;s scope and code. | |
| **scope** | **String**| The scope of the investor record entity. | |
| **identifierScope** | **String**| Scope of the investor record identifier type. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response from deleting investor record. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getInvestorRecord

> InvestorRecord getInvestorRecord(identifierType, identifierValue, scope, identifierScope, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds)

[EARLY ACCESS] GetInvestorRecord: Get Investor Record

Retrieve the definition of a investor record.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InvestorRecordsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InvestorRecordsApiExample {

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
        // InvestorRecordsApi apiInstance = apiFactory.build(InvestorRecordsApi.class);

        InvestorRecordsApi apiInstance = ApiFactoryBuilder.build(fileName).build(InvestorRecordsApi.class);
        String identifierType = "identifierType_example"; // String | Code of the investor record identifier type.
        String identifierValue = "identifierValue_example"; // String | Code of the investor record under specified identifier type's scope and code.
        String scope = "scope_example"; // String | The scope of the investor record entity.
        String identifierScope = "identifierScope_example"; // String | Scope of the investor record identifier type.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys or identifier types (as property keys) from the \"InvestorRecord\" domain   to include for found investor record, or from any domain that supports relationships to decorate onto related entities.   These take the format {domain}/{scope}/{code} e.g. \"InvestorRecord/ContactDetails/Address\".
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the investor record. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the investor record. Defaults to return the latest version of the investor record if not specified.
        List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto the investor record in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
        try {
            // uncomment the below to set overrides at the request level
            // InvestorRecord result = apiInstance.getInvestorRecord(identifierType, identifierValue, scope, identifierScope, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds).execute(opts);

            InvestorRecord result = apiInstance.getInvestorRecord(identifierType, identifierValue, scope, identifierScope, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestorRecordsApi#getInvestorRecord");
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
| **identifierType** | **String**| Code of the investor record identifier type. | |
| **identifierValue** | **String**| Code of the investor record under specified identifier type&#39;s scope and code. | |
| **scope** | **String**| The scope of the investor record entity. | |
| **identifierScope** | **String**| Scope of the investor record identifier type. | |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys or identifier types (as property keys) from the \&quot;InvestorRecord\&quot; domain   to include for found investor record, or from any domain that supports relationships to decorate onto related entities.   These take the format {domain}/{scope}/{code} e.g. \&quot;InvestorRecord/ContactDetails/Address\&quot;. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the investor record. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the investor record. Defaults to return the latest version of the investor record if not specified. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto the investor record in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**InvestorRecord**](InvestorRecord.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested investor record |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listAllInvestorRecords

> ResourceListOfInvestorRecord listAllInvestorRecords(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds)

[EARLY ACCESS] ListAllInvestorRecords: List Investor Records

List all investor records which the user is entitled to see.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InvestorRecordsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InvestorRecordsApiExample {

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
        // InvestorRecordsApi apiInstance = apiFactory.build(InvestorRecordsApi.class);

        InvestorRecordsApi apiInstance = ApiFactoryBuilder.build(fileName).build(InvestorRecordsApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the investor records. Defaults to the current LUSID   system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the investor records. Defaults to return the latest version   of each investor records if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing investor records from a previous call to list investor records. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy  and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 5000 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.    Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys or identifier types (as property keys) from the \"InvestorRecord\" domain   to include for each investor record, or from any domain that supports relationships to decorate onto related entities.   These take the format {domain}/{scope}/{code} e.g. \"InvestorRecord/ContactDetails/Address\".
        List<String> relationshipDefinitionIds = Arrays.asList(); // List<String> | A list of relationship definitions that are used to decorate related entities   onto each portfolio in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfInvestorRecord result = apiInstance.listAllInvestorRecords(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds).execute(opts);

            ResourceListOfInvestorRecord result = apiInstance.listAllInvestorRecords(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys, relationshipDefinitionIds).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestorRecordsApi#listAllInvestorRecords");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the investor records. Defaults to the current LUSID   system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the investor records. Defaults to return the latest version   of each investor records if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing investor records from a previous call to list investor records. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy  and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 5000 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set.    Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys or identifier types (as property keys) from the \&quot;InvestorRecord\&quot; domain   to include for each investor record, or from any domain that supports relationships to decorate onto related entities.   These take the format {domain}/{scope}/{code} e.g. \&quot;InvestorRecord/ContactDetails/Address\&quot;. | [optional] |
| **relationshipDefinitionIds** | [**List&lt;String&gt;**](String.md)| A list of relationship definitions that are used to decorate related entities   onto each portfolio in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. | [optional] |

### Return type

[**ResourceListOfInvestorRecord**](ResourceListOfInvestorRecord.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All existing Investor Records |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertInvestorRecords

> UpsertInvestorRecordsResponse upsertInvestorRecords(successMode, requestBody)

[EARLY ACCESS] UpsertInvestorRecords: Upsert investor records

Creates or updates a collection of Investor Records

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.InvestorRecordsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class InvestorRecordsApiExample {

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
        // InvestorRecordsApi apiInstance = apiFactory.build(InvestorRecordsApi.class);

        InvestorRecordsApi apiInstance = ApiFactoryBuilder.build(fileName).build(InvestorRecordsApi.class);
        String successMode = "successMode_example"; // String | Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial
        Map<String, UpsertInvestorRecordRequest> requestBody = new HashMap(); // Map<String, UpsertInvestorRecordRequest> | A collection of requests to create or update Investor Records.
        try {
            // uncomment the below to set overrides at the request level
            // UpsertInvestorRecordsResponse result = apiInstance.upsertInvestorRecords(successMode, requestBody).execute(opts);

            UpsertInvestorRecordsResponse result = apiInstance.upsertInvestorRecords(successMode, requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling InvestorRecordsApi#upsertInvestorRecords");
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
| **successMode** | **String**| Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial | |
| **requestBody** | [**Map&lt;String, UpsertInvestorRecordRequest&gt;**](UpsertInvestorRecordRequest.md)| A collection of requests to create or update Investor Records. | |

### Return type

[**UpsertInvestorRecordsResponse**](UpsertInvestorRecordsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The successfully created or updated investor records along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

