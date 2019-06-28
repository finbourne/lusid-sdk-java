

# Instrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** |  |  [optional]
**lusidInstrumentId** | **String** | The lusid instrument id (LUID) of the instrument |  [optional]
**version** | [**Version**](Version.md) |  |  [optional]
**name** | **String** | The name of the instrument |  [optional]
**identifiers** | **Map&lt;String, String&gt;** | The set of identifiers that can be used to uniquely identify the instrument |  [optional]
**properties** | [**List&lt;Property&gt;**](Property.md) | Any requested instrument properties |  [optional]
**lookthroughPortfolio** | [**ResourceId**](ResourceId.md) |  |  [optional]
**instrumentDefinition** | [**InstrumentEconomicDefinition**](InstrumentEconomicDefinition.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  | 
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
ACTIVE | &quot;Active&quot;
INACTIVE | &quot;Inactive&quot;



