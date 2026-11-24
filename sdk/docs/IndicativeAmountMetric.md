# com.finbourne.lusid.model.IndicativeAmountMetric
The amount a seed amount has grown to by the end of each period of the grid: the seed amount multiplied by  one plus the return since the start of the requested range, geometrically linking the period returns, or  by one plus the return over a window looking back from each period when one is given.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seedAmount** | **String** |  | [default to String]
**window** | [**ReturnsMetricWindow**](ReturnsMetricWindow.md) |  | [optional] [default to ReturnsMetricWindow]
**type** | **String** | Available values: Return, IndicativeAmount. | [default to String]
**alias** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.IndicativeAmountMetric;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SeedAmount = "example SeedAmount";
ReturnsMetricWindow Window = new ReturnsMetricWindow();
String Type = "example Type";
@jakarta.annotation.Nullable String Alias = "example Alias";


IndicativeAmountMetric indicativeAmountMetricInstance = new IndicativeAmountMetric()
    .SeedAmount(SeedAmount)
    .Window(Window)
    .Type(Type)
    .Alias(Alias);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
