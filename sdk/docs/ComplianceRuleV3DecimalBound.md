# com.finbourne.lusid.model.ComplianceRuleV3DecimalBound
A check bound value paired with whether a value landing exactly on it satisfies the check.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**inclusive** | **Boolean** |  | [default to Boolean]

```java
import com.finbourne.lusid.model.ComplianceRuleV3DecimalBound;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Value = new java.math.BigDecimal("100.00");
Boolean Inclusive = true;


ComplianceRuleV3DecimalBound complianceRuleV3DecimalBoundInstance = new ComplianceRuleV3DecimalBound()
    .Value(Value)
    .Inclusive(Inclusive);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
