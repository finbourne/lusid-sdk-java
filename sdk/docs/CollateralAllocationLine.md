# com.finbourne.lusid.model.CollateralAllocationLine
One asset chosen for a margin call, with what a transaction moving it needs: the instrument, the portfolio and  account it leaves, the units, the price and the consideration. An override that fails a constraint is kept with  its exclusion reason and covers nothing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentId** | **String** | The LUSID instrument identifier of the asset, or CCY_ and the currency code for cash. | [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument identifiers a transaction for the line is booked against. | [default to Map<String, String>]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**custodianAccount** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**currency** | **String** | The currency the asset is denominated in, when known. | [optional] [default to String]
**units** | **java.math.BigDecimal** | The units to move. | [default to java.math.BigDecimal]
**price** | **java.math.BigDecimal** | The market value per unit in the base currency, before any haircut. Null when the asset could not be priced. | [optional] [default to java.math.BigDecimal]
**consideration** | **java.math.BigDecimal** | Units times price in the base currency: what a transaction for the line settles. Null when the asset could not be priced. | [optional] [default to java.math.BigDecimal]
**effectiveValuePerUnit** | **java.math.BigDecimal** | Price times the valuation percentage, less the FX haircut: what one unit counts for as collateral. | [optional] [default to java.math.BigDecimal]
**collateralValue** | **java.math.BigDecimal** | The collateral value the line covers: units times the effective value per unit. | [default to java.math.BigDecimal]
**costPerUnitOfValue** | **java.math.BigDecimal** | The ranking key: the annual cost of one unit of collateral value from this asset. | [optional] [default to java.math.BigDecimal]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | When the movement would settle under the agreement&#39;s settlement lag, counting weekdays. | [optional] [default to OffsetDateTime]
**boundBy** | **String** | Which limit decided the units. One of RemainingRequirement, FreeUnits, ConcentrationCap, LotRounding or Override. | [default to String]
**exclusionReason** | **String** | The constraint the asset failed, when it did. One of NotEligible, NoFreeUnits, MissingPrice, MissingRate, MissesDeadline, BelowMinimumLot or ConcentrationExhausted. Null when it passed. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CollateralAllocationLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstrumentId = "example InstrumentId";
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
ResourceId PortfolioId = new ResourceId();
ResourceId CustodianAccount = new ResourceId();
@jakarta.annotation.Nullable String Currency = "example Currency";
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Price = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Consideration = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal EffectiveValuePerUnit = new java.math.BigDecimal("100.00");
java.math.BigDecimal CollateralValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CostPerUnitOfValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime SettlementDate = OffsetDateTime.now();
String BoundBy = "example BoundBy";
@jakarta.annotation.Nullable String ExclusionReason = "example ExclusionReason";


CollateralAllocationLine collateralAllocationLineInstance = new CollateralAllocationLine()
    .InstrumentId(InstrumentId)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .PortfolioId(PortfolioId)
    .CustodianAccount(CustodianAccount)
    .Currency(Currency)
    .Units(Units)
    .Price(Price)
    .Consideration(Consideration)
    .EffectiveValuePerUnit(EffectiveValuePerUnit)
    .CollateralValue(CollateralValue)
    .CostPerUnitOfValue(CostPerUnitOfValue)
    .SettlementDate(SettlementDate)
    .BoundBy(BoundBy)
    .ExclusionReason(ExclusionReason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
