# com.finbourne.lusid.model.UpsertRecDefinitionPropertiesResponse
The properties upserted onto a rec definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The rec definition properties that were upserted. These will be from the &#39;RecDefinition&#39; domain. Properties deleted by the request are not included. | [optional] [default to Map<String, PerpetualProperty>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.UpsertRecDefinitionPropertiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


UpsertRecDefinitionPropertiesResponse upsertRecDefinitionPropertiesResponseInstance = new UpsertRecDefinitionPropertiesResponse()
    .Href(Href)
    .Properties(Properties)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
