

# CreateDerivedTransactionPortfolioRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** |  | 
**description** | **String** |  |  [optional]
**code** | **String** |  | 
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) | The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst |  [optional]
**subHoldingKeys** | **List&lt;String&gt;** |  |  [optional]



## Enum: AccountingMethodEnum

Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
AVERAGECOST | &quot;AverageCost&quot;
FIRSTINFIRSTOUT | &quot;FirstInFirstOut&quot;
LASTINFIRSTOUT | &quot;LastInFirstOut&quot;
HIGHESTCOSTFIRST | &quot;HighestCostFirst&quot;
LOWESTCOSTFIRST | &quot;LowestCostFirst&quot;



