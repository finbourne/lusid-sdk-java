

# DataType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** |  |  [optional]
**typeValueRange** | [**TypeValueRangeEnum**](#TypeValueRangeEnum) |  | 
**id** | [**ResourceId**](ResourceId.md) |  | 
**displayName** | **String** |  | 
**description** | **String** |  | 
**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) |  | 
**acceptableValues** | [**List&lt;PropertyValue&gt;**](PropertyValue.md) |  |  [optional]
**unitSchema** | [**UnitSchemaEnum**](#UnitSchemaEnum) |  |  [optional]
**acceptableUnits** | [**List&lt;IUnitDefinitionDto&gt;**](IUnitDefinitionDto.md) |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



## Enum: TypeValueRangeEnum

Name | Value
---- | -----
OPEN | &quot;Open&quot;
CLOSED | &quot;Closed&quot;



## Enum: ValueTypeEnum

Name | Value
---- | -----
STRING | &quot;String&quot;
INT | &quot;Int&quot;
DECIMAL | &quot;Decimal&quot;
DATETIME | &quot;DateTime&quot;
BOOLEAN | &quot;Boolean&quot;
MAP | &quot;Map&quot;
LIST | &quot;List&quot;
PROPERTYARRAY | &quot;PropertyArray&quot;
PERCENTAGE | &quot;Percentage&quot;
BENCHMARKTYPE | &quot;BenchmarkType&quot;
CODE | &quot;Code&quot;
ID | &quot;Id&quot;
URI | &quot;Uri&quot;
ARRAYOFIDS | &quot;ArrayOfIds&quot;
ARRAYOFTRANSACTIONALIASES | &quot;ArrayOfTransactionAliases&quot;
ARRAYOFTRANSACTIONMOVEMENTS | &quot;ArrayofTransactionMovements&quot;
ARRAYOFUNITS | &quot;ArrayofUnits&quot;
STRINGARRAY | &quot;StringArray&quot;
CURRENCYANDAMOUNT | &quot;CurrencyAndAmount&quot;
TRADEPRICE | &quot;TradePrice&quot;
UNITCREATION | &quot;UnitCreation&quot;
CURRENCY | &quot;Currency&quot;
USERID | &quot;UserId&quot;
METRICVALUE | &quot;MetricValue&quot;
QUOTEID | &quot;QuoteId&quot;
QUOTESERIESID | &quot;QuoteSeriesId&quot;
RESOURCEID | &quot;ResourceId&quot;
RESULTVALUE | &quot;ResultValue&quot;
CUTLOCALTIME | &quot;CutLocalTime&quot;
DATEORCUTLABEL | &quot;DateOrCutLabel&quot;
TRANSITION | &quot;Transition&quot;
STRUCTUREDDATA | &quot;StructuredData&quot;
STRUCTUREDDATAID | &quot;StructuredDataId&quot;
CONFIGURATIONRECIPE | &quot;ConfigurationRecipe&quot;
CONFIGURATIONRECIPESNIPPET | &quot;ConfigurationRecipeSnippet&quot;
STRUCTUREDRESULTDATAID | &quot;StructuredResultDataId&quot;
STRUCTUREDRESULTDATA | &quot;StructuredResultData&quot;
DATAMAPPING | &quot;DataMapping&quot;



## Enum: UnitSchemaEnum

Name | Value
---- | -----
NOUNITS | &quot;NoUnits&quot;
BASIC | &quot;Basic&quot;
ISO4217CURRENCY | &quot;Iso4217Currency&quot;



