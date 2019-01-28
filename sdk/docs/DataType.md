
# DataType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** |  |  [optional]
**typeValueRange** | [**TypeValueRangeEnum**](#TypeValueRangeEnum) |  |  [optional]
**id** | [**ResourceId**](ResourceId.md) |  |  [optional]
**displayName** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) |  |  [optional]
**acceptableValues** | **List&lt;Object&gt;** |  |  [optional]
**unitSchema** | [**UnitSchemaEnum**](#UnitSchemaEnum) |  |  [optional]
**acceptableUnits** | [**List&lt;IUnitDefinitionDto&gt;**](IUnitDefinitionDto.md) |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]


<a name="TypeValueRangeEnum"></a>
## Enum: TypeValueRangeEnum
Name | Value
---- | -----
OPEN | &quot;Open&quot;
CLOSED | &quot;Closed&quot;


<a name="ValueTypeEnum"></a>
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
QUOTELINEAGE | &quot;QuoteLineage&quot;
ARRAYOFQUOTEIDS | &quot;ArrayOfQuoteIds&quot;
RESOURCEID | &quot;ResourceId&quot;


<a name="UnitSchemaEnum"></a>
## Enum: UnitSchemaEnum
Name | Value
---- | -----
NOUNITS | &quot;NoUnits&quot;
BASIC | &quot;Basic&quot;
ISO4217CURRENCY | &quot;Iso4217Currency&quot;



