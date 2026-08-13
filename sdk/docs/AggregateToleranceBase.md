# com.finbourne.lusid.model.AggregateToleranceBase
Abstract base for tolerances that apply to aggregate matching rules. Distinguishes aggregate  tolerances from core tolerances at the type level (both share a common tolerance base).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. | [default to String]
**ruleName** | **String** | The reference name of the rule that this tolerance relaxes. | [default to String]

```java
import com.finbourne.lusid.model.AggregateToleranceBase;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ToleranceType = "example ToleranceType";
String RuleName = "example RuleName";


AggregateToleranceBase aggregateToleranceBaseInstance = new AggregateToleranceBase()
    .ToleranceType(ToleranceType)
    .RuleName(RuleName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
