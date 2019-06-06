
# ConfigurationRecipe

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | User given string name (code) to identify the recipe. | 
**market** | [**MarketContext**](MarketContext.md) | The market configuration that defines where market data used in processing a request is loaded from and how it is resolved. |  [optional]
**pricing** | [**PricingContext**](PricingContext.md) | The pricing configuration that defines which pricing library is used to price a given instrument and what models and preferences are used with those. |  [optional]
**aggregation** | [**AggregationContext**](AggregationContext.md) | The aggregation configuration that defines how results are amalgamated and what logic to follow when applying sql-like rules. |  [optional]



