# com.finbourne.lusid.model.GroupReconciliationComparisonResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**reconciliationType** | **String** | The type of reconciliation to perform. \&quot;Holding\&quot; | \&quot;Transaction\&quot; | \&quot;Valuation\&quot; | [default to String]
**groupReconciliationDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instanceId** | [**GroupReconciliationInstanceId**](GroupReconciliationInstanceId.md) |  | [default to GroupReconciliationInstanceId]
**comparisonResultId** | **String** | Comparison result identifier, encoded value for core attribute results, aggregate attribute results, reconciliation type and run instanceId. | [default to String]
**reconciliationRunAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the run occurred. | [default to OffsetDateTime]
**resultType** | **String** | Reconciliation run general result. \&quot;Break\&quot; | \&quot;Match\&quot; | \&quot;PartialMatch\&quot; | \&quot;NotFound | [default to String]
**resultStatus** | **String** | Indicates how a particular result evolves from one run to the next. \&quot;New\&quot; | \&quot;Confirmed\&quot; | \&quot;Changed\&quot; | [default to String]
**reviewStatus** | **String** | Status of whether user has provided any input (comments, manual matches, break codes). \&quot;Pending\&quot; | \&quot;Reviewed\&quot; | \&quot;Matched\&quot; | \&quot;Invalid\&quot; | [default to String]
**datesReconciled** | [**GroupReconciliationDates**](GroupReconciliationDates.md) |  | [default to GroupReconciliationDates]
**coreAttributes** | [**GroupReconciliationCoreAttributeValues**](GroupReconciliationCoreAttributeValues.md) |  | [default to GroupReconciliationCoreAttributeValues]
**aggregateAttributes** | [**GroupReconciliationAggregateAttributeValues**](GroupReconciliationAggregateAttributeValues.md) |  | [default to GroupReconciliationAggregateAttributeValues]
**userReview** | [**GroupReconciliationUserReview**](GroupReconciliationUserReview.md) |  | [optional] [default to GroupReconciliationUserReview]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GroupReconciliationComparisonResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String ReconciliationType = "example ReconciliationType";
ResourceId GroupReconciliationDefinitionId = new ResourceId();
GroupReconciliationInstanceId InstanceId = new GroupReconciliationInstanceId();
String ComparisonResultId = "example ComparisonResultId";
OffsetDateTime ReconciliationRunAsAt = OffsetDateTime.now();
String ResultType = "example ResultType";
String ResultStatus = "example ResultStatus";
String ReviewStatus = "example ReviewStatus";
GroupReconciliationDates DatesReconciled = new GroupReconciliationDates();
GroupReconciliationCoreAttributeValues CoreAttributes = new GroupReconciliationCoreAttributeValues();
GroupReconciliationAggregateAttributeValues AggregateAttributes = new GroupReconciliationAggregateAttributeValues();
GroupReconciliationUserReview UserReview = new GroupReconciliationUserReview();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GroupReconciliationComparisonResult groupReconciliationComparisonResultInstance = new GroupReconciliationComparisonResult()
    .Id(Id)
    .ReconciliationType(ReconciliationType)
    .GroupReconciliationDefinitionId(GroupReconciliationDefinitionId)
    .InstanceId(InstanceId)
    .ComparisonResultId(ComparisonResultId)
    .ReconciliationRunAsAt(ReconciliationRunAsAt)
    .ResultType(ResultType)
    .ResultStatus(ResultStatus)
    .ReviewStatus(ReviewStatus)
    .DatesReconciled(DatesReconciled)
    .CoreAttributes(CoreAttributes)
    .AggregateAttributes(AggregateAttributes)
    .UserReview(UserReview)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
