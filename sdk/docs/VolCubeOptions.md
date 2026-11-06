# com.finbourne.lusid.model.VolCubeOptions
Options for configuring how an IrVolCubeData is interpreted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dayCountConvention** | **String** | Day count convention the vols are quoted on. The cube places its expiry pillars on it, and a swaption priced off  the cube measures its time to expiry on it. Supported values: Actual360, Actual365, Act365F, Act365_25 and  ActualActual, or their aliases Act360, MoneyMarket, Act365, ActAct and ActActIsda. Default value: ActualActual. Available values: Actual360, Act360, MoneyMarket, Actual365, Act365, Thirty360, ThirtyU360, Bond, ThirtyE360, EuroBond, ActualActual, ActAct, ActActIsda, ActActIcma, ActActIsma, OneOne, Act364, Act365F, Act365L, Act365_25, Act252, Bus252, NL360, NL365, ActActAFB, Act365Cad, ThirtyActIsda, Thirty365Isda, ThirtyEActIsda, ThirtyE360Isda, ThirtyE365Isda, ThirtyU360EOM, Invalid. | [optional] [default to String]

```java
import com.finbourne.lusid.model.VolCubeOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DayCountConvention = "example DayCountConvention";


VolCubeOptions volCubeOptionsInstance = new VolCubeOptions()
    .DayCountConvention(DayCountConvention);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
