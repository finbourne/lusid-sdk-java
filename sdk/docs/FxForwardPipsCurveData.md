

# FxForwardPipsCurveData

Contains data (i.e. dates and pips + metadata) for building fx forward curves (when combined with a spot rate to build on)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | **OffsetDateTime** | EffectiveAt date of the quoted pip rates | 
**domCcy** | **String** | Domestic currency of the fx forward | 
**fgnCcy** | **String** | Foreign currency of the fx forward | 
**dates** | **List&lt;OffsetDateTime&gt;** | Dates for which the forward rates apply | 
**pipRates** | **List&lt;java.math.BigDecimal&gt;** | Rates provided for the fx forward (price in FgnCcy per unit of DomCcy), expressed in pips | 
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. |  [optional]



