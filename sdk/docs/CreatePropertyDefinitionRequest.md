

# CreatePropertyDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | [**DomainEnum**](#DomainEnum) | The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar | 
**scope** | **String** | The scope that the property exists in. | 
**code** | **String** | The code of the property. Together with the domain and scope this uniquely identifies the property. | 
**valueRequired** | **Boolean** | Whether or not a value is always required for this property. |  [optional]
**displayName** | **String** | The display name of the property. | 
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | 
**lifeTime** | [**LifeTimeEnum**](#LifeTimeEnum) | Describes how the property&#39;s values can change over time. The available values are: Perpetual, TimeVariant |  [optional]
**constraintStyle** | **String** | Describes the uniqueness and cardinality of the property for entity objects under the property domain specified in Key. Defaults to \&quot;Property\&quot; if not specified. |  [optional]
**propertyDescription** | **String** | Describes the property |  [optional]



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



## Enum: LifeTimeEnum

Name | Value
---- | -----
PERPETUAL | &quot;Perpetual&quot;
TIMEVARIANT | &quot;TimeVariant&quot;



