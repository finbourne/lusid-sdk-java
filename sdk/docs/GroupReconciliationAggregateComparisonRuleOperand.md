# com.finbourne.lusid.model.GroupReconciliationAggregateComparisonRuleOperand

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the value to compare | [default to String]
**operation** | **String** | What to do with the value pointed to by the key, e.g. Sum. Only \&quot;Value is allowed for core rules\&quot; | [default to String]

```java
import com.finbourne.lusid.model.GroupReconciliationAggregateComparisonRuleOperand;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String Operation = "example Operation";


GroupReconciliationAggregateComparisonRuleOperand groupReconciliationAggregateComparisonRuleOperandInstance = new GroupReconciliationAggregateComparisonRuleOperand()
    .Key(Key)
    .Operation(Operation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
