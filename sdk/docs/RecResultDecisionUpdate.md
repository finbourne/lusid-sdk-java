# com.finbourne.lusid.model.RecResultDecisionUpdate
The decision update within a batch review item. Omitting the object leaves the existing decision  untouched; a null value nullifies it (dissolving any group).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The decision value. Null nullifies the decision. Available values: Acknowledge, FixAtSource, FixAsGroup, Accept, ForceMatch, Tolerate. | [optional] [default to String]
**affirm** | **Boolean** | Whether to affirm an existing decision (e.g. after revisions were requested). | [optional] [default to Boolean]
**coreRulesExcused** | **List&lt;String&gt;** | The ruleNames of the core rules excused by a ForceMatch. Identical on every group member; non-null only for ForceMatch. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.RecResultDecisionUpdate;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Value = "example Value";
Boolean Affirm = true;
@jakarta.annotation.Nullable List<String> CoreRulesExcused = new List<String>();


RecResultDecisionUpdate recResultDecisionUpdateInstance = new RecResultDecisionUpdate()
    .Value(Value)
    .Affirm(Affirm)
    .CoreRulesExcused(CoreRulesExcused);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
