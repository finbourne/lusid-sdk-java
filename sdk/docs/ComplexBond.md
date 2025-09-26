# com.finbourne.lusid.model.ComplexBond
LUSID representation of a Complex Bond.  Including Floating, Fixed-to-float, Sinkable, Callable, Puttable, and Mortgage Backed Securities.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | **Map&lt;String, String&gt;** | External market codes and identifiers for the bond, e.g. ISIN. | [optional] [default to Map<String, String>]
**calculationType** | **String** | The calculation type applied to the bond coupon amount. This is required for bonds that have a particular type of computing the period coupon, such as simple compounding,  irregular coupons etc.  The default CalculationType is &#x60;Standard&#x60;, which returns a coupon amount equal to Principal generate justfile test_sdk Coupon Rate / Coupon Frequency. Coupon Frequency is 12M / Payment Frequency.  Payment Frequency can be 1M, 3M, 6M, 12M etc. So Coupon Frequency can be 12, 4, 2, 1 respectively.    Supported string (enumeration) values are: [Standard, DayCountCoupon, NoCalculationFloater, BrazilFixedCoupon, StandardWithCappedAccruedInterest]. | [optional] [default to String]
**schedules** | [**List&lt;Schedule&gt;**](Schedule.md) | schedules. | [optional] [default to List<Schedule>]
**originalIssuePrice** | **java.math.BigDecimal** | The price the complex bond was issued at. This is to be entered as a percentage of par, for example a value of 98.5 would represent 98.5%. | [optional] [default to java.math.BigDecimal]
**roundingConventions** | [**List&lt;RoundingConvention&gt;**](RoundingConvention.md) | Rounding conventions for analytics, if any. | [optional] [default to List<RoundingConvention>]
**assetBacked** | **Boolean** | If this flag is set to true, then the outstanding notional and principal repayments will be calculated based  on pool factors in the quote store. Usually AssetBacked bonds also require a RollConvention setting of   within the FlowConventions any given rates schedule (to ensure payment dates always happen on the same day  of the month) and US Agency MBSs with Pay Delay features also require their rates schedules to include an  ExDividendConfiguration to drive the lag between interest accrual and payment. | [optional] [default to Boolean]
**assetPoolIdentifier** | **String** | Identifier used to retrieve pool factor information about this bond from the quote store. This is typically  the bond&#39;s ISIN, but can also be ClientInternal. Please ensure you align the MarketDataKeyRule with the  correct Quote (Quote.ClientInternal.* or Quote.Isin.*) | [optional] [default to String]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.ComplexBond;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, String> Identifiers = new Map<String, String>();
@jakarta.annotation.Nullable String CalculationType = "example CalculationType";
@jakarta.annotation.Nullable List<Schedule> Schedules = new List<Schedule>();
@jakarta.annotation.Nullable java.math.BigDecimal OriginalIssuePrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<RoundingConvention> RoundingConventions = new List<RoundingConvention>();
@jakarta.annotation.Nullable Boolean AssetBacked = true;
@jakarta.annotation.Nullable String AssetPoolIdentifier = "example AssetPoolIdentifier";
TradingConventions TradingConventions = new TradingConventions();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


ComplexBond complexBondInstance = new ComplexBond()
    .Identifiers(Identifiers)
    .CalculationType(CalculationType)
    .Schedules(Schedules)
    .OriginalIssuePrice(OriginalIssuePrice)
    .RoundingConventions(RoundingConventions)
    .AssetBacked(AssetBacked)
    .AssetPoolIdentifier(AssetPoolIdentifier)
    .TradingConventions(TradingConventions)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
