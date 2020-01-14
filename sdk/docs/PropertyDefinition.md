

# PropertyDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **String** | The specifc Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional]
**key** | **String** | The property key which uniquely identifies the property. The format for the property key is {domain}/{scope}/{code}, e.g. &#39;Portfolio/Manager/Id&#39;. |  [optional]
**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) | The type of values that can be associated with this property. This is defined by the property&#39;s data type. |  [optional]
**valueRequired** | **Boolean** | Whether or not a value is always required for this property. |  [optional]
**displayName** | **String** | The display name of the property. |  [optional]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**lifeTime** | [**LifeTimeEnum**](#LifeTimeEnum) | Describes how the property&#39;s values can change over time. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the property. |  [optional]
**unitSchema** | [**UnitSchemaEnum**](#UnitSchemaEnum) | The units that can be associated with the property&#39;s values. This is defined by the property&#39;s data type. |  [optional]
**domain** | [**DomainEnum**](#DomainEnum) | The domain that the property exists in. |  [optional]
**scope** | **String** | The scope that the property exists in. |  [optional]
**code** | **String** | The code of the property. Together with the domain and scope this uniquely identifies the property. |  [optional]
**constraintStyle** | **String** | Describes the uniqueness and cardinality of the property for entity objects under the property domain specified in Key. |  [optional]
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
NOTDEFINED | &quot;NotDefined&quot;
TRANSACTION | &quot;Transaction&quot;
PORTFOLIO | &quot;Portfolio&quot;
HOLDING | &quot;Holding&quot;
REFERENCEHOLDING | &quot;ReferenceHolding&quot;
TRANSACTIONCONFIGURATION | &quot;TransactionConfiguration&quot;
INSTRUMENT | &quot;Instrument&quot;
CUTLABELDEFINITION | &quot;CutLabelDefinition&quot;
ANALYTIC | &quot;Analytic&quot;
PORTFOLIOGROUP | &quot;PortfolioGroup&quot;
PERSON | &quot;Person&quot;
ACCESSMETADATA | &quot;AccessMetadata&quot;
ORDER | &quot;Order&quot;
UNITRESULT | &quot;UnitResult&quot;



