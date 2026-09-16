# com.finbourne.lusid.model.FxForward
LUSID representation of an FX Forward.  Including FX Spot and Non-Deliverable Forwards.     This instrument has multiple legs, to see how legs are used in LUSID see [How does LUSID handle instrument legs?](https://support.lusid.com/docs/how-does-lusid-handle-instrument-legs).     | Leg Index | Leg Identifier | Description |  | --------- | -------------- | ----------- |  | 1 | DomesticLeg | Cash flows in the domestic currency of the forward. |  | 2 | ForeignLeg | Cash flows in the foreign currency of the forward (not present for non-deliverable forwards). |

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**domAmount** | **java.math.BigDecimal** | The amount that is to be paid in the domestic currency on the maturity date.  Required unless isPooled is set. On a pooled FX forward the domestic amount is the contract size and  not a traded amount: leave it absent and it is populated as one, so that holding units are amounts of  the domestic currency. | [optional] [default to java.math.BigDecimal]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**fgnAmount** | **java.math.BigDecimal** | The amount that is to be paid in the foreign currency on the maturity date.  Required unless isPooled is set. On a pooled FX forward it must be absent or zero, because the whole  foreign consideration is carried by the transactions booked against the pool. | [optional] [default to java.math.BigDecimal]
**fgnCcy** | **String** | The foreign (other) currency of the instrument. In the NDF case, only payments are made in the domestic currency.  For the outright forward, currencies are exchanged. | [default to String]
**refSpotRate** | **java.math.BigDecimal** | The reference Fx Spot rate for currency pair Foreign-Domestic that was seen on the trade start date (time). | [optional] [default to java.math.BigDecimal]
**isNdf** | **Boolean** | Is the contract an Fx-Forward of \&quot;Non-Deliverable\&quot; type, meaning a single payment in the domestic currency based on the change in fx-rate vs  a reference rate is used.  Defaults to false if not set. | [optional] [default to Boolean]
**fixingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The fixing date. | [optional] [default to OffsetDateTime]
**settlementCcy** | **String** | The settlement currency.  If provided, present value will be calculated in settlement currency, otherwise the domestic currency. Applies only to non-deliverable FX Forwards. | [optional] [default to String]
**bookedAsSpot** | **Boolean** | Boolean flag for FX Forward transactions booked with Spot settlement. This will default to False if not provided.  For information purposes only, this does not impact LUSID valuation, analytics, cashflows or events, but may be used by third party vendors. | [optional] [default to Boolean]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**isPooled** | **Boolean** | Declares the contract to be a pool, carrying no traded amounts of its own. A pool is defined once for a  currency pair and maturity date and traded repeatedly at different rates, so the traded amounts are carried  by the transactions booked against it rather than by the instrument. The domestic amount of a pool is  therefore the contract size and not a traded amount, and is pinned to one so that holding units are amounts  of the domestic currency; the foreign amount and the reference spot rate must be absent, because the whole  foreign consideration is carried by the transaction.     Orientation is part of a pool&#39;s identity: the domestic currency is the unit currency and the foreign  currency the consideration currency, so a USD/JPY pool and a JPY/USD pool are distinct instruments, and  transactions must be booked in the pool&#39;s own direction (transaction currency equal to the domestic  currency, settlement currency equal to the foreign currency). This will default to False if not provided. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.FxForward;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
java.math.BigDecimal DomAmount = new java.math.BigDecimal("100.00");
String DomCcy = "example DomCcy";
java.math.BigDecimal FgnAmount = new java.math.BigDecimal("100.00");
String FgnCcy = "example FgnCcy";
java.math.BigDecimal RefSpotRate = new java.math.BigDecimal("100.00");
Boolean IsNdf = true;
OffsetDateTime FixingDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String SettlementCcy = "example SettlementCcy";
Boolean BookedAsSpot = true;
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();
Boolean IsPooled = true;


FxForward fxForwardInstance = new FxForward()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .DomAmount(DomAmount)
    .DomCcy(DomCcy)
    .FgnAmount(FgnAmount)
    .FgnCcy(FgnCcy)
    .RefSpotRate(RefSpotRate)
    .IsNdf(IsNdf)
    .FixingDate(FixingDate)
    .SettlementCcy(SettlementCcy)
    .BookedAsSpot(BookedAsSpot)
    .TimeZoneConventions(TimeZoneConventions)
    .IsPooled(IsPooled);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
