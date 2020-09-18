

# DataType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  |  [optional]
**typeValueRange** | [**TypeValueRangeEnum**](#TypeValueRangeEnum) | The available values are: Open, Closed | 
**id** | [**ResourceId**](ResourceId.md) |  | 
**displayName** | **String** |  | 
**description** | **String** |  | 
**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) | The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel | 
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
CODE | &quot;Code&quot;
ID | &quot;Id&quot;
URI | &quot;Uri&quot;
CURRENCYANDAMOUNT | &quot;CurrencyAndAmount&quot;
CURRENCY | &quot;Currency&quot;
METRICVALUE | &quot;MetricValue&quot;
RESOURCEID | &quot;ResourceId&quot;
RESULTVALUE | &quot;ResultValue&quot;
CUTLOCALTIME | &quot;CutLocalTime&quot;
DATEORCUTLABEL | &quot;DateOrCutLabel&quot;



## Enum: UnitSchemaEnum

Name | Value
---- | -----
NOUNITS | &quot;NoUnits&quot;
BASIC | &quot;Basic&quot;
ISO4217CURRENCY | &quot;Iso4217Currency&quot;



