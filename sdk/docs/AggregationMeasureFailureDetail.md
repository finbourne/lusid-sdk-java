# com.finbourne.lusid.model.AggregationMeasureFailureDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**measure** | **String** |  | [optional] [default to String]
**reason** | **String** |  | [optional] [default to String]
**detail** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.AggregationMeasureFailureDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Id = "example Id";
OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String Measure = "example Measure";
@jakarta.annotation.Nullable String Reason = "example Reason";
@jakarta.annotation.Nullable String Detail = "example Detail";


AggregationMeasureFailureDetail aggregationMeasureFailureDetailInstance = new AggregationMeasureFailureDetail()
    .Id(Id)
    .EffectiveAt(EffectiveAt)
    .Measure(Measure)
    .Reason(Reason)
    .Detail(Detail);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
