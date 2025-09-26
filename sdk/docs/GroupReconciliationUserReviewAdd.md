# com.finbourne.lusid.model.GroupReconciliationUserReviewAdd

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**breakCode** | **String** | The break code of the reconciliation result. | [optional] [default to String]
**matchKey** | **String** | The match key of the reconciliation result. | [optional] [default to String]
**commentText** | **String** | User&#39;s comment regarding the reconciliation result. | [optional] [default to String]

```java
import com.finbourne.lusid.model.GroupReconciliationUserReviewAdd;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String BreakCode = "example BreakCode";
@jakarta.annotation.Nullable String MatchKey = "example MatchKey";
@jakarta.annotation.Nullable String CommentText = "example CommentText";


GroupReconciliationUserReviewAdd groupReconciliationUserReviewAddInstance = new GroupReconciliationUserReviewAdd()
    .BreakCode(BreakCode)
    .MatchKey(MatchKey)
    .CommentText(CommentText);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
