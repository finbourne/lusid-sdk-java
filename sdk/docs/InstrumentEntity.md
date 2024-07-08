

# InstrumentEntity

A list of instruments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  |
|**entityUniqueId** | **String** | The unique id of the entity. |  |
|**asAtVersionNumber** | **Integer** | The integer version number for the entity (the entity was created at version 1) |  [optional] |
|**status** | **String** | The status of the entity at the current time. |  |
|**asAtDeleted** | **OffsetDateTime** | The asAt datetime at which the entity was deleted. |  [optional] |
|**userIdDeleted** | **String** | The unique id of the user who deleted the entity. |  [optional] |
|**requestIdDeleted** | **String** | The unique request id of the command that deleted the entity. |  [optional] |
|**effectiveAtCreated** | **OffsetDateTime** | The EffectiveAt this Entity is created, if entity does not currently exist in EffectiveAt. |  [optional] |
|**prevailingInstrument** | [**Instrument**](Instrument.md) |  |  [optional] |
|**deletedInstrument** | [**Instrument**](Instrument.md) |  |  [optional] |
|**previewedStatus** | **String** | The status of the previewed entity. |  [optional] |
|**previewedInstrument** | [**Instrument**](Instrument.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



