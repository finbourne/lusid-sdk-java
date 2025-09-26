# com.finbourne.lusid.model.CreateGroupReconciliationComparisonRulesetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the ruleset | [default to String]
**reconciliationType** | **String** | The type of reconciliation to perform. \&quot;Holding\&quot; | \&quot;Transaction\&quot; | \&quot;Valuation\&quot; | [default to String]
**coreAttributeRules** | [**List&lt;GroupReconciliationCoreAttributeRule&gt;**](GroupReconciliationCoreAttributeRule.md) | The core comparison rules | [default to List<GroupReconciliationCoreAttributeRule>]
**aggregateAttributeRules** | [**List&lt;GroupReconciliationAggregateAttributeRule&gt;**](GroupReconciliationAggregateAttributeRule.md) | The aggregate comparison rules | [default to List<GroupReconciliationAggregateAttributeRule>]

```java
import com.finbourne.lusid.model.CreateGroupReconciliationComparisonRulesetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
String ReconciliationType = "example ReconciliationType";
List<GroupReconciliationCoreAttributeRule> CoreAttributeRules = new List<GroupReconciliationCoreAttributeRule>();
List<GroupReconciliationAggregateAttributeRule> AggregateAttributeRules = new List<GroupReconciliationAggregateAttributeRule>();


CreateGroupReconciliationComparisonRulesetRequest createGroupReconciliationComparisonRulesetRequestInstance = new CreateGroupReconciliationComparisonRulesetRequest()
    .Id(Id)
    .DisplayName(DisplayName)
    .ReconciliationType(ReconciliationType)
    .CoreAttributeRules(CoreAttributeRules)
    .AggregateAttributeRules(AggregateAttributeRules);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
