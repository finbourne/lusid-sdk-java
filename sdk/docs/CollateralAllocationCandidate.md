# com.finbourne.lusid.model.CollateralAllocationCandidate
One holding the allocation considered for a margin call, with its figures as far as they could be computed and  either its rank or the constraint that excluded it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentId** | **String** | The LUSID instrument identifier of the asset, or CCY_ and the currency code for cash. | [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument identifiers a transaction for the line is booked against. | [default to Map<String, String>]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**custodianAccount** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**assetKind** | **String** | Cash or Security. | [default to String]
**currency** | **String** | The currency the asset is denominated in, when known. | [optional] [default to String]
**unitsFree** | **java.math.BigDecimal** | Units not in a margin account and not promised to an earlier call of the run. | [default to java.math.BigDecimal]
**lotSize** | **java.math.BigDecimal** | The smallest number of units the asset is delivered in. | [default to java.math.BigDecimal]
**price** | **java.math.BigDecimal** | The market value per unit in the base currency, before any haircut. Null when the asset could not be priced. | [optional] [default to java.math.BigDecimal]
**eligibilitySeq** | **Integer** | The one-based position of the schedule row that admits the asset. Null when no row does. | [optional] [default to Integer]
**valuationPercentage** | **java.math.BigDecimal** | The fraction of market value the schedule row counts as collateral. | [optional] [default to java.math.BigDecimal]
**fxHaircut** | **java.math.BigDecimal** | The further fraction deducted because the asset is not in the base currency. Zero when it is. | [optional] [default to java.math.BigDecimal]
**effectiveValuePerUnit** | **java.math.BigDecimal** | Price times the valuation percentage, less the FX haircut: what one unit counts for as collateral. | [optional] [default to java.math.BigDecimal]
**opportunityRate** | **java.math.BigDecimal** | The annual rate the fund gives up by locking the asset up: funding less the agreement&#39;s cash interest for cash, the lending fee it would otherwise earn for a security. | [optional] [default to java.math.BigDecimal]
**costPerUnitOfValue** | **java.math.BigDecimal** | The ranking key: the annual cost of one unit of collateral value from this asset. | [optional] [default to java.math.BigDecimal]
**concentrationCap** | **java.math.BigDecimal** | The collateral value the schedule&#39;s concentration limit still allows from the asset&#39;s group. Null when the row sets no limit. | [optional] [default to java.math.BigDecimal]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | When the movement would settle under the agreement&#39;s settlement lag, counting weekdays. | [optional] [default to OffsetDateTime]
**rank** | **Integer** | The asset&#39;s position in the ranking, cheapest first. Null when excluded. | [optional] [default to Integer]
**exclusionReason** | **String** | The constraint the asset failed, when it did. One of NotEligible, NoFreeUnits, MissingPrice, MissingRate, MissesDeadline, BelowMinimumLot or ConcentrationExhausted. Null when it passed. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CollateralAllocationCandidate;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstrumentId = "example InstrumentId";
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
ResourceId PortfolioId = new ResourceId();
ResourceId CustodianAccount = new ResourceId();
String AssetKind = "example AssetKind";
@jakarta.annotation.Nullable String Currency = "example Currency";
java.math.BigDecimal UnitsFree = new java.math.BigDecimal("100.00");
java.math.BigDecimal LotSize = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Price = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Integer EligibilitySeq = new Integer("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ValuationPercentage = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FxHaircut = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal EffectiveValuePerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal OpportunityRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CostPerUnitOfValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ConcentrationCap = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime SettlementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable Integer Rank = new Integer("100.00");
@jakarta.annotation.Nullable String ExclusionReason = "example ExclusionReason";


CollateralAllocationCandidate collateralAllocationCandidateInstance = new CollateralAllocationCandidate()
    .InstrumentId(InstrumentId)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .PortfolioId(PortfolioId)
    .CustodianAccount(CustodianAccount)
    .AssetKind(AssetKind)
    .Currency(Currency)
    .UnitsFree(UnitsFree)
    .LotSize(LotSize)
    .Price(Price)
    .EligibilitySeq(EligibilitySeq)
    .ValuationPercentage(ValuationPercentage)
    .FxHaircut(FxHaircut)
    .EffectiveValuePerUnit(EffectiveValuePerUnit)
    .OpportunityRate(OpportunityRate)
    .CostPerUnitOfValue(CostPerUnitOfValue)
    .ConcentrationCap(ConcentrationCap)
    .SettlementDate(SettlementDate)
    .Rank(Rank)
    .ExclusionReason(ExclusionReason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
