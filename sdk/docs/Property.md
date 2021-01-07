

# Property

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the property. This takes the format {domain}/{scope}/{code} e.g. &#39;Instrument/system/Name&#39; or &#39;Transaction/strategy/quantsignal&#39;. | 
**value** | [**PropertyValue**](PropertyValue.md) |  | 
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the property is valid. |  [optional]
**effectiveUntil** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime until which the property is valid. If not supplied this will be valid indefinitely, potentially overwriting values with EffectiveFrom&#39;s in the future. |  [optional]



