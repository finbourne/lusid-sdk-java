

# Schedule

Base class for representing schedules in LUSID.  This base class should not be directly instantiated; each supported ScheduleType has a corresponding inherited class.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) | The available values are: FixedSchedule, FloatSchedule, OptionalitySchedule, StepSchedule, Exercise, FxRateSchedule, FxLinkedNotionalSchedule, Invalid |  |



## Enum: ScheduleTypeEnum

| Name | Value |
|---- | -----|
| FIXEDSCHEDULE | &quot;FixedSchedule&quot; |
| FLOATSCHEDULE | &quot;FloatSchedule&quot; |
| OPTIONALITYSCHEDULE | &quot;OptionalitySchedule&quot; |
| STEPSCHEDULE | &quot;StepSchedule&quot; |
| EXERCISE | &quot;Exercise&quot; |
| FXRATESCHEDULE | &quot;FxRateSchedule&quot; |
| FXLINKEDNOTIONALSCHEDULE | &quot;FxLinkedNotionalSchedule&quot; |
| INVALID | &quot;Invalid&quot; |



