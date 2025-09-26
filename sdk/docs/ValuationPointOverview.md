# com.finbourne.lusid.model.ValuationPointOverview

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**diaryEntryCode** | **String** | The code for the Valuation Point. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the last Valuation Point. | [default to OffsetDateTime]
**effectiveTo** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the current Valuation Point. | [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The query time of the Valuation Point. Defaults to latest. | [optional] [default to OffsetDateTime]
**type** | **String** | The type of the diary entry. This is &#39;ValuationPoint&#39;. | [default to String]
**status** | **String** | The status of the Valuation Point. Can be &#39;Estimate&#39;, &#39;Candidate&#39; or &#39;Final&#39;. | [default to String]
**gav** | **java.math.BigDecimal** | The Gross Asset Value of the Fund or Share Class at the Valuation Point. This is effectively a summation of all Trial balance entries linked to accounts of types &#39;Asset&#39; and &#39;Liabilities&#39;. | [default to java.math.BigDecimal]
**nav** | **java.math.BigDecimal** | The Net Asset Value of the Fund or Share Class at the Valuation Point. This represents the GAV with any fees applied in the period. | [default to java.math.BigDecimal]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Fee properties. These will be from the &#39;Fee&#39; domain. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ValuationPointOverview;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
String DiaryEntryCode = "example DiaryEntryCode";
OffsetDateTime EffectiveFrom = OffsetDateTime.now();
OffsetDateTime EffectiveTo = OffsetDateTime.now();
OffsetDateTime QueryAsAt = OffsetDateTime.now();
String Type = "example Type";
String Status = "example Status";
java.math.BigDecimal Gav = new java.math.BigDecimal("100.00");
java.math.BigDecimal Nav = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ValuationPointOverview valuationPointOverviewInstance = new ValuationPointOverview()
    .Href(Href)
    .DiaryEntryCode(DiaryEntryCode)
    .EffectiveFrom(EffectiveFrom)
    .EffectiveTo(EffectiveTo)
    .QueryAsAt(QueryAsAt)
    .Type(Type)
    .Status(Status)
    .Gav(Gav)
    .Nav(Nav)
    .Properties(Properties)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
