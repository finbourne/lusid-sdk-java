# com.finbourne.lusid.model.GroupReconciliationComparisonRuleset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the ruleset | [default to String]
**reconciliationType** | **String** | The type of reconciliation to perform. \&quot;Holding\&quot; | \&quot;Transaction\&quot; | \&quot;Valuation\&quot; | [default to String]
**coreAttributeRules** | [**List&lt;GroupReconciliationCoreAttributeRule&gt;**](GroupReconciliationCoreAttributeRule.md) | The core comparison rules | [default to List<GroupReconciliationCoreAttributeRule>]
**aggregateAttributeRules** | [**List&lt;GroupReconciliationAggregateAttributeRule&gt;**](GroupReconciliationAggregateAttributeRule.md) | The aggregate comparison rules | [default to List<GroupReconciliationAggregateAttributeRule>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GroupReconciliationComparisonRuleset;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String DisplayName = "example DisplayName";
String ReconciliationType = "example ReconciliationType";
List<GroupReconciliationCoreAttributeRule> CoreAttributeRules = new List<GroupReconciliationCoreAttributeRule>();
List<GroupReconciliationAggregateAttributeRule> AggregateAttributeRules = new List<GroupReconciliationAggregateAttributeRule>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GroupReconciliationComparisonRuleset groupReconciliationComparisonRulesetInstance = new GroupReconciliationComparisonRuleset()
    .Id(Id)
    .DisplayName(DisplayName)
    .ReconciliationType(ReconciliationType)
    .CoreAttributeRules(CoreAttributeRules)
    .AggregateAttributeRules(AggregateAttributeRules)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
