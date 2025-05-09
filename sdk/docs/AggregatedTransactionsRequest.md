

# AggregatedTransactionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromTransactionDate** | **OffsetDateTime** |  |  |
|**toTransactionDate** | **OffsetDateTime** |  |  |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolio or portfolio group identifiers containing the relevant transactions. |  [optional] |
|**asAt** | **OffsetDateTime** |  |  [optional] |
|**metrics** | [**List&lt;AggregateSpec&gt;**](AggregateSpec.md) |  |  |
|**groupBy** | **List&lt;String&gt;** |  |  [optional] |
|**filters** | [**List&lt;PropertyFilter&gt;**](PropertyFilter.md) |  |  [optional] |
|**sort** | [**List&lt;OrderBySpec&gt;**](OrderBySpec.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


