

# Version

The version metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effectiveFrom** | **OffsetDateTime** | The effective datetime at which this version became valid. Only applies when a single entity is being interacted with. |  |
|**asAtDate** | **OffsetDateTime** | The asAt datetime at which the data was committed to LUSID. |  |
|**asAtCreated** | **OffsetDateTime** | The asAt datetime at which the entity was first created in LUSID. |  [optional] [readonly] |
|**userIdCreated** | **String** | The unique id of the user who created the entity. |  [optional] [readonly] |
|**asAtModified** | **OffsetDateTime** | The asAt datetime at which the entity (including its properties) was last updated in LUSID. |  [optional] [readonly] |
|**userIdModified** | **String** | The unique id of the user who last updated the entity (including its properties) in LUSID. |  [optional] [readonly] |
|**asAtVersionNumber** | **Integer** | The integer version number for the entity (the entity was created at version 1) |  [optional] [readonly] |



