

# InflationSwap

LUSID representation of an Inflation Swap.  The implementation supports the following swap types:  * Zero Coupon inflation swap, with a single payment at maturity.  * LPI Swap (capped and floored)  * Year on Year inflation swap

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** | The start date of the instrument. This is normally synonymous with the trade-date. |  |
|**maturityDate** | **OffsetDateTime** | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. |  |
|**flowConventions** | [**FlowConventions**](FlowConventions.md) |  |  |
|**fixedRate** | **java.math.BigDecimal** | Fixed Rate |  |
|**inflationCap** | **java.math.BigDecimal** | Optional cap, needed for LPI swaps. Should not be set for ZCIIS. |  [optional] |
|**inflationFloor** | **java.math.BigDecimal** | Optional floor, needed for LPI swaps. Should not be set for ZCIIS. |  [optional] |
|**inflationFrequency** | **String** | Frequency of inflation updated. Optional and defaults to Monthly which is the most common.  However both Australian and New Zealand inflation is published Quarterly. Only tenors of 1M or 3M are supported. |  [optional] |
|**inflationIndexName** | **String** | Name of the Inflation Index |  |
|**inflationInterpolation** | **String** | Inflation Interpolation flag, defaults to Linear but some older swaps require Flat.    Supported string (enumeration) values are: [Linear, Flat]. |  [optional] |
|**inflationRollDay** | **Integer** | Day of the month that inflation rolls from one month to the next. This is optional and defaults to 1, which is  the typically value for the majority of inflation bonds (exceptions include Japan which rolls on the 10th  and some LatAm bonds which roll on the 15th). |  [optional] |
|**notional** | **java.math.BigDecimal** | The notional |  |
|**observationLag** | **String** | Observation Lag, must be a number of Months, typically 3 or 4 but sometimes 8. |  |
|**payReceive** | **String** | PayReceive flag for the inflation leg.  This field is optional and defaults to Pay.  If set to Pay, this swap pays inflation and receives fixed.    Supported string (enumeration) values are: [Pay, Receive]. |  [optional] |



