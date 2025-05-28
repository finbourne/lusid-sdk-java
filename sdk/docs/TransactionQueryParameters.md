

# TransactionQueryParameters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **String** | The lower bound effective datetime or cut label (inclusive) from which to build the transactions. |  |
|**endDate** | **String** | The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions. |  |
|**queryMode** | [**QueryModeEnum**](#QueryModeEnum) | The date to compare against the upper and lower bounds for the effective datetime or cut label. Defaults to &#39;TradeDate&#39; if not specified. The available values are: TradeDate, SettleDate |  [optional] |
|**showCancelledTransactions** | **Boolean** | Option to specify whether or not to include cancelled transactions in the output. Defaults to False if not specified. |  [optional] |
|**timelineScope** | **String** | Scope of the Timeline for the Portfolio. The Timeline to be used while building transactions |  [optional] |
|**timelineCode** | **String** | Code of the Timeline for the Portfolio. The Timeline to be used while building transactions |  [optional] |
|**includeEconomics** | **Boolean** | By default is false. When set to true the Economics data would be populated in the response. |  [optional] |



## Enum: QueryModeEnum

| Name | Value |
|---- | -----|
| TRADEDATE | &quot;TradeDate&quot; |
| SETTLEDATE | &quot;SettleDate&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


