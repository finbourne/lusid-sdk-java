# com.finbourne.lusid.model.OptionalitySchedule
Optionality Schedule represents a class for creation of schedules for optionality (call, put)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exerciseType** | **String** | The exercise type of the optionality schedule (American or European).  For American type, the bond is perpetually callable from a given exercise date until it matures, or the next date in the schedule.  For European type, the bond is only callable on a given exercise date.    Supported string (enumeration) values are: [European, American].  Defaults to \&quot;European\&quot; if not set. | [optional] [default to String]
**optionEntries** | [**List&lt;OptionEntry&gt;**](OptionEntry.md) | The dates at which the bond call/put may be actioned, and associated strikes. | [optional] [default to List<OptionEntry>]
**optionType** | **String** | Type of optionality for the schedule.    Supported string (enumeration) values are: [Call, Put].  Defaults to \&quot;Call\&quot; if not set. | [optional] [default to String]

```java
import com.finbourne.lusid.model.OptionalitySchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ExerciseType = "example ExerciseType";
@jakarta.annotation.Nullable List<OptionEntry> OptionEntries = new List<OptionEntry>();
@jakarta.annotation.Nullable String OptionType = "example OptionType";


OptionalitySchedule optionalityScheduleInstance = new OptionalitySchedule()
    .ExerciseType(ExerciseType)
    .OptionEntries(OptionEntries)
    .OptionType(OptionType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
