

# YieldCurveData

Market data for a yield curve,  represented by a list of instruments and corresponding market quotes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | **OffsetDateTime** | Base date | 
**instruments** | [**List&lt;LusidInstrument&gt;**](LusidInstrument.md) | The set of instruments that define the curve. | 
**quotes** | [**List&lt;MarketQuote&gt;**](MarketQuote.md) | The market quotes corresponding to the the instruments used to define the curve | 
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. |  [optional]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  |  [optional]



