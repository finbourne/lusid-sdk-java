

# FxForwardTenorCurveData

Contains data (i.e. tenors and rates + metadata) for building fx forward curves (when combined with a date to build on)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | **OffsetDateTime** | EffectiveAt date of the quoted rates | 
**domCcy** | **String** | Domestic currency of the fx forward | 
**fgnCcy** | **String** | Foreign currency of the fx forward | 
**tenors** | **List&lt;String&gt;** | Tenors for which the forward rates apply | 
**rates** | **List&lt;java.math.BigDecimal&gt;** | Rates provided for the fx forward (price in FgnCcy per unit of DomCcy) | 
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. |  [optional]
**marketDataOptions** | [**MarketDataOptions**](MarketDataOptions.md) |  |  [optional]
**calendars** | [**List&lt;FxTenorConvention&gt;**](FxTenorConvention.md) | The list of conventions that should be used when interpreting tenors as dates. |  [optional]
**spotDaysCalculationType** | **String** | Configures how to calculate the spot date from the build date using the Calendars provided. |  [optional]



