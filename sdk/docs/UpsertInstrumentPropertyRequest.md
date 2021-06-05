

# UpsertInstrumentPropertyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifierType** | **String** | The unique identifier type to search for the instrument, for example &#39;Figi&#39;. | 
**identifier** | **String** | A value of that type to identify the instrument to upsert properties for, for example &#39;BBG000BLNNV0&#39;. | 
**properties** | [**List&lt;Property&gt;**](Property.md) | A set of instrument properties and associated values to store for the instrument. Each property must be from the &#39;Instrument&#39; domain. |  [optional]



