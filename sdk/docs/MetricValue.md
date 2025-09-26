# com.finbourne.lusid.model.MetricValue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **java.math.BigDecimal** | The numerical value of the property. | [optional] [default to java.math.BigDecimal]
**unit** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.MetricValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Value = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Unit = "example Unit";


MetricValue metricValueInstance = new MetricValue()
    .Value(Value)
    .Unit(Unit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
