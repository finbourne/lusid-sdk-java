

# TransactionSettlementInstruction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**settlementInstructionId** | **String** | The instruction identifier. Unique within the portfolio. |  |
|**instructionType** | **String** | The type of instruction which can be Complete or CancelAutomatic. Complete means that the instruction is intended to completely settle a settlement bucket. CancelAutomatic means that it is intended to cancel Automatic settlement. |  |
|**actualSettlementDate** | **OffsetDateTime** | The date that settlement takes place. |  |
|**units** | **java.math.BigDecimal** | The number of units for the instruction. |  |
|**transactionId** | **String** | The ID for the transaction being instructed. |  |
|**settlementCategory** | **String** | A category representing the set of movement types that this instruction applies to. |  |
|**lusidInstrumentId** | **String** | The LusidInstrumentId of the instrument being settled. |  |
|**contractualSettlementDate** | **OffsetDateTime** | The contractual settlement date. Used to match the instruction to the correct settlement bucket. |  [optional] |
|**subHoldingKeyOverrides** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Allows one or more sub-holding keys to be overridden for any movement being settled by an instruction. Providing a key and value will set the sub-holding key to the specified value; Providing a key only will nullify the sub-holding key. Not referenced sub-holding keys will not be impacted.  |  [optional] |
|**custodianAccountOverride** | [**ResourceId**](ResourceId.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


