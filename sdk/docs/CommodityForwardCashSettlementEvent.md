# com.finbourne.lusid.model.CommodityForwardCashSettlementEvent
Cash settlement of a cash-delivery CommodityForward at maturity. The cash flow per unit is the  pre-netted settlement price (forward price minus strike) supplied externally via the quote store;  LUSID does not compute the difference itself. A negative cash flow per unit is valid and means the  position was out of the money at settlement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The single settlement / maturity date of the forward. Required. | [optional] [default to OffsetDateTime]
**domCcy** | **String** | Settlement currency of the forward. Required. | [default to String]
**cashFlowPerUnit** | **java.math.BigDecimal** | The pre-netted settlement amount per unit (current forward price minus strike), supplied  externally via the quote store. Optional — absent until the settlement price has been loaded.  Negative when the position is out of the money. | [optional] [default to java.math.BigDecimal]
**cashFlowAmount** | **java.math.BigDecimal** | The realised cash amount, calculated as CashFlowPerUnit multiplied by the eligible balance.  Optional — it needs holdings-level data so it is never populated by the instrument layer.  Carries the sign of CashFlowPerUnit. | [optional] [default to java.math.BigDecimal]
**strike** | **java.math.BigDecimal** | Agreed forward price at trade inception. Optional, and reference only — it is not used in the  settlement calculation; it is carried for auditability. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CommodityForwardCashSettlementEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime MaturityDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
@jakarta.annotation.Nullable java.math.BigDecimal CashFlowPerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CashFlowAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Strike = new java.math.BigDecimal("100.00");


CommodityForwardCashSettlementEvent commodityForwardCashSettlementEventInstance = new CommodityForwardCashSettlementEvent()
    .MaturityDate(MaturityDate)
    .DomCcy(DomCcy)
    .CashFlowPerUnit(CashFlowPerUnit)
    .CashFlowAmount(CashFlowAmount)
    .Strike(Strike);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
