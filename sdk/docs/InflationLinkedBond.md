

# InflationLinkedBond

Inflation Linked Bond.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **OffsetDateTime** | The start date of the bond. | 
**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | 
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | 
**couponRate** | **java.math.BigDecimal** | Simple coupon rate. | 
**identifiers** | **Map&lt;String, String&gt;** | External market codes and identifiers for the bond, e.g. ISIN. |  [optional]
**domCcy** | **String** | The domestic currency of the instrument. | 
**baseCPI** | **java.math.BigDecimal** | BaseCPI value. This is optional, if not provided the BaseCPI value will be calculated from the BaseCPIDate,  If that too is not present the StartDate will be used.  Note that both BaseCPI and BaseCPIDate cannot be set.  Some bonds are issued with a BaseCPI date that does not correspond to the StartDate CPI value, in this  case the value should be provided here or with the BaseCPIDate. |  [optional]
**baseCPIDate** | **OffsetDateTime** | BaseCPIDate. This is optional, if not provided the BaseCPI value will taken from the BaseCPI property,  if that too is not present than the StartDate will be used.  If present, the BaseCPI is calculated for this date, note this is an un-lagged date (similar to StartDate)  so the Bond ObservationLag will be applied to this date when calculating the CPI.  Note that both BaseCPI and BaseCPIDate cannot be set.  Some bonds are issued with a BaseCPI date that does not correspond to the StartDate CPI value, in this  case the value should be provided here or with the actual BaseCPI. |  [optional]
**calculationType** | **String** | The calculation type applied to the bond coupon and principal amount.  The default CalculationType is &#x60;Standard&#x60; and currently this is the only value supported.    Supported string (enumeration) values are: [Standard, Quarterly, Ratio]. |  [optional]
**exDividendDays** | **Integer** | Number of Good Business Days before the next coupon payment, in which the bond goes ex-dividend.  This is not common in inflation linked bonds but has been seen with (for example) bonds issued by  the Bank of Thailand. |  [optional]
**indexPrecision** | **Integer** | Number of decimal places used to round IndexRatio. This defaults to 5 if not set. |  [optional]
**inflationIndexName** | **String** | Name of the index, e.g. UKRPI. | 
**inflationInterpolation** | **String** | Inflation Interpolation. This is optional and defaults to Linear if not set.    Supported string (enumeration) values are: [Linear, Flat]. |  [optional]
**inflationRollDay** | **Integer** | Day of the month that inflation rolls from one month to the next. This is optional and defaults to 1, which is  the typically value for the majority of inflation bonds (exceptions include Japan which rolls on the 10th  and some LatAm bonds which roll on the 15th). |  [optional]
**observationLag** | **String** | Observation lag. This is a Tenor that must have units of Month.  This field is typically 3 or 4 months, but can vary, older bonds have 8 months lag.  For Bonds with a calculation type of Ratio, this property, if set, must be 0Invalid. |  [optional]
**principal** | **java.math.BigDecimal** | The face-value or principal for the bond at outset. | 
**principalProtection** | **Boolean** | If true then the principal is protected in that the redemption amount will be at least the face value (Principal).  This is typically set to true for inflation linked bonds issued by the United States and France (for example).  This is typically set to false for inflation linked bonds issued by the United Kingdom (post 2005).  For other sovereigns this can vary from issue to issue.  If not set this property defaults to true.  This is sometimes referred to as Deflation protection or an inflation floor of 0%. |  [optional]
**stubType** | **String** | StubType. Most Inflation linked bonds have a ShortFront stub type so this is the default, however in some cases  with a long front stub LongFront should be selected.  StubType Both is not supported for InflationLinkedBonds.    Supported string (enumeration) values are: [ShortFront, ShortBack, LongBack, LongFront, Both]. |  [optional]



