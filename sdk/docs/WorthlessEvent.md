# com.finbourne.lusid.model.WorthlessEvent
Mandatory corporate action that removes a security holding from the portfolio at zero proceeds (zero-recovery write-off, WRTH).  The full eligible holding is debited on the PaymentDate; no cash is received and no new security is credited.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Positions are struck at close of business on this date to determine eligible holdings. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the security debit is processed in LUSID; no cash payment is associated. Must be &gt;&#x3D; RecordDate. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the issuer or agent announces the write-off. Optional — null when no separate announcement date is provided.  When populated, must be &lt;&#x3D; RecordDate. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.WorthlessEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime RecordDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();


WorthlessEvent worthlessEventInstance = new WorthlessEvent()
    .RecordDate(RecordDate)
    .PaymentDate(PaymentDate)
    .AnnouncementDate(AnnouncementDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
