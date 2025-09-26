# com.finbourne.lusid.model.StagedModificationEffectiveRange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromDate** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime that this requested change is effective from. | [optional] [default to OffsetDateTime]
**untilDate** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime that this requested change is effective until. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.StagedModificationEffectiveRange;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime FromDate = OffsetDateTime.now();
OffsetDateTime UntilDate = OffsetDateTime.now();


StagedModificationEffectiveRange stagedModificationEffectiveRangeInstance = new StagedModificationEffectiveRange()
    .FromDate(FromDate)
    .UntilDate(UntilDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
