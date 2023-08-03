

# StepScheduleAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**levelType** | **String** | The type of shift or adjustment that the quantity represents.    Supported string (enumeration) values are: [Absolute, AbsoluteShift, Percentage, AbsolutePercentage]. | 
**stepScheduleType** | **String** | The type of step that this schedule is for.  Supported string (enumeration) values are: [Coupon, Notional, Spread]. | 
**steps** | [**List&lt;LevelStep&gt;**](LevelStep.md) | The level steps which are applied. | 
**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) | The available values are: FixedSchedule, FloatSchedule, OptionalitySchedule, StepSchedule, Exercise, FxRateSchedule, Invalid | 



## Enum: ScheduleTypeEnum

Name | Value
---- | -----
FIXEDSCHEDULE | &quot;FixedSchedule&quot;
FLOATSCHEDULE | &quot;FloatSchedule&quot;
OPTIONALITYSCHEDULE | &quot;OptionalitySchedule&quot;
STEPSCHEDULE | &quot;StepSchedule&quot;
EXERCISE | &quot;Exercise&quot;
FXRATESCHEDULE | &quot;FxRateSchedule&quot;
INVALID | &quot;Invalid&quot;



