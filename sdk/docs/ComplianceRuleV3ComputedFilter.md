# com.finbourne.lusid.model.ComplianceRuleV3ComputedFilter
An optional inner test selecting survivors before the measure: an optional grouping, the measure to  compute per group, and the check the group's measure must satisfy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupBy** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**measure** | [**ComplianceRuleV3Measure**](ComplianceRuleV3Measure.md) |  | [default to ComplianceRuleV3Measure]
**check** | [**ComplianceRuleV3Check**](ComplianceRuleV3Check.md) |  | [default to ComplianceRuleV3Check]
**selectOutsideBounds** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.ComplianceRuleV3ComputedFilter;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<String> GroupBy = new List<String>();
ComplianceRuleV3Measure Measure = new ComplianceRuleV3Measure();
ComplianceRuleV3Check Check = new ComplianceRuleV3Check();
Boolean SelectOutsideBounds = true;


ComplianceRuleV3ComputedFilter complianceRuleV3ComputedFilterInstance = new ComplianceRuleV3ComputedFilter()
    .GroupBy(GroupBy)
    .Measure(Measure)
    .Check(Check)
    .SelectOutsideBounds(SelectOutsideBounds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
