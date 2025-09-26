# com.finbourne.lusid.model.StagedModificationDecision

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time the decision request is made. | [optional] [default to OffsetDateTime]
**userId** | **String** | ID of user that approved the request. | [optional] [default to String]
**requestId** | **String** | ID of user that made the request. | [optional] [default to String]
**decision** | **String** | The decision on the requested staged modification, can be &#39;Approve&#39; or &#39;Reject&#39;. | [optional] [default to String]
**comment** | **String** | Comment on decision. | [optional] [default to String]

```java
import com.finbourne.lusid.model.StagedModificationDecision;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String UserId = "example UserId";
@jakarta.annotation.Nullable String RequestId = "example RequestId";
@jakarta.annotation.Nullable String Decision = "example Decision";
@jakarta.annotation.Nullable String Comment = "example Comment";


StagedModificationDecision stagedModificationDecisionInstance = new StagedModificationDecision()
    .AsAt(AsAt)
    .UserId(UserId)
    .RequestId(RequestId)
    .Decision(Decision)
    .Comment(Comment);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
