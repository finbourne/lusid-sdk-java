# com.finbourne.lusid.model.CoreAttributeOptionalityTolerance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**optionalSide** | **String** | Which side is allowed to have no value while still attempting to match. One of: Left, Right, Either. Defaults to Either. Available values: Left, Right, Either. | [optional] [default to String]
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. | [default to String]
**ruleName** | **String** | The reference name of the rule that this tolerance relaxes. | [default to String]

```java
import com.finbourne.lusid.model.CoreAttributeOptionalityTolerance;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String OptionalSide = "example OptionalSide";
String ToleranceType = "example ToleranceType";
String RuleName = "example RuleName";


CoreAttributeOptionalityTolerance coreAttributeOptionalityToleranceInstance = new CoreAttributeOptionalityTolerance()
    .OptionalSide(OptionalSide)
    .ToleranceType(ToleranceType)
    .RuleName(RuleName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
