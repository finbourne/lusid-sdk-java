
# TransactionQueryParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String** | The required set of transactions should begin from this date |  [optional]
**endDate** | **String** | The required set of transactions should end at this date |  [optional]
**queryMode** | [**QueryModeEnum**](#QueryModeEnum) | The method for date selection. Trade date or Settlement date |  [optional]
**showCancelledTransactions** | **Boolean** | Option to include cancelled transactions in the results |  [optional]


<a name="QueryModeEnum"></a>
## Enum: QueryModeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
TRADEDATE | &quot;TradeDate&quot;
SETTLEDATE | &quot;SettleDate&quot;



