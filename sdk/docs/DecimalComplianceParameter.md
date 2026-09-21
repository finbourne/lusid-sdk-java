# com.finbourne.lusid.model.DecimalComplianceParameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**inclusiveBounds** | **Boolean** | Whether the bound is inclusive of the value; when true a candidate landing exactly on the bound satisfies it. Defaults to false (exclusive). | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.DecimalComplianceParameter;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Value = new java.math.BigDecimal("100.00");
Boolean InclusiveBounds = true;


DecimalComplianceParameter decimalComplianceParameterInstance = new DecimalComplianceParameter()
    .Value(Value)
    .InclusiveBounds(InclusiveBounds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
