# com.finbourne.lusid.model.PaymentInstructionRequest
A request to create or update a Payment Instruction. Status is not accepted here —  status transitions are managed exclusively via the dedicated Payment Instruction status API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**paymentRecordIds** | [**List&lt;PaymentRecordReference&gt;**](PaymentRecordReference.md) | One or more Payment Records batched into this instruction block. All referenced Payment Records must share the same currency as the top-level currency field. | [default to List<PaymentRecordReference>]
**currency** | **String** | ISO 4217 currency code. All referenced Payment Records must share this currency value. | [default to String]
**totalPaymentAmount** | **java.math.BigDecimal** | Total payment amount across all referenced Payment Records. | [default to java.math.BigDecimal]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The value date on which settlement is due. ISO 8601 date. | [default to OffsetDateTime]
**payorPaymentDetailsReference** | [**PaymentDetailsReference**](PaymentDetailsReference.md) |  | [default to PaymentDetailsReference]
**payeePaymentDetailsReference** | [**PaymentDetailsReference**](PaymentDetailsReference.md) |  | [default to PaymentDetailsReference]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this Payment Instruction. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.lusid.model.PaymentInstructionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
List<PaymentRecordReference> PaymentRecordIds = new List<PaymentRecordReference>();
String Currency = "example Currency";
java.math.BigDecimal TotalPaymentAmount = new java.math.BigDecimal("100.00");
OffsetDateTime PaymentDate = OffsetDateTime.now();
PaymentDetailsReference PayorPaymentDetailsReference = new PaymentDetailsReference();
PaymentDetailsReference PayeePaymentDetailsReference = new PaymentDetailsReference();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();


PaymentInstructionRequest paymentInstructionRequestInstance = new PaymentInstructionRequest()
    .Id(Id)
    .PaymentRecordIds(PaymentRecordIds)
    .Currency(Currency)
    .TotalPaymentAmount(TotalPaymentAmount)
    .PaymentDate(PaymentDate)
    .PayorPaymentDetailsReference(PayorPaymentDetailsReference)
    .PayeePaymentDetailsReference(PayeePaymentDetailsReference)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
