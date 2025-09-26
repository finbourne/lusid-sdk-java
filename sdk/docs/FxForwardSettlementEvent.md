# com.finbourne.lusid.model.FxForwardSettlementEvent
Settlement for FX Forward, including NDF and deliverable.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | Maturity date of the forward | [optional] [default to OffsetDateTime]
**domAmountPerUnit** | **java.math.BigDecimal** | Amount per unit in the DomCcy (domestic currency) | [default to java.math.BigDecimal]
**domCcy** | **String** | The domestic currency of the forward | [default to String]
**fgnAmountPerUnit** | **java.math.BigDecimal** | Amount per unit in the FgnCcy (foreign currency) | [default to java.math.BigDecimal]
**fgnCcy** | **String** | The foreign currency of the forward. | [default to String]
**isNdf** | **Boolean** | Is this settlement corresponding to a deliverable forward, or an NDF | [default to Boolean]
**fixingDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional. Required if the event is an NDF (i.e. if IsNdf &#x3D; true).  Date of the FxRate fixings. | [optional] [default to OffsetDateTime]
**settlementCcy** | **String** | Optional. Required if the event is an NDF (i.e. if IsNdf &#x3D; true).  May be set to either DomCcy or FgnCcy, or a third currency. | [optional] [default to String]
**cashFlowPerUnit** | **java.math.BigDecimal** | Optional. Required if the event is an NDF (i.e. if IsNdf &#x3D; true).  CashFlow per unit. Paid in the SettlementCcy. | [optional] [default to java.math.BigDecimal]
**domesticToForeignRate** | **java.math.BigDecimal** | Domestic currency to foreign currency FX rate.  Not required, only used to override quotes. | [optional] [default to java.math.BigDecimal]
**domesticToSettlementRate** | **java.math.BigDecimal** | Domestic currency to settlement currency FX rate  Not required, only used to override quotes. | [optional] [default to java.math.BigDecimal]
**foreignToSettlementRate** | **java.math.BigDecimal** | Foreign currency to settlement currency FX rate  Not required, only used to override quotes. | [optional] [readonly] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.FxForwardSettlementEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime MaturityDate = OffsetDateTime.now();
java.math.BigDecimal DomAmountPerUnit = new java.math.BigDecimal("100.00");
String DomCcy = "example DomCcy";
java.math.BigDecimal FgnAmountPerUnit = new java.math.BigDecimal("100.00");
String FgnCcy = "example FgnCcy";
Boolean IsNdf = true;
@jakarta.annotation.Nullable OffsetDateTime FixingDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String SettlementCcy = "example SettlementCcy";
@jakarta.annotation.Nullable java.math.BigDecimal CashFlowPerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal DomesticToForeignRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal DomesticToSettlementRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ForeignToSettlementRate = new java.math.BigDecimal("100.00");


FxForwardSettlementEvent fxForwardSettlementEventInstance = new FxForwardSettlementEvent()
    .MaturityDate(MaturityDate)
    .DomAmountPerUnit(DomAmountPerUnit)
    .DomCcy(DomCcy)
    .FgnAmountPerUnit(FgnAmountPerUnit)
    .FgnCcy(FgnCcy)
    .IsNdf(IsNdf)
    .FixingDate(FixingDate)
    .SettlementCcy(SettlementCcy)
    .CashFlowPerUnit(CashFlowPerUnit)
    .DomesticToForeignRate(DomesticToForeignRate)
    .DomesticToSettlementRate(DomesticToSettlementRate)
    .ForeignToSettlementRate(ForeignToSettlementRate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
