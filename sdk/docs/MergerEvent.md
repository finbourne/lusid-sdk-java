# com.finbourne.lusid.model.MergerEvent
Merger Event (MRGR).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the merger is announced. | [optional] [default to OffsetDateTime]
**cashAndSecurityOfferElections** | [**List&lt;CashAndSecurityOfferElection&gt;**](CashAndSecurityOfferElection.md) | List of possible CashAndSecurityOfferElections for this merger event | [optional] [default to List<CashAndSecurityOfferElection>]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible CashOfferElections for this merger event | [optional] [default to List<CashOfferElection>]
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first date on which the holder of record of the original shares has entitled ownership of the new shares. | [optional] [default to OffsetDateTime]
**fractionalUnitsCashCurrency** | **String** | Optional. Used in calculating cash-in-lieu of fractional shares. | [optional] [default to String]
**fractionalUnitsCashPrice** | **java.math.BigDecimal** | Optional. Used in calculating cash-in-lieu of fractional shares. | [optional] [default to java.math.BigDecimal]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the merger takes place. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional. Date you have to be the holder of record of the original shares in order to receive the new shares. | [optional] [default to OffsetDateTime]
**securityOfferElections** | [**List&lt;SecurityOfferElection&gt;**](SecurityOfferElection.md) | List of possible SecurityOfferElections for this merger event | [optional] [default to List<SecurityOfferElection>]

```java
import com.finbourne.lusid.model.MergerEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<CashAndSecurityOfferElection> CashAndSecurityOfferElections = new List<CashAndSecurityOfferElection>();
@jakarta.annotation.Nullable List<CashOfferElection> CashOfferElections = new List<CashOfferElection>();
OffsetDateTime ExDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String FractionalUnitsCashCurrency = "example FractionalUnitsCashCurrency";
@jakarta.annotation.Nullable java.math.BigDecimal FractionalUnitsCashPrice = new java.math.BigDecimal("100.00");
NewInstrument NewInstrument = new NewInstrument();
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<SecurityOfferElection> SecurityOfferElections = new List<SecurityOfferElection>();


MergerEvent mergerEventInstance = new MergerEvent()
    .AnnouncementDate(AnnouncementDate)
    .CashAndSecurityOfferElections(CashAndSecurityOfferElections)
    .CashOfferElections(CashOfferElections)
    .ExDate(ExDate)
    .FractionalUnitsCashCurrency(FractionalUnitsCashCurrency)
    .FractionalUnitsCashPrice(FractionalUnitsCashPrice)
    .NewInstrument(NewInstrument)
    .PaymentDate(PaymentDate)
    .RecordDate(RecordDate)
    .SecurityOfferElections(SecurityOfferElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
