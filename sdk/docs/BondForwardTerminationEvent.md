# com.finbourne.lusid.model.BondForwardTerminationEvent
Termination of a BondForward because its underlying bond  was redeemed early: the deliverable ceases to exist, so the forward terminates against the proceeds  the underlying was actually redeemed for.  The event is posted against the forward's own LusidInstrumentId by the feed or orchestration layer.  The corporate-action dependency graph is self-keyed by LUID and a MasteredInstrument reference links  price, not events, so the underlying's own EarlyRedemptionEvent does not propagate here and neither  the redemption price nor either accrued figure can be derived on the forward.  Unlike cash settlement, both accrued figures appear and neither cancels: the redemption accrues to the  redemption date and the forward's obligation accrued to its own settlement date, so the two differ.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agreedCleanPrice** | **java.math.BigDecimal** | The agreed price, percent of par, carried from the definition; rejected where it differs from the  instrument&#39;s own value. | [default to java.math.BigDecimal]
**contractSize** | **java.math.BigDecimal** | Face amount per unit, carried from the definition; rejected where it differs from the instrument&#39;s  own value. | [default to java.math.BigDecimal]
**redemptionAccrued** | **java.math.BigDecimal** | Accrued paid on the underlying&#39;s redemption, percent of par, at full precision. Required, not  resolved: the forward cannot read the underlying&#39;s accrual. Nullable so that absence is detectable,  zero staying a legitimate supplied value (a bond trading flat); null is rejected. | [optional] [default to java.math.BigDecimal]
**redemptionPrice** | **java.math.BigDecimal** | The price the underlying was redeemed at, percent of par. Must be supplied: it comes from the  underlying&#39;s own redemption. Nullable so that absence is detectable; null is rejected, and zero is  legal (a write-off or liquidation may recover nothing). | [optional] [default to java.math.BigDecimal]
**settlementAccrued** | **java.math.BigDecimal** | Accrued the buyer would have paid at the forward&#39;s own maturity date - the invoice date it escaped,  not this event&#39;s settlement date. Nullable so that absence is detectable; null is rejected. | [optional] [default to java.math.BigDecimal]
**settlementAmountPerUnit** | **java.math.BigDecimal** | The net termination amount per unit. A supplied value wins; null is computed as  ((redemptionPrice + redemptionAccrued) - (agreedCleanPrice + settlementAccrued)) / 100 x contractSize,  which is undiscounted - where the confirmation nets on a discounted basis, supply the agreed figure.  Negative is valid and means the holder pays; it must not be floored. | [optional] [default to java.math.BigDecimal]
**settlementCurrency** | **String** | Currency the net amount settles in. | [default to String]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the net termination amount settles. | [optional] [default to OffsetDateTime]
**terminationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the termination takes effect, being the effective date of the underlying&#39;s redemption.  Required, not defaulted: the forward cannot read the underlying&#39;s redemption. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.BondForwardTerminationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal AgreedCleanPrice = new java.math.BigDecimal("100.00");
java.math.BigDecimal ContractSize = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal RedemptionAccrued = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal RedemptionPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal SettlementAccrued = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal SettlementAmountPerUnit = new java.math.BigDecimal("100.00");
String SettlementCurrency = "example SettlementCurrency";
OffsetDateTime SettlementDate = OffsetDateTime.now();
OffsetDateTime TerminationDate = OffsetDateTime.now();


BondForwardTerminationEvent bondForwardTerminationEventInstance = new BondForwardTerminationEvent()
    .AgreedCleanPrice(AgreedCleanPrice)
    .ContractSize(ContractSize)
    .RedemptionAccrued(RedemptionAccrued)
    .RedemptionPrice(RedemptionPrice)
    .SettlementAccrued(SettlementAccrued)
    .SettlementAmountPerUnit(SettlementAmountPerUnit)
    .SettlementCurrency(SettlementCurrency)
    .SettlementDate(SettlementDate)
    .TerminationDate(TerminationDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
