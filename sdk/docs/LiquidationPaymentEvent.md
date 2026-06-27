# com.finbourne.lusid.model.LiquidationPaymentEvent
A liquidation payment event (LIQU).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The announcement date. Optional; informational only. | [optional] [default to OffsetDateTime]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | The cash offer elections for this event. | [default to List<CashOfferElection>]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex-date. Optional; informational only — entitlement uses RecordDate. | [optional] [default to OffsetDateTime]
**isFinal** | **Boolean** | True if this is the final distribution and the position should be closed; false for a partial distribution  where the position is retained and cost basis is reduced by the cash amount. | [default to Boolean]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the cash distribution is settled. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record date used to determine eligible holdings via settled units. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.LiquidationPaymentEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
List<CashOfferElection> CashOfferElections = new List<CashOfferElection>();
@jakarta.annotation.Nullable OffsetDateTime ExDate = OffsetDateTime.now();
Boolean IsFinal = true;
OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime RecordDate = OffsetDateTime.now();


LiquidationPaymentEvent liquidationPaymentEventInstance = new LiquidationPaymentEvent()
    .AnnouncementDate(AnnouncementDate)
    .CashOfferElections(CashOfferElections)
    .ExDate(ExDate)
    .IsFinal(IsFinal)
    .PaymentDate(PaymentDate)
    .RecordDate(RecordDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
