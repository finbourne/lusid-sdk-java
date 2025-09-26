# com.finbourne.lusid.model.Portfolio
A portfolio of a particular type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**type** | **String** | The type of the portfolio. The available values are: Transaction, Reference, DerivedTransaction, SimplePosition | [default to String]
**displayName** | **String** | The name of the portfolio. | [default to String]
**description** | **String** | The long form description of the portfolio. | [optional] [default to String]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the portfolio was created. No transactions or constituents can be added to the portfolio before this date. | [default to OffsetDateTime]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**isDerived** | **Boolean** | Whether or not this is a derived portfolio. | [optional] [default to Boolean]
**baseCurrency** | **String** | The base currency of the portfolio. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The requested portfolio properties. These will be from the &#39;Portfolio&#39; domain. | [optional] [default to Map<String, Property>]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the portfolio. | [optional] [default to List<Relationship>]
**instrumentScopes** | **List&lt;String&gt;** | The instrument scope resolution strategy of this portfolio. | [optional] [default to List<String>]
**accountingMethod** | **String** | . The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency | [optional] [default to String]
**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. The available values are: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate | [optional] [default to String]
**transactionTypeScope** | **String** | The scope of the transaction types. | [optional] [default to String]
**cashGainLossCalculationDate** | **String** | The scope of the transaction types. | [optional] [default to String]
**instrumentEventConfiguration** | [**InstrumentEventConfiguration**](InstrumentEventConfiguration.md) |  | [optional] [default to InstrumentEventConfiguration]
**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**taxRuleSetScope** | **String** | The scope of the tax rule sets for this portfolio. | [optional] [default to String]
**settlementConfiguration** | [**PortfolioSettlementConfiguration**](PortfolioSettlementConfiguration.md) |  | [optional] [default to PortfolioSettlementConfiguration]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Portfolio;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
String Type = "example Type";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
OffsetDateTime Created = OffsetDateTime.now();
ResourceId ParentPortfolioId = new ResourceId();
Version Version = new Version();
StagedModificationsInfo StagedModifications = new StagedModificationsInfo();
Boolean IsDerived = true;
@jakarta.annotation.Nullable String BaseCurrency = "example BaseCurrency";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<Relationship> Relationships = new List<Relationship>();
@jakarta.annotation.Nullable List<String> InstrumentScopes = new List<String>();
String AccountingMethod = "example AccountingMethod";
@jakarta.annotation.Nullable String AmortisationMethod = "example AmortisationMethod";
@jakarta.annotation.Nullable String TransactionTypeScope = "example TransactionTypeScope";
@jakarta.annotation.Nullable String CashGainLossCalculationDate = "example CashGainLossCalculationDate";
InstrumentEventConfiguration InstrumentEventConfiguration = new InstrumentEventConfiguration();
ResourceId AmortisationRuleSetId = new ResourceId();
@jakarta.annotation.Nullable String TaxRuleSetScope = "example TaxRuleSetScope";
PortfolioSettlementConfiguration SettlementConfiguration = new PortfolioSettlementConfiguration();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Portfolio portfolioInstance = new Portfolio()
    .Href(Href)
    .Id(Id)
    .Type(Type)
    .DisplayName(DisplayName)
    .Description(Description)
    .Created(Created)
    .ParentPortfolioId(ParentPortfolioId)
    .Version(Version)
    .StagedModifications(StagedModifications)
    .IsDerived(IsDerived)
    .BaseCurrency(BaseCurrency)
    .Properties(Properties)
    .Relationships(Relationships)
    .InstrumentScopes(InstrumentScopes)
    .AccountingMethod(AccountingMethod)
    .AmortisationMethod(AmortisationMethod)
    .TransactionTypeScope(TransactionTypeScope)
    .CashGainLossCalculationDate(CashGainLossCalculationDate)
    .InstrumentEventConfiguration(InstrumentEventConfiguration)
    .AmortisationRuleSetId(AmortisationRuleSetId)
    .TaxRuleSetScope(TaxRuleSetScope)
    .SettlementConfiguration(SettlementConfiguration)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
