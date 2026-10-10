# com.finbourne.lusid.model.ConsentEvent
A consent solicitation (CONS) or a bondholder meeting's fee (BMET): voluntary when holders respond to it, mandatory when it pays a fee to every eligible holder without an instruction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consentType** | **String** | The type of consent solicitation. Optional; omitting it records Unknown.     Supported string (enumeration) values are: [ChangeInTerms, DueAndPayable, Unknown]. Available values: ChangeInTerms, DueAndPayable, Unknown. | [optional] [default to String]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entitlement determination date. | [optional] [default to OffsetDateTime]
**responseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | The last date to submit instructions. | [optional] [default to OffsetDateTime]
**marketDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | The issuer-set outer deadline. Must be greater than or equal to ResponseDeadline. | [optional] [default to OffsetDateTime]
**earlyResponseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | Deadline for instructions that qualify for an early fee. Optional. When set, must be earlier than ResponseDeadline. Must be null on a Mandatory event. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the fee is paid. Required when a CashOfferElection or a fee-bearing ConsentGrantedElection is offered; otherwise must be null. | [optional] [default to OffsetDateTime]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | Options that pay a cash fee to the holder who chooses them, whatever the vote: for example a fee for voting against, for a split vote or for an ineligible-holder confirmation. Keys are free-form and unique across all election lists. The price is quoted per 1,000 of face for bonds (the current notional at the record date: amortised face for a ComplexBond, inflation-adjusted face for an InflationLinkedBond) and per unit for equities and simple instruments. On a Mandatory event, exactly one, both default and chosen. | [optional] [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | List of possible lapse elections for this event (NOAC). | [optional] [default to List<LapseElection>]
**consentGrantedElections** | [**List&lt;ConsentGrantedElection&gt;**](ConsentGrantedElection.md) | List of possible consent-granted elections for this event (CONY), each optionally carrying a consent fee. | [optional] [default to List<ConsentGrantedElection>]
**consentDeniedElections** | [**List&lt;ConsentDeniedElection&gt;**](ConsentDeniedElection.md) | List of possible consent-denied elections for this event (CONN). | [optional] [default to List<ConsentDeniedElection>]
**abstainElections** | [**List&lt;AbstainElection&gt;**](AbstainElection.md) | List of possible abstain elections for this event (ABST). | [optional] [default to List<AbstainElection>]

```java
import com.finbourne.lusid.model.ConsentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ConsentType = "example ConsentType";
OffsetDateTime RecordDate = OffsetDateTime.now();
OffsetDateTime ResponseDeadline = OffsetDateTime.now();
OffsetDateTime MarketDeadline = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EarlyResponseDeadline = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<CashOfferElection> CashOfferElections = new List<CashOfferElection>();
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();
@jakarta.annotation.Nullable List<ConsentGrantedElection> ConsentGrantedElections = new List<ConsentGrantedElection>();
@jakarta.annotation.Nullable List<ConsentDeniedElection> ConsentDeniedElections = new List<ConsentDeniedElection>();
@jakarta.annotation.Nullable List<AbstainElection> AbstainElections = new List<AbstainElection>();


ConsentEvent consentEventInstance = new ConsentEvent()
    .ConsentType(ConsentType)
    .RecordDate(RecordDate)
    .ResponseDeadline(ResponseDeadline)
    .MarketDeadline(MarketDeadline)
    .EarlyResponseDeadline(EarlyResponseDeadline)
    .PaymentDate(PaymentDate)
    .CashOfferElections(CashOfferElections)
    .LapseElections(LapseElections)
    .ConsentGrantedElections(ConsentGrantedElections)
    .ConsentDeniedElections(ConsentDeniedElections)
    .AbstainElections(AbstainElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
