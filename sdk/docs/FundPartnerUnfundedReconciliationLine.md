# com.finbourne.lusid.model.FundPartnerUnfundedReconciliationLine
One booked allocation to the partner on the unfunded commitment statement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocationEventId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**eventDate** | [**OffsetDateTime**](OffsetDateTime.md) | The event date of the allocation. | [default to OffsetDateTime]
**eventType** | **String** | The kind of allocation event: CapitalCall, Distribution, FeeExpense, ValuationMove, Equalisation, RecallExpiry, Transfer, Default or Commitment. | [default to String]
**component** | **String** | The component of the event the amount belongs to, for example Investment, MgmtFee or ROC. | [optional] [default to String]
**ilpaTransactionType** | **String** | The ILPA transaction type the line is reported under, from the map&#39;s override or the default for the event type and component. | [default to String]
**insideFund** | **Boolean** | Whether the flow is inside the fund&#39;s commitment. False for flows outside it, such as equalisation interest or late payment interest, which do not move unfunded. | [default to Boolean]
**amount** | **java.math.BigDecimal** | The amount allocated to the partner, in the statement currency. | [default to java.math.BigDecimal]
**unfundedImpact** | **java.math.BigDecimal** | The effect of the line on unfunded commitment: negative for a call inside the commitment or an expired recallable, positive for a recallable distribution, and the signed amount for a commitment change or transfer. Zero for a flow that does not move unfunded. | [default to java.math.BigDecimal]
**recallableUntil** | [**OffsetDateTime**](OffsetDateTime.md) | For a recallable distribution, the last date it may be recalled. Absent when there is no deadline or the line is not recallable. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.FundPartnerUnfundedReconciliationLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId AllocationEventId = new ResourceId();
OffsetDateTime EventDate = OffsetDateTime.now();
String EventType = "example EventType";
@jakarta.annotation.Nullable String Component = "example Component";
String IlpaTransactionType = "example IlpaTransactionType";
Boolean InsideFund = true;
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
java.math.BigDecimal UnfundedImpact = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime RecallableUntil = OffsetDateTime.now();


FundPartnerUnfundedReconciliationLine fundPartnerUnfundedReconciliationLineInstance = new FundPartnerUnfundedReconciliationLine()
    .AllocationEventId(AllocationEventId)
    .EventDate(EventDate)
    .EventType(EventType)
    .Component(Component)
    .IlpaTransactionType(IlpaTransactionType)
    .InsideFund(InsideFund)
    .Amount(Amount)
    .UnfundedImpact(UnfundedImpact)
    .RecallableUntil(RecallableUntil);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
