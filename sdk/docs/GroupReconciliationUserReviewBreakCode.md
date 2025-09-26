# com.finbourne.lusid.model.GroupReconciliationUserReviewBreakCode

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**breakCode** | **String** | The break code of the reconciliation result. | [default to String]
**userId** | **String** | Id of the user who made a User Review input. | [optional] [default to String]
**asAtAdded** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the added User Review input. | [optional] [default to OffsetDateTime]
**asAtInvalid** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when User Review input became invalid e.g. because of the different attribute values within the new run. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.GroupReconciliationUserReviewBreakCode;
import java.util.*;
import java.lang.System;
import java.net.URI;

String BreakCode = "example BreakCode";
@jakarta.annotation.Nullable String UserId = "example UserId";
OffsetDateTime AsAtAdded = OffsetDateTime.now();
OffsetDateTime AsAtInvalid = OffsetDateTime.now();


GroupReconciliationUserReviewBreakCode groupReconciliationUserReviewBreakCodeInstance = new GroupReconciliationUserReviewBreakCode()
    .BreakCode(BreakCode)
    .UserId(UserId)
    .AsAtAdded(AsAtAdded)
    .AsAtInvalid(AsAtInvalid);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
