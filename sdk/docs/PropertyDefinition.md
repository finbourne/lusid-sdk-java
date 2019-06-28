

# PropertyDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** |  |  [optional]
**key** | **String** |  |  [optional]
**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) |  |  [optional]
**valueRequired** | **Boolean** |  |  [optional]
**displayName** | **String** |  |  [optional]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**lifeTime** | [**LifeTimeEnum**](#LifeTimeEnum) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**unitSchema** | [**UnitSchemaEnum**](#UnitSchemaEnum) |  |  [optional]
**domain** | [**DomainEnum**](#DomainEnum) |  |  [optional]
**scope** | **String** |  |  [optional]
**code** | **String** |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



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
ARRAYOFQUOTEIDS | &quot;ArrayOfQuoteIds&quot;
RESOURCEID | &quot;ResourceId&quot;
RESULTVALUE | &quot;ResultValue&quot;
CUTLOCALTIME | &quot;CutLocalTime&quot;
DATEORCUTLABEL | &quot;DateOrCutLabel&quot;
TRANSITION | &quot;Transition&quot;



## Enum: LifeTimeEnum

Name | Value
---- | -----
PERPETUAL | &quot;Perpetual&quot;
TIMEVARIANT | &quot;TimeVariant&quot;



## Enum: TypeEnum

Name | Value
---- | -----
LABEL | &quot;Label&quot;
METRIC | &quot;Metric&quot;
INFORMATION | &quot;Information&quot;



## Enum: UnitSchemaEnum

Name | Value
---- | -----
NOUNITS | &quot;NoUnits&quot;
BASIC | &quot;Basic&quot;
ISO4217CURRENCY | &quot;Iso4217Currency&quot;



## Enum: DomainEnum

Name | Value
---- | -----
TRADE | &quot;Trade&quot;
PORTFOLIO | &quot;Portfolio&quot;
HOLDING | &quot;Holding&quot;
REFERENCEHOLDING | &quot;ReferenceHolding&quot;
TRANSACTIONCONFIGURATION | &quot;TransactionConfiguration&quot;
INSTRUMENT | &quot;Instrument&quot;
CUTLABELDEFINITION | &quot;CutLabelDefinition&quot;
ANALYTIC | &quot;Analytic&quot;



