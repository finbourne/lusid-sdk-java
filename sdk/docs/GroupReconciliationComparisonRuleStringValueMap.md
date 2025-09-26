# com.finbourne.lusid.model.GroupReconciliationComparisonRuleStringValueMap

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftValue** | **String** | The left string to map | [default to String]
**rightValue** | **String** | The right string to map | [default to String]
**direction** | **String** | The direction to map. \&quot;UniDirectional\&quot; | \&quot;BiDirectional\&quot; | [default to String]

```java
import com.finbourne.lusid.model.GroupReconciliationComparisonRuleStringValueMap;
import java.util.*;
import java.lang.System;
import java.net.URI;

String LeftValue = "example LeftValue";
String RightValue = "example RightValue";
String Direction = "example Direction";


GroupReconciliationComparisonRuleStringValueMap groupReconciliationComparisonRuleStringValueMapInstance = new GroupReconciliationComparisonRuleStringValueMap()
    .LeftValue(LeftValue)
    .RightValue(RightValue)
    .Direction(Direction);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
