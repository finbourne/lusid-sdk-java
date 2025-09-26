# com.finbourne.lusid.model.RelationshipDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**relationshipDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**sourceEntityType** | **String** | The entity type of the source entity object. | [default to String]
**targetEntityType** | **String** | The entity type of the target entity object. | [default to String]
**displayName** | **String** | The display name of the relationship. | [default to String]
**outwardDescription** | **String** | The description to relate source entity object and target entity object | [default to String]
**inwardDescription** | **String** | The description to relate target entity object and source entity object | [default to String]
**lifeTime** | **String** | Describes how the relationships can change over time. | [default to String]
**relationshipCardinality** | **String** | Describes the cardinality of the relationship between source entity and target entity. | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.RelationshipDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version Version = new Version();
ResourceId RelationshipDefinitionId = new ResourceId();
String SourceEntityType = "example SourceEntityType";
String TargetEntityType = "example TargetEntityType";
String DisplayName = "example DisplayName";
String OutwardDescription = "example OutwardDescription";
String InwardDescription = "example InwardDescription";
String LifeTime = "example LifeTime";
String RelationshipCardinality = "example RelationshipCardinality";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


RelationshipDefinition relationshipDefinitionInstance = new RelationshipDefinition()
    .Version(Version)
    .RelationshipDefinitionId(RelationshipDefinitionId)
    .SourceEntityType(SourceEntityType)
    .TargetEntityType(TargetEntityType)
    .DisplayName(DisplayName)
    .OutwardDescription(OutwardDescription)
    .InwardDescription(InwardDescription)
    .LifeTime(LifeTime)
    .RelationshipCardinality(RelationshipCardinality)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
