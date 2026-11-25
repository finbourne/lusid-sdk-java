# com.finbourne.lusid.model.ReturnMetric
The rate of return over each period of the grid, or over a window looking back from each period when  one is given.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**window** | [**ReturnsMetricWindow**](ReturnsMetricWindow.md) |  | [optional] [default to ReturnsMetricWindow]
**type** | **String** | Available values: Return, IndicativeAmount, Volatility. | [default to String]
**alias** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ReturnMetric;
import java.util.*;
import java.lang.System;
import java.net.URI;

ReturnsMetricWindow Window = new ReturnsMetricWindow();
String Type = "example Type";
@jakarta.annotation.Nullable String Alias = "example Alias";


ReturnMetric returnMetricInstance = new ReturnMetric()
    .Window(Window)
    .Type(Type)
    .Alias(Alias);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
