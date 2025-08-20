

# ReconciledTransaction

Information about reconciled transactions. At least one of Finbourne.WebApi.Interface.Dto.Reconciliation.ReconciledTransaction.Left and Finbourne.WebApi.Interface.Dto.Reconciliation.ReconciledTransaction.Right will be populated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**left** | [**Transaction**](Transaction.md) |  |  [optional] |
|**right** | [**Transaction**](Transaction.md) |  |  [optional] |
|**percentageMatch** | **java.math.BigDecimal** | How good a match this is considered to be. |  [optional] |
|**mappingRuleSetResults** | **List&lt;Boolean&gt;** | The result of each individual mapping rule result. Will only be present if both Finbourne.WebApi.Interface.Dto.Reconciliation.ReconciledTransaction.Left and Finbourne.WebApi.Interface.Dto.Reconciliation.ReconciledTransaction.Right are populated. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


