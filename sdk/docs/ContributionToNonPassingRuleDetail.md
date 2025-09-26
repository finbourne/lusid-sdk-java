# com.finbourne.lusid.model.ContributionToNonPassingRuleDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**ruleStatus** | **String** | The status of the non-passing rule. | [optional] [default to String]
**breachTaskIds** | **List&lt;String&gt;** | The task ids associated with the compliance breach for this order&#39;s groups (if failing). | [optional] [default to List<String>]
**likelyResponsibleForStatus** | **Boolean** | Whether this order is deemed as a likely contributor to the non-passing rule for this group. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.ContributionToNonPassingRuleDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RuleId = new ResourceId();
@jakarta.annotation.Nullable String RuleStatus = "example RuleStatus";
@jakarta.annotation.Nullable List<String> BreachTaskIds = new List<String>();
Boolean LikelyResponsibleForStatus = true;


ContributionToNonPassingRuleDetail contributionToNonPassingRuleDetailInstance = new ContributionToNonPassingRuleDetail()
    .RuleId(RuleId)
    .RuleStatus(RuleStatus)
    .BreachTaskIds(BreachTaskIds)
    .LikelyResponsibleForStatus(LikelyResponsibleForStatus);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
