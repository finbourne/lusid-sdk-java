# com.finbourne.lusid.model.PerformanceReturnsMetric
The request used in the AggregatedReturns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of the metric. Default to Return | [optional] [default to String]
**window** | **String** | The given metric for the calculation i.e. 1Y, 1D. | [optional] [default to String]
**allowPartial** | **Boolean** | Bool if the metric is allowed partial results. Default to false. | [optional] [default to Boolean]
**annualised** | **Boolean** | Bool if the metric is annualized. Default to false. | [optional] [default to Boolean]
**withFee** | **Boolean** | Bool if the metric should consider the fees when is calculated. Default to false. | [optional] [default to Boolean]
**seedAmount** | **String** | The given seed amount for the calculation of the indicative amount metrics. | [optional] [default to String]
**alias** | **String** | The alias for the metric. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PerformanceReturnsMetric;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Window = "example Window";
Boolean AllowPartial = true;
Boolean Annualised = true;
Boolean WithFee = true;
@jakarta.annotation.Nullable String SeedAmount = "example SeedAmount";
@jakarta.annotation.Nullable String Alias = "example Alias";


PerformanceReturnsMetric performanceReturnsMetricInstance = new PerformanceReturnsMetric()
    .Type(Type)
    .Window(Window)
    .AllowPartial(AllowPartial)
    .Annualised(Annualised)
    .WithFee(WithFee)
    .SeedAmount(SeedAmount)
    .Alias(Alias);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
