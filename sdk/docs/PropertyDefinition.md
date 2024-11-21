

# PropertyDefinition

A list of property definitions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**key** | **String** | The property key which uniquely identifies the property. The format for the property key is {domain}/{scope}/{code}, e.g. &#39;Portfolio/Manager/Id&#39;. |  [optional] |
|**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) | The type of values that can be associated with this property. This is defined by the property&#39;s data type. The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, UnindexedText |  [optional] |
|**displayName** | **String** | The display name of the property. |  [optional] |
|**dataTypeId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the property. The available values are: Label, Metric, Information |  [optional] |
|**unitSchema** | [**UnitSchemaEnum**](#UnitSchemaEnum) | The units that can be associated with the property&#39;s values. This is defined by the property&#39;s data type. The available values are: NoUnits, Basic, Iso4217Currency |  [optional] |
|**domain** | [**DomainEnum**](#DomainEnum) | The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, Abor, AborConfiguration, Fund, FundConfiguration, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, AddressKeyDefinition, AmortisationRuleSet, AnalyticsSetInventory, AtomUnitResult, CleardownModule, ComplexMarketData, ComplianceRunSummary, ComplianceRule, ComplianceRunInfo, CorporateActionSource, CounterpartyAgreement, CustomEntityDefinition, DataType, Dialect, EventHandler, GeneralLedgerProfile, PostingModule, Quote, RecipeComposer, ReconciliationRunBreak, ReferenceList, RelationDefinition, ReturnBlockIndex, SRSDocument, SRSIndex, TransactionTemplate, TransactionTemplateScope, TransactionType, TransactionTypeConfig, TranslationScript, TaskDefinition, TaskInstance, Worker, StagingRuleSet |  [optional] |
|**scope** | **String** | The scope that the property exists in. |  [optional] [readonly] |
|**code** | **String** | The code of the property. Together with the domain and scope this uniquely identifies the property. |  [optional] [readonly] |
|**valueRequired** | **Boolean** | This field is not implemented and should be disregarded. |  [optional] |
|**lifeTime** | [**LifeTimeEnum**](#LifeTimeEnum) | Describes how the property&#39;s values can change over time. The available values are: Perpetual, TimeVariant |  [optional] |
|**constraintStyle** | **String** | Describes the uniqueness and cardinality of the property for entity objects under the property domain specified in Key. |  [optional] |
|**propertyDefinitionType** | [**PropertyDefinitionTypeEnum**](#PropertyDefinitionTypeEnum) | The definition type (DerivedDefinition or Definition). The available values are: ValueProperty, DerivedDefinition |  [optional] |
|**propertyDescription** | **String** | A brief description of what a property of this property definition contains. |  [optional] |
|**derivationFormula** | **String** | The rule that defines how data is composed for a derived property. |  [optional] |
|**collectionType** | **String** | Describes whether a collection property should behave as a set or as an array. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Set of unique property definition properties and associated values to store with the property definition. Each property must be from the &#39;PropertyDefinition&#39; domain. |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  |  [optional] |
|**isFilterable** | **Boolean** | Bool indicating whether the values of this property are fitlerable, this is true for all non-derived property defintions. For a derived definition this must be set true to enable filtering. |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



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



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LABEL | &quot;Label&quot; |
| METRIC | &quot;Metric&quot; |
| INFORMATION | &quot;Information&quot; |



## Enum: UnitSchemaEnum

| Name | Value |
|---- | -----|
| NOUNITS | &quot;NoUnits&quot; |
| BASIC | &quot;Basic&quot; |
| ISO4217CURRENCY | &quot;Iso4217Currency&quot; |



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
| FUND | &quot;Fund&quot; |
| FUNDCONFIGURATION | &quot;FundConfiguration&quot; |
| FEE | &quot;Fee&quot; |
| RECONCILIATION | &quot;Reconciliation&quot; |
| PROPERTYDEFINITION | &quot;PropertyDefinition&quot; |
| COMPLIANCE | &quot;Compliance&quot; |
| DIARYENTRY | &quot;DiaryEntry&quot; |
| LEG | &quot;Leg&quot; |
| DERIVEDVALUATION | &quot;DerivedValuation&quot; |
| TIMELINE | &quot;Timeline&quot; |
| ADDRESSKEYDEFINITION | &quot;AddressKeyDefinition&quot; |
| AMORTISATIONRULESET | &quot;AmortisationRuleSet&quot; |
| ANALYTICSSETINVENTORY | &quot;AnalyticsSetInventory&quot; |
| ATOMUNITRESULT | &quot;AtomUnitResult&quot; |
| CLEARDOWNMODULE | &quot;CleardownModule&quot; |
| COMPLEXMARKETDATA | &quot;ComplexMarketData&quot; |
| COMPLIANCERUNSUMMARY | &quot;ComplianceRunSummary&quot; |
| COMPLIANCERULE | &quot;ComplianceRule&quot; |
| COMPLIANCERUNINFO | &quot;ComplianceRunInfo&quot; |
| CORPORATEACTIONSOURCE | &quot;CorporateActionSource&quot; |
| COUNTERPARTYAGREEMENT | &quot;CounterpartyAgreement&quot; |
| CUSTOMENTITYDEFINITION | &quot;CustomEntityDefinition&quot; |
| DATATYPE | &quot;DataType&quot; |
| DIALECT | &quot;Dialect&quot; |
| EVENTHANDLER | &quot;EventHandler&quot; |
| GENERALLEDGERPROFILE | &quot;GeneralLedgerProfile&quot; |
| POSTINGMODULE | &quot;PostingModule&quot; |
| QUOTE | &quot;Quote&quot; |
| RECIPECOMPOSER | &quot;RecipeComposer&quot; |
| RECONCILIATIONRUNBREAK | &quot;ReconciliationRunBreak&quot; |
| REFERENCELIST | &quot;ReferenceList&quot; |
| RELATIONDEFINITION | &quot;RelationDefinition&quot; |
| RETURNBLOCKINDEX | &quot;ReturnBlockIndex&quot; |
| SRSDOCUMENT | &quot;SRSDocument&quot; |
| SRSINDEX | &quot;SRSIndex&quot; |
| TRANSACTIONTEMPLATE | &quot;TransactionTemplate&quot; |
| TRANSACTIONTEMPLATESCOPE | &quot;TransactionTemplateScope&quot; |
| TRANSACTIONTYPE | &quot;TransactionType&quot; |
| TRANSACTIONTYPECONFIG | &quot;TransactionTypeConfig&quot; |
| TRANSLATIONSCRIPT | &quot;TranslationScript&quot; |
| TASKDEFINITION | &quot;TaskDefinition&quot; |
| TASKINSTANCE | &quot;TaskInstance&quot; |
| WORKER | &quot;Worker&quot; |
| STAGINGRULESET | &quot;StagingRuleSet&quot; |



## Enum: LifeTimeEnum

| Name | Value |
|---- | -----|
| PERPETUAL | &quot;Perpetual&quot; |
| TIMEVARIANT | &quot;TimeVariant&quot; |



## Enum: PropertyDefinitionTypeEnum

| Name | Value |
|---- | -----|
| VALUEPROPERTY | &quot;ValueProperty&quot; |
| DERIVEDDEFINITION | &quot;DerivedDefinition&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


