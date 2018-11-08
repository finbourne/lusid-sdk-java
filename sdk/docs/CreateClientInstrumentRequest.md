
# CreateClientInstrumentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientInstrumentId** | **String** |  | 
**name** | **String** |  | 
**lookThroughPortfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**instrument** | [**InstrumentDefinition**](InstrumentDefinition.md) | Expanded instrument definition - in the case of OTC instruments  this contains the definition of the non-exchange traded instrument.  The format for this can be client-defined, but in order to transparently use  vendor libraries it must conform to a format that LUSID understands. |  [optional]



