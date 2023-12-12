

# CreatePropertyDefinitionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | [**DomainEnum**](#DomainEnum) | The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, Abor, AborConfiguration, Reconciliation, PropertyDefinition, Compliance, DiaryEntry |  |
|**scope** | **String** | The scope that the property exists in. |  |
|**code** | **String** | The code of the property. Together with the domain and scope this uniquely identifies the property. |  |
|**valueRequired** | **Boolean** | This field is not implemented and should be disregarded. |  [optional] |
|**displayName** | **String** | The display name of the property. |  |
|**dataTypeId** | [**ResourceId**](ResourceId.md) |  |  |
|**lifeTime** | [**LifeTimeEnum**](#LifeTimeEnum) | Describes how the property&#39;s values can change over time. The available values are: Perpetual, TimeVariant |  [optional] |
|**constraintStyle** | **String** | Describes the uniqueness and cardinality of the property for entity objects under the property domain specified in Key. Defaults to \&quot;Property\&quot; if not specified. Valid values for this field are: Property, Collection or Identifier. |  [optional] |
|**propertyDescription** | **String** | Describes the property |  [optional] |
|**collectionType** | **String** | Describes whether a collection property should behave as a set or as an array. |  [optional] |



## Enum: DomainEnum

| Name | Value |
|---- | -----|
| NOTDEFINED | &quot;NotDefined&quot; |
| TRANSACTION | &quot;Transaction&quot; |
| PORTFOLIO | &quot;Portfolio&quot; |
| HOLDING | &quot;Holding&quot; |
| REFERENCEHOLDING | &quot;ReferenceHolding&quot; |
| TRANSACTIONCONFIGURATION | &quot;TransactionConfiguration&quot; |
| INSTRUMENT | &quot;Instrument&quot; |
| CUTLABELDEFINITION | &quot;CutLabelDefinition&quot; |
| ANALYTIC | &quot;Analytic&quot; |
| PORTFOLIOGROUP | &quot;PortfolioGroup&quot; |
| PERSON | &quot;Person&quot; |
| ACCESSMETADATA | &quot;AccessMetadata&quot; |
| ORDER | &quot;Order&quot; |
| UNITRESULT | &quot;UnitResult&quot; |
| MARKETDATA | &quot;MarketData&quot; |
| CONFIGURATIONRECIPE | &quot;ConfigurationRecipe&quot; |
| ALLOCATION | &quot;Allocation&quot; |
| CALENDAR | &quot;Calendar&quot; |
| LEGALENTITY | &quot;LegalEntity&quot; |
| PLACEMENT | &quot;Placement&quot; |
| EXECUTION | &quot;Execution&quot; |
| BLOCK | &quot;Block&quot; |
| PARTICIPATION | &quot;Participation&quot; |
| PACKAGE | &quot;Package&quot; |
| ORDERINSTRUCTION | &quot;OrderInstruction&quot; |
| NEXTBESTACTION | &quot;NextBestAction&quot; |
| CUSTOMENTITY | &quot;CustomEntity&quot; |
| INSTRUMENTEVENT | &quot;InstrumentEvent&quot; |
| ACCOUNT | &quot;Account&quot; |
| CHARTOFACCOUNTS | &quot;ChartOfAccounts&quot; |
| CUSTODIANACCOUNT | &quot;CustodianAccount&quot; |
| ABOR | &quot;Abor&quot; |
| ABORCONFIGURATION | &quot;AborConfiguration&quot; |
| RECONCILIATION | &quot;Reconciliation&quot; |
| PROPERTYDEFINITION | &quot;PropertyDefinition&quot; |
| COMPLIANCE | &quot;Compliance&quot; |
| DIARYENTRY | &quot;DiaryEntry&quot; |



## Enum: LifeTimeEnum

| Name | Value |
|---- | -----|
| PERPETUAL | &quot;Perpetual&quot; |
| TIMEVARIANT | &quot;TimeVariant&quot; |



