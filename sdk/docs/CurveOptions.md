# com.finbourne.lusid.model.CurveOptions
Options for configuring how ComplexMarketData representing a 'curve' is interpreted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dayCountConvention** | **String** | Day count convention of the curve. Default value: Act360. Available values: Actual360, Act360, MoneyMarket, Actual365, Act365, Thirty360, ThirtyU360, Bond, ThirtyE360, EuroBond, ActualActual, ActAct, ActActIsda, ActActIsma, ActActIcma, OneOne, Act364, Act365F, Act365L, Act365_25, Act252, Bus252, NL360, NL365, ActActAFB, Act365Cad, ThirtyActIsda, Thirty365Isda, ThirtyEActIsda, ThirtyE360Isda, ThirtyE365Isda, ThirtyU360EOM, Invalid. | [optional] [default to String]
**frontExtrapolationType** | **String** | What type of extrapolation is used to build the curve  Imagine that the curve is facing the observer(you), then the \&quot;front\&quot; direction is the closest point on the curve onward.    example: 0D tenor to past  Default value: Flat. Available values: None, Flat, Linear. | [optional] [default to String]
**backExtrapolationType** | **String** | What type of extrapolation is used to build the curve.    Imagine that the curve is facing the observer(you), then the \&quot;back\&quot; direction is the furthest point on the curve onward.  example: 30Y tenor to infinity    Default value: Flat. Available values: None, Flat, Linear. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CurveOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DayCountConvention = "example DayCountConvention";
@jakarta.annotation.Nullable String FrontExtrapolationType = "example FrontExtrapolationType";
@jakarta.annotation.Nullable String BackExtrapolationType = "example BackExtrapolationType";


CurveOptions curveOptionsInstance = new CurveOptions()
    .DayCountConvention(DayCountConvention)
    .FrontExtrapolationType(FrontExtrapolationType)
    .BackExtrapolationType(BackExtrapolationType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
