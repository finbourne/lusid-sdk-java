# com.finbourne.lusid.model.YearMonthDay
A date in component form.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**year** | **Integer** | The year of the date. | [default to Integer]
**month** | **Integer** | The month of the date. | [default to Integer]
**day** | **Integer** | The day in month of the date. | [default to Integer]

```java
import com.finbourne.lusid.model.YearMonthDay;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Year = new Integer("100.00");
Integer Month = new Integer("100.00");
Integer Day = new Integer("100.00");


YearMonthDay yearMonthDayInstance = new YearMonthDay()
    .Year(Year)
    .Month(Month)
    .Day(Day);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
