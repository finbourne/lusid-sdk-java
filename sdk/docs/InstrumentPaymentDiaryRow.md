# com.finbourne.lusid.model.InstrumentPaymentDiaryRow
An individual row containing details of a single cashflow in the diary.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quantity** | **java.math.BigDecimal** | The quantity (amount) that will be paid. Note that this can be empty if the payment is in the future and a model is used that cannot estimate it. | [optional] [default to java.math.BigDecimal]
**currency** | **String** | The payment currency of the cash flow. | [optional] [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date at which the given cash flow is due to be paid. | [optional] [default to OffsetDateTime]
**payOrReceive** | **String** | Does the cash flow belong to the Pay or Receive leg. | [optional] [default to String]
**accrualStart** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which accruals start for this cashflow. | [optional] [default to OffsetDateTime]
**accrualEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which accruals end for this cashflow. | [optional] [default to OffsetDateTime]
**cashFlowType** | **String** | The type of cashflow. | [optional] [default to String]
**isCashFlowDetermined** | **Boolean** | Is the cashflow determined as of the effective date time. | [optional] [default to Boolean]
**isCashFlowHistoric** | **Boolean** | Has the cashflow been paid, i.e. has it become a historic cashflow, as of the date and time pointed to be effectiveAt. | [optional] [default to Boolean]
**discountFactor** | **java.math.BigDecimal** | Weighting factor to discount cashflow to the present value. | [optional] [default to java.math.BigDecimal]
**discountedExpectedCashFlowAmount** | **java.math.BigDecimal** | The expected cashflow amount taking into account the discount factor. | [optional] [default to java.math.BigDecimal]
**dayCountFraction** | **java.math.BigDecimal** | The day count fraction, if appropriate. | [optional] [default to java.math.BigDecimal]
**forwardRate** | **java.math.BigDecimal** | Forward rate for cash flow if appropriate. (as in for a rates fixed or floating leg) | [optional] [default to java.math.BigDecimal]
**resetRate** | **java.math.BigDecimal** | The value of the reset, if any. | [optional] [default to java.math.BigDecimal]
**spread** | **java.math.BigDecimal** | The spread that exists on the payoff. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.InstrumentPaymentDiaryRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Currency = "example Currency";
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String PayOrReceive = "example PayOrReceive";
OffsetDateTime AccrualStart = OffsetDateTime.now();
OffsetDateTime AccrualEnd = OffsetDateTime.now();
@jakarta.annotation.Nullable String CashFlowType = "example CashFlowType";
Boolean IsCashFlowDetermined = true;
Boolean IsCashFlowHistoric = true;
java.math.BigDecimal DiscountFactor = new java.math.BigDecimal("100.00");
java.math.BigDecimal DiscountedExpectedCashFlowAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal DayCountFraction = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ForwardRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ResetRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Spread = new java.math.BigDecimal("100.00");


InstrumentPaymentDiaryRow instrumentPaymentDiaryRowInstance = new InstrumentPaymentDiaryRow()
    .Quantity(Quantity)
    .Currency(Currency)
    .PaymentDate(PaymentDate)
    .PayOrReceive(PayOrReceive)
    .AccrualStart(AccrualStart)
    .AccrualEnd(AccrualEnd)
    .CashFlowType(CashFlowType)
    .IsCashFlowDetermined(IsCashFlowDetermined)
    .IsCashFlowHistoric(IsCashFlowHistoric)
    .DiscountFactor(DiscountFactor)
    .DiscountedExpectedCashFlowAmount(DiscountedExpectedCashFlowAmount)
    .DayCountFraction(DayCountFraction)
    .ForwardRate(ForwardRate)
    .ResetRate(ResetRate)
    .Spread(Spread);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
