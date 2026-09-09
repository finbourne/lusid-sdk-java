# com.finbourne.lusid.model.GetPaymentInstructionsResponse
The response from getting Payment Instructions by payment record id. Each requested payment record id  appears in exactly one of Values or Failed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, PaymentInstruction&gt;**](PaymentInstruction.md) | The Payment Instructions that were found, keyed by the payment record id used to retrieve them. Only Payment Instructions that were found will be contained in this collection. | [optional] [default to Map<String, PaymentInstruction>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The payment record ids that did not resolve to a Payment Instruction, along with the nature of the failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GetPaymentInstructionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, PaymentInstruction> Values = new Map<String, PaymentInstruction>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GetPaymentInstructionsResponse getPaymentInstructionsResponseInstance = new GetPaymentInstructionsResponse()
    .Values(Values)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
