# com.finbourne.lusid.model.RecResultSet
The collection of reconciliation results for a given rec type within a rec instance. Identified by  its rec type and instance. The latest run's data is promoted to the root; prior runs are available  via previousRuns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recType** | **String** | The type of rec that this result set belongs to (e.g. Holding). Together with the rec instance, this uniquely identifies the result set. Available values: Holding, Transaction, Valuation, CashHolding. | [default to String]
**recInstance** | [**RecInstanceSummary**](RecInstanceSummary.md) |  | [default to RecInstanceSummary]
**runNumber** | **Integer** | The run number within the instance. Increments with each re-run. | [default to Integer]
**runAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the run happened. | [default to OffsetDateTime]
**execution** | [**RecExecution**](RecExecution.md) |  | [default to RecExecution]
**datesReconciled** | [**RecDatesReconciled**](RecDatesReconciled.md) |  | [default to RecDatesReconciled]
**resultCounts** | [**RecResultCounts**](RecResultCounts.md) |  | [default to RecResultCounts]
**review** | [**RecReview**](RecReview.md) |  | [default to RecReview]
**approvalStatus** | **String** | The position of this result set in the approval ceremony. Available values: UnderReview, PendingApproval, RevisionsRequested, Approved, NotApplicable. | [default to String]
**requiredApprovals** | [**List&lt;RecRequiredApproval&gt;**](RecRequiredApproval.md) | The approval slots required for this result set, passed through from the rec definition&#39;s review configuration. May be empty. | [default to List<RecRequiredApproval>]
**submissions** | [**List&lt;RecSubmission&gt;**](RecSubmission.md) | An append-only log of review submissions. May be empty. | [default to List<RecSubmission>]
**decisions** | [**List&lt;RecApprovalDecision&gt;**](RecApprovalDecision.md) | An append-only log of approver decisions. May be empty. | [default to List<RecApprovalDecision>]
**previousRuns** | [**List&lt;RecSupersededRun&gt;**](RecSupersededRun.md) | Prior run snapshots, each frozen at the point of re-run. Populated only when includePreviousRuns is true. | [default to List<RecSupersededRun>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.RecResultSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RecType = "example RecType";
RecInstanceSummary RecInstance = new RecInstanceSummary();
Integer RunNumber = new Integer("100.00");
OffsetDateTime RunAsAt = OffsetDateTime.now();
RecExecution Execution = new RecExecution();
RecDatesReconciled DatesReconciled = new RecDatesReconciled();
RecResultCounts ResultCounts = new RecResultCounts();
RecReview Review = new RecReview();
String ApprovalStatus = "example ApprovalStatus";
List<RecRequiredApproval> RequiredApprovals = new List<RecRequiredApproval>();
List<RecSubmission> Submissions = new List<RecSubmission>();
List<RecApprovalDecision> Decisions = new List<RecApprovalDecision>();
List<RecSupersededRun> PreviousRuns = new List<RecSupersededRun>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


RecResultSet recResultSetInstance = new RecResultSet()
    .RecType(RecType)
    .RecInstance(RecInstance)
    .RunNumber(RunNumber)
    .RunAsAt(RunAsAt)
    .Execution(Execution)
    .DatesReconciled(DatesReconciled)
    .ResultCounts(ResultCounts)
    .Review(Review)
    .ApprovalStatus(ApprovalStatus)
    .RequiredApprovals(RequiredApprovals)
    .Submissions(Submissions)
    .Decisions(Decisions)
    .PreviousRuns(PreviousRuns)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
