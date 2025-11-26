# com.finbourne.lusid.model.UpdateCheckDefinitionRuleSet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleSetKey** | **String** | The Key of the Rule Set. | [optional] [default to String]
**displayName** | **String** | The name of the Rule Set. | [optional] [default to String]
**description** | **String** | A description for the Rule Set. | [optional] [default to String]
**ruleSetFilter** | **String** | A filter for the Rule Set to filter entity instances the rule set applies to. | [optional] [default to String]

```java
import com.finbourne.lusid.model.UpdateCheckDefinitionRuleSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String RuleSetKey = "example RuleSetKey";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String RuleSetFilter = "example RuleSetFilter";


UpdateCheckDefinitionRuleSet updateCheckDefinitionRuleSetInstance = new UpdateCheckDefinitionRuleSet()
    .RuleSetKey(RuleSetKey)
    .DisplayName(DisplayName)
    .Description(Description)
    .RuleSetFilter(RuleSetFilter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
