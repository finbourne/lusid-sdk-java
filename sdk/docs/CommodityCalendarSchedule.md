# com.finbourne.lusid.model.CommodityCalendarSchedule
Schedule describing the periodic calendar-average settlement periods of a commodity calendar swap.  Each period settles in cash against the average of the observed commodity price over the period.  The schedule is currently stored and validated only; period expansion is not yet implemented.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date from which the first settlement period accrues. | [optional] [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the final settlement period ends. | [optional] [default to OffsetDateTime]
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [optional] [default to FlowConventions]
**paymentCurrency** | **String** | The currency in which each periodic cash settlement is paid. | [optional] [default to String]
**stubType** | **String** | How any non-integral first or last period is handled when generating the settlement periods.  If not specified, this defaults to None.     Supported string (enumeration) values are: [ShortFront, ShortBack, LongBack, LongFront, Both]. Available values: None, ShortFront, ShortBack, LongBack, LongFront, Both, Invalid. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CommodityCalendarSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
FlowConventions FlowConventions = new FlowConventions();
@jakarta.annotation.Nullable String PaymentCurrency = "example PaymentCurrency";
@jakarta.annotation.Nullable String StubType = "example StubType";


CommodityCalendarSchedule commodityCalendarScheduleInstance = new CommodityCalendarSchedule()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .FlowConventions(FlowConventions)
    .PaymentCurrency(PaymentCurrency)
    .StubType(StubType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
