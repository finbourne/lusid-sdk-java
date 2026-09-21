# com.finbourne.lusid.model.CoreStringCrossTolerance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceValue** | **String** | The value for the reference side. | [default to String]
**crossValue** | **String** | The value for the side other than the reference one. | [default to String]
**referenceSide** | **String** | Reference side (source of truth). One of: Left, Right. Available values: Left, Right, Either. | [optional] [default to String]
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. | [default to String]
**ruleName** | **String** | The reference name of the rule that this tolerance relaxes. | [default to String]

```java
import com.finbourne.lusid.model.CoreStringCrossTolerance;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ReferenceValue = "example ReferenceValue";
String CrossValue = "example CrossValue";
@jakarta.annotation.Nullable String ReferenceSide = "example ReferenceSide";
String ToleranceType = "example ToleranceType";
String RuleName = "example RuleName";


CoreStringCrossTolerance coreStringCrossToleranceInstance = new CoreStringCrossTolerance()
    .ReferenceValue(ReferenceValue)
    .CrossValue(CrossValue)
    .ReferenceSide(ReferenceSide)
    .ToleranceType(ToleranceType)
    .RuleName(RuleName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
