# com.finbourne.lusid.model.SettlementFx
The FX gain or loss on a settlement instruction, with its transaction's realised gain or loss.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settlementCurrency** | **String** |  | [optional] [default to String]
**settlementAmount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**portfolioCurrencyAmount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**tradeDateFxRate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**fxRateUsed** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**fxRateSource** | **String** |  | [optional] [default to String]
**fxGainLossOnSettlement** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**totalRealisedGainLossOnTransaction** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.SettlementFx;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String SettlementCurrency = "example SettlementCurrency";
java.math.BigDecimal SettlementAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PortfolioCurrencyAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal TradeDateFxRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FxRateUsed = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FxRateSource = "example FxRateSource";
@jakarta.annotation.Nullable java.math.BigDecimal FxGainLossOnSettlement = new java.math.BigDecimal("100.00");
java.math.BigDecimal TotalRealisedGainLossOnTransaction = new java.math.BigDecimal("100.00");


SettlementFx settlementFxInstance = new SettlementFx()
    .SettlementCurrency(SettlementCurrency)
    .SettlementAmount(SettlementAmount)
    .PortfolioCurrencyAmount(PortfolioCurrencyAmount)
    .TradeDateFxRate(TradeDateFxRate)
    .FxRateUsed(FxRateUsed)
    .FxRateSource(FxRateSource)
    .FxGainLossOnSettlement(FxGainLossOnSettlement)
    .TotalRealisedGainLossOnTransaction(TotalRealisedGainLossOnTransaction);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
