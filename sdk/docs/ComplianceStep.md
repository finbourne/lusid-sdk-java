# com.finbourne.lusid.model.ComplianceStep

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complianceStepType** | **String** | . The available values are: FilterStep, GroupByStep, GroupFilterStep, BranchStep, RecombineStep, CheckStep, PercentCheckStep | [default to String]

```java
import com.finbourne.lusid.model.ComplianceStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ComplianceStepType = "example ComplianceStepType";


ComplianceStep complianceStepInstance = new ComplianceStep()
    .ComplianceStepType(ComplianceStepType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
