# com.finbourne.lusid.model.RecResult
An individual reconciliation result — the aggregate result for a set of core rule values within a  rec type, with its type/status, review and exception axes, rule values and item-level detail.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The system-generated identifier for the rec result. Comprises the rec definition id, the instance id, the rec type and the core rule values. | [default to String]
**recType** | **String** | The type of rec that the result belongs to (e.g. Holding). Available values: Holding, CashHolding, Valuation, InputTransaction, OutputTransaction, SettlementActivity. | [default to String]
**instanceId** | [**RecInstanceId**](RecInstanceId.md) |  | [default to RecInstanceId]
**recDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**runNumber** | **Integer** | The run number within the instance. Increments with each re-run. | [default to Integer]
**runAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the run happened. | [default to OffsetDateTime]
**datesReconciled** | [**RecDatesReconciled**](RecDatesReconciled.md) |  | [default to RecDatesReconciled]
**resultType** | **String** | The type of result. Exceptions: PartialMatch, PartialCross, Break. Non-exceptions: Match, Cross. Available values: Match, Cross, PartialMatch, PartialCross, Break. | [default to String]
**resultCardinality** | **String** | The item cardinality of the result, read left to right (e.g. OneToOne, ManyToNone). Available values: OneToOne, OneToMany, ManyToOne, ManyToMany, OneToNone, ManyToNone, NoneToOne, NoneToMany, NoneToNone. | [default to String]
**resultLifeCycle** | **String** | The run-over-run change in the result, evaluated each run against the prior run. Available values: New, Unchanged, Changed, Cleared. | [default to String]
**exception** | [**RecResultException**](RecResultException.md) |  | [optional] [default to RecResultException]
**review** | [**RecResultReview**](RecResultReview.md) |  | [default to RecResultReview]
**coreRules** | [**List&lt;CoreRuleValues&gt;**](CoreRuleValues.md) | The core matching rules and the values that pin this result to its reconciled position. | [default to List<CoreRuleValues>]
**aggregateRules** | [**List&lt;AggregateRuleValues&gt;**](AggregateRuleValues.md) | The aggregate matching rules and their measured values. | [default to List<AggregateRuleValues>]
**supplementalAttributes** | [**List&lt;SupplementalAttributeValues&gt;**](SupplementalAttributeValues.md) | Additional attribute values carried on the result for context. Do not contribute to matching or the result id. | [default to List<SupplementalAttributeValues>]
**items** | [**RecResultItemDetails**](RecResultItemDetails.md) |  | [default to RecResultItemDetails]
**comments** | [**List&lt;RecUserComment&gt;**](RecUserComment.md) | User-authored comments attached to the result. Carried forward across runs. | [default to List<RecUserComment>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties in the RecResult domain. Filterable and sortable. | [optional] [default to Map<String, PerpetualProperty>]
**assignedUser** | **String** | The LUSID user id assigned to the result. | [optional] [default to String]
**assignedRole** | **String** | The LUSID IAM role id assigned to the result. | [optional] [default to String]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.RecResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String RecType = "example RecType";
RecInstanceId InstanceId = new RecInstanceId();
ResourceId RecDefinitionId = new ResourceId();
Integer RunNumber = new Integer("100.00");
OffsetDateTime RunAsAt = OffsetDateTime.now();
RecDatesReconciled DatesReconciled = new RecDatesReconciled();
String ResultType = "example ResultType";
String ResultCardinality = "example ResultCardinality";
String ResultLifeCycle = "example ResultLifeCycle";
RecResultException Exception = new RecResultException();
RecResultReview Review = new RecResultReview();
List<CoreRuleValues> CoreRules = new List<CoreRuleValues>();
List<AggregateRuleValues> AggregateRules = new List<AggregateRuleValues>();
List<SupplementalAttributeValues> SupplementalAttributes = new List<SupplementalAttributeValues>();
RecResultItemDetails Items = new RecResultItemDetails();
List<RecUserComment> Comments = new List<RecUserComment>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String AssignedUser = "example AssignedUser";
@jakarta.annotation.Nullable String AssignedRole = "example AssignedRole";
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


RecResult recResultInstance = new RecResult()
    .Id(Id)
    .RecType(RecType)
    .InstanceId(InstanceId)
    .RecDefinitionId(RecDefinitionId)
    .RunNumber(RunNumber)
    .RunAsAt(RunAsAt)
    .DatesReconciled(DatesReconciled)
    .ResultType(ResultType)
    .ResultCardinality(ResultCardinality)
    .ResultLifeCycle(ResultLifeCycle)
    .Exception(Exception)
    .Review(Review)
    .CoreRules(CoreRules)
    .AggregateRules(AggregateRules)
    .SupplementalAttributes(SupplementalAttributes)
    .Items(Items)
    .Comments(Comments)
    .Properties(Properties)
    .AssignedUser(AssignedUser)
    .AssignedRole(AssignedRole)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
