# com.finbourne.lusid.model.DutchAuctionEvent
Dutch Auction Event (DTCH) — a voluntary corporate action with price-discovery, proration,  and per-holder bid audit. Tri-modal: CASH (uniform clearing-price cash buyback via  TenderOfferElection), SECU (clean security-for-security exchange via SecurityOfferElection),  or CASE (security exchange with signed per-unit cash settlement via CashAndSecurityOfferElection).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement date for both the security and cash legs of the auction. | [optional] [default to OffsetDateTime]
**marketDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Issuer or acquirer instruction deadline. | [optional] [default to OffsetDateTime]
**currency** | **String** | Event settlement currency (ISO 4217). Optional: when absent the settlement currency is  taken from the elected path (TenderOfferCurrency, CashOfferCurrency or  FractionalUnitsCashCurrency as applicable). | [optional] [default to String]
**tenderOfferElections** | [**List&lt;TenderOfferElection&gt;**](TenderOfferElection.md) | List of possible TenderOfferElections for this event. Populated on the CASH path (Count &#x3D;&#x3D; 1);  empty on the SECU and CASE paths. | [optional] [default to List<TenderOfferElection>]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | List of possible SecurityOfferElections for this event. Populated on the SECU path (Count &#x3D;&#x3D; 1);  empty on the CASH and CASE paths. | [optional] [default to List<SecurityOfferElection>]
**cashAndSecurityOfferElections** | [**List&lt;CashAndSecurityOfferElection&gt;**](CashAndSecurityOfferElection.md) | List of possible CashAndSecurityOfferElections for this event. Populated on the CASE path  (Count &#x3D;&#x3D; 1); empty on the CASH and SECU paths. | [optional] [default to List<CashAndSecurityOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | List of possible LapseElections for this event. Required on all three paths (Count &#x3D;&#x3D; 1).  Allows the holder to opt out of the offer (NOAC). | [optional] [default to List<LapseElection>]
**mixedLotConstituentsElections** | [**List&lt;MixedLotConstituentsElection&gt;**](MixedLotConstituentsElection.md) | List of possible MixedLotConstituentsElections for this event, if any. Each election settles into one or more  distinct new securities and/or cash legs of its own, in place of the single event-level NewInstrument the  SecurityOffer and CashAndSecurityOffer paths resolve to.    Several may be present: a Dutch Auction commonly offers a number of mutually exclusive destinations, and each  is described by its own election. Not applicable to the CASH path, which has no security leg to multiply. | [optional] [default to List<MixedLotConstituentsElection>]
**unknownProceedsElections** | [**List&lt;UnknownProceedsElection&gt;**](UnknownProceedsElection.md) | List of possible unknown-proceeds elections for this event (UNKNOWN) — the outturn is not yet known. | [optional] [default to List<UnknownProceedsElection>]
**responseDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Account-servicer response deadline. Defaults to MarketDeadlineDate when not supplied.  When provided, must be on or before MarketDeadlineDate. | [optional] [default to OffsetDateTime]
**earlyResponseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Early-participation deadline. When provided, must be on or before ResponseDeadlineDate. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date of the event. Optional; carried for cross-event consistency. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record date of the event. Optional and not required by AMI-SeCo for DTCH  (the event is instruction-driven via QINS, not record-date-driven). | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Public announcement date of the auction. Optional. | [optional] [default to OffsetDateTime]
**targetQuantity** | **java.math.BigDecimal** | Total quantity of securities sought by the issuer or acquirer. Optional. | [optional] [default to java.math.BigDecimal]
**prorationRate** | **java.math.BigDecimal** | Proportional adjustment applied to the security and cash legs on all paths.  Must be in (0, 1]. | [optional] [default to java.math.BigDecimal]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [optional] [default to NewInstrument]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | Cash-in-lieu price per fractional unit on the SECU and CASE paths.  Null indicates round-down disposition of fractional remainders.  Distinct from the CASE path&#39;s main cash settlement (which lives on CashAndSecurityOfferElection). | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** | Currency of the cash-in-lieu paid on fractional remainders on the SECU and CASE paths.  Required when FractionalUnitsCashPrice is non-null. | [optional] [default to String]
**bidPrice** | **java.math.BigDecimal** | Per-holder bid price submitted at instruction time. Audit-only; no calculation impact. | [optional] [default to java.math.BigDecimal]
**electionProrationRates** | [**List&lt;ElectionProrationRate&gt;**](ElectionProrationRate.md) | Optional proration rate per option, keyed by election key. An entry overrides ProrationRate for that  election; an option without an entry uses ProrationRate. Each key must name a TenderOffer, SecurityOffer,  CashAndSecurityOffer or MixedLotConstituents election of this event, once, with a rate in (0, 1]. | [optional] [default to List<ElectionProrationRate>]
**minPieceSize** | **java.math.BigDecimal** | Optional minimum tradable piece of the accepted quantity, in face for a bond and in units otherwise.  Must be strictly positive when set. With AcceptedQuantityRounding RoundDown, an accepted quantity below it  is rounded to zero. | [optional] [default to java.math.BigDecimal]
**minIncrement** | **java.math.BigDecimal** | Optional tradable increment above MinPieceSize, in the same unit. When set, MinPieceSize must also be set.  Must be strictly positive. With AcceptedQuantityRounding RoundDown, the accepted quantity is rounded down to  MinPieceSize plus a whole number of increments. | [optional] [default to java.math.BigDecimal]
**acceptedQuantityRounding** | **String** | How a prorated accepted quantity that is not a whole tradable lot is disposed of. RoundDown rounds it down  to the tradable lot, or to a whole unit when no lot size is given, and the remainder stays in the holding.  CashInLieu accepts the unrounded quantity. When omitted the accepted quantity is not rounded. Available values: RoundDown, CashInLieu. | [optional] [default to String]

```java
import com.finbourne.lusid.model.DutchAuctionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime MarketDeadlineDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String Currency = "example Currency";
@jakarta.annotation.Nullable List<TenderOfferElection> TenderOfferElections = new List<TenderOfferElection>();
@jakarta.annotation.Nullable List<SecurityOfferElection> SecurityOfferElections = new List<SecurityOfferElection>();
@jakarta.annotation.Nullable List<CashAndSecurityOfferElection> CashAndSecurityOfferElections = new List<CashAndSecurityOfferElection>();
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();
@jakarta.annotation.Nullable List<MixedLotConstituentsElection> MixedLotConstituentsElections = new List<MixedLotConstituentsElection>();
@jakarta.annotation.Nullable List<UnknownProceedsElection> UnknownProceedsElections = new List<UnknownProceedsElection>();
@jakarta.annotation.Nullable OffsetDateTime ResponseDeadlineDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EarlyResponseDeadline = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ExDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal TargetQuantity = new java.math.BigDecimal("100.00");
java.math.BigDecimal ProrationRate = new java.math.BigDecimal("100.00");
NewInstrument NewInstrument = new NewInstrument();
@jakarta.annotation.Nullable java.math.BigDecimal FractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FractionalUnitsCashCurrency = "example FractionalUnitsCashCurrency";
@jakarta.annotation.Nullable java.math.BigDecimal BidPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<ElectionProrationRate> ElectionProrationRates = new List<ElectionProrationRate>();
@jakarta.annotation.Nullable java.math.BigDecimal MinPieceSize = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal MinIncrement = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String AcceptedQuantityRounding = "example AcceptedQuantityRounding";


DutchAuctionEvent dutchAuctionEventInstance = new DutchAuctionEvent()
    .PaymentDate(PaymentDate)
    .MarketDeadlineDate(MarketDeadlineDate)
    .Currency(Currency)
    .TenderOfferElections(TenderOfferElections)
    .SecurityOfferElections(SecurityOfferElections)
    .CashAndSecurityOfferElections(CashAndSecurityOfferElections)
    .LapseElections(LapseElections)
    .MixedLotConstituentsElections(MixedLotConstituentsElections)
    .UnknownProceedsElections(UnknownProceedsElections)
    .ResponseDeadlineDate(ResponseDeadlineDate)
    .EarlyResponseDeadline(EarlyResponseDeadline)
    .ExDate(ExDate)
    .RecordDate(RecordDate)
    .AnnouncementDate(AnnouncementDate)
    .TargetQuantity(TargetQuantity)
    .ProrationRate(ProrationRate)
    .NewInstrument(NewInstrument)
    .FractionalUnitsCashPrice(FractionalUnitsCashPrice)
    .FractionalUnitsCashCurrency(FractionalUnitsCashCurrency)
    .BidPrice(BidPrice)
    .ElectionProrationRates(ElectionProrationRates)
    .MinPieceSize(MinPieceSize)
    .MinIncrement(MinIncrement)
    .AcceptedQuantityRounding(AcceptedQuantityRounding);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
