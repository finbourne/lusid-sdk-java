# com.finbourne.lusid.model.CustomEntityResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**entityType** | **String** | The type of custom entity this is. | [default to String]
**version** | [**Version**](Version.md) |  | [default to Version]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**displayName** | **String** | A display label for the custom entity. | [default to String]
**description** | **String** | A description of the custom entity. | [optional] [default to String]
**identifiers** | [**List&lt;CustomEntityId&gt;**](CustomEntityId.md) | The identifiers the custom entity will be upserted with. | [default to List<CustomEntityId>]
**fields** | [**List&lt;CustomEntityField&gt;**](CustomEntityField.md) | The fields that decorate the custom entity. | [default to List<CustomEntityField>]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the custom entity. | [default to List<Relationship>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties that decorate the custom entity. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CustomEntityResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
String EntityType = "example EntityType";
Version Version = new Version();
StagedModificationsInfo StagedModifications = new StagedModificationsInfo();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
List<CustomEntityId> Identifiers = new List<CustomEntityId>();
List<CustomEntityField> Fields = new List<CustomEntityField>();
List<Relationship> Relationships = new List<Relationship>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CustomEntityResponse customEntityResponseInstance = new CustomEntityResponse()
    .Href(Href)
    .EntityType(EntityType)
    .Version(Version)
    .StagedModifications(StagedModifications)
    .DisplayName(DisplayName)
    .Description(Description)
    .Identifiers(Identifiers)
    .Fields(Fields)
    .Relationships(Relationships)
    .Properties(Properties)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
