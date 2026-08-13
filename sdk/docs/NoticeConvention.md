# com.finbourne.lusid.model.NoticeConvention
Defines the notice period by which a cancellation election must be made ahead of the  cancel effective date, else the option lapses.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendars** | **List&lt;String&gt;** | Holiday calendar code(s) used to resolve business days, required when the day type is Business. | [optional] [default to List<String>]
**dayType** | **String** | Indicates whether the notice days are counted using business days or calendar days.     Supported string (enumeration) values are: [Business, Calendar]. Available values: Business, Calendar. | [default to String]
**noticeDays** | **Integer** | The number of days prior to the cancel effective date by which the election must be made.     Defaults to 2 if not set. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.NoticeConvention;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<String> Calendars = new List<String>();
String DayType = "example DayType";
Integer NoticeDays = new Integer("100.00");


NoticeConvention noticeConventionInstance = new NoticeConvention()
    .Calendars(Calendars)
    .DayType(DayType)
    .NoticeDays(NoticeDays);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
