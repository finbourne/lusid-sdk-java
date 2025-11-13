# com.finbourne.lusid.model.DepositRollEvent
Event used to represent a roll on a FlexibleDeposit instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entitlement date of the roll event. | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the roll event. | [optional] [default to OffsetDateTime]
**principalUpdates** | [**RollPrincipalUpdates**](RollPrincipalUpdates.md) |  | [default to RollPrincipalUpdates]
**interestUpdates** | [**RollInterestUpdates**](RollInterestUpdates.md) |  | [default to RollInterestUpdates]
**newSchedule** | [**Schedule**](Schedule.md) |  | [optional] [default to Schedule]

```java
import com.finbourne.lusid.model.DepositRollEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EntitlementDate = OffsetDateTime.now();
OffsetDateTime SettlementDate = OffsetDateTime.now();
RollPrincipalUpdates PrincipalUpdates = new RollPrincipalUpdates();
RollInterestUpdates InterestUpdates = new RollInterestUpdates();
Schedule NewSchedule = new Schedule();


DepositRollEvent depositRollEventInstance = new DepositRollEvent()
    .EntitlementDate(EntitlementDate)
    .SettlementDate(SettlementDate)
    .PrincipalUpdates(PrincipalUpdates)
    .InterestUpdates(InterestUpdates)
    .NewSchedule(NewSchedule);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
