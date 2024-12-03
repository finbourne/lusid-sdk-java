

# GroupReconciliationSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**runDetails** | [**GroupReconciliationRunDetails**](GroupReconciliationRunDetails.md) |  |  [optional] |
|**groupReconciliationDefinitionId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**reconciliationType** | **String** | The type of reconciliation to perform. \&quot;Holding\&quot; | \&quot;Transaction\&quot; | \&quot;Valuation\&quot; |  |
|**instanceId** | [**GroupReconciliationInstanceId**](GroupReconciliationInstanceId.md) |  |  |
|**datesReconciled** | [**GroupReconciliationDates**](GroupReconciliationDates.md) |  |  |
|**reconciliationRunAsAt** | **OffsetDateTime** | The date and time the reconciliation was run |  |
|**countComparisonResults** | **Integer** | The total number of comparison results with this InstanceId and ReconciliationType |  |
|**linkComparisonResults** | [**Link**](Link.md) |  |  [optional] |
|**resultTypes** | [**GroupReconciliationResultTypes**](GroupReconciliationResultTypes.md) |  |  [optional] |
|**resultStatuses** | [**GroupReconciliationResultStatuses**](GroupReconciliationResultStatuses.md) |  |  [optional] |
|**reviewStatuses** | [**GroupReconciliationReviewStatuses**](GroupReconciliationReviewStatuses.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


