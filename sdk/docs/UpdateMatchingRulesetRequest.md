# com.finbourne.lusid.model.UpdateMatchingRulesetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the matching ruleset. | [default to String]
**recType** | **String** | The type of reconciliation to perform. Available values: Holding, CashHolding, Valuation, InputTransaction, OutputTransaction, SettlementActivity. | [default to String]
**datasetSchemas** | [**RecDatasetSchemas**](RecDatasetSchemas.md) |  | [optional] [default to RecDatasetSchemas]
**filters** | [**GroupReconciliationFilters**](GroupReconciliationFilters.md) |  | [optional] [default to GroupReconciliationFilters]
**coreRules** | [**List&lt;CoreMatchingRule&gt;**](CoreMatchingRule.md) | The core comparison rules evaluated as derivation formulae against each side of the reconciliation. | [default to List<CoreMatchingRule>]
**aggregateRules** | [**List&lt;AggregateMatchingRule&gt;**](AggregateMatchingRule.md) | The aggregate comparison rules evaluated as derivation formulae against values on each side of the reconciliation and operation to aggregate those values. | [default to List<AggregateMatchingRule>]
**coreTolerances** | [**List&lt;ToleranceBase&gt;**](ToleranceBase.md) | Tolerance configurations applied to core rule matching, in the specified order. | [optional] [default to List<ToleranceBase>]
**aggregateTolerances** | [**List&lt;ToleranceBase&gt;**](ToleranceBase.md) | Tolerance configurations applied to aggregate rule matching. | [optional] [default to List<ToleranceBase>]
**allowPartialMatching** | **Boolean** | Whether to permit partial matches when applying rules. | [optional] [default to Boolean]
**supplementalAttributes** | [**List&lt;SupplementalAttribute&gt;**](SupplementalAttribute.md) | Supplemental attributes that decorate reconciliation results with additional values without participating in the reconciliation itself. | [optional] [default to List<SupplementalAttribute>]

```java
import com.finbourne.lusid.model.UpdateMatchingRulesetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

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


UpdateMatchingRulesetRequest updateMatchingRulesetRequestInstance = new UpdateMatchingRulesetRequest()
    .DisplayName(DisplayName)
    .RecType(RecType)
    .DatasetSchemas(DatasetSchemas)
    .Filters(Filters)
    .CoreRules(CoreRules)
    .AggregateRules(AggregateRules)
    .CoreTolerances(CoreTolerances)
    .AggregateTolerances(AggregateTolerances)
    .AllowPartialMatching(AllowPartialMatching)
    .SupplementalAttributes(SupplementalAttributes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
