# com.finbourne.lusid.model.DealingBookCompleteness

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complete** | **Boolean** | Whether every share class&#39;s dealing cut-off had passed at the strike&#39;s as-at. True when no cut-off is configured. | [default to Boolean]
**cutOff** | [**OffsetDateTime**](OffsetDateTime.md) | The latest dealing cut-off among the share classes that configure one. Absent when none does. | [optional] [default to OffsetDateTime]
**lateNotCounted** | **Integer** | How many orders at the valuation point were written to the book after their class&#39;s cut-off and so were reported but not counted. Absent when a cut-off is configured but lateness could not be judged because an order at the valuation point carries no version. | [optional] [default to Integer]
**note** | **String** | Why the book was judged complete or incomplete: the cut-off that had or had not passed, or that none is configured and completeness was assumed. | [optional] [default to String]

```java
import com.finbourne.lusid.model.DealingBookCompleteness;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean Complete = true;
@jakarta.annotation.Nullable OffsetDateTime CutOff = OffsetDateTime.now();
@jakarta.annotation.Nullable Integer LateNotCounted = new Integer("100.00");
@jakarta.annotation.Nullable String Note = "example Note";


DealingBookCompleteness dealingBookCompletenessInstance = new DealingBookCompleteness()
    .Complete(Complete)
    .CutOff(CutOff)
    .LateNotCounted(LateNotCounted)
    .Note(Note);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
