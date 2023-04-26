

# Relationship

Representation of a Relationship between a requested entity with the stated entity as RelatedEntityId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  |  [optional]
**relationshipDefinitionId** | [**ResourceId**](ResourceId.md) |  | 
**relatedEntity** | [**RelatedEntity**](RelatedEntity.md) |  | 
**traversalDirection** | **String** | Direction of relationship between the requested entity and related entity. This can be &#39;In&#39; or &#39;Out&#39;. Read more about relationships traversal direction in LUSID Knowledge Base here https://support.lusid.com/knowledgebase/article/KA-01679. | 
**traversalDescription** | **String** | Description of the relationship based on relationship&#39;s traversal direction. If &#39;TraversalDirection&#39; is &#39;Out&#39;, this description would be &#39;OutwardDescription&#39; from the associated relationship definition. If &#39;TraversalDirection&#39; is &#39;In&#39;, this description would be &#39;InwardDescription&#39; from the associated relationship definition. | 
**effectiveFrom** | **OffsetDateTime** | The effective datetime from which the relationship is valid. |  [optional]
**effectiveUntil** | **OffsetDateTime** | The effective datetime until which the relationship is valid. If no future deletions are present or an effective until has not been set for the relationship, this will be indefinite and represented by the maximum date. |  [optional]



