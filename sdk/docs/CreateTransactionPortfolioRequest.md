# com.finbourne.lusid.model.CreateTransactionPortfolioRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the transaction portfolio. | [default to String]
**description** | **String** | A description for the transaction portfolio. | [optional] [default to String]
**code** | **String** | The code of the transaction portfolio. Together with the scope this uniquely identifies the transaction portfolio. | [default to String]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which to create the transaction portfolio. No transactions can be added to the transaction portfolio before this date. Defaults to the current LUSID system datetime if not specified. | [optional] [default to OffsetDateTime]
**baseCurrency** | **String** | The base currency of the transaction portfolio in ISO 4217 currency code format. | [default to String]
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**accountingMethod** | **String** | . The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency | [optional] [default to String]
**subHoldingKeys** | **List&lt;String&gt;** | A set of unique transaction properties to group the transaction portfolio&#39;s holdings by, perhaps for strategy tagging. Each property must be from the &#39;Transaction&#39; domain and identified by a key in the format {domain}/{scope}/{code}, for example &#39;Transaction/strategies/quantsignal&#39;. See https://support.lusid.com/knowledgebase/article/KA-01879/en-us for more information. | [optional] [default to List<String>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of unique portfolio properties to add custom data to the transaction portfolio. Each property must be from the &#39;Portfolio&#39; domain and identified by a key in the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. Note these properties must be pre-defined. | [optional] [default to Map<String, Property>]
**instrumentScopes** | **List&lt;String&gt;** | The resolution strategy used to resolve instruments of transactions/holdings upserted to this portfolio. | [optional] [default to List<String>]
**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. The available values are: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate | [optional] [default to String]
**transactionTypeScope** | **String** | The scope of the transaction types. | [optional] [default to String]
**cashGainLossCalculationDate** | **String** | The option when the Cash Gain Loss to be calulated, TransactionDate/SettlementDate. Defaults to SettlementDate. | [optional] [default to String]
**instrumentEventConfiguration** | [**InstrumentEventConfiguration**](InstrumentEventConfiguration.md) |  | [optional] [default to InstrumentEventConfiguration]
**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**taxRuleSetScope** | **String** | The scope of the tax rule sets for this portfolio. | [optional] [default to String]
**settlementConfiguration** | [**PortfolioSettlementConfiguration**](PortfolioSettlementConfiguration.md) |  | [optional] [default to PortfolioSettlementConfiguration]

```java
import com.finbourne.lusid.model.CreateTransactionPortfolioRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Code = "example Code";
@jakarta.annotation.Nullable OffsetDateTime Created = OffsetDateTime.now();
String BaseCurrency = "example BaseCurrency";
ResourceId CorporateActionSourceId = new ResourceId();
String AccountingMethod = "example AccountingMethod";
@jakarta.annotation.Nullable List<String> SubHoldingKeys = new List<String>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<String> InstrumentScopes = new List<String>();
@jakarta.annotation.Nullable String AmortisationMethod = "example AmortisationMethod";
@jakarta.annotation.Nullable String TransactionTypeScope = "example TransactionTypeScope";
@jakarta.annotation.Nullable String CashGainLossCalculationDate = "example CashGainLossCalculationDate";
InstrumentEventConfiguration InstrumentEventConfiguration = new InstrumentEventConfiguration();
ResourceId AmortisationRuleSetId = new ResourceId();
@jakarta.annotation.Nullable String TaxRuleSetScope = "example TaxRuleSetScope";
PortfolioSettlementConfiguration SettlementConfiguration = new PortfolioSettlementConfiguration();


CreateTransactionPortfolioRequest createTransactionPortfolioRequestInstance = new CreateTransactionPortfolioRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .Code(Code)
    .Created(Created)
    .BaseCurrency(BaseCurrency)
    .CorporateActionSourceId(CorporateActionSourceId)
    .AccountingMethod(AccountingMethod)
    .SubHoldingKeys(SubHoldingKeys)
    .Properties(Properties)
    .InstrumentScopes(InstrumentScopes)
    .AmortisationMethod(AmortisationMethod)
    .TransactionTypeScope(TransactionTypeScope)
    .CashGainLossCalculationDate(CashGainLossCalculationDate)
    .InstrumentEventConfiguration(InstrumentEventConfiguration)
    .AmortisationRuleSetId(AmortisationRuleSetId)
    .TaxRuleSetScope(TaxRuleSetScope)
    .SettlementConfiguration(SettlementConfiguration);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
