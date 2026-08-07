# com.finbourne.lusid.model.PikSchedule
A PikSchedule represents Payment-in-Kind features for a ComplexBond.  It works in conjunction with existing FixedSchedules or FloatSchedules to define  how interest is paid during duration of the schedule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the PIK schedule period. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the PIK schedule period. | [default to OffsetDateTime]
**isPikFractionElectable** | **Boolean** | If true, the PIK fraction is electable at each payment date.  Defaults to false. | [optional] [default to Boolean]
**pikFraction** | **java.math.BigDecimal** | The fraction of the coupon that is paid in kind, where 0 means fully cash and 1 means fully PIK.  Required if IsPikFractionElectable is false or null. Must satisfy 0 &lt;&#x3D; pikFraction &lt;&#x3D; 1. | [optional] [default to java.math.BigDecimal]
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
@jakarta.annotation.Nullable String PikPaymentType = "example PikPaymentType";
@jakarta.annotation.Nullable java.math.BigDecimal PikRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PikSpread = new java.math.BigDecimal("100.00");


PikSchedule pikScheduleInstance = new PikSchedule()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .IsPikFractionElectable(IsPikFractionElectable)
    .PikFraction(PikFraction)
    .PikPaymentType(PikPaymentType)
    .PikRate(PikRate)
    .PikSpread(PikSpread);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
