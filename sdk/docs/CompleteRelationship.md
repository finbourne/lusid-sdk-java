

# CompleteRelationship

Representation of a relationship containing details of source and target entities, and both outward and inward descriptions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**relationshipDefinitionId** | [**ResourceId**](ResourceId.md) |  |  |
|**sourceEntity** | [**RelatedEntity**](RelatedEntity.md) |  |  |
|**targetEntity** | [**RelatedEntity**](RelatedEntity.md) |  |  |
|**outwardDescription** | **String** | Description of the relationship based on relationship definition&#39;s outward description. |  |
|**inwardDescription** | **String** | Description of the relationship based on relationship definition&#39;s inward description. |  |
|**effectiveFrom** | **OffsetDateTime** | The effective datetime from which the relationship is valid. |  [optional] |
|**effectiveUntil** | **OffsetDateTime** | The effective datetime to which the relationship is valid until. |  [optional] |



