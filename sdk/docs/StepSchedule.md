# com.finbourne.lusid.model.StepSchedule
Schedule that steps at known dated points in time.  Used in representation of a sinking bond, also called amortisation, steps in coupons for fixed bonds and spreads for floating bonds.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**levelType** | **String** | The type of shift or adjustment that the quantity represents.    Supported string (enumeration) values are: [Absolute, AbsoluteShift, Percentage, AbsolutePercentage]. | [default to String]
**stepScheduleType** | **String** | The type of step that this schedule is for.  Supported string (enumeration) values are: [Coupon, Notional, Spread]. | [default to String]
**steps** | [**List&lt;LevelStep&gt;**](LevelStep.md) | The level steps which are applied. | [default to List<LevelStep>]

```java
import com.finbourne.lusid.model.StepSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String LevelType = "example LevelType";
String StepScheduleType = "example StepScheduleType";
List<LevelStep> Steps = new List<LevelStep>();


StepSchedule stepScheduleInstance = new StepSchedule()
    .LevelType(LevelType)
    .StepScheduleType(StepScheduleType)
    .Steps(Steps);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
