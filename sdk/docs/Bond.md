

# Bond

LUSID representation of a Vanilla Fixed Rate Bond.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **OffsetDateTime** | The Start date of the bond, this is normally when accrual of the first coupon begins. | 
**maturityDate** | **OffsetDateTime** | The Maturity date of the bond, this is when the last coupon accrual period ends.  Note that while most bonds have their last payment on this date there are some cases where the final payment is the next working day. | 
**domCcy** | **String** | The domestic currency of the instrument. This should be the same as the Currency set on the FlowConventions. | 
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | 
**principal** | **java.math.BigDecimal** | The face-value or principal for the bond at outset.  This might be reduced through its lifetime in the event of amortisation or similar. | 
**couponRate** | **java.math.BigDecimal** | Simple coupon rate. | 
**identifiers** | **Map&lt;String, String&gt;** | External market codes and identifiers for the bond, e.g. ISIN. |  [optional]
**exDividendDays** | **Integer** | Optional. Number of calendar days in the ex-dividend period.  If the settlement date falls in the ex-dividend period then the coupon paid is zero and the accrued interest is negative.  If set, this must be a non-negative number.  If not set, or set to 0, then there is no ex-dividend period.                NOTE: This field is deprecated.  If you wish to set the ExDividendDays on a bond, please use the ExDividendConfiguration. |  [optional]
**initialCouponDate** | **OffsetDateTime** | Optional. If set, this is the date at which the bond begins to accrue interest, if not set then the bond begins to accrue on the StartDate. |  [optional]
**firstCouponPayDate** | **OffsetDateTime** | The date that the first coupon of the bond is paid. This is required for bonds that have a long first coupon or short first coupon. The first coupon pay date is used  as an anchor to compare with the start date and determine if this is a long/short coupon period. |  [optional]
**calculationType** | **String** | The calculation type applied to the bond coupon amount. This is required for bonds that have a particular type of computing the period coupon, such as simple compounding,  irregular coupons etc.  The default CalculationType is &#x60;Standard&#x60;, which returns a coupon amount equal to Principal * Coupon Rate / Coupon Frequency. Coupon Frequency is 12M / Payment Frequency.  Payment Frequency can be 1M, 3M, 6M, 12M etc. So Coupon Frequency can be 12, 4, 2, 1 respectively.    Supported string (enumeration) values are: [Standard, DayCountCoupon, NoCalculationFloater, BrazilFixedCoupon]. |  [optional]
**roundingConventions** | [**List&lt;RoundingConvention&gt;**](RoundingConvention.md) | Rounding conventions for analytics, if any. |  [optional]
**exDividendConfiguration** | [**ExDividendConfiguration**](ExDividendConfiguration.md) |  |  [optional]



