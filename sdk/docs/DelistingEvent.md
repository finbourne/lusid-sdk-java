# com.finbourne.lusid.model.DelistingEvent
A Delisting (DLST) corporate action. A mandatory notification that a security has been removed from  official exchange quotation. It records the trading-status change on the instrument's timeline and  generates no cash movement, no security movement, and no change to the holder's position — the position  is retained. DLST records listing status only; a valueless security with no distribution is a  WorthlessEvent (WRTH) and an issuer debt default is a BondDefaultEvent (DFLT).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the security is removed from official board quotation (the trading-status change takes effect). | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the delisting was announced. Optional — null when no separate announcement date is provided.  When populated, must be &lt;&#x3D; EffectiveDate. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.DelistingEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();


DelistingEvent delistingEventInstance = new DelistingEvent()
    .EffectiveDate(EffectiveDate)
    .AnnouncementDate(AnnouncementDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
