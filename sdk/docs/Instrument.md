

# Instrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional]
**lusidInstrumentId** | **String** | The unique LUSID Instrument Identifier (LUID) of the instrument. | 
**version** | [**Version**](Version.md) |  | 
**name** | **String** | The name of the instrument. | 
**identifiers** | **Map&lt;String, String&gt;** | The set of identifiers that can be used to identify the instrument. | 
**properties** | [**List&lt;Property&gt;**](Property.md) | The requested instrument properties. These will be from the &#39;Instrument&#39; domain. |  [optional]
**lookthroughPortfolio** | [**ResourceId**](ResourceId.md) |  |  [optional]
**instrumentDefinition** | [**InstrumentEconomicDefinition**](InstrumentEconomicDefinition.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of of the instrument at the asAt datetime of this version of the instrument definition. | 
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
ACTIVE | &quot;Active&quot;
INACTIVE | &quot;Inactive&quot;



