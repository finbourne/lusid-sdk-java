# com.finbourne.lusid.model.MatchingRuleset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the matching ruleset. | [default to String]
**recType** | **String** | The type of reconciliation to perform. Available values: Holding, CashHolding, Valuation, InputTransaction, OutputTransaction, SettlementActivity. | [default to String]
**datasetSchemas** | [**RecDatasetSchemas**](RecDatasetSchemas.md) |  | [default to RecDatasetSchemas]
**filters** | [**GroupReconciliationFilters**](GroupReconciliationFilters.md) |  | [optional] [default to GroupReconciliationFilters]
**coreRules** | [**List&lt;CoreMatchingRule&gt;**](CoreMatchingRule.md) | The core comparison rules evaluated as derivation formulae against each side of the reconciliation. | [default to List<CoreMatchingRule>]
**aggregateRules** | [**List&lt;AggregateMatchingRule&gt;**](AggregateMatchingRule.md) | The aggregate comparison rules evaluated as derivation formulae against values on each side of the reconciliation and operation to aggregate those values. | [default to List<AggregateMatchingRule>]
**coreTolerances** | [**List&lt;ToleranceBase&gt;**](ToleranceBase.md) | Tolerance configurations applied to core rule matching, in the specified order. | [optional] [default to List<ToleranceBase>]
**aggregateTolerances** | [**List&lt;ToleranceBase&gt;**](ToleranceBase.md) | Tolerance configurations applied to aggregate rule matching. | [optional] [default to List<ToleranceBase>]
**allowPartialMatching** | **Boolean** | Whether to permit partial matches when applying rules. | [optional] [default to Boolean]
**supplementalAttributes** | [**List&lt;SupplementalAttribute&gt;**](SupplementalAttribute.md) | Supplemental attributes that decorate reconciliation results with additional values without participating in the reconciliation itself. | [optional] [default to List<SupplementalAttribute>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.MatchingRuleset;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
String RecType = "example RecType";
RecDatasetSchemas DatasetSchemas = new RecDatasetSchemas();
GroupReconciliationFilters Filters = new GroupReconciliationFilters();
List<CoreMatchingRule> CoreRules = new List<CoreMatchingRule>();
List<AggregateMatchingRule> AggregateRules = new List<AggregateMatchingRule>();
@jakarta.annotation.Nullable List<ToleranceBase> CoreTolerances = new List<ToleranceBase>();
@jakarta.annotation.Nullable List<ToleranceBase> AggregateTolerances = new List<ToleranceBase>();
Boolean AllowPartialMatching = true;
@jakarta.annotation.Nullable List<SupplementalAttribute> SupplementalAttributes = new List<SupplementalAttribute>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


MatchingRuleset matchingRulesetInstance = new MatchingRuleset()
    .Id(Id)
    .DisplayName(DisplayName)
    .RecType(RecType)
    .DatasetSchemas(DatasetSchemas)
    .Filters(Filters)
    .CoreRules(CoreRules)
    .AggregateRules(AggregateRules)
    .CoreTolerances(CoreTolerances)
    .AggregateTolerances(AggregateTolerances)
    .AllowPartialMatching(AllowPartialMatching)
    .SupplementalAttributes(SupplementalAttributes)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
