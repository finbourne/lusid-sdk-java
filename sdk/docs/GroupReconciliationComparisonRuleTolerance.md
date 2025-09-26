# com.finbourne.lusid.model.GroupReconciliationComparisonRuleTolerance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of tolerance to allow. \&quot;Relative\&quot; | \&quot;Absolute\&quot; | [default to String]
**value** | **java.math.BigDecimal** | The decimal value of how much tolerance to allow when comparing in relative (i.e percentage) or absolute terms depending on the ToleranceType specified | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.GroupReconciliationComparisonRuleTolerance;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
java.math.BigDecimal Value = new java.math.BigDecimal("100.00");


GroupReconciliationComparisonRuleTolerance groupReconciliationComparisonRuleToleranceInstance = new GroupReconciliationComparisonRuleTolerance()
    .Type(Type)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
