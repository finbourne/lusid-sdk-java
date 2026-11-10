# com.finbourne.lusid.model.TaxCostRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**taxCostRecordCode** | **String** | The code of the Tax Cost Record, unique within the Fund. | [optional] [default to String]
**portfolioScope** | **String** | The scope of the portfolio the holding belongs to. | [default to String]
**portfolioCode** | **String** | The code of the portfolio the holding belongs to. | [default to String]
**instrumentIdentifier** | **String** | The LUSID instrument identifier (LUID) of the holding the tax cost applies to. | [default to String]
**navTypeCode** | **String** | The code of the NAV type the tax cost applies to. Optional; omit for the fund&#39;s primary NAV type. | [optional] [default to String]
**taxCost** | **java.math.BigDecimal** | The tax cost of the holding at the effective period end, in the fund&#39;s base currency. | [default to java.math.BigDecimal]
**carriedForwardAmount** | **java.math.BigDecimal** | The amount carried forward into the next tax period, in the fund&#39;s base currency. | [default to java.math.BigDecimal]
**effectivePeriodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end date of the tax period the record applies to. | [default to OffsetDateTime]
**sourceValuationPointId** | **String** | The identifier of the valuation point the record was derived from. Optional; omit for externally supplied records. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.TaxCostRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String TaxCostRecordCode = "example TaxCostRecordCode";
String PortfolioScope = "example PortfolioScope";
String PortfolioCode = "example PortfolioCode";
String InstrumentIdentifier = "example InstrumentIdentifier";
@jakarta.annotation.Nullable String NavTypeCode = "example NavTypeCode";
java.math.BigDecimal TaxCost = new java.math.BigDecimal("100.00");
java.math.BigDecimal CarriedForwardAmount = new java.math.BigDecimal("100.00");
OffsetDateTime EffectivePeriodEnd = OffsetDateTime.now();
@jakarta.annotation.Nullable String SourceValuationPointId = "example SourceValuationPointId";
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TaxCostRecord taxCostRecordInstance = new TaxCostRecord()
    .Href(Href)
    .TaxCostRecordCode(TaxCostRecordCode)
    .PortfolioScope(PortfolioScope)
    .PortfolioCode(PortfolioCode)
    .InstrumentIdentifier(InstrumentIdentifier)
    .NavTypeCode(NavTypeCode)
    .TaxCost(TaxCost)
    .CarriedForwardAmount(CarriedForwardAmount)
    .EffectivePeriodEnd(EffectivePeriodEnd)
    .SourceValuationPointId(SourceValuationPointId)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
