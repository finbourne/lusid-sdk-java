# com.finbourne.lusid.model.CompleteRelation
Representation of a relation containing details of source and target entities, and both outward and inward descriptions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**relationDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**sourceEntityId** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**targetEntityId** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**outwardDescription** | **String** |  | [default to String]
**inwardDescription** | **String** |  | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CompleteRelation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
ResourceId RelationDefinitionId = new ResourceId();
Map<String, String> SourceEntityId = new Map<String, String>();
Map<String, String> TargetEntityId = new Map<String, String>();
String OutwardDescription = "example OutwardDescription";
String InwardDescription = "example InwardDescription";
OffsetDateTime EffectiveFrom = OffsetDateTime.now();


CompleteRelation completeRelationInstance = new CompleteRelation()
    .Href(Href)
    .Version(Version)
    .RelationDefinitionId(RelationDefinitionId)
    .SourceEntityId(SourceEntityId)
    .TargetEntityId(TargetEntityId)
    .OutwardDescription(OutwardDescription)
    .InwardDescription(InwardDescription)
    .EffectiveFrom(EffectiveFrom);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
