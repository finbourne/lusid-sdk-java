# com.finbourne.lusid.model.ReturnsMetricWindow
The window a metric looks back over from each period of the grid, such as the last three months or the  time since inception, and how the metric is reported over it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lookback** | **String** |  | [default to String]
**allowPartial** | **Boolean** |  | [optional] [default to Boolean]
**annualised** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.ReturnsMetricWindow;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Lookback = "example Lookback";
Boolean AllowPartial = true;
Boolean Annualised = true;


ReturnsMetricWindow returnsMetricWindowInstance = new ReturnsMetricWindow()
    .Lookback(Lookback)
    .AllowPartial(AllowPartial)
    .Annualised(Annualised);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
