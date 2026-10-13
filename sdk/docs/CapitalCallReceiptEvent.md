# com.finbourne.lusid.model.CapitalCallReceiptEvent
The investor's payment against a capital call on a CapitalInterest. Booked separately from the call  because it arrives on a later date and may come in instalments; each populated slot books its own  receipt transaction so an unpaid fee never short-pays the deal.     The total amount may optionally be broken down into the same slots as the call (investment,  managementFee, otherFee, partnershipExpense, organisationalCost, recall, equalisationInterest,  latePaymentInterest). When any slot amount is supplied the slot amounts must sum to the total and  one transaction is booked per populated slot; otherwise a single receipt transaction is booked for  the total.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the receipt is paid. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The total amount paid against the call. Must be positive. When slot amounts are supplied they  must sum to this total. | [default to java.math.BigDecimal]
**callEventId** | **String** | The identifier of the capital call event this receipt pays. | [default to String]
**investmentAmount** | **java.math.BigDecimal** | The part of the receipt that pays the investment slot of the call. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**managementFeeAmount** | **java.math.BigDecimal** | The part of the receipt that pays the management fee slot of the call. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**otherFeeAmount** | **java.math.BigDecimal** | The part of the receipt that pays the other fee slot of the call. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**partnershipExpenseAmount** | **java.math.BigDecimal** | The part of the receipt that pays the partnership expense slot of the call. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**organisationalCostAmount** | **java.math.BigDecimal** | The part of the receipt that pays the organisational cost slot of the call. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**recallAmount** | **java.math.BigDecimal** | The part of the receipt that pays the recall slot of the call. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**equalisationInterestAmount** | **java.math.BigDecimal** | The part of the receipt that pays the equalisation interest slot of the call. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**latePaymentInterestAmount** | **java.math.BigDecimal** | The part of the receipt that pays the late payment interest slot of the call. Optional slot; must not be negative. | [optional] [default to java.math.BigDecimal]
**outsideCommitmentSlots** | **List&lt;String&gt;** | The slots (names without the Amount suffix, e.g. \&quot;managementFee\&quot;) that were called outside the  commitment, so that paying them does not move paid-in capital. When omitted, defaults to  equalisationInterest and latePaymentInterest. | [optional] [default to List<String>]
**dealId** | **String** | The identifier of the deal the receipt relates to, if any. | [optional] [default to String]
**allocationEventId** | **String** | The identifier of the allocation event the receipt relates to, if any. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CapitalCallReceiptEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String CallEventId = "example CallEventId";
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


CapitalCallReceiptEvent capitalCallReceiptEventInstance = new CapitalCallReceiptEvent()
    .Date(Date)
    .Amount(Amount)
    .CallEventId(CallEventId)
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
    .AllocationEventId(AllocationEventId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
