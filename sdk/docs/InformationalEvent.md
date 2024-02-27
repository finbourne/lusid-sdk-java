

# InformationalEvent

A generic event derived from the economic definition of an instrument. This should be considered purely  informational; any data provided by this event is not guaranteed to be processable by LUSID.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventType** | **String** | What type of internal event does this represent; reset, exercise, amortisation etc. |  [readonly] |
|**anchorDate** | **OffsetDateTime** | In the case of a point event, the single date on which the event occurs. In the case of an event which is  spread over a window, e.g. a barrier or American option, the start of that window. |  |
|**eventWindowEnd** | **OffsetDateTime** | In the case of a point event this is identical to the anchor date. In the case of an event that is spread over a window,  this is the end of that window. |  [optional] [readonly] |
|**diagnostics** | [**ResultValueDictionary**](ResultValueDictionary.md) |  |  [optional] |



