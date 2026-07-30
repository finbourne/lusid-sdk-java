# com.finbourne.lusid.model.SubmitRecResultSetReviewRequest
The request to submit a result set review for approval (or resubmit after addressing revisions).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commentText** | **String** | An optional comment recorded on the submission. | [optional] [default to String]

```java
import com.finbourne.lusid.model.SubmitRecResultSetReviewRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String CommentText = "example CommentText";


SubmitRecResultSetReviewRequest submitRecResultSetReviewRequestInstance = new SubmitRecResultSetReviewRequest()
    .CommentText(CommentText);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
