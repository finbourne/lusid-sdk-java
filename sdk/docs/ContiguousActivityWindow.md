# com.finbourne.lusid.model.ContiguousActivityWindow
The activity window for a running series of instances: each instance's window starts where the previous  instance's ended, so the series tiles the effective timeline with no gaps and no overlap. Requires the  definition's effectiveAtProgression to be Series.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initialActivitySinceEffectiveAt** | [**RecActivitySinceEffectiveAt**](RecActivitySinceEffectiveAt.md) |  | [default to RecActivitySinceEffectiveAt]
**windowType** | **String** | Polymorphic discriminator. Supported types: Contiguous. Contiguous requires effectiveAtProgression Series. Available values: Contiguous, FixedLookback, Explicit, ClosedPeriod, ContiguousAsAt. | [default to String]

```java
import com.finbourne.lusid.model.ContiguousActivityWindow;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecActivitySinceEffectiveAt InitialActivitySinceEffectiveAt = new RecActivitySinceEffectiveAt();
String WindowType = "example WindowType";


ContiguousActivityWindow contiguousActivityWindowInstance = new ContiguousActivityWindow()
    .InitialActivitySinceEffectiveAt(InitialActivitySinceEffectiveAt)
    .WindowType(WindowType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
