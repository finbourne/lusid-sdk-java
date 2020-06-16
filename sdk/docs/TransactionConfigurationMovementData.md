

# TransactionConfigurationMovementData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**movementTypes** | [**MovementTypesEnum**](#MovementTypesEnum) | . The available values are: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, UnsettledCashTypes | 
**side** | **String** | The Movement Side | 
**direction** | **Integer** | The Movement direction | 
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  |  [optional]
**mappings** | [**List&lt;TransactionPropertyMapping&gt;**](TransactionPropertyMapping.md) |  |  [optional]



## Enum: MovementTypesEnum

Name | Value
---- | -----
SETTLEMENT | &quot;Settlement&quot;
TRADED | &quot;Traded&quot;
STOCKMOVEMENT | &quot;StockMovement&quot;
FUTURECASH | &quot;FutureCash&quot;
COMMITMENT | &quot;Commitment&quot;
RECEIVABLE | &quot;Receivable&quot;
CASHSETTLEMENT | &quot;CashSettlement&quot;
CASHFORWARD | &quot;CashForward&quot;
CASHCOMMITMENT | &quot;CashCommitment&quot;
CASHRECEIVABLE | &quot;CashReceivable&quot;
ACCRUAL | &quot;Accrual&quot;
CASHACCRUAL | &quot;CashAccrual&quot;
FORWARDFX | &quot;ForwardFx&quot;
CASHFXFORWARD | &quot;CashFxForward&quot;
UNSETTLEDCASHTYPES | &quot;UnsettledCashTypes&quot;



