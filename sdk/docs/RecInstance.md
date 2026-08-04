# com.finbourne.lusid.model.RecInstance
The expanded view of a rec instance: its identity, lifecycle status, lock state, closed periods  (for Closed Period windows) and the time-series of runs in the run log.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**RecInstanceId**](RecInstanceId.md) |  | [default to RecInstanceId]
**recDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**asAtInstantiated** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the instance was first created. | [default to OffsetDateTime]
**workflowTaskInstantiated** | [**RecWorkflowTask**](RecWorkflowTask.md) |  | [optional] [default to RecWorkflowTask]
**status** | **String** | The instance-level lifecycle rollup. Available values: Running, Failures, ReviewAndApproval, AllApproved, Locked. | [default to String]
**asAtLocked** | [**OffsetDateTime**](OffsetDateTime.md) | The wall-clock time the lock action was performed. Null when the instance has not been locked. | [optional] [default to OffsetDateTime]
**datesLocked** | [**RecDatesReconciled**](RecDatesReconciled.md) |  | [optional] [default to RecDatesReconciled]
**closedPeriods** | [**RecClosedPeriods**](RecClosedPeriods.md) |  | [optional] [default to RecClosedPeriods]
**runLog** | [**List&lt;RecRunLogEntry&gt;**](RecRunLogEntry.md) | A chronologically ordered list of all runs on the instance. Always contains at least one entry. | [default to List<RecRunLogEntry>]
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
OffsetDateTime AsAtInstantiated = OffsetDateTime.now();
RecWorkflowTask WorkflowTaskInstantiated = new RecWorkflowTask();
String Status = "example Status";
@jakarta.annotation.Nullable OffsetDateTime AsAtLocked = OffsetDateTime.now();
RecDatesReconciled DatesLocked = new RecDatesReconciled();
RecClosedPeriods ClosedPeriods = new RecClosedPeriods();
List<RecRunLogEntry> RunLog = new List<RecRunLogEntry>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


RecInstance recInstanceInstance = new RecInstance()
    .Id(Id)
    .RecDefinitionId(RecDefinitionId)
    .AsAtInstantiated(AsAtInstantiated)
    .WorkflowTaskInstantiated(WorkflowTaskInstantiated)
    .Status(Status)
    .AsAtLocked(AsAtLocked)
    .DatesLocked(DatesLocked)
    .ClosedPeriods(ClosedPeriods)
    .RunLog(RunLog)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
