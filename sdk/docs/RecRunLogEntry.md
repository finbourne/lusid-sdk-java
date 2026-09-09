# com.finbourne.lusid.model.RecRunLogEntry
A summary of a single run of a single rec type within an instance's run log, carrying the per-run outcome  detail the grouped-by-instance overview renders. Every entry comes off a result set, so only a run that has  completed or failed appears: a run still in flight is not logged until it lands.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runNumber** | **Integer** | The run number within the instance. Increments with each re-run. | [default to Integer]
**runAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the run happened. | [default to OffsetDateTime]
**supersededAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which this run was superseded by a subsequent run. | [optional] [default to OffsetDateTime]
**datesReconciled** | [**RecDatesReconciled**](RecDatesReconciled.md) |  | [default to RecDatesReconciled]
**execution** | [**RecExecution**](RecExecution.md) |  | [default to RecExecution]
**approvalStatus** | **String** | The position of this result set in the approval ceremony. Available values: UnderReview, PendingApproval, RevisionsRequested, Approved, NotApplicable. | [default to String]
**resultCounts** | [**RecResultCounts**](RecResultCounts.md) |  | [optional] [default to RecResultCounts]
**review** | [**RecReview**](RecReview.md) |  | [optional] [default to RecReview]
**recResultSetHref** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) of the full rec result set this run belongs to. | [default to URI]

```java
import com.finbourne.lusid.model.RecRunLogEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer RunNumber = new Integer("100.00");
OffsetDateTime RunAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime SupersededAsAt = OffsetDateTime.now();
RecDatesReconciled DatesReconciled = new RecDatesReconciled();
RecExecution Execution = new RecExecution();
String ApprovalStatus = "example ApprovalStatus";
RecResultCounts ResultCounts = new RecResultCounts();
RecReview Review = new RecReview();
URI RecResultSetHref = URI.create("http://example.com/RecResultSetHref");


RecRunLogEntry recRunLogEntryInstance = new RecRunLogEntry()
    .RunNumber(RunNumber)
    .RunAsAt(RunAsAt)
    .SupersededAsAt(SupersededAsAt)
    .DatesReconciled(DatesReconciled)
    .Execution(Execution)
    .ApprovalStatus(ApprovalStatus)
    .ResultCounts(ResultCounts)
    .Review(Review)
    .RecResultSetHref(RecResultSetHref);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
