# com.finbourne.lusid.model.ReturnsMetric
Base class for a metric requested from the aggregated-returns (TWR) endpoint, measured over each period of  the grid (the grid granularity is set on the request via Period, not per metric). Polymorphic by type;  each supported type has a corresponding inherited class carrying the inputs only that metric takes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Available values: Return, IndicativeAmount. | [default to String]
**alias** | **String** |  | [optional] [default to String]
**seedAmount** | **String** |  | [default to String]
**window** | [**ReturnsMetricWindow**](ReturnsMetricWindow.md) |  | [optional] [default to ReturnsMetricWindow]

```java
import com.finbourne.lusid.model.ReturnsMetric;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with IndicativeAmountMetric ReturnsMetric
IndicativeAmountMetric returnsMetric = new IndicativeAmountMetric();
returnsMetric.setType(IndicativeAmountMetric.TypeEnum.INDICATIVEAMOUNTMETRIC);
ReturnsMetric config = new ReturnsMetric(returnsMetric);

```
 See all compatible oneOf types with ReturnsMetric
* [IndicativeAmountMetric](./IndicativeAmountMetric.md)

* [ReturnMetric](./ReturnMetric.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
