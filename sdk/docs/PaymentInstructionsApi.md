# PaymentInstructionsApi

All URIs are relative to *https://fbn-prd.lusid.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePaymentInstruction**](PaymentInstructionsApi.md#deletePaymentInstruction) | **DELETE** /api/paymentinstructions/{scope}/{code} | [EXPERIMENTAL] DeletePaymentInstruction: Delete Payment Instruction |
| [**getPaymentInstruction**](PaymentInstructionsApi.md#getPaymentInstruction) | **GET** /api/paymentinstructions/{scope}/{code} | [EXPERIMENTAL] GetPaymentInstruction: Get Payment Instruction |
| [**upsertPaymentInstructions**](PaymentInstructionsApi.md#upsertPaymentInstructions) | **POST** /api/paymentinstructions | [EXPERIMENTAL] UpsertPaymentInstructions: Upsert Payment Instructions |



## deletePaymentInstruction

> DeletedEntityResponse deletePaymentInstruction(scope, code)

[EXPERIMENTAL] DeletePaymentInstruction: Delete Payment Instruction

Delete a Payment Instruction. Deletion will be valid from the payment instruction&#39;s creation datetime.  This means that the payment instruction will no longer exist at any effective datetime from the asAt datetime  of deletion. Any payment records the instruction owns are released and become available to another instruction.  A payment instruction that has been released, instructed, sent, cancelled or failed cannot be deleted.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PaymentInstructionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PaymentInstructionsApiExample {

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
        // PaymentInstructionsApi apiInstance = apiFactory.build(PaymentInstructionsApi.class);

        PaymentInstructionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PaymentInstructionsApi.class);
        String scope = "scope_example"; // String | The scope of the payment instruction.
        String code = "code_example"; // String | The code of the payment instruction.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deletePaymentInstruction(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deletePaymentInstruction(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentInstructionsApi#deletePaymentInstruction");
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
| **scope** | **String**| The scope of the payment instruction. | |
| **code** | **String**| The code of the payment instruction. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response from deleting the payment instruction |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPaymentInstruction

> PaymentInstruction getPaymentInstruction(scope, code, propertyKeys, effectiveAt, asAt)

[EXPERIMENTAL] GetPaymentInstruction: Get Payment Instruction

Retrieve a single Payment Instruction.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PaymentInstructionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PaymentInstructionsApiExample {

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
        // PaymentInstructionsApi apiInstance = apiFactory.build(PaymentInstructionsApi.class);

        PaymentInstructionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PaymentInstructionsApi.class);
        String scope = "scope_example"; // String | The scope of the payment instruction.
        String code = "code_example"; // String | The code of the payment instruction.
        List<String> propertyKeys = Arrays.asList(); // List<String> | A list of property keys from the \"PaymentInstruction\" domain to decorate onto the   payment instruction. These take the format {domain}/{scope}/{code} e.g. \"PaymentInstruction/myScope/myProperty\".
        String effectiveAt = "effectiveAt_example"; // String | The effective datetime or cut label at which to retrieve the payment instruction.   Defaults to the current LUSID system datetime if not specified.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the payment instruction. Defaults to return the latest   version of the payment instruction if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // PaymentInstruction result = apiInstance.getPaymentInstruction(scope, code, propertyKeys, effectiveAt, asAt).execute(opts);

            PaymentInstruction result = apiInstance.getPaymentInstruction(scope, code, propertyKeys, effectiveAt, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentInstructionsApi#getPaymentInstruction");
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
| **scope** | **String**| The scope of the payment instruction. | |
| **code** | **String**| The code of the payment instruction. | |
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| A list of property keys from the \&quot;PaymentInstruction\&quot; domain to decorate onto the   payment instruction. These take the format {domain}/{scope}/{code} e.g. \&quot;PaymentInstruction/myScope/myProperty\&quot;. | [optional] |
| **effectiveAt** | **String**| The effective datetime or cut label at which to retrieve the payment instruction.   Defaults to the current LUSID system datetime if not specified. | [optional] |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the payment instruction. Defaults to return the latest   version of the payment instruction if not specified. | [optional] |

### Return type

[**PaymentInstruction**](PaymentInstruction.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested payment instruction |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## upsertPaymentInstructions

> PaymentInstructionsResponse upsertPaymentInstructions(requestBody)

[EXPERIMENTAL] UpsertPaymentInstructions: Upsert Payment Instructions

Create or update a collection of Payment Instructions.

### Example

```java
import com.finbourne.lusid.model.*;
import com.finbourne.lusid.api.PaymentInstructionsApi;
import com.finbourne.lusid.extensions.ApiConfigurationException;
import com.finbourne.lusid.extensions.ApiFactoryBuilder;
import com.finbourne.lusid.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PaymentInstructionsApiExample {

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
        // PaymentInstructionsApi apiInstance = apiFactory.build(PaymentInstructionsApi.class);

        PaymentInstructionsApi apiInstance = ApiFactoryBuilder.build(fileName).build(PaymentInstructionsApi.class);
        Map<String, PaymentInstructionRequest> requestBody = new HashMap(); // Map<String, PaymentInstructionRequest> | A collection of requests to create or update Payment Instructions.
        try {
            // uncomment the below to set overrides at the request level
            // PaymentInstructionsResponse result = apiInstance.upsertPaymentInstructions(requestBody).execute(opts);

            PaymentInstructionsResponse result = apiInstance.upsertPaymentInstructions(requestBody).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentInstructionsApi#upsertPaymentInstructions");
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
| **requestBody** | [**Map&lt;String, PaymentInstructionRequest&gt;**](PaymentInstructionRequest.md)| A collection of requests to create or update Payment Instructions. | |

### Return type

[**PaymentInstructionsResponse**](PaymentInstructionsResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The successfully created or updated payment instructions along with any failures |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

