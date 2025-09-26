# com.finbourne.lusid.model.Bond
LUSID representation of a Vanilla Fixed Rate Bond.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The Start date of the bond, this is normally when accrual of the first coupon begins. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The Maturity date of the bond, this is when the last coupon accrual period ends.  Note that while most bonds have their last payment on this date there are some cases where the final payment is the next working day. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. This should be the same as the Currency set on the FlowConventions. | [default to String]
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [default to FlowConventions]
**principal** | **java.math.BigDecimal** | The face-value or principal for the bond at outset.  This might be reduced through its lifetime in the event of amortisation or similar. | [default to java.math.BigDecimal]
**couponRate** | **java.math.BigDecimal** | Simple coupon rate. | [default to java.math.BigDecimal]
**identifiers** | **Map&lt;String, String&gt;** | External market codes and identifiers for the bond, e.g. ISIN. | [optional] [default to Map<String, String>]
**exDividendDays** | **Integer** | Optional. Number of calendar days in the ex-dividend period.  If the settlement date falls in the ex-dividend period then the coupon paid is zero and the accrued interest is negative.  If set, this must be a non-negative number.  If not set, or set to 0, then there is no ex-dividend period.     NOTE: This field is deprecated. If you wish to set the ExDividendDays on a bond, please use the ExDividendConfiguration. | [optional] [default to Integer]
**initialCouponDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional and to be DEPRECATED. If set, this is the date at which the bond begins to accrue interest. Instead, this information should be entered in the field StartDate. | [optional] [default to OffsetDateTime]
**firstCouponPayDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date that the first coupon of the bond is paid. This is required for bonds that have a long first coupon or short first coupon. The first coupon pay date is used  as an anchor to compare with the start date and determine if this is a long/short coupon period. | [optional] [default to OffsetDateTime]
**calculationType** | **String** | The calculation type applied to the bond coupon amount. This is required for bonds that have a particular type of computing the period coupon, such as simple compounding,  irregular coupons etc.  The default CalculationType is &#x60;Standard&#x60;, which returns a coupon amount equal to Principal generate justfile test_sdk Coupon Rate / Coupon Frequency. Coupon Frequency is 12M / Payment Frequency.  Payment Frequency can be 1M, 3M, 6M, 12M etc. So Coupon Frequency can be 12, 4, 2, 1 respectively.    Supported string (enumeration) values are: [Standard, DayCountCoupon, NoCalculationFloater, BrazilFixedCoupon, StandardWithCappedAccruedInterest]. | [optional] [default to String]
**roundingConventions** | [**List&lt;RoundingConvention&gt;**](RoundingConvention.md) | Rounding conventions for analytics, if any. | [optional] [default to List<RoundingConvention>]
**exDividendConfiguration** | [**ExDividendConfiguration**](ExDividendConfiguration.md) |  | [optional] [default to ExDividendConfiguration]
**originalIssuePrice** | **java.math.BigDecimal** | The price the bond was issued at. This is to be entered as a percentage of par, for example a value of 98.5 would represent 98.5%. | [optional] [default to java.math.BigDecimal]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.Bond;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
FlowConventions FlowConventions = new FlowConventions();
java.math.BigDecimal Principal = new java.math.BigDecimal("100.00");
java.math.BigDecimal CouponRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Map<String, String> Identifiers = new Map<String, String>();
@jakarta.annotation.Nullable Integer ExDividendDays = new Integer("100.00");
@jakarta.annotation.Nullable OffsetDateTime InitialCouponDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime FirstCouponPayDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String CalculationType = "example CalculationType";
@jakarta.annotation.Nullable List<RoundingConvention> RoundingConventions = new List<RoundingConvention>();
ExDividendConfiguration ExDividendConfiguration = new ExDividendConfiguration();
@jakarta.annotation.Nullable java.math.BigDecimal OriginalIssuePrice = new java.math.BigDecimal("100.00");
TradingConventions TradingConventions = new TradingConventions();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


Bond bondInstance = new Bond()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .DomCcy(DomCcy)
    .FlowConventions(FlowConventions)
    .Principal(Principal)
    .CouponRate(CouponRate)
    .Identifiers(Identifiers)
    .ExDividendDays(ExDividendDays)
    .InitialCouponDate(InitialCouponDate)
    .FirstCouponPayDate(FirstCouponPayDate)
    .CalculationType(CalculationType)
    .RoundingConventions(RoundingConventions)
    .ExDividendConfiguration(ExDividendConfiguration)
    .OriginalIssuePrice(OriginalIssuePrice)
    .TradingConventions(TradingConventions)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
