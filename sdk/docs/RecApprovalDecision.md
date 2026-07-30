# com.finbourne.lusid.model.RecApprovalDecision
An entry in the append-only log of approver decisions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approvalCode** | **String** | The approval slot this decision satisfies. Must match a required approval code. | [default to String]
**decision** | **String** | The decision made. Available values: Approve, RequestRevisions. | [default to String]
**reason** | **String** | Rationale for the decision. | [optional] [default to String]
**userId** | **String** | The approver who made the decision. | [default to String]
**asAtDecided** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the decision was made. | [default to OffsetDateTime]
**asAtSuperseded** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which this entry was superseded. Null when it is the current standing entry. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.RecApprovalDecision;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ApprovalCode = "example ApprovalCode";
String Decision = "example Decision";
@jakarta.annotation.Nullable String Reason = "example Reason";
String UserId = "example UserId";
OffsetDateTime AsAtDecided = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAtSuperseded = OffsetDateTime.now();


RecApprovalDecision recApprovalDecisionInstance = new RecApprovalDecision()
    .ApprovalCode(ApprovalCode)
    .Decision(Decision)
    .Reason(Reason)
    .UserId(UserId)
    .AsAtDecided(AsAtDecided)
    .AsAtSuperseded(AsAtSuperseded);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
