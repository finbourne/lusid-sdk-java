

# TransactionConfigurationMovementData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**movementTypes** | [**MovementTypesEnum**](#MovementTypesEnum) | The Movement Types | 
**side** | [**SideEnum**](#SideEnum) | The Movement Side | 
**direction** | **Integer** | The Movement direction | 
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) |  |  [optional]
**mappings** | [**List&lt;TransactionPropertyMapping&gt;**](TransactionPropertyMapping.md) |  |  [optional]



## Enum: MovementTypesEnum

Name | Value
---- | -----
SETTLEMENT | &quot;Settlement&quot;
TRADED | &quot;Traded&quot;
FORWARDFX | &quot;ForwardFx&quot;
COMMITMENT | &quot;Commitment&quot;
RECEIVABLE | &quot;Receivable&quot;
CASHSETTLEMENT | &quot;CashSettlement&quot;
ACCRUAL | &quot;Accrual&quot;
UNSETTLEDCASHTYPES | &quot;UnsettledCashTypes&quot;
STOCKMOVEMENT | &quot;StockMovement&quot;
CASHCOMMITMENT | &quot;CashCommitment&quot;
CASHRECEIVABLE | &quot;CashReceivable&quot;
CASHFORWARD | &quot;CashForward&quot;
CASHACCRUAL | &quot;CashAccrual&quot;



## Enum: SideEnum

Name | Value
---- | -----
SIDE1 | &quot;Side1&quot;
SIDE2 | &quot;Side2&quot;
BONDINT | &quot;BondInt&quot;



