# com.finbourne.lusid.model.AllocationEventReversal
How a booked Allocation Event was reversed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reference** | **String** | The reference the mirror postings were written under: the original booking reference with a -REV suffix. | [optional] [default to String]
**reason** | **String** | Why the event was reversed. | [optional] [default to String]
**reversedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime at which the event was reversed. | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date the mirror postings were posted at. | [optional] [default to OffsetDateTime]
**backdated** | **Boolean** | Whether the mirror postings were posted at the original event date despite the period being closed. | [optional] [default to Boolean]
**refundPayable** | [**List&lt;AllocationEventRefund&gt;**](AllocationEventRefund.md) | Cash owed back to investors who had already paid in when the event was reversed. | [optional] [default to List<AllocationEventRefund>]

```java
import com.finbourne.lusid.model.AllocationEventReversal;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Reference = "example Reference";
@jakarta.annotation.Nullable String Reason = "example Reason";
OffsetDateTime ReversedAt = OffsetDateTime.now();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
Boolean Backdated = true;
@jakarta.annotation.Nullable List<AllocationEventRefund> RefundPayable = new List<AllocationEventRefund>();


AllocationEventReversal allocationEventReversalInstance = new AllocationEventReversal()
    .Reference(Reference)
    .Reason(Reason)
    .ReversedAt(ReversedAt)
    .EffectiveAt(EffectiveAt)
    .Backdated(Backdated)
    .RefundPayable(RefundPayable);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
