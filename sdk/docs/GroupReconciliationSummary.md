# com.finbourne.lusid.model.GroupReconciliationSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runDetails** | [**GroupReconciliationRunDetails**](GroupReconciliationRunDetails.md) |  | [optional] [default to GroupReconciliationRunDetails]
**groupReconciliationDefinitionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**reconciliationType** | **String** | The type of reconciliation to perform. \&quot;Holding\&quot; | \&quot;Transaction\&quot; | \&quot;Valuation\&quot; | [default to String]
**instanceId** | [**GroupReconciliationInstanceId**](GroupReconciliationInstanceId.md) |  | [default to GroupReconciliationInstanceId]
**datesReconciled** | [**GroupReconciliationDates**](GroupReconciliationDates.md) |  | [default to GroupReconciliationDates]
**reconciliationRunAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the reconciliation was run | [default to OffsetDateTime]
**countComparisonResults** | **Integer** | The total number of comparison results with this InstanceId and ReconciliationType | [default to Integer]
**linkComparisonResults** | [**Link**](Link.md) |  | [optional] [default to Link]
**resultTypes** | [**GroupReconciliationResultTypes**](GroupReconciliationResultTypes.md) |  | [optional] [default to GroupReconciliationResultTypes]
**resultStatuses** | [**GroupReconciliationResultStatuses**](GroupReconciliationResultStatuses.md) |  | [optional] [default to GroupReconciliationResultStatuses]
**reviewStatuses** | [**GroupReconciliationReviewStatuses**](GroupReconciliationReviewStatuses.md) |  | [optional] [default to GroupReconciliationReviewStatuses]

```java
import com.finbourne.lusid.model.GroupReconciliationSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

GroupReconciliationRunDetails RunDetails = new GroupReconciliationRunDetails();
ResourceId GroupReconciliationDefinitionId = new ResourceId();
String ReconciliationType = "example ReconciliationType";
GroupReconciliationInstanceId InstanceId = new GroupReconciliationInstanceId();
GroupReconciliationDates DatesReconciled = new GroupReconciliationDates();
OffsetDateTime ReconciliationRunAsAt = OffsetDateTime.now();
Integer CountComparisonResults = new Integer("100.00");
Link LinkComparisonResults = new Link();
GroupReconciliationResultTypes ResultTypes = new GroupReconciliationResultTypes();
GroupReconciliationResultStatuses ResultStatuses = new GroupReconciliationResultStatuses();
GroupReconciliationReviewStatuses ReviewStatuses = new GroupReconciliationReviewStatuses();


GroupReconciliationSummary groupReconciliationSummaryInstance = new GroupReconciliationSummary()
    .RunDetails(RunDetails)
    .GroupReconciliationDefinitionId(GroupReconciliationDefinitionId)
    .ReconciliationType(ReconciliationType)
    .InstanceId(InstanceId)
    .DatesReconciled(DatesReconciled)
    .ReconciliationRunAsAt(ReconciliationRunAsAt)
    .CountComparisonResults(CountComparisonResults)
    .LinkComparisonResults(LinkComparisonResults)
    .ResultTypes(ResultTypes)
    .ResultStatuses(ResultStatuses)
    .ReviewStatuses(ReviewStatuses);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
