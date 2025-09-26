# com.finbourne.lusid.model.CloseEvent
The termination of an instrument.  In some cases termination can happen over a range of dates e.g. american option exercise.  In most cases the startDate == endDate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The first date on which the instrument could close | [optional] [default to OffsetDateTime]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last date on which the instrument could close | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CloseEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime EndDate = OffsetDateTime.now();


CloseEvent closeEventInstance = new CloseEvent()
    .StartDate(StartDate)
    .EndDate(EndDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
