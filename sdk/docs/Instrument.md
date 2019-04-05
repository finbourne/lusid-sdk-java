
# Instrument

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** |  |  [optional]
**lusidInstrumentId** | **String** | The lusid instrument id (LUID) of the instrument |  [optional]
**version** | [**Version**](Version.md) | The version of the instrument |  [optional]
**name** | **String** | The name of the instrument |  [optional]
**identifiers** | **Map&lt;String, String&gt;** | The set of identifiers that can be used to uniquely identify the instrument |  [optional]
**properties** | [**List&lt;Property&gt;**](Property.md) | Any requested instrument properties. If no property can be found for the instrument, then  a value of &#39;Unknown&#39; will be returned |  [optional]
**lookthroughPortfolio** | [**ResourceId**](ResourceId.md) | The lookthrough portfolio of the instrument (if any). |  [optional]
**instrumentDefinition** | [**InstrumentEconomicDefinition**](InstrumentEconomicDefinition.md) | The economic definition of the instrument for an OTC or instrument where an expanded definition exists. |  [optional]
**state** | [**StateEnum**](#StateEnum) |  | 
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;Active&quot;
INACTIVE | &quot;Inactive&quot;



