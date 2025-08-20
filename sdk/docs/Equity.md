

# Equity

LUSID representation of an Equity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifiers** | [**EquityAllOfIdentifiers**](EquityAllOfIdentifiers.md) |  |  [optional] |
|**domCcy** | **String** | The domestic currency of the instrument. |  |
|**lotSize** | **Integer** | Deprecated: Use TradingConventions field instead Equity LotSize, the minimum number of shares that can be bought at once. Optional, if set must be non-negative, if not set defaults to 1.  Note this property does not impact valuation. From a LUSID analytics perspective, it is purely informational. |  [optional] |
|**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  |  [optional] |
|**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


