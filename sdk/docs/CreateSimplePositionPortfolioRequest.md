

# CreateSimplePositionPortfolioRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | The name of the simple position portfolio. |  |
|**description** | **String** | A description for the simple position portfolio. |  [optional] |
|**code** | **String** | The code of the simple position portfolio. Together with the scope this uniquely identifies the simple position portfolio. |  |
|**created** | **OffsetDateTime** | The effective datetime at which to create the simple position portfolio. No holdings can be set on the simple position portfolio before this date. Defaults to the current LUSID system datetime if not specified. |  [optional] |
|**baseCurrency** | **String** | The base currency of the simple position portfolio in ISO 4217 currency code format. |  |
|**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) | . The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency |  [optional] |
|**subHoldingKeys** | **List&lt;String&gt;** | A set of unique transaction properties to group the simple position portfolio&#39;s holdings by, perhaps for strategy tagging. Each property must be from the &#39;Transaction&#39; domain and identified by a key in the format {domain}/{scope}/{code}, for example &#39;Transaction/strategies/quantsignal&#39;. See https://support.lusid.com/knowledgebase/article/KA-01879/en-us for more information. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of unique portfolio properties to add custom data to the simple position portfolio. Each property must be from the &#39;Portfolio&#39; domain and identified by a key in the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. Note these properties must be pre-defined. |  [optional] |
|**instrumentScopes** | **List&lt;String&gt;** | The resolution strategy used to resolve instruments of holdings upserted to this portfolio. |  [optional] |
|**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. The available values are: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate |  [optional] |
|**transactionTypeScope** | **String** | The scope of the transaction types. |  [optional] |
|**cashGainLossCalculationDate** | **String** | The option when the Cash Gain Loss to be calulated, TransactionDate/SettlementDate. Defaults to SettlementDate. |  [optional] |
|**instrumentEventConfiguration** | [**InstrumentEventConfiguration**](InstrumentEventConfiguration.md) |  |  [optional] |
|**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  |  [optional] |



## Enum: AccountingMethodEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;Default&quot; |
| AVERAGECOST | &quot;AverageCost&quot; |
| FIRSTINFIRSTOUT | &quot;FirstInFirstOut&quot; |
| LASTINFIRSTOUT | &quot;LastInFirstOut&quot; |
| HIGHESTCOSTFIRST | &quot;HighestCostFirst&quot; |
| LOWESTCOSTFIRST | &quot;LowestCostFirst&quot; |
| PRORATEBYUNITS | &quot;ProRateByUnits&quot; |
| PRORATEBYCOST | &quot;ProRateByCost&quot; |
| PRORATEBYCOSTPORTFOLIOCURRENCY | &quot;ProRateByCostPortfolioCurrency&quot; |
| INTRADAYTHENFIRSTINFIRSTOUT | &quot;IntraDayThenFirstInFirstOut&quot; |
| LONGTERMHIGHESTCOSTFIRST | &quot;LongTermHighestCostFirst&quot; |
| LONGTERMHIGHESTCOSTFIRSTPORTFOLIOCURRENCY | &quot;LongTermHighestCostFirstPortfolioCurrency&quot; |
| HIGHESTCOSTFIRSTPORTFOLIOCURRENCY | &quot;HighestCostFirstPortfolioCurrency&quot; |
| LOWESTCOSTFIRSTPORTFOLIOCURRENCY | &quot;LowestCostFirstPortfolioCurrency&quot; |
| MAXIMUMLOSSMINIMUMGAIN | &quot;MaximumLossMinimumGain&quot; |
| MAXIMUMLOSSMINIMUMGAINPORTFOLIOCURRENCY | &quot;MaximumLossMinimumGainPortfolioCurrency&quot; |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


