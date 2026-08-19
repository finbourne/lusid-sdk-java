# com.finbourne.lusid.model.ToleranceBase
Base class for the tolerances that relax how strictly a matching rule compares its two sides. Polymorphic  by ToleranceType; each supported type has a corresponding inherited class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toleranceType** | **String** | Polymorphic discriminator. Supported types: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. Available values: CoreStringCross, CoreAttributeOptionality, CoreDateTolerance, Numeric. | [default to String]
**ruleName** | **String** | The reference name of the rule that this tolerance relaxes. | [default to String]

```java
import com.finbourne.lusid.model.ToleranceBase;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ToleranceType = "example ToleranceType";
String RuleName = "example RuleName";


ToleranceBase toleranceBaseInstance = new ToleranceBase()
    .ToleranceType(ToleranceType)
    .RuleName(RuleName);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
