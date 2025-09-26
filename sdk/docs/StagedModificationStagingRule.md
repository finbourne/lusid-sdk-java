# com.finbourne.lusid.model.StagedModificationStagingRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stagingRuleSetId** | **String** | System generated unique id for the staging rule set. | [optional] [default to String]
**ruleId** | **String** | The ID of the staging rule. | [optional] [default to String]
**requiredApprovals** | **Integer** | The number of approvals required. If left blank, one approval is needed. | [optional] [default to Integer]
**currentUserCanDecide** | **Boolean** | True or False indicating whether the current user can make a decision on the staged modification. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.StagedModificationStagingRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String StagingRuleSetId = "example StagingRuleSetId";
@jakarta.annotation.Nullable String RuleId = "example RuleId";
Integer RequiredApprovals = new Integer("100.00");
Boolean CurrentUserCanDecide = true;


StagedModificationStagingRule stagedModificationStagingRuleInstance = new StagedModificationStagingRule()
    .StagingRuleSetId(StagingRuleSetId)
    .RuleId(RuleId)
    .RequiredApprovals(RequiredApprovals)
    .CurrentUserCanDecide(CurrentUserCanDecide);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
