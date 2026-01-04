# com.finbourne.lusid.model.RealisedGainLoss

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentScope** | **String** | The scope in which the instrument lies. | [optional] [default to String]
**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that this gain or loss is associated with. | [default to String]
**units** | **java.math.BigDecimal** | The number of units of the associated instrument against which the gain or loss has been realised. | [default to java.math.BigDecimal]
**purchaseTradeDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the units associated with this gain or loss were originally purchased. | [optional] [readonly] [default to OffsetDateTime]
**purchaseSettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the units associated with this gain or loss were originally settled. | [optional] [readonly] [default to OffsetDateTime]
**purchasePrice** | **java.math.BigDecimal** | The purchase price of each unit associated with this gain or loss. | [optional] [default to java.math.BigDecimal]
**costTradeCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**costPortfolioCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**realisedTradeCcy** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**realisedTotal** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**realisedMarket** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**realisedCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**taxLotId** | **String** | The identifier of the tax lot with which this gain or loss is associated. | [optional] [default to String]
**realisedAmortisation** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**tradeDateToSettlementDateRealisedCurrency** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]

```java
import com.finbourne.lusid.model.RealisedGainLoss;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
String InstrumentUid = "example InstrumentUid";
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime PurchaseTradeDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime PurchaseSettlementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal PurchasePrice = new java.math.BigDecimal("100.00");
CurrencyAndAmount CostTradeCcy = new CurrencyAndAmount();
CurrencyAndAmount CostPortfolioCcy = new CurrencyAndAmount();
CurrencyAndAmount RealisedTradeCcy = new CurrencyAndAmount();
CurrencyAndAmount RealisedTotal = new CurrencyAndAmount();
CurrencyAndAmount RealisedMarket = new CurrencyAndAmount();
CurrencyAndAmount RealisedCurrency = new CurrencyAndAmount();
@jakarta.annotation.Nullable String TaxLotId = "example TaxLotId";
CurrencyAndAmount RealisedAmortisation = new CurrencyAndAmount();
CurrencyAndAmount TradeDateToSettlementDateRealisedCurrency = new CurrencyAndAmount();


RealisedGainLoss realisedGainLossInstance = new RealisedGainLoss()
    .InstrumentScope(InstrumentScope)
    .InstrumentUid(InstrumentUid)
    .Units(Units)
    .PurchaseTradeDate(PurchaseTradeDate)
    .PurchaseSettlementDate(PurchaseSettlementDate)
    .PurchasePrice(PurchasePrice)
    .CostTradeCcy(CostTradeCcy)
    .CostPortfolioCcy(CostPortfolioCcy)
    .RealisedTradeCcy(RealisedTradeCcy)
    .RealisedTotal(RealisedTotal)
    .RealisedMarket(RealisedMarket)
    .RealisedCurrency(RealisedCurrency)
    .TaxLotId(TaxLotId)
    .RealisedAmortisation(RealisedAmortisation)
    .TradeDateToSettlementDateRealisedCurrency(TradeDateToSettlementDateRealisedCurrency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
