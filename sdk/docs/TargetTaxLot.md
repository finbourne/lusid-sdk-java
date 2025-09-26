# com.finbourne.lusid.model.TargetTaxLot
Used to specify holdings target amounts at the tax-lot level

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**units** | **java.math.BigDecimal** | The number of units of the instrument in this tax-lot. | [default to java.math.BigDecimal]
**cost** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**portfolioCost** | **java.math.BigDecimal** | The total cost of the tax-lot in the transaction portfolio&#39;s base currency. | [optional] [default to java.math.BigDecimal]
**price** | **java.math.BigDecimal** | The purchase price of each unit of the instrument held in this tax-lot. This forms part of the unique key required for multiple tax-lots. | [optional] [default to java.math.BigDecimal]
**purchaseDate** | [**OffsetDateTime**](OffsetDateTime.md) | The purchase date of this tax-lot. This forms part of the unique key required for multiple tax-lots. | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the tax-lot&#39;s opening transaction. | [optional] [default to OffsetDateTime]
**notionalCost** | **java.math.BigDecimal** | The notional cost of the tax-lot&#39;s opening transaction. | [optional] [default to java.math.BigDecimal]
**variationMargin** | **java.math.BigDecimal** | The variation margin of the tax-lot&#39;s opening transaction. | [optional] [default to java.math.BigDecimal]
**variationMarginPortfolioCcy** | **java.math.BigDecimal** | The variation margin in portfolio currency of the tax-lot&#39;s opening transaction. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TargetTaxLot;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
CurrencyAndAmount Cost = new CurrencyAndAmount();
@jakarta.annotation.Nullable java.math.BigDecimal PortfolioCost = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Price = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime PurchaseDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime SettlementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal NotionalCost = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal VariationMargin = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal VariationMarginPortfolioCcy = new java.math.BigDecimal("100.00");


TargetTaxLot targetTaxLotInstance = new TargetTaxLot()
    .Units(Units)
    .Cost(Cost)
    .PortfolioCost(PortfolioCost)
    .Price(Price)
    .PurchaseDate(PurchaseDate)
    .SettlementDate(SettlementDate)
    .NotionalCost(NotionalCost)
    .VariationMargin(VariationMargin)
    .VariationMarginPortfolioCcy(VariationMarginPortfolioCcy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
