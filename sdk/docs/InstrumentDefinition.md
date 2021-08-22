

# InstrumentDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the instrument. | 
**identifiers** | [**Map&lt;String, InstrumentIdValue&gt;**](InstrumentIdValue.md) | A set of identifiers that can be used to identify the instrument. At least one of these must be configured to be a unique identifier. | 
**properties** | [**List&lt;Property&gt;**](Property.md) | Set of unique instrument properties and associated values to store with the instrument. Each property must be from the &#39;Instrument&#39; domain. |  [optional]
**lookThroughPortfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**definition** | [**LusidInstrument**](LusidInstrument.md) |  |  [optional]



