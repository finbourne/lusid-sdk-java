# com.finbourne.lusid.model.FixedPeriodLookbackActivityWindow
The activity window whose since bound on each side is that side's effectiveAt less a fixed ISO 8601 period,  the same period on both sides. Stateless, so it is accepted under every effectiveAtProgression.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lookbackPeriod** | **String** | The ISO 8601 period each side&#39;s window reaches back from its effectiveAt, e.g. P1D or PT12H. Whole counts of years, months, days, hours, minutes and seconds (P[n]Y[n]M[n]DT[n]H[n]M[n]S); weeks and fractions are not supported. Must be greater than zero, and applies to both sides. Evaluated in UTC, so P1D is exactly 24 hours. The since bound is exclusive. | [default to String]
**windowType** | **String** | Polymorphic discriminator. Supported types: Contiguous, FixedPeriodLookback. Contiguous requires effectiveAtProgression Series; FixedPeriodLookback is accepted under any progression. Available values: Contiguous, FixedPeriodLookback, Explicit, ClosedPeriod, ContiguousAsAt. | [default to String]

```java
import com.finbourne.lusid.model.FixedPeriodLookbackActivityWindow;
import java.util.*;
import java.lang.System;
import java.net.URI;

String LookbackPeriod = "example LookbackPeriod";
String WindowType = "example WindowType";


FixedPeriodLookbackActivityWindow fixedPeriodLookbackActivityWindowInstance = new FixedPeriodLookbackActivityWindow()
    .LookbackPeriod(LookbackPeriod)
    .WindowType(WindowType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
