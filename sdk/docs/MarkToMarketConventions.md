# com.finbourne.lusid.model.MarkToMarketConventions
A set of conventions for mark to market. Mark to market is a method   that values financial instruments based on current market prices,   reflecting their current value, rather than historical cost.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendarCode** | **String** | The calendar to use when generating mark to market cashflows and events. | [optional] [default to String]
**hourOffsetTenor** | **String** | The hour tenor component of the time offset against the maturity date.  This is an optional field, if a value is provided it must be a positive value between &#39;0hour&#39; and &#39;23hour&#39;. | [optional] [default to String]
**minuteOffsetTenor** | **String** | The minute tenor component of the time offset against the maturity date.  This is an optional field, if a value is provided it must be a positive value between &#39;0min&#39; and &#39;59min&#39;. | [optional] [default to String]
**mtmSettleDays** | **Integer** | The number of business days after each mark to market date on which its variation margin is paid.  This is an optional field, defaulting to 0 (paid on the mark to market date); if a value is provided it must be between 0 and 10 inclusive. | [optional] [default to Integer]
**mtmSettlementCalendar** | **String** | The calendar the mark to market settlement days are counted on.  This is an optional field; if no value is provided the mark to market calendar is used, and without that only weekends are non-business days. | [optional] [default to String]

```java
import com.finbourne.lusid.model.MarkToMarketConventions;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String CalendarCode = "example CalendarCode";
@jakarta.annotation.Nullable String HourOffsetTenor = "example HourOffsetTenor";
@jakarta.annotation.Nullable String MinuteOffsetTenor = "example MinuteOffsetTenor";
@jakarta.annotation.Nullable Integer MtmSettleDays = new Integer("100.00");
@jakarta.annotation.Nullable String MtmSettlementCalendar = "example MtmSettlementCalendar";


MarkToMarketConventions markToMarketConventionsInstance = new MarkToMarketConventions()
    .CalendarCode(CalendarCode)
    .HourOffsetTenor(HourOffsetTenor)
    .MinuteOffsetTenor(MinuteOffsetTenor)
    .MtmSettleDays(MtmSettleDays)
    .MtmSettlementCalendar(MtmSettlementCalendar);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
