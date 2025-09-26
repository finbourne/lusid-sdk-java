# com.finbourne.lusid.model.GroupReconciliationUserReview

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**breakCodes** | [**List&lt;GroupReconciliationUserReviewBreakCode&gt;**](GroupReconciliationUserReviewBreakCode.md) | A list of break codes shared between the reconciliation runs of the same run instance and result hash. | [optional] [default to List<GroupReconciliationUserReviewBreakCode>]
**matchKeys** | [**List&lt;GroupReconciliationUserReviewMatchKey&gt;**](GroupReconciliationUserReviewMatchKey.md) | A list of match keys shared between the reconciliation runs of the same run instance and result hash. | [optional] [default to List<GroupReconciliationUserReviewMatchKey>]
**comments** | [**List&lt;GroupReconciliationUserReviewComment&gt;**](GroupReconciliationUserReviewComment.md) | A list of comments shared between the reconciliation runs of the same run instance and result hash. | [optional] [default to List<GroupReconciliationUserReviewComment>]

```java
import com.finbourne.lusid.model.GroupReconciliationUserReview;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<GroupReconciliationUserReviewBreakCode> BreakCodes = new List<GroupReconciliationUserReviewBreakCode>();
@jakarta.annotation.Nullable List<GroupReconciliationUserReviewMatchKey> MatchKeys = new List<GroupReconciliationUserReviewMatchKey>();
@jakarta.annotation.Nullable List<GroupReconciliationUserReviewComment> Comments = new List<GroupReconciliationUserReviewComment>();


GroupReconciliationUserReview groupReconciliationUserReviewInstance = new GroupReconciliationUserReview()
    .BreakCodes(BreakCodes)
    .MatchKeys(MatchKeys)
    .Comments(Comments);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
