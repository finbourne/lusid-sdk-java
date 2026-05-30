# com.finbourne.lusid.model.ValuationPoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**valuationPointCode** | **String** | The code of the Valuation Point. | [optional] [default to String]
**variant** | **String** | The Variant name for the Valuation Point. | [optional] [default to String]
**name** | **String** | Identifiable Name assigned to the Valuation Point. | [optional] [default to String]
**status** | **String** | The status of the Valuation Point. Available values: Undefined, Estimate, Final, Candidate, Unofficial. | [default to String]
**applyClearDown** | **Boolean** | Indicates whether a clear down was applied when the Valuation Point was created. | [optional] [default to Boolean]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the Valuation Point. | [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time of the Valuation Point. This is the AsAt time that will be used when requests are made using the entry. | [optional] [default to OffsetDateTime]
**holdingsAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time used for building holdings in the Valuation Point. | [optional] [default to OffsetDateTime]
**valuationAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time used for performing valuations in the Valuation Point. | [optional] [default to OffsetDateTime]
**previous** | [**PreviousValuationPoint**](PreviousValuationPoint.md) |  | [optional] [default to PreviousValuationPoint]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Valuation Point properties. These are from the &#39;DiaryEntry&#39; domain. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ValuationPoint;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String ValuationPointCode = "example ValuationPointCode";
@jakarta.annotation.Nullable String Variant = "example Variant";
@jakarta.annotation.Nullable String Name = "example Name";
String Status = "example Status";
Boolean ApplyClearDown = true;
OffsetDateTime EffectiveAt = OffsetDateTime.now();
OffsetDateTime QueryAsAt = OffsetDateTime.now();
OffsetDateTime HoldingsAsAt = OffsetDateTime.now();
OffsetDateTime ValuationAsAt = OffsetDateTime.now();
PreviousValuationPoint Previous = new PreviousValuationPoint();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ValuationPoint valuationPointInstance = new ValuationPoint()
    .Href(Href)
    .ValuationPointCode(ValuationPointCode)
    .Variant(Variant)
    .Name(Name)
    .Status(Status)
    .ApplyClearDown(ApplyClearDown)
    .EffectiveAt(EffectiveAt)
    .QueryAsAt(QueryAsAt)
    .HoldingsAsAt(HoldingsAsAt)
    .ValuationAsAt(ValuationAsAt)
    .Previous(Previous)
    .Properties(Properties)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
