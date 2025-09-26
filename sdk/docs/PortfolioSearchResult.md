# com.finbourne.lusid.model.PortfolioSearchResult
A list of portfolios.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**type** | **String** | The type of the portfolio. The available values are: Transaction, Reference, DerivedTransaction, SimplePosition | [default to String]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**description** | **String** | The long form description of the portfolio. | [optional] [default to String]
**displayName** | **String** | The name of the portfolio. | [default to String]
**isDerived** | **Boolean** | Whether or not this is a derived portfolio. | [optional] [readonly] [default to Boolean]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio was created. No transactions or constituents can be added to the portfolio before this date. | [default to OffsetDateTime]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**baseCurrency** | **String** | The base currency of the portfolio. | [optional] [default to String]
**properties** | [**List&lt;Property&gt;**](Property.md) | The requested portfolio properties. These will be from the &#39;Portfolio&#39; domain. | [optional] [default to List<Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.PortfolioSearchResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String Type = "example Type";
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String Description = "example Description";
String DisplayName = "example DisplayName";
Boolean IsDerived = true;
OffsetDateTime Created = OffsetDateTime.now();
ResourceId ParentPortfolioId = new ResourceId();
@jakarta.annotation.Nullable String BaseCurrency = "example BaseCurrency";
@jakarta.annotation.Nullable List<Property> Properties = new List<Property>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PortfolioSearchResult portfolioSearchResultInstance = new PortfolioSearchResult()
    .Id(Id)
    .Type(Type)
    .Href(Href)
    .Description(Description)
    .DisplayName(DisplayName)
    .IsDerived(IsDerived)
    .Created(Created)
    .ParentPortfolioId(ParentPortfolioId)
    .BaseCurrency(BaseCurrency)
    .Properties(Properties)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
