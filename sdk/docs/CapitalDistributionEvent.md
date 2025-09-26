# com.finbourne.lusid.model.CapitalDistributionEvent
A capital distribution paid out to shareholders.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the dividend was announced / declared. | [optional] [default to OffsetDateTime]
**cashElections** | [**List&lt;CashElection&gt;**](CashElection.md) | Possible elections for this event, each keyed with a unique identifier. | [default to List<CashElection>]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first business day on which the dividend is not owed to the buying party. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the company begins distributing the dividend. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date you have to be the holder of record in order to participate in the tender. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CapitalDistributionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
List<CashElection> CashElections = new List<CashElection>();
OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();


CapitalDistributionEvent capitalDistributionEventInstance = new CapitalDistributionEvent()
    .AnnouncementDate(AnnouncementDate)
    .CashElections(CashElections)
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .RecordDate(RecordDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
