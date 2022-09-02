

# Bond

LUSID representation of a Vanilla Fixed Rate Bond.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **OffsetDateTime** | The start date of the bond&#39;s first coupon start date or accrual state date (if settle days &#x3D; 0) | 
**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | 
**domCcy** | **String** | The domestic currency of the instrument. | 
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | 
**principal** | **java.math.BigDecimal** | The face-value or principal for the bond at outset.  This might be reduced through its lifetime in the event of amortisation or similar. | 
**couponRate** | **java.math.BigDecimal** | Simple coupon rate. | 
**identifiers** | **Map&lt;String, String&gt;** | External market codes and identifiers for the bond, e.g. ISIN. |  [optional]
**exDividendDays** | **Integer** | Number of Good Business Days before the next coupon payment, in which the bond goes ex-dividend. This means that if the settlement date falls in the ex-dividend period  then the coupon paid is zero and the accrued interest is negative. The ex-dividend  period is (Next Coupon Payment Date - ExDividendDays, Next Coupon Payment Date). |  [optional]
**initialCouponDate** | **OffsetDateTime** | The initial coupon date applies to ex-dividends bonds with effectiveAt date before the initial accrual start date. In this case, the initial coupon date is used as an anchor to  generate a bond schedule that allows the computation of the ex-dividend date and hence the right coupon amount and accrued interest. |  [optional]
**firstCouponPayDate** | **OffsetDateTime** | The date that the first coupon of the bond is paid. This is required for bonds that have a long first coupon or short first coupon. The first coupon pay date is used  as an anchor to compare with the start date and determine if this is a long/short coupon period. |  [optional]
**calculationType** | **String** | The calculation type applied to the bond coupon amount. This is required for bonds that have a particular type of computing the period coupon, such as simple compounding,  irregular coupons etc.  The default CalculationType is &#x60;Standard&#x60;, which returns a coupon amount equal to Principal * Coupon Rate / Coupon Frequency. Coupon Frequency is 12M / Payment Frequency.  Payment Frequency can be 1M, 3M, 6M, 12M etc. So Coupon Frequency can be 12, 4, 2, 1 respectively.    Supported string (enumeration) values are: [Standard, DayCountCoupon, NoCalculationFloater, BrazilFixedCoupon]. |  [optional]



