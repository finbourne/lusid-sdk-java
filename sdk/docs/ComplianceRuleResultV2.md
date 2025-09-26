# com.finbourne.lusid.model.ComplianceRuleResultV2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instigatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**schedule** | **String** |  | [default to String]
**ruleResult** | [**ComplianceSummaryRuleResult**](ComplianceSummaryRuleResult.md) |  | [default to ComplianceSummaryRuleResult]

```java
import com.finbourne.lusid.model.ComplianceRuleResultV2;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RunId = new ResourceId();
OffsetDateTime InstigatedAt = OffsetDateTime.now();
OffsetDateTime CompletedAt = OffsetDateTime.now();
String Schedule = "example Schedule";
ComplianceSummaryRuleResult RuleResult = new ComplianceSummaryRuleResult();


ComplianceRuleResultV2 complianceRuleResultV2Instance = new ComplianceRuleResultV2()
    .RunId(RunId)
    .InstigatedAt(InstigatedAt)
    .CompletedAt(CompletedAt)
    .Schedule(Schedule)
    .RuleResult(RuleResult);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
