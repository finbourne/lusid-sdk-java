# com.finbourne.lusid.model.UpdateStagingRuleSetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the staging rule set. | [default to String]
**description** | **String** | A description for the staging rule set. | [optional] [default to String]
**rules** | [**List&lt;StagingRule&gt;**](StagingRule.md) | The list of staging rules that apply to a specific entity type. | [default to List<StagingRule>]

```java
import com.finbourne.lusid.model.UpdateStagingRuleSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
List<StagingRule> Rules = new List<StagingRule>();


UpdateStagingRuleSetRequest updateStagingRuleSetRequestInstance = new UpdateStagingRuleSetRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .Rules(Rules);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
