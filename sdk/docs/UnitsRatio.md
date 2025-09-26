# com.finbourne.lusid.model.UnitsRatio
The number of units you have after the event (output) for a given number of units you have prior to the event (input).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | **java.math.BigDecimal** | Input amount. Denominator of the Ratio | [default to java.math.BigDecimal]
**output** | **java.math.BigDecimal** | Output amount. Numerator of the Ratio | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.UnitsRatio;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Input = new java.math.BigDecimal("100.00");
java.math.BigDecimal Output = new java.math.BigDecimal("100.00");


UnitsRatio unitsRatioInstance = new UnitsRatio()
    .Input(Input)
    .Output(Output);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
