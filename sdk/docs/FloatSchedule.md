# com.finbourne.lusid.model.FloatSchedule
Schedule for floating rate coupon payments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date from which LUSID starts generating the payment schedule. | [optional] [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | Last date of the payment generation schedule. May not necessarily be the maturity date  of the underlying instrument (e.g. in case the instrument has multiple payment schedules). | [optional] [default to OffsetDateTime]
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [optional] [default to FlowConventions]
**conventionName** | [**FlowConventionName**](FlowConventionName.md) |  | [optional] [default to FlowConventionName]
**exDividendDays** | **Integer** | Optional. Number of calendar days in the ex-dividend period.  If the settlement date falls in the ex-dividend period then the coupon paid is zero and the accrued interest is negative.  If set, this must be a non-negative number.  If not set, or set to 0, then there is no ex-dividend period.     NOTE: This field is deprecated. If you wish to set the ExDividendDays on a bond, please use the ExDividendConfiguration. | [optional] [default to Integer]
**indexConventionName** | [**FlowConventionName**](FlowConventionName.md) |  | [optional] [default to FlowConventionName]
**indexConventions** | [**IndexConvention**](IndexConvention.md) |  | [optional] [default to IndexConvention]
**notional** | **java.math.BigDecimal** | Scaling factor, the quantity outstanding on which the rate will be paid. | [optional] [default to java.math.BigDecimal]
**paymentCurrency** | **String** | Payment currency. This does not have to be the same as the nominal bond or observation/reset currency. | [default to String]
**spread** | **java.math.BigDecimal** | Spread over floating rate given as a fraction. | [optional] [default to java.math.BigDecimal]
**stubType** | **String** | When a payment schedule doesn&#39;t have regular payment intervals just because of the  first and/or last coupons of the schedule, we call those irregular coupons stubs.  This configuration specifies what type of stub is used when building the schedule  Supported values are:  None &#x3D; this is a regular payment schedule with no stubs. DO NOT use it with irregular schedules or you will get incorrect and unexpected behaviour.  ShortFront &#x3D; this is an irregular payment schedule where only the first coupon is irregular, and covers a payment period that is shorter than the regular payment period.  ShortBack &#x3D; this is an irregular payment schedule where only the last coupon is irregular, and covers a payment period that is shorter than the regular payment period.  LongFront &#x3D; this is an irregular payment schedule where only the first coupon is irregular, and covers a payment period that is longer than the regular payment period.  LongBack &#x3D; this is an irregular payment schedule where only the last coupon is irregular, and covers a payment period that is longer than the regular payment period.  Both &#x3D; this is an irregular payment schedule where both the first and the last coupons are irregular, and the length of these periods is calculated based on the first coupon payment date that should have been explicitly set. | [optional] [default to String]
**exDividendConfiguration** | [**ExDividendConfiguration**](ExDividendConfiguration.md) |  | [optional] [default to ExDividendConfiguration]
**compounding** | [**Compounding**](Compounding.md) |  | [optional] [default to Compounding]
**resetConvention** | **String** | Control how resets are generated relative to payment convention(s).    Supported string (enumeration) values are: [InAdvance, InArrears].  Defaults to \&quot;InAdvance\&quot; if not set. | [optional] [default to String]
**useAnnualisedDirectRates** | **Boolean** | Flag indicating whether to use daily updated annualised interest  rates for calculating the accrued interest. Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.FloatSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
FlowConventions FlowConventions = new FlowConventions();
FlowConventionName ConventionName = new FlowConventionName();
@jakarta.annotation.Nullable Integer ExDividendDays = new Integer("100.00");
FlowConventionName IndexConventionName = new FlowConventionName();
IndexConvention IndexConventions = new IndexConvention();
java.math.BigDecimal Notional = new java.math.BigDecimal("100.00");
String PaymentCurrency = "example PaymentCurrency";
java.math.BigDecimal Spread = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String StubType = "example StubType";
ExDividendConfiguration ExDividendConfiguration = new ExDividendConfiguration();
Compounding Compounding = new Compounding();
@jakarta.annotation.Nullable String ResetConvention = "example ResetConvention";
Boolean UseAnnualisedDirectRates = true;


FloatSchedule floatScheduleInstance = new FloatSchedule()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .FlowConventions(FlowConventions)
    .ConventionName(ConventionName)
    .ExDividendDays(ExDividendDays)
    .IndexConventionName(IndexConventionName)
    .IndexConventions(IndexConventions)
    .Notional(Notional)
    .PaymentCurrency(PaymentCurrency)
    .Spread(Spread)
    .StubType(StubType)
    .ExDividendConfiguration(ExDividendConfiguration)
    .Compounding(Compounding)
    .ResetConvention(ResetConvention)
    .UseAnnualisedDirectRates(UseAnnualisedDirectRates);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
