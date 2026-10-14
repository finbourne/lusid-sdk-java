# com.finbourne.lusid.model.FeeRateTier

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rate** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**threshold** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.FeeRateTier;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Threshold = new java.math.BigDecimal("100.00");


FeeRateTier feeRateTierInstance = new FeeRateTier()
    .Rate(Rate)
    .Threshold(Threshold);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
