

# TransactionQueryParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String** | The lower bound effectiveAt datetime (inclusive) from which to build the transactions. | 
**endDate** | **String** | The upper bound effectiveAt datetime (inclusive) from which to retrieve transactions. | 
**queryMode** | [**QueryModeEnum**](#QueryModeEnum) | The date to compare against the upper and lower bounds for the effectiveAt datetime. Defaults to &#39;TradeDate&#39; if not specified. |  [optional]
**showCancelledTransactions** | **Boolean** | Option to specify whether or not to include cancelled transactions in the output. Defaults to False if not specified. |  [optional]



## Enum: QueryModeEnum

Name | Value
---- | -----
NONE | &quot;None&quot;
TRADEDATE | &quot;TradeDate&quot;
SETTLEDATE | &quot;SettleDate&quot;



