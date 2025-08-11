

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



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


