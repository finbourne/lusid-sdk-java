
# CreateResults

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective market date for which results are calculated and are to be stored. | 
**entityScope** | **String** | Scope of the entity code | 
**entityCode** | **String** | The code of the entity for which the data has been calculated. | 
**calculationScope** | **String** | Scope of the calculation code. | 
**calculationCode** | **String** | This is the identifier which denotes some hash of, or recipe, that cumulatively represents the configuration through which  the results being stored are obtained. For example, the recipe denotes the pricing model, the market data and any other  settings. If the results were calculated externally it should be some repeatable hash or other Id that denotes the particular  configuration under which those results were obtained. | 
**format** | [**FormatEnum**](#FormatEnum) | The format in which the results are stored/structured. |  [optional]
**data** | **String** | The data that should be stored in the results cube. |  [optional]


<a name="FormatEnum"></a>
## Enum: FormatEnum
Name | Value
---- | -----
DATAREADER | &quot;DataReader&quot;
PORTFOLIO | &quot;Portfolio&quot;
UNKNOWN | &quot;Unknown&quot;



