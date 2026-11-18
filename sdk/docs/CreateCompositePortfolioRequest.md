# com.finbourne.lusid.model.CreateCompositePortfolioRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the composite portfolio. | [default to String]
**description** | **String** | A description for the composite portfolio. | [optional] [default to String]
**code** | **String** | The code of the composite portfolio. Together with the scope this uniquely identifies the composite portfolio. | [default to String]
**constituents** | [**List&lt;CompositePortfolioConstituentRequest&gt;**](CompositePortfolioConstituentRequest.md) | The portfolios that the composite portfolio composes. At least one is required. Each constituent contributes its whole history. | [default to List<CompositePortfolioConstituentRequest>]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The original creation date. Defaults to the earliest creation date of the constituents if not specified, because the composite portfolio cannot exist before the first of the portfolios it composes. A constituent created later contributes from its own creation date. | [optional] [default to OffsetDateTime]
**enablementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which instrument events and corporate actions are generated and applied to the composite portfolio. Transactions contribute to holdings, valuations and other computed results from the portfolio&#39;s creation date whatever the enablement date. Defaults to the portfolio&#39;s creation date if not specified. | [optional] [default to OffsetDateTime]
**baseCurrency** | **String** | The base currency of the composite portfolio. Every constituent must have the same base currency. | [default to String]
**accountingMethod** | **String** | Determines the accounting treatment given to the composite portfolio&#39;s tax lots. Default value: AverageCost. Available values: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency. | [optional] [default to String]
**subHoldingKeys** | **List&lt;String&gt;** | A set of unique transaction properties to group the composite portfolio&#39;s holdings by, perhaps for strategy tagging. Each property must be from the &#39;Transaction&#39; domain and identified by a key in the format {domain}/{scope}/{code}, for example &#39;Transaction/strategies/quantsignal&#39;. See https://support.lusid.com/docs/how-do-i-register-sub-holding-keys-shks-with-a-portfolio for more information. | [optional] [default to List<String>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties to add to the composite portfolio. Each property must be from the &#39;Portfolio&#39; domain. | [optional] [default to Map<String, Property>]
**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. Available values: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate. | [optional] [default to String]
**cashGainLossCalculationDate** | **String** | The option when the Cash Gain Loss to be calulated. Default value: SettlementDate. Available values: Default, SettlementDate, TransactionDate. | [optional] [default to String]
**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentEventConfiguration** | [**InstrumentEventConfiguration**](InstrumentEventConfiguration.md) |  | [optional] [default to InstrumentEventConfiguration]
**transactionExclusionFilter** | **String** | A filter expression that identifies transactions to exclude when building the transaction portfolio&#39;s transactions and holdings. Transactions matching this filter are flagged as excluded. | [optional] [default to String]
**taxLotSelectionCostBasis** | **String** | The cost figure that cost-referencing accounting methods evaluate when selecting tax lots for a disposal. This can be: Cost or AmortisedCost. Defaults to Cost if not specified. Supply Default to explicitly reset it; a reset or never-configured basis reads back as absent. Available values: Default, Cost, AmortisedCost. | [optional] [default to String]
**fractionalUnitsTrueUpConfiguration** | [**FractionalUnitsTrueUpConfiguration**](FractionalUnitsTrueUpConfiguration.md) |  | [optional] [default to FractionalUnitsTrueUpConfiguration]
**holdingsFungibility** | **String** | Whether the portfolio&#39;s holdings are fungible across the currencies of a currency group. This can be: Default or Enabled. Defaults to Default if not specified, which currently means holdings fungibility is not applied. Supply Default to explicitly reset it; a reset or never-configured flag reads back as absent. Available values: Default, Enabled. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CreateCompositePortfolioRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Code = "example Code";
List<CompositePortfolioConstituentRequest> Constituents = new List<CompositePortfolioConstituentRequest>();
@jakarta.annotation.Nullable OffsetDateTime Created = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EnablementDate = OffsetDateTime.now();
String BaseCurrency = "example BaseCurrency";
@jakarta.annotation.Nullable String AccountingMethod = "example AccountingMethod";
@jakarta.annotation.Nullable List<String> SubHoldingKeys = new List<String>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable String AmortisationMethod = "example AmortisationMethod";
@jakarta.annotation.Nullable String CashGainLossCalculationDate = "example CashGainLossCalculationDate";
ResourceId AmortisationRuleSetId = new ResourceId();
InstrumentEventConfiguration InstrumentEventConfiguration = new InstrumentEventConfiguration();
@jakarta.annotation.Nullable String TransactionExclusionFilter = "example TransactionExclusionFilter";
@jakarta.annotation.Nullable String TaxLotSelectionCostBasis = "example TaxLotSelectionCostBasis";
FractionalUnitsTrueUpConfiguration FractionalUnitsTrueUpConfiguration = new FractionalUnitsTrueUpConfiguration();
@jakarta.annotation.Nullable String HoldingsFungibility = "example HoldingsFungibility";


CreateCompositePortfolioRequest createCompositePortfolioRequestInstance = new CreateCompositePortfolioRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .Code(Code)
    .Constituents(Constituents)
    .Created(Created)
    .EnablementDate(EnablementDate)
    .BaseCurrency(BaseCurrency)
    .AccountingMethod(AccountingMethod)
    .SubHoldingKeys(SubHoldingKeys)
    .Properties(Properties)
    .AmortisationMethod(AmortisationMethod)
    .CashGainLossCalculationDate(CashGainLossCalculationDate)
    .AmortisationRuleSetId(AmortisationRuleSetId)
    .InstrumentEventConfiguration(InstrumentEventConfiguration)
    .TransactionExclusionFilter(TransactionExclusionFilter)
    .TaxLotSelectionCostBasis(TaxLotSelectionCostBasis)
    .FractionalUnitsTrueUpConfiguration(FractionalUnitsTrueUpConfiguration)
    .HoldingsFungibility(HoldingsFungibility);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
