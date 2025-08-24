

# DependencySourceFilter

Encapsulates parts of a market data rule relating not to the nature of the market data requested, but rather the nature of the thing (instrument/model) that is requesting it.  In the first instance, this includes the instrument type, asset class, and the currency of the underlying instrument.  This can be used to differentiate requests for market data according to the source of the request. See MarketDataSpecificRule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrumentType** | **String** | Specify that a rule should only apply if the market data is requested by an instrument of a given instrument type.  If null, then no filtering on instrument type is applied. |  [optional] |
|**assetClass** | **String** | Specify that a rule should only apply if the market data is requested by an instrument of a given asset class.  If null, then no filtering on asset class is applied. |  [optional] |
|**domCcy** | **String** | Specify that a rule should only apply if the market data is requested by an instrument with a given domestic currency.  If null, then no filtering on currency is applied. |  [optional] |
|**longOrShortIndicator** | **String** | Specify that a rule should apply if the market data is requested by a model with a given long or short indicator.  If none, then no filtering on LongOrShortIndicator is applied. |  [optional] |
|**addressKeyFilters** | [**List&lt;AddressKeyFilter&gt;**](AddressKeyFilter.md) | Specify that a rule should apply if the market data is requested by an instrument with features or properties  satisfying all the given address key filters. If an empty list is given, no additional filtering is done. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


