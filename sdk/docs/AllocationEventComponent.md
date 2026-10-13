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


AllocationEventComponent allocationEventComponentInstance = new AllocationEventComponent()
    .Component(Component)
    .Amount(Amount)
    .OriginMemberShortCode(OriginMemberShortCode)
    .WaterfallTier(WaterfallTier)
    .TaxCharacter(TaxCharacter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
