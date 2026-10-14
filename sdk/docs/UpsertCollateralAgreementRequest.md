# com.finbourne.lusid.model.UpsertCollateralAgreementRequest
The request used to create or update a Collateral Agreement. The scope and code come from the route.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**counterpartyId** | [**CounterpartyIdentifier**](CounterpartyIdentifier.md) |  | [default to CounterpartyIdentifier]
**applicabilityFilter** | **String** | A filter selecting the portfolios and trades the agreement covers. Checked for structure only when the agreement is stored. | [default to String]
**baseCurrency** | **String** | The currency margin is calculated and called in. Filterable. | [default to String]
**cutLabel** | **String** | The cut label naming the market data that margin is valued at. | [default to String]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**minimumTransferAmount** | **java.math.BigDecimal** | The smallest margin movement that is called. Optional. | [optional] [default to java.math.BigDecimal]
**rounding** | [**MarginRounding**](MarginRounding.md) |  | [default to MarginRounding]
**settlementLag** | [**MarginSettlementLag**](MarginSettlementLag.md) |  | [default to MarginSettlementLag]
**matchTolerance** | **java.math.BigDecimal** | The tolerance within which our margin figure and the counterparty&#39;s are considered to match. Optional. | [optional] [default to java.math.BigDecimal]
**variationMargin** | [**List&lt;MarginItem&gt;**](MarginItem.md) | The variation margin arrangements under the agreement. | [optional] [default to List<MarginItem>]
**initialMargin** | [**List&lt;MarginItem&gt;**](MarginItem.md) | The initial margin arrangements under the agreement. | [optional] [default to List<MarginItem>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties to decorate onto the Collateral Agreement. Filterable. | [optional] [default to Map<String, Property>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime or cut label from which the change applies. Defaults to the current LUSID system datetime if not specified. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.UpsertCollateralAgreementRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

CounterpartyIdentifier CounterpartyId = new CounterpartyIdentifier();
String ApplicabilityFilter = "example ApplicabilityFilter";
String BaseCurrency = "example BaseCurrency";
String CutLabel = "example CutLabel";
ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable java.math.BigDecimal MinimumTransferAmount = new java.math.BigDecimal("100.00");
MarginRounding Rounding = new MarginRounding();
MarginSettlementLag SettlementLag = new MarginSettlementLag();
@jakarta.annotation.Nullable java.math.BigDecimal MatchTolerance = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<MarginItem> VariationMargin = new List<MarginItem>();
@jakarta.annotation.Nullable List<MarginItem> InitialMargin = new List<MarginItem>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();


UpsertCollateralAgreementRequest upsertCollateralAgreementRequestInstance = new UpsertCollateralAgreementRequest()
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
    .Properties(Properties)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
