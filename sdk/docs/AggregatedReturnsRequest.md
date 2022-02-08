

# AggregatedReturnsRequest

The request used in the AggregatedReturns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metrics** | [**List&lt;PerformanceReturnsMetric&gt;**](PerformanceReturnsMetric.md) | A list of metrics to calculate in the AggregatedReturns. | 
**returnId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**recipeId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**compositeMethod** | **String** | The method used to calculate the Portfolio performance: Equal/Asset. |  [optional]
**period** | **String** | The type of the returns used to calculate the aggregation result: Daily/Monthly. |  [optional]
**outputFrequency** | **String** | The type of calculated output: Daily/Weekly/Monthly/Quarterly/Half-Yearly/Yearly. |  [optional]
**alternativeInceptionDate** | **String** | Optional - either a date, or the key for a portfolio property containing a date. If provided, the given date will override the inception date for this request. |  [optional]



