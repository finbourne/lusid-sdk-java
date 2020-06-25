

# DataType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  |  [optional]
**typeValueRange** | [**TypeValueRangeEnum**](#TypeValueRangeEnum) | The available values are: Open, Closed | 
**id** | [**ResourceId**](ResourceId.md) |  | 
**displayName** | **String** |  | 
**description** | **String** |  | 
**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) | The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, BenchmarkType, Code, Id, Uri, ArrayOfIds, ArrayOfTransactionAliases, ArrayofTransactionMovements, ArrayofUnits, StringArray, CurrencyAndAmount, TradePrice, UnitCreation, Currency, UserId, MetricValue, QuoteId, QuoteSeriesId, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, Transition, StructuredData, StructuredDataId, ConfigurationRecipe, ConfigurationRecipeSnippet, StructuredResultDataId, StructuredResultData, DataMapping, LusidInstrument, WeightedInstrument, Tenor, CdsProtectionDetailSpecification, FlowConventions, CdsFlowConventions, LegDefinition, IndexConvention, OrderId, Order | 
**acceptableValues** | **List&lt;String&gt;** |  |  [optional]
**unitSchema** | [**UnitSchemaEnum**](#UnitSchemaEnum) | The available values are: NoUnits, Basic, Iso4217Currency |  [optional]
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
LUSIDINSTRUMENT | &quot;LusidInstrument&quot;
WEIGHTEDINSTRUMENT | &quot;WeightedInstrument&quot;
TENOR | &quot;Tenor&quot;
CDSPROTECTIONDETAILSPECIFICATION | &quot;CdsProtectionDetailSpecification&quot;
FLOWCONVENTIONS | &quot;FlowConventions&quot;
CDSFLOWCONVENTIONS | &quot;CdsFlowConventions&quot;
LEGDEFINITION | &quot;LegDefinition&quot;
INDEXCONVENTION | &quot;IndexConvention&quot;
ORDERID | &quot;OrderId&quot;
ORDER | &quot;Order&quot;



## Enum: UnitSchemaEnum

Name | Value
---- | -----
NOUNITS | &quot;NoUnits&quot;
BASIC | &quot;Basic&quot;
ISO4217CURRENCY | &quot;Iso4217Currency&quot;



