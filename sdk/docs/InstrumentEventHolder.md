

# InstrumentEventHolder

An instrument event equipped with additional metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instrumentEventId** | **String** | The unique identifier of this corporate action. |  |
|**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The set of identifiers which determine the instrument this event relates to. |  |
|**lusidInstrumentId** | **String** | The LUID for the instrument. |  |
|**instrumentScope** | **String** | The scope of the instrument. |  |
|**description** | **String** | The description of the instrument event. |  |
|**eventDateRange** | [**EventDateRange**](EventDateRange.md) |  |  |
|**instrumentEvent** | [**InstrumentEvent**](InstrumentEvent.md) |  |  |
|**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) | The properties attached to this instrument event. |  [optional] |



