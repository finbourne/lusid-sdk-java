# DerivedTransactionPortfoliosApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDerivedPortfolio**](DerivedTransactionPortfoliosApi.md#createDerivedPortfolio) | **POST** /api/derivedtransactionportfolios/{scope} | CreateDerivedPortfolio: Create derived portfolio |
| [**deleteDerivedPortfolioDetails**](DerivedTransactionPortfoliosApi.md#deleteDerivedPortfolioDetails) | **DELETE** /api/derivedtransactionportfolios/{scope}/{code}/details | [EARLY ACCESS] DeleteDerivedPortfolioDetails: Delete derived portfolio details |



## createDerivedPortfolio

> Portfolio createDerivedPortfolio(scope, createDerivedTransactionPortfolioRequest)

CreateDerivedPortfolio: Create derived portfolio

Create a derived transaction portfolio from a parent transaction portfolio (which may itself be derived).

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DerivedTransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DerivedTransactionPortfoliosApiExample {

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
        // DerivedTransactionPortfoliosApi apiInstance = apiFactory.build(DerivedTransactionPortfoliosApi.class);

        DerivedTransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(DerivedTransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope in which to create the derived transaction portfolio.
        CreateDerivedTransactionPortfolioRequest createDerivedTransactionPortfolioRequest = new CreateDerivedTransactionPortfolioRequest(); // CreateDerivedTransactionPortfolioRequest | The definition of the derived transaction portfolio.
        try {
            // uncomment the below to set overrides at the request level
            // Portfolio result = apiInstance.createDerivedPortfolio(scope, createDerivedTransactionPortfolioRequest).execute(opts);

            Portfolio result = apiInstance.createDerivedPortfolio(scope, createDerivedTransactionPortfolioRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DerivedTransactionPortfoliosApi#createDerivedPortfolio");
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
| **scope** | **String**| The scope in which to create the derived transaction portfolio. | |
| **createDerivedTransactionPortfolioRequest** | [**CreateDerivedTransactionPortfolioRequest**](CreateDerivedTransactionPortfolioRequest.md)| The definition of the derived transaction portfolio. | [optional] |

### Return type

[**Portfolio**](Portfolio.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created derived portfolio, with populated id |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteDerivedPortfolioDetails

> DeletedEntityResponse deleteDerivedPortfolioDetails(scope, code, effectiveAt)

[EARLY ACCESS] DeleteDerivedPortfolioDetails: Delete derived portfolio details

Delete all the portfolio details for a derived transaction portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.DerivedTransactionPortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class DerivedTransactionPortfoliosApiExample {

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
        // DerivedTransactionPortfoliosApi apiInstance = apiFactory.build(DerivedTransactionPortfoliosApi.class);

        DerivedTransactionPortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(DerivedTransactionPortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the derived transaction portfolio.
        String code = "code_example"; // String | The code of the derived transaction portfolio. Together with the scope this uniquely identifies   the derived transaction portfolio.
        String effectiveAt = "effectiveAt_example"; // String | The effective date of the change.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteDerivedPortfolioDetails(scope, code, effectiveAt).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteDerivedPortfolioDetails(scope, code, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DerivedTransactionPortfoliosApi#deleteDerivedPortfolioDetails");
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
| **scope** | **String**| The scope of the derived transaction portfolio. | |
| **code** | **String**| The code of the derived transaction portfolio. Together with the scope this uniquely identifies   the derived transaction portfolio. | |
| **effectiveAt** | **String**| The effective date of the change. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

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

