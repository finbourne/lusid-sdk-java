

# TransactionSettlementStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **String** | The unique identifier for the transaction. |  |
|**settlementBuckets** | [**List&lt;TransactionSettlementBucket&gt;**](TransactionSettlementBucket.md) | The transaction&#39;s external movements (ie: with SettlementMode&#x3D;External) are grouped into buckets with each bucket uniquely defined by the combination of SettlementCategory, LusidInstrumentId, InstrumentScope and ContractualSettlementDate. |  [optional] |
|**invalidInstructions** | [**List&lt;TransactionSettlementInstruction&gt;**](TransactionSettlementInstruction.md) | Invalid settlement instructions where the referenced transaction exists but the settlement bucket implied by the settlement instruction does not exist. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


