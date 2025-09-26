# com.finbourne.lusid.model.UpdateCalendarRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**weekendMask** | [**WeekendMask**](WeekendMask.md) |  | [default to WeekendMask]
**sourceProvider** | **String** |  | [default to String]
**properties** | [**List&lt;Property&gt;**](Property.md) |  | [default to List<Property>]

```java
import com.finbourne.lusid.model.UpdateCalendarRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

WeekendMask WeekendMask = new WeekendMask();
String SourceProvider = "example SourceProvider";
List<Property> Properties = new List<Property>();


UpdateCalendarRequest updateCalendarRequestInstance = new UpdateCalendarRequest()
    .WeekendMask(WeekendMask)
    .SourceProvider(SourceProvider)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
