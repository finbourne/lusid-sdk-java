# com.finbourne.lusid.model.ComplianceRuleResultV2WithContributions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instigatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**schedule** | **String** | Available values: PreTrade, PostTrade, PreAndPostTrade. | [default to String]
**ruleResult** | [**ComplianceSummaryRuleResultWithContributions**](ComplianceSummaryRuleResultWithContributions.md) |  | [default to ComplianceSummaryRuleResultWithContributions]

```java
import com.finbourne.lusid.model.ComplianceRuleResultV2WithContributions;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RunId = new ResourceId();
OffsetDateTime InstigatedAt = OffsetDateTime.now();
OffsetDateTime CompletedAt = OffsetDateTime.now();
String Schedule = "example Schedule";
ComplianceSummaryRuleResultWithContributions RuleResult = new ComplianceSummaryRuleResultWithContributions();


ComplianceRuleResultV2WithContributions complianceRuleResultV2WithContributionsInstance = new ComplianceRuleResultV2WithContributions()
    .RunId(RunId)
    .InstigatedAt(InstigatedAt)
    .CompletedAt(CompletedAt)
    .Schedule(Schedule)
    .RuleResult(RuleResult);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
