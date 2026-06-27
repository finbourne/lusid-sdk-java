# com.finbourne.lusid.model.TenderEvent
Tender Event (TEND).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the tender is announced. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex date (entitlement date) of the event. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date you have to be the holder of record in order to participate in the tender. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the event. | [optional] [default to OffsetDateTime]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | The cash price paid in lieu of fractionalUnits. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** | The currency of the cash paid in lieu of fractionalUnits. | [optional] [default to String]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | List of possible SecurityOfferElections for this event. | [optional] [default to List<SecurityOfferElection>]
**cashAndSecurityOfferElections** | [**List&lt;CashAndSecurityOfferElection&gt;**](CashAndSecurityOfferElection.md) | List of possible CashAndSecurityOfferElections for this event. | [optional] [default to List<CashAndSecurityOfferElection>]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible CashOfferElections for this event. | [optional] [default to List<CashOfferElection>]
**offerType** | **String** | Informational ISO 20022 OfferTp indicator (e.g. \&quot;ACPR\&quot;). Optional. No calculation impact. | [optional] [default to String]
**accruedInterestPerUnit** | **java.math.BigDecimal** | Optional per-unit accrued interest on the tendered face, from the last coupon date up to  (but excluding) PaymentDate. Bond instrument types only. If left empty, analytics-core  resolves it at event time from the bond&#39;s coupon schedule and market data. | [optional] [default to java.math.BigDecimal]
**minPieceSize** | **java.math.BigDecimal** | Bond-specific minimum instructable face amount. Optional. Must be strictly positive when set. | [optional] [default to java.math.BigDecimal]
**minIncrement** | **java.math.BigDecimal** | Bond-specific increment above MinPieceSize. Optional. When set, MinPieceSize must also be set.  Must be strictly positive. | [optional] [default to java.math.BigDecimal]
**prorationRate** | **java.math.BigDecimal** | Proration applied when the offer is oversubscribed. Defaults to 1 if not set.  Must be greater than 0 and less than or equal to 1. | [optional] [default to java.math.BigDecimal]
**responseDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Account-servicer SLA deadline for holder instruction. Optional at the DTO layer;  required under Voluntary participation on bond instrument types. | [optional] [default to OffsetDateTime]
**marketDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Offeror&#39;s-agent deadline for holder instruction. Optional at the DTO layer;  required under Voluntary participation on bond instrument types. | [optional] [default to OffsetDateTime]
**earlyResponseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Optional early-tender deadline. When set, must be on or before ResponseDeadlineDate. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.TenderEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
OffsetDateTime ExDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
NewInstrument NewInstrument = new NewInstrument();
@jakarta.annotation.Nullable java.math.BigDecimal FractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FractionalUnitsCashCurrency = "example FractionalUnitsCashCurrency";
@jakarta.annotation.Nullable List<SecurityOfferElection> SecurityOfferElections = new List<SecurityOfferElection>();
@jakarta.annotation.Nullable List<CashAndSecurityOfferElection> CashAndSecurityOfferElections = new List<CashAndSecurityOfferElection>();
@jakarta.annotation.Nullable List<CashOfferElection> CashOfferElections = new List<CashOfferElection>();
@jakarta.annotation.Nullable String OfferType = "example OfferType";
@jakarta.annotation.Nullable java.math.BigDecimal AccruedInterestPerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal MinPieceSize = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal MinIncrement = new java.math.BigDecimal("100.00");
java.math.BigDecimal ProrationRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime ResponseDeadlineDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime MarketDeadlineDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EarlyResponseDeadline = OffsetDateTime.now();


TenderEvent tenderEventInstance = new TenderEvent()
    .AnnouncementDate(AnnouncementDate)
    .ExDate(ExDate)
    .RecordDate(RecordDate)
    .PaymentDate(PaymentDate)
    .NewInstrument(NewInstrument)
    .FractionalUnitsCashPrice(FractionalUnitsCashPrice)
    .FractionalUnitsCashCurrency(FractionalUnitsCashCurrency)
    .SecurityOfferElections(SecurityOfferElections)
    .CashAndSecurityOfferElections(CashAndSecurityOfferElections)
    .CashOfferElections(CashOfferElections)
    .OfferType(OfferType)
    .AccruedInterestPerUnit(AccruedInterestPerUnit)
    .MinPieceSize(MinPieceSize)
    .MinIncrement(MinIncrement)
    .ProrationRate(ProrationRate)
    .ResponseDeadlineDate(ResponseDeadlineDate)
    .MarketDeadlineDate(MarketDeadlineDate)
    .EarlyResponseDeadline(EarlyResponseDeadline);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
