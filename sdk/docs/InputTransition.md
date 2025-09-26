# com.finbourne.lusid.model.InputTransition
The input 'transition' within a corporate action, representing the singular input position

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unitsFactor** | **java.math.BigDecimal** | The factor to scale units by | [default to java.math.BigDecimal]
**costFactor** | **java.math.BigDecimal** | The factor to scale cost by | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.InputTransition;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal UnitsFactor = new java.math.BigDecimal("100.00");
java.math.BigDecimal CostFactor = new java.math.BigDecimal("100.00");


InputTransition inputTransitionInstance = new InputTransition()
    .UnitsFactor(UnitsFactor)
    .CostFactor(CostFactor);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
