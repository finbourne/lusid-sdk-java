

# ComplexBond

LUSID representation of a Complex Bond.  Including Floating, Callable, Puttable, Sinkable, and Fixed-to-float.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | **Map&lt;String, String&gt;** | External market codes and identifiers for the bond, e.g. ISIN. |  [optional]
**calculationType** | **String** | The calculation type applied to the bond coupon amount. This is required for bonds that have a particular type of computing the period coupon, such as simple compounding,  irregular coupons etc.  The default CalculationType is &#x60;Standard&#x60;, which returns a coupon amount equal to Principal * Coupon Rate / Coupon Frequency. Coupon Frequency is 12M / Payment Frequency.  Payment Frequency can be 1M, 3M, 6M, 12M etc. So Coupon Frequency can be 12, 4, 2, 1 respectively.    Supported string (enumeration) values are: [Standard, DayCountCoupon, NoCalculationFloater, BrazilFixedCoupon]. |  [optional]
**schedules** | [**List&lt;Schedule&gt;**](Schedule.md) | schedules. |  [optional]
**roundingConventions** | [**List&lt;RoundingConvention&gt;**](RoundingConvention.md) | Rounding conventions for analytics, if any. |  [optional]



