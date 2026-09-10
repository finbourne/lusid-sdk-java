# com.finbourne.lusid.model.DividendSuspensionEvent
An issuer's decision to skip one scheduled preferred dividend without defaulting. Suppresses the  intrinsic dividend for the targeted payment date only; the schedule and every other payment continue.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**targetPaymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The intrinsically-scheduled dividend payment date this event suppresses. A date the instrument&#39;s  own schedule does not pay on leaves the event with no observable effect. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the issuer disclosed the suspension. Optional — null when not recorded. When populated,  must be &lt;&#x3D; TargetPaymentDate. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.DividendSuspensionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime TargetPaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();


DividendSuspensionEvent dividendSuspensionEventInstance = new DividendSuspensionEvent()
    .TargetPaymentDate(TargetPaymentDate)
    .AnnouncementDate(AnnouncementDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
