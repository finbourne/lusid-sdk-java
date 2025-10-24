# com.finbourne.lusid.model.CreateDerivedPropertyDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **String** | The domain that the property exists in. Not all available values are currently supported, please check the documentation: https://support.lusid.com/knowledgebase/article/KA-01719/. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, InvestorRecord, InvestmentAccount, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, CheckDefinition, Abor, AborConfiguration, Fund, FundConfiguration, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, AddressKeyDefinition, AmortisationRuleSet, AnalyticsSetInventory, AtomUnitResult, CleardownModule, ComplexMarketData, ComplianceRunSummary, ComplianceRule, ComplianceRunInfo, CorporateActionSource, CounterpartyAgreement, CustomEntityDefinition, DataType, Dialect, EventHandler, GeneralLedgerProfile, PostingModule, Quote, RecipeComposer, ReconciliationRunBreak, ReferenceList, RelationDefinition, ReturnBlockIndex, SRSDocument, SRSIndex, TransactionTemplate, TransactionTemplateScope, TransactionType, TransactionTypeConfig, TranslationScript, TaskDefinition, TaskInstance, Worker, StagingRuleSet, IdentifierDefinition, SettlementInstruction | [default to String]
**scope** | **String** | The scope that the property exists in. | [default to String]
**code** | **String** | The code of the property. Together with the domain and scope this uniquely identifies the property. | [default to String]
**displayName** | **String** | The display name of the property. | [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**propertyDescription** | **String** | Describes the property | [optional] [default to String]
**derivationFormula** | **String** | The rule that defines how data is composed for a derived property. | [default to String]
**isFilterable** | **Boolean** | Bool indicating whether the values of this property are fitlerable, this is true for all non-derived property defintions. For a derived definition this must be set true to enable filtering. | [default to Boolean]

```java
import com.finbourne.lusid.model.CreateDerivedPropertyDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Domain = "example Domain";
String Scope = "example Scope";
String Code = "example Code";
String DisplayName = "example DisplayName";
ResourceId DataTypeId = new ResourceId();
@jakarta.annotation.Nullable String PropertyDescription = "example PropertyDescription";
String DerivationFormula = "example DerivationFormula";
Boolean IsFilterable = true;


CreateDerivedPropertyDefinitionRequest createDerivedPropertyDefinitionRequestInstance = new CreateDerivedPropertyDefinitionRequest()
    .Domain(Domain)
    .Scope(Scope)
    .Code(Code)
    .DisplayName(DisplayName)
    .DataTypeId(DataTypeId)
    .PropertyDescription(PropertyDescription)
    .DerivationFormula(DerivationFormula)
    .IsFilterable(IsFilterable);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
