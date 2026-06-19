# com.finbourne.lusid.model.InterestPaymentEvent
Interest Payment event (INTR). A cash distribution of interest from a debt issuer to its noteholders,  carrying a per-unit absolute interest rate on each CashElection. Supports Mandatory  (single declared election) and MandatoryWithChoices (one election per offered currency) participation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record-date cut-off determining entitlement. Required. Map from the vendor RecordDate (NOT the  ExDate sentinel). | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the interest is paid to noteholders. Required. Also the effective date of the event. | [optional] [default to OffsetDateTime]
**responseDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | The holder-instruction deadline. Required for MandatoryWithChoices; must be null for Mandatory. | [optional] [default to OffsetDateTime]
**marketDeadline** | [**OffsetDateTime**](OffsetDateTime.md) | The market-organisation deadline. Required for MandatoryWithChoices; must be null for Mandatory. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the event was announced by the issuer. Optional. | [optional] [default to OffsetDateTime]
**cashElections** | [**List&lt;CashElection&gt;**](CashElection.md) | The cash elections for this event. For Mandatory participation a single declared election is supplied  with IsDeclared, IsDefault and IsChosen all true; for MandatoryWithChoices one entry per offered  currency is supplied, with exactly one declared, one default and one chosen. Every election carries a  per-unit absolute (signed) DividendRate and an ExchangeRate of 1. | [default to List<CashElection>]

```java
import com.finbourne.lusid.model.InterestPaymentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime RecordDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ResponseDeadline = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime MarketDeadline = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
List<CashElection> CashElections = new List<CashElection>();


InterestPaymentEvent interestPaymentEventInstance = new InterestPaymentEvent()
    .RecordDate(RecordDate)
    .PaymentDate(PaymentDate)
    .ResponseDeadline(ResponseDeadline)
    .MarketDeadline(MarketDeadline)
    .AnnouncementDate(AnnouncementDate)
    .CashElections(CashElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
