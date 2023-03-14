

# StepScheduleAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**levelType** | **String** | The type of shift or adjustment that the quantity represents.    Supported string (enumeration) values are: [Absolute, AbsoluteShift, Percentage, AbsolutePercentage]. | 
**stepScheduleType** | **String** | The type of step that this schedule is for.  Supported string (enumeration) values are: [Coupon, Notional, Spread]. | 
**steps** | [**List&lt;LevelStep&gt;**](LevelStep.md) | The level steps which are applied. | 
**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) | The available values are: Fixed, Float, Optionality, Step, Exercise, FxRate, Invalid | 



## Enum: ScheduleTypeEnum

Name | Value
---- | -----
FIXED | &quot;Fixed&quot;
FLOAT | &quot;Float&quot;
OPTIONALITY | &quot;Optionality&quot;
STEP | &quot;Step&quot;
EXERCISE | &quot;Exercise&quot;
FXRATE | &quot;FxRate&quot;
INVALID | &quot;Invalid&quot;



