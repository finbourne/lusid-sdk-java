# com.finbourne.lusid.model.RecResultDecisionGroup
The group-decision detail carried on every member of a FixAsGroup or ForceMatch decision.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupNumber** | **Integer** | Server-allocated, monotonic group number, unique within the RecResultSet and never reused. | [default to Integer]
**coreRulesExcused** | **List&lt;String&gt;** | The ruleNames of the core rules excused by a ForceMatch. Identical on every group member; non-null only for ForceMatch. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.RecResultDecisionGroup;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer GroupNumber = new Integer("100.00");
@jakarta.annotation.Nullable List<String> CoreRulesExcused = new List<String>();


RecResultDecisionGroup recResultDecisionGroupInstance = new RecResultDecisionGroup()
    .GroupNumber(GroupNumber)
    .CoreRulesExcused(CoreRulesExcused);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
