# com.finbourne.lusid.model.PaymentInKindEvent
A Payment in Kind (PINK) event recording that a ComplexBond has paid a coupon in kind. Mandatory and  purely informational: it carries no entitlement and generates no cash flow, movements or transactions,  and leaves Units, current face, PV and accrual untouched. The accretion itself stays with the intrinsic  chain driven by the bond's PikSchedule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first business day on which the in-kind coupon is not owed to the buying party. Anchors the  lifecycle; must be on or before PaymentDate. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date of the in-kind coupon this marker records. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the issuer announced the payment in kind. Optional and informational. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the holder of record is struck. Optional and informational; when supplied it must fall  on or between ExDate and PaymentDate. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the coupon that was paid in kind. Optional and informational. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PaymentInKindEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String Currency = "example Currency";


PaymentInKindEvent paymentInKindEventInstance = new PaymentInKindEvent()
    .ExDate(ExDate)
    .PaymentDate(PaymentDate)
    .AnnouncementDate(AnnouncementDate)
    .RecordDate(RecordDate)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
