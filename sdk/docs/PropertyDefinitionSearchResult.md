

# PropertyDefinitionSearchResult

A property definition search result

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional]
**key** | **String** | The property key which uniquely identifies the property. The format for the property key is {domain}/{scope}/{code}, e.g. &#39;Portfolio/Manager/Id&#39;. |  [optional]
**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) | The type of values that can be associated with this property. This is defined by the property&#39;s data type. The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel |  [optional]
**displayName** | **String** | The display name of the property. |  [optional]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the property. The available values are: Label, Metric, Information |  [optional]
**unitSchema** | [**UnitSchemaEnum**](#UnitSchemaEnum) | The units that can be associated with the property&#39;s values. This is defined by the property&#39;s data type. The available values are: NoUnits, Basic, Iso4217Currency |  [optional]
**domain** | [**DomainEnum**](#DomainEnum) | The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction |  [optional]
**scope** | **String** | The scope that the property exists in. |  [optional] [readonly]
**code** | **String** | The code of the property. Together with the domain and scope this uniquely identifies the property. |  [optional] [readonly]
**valueRequired** | **Boolean** | Whether or not a value is always required for this property. |  [optional]
**lifeTime** | [**LifeTimeEnum**](#LifeTimeEnum) | Describes how the property&#39;s values can change over time. The available values are: Perpetual, TimeVariant |  [optional]
**constraintStyle** | **String** | Describes the uniqueness and cardinality of the property for entity objects under the property domain specified in Key. |  [optional]
**propertyDefinitionType** | [**PropertyDefinitionTypeEnum**](#PropertyDefinitionTypeEnum) | The definition type (DerivedDefinition or Definition). The available values are: ValueProperty, DerivedDefinition |  [optional]
**propertyDescription** | **String** | A brief description of what a property of this property definition contains. |  [optional]
**derivationFormula** | **String** | The rule that defines how data is composed for a derived property. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Collection of links. |  [optional]



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
TRADEPRICE | &quot;TradePrice&quot;
CURRENCY | &quot;Currency&quot;
METRICVALUE | &quot;MetricValue&quot;
RESOURCEID | &quot;ResourceId&quot;
RESULTVALUE | &quot;ResultValue&quot;
CUTLOCALTIME | &quot;CutLocalTime&quot;
DATEORCUTLABEL | &quot;DateOrCutLabel&quot;



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
MARKETDATA | &quot;MarketData&quot;
CONFIGURATIONRECIPE | &quot;ConfigurationRecipe&quot;
ALLOCATION | &quot;Allocation&quot;
CALENDAR | &quot;Calendar&quot;
LEGALENTITY | &quot;LegalEntity&quot;
PLACEMENT | &quot;Placement&quot;
EXECUTION | &quot;Execution&quot;
BLOCK | &quot;Block&quot;
PARTICIPATION | &quot;Participation&quot;
PACKAGE | &quot;Package&quot;
ORDERINSTRUCTION | &quot;OrderInstruction&quot;



## Enum: LifeTimeEnum

Name | Value
---- | -----
PERPETUAL | &quot;Perpetual&quot;
TIMEVARIANT | &quot;TimeVariant&quot;



## Enum: PropertyDefinitionTypeEnum

Name | Value
---- | -----
VALUEPROPERTY | &quot;ValueProperty&quot;
DERIVEDDEFINITION | &quot;DerivedDefinition&quot;



