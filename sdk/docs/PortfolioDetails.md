

# PortfolioDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**originPortfolioId** | [**ResourceId**](ResourceId.md) |  |  |
|**version** | [**Version**](Version.md) |  |  |
|**baseCurrency** | **String** | The base currency of the transaction portfolio. |  |
|**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**subHoldingKeys** | **List&lt;String&gt;** |  |  [optional] |
|**instrumentScopes** | **List&lt;String&gt;** | The resolution strategy used to resolve instruments of transactions/holdings upserted to the transaction portfolio. |  [optional] |
|**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) | . The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency |  [optional] |
|**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. The available values are: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate |  [optional] |
|**transactionTypeScope** | **String** | The scope of the transaction types. |  [optional] |
|**cashGainLossCalculationDate** | **String** | The option when the Cash Gain Loss to be calulated, TransactionDate/SettlementDate. Defaults to SettlementDate. |  [optional] |
|**instrumentEventConfiguration** | [**InstrumentEventConfiguration**](InstrumentEventConfiguration.md) |  |  [optional] |
|**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



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


