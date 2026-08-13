# com.finbourne.lusid.model.RecUserComment
A user-authored comment attached to a rec result. Carried forward with the result across runs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commentId** | **String** | System-generated GUID identifying the comment. Set once on creation. | [default to String]
**commentText** | **String** | The body of the comment. | [default to String]
**userId** | **String** | The author of the comment. | [default to String]
**asAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time the comment was created. Set once. | [default to OffsetDateTime]
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time the comment was last modified. Equals asAtCreated until the first edit. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.RecUserComment;
import java.util.*;
import java.lang.System;
import java.net.URI;

String CommentId = "example CommentId";
String CommentText = "example CommentText";
String UserId = "example UserId";
OffsetDateTime AsAtCreated = OffsetDateTime.now();
OffsetDateTime AsAtModified = OffsetDateTime.now();


RecUserComment recUserCommentInstance = new RecUserComment()
    .CommentId(CommentId)
    .CommentText(CommentText)
    .UserId(UserId)
    .AsAtCreated(AsAtCreated)
    .AsAtModified(AsAtModified);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
