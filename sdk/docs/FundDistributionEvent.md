# com.finbourne.lusid.model.FundDistributionEvent
A distribution from the fund to the holder of a CapitalInterest. A recallable distribution restores  unfunded capital (the fund may call it again); a non-recallable distribution permanently returns capital.     The total amount may optionally be broken down into slots by character (returnOfCapital, realisedGain,  dividend, interest, otherIncome, carryPaid, withholding, returnOfExcess). When any slot amount is supplied  the slot amounts must sum to the total, one transaction is booked per populated slot, and the recallable  portion of each of the five capital/income characters is given by its matching Recallable amount.  Without slots a single legacy distribution transaction is booked for the total, recallable according  to isRecallable.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the distribution takes effect. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The total amount distributed. Must be positive. When slot amounts are supplied they must sum to this total. | [default to java.math.BigDecimal]
**isRecallable** | **Boolean** | Legacy flag, used only when no slot amount is supplied: true when the fund may recall the whole  distributed amount, so the distribution restores unfunded capital rather than permanently returning  it. Defaults to false. Must not be combined with slot amounts. | [optional] [default to Boolean]
**returnOfCapitalAmount** | **java.math.BigDecimal** | The part of the distribution that returns capital. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**realisedGainAmount** | **java.math.BigDecimal** | The part of the distribution that is realised gain. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**dividendAmount** | **java.math.BigDecimal** | The part of the distribution that is dividend income. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**interestAmount** | **java.math.BigDecimal** | The part of the distribution that is interest income. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**otherIncomeAmount** | **java.math.BigDecimal** | The part of the distribution that is other income. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**returnOfCapitalRecallableAmount** | **java.math.BigDecimal** | The recallable portion of returnOfCapitalAmount. Optional; must not exceed returnOfCapitalAmount. | [optional] [default to java.math.BigDecimal]
**realisedGainRecallableAmount** | **java.math.BigDecimal** | The recallable portion of realisedGainAmount. Optional; must not exceed realisedGainAmount. | [optional] [default to java.math.BigDecimal]
**dividendRecallableAmount** | **java.math.BigDecimal** | The recallable portion of dividendAmount. Optional; must not exceed dividendAmount. | [optional] [default to java.math.BigDecimal]
**interestRecallableAmount** | **java.math.BigDecimal** | The recallable portion of interestAmount. Optional; must not exceed interestAmount. | [optional] [default to java.math.BigDecimal]
**otherIncomeRecallableAmount** | **java.math.BigDecimal** | The recallable portion of otherIncomeAmount. Optional; must not exceed otherIncomeAmount. | [optional] [default to java.math.BigDecimal]
**carryPaidAmount** | **java.math.BigDecimal** | The part of the distribution that is carried interest paid to the general partner. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**withholdingAmount** | **java.math.BigDecimal** | The part of the distribution withheld for tax (a deemed distribution). Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**returnOfExcessAmount** | **java.math.BigDecimal** | The part of the distribution that returns capital called in excess. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**recallableUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The date until which the recallable portions may be recalled, if limited. Must not precede the distribution date. | [optional] [default to OffsetDateTime]
**dealId** | **String** | The identifier of the deal the distribution relates to, if any. | [optional] [default to String]
**allocationEventId** | **String** | The identifier of the allocation event the distribution relates to, if any. | [optional] [default to String]
**waterfallTier** | **String** | The waterfall tier the distribution was paid under, if any. | [optional] [default to String]

```java
import com.finbourne.lusid.model.FundDistributionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
Boolean IsRecallable = true;
@jakarta.annotation.Nullable java.math.BigDecimal ReturnOfCapitalAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal RealisedGainAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal DividendAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal InterestAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal OtherIncomeAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ReturnOfCapitalRecallableAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal RealisedGainRecallableAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal DividendRecallableAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal InterestRecallableAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal OtherIncomeRecallableAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CarryPaidAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal WithholdingAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ReturnOfExcessAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime RecallableUntil = OffsetDateTime.now();
@jakarta.annotation.Nullable String DealId = "example DealId";
@jakarta.annotation.Nullable String AllocationEventId = "example AllocationEventId";
@jakarta.annotation.Nullable String WaterfallTier = "example WaterfallTier";


FundDistributionEvent fundDistributionEventInstance = new FundDistributionEvent()
    .Date(Date)
    .Amount(Amount)
    .IsRecallable(IsRecallable)
    .ReturnOfCapitalAmount(ReturnOfCapitalAmount)
    .RealisedGainAmount(RealisedGainAmount)
    .DividendAmount(DividendAmount)
    .InterestAmount(InterestAmount)
    .OtherIncomeAmount(OtherIncomeAmount)
    .ReturnOfCapitalRecallableAmount(ReturnOfCapitalRecallableAmount)
    .RealisedGainRecallableAmount(RealisedGainRecallableAmount)
    .DividendRecallableAmount(DividendRecallableAmount)
    .InterestRecallableAmount(InterestRecallableAmount)
    .OtherIncomeRecallableAmount(OtherIncomeRecallableAmount)
    .CarryPaidAmount(CarryPaidAmount)
    .WithholdingAmount(WithholdingAmount)
    .ReturnOfExcessAmount(ReturnOfExcessAmount)
    .RecallableUntil(RecallableUntil)
    .DealId(DealId)
    .AllocationEventId(AllocationEventId)
    .WaterfallTier(WaterfallTier);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
