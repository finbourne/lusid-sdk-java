# com.finbourne.lusid.model.IntermediateComplianceStep

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | The label of the compliance step | [default to String]
**groupedParameters** | [**Map&lt;String, List&lt;ComplianceTemplateParameter&gt;&gt;**](List.md) | Parameters required for the step | [default to Map<String, List<ComplianceTemplateParameter>>]

```java
import com.finbourne.lusid.model.IntermediateComplianceStep;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Label = "example Label";
Map<String, List<ComplianceTemplateParameter>> GroupedParameters = new Map<String, List<ComplianceTemplateParameter>>();


IntermediateComplianceStep intermediateComplianceStepInstance = new IntermediateComplianceStep()
    .Label(Label)
    .GroupedParameters(GroupedParameters);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
