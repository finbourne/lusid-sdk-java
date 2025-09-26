# com.finbourne.lusid.model.MarkToMarketConventions
A set of conventions for mark to market. Mark to market is a method   that values financial instruments based on current market prices,   reflecting their current value, rather than historical cost.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendarCode** | **String** | The calendar to use when generating mark to market cashflows and events. | [optional] [default to String]
**hourOffsetTenor** | **String** | The hour tenor component of the time offset against the maturity date.  This is an optional field, if a value is provided it must be a positive value between &#39;0hour&#39; and &#39;23hour&#39;. | [optional] [default to String]
**minuteOffsetTenor** | **String** | The minute tenor component of the time offset against the maturity date.  This is an optional field, if a value is provided it must be a positive value between &#39;0min&#39; and &#39;59min&#39;. | [optional] [default to String]

```java
import com.finbourne.lusid.model.MarkToMarketConventions;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String CalendarCode = "example CalendarCode";
@jakarta.annotation.Nullable String HourOffsetTenor = "example HourOffsetTenor";
@jakarta.annotation.Nullable String MinuteOffsetTenor = "example MinuteOffsetTenor";


MarkToMarketConventions markToMarketConventionsInstance = new MarkToMarketConventions()
    .CalendarCode(CalendarCode)
    .HourOffsetTenor(HourOffsetTenor)
    .MinuteOffsetTenor(MinuteOffsetTenor);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
