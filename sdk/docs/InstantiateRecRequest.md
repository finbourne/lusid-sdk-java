# com.finbourne.lusid.model.InstantiateRecRequest
The request to instantiate a new rec instance from a rec definition and start its first run. Each  date accepts a date-time or a LUSID cut label, and defaults to the current date-time when omitted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recDefinitionId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**leftEffectiveAt** | **String** | The left effective datetime, as a date-time or a LUSID cut label. Defaults to the current date-time. | [optional] [default to String]
**leftAsAt** | **String** | The left asAt datetime, as a date-time or a LUSID cut label. Defaults to the current date-time. | [optional] [default to String]
**rightEffectiveAt** | **String** | The right effective datetime, as a date-time or a LUSID cut label. Defaults to the current date-time. | [optional] [default to String]
**rightAsAt** | **String** | The right asAt datetime, as a date-time or a LUSID cut label. Defaults to the current date-time. | [optional] [default to String]

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
