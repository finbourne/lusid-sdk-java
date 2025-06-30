

# TransactionConfigurationMovementData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**movementTypes** | [**MovementTypesEnum**](#MovementTypesEnum) | Movement types determine the impact of the movement on the holdings. The available values are: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, UnsettledCashTypes, Carry, CarryAsPnl, VariationMargin, Capital, Fee, Deferred, CashDeferred. The available values are: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, Carry, CarryAsPnl, VariationMargin, Capital, Fee, LimitAdjustment, BalanceAdjustment, Deferred, CashDeferred, UnsettledCashTypes |  |
|**side** | **String** | The Side determines which of the fields from our transaction are used to generate the Movement. Side1 means the &#39;security&#39; side of the transaction, ie the Instrument and Units; Side2 means the &#39;cash&#39; side, ie the Total Consideration |  |
|**direction** | **Integer** |  A multiplier to apply to Transaction amounts; the values are -1 to indicate to reverse the signs and 1 to indicate to use the signed values from the Transaction directly. For a typical Transaction with unsigned values, 1 means increase, -1 means decrease |  |
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties associated with the underlying Movement |  [optional] |
|**mappings** | [**List&lt;TransactionPropertyMapping&gt;**](TransactionPropertyMapping.md) | This allows you to map a transaction property to a property on the underlying holding |  [optional] |
|**name** | **String** | The movement name (optional) |  [optional] |
|**movementOptions** | **List&lt;String&gt;** | Allows extra specifications for the movement. The options currently available are &#39;DirectAdjustment&#39;, &#39;IncludesTradedInterest&#39;, &#39;Virtual&#39; and &#39;Income&#39; (works only with the movement type &#39;StockMovement&#39;). A movement type of &#39;StockMovement&#39; with an option of &#39;DirectAdjusment&#39; will allow you to adjust the units of a holding without affecting its cost base. You will, therefore, be able to reflect the impact of a stock split by loading a Transaction. |  [optional] |



## Enum: MovementTypesEnum

| Name | Value |
|---- | -----|
| SETTLEMENT | &quot;Settlement&quot; |
| TRADED | &quot;Traded&quot; |
| STOCKMOVEMENT | &quot;StockMovement&quot; |
| FUTURECASH | &quot;FutureCash&quot; |
| COMMITMENT | &quot;Commitment&quot; |
| RECEIVABLE | &quot;Receivable&quot; |
| CASHSETTLEMENT | &quot;CashSettlement&quot; |
| CASHFORWARD | &quot;CashForward&quot; |
| CASHCOMMITMENT | &quot;CashCommitment&quot; |
| CASHRECEIVABLE | &quot;CashReceivable&quot; |
| ACCRUAL | &quot;Accrual&quot; |
| CASHACCRUAL | &quot;CashAccrual&quot; |
| FORWARDFX | &quot;ForwardFx&quot; |
| CASHFXFORWARD | &quot;CashFxForward&quot; |
| CARRY | &quot;Carry&quot; |
| CARRYASPNL | &quot;CarryAsPnl&quot; |
| VARIATIONMARGIN | &quot;VariationMargin&quot; |
| CAPITAL | &quot;Capital&quot; |
| FEE | &quot;Fee&quot; |
| LIMITADJUSTMENT | &quot;LimitAdjustment&quot; |
| BALANCEADJUSTMENT | &quot;BalanceAdjustment&quot; |
| DEFERRED | &quot;Deferred&quot; |
| CASHDEFERRED | &quot;CashDeferred&quot; |
| UNSETTLEDCASHTYPES | &quot;UnsettledCashTypes&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


