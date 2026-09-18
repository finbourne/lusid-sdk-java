# com.finbourne.lusid.model.InstantiateRecRequest
The request to instantiate a new rec instance from a rec definition and start its first run. Each  date accepts a date-time or a LUSID cut label, and defaults to the current date-time when omitted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**leftEffectiveAt** | **String** | The left effective datetime, as a date-time or a LUSID cut label. Defaults to the current date-time. When the definition&#39;s datePolicy.effectiveAtProgression is Series, must be strictly after the previous instance&#39;s leftEffectiveAt. | [optional] [default to String]
**leftAsAt** | **String** | The left asAt datetime, as a date-time or a LUSID cut label. Must be omitted when the definition&#39;s datePolicy.asAtPolicy.left is Latest, as the system reconciles at the latest knowledge on every run. When it is Explicit, defaults to the current date-time and is pinned on the instance. | [optional] [default to String]
**rightEffectiveAt** | **String** | The right effective datetime, as a date-time or a LUSID cut label. Defaults to the current date-time. When the definition&#39;s datePolicy.effectiveAtProgression is Series, must be strictly after the previous instance&#39;s rightEffectiveAt. | [optional] [default to String]
**rightAsAt** | **String** | The right asAt datetime, as a date-time or a LUSID cut label. Must be omitted when the definition&#39;s datePolicy.asAtPolicy.right is Latest, as the system reconciles at the latest knowledge on every run. When it is Explicit, defaults to the current date-time and is pinned on the instance. | [optional] [default to String]

```java
import com.finbourne.lusid.model.InstantiateRecRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RecDefinitionId = new ResourceId();
@jakarta.annotation.Nullable String LeftEffectiveAt = "example LeftEffectiveAt";
@jakarta.annotation.Nullable String LeftAsAt = "example LeftAsAt";
@jakarta.annotation.Nullable String RightEffectiveAt = "example RightEffectiveAt";
@jakarta.annotation.Nullable String RightAsAt = "example RightAsAt";


InstantiateRecRequest instantiateRecRequestInstance = new InstantiateRecRequest()
    .RecDefinitionId(RecDefinitionId)
    .LeftEffectiveAt(LeftEffectiveAt)
    .LeftAsAt(LeftAsAt)
    .RightEffectiveAt(RightEffectiveAt)
    .RightAsAt(RightAsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
