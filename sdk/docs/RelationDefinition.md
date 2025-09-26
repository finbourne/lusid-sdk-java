# com.finbourne.lusid.model.RelationDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**relationDefinitionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**sourceEntityDomain** | **String** | The entity domain of the source entity object. | [optional] [default to String]
**targetEntityDomain** | **String** | The entity domain of the target entity object. | [optional] [default to String]
**displayName** | **String** | The display name of the relation. | [optional] [default to String]
**outwardDescription** | **String** | The description to relate source entity object and target entity object | [optional] [default to String]
**inwardDescription** | **String** | The description to relate target entity object and source entity object | [optional] [default to String]
**lifeTime** | **String** | Describes how the relations can change over time, allowed values are \&quot;Perpetual\&quot; and \&quot;TimeVariant\&quot; | [optional] [default to String]
**constraintStyle** | **String** | Describes the uniqueness and cardinality for relations with a specific source entity object and relations under this definition. Allowed values are \&quot;Property\&quot; and \&quot;Collection\&quot;, defaults to \&quot;Collection\&quot; if not specified. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.RelationDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version Version = new Version();
ResourceId RelationDefinitionId = new ResourceId();
@jakarta.annotation.Nullable String SourceEntityDomain = "example SourceEntityDomain";
@jakarta.annotation.Nullable String TargetEntityDomain = "example TargetEntityDomain";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String OutwardDescription = "example OutwardDescription";
@jakarta.annotation.Nullable String InwardDescription = "example InwardDescription";
@jakarta.annotation.Nullable String LifeTime = "example LifeTime";
@jakarta.annotation.Nullable String ConstraintStyle = "example ConstraintStyle";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


RelationDefinition relationDefinitionInstance = new RelationDefinition()
    .Version(Version)
    .RelationDefinitionId(RelationDefinitionId)
    .SourceEntityDomain(SourceEntityDomain)
    .TargetEntityDomain(TargetEntityDomain)
    .DisplayName(DisplayName)
    .OutwardDescription(OutwardDescription)
    .InwardDescription(InwardDescription)
    .LifeTime(LifeTime)
    .ConstraintStyle(ConstraintStyle)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
