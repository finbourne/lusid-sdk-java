# com.finbourne.lusid.model.RecDatesReconciled
The left and right effective and asAt dates of the data reconciled in a run.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime of the data reconciled on the left side. | [default to OffsetDateTime]
**leftAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime of the data reconciled on the left side. | [default to OffsetDateTime]
**rightEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime of the data reconciled on the right side. | [default to OffsetDateTime]
**rightAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime of the data reconciled on the right side. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.RecDatesReconciled;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime LeftEffectiveAt = OffsetDateTime.now();
OffsetDateTime LeftAsAt = OffsetDateTime.now();
OffsetDateTime RightEffectiveAt = OffsetDateTime.now();
OffsetDateTime RightAsAt = OffsetDateTime.now();


RecDatesReconciled recDatesReconciledInstance = new RecDatesReconciled()
    .LeftEffectiveAt(LeftEffectiveAt)
    .LeftAsAt(LeftAsAt)
    .RightEffectiveAt(RightEffectiveAt)
    .RightAsAt(RightAsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
