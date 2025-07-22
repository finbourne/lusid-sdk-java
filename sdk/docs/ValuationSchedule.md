

# ValuationSchedule

Specification object for the valuation schedule, how do we determine which days we wish to perform a valuation upon.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effectiveFrom** | **String** | If present, the EffectiveFrom and EffectiveAt dates are interpreted as a range of dates for which to perform a valuation.  In this case, valuation is calculated for the portfolio(s) for each business day in the given range. |  [optional] |
|**effectiveAt** | **String** | The market data time, i.e. the time to run the valuation request effective of. |  |
|**tenor** | **String** | Tenor, e.g \&quot;1D\&quot;, \&quot;1M\&quot; to be used in generating the date schedule when effectiveFrom and effectiveAt are both given and are not the same. |  [optional] |
|**rollConvention** | **String** | When Tenor is given and is \&quot;1M\&quot; or longer, this specifies the rule which should be used to generate the date schedule.   For example, \&quot;EndOfMonth\&quot; to generate end of month dates, or \&quot;1\&quot; to specify the first day of the applicable month. |  [optional] |
|**holidayCalendars** | **List&lt;String&gt;** | The holiday calendar(s) that should be used in determining the date schedule.  Holiday calendar(s) are supplied by their names, for example, \&quot;CoppClark\&quot;.   Note that when the calendars are not available (e.g. when the user has insufficient permissions),   a recipe setting will be used to determine whether the whole batch should then fail or whether the calendar not being available should simply be ignored. |  [optional] |
|**valuationDateTimes** | **List&lt;String&gt;** | If given, this is the exact set of dates on which to perform a valuation. This will replace/override all other specified values if given. |  [optional] |
|**businessDayConvention** | **String** | When Tenor is given and is not equal to \&quot;1D\&quot;, there may be cases where \&quot;date + tenor\&quot; land on non-business days around month end.  In that case, the BusinessDayConvention, e.g. modified following \&quot;MF\&quot; would be applied to determine the next GBD. |  [optional] |
|**timelineId** | [**ResourceId**](ResourceId.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


