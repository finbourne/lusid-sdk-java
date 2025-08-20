

# FxVolDependency

Economic dependency required to price FX derivative products that contain optionality. FX Vol surface is a grid of implied volatilities for an array of strikes and tenors, derived from vanilla option prices in the market.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domesticCurrency** | **String** | DomesticCurrency is the first currency in a currency pair quote e.g. eur-gbp, eur is the domestic currency. |  |
|**foreignCurrency** | **String** | ForeignCurrency is the second currency in a currency pair quote e.g. eur-gbp, gbp is the foreign currency. |  |
|**volType** | **String** | Volatility type e.g. \&quot;LN\&quot; and \&quot;N\&quot; for log-normal and normal volatility. |  |
|**date** | **OffsetDateTime** | The effectiveDate of the entity that this is a dependency for. Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


