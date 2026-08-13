# com.finbourne.lusid.model.BatchManageCommentRequest
One item of a batch comment request. The operation (add/edit/delete) is inferred from the  combination of commentId and commentText.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recResultId** | **String** | The rec result the comment operation targets. | [default to String]
**commentId** | **String** | The comment id. Null with text &#x3D; add; provided with text &#x3D; edit; provided with null text &#x3D; delete. | [optional] [default to String]
**commentText** | **String** | The comment body. See operation inference. | [optional] [default to String]

```java
import com.finbourne.lusid.model.BatchManageCommentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RecResultId = "example RecResultId";
@jakarta.annotation.Nullable String CommentId = "example CommentId";
@jakarta.annotation.Nullable String CommentText = "example CommentText";


BatchManageCommentRequest batchManageCommentRequestInstance = new BatchManageCommentRequest()
    .RecResultId(RecResultId)
    .CommentId(CommentId)
    .CommentText(CommentText);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
