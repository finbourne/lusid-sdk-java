# com.finbourne.lusid.model.UpsertComplianceRunSummaryResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instigatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**schedule** | **String** |  | [default to String]
**results** | [**List&lt;ComplianceSummaryRuleResult&gt;**](ComplianceSummaryRuleResult.md) |  | [default to List<ComplianceSummaryRuleResult>]

```java
import com.finbourne.lusid.model.UpsertComplianceRunSummaryResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RunId = new ResourceId();
OffsetDateTime InstigatedAt = OffsetDateTime.now();
OffsetDateTime CompletedAt = OffsetDateTime.now();
String Schedule = "example Schedule";
List<ComplianceSummaryRuleResult> Results = new List<ComplianceSummaryRuleResult>();


UpsertComplianceRunSummaryResult upsertComplianceRunSummaryResultInstance = new UpsertComplianceRunSummaryResult()
    .RunId(RunId)
    .InstigatedAt(InstigatedAt)
    .CompletedAt(CompletedAt)
    .Schedule(Schedule)
    .Results(Results);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
