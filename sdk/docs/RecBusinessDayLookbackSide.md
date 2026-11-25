# com.finbourne.lusid.model.RecBusinessDayLookbackSide
One side of a FixedBusinessDayLookback activity window: how many business days the side reaches back, the time  zone the days are counted in, the holiday calendars that take days out of the count, and the local time the  since bound falls at.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lookbackBusinessDays** | **Integer** | The number of business days before the effectiveAt&#39;s local date the window opens on, from 1 to 366. If the effectiveAt falls on a non-business day it counts from the most recent business day before it. | [default to Integer]
**timeZone** | **String** | The IANA time zone (e.g. Europe/London, Asia/Hong_Kong) the effectiveAt is read in and the business days are counted in. The since bound is stamped in UTC. | [default to String]
**holidayCalendars** | [**List&lt;ResourceId&gt;**](ResourceId.md) | Up to 5 holiday calendars whose dates are not business days, each by scope and code. A day that is a weekend or a holiday in any of them is skipped. With none, business days are Monday to Friday. Every calendar must exist when the definition is written and when a rec is instantiated. | [optional] [default to List<ResourceId>]
**sinceTimeOfDay** | [**RecTimeOfDay**](RecTimeOfDay.md) |  | [optional] [default to RecTimeOfDay]

```java
import com.finbourne.lusid.model.RecBusinessDayLookbackSide;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer LookbackBusinessDays = new Integer("100.00");
String TimeZone = "example TimeZone";
@jakarta.annotation.Nullable List<ResourceId> HolidayCalendars = new List<ResourceId>();
RecTimeOfDay SinceTimeOfDay = new RecTimeOfDay();


RecBusinessDayLookbackSide recBusinessDayLookbackSideInstance = new RecBusinessDayLookbackSide()
    .LookbackBusinessDays(LookbackBusinessDays)
    .TimeZone(TimeZone)
    .HolidayCalendars(HolidayCalendars)
    .SinceTimeOfDay(SinceTimeOfDay);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
