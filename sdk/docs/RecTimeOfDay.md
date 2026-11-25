# com.finbourne.lusid.model.RecTimeOfDay
A local time of day to the minute, read in the time zone of the side that names it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hours** | **Integer** | The hour of the day, 0 to 23. | [default to Integer]
**minutes** | **Integer** | The minute of the hour, 0 to 59. | [default to Integer]

```java
import com.finbourne.lusid.model.RecTimeOfDay;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Hours = new Integer("100.00");
Integer Minutes = new Integer("100.00");


RecTimeOfDay recTimeOfDayInstance = new RecTimeOfDay()
    .Hours(Hours)
    .Minutes(Minutes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
