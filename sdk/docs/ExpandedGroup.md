# com.finbourne.lusid.model.ExpandedGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the portfolio group. | [default to String]
**description** | **String** | The long form description of the portfolio group. | [optional] [default to String]
**values** | [**List&lt;CompletePortfolio&gt;**](CompletePortfolio.md) | The collection of resource identifiers for the portfolios contained in the portfolio group. | [optional] [default to List<CompletePortfolio>]
**subGroups** | [**List&lt;ExpandedGroup&gt;**](ExpandedGroup.md) | The collection of resource identifiers for the portfolio groups contained in the portfolio group as sub groups. | [optional] [default to List<ExpandedGroup>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ExpandedGroup;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<CompletePortfolio> Values = new List<CompletePortfolio>();
@jakarta.annotation.Nullable List<ExpandedGroup> SubGroups = new List<ExpandedGroup>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ExpandedGroup expandedGroupInstance = new ExpandedGroup()
    .Href(Href)
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .Values(Values)
    .SubGroups(SubGroups)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
