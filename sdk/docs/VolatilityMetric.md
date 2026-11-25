# com.finbourne.lusid.model.VolatilityMetric
The volatility of the returns over a window looking back from each period of the grid: the population  standard deviation of the period returns in the window (divided by the number of returns, not one fewer).  It is measured over business days. Calculated returns have a return for every calendar day, so the return  of a day that is not a business day is linked into the next business day: those of the business calendar  of the Returns entity, or every day but Saturdays and Sundays when it has none. Such a day reports the  volatility of the business day before it. A window over a count of returns therefore counts business days  for a volatility, and calendar days for the other metrics. Upserted returns are measured as they were  upserted. When the window asks for it to be annualised, the volatility is scaled by the square root of  252, a year of business days.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**window** | [**ReturnsMetricWindow**](ReturnsMetricWindow.md) |  | [default to ReturnsMetricWindow]
**type** | **String** | Available values: Return, IndicativeAmount, Volatility. | [default to String]
**alias** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.VolatilityMetric;
import java.util.*;
import java.lang.System;
import java.net.URI;

ReturnsMetricWindow Window = new ReturnsMetricWindow();
String Type = "example Type";
@jakarta.annotation.Nullable String Alias = "example Alias";


VolatilityMetric volatilityMetricInstance = new VolatilityMetric()
    .Window(Window)
    .Type(Type)
    .Alias(Alias);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
