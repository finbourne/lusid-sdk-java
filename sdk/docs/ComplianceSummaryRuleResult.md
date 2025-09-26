# com.finbourne.lusid.model.ComplianceSummaryRuleResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**templateId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**variation** | **String** |  | [default to String]
**ruleStatus** | **String** |  | [default to String]
**affectedPortfolios** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**affectedOrders** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**parametersUsed** | **Map&lt;String, String&gt;** |  | [default to Map<String, String>]
**ruleBreakdown** | [**List&lt;ComplianceRuleBreakdown&gt;**](ComplianceRuleBreakdown.md) |  | [default to List<ComplianceRuleBreakdown>]

```java
import com.finbourne.lusid.model.ComplianceSummaryRuleResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RuleId = new ResourceId();
ResourceId TemplateId = new ResourceId();
String Variation = "example Variation";
String RuleStatus = "example RuleStatus";
List<ResourceId> AffectedPortfolios = new List<ResourceId>();
List<ResourceId> AffectedOrders = new List<ResourceId>();
Map<String, String> ParametersUsed = new Map<String, String>();
List<ComplianceRuleBreakdown> RuleBreakdown = new List<ComplianceRuleBreakdown>();


ComplianceSummaryRuleResult complianceSummaryRuleResultInstance = new ComplianceSummaryRuleResult()
    .RuleId(RuleId)
    .TemplateId(TemplateId)
    .Variation(Variation)
    .RuleStatus(RuleStatus)
    .AffectedPortfolios(AffectedPortfolios)
    .AffectedOrders(AffectedOrders)
    .ParametersUsed(ParametersUsed)
    .RuleBreakdown(RuleBreakdown);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
