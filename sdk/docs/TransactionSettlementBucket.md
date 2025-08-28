

# TransactionSettlementBucket


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**settlementCategory** | **String** | A category representing the set of movement types that this instruction applies to. |  |
|**lusidInstrumentId** | **String** | The LusidInstrumentId of the instrument being settled. |  |
|**instrumentScope** | **String** | The Scope of the instrument being settled. |  |
|**contractualSettlementDate** | **OffsetDateTime** | The contractual settlement date. Used to match the instruction to the correct settlement bucket. |  [optional] |
|**contractedUnits** | **java.math.BigDecimal** | The contracted units. |  [optional] |
|**settledUnits** | **java.math.BigDecimal** | The settled units. |  [optional] |
|**unsettledUnits** | **java.math.BigDecimal** | The unsettled units. |  [optional] |
|**overdueUnits** | **java.math.BigDecimal** | The overdue units. |  [optional] |
|**configuredSettlement** | **String** | The method of settlement for the settlement bucket, as defined in the portfolio&#39;s SettlementConfiguration |  [optional] |
|**status** | **String** | The Status of the settlement bucket - &#39;Settled&#39;, &#39;Part Settled&#39; or &#39;Unsettled&#39;. |  |
|**settlementInstructions** | [**List&lt;TransactionSettlementInstruction&gt;**](TransactionSettlementInstruction.md) | The settlement instructions received for this settlement bucket. |  [optional] |
|**movements** | [**List&lt;TransactionSettlementMovement&gt;**](TransactionSettlementMovement.md) | The movements for the settlement bucket. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


