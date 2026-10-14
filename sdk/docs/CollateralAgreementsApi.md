# CollateralAgreementsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCollateralAgreement**](CollateralAgreementsApi.md#createCollateralAgreement) | **POST** /api/collateralagreements/{scope} | [EXPERIMENTAL] CreateCollateralAgreement: Create a Collateral Agreement. |
| [**deleteCollateralAgreement**](CollateralAgreementsApi.md#deleteCollateralAgreement) | **DELETE** /api/collateralagreements/{scope}/{code} | [EXPERIMENTAL] DeleteCollateralAgreement: Delete a Collateral Agreement. |
| [**getCollateralAgreement**](CollateralAgreementsApi.md#getCollateralAgreement) | **GET** /api/collateralagreements/{scope}/{code} | [EXPERIMENTAL] GetCollateralAgreement: Get a Collateral Agreement. |
| [**getCollateralAgreementApplicability**](CollateralAgreementsApi.md#getCollateralAgreementApplicability) | **GET** /api/collateralagreements/{scope}/{code}/$applicability | [EXPERIMENTAL] GetCollateralAgreementApplicability: Preview the portfolios a Collateral Agreement covers. |
| [**listCollateralAgreements**](CollateralAgreementsApi.md#listCollateralAgreements) | **GET** /api/collateralagreements | [EXPERIMENTAL] ListCollateralAgreements: List Collateral Agreements. |
| [**upsertCollateralAgreement**](CollateralAgreementsApi.md#upsertCollateralAgreement) | **PUT** /api/collateralagreements/{scope}/{code} | [EXPERIMENTAL] UpsertCollateralAgreement: Upsert a Collateral Agreement. |



## createCollateralAgreement

> CollateralAgreement createCollateralAgreement(scope, collateralAgreementRequest)

[EXPERIMENTAL] CreateCollateralAgreement: Create a Collateral Agreement.

Create a new Collateral Agreement. The scope of the agreement is in the route and its code is in the request body.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralAgreementsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralAgreementsApiExample {

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
        // CollateralAgreementsApi apiInstance = apiFactory.build(CollateralAgreementsApi.class);

        CollateralAgreementsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralAgreementsApi.class);
        String scope = "scope_example"; // String | The scope of the Collateral Agreement.
        CollateralAgreementRequest collateralAgreementRequest = new CollateralAgreementRequest(); // CollateralAgreementRequest | The definition of the Collateral Agreement.
        try {
            // uncomment the below to set overrides at the request level
            // CollateralAgreement result = apiInstance.createCollateralAgreement(scope, collateralAgreementRequest).execute(opts);

            CollateralAgreement result = apiInstance.createCollateralAgreement(scope, collateralAgreementRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralAgreementsApi#createCollateralAgreement");
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
| **scope** | **String**| The scope of the Collateral Agreement. | |
| **collateralAgreementRequest** | [**CollateralAgreementRequest**](CollateralAgreementRequest.md)| The definition of the Collateral Agreement. | |

### Return type

[**CollateralAgreement**](CollateralAgreement.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Collateral Agreement. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteCollateralAgreement

> DeletedEntityResponse deleteCollateralAgreement(scope, code, effectiveAt)

[EXPERIMENTAL] DeleteCollateralAgreement: Delete a Collateral Agreement.

Delete a Collateral Agreement from the given effective datetime. It remains retrievable at earlier effective datetimes.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralAgreementsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralAgreementsApiExample {

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
        // CollateralAgreementsApi apiInstance = apiFactory.build(CollateralAgreementsApi.class);

        CollateralAgreementsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralAgreementsApi.class);
        String scope = "scope_example"; // String | The scope of the Collateral Agreement to be deleted.
        String code = "code_example"; // String | The code of the Collateral Agreement to be deleted. Together with the scope this uniquely identifies the Collateral Agreement.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the Collateral Agreement is deleted. Defaults to the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteCollateralAgreement(scope, code, effectiveAt).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteCollateralAgreement(scope, code, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralAgreementsApi#deleteCollateralAgreement");
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
| **scope** | **String**| The scope of the Collateral Agreement to be deleted. | |
| **code** | **String**| The code of the Collateral Agreement to be deleted. Together with the scope this uniquely identifies the Collateral Agreement. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the Collateral Agreement is deleted. Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the Collateral Agreement was deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getCollateralAgreement

> CollateralAgreement getCollateralAgreement(scope, code, effectiveAt, asAt, propertyKeys)

[EXPERIMENTAL] GetCollateralAgreement: Get a Collateral Agreement.

Retrieve the definition of a particular Collateral Agreement at an effective and asAt datetime.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralAgreementsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralAgreementsApiExample {

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
        // CollateralAgreementsApi apiInstance = apiFactory.build(CollateralAgreementsApi.class);

        CollateralAgreementsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralAgreementsApi.class);
        String scope = "scope_example"; // String | The scope of the Collateral Agreement.
        String code = "code_example"; // String | The code of the Collateral Agreement. Together with the scope this uniquely identifies the Collateral Agreement.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Collateral Agreement. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Collateral Agreement. Defaults to returning the latest version if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'CollateralAgreement' domain to decorate onto the Collateral Agreement.   These must take the format {domain}/{scope}/{code}, for example 'CollateralAgreement/Manager/Id'. If no properties are specified, then no properties will be returned.
        try {
            // uncomment the below to set overrides at the request level
            // CollateralAgreement result = apiInstance.getCollateralAgreement(scope, code, effectiveAt, asAt, propertyKeys).execute(opts);

            CollateralAgreement result = apiInstance.getCollateralAgreement(scope, code, effectiveAt, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralAgreementsApi#getCollateralAgreement");
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
| **scope** | **String**| The scope of the Collateral Agreement. | |
| **code** | **String**| The code of the Collateral Agreement. Together with the scope this uniquely identifies the Collateral Agreement. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Collateral Agreement. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Collateral Agreement. Defaults to returning the latest version if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;CollateralAgreement&#39; domain to decorate onto the Collateral Agreement.   These must take the format {domain}/{scope}/{code}, for example &#39;CollateralAgreement/Manager/Id&#39;. If no properties are specified, then no properties will be returned. | [optional] |

### Return type

[**CollateralAgreement**](CollateralAgreement.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Collateral Agreement. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getCollateralAgreementApplicability

> CollateralAgreementApplicability getCollateralAgreementApplicability(scope, code, effectiveAt, asAt, limit)

[EXPERIMENTAL] GetCollateralAgreementApplicability: Preview the portfolios a Collateral Agreement covers.

Evaluate the applicability filter of a Collateral Agreement against portfolios, using the same filter syntax as  listing portfolios, and return the portfolios it selects.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralAgreementsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralAgreementsApiExample {

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
        // CollateralAgreementsApi apiInstance = apiFactory.build(CollateralAgreementsApi.class);

        CollateralAgreementsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralAgreementsApi.class);
        String scope = "scope_example"; // String | The scope of the Collateral Agreement.
        String code = "code_example"; // String | The code of the Collateral Agreement. Together with the scope this uniquely identifies the Collateral Agreement.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to evaluate the agreement and portfolios. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to evaluate the agreement and portfolios. Defaults to returning the latest version if not specified.
        Integer limit = 56; // Integer | The maximum number of portfolios to return. Defaults to 100 if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // CollateralAgreementApplicability result = apiInstance.getCollateralAgreementApplicability(scope, code, effectiveAt, asAt, limit).execute(opts);

            CollateralAgreementApplicability result = apiInstance.getCollateralAgreementApplicability(scope, code, effectiveAt, asAt, limit).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralAgreementsApi#getCollateralAgreementApplicability");
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
| **scope** | **String**| The scope of the Collateral Agreement. | |
| **code** | **String**| The code of the Collateral Agreement. Together with the scope this uniquely identifies the Collateral Agreement. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to evaluate the agreement and portfolios. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to evaluate the agreement and portfolios. Defaults to returning the latest version if not specified. | [optional] |
| **limit** | **Integer**| The maximum number of portfolios to return. Defaults to 100 if not specified. | [optional] |

### Return type

[**CollateralAgreementApplicability**](CollateralAgreementApplicability.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The portfolios the Collateral Agreement covers. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listCollateralAgreements

> PagedResourceListOfCollateralAgreement listCollateralAgreements(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListCollateralAgreements: List Collateral Agreements.

List all the Collateral Agreements matching the given criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralAgreementsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralAgreementsApiExample {

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
        // CollateralAgreementsApi apiInstance = apiFactory.build(CollateralAgreementsApi.class);

        CollateralAgreementsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralAgreementsApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the Collateral Agreements. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list Collateral Agreements. Defaults to returning the latest version of each Collateral Agreement if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Collateral Agreements; this value is returned from the previous call. If a pagination token is provided, the filter and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. The filterable fields are Id.Scope, Id.Code, BaseCurrency, CounterpartyId.Code, CounterpartyId.IdTypeScope, CounterpartyId.IdTypeCode, ApplicabilityFilter, CutLabel, RecipeId.Scope, RecipeId.Code, MinimumTransferAmount, MatchTolerance, Rounding.Amount, Rounding.Deliveries, Rounding.Returns, SettlementLag.Cash, SettlementLag.Securities, Properties and Version. The margin items can be filtered with a single-condition any expression on either VariationMargin or InitialMargin over Code or Calculation.Method. For example, to filter on the counterparty code, specify \"CounterpartyId.Code eq 'Acme'\", and to find agreements with a variation margin item, specify \"VariationMargin any (Code eq 'VM1')\". For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the 'CollateralAgreement' domain to decorate onto each Collateral Agreement.   These must take the format {domain}/{scope}/{code}, for example 'CollateralAgreement/Manager/Id'.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfCollateralAgreement result = apiInstance.listCollateralAgreements(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            PagedResourceListOfCollateralAgreement result = apiInstance.listCollateralAgreements(effectiveAt, asAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralAgreementsApi#listCollateralAgreements");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the Collateral Agreements. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list Collateral Agreements. Defaults to returning the latest version of each Collateral Agreement if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Collateral Agreements; this value is returned from the previous call. If a pagination token is provided, the filter and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. The filterable fields are Id.Scope, Id.Code, BaseCurrency, CounterpartyId.Code, CounterpartyId.IdTypeScope, CounterpartyId.IdTypeCode, ApplicabilityFilter, CutLabel, RecipeId.Scope, RecipeId.Code, MinimumTransferAmount, MatchTolerance, Rounding.Amount, Rounding.Deliveries, Rounding.Returns, SettlementLag.Cash, SettlementLag.Securities, Properties and Version. The margin items can be filtered with a single-condition any expression on either VariationMargin or InitialMargin over Code or Calculation.Method. For example, to filter on the counterparty code, specify \&quot;CounterpartyId.Code eq &#39;Acme&#39;\&quot;, and to find agreements with a variation margin item, specify \&quot;VariationMargin any (Code eq &#39;VM1&#39;)\&quot;. For more information about filtering results, see https://support.lusid.com/docs/filtering-information-retrieved-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the &#39;CollateralAgreement&#39; domain to decorate onto each Collateral Agreement.   These must take the format {domain}/{scope}/{code}, for example &#39;CollateralAgreement/Manager/Id&#39;. | [optional] |

### Return type

[**PagedResourceListOfCollateralAgreement**](PagedResourceListOfCollateralAgreement.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Collateral Agreements. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertCollateralAgreement

> CollateralAgreement upsertCollateralAgreement(scope, code, upsertCollateralAgreementRequest)

[EXPERIMENTAL] UpsertCollateralAgreement: Upsert a Collateral Agreement.

Create or replace the full definition of a Collateral Agreement from an effective datetime. A change to the  definition becomes a new bitemporal version: the agreement as it was declared at earlier effective datetimes,  and as of earlier asAt datetimes, remains retrievable.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CollateralAgreementsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CollateralAgreementsApiExample {

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
        // CollateralAgreementsApi apiInstance = apiFactory.build(CollateralAgreementsApi.class);

        CollateralAgreementsApi apiInstance = ApiFactoryBuilder.build(fileName).build(CollateralAgreementsApi.class);
        String scope = "scope_example"; // String | The scope of the Collateral Agreement.
        String code = "code_example"; // String | The code of the Collateral Agreement. Together with the scope this uniquely identifies the Collateral Agreement.
        UpsertCollateralAgreementRequest upsertCollateralAgreementRequest = new UpsertCollateralAgreementRequest(); // UpsertCollateralAgreementRequest | The full definition of the Collateral Agreement from the effective datetime in the request, or the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // CollateralAgreement result = apiInstance.upsertCollateralAgreement(scope, code, upsertCollateralAgreementRequest).execute(opts);

            CollateralAgreement result = apiInstance.upsertCollateralAgreement(scope, code, upsertCollateralAgreementRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CollateralAgreementsApi#upsertCollateralAgreement");
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
| **scope** | **String**| The scope of the Collateral Agreement. | |
| **code** | **String**| The code of the Collateral Agreement. Together with the scope this uniquely identifies the Collateral Agreement. | |
| **upsertCollateralAgreementRequest** | [**UpsertCollateralAgreementRequest**](UpsertCollateralAgreementRequest.md)| The full definition of the Collateral Agreement from the effective datetime in the request, or the current LUSID system datetime if not specified. | |

### Return type

[**CollateralAgreement**](CollateralAgreement.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Collateral Agreement as it stands from the effective datetime. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

