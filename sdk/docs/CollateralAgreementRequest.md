# com.finbourne.lusid.model.CollateralAgreementRequest
The request used to create a Collateral Agreement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Collateral Agreement. | [default to String]
**counterpartyId** | [**CounterpartyIdentifier**](CounterpartyIdentifier.md) |  | [default to CounterpartyIdentifier]
**applicabilityFilter** | **String** | A filter selecting the portfolios and trades the agreement covers. Checked for structure only when the agreement is stored. | [default to String]
**baseCurrency** | **String** | The currency margin is calculated and called in. Filterable. | [default to String]
**cutLabel** | **String** | The cut label naming the market data that margin is valued at. | [default to String]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**minimumTransferAmount** | **java.math.BigDecimal** | The smallest margin movement that is called. Optional. | [optional] [default to java.math.BigDecimal]
**rounding** | [**MarginRounding**](MarginRounding.md) |  | [default to MarginRounding]
**settlementLag** | [**MarginSettlementLag**](MarginSettlementLag.md) |  | [default to MarginSettlementLag]
**matchTolerance** | **java.math.BigDecimal** | The tolerance within which our margin figure and the counterparty&#39;s are considered to match. Optional. | [optional] [default to java.math.BigDecimal]
**funding** | [**CollateralFundingTerms**](CollateralFundingTerms.md) |  | [optional] [default to CollateralFundingTerms]
**optimisation** | [**CollateralOptimisationTerms**](CollateralOptimisationTerms.md) |  | [optional] [default to CollateralOptimisationTerms]
**variationMargin** | [**List&lt;MarginItem&gt;**](MarginItem.md) | The variation margin arrangements under the agreement. | [optional] [default to List<MarginItem>]
**initialMargin** | [**List&lt;MarginItem&gt;**](MarginItem.md) | The initial margin arrangements under the agreement. | [optional] [default to List<MarginItem>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties to decorate onto the Collateral Agreement. Filterable. | [optional] [default to Map<String, Property>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the Collateral Agreement applies. Defaults to the beginning of time if not specified, so that the agreement is visible at every effective datetime. | [optional] [default to OffsetDateTime]
**notificationCutLabel** | **String** | The cut label giving the time of day by which collateral we deliver under a margin call must settle. Each run resolves it on the business date and records it as the call&#39;s deadline; the allocation excludes assets that cannot settle by it. Optional. | [optional] [default to String]
**returnNotificationCutLabel** | **String** | The cut label giving the time of day by which collateral the counterparty delivers, or returns to us, must settle. Recorded as the deadline of the calls they post under. Optional. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CollateralAgreementRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
CounterpartyIdentifier CounterpartyId = new CounterpartyIdentifier();
String ApplicabilityFilter = "example ApplicabilityFilter";
String BaseCurrency = "example BaseCurrency";
String CutLabel = "example CutLabel";
ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable java.math.BigDecimal MinimumTransferAmount = new java.math.BigDecimal("100.00");
MarginRounding Rounding = new MarginRounding();
MarginSettlementLag SettlementLag = new MarginSettlementLag();
@jakarta.annotation.Nullable java.math.BigDecimal MatchTolerance = new java.math.BigDecimal("100.00");
CollateralFundingTerms Funding = new CollateralFundingTerms();
CollateralOptimisationTerms Optimisation = new CollateralOptimisationTerms();
@jakarta.annotation.Nullable List<MarginItem> VariationMargin = new List<MarginItem>();
@jakarta.annotation.Nullable List<MarginItem> InitialMargin = new List<MarginItem>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String NotificationCutLabel = "example NotificationCutLabel";
@jakarta.annotation.Nullable String ReturnNotificationCutLabel = "example ReturnNotificationCutLabel";


CollateralAgreementRequest collateralAgreementRequestInstance = new CollateralAgreementRequest()
    .Code(Code)
    .CounterpartyId(CounterpartyId)
    .ApplicabilityFilter(ApplicabilityFilter)
    .BaseCurrency(BaseCurrency)
    .CutLabel(CutLabel)
    .RecipeId(RecipeId)
    .MinimumTransferAmount(MinimumTransferAmount)
    .Rounding(Rounding)
    .SettlementLag(SettlementLag)
    .MatchTolerance(MatchTolerance)
    .Funding(Funding)
    .Optimisation(Optimisation)
    .VariationMargin(VariationMargin)
    .InitialMargin(InitialMargin)
    .Properties(Properties)
    .EffectiveAt(EffectiveAt)
    .NotificationCutLabel(NotificationCutLabel)
    .ReturnNotificationCutLabel(ReturnNotificationCutLabel);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
