

# GroupOfMarketDataKeyRules

Represents a collection of MarketDataKeyRules that should be resolved together when resolving market data.  That is, market data resolution will always attempt to resolve with all rules in the group  before deciding what market data to return.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**marketDataKeyRuleGroupOperation** | **String** | The operation that will be used to process the collection of market data items and failures found on resolution  into a single market data item or failure to be used. |  |
|**marketRules** | [**List&lt;MarketDataKeyRule&gt;**](MarketDataKeyRule.md) | The rules that should be grouped together in market data resolution. |  |



