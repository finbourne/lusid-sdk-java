# com.finbourne.lusid.model.ComplianceRuleBreakdownWithContributions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupStatus** | **String** | The status of this subset of results. | [default to String]
**resultsUsed** | **Map&lt;String, java.math.BigDecimal&gt;** | Dictionary of AddressKey (as string) and their corresponding decimal values, that were used in this rule. | [default to Map<String, java.math.BigDecimal>]
**propertiesUsed** | [**Map&lt;String, List&lt;Property&gt;&gt;**](List.md) | Dictionary of PropertyKey (as string) and their corresponding Properties, that were used in this rule | [default to Map<String, List<Property>>]
**missingDataInformation** | **List&lt;String&gt;** | List of string information detailing data that was missing from contributions processed in this rule | [default to List<String>]
**lineage** | [**List&lt;LineageMember&gt;**](LineageMember.md) |  | [default to List<LineageMember>]
**contributions** | [**List&lt;ComplianceRuleContribution&gt;**](ComplianceRuleContribution.md) | The per-position contributions aggregated into this rule breakdown group. Empty when the run  genuinely produced no contributions; a run with no recorded breakdown (e.g. one that predates  this feature) returns a 404 rather than this response. | [default to List<ComplianceRuleContribution>]

```java
import com.finbourne.lusid.model.ComplianceRuleBreakdownWithContributions;
import java.util.*;
import java.lang.System;
import java.net.URI;

String GroupStatus = "example GroupStatus";
Map<String, java.math.BigDecimal> ResultsUsed = new Map<String, java.math.BigDecimal>();
Map<String, List<Property>> PropertiesUsed = new Map<String, List<Property>>();
List<String> MissingDataInformation = new List<String>();
List<LineageMember> Lineage = new List<LineageMember>();
List<ComplianceRuleContribution> Contributions = new List<ComplianceRuleContribution>();


ComplianceRuleBreakdownWithContributions complianceRuleBreakdownWithContributionsInstance = new ComplianceRuleBreakdownWithContributions()
    .GroupStatus(GroupStatus)
    .ResultsUsed(ResultsUsed)
    .PropertiesUsed(PropertiesUsed)
    .MissingDataInformation(MissingDataInformation)
    .Lineage(Lineage)
    .Contributions(Contributions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
