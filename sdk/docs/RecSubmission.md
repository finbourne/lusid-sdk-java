# com.finbourne.lusid.model.RecSubmission
An entry in the append-only log of review submissions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | The user who submitted the review. | [default to String]
**commentText** | **String** | An optional comment from the submitter. | [optional] [default to String]
**asAtSubmitted** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which the submission was made. | [default to OffsetDateTime]
**asAtSuperseded** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which this entry was superseded. Null when it is the current standing entry. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.RecSubmission;
import java.util.*;
import java.lang.System;
import java.net.URI;

String UserId = "example UserId";
@jakarta.annotation.Nullable String CommentText = "example CommentText";
OffsetDateTime AsAtSubmitted = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAtSuperseded = OffsetDateTime.now();


RecSubmission recSubmissionInstance = new RecSubmission()
    .UserId(UserId)
    .CommentText(CommentText)
    .AsAtSubmitted(AsAtSubmitted)
    .AsAtSuperseded(AsAtSuperseded);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
