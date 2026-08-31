# com.finbourne.lusid.model.BondForwardCashSettlementEvent
Cash settlement of a BondForward at its settlement date:  the forward closes against a single net payment of the clean price difference, and no bond changes  hands. Unlike a commodity forward the underlying is a mastered, quoted instrument, so LUSID computes  the settlement amount from the underlying's quote rather than taking a pre-netted figure; a supplied  referencePrice wins and the quote is not consulted.  Accrued does not enter the payoff, by cancellation rather than entitlement: both sides of the  difference accrue to the same date, so the accrued is identical on each and drops out.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agreedCleanPrice** | **java.math.BigDecimal** | The agreed price, percent of par, carried from the definition. | [default to java.math.BigDecimal]
**contractSize** | **java.math.BigDecimal** | Face amount per unit, carried from the definition. It scales the payoff, so it is rejected where it  differs from the instrument&#39;s own value. | [default to java.math.BigDecimal]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The forward&#39;s contractual settlement date, on which the price difference fixes. | [optional] [default to OffsetDateTime]
**referencePrice** | **java.math.BigDecimal** | The underlying&#39;s clean price, percent of par, at the settlement date. Null resolves from the  underlying&#39;s quote; a supplied value wins and the quote is not consulted. | [optional] [default to java.math.BigDecimal]
**settlementAmountPerUnit** | **java.math.BigDecimal** | Output only: the net settlement per unit, computed from the reference price, the agreed price and  the contract size. A supplied value is overwritten. Negative is valid and means the holder pays. | [optional] [default to java.math.BigDecimal]
**settlementCurrency** | **String** | Currency the net amount settles in, being the forward&#39;s domestic currency. | [default to String]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the net payment settles. Null means the maturity date; cash-settled forwards commonly pay  a day or two after the price fixes. Rejected where earlier than the maturity date. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.BondForwardCashSettlementEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal AgreedCleanPrice = new java.math.BigDecimal("100.00");
java.math.BigDecimal ContractSize = new java.math.BigDecimal("100.00");
OffsetDateTime MaturityDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal ReferencePrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal SettlementAmountPerUnit = new java.math.BigDecimal("100.00");
String SettlementCurrency = "example SettlementCurrency";
@jakarta.annotation.Nullable OffsetDateTime SettlementDate = OffsetDateTime.now();


BondForwardCashSettlementEvent bondForwardCashSettlementEventInstance = new BondForwardCashSettlementEvent()
    .AgreedCleanPrice(AgreedCleanPrice)
    .ContractSize(ContractSize)
    .MaturityDate(MaturityDate)
    .ReferencePrice(ReferencePrice)
    .SettlementAmountPerUnit(SettlementAmountPerUnit)
    .SettlementCurrency(SettlementCurrency)
    .SettlementDate(SettlementDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
