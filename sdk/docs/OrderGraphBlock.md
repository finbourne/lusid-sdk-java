

# OrderGraphBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**block** | [**Block**](Block.md) |  |  |
|**ordered** | [**OrderGraphBlockOrderSynopsis**](OrderGraphBlockOrderSynopsis.md) |  |  |
|**placed** | [**OrderGraphBlockPlacementSynopsis**](OrderGraphBlockPlacementSynopsis.md) |  |  |
|**executed** | [**OrderGraphBlockExecutionSynopsis**](OrderGraphBlockExecutionSynopsis.md) |  |  |
|**allocated** | [**OrderGraphBlockAllocationSynopsis**](OrderGraphBlockAllocationSynopsis.md) |  |  |
|**booked** | [**OrderGraphBlockTransactionSynopsis**](OrderGraphBlockTransactionSynopsis.md) |  |  |
|**derivedState** | **String** | A simple description of the overall state of a block. |  |
|**derivedComplianceState** | **String** | The overall compliance state of a block, derived from the block&#39;s orders. Possible values are &#39;Pending&#39;, &#39;Failed&#39;, &#39;Manually approved&#39; and &#39;Passed&#39;. |  |
|**derivedApprovalState** | **String** | The overall approval state of a block, derived from approval of the block&#39;s orders. Possible values are &#39;Pending&#39;, &#39;Approved&#39; and &#39;Rejected&#39;. |  |



