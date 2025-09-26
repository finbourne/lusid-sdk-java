# com.finbourne.lusid.model.EffectiveRange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective from datetime that this range applies to. | [optional] [default to OffsetDateTime]
**untilDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective from datetime that this range applies to. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.EffectiveRange;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime FromDate = OffsetDateTime.now();
OffsetDateTime UntilDate = OffsetDateTime.now();


EffectiveRange effectiveRangeInstance = new EffectiveRange()
    .FromDate(FromDate)
    .UntilDate(UntilDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
