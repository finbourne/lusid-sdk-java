# com.finbourne.lusid.model.CoreMatchingSetTolerance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleNames** | **List&lt;String&gt;** | The core rules in the set, at least 2 and each once. The set pairs two items if at least one rule has a value on both sides and the values agree, and no rule has two values that differ. A rule with no value on one or both sides is ignored. No other core tolerance can name a rule of the set. | [default to List<String>]
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric, CoreMatchingSet. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric, CoreMatchingSet. | [default to String]

```java
import com.finbourne.lusid.model.CoreMatchingSetTolerance;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> RuleNames = new List<String>();
String ToleranceType = "example ToleranceType";


CoreMatchingSetTolerance coreMatchingSetToleranceInstance = new CoreMatchingSetTolerance()
    .RuleNames(RuleNames)
    .ToleranceType(ToleranceType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
