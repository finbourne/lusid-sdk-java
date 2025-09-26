# com.finbourne.lusid.model.EventDateRange
A standard representation of the effective date range for the event, used for display, filtering and windowing use cases.  The start and end values for the eventDateRange are mapped from the particular dates contained within the specific  InstrumentEvent schema. Note that the start and end values may be identical for some types of events.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**end** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.EventDateRange;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Start = OffsetDateTime.now();
OffsetDateTime End = OffsetDateTime.now();


EventDateRange eventDateRangeInstance = new EventDateRange()
    .Start(Start)
    .End(End);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
