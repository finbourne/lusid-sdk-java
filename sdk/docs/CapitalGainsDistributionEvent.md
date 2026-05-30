# com.finbourne.lusid.model.CapitalGainsDistributionEvent
Capital Gains Distribution event (CAPG). Distributes realised capital gains from a fund's asset sales  as a gross cash rate per eligible unit. Supports a currency-choice variant (CHOS) under  MandatoryWithChoices participation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the cash distribution is paid to shareholders. Required. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first business day on which the distribution is not owed to the buying party. Required. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date positions are struck for entitlement. Optional. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the event was announced. Optional. | [optional] [default to OffsetDateTime]
**cashElections** | [**List&lt;CashElection&gt;**](CashElection.md) | The cash elections for this event. For Mandatory participation supply a single declared election;  for MandatoryWithChoices supply one per available currency, with IsDeclared set on the declared  option and IsChosen on the elected option. | [optional] [default to List<CashElection>]

```java
import com.finbourne.lusid.model.CapitalGainsDistributionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime ExDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<CashElection> CashElections = new List<CashElection>();


CapitalGainsDistributionEvent capitalGainsDistributionEventInstance = new CapitalGainsDistributionEvent()
    .PaymentDate(PaymentDate)
    .ExDate(ExDate)
    .RecordDate(RecordDate)
    .AnnouncementDate(AnnouncementDate)
    .CashElections(CashElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
