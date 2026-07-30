# com.finbourne.lusid.model.RecRequestedResultRevision
A result flagged for re-review as part of a Request Revisions decision.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recResultId** | **String** | The identifier of the result to flag for re-review. | [default to String]
**commentText** | **String** | An optional per-result comment added to the result&#39;s user comments. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RecRequestedResultRevision;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RecResultId = "example RecResultId";
@jakarta.annotation.Nullable String CommentText = "example CommentText";


RecRequestedResultRevision recRequestedResultRevisionInstance = new RecRequestedResultRevision()
    .RecResultId(RecResultId)
    .CommentText(CommentText);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
