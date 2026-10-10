# com.finbourne.lusid.model.SwingSpreadApplied
The stored spread applied to a share class's baseline price and the tier it came from.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bps** | **java.math.BigDecimal** | The spread applied, in basis points. | [default to java.math.BigDecimal]
**tierMatched** | [**SwingSpreadTierBounds**](SwingSpreadTierBounds.md) |  | [default to SwingSpreadTierBounds]

```java
import com.finbourne.lusid.model.SwingSpreadApplied;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Bps = new java.math.BigDecimal("100.00");
SwingSpreadTierBounds TierMatched = new SwingSpreadTierBounds();


SwingSpreadApplied swingSpreadAppliedInstance = new SwingSpreadApplied()
    .Bps(Bps)
    .TierMatched(TierMatched);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
