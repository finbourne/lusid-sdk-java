# com.finbourne.lusid.model.ConsentEvent
Consent Event (CONS) — a voluntary corporate action where an issuer seeks approval  from security holders to amend the terms of an outstanding instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consentType** | **String** | The type of consent solicitation.     Supported string (enumeration) values are: [ChangeInTerms, DueAndPayable]. Available values: ChangeInTerms, DueAndPayable. | [default to String]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entitlement determination date. | [optional] [default to OffsetDateTime]
**responseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | The last date to submit instructions. | [optional] [default to OffsetDateTime]
**marketDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | The issuer-set outer deadline. Must be greater than or equal to ResponseDeadline. | [optional] [default to OffsetDateTime]
**earlyResponseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Deadline for early consent. Required when a CONY-early CashOfferElection is offered.  Must be earlier than ResponseDeadline. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the consent fee is paid. Required when any CashOfferElection is offered. | [optional] [default to OffsetDateTime]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible cash offer elections for this event. Each tier (CONY-standard, CONY-early)  is modelled as a separate entry; the election carries the per-unit fee rate and currency. | [optional] [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | List of possible lapse elections for this event (NOAC, CONN, ABST). | [optional] [default to List<LapseElection>]

```java
import com.finbourne.lusid.model.ConsentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ConsentType = "example ConsentType";
OffsetDateTime RecordDate = OffsetDateTime.now();
OffsetDateTime ResponseDeadline = OffsetDateTime.now();
OffsetDateTime MarketDeadline = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EarlyResponseDeadline = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<CashOfferElection> CashOfferElections = new List<CashOfferElection>();
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();


ConsentEvent consentEventInstance = new ConsentEvent()
    .ConsentType(ConsentType)
    .RecordDate(RecordDate)
    .ResponseDeadline(ResponseDeadline)
    .MarketDeadline(MarketDeadline)
    .EarlyResponseDeadline(EarlyResponseDeadline)
    .PaymentDate(PaymentDate)
    .CashOfferElections(CashOfferElections)
    .LapseElections(LapseElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
