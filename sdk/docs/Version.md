

# Version

The version metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effectiveFrom** | **OffsetDateTime** | The effective datetime at which this version became valid. Only applies when a single entity is being interacted with. |  |
|**asAtDate** | **OffsetDateTime** | The asAt datetime at which the data was committed to LUSID. |  |
|**asAtCreated** | **OffsetDateTime** | The asAt datetime at which the entity was first created in LUSID. |  [optional] |
|**userIdCreated** | **String** | The unique id of the user who created the entity. |  [optional] |
|**requestIdCreated** | **String** | The unique request id of the command that created the entity. |  [optional] |
|**reasonCreated** | **String** | The reason for an entity creation. |  [optional] |
|**asAtModified** | **OffsetDateTime** | The asAt datetime at which the entity (including its properties) was last updated in LUSID. |  [optional] |
|**userIdModified** | **String** | The unique id of the user who last updated the entity (including its properties) in LUSID. |  [optional] |
|**requestIdModified** | **String** | The unique request id of the command that last updated the entity (including its properties) in LUSID. |  [optional] |
|**reasonModified** | **String** | The reason for an entity modification. |  [optional] |
|**asAtVersionNumber** | **Integer** | The integer version number for the entity (the entity was created at version 1) |  [optional] |
|**entityUniqueId** | **String** | The unique id of the entity |  [optional] |
|**stagedModificationIdModified** | **String** | The ID of the staged change that resulted in the most recent modification. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


