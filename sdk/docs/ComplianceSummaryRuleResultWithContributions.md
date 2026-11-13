# com.finbourne.lusid.model.ComplianceSummaryRuleResultWithContributions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**status** | **String** |  | [default to String]
**checkType** | **String** | The kind of check the rule applied across its groups: \&quot;PercentCheck\&quot; or \&quot;Check\&quot;. Static per rule. Absent for a  rule no check reached. | [optional] [default to String]
**affectedPortfolios** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**affectedOrders** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The orders the rule affected. Omitted for a holdings-based run. | [optional] [default to List<ResourceId>]
**groups** | [**List&lt;ComplianceRuleBreakdownWithContributions&gt;**](ComplianceRuleBreakdownWithContributions.md) |  | [default to List<ComplianceRuleBreakdownWithContributions>]
**otherPositionsConsidered** | [**List&lt;ComplianceRuleContribution&gt;**](ComplianceRuleContribution.md) | The rest of the basis the rule was measured against but did not directly evaluate — the positions in  the referenced/denominator (or initial) group that are not in a group&#39;s contributions. Together with those  contributions this forms the whole basis, with no overlap, so a breach can be explained against the full picture  (e.g. the non-equity remainder behind an equity limit). Omitted when the rule evaluated everything it considered. | [optional] [default to List<ComplianceRuleContribution>]

```java
import com.finbourne.lusid.model.ComplianceSummaryRuleResultWithContributions;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RuleId = new ResourceId();
String Status = "example Status";
@jakarta.annotation.Nullable String CheckType = "example CheckType";
List<ResourceId> AffectedPortfolios = new List<ResourceId>();
@jakarta.annotation.Nullable List<ResourceId> AffectedOrders = new List<ResourceId>();
List<ComplianceRuleBreakdownWithContributions> Groups = new List<ComplianceRuleBreakdownWithContributions>();
@jakarta.annotation.Nullable List<ComplianceRuleContribution> OtherPositionsConsidered = new List<ComplianceRuleContribution>();


ComplianceSummaryRuleResultWithContributions complianceSummaryRuleResultWithContributionsInstance = new ComplianceSummaryRuleResultWithContributions()
    .RuleId(RuleId)
    .Status(Status)
    .CheckType(CheckType)
    .AffectedPortfolios(AffectedPortfolios)
    .AffectedOrders(AffectedOrders)
    .Groups(Groups)
    .OtherPositionsConsidered(OtherPositionsConsidered);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
