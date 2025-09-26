# com.finbourne.lusid.model.FxTenorConvention
A wrapper of conventions that should be used when interpreting tenors in the context of FX.  For instance, can be used to control how tenors are interpreted on an FxForwardTenorCurveData instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendarCode** | **String** | The code of the holiday calendar that should be used when interpreting FX tenors. | [default to String]
**spotDays** | **Integer** | The minimum number of business days that must pass within this calendar when calculating the spot date. | [default to Integer]

```java
import com.finbourne.lusid.model.FxTenorConvention;
import java.util.*;
import java.lang.System;
import java.net.URI;

String CalendarCode = "example CalendarCode";
Integer SpotDays = new Integer("100.00");


FxTenorConvention fxTenorConventionInstance = new FxTenorConvention()
    .CalendarCode(CalendarCode)
    .SpotDays(SpotDays);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
