# com.finbourne.lusid.model.FixedBusinessDayLookbackActivityWindow
The activity window whose since bound on each side is a set number of business days before that side's  effectiveAt, counted in a time zone against optional holiday calendars, with each side configured on its own.  Stateless, so it is accepted under every effectiveAtProgression.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**RecBusinessDayLookbackSide**](RecBusinessDayLookbackSide.md) |  | [default to RecBusinessDayLookbackSide]
**right** | [**RecBusinessDayLookbackSide**](RecBusinessDayLookbackSide.md) |  | [default to RecBusinessDayLookbackSide]
**windowType** | **String** | Polymorphic discriminator. Supported types: Contiguous, FixedPeriodLookback, FixedBusinessDayLookback. Contiguous requires effectiveAtProgression Series; the lookback types are accepted under any progression. Available values: Contiguous, FixedPeriodLookback, FixedBusinessDayLookback, Explicit, ClosedPeriod, ContiguousAsAt. | [default to String]

```java
import com.finbourne.lusid.model.FixedBusinessDayLookbackActivityWindow;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecBusinessDayLookbackSide Left = new RecBusinessDayLookbackSide();
RecBusinessDayLookbackSide Right = new RecBusinessDayLookbackSide();
String WindowType = "example WindowType";


FixedBusinessDayLookbackActivityWindow fixedBusinessDayLookbackActivityWindowInstance = new FixedBusinessDayLookbackActivityWindow()
    .Left(Left)
    .Right(Right)
    .WindowType(WindowType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
