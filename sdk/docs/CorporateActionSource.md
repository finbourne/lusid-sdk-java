# com.finbourne.lusid.model.CorporateActionSource
A corporate action source

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**displayName** | **String** | The name of the corporate action source | [optional] [default to String]
**description** | **String** | The description of the corporate action source | [optional] [default to String]
**instrumentScopes** | **List&lt;String&gt;** | The list of instrument scopes used as the scope resolution strategy when resolving instruments of upserted corporate actions. | [optional] [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CorporateActionSource;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
Version Version = new Version();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<String> InstrumentScopes = new List<String>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CorporateActionSource corporateActionSourceInstance = new CorporateActionSource()
    .Href(Href)
    .Id(Id)
    .Version(Version)
    .DisplayName(DisplayName)
    .Description(Description)
    .InstrumentScopes(InstrumentScopes)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
