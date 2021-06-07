

# Property


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the property. This takes the format {domain}/{scope}/{code} e.g. &#39;Instrument/system/Name&#39; or &#39;Transaction/strategy/quantsignal&#39;. | 
**value** | [**PropertyValue**](PropertyValue.md) |  |  [optional]
**effectiveFrom** | **OffsetDateTime** | The effective datetime from which the property is valid. |  [optional]
**effectiveUntil** | **OffsetDateTime** | The effective datetime until which the property is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveFrom&#39; datetime of the property. |  [optional]



