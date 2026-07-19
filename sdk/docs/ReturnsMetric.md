# com.finbourne.lusid.model.ReturnsMetric
A metric requested from the aggregated-returns (TWR) endpoint. Supports only the  period `Return` (the grid granularity is set on the request via Period, not per metric);  `Alias` is the key the metric appears under in the response's metricsValue dictionary.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Available values: Return. | [optional] [default to String]
**alias** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ReturnsMetric;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Alias = "example Alias";


ReturnsMetric returnsMetricInstance = new ReturnsMetric()
    .Type(Type)
    .Alias(Alias);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
