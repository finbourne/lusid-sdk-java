# com.finbourne.lusid.model.PortfolioGroupSearchResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the portfolio group. | [default to String]
**description** | **String** | The long form description of the portfolio group. | [optional] [default to String]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio group was created. No portfolios or sub groups can be added to the group before this date. | [optional] [default to OffsetDateTime]
**portfolios** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The collection of resource identifiers for the portfolios contained in the portfolio group. | [optional] [default to List<ResourceId>]
**subGroups** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The collection of resource identifiers for the portfolio groups contained in the portfolio group as sub groups. | [optional] [default to List<ResourceId>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.PortfolioGroupSearchResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
OffsetDateTime Created = OffsetDateTime.now();
@jakarta.annotation.Nullable List<ResourceId> Portfolios = new List<ResourceId>();
@jakarta.annotation.Nullable List<ResourceId> SubGroups = new List<ResourceId>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PortfolioGroupSearchResult portfolioGroupSearchResultInstance = new PortfolioGroupSearchResult()
    .Href(Href)
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .Created(Created)
    .Portfolios(Portfolios)
    .SubGroups(SubGroups)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
