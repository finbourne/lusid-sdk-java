

# CreateIdentifierDefinitionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | [**DomainEnum**](#DomainEnum) | The type of entity to which the identifier can be attached. Supported values are \&quot;Instrument\&quot;, \&quot;Person\&quot;, \&quot;LegalEntity\&quot;and \&quot;CustomEntity\&quot;. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, InvestorRecord, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, Abor, AborConfiguration, Fund, FundConfiguration, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, AddressKeyDefinition, AmortisationRuleSet, AnalyticsSetInventory, AtomUnitResult, CleardownModule, ComplexMarketData, ComplianceRunSummary, ComplianceRule, ComplianceRunInfo, CorporateActionSource, CounterpartyAgreement, CustomEntityDefinition, DataType, Dialect, EventHandler, GeneralLedgerProfile, PostingModule, Quote, RecipeComposer, ReconciliationRunBreak, ReferenceList, RelationDefinition, ReturnBlockIndex, SRSDocument, SRSIndex, TransactionTemplate, TransactionTemplateScope, TransactionType, TransactionTypeConfig, TranslationScript, TaskDefinition, TaskInstance, Worker, StagingRuleSet, IdentifierDefinition |  |
|**identifierScope** | **String** | The scope that the identifier definition exists in. |  |
|**identifierType** | **String** | What the identifier represents. Together with \&quot;domain\&quot; and \&quot;identifierScope\&quot; this uniquely identifies the identifier definition. |  |
|**lifeTime** | [**LifeTimeEnum**](#LifeTimeEnum) | Describes whether an identifier value is associated with an entity for all effective dates (“Perpetual”) or applies within a specified effective date range (“TimeVariant”). The available values are: Perpetual, TimeVariant |  |
|**hierarchyUsage** | **String** | Nullable, defaults to \&quot;MasterIdentifier\&quot; if no value provided. \&quot;MasterIdentifier\&quot; (aka unique) An entity can have one value for this identifier definition on a given effective date. A value for this identifier definition can only be associated with one entity (in a given scope) on a given effective date. \&quot;ParentIdentifier\&quot; (aka non-unique) An entity can have one value for this identifier definition on a given effective date. A value for this identifier definition can be associated with many entities (in a given scope) on a given effective date. |  [optional] |
|**hierarchyLevel** | **String** | Optional metadata associated with the identifier definition. |  [optional] |
|**displayName** | **String** | A display name for the identifier. E.g. Figi. |  [optional] |
|**description** | **String** | An optional description for the identifier. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the identifier definition. |  [optional] |



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


