# com.finbourne.lusid.model.CoreToleranceBase
Abstract base for tolerances that apply to core matching rules. Distinguishes core tolerances from  aggregate tolerances at the type level (both share a common tolerance base).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. | [default to String]
**ruleName** | **String** | The reference name of the rule that this tolerance relaxes. | [default to String]

```java
import com.finbourne.lusid.model.CoreToleranceBase;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ToleranceType = "example ToleranceType";
String RuleName = "example RuleName";


CoreToleranceBase coreToleranceBaseInstance = new CoreToleranceBase()
    .ToleranceType(ToleranceType)
    .RuleName(RuleName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
