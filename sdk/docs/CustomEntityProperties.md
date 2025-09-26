# com.finbourne.lusid.model.CustomEntityProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [default to URI]
**entityType** | **String** | The type of custom entity this is. | [default to String]
**identifiers** | [**List&lt;CustomEntityId&gt;**](CustomEntityId.md) | The identifiers the custom entity will be upserted with. | [default to List<CustomEntityId>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties that decorate the custom entity. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CustomEntityProperties;
import java.util.*;
import java.lang.System;
import java.net.URI;

URI Href = URI.create("http://example.com/Href");
String EntityType = "example EntityType";
List<CustomEntityId> Identifiers = new List<CustomEntityId>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CustomEntityProperties customEntityPropertiesInstance = new CustomEntityProperties()
    .Href(Href)
    .EntityType(EntityType)
    .Identifiers(Identifiers)
    .Properties(Properties)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
