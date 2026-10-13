# com.finbourne.lusid.model.FeeSizeTier

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lowerBound** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**upperBound** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**rate** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.FeeSizeTier;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal LowerBound = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal UpperBound = new java.math.BigDecimal("100.00");
java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");


FeeSizeTier feeSizeTierInstance = new FeeSizeTier()
    .LowerBound(LowerBound)
    .UpperBound(UpperBound)
    .Rate(Rate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
