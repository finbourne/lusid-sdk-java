# TaxClassificationsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTaxClassification**](TaxClassificationsApi.md#getTaxClassification) | **GET** /api/tax/classifications/{scope}/{luid} | [EARLY ACCESS] GetTaxClassification: Get a tax classification. |
| [**getTaxQualifyingInvestmentsHistory**](TaxClassificationsApi.md#getTaxQualifyingInvestmentsHistory) | **GET** /api/tax/classifications/{scope}/{luid}/qualifyinginvestments | [EARLY ACCESS] GetTaxQualifyingInvestmentsHistory: Get the qualifying investments history of an instrument. |
| [**listTaxClassificationExceptions**](TaxClassificationsApi.md#listTaxClassificationExceptions) | **GET** /api/tax/classifications/exceptions | [EARLY ACCESS] ListTaxClassificationExceptions: List tax classification exceptions. |
| [**listTaxClassifications**](TaxClassificationsApi.md#listTaxClassifications) | **GET** /api/tax/classifications | [EARLY ACCESS] ListTaxClassifications: List tax classifications. |
| [**removeTaxTreatmentOverride**](TaxClassificationsApi.md#removeTaxTreatmentOverride) | **DELETE** /api/tax/classifications/{scope}/{luid}/override | [EARLY ACCESS] RemoveTaxTreatmentOverride: Remove a tax treatment override. |
| [**upsertTaxTreatmentOverride**](TaxClassificationsApi.md#upsertTaxTreatmentOverride) | **POST** /api/tax/classifications/{scope}/{luid}/override | [EARLY ACCESS] UpsertTaxTreatmentOverride: Upsert a tax treatment override. |



## getTaxClassification

> TaxClassificationDetail getTaxClassification(scope, luid, effectiveAt, asAt)

[EARLY ACCESS] GetTaxClassification: Get a tax classification.

Gets one instrument&#39;s tax classification together with the ordered decision trace that produced it and the  bitemporal history of every input and override field behind it.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TaxClassificationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TaxClassificationsApiExample {

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
        // TaxClassificationsApi apiInstance = apiFactory.build(TaxClassificationsApi.class);

        TaxClassificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(TaxClassificationsApi.class);
        String scope = "scope_example"; // String | The scope of the instrument.
        String luid = "luid_example"; // String | The LUSID instrument identifier of the instrument.
        String effectiveAt = "effectiveAt_example"; // String | Optional. The effective datetime or cut label at which to classify. Defaults to the current time.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The as-at datetime at which to read the classification inputs. Defaults to the latest.
        try {
            // uncomment the below to set overrides at the request level
            // TaxClassificationDetail result = apiInstance.getTaxClassification(scope, luid, effectiveAt, asAt).execute(opts);

            TaxClassificationDetail result = apiInstance.getTaxClassification(scope, luid, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxClassificationsApi#getTaxClassification");
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
| **scope** | **String**| The scope of the instrument. | |
| **luid** | **String**| The LUSID instrument identifier of the instrument. | |
| **effectiveAt** | **String**| Optional. The effective datetime or cut label at which to classify. Defaults to the current time. | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The as-at datetime at which to read the classification inputs. Defaults to the latest. | [optional] |

### Return type

[**TaxClassificationDetail**](TaxClassificationDetail.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The tax classification of the instrument with its decision trace and field history. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTaxQualifyingInvestmentsHistory

> QualifyingInvestmentsHistory getTaxQualifyingInvestmentsHistory(scope, luid, fromDate, toDate, asAt)

[EARLY ACCESS] GetTaxQualifyingInvestmentsHistory: Get the qualifying investments history of an instrument.

Returns the daily qualifying investments (60 percent non-equity) test observations of a collective investment  scheme over the requested window, together with every crossing: a pair of consecutive observations on which  the test result flipped.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TaxClassificationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TaxClassificationsApiExample {

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
        // TaxClassificationsApi apiInstance = apiFactory.build(TaxClassificationsApi.class);

        TaxClassificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(TaxClassificationsApi.class);
        String scope = "scope_example"; // String | The scope of the instrument.
        String luid = "luid_example"; // String | The LUSID instrument identifier of the scheme.
        OffsetDateTime fromDate = OffsetDateTime.now(); // OffsetDateTime | Optional. The first date of the window, inclusive. Defaults to one year before the toDate. The window may span at most ten years.
        OffsetDateTime toDate = OffsetDateTime.now(); // OffsetDateTime | Optional. The last date of the window, inclusive. Defaults to the asAt date.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The as-at datetime at which to read the observations. Defaults to the latest.
        try {
            // uncomment the below to set overrides at the request level
            // QualifyingInvestmentsHistory result = apiInstance.getTaxQualifyingInvestmentsHistory(scope, luid, fromDate, toDate, asAt).execute(opts);

            QualifyingInvestmentsHistory result = apiInstance.getTaxQualifyingInvestmentsHistory(scope, luid, fromDate, toDate, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxClassificationsApi#getTaxQualifyingInvestmentsHistory");
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
| **scope** | **String**| The scope of the instrument. | |
| **luid** | **String**| The LUSID instrument identifier of the scheme. | |
| **fromDate** | **OffsetDateTime**| Optional. The first date of the window, inclusive. Defaults to one year before the toDate. The window may span at most ten years. | [optional] |
| **toDate** | **OffsetDateTime**| Optional. The last date of the window, inclusive. Defaults to the asAt date. | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The as-at datetime at which to read the observations. Defaults to the latest. | [optional] |

### Return type

[**QualifyingInvestmentsHistory**](QualifyingInvestmentsHistory.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The qualifying investments observations and crossings of the instrument. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listTaxClassificationExceptions

> ResourceListOfTaxClassificationExceptionRecord listTaxClassificationExceptions(scope, effectiveAt, asAt)

[EARLY ACCESS] ListTaxClassificationExceptions: List tax classification exceptions.

Lists every instrument in the scope that could not be classified at the given time, with the kind of  exception (missing inputs, conflicting set-up, conflicting override, qualifying investments crossing) and a  message naming the fields involved.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TaxClassificationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TaxClassificationsApiExample {

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
        // TaxClassificationsApi apiInstance = apiFactory.build(TaxClassificationsApi.class);

        TaxClassificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(TaxClassificationsApi.class);
        String scope = "scope_example"; // String | The scope of the instruments.
        String effectiveAt = "effectiveAt_example"; // String | Optional. The effective datetime or cut label at which to classify. Defaults to the current time.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The as-at datetime at which to read the classification inputs. Defaults to the latest.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfTaxClassificationExceptionRecord result = apiInstance.listTaxClassificationExceptions(scope, effectiveAt, asAt).execute(opts);

            ResourceListOfTaxClassificationExceptionRecord result = apiInstance.listTaxClassificationExceptions(scope, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxClassificationsApi#listTaxClassificationExceptions");
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
| **scope** | **String**| The scope of the instruments. | |
| **effectiveAt** | **String**| Optional. The effective datetime or cut label at which to classify. Defaults to the current time. | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The as-at datetime at which to read the classification inputs. Defaults to the latest. | [optional] |

### Return type

[**ResourceListOfTaxClassificationExceptionRecord**](ResourceListOfTaxClassificationExceptionRecord.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The instruments that could not be classified and the reason for each. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listTaxClassifications

> ResourceListOfTaxClassification listTaxClassifications(scope, treatment, status, effectiveAt, asAt)

[EARLY ACCESS] ListTaxClassifications: List tax classifications.

Lists the tax classification of every instrument in the scope at the given effective and as-at time. Each  entry carries the treatment leaf the instrument resolved to, the treatment it implies, whether it was  system-derived or overridden, and the rule that fired. Narrow the list with the treatment and status filters.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TaxClassificationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TaxClassificationsApiExample {

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
        // TaxClassificationsApi apiInstance = apiFactory.build(TaxClassificationsApi.class);

        TaxClassificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(TaxClassificationsApi.class);
        String scope = "scope_example"; // String | The scope of the instruments to classify.
        String treatment = "treatment_example"; // String | Optional. Only return instruments with this treatment. Available values: ChargeableGains, LoanRelationship, Excluded, Unclassified.
        String status = "status_example"; // String | Optional. Only return instruments with this classification status. Available values: Classified, Overridden, Rejected, Unclassified.
        String effectiveAt = "effectiveAt_example"; // String | Optional. The effective datetime or cut label at which to classify. Defaults to the current time.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The as-at datetime at which to read the classification inputs. Defaults to the latest.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfTaxClassification result = apiInstance.listTaxClassifications(scope, treatment, status, effectiveAt, asAt).execute(opts);

            ResourceListOfTaxClassification result = apiInstance.listTaxClassifications(scope, treatment, status, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxClassificationsApi#listTaxClassifications");
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
| **scope** | **String**| The scope of the instruments to classify. | |
| **treatment** | **String**| Optional. Only return instruments with this treatment. Available values: ChargeableGains, LoanRelationship, Excluded, Unclassified. | [optional] |
| **status** | **String**| Optional. Only return instruments with this classification status. Available values: Classified, Overridden, Rejected, Unclassified. | [optional] |
| **effectiveAt** | **String**| Optional. The effective datetime or cut label at which to classify. Defaults to the current time. | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The as-at datetime at which to read the classification inputs. Defaults to the latest. | [optional] |

### Return type

[**ResourceListOfTaxClassification**](ResourceListOfTaxClassification.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The tax classifications of the instruments in the scope. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## removeTaxTreatmentOverride

> DeletedEntityResponse removeTaxTreatmentOverride(scope, luid, effectiveAt)

[EARLY ACCESS] RemoveTaxTreatmentOverride: Remove a tax treatment override.

Removes the user override from the given effective date onward, returning the instrument to its  system-derived treatment leaf from that date.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TaxClassificationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TaxClassificationsApiExample {

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
        // TaxClassificationsApi apiInstance = apiFactory.build(TaxClassificationsApi.class);

        TaxClassificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(TaxClassificationsApi.class);
        String scope = "scope_example"; // String | The scope of the instrument.
        String luid = "luid_example"; // String | The LUSID instrument identifier of the instrument.
        OffsetDateTime effectiveAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The effective datetime from which the override no longer applies. Defaults to the current time.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.removeTaxTreatmentOverride(scope, luid, effectiveAt).execute(opts);

            DeletedEntityResponse result = apiInstance.removeTaxTreatmentOverride(scope, luid, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxClassificationsApi#removeTaxTreatmentOverride");
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
| **scope** | **String**| The scope of the instrument. | |
| **luid** | **String**| The LUSID instrument identifier of the instrument. | |
| **effectiveAt** | **OffsetDateTime**| Optional. The effective datetime from which the override no longer applies. Defaults to the current time. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime from which the override was removed. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertTaxTreatmentOverride

> TaxClassification upsertTaxTreatmentOverride(scope, luid, upsertTaxTreatmentOverrideRequest)

[EARLY ACCESS] UpsertTaxTreatmentOverride: Upsert a tax treatment override.

Replaces the system-derived treatment leaf of the instrument with the given one from the request&#39;s effective  date onward. The response is the classification as it now stands at that effective date.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TaxClassificationsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TaxClassificationsApiExample {

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
        // TaxClassificationsApi apiInstance = apiFactory.build(TaxClassificationsApi.class);

        TaxClassificationsApi apiInstance = ApiFactoryBuilder.build(fileName).build(TaxClassificationsApi.class);
        String scope = "scope_example"; // String | The scope of the instrument.
        String luid = "luid_example"; // String | The LUSID instrument identifier of the instrument.
        UpsertTaxTreatmentOverrideRequest upsertTaxTreatmentOverrideRequest = new UpsertTaxTreatmentOverrideRequest(); // UpsertTaxTreatmentOverrideRequest | The treatment leaf to apply and the effective date it applies from.
        try {
            // uncomment the below to set overrides at the request level
            // TaxClassification result = apiInstance.upsertTaxTreatmentOverride(scope, luid, upsertTaxTreatmentOverrideRequest).execute(opts);

            TaxClassification result = apiInstance.upsertTaxTreatmentOverride(scope, luid, upsertTaxTreatmentOverrideRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxClassificationsApi#upsertTaxTreatmentOverride");
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
| **scope** | **String**| The scope of the instrument. | |
| **luid** | **String**| The LUSID instrument identifier of the instrument. | |
| **upsertTaxTreatmentOverrideRequest** | [**UpsertTaxTreatmentOverrideRequest**](UpsertTaxTreatmentOverrideRequest.md)| The treatment leaf to apply and the effective date it applies from. | |

### Return type

[**TaxClassification**](TaxClassification.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The classification of the instrument after the override was applied. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

