# com.finbourne.lusid.model.ComplianceComparisonOperand
One side of a comparison: the sub-expression that produced it and, where the group carried the data to evaluate it,  its value. The value is absent for a non-numeric constant, a reference list, or an operand the group held no data for.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expression** | **String** |  | [default to String]
**value** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.ComplianceComparisonOperand;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Expression = "example Expression";
@jakarta.annotation.Nullable java.math.BigDecimal Value = new java.math.BigDecimal("100.00");


ComplianceComparisonOperand complianceComparisonOperandInstance = new ComplianceComparisonOperand()
    .Expression(Expression)
    .Value(Value);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
