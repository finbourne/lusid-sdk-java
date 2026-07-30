# com.finbourne.lusid.model.RecSupersededRun
A prior run snapshot, frozen at the point of re-run. Has the same shape as the root-level run  fields on the result set, plus the asAt at which the run was superseded.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runNumber** | **Integer** | The run number within the instance. Increments with each re-run. | [default to Integer]
**runAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the run happened. | [default to OffsetDateTime]
**supersededAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which this run was superseded by a subsequent run. | [default to OffsetDateTime]
**execution** | [**RecExecution**](RecExecution.md) |  | [default to RecExecution]
**datesReconciled** | [**RecDatesReconciled**](RecDatesReconciled.md) |  | [default to RecDatesReconciled]
**resultCounts** | [**RecResultCounts**](RecResultCounts.md) |  | [default to RecResultCounts]
**review** | [**RecReview**](RecReview.md) |  | [default to RecReview]
**approvalStatus** | **String** | The position of this result set in the approval ceremony. Available values: UnderReview, PendingApproval, RevisionsRequested, Approved, NotApplicable. | [default to String]
**requiredApprovals** | [**List&lt;RecRequiredApproval&gt;**](RecRequiredApproval.md) | The approval slots required for this result set, passed through from the rec definition&#39;s review configuration. May be empty. | [default to List<RecRequiredApproval>]
**submissions** | [**List&lt;RecSubmission&gt;**](RecSubmission.md) | An append-only log of review submissions. May be empty. | [default to List<RecSubmission>]
**decisions** | [**List&lt;RecApprovalDecision&gt;**](RecApprovalDecision.md) | An append-only log of approver decisions. May be empty. | [default to List<RecApprovalDecision>]

```java
import com.finbourne.lusid.model.RecSupersededRun;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer RunNumber = new Integer("100.00");
OffsetDateTime RunAsAt = OffsetDateTime.now();
OffsetDateTime SupersededAsAt = OffsetDateTime.now();
RecExecution Execution = new RecExecution();
RecDatesReconciled DatesReconciled = new RecDatesReconciled();
RecResultCounts ResultCounts = new RecResultCounts();
RecReview Review = new RecReview();
String ApprovalStatus = "example ApprovalStatus";
List<RecRequiredApproval> RequiredApprovals = new List<RecRequiredApproval>();
List<RecSubmission> Submissions = new List<RecSubmission>();
List<RecApprovalDecision> Decisions = new List<RecApprovalDecision>();


RecSupersededRun recSupersededRunInstance = new RecSupersededRun()
    .RunNumber(RunNumber)
    .RunAsAt(RunAsAt)
    .SupersededAsAt(SupersededAsAt)
    .Execution(Execution)
    .DatesReconciled(DatesReconciled)
    .ResultCounts(ResultCounts)
    .Review(Review)
    .ApprovalStatus(ApprovalStatus)
    .RequiredApprovals(RequiredApprovals)
    .Submissions(Submissions)
    .Decisions(Decisions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
