# com.finbourne.lusid.model.SwingSpreadTierBounds
The bounds of the spread tier a net cashflow fell in.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lowerBoundExclusive** | **java.math.BigDecimal** | The tier&#39;s lower bound, which the net cashflow was above. | [default to java.math.BigDecimal]
**upperBoundInclusive** | **java.math.BigDecimal** | The tier&#39;s upper bound, which the net cashflow was at or below. Absent for the unbounded last tier. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.SwingSpreadTierBounds;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal LowerBoundExclusive = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal UpperBoundInclusive = new java.math.BigDecimal("100.00");


SwingSpreadTierBounds swingSpreadTierBoundsInstance = new SwingSpreadTierBounds()
    .LowerBoundExclusive(LowerBoundExclusive)
    .UpperBoundInclusive(UpperBoundInclusive);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
