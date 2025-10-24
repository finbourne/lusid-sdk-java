# com.finbourne.lusid.model.CreatePropertyDefinitionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **String** | The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, InvestorRecord, InvestmentAccount, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, CheckDefinition, Abor, AborConfiguration, Fund, FundConfiguration, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, AddressKeyDefinition, AmortisationRuleSet, AnalyticsSetInventory, AtomUnitResult, CleardownModule, ComplexMarketData, ComplianceRunSummary, ComplianceRule, ComplianceRunInfo, CorporateActionSource, CounterpartyAgreement, CustomEntityDefinition, DataType, Dialect, EventHandler, GeneralLedgerProfile, PostingModule, Quote, RecipeComposer, ReconciliationRunBreak, ReferenceList, RelationDefinition, ReturnBlockIndex, SRSDocument, SRSIndex, TransactionTemplate, TransactionTemplateScope, TransactionType, TransactionTypeConfig, TranslationScript, TaskDefinition, TaskInstance, Worker, StagingRuleSet, IdentifierDefinition, SettlementInstruction | [default to String]
**scope** | **String** | The scope that the property exists in. | [default to String]
**code** | **String** | The code of the property. Together with the domain and scope this uniquely identifies the property. | [default to String]
**valueRequired** | **Boolean** | This field is not implemented and should be disregarded. | [optional] [default to Boolean]
**displayName** | **String** | The display name of the property. | [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**lifeTime** | **String** | Describes how the property&#39;s values can change over time. The available values are: Perpetual, TimeVariant | [optional] [default to String]
**constraintStyle** | **String** | Describes the uniqueness and cardinality of the property for entity objects under the property domain specified in Key. Defaults to \&quot;Property\&quot; if not specified. Valid values for this field are: Property, Collection or Identifier. | [optional] [default to String]
**propertyDescription** | **String** | Describes the property | [optional] [default to String]
**collectionType** | **String** | Describes whether a collection property should behave as a set or as an array. | [optional] [default to String]
**customEntityTypes** | **List&lt;String&gt;** | The custom entity types that properties relating to this property definition can be applied to. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.CreatePropertyDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Domain = "example Domain";
String Scope = "example Scope";
String Code = "example Code";
Boolean ValueRequired = true;
String DisplayName = "example DisplayName";
ResourceId DataTypeId = new ResourceId();
String LifeTime = "example LifeTime";
@jakarta.annotation.Nullable String ConstraintStyle = "example ConstraintStyle";
@jakarta.annotation.Nullable String PropertyDescription = "example PropertyDescription";
@jakarta.annotation.Nullable String CollectionType = "example CollectionType";
@jakarta.annotation.Nullable List<String> CustomEntityTypes = new List<String>();


CreatePropertyDefinitionRequest createPropertyDefinitionRequestInstance = new CreatePropertyDefinitionRequest()
    .Domain(Domain)
    .Scope(Scope)
    .Code(Code)
    .ValueRequired(ValueRequired)
    .DisplayName(DisplayName)
    .DataTypeId(DataTypeId)
    .LifeTime(LifeTime)
    .ConstraintStyle(ConstraintStyle)
    .PropertyDescription(PropertyDescription)
    .CollectionType(CollectionType)
    .CustomEntityTypes(CustomEntityTypes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
