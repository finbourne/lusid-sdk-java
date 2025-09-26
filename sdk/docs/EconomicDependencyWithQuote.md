# com.finbourne.lusid.model.EconomicDependencyWithQuote
Container class pairing economic dependencies and quote data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**economicDependency** | [**EconomicDependency**](EconomicDependency.md) |  | [default to EconomicDependency]
**metricValue** | [**MetricValue**](MetricValue.md) |  | [default to MetricValue]
**scaleFactor** | **java.math.BigDecimal** | Scale factor for the quote - this can be null, in which case we default to 1. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.EconomicDependencyWithQuote;
import java.util.*;
import java.lang.System;
import java.net.URI;

EconomicDependency EconomicDependency = new EconomicDependency();
MetricValue MetricValue = new MetricValue();
@jakarta.annotation.Nullable java.math.BigDecimal ScaleFactor = new java.math.BigDecimal("100.00");


EconomicDependencyWithQuote economicDependencyWithQuoteInstance = new EconomicDependencyWithQuote()
    .EconomicDependency(EconomicDependency)
    .MetricValue(MetricValue)
    .ScaleFactor(ScaleFactor);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
