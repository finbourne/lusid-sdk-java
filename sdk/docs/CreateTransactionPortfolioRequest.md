

# CreateTransactionPortfolioRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name of the transaction portfolio. | 
**description** | **String** | A long form description of the transaction portfolio. |  [optional]
**code** | **String** | The code that the transaction portfolio will be created with. Together with the scope this uniquely identifies the transaction portfolio. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the transaction portfolio will be created. No transactions can be added to the transaction portfolio before this date. Defaults to the current LUSID system datetime if not specified. |  [optional]
**baseCurrency** | **String** | The base currency of the transaction portfolio. | 
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) | Determines the accounting treatment given to the transaction portfolio&#39;s tax lots. The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst |  [optional]
**subHoldingKeys** | **List&lt;String&gt;** | A set of unique transaction properties to group the transaction portfolio&#39;s holdings by. Each property must be from the &#39;Transaction&#39; domain and should be identified by its key which has the format {domain}/{scope}/{code}, e.g. &#39;Transaction/strategies/quantsignal&#39;. |  [optional]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of unique portfolio properties to add to the transaction portfolio. Each property must be from the &#39;Portfolio&#39; domain and should be identified by its key which has the format {domain}/{scope}/{code}, e.g. &#39;Portfolio/Manager/Id&#39;. These properties must be pre-defined. |  [optional]



## Enum: AccountingMethodEnum

Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
AVERAGECOST | &quot;AverageCost&quot;
FIRSTINFIRSTOUT | &quot;FirstInFirstOut&quot;
LASTINFIRSTOUT | &quot;LastInFirstOut&quot;
HIGHESTCOSTFIRST | &quot;HighestCostFirst&quot;
LOWESTCOSTFIRST | &quot;LowestCostFirst&quot;



