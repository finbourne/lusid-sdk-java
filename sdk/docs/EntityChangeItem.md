

# EntityChangeItem

Defines a change that occured for an entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asAtModified** | **OffsetDateTime** | The date/time of the change. |  |
|**userIdModified** | **String** | The unique identifier of the user that made the change. |  |
|**requestIdModified** | **String** | The unique identifier of the request that the changes were part of. |  |
|**asAtVersionNumber** | **Integer** | The version number for the entity (the entity was created at version 1). This may refer to the version number of a changed related entity, not a change for the entity itself. |  |
|**action** | **String** | The action performed on the entity. |  |
|**actionDescription** | **String** | Description of the action performed on the entity. |  |
|**attributeName** | **String** | The name of the field or property that has been changed. |  [optional] |
|**previousValue** | **Object** | The value of the attribute prior to the change. |  [optional] |
|**newValue** | **Object** | The value of the attribute following the change. |  [optional] |
|**effectiveFrom** | **OffsetDateTime** | The effective datetime from which the field&#39;s new value is valid. |  [optional] |
|**effectiveUntil** | **OffsetDateTime** | The effective datetime until which the field&#39;s new value is valid. |  [optional] |
|**detail** | **Map&lt;String, String&gt;** | Information about the particular instance of the ChangeItem (supplied information depends on the type of Action). |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


