

# TransactionQueryParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String** | The lower bound effective datetime or cut label (inclusive) from which to build the transactions. | 
**endDate** | **String** | The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions. | 
**queryMode** | [**QueryModeEnum**](#QueryModeEnum) | The date to compare against the upper and lower bounds for the effective datetime or cut label. Defaults to &#39;TradeDate&#39; if not specified. The available values are: TradeDate, SettleDate |  [optional]
**showCancelledTransactions** | **Boolean** | Option to specify whether or not to include cancelled transactions in the output. Defaults to False if not specified. |  [optional]



## Enum: QueryModeEnum

Name | Value
---- | -----
TRADEDATE | &quot;TradeDate&quot;
SETTLEDATE | &quot;SettleDate&quot;



