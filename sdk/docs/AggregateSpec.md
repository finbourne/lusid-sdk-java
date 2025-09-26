# com.finbourne.lusid.model.AggregateSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key that uniquely identifies a queryable address in Lusid. | [default to String]
**op** | **String** | The available values are: Sum, DefaultSum, Proportion, Average, Count, Min, Max, Value, SumOfPositiveValues, SumOfNegativeValues, SumOfAbsoluteValues, ProportionOfAbsoluteValues, SumCumulativeInAdvance, SumCumulativeInArrears | [default to String]
**options** | **Map&lt;String, Object&gt;** | Additional options to apply when performing computations. Options that do not apply to the Key will be  ignored. Option values can be boolean, numeric, string or date-time. | [optional] [default to Map<String, Object>]

```java
import com.finbourne.lusid.model.AggregateSpec;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String Op = "example Op";
@jakarta.annotation.Nullable Map<String, Object> Options = new Map<String, Object>();


AggregateSpec aggregateSpecInstance = new AggregateSpec()
    .Key(Key)
    .Op(Op)
    .Options(Options);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
