# com.finbourne.lusid.model.RepurchaseOfferEvent
Representation of a repurchase offer corporate action.  Represents an offer by the issuer to repurchase its own shares from a shareholder at a given price.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Payment date of the event. | [optional] [default to OffsetDateTime]
**marketDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date set by the issuer or by an agent of the issuer as the latest date to respond to the offer. Must be before or equal to the PaymentDate. | [optional] [default to OffsetDateTime]
**repurchaseQuantity** | **java.math.BigDecimal** | Quantity of the security to be repurchased. | [default to java.math.BigDecimal]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible CashOfferElections for this event. Only 1 should be provided. | [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | List of possible LapseElections for this event. Only 1 should be provided.  Allows the user to opt out of the offer. | [default to List<LapseElection>]
**tenderOfferElections** | [**List&lt;TenderOfferElection&gt;**](TenderOfferElection.md) | List of possible TenderOfferElections for this event. Only 1 should be provided. | [default to List<TenderOfferElection>]
**prorationRate** | **java.math.BigDecimal** | The fraction used to calculate a proportional adjustment for RepurchaseQuantity when a full period is not used.  Defaults to 1 if not set. Must be greater than 0 and less than or equal to 1. | [optional] [default to java.math.BigDecimal]
**responseDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date set by the account servicer as the latest date to respond to the offer.  Optional. If set, must be before or equal to MarketDeadlineDate.  Defaults to MarketDeadlineDate if not set. | [optional] [default to OffsetDateTime]
**earlyResponseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Optional CTEN early-tender deadline. If set, must be on or before ResponseDeadlineDate.  Used for bond tender offers where early tenders attract a premium. | [optional] [default to OffsetDateTime]
**minPieceSize** | **java.math.BigDecimal** | Bond-specific minimum instructable face amount. Optional.  Must be strictly positive when set. | [optional] [default to java.math.BigDecimal]
**minIncrement** | **java.math.BigDecimal** | Bond-specific increment above MinPieceSize. Optional.  When set, MinPieceSize must also be set. Must be strictly positive. | [optional] [default to java.math.BigDecimal]
**accruedInterestPerUnit** | **java.math.BigDecimal** | Optional per-unit accrued interest on the accepted face amount, from the last coupon date  up to (but excluding) PaymentDate. Bond-like instruments only. If left empty,  resolves it internally at event time from the bond&#39;s coupon schedule and market data. | [optional] [default to java.math.BigDecimal]
**consentAndTenderElections** | [**List&lt;ConsentAndTenderElection&gt;**](ConsentAndTenderElection.md) | List of possible consent-and-tender elections for this event (CTEN) — tender the holding and grant consent together. | [optional] [default to List<ConsentAndTenderElection>]
**consentGrantedElections** | [**List&lt;ConsentGrantedElection&gt;**](ConsentGrantedElection.md) | List of possible consent-granted elections for this event (CONY) — vote in favour, optionally attracting a consent fee. | [optional] [default to List<ConsentGrantedElection>]
**consentDeniedElections** | [**List&lt;ConsentDeniedElection&gt;**](ConsentDeniedElection.md) | List of possible consent-denied elections for this event (CONN) — vote against the proposal. | [optional] [default to List<ConsentDeniedElection>]
**abstainElections** | [**List&lt;AbstainElection&gt;**](AbstainElection.md) | List of possible abstain elections for this event (ABST) — decline to vote on the consent. | [optional] [default to List<AbstainElection>]
**unknownProceedsElections** | [**List&lt;UnknownProceedsElection&gt;**](UnknownProceedsElection.md) | List of possible unknown-proceeds elections for this event (UNKNOWN) — the outturn is not yet known. | [optional] [default to List<UnknownProceedsElection>]

```java
import com.finbourne.lusid.model.RepurchaseOfferEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime MarketDeadlineDate = OffsetDateTime.now();
java.math.BigDecimal RepurchaseQuantity = new java.math.BigDecimal("100.00");
List<CashOfferElection> CashOfferElections = new List<CashOfferElection>();
List<LapseElection> LapseElections = new List<LapseElection>();
List<TenderOfferElection> TenderOfferElections = new List<TenderOfferElection>();
java.math.BigDecimal ProrationRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime ResponseDeadlineDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EarlyResponseDeadline = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal MinPieceSize = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal MinIncrement = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal AccruedInterestPerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<ConsentAndTenderElection> ConsentAndTenderElections = new List<ConsentAndTenderElection>();
@jakarta.annotation.Nullable List<ConsentGrantedElection> ConsentGrantedElections = new List<ConsentGrantedElection>();
@jakarta.annotation.Nullable List<ConsentDeniedElection> ConsentDeniedElections = new List<ConsentDeniedElection>();
@jakarta.annotation.Nullable List<AbstainElection> AbstainElections = new List<AbstainElection>();
@jakarta.annotation.Nullable List<UnknownProceedsElection> UnknownProceedsElections = new List<UnknownProceedsElection>();


RepurchaseOfferEvent repurchaseOfferEventInstance = new RepurchaseOfferEvent()
    .PaymentDate(PaymentDate)
    .MarketDeadlineDate(MarketDeadlineDate)
    .RepurchaseQuantity(RepurchaseQuantity)
    .CashOfferElections(CashOfferElections)
    .LapseElections(LapseElections)
    .TenderOfferElections(TenderOfferElections)
    .ProrationRate(ProrationRate)
    .ResponseDeadlineDate(ResponseDeadlineDate)
    .EarlyResponseDeadline(EarlyResponseDeadline)
    .MinPieceSize(MinPieceSize)
    .MinIncrement(MinIncrement)
    .AccruedInterestPerUnit(AccruedInterestPerUnit)
    .ConsentAndTenderElections(ConsentAndTenderElections)
    .ConsentGrantedElections(ConsentGrantedElections)
    .ConsentDeniedElections(ConsentDeniedElections)
    .AbstainElections(AbstainElections)
    .UnknownProceedsElections(UnknownProceedsElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
