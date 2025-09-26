# com.finbourne.lusid.model.ReconciliationResponse
Class representing the set of comparisons that result from comparing holdings and their valuations between two separate evaluations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comparisons** | [**List&lt;ReconciliationLine&gt;**](ReconciliationLine.md) | List of comparisons of left to right hand sides. | [optional] [default to List<ReconciliationLine>]
**dataSchema** | [**ResultDataSchema**](ResultDataSchema.md) |  | [optional] [default to ResultDataSchema]

```java
import com.finbourne.lusid.model.ReconciliationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<ReconciliationLine> Comparisons = new List<ReconciliationLine>();
ResultDataSchema DataSchema = new ResultDataSchema();


ReconciliationResponse reconciliationResponseInstance = new ReconciliationResponse()
    .Comparisons(Comparisons)
    .DataSchema(DataSchema);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
