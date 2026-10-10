# com.finbourne.lusid.model.SwingSpreadTier
One tier of spread: the band of net cashflow it covers and the spread applied when the flow falls in it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lowerBoundExclusive** | **java.math.BigDecimal** | The size of net cashflow, as a magnitude, above which the tier applies. Zero or more; zero on the first tier swings on any net flow. | [default to java.math.BigDecimal]
**upperBoundInclusive** | **java.math.BigDecimal** | The size of net cashflow, as a magnitude, up to and including which the tier applies. Omit it on the last tier, which covers every larger flow. | [optional] [default to java.math.BigDecimal]
**bps** | **java.math.BigDecimal** | The spread, in basis points of the baseline price, applied when the net cashflow falls in the tier. Zero or more. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.SwingSpreadTier;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal LowerBoundExclusive = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal UpperBoundInclusive = new java.math.BigDecimal("100.00");
java.math.BigDecimal Bps = new java.math.BigDecimal("100.00");


SwingSpreadTier swingSpreadTierInstance = new SwingSpreadTier()
    .LowerBoundExclusive(LowerBoundExclusive)
    .UpperBoundInclusive(UpperBoundInclusive)
    .Bps(Bps);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
