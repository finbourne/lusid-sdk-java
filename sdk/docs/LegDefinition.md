# com.finbourne.lusid.model.LegDefinition
Definition of the set of flow and index conventions along with other miscellaneous information required to generate an instrument leg.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conventionName** | [**FlowConventionName**](FlowConventionName.md) |  | [optional] [default to FlowConventionName]
**conventions** | [**FlowConventions**](FlowConventions.md) |  | [optional] [default to FlowConventions]
**indexConvention** | [**IndexConvention**](IndexConvention.md) |  | [optional] [default to IndexConvention]
**indexConventionName** | [**FlowConventionName**](FlowConventionName.md) |  | [optional] [default to FlowConventionName]
**notionalExchangeType** | **String** | what type of notional exchange does the leg have    Supported string (enumeration) values are: [None, Initial, Final, Both]. | [default to String]
**payReceive** | **String** | Is the leg to be paid or received    Supported string (enumeration) values are: [Pay, Receive]. | [default to String]
**rateOrSpread** | **java.math.BigDecimal** | Is there either a fixed rate (non-zero) or spread to be paid over the value of the leg. | [default to java.math.BigDecimal]
**resetConvention** | **String** | Control how resets are generated relative to swap payment convention(s).    Supported string (enumeration) values are: [InAdvance, InArrears].  Defaults to \&quot;InAdvance\&quot; if not set. | [optional] [default to String]
**stubType** | **String** | If a stub is required should it be at the front or back of the leg.    Supported string (enumeration) values are: [None, ShortFront, ShortBack, LongBack, LongFront, Both]. | [default to String]
**compounding** | [**Compounding**](Compounding.md) |  | [optional] [default to Compounding]
**amortisation** | [**StepSchedule**](StepSchedule.md) |  | [optional] [default to StepSchedule]
**firstRegularPaymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional payment date of the first regular coupon.  Must be greater than the StartDate.  If set, the regular coupon schedule will be built such that the first regular coupon  will end on this date. The start date of this coupon will be calculated as normal and  a stub coupon will be created from the StartDate to the start of the first regular coupon. | [optional] [default to OffsetDateTime]
**firstCouponType** | **String** | Optional coupon type setting for the first coupon, can be used with Stub coupons.  If set to \&quot;ProRata\&quot; (the default), the coupon year fraction is calculated as normal,  however if set to \&quot;Full\&quot; the year fraction is overwritten with the standard year fraction  for a regular ful\&quot; coupon. Note this does not use the day count convention but rather is defined  directly from the tenor (i.e. a quarterly leg will be set to 0.25).    Supported string (enumeration) values are: [ProRata, Full]. | [optional] [default to String]
**lastRegularPaymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional payment date of the last regular coupon.  Must be less than the Maturity date.  If set, the regular coupon schedule will be built up to this date and the final  coupon will be a stub between this date and the Maturity date. | [optional] [default to OffsetDateTime]
**lastCouponType** | **String** | Optional coupon type setting for the last coupon, can be used with Stub coupons.  If set to \&quot;ProRata\&quot; (the default), the coupon year fraction is calculated as normal,  however if set to \&quot;Full\&quot; the year fraction is overwritten with the standard year fraction  for a regular ful\&quot; coupon. Note this does not use the day count convention but rather is defined  directly from the tenor (i.e. a quarterly leg will be set to 0.25).    Supported string (enumeration) values are: [ProRata, Full]. | [optional] [default to String]
**fxLinkedNotionalSchedule** | [**FxLinkedNotionalSchedule**](FxLinkedNotionalSchedule.md) |  | [optional] [default to FxLinkedNotionalSchedule]
**intermediateNotionalExchange** | **Boolean** | Indicates whether there are intermediate notional exchanges. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.LegDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

FlowConventionName ConventionName = new FlowConventionName();
FlowConventions Conventions = new FlowConventions();
IndexConvention IndexConvention = new IndexConvention();
FlowConventionName IndexConventionName = new FlowConventionName();
String NotionalExchangeType = "example NotionalExchangeType";
String PayReceive = "example PayReceive";
java.math.BigDecimal RateOrSpread = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String ResetConvention = "example ResetConvention";
String StubType = "example StubType";
Compounding Compounding = new Compounding();
StepSchedule Amortisation = new StepSchedule();
@jakarta.annotation.Nullable OffsetDateTime FirstRegularPaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String FirstCouponType = "example FirstCouponType";
@jakarta.annotation.Nullable OffsetDateTime LastRegularPaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String LastCouponType = "example LastCouponType";
FxLinkedNotionalSchedule FxLinkedNotionalSchedule = new FxLinkedNotionalSchedule();
@jakarta.annotation.Nullable Boolean IntermediateNotionalExchange = true;


LegDefinition legDefinitionInstance = new LegDefinition()
    .ConventionName(ConventionName)
    .Conventions(Conventions)
    .IndexConvention(IndexConvention)
    .IndexConventionName(IndexConventionName)
    .NotionalExchangeType(NotionalExchangeType)
    .PayReceive(PayReceive)
    .RateOrSpread(RateOrSpread)
    .ResetConvention(ResetConvention)
    .StubType(StubType)
    .Compounding(Compounding)
    .Amortisation(Amortisation)
    .FirstRegularPaymentDate(FirstRegularPaymentDate)
    .FirstCouponType(FirstCouponType)
    .LastRegularPaymentDate(LastRegularPaymentDate)
    .LastCouponType(LastCouponType)
    .FxLinkedNotionalSchedule(FxLinkedNotionalSchedule)
    .IntermediateNotionalExchange(IntermediateNotionalExchange);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
