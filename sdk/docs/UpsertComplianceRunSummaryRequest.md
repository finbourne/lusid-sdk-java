# com.finbourne.lusid.model.UpsertComplianceRunSummaryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instigatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**schedule** | **String** |  | [default to String]
**results** | [**List&lt;ComplianceSummaryRuleResultRequest&gt;**](ComplianceSummaryRuleResultRequest.md) |  | [default to List<ComplianceSummaryRuleResultRequest>]

```java
import com.finbourne.lusid.model.UpsertComplianceRunSummaryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RunId = new ResourceId();
OffsetDateTime InstigatedAt = OffsetDateTime.now();
OffsetDateTime CompletedAt = OffsetDateTime.now();
String Schedule = "example Schedule";
List<ComplianceSummaryRuleResultRequest> Results = new List<ComplianceSummaryRuleResultRequest>();


UpsertComplianceRunSummaryRequest upsertComplianceRunSummaryRequestInstance = new UpsertComplianceRunSummaryRequest()
    .RunId(RunId)
    .InstigatedAt(InstigatedAt)
    .CompletedAt(CompletedAt)
    .Schedule(Schedule)
    .Results(Results);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
