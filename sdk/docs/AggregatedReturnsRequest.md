

# AggregatedReturnsRequest

The request used in the AggregatedReturns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metrics** | [**List&lt;PerformanceReturnsMetric&gt;**](PerformanceReturnsMetric.md) | A list of metrics to calculate in the AggregatedReturns. | 
**returnIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The Scope and code of the returns. |  [optional]
**recipeId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**compositeMethod** | **String** | The method used to calculate the Portfolio performance: Equal/Asset. |  [optional]
**period** | **String** | The type of the returns used to calculate the aggregation result: Daily/Monthly. |  [optional]
**outputFrequency** | **String** | The type of calculated output: Daily/Weekly/Monthly/Quarterly/Half-Yearly/Yearly. |  [optional]
**alternativeInceptionDate** | **String** | Optional - either a date, or the key for a portfolio property containing a date. If provided, the given date will override the inception date for this request. |  [optional]
**holidayCalendars** | **List&lt;String&gt;** | The holiday calendar(s) that should be used in determining the date schedule. Holiday calendar(s) are supplied by their codes, for example, &#39;CoppClark&#39;. Note that when the calendars are not available (e.g. when the user has insufficient permissions), a recipe setting will be used to determine whether the whole batch should then fail or whether the calendar not being available should simply be ignored. |  [optional]
**currency** | **String** | Optional - either a string or a property. If provided, the results will be converted to the specified currency |  [optional]



