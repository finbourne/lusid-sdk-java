# com.finbourne.lusid.model.BatchReviewRecResultItemResult
The successful outcome of a single batch review item: every rec result affected by the item (which  may exceed the results named in the request, e.g. group members re-opened by a nullify).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recResults** | [**List&lt;RecResult&gt;**](RecResult.md) | The full set of rec results affected by the batch item (may exceed the results named in the request). | [default to List<RecResult>]

```java
import com.finbourne.lusid.model.BatchReviewRecResultItemResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<RecResult> RecResults = new List<RecResult>();


BatchReviewRecResultItemResult batchReviewRecResultItemResultInstance = new BatchReviewRecResultItemResult()
    .RecResults(RecResults);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
