# com.finbourne.lusid.model.RecActivityWindow
Base class for the activity windows that give the date range a rec definition's activity-based  reconciliations cover. Polymorphic by windowType; each supported type has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**windowType** | **String** | Polymorphic discriminator. Supported types: Contiguous. Contiguous requires effectiveAtProgression Series. Available values: Contiguous, FixedLookback, Explicit, ClosedPeriod, ContiguousAsAt. | [default to String]
**initialActivitySinceEffectiveAt** | [**RecActivitySinceEffectiveAt**](RecActivitySinceEffectiveAt.md) |  | [default to RecActivitySinceEffectiveAt]

```java
import com.finbourne.lusid.model.RecActivityWindow;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with ContiguousActivityWindow RecActivityWindow
ContiguousActivityWindow recActivityWindow = new ContiguousActivityWindow();
recActivityWindow.setType(ContiguousActivityWindow.TypeEnum.CONTIGUOUSACTIVITYWINDOW);
RecActivityWindow config = new RecActivityWindow(recActivityWindow);

```
 See all compatible oneOf types with RecActivityWindow
* [ContiguousActivityWindow](./ContiguousActivityWindow.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
