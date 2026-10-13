# com.finbourne.lusid.model.CapitalCallEvent
A call of committed capital on a CapitalInterest: the fund draws down the amount from the investor's  unfunded commitment, moving it to funded capital.     The total amount may optionally be broken down into slots (investment, managementFee, otherFee,  partnershipExpense, organisationalCost, recall, equalisationInterest, latePaymentInterest). When any  slot amount is supplied the slot amounts must sum to the total and one transaction is booked per  populated slot; otherwise a single legacy drawdown transaction is booked for the total.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the capital call takes effect. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The total amount of committed capital called. Must be positive. When slot amounts are  supplied they must sum to this total. | [default to java.math.BigDecimal]
**investmentAmount** | **java.math.BigDecimal** | The part of the call that funds investments. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**managementFeeAmount** | **java.math.BigDecimal** | The part of the call that pays management fees. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**otherFeeAmount** | **java.math.BigDecimal** | The part of the call that pays other fees. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**partnershipExpenseAmount** | **java.math.BigDecimal** | The part of the call that pays partnership expenses. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**organisationalCostAmount** | **java.math.BigDecimal** | The part of the call that pays organisational costs. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**recallAmount** | **java.math.BigDecimal** | The part of the call that re-draws previously distributed recallable capital. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**equalisationInterestAmount** | **java.math.BigDecimal** | The part of the call that is equalisation interest. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**latePaymentInterestAmount** | **java.math.BigDecimal** | The part of the call that is late payment interest. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**outsideCommitmentSlots** | **List&lt;String&gt;** | The slots (names without the Amount suffix, e.g. \&quot;managementFee\&quot;) called outside the commitment,  so that they do not reduce the uncalled commitment. When omitted, defaults to equalisationInterest  and latePaymentInterest. | [optional] [default to List<String>]
**dealId** | **String** | The identifier of the deal the call relates to, if any. | [optional] [default to String]
**allocationEventId** | **String** | The identifier of the allocation event the call relates to, if any. | [optional] [default to String]
**noticeDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the call notice was issued, if known. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CapitalCallEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal InvestmentAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ManagementFeeAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal OtherFeeAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PartnershipExpenseAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal OrganisationalCostAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal RecallAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal EqualisationInterestAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal LatePaymentInterestAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<String> OutsideCommitmentSlots = new List<String>();
@jakarta.annotation.Nullable String DealId = "example DealId";
@jakarta.annotation.Nullable String AllocationEventId = "example AllocationEventId";
@jakarta.annotation.Nullable OffsetDateTime NoticeDate = OffsetDateTime.now();


CapitalCallEvent capitalCallEventInstance = new CapitalCallEvent()
    .Date(Date)
    .Amount(Amount)
    .InvestmentAmount(InvestmentAmount)
    .ManagementFeeAmount(ManagementFeeAmount)
    .OtherFeeAmount(OtherFeeAmount)
    .PartnershipExpenseAmount(PartnershipExpenseAmount)
    .OrganisationalCostAmount(OrganisationalCostAmount)
    .RecallAmount(RecallAmount)
    .EqualisationInterestAmount(EqualisationInterestAmount)
    .LatePaymentInterestAmount(LatePaymentInterestAmount)
    .OutsideCommitmentSlots(OutsideCommitmentSlots)
    .DealId(DealId)
    .AllocationEventId(AllocationEventId)
    .NoticeDate(NoticeDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
