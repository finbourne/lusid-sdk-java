

# GroupReconciliationComparisonResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**reconciliationType** | **String** | The type of reconciliation to perform. \&quot;Holding\&quot; | \&quot;Transaction\&quot; | \&quot;Valuation\&quot; |  |
|**groupReconciliationDefinitionId** | [**ResourceId**](ResourceId.md) |  |  |
|**instanceId** | [**GroupReconciliationInstanceId**](GroupReconciliationInstanceId.md) |  |  |
|**comparisonResultId** | **String** | Comparison result identifier, encoded value for core attribute results, aggregate attribute results, reconciliation type and run instanceId. |  |
|**reconciliationRunAsAt** | **OffsetDateTime** | The timestamp when the run occurred. |  |
|**resultType** | **String** | Reconciliation run general result. \&quot;Break\&quot; | \&quot;Match\&quot; | \&quot;PartialMatch\&quot; | \&quot;NotFound |  |
|**resultStatus** | **String** | Indicates how a particular result evolves from one run to the next. \&quot;New\&quot; | \&quot;Confirmed\&quot; | \&quot;Changed\&quot; |  |
|**reviewStatus** | **String** | Status of whether user has provided any input (comments, manual matches, break codes). \&quot;Pending\&quot; | \&quot;Reviewed\&quot; | \&quot;Matched\&quot; | \&quot;Invalid\&quot; |  |
|**datesReconciled** | [**GroupReconciliationDates**](GroupReconciliationDates.md) |  |  |
|**coreAttributes** | [**GroupReconciliationCoreAttributeValues**](GroupReconciliationCoreAttributeValues.md) |  |  |
|**aggregateAttributes** | [**GroupReconciliationAggregateAttributeValues**](GroupReconciliationAggregateAttributeValues.md) |  |  |
|**userReview** | [**GroupReconciliationUserReview**](GroupReconciliationUserReview.md) |  |  [optional] |
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


