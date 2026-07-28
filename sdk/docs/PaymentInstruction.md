# com.finbourne.lusid.model.PaymentInstruction
A Payment Instruction groups one or more Payment Records into a single block  for transmission to a downstream treasury management system via the Horizon integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**paymentRecordIds** | [**List&lt;PaymentRecordReference&gt;**](PaymentRecordReference.md) | One or more Payment Records batched into this instruction block. All referenced Payment Records must share the same currency as the top-level currency field. | [default to List<PaymentRecordReference>]
**currency** | **String** | ISO 4217 currency code. All referenced Payment Records must share this currency value. | [default to String]
**totalPaymentAmount** | **java.math.BigDecimal** | Total payment amount across all referenced Payment Records. | [default to java.math.BigDecimal]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The value date on which settlement is due. ISO 8601 date. | [default to OffsetDateTime]
**payorPaymentDetailsReference** | [**PaymentDetailsReferenceResponse**](PaymentDetailsReferenceResponse.md) |  | [default to PaymentDetailsReferenceResponse]
**payeePaymentDetailsReference** | [**PaymentDetailsReferenceResponse**](PaymentDetailsReferenceResponse.md) |  | [default to PaymentDetailsReferenceResponse]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this Payment Instruction. | [optional] [default to Map<String, PerpetualProperty>]
**status** | [**PaymentInstructionStatus**](PaymentInstructionStatus.md) |  | [default to PaymentInstructionStatus]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.PaymentInstruction;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
List<PaymentRecordReference> PaymentRecordIds = new List<PaymentRecordReference>();
String Currency = "example Currency";
java.math.BigDecimal TotalPaymentAmount = new java.math.BigDecimal("100.00");
OffsetDateTime PaymentDate = OffsetDateTime.now();
PaymentDetailsReferenceResponse PayorPaymentDetailsReference = new PaymentDetailsReferenceResponse();
PaymentDetailsReferenceResponse PayeePaymentDetailsReference = new PaymentDetailsReferenceResponse();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
PaymentInstructionStatus Status = new PaymentInstructionStatus();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PaymentInstruction paymentInstructionInstance = new PaymentInstruction()
    .Id(Id)
    .PaymentRecordIds(PaymentRecordIds)
    .Currency(Currency)
    .TotalPaymentAmount(TotalPaymentAmount)
    .PaymentDate(PaymentDate)
    .PayorPaymentDetailsReference(PayorPaymentDetailsReference)
    .PayeePaymentDetailsReference(PayeePaymentDetailsReference)
    .Properties(Properties)
    .Status(Status)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
