# com.finbourne.lusid.model.AggregatedReturnsRequest
The request used in the AggregatedReturns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metrics** | [**List&lt;PerformanceReturnsMetric&gt;**](PerformanceReturnsMetric.md) | A list of metrics to calculate in the AggregatedReturns. | [default to List<PerformanceReturnsMetric>]
**returnIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The Scope and code of the returns. | [optional] [default to List<ResourceId>]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**compositeMethod** | **String** | The method used to calculate the Portfolio performance: Equal/Asset. | [optional] [default to String]
**period** | **String** | The type of the returns used to calculate the aggregation result: Daily/Monthly. | [optional] [default to String]
**outputFrequency** | **String** | The type of calculated output: Daily/Weekly/Monthly/Quarterly/Half-Yearly/Yearly. | [optional] [default to String]
**alternativeInceptionDate** | **String** | Optional - either a date, or the key for a portfolio property containing a date. If provided, the given date will override the inception date for this request. | [optional] [default to String]
**holidayCalendars** | **List&lt;String&gt;** | The holiday calendar(s) that should be used in determining the date schedule. Holiday calendar(s) are supplied by their codes, for example, &#39;CoppClark&#39;. Note that when the calendars are not available (e.g. when the user has insufficient permissions), a recipe setting will be used to determine whether the whole batch should then fail or whether the calendar not being available should simply be ignored. | [optional] [default to List<String>]
**currency** | **String** | Optional - either a string or a property. If provided, the results will be converted to the specified currency | [optional] [default to String]
**runMode** | **String** | The dates the AggregatedReturns output will be calculated: ReturnData/WeekDays/AllDays/MonthEnd. Defaults to ReturnData. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AggregatedReturnsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<PerformanceReturnsMetric> Metrics = new List<PerformanceReturnsMetric>();
@jakarta.annotation.Nullable List<ResourceId> ReturnIds = new List<ResourceId>();
ResourceId RecipeId = new ResourceId();
@jakarta.annotation.Nullable String CompositeMethod = "example CompositeMethod";
@jakarta.annotation.Nullable String Period = "example Period";
@jakarta.annotation.Nullable String OutputFrequency = "example OutputFrequency";
@jakarta.annotation.Nullable String AlternativeInceptionDate = "example AlternativeInceptionDate";
@jakarta.annotation.Nullable List<String> HolidayCalendars = new List<String>();
@jakarta.annotation.Nullable String Currency = "example Currency";
@jakarta.annotation.Nullable String RunMode = "example RunMode";


AggregatedReturnsRequest aggregatedReturnsRequestInstance = new AggregatedReturnsRequest()
    .Metrics(Metrics)
    .ReturnIds(ReturnIds)
    .RecipeId(RecipeId)
    .CompositeMethod(CompositeMethod)
    .Period(Period)
    .OutputFrequency(OutputFrequency)
    .AlternativeInceptionDate(AlternativeInceptionDate)
    .HolidayCalendars(HolidayCalendars)
    .Currency(Currency)
    .RunMode(RunMode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
