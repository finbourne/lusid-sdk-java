# com.finbourne.lusid.model.OrderRuleBreach

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**breachTaskId** | **String** | Uniquely identifies this historical order breach workflow task. | [default to String]
**complianceState** | **String** | The compliance state of this order breach. Possible values are &#39;Pending&#39;, &#39;Failed&#39;, &#39;Manually approved&#39;, &#39;Passed&#39; and &#39;Warning&#39;. | [default to String]

```java
import com.finbourne.lusid.model.OrderRuleBreach;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BreachTaskId = "example BreachTaskId";
String ComplianceState = "example ComplianceState";


OrderRuleBreach orderRuleBreachInstance = new OrderRuleBreach()
    .BreachTaskId(BreachTaskId)
    .ComplianceState(ComplianceState);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
