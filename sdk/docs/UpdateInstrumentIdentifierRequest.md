
# UpdateInstrumentIdentifierRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of the identifier to upsert. This must be one of the code types marked as   allowable for instrument identifiers. |  [optional]
**value** | **String** | The value of the identifier. If set to &#x60;null&#x60;, this will remove the identifier completely.  Note that, if an instrument only has one identifier, it is an error to remove this. |  [optional]
**effectiveAt** | **String** | The date at which the identifier modification is to be effective from. If unset, will  default to &#x60;now&#x60;. |  [optional]



