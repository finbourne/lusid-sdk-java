# com.finbourne.lusid.model.FxForward
LUSID representation of an FX Forward.  Including FX Spot and Non-Deliverable Forwards.     This instrument has multiple legs, to see how legs are used in LUSID see [knowledge base article KA-02252](https://support.lusid.com/knowledgebase/article/KA-02252).     | Leg Index | Leg Identifier | Description |  | --------- | -------------- | ----------- |  | 1 | DomesticLeg | Cash flows in the domestic currency of the forward. |  | 2 | ForeignLeg | Cash flows in the foreign currency of the forward (not present for non-deliverable forwards). |

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**domAmount** | **java.math.BigDecimal** | The amount that is to be paid in the domestic currency on the maturity date. | [default to java.math.BigDecimal]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**fgnAmount** | **java.math.BigDecimal** | The amount that is to be paid in the foreign currency on the maturity date. | [default to java.math.BigDecimal]
**fgnCcy** | **String** | The foreign (other) currency of the instrument. In the NDF case, only payments are made in the domestic currency.  For the outright forward, currencies are exchanged. | [default to String]
**refSpotRate** | **java.math.BigDecimal** | The reference Fx Spot rate for currency pair Foreign-Domestic that was seen on the trade start date (time). | [optional] [default to java.math.BigDecimal]
**isNdf** | **Boolean** | Is the contract an Fx-Forward of \&quot;Non-Deliverable\&quot; type, meaning a single payment in the domestic currency based on the change in fx-rate vs  a reference rate is used.  Defaults to false if not set. | [optional] [default to Boolean]
**fixingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The fixing date. | [optional] [default to OffsetDateTime]
**settlementCcy** | **String** | The settlement currency.  If provided, present value will be calculated in settlement currency, otherwise the domestic currency. Applies only to non-deliverable FX Forwards. | [optional] [default to String]
**bookedAsSpot** | **Boolean** | Boolean flag for FX Forward transactions booked with Spot settlement. This will default to False if not provided.  For information purposes only, this does not impact LUSID valuation, analytics, cashflows or events, but may be used by third party vendors. | [optional] [default to Boolean]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

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
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
