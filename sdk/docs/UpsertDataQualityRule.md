# com.finbourne.lusid.model.UpsertDataQualityRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleSetKey** | **String** |  | [optional] [default to String]
**rule** | [**CheckDefinitionRule**](CheckDefinitionRule.md) |  | [optional] [default to CheckDefinitionRule]

```java
import com.finbourne.lusid.model.UpsertDataQualityRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String RuleSetKey = "example RuleSetKey";
CheckDefinitionRule Rule = new CheckDefinitionRule();


UpsertDataQualityRule upsertDataQualityRuleInstance = new UpsertDataQualityRule()
    .RuleSetKey(RuleSetKey)
    .Rule(Rule);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
