# com.finbourne.lusid.model.RecInstanceSummary
A lightweight view of the rec instance, nested on each result set. It carries the instance-level  status, which is how a result set surfaces the instance's running/locked state to the dashboard.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**RecInstanceId**](RecInstanceId.md) |  | [default to RecInstanceId]
**recDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**recDefinitionDisplayName** | **String** | The display name of the rec definition the rec was instantiated for, as it stood as-at instantiation. Not re-synchronised if the definition is later renamed. | [default to String]
**asAtInstantiated** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the instance was first created. | [default to OffsetDateTime]
**status** | **String** | The instance-level lifecycle rollup. Available values: Running, Failures, ReviewAndApproval, AllApproved, Locked. | [default to String]
**asAtLocked** | [**OffsetDateTime**](OffsetDateTime.md) | The wall-clock time the lock action was performed. Null when the instance has not been locked. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.RecInstanceSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecInstanceId Id = new RecInstanceId();
ResourceId RecDefinitionId = new ResourceId();
String RecDefinitionDisplayName = "example RecDefinitionDisplayName";
OffsetDateTime AsAtInstantiated = OffsetDateTime.now();
String Status = "example Status";
@jakarta.annotation.Nullable OffsetDateTime AsAtLocked = OffsetDateTime.now();


RecInstanceSummary recInstanceSummaryInstance = new RecInstanceSummary()
    .Id(Id)
    .RecDefinitionId(RecDefinitionId)
    .RecDefinitionDisplayName(RecDefinitionDisplayName)
    .AsAtInstantiated(AsAtInstantiated)
    .Status(Status)
    .AsAtLocked(AsAtLocked);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
