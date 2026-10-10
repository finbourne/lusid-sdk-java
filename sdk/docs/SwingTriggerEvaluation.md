# com.finbourne.lusid.model.SwingTriggerEvaluation
How a Market swing trigger was evaluated at a valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fired** | **Boolean** | Whether the net cashflow was in the trigger&#39;s direction and above its threshold. | [default to Boolean]
**threshold** | **java.math.BigDecimal** | The trigger&#39;s threshold. | [default to java.math.BigDecimal]
**metric** | **String** | What the threshold measured: NetCashflowAbsolute or NetCashflowPctOfNav. | [default to String]

```java
import com.finbourne.lusid.model.SwingTriggerEvaluation;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean Fired = true;
java.math.BigDecimal Threshold = new java.math.BigDecimal("100.00");
String Metric = "example Metric";


SwingTriggerEvaluation swingTriggerEvaluationInstance = new SwingTriggerEvaluation()
    .Fired(Fired)
    .Threshold(Threshold)
    .Metric(Metric);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
