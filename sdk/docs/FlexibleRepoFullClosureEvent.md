# com.finbourne.lusid.model.FlexibleRepoFullClosureEvent
Event to trigger the full closure of a repurchase agreement booked as a FlexibleRepo.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which the closure begins. | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date on which closure takes place, i.e., when all repurchase trades settle. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.FlexibleRepoFullClosureEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EntitlementDate = OffsetDateTime.now();
OffsetDateTime SettlementDate = OffsetDateTime.now();


FlexibleRepoFullClosureEvent flexibleRepoFullClosureEventInstance = new FlexibleRepoFullClosureEvent()
    .EntitlementDate(EntitlementDate)
    .SettlementDate(SettlementDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
