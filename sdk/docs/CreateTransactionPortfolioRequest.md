
# CreateTransactionPortfolioRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** |  | 
**description** | **String** |  |  [optional]
**code** | **String** |  | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**baseCurrency** | **String** |  | 
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) |  |  [optional]
**subHoldingKeys** | **List&lt;String&gt;** |  |  [optional]
**properties** | [**Map&lt;String, PropertyValue&gt;**](PropertyValue.md) | Portfolio properties to add to the portfolio |  [optional]


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



