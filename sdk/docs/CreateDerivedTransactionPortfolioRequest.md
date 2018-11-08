
# CreateDerivedTransactionPortfolioRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** |  | 
**description** | **String** |  |  [optional]
**code** | **String** |  |  [optional]
**parentPortfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) |  |  [optional]
**subHoldingKeys** | **List&lt;String&gt;** |  |  [optional]


<a name="AccountingMethodEnum"></a>
## Enum: AccountingMethodEnum
Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
AVERAGECOST | &quot;AverageCost&quot;
FIRSTINFIRSTOUT | &quot;FirstInFirstOut&quot;
LASTINFIRSTOUT | &quot;LastInFirstOut&quot;
HIGHESTCOSTFIRST | &quot;HighestCostFirst&quot;
LOWESTCOSTFIRST | &quot;LowestCostFirst&quot;



