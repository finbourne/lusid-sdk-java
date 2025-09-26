# com.finbourne.lusid.model.CashDividendEvent
A cash distribution paid out to shareholders.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the company begins distributing the dividend. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first business day on which the dividend is not owed to the buying party. | [optional] [default to OffsetDateTime]
**cashElections** | [**List&lt;CashElection&gt;**](CashElection.md) | Possible elections for this event, each keyed with a unique identifier. | [default to List<CashElection>]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the dividend is announced by the company. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date you have to be the holder of record in order to participate in the tender. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CashDividendEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime ExDate = OffsetDateTime.now();
List<CashElection> CashElections = new List<CashElection>();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();


CashDividendEvent cashDividendEventInstance = new CashDividendEvent()
    .PaymentDate(PaymentDate)
    .ExDate(ExDate)
    .CashElections(CashElections)
    .AnnouncementDate(AnnouncementDate)
    .RecordDate(RecordDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
