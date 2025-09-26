# com.finbourne.lusid.model.ListAggregationReconciliation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**ListAggregationResponse**](ListAggregationResponse.md) |  | [optional] [default to ListAggregationResponse]
**right** | [**ListAggregationResponse**](ListAggregationResponse.md) |  | [optional] [default to ListAggregationResponse]
**diff** | [**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md) |  | [optional] [default to List<Map<String, Object>>]
**dataSchema** | [**ResultDataSchema**](ResultDataSchema.md) |  | [optional] [default to ResultDataSchema]

```java
import com.finbourne.lusid.model.ListAggregationReconciliation;
import java.util.*;
import java.lang.System;
import java.net.URI;

ListAggregationResponse Left = new ListAggregationResponse();
ListAggregationResponse Right = new ListAggregationResponse();
@jakarta.annotation.Nullable List<Map<String, Object>> Diff = new List<Map<String, Object>>();
ResultDataSchema DataSchema = new ResultDataSchema();


ListAggregationReconciliation listAggregationReconciliationInstance = new ListAggregationReconciliation()
    .Left(Left)
    .Right(Right)
    .Diff(Diff)
    .DataSchema(DataSchema);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
