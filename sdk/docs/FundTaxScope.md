# com.finbourne.lusid.model.FundTaxScope
The UK chargeable-gains tax scope of a fund at a point in time: the portfolios inside the regime and what the  regime's figures leave out.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**portfolios** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The portfolios within the UK chargeable-gains regime. A fund portfolio is in scope when its own details elect the regime. A NAV type that elects the regime puts its derived portfolio for each fund portfolio in scope. | [default to List<ResourceId>]
**exclusions** | [**FundTaxScopeExclusions**](FundTaxScopeExclusions.md) |  | [default to FundTaxScopeExclusions]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the tax scope was read. | [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the tax scope was read. | [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.FundTaxScope;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
List<ResourceId> Portfolios = new List<ResourceId>();
FundTaxScopeExclusions Exclusions = new FundTaxScopeExclusions();
OffsetDateTime EffectiveAt = OffsetDateTime.now();
OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


FundTaxScope fundTaxScopeInstance = new FundTaxScope()
    .Href(Href)
    .Portfolios(Portfolios)
    .Exclusions(Exclusions)
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
