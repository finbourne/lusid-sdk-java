# com.finbourne.lusid.model.GroupReconciliationAggregateAttributeRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**GroupReconciliationAggregateComparisonRuleOperand**](GroupReconciliationAggregateComparisonRuleOperand.md) |  | [default to GroupReconciliationAggregateComparisonRuleOperand]
**right** | [**GroupReconciliationAggregateComparisonRuleOperand**](GroupReconciliationAggregateComparisonRuleOperand.md) |  | [default to GroupReconciliationAggregateComparisonRuleOperand]
**tolerance** | [**GroupReconciliationComparisonRuleTolerance**](GroupReconciliationComparisonRuleTolerance.md) |  | [optional] [default to GroupReconciliationComparisonRuleTolerance]

```java
import com.finbourne.lusid.model.GroupReconciliationAggregateAttributeRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

GroupReconciliationAggregateComparisonRuleOperand Left = new GroupReconciliationAggregateComparisonRuleOperand();
GroupReconciliationAggregateComparisonRuleOperand Right = new GroupReconciliationAggregateComparisonRuleOperand();
GroupReconciliationComparisonRuleTolerance Tolerance = new GroupReconciliationComparisonRuleTolerance();


GroupReconciliationAggregateAttributeRule groupReconciliationAggregateAttributeRuleInstance = new GroupReconciliationAggregateAttributeRule()
    .Left(Left)
    .Right(Right)
    .Tolerance(Tolerance);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
