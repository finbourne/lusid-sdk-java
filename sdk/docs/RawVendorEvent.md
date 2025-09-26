# com.finbourne.lusid.model.RawVendorEvent
A generic event derived from the economic definition of an instrument. This should be considered purely  informational; any data provided by this event is not guaranteed to be processable by LUSID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the event | [default to OffsetDateTime]
**eventValue** | [**LifeCycleEventValue**](LifeCycleEventValue.md) |  | [default to LifeCycleEventValue]
**eventType** | **String** | What type of internal event does this represent; reset, exercise, amortisation etc. | [default to String]

```java
import com.finbourne.lusid.model.RawVendorEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveAt = OffsetDateTime.now();
LifeCycleEventValue EventValue = new LifeCycleEventValue();
String EventType = "example EventType";


RawVendorEvent rawVendorEventInstance = new RawVendorEvent()
    .EffectiveAt(EffectiveAt)
    .EventValue(EventValue)
    .EventType(EventType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
