# com.finbourne.lusid.model.Schedule
Base class for representing schedules in LUSID.  This base class should not be directly instantiated; each supported ScheduleType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleType** | **String** | The available values are: FixedSchedule, FloatSchedule, OptionalitySchedule, StepSchedule, Exercise, FxRateSchedule, FxLinkedNotionalSchedule, BondConversionSchedule, Invalid | [default to String]

```java
import com.finbourne.lusid.model.Schedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ScheduleType = "example ScheduleType";


Schedule scheduleInstance = new Schedule()
    .ScheduleType(ScheduleType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
