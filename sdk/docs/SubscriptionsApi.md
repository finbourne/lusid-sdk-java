# SubscriptionsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSubscription**](SubscriptionsApi.md#deleteSubscription) | **DELETE** /api/subscriptions/{scope}/{code} | [EARLY ACCESS] DeleteSubscription: Delete a Subscription, assuming that it is present. |
| [**getSubscription**](SubscriptionsApi.md#getSubscription) | **GET** /api/subscriptions/{scope}/{code} | [EARLY ACCESS] GetSubscription: Get Subscription |
| [**listSubscriptions**](SubscriptionsApi.md#listSubscriptions) | **GET** /api/subscriptions/{scope} | [EARLY ACCESS] ListSubscriptions: List the set of Subscription definitions |
| [**upsertSubscription**](SubscriptionsApi.md#upsertSubscription) | **POST** /api/subscriptions | [EARLY ACCESS] UpsertSubscription: Upsert a Subscription. This creates or updates the subscription definition in LUSID. |



## deleteSubscription

> AnnulSingleStructuredDataResponse deleteSubscription(scope, code)

[EARLY ACCESS] DeleteSubscription: Delete a Subscription, assuming that it is present.

Delete the specified Subscription definition from a single scope.     The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SubscriptionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SubscriptionsApiExample {

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
        // SubscriptionsApi apiInstance = apiFactory.build(SubscriptionsApi.class);

        SubscriptionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(SubscriptionsApi.class);
        String scope = "scope_example"; // String | The scope of the Subscription to delete.
        String code = "code_example"; // String | The Subscription to delete.
        try {
            // uncomment the below to set overrides at the request level
            // AnnulSingleStructuredDataResponse result = apiInstance.deleteSubscription(scope, code).execute(opts);

            AnnulSingleStructuredDataResponse result = apiInstance.deleteSubscription(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#deleteSubscription");
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
| **scope** | **String**| The scope of the Subscription to delete. | |
| **code** | **String**| The Subscription to delete. | |

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


## getSubscription

> GetSubscriptionResponse getSubscription(scope, code, asAt)

[EARLY ACCESS] GetSubscription: Get Subscription

Get a Subscription definition from a single scope.     The response will return either the subscription that has been stored, or a failure explaining why the request was unsuccessful.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SubscriptionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SubscriptionsApiExample {

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
        // SubscriptionsApi apiInstance = apiFactory.build(SubscriptionsApi.class);

        SubscriptionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(SubscriptionsApi.class);
        String scope = "scope_example"; // String | The scope of the Subscription to retrieve.
        String code = "code_example"; // String | The code of the Subscription to retrieve.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Subscription. Defaults to return the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // GetSubscriptionResponse result = apiInstance.getSubscription(scope, code, asAt).execute(opts);

            GetSubscriptionResponse result = apiInstance.getSubscription(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#getSubscription");
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
| **scope** | **String**| The scope of the Subscription to retrieve. | |
| **code** | **String**| The code of the Subscription to retrieve. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Subscription. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**GetSubscriptionResponse**](GetSubscriptionResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Subscription or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listSubscriptions

> PagedResourceListOfGetSubscriptionResponse listSubscriptions(scope, asAt, filter, limit, page)

[EARLY ACCESS] ListSubscriptions: List the set of Subscription definitions

List the set of subscription definitions at the specified date/time and scope.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SubscriptionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SubscriptionsApiExample {

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
        // SubscriptionsApi apiInstance = apiFactory.build(SubscriptionsApi.class);

        SubscriptionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(SubscriptionsApi.class);
        String scope = "scope_example"; // String | The scope to list subscriptions for.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the subscriptions. Defaults to latest if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.
        Integer limit = 56; // Integer | Maximum number of results to return. Defaults to 100.
        String page = "page_example"; // String | Pagination token from a previous result to fetch the next page.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfGetSubscriptionResponse result = apiInstance.listSubscriptions(scope, asAt, filter, limit, page).execute(opts);

            PagedResourceListOfGetSubscriptionResponse result = apiInstance.listSubscriptions(scope, asAt, filter, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#listSubscriptions");
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
| **scope** | **String**| The scope to list subscriptions for. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the subscriptions. Defaults to latest if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. | [optional] |
| **limit** | **Integer**| Maximum number of results to return. Defaults to 100. | [optional] |
| **page** | **String**| Pagination token from a previous result to fetch the next page. | [optional] |

### Return type

[**PagedResourceListOfGetSubscriptionResponse**](PagedResourceListOfGetSubscriptionResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested subscriptions |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertSubscription

> UpsertSingleStructuredDataResponse upsertSubscription(upsertSubscriptionRequest)

[EARLY ACCESS] UpsertSubscription: Upsert a Subscription. This creates or updates the subscription definition in LUSID.

Update or insert one Subscription definition. An item will be updated if it already exists  and inserted if it does not.     The referenced portfolio (and timeline, when supplied) must exist and be readable by the caller.     The response will return the successfully updated or inserted subscription or failure message if unsuccessful.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.SubscriptionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SubscriptionsApiExample {

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
        // SubscriptionsApi apiInstance = apiFactory.build(SubscriptionsApi.class);

        SubscriptionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(SubscriptionsApi.class);
        UpsertSubscriptionRequest upsertSubscriptionRequest = new UpsertSubscriptionRequest(); // UpsertSubscriptionRequest | The Subscription to update or insert
        try {
            // uncomment the below to set overrides at the request level
            // UpsertSingleStructuredDataResponse result = apiInstance.upsertSubscription(upsertSubscriptionRequest).execute(opts);

            UpsertSingleStructuredDataResponse result = apiInstance.upsertSubscription(upsertSubscriptionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#upsertSubscription");
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
| **upsertSubscriptionRequest** | [**UpsertSubscriptionRequest**](UpsertSubscriptionRequest.md)| The Subscription to update or insert | |

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

