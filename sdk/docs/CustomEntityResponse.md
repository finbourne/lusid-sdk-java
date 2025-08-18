

# CustomEntityResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**entityType** | **String** | The type of custom entity this is. |  |
|**version** | [**Version**](Version.md) |  |  |
|**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  |  [optional] |
|**displayName** | **String** | A display label for the custom entity. |  |
|**description** | **String** | A description of the custom entity. |  [optional] |
|**identifiers** | [**List&lt;CustomEntityId&gt;**](CustomEntityId.md) | The identifiers the custom entity will be upserted with. |  |
|**fields** | [**List&lt;CustomEntityField&gt;**](CustomEntityField.md) | The fields that decorate the custom entity. |  |
|**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the custom entity. |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties that decorate the custom entity. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


