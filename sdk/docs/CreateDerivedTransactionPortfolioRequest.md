# com.finbourne.lusid.model.CreateDerivedTransactionPortfolioRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the derived transaction portfolio. | [default to String]
**description** | **String** | A description for the derived transaction portfolio. | [optional] [default to String]
**code** | **String** | The code of the derived transaction portfolio. Together with the scope this uniquely identifies the derived transaction portfolio. | [default to String]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | This will be auto-populated to be the parent portfolio creation date. | [optional] [default to OffsetDateTime]
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**accountingMethod** | **String** | . The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency | [optional] [default to String]
**subHoldingKeys** | **List&lt;String&gt;** | A set of unique transaction properties to group the derived transaction portfolio&#39;s holdings by, perhaps for strategy tagging. Each property must be from the &#39;Transaction&#39; domain and identified by a key in the format {domain}/{scope}/{code}, for example &#39;Transaction/strategies/quantsignal&#39;. See https://support.lusid.com/knowledgebase/article/KA-01879/en-us for more information. | [optional] [default to List<String>]
**instrumentScopes** | **List&lt;String&gt;** | The resolution strategy used to resolve instruments of transactions/holdings upserted to this derived portfolio. | [optional] [default to List<String>]
**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. The available values are: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate | [optional] [default to String]
**transactionTypeScope** | **String** | The scope of the transaction types. | [optional] [default to String]
**cashGainLossCalculationDate** | **String** | The option when the Cash Gain Loss to be calulated, TransactionDate/SettlementDate. Defaults to SettlementDate. | [optional] [default to String]
**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentEventConfiguration** | [**InstrumentEventConfiguration**](InstrumentEventConfiguration.md) |  | [optional] [default to InstrumentEventConfiguration]
**settlementConfiguration** | [**PortfolioSettlementConfiguration**](PortfolioSettlementConfiguration.md) |  | [optional] [default to PortfolioSettlementConfiguration]

```java
import com.finbourne.lusid.model.CreateDerivedTransactionPortfolioRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Code = "example Code";
ResourceId ParentPortfolioId = new ResourceId();
@jakarta.annotation.Nullable OffsetDateTime Created = OffsetDateTime.now();
ResourceId CorporateActionSourceId = new ResourceId();
String AccountingMethod = "example AccountingMethod";
@jakarta.annotation.Nullable List<String> SubHoldingKeys = new List<String>();
@jakarta.annotation.Nullable List<String> InstrumentScopes = new List<String>();
@jakarta.annotation.Nullable String AmortisationMethod = "example AmortisationMethod";
@jakarta.annotation.Nullable String TransactionTypeScope = "example TransactionTypeScope";
@jakarta.annotation.Nullable String CashGainLossCalculationDate = "example CashGainLossCalculationDate";
ResourceId AmortisationRuleSetId = new ResourceId();
InstrumentEventConfiguration InstrumentEventConfiguration = new InstrumentEventConfiguration();
PortfolioSettlementConfiguration SettlementConfiguration = new PortfolioSettlementConfiguration();


CreateDerivedTransactionPortfolioRequest createDerivedTransactionPortfolioRequestInstance = new CreateDerivedTransactionPortfolioRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .Code(Code)
    .ParentPortfolioId(ParentPortfolioId)
    .Created(Created)
    .CorporateActionSourceId(CorporateActionSourceId)
    .AccountingMethod(AccountingMethod)
    .SubHoldingKeys(SubHoldingKeys)
    .InstrumentScopes(InstrumentScopes)
    .AmortisationMethod(AmortisationMethod)
    .TransactionTypeScope(TransactionTypeScope)
    .CashGainLossCalculationDate(CashGainLossCalculationDate)
    .AmortisationRuleSetId(AmortisationRuleSetId)
    .InstrumentEventConfiguration(InstrumentEventConfiguration)
    .SettlementConfiguration(SettlementConfiguration);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
