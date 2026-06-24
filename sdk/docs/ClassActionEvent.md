# com.finbourne.lusid.model.ClassActionEvent
Class Action Event (CLSA) — a voluntary corporate action under which security holders  receive cash compensation from a court-approved settlement fund following litigation  against an issuer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the settlement distribution is paid to the holder. | [optional] [default to OffsetDateTime]
**filingDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Court-set deadline for submitting a proof of claim. | [optional] [default to OffsetDateTime]
**classPeriodStart** | [**OffsetDateTime**](OffsetDateTime.md) | Lower bound of the eligibility window (inclusive). | [optional] [default to OffsetDateTime]
**classPeriodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | Upper bound of the eligibility window (inclusive). | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date from which the security trades without the settlement right.  Null for most class actions where no ex date is defined. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date at which positions are struck for notification scope. Informational only. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Settlement public-announcement or court-approval date. | [optional] [default to OffsetDateTime]
**caseReference** | **String** | Lawsuit or settlement-fund identifier (court case number, fund name). Audit-only. | [optional] [default to String]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | Cash offer elections for this event. Exactly one entry carrying the per-share  settlement amount as CashOfferPrice and settlement currency as CashOfferCurrency. | [optional] [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Lapse elections for this event. Exactly one entry (NOAC) with IsDefault &#x3D; true. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.lusid.model.ClassActionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime FilingDeadline = OffsetDateTime.now();
OffsetDateTime ClassPeriodStart = OffsetDateTime.now();
OffsetDateTime ClassPeriodEnd = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ExDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String CaseReference = "example CaseReference";
@jakarta.annotation.Nullable List<CashOfferElection> CashOfferElections = new List<CashOfferElection>();
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();


ClassActionEvent classActionEventInstance = new ClassActionEvent()
    .PaymentDate(PaymentDate)
    .FilingDeadline(FilingDeadline)
    .ClassPeriodStart(ClassPeriodStart)
    .ClassPeriodEnd(ClassPeriodEnd)
    .ExDate(ExDate)
    .RecordDate(RecordDate)
    .AnnouncementDate(AnnouncementDate)
    .CaseReference(CaseReference)
    .CashOfferElections(CashOfferElections)
    .LapseElections(LapseElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
