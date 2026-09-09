# com.finbourne.lusid.model.CurrencyGroupResponse
A currency group: a set of related currencies sharing a major unit (e.g. GBP with minor unit GBX at 100:1).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the currency group. This uniquely identifies the currency group within the tenant. | [optional] [default to String]
**displayName** | **String** | The name of the currency group. | [optional] [default to String]
**description** | **String** | A description for the currency group. | [optional] [default to String]
**majorUnitCurrency** | **String** | The three-letter, case-sensitive currency code of the group&#39;s major unit, e.g. GBP for the sterling group. | [optional] [default to String]
**circulationDomain** | **String** | The domain in which the group&#39;s currencies circulate, e.g. an ISO 3166 country code. | [optional] [default to String]
**minorUnits** | [**List&lt;CurrencyGroupMinorUnit&gt;**](CurrencyGroupMinorUnit.md) | The minor unit currencies belonging to this currency group. | [optional] [default to List<CurrencyGroupMinorUnit>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource. | [optional] [default to URI]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CurrencyGroupResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Code = "example Code";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String MajorUnitCurrency = "example MajorUnitCurrency";
@jakarta.annotation.Nullable String CirculationDomain = "example CirculationDomain";
@jakarta.annotation.Nullable List<CurrencyGroupMinorUnit> MinorUnits = new List<CurrencyGroupMinorUnit>();
Version Version = new Version();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CurrencyGroupResponse currencyGroupResponseInstance = new CurrencyGroupResponse()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .MajorUnitCurrency(MajorUnitCurrency)
    .CirculationDomain(CirculationDomain)
    .MinorUnits(MinorUnits)
    .Version(Version)
    .Href(Href)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
