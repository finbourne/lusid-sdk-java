# com.finbourne.lusid.model.RecInstance
The expanded view of a rec instance: its identity, lifecycle status, lock state, closed periods  (for Closed Period windows) and, per rec type, the time-series of runs in that rec type's run log.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**RecInstanceId**](RecInstanceId.md) |  | [default to RecInstanceId]
**recDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**recDefinitionDisplayName** | **String** | The display name of the rec definition the rec was instantiated for, as it stood as-at instantiation. Not re-synchronised if the definition is later renamed. | [default to String]
**asAtInstantiated** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the instance was first created. | [default to OffsetDateTime]
**status** | **String** | The instance-level lifecycle rollup. Available values: Running, Failures, ReviewAndApproval, AllApproved, Locked. | [default to String]
**asAtLocked** | [**OffsetDateTime**](OffsetDateTime.md) | The wall-clock time the lock action was performed. Null when the instance has not been locked. | [optional] [default to OffsetDateTime]
**datesLocked** | [**RecDatesReconciled**](RecDatesReconciled.md) |  | [optional] [default to RecDatesReconciled]
**closedPeriods** | [**RecClosedPeriods**](RecClosedPeriods.md) |  | [optional] [default to RecClosedPeriods]
**runLogs** | [**Map&lt;String, RecRunLog&gt;**](RecRunLog.md) | The instance&#39;s run history, keyed by rec type. Contains an entry for each rec type that has produced a result set, so a run appears only once it has completed or failed. Empty while the instance&#39;s first run is still in flight. | [default to Map<String, RecRunLog>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.RecInstance;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecInstanceId Id = new RecInstanceId();
ResourceId RecDefinitionId = new ResourceId();
String RecDefinitionDisplayName = "example RecDefinitionDisplayName";
OffsetDateTime AsAtInstantiated = OffsetDateTime.now();
String Status = "example Status";
@jakarta.annotation.Nullable OffsetDateTime AsAtLocked = OffsetDateTime.now();
RecDatesReconciled DatesLocked = new RecDatesReconciled();
RecClosedPeriods ClosedPeriods = new RecClosedPeriods();
Map<String, RecRunLog> RunLogs = new Map<String, RecRunLog>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


RecInstance recInstanceInstance = new RecInstance()
    .Id(Id)
    .RecDefinitionId(RecDefinitionId)
    .RecDefinitionDisplayName(RecDefinitionDisplayName)
    .AsAtInstantiated(AsAtInstantiated)
    .Status(Status)
    .AsAtLocked(AsAtLocked)
    .DatesLocked(DatesLocked)
    .ClosedPeriods(ClosedPeriods)
    .RunLogs(RunLogs)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
