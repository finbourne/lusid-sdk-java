# com.finbourne.lusid.model.GroupReconciliationDatePair

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective at date for the reconciliation | [optional] [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as at date for the reconciliation | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.GroupReconciliationDatePair;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();


GroupReconciliationDatePair groupReconciliationDatePairInstance = new GroupReconciliationDatePair()
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
