# com.finbourne.lusid.model.Relationship
Representation of a Relationship between a requested entity with the stated entity as RelatedEntityId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**relationshipDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**relatedEntity** | [**RelatedEntity**](RelatedEntity.md) |  | [default to RelatedEntity]
**traversalDirection** | **String** | Direction of relationship between the requested entity and related entity. This can be &#39;In&#39; or &#39;Out&#39;. Read more about relationships traversal direction in LUSID Knowledge Base here https://support.lusid.com/knowledgebase/article/KA-01679. | [default to String]
**traversalDescription** | **String** | Description of the relationship based on relationship&#39;s traversal direction. If &#39;TraversalDirection&#39; is &#39;Out&#39;, this description would be &#39;OutwardDescription&#39; from the associated relationship definition. If &#39;TraversalDirection&#39; is &#39;In&#39;, this description would be &#39;InwardDescription&#39; from the associated relationship definition. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the relationship is valid. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime until which the relationship is valid. If no future deletions are present or an effective until has not been set for the relationship, this will be indefinite and represented by the maximum date. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.Relationship;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version Version = new Version();
ResourceId RelationshipDefinitionId = new ResourceId();
RelatedEntity RelatedEntity = new RelatedEntity();
String TraversalDirection = "example TraversalDirection";
String TraversalDescription = "example TraversalDescription";
OffsetDateTime EffectiveFrom = OffsetDateTime.now();
OffsetDateTime EffectiveUntil = OffsetDateTime.now();


Relationship relationshipInstance = new Relationship()
    .Version(Version)
    .RelationshipDefinitionId(RelationshipDefinitionId)
    .RelatedEntity(RelatedEntity)
    .TraversalDirection(TraversalDirection)
    .TraversalDescription(TraversalDescription)
    .EffectiveFrom(EffectiveFrom)
    .EffectiveUntil(EffectiveUntil);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
