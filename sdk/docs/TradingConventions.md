

# TradingConventions

Common Trading details for exchange traded instruments like Futures and Bonds

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**priceScaleFactor** | **java.math.BigDecimal** | The factor used to scale prices for the instrument. Currently used by LUSID when calculating cost  and notional amounts on transactions. Note this factor does not yet impact Valuation, PV, exposure,  all of which use the scale factor attached to the price quotes in the QuoteStore.  Must be positive and defaults to 1 if not set. |  [optional] |
|**minimumOrderSize** | **java.math.BigDecimal** | The Minimum Order Size  Must be non-negative and defaults to 0 if not set. |  [optional] |
|**minimumOrderIncrement** | **java.math.BigDecimal** | The Minimum Order Increment  Must be non-negative and defaults to 0 if not set. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


