

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
|**inheritedRecipes** | [**List&lt;ResourceId&gt;**](ResourceId.md) | A list of parent recipes (scope,code) that can be used to share functionality between recipes. For instance one might use common recipes to set up  pricing for individual asset classes, e.g. rates or credit, and then combine them into a single recipe to be used by an exotics desk in conjunction with  some overrides that it requires for models or other pricing options. |  [optional] |
|**description** | **String** | User can assign a description to understand more humanly the recipe. |  [optional] |
|**holding** | [**HoldingContext**](HoldingContext.md) |  |  [optional] |



