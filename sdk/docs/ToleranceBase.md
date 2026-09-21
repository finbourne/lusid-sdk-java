# com.finbourne.lusid.model.ToleranceBase
Base class for the tolerances that relax how strictly a matching rule compares its two sides. Polymorphic  by ToleranceType; each supported type has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. | [default to String]
**ruleName** | **String** | The reference name of the rule that this tolerance relaxes. | [default to String]
**referenceSide** | **String** | Reference side (source of truth). One of: Left, Right. Available values: Left, Right, Either. | [default to String]
**absoluteThreshold** | **java.math.BigDecimal** | Numeric tolerance absolute value (allowable diff compared to the reference side value). | [optional] [default to java.math.BigDecimal]
**relativeThreshold** | **java.math.BigDecimal** | Numeric tolerance value as a relative % of the reference value. | [optional] [default to java.math.BigDecimal]
**thresholdPriority** | **String** | Whether to apply the GreaterOf or LesserOf the absoluteThreshold vs relativeThreshold. One of: GreaterOf, LesserOf. Available values: GreaterOf, LesserOf. | [default to String]
**offset** | **String** | How the interval should be applied to the reference side value. One of: Earlier, Later, Either. Defaults to Either. Available values: Earlier, Later, Either. | [optional] [default to String]
**optionalSide** | **String** | Which side is allowed to have no value while still attempting to match. One of: Left, Right, Either. Defaults to Either. Available values: Left, Right, Either. | [optional] [default to String]
**interval** | **String** | The allowed tolerance for date time core rule values, defined as an ISO Period. | [default to String]
**referenceValue** | **String** | The value for the reference side. | [default to String]
**crossValue** | **String** | The value for the side other than the reference one. | [default to String]

```java
import com.finbourne.lusid.model.ToleranceBase;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with AggregateNumericTolerance ToleranceBase
AggregateNumericTolerance toleranceBase = new AggregateNumericTolerance();
toleranceBase.setType(AggregateNumericTolerance.TypeEnum.AGGREGATENUMERICTOLERANCE);
ToleranceBase config = new ToleranceBase(toleranceBase);

```
 See all compatible oneOf types with ToleranceBase
* [AggregateNumericTolerance](./AggregateNumericTolerance.md)

* [CoreAttributeOptionalityTolerance](./CoreAttributeOptionalityTolerance.md)

* [CoreDateTolerance](./CoreDateTolerance.md)

* [CoreStringCrossTolerance](./CoreStringCrossTolerance.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
