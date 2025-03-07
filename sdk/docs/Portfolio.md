

# Portfolio

A list of portfolios.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional] |
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the portfolio. The available values are: Transaction, Reference, DerivedTransaction, SimplePosition |  |
|**displayName** | **String** | The name of the portfolio. |  |
|**description** | **String** | The long form description of the portfolio. |  [optional] |
|**created** | **OffsetDateTime** | The effective datetime at which the portfolio was created. No transactions or constituents can be added to the portfolio before this date. |  |
|**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**version** | [**Version**](Version.md) |  |  [optional] |
|**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  |  [optional] |
|**isDerived** | **Boolean** | Whether or not this is a derived portfolio. |  [optional] |
|**baseCurrency** | **String** | The base currency of the portfolio. |  [optional] |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The requested portfolio properties. These will be from the &#39;Portfolio&#39; domain. |  [optional] |
|**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the portfolio. |  [optional] |
|**instrumentScopes** | **List&lt;String&gt;** | The instrument scope resolution strategy of this portfolio. |  [optional] |
|**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) | . The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst, ProRateByUnits, ProRateByCost, ProRateByCostPortfolioCurrency, IntraDayThenFirstInFirstOut, LongTermHighestCostFirst, LongTermHighestCostFirstPortfolioCurrency, HighestCostFirstPortfolioCurrency, LowestCostFirstPortfolioCurrency, MaximumLossMinimumGain, MaximumLossMinimumGainPortfolioCurrency |  [optional] |
|**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. The available values are: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate |  [optional] |
|**transactionTypeScope** | **String** | The scope of the transaction types. |  [optional] |
|**cashGainLossCalculationDate** | **String** | The scope of the transaction types. |  [optional] |
|**instrumentEventConfiguration** | [**InstrumentEventConfiguration**](InstrumentEventConfiguration.md) |  |  [optional] |
|**amortisationRuleSetId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TRANSACTION | &quot;Transaction&quot; |
| REFERENCE | &quot;Reference&quot; |
| DERIVEDTRANSACTION | &quot;DerivedTransaction&quot; |
| SIMPLEPOSITION | &quot;SimplePosition&quot; |



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


