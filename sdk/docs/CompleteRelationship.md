# com.finbourne.lusid.model.CompleteRelationship
Representation of a relationship containing details of source and target entities, and both outward and inward descriptions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**relationshipDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**sourceEntity** | [**RelatedEntity**](RelatedEntity.md) |  | [default to RelatedEntity]
**targetEntity** | [**RelatedEntity**](RelatedEntity.md) |  | [default to RelatedEntity]
**outwardDescription** | **String** | Description of the relationship based on relationship definition&#39;s outward description. | [default to String]
**inwardDescription** | **String** | Description of the relationship based on relationship definition&#39;s inward description. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the relationship is valid. | [optional] [default to OffsetDateTime]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime to which the relationship is valid until. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CompleteRelationship;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
ResourceId RelationshipDefinitionId = new ResourceId();
RelatedEntity SourceEntity = new RelatedEntity();
RelatedEntity TargetEntity = new RelatedEntity();
String OutwardDescription = "example OutwardDescription";
String InwardDescription = "example InwardDescription";
OffsetDateTime EffectiveFrom = OffsetDateTime.now();
OffsetDateTime EffectiveUntil = OffsetDateTime.now();


CompleteRelationship completeRelationshipInstance = new CompleteRelationship()
    .Href(Href)
    .Version(Version)
    .RelationshipDefinitionId(RelationshipDefinitionId)
    .SourceEntity(SourceEntity)
    .TargetEntity(TargetEntity)
    .OutwardDescription(OutwardDescription)
    .InwardDescription(InwardDescription)
    .EffectiveFrom(EffectiveFrom)
    .EffectiveUntil(EffectiveUntil);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
