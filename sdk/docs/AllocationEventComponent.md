# com.finbourne.lusid.model.AllocationEventComponent
One component of an Allocation Event: a part of the amount shared on its own basis and booked to its own slot.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **String** | The component. For a CapitalCall one of Investment, MgmtFee, OtherFee, PartnershipExpense, OrgCost, Recall, EqualisationInterest or LatePaymentInterest; for a Distribution one of ROC, RealisedGain, Dividend, Interest, OtherIncome, CarryPaid, Withholding or ReturnOfExcess. | [default to String]
**amount** | **java.math.BigDecimal** | The part of the event amount this component carries, in the event currency. May be zero, in which case the component allocates nothing. | [default to java.math.BigDecimal]
**originMemberShortCode** | **String** | The member of the structure the component originates from, for a basis measured per deal such as PaidInForDeal. Absent means the map&#39;s own member. | [optional] [default to String]
**waterfallTier** | **String** | For a distribution component, the tier of the waterfall it was paid under: ReturnOfContributions, PreferredReturn, CatchUp, CarriedInterest or Residual. | [optional] [default to String]
**taxCharacter** | **String** | For a distribution component, the tax character of the amount: ROC, Gain, Income or Deemed. | [optional] [default to String]
**recallableAmount** | **java.math.BigDecimal** | For the ROC component of a Distribution only, how much of the component the fund may call back, between zero and the component amount. Shared pro rata to each investor&#39;s ROC share. Absent means the allocation map&#39;s recall window decides. | [optional] [default to java.math.BigDecimal]
**recallableUntil** | [**OffsetDateTime**](OffsetDateTime.md) | For the ROC component of a Distribution only, the last date the recallable amount may be called back. Must not be before the event date and requires a non-zero recallable amount. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.AllocationEventComponent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Component = "example Component";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String OriginMemberShortCode = "example OriginMemberShortCode";
@jakarta.annotation.Nullable String WaterfallTier = "example WaterfallTier";
@jakarta.annotation.Nullable String TaxCharacter = "example TaxCharacter";
@jakarta.annotation.Nullable java.math.BigDecimal RecallableAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime RecallableUntil = OffsetDateTime.now();


AllocationEventComponent allocationEventComponentInstance = new AllocationEventComponent()
    .Component(Component)
    .Amount(Amount)
    .OriginMemberShortCode(OriginMemberShortCode)
    .WaterfallTier(WaterfallTier)
    .TaxCharacter(TaxCharacter)
    .RecallableAmount(RecallableAmount)
    .RecallableUntil(RecallableUntil);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
