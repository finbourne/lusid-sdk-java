# com.finbourne.lusid.model.BonusIssueEvent
Representation of a Bonus Issue corporate action.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the Bonus Issue is announced. | [optional] [default to OffsetDateTime]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The ex-date of the Bonus Issue. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record date of the Bonus Issue. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the Bonus Issue is executed. | [optional] [default to OffsetDateTime]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | Optional. Used in calculating cash-in-lieu of fractional shares. | [optional] [default to java.math.BigDecimal]
**fractionalUnitsCashCurrency** | **String** | Optional. Used in calculating cash-in-lieu of fractional shares. | [optional] [default to String]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | Possible SecurityElections for this Bonus Issue event, if any. | [optional] [default to List<SecurityOfferElection>]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | Possible CashOfferElections for this Bonus Issue event, if any. | [optional] [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | Possible LapseElections for this Bonus Issue event, if any. | [optional] [default to List<LapseElection>]

```java
import com.finbourne.lusid.model.BonusIssueEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
OffsetDateTime ExDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal FractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FractionalUnitsCashCurrency = "example FractionalUnitsCashCurrency";
@jakarta.annotation.Nullable List<SecurityOfferElection> SecurityOfferElections = new List<SecurityOfferElection>();
@jakarta.annotation.Nullable List<CashOfferElection> CashOfferElections = new List<CashOfferElection>();
@jakarta.annotation.Nullable List<LapseElection> LapseElections = new List<LapseElection>();


BonusIssueEvent bonusIssueEventInstance = new BonusIssueEvent()
    .AnnouncementDate(AnnouncementDate)
    .ExDate(ExDate)
    .RecordDate(RecordDate)
    .PaymentDate(PaymentDate)
    .FractionalUnitsCashPrice(FractionalUnitsCashPrice)
    .FractionalUnitsCashCurrency(FractionalUnitsCashCurrency)
    .SecurityOfferElections(SecurityOfferElections)
    .CashOfferElections(CashOfferElections)
    .LapseElections(LapseElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
