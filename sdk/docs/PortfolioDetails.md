# com.finbourne.lusid.model.PortfolioDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**originPortfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**version** | [**Version**](Version.md) |  | [default to Version]
**baseCurrency** | **String** | The base currency of the transaction portfolio. | [default to String]
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**subHoldingKeys** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**instrumentScopes** | **List&lt;String&gt;** | The resolution strategy used to resolve instruments of transactions/holdings upserted to the transaction portfolio. | [optional] [default to List<String>]
**accountingMethod** | **String** | . The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency | [optional] [default to String]
**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. The available values are: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate | [optional] [default to String]
**transactionTypeScope** | **String** | The scope of the transaction types. | [optional] [default to String]
**cashGainLossCalculationDate** | **String** | The option when the Cash Gain Loss to be calulated, TransactionDate/SettlementDate. Defaults to SettlementDate. | [optional] [default to String]
**instrumentEventConfiguration** | [**InstrumentEventConfiguration**](InstrumentEventConfiguration.md) |  | [optional] [default to InstrumentEventConfiguration]
**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**taxRuleSetScope** | **String** | The scope of the tax rule sets for this portfolio. | [optional] [default to String]
**settlementConfiguration** | [**PortfolioSettlementConfiguration**](PortfolioSettlementConfiguration.md) |  | [optional] [default to PortfolioSettlementConfiguration]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.PortfolioDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId OriginPortfolioId = new ResourceId();
Version Version = new Version();
String BaseCurrency = "example BaseCurrency";
ResourceId CorporateActionSourceId = new ResourceId();
@jakarta.annotation.Nullable List<String> SubHoldingKeys = new List<String>();
@jakarta.annotation.Nullable List<String> InstrumentScopes = new List<String>();
String AccountingMethod = "example AccountingMethod";
@jakarta.annotation.Nullable String AmortisationMethod = "example AmortisationMethod";
@jakarta.annotation.Nullable String TransactionTypeScope = "example TransactionTypeScope";
@jakarta.annotation.Nullable String CashGainLossCalculationDate = "example CashGainLossCalculationDate";
InstrumentEventConfiguration InstrumentEventConfiguration = new InstrumentEventConfiguration();
ResourceId AmortisationRuleSetId = new ResourceId();
@jakarta.annotation.Nullable String TaxRuleSetScope = "example TaxRuleSetScope";
PortfolioSettlementConfiguration SettlementConfiguration = new PortfolioSettlementConfiguration();
StagedModificationsInfo StagedModifications = new StagedModificationsInfo();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PortfolioDetails portfolioDetailsInstance = new PortfolioDetails()
    .Href(Href)
    .OriginPortfolioId(OriginPortfolioId)
    .Version(Version)
    .BaseCurrency(BaseCurrency)
    .CorporateActionSourceId(CorporateActionSourceId)
    .SubHoldingKeys(SubHoldingKeys)
    .InstrumentScopes(InstrumentScopes)
    .AccountingMethod(AccountingMethod)
    .AmortisationMethod(AmortisationMethod)
    .TransactionTypeScope(TransactionTypeScope)
    .CashGainLossCalculationDate(CashGainLossCalculationDate)
    .InstrumentEventConfiguration(InstrumentEventConfiguration)
    .AmortisationRuleSetId(AmortisationRuleSetId)
    .TaxRuleSetScope(TaxRuleSetScope)
    .SettlementConfiguration(SettlementConfiguration)
    .StagedModifications(StagedModifications)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
