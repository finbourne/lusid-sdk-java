

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
|**completeness** | **String** | Is the event Economically Complete, or is it missing some DataDependent fields (Incomplete). |  [optional] [readonly] |
|**instrumentEvent** | [**InstrumentEvent**](InstrumentEvent.md) |  |  |
|**properties** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) | The properties attached to this instrument event. |  [optional] |
|**sequenceNumber** | **Integer** | The order of the instrument event relative others on the same date (0 being processed first). Must be non negative. |  [optional] |
|**participationType** | **String** | Is participation in this event Mandatory, MandatoryWithChoices, or Voluntary. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


