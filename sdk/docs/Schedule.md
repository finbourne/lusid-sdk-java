

# Schedule

Base class for representing schedules in LUSID.  This base class should not be directly instantiated; each supported ScheduleType has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) | The available values are: Fixed, Float, Optionality, Step, Exercise, Invalid | 



## Enum: ScheduleTypeEnum

Name | Value
---- | -----
FIXED | &quot;Fixed&quot;
FLOAT | &quot;Float&quot;
OPTIONALITY | &quot;Optionality&quot;
STEP | &quot;Step&quot;
EXERCISE | &quot;Exercise&quot;
INVALID | &quot;Invalid&quot;



