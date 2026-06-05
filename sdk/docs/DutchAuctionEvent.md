# com.finbourne.lusid.model.DutchAuctionEvent
Dutch Auction Event (DTCH) — a voluntary corporate action with price-discovery, proration,  and per-holder bid audit. Tri-modal: CASH (uniform clearing-price cash buyback via  TenderOfferElection), SECU (clean security-for-security exchange via SecurityOfferElection),  or CASE (security exchange with signed per-unit cash settlement via CashAndSecurityOfferElection).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement date for both the security and cash legs of the auction. | [optional] [default to OffsetDateTime]
**marketDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Issuer or acquirer instruction deadline. | [optional] [default to OffsetDateTime]
**currency** | **String** | Event settlement currency (ISO 4217). | [default to String]
**tenderOfferElections** | [**List&lt;TenderOfferElection&gt;**](TenderOfferElection.md) | List of possible TenderOfferElections for this event. Populated on the CASH path (Count &#x3D;&#x3D; 1);  empty on the SECU and CASE paths. | [optional] [default to List<TenderOfferElection>]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | List of possible SecurityOfferElections for this event. Populated on the SECU path (Count &#x3D;&#x3D; 1);  empty on the CASH and CASE paths. | [optional] [default to List<SecurityOfferElection>]
**cashAndSecurityOfferElections** | [**List&lt;CashAndSecurityOfferElection&gt;**](CashAndSecurityOfferElection.md) | List of possible CashAndSecurityOfferElections for this event. Populated on the CASE path  (Count &#x3D;&#x3D; 1); empty on the CASH and SECU paths. | [optional] [default to List<CashAndSecurityOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | List of possible LapseElections for this event. Required on all three paths (Count &#x3D;&#x3D; 1).  Allows the holder to opt out of the offer (NOAC). | [optional] [default to List<LapseElection>]
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

```java
import com.finbourne.lusid.model.DutchAuctionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime MarketDeadlineDate = OffsetDateTime.now();
String Currency = "example Currency";
@jakarta.annotation.Nullable List<TenderOfferElection> TenderOfferElections = new List<TenderOfferElection>();
@jakarta.annotation.Nullable List<SecurityOfferElection> SecurityOfferElections = new List<SecurityOfferElection>();
@jakarta.annotation.Nullable List<CashAndSecurityOfferElection> CashAndSecurityOfferElections = new List<CashAndSecurityOfferElection>();
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();
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


DutchAuctionEvent dutchAuctionEventInstance = new DutchAuctionEvent()
    .PaymentDate(PaymentDate)
    .MarketDeadlineDate(MarketDeadlineDate)
    .Currency(Currency)
    .TenderOfferElections(TenderOfferElections)
    .SecurityOfferElections(SecurityOfferElections)
    .CashAndSecurityOfferElections(CashAndSecurityOfferElections)
    .LapseElections(LapseElections)
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
    .BidPrice(BidPrice);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
