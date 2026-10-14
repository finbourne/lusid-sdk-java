# com.finbourne.lusid.model.AllocationEventNoticeLine
One line of a notice: an amount allocated to the partner under an ILPA transaction type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ilpaTransactionType** | **String** | The ILPA transaction type of the line. | [default to String]
**component** | **String** | The allocation event component the line is for. | [optional] [default to String]
**insideFund** | **Boolean** | Whether the line moves capital inside the fund, as opposed to a fee or expense outside it. | [default to Boolean]
**amount** | **java.math.BigDecimal** | The amount of the line. | [default to java.math.BigDecimal]
**unfundedImpact** | **java.math.BigDecimal** | The effect of the line on the partner&#39;s unfunded commitment. | [default to java.math.BigDecimal]
**recallableUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The date until which a recallable distribution may be recalled, or null. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.AllocationEventNoticeLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String IlpaTransactionType = "example IlpaTransactionType";
@jakarta.annotation.Nullable String Component = "example Component";
Boolean InsideFund = true;
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
java.math.BigDecimal UnfundedImpact = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime RecallableUntil = OffsetDateTime.now();


AllocationEventNoticeLine allocationEventNoticeLineInstance = new AllocationEventNoticeLine()
    .IlpaTransactionType(IlpaTransactionType)
    .Component(Component)
    .InsideFund(InsideFund)
    .Amount(Amount)
    .UnfundedImpact(UnfundedImpact)
    .RecallableUntil(RecallableUntil);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
