# com.finbourne.lusid.model.InformationalEvent
A generic event derived from the economic definition of an instrument. This should be considered purely  informational; any data provided by this event is not guaranteed to be processable by LUSID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | What type of internal event does this represent; reset, exercise, amortisation etc. | [readonly] [default to String]
**anchorDate** | [**OffsetDateTime**](OffsetDateTime.md) | In the case of a point event, the single date on which the event occurs. In the case of an event which is  spread over a window, e.g. a barrier or American option, the start of that window. | [default to OffsetDateTime]
**eventWindowEnd** | [**OffsetDateTime**](OffsetDateTime.md) | In the case of a point event this is identical to the anchor date. In the case of an event that is spread over a window,  this is the end of that window. | [optional] [readonly] [default to OffsetDateTime]
**diagnostics** | [**ResultValueDictionary**](ResultValueDictionary.md) |  | [optional] [default to ResultValueDictionary]

```java
import com.finbourne.lusid.model.InformationalEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EventType = "example EventType";
OffsetDateTime AnchorDate = OffsetDateTime.now();
OffsetDateTime EventWindowEnd = OffsetDateTime.now();
ResultValueDictionary Diagnostics = new ResultValueDictionary();


InformationalEvent informationalEventInstance = new InformationalEvent()
    .EventType(EventType)
    .AnchorDate(AnchorDate)
    .EventWindowEnd(EventWindowEnd)
    .Diagnostics(Diagnostics);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
