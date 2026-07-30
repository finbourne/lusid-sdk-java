# com.finbourne.lusid.model.RecResultSetApprovalDecisionRequest
The request for an approver to approve a submitted review or request revisions. Each call satisfies  (or rejects) one approval slot from the result set's required approvals.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approvalCode** | **String** | The approval slot being decided. Must match a required approval code. | [default to String]
**decision** | **String** | The decision made. Available values: Approve, RequestRevisions. | [default to String]
**reason** | **String** | Rationale for the decision. | [optional] [default to String]
**requestedResultRevisions** | [**List&lt;RecRequestedResultRevision&gt;**](RecRequestedResultRevision.md) | The results flagged for re-review. Only applicable when the decision is Request Revisions. | [optional] [default to List<RecRequestedResultRevision>]

```java
import com.finbourne.lusid.model.RecResultSetApprovalDecisionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ApprovalCode = "example ApprovalCode";
String Decision = "example Decision";
@jakarta.annotation.Nullable String Reason = "example Reason";
@jakarta.annotation.Nullable List<RecRequestedResultRevision> RequestedResultRevisions = new List<RecRequestedResultRevision>();


RecResultSetApprovalDecisionRequest recResultSetApprovalDecisionRequestInstance = new RecResultSetApprovalDecisionRequest()
    .ApprovalCode(ApprovalCode)
    .Decision(Decision)
    .Reason(Reason)
    .RequestedResultRevisions(RequestedResultRevisions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
