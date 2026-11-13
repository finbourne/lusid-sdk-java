# com.finbourne.lusid.model.ComplianceRuleBreakdownWithContributions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **Integer** | A stable identifier for this group within the rule, matching the same group in the rule-result endpoint. | [default to Integer]
**status** | **String** | The status of this subset of results. | [default to String]
**groupKey** | [**ComplianceGroupKey**](ComplianceGroupKey.md) |  | [optional] [default to ComplianceGroupKey]
**nav** | **java.math.BigDecimal** | The portfolio net asset value the group sits within. Absent where no contribution carried it. | [optional] [default to java.math.BigDecimal]
**results** | **Map&lt;String, java.math.BigDecimal&gt;** | The valuation result totals the group aggregated. Omitted when empty. | [optional] [default to Map<String, java.math.BigDecimal>]
**comparisons** | [**List&lt;ComplianceComparison&gt;**](ComplianceComparison.md) | Every leaf comparison the check criterion made for this group, drawn from both the hard and the soft limit.  Omitted for a group no check reached. | [optional] [default to List<ComplianceComparison>]
**properties** | [**Map&lt;String, List&lt;Property&gt;&gt;**](List.md) | The property values the group aggregated. Omitted when empty. | [optional] [default to Map<String, List<Property>>]
**formulaValues** | **Map&lt;String, java.math.BigDecimal&gt;** | The value each formula within the check criterion evaluated to for this group. Omitted when empty. | [optional] [default to Map<String, java.math.BigDecimal>]
**contributions** | [**List&lt;ComplianceRuleContribution&gt;**](ComplianceRuleContribution.md) | The per-position contributions aggregated into this rule breakdown group. Empty when the run  genuinely produced no contributions; a run with no recorded breakdown (e.g. one that predates  this feature) returns a 404 rather than this response. | [default to List<ComplianceRuleContribution>]
**missingDataInformation** | **List&lt;String&gt;** | List of string information detailing data that was missing from contributions processed in this rule. Omitted when empty. | [optional] [default to List<String>]
**contributionCount** | **Integer** | The number of contributions aggregated into this group, before any cap. | [default to Integer]
**contributionsTruncated** | **Boolean** | Whether the reported contributions were capped below ContributionCount. Always false today. | [default to Boolean]

```java
import com.finbourne.lusid.model.ComplianceRuleBreakdownWithContributions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer GroupId = new Integer("100.00");
String Status = "example Status";
ComplianceGroupKey GroupKey = new ComplianceGroupKey();
@jakarta.annotation.Nullable java.math.BigDecimal Nav = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> Results = new Map<String, java.math.BigDecimal>();
@jakarta.annotation.Nullable List<ComplianceComparison> Comparisons = new List<ComplianceComparison>();
@jakarta.annotation.Nullable Map<String, List<Property>> Properties = new Map<String, List<Property>>();
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> FormulaValues = new Map<String, java.math.BigDecimal>();
List<ComplianceRuleContribution> Contributions = new List<ComplianceRuleContribution>();
@jakarta.annotation.Nullable List<String> MissingDataInformation = new List<String>();
Integer ContributionCount = new Integer("100.00");
Boolean ContributionsTruncated = true;


ComplianceRuleBreakdownWithContributions complianceRuleBreakdownWithContributionsInstance = new ComplianceRuleBreakdownWithContributions()
    .GroupId(GroupId)
    .Status(Status)
    .GroupKey(GroupKey)
    .Nav(Nav)
    .Results(Results)
    .Comparisons(Comparisons)
    .Properties(Properties)
    .FormulaValues(FormulaValues)
    .Contributions(Contributions)
    .MissingDataInformation(MissingDataInformation)
    .ContributionCount(ContributionCount)
    .ContributionsTruncated(ContributionsTruncated);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
