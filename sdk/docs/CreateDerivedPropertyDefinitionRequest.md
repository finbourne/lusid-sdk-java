

# CreateDerivedPropertyDefinitionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | [**DomainEnum**](#DomainEnum) | The domain that the property exists in. Not all available values are currently supported, please check the documentation: https://support.lusid.com/knowledgebase/article/KA-01719/. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, Abor, AborConfiguration, Reconciliation | 
**scope** | **String** | The scope that the property exists in. | 
**code** | **String** | The code of the property. Together with the domain and scope this uniquely identifies the property. | 
**displayName** | **String** | The display name of the property. | 
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | 
**propertyDescription** | **String** | Describes the property |  [optional]
**derivationFormula** | **String** | The rule that defines how data is composed for a derived property. | 



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
NEXTBESTACTION | &quot;NextBestAction&quot;
CUSTOMENTITY | &quot;CustomEntity&quot;
INSTRUMENTEVENT | &quot;InstrumentEvent&quot;
ACCOUNT | &quot;Account&quot;
CHARTOFACCOUNTS | &quot;ChartOfAccounts&quot;
CUSTODIANACCOUNT | &quot;CustodianAccount&quot;
ABOR | &quot;Abor&quot;
ABORCONFIGURATION | &quot;AborConfiguration&quot;
RECONCILIATION | &quot;Reconciliation&quot;



