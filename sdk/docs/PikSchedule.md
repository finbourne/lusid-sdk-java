# com.finbourne.lusid.model.PikSchedule
A PikSchedule represents Payment-in-Kind features for a ComplexBond, a FlexibleLoan or a LoanFacility.  It works in conjunction with existing FixedSchedules or FloatSchedules to define  how interest is paid during duration of the schedule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the PIK schedule period. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the PIK schedule period. | [default to OffsetDateTime]
**faceRoundingConvention** | **String** | How the face credited by an interest capitalisation is rounded. A PIK indenture typically increases  the note&#39;s principal by the interest payable rounded to a whole currency unit, and which way it  rounds varies by issuer. Defaults to null, which leaves the credited face unrounded. BuyUp is one  of the available values but is rejected: a capitalisation has no cash leg to fund the next whole  unit from. The per-unit coupon itself is never rounded. Available values: Floor, Ceiling, RoundHalfUp, RoundHalfDown, RoundToDecimalPlaces, BuyUp, BankerRounding. | [optional] [default to String]
**faceRoundingDecimalPlaces** | **Integer** | The number of decimal places the credited face is rounded to. Required when  FaceRoundingConvention is RoundToDecimalPlaces and not permitted otherwise. | [optional] [default to Integer]
**isPikFractionElectable** | **Boolean** | If true, the PIK fraction is electable at each payment date.  Defaults to false. | [optional] [default to Boolean]
**pikFraction** | **java.math.BigDecimal** | The fraction of the coupon that is paid in kind, where 0 means fully cash and 1 means fully PIK.  Required if IsPikFractionElectable is false or null. Must satisfy 0 &lt;&#x3D; pikFraction &lt;&#x3D; 1. | [optional] [default to java.math.BigDecimal]
**pikMargin** | **java.math.BigDecimal** | The portion of the coupon that is paid in kind, stated in the leg&#39;s own rate units (an annualised  rate on the notional) rather than as a fraction of the coupon. The in-kind leg accrues at this flat  rate and the cash leg accrues the remainder of the coupon, so on a floating leg the in-kind portion  stays constant across fixings — the shape of a loan quoted as \&quot;index + 700bp, of which 250bp paid  in kind\&quot;. On a fixed leg it is equivalent to pikFraction &#x3D; pikMargin / couponRate. Should the  period&#39;s whole coupon fall below the margin, the in-kind portion is capped at the whole  (non-negative) coupon and the cash leg floors at zero.  Mutually exclusive with pikFraction, pikRate, pikSpread and isPikFractionElectable.  Must be greater than or equal to zero. null indicates the split is stated by pikFraction instead. | [optional] [default to java.math.BigDecimal]
**pikPaymentType** | **String** | The type of PIK payment to be used for the duration of this schedule.  InterestCapitalisation adds the paid-in-kind portion to the bond&#39;s current face;  AdditionalSecurities settles it by delivering units of another instrument, named on each  period&#39;s PikBondInterestEvent; Electable leaves the choice to a per-period election.     Supported string (enumeration) values are: [Electable, InterestCapitalisation, AdditionalSecurities]. | [optional] [default to String]
**pikRate** | **java.math.BigDecimal** | The PIK interest rate. Must be greater than or equal to zero.  null indicates no override PIK interest rate. | [optional] [default to java.math.BigDecimal]
**pikSpread** | **java.math.BigDecimal** | The PIK spread to be added to the base rate for the final PIK rate.  null indicates no spread on base rate. | [optional] [default to java.math.BigDecimal]
**pikTravelsFree** | **Boolean** | Whether the in-kind entitlement travels with the traded position for the whole period, the way bond  interest does, rather than being earned from settlement the way loan cash interest is. When true, a  holder who buys before the period end takes the full-period in-kind amount on the amount bought even  if the trade settles after the ex-date. When false, the in-kind amount is day-weighted on the settled  balance path and the settled holder keeps it. Defaults to true. Bank debt only: a ComplexBond&#39;s  in-kind entitlement already follows the record date.     Nullable in the constructor and initialised here, unlike the generated shape: Newtonsoft passes  default(bool) for a value-type constructor parameter the payload omits, so a plain  &#x60;bool pikTravelsFree &#x3D; true&#x60; would come back false for every client that did not state it. | [optional] [default to Boolean]
**pikInterestBasis** | **String** | Whether the in-kind leg stands in place of the cash leg or is paid on top of it.     Alternative, the default, is the toggling structure: one period&#39;s interest settled partly in cash  and partly in kind, so the cash leg settles the complement of PikFraction and the period&#39;s  interest is the weighted sum of the two accruals, lying between them. Additional makes the two  separate legs of one loan, each settled in full, so the period&#39;s interest is their sum and  PikFraction weights only the in-kind leg.     The two accruals cannot be told apart without this: 500 accrued in cash against 600 in kind is  560 of interest on one reading and 1,100 on the other. A PikMargin schedule is Additional  whichever is stated, because the margin is already carved out of the coupon.     Defaulted here as well as in the constructor for the reason PikTravelsFree is. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PikSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String FaceRoundingConvention = "example FaceRoundingConvention";
@jakarta.annotation.Nullable Integer FaceRoundingDecimalPlaces = new Integer("100.00");
Boolean IsPikFractionElectable = true;
@jakarta.annotation.Nullable java.math.BigDecimal PikFraction = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PikMargin = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String PikPaymentType = "example PikPaymentType";
@jakarta.annotation.Nullable java.math.BigDecimal PikRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PikSpread = new java.math.BigDecimal("100.00");
Boolean PikTravelsFree = true;
@jakarta.annotation.Nullable String PikInterestBasis = "example PikInterestBasis";


PikSchedule pikScheduleInstance = new PikSchedule()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .FaceRoundingConvention(FaceRoundingConvention)
    .FaceRoundingDecimalPlaces(FaceRoundingDecimalPlaces)
    .IsPikFractionElectable(IsPikFractionElectable)
    .PikFraction(PikFraction)
    .PikMargin(PikMargin)
    .PikPaymentType(PikPaymentType)
    .PikRate(PikRate)
    .PikSpread(PikSpread)
    .PikTravelsFree(PikTravelsFree)
    .PikInterestBasis(PikInterestBasis);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
