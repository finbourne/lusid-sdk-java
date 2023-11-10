

# DataTypeSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**typeValueRange** | [**TypeValueRangeEnum**](#TypeValueRangeEnum) | Indicates the range of data acceptable by a data type. The available values are: Open, Closed |  |
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**displayName** | **String** | The display name of the data type. |  |
|**description** | **String** | The description of the data type. |  |
|**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) | The expected type of the values. The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, UnindexedText |  |
|**acceptableValues** | **List&lt;String&gt;** | The acceptable set of values for this data type. Only applies to &#39;open&#39; value type range. |  [optional] |
|**unitSchema** | [**UnitSchemaEnum**](#UnitSchemaEnum) | The schema of the data type&#39;s units. The available values are: NoUnits, Basic, Iso4217Currency |  [optional] |
|**acceptableUnits** | [**List&lt;IUnitDefinitionDto&gt;**](IUnitDefinitionDto.md) | The definitions of the acceptable units. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |



## Enum: TypeValueRangeEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;Open&quot; |
| CLOSED | &quot;Closed&quot; |



## Enum: ValueTypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;String&quot; |
| INT | &quot;Int&quot; |
| DECIMAL | &quot;Decimal&quot; |
| DATETIME | &quot;DateTime&quot; |
| BOOLEAN | &quot;Boolean&quot; |
| MAP | &quot;Map&quot; |
| LIST | &quot;List&quot; |
| PROPERTYARRAY | &quot;PropertyArray&quot; |
| PERCENTAGE | &quot;Percentage&quot; |
| CODE | &quot;Code&quot; |
| ID | &quot;Id&quot; |
| URI | &quot;Uri&quot; |
| CURRENCYANDAMOUNT | &quot;CurrencyAndAmount&quot; |
| TRADEPRICE | &quot;TradePrice&quot; |
| CURRENCY | &quot;Currency&quot; |
| METRICVALUE | &quot;MetricValue&quot; |
| RESOURCEID | &quot;ResourceId&quot; |
| RESULTVALUE | &quot;ResultValue&quot; |
| CUTLOCALTIME | &quot;CutLocalTime&quot; |
| DATEORCUTLABEL | &quot;DateOrCutLabel&quot; |
| UNINDEXEDTEXT | &quot;UnindexedText&quot; |



## Enum: UnitSchemaEnum

| Name | Value |
|---- | -----|
| NOUNITS | &quot;NoUnits&quot; |
| BASIC | &quot;Basic&quot; |
| ISO4217CURRENCY | &quot;Iso4217Currency&quot; |



