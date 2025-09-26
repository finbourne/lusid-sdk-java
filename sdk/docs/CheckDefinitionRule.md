# com.finbourne.lusid.model.CheckDefinitionRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleKey** | **String** | The key of the Rule. | [optional] [default to String]
**displayName** | **String** | The name of the Rule. | [optional] [default to String]
**description** | **String** | A description for the Rule. | [optional] [default to String]
**ruleFormula** | **String** | The formula for the rule. | [optional] [default to String]
**severity** | **Integer** | Severity of the rule if formaula is not satisfied. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.CheckDefinitionRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String RuleKey = "example RuleKey";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String RuleFormula = "example RuleFormula";
Integer Severity = new Integer("100.00");


CheckDefinitionRule checkDefinitionRuleInstance = new CheckDefinitionRule()
    .RuleKey(RuleKey)
    .DisplayName(DisplayName)
    .Description(Description)
    .RuleFormula(RuleFormula)
    .Severity(Severity);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
