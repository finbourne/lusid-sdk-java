# com.finbourne.lusid.model.StagingRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** | The ID of the staging rule. | [default to String]
**description** | **String** | A description for the staging rule. | [optional] [default to String]
**status** | **String** | Whether the rule is &#39;Active&#39; or &#39;Inactive&#39;. | [default to String]
**matchCriteria** | [**StagingRuleMatchCriteria**](StagingRuleMatchCriteria.md) |  | [default to StagingRuleMatchCriteria]
**approvalCriteria** | [**StagingRuleApprovalCriteria**](StagingRuleApprovalCriteria.md) |  | [default to StagingRuleApprovalCriteria]

```java
import com.finbourne.lusid.model.StagingRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RuleId = "example RuleId";
@jakarta.annotation.Nullable String Description = "example Description";
String Status = "example Status";
StagingRuleMatchCriteria MatchCriteria = new StagingRuleMatchCriteria();
StagingRuleApprovalCriteria ApprovalCriteria = new StagingRuleApprovalCriteria();


StagingRule stagingRuleInstance = new StagingRule()
    .RuleId(RuleId)
    .Description(Description)
    .Status(Status)
    .MatchCriteria(MatchCriteria)
    .ApprovalCriteria(ApprovalCriteria);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
