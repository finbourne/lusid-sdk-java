# com.finbourne.lusid.model.WeekendMask

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**days** | [**List&lt;DayOfWeek&gt;**](DayOfWeek.md) |  | [default to List<DayOfWeek>]
**timeZone** | **String** |  | [default to String]

```java
import com.finbourne.lusid.model.WeekendMask;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<DayOfWeek> Days = new List<DayOfWeek>();
String TimeZone = "example TimeZone";


WeekendMask weekendMaskInstance = new WeekendMask()
    .Days(Days)
    .TimeZone(TimeZone);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
