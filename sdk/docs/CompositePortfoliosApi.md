# CompositePortfoliosApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeCompositePortfolioMembership**](CompositePortfoliosApi.md#changeCompositePortfolioMembership) | **POST** /api/compositeportfolios/{scope}/{code}/constituents | [EXPERIMENTAL] ChangeCompositePortfolioMembership: Change composite portfolio membership |
| [**createCompositePortfolio**](CompositePortfoliosApi.md#createCompositePortfolio) | **POST** /api/compositeportfolios/{scope} | [EXPERIMENTAL] CreateCompositePortfolio: Create composite portfolio |



## changeCompositePortfolioMembership

> PortfolioWithWarnings changeCompositePortfolioMembership(scope, code, changeCompositePortfolioMembershipRequest)

[EXPERIMENTAL] ChangeCompositePortfolioMembership: Change composite portfolio membership

Add a constituent to a composite portfolio. The constituent contributes its whole history, so it joins no  later than its own creation date, which is taken when no FromDate is supplied.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CompositePortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CompositePortfoliosApiExample {

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
        // CompositePortfoliosApi apiInstance = apiFactory.build(CompositePortfoliosApi.class);

        CompositePortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(CompositePortfoliosApi.class);
        String scope = "scope_example"; // String | The scope of the composite portfolio.
        String code = "code_example"; // String | The code of the composite portfolio. Together with the scope this uniquely identifies   the composite portfolio.
        ChangeCompositePortfolioMembershipRequest changeCompositePortfolioMembershipRequest = new ChangeCompositePortfolioMembershipRequest(); // ChangeCompositePortfolioMembershipRequest | The membership change to apply.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioWithWarnings result = apiInstance.changeCompositePortfolioMembership(scope, code, changeCompositePortfolioMembershipRequest).execute(opts);

            PortfolioWithWarnings result = apiInstance.changeCompositePortfolioMembership(scope, code, changeCompositePortfolioMembershipRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CompositePortfoliosApi#changeCompositePortfolioMembership");
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
| **scope** | **String**| The scope of the composite portfolio. | |
| **code** | **String**| The code of the composite portfolio. Together with the scope this uniquely identifies   the composite portfolio. | |
| **changeCompositePortfolioMembershipRequest** | [**ChangeCompositePortfolioMembershipRequest**](ChangeCompositePortfolioMembershipRequest.md)| The membership change to apply. | [optional] |

### Return type

[**PortfolioWithWarnings**](PortfolioWithWarnings.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The composite portfolio with its membership changed, and any warnings about its configuration |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createCompositePortfolio

> PortfolioWithWarnings createCompositePortfolio(scope, createCompositePortfolioRequest)

[EXPERIMENTAL] CreateCompositePortfolio: Create composite portfolio

Create a composite portfolio from a set of constituent portfolios. Every constituent must be a transaction  portfolio or a derived transaction portfolio, and must share the base currency of the composite portfolio.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.CompositePortfoliosApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CompositePortfoliosApiExample {

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
        // CompositePortfoliosApi apiInstance = apiFactory.build(CompositePortfoliosApi.class);

        CompositePortfoliosApi apiInstance = ApiFactoryBuilder.build(fileName).build(CompositePortfoliosApi.class);
        String scope = "scope_example"; // String | The scope in which to create the composite portfolio.
        CreateCompositePortfolioRequest createCompositePortfolioRequest = new CreateCompositePortfolioRequest(); // CreateCompositePortfolioRequest | The definition of the composite portfolio.
        try {
            // uncomment the below to set overrides at the request level
            // PortfolioWithWarnings result = apiInstance.createCompositePortfolio(scope, createCompositePortfolioRequest).execute(opts);

            PortfolioWithWarnings result = apiInstance.createCompositePortfolio(scope, createCompositePortfolioRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CompositePortfoliosApi#createCompositePortfolio");
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
| **scope** | **String**| The scope in which to create the composite portfolio. | |
| **createCompositePortfolioRequest** | [**CreateCompositePortfolioRequest**](CreateCompositePortfolioRequest.md)| The definition of the composite portfolio. | [optional] |

### Return type

[**PortfolioWithWarnings**](PortfolioWithWarnings.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created composite portfolio, with populated id, and any warnings about its configuration |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

