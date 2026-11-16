# com.finbourne.lusid.model.AllocationEventRefundPayment
One payment of a refund owed to an investor record on a booked capital call, as recorded.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the refund is paid to. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount paid, in the event currency. Must be positive, no finer than the currency&#39;s minor unit, and no more than the refund still payable to the investor record on the event. | [optional] [default to java.math.BigDecimal]
**paidDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the cash was paid out. Not before the receipt that created the refund payable. | [optional] [default to OffsetDateTime]
**reference** | **String** | The caller&#39;s reference for the payment, for instance a payment instruction id. Posting the same reference again returns the event unchanged and writes nothing. | [optional] [default to String]
**postingId** | **String** | The identifier of the fund-side posting the payment was written under. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationEventRefundPayment;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
OffsetDateTime PaidDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String Reference = "example Reference";
@jakarta.annotation.Nullable String PostingId = "example PostingId";


AllocationEventRefundPayment allocationEventRefundPaymentInstance = new AllocationEventRefundPayment()
    .InvestorRecordId(InvestorRecordId)
    .Amount(Amount)
    .PaidDate(PaidDate)
    .Reference(Reference)
    .PostingId(PostingId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
