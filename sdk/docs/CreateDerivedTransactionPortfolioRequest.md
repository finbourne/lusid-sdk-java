

# CreateDerivedTransactionPortfolioRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | The name of the derived transaction portfolio. |  |
|**description** | **String** | A description for the derived transaction portfolio. |  [optional] |
|**code** | **String** | The code of the derived transaction portfolio. Together with the scope this uniquely identifies the derived transaction portfolio. |  |
|**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  |  |
|**created** | **OffsetDateTime** | This will be auto-populated to be the parent portfolio creation date. |  [optional] |
|**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) | . The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst |  [optional] |
|**subHoldingKeys** | **List&lt;String&gt;** | A set of unique transaction properties to group the derived transaction portfolio&#39;s holdings by, perhaps for strategy tagging. Each property must be from the &#39;Transaction&#39; domain and identified by a key in the format {domain}/{scope}/{code}, for example &#39;Transaction/strategies/quantsignal&#39;. See https://support.lusid.com/knowledgebase/article/KA-01879/en-us for more information. |  [optional] |
|**instrumentScopes** | **List&lt;String&gt;** | The resolution strategy used to resolve instruments of transactions/holdings upserted to this derived portfolio. |  [optional] |
|**amortisationMethod** | **String** | The amortisation method used by the portfolio for the calculation. The available values are: NoAmortisation, StraightLine, EffectiveYield, StraightLineSettlementDate, EffectiveYieldSettlementDate |  [optional] |
|**transactionTypeScope** | **String** | The scope of the transaction types. |  [optional] |
|**cashGainLossCalculationDate** | **String** | The option when the Cash Gain Loss to be calulated, TransactionDate/SettlementDate. Defaults to SettlementDate. |  [optional] |



## Enum: AccountingMethodEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;Default&quot; |
| AVERAGECOST | &quot;AverageCost&quot; |
| FIRSTINFIRSTOUT | &quot;FirstInFirstOut&quot; |
| LASTINFIRSTOUT | &quot;LastInFirstOut&quot; |
| HIGHESTCOSTFIRST | &quot;HighestCostFirst&quot; |
| LOWESTCOSTFIRST | &quot;LowestCostFirst&quot; |



