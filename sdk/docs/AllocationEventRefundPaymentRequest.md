# com.finbourne.lusid.model.AllocationEventRefundPaymentRequest
The request used to pay out a refund owed to an investor whose receipt against a booked capital call exceeded  what it owed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the refund is paid to. | [default to String]
**amount** | **java.math.BigDecimal** | The amount paid, in the event currency. Must be positive, no finer than the currency&#39;s minor unit, and no more than the refund still payable to the investor record on the event. | [default to java.math.BigDecimal]
**paidDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the cash was paid out. Not before the receipt that created the refund payable. | [default to OffsetDateTime]
**reference** | **String** | The caller&#39;s reference for the payment, for instance a payment instruction id. Posting the same reference again returns the event unchanged and writes nothing. | [default to String]

```java
import com.finbourne.lusid.model.AllocationEventRefundPaymentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
OffsetDateTime PaidDate = OffsetDateTime.now();
String Reference = "example Reference";


AllocationEventRefundPaymentRequest allocationEventRefundPaymentRequestInstance = new AllocationEventRefundPaymentRequest()
    .InvestorRecordId(InvestorRecordId)
    .Amount(Amount)
    .PaidDate(PaidDate)
    .Reference(Reference);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
