# CounterpartiesApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCounterpartyAgreement**](CounterpartiesApi.md#deleteCounterpartyAgreement) | **DELETE** /api/counterparties/counterpartyagreements/{scope}/{code} | [EARLY ACCESS] DeleteCounterpartyAgreement: Delete the Counterparty Agreement of given scope and code |
| [**deleteCreditSupportAnnex**](CounterpartiesApi.md#deleteCreditSupportAnnex) | **DELETE** /api/counterparties/creditsupportannexes/{scope}/{code} | [EARLY ACCESS] DeleteCreditSupportAnnex: Delete the Credit Support Annex of given scope and code |
| [**getCounterpartyAgreement**](CounterpartiesApi.md#getCounterpartyAgreement) | **GET** /api/counterparties/counterpartyagreements/{scope}/{code} | [EARLY ACCESS] GetCounterpartyAgreement: Get Counterparty Agreement |
| [**getCreditSupportAnnex**](CounterpartiesApi.md#getCreditSupportAnnex) | **GET** /api/counterparties/creditsupportannexes/{scope}/{code} | [EARLY ACCESS] GetCreditSupportAnnex: Get Credit Support Annex |
| [**listCounterpartyAgreements**](CounterpartiesApi.md#listCounterpartyAgreements) | **GET** /api/counterparties/counterpartyagreements | [EARLY ACCESS] ListCounterpartyAgreements: List the set of Counterparty Agreements |
| [**listCreditSupportAnnexes**](CounterpartiesApi.md#listCreditSupportAnnexes) | **GET** /api/counterparties/creditsupportannexes | [EARLY ACCESS] ListCreditSupportAnnexes: List the set of Credit Support Annexes |
| [**upsertCounterpartyAgreement**](CounterpartiesApi.md#upsertCounterpartyAgreement) | **POST** /api/counterparties/counterpartyagreements | [EARLY ACCESS] UpsertCounterpartyAgreement: Upsert Counterparty Agreement |
| [**upsertCreditSupportAnnex**](CounterpartiesApi.md#upsertCreditSupportAnnex) | **POST** /api/counterparties/creditsupportannexes | [EARLY ACCESS] UpsertCreditSupportAnnex: Upsert Credit Support Annex |



## deleteCounterpartyAgreement

> AnnulSingleStructuredDataResponse deleteCounterpartyAgreement(scope, code)

[EARLY ACCESS] DeleteCounterpartyAgreement: Delete the Counterparty Agreement of given scope and code

Delete the specified Counterparty Agreement from a single scope.  The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.     It is important to always check for any unsuccessful response.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CounterpartiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CounterpartiesApiExample {

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
        // CounterpartiesApi apiInstance = apiFactory.build(CounterpartiesApi.class);

        CounterpartiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CounterpartiesApi.class);
        String scope = "scope_example"; // String | The scope of the Counterparty Agreement to delete.
        String code = "code_example"; // String | The Counterparty Agreement to delete.
        try {
            // uncomment the below to set overrides at the request level
            // AnnulSingleStructuredDataResponse result = apiInstance.deleteCounterpartyAgreement(scope, code).execute(opts);

            AnnulSingleStructuredDataResponse result = apiInstance.deleteCounterpartyAgreement(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CounterpartiesApi#deleteCounterpartyAgreement");
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
| **scope** | **String**| The scope of the Counterparty Agreement to delete. | |
| **code** | **String**| The Counterparty Agreement to delete. | |

### Return type

[**AnnulSingleStructuredDataResponse**](AnnulSingleStructuredDataResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AsAt of deletion or failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteCreditSupportAnnex

> AnnulSingleStructuredDataResponse deleteCreditSupportAnnex(scope, code)

[EARLY ACCESS] DeleteCreditSupportAnnex: Delete the Credit Support Annex of given scope and code

Delete the specified Credit Support Annex from a single scope.  The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.     It is important to always check for any unsuccessful response.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CounterpartiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CounterpartiesApiExample {

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
        // CounterpartiesApi apiInstance = apiFactory.build(CounterpartiesApi.class);

        CounterpartiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CounterpartiesApi.class);
        String scope = "scope_example"; // String | The scope of the Credit Support Annex to delete.
        String code = "code_example"; // String | The Credit Support Annex to delete.
        try {
            // uncomment the below to set overrides at the request level
            // AnnulSingleStructuredDataResponse result = apiInstance.deleteCreditSupportAnnex(scope, code).execute(opts);

            AnnulSingleStructuredDataResponse result = apiInstance.deleteCreditSupportAnnex(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CounterpartiesApi#deleteCreditSupportAnnex");
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
| **scope** | **String**| The scope of the Credit Support Annex to delete. | |
| **code** | **String**| The Credit Support Annex to delete. | |

### Return type

[**AnnulSingleStructuredDataResponse**](AnnulSingleStructuredDataResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AsAt of deletion or failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getCounterpartyAgreement

> GetCounterpartyAgreementResponse getCounterpartyAgreement(scope, code, asAt)

[EARLY ACCESS] GetCounterpartyAgreement: Get Counterparty Agreement

Get a Counterparty Agreement from a single scope.  The response will return either the Counterparty Agreement that has been stored, or a failure explaining why the request was unsuccessful.  It is important to always check for any unsuccessful requests (failures).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CounterpartiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CounterpartiesApiExample {

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
        // CounterpartiesApi apiInstance = apiFactory.build(CounterpartiesApi.class);

        CounterpartiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CounterpartiesApi.class);
        String scope = "scope_example"; // String | The scope of the Counterparty Agreement to retrieve.
        String code = "code_example"; // String | The name of the Counterparty Agreement to retrieve the data for.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Counterparty Agreement. Defaults to return the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // GetCounterpartyAgreementResponse result = apiInstance.getCounterpartyAgreement(scope, code, asAt).execute(opts);

            GetCounterpartyAgreementResponse result = apiInstance.getCounterpartyAgreement(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CounterpartiesApi#getCounterpartyAgreement");
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
| **scope** | **String**| The scope of the Counterparty Agreement to retrieve. | |
| **code** | **String**| The name of the Counterparty Agreement to retrieve the data for. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Counterparty Agreement. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**GetCounterpartyAgreementResponse**](GetCounterpartyAgreementResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Counterparty Agreement or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getCreditSupportAnnex

> GetCreditSupportAnnexResponse getCreditSupportAnnex(scope, code, asAt)

[EARLY ACCESS] GetCreditSupportAnnex: Get Credit Support Annex

Get a Credit Support Annex from a single scope.  The response will return either the Credit Support Annex that has been stored, or a failure explaining why the request was unsuccessful.  It is important to always check for any unsuccessful requests (failures).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CounterpartiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CounterpartiesApiExample {

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
        // CounterpartiesApi apiInstance = apiFactory.build(CounterpartiesApi.class);

        CounterpartiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CounterpartiesApi.class);
        String scope = "scope_example"; // String | The scope of the Credit Support Annex to retrieve.
        String code = "code_example"; // String | The name of the Credit Support Annex to retrieve the data for.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Credit Support Annex . Defaults to return the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // GetCreditSupportAnnexResponse result = apiInstance.getCreditSupportAnnex(scope, code, asAt).execute(opts);

            GetCreditSupportAnnexResponse result = apiInstance.getCreditSupportAnnex(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CounterpartiesApi#getCreditSupportAnnex");
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
| **scope** | **String**| The scope of the Credit Support Annex to retrieve. | |
| **code** | **String**| The name of the Credit Support Annex to retrieve the data for. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Credit Support Annex . Defaults to return the latest version if not specified. | [optional] |

### Return type

[**GetCreditSupportAnnexResponse**](GetCreditSupportAnnexResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved credit support annexes or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listCounterpartyAgreements

> ResourceListOfGetCounterpartyAgreementResponse listCounterpartyAgreements(asAt)

[EARLY ACCESS] ListCounterpartyAgreements: List the set of Counterparty Agreements

List the set of Counterparty Agreements at the specified AsAt date/time

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CounterpartiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CounterpartiesApiExample {

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
        // CounterpartiesApi apiInstance = apiFactory.build(CounterpartiesApi.class);

        CounterpartiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CounterpartiesApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Counterparty Agreements. Defaults to latest if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfGetCounterpartyAgreementResponse result = apiInstance.listCounterpartyAgreements(asAt).execute(opts);

            ResourceListOfGetCounterpartyAgreementResponse result = apiInstance.listCounterpartyAgreements(asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CounterpartiesApi#listCounterpartyAgreements");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Counterparty Agreements. Defaults to latest if not specified. | [optional] |

### Return type

[**ResourceListOfGetCounterpartyAgreementResponse**](ResourceListOfGetCounterpartyAgreementResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Counterparty Agreements |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listCreditSupportAnnexes

> ResourceListOfGetCreditSupportAnnexResponse listCreditSupportAnnexes(asAt)

[EARLY ACCESS] ListCreditSupportAnnexes: List the set of Credit Support Annexes

List the set of Credit Support Annexes at the specified AsAt date/time

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CounterpartiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CounterpartiesApiExample {

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
        // CounterpartiesApi apiInstance = apiFactory.build(CounterpartiesApi.class);

        CounterpartiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CounterpartiesApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Credit Support Annexes. Defaults to latest if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfGetCreditSupportAnnexResponse result = apiInstance.listCreditSupportAnnexes(asAt).execute(opts);

            ResourceListOfGetCreditSupportAnnexResponse result = apiInstance.listCreditSupportAnnexes(asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CounterpartiesApi#listCreditSupportAnnexes");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Credit Support Annexes. Defaults to latest if not specified. | [optional] |

### Return type

[**ResourceListOfGetCreditSupportAnnexResponse**](ResourceListOfGetCreditSupportAnnexResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Credit Support Annexes |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertCounterpartyAgreement

> UpsertSingleStructuredDataResponse upsertCounterpartyAgreement(upsertCounterpartyAgreementRequest)

[EARLY ACCESS] UpsertCounterpartyAgreement: Upsert Counterparty Agreement

Update or insert Counterparty Agreement in a single scope. An item will be updated if it already exists and inserted if it does not.     The response will return the successfully updated or inserted Counterparty Agreement or failure message if unsuccessful     It is important to always check to verify success (or failure).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CounterpartiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CounterpartiesApiExample {

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
        // CounterpartiesApi apiInstance = apiFactory.build(CounterpartiesApi.class);

        CounterpartiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CounterpartiesApi.class);
        UpsertCounterpartyAgreementRequest upsertCounterpartyAgreementRequest = new UpsertCounterpartyAgreementRequest(); // UpsertCounterpartyAgreementRequest | The Counterparty Agreement to update or insert
        try {
            // uncomment the below to set overrides at the request level
            // UpsertSingleStructuredDataResponse result = apiInstance.upsertCounterpartyAgreement(upsertCounterpartyAgreementRequest).execute(opts);

            UpsertSingleStructuredDataResponse result = apiInstance.upsertCounterpartyAgreement(upsertCounterpartyAgreementRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CounterpartiesApi#upsertCounterpartyAgreement");
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
| **upsertCounterpartyAgreementRequest** | [**UpsertCounterpartyAgreementRequest**](UpsertCounterpartyAgreementRequest.md)| The Counterparty Agreement to update or insert | |

### Return type

[**UpsertSingleStructuredDataResponse**](UpsertSingleStructuredDataResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted Counterparty Agreement or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertCreditSupportAnnex

> UpsertSingleStructuredDataResponse upsertCreditSupportAnnex(upsertCreditSupportAnnexRequest)

[EARLY ACCESS] UpsertCreditSupportAnnex: Upsert Credit Support Annex

Update or insert Credit Support Annex in a single scope. An item will be updated if it already exists and inserted if it does not.     The response will return the successfully updated or inserted Credit Support Annex or failure message if unsuccessful     It is important to always check to verify success (or failure).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CounterpartiesApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CounterpartiesApiExample {

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
        // CounterpartiesApi apiInstance = apiFactory.build(CounterpartiesApi.class);

        CounterpartiesApi apiInstance = ApiFactoryBuilder.build(fileName).build(CounterpartiesApi.class);
        UpsertCreditSupportAnnexRequest upsertCreditSupportAnnexRequest = new UpsertCreditSupportAnnexRequest(); // UpsertCreditSupportAnnexRequest | The Credit Support Annex to update or insert
        try {
            // uncomment the below to set overrides at the request level
            // UpsertSingleStructuredDataResponse result = apiInstance.upsertCreditSupportAnnex(upsertCreditSupportAnnexRequest).execute(opts);

            UpsertSingleStructuredDataResponse result = apiInstance.upsertCreditSupportAnnex(upsertCreditSupportAnnexRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CounterpartiesApi#upsertCreditSupportAnnex");
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
| **upsertCreditSupportAnnexRequest** | [**UpsertCreditSupportAnnexRequest**](UpsertCreditSupportAnnexRequest.md)| The Credit Support Annex to update or insert | |

### Return type

[**UpsertSingleStructuredDataResponse**](UpsertSingleStructuredDataResponse.md)

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

