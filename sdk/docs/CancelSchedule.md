# com.finbourne.lusid.model.CancelSchedule
Cancel schedule represents the embedded option on a cancellable swap, allowing one party to  terminate the swap on one or more predefined dates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancelDates** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md) | The dates on which cancellation may be elected. | [default to List<OffsetDateTime>]
**cancelType** | **String** | The type of cancellation option: European (single cancel date) or Bermudan (two or more).     Supported string (enumeration) values are: [European, Bermudan]. Available values: European, Bermudan. | [default to String]
**noticeConvention** | [**NoticeConvention**](NoticeConvention.md) |  | [default to NoticeConvention]

```java
import com.finbourne.lusid.model.CancelSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<OffsetDateTime> CancelDates = new List<OffsetDateTime>();
String CancelType = "example CancelType";
NoticeConvention NoticeConvention = new NoticeConvention();


CancelSchedule cancelScheduleInstance = new CancelSchedule()
    .CancelDates(CancelDates)
    .CancelType(CancelType)
    .NoticeConvention(NoticeConvention);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
