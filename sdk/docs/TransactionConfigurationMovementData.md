
# TransactionConfigurationMovementData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**movementTypes** | [**MovementTypesEnum**](#MovementTypesEnum) | The Movement Types | 
**side** | [**SideEnum**](#SideEnum) | The Movement Side | 
**direction** | **Integer** | The Movement direction | 
**properties** | [**List&lt;Property&gt;**](Property.md) |  |  [optional]
**mappings** | [**List&lt;TransactionPropertyMapping&gt;**](TransactionPropertyMapping.md) |  |  [optional]


<a name="MovementTypesEnum"></a>
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


<a name="SideEnum"></a>
## Enum: SideEnum
Name | Value
---- | -----
SIDE1 | &quot;Side1&quot;
SIDE2 | &quot;Side2&quot;
BONDINT | &quot;BondInt&quot;



