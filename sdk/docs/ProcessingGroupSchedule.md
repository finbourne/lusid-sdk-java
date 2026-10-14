# com.finbourne.lusid.model.ProcessingGroupSchedule
Specification of the dates on which a Processing Group is executed: a date range plus  tenor / roll / business-day conventions and holiday calendars that generate the schedule,  or an explicit override set of dates. Modelled on the valuation schedule shape, without the  bitemporal timeline fields.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveFrom** | **String** | The start of the date range over which the schedule is generated. | [optional] [default to String]
**effectiveAt** | **String** | The end of the date range over which the schedule is generated. | [optional] [default to String]
**tenor** | **String** | Tenor, e.g. \&quot;1D\&quot;, \&quot;1M\&quot;, used to generate the date schedule between EffectiveFrom and EffectiveAt. | [optional] [default to String]
**rollConvention** | **String** | When Tenor is \&quot;1M\&quot; or longer, the rule used to generate the date schedule, e.g. \&quot;EndOfMonth\&quot; or \&quot;1\&quot;. | [optional] [default to String]
**holidayCalendars** | **List&lt;String&gt;** | The holiday calendar(s), by name, used when determining business days for the schedule. | [optional] [default to List<String>]
**scheduleDates** | **List&lt;String&gt;** | If given, the exact set of dates on which to execute. Overrides the generated schedule. | [optional] [default to List<String>]
**businessDayConvention** | **String** | When Tenor is not \&quot;1D\&quot;, the convention (e.g. \&quot;MF\&quot;) used to roll dates that land on non-business days. | [optional] [default to String]
**timeZone** | **String** | The IANA approved time zone (tzdb id, e.g. \&quot;Europe/London\&quot;) the schedule is expressed in.  Informational for consumers of the schedule: the generated schedule dates are calendar dates  and are not adjusted by this time zone. Optional. | [optional] [default to String]
**businessDayOffset** | **Integer** | If given, the number of good business days (per the holiday calendars) added to each generated  date. Can be negative. For example, the 10th business day of each month is a \&quot;1M\&quot; tenor with an  \&quot;EndOfMonth\&quot; roll convention and a business day offset of 10. Cannot be combined with ScheduleDates. | [optional] [default to Integer]
**dateExceptions** | **List&lt;String&gt;** | Dates, in yyyy-MM-dd format, on which the Processing Group does not run. These are removed  from the generated schedule after all other conventions and offsets have been applied. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.ProcessingGroupSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String EffectiveFrom = "example EffectiveFrom";
@jakarta.annotation.Nullable String EffectiveAt = "example EffectiveAt";
@jakarta.annotation.Nullable String Tenor = "example Tenor";
@jakarta.annotation.Nullable String RollConvention = "example RollConvention";
@jakarta.annotation.Nullable List<String> HolidayCalendars = new List<String>();
@jakarta.annotation.Nullable List<String> ScheduleDates = new List<String>();
@jakarta.annotation.Nullable String BusinessDayConvention = "example BusinessDayConvention";
@jakarta.annotation.Nullable String TimeZone = "example TimeZone";
@jakarta.annotation.Nullable Integer BusinessDayOffset = new Integer("100.00");
@jakarta.annotation.Nullable List<String> DateExceptions = new List<String>();


ProcessingGroupSchedule processingGroupScheduleInstance = new ProcessingGroupSchedule()
    .EffectiveFrom(EffectiveFrom)
    .EffectiveAt(EffectiveAt)
    .Tenor(Tenor)
    .RollConvention(RollConvention)
    .HolidayCalendars(HolidayCalendars)
    .ScheduleDates(ScheduleDates)
    .BusinessDayConvention(BusinessDayConvention)
    .TimeZone(TimeZone)
    .BusinessDayOffset(BusinessDayOffset)
    .DateExceptions(DateExceptions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
