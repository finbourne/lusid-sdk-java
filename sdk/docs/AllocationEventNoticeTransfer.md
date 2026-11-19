# com.finbourne.lusid.model.AllocationEventNoticeTransfer
The transfer a notice reports, from the leg the partner is on: the other party to the leg, the lines the  interest moves between, the fraction and the terms.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**counterpartyInvestorRecordId** | **String** | The investor record on the other side of the leg: the transferor on the transferee&#39;s notice, the transferee on the transferor&#39;s. Absent when the register does not say who holds the source line. | [optional] [default to String]
**fromLineId** | **String** | The register line the interest moves from. | [default to String]
**toLineId** | **String** | The register line the interest moves to. | [default to String]
**fraction** | **java.math.BigDecimal** | The fraction of the source line transferred. | [default to java.math.BigDecimal]
**pnlSplit** | **String** | How the period&#39;s profit and loss is split around the transfer date: InterimClose or DailyProration. | [default to String]
**consideration** | [**AllocationEventTransferConsideration**](AllocationEventTransferConsideration.md) |  | [optional] [default to AllocationEventTransferConsideration]
**consentReference** | **String** | A reference to the consent obtained for the transfer, when one was. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationEventNoticeTransfer;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String CounterpartyInvestorRecordId = "example CounterpartyInvestorRecordId";
String FromLineId = "example FromLineId";
String ToLineId = "example ToLineId";
java.math.BigDecimal Fraction = new java.math.BigDecimal("100.00");
String PnlSplit = "example PnlSplit";
AllocationEventTransferConsideration Consideration = new AllocationEventTransferConsideration();
@jakarta.annotation.Nullable String ConsentReference = "example ConsentReference";


AllocationEventNoticeTransfer allocationEventNoticeTransferInstance = new AllocationEventNoticeTransfer()
    .CounterpartyInvestorRecordId(CounterpartyInvestorRecordId)
    .FromLineId(FromLineId)
    .ToLineId(ToLineId)
    .Fraction(Fraction)
    .PnlSplit(PnlSplit)
    .Consideration(Consideration)
    .ConsentReference(ConsentReference);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
