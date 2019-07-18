

# DeleteInstrumentPropertyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentPropertyKey** | **String** | The key of the property to be removed from the instrument. This takes the format {domain}/{scope}/{code} e.g. &#39;Instrument/CreditScope/CreditRating&#39;. |  [optional]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the property should be removed. Defaults to the current LUSID system datetime if not specified. |  [optional]



