# com.finbourne.lusid.model.DividendOptionEvent
DVOP

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the dividend was announced / declared. | [optional] [default to OffsetDateTime]
**cashElections** | [**List&lt;CashElection&gt;**](CashElection.md) | CashElection for this DividendReinvestmentEvent | [default to List<CashElection>]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first business day on which the dividend is not owed to the buying party.  Typically this is T-1 from the RecordDate. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the company pays out dividends to shareholders. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date you have to be the holder of record in order to participate in the tender. | [optional] [default to OffsetDateTime]
**securityElections** | [**List&lt;SecurityElection&gt;**](SecurityElection.md) | SecurityElection for this DividendReinvestmentEvent | [default to List<SecurityElection>]
**securitySettlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the additional units. Equal to the PaymentDate if not provided. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.DividendOptionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
List<CashElection> CashElections = new List<CashElection>();
OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
List<SecurityElection> SecurityElections = new List<SecurityElection>();
@jakarta.annotation.Nullable OffsetDateTime SecuritySettlementDate = OffsetDateTime.now();


DividendOptionEvent dividendOptionEventInstance = new DividendOptionEvent()
    .AnnouncementDate(AnnouncementDate)
    .CashElections(CashElections)
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .RecordDate(RecordDate)
    .SecurityElections(SecurityElections)
    .SecuritySettlementDate(SecuritySettlementDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
