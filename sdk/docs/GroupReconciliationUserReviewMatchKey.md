# com.finbourne.lusid.model.GroupReconciliationUserReviewMatchKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchKey** | **String** | The match key of the reconciliation result. | [default to String]
**userId** | **String** | Id of the user who made a User Review input. | [optional] [default to String]
**asAtAdded** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the added User Review input. | [optional] [default to OffsetDateTime]
**asAtInvalid** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when User Review input became invalid e.g. because of the different attribute values within the new run. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.GroupReconciliationUserReviewMatchKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MatchKey = "example MatchKey";
@jakarta.annotation.Nullable String UserId = "example UserId";
OffsetDateTime AsAtAdded = OffsetDateTime.now();
OffsetDateTime AsAtInvalid = OffsetDateTime.now();


GroupReconciliationUserReviewMatchKey groupReconciliationUserReviewMatchKeyInstance = new GroupReconciliationUserReviewMatchKey()
    .MatchKey(MatchKey)
    .UserId(UserId)
    .AsAtAdded(AsAtAdded)
    .AsAtInvalid(AsAtInvalid);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
