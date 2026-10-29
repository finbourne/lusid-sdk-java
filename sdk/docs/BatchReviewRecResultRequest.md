# com.finbourne.lusid.model.BatchReviewRecResultRequest
One item of a batch review request: applies review content to its targeted rec result(s). Exactly  one target, except FixAsGroup/ForceMatch which require two or more. A result id is unique within one  instance. Every item names the rec type of its targets, so a group decision covers results of one rec type  only.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceId** | [**RecInstanceId**](RecInstanceId.md) |  | [default to RecInstanceId]
**recType** | **String** | The rec type whose results this item targets (e.g. Holding). Available values: Holding, CashHolding, Valuation, InputTransaction, OutputTransaction, SettlementActivity, External, Instrument. | [default to String]
**recResultIds** | **List&lt;String&gt;** | The rec results targeted by this batch item. Exactly one, except FixAsGroup/ForceMatch which require two or more. | [default to List<String>]
**decision** | [**RecResultDecisionUpdate**](RecResultDecisionUpdate.md) |  | [optional] [default to RecResultDecisionUpdate]
**assignedUser** | [**RecResultAssignmentUpdate**](RecResultAssignmentUpdate.md) |  | [optional] [default to RecResultAssignmentUpdate]
**assignedRole** | [**RecResultAssignmentUpdate**](RecResultAssignmentUpdate.md) |  | [optional] [default to RecResultAssignmentUpdate]
**addCommentText** | **String** | Optional comment text to add to each targeted result. | [optional] [default to String]
**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) | Properties in the RecResult domain to set on each result. A property with a null value is deleted and omitted properties are left unchanged. | [optional] [default to List<PerpetualProperty>]

```java
import com.finbourne.lusid.model.BatchReviewRecResultRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecInstanceId InstanceId = new RecInstanceId();
String RecType = "example RecType";
List<String> RecResultIds = new List<String>();
RecResultDecisionUpdate Decision = new RecResultDecisionUpdate();
RecResultAssignmentUpdate AssignedUser = new RecResultAssignmentUpdate();
RecResultAssignmentUpdate AssignedRole = new RecResultAssignmentUpdate();
@jakarta.annotation.Nullable String AddCommentText = "example AddCommentText";
@jakarta.annotation.Nullable List<PerpetualProperty> Properties = new List<PerpetualProperty>();


BatchReviewRecResultRequest batchReviewRecResultRequestInstance = new BatchReviewRecResultRequest()
    .InstanceId(InstanceId)
    .RecType(RecType)
    .RecResultIds(RecResultIds)
    .Decision(Decision)
    .AssignedUser(AssignedUser)
    .AssignedRole(AssignedRole)
    .AddCommentText(AddCommentText)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
