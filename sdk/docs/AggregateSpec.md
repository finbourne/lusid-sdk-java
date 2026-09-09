# com.finbourne.lusid.model.AggregateSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key that uniquely identifies a queryable address in Lusid. | [default to String]
**op** | **String** | Available values: Sum, DefaultSum, Proportion, Average, Count, Min, Max, Value, SumOfPositiveValues, SumOfNegativeValues, SumOfAbsoluteValues, ProportionOfAbsoluteValues, SumCumulativeInAdvance, SumCumulativeInArrears. | [default to String]
**options** | **Map&lt;String, Object&gt;** | Additional options to apply when performing computations. Options that do not apply to the Key will be  ignored. Option values can be boolean, numeric, string or date-time. | [optional] [default to Map<String, Object>]
**returnAs** | **String** | Optional client-chosen name for this metric. When supplied, the corresponding column in the returned  data is keyed by this name instead of the serialised address key (with options), letting callers  associate each requested metric with its result without reconstructing the key serialisation.  Names must be unique within a request, start with a letter and contain only letters, digits,  underscores or hyphens. When omitted, the column is keyed by the serialised address key as before. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AggregateSpec;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String Op = "example Op";
@jakarta.annotation.Nullable Map<String, Object> Options = new Map<String, Object>();
@jakarta.annotation.Nullable String ReturnAs = "example ReturnAs";


AggregateSpec aggregateSpecInstance = new AggregateSpec()
    .Key(Key)
    .Op(Op)
    .Options(Options)
    .ReturnAs(ReturnAs);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
