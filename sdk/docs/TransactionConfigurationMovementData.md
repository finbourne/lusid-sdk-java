

# TransactionConfigurationMovementData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**movementTypes** | [**MovementTypesEnum**](#MovementTypesEnum) | . The available values are: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, UnsettledCashTypes, Carry, CarryAsPnl, VariationMargin |  |
|**side** | **String** | The Side determines which of the fields from our transaction are used to generate the Movement. Side1 means the &#39;security&#39; side of the transaction, ie the Instrument and Units; Side2 means the &#39;cash&#39; side, ie the Total Consideration |  |
|**direction** | **Integer** |  A multiplier to apply to Transaction amounts; the values are -1 to indicate to reverse the signs and 1 to indicate to use the signed values from the Transaction directly. For a typical Transaction with unsigned values, 1 means increase, -1 means decrease |  |
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties associated with the underlying Movement |  [optional] |
|**mappings** | [**List&lt;TransactionPropertyMapping&gt;**](TransactionPropertyMapping.md) | This allows you to map a transaction property to a property on the underlying holding |  [optional] |
|**name** | **String** | The movement name (optional) |  [optional] |
|**movementOptions** | **List&lt;String&gt;** | Allows extra specifications for the movement. The only option currently available is &#39;DirectAdjustment&#39;. A movement type of &#39;StockMovement&#39; with an option of &#39;DirectAdjusment&#39; will allow you to adjust the unitsof a holding without affecting its cost base. You will, therefore, be able to reflect the impact of a stock split by loading a Transaction. |  [optional] |



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
| UNSETTLEDCASHTYPES | &quot;UnsettledCashTypes&quot; |
| CARRY | &quot;Carry&quot; |
| CARRYASPNL | &quot;CarryAsPnl&quot; |
| VARIATIONMARGIN | &quot;VariationMargin&quot; |



