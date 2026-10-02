# com.finbourne.lusid.model.BatchReviewRecResultRequest
One item of a batch review request: applies review content to its targeted rec result(s). Exactly  one target, except FixAsGroup/ForceMatch which require two or more. A result id identifies a result only  within one run of one rec type of one instance, so every item names the run its targets belong to — which  also makes the same-result-set rule for group decisions structural.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceId** | [**RecInstanceId**](RecInstanceId.md) |  | [default to RecInstanceId]
**recType** | **String** | The rec type whose results this item targets (e.g. Holding). Available values: Holding, CashHolding, Valuation, InputTransaction, OutputTransaction, SettlementActivity. | [default to String]
**runNumber** | **Integer** | The run of the instance whose results this item targets. | [default to Integer]
**recResultIds** | **List&lt;String&gt;** | The rec results targeted by this batch item. Exactly one, except FixAsGroup/ForceMatch which require two or more. | [default to List<String>]
**decision** | [**RecResultDecisionUpdate**](RecResultDecisionUpdate.md) |  | [optional] [default to RecResultDecisionUpdate]
**assignedUser** | [**RecResultAssignmentUpdate**](RecResultAssignmentUpdate.md) |  | [optional] [default to RecResultAssignmentUpdate]
**assignedRole** | [**RecResultAssignmentUpdate**](RecResultAssignmentUpdate.md) |  | [optional] [default to RecResultAssignmentUpdate]
**addCommentText** | **String** | Optional comment text to add to each targeted result. | [optional] [default to String]
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) | Properties in the RecResult domain. Filterable and sortable. | [optional] [default to List<PerpetualProperty>]

```java
import com.finbourne.lusid.model.BatchReviewRecResultRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecInstanceId InstanceId = new RecInstanceId();
String RecType = "example RecType";
Integer RunNumber = new Integer("100.00");
List<String> RecResultIds = new List<String>();
RecResultDecisionUpdate Decision = new RecResultDecisionUpdate();
RecResultAssignmentUpdate AssignedUser = new RecResultAssignmentUpdate();
RecResultAssignmentUpdate AssignedRole = new RecResultAssignmentUpdate();
@jakarta.annotation.Nullable String AddCommentText = "example AddCommentText";
@jakarta.annotation.Nullable List<PerpetualProperty> Properties = new List<PerpetualProperty>();


BatchReviewRecResultRequest batchReviewRecResultRequestInstance = new BatchReviewRecResultRequest()
    .InstanceId(InstanceId)
    .RecType(RecType)
    .RunNumber(RunNumber)
    .RecResultIds(RecResultIds)
    .Decision(Decision)
    .AssignedUser(AssignedUser)
    .AssignedRole(AssignedRole)
    .AddCommentText(AddCommentText)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
