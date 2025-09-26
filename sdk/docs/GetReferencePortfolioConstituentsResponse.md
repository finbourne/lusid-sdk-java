# com.finbourne.lusid.model.GetReferencePortfolioConstituentsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**weightType** | **String** | The available values are: Static, Floating, Periodical | [default to String]
**periodType** | **String** | The available values are: Daily, Weekly, Monthly, Quarterly, Annually | [optional] [default to String]
**periodCount** | **Integer** |  | [optional] [default to Integer]
**constituents** | [**List&lt;ReferencePortfolioConstituent&gt;**](ReferencePortfolioConstituent.md) | Set of constituents (instrument/weight pairings) | [default to List<ReferencePortfolioConstituent>]
**href** | [**URI**](URI.md) | The Uri that returns the same result as the original request,  but may include resolved as at time(s). | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GetReferencePortfolioConstituentsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveFrom = OffsetDateTime.now();
String WeightType = "example WeightType";
@jakarta.annotation.Nullable String PeriodType = "example PeriodType";
@jakarta.annotation.Nullable Integer PeriodCount = new Integer("100.00");
List<ReferencePortfolioConstituent> Constituents = new List<ReferencePortfolioConstituent>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GetReferencePortfolioConstituentsResponse getReferencePortfolioConstituentsResponseInstance = new GetReferencePortfolioConstituentsResponse()
    .EffectiveFrom(EffectiveFrom)
    .WeightType(WeightType)
    .PeriodType(PeriodType)
    .PeriodCount(PeriodCount)
    .Constituents(Constituents)
    .Href(Href)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
