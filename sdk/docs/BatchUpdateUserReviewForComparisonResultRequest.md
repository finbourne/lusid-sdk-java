# com.finbourne.lusid.model.BatchUpdateUserReviewForComparisonResultRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comparisonResultId** | **String** | Comparison result identifier, encoded value for core attribute results, aggregate attribute results, reconciliation type and run instanceId. | [default to String]
**userReviewAdd** | [**GroupReconciliationUserReviewAdd**](GroupReconciliationUserReviewAdd.md) |  | [optional] [default to GroupReconciliationUserReviewAdd]
**userReviewRemove** | [**GroupReconciliationUserReviewRemove**](GroupReconciliationUserReviewRemove.md) |  | [optional] [default to GroupReconciliationUserReviewRemove]

```java
import com.finbourne.lusid.model.BatchUpdateUserReviewForComparisonResultRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ComparisonResultId = "example ComparisonResultId";
GroupReconciliationUserReviewAdd UserReviewAdd = new GroupReconciliationUserReviewAdd();
GroupReconciliationUserReviewRemove UserReviewRemove = new GroupReconciliationUserReviewRemove();


BatchUpdateUserReviewForComparisonResultRequest batchUpdateUserReviewForComparisonResultRequestInstance = new BatchUpdateUserReviewForComparisonResultRequest()
    .ComparisonResultId(ComparisonResultId)
    .UserReviewAdd(UserReviewAdd)
    .UserReviewRemove(UserReviewRemove);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
