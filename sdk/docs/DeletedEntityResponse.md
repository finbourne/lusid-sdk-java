

# DeletedEntityResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**effectiveFrom** | **OffsetDateTime** | The effective datetime at which the deletion became valid. May be null in the case where multiple date times are applicable. |  [optional] |
|**asAt** | **OffsetDateTime** | The asAt datetime at which the deletion was committed to LUSID. |  |
|**entityType** | **String** | The type of the entity that the deleted response applies to. |  [optional] |
|**entityUniqueId** | **String** | The unique Id of the entity that the deleted response applies to. |  [optional] |
|**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


