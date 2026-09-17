# com.finbourne.lusid.model.RecActivityWindow
Base class for the activity windows that give the date range a rec definition's activity-based  reconciliations cover. Polymorphic by windowType; each supported type has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**windowType** | **String** | Polymorphic discriminator. Supported types: Contiguous. Contiguous requires effectiveAtProgression Series. Available values: Contiguous, FixedLookback, Explicit, ClosedPeriod, ContiguousAsAt. | [default to String]

```java
import com.finbourne.lusid.model.RecActivityWindow;
import java.util.*;
import java.lang.System;
import java.net.URI;

String WindowType = "example WindowType";


RecActivityWindow recActivityWindowInstance = new RecActivityWindow()
    .WindowType(WindowType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
