# com.finbourne.lusid.model.ComplianceSummaryRuleResultWithContributions

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
**ruleBreakdown** | [**List&lt;ComplianceRuleBreakdownWithContributions&gt;**](ComplianceRuleBreakdownWithContributions.md) |  | [default to List<ComplianceRuleBreakdownWithContributions>]
**otherPositionsConsidered** | [**List&lt;ComplianceRuleContribution&gt;**](ComplianceRuleContribution.md) | The rest of the basis the rule was measured against but did not directly evaluate — the positions in  the referenced/denominator (or initial) group that are not in the RuleBreakdown&#39;s  contributions. Together with those contributions this forms the whole basis, with no overlap, so a  breach can be explained against the full picture (e.g. the non-equity remainder behind an equity limit).  Empty when the rule evaluated everything it considered. | [default to List<ComplianceRuleContribution>]

```java
import com.finbourne.lusid.model.ComplianceSummaryRuleResultWithContributions;
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
List<ComplianceRuleBreakdownWithContributions> RuleBreakdown = new List<ComplianceRuleBreakdownWithContributions>();
List<ComplianceRuleContribution> OtherPositionsConsidered = new List<ComplianceRuleContribution>();


ComplianceSummaryRuleResultWithContributions complianceSummaryRuleResultWithContributionsInstance = new ComplianceSummaryRuleResultWithContributions()
    .RuleId(RuleId)
    .TemplateId(TemplateId)
    .Variation(Variation)
    .RuleStatus(RuleStatus)
    .AffectedPortfolios(AffectedPortfolios)
    .AffectedOrders(AffectedOrders)
    .ParametersUsed(ParametersUsed)
    .RuleBreakdown(RuleBreakdown)
    .OtherPositionsConsidered(OtherPositionsConsidered);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
