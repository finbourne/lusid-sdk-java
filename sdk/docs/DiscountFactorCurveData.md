

# DiscountFactorCurveData

A curve containing discount factors and dates to which they apply

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | **OffsetDateTime** | BaseDate for the Curve | 
**dates** | **List&lt;OffsetDateTime&gt;** | Dates for which the discount factors apply | 
**discountFactors** | **List&lt;java.math.BigDecimal&gt;** | Discount factors to be applied to cashflow on the specified dates | 
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. |  [optional]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  |  [optional]



