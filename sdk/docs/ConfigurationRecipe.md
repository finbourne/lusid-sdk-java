

# ConfigurationRecipe

The Configuration or Calculation Recipe controls how LUSID processes a given request.  This can be used to change where market data used in pricing is loaded from and in what order, or which model is used to  price a given instrument as well as how aggregation will process the produced results.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | **String** | The scope used when updating or inserting the Configuration Recipe. |  |
|**code** | **String** | User given string name (code) to identify the recipe. |  |
|**market** | [**MarketContext**](MarketContext.md) |  |  [optional] |
|**pricing** | [**PricingContext**](PricingContext.md) |  |  [optional] |
|**aggregation** | [**AggregationContext**](AggregationContext.md) |  |  [optional] |
|**description** | **String** | User can assign a description to understand more humanly the recipe. |  [optional] |
|**holding** | [**HoldingContext**](HoldingContext.md) |  |  [optional] |
|**translation** | [**TranslationContext**](TranslationContext.md) |  |  [optional] |



