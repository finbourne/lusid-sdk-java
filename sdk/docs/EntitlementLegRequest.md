# com.finbourne.lusid.model.EntitlementLegRequest
One child position or cash movement produced by a holding entitlement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**legId** | **String** | The identifier of this leg, unique within the entitlement and included in the identifiers of the transactions it produces | [default to String]
**instrumentScope** | **String** | The scope of the instrument this leg receives. Given together with the instrument identifier | [optional] [default to String]
**instrumentId** | **String** | The LUSID instrument identifier of the instrument this leg receives. Required for CarryCost, ReceiveAndSell, ReceiveInterestInKind and ReceiveDividendInKind, optional for RealiseAtAmount where its absence settles the proceeds to cash, and absent for every treatment that produces no position | [optional] [default to String]
**units** | **java.math.BigDecimal** | The units this leg receives. Required where the leg names an instrument and absent where it does not | [optional] [default to java.math.BigDecimal]
**costFraction** | **java.math.BigDecimal** | The share of the parent&#39;s pre-event cost that this leg takes, from 0 to 1. Required for CarryCost and ReceiveAndSell and absent otherwise. The fractions across all legs must not sum to more than 1 | [optional] [default to java.math.BigDecimal]
**cashPaid** | **java.math.BigDecimal** | The cash the holder pays to receive this leg. It adds to the leg&#39;s cost and is neither income nor expense. Must not be negative | [optional] [default to java.math.BigDecimal]
**price** | **java.math.BigDecimal** | The stated price of this leg. Must not be negative for RealiseAtAmount and ReceiveAndSell | [optional] [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | The stated amount of this leg. Required unless the treatment is CarryCost. For RealiseCash it is the signed cash moved; for ReceiveInterestInKind, ReceiveDividendInKind and for every other treatment that produces no position it must be positive. For RealiseAtAmount and ReceiveAndSell it must not be negative | [optional] [default to java.math.BigDecimal]
**settlementCurrency** | **String** | The currency of this leg&#39;s cash movement. Defaults to the currency of the holding, and must be that currency where given. The RealiseAtAmount legs of an entitlement must all settle in one currency | [optional] [default to String]
**treatment** | **String** | How this leg is booked: CarryCost, RealiseAtAmount, ReceiveAndSell, RealiseCash, ExpenseCash, ReturnOfCapital, ReceiveDividendIncome, ReceiveInterestIncome, ReceiveOtherIncome, PayWithholdingTax, PayFee, ReceiveInterestInKind, ReclassifyIncomeAsCapital or ReceiveDividendInKind. Available values: CarryCost, RealiseAtAmount, ReceiveAndSell, RealiseCash, ExpenseCash, ReturnOfCapital, ReceiveDividendIncome, ReceiveInterestIncome, ReceiveOtherIncome, PayWithholdingTax, PayFee, ReceiveInterestInKind, ReclassifyIncomeAsCapital, ReceiveDividendInKind. | [default to String]
**transactionProperties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The transaction properties to set on every transaction this leg books, at most 100. Each must be in the Transaction domain. A value given here replaces the value the entitlement gives for the same property on this leg&#39;s transactions, and the value the transaction template gives | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.lusid.model.EntitlementLegRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String LegId = "example LegId";
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CostFraction = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CashPaid = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Price = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String SettlementCurrency = "example SettlementCurrency";
String Treatment = "example Treatment";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> TransactionProperties = new Map<String, PerpetualProperty>();


EntitlementLegRequest entitlementLegRequestInstance = new EntitlementLegRequest()
    .LegId(LegId)
    .InstrumentScope(InstrumentScope)
    .InstrumentId(InstrumentId)
    .Units(Units)
    .CostFraction(CostFraction)
    .CashPaid(CashPaid)
    .Price(Price)
    .Amount(Amount)
    .SettlementCurrency(SettlementCurrency)
    .Treatment(Treatment)
    .TransactionProperties(TransactionProperties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
