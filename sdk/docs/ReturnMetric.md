# com.finbourne.lusid.model.ReturnMetric
The rate of return over each period of the grid.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Available values: Return, IndicativeAmount. | [default to String]
**alias** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ReturnMetric;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Type = "example Type";
@jakarta.annotation.Nullable String Alias = "example Alias";


ReturnMetric returnMetricInstance = new ReturnMetric()
    .Type(Type)
    .Alias(Alias);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
