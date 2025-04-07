

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
|**participationType** | **String** | Is participation in this event Mandatory, MandatoryWithChoices, or Voluntary. |  [optional] |
|**eventDateStamps** | [**Map&lt;String, YearMonthDay&gt;**](YearMonthDay.md) | The date stamps corresponding to the relevant date-time fields for the instrument event. The key for each provided date stamp must match the field name of a valid datetime field from the InstrumentEvent DTO. |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


