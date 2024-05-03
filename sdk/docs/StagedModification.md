

# StagedModification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique Id for the staged modification |  [optional] |
|**asAtStaged** | **OffsetDateTime** | Time at which the modification was staged. |  [optional] |
|**userIdStaged** | **String** | Id of the user who created the stage modification request. |  [optional] |
|**requestedIdStaged** | **String** | The Request Id that initiated this staged modification. |  [optional] |
|**action** | **String** | Type of action of the staged modification, either create, update or delete. |  [optional] |
|**stagingRule** | [**StagedModificationStagingRule**](StagedModificationStagingRule.md) |  |  [optional] |
|**decisions** | [**List&lt;StagedModificationDecision&gt;**](StagedModificationDecision.md) | Object containing information relating to the decision on the staged modification. |  [optional] |
|**decisionsCount** | **Integer** | Number of decisions made. |  [optional] |
|**status** | **String** | The status of the staged modification. |  [optional] |
|**entityType** | **String** | The type of the entity that the staged modification applies to. |  [optional] |
|**scope** | **String** | The scope of the entity that this staged modification applies to. |  [optional] |
|**entityUniqueId** | **String** | The unique Id of the entity the staged modification applies to. |  [optional] |
|**requestedChanges** | [**RequestedChanges**](RequestedChanges.md) |  |  [optional] |
|**entityHrefs** | [**StagedModificationsEntityHrefs**](StagedModificationsEntityHrefs.md) |  |  [optional] |



