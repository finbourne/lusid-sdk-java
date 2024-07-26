

# TransactionConfigurationMovementDataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**movementTypes** | [**MovementTypesEnum**](#MovementTypesEnum) | . The available values are: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, UnsettledCashTypes, Carry, CarryAsPnl, VariationMargin, Capital, Fee |  |
|**side** | **String** | The movement side |  |
|**direction** | **Integer** | The movement direction |  |
|**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties associated with the underlying Movement. |  [optional] |
|**mappings** | [**List&lt;TransactionPropertyMappingRequest&gt;**](TransactionPropertyMappingRequest.md) | This allows you to map a transaction property to a property on the underlying holding. |  [optional] |
|**name** | **String** | The movement name (optional) |  [optional] |
|**movementOptions** | **List&lt;String&gt;** | Allows extra specifications for the movement. The options currently available are &#39;DirectAdjustment&#39;, &#39;IncludesTradedInterest&#39; and &#39;Virtual&#39; (works only with the movement type &#39;StockMovement&#39;). A movement type of &#39;StockMovement&#39; with an option of &#39;DirectAdjusment&#39; will allow you to adjust the units of a holding without affecting its cost base. You will, therefore, be able to reflect the impact of a stock split by loading a Transaction. |  [optional] |



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
| CAPITAL | &quot;Capital&quot; |
| FEE | &quot;Fee&quot; |



