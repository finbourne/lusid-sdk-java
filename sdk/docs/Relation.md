# com.finbourne.lusid.model.Relation
Representation of a Relation between a requested entity with the stated entity as RelationedEntityId

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**relationDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**relatedEntityId** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**traversalDirection** | **String** |  | [default to String]
**traversalDescription** | **String** |  | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.Relation;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version Version = new Version();
ResourceId RelationDefinitionId = new ResourceId();
Map<String, String> RelatedEntityId = new Map<String, String>();
String TraversalDirection = "example TraversalDirection";
String TraversalDescription = "example TraversalDescription";
OffsetDateTime EffectiveFrom = OffsetDateTime.now();


Relation relationInstance = new Relation()
    .Version(Version)
    .RelationDefinitionId(RelationDefinitionId)
    .RelatedEntityId(RelatedEntityId)
    .TraversalDirection(TraversalDirection)
    .TraversalDescription(TraversalDescription)
    .EffectiveFrom(EffectiveFrom);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
