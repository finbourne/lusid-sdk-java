

# ChangeHistory

A group of changes made by the same person at the same time.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | The unique identifier of the user that made the change. | 
**modifiedAsAt** | **OffsetDateTime** | The date/time of the change. | 
**requestId** | **String** | The unique identifier of the request that the changes were part of. | 
**action** | [**ActionEnum**](#ActionEnum) | The action performed on the transaction, either created, updated, or deleted. The available values are: Create, Update, Delete | 
**changes** | [**List&lt;ChangeItem&gt;**](ChangeItem.md) | The collection of changes that were made. | 
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



## Enum: ActionEnum

Name | Value
---- | -----
CREATE | &quot;Create&quot;
UPDATE | &quot;Update&quot;
DELETE | &quot;Delete&quot;



