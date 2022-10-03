

# PortfolioDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **URI** | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. |  [optional]
**originPortfolioId** | [**ResourceId**](ResourceId.md) |  | 
**version** | [**Version**](Version.md) |  | 
**baseCurrency** | **String** | The base currency of the transaction portfolio. | 
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**subHoldingKeys** | **List&lt;String&gt;** |  |  [optional]
**instrumentScopes** | **List&lt;String&gt;** | The resolution strategy used to resolve instruments of transactions/holdings upserted to the transaction portfolio. |  [optional]
**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) | . The available values are: Default, AverageCost, FirstInFirstOut, LastInFirstOut, HighestCostFirst, LowestCostFirst |  [optional]
**amortisationMethod** | **String** | The amortisation method the portfolio is using in the calculation. This can be &#39;NoAmortisation&#39;, &#39;StraightLine&#39; or &#39;EffectiveYield&#39;. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Collection of links. |  [optional]



## Enum: AccountingMethodEnum

Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
AVERAGECOST | &quot;AverageCost&quot;
FIRSTINFIRSTOUT | &quot;FirstInFirstOut&quot;
LASTINFIRSTOUT | &quot;LastInFirstOut&quot;
HIGHESTCOSTFIRST | &quot;HighestCostFirst&quot;
LOWESTCOSTFIRST | &quot;LowestCostFirst&quot;



