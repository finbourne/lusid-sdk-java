# com.finbourne.lusid.model.PropertyIntervalTimeSeries

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The property key that this time series belongs to. | [default to String]
**values** | [**List&lt;PropertyInterval&gt;**](PropertyInterval.md) | The complete time series (history) of intervals for the property key. | [default to List<PropertyInterval>]

```java
import com.finbourne.lusid.model.PropertyIntervalTimeSeries;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
List<PropertyInterval> Values = new List<PropertyInterval>();


PropertyIntervalTimeSeries propertyIntervalTimeSeriesInstance = new PropertyIntervalTimeSeries()
    .Key(Key)
    .Values(Values);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
