

# UpsertInstrumentEventRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrumentEventId** | **String** | Free string that uniquely identifies the event within the corporate action source |  |
|**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The set of identifiers which determine the instrument this event relates to. |  |
|**description** | **String** | The description of the instrument event. |  [optional] |
|**instrumentEvent** | [**InstrumentEvent**](InstrumentEvent.md) |  |  |
|**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) | The properties attached to this instrument event. |  [optional] |
|**sequenceNumber** | **Integer** | The order of the instrument event relative others on the same date (0 being processed first). Must be non negative. |  [optional] |



