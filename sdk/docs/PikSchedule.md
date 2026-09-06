# com.finbourne.lusid.model.PikSchedule
A PikSchedule represents Payment-in-Kind features for a ComplexBond.  It works in conjunction with existing FixedSchedules or FloatSchedules to define  how interest is paid during duration of the schedule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the PIK schedule period. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the PIK schedule period. | [default to OffsetDateTime]
**isPikFractionElectable** | **Boolean** | If true, the PIK fraction is electable at each payment date.  Defaults to false. | [optional] [default to Boolean]
**pikFraction** | **java.math.BigDecimal** | The fraction of the coupon that is paid in kind, where 0 means fully cash and 1 means fully PIK.  Required if IsPikFractionElectable is false or null. Must satisfy 0 &lt;&#x3D; pikFraction &lt;&#x3D; 1. | [optional] [default to java.math.BigDecimal]
**pikMargin** | **java.math.BigDecimal** | The portion of the coupon that is paid in kind, stated in the leg&#39;s own rate units (an annualised  rate on the notional) rather than as a fraction of the coupon. The in-kind leg accrues at this flat  rate and the cash leg accrues the remainder of the coupon, so on a floating leg the in-kind portion  stays constant across fixings — the shape of a loan quoted as \&quot;index + 700bp, of which 250bp paid  in kind\&quot;. On a fixed leg it is equivalent to pikFraction &#x3D; pikMargin / couponRate. Should the  period&#39;s whole coupon fall below the margin, the in-kind portion is capped at the whole  (non-negative) coupon and the cash leg floors at zero.  Mutually exclusive with pikFraction, pikRate, pikSpread and isPikFractionElectable.  Must be greater than or equal to zero. null indicates the split is stated by pikFraction instead. | [optional] [default to java.math.BigDecimal]
**pikPaymentType** | **String** | The type of PIK payment to be used for the duration of this schedule.  InterestCapitalisation adds the paid-in-kind portion to the bond&#39;s current face;  AdditionalSecurities settles it by delivering units of another instrument, named on each  period&#39;s PikBondInterestEvent; Electable leaves the choice to a per-period election.     Supported string (enumeration) values are: [Electable, InterestCapitalisation, AdditionalSecurities]. | [optional] [default to String]
**pikRate** | **java.math.BigDecimal** | The PIK interest rate. Must be greater than or equal to zero.  null indicates no override PIK interest rate. | [optional] [default to java.math.BigDecimal]
**pikSpread** | **java.math.BigDecimal** | The PIK spread to be added to the base rate for the final PIK rate.  null indicates no spread on base rate. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PikSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
Boolean IsPikFractionElectable = true;
@jakarta.annotation.Nullable java.math.BigDecimal PikFraction = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PikMargin = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String PikPaymentType = "example PikPaymentType";
@jakarta.annotation.Nullable java.math.BigDecimal PikRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PikSpread = new java.math.BigDecimal("100.00");


PikSchedule pikScheduleInstance = new PikSchedule()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .IsPikFractionElectable(IsPikFractionElectable)
    .PikFraction(PikFraction)
    .PikMargin(PikMargin)
    .PikPaymentType(PikPaymentType)
    .PikRate(PikRate)
    .PikSpread(PikSpread);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
