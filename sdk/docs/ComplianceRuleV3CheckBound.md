# com.finbourne.lusid.model.ComplianceRuleV3CheckBound
A single bound of a check: a hard limit that must hold, plus an optional soft limit that raises a  warning without failing the rule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hard** | [**ComplianceRuleV3DecimalBound**](ComplianceRuleV3DecimalBound.md) |  | [default to ComplianceRuleV3DecimalBound]
**soft** | [**ComplianceRuleV3DecimalBound**](ComplianceRuleV3DecimalBound.md) |  | [optional] [default to ComplianceRuleV3DecimalBound]
**hardProperty** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ComplianceRuleV3CheckBound;
import java.util.*;
import java.lang.System;
import java.net.URI;

ComplianceRuleV3DecimalBound Hard = new ComplianceRuleV3DecimalBound();
ComplianceRuleV3DecimalBound Soft = new ComplianceRuleV3DecimalBound();
@jakarta.annotation.Nullable String HardProperty = "example HardProperty";


ComplianceRuleV3CheckBound complianceRuleV3CheckBoundInstance = new ComplianceRuleV3CheckBound()
    .Hard(Hard)
    .Soft(Soft)
    .HardProperty(HardProperty);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
