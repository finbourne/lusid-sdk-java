# com.finbourne.lusid.model.UpsertReferencePortfolioConstituentPropertiesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The updated collection of properties of the constituent. | [optional] [default to Map<String, PerpetualProperty>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.UpsertReferencePortfolioConstituentPropertiesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


UpsertReferencePortfolioConstituentPropertiesResponse upsertReferencePortfolioConstituentPropertiesResponseInstance = new UpsertReferencePortfolioConstituentPropertiesResponse()
    .Href(Href)
    .Version(Version)
    .Properties(Properties)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
