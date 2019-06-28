

# InstrumentDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Required. The name of the instrument | 
**identifiers** | [**Map&lt;String, InstrumentIdValue&gt;**](InstrumentIdValue.md) | Required. A set of identifiers that identify this instrument (BBG123456)  with the key being the type of identifier (RIC, FIGI).  Must include atleast one unique identifier. | 
**properties** | [**List&lt;InstrumentProperty&gt;**](InstrumentProperty.md) | Optional. A collection of properties to upsert on the instrument. |  [optional]
**lookThroughPortfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**definition** | [**InstrumentEconomicDefinition**](InstrumentEconomicDefinition.md) |  |  [optional]



