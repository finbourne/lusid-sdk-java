# com.finbourne.lusid.model.CompletePortfolio

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**description** | **String** | The long form description of the portfolio. | [optional] [default to String]
**displayName** | **String** | The name of the portfolio. | [optional] [default to String]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio was created. No transactions or constituents can be added to the portfolio before this date. | [optional] [default to OffsetDateTime]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**isDerived** | **Boolean** | Whether or not this is a derived portfolio. | [optional] [readonly] [default to Boolean]
**type** | **String** | The type of the portfolio. The available values are: Transaction, Reference, DerivedTransaction, SimplePosition | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [default to Version]
**properties** | [**List&lt;Property&gt;**](Property.md) | The requested portfolio properties. These will be from the &#39;Portfolio&#39; domain. | [optional] [default to List<Property>]
**baseCurrency** | **String** | If the portfolio is a transaction portfolio or derived transaction portfolio, this is the base currency of the portfolio. | [optional] [default to String]
**subHoldingKeys** | **List&lt;String&gt;** | The sub holding key properties configured for the portfolio | [optional] [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CompletePortfolio;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
OffsetDateTime Created = OffsetDateTime.now();
ResourceId ParentPortfolioId = new ResourceId();
Boolean IsDerived = true;
String Type = "example Type";
Version Version = new Version();
@jakarta.annotation.Nullable List<Property> Properties = new List<Property>();
@jakarta.annotation.Nullable String BaseCurrency = "example BaseCurrency";
@jakarta.annotation.Nullable List<String> SubHoldingKeys = new List<String>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CompletePortfolio completePortfolioInstance = new CompletePortfolio()
    .Id(Id)
    .Href(Href)
    .Description(Description)
    .DisplayName(DisplayName)
    .Created(Created)
    .ParentPortfolioId(ParentPortfolioId)
    .IsDerived(IsDerived)
    .Type(Type)
    .Version(Version)
    .Properties(Properties)
    .BaseCurrency(BaseCurrency)
    .SubHoldingKeys(SubHoldingKeys)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
