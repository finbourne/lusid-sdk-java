# TransfersApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransfer**](TransfersApi.md#createTransfer) | **POST** /api/transfers | [EXPERIMENTAL] CreateTransfer: Create a transfer. |
| [**deleteTransfer**](TransfersApi.md#deleteTransfer) | **DELETE** /api/transfers/{scope}/{code} | [EXPERIMENTAL] DeleteTransfer: Delete a transfer. |
| [**getTransfer**](TransfersApi.md#getTransfer) | **POST** /api/transfers/$get | [EXPERIMENTAL] GetTransfer: Get a transfer |
| [**listTransfers**](TransfersApi.md#listTransfers) | **GET** /api/transfers | [EXPERIMENTAL] ListTransfers: List transfers |



## createTransfer

> CreateTransferResponse createTransfer(createTransferRequest)

[EXPERIMENTAL] CreateTransfer: Create a transfer.

Move a position between two portfolios, exchange one instrument for another within a portfolio, or do  both at once.  The outgoing and incoming transaction legs and the Transfer entity recording them are written as a single  atomic operation: if any part of the request is rejected, nothing is written.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransfersApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransfersApiExample {

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
        // TransfersApi apiInstance = apiFactory.build(TransfersApi.class);

        TransfersApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransfersApi.class);
        CreateTransferRequest createTransferRequest = new CreateTransferRequest(); // CreateTransferRequest | The transfer to create.
        try {
            // uncomment the below to set overrides at the request level
            // CreateTransferResponse result = apiInstance.createTransfer(createTransferRequest).execute(opts);

            CreateTransferResponse result = apiInstance.createTransfer(createTransferRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransfersApi#createTransfer");
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
| **createTransferRequest** | [**CreateTransferRequest**](CreateTransferRequest.md)| The transfer to create. | |

### Return type

[**CreateTransferResponse**](CreateTransferResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The transfer that was created. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteTransfer

> DeletedEntityResponse deleteTransfer(scope, code, portfolioScopeOut, portfolioCodeOut, portfolioScopeIn, portfolioCodeIn)

[EXPERIMENTAL] DeleteTransfer: Delete a transfer.

Delete the Transfer entity recording a transfer and cancel the transaction legs it still has, as a single  atomic operation: if any part of the request is rejected, nothing is changed. A leg that has already gone is  skipped, so a transfer with no legs left can still be deleted to clear the record.     A transfer is identified by its scope, its code and both of its portfolios, so all four are required. Where  no transfer matches all four, the request is reported as not found.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransfersApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransfersApiExample {

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
        // TransfersApi apiInstance = apiFactory.build(TransfersApi.class);

        TransfersApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransfersApi.class);
        String scope = "scope_example"; // String | The scope of the transfer.
        String code = "code_example"; // String | The code of the transfer. Together with the scope and both portfolios this uniquely   identifies the transfer.
        String portfolioScopeOut = "portfolioScopeOut_example"; // String | The scope of the portfolio the outgoing leg is booked in.
        String portfolioCodeOut = "portfolioCodeOut_example"; // String | The code of the portfolio the outgoing leg is booked in.
        String portfolioScopeIn = "portfolioScopeIn_example"; // String | The scope of the portfolio the incoming leg is booked in.
        String portfolioCodeIn = "portfolioCodeIn_example"; // String | The code of the portfolio the incoming leg is booked in. Equal to   portfolioCodeOut for a switch between instruments within one portfolio.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteTransfer(scope, code, portfolioScopeOut, portfolioCodeOut, portfolioScopeIn, portfolioCodeIn).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteTransfer(scope, code, portfolioScopeOut, portfolioCodeOut, portfolioScopeIn, portfolioCodeIn).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransfersApi#deleteTransfer");
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
| **scope** | **String**| The scope of the transfer. | |
| **code** | **String**| The code of the transfer. Together with the scope and both portfolios this uniquely   identifies the transfer. | |
| **portfolioScopeOut** | **String**| The scope of the portfolio the outgoing leg is booked in. | |
| **portfolioCodeOut** | **String**| The code of the portfolio the outgoing leg is booked in. | |
| **portfolioScopeIn** | **String**| The scope of the portfolio the incoming leg is booked in. | |
| **portfolioCodeIn** | **String**| The code of the portfolio the incoming leg is booked in. Equal to   portfolioCodeOut for a switch between instruments within one portfolio. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The asAt the deletion landed at. |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No transfer with the given scope, code and portfolios. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getTransfer

> Transfer getTransfer(getTransferRequest, asAt)

[EXPERIMENTAL] GetTransfer: Get a transfer

Retrieve a transfer and both of the transactions it booked.  A transfer is identified by its scope, its code and both of its portfolios, so all four are supplied in  the request body rather than in the path.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransfersApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransfersApiExample {

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
        // TransfersApi apiInstance = apiFactory.build(TransfersApi.class);

        TransfersApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransfersApi.class);
        GetTransferRequest getTransferRequest = new GetTransferRequest(); // GetTransferRequest | The transfer to retrieve.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transfer. Defaults to latest   version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // Transfer result = apiInstance.getTransfer(getTransferRequest, asAt).execute(opts);

            Transfer result = apiInstance.getTransfer(getTransferRequest, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransfersApi#getTransfer");
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
| **getTransferRequest** | [**GetTransferRequest**](GetTransferRequest.md)| The transfer to retrieve. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transfer. Defaults to latest   version if not specified. | [optional] |

### Return type

[**Transfer**](Transfer.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested transfer and both of its transactions. |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No transfer exists with the requested scope, code and portfolios. |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listTransfers

> ResourceListOfTransfer listTransfers(asAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListTransfers: List transfers

List transfers matching the specified criteria, decorated with the requested properties.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.TransfersApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TransfersApiExample {

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
        // TransfersApi apiInstance = apiFactory.build(TransfersApi.class);

        TransfersApi apiInstance = ApiFactoryBuilder.build(fileName).build(TransfersApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transfers. Defaults to latest   version if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing transfers from a previous call.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "filter_example"; // String | Expression to filter the result set. NOTE: Filtering on nested transaction out/in fields is not supported.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\".
        List<String> propertyKeys = Arrays.asList(); // List<String> | The collection of `PropertyKey`s to decorate onto each transfer.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfTransfer result = apiInstance.listTransfers(asAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            ResourceListOfTransfer result = apiInstance.listTransfers(asAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransfersApi#listTransfers");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transfers. Defaults to latest   version if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing transfers from a previous call. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. NOTE: Filtering on nested transaction out/in fields is not supported. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| The collection of &#x60;PropertyKey&#x60;s to decorate onto each transfer. | [optional] |

### Return type

[**ResourceListOfTransfer**](ResourceListOfTransfer.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A collection of transfers matching the specified criteria. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

