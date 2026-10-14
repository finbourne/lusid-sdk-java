# com.finbourne.lusid.model.CollateralAgreement
A collateral agreement: who it covers, how exposure is valued, and the variation and initial margin  arrangements collateral is called and returned under.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**counterpartyId** | [**CounterpartyIdentifier**](CounterpartyIdentifier.md) |  | [optional] [default to CounterpartyIdentifier]
**applicabilityFilter** | **String** | A filter selecting the portfolios and trades the agreement covers. Checked for structure only when the agreement is stored. | [optional] [default to String]
**baseCurrency** | **String** | The currency margin is calculated and called in. Filterable. | [optional] [default to String]
**cutLabel** | **String** | The cut label naming the market data that margin is valued at. | [optional] [default to String]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**minimumTransferAmount** | **java.math.BigDecimal** | The smallest margin movement that is called. Optional. | [optional] [default to java.math.BigDecimal]
**rounding** | [**MarginRounding**](MarginRounding.md) |  | [optional] [default to MarginRounding]
**settlementLag** | [**MarginSettlementLag**](MarginSettlementLag.md) |  | [optional] [default to MarginSettlementLag]
**matchTolerance** | **java.math.BigDecimal** | The tolerance within which our margin figure and the counterparty&#39;s are considered to match. Optional. | [optional] [default to java.math.BigDecimal]
**variationMargin** | [**List&lt;MarginItem&gt;**](MarginItem.md) | The variation margin arrangements under the agreement. | [optional] [default to List<MarginItem>]
**initialMargin** | [**List&lt;MarginItem&gt;**](MarginItem.md) | The initial margin arrangements under the agreement. | [optional] [default to List<MarginItem>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties to decorate onto the Collateral Agreement. Filterable. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CollateralAgreement;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
CounterpartyIdentifier CounterpartyId = new CounterpartyIdentifier();
@jakarta.annotation.Nullable String ApplicabilityFilter = "example ApplicabilityFilter";
@jakarta.annotation.Nullable String BaseCurrency = "example BaseCurrency";
@jakarta.annotation.Nullable String CutLabel = "example CutLabel";
ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable java.math.BigDecimal MinimumTransferAmount = new java.math.BigDecimal("100.00");
MarginRounding Rounding = new MarginRounding();
MarginSettlementLag SettlementLag = new MarginSettlementLag();
@jakarta.annotation.Nullable java.math.BigDecimal MatchTolerance = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<MarginItem> VariationMargin = new List<MarginItem>();
@jakarta.annotation.Nullable List<MarginItem> InitialMargin = new List<MarginItem>();
Version Version = new Version();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CollateralAgreement collateralAgreementInstance = new CollateralAgreement()
    .Href(Href)
    .Id(Id)
    .CounterpartyId(CounterpartyId)
    .ApplicabilityFilter(ApplicabilityFilter)
    .BaseCurrency(BaseCurrency)
    .CutLabel(CutLabel)
    .RecipeId(RecipeId)
    .MinimumTransferAmount(MinimumTransferAmount)
    .Rounding(Rounding)
    .SettlementLag(SettlementLag)
    .MatchTolerance(MatchTolerance)
    .VariationMargin(VariationMargin)
    .InitialMargin(InitialMargin)
    .Version(Version)
    .Properties(Properties)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
