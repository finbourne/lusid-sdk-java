# com.finbourne.lusid.model.GroupReconciliationUserReviewRemove

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**breakCodeAsAtAdded** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the added User Review input. | [optional] [default to OffsetDateTime]
**matchKeyAsAtAdded** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the added User Review input. | [optional] [default to OffsetDateTime]
**commentTextAsAtAdded** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the added User Review input. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.GroupReconciliationUserReviewRemove;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime BreakCodeAsAtAdded = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime MatchKeyAsAtAdded = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime CommentTextAsAtAdded = OffsetDateTime.now();


GroupReconciliationUserReviewRemove groupReconciliationUserReviewRemoveInstance = new GroupReconciliationUserReviewRemove()
    .BreakCodeAsAtAdded(BreakCodeAsAtAdded)
    .MatchKeyAsAtAdded(MatchKeyAsAtAdded)
    .CommentTextAsAtAdded(CommentTextAsAtAdded);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
