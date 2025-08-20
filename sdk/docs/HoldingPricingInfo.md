

# HoldingPricingInfo

Enables price quotes to be created from Holding fields as either overrides or fallbacks to the Market Data resolution process. For example, we may wish to price an instrument at Cost if Market Data resolution fails. We may also wish to always price Bonds using the LastTradedPrice on the corresponding Holding.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fallbackField** | **String** | The default Holding field to fall back on if the Market Data resolution process fails to find a price quote. |  [optional] |
|**overrideField** | **String** | The default Holding field to be used as an override for instrument price quotes. This cannot be specified along with a FallbackField or any SpecificFallbacks, since we&#39;ll never attempt Market Data resolution for price quotes if this field is populated. |  [optional] |
|**specificFallbacks** | [**List&lt;SpecificHoldingPricingInfo&gt;**](SpecificHoldingPricingInfo.md) | Allows a user to specify fallbacks using Holding fields for sources that match a particular DependencySourceFilter. |  [optional] |
|**specificOverrides** | [**List&lt;SpecificHoldingPricingInfo&gt;**](SpecificHoldingPricingInfo.md) | Allows a user to specify overrides using Holding fields for sources that match a particular DependencySourceFilter. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


