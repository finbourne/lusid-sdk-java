# com.finbourne.lusid.model.PutRedemptionEvent
Put Redemption (BPUT) — early redemption of a bond at the holder's election under an  indenture-defined put option. Supports both Voluntary (the AMI-SeCo canonical shape) and  Mandatory (a deliberate market extension beyond SCoRE) participation on Bond, ComplexBond,  and InflationLinkedBond instruments. Cloned from RepurchaseOfferEvent (BIDS) and narrowed  to debt with a fixed event-level OfferPrice instead of a per-election holder-bid price.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement date for the cash + security legs of the put redemption. | [optional] [default to OffsetDateTime]
**offerPrice** | **java.math.BigDecimal** | Put price per unit of face value (AMI-SeCo OFFR). Per-100 PRCT semantics —  &#x60;OfferPrice &#x3D; 100.00&#x60; means par; &#x60;97.50&#x60; means 97.5% of par. Must be strictly positive. | [default to java.math.BigDecimal]
**currency** | **String** | Settlement currency of the cash leg (ISO 4217 3-letter code). | [default to String]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible CashOfferElections. Exactly one entry per event in both Mandatory and Voluntary paths. | [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | List of possible LapseElections. Exactly one entry for Voluntary (NOAC default). Empty for Mandatory. | [default to List<LapseElection>]
**marketDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Issuer / agent deadline for holder instructions. Required for Voluntary participation;  optional for Mandatory (no holder-deadline concept). | [optional] [default to OffsetDateTime]
**responseDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Account-servicer deadline. Defaults to MarketDeadlineDate when omitted.  If set, must be on or before MarketDeadlineDate. | [optional] [default to OffsetDateTime]
**earlyResponseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Early-participation deadline. Rare on BPUT; carried for cross-event consistency.  If set, must be on or before ResponseDeadlineDate. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | AMI-SeCo §4.6 does not list this for BPUT; carried for cross-event consistency.  If set, must be on or before MarketDeadlineDate. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Public announcement date. If set, must be on or before ExDate. | [optional] [default to OffsetDateTime]
**accruedInterestPerUnit** | **java.math.BigDecimal** | Per-unit accrued interest. Optional — loader / post-processor derives from the bond&#39;s coupon  schedule and day-count when not supplied. EconomicallyComplete enforces non-null for  accrual-bearing instruments via InstrumentTypeAccruesInterest. | [optional] [default to java.math.BigDecimal]
**prorationRate** | **java.math.BigDecimal** | Issuer-side aggregate proration cap (AMI-SeCo PROR). Default 1.0; range (0, 1]. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PutRedemptionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
java.math.BigDecimal OfferPrice = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
List<CashOfferElection> CashOfferElections = new List<CashOfferElection>();
List<LapseElection> LapseElections = new List<LapseElection>();
@jakarta.annotation.Nullable OffsetDateTime MarketDeadlineDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ResponseDeadlineDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EarlyResponseDeadline = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ExDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal AccruedInterestPerUnit = new java.math.BigDecimal("100.00");
java.math.BigDecimal ProrationRate = new java.math.BigDecimal("100.00");


PutRedemptionEvent putRedemptionEventInstance = new PutRedemptionEvent()
    .PaymentDate(PaymentDate)
    .OfferPrice(OfferPrice)
    .Currency(Currency)
    .CashOfferElections(CashOfferElections)
    .LapseElections(LapseElections)
    .MarketDeadlineDate(MarketDeadlineDate)
    .ResponseDeadlineDate(ResponseDeadlineDate)
    .EarlyResponseDeadline(EarlyResponseDeadline)
    .ExDate(ExDate)
    .AnnouncementDate(AnnouncementDate)
    .AccruedInterestPerUnit(AccruedInterestPerUnit)
    .ProrationRate(ProrationRate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
