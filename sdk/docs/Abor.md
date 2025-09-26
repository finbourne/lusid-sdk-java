# com.finbourne.lusid.model.Abor
An Abor entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Abor. | [optional] [default to String]
**description** | **String** | The description for the Abor. | [optional] [default to String]
**portfolioIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The list with the portfolio ids which are part of the Abor. Note: These must all have the same base currency. | [default to List<PortfolioEntityId>]
**aborConfigurationId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Abor. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**baseCurrency** | **String** | The base currency of the abor based on contained portfolio base currencies. | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Abor;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
List<PortfolioEntityId> PortfolioIds = new List<PortfolioEntityId>();
ResourceId AborConfigurationId = new ResourceId();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Version Version = new Version();
@jakarta.annotation.Nullable String BaseCurrency = "example BaseCurrency";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Abor aborInstance = new Abor()
    .Href(Href)
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .PortfolioIds(PortfolioIds)
    .AborConfigurationId(AborConfigurationId)
    .Properties(Properties)
    .Version(Version)
    .BaseCurrency(BaseCurrency)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
