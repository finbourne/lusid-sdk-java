# com.finbourne.lusid.model.RecResult
An individual reconciliation result — the aggregate result for a set of core rule values within a  rec type, with its type/status, review and exception axes, rule values and item-level detail.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the result within its instance: its rec type, result type and result number, e.g. &#39;Holding-break-3&#39;. Unique within the instance, and kept across its runs for as long as the result keeps its result type. | [default to String]
**resultNumber** | **Integer** | The result&#39;s number within its result type. Kept across runs while the result keeps its type; never reused once assigned. | [default to Integer]
**firstRunSeen** | **Integer** | The run in which the result was first assigned its id. | [default to Integer]
**recType** | **String** | The type of rec that the result belongs to (e.g. Holding). Available values: Holding, CashHolding, Valuation, InputTransaction, OutputTransaction, SettlementActivity, External, Instrument. | [default to String]
**externalRecTypeName** | **String** | The client&#39;s name for an External rec type, as stamped from the matching ruleset&#39;s externalRecType when the run executed. Null for native rec types. Filterable. | [optional] [default to String]
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
**linkedResults** | [**List&lt;RecLinkedResult&gt;**](RecLinkedResult.md) | Results of other rec types in the same rec instance run whose items share an identifier with this result&#39;s items. Only exceptions link, and only to exceptions; symmetric. Set by the linking pass once every rec type of the run has completed, so empty until then. | [default to List<RecLinkedResult>]
**comments** | [**List&lt;RecUserComment&gt;**](RecUserComment.md) | User-authored comments attached to the result. Carried forward across runs. | [default to List<RecUserComment>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Properties in the RecResult domain. Filterable and sortable. Always includes the properties the matching ruleset populates, with a null value where the result holds none yet. | [optional] [default to Map<String, PerpetualProperty>]
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
Integer ResultNumber = new Integer("100.00");
Integer FirstRunSeen = new Integer("100.00");
String RecType = "example RecType";
@jakarta.annotation.Nullable String ExternalRecTypeName = "example ExternalRecTypeName";
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
List<RecLinkedResult> LinkedResults = new List<RecLinkedResult>();
List<RecUserComment> Comments = new List<RecUserComment>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String AssignedUser = "example AssignedUser";
@jakarta.annotation.Nullable String AssignedRole = "example AssignedRole";
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


RecResult recResultInstance = new RecResult()
    .Id(Id)
    .ResultNumber(ResultNumber)
    .FirstRunSeen(FirstRunSeen)
    .RecType(RecType)
    .ExternalRecTypeName(ExternalRecTypeName)
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
    .LinkedResults(LinkedResults)
    .Comments(Comments)
    .Properties(Properties)
    .AssignedUser(AssignedUser)
    .AssignedRole(AssignedRole)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
