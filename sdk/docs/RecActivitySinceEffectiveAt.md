# com.finbourne.lusid.model.RecActivitySinceEffectiveAt
A per-side exclusive lower bound on an activity window's effective range.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**OffsetDateTime**](OffsetDateTime.md) | The exclusive lower bound for the left side. Activity effective at exactly this datetime falls outside the window. | [default to OffsetDateTime]
**right** | [**OffsetDateTime**](OffsetDateTime.md) | The exclusive lower bound for the right side. Activity effective at exactly this datetime falls outside the window. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.RecActivitySinceEffectiveAt;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Left = OffsetDateTime.now();
OffsetDateTime Right = OffsetDateTime.now();


RecActivitySinceEffectiveAt recActivitySinceEffectiveAtInstance = new RecActivitySinceEffectiveAt()
    .Left(Left)
    .Right(Right);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
