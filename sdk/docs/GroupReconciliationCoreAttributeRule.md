# com.finbourne.lusid.model.GroupReconciliationCoreAttributeRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**GroupReconciliationCoreComparisonRuleOperand**](GroupReconciliationCoreComparisonRuleOperand.md) |  | [default to GroupReconciliationCoreComparisonRuleOperand]
**right** | [**GroupReconciliationCoreComparisonRuleOperand**](GroupReconciliationCoreComparisonRuleOperand.md) |  | [default to GroupReconciliationCoreComparisonRuleOperand]
**allowableStringMappings** | [**List&lt;GroupReconciliationComparisonRuleStringValueMap&gt;**](GroupReconciliationComparisonRuleStringValueMap.md) | The string mappings to use when comparing | [optional] [default to List<GroupReconciliationComparisonRuleStringValueMap>]
**isComparisonCaseSensitive** | **Boolean** | Whether the compare keys and strings mappings case sensitive or not | [default to Boolean]

```java
import com.finbourne.lusid.model.GroupReconciliationCoreAttributeRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

GroupReconciliationCoreComparisonRuleOperand Left = new GroupReconciliationCoreComparisonRuleOperand();
GroupReconciliationCoreComparisonRuleOperand Right = new GroupReconciliationCoreComparisonRuleOperand();
@jakarta.annotation.Nullable List<GroupReconciliationComparisonRuleStringValueMap> AllowableStringMappings = new List<GroupReconciliationComparisonRuleStringValueMap>();
Boolean IsComparisonCaseSensitive = true;


GroupReconciliationCoreAttributeRule groupReconciliationCoreAttributeRuleInstance = new GroupReconciliationCoreAttributeRule()
    .Left(Left)
    .Right(Right)
    .AllowableStringMappings(AllowableStringMappings)
    .IsComparisonCaseSensitive(IsComparisonCaseSensitive);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
