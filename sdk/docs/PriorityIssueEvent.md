# com.finbourne.lusid.model.PriorityIssueEvent
Priority Issue Event (PRIO) — a voluntary corporate action in which an issuer offers existing  security holders preferential rights to subscribe for new securities at a defined subscription  price before the offer is opened to the wider market. Holders may subscribe up to a basic  entitlement (SECU) and, where offered, apply for additional securities beyond the basic  entitlement (OVER, subject to proration). No instruction (NOAC) results in no transaction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the priority issue was announced. Optional, informational. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | First business day on which the security trades without the entitlement. Optional.  When not supplied, transaction-template generation falls back to RecordDate | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entitlement determination date — holders of record on this date are eligible to subscribe. | [optional] [default to OffsetDateTime]
**responseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | The account-servicer instruction deadline. Must be less than or equal to MarketDeadline. | [optional] [default to OffsetDateTime]
**marketDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | The issuer-agent deadline. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which cash is debited and the new securities are credited. | [optional] [default to OffsetDateTime]
**securitySettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the security leg settles when it differs from the cash leg. Optional.  When not supplied, transaction-template generation falls back to PaymentDate | [optional] [default to OffsetDateTime]
**subscriptionPrice** | **java.math.BigDecimal** | The subscription price per new unit. Applies to both SECU and OVER subscriptions.  Must be greater than zero. | [optional] [default to java.math.BigDecimal]
**subscriptionCurrency** | **String** | Currency of the SubscriptionPrice. | [optional] [default to String]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [optional] [default to NewInstrument]
**prorationRate** | **java.math.BigDecimal** | The proration rate applied to OVER subscriptions when the offer is oversubscribed.  Treated as 1 (full allocation) when not supplied. Must be greater than 0 and less than  or equal to 1. SECU basic entitlement is never prorated. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | Price per fractional unit used to compute cash-in-lieu for fractional entitlement remainders.  When not supplied, fractional residuals are discarded with no cash-in-lieu.  Forms an optional pair with FractionalUnitsCashCurrency — both must be supplied together. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** | Currency of FractionalUnitsCashPrice. Required if and only if FractionalUnitsCashPrice is supplied. | [optional] [default to String]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | Security offer elections — exactly one entry keyed &#39;SECU&#39; (basic entitlement) and an optional  entry keyed &#39;OVER&#39; (over-subscription) when the issuer offers the over-subscription facility. | [optional] [default to List<SecurityOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Lapse elections — exactly one entry keyed &#39;NOAC&#39;, recording the holder&#39;s explicit no-action election. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.lusid.model.PriorityIssueEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime RecordDate = OffsetDateTime.now();
OffsetDateTime ResponseDeadline = OffsetDateTime.now();
OffsetDateTime MarketDeadline = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime SecuritySettlementDate = OffsetDateTime.now();
java.math.BigDecimal SubscriptionPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String SubscriptionCurrency = "example SubscriptionCurrency";
NewInstrument NewInstrument = new NewInstrument();
@jakarta.annotation.Nullable java.math.BigDecimal ProrationRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal FractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FractionalUnitsCashCurrency = "example FractionalUnitsCashCurrency";
@jakarta.annotation.Nullable List<SecurityOfferElection> SecurityOfferElections = new List<SecurityOfferElection>();
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();


PriorityIssueEvent priorityIssueEventInstance = new PriorityIssueEvent()
    .AnnouncementDate(AnnouncementDate)
    .ExDate(ExDate)
    .RecordDate(RecordDate)
    .ResponseDeadline(ResponseDeadline)
    .MarketDeadline(MarketDeadline)
    .PaymentDate(PaymentDate)
    .SecuritySettlementDate(SecuritySettlementDate)
    .SubscriptionPrice(SubscriptionPrice)
    .SubscriptionCurrency(SubscriptionCurrency)
    .NewInstrument(NewInstrument)
    .ProrationRate(ProrationRate)
    .FractionalUnitsCashPrice(FractionalUnitsCashPrice)
    .FractionalUnitsCashCurrency(FractionalUnitsCashCurrency)
    .SecurityOfferElections(SecurityOfferElections)
    .LapseElections(LapseElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
