# com.finbourne.lusid.model.CreateTransferRequest
A request to create a transfer: the paired transaction legs that move a position, and the Transfer entity  recording them.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioIdOut** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioIdIn** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instrumentIdentifierOut** | **String** | The LUSID instrument id of the instrument moving out. A position in this instrument must exist in the outgoing portfolio on the outgoing trade date. | [default to String]
**instrumentIdentifierIn** | **String** | The LUSID instrument id of the instrument moving in. Equal to InstrumentIdentifierOut for a transfer between portfolios. | [default to String]
**pricingMethod** | **String** | How the legs are priced. &#39;AtCost&#39; uses the cost per unit of the outgoing holding; &#39;AtPrice&#39; uses the supplied TransactionPriceOut, which is then required. Available values: AtCost, AtPrice. | [default to String]
**taxLotStructure** | **String** | What happens to the tax lots of the outgoing position. Only &#39;Consolidate&#39; is currently supported; &#39;Preserve&#39; is rejected. Defaults to &#39;Consolidate&#39;. Available values: Consolidate, Preserve. | [optional] [default to String]
**unitsOut** | **java.math.BigDecimal** | The number of units to move out. Must be greater than zero. | [default to java.math.BigDecimal]
**unitsIn** | **java.math.BigDecimal** | The number of units to move in. Must be greater than zero. | [default to java.math.BigDecimal]
**amountOut** | **java.math.BigDecimal** | The total consideration of the outgoing leg. Recorded, not applied. | [optional] [default to java.math.BigDecimal]
**weightOut** | **java.math.BigDecimal** | The weighting factor of the outgoing leg. Recorded, not applied. | [optional] [default to java.math.BigDecimal]
**tradeDateOut** | [**OffsetDateTime**](OffsetDateTime.md) | The trade date of the outgoing leg. Must not be later than TradeDateIn. | [default to OffsetDateTime]
**tradeDateIn** | [**OffsetDateTime**](OffsetDateTime.md) | The trade date of the incoming leg. | [default to OffsetDateTime]
**settlementDateOut** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the outgoing leg. Must not be later than SettlementDateIn. | [default to OffsetDateTime]
**settlementDateIn** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the incoming leg. Defaults to SettlementDateOut when not supplied. | [optional] [default to OffsetDateTime]
**exchangeRateOut** | **java.math.BigDecimal** | The FX rate to apply to the outgoing leg. | [optional] [default to java.math.BigDecimal]
**exchangeRateIn** | **java.math.BigDecimal** | The FX rate to apply to the incoming leg. | [optional] [default to java.math.BigDecimal]
**transactionPriceOut** | **java.math.BigDecimal** | The unit price of the outgoing leg. Required when PricingMethod is &#39;AtPrice&#39;, and ignored when it is &#39;AtCost&#39;. | [optional] [default to java.math.BigDecimal]
**transactionPriceIn** | **java.math.BigDecimal** | The unit price of the incoming leg. Ignored for a transfer, which carries the outgoing price across; defaults to the outgoing price for a switch. | [optional] [default to java.math.BigDecimal]
**counterpartyIdOut** | **String** | The counterparty identifier of the outgoing leg. | [optional] [default to String]
**counterpartyIdIn** | **String** | The counterparty identifier of the incoming leg. Defaults to CounterpartyIdOut. | [optional] [default to String]
**custodianAccountIdOut** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**custodianAccountIdIn** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**source** | **String** | The transaction source the generated legs are booked against. | [default to String]
**accountingMethod** | **String** | An accounting method to record against the transfer. Available values: AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency. | [optional] [default to String]
**propertiesOut** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Transaction Properties to set on the outgoing transaction leg, and on the incoming transaction leg when PropertiesIn is absent. Supplying an empty collection for PropertiesIn leaves the incoming leg with no properties. | [optional] [default to Map<String, PerpetualProperty>]
**propertiesIn** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Transaction Properties to set on the incoming transaction leg, replacing rather than adding to PropertiesOut. | [optional] [default to Map<String, PerpetualProperty>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties to set on the transfer itself, in the Transfer domain. These are separate from PropertiesOut and PropertiesIn, which are Transaction domain and land on the legs. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.lusid.model.CreateTransferRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId TransferId = new ResourceId();
ResourceId PortfolioIdOut = new ResourceId();
ResourceId PortfolioIdIn = new ResourceId();
String InstrumentIdentifierOut = "example InstrumentIdentifierOut";
String InstrumentIdentifierIn = "example InstrumentIdentifierIn";
String PricingMethod = "example PricingMethod";
@jakarta.annotation.Nullable String TaxLotStructure = "example TaxLotStructure";
java.math.BigDecimal UnitsOut = new java.math.BigDecimal("100.00");
java.math.BigDecimal UnitsIn = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal AmountOut = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal WeightOut = new java.math.BigDecimal("100.00");
OffsetDateTime TradeDateOut = OffsetDateTime.now();
OffsetDateTime TradeDateIn = OffsetDateTime.now();
OffsetDateTime SettlementDateOut = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime SettlementDateIn = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal ExchangeRateOut = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ExchangeRateIn = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal TransactionPriceOut = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal TransactionPriceIn = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String CounterpartyIdOut = "example CounterpartyIdOut";
@jakarta.annotation.Nullable String CounterpartyIdIn = "example CounterpartyIdIn";
ResourceId CustodianAccountIdOut = new ResourceId();
ResourceId CustodianAccountIdIn = new ResourceId();
String Source = "example Source";
@jakarta.annotation.Nullable String AccountingMethod = "example AccountingMethod";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> PropertiesOut = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> PropertiesIn = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();


CreateTransferRequest createTransferRequestInstance = new CreateTransferRequest()
    .TransferId(TransferId)
    .PortfolioIdOut(PortfolioIdOut)
    .PortfolioIdIn(PortfolioIdIn)
    .InstrumentIdentifierOut(InstrumentIdentifierOut)
    .InstrumentIdentifierIn(InstrumentIdentifierIn)
    .PricingMethod(PricingMethod)
    .TaxLotStructure(TaxLotStructure)
    .UnitsOut(UnitsOut)
    .UnitsIn(UnitsIn)
    .AmountOut(AmountOut)
    .WeightOut(WeightOut)
    .TradeDateOut(TradeDateOut)
    .TradeDateIn(TradeDateIn)
    .SettlementDateOut(SettlementDateOut)
    .SettlementDateIn(SettlementDateIn)
    .ExchangeRateOut(ExchangeRateOut)
    .ExchangeRateIn(ExchangeRateIn)
    .TransactionPriceOut(TransactionPriceOut)
    .TransactionPriceIn(TransactionPriceIn)
    .CounterpartyIdOut(CounterpartyIdOut)
    .CounterpartyIdIn(CounterpartyIdIn)
    .CustodianAccountIdOut(CustodianAccountIdOut)
    .CustodianAccountIdIn(CustodianAccountIdIn)
    .Source(Source)
    .AccountingMethod(AccountingMethod)
    .PropertiesOut(PropertiesOut)
    .PropertiesIn(PropertiesIn)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
