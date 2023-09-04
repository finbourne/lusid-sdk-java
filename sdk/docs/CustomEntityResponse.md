

# CustomEntityResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**entityType** | **String** | The type of custom entity this is. |  |
|**version** | [**Version**](Version.md) |  |  |
|**displayName** | **String** | A display label for the custom entity. |  |
|**description** | **String** | A description of the custom entity. |  [optional] |
|**identifiers** | [**List&lt;CustomEntityId&gt;**](CustomEntityId.md) | The identifiers the custom entity will be upserted with. |  |
|**fields** | [**List&lt;CustomEntityField&gt;**](CustomEntityField.md) | The fields that decorate the custom entity. |  |
|**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the custom entity. |  |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



