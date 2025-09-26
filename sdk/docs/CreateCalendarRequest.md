# com.finbourne.lusid.model.CreateCalendarRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendarId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**calendarType** | **String** |  | [default to String]
**weekendMask** | [**WeekendMask**](WeekendMask.md) |  | [default to WeekendMask]
**sourceProvider** | **String** |  | [default to String]
**properties** | [**List&lt;Property&gt;**](Property.md) |  | [optional] [default to List<Property>]

```java
import com.finbourne.lusid.model.CreateCalendarRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId CalendarId = new ResourceId();
String CalendarType = "example CalendarType";
WeekendMask WeekendMask = new WeekendMask();
String SourceProvider = "example SourceProvider";
@jakarta.annotation.Nullable List<Property> Properties = new List<Property>();


CreateCalendarRequest createCalendarRequestInstance = new CreateCalendarRequest()
    .CalendarId(CalendarId)
    .CalendarType(CalendarType)
    .WeekendMask(WeekendMask)
    .SourceProvider(SourceProvider)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
