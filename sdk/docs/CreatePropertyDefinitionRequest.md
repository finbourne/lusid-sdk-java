

# CreatePropertyDefinitionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | [**DomainEnum**](#DomainEnum) | The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, InvestorRecord, InvestmentAccount, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, Abor, AborConfiguration, Fund, FundConfiguration, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, AddressKeyDefinition, AmortisationRuleSet, AnalyticsSetInventory, AtomUnitResult, CleardownModule, ComplexMarketData, ComplianceRunSummary, ComplianceRule, ComplianceRunInfo, CorporateActionSource, CounterpartyAgreement, CustomEntityDefinition, DataType, Dialect, EventHandler, GeneralLedgerProfile, PostingModule, Quote, RecipeComposer, ReconciliationRunBreak, ReferenceList, RelationDefinition, ReturnBlockIndex, SRSDocument, SRSIndex, TransactionTemplate, TransactionTemplateScope, TransactionType, TransactionTypeConfig, TranslationScript, TaskDefinition, TaskInstance, Worker, StagingRuleSet, IdentifierDefinition |  |
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
| INVESTORRECORD | &quot;InvestorRecord&quot; |
| INVESTMENTACCOUNT | &quot;InvestmentAccount&quot; |
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
| CLOSEDPERIOD | &quot;ClosedPeriod&quot; |
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
| IDENTIFIERDEFINITION | &quot;IdentifierDefinition&quot; |



## Enum: LifeTimeEnum

| Name | Value |
|---- | -----|
| PERPETUAL | &quot;Perpetual&quot; |
| TIMEVARIANT | &quot;TimeVariant&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


