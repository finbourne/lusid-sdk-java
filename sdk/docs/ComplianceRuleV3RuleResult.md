# com.finbourne.lusid.model.ComplianceRuleV3RuleResult
The aggregate result of one rule across every group it was evaluated over: the rule's overall status  (its worst group outcome) and the per-group results partitioned by outcome.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**status** | **String** | Available values: Passed, Failed, Warning, MissingData. | [optional] [default to String]
**results** | [**List&lt;ComplianceRuleV3GroupResult&gt;**](ComplianceRuleV3GroupResult.md) |  | [optional] [default to List<ComplianceRuleV3GroupResult>]

```java
import com.finbourne.lusid.model.ComplianceRuleV3RuleResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RuleId = new ResourceId();
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable List<ComplianceRuleV3GroupResult> Results = new List<ComplianceRuleV3GroupResult>();


ComplianceRuleV3RuleResult complianceRuleV3RuleResultInstance = new ComplianceRuleV3RuleResult()
    .RuleId(RuleId)
    .Status(Status)
    .Results(Results);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
