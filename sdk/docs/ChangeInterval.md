

# ChangeInterval

Defines a change that occured for an entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asAtModified** | **OffsetDateTime** | The date/time of the change. |  [optional] |
|**userIdModified** | **String** | The unique identifier of the user that made the change. |  [optional] |
|**requestIdModified** | **String** | The unique identifier of the request that the changes were part of. |  [optional] |
|**asAtVersionNumber** | **Integer** | The version number for the entity (the entity was created at version 1). This may refer to the version number of a changed related entity, not a change for the entity itself. |  [optional] |
|**stagedModificationIdModified** | **String** | The id of the staged modification that was approved. Will be null if the change didn&#39;t come from a staged modification. |  [optional] |
|**action** | **String** | The action performed on the field. |  [optional] |
|**attributeName** | **String** | The name of the field or property that has been changed. |  [optional] |
|**previousValue** | [**PropertyValue**](PropertyValue.md) |  |  [optional] |
|**newValue** | [**PropertyValue**](PropertyValue.md) |  |  [optional] |
|**effectiveRange** | [**EffectiveRange**](EffectiveRange.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


