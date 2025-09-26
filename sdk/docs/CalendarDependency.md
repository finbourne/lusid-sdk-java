# com.finbourne.lusid.model.CalendarDependency
For indicating a dependency upon calendar codes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendars** | **List&lt;String&gt;** | The Codes of the calendars that are depended upon. | [default to List<String>]

```java
import com.finbourne.lusid.model.CalendarDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> Calendars = new List<String>();


CalendarDependency calendarDependencyInstance = new CalendarDependency()
    .Calendars(Calendars);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
