

# OrderGraphBlockOrderDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**complianceState** | **String** | The compliance state of this order. Possible values are &#39;Pending&#39;, &#39;Failed&#39;, &#39;Manually approved&#39;, &#39;Passed&#39; and &#39;Warning&#39;. |  |
|**approvalState** | **String** | The approval state of this order. Possible values are &#39;Pending&#39;, &#39;Rejected&#39; and &#39;Approved&#39;. |  |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**portfolioName** | **String** | The name of the order&#39;s referenced Portfolio. |  [optional] |
|**orderApprovalTaskId** | **String** | The task id associated with the approval state of the order. |  [optional] |
|**orderApprovalTaskDefinitionId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**nonPassingComplianceRuleResults** | [**List&lt;ContributionToNonPassingRuleDetail&gt;**](ContributionToNonPassingRuleDetail.md) | The details of compliance rules in non-passing states. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


