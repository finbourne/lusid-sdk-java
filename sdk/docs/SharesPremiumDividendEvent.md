# com.finbourne.lusid.model.SharesPremiumDividendEvent
Shares premium dividend (SHPR): a mandatory cash payment to shareholders out of the issuer's share premium  reserve. It is similar to a dividend but is booked as a return of capital: units are unchanged, cost falls by the  cash received and no income is recognised. Mandatory with one cash election, or MandatoryWithChoices for a  currency choice.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the share premium distribution is announced by the company. Informational. | [optional] [default to OffsetDateTime]
**cashElections** | [**List&lt;CashElection&gt;**](CashElection.md) | Possible cash elections for this event, each keyed with a unique identifier. One when Mandatory; two or more when MandatoryWithChoices. | [default to List<CashElection>]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first business day on which the distribution is not owed to the buying party. The entitlement date and the trade date. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the share premium distribution is paid. The settlement date of the generated transaction. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date you have to be the holder of record in order to receive the distribution. Informational. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.SharesPremiumDividendEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
List<CashElection> CashElections = new List<CashElection>();
OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();


SharesPremiumDividendEvent sharesPremiumDividendEventInstance = new SharesPremiumDividendEvent()
    .AnnouncementDate(AnnouncementDate)
    .CashElections(CashElections)
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .RecordDate(RecordDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
