# com.finbourne.lusid.model.ComplianceRuleV3Check
The limits a measure's result is checked against: an optional upper bound, an optional lower bound, and  the unit both are expressed in.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unit** | **String** | Available values: Absolute, Percentage. | [default to String]
**upper** | [**ComplianceRuleV3CheckBound**](ComplianceRuleV3CheckBound.md) |  | [optional] [default to ComplianceRuleV3CheckBound]
**lower** | [**ComplianceRuleV3CheckBound**](ComplianceRuleV3CheckBound.md) |  | [optional] [default to ComplianceRuleV3CheckBound]

```java
import com.finbourne.lusid.model.ComplianceRuleV3Check;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Unit = "example Unit";
ComplianceRuleV3CheckBound Upper = new ComplianceRuleV3CheckBound();
ComplianceRuleV3CheckBound Lower = new ComplianceRuleV3CheckBound();


ComplianceRuleV3Check complianceRuleV3CheckInstance = new ComplianceRuleV3Check()
    .Unit(Unit)
    .Upper(Upper)
    .Lower(Lower);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
