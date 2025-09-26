# com.finbourne.lusid.model.CustomEntityDefinition
Representation of Custom Entity Definition on LUSID API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**entityTypeName** | **String** | The name provided when the custom entity type was created. This has been prefixed with “~” and returned as “entityType”, which is the identifier for the custom entity type. | [default to String]
**displayName** | **String** | A display label for the custom entity type. | [default to String]
**description** | **String** | A description for the custom entity type. | [optional] [default to String]
**entityType** | **String** | The identifier for the custom entity type, derived from the “entityTypeName” provided on creation. | [default to String]
**fieldSchema** | [**List&lt;CustomEntityFieldDefinition&gt;**](CustomEntityFieldDefinition.md) | The description of the fields on the custom entity type. | [default to List<CustomEntityFieldDefinition>]
**version** | [**Version**](Version.md) |  | [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CustomEntityDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
String EntityTypeName = "example EntityTypeName";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String EntityType = "example EntityType";
List<CustomEntityFieldDefinition> FieldSchema = new List<CustomEntityFieldDefinition>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CustomEntityDefinition customEntityDefinitionInstance = new CustomEntityDefinition()
    .Href(Href)
    .EntityTypeName(EntityTypeName)
    .DisplayName(DisplayName)
    .Description(Description)
    .EntityType(EntityType)
    .FieldSchema(FieldSchema)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
