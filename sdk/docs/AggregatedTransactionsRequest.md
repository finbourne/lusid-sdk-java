

# AggregatedTransactionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromTransactionDate** | **OffsetDateTime** |  |  |
|**toTransactionDate** | **OffsetDateTime** |  |  |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  |
|**asAt** | **OffsetDateTime** |  |  [optional] |
|**metrics** | [**List&lt;AggregateSpec&gt;**](AggregateSpec.md) |  |  |
|**groupBy** | **List&lt;String&gt;** |  |  [optional] |
|**filters** | [**List&lt;PropertyFilter&gt;**](PropertyFilter.md) |  |  [optional] |
|**sort** | [**List&lt;OrderBySpec&gt;**](OrderBySpec.md) |  |  [optional] |



