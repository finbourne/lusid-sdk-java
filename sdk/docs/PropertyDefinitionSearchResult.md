# com.finbourne.lusid.model.PropertyDefinitionSearchResult
A property definition search result

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**key** | **String** | The property key which uniquely identifies the property. The format for the property key is {domain}/{scope}/{code}, e.g. &#39;Portfolio/Manager/Id&#39;. | [optional] [default to String]
**valueType** | **String** | The type of values that can be associated with this property. This is defined by the property&#39;s data type. The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel, UnindexedText | [optional] [default to String]
**displayName** | **String** | The display name of the property. | [optional] [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**type** | **String** | The type of the property. The available values are: Label, Metric, Information | [optional] [default to String]
**unitSchema** | **String** | The units that can be associated with the property&#39;s values. This is defined by the property&#39;s data type. The available values are: NoUnits, Basic, Iso4217Currency | [optional] [default to String]
**domain** | **String** | The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, InvestorRecord, InvestmentAccount, Placement, Execution, Block, Participation, Package, OrderInstruction, NextBestAction, CustomEntity, InstrumentEvent, Account, ChartOfAccounts, CustodianAccount, CheckDefinition, Abor, AborConfiguration, Fund, FundConfiguration, Fee, Reconciliation, PropertyDefinition, Compliance, DiaryEntry, Leg, DerivedValuation, Timeline, ClosedPeriod, AddressKeyDefinition, AmortisationRuleSet, AnalyticsSetInventory, AtomUnitResult, CleardownModule, ComplexMarketData, ComplianceRunSummary, ComplianceRule, ComplianceRunInfo, CorporateActionSource, CounterpartyAgreement, CustomEntityDefinition, DataType, Dialect, EventHandler, GeneralLedgerProfile, PostingModule, Quote, RecipeComposer, ReconciliationRunBreak, ReferenceList, RelationDefinition, ReturnBlockIndex, SRSDocument, SRSIndex, TransactionTemplate, TransactionTemplateScope, TransactionType, TransactionTypeConfig, TranslationScript, TaskDefinition, TaskInstance, Worker, StagingRuleSet, IdentifierDefinition | [optional] [default to String]
**scope** | **String** | The scope that the property exists in. | [optional] [readonly] [default to String]
**code** | **String** | The code of the property. Together with the domain and scope this uniquely identifies the property. | [optional] [readonly] [default to String]
**valueRequired** | **Boolean** | This field is not implemented and should be disregarded. | [optional] [default to Boolean]
**lifeTime** | **String** | Describes how the property&#39;s values can change over time. The available values are: Perpetual, TimeVariant | [optional] [default to String]
**constraintStyle** | **String** | Describes the uniqueness and cardinality of the property for entity objects under the property domain specified in Key. | [optional] [default to String]
**propertyDefinitionType** | **String** | The definition type (DerivedDefinition or Definition). The available values are: ValueProperty, DerivedDefinition | [optional] [default to String]
**propertyDescription** | **String** | A brief description of what a property of this property definition contains. | [optional] [default to String]
**derivationFormula** | **String** | The rule that defines how data is composed for a derived property. | [optional] [default to String]
**isFilterable** | **Boolean** | Bool indicating whether the values of this property are fitlerable, this is true for all non-derived property defintions. For a derived definition this must be set true to enable filtering. | [optional] [default to Boolean]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.PropertyDefinitionSearchResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String Key = "example Key";
String ValueType = "example ValueType";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
ResourceId DataTypeId = new ResourceId();
String Type = "example Type";
String UnitSchema = "example UnitSchema";
String Domain = "example Domain";
@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable String Code = "example Code";
Boolean ValueRequired = true;
String LifeTime = "example LifeTime";
@jakarta.annotation.Nullable String ConstraintStyle = "example ConstraintStyle";
String PropertyDefinitionType = "example PropertyDefinitionType";
@jakarta.annotation.Nullable String PropertyDescription = "example PropertyDescription";
@jakarta.annotation.Nullable String DerivationFormula = "example DerivationFormula";
Boolean IsFilterable = true;
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PropertyDefinitionSearchResult propertyDefinitionSearchResultInstance = new PropertyDefinitionSearchResult()
    .Href(Href)
    .Key(Key)
    .ValueType(ValueType)
    .DisplayName(DisplayName)
    .DataTypeId(DataTypeId)
    .Type(Type)
    .UnitSchema(UnitSchema)
    .Domain(Domain)
    .Scope(Scope)
    .Code(Code)
    .ValueRequired(ValueRequired)
    .LifeTime(LifeTime)
    .ConstraintStyle(ConstraintStyle)
    .PropertyDefinitionType(PropertyDefinitionType)
    .PropertyDescription(PropertyDescription)
    .DerivationFormula(DerivationFormula)
    .IsFilterable(IsFilterable)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
