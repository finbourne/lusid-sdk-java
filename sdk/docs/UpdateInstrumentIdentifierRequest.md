

# UpdateInstrumentIdentifierRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The allowable instrument identifier to update, insert or remove e.g. &#39;Figi&#39;. | 
**value** | **String** | The new value of the allowable instrument identifier. If unspecified the identifier will be removed from the instrument. |  [optional]
**effectiveAt** | **String** | The effective datetime from which the identifier should be updated, inserted or removed. Defaults to the current LUSID system datetime if not specified. |  [optional]



