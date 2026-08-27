# com.finbourne.lusid.model.CommodityCalendarSwapCashFlowEvent
Cash settlement of one calendar-average period of a CommodityCalendarSwap. One event fires per period  end date defined by the swap's schedule, including the final period; PeriodNumber identifies which.  The cash flow per unit is the pre-netted settlement price (the calendar average of the observed  commodity price minus the strike) supplied externally via the quote store — LUSID computes neither the  average nor the netting. A negative value is valid and means the period settled out of the money.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodEndDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the settling period, derived from the swap&#39;s schedule. The period settles against  the calendar average of the observed commodity price up to this date. Required, and the effective  date of the event. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the period, already adjusted for the schedule&#39;s business day convention,  payment calendars and coupon lag. Required. This is when the cash moves; the event itself is  effective at PeriodEndDate. | [optional] [default to OffsetDateTime]
**currency** | **String** | The currency the period settles in, taken from the schedule&#39;s payment currency. Required. | [default to String]
**periodNumber** | **Integer** | The sequential number of the settling period, with the first period being 1 and the final period  being the total number of periods in the schedule. Required. | [default to Integer]
**quantityPerPeriod** | **java.math.BigDecimal** | The notional commodity quantity referenced by the period, and the number of units by which the  holding is reduced when the period settles. Required. | [default to java.math.BigDecimal]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex-dividend date of the cash flow. Always equal to PeriodEndDate, since entitlement is  determined by the holding on the period end date. Required. | [optional] [default to OffsetDateTime]
**cashFlowPerUnit** | **java.math.BigDecimal** | The pre-netted settlement amount per unit for the period (the calendar average of the observed  commodity price minus the strike), supplied externally via the quote store. Optional — absent until  the settlement price has been resolved. Negative when the period settled out of the money. | [optional] [default to java.math.BigDecimal]
**cashFlowAmount** | **java.math.BigDecimal** | The settlement amount for the period, calculated as CashFlowPerUnit multiplied by  QuantityPerPeriod. Optional — absent until the settlement price has been resolved. Carries the  sign of CashFlowPerUnit. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CommodityCalendarSwapCashFlowEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PeriodEndDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
String Currency = "example Currency";
Integer PeriodNumber = new Integer("100.00");
java.math.BigDecimal QuantityPerPeriod = new java.math.BigDecimal("100.00");
OffsetDateTime ExDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal CashFlowPerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CashFlowAmount = new java.math.BigDecimal("100.00");


CommodityCalendarSwapCashFlowEvent commodityCalendarSwapCashFlowEventInstance = new CommodityCalendarSwapCashFlowEvent()
    .PeriodEndDate(PeriodEndDate)
    .PaymentDate(PaymentDate)
    .Currency(Currency)
    .PeriodNumber(PeriodNumber)
    .QuantityPerPeriod(QuantityPerPeriod)
    .ExDate(ExDate)
    .CashFlowPerUnit(CashFlowPerUnit)
    .CashFlowAmount(CashFlowAmount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
