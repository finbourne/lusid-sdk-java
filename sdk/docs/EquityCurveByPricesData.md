

# EquityCurveByPricesData

Contains data (i.e. dates and prices + metadata) for building Equity curves

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | **OffsetDateTime** | EffectiveAt date of the provided prices | 
**dates** | **List&lt;OffsetDateTime&gt;** | Dates provided for the forward price of the Equity at the corresponding price in Prices.  These dates should be in the future with respect to the BaseDate. | 
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. |  [optional]
**prices** | **List&lt;java.math.BigDecimal&gt;** | Prices provided for the forward price of the Equity at the corresponding date in Dates. | 



