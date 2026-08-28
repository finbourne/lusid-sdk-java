# com.finbourne.lusid.model.CreateTransferRequest
A request to create a transfer: the paired transaction legs that move a position, and the Transfer entity  recording them.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioIdOut** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioIdIn** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instrumentIdentifierOut** | **String** |  | [default to String]
**instrumentIdentifierIn** | **String** |  | [default to String]
**pricingMethod** | **String** | Available values: AtCost, AtPrice. | [default to String]
**taxLotStructure** | **String** | Available values: Consolidate, Preserve. | [optional] [default to String]
**unitsOut** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**unitsIn** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**amountOut** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**weightOut** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**tradeDateOut** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**tradeDateIn** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**settlementDateOut** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**settlementDateIn** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**exchangeRateOut** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**exchangeRateIn** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**transactionPriceOut** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**transactionPriceIn** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**counterpartyIdOut** | **String** |  | [optional] [default to String]
**counterpartyIdIn** | **String** |  | [optional] [default to String]
**custodianAccountIdOut** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**custodianAccountIdIn** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**source** | **String** |  | [default to String]
**accountingMethod** | **String** | Available values: AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency. | [optional] [default to String]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to Map<String, PerpetualProperty>]
**propertiesIn** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) |  | [optional] [default to Map<String, PerpetualProperty>]

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
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> PropertiesIn = new Map<String, PerpetualProperty>();


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
    .Properties(Properties)
    .PropertiesIn(PropertiesIn);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
