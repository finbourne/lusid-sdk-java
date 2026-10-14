# AllocationEventsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bookAllocationEvent**](AllocationEventsApi.md#bookAllocationEvent) | **POST** /api/allocationevents/{scope}/{code}/book | [EXPERIMENTAL] BookAllocationEvent: Book an Allocation Event. |
| [**createAllocationEvent**](AllocationEventsApi.md#createAllocationEvent) | **POST** /api/allocationevents/{scope} | [EXPERIMENTAL] CreateAllocationEvent: Create an Allocation Event. |
| [**deleteAllocationEvent**](AllocationEventsApi.md#deleteAllocationEvent) | **DELETE** /api/allocationevents/{scope}/{code} | [EXPERIMENTAL] DeleteAllocationEvent: Delete an Allocation Event. |
| [**getAllocationEvent**](AllocationEventsApi.md#getAllocationEvent) | **GET** /api/allocationevents/{scope}/{code} | [EXPERIMENTAL] GetAllocationEvent: Get an Allocation Event. |
| [**getAllocationEventNotices**](AllocationEventsApi.md#getAllocationEventNotices) | **GET** /api/allocationevents/{scope}/{code}/notices | [EARLY ACCESS] GetAllocationEventNotices: [EARLY ACCESS] GetAllocationEventNotices: Get the notices an allocation event issues to its partners. |
| [**getAllocationEventReceivables**](AllocationEventsApi.md#getAllocationEventReceivables) | **GET** /api/allocationevents/{scope}/{code}/receivables | [EXPERIMENTAL] GetAllocationEventReceivables: Get the receivables of an Allocation Event. |
| [**listAllocationEvents**](AllocationEventsApi.md#listAllocationEvents) | **GET** /api/allocationevents | [EXPERIMENTAL] ListAllocationEvents: List Allocation Events. |
| [**listAllocationPaymentHolds**](AllocationEventsApi.md#listAllocationPaymentHolds) | **GET** /api/allocationevents/{scope}/{code}/allocations/{investorRecordId}/holds | [EARLY ACCESS] ListAllocationPaymentHolds: [EARLY ACCESS] ListAllocationPaymentHolds: List the holds placed on a partner&#39;s payment. |
| [**planAllocationEventBooking**](AllocationEventsApi.md#planAllocationEventBooking) | **POST** /api/allocationevents/{scope}/{code}/plan | [EXPERIMENTAL] PlanAllocationEventBooking: Plan the booking of an Allocation Event. |
| [**putAllocationPaymentHold**](AllocationEventsApi.md#putAllocationPaymentHold) | **PUT** /api/allocationevents/{scope}/{code}/allocations/{investorRecordId}/hold | [EARLY ACCESS] PutAllocationPaymentHold: [EARLY ACCESS] PutAllocationPaymentHold: Place, move or release a hold on a partner&#39;s payment. |
| [**reallocateAllocationEvent**](AllocationEventsApi.md#reallocateAllocationEvent) | **POST** /api/allocationevents/{scope}/{code}/reallocate | [EXPERIMENTAL] ReallocateAllocationEvent: Reallocate an Allocation Event. |
| [**receiveAllocationEvent**](AllocationEventsApi.md#receiveAllocationEvent) | **POST** /api/allocationevents/{scope}/{code}/receipts | [EXPERIMENTAL] ReceiveAllocationEvent: Record a receipt against an Allocation Event. |
| [**reverseAllocationEvent**](AllocationEventsApi.md#reverseAllocationEvent) | **POST** /api/allocationevents/{scope}/{code}/reverse | [EXPERIMENTAL] ReverseAllocationEvent: Reverse an Allocation Event. |
| [**unbookAllocationEvent**](AllocationEventsApi.md#unbookAllocationEvent) | **POST** /api/allocationevents/{scope}/{code}/unbook | [EXPERIMENTAL] UnbookAllocationEvent: Unbook an Allocation Event. |
| [**upsertAllocationEvent**](AllocationEventsApi.md#upsertAllocationEvent) | **PUT** /api/allocationevents/{scope}/{code} | [EXPERIMENTAL] UpsertAllocationEvent: Upsert an Allocation Event. |



## bookAllocationEvent

> AllocationEvent bookAllocationEvent(scope, code, allocationEventBookRequest, effectiveAt)

[EXPERIMENTAL] BookAllocationEvent: Book an Allocation Event.

Freeze a computed Allocation Event under a booking reference, from an effective datetime. Once booked the  event can no longer be replaced or reallocated. Booking again under the same reference returns the event  unchanged; booking under a different reference is refused.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Event.
        String code = "code_example"; // String | The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event.
        AllocationEventBookRequest allocationEventBookRequest = new AllocationEventBookRequest(); // AllocationEventBookRequest | The booking reference to freeze the event under.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the booking applies. Defaults to the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationEvent result = apiInstance.bookAllocationEvent(scope, code, allocationEventBookRequest, effectiveAt).execute(opts);

            AllocationEvent result = apiInstance.bookAllocationEvent(scope, code, allocationEventBookRequest, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#bookAllocationEvent");
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
| **scope** | **String**| The scope of the Allocation Event. | |
| **code** | **String**| The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event. | |
| **allocationEventBookRequest** | [**AllocationEventBookRequest**](AllocationEventBookRequest.md)| The booking reference to freeze the event under. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the booking applies. Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**AllocationEvent**](AllocationEvent.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The booked Allocation Event. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createAllocationEvent

> AllocationEvent createAllocationEvent(scope, allocationEventRequest)

[EXPERIMENTAL] CreateAllocationEvent: Create an Allocation Event.

Raise a new Allocation Event. The scope is provided in the route and the code in the request body. The event  names the Allocation Map it is shared by, the kind of event, the amount and the date. Its per-investor shares  are computed on creation from the map as it stood on the event date, so the response comes back Computed.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Event.
        AllocationEventRequest allocationEventRequest = new AllocationEventRequest(); // AllocationEventRequest | The definition of the Allocation Event.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationEvent result = apiInstance.createAllocationEvent(scope, allocationEventRequest).execute(opts);

            AllocationEvent result = apiInstance.createAllocationEvent(scope, allocationEventRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#createAllocationEvent");
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
| **scope** | **String**| The scope of the Allocation Event. | |
| **allocationEventRequest** | [**AllocationEventRequest**](AllocationEventRequest.md)| The definition of the Allocation Event. | |

### Return type

[**AllocationEvent**](AllocationEvent.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created Allocation Event. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteAllocationEvent

> DeletedEntityResponse deleteAllocationEvent(scope, code, effectiveAt)

[EXPERIMENTAL] DeleteAllocationEvent: Delete an Allocation Event.

Delete an Allocation Event from an effective datetime. The Allocation Event remains retrievable at earlier  effective datetimes.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Event.
        String code = "code_example"; // String | The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which to delete the Allocation Event. Defaults to the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteAllocationEvent(scope, code, effectiveAt).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteAllocationEvent(scope, code, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#deleteAllocationEvent");
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
| **scope** | **String**| The scope of the Allocation Event. | |
| **code** | **String**| The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which to delete the Allocation Event. Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The datetime that the Allocation Event was deleted. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getAllocationEvent

> AllocationEvent getAllocationEvent(scope, code, effectiveAt, asAt)

[EXPERIMENTAL] GetAllocationEvent: Get an Allocation Event.

Retrieve a particular Allocation Event at an effective and asAt datetime, including its computed  per-investor shares and, once booked, its booking reference.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Event.
        String code = "code_example"; // String | The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the Allocation Event. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Allocation Event. Defaults to returning the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationEvent result = apiInstance.getAllocationEvent(scope, code, effectiveAt, asAt).execute(opts);

            AllocationEvent result = apiInstance.getAllocationEvent(scope, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#getAllocationEvent");
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
| **scope** | **String**| The scope of the Allocation Event. | |
| **code** | **String**| The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the Allocation Event. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Allocation Event. Defaults to returning the latest version if not specified. | [optional] |

### Return type

[**AllocationEvent**](AllocationEvent.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Allocation Event. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getAllocationEventNotices

> ResourceListOfAllocationEventNotice getAllocationEventNotices(scope, code, investorRecordId, includeZero, asAt)

[EARLY ACCESS] GetAllocationEventNotices: [EARLY ACCESS] GetAllocationEventNotices: Get the notices an allocation event issues to its partners.

One notice per partner allocation, listing the ILPA transaction lines, the net amount due, the partner&#39;s  unfunded commitment reconciliation across the event and their cumulative position alongside the general  partner&#39;s. Notices carry a DRAFT watermark until the event is booked.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Event.
        String code = "code_example"; // String | The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event.
        String investorRecordId = "investorRecordId_example"; // String | Restrict the notices to this partner's investor record.
        Boolean includeZero = false; // Boolean | Whether to include notices whose every line is zero. Defaults to false.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to read the event. Defaults to returning the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfAllocationEventNotice result = apiInstance.getAllocationEventNotices(scope, code, investorRecordId, includeZero, asAt).execute(opts);

            ResourceListOfAllocationEventNotice result = apiInstance.getAllocationEventNotices(scope, code, investorRecordId, includeZero, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#getAllocationEventNotices");
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
| **scope** | **String**| The scope of the Allocation Event. | |
| **code** | **String**| The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event. | |
| **investorRecordId** | **String**| Restrict the notices to this partner&#39;s investor record. | [optional] |
| **includeZero** | **Boolean**| Whether to include notices whose every line is zero. Defaults to false. | [optional] [default to false] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to read the event. Defaults to returning the latest version if not specified. | [optional] |

### Return type

[**ResourceListOfAllocationEventNotice**](ResourceListOfAllocationEventNotice.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The notices the allocation event issues. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getAllocationEventReceivables

> AllocationReceivablesAgeing getAllocationEventReceivables(scope, code, effectiveAt, asAt)

[EXPERIMENTAL] GetAllocationEventReceivables: Get the receivables of an Allocation Event.

What each investor still owes on a booked capital call as of the effective datetime, with how many days past  due it is and the ageing bucket that puts it in.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Event.
        String code = "code_example"; // String | The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label as of which to age the receivables. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to read the Allocation Event. Defaults to returning the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationReceivablesAgeing result = apiInstance.getAllocationEventReceivables(scope, code, effectiveAt, asAt).execute(opts);

            AllocationReceivablesAgeing result = apiInstance.getAllocationEventReceivables(scope, code, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#getAllocationEventReceivables");
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
| **scope** | **String**| The scope of the Allocation Event. | |
| **code** | **String**| The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event. | |
| **effectiveAt** | **String**| The effective datetime or cut label as of which to age the receivables. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to read the Allocation Event. Defaults to returning the latest version if not specified. | [optional] |

### Return type

[**AllocationReceivablesAgeing**](AllocationReceivablesAgeing.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The aged receivables of the Allocation Event. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listAllocationEvents

> PagedResourceListOfAllocationEvent listAllocationEvents(effectiveAt, asAt, page, limit, filter, sortBy)

[EXPERIMENTAL] ListAllocationEvents: List Allocation Events.

List all the Allocation Events matching a particular criteria.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to list the Allocation Events. Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Allocation Events. Defaults to returning the latest version of each Allocation Event if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing Allocation Events; this value is returned from the previous call.   If a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the results to this number. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the results. For example, to filter on the Allocation Event status, specify \"status eq 'Booked'\".   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names or properties to sort by, each suffixed by \" ASC\" or \" DESC\".
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfAllocationEvent result = apiInstance.listAllocationEvents(effectiveAt, asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfAllocationEvent result = apiInstance.listAllocationEvents(effectiveAt, asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#listAllocationEvents");
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
| **effectiveAt** | **String**| The effective datetime or cut label at which to list the Allocation Events. Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Allocation Events. Defaults to returning the latest version of each Allocation Event if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing Allocation Events; this value is returned from the previous call.   If a pagination token is provided, the filter, effectiveAt and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the results to this number. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the results. For example, to filter on the Allocation Event status, specify \&quot;status eq &#39;Booked&#39;\&quot;.   For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfAllocationEvent**](PagedResourceListOfAllocationEvent.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested Allocation Events. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listAllocationPaymentHolds

> ResourceListOfAllocationPaymentHold listAllocationPaymentHolds(scope, code, investorRecordId)

[EARLY ACCESS] ListAllocationPaymentHolds: [EARLY ACCESS] ListAllocationPaymentHolds: List the holds placed on a partner&#39;s payment.

Every hold placed on the partner&#39;s payment against the event, newest first, including released ones.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Event.
        String code = "code_example"; // String | The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event.
        String investorRecordId = "investorRecordId_example"; // String | The investor record of the partner whose holds are listed.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfAllocationPaymentHold result = apiInstance.listAllocationPaymentHolds(scope, code, investorRecordId).execute(opts);

            ResourceListOfAllocationPaymentHold result = apiInstance.listAllocationPaymentHolds(scope, code, investorRecordId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#listAllocationPaymentHolds");
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
| **scope** | **String**| The scope of the Allocation Event. | |
| **code** | **String**| The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event. | |
| **investorRecordId** | **String**| The investor record of the partner whose holds are listed. | |

### Return type

[**ResourceListOfAllocationPaymentHold**](ResourceListOfAllocationPaymentHold.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The holds placed on the partner&#39;s payment. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## planAllocationEventBooking

> AllocationPostingPlan planAllocationEventBooking(scope, code, allocationEventBookRequest, effectiveAt)

[EXPERIMENTAL] PlanAllocationEventBooking: Plan the booking of an Allocation Event.

Show everything booking a computed Allocation Event under a booking reference would write, validated as the  booking itself would be, without writing any of it: the investors&#39; lines, the roll-ups above them through the  fund structure and the fund-side transactions. A booking that would be refused fails here with every problem  listed; warnings the map&#39;s policy lets through come back on the plan.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Event.
        String code = "code_example"; // String | The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event.
        AllocationEventBookRequest allocationEventBookRequest = new AllocationEventBookRequest(); // AllocationEventBookRequest | The booking reference the plan is drawn up under.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to plan the booking. Defaults to the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationPostingPlan result = apiInstance.planAllocationEventBooking(scope, code, allocationEventBookRequest, effectiveAt).execute(opts);

            AllocationPostingPlan result = apiInstance.planAllocationEventBooking(scope, code, allocationEventBookRequest, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#planAllocationEventBooking");
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
| **scope** | **String**| The scope of the Allocation Event. | |
| **code** | **String**| The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event. | |
| **allocationEventBookRequest** | [**AllocationEventBookRequest**](AllocationEventBookRequest.md)| The booking reference the plan is drawn up under. | |
| **effectiveAt** | **String**| The effective datetime or cut label at which to plan the booking. Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**AllocationPostingPlan**](AllocationPostingPlan.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The postings the booking would write. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## putAllocationPaymentHold

> AllocationPaymentHold putAllocationPaymentHold(scope, code, investorRecordId, allocationPaymentHoldRequest)

[EARLY ACCESS] PutAllocationPaymentHold: [EARLY ACCESS] PutAllocationPaymentHold: Place, move or release a hold on a partner&#39;s payment.

A Blocked or Escrow hold stops the partner&#39;s allocation being received against the event until it is  Released. A hold may only be released by a user other than the one who placed it.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Event.
        String code = "code_example"; // String | The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event.
        String investorRecordId = "investorRecordId_example"; // String | The investor record of the partner whose payment is held.
        AllocationPaymentHoldRequest allocationPaymentHoldRequest = new AllocationPaymentHoldRequest(); // AllocationPaymentHoldRequest | The hold to record: its status, and optionally a reason and an external reference.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationPaymentHold result = apiInstance.putAllocationPaymentHold(scope, code, investorRecordId, allocationPaymentHoldRequest).execute(opts);

            AllocationPaymentHold result = apiInstance.putAllocationPaymentHold(scope, code, investorRecordId, allocationPaymentHoldRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#putAllocationPaymentHold");
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
| **scope** | **String**| The scope of the Allocation Event. | |
| **code** | **String**| The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event. | |
| **investorRecordId** | **String**| The investor record of the partner whose payment is held. | |
| **allocationPaymentHoldRequest** | [**AllocationPaymentHoldRequest**](AllocationPaymentHoldRequest.md)| The hold to record: its status, and optionally a reason and an external reference. | |

### Return type

[**AllocationPaymentHold**](AllocationPaymentHold.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The hold as recorded. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## reallocateAllocationEvent

> AllocationEvent reallocateAllocationEvent(scope, code, allocationEventReallocateRequest, effectiveAt)

[EXPERIMENTAL] ReallocateAllocationEvent: Reallocate an Allocation Event.

Recompute the per-investor shares of an unbooked Allocation Event against its map, from an effective  datetime, recording the reason. Any basis values supplied replace those used before. A booked Allocation  Event cannot be reallocated.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Event.
        String code = "code_example"; // String | The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event.
        AllocationEventReallocateRequest allocationEventReallocateRequest = new AllocationEventReallocateRequest(); // AllocationEventReallocateRequest | The reason for the reallocation and any basis values to use.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the reallocation applies. Defaults to the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationEvent result = apiInstance.reallocateAllocationEvent(scope, code, allocationEventReallocateRequest, effectiveAt).execute(opts);

            AllocationEvent result = apiInstance.reallocateAllocationEvent(scope, code, allocationEventReallocateRequest, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#reallocateAllocationEvent");
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
| **scope** | **String**| The scope of the Allocation Event. | |
| **code** | **String**| The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event. | |
| **allocationEventReallocateRequest** | [**AllocationEventReallocateRequest**](AllocationEventReallocateRequest.md)| The reason for the reallocation and any basis values to use. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the reallocation applies. Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**AllocationEvent**](AllocationEvent.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The reallocated Allocation Event. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## receiveAllocationEvent

> AllocationEvent receiveAllocationEvent(scope, code, allocationEventReceiptRequest, effectiveAt)

[EXPERIMENTAL] ReceiveAllocationEvent: Record a receipt against an Allocation Event.

Record cash received from an investor against a booked capital call. The receipt is applied to what the  investor owes on the call; anything over is recorded as a refund payable, so the outstanding amount never  goes negative. A bank charge is borne by the partner or the fund as the map&#39;s policy says, and a receipt in  another currency is converted at the rate given.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Event.
        String code = "code_example"; // String | The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event.
        AllocationEventReceiptRequest allocationEventReceiptRequest = new AllocationEventReceiptRequest(); // AllocationEventReceiptRequest | The investor, amount and date of the receipt.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the receipt applies. Defaults to the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationEvent result = apiInstance.receiveAllocationEvent(scope, code, allocationEventReceiptRequest, effectiveAt).execute(opts);

            AllocationEvent result = apiInstance.receiveAllocationEvent(scope, code, allocationEventReceiptRequest, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#receiveAllocationEvent");
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
| **scope** | **String**| The scope of the Allocation Event. | |
| **code** | **String**| The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event. | |
| **allocationEventReceiptRequest** | [**AllocationEventReceiptRequest**](AllocationEventReceiptRequest.md)| The investor, amount and date of the receipt. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the receipt applies. Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**AllocationEvent**](AllocationEvent.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Allocation Event with the receipt recorded. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## reverseAllocationEvent

> AllocationEvent reverseAllocationEvent(scope, code, allocationEventReverseRequest, effectiveAt)

[EXPERIMENTAL] ReverseAllocationEvent: Reverse an Allocation Event.

Reverse a booked Allocation Event: every posting the booking wrote is mirrored under the reversal reference and  the event is left Reversed. A reversal falling in a closed period posts in the current period unless it is  marked backdated. A reversal cannot itself be reversed; raise a new event naming the reversed one in its  replaces field to put corrected shares in the books.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Event.
        String code = "code_example"; // String | The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event.
        AllocationEventReverseRequest allocationEventReverseRequest = new AllocationEventReverseRequest(); // AllocationEventReverseRequest | The reason for the reversal and, optionally, when it should take effect.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the reversal applies. Defaults to the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationEvent result = apiInstance.reverseAllocationEvent(scope, code, allocationEventReverseRequest, effectiveAt).execute(opts);

            AllocationEvent result = apiInstance.reverseAllocationEvent(scope, code, allocationEventReverseRequest, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#reverseAllocationEvent");
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
| **scope** | **String**| The scope of the Allocation Event. | |
| **code** | **String**| The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event. | |
| **allocationEventReverseRequest** | [**AllocationEventReverseRequest**](AllocationEventReverseRequest.md)| The reason for the reversal and, optionally, when it should take effect. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the reversal applies. Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**AllocationEvent**](AllocationEvent.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The reversed Allocation Event. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## unbookAllocationEvent

> AllocationEvent unbookAllocationEvent(scope, code, allocationEventUnbookRequest, effectiveAt)

[EXPERIMENTAL] UnbookAllocationEvent: Unbook an Allocation Event.

Take an Allocation Event whose booking stopped half way back to Computed, cancelling every posting the  booking wrote, and record why. Only an event in the Booking status can be unbooked: one that is Booked is  reversed instead.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Event.
        String code = "code_example"; // String | The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event.
        AllocationEventUnbookRequest allocationEventUnbookRequest = new AllocationEventUnbookRequest(); // AllocationEventUnbookRequest | The reason the booking is being taken back.
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label from which the unbooking applies. Defaults to the current LUSID system datetime if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationEvent result = apiInstance.unbookAllocationEvent(scope, code, allocationEventUnbookRequest, effectiveAt).execute(opts);

            AllocationEvent result = apiInstance.unbookAllocationEvent(scope, code, allocationEventUnbookRequest, effectiveAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#unbookAllocationEvent");
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
| **scope** | **String**| The scope of the Allocation Event. | |
| **code** | **String**| The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event. | |
| **allocationEventUnbookRequest** | [**AllocationEventUnbookRequest**](AllocationEventUnbookRequest.md)| The reason the booking is being taken back. | |
| **effectiveAt** | **String**| The effective datetime or cut label from which the unbooking applies. Defaults to the current LUSID system datetime if not specified. | [optional] |

### Return type

[**AllocationEvent**](AllocationEvent.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Allocation Event, back at Computed. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertAllocationEvent

> AllocationEvent upsertAllocationEvent(scope, code, allocationEventRequest)

[EXPERIMENTAL] UpsertAllocationEvent: Upsert an Allocation Event.

Update or insert an Allocation Event. If the Allocation Event does not exist it is created, otherwise it is  replaced and its shares recomputed. The code in the request body must match the code in the route. A booked  Allocation Event is frozen and cannot be replaced.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.AllocationEventsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AllocationEventsApiExample {

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
        // AllocationEventsApi apiInstance = apiFactory.build(AllocationEventsApi.class);

        AllocationEventsApi apiInstance = ApiFactoryBuilder.build(fileName).build(AllocationEventsApi.class);
        String scope = "scope_example"; // String | The scope of the Allocation Event.
        String code = "code_example"; // String | The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event.
        AllocationEventRequest allocationEventRequest = new AllocationEventRequest(); // AllocationEventRequest | The definition of the Allocation Event.
        try {
            // uncomment the below to set overrides at the request level
            // AllocationEvent result = apiInstance.upsertAllocationEvent(scope, code, allocationEventRequest).execute(opts);

            AllocationEvent result = apiInstance.upsertAllocationEvent(scope, code, allocationEventRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AllocationEventsApi#upsertAllocationEvent");
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
| **scope** | **String**| The scope of the Allocation Event. | |
| **code** | **String**| The code of the Allocation Event. Together with the scope this uniquely identifies the Allocation Event. | |
| **allocationEventRequest** | [**AllocationEventRequest**](AllocationEventRequest.md)| The definition of the Allocation Event. | |

### Return type

[**AllocationEvent**](AllocationEvent.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The upserted Allocation Event. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

