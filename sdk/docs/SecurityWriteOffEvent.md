# com.finbourne.lusid.model.SecurityWriteOffEvent
Security write-off (WOFF) — removes a security holding from the portfolio at zero proceeds following an  issuer-, lender-, or regulator-declared write-off. The full eligible holding is debited on the PaymentDate;  no cash is received and no new security is credited. Supports Mandatory and Voluntary participation; on the  Voluntary path the holder submits a SubscribeElection to recognise (apply) the write-off.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | Positions are struck at close of business on this date to determine eligible holdings. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the security debit is processed in LUSID; no cash payment is associated. Must be &gt;&#x3D; RecordDate. | [optional] [default to OffsetDateTime]
**announcementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the issuer, agent or regulator announces the write-off. Optional — null when no separate  announcement date is provided. When populated, must be &lt;&#x3D; RecordDate. | [optional] [default to OffsetDateTime]
**subscribeElections** | [**List&lt;SubscribeElection&gt;**](SubscribeElection.md) | List of possible subscribe elections for this event. Populated on the Voluntary path only, where the  holder elects to recognise (apply) the write-off. Ignored on the Mandatory path. | [optional] [default to List<SubscribeElection>]

```java
import com.finbourne.lusid.model.SecurityWriteOffEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime RecordDate = OffsetDateTime.now();
OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AnnouncementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<SubscribeElection> SubscribeElections = new List<SubscribeElection>();


SecurityWriteOffEvent securityWriteOffEventInstance = new SecurityWriteOffEvent()
    .RecordDate(RecordDate)
    .PaymentDate(PaymentDate)
    .AnnouncementDate(AnnouncementDate)
    .SubscribeElections(SubscribeElections);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
