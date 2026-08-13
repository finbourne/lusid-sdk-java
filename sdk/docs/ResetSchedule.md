# com.finbourne.lusid.model.ResetSchedule
The schedule on which the price return of the asset leg of a total return swap is observed and exchanged.  Each reset period pays the change in the asset's price over the period, sourced from quoted market data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conventions** | [**FlowConventions**](FlowConventions.md) |  | [optional] [default to FlowConventions]
**firstResetDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the first price reset. Optional; when absent the reset dates are rolled forward from the swap start date. | [optional] [default to OffsetDateTime]
**frequency** | **String** | The frequency at which the asset price is reset and the price return is exchanged, e.g. 3M. | [default to String]
**lastResetDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the last price reset. Optional; when absent the reset dates are rolled forward until the swap maturity date. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.ResetSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

FlowConventions Conventions = new FlowConventions();
@jakarta.annotation.Nullable OffsetDateTime FirstResetDate = OffsetDateTime.now();
String Frequency = "example Frequency";
@jakarta.annotation.Nullable OffsetDateTime LastResetDate = OffsetDateTime.now();


ResetSchedule resetScheduleInstance = new ResetSchedule()
    .Conventions(Conventions)
    .FirstResetDate(FirstResetDate)
    .Frequency(Frequency)
    .LastResetDate(LastResetDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
