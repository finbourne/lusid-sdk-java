# com.finbourne.lusid.model.AggregateNumericTolerance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceSide** | **String** | Reference side (source of truth). One of: Left, Right. Available values: Left, Right. | [default to String]
**absoluteThreshold** | **java.math.BigDecimal** | Numeric tolerance absolute value (allowable diff compared to the reference side value). | [optional] [default to java.math.BigDecimal]
**relativeThreshold** | **java.math.BigDecimal** | Numeric tolerance value as a relative % of the reference value. | [optional] [default to java.math.BigDecimal]
**thresholdPriority** | **String** | Whether to apply the GreaterOf or LesserOf the absoluteThreshold vs relativeThreshold. One of: GreaterOf, LesserOf. Available values: GreaterOf, LesserOf. | [default to String]
**offset** | **String** | How the threshold should be applied to the reference side value. One of: Above, Below, Either. Defaults to Either. Available values: Above, Below, Either. | [optional] [default to String]
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. | [default to String]
**ruleName** | **String** | The reference name of the rule that this tolerance relaxes. | [default to String]

```java
import com.finbourne.lusid.model.AggregateNumericTolerance;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ReferenceSide = "example ReferenceSide";
@jakarta.annotation.Nullable java.math.BigDecimal AbsoluteThreshold = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal RelativeThreshold = new java.math.BigDecimal("100.00");
String ThresholdPriority = "example ThresholdPriority";
@jakarta.annotation.Nullable String Offset = "example Offset";
String ToleranceType = "example ToleranceType";
String RuleName = "example RuleName";


AggregateNumericTolerance aggregateNumericToleranceInstance = new AggregateNumericTolerance()
    .ReferenceSide(ReferenceSide)
    .AbsoluteThreshold(AbsoluteThreshold)
    .RelativeThreshold(RelativeThreshold)
    .ThresholdPriority(ThresholdPriority)
    .Offset(Offset)
    .ToleranceType(ToleranceType)
    .RuleName(RuleName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
