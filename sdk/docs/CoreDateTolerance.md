# com.finbourne.lusid.model.CoreDateTolerance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceSide** | **String** | Reference side (source of truth). One of: Left, Right. Available values: Left, Right. | [default to String]
**interval** | **String** | The allowed tolerance for date time core rule values, defined as an ISO Period. | [default to String]
**offset** | **String** | How the interval should be applied to the reference side value. One of: Earlier, Later, Either. Defaults to Either. Available values: Earlier, Later, Either. | [optional] [default to String]
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. | [default to String]
**ruleName** | **String** | The reference name of the rule that this tolerance relaxes. | [default to String]

```java
import com.finbourne.lusid.model.CoreDateTolerance;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ReferenceSide = "example ReferenceSide";
String Interval = "example Interval";
@jakarta.annotation.Nullable String Offset = "example Offset";
String ToleranceType = "example ToleranceType";
String RuleName = "example RuleName";


CoreDateTolerance coreDateToleranceInstance = new CoreDateTolerance()
    .ReferenceSide(ReferenceSide)
    .Interval(Interval)
    .Offset(Offset)
    .ToleranceType(ToleranceType)
    .RuleName(RuleName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
