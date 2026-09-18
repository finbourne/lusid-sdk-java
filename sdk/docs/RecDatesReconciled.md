# com.finbourne.lusid.model.RecDatesReconciled
The left and right effective and asAt dates of the data reconciled in a run, plus the exclusive lower bound of each side's activity window on activity-based rec types.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime of the data reconciled on the left side. | [default to OffsetDateTime]
**leftAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime of the data reconciled on the left side. | [default to OffsetDateTime]
**rightEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime of the data reconciled on the right side. | [default to OffsetDateTime]
**rightAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime of the data reconciled on the right side. | [default to OffsetDateTime]
**leftActivitySinceEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The exclusive lower bound of the left side&#39;s activity window, so the window is (leftActivitySinceEffectiveAt, leftEffectiveAt]. Populated only on activity-based rec types; null on point-in-time rec types and when the definition has no activity window. | [optional] [default to OffsetDateTime]
**rightActivitySinceEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The exclusive lower bound of the right side&#39;s activity window, so the window is (rightActivitySinceEffectiveAt, rightEffectiveAt]. Populated only on activity-based rec types; null on point-in-time rec types and when the definition has no activity window. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.RecDatesReconciled;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime LeftEffectiveAt = OffsetDateTime.now();
OffsetDateTime LeftAsAt = OffsetDateTime.now();
OffsetDateTime RightEffectiveAt = OffsetDateTime.now();
OffsetDateTime RightAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime LeftActivitySinceEffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RightActivitySinceEffectiveAt = OffsetDateTime.now();


RecDatesReconciled recDatesReconciledInstance = new RecDatesReconciled()
    .LeftEffectiveAt(LeftEffectiveAt)
    .LeftAsAt(LeftAsAt)
    .RightEffectiveAt(RightEffectiveAt)
    .RightAsAt(RightAsAt)
    .LeftActivitySinceEffectiveAt(LeftActivitySinceEffectiveAt)
    .RightActivitySinceEffectiveAt(RightActivitySinceEffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
