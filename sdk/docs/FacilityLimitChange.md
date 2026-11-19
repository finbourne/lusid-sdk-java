# com.finbourne.lusid.model.FacilityLimitChange
A change to a Facility's committed limit: the limit in force from a date until the next change.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**limit** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.FacilityLimitChange;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveFrom = OffsetDateTime.now();
java.math.BigDecimal Limit = new java.math.BigDecimal("100.00");


FacilityLimitChange facilityLimitChangeInstance = new FacilityLimitChange()
    .EffectiveFrom(EffectiveFrom)
    .Limit(Limit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
